package com.liferay.training.people.web.commands;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.JSONPortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.training.people.model.Loans;
import com.liferay.training.people.service.LoansLocalServiceUtil;
import com.liferay.training.people.service.persistence.LoansUtil;
import com.liferay.training.people.web.constants.PeopleWebMVCPortletKeys;
import org.osgi.service.component.annotations.Component;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.util.List;


@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + PeopleWebMVCPortletKeys.PEOPLEWEBMVC,
                "mvc.command.name=" + PeopleWebMVCPortletKeys.COMMAND_RESOURCE_AJAX_LOANS
        },
        service = MVCResourceCommand.class
)
public class PeopleWebMVCResourceCommand extends BaseMVCResourceCommand {


    @Override
    protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {
        List<Loans> loans = LoansLocalServiceUtil.getLoanses(-1, -1);
        JSONArray output = JSONFactoryUtil.createJSONArray();
        for (Loans l : loans) {
            JSONObject jsonL = JSONFactoryUtil.createJSONObject();
            jsonL.put("peopleId", l.getPeopleId());
            jsonL.put("name", l.getName());
            jsonL.put("surname", l.getSurname());
            jsonL.put("birth", l.getBirth());
            jsonL.put("total_loan", Math.floor(l.getTotal_loan() * 100) / 100 );
            output.put(jsonL);
        }

        JSONPortletResponseUtil.writeJSON(resourceRequest, resourceResponse, output);

    }

    private static final Log _log = LogFactoryUtil.getLog(PeopleWebMVCResourceCommand.class);
}
