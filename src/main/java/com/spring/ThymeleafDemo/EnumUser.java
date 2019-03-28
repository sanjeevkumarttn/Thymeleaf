package com.spring.ThymeleafDemo;

public enum EnumUser {
    USER("User"),
    ADMIN("Admin"),
    SUPER_ADMIN("Super_Admin");

    String value;

    EnumUser(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
