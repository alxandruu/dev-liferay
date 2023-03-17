package com.liferay.training.ultra.cron.example;

import com.liferay.portal.configuration.metatype.bnd.util.ConfigurableUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import com.liferay.portal.kernel.scheduler.*;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.training.ultra.cron.example.configuration.UltraCronConfiguration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

import java.util.Date;
import java.util.Map;

/**
 * @author Alex
 */
@Component(
        immediate = true,
        property = {
                "cron.expression=0 0/1 * 1/1 * ? *"
        },
        configurationPid = "com.liferay.training.ultra.cron.example.configuration.UltraCronConfiguration",
        service = UltraCronExample.class
)
public class UltraCronExample extends BaseMessageListener {
    @Override
    protected void doReceive(Message message) throws Exception {

        if(_configuration.UltraCronEnabled()) {
            System.out.println("Ultra Cron Executed => " + _configuration.UltraCronMessage());
        } else {
            _log.debug("Ultra Cron Disabled");
        }
    }

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {

        _configuration = ConfigurableUtil.createConfigurable(UltraCronConfiguration.class, properties);

        try {
            String cronExpression = GetterUtil.getString(properties.get("cron.expression"), "cronExpression");

            String listenerClass = getClass().getName();
            Trigger jobTrigger = TriggerFactoryUtil.createTrigger(listenerClass, listenerClass, new Date(), null, cronExpression);

            SchedulerEntry schedulerEntry = new SchedulerEntryImpl(listenerClass, jobTrigger);
            SchedulerEngineHelperUtil.register(this, schedulerEntry, DestinationNames.SCHEDULER_DISPATCH);

        } catch (Exception e) {
            _log.error(e);
        }
    }

    @Deactivate
    protected void deactivate() {
        SchedulerEngineHelperUtil.unregister(this);
    }

    private volatile UltraCronConfiguration _configuration;
    private static Log _log = LogFactoryUtil.getLog(UltraCronExample.class);
}