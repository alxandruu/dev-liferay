package com.dev.liferay.users.web.beans;

public class FilterBean {

    String name;
    String surnames;
    String email;
    int limit;
    int page;

    public FilterBean(String name, String surnames, String email, int limit, int page) {
        this.name = name;
        this.surnames = surnames;
        this.email = email;
        this.limit = limit;
        this.page = Math.max(page, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "FilterBean{" +
                "name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", email='" + email + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
