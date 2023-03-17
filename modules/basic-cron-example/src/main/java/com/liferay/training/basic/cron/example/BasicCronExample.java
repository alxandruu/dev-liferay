package com.liferay.training.basic.cron.example;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

import com.liferay.portal.kernel.scheduler.*;
import com.liferay.portal.kernel.util.GetterUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

/**
 * @author Alex
 */
@Component(
	immediate = true,
	property = {
		"cron.expression=0 0/1 * 1/1 * ? *"
	},
	service = BasicCronExample.class
)
public class BasicCronExample extends BaseMessageListener {

	@Override
	protected void doReceive(Message message) throws Exception {
		_log.info("New Example Cron start... ");
		this.doMethod();
	}

	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) throws SchedulerException {
		try {
			String cronExpression = GetterUtil.getString(properties.get("cron.expression"), "cronExpression");
			_log.info(" cronExpression: " + cronExpression);

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


	protected void doMethod(){
		Date date = new Date();
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(date);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println("Cron method executed with result => " + (hour + minute));
	}



	private static Log _log = LogFactoryUtil.getLog(BasicCronExample.class);

}