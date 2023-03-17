package com.liferay.training.people.web.commands;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.people.service.LoansLocalServiceUtil;
import com.liferay.training.people.web.constants.PeopleWebMVCPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + PeopleWebMVCPortletKeys.PEOPLEWEBMVC,
                "mvc.command.name=" + PeopleWebMVCPortletKeys.COMMAND_ACTION_ADD_LOAN
        },
        service = MVCActionCommand.class
)
public class PeopleWebMVCActionCommand extends BaseMVCActionCommand {

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String name = ParamUtil.get(actionRequest, "name", "default");
        String surname = ParamUtil.get(actionRequest, "surname", "default");
        String birthDate = ParamUtil.get(actionRequest, "birthDate", "");
        float totalLoan = ParamUtil.getFloat(actionRequest, "totalLoan", 0);

        _log.debug(name + ", " + surname + ", " + birthDate + ", " + totalLoan);
        LoansLocalServiceUtil.insertLoan(name, surname, new SimpleDateFormat("yyyy-MM-dd").parse(birthDate), totalLoan);
    }

    private static final Log _log = LogFactoryUtil.getLog(PeopleWebMVCActionCommand.class);
}
