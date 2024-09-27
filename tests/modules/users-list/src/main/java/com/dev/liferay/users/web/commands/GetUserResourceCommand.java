package com.dev.liferay.users.web.commands;

import com.dev.liferay.users.web.beans.FilterBean;
import com.dev.liferay.users.web.beans.UsuarioBean;
import com.dev.liferay.users.web.constants.UserListPortletKeys;
import com.dev.liferay.users.web.utils.FilterUtils;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.JSONPortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import java.util.List;
import java.util.stream.Collectors;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + UserListPortletKeys.USERLIST,
                "mvc.command.name=" + UserListPortletKeys.COMMAND_RESOURCE_AJAX_GET_USERS
        },
        service = MVCResourceCommand.class
)
public class GetUserResourceCommand extends BaseMVCResourceCommand {


    @Override
    protected void doServeResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws Exception {
        final var limit = 5; // ParamUtil.getInteger(resourceRequest, "limit", 5);

        //TODO: realizar validaciones en la parte Backend de los campos de asignarlos, si la validacion no pasa, se inserta los valos por defecto.
        final var page = ParamUtil.getInteger(resourceRequest, "page");
        final var fname = ParamUtil.getString(resourceRequest, "fname", "");
        final var fsurnames = ParamUtil.getString(resourceRequest, "fsurnames", "");
        final var femail = ParamUtil.getString(resourceRequest, "femail", "");


        final var filterBean = new FilterBean(fname, fsurnames, femail, limit, page);
        _log.info("Filter realized with: " + filterBean);
        final var users = getUsersWithFilter(filterBean);
        final var usersSize = (int) fakeUsers().stream().filter(value -> FilterUtils.isUser(value, filterBean)).count();
        final var totalPages = Math.ceil(new Double(new Double(usersSize) / new Double(limit)));
        var output = JSONFactoryUtil.createJSONObject();
        var usersJsonArray = JSONFactoryUtil.createJSONArray();

        users.forEach(
                user -> {
                    var jsonL = JSONFactoryUtil.createJSONObject();
                    jsonL.put("username", user.getUsername());
                    jsonL.put("email", user.getEmail());
                    jsonL.put("name", user.getName());
                    jsonL.put("surname1", user.getSurname1());
                    jsonL.put("surname2", user.getSurname2());
                    usersJsonArray.put(jsonL);
                }
        );
        output.put("usuarios", usersJsonArray);
        output.put("limit", limit);
        output.put("activePage", page);
        output.put("totalPages", totalPages);


        JSONPortletResponseUtil.writeJSON(resourceRequest, resourceResponse, output);
    }


    private List<UsuarioBean> getUsersWithFilter(FilterBean filterBean) {
        //TODO: llamada a API o servicio con paginación que acceda a BBDD  para devolver los usuarios,
        // en este caso se simulara una lista y el filtro
        final List<UsuarioBean> users = fakeUsers().stream().filter(value -> FilterUtils.isUser(value, filterBean)).collect(Collectors.toList());

        final var totalOfBeans = users.size();
        final var start = (filterBean.getPage() - 1) * filterBean.getLimit();
        final var end = Math.min(start + filterBean.getLimit(), totalOfBeans);

        return users.subList(start, end);
    }

    private List<UsuarioBean> fakeUsers() {
        return List.of(
                new UsuarioBean(1, "admin", "admin@yopemail.com", "Carlos", "Rodriguez", "Gallego"),
                new UsuarioBean(2, "carlos.rodriguez", "carlos.rodriquez@yopemail.com", "Carlos", "Rodriguez", "Gallego"),
                new UsuarioBean(3, "carlo.pietri", "carlo.pietri@yopemail.com", "Carlo", "Pietri", ""),
                new UsuarioBean(4, "carmen.rodriguez", "carmen.rodriguez@yopemail.com", "Cármen", "Rodriguez", "Gallego"),
                new UsuarioBean(5, "xing.wang", "xing.wang@yopemail.com", "Xing", "Wang", ""),
                new UsuarioBean(6, "sofiamaria.rodriguez", "sofiaaria.rodriguez@yopemail.com", "Sofia María", "Rodriguez", "Gallego"),
                new UsuarioBean(7, "test.one", "test.one@yopemail.com", "Test", "One", ""),
                new UsuarioBean(8, "test.onebaltasar", "test.onebaltasar@gmail.com", "Test", "One", "Baltasar"),
                new UsuarioBean(9, "test.onebaltasar", "test.onebaltasar@gmail.com", "Test", "One", "Baltasar Cuadruple")

        );
    }

    private static final Log _log = LogFactoryUtil.getLog(GetUserResourceCommand.class);
}
