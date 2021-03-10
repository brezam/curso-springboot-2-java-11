package com.educandoweb.course.entities.enums;

import java.util.Arrays;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELLED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        return Arrays.stream(values())
                .filter(o -> o.code == code)
                .findAny()
                .orElseThrow(
                    () -> new IllegalArgumentException("Invalid OrderStatus code"));
    }
}
