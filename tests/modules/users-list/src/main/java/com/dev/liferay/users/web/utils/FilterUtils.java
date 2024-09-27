package com.dev.liferay.users.web.utils;

import com.dev.liferay.users.web.beans.FilterBean;
import com.dev.liferay.users.web.beans.UsuarioBean;


public class FilterUtils {
    private FilterUtils() {

    }

    public static boolean isUser(UsuarioBean usuarioBean, FilterBean filterBean) {
        final var surnamesList = usuarioBean.getSurname1().toLowerCase().concat(usuarioBean.getSurname2().toLowerCase()).replaceAll("\\s", "");
        final var surnamesBean = filterBean.getSurnames().toLowerCase().replaceAll("\\s", "");
        return usuarioBean.getName().toLowerCase().contains(filterBean.getName().toLowerCase())
                && surnamesList.contains(surnamesBean)
                && usuarioBean.getEmail().toLowerCase().contains(filterBean.getEmail().toLowerCase());
    }
}
