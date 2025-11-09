package com.ecmsp.common.userservice.user.domain;

import lombok.extern.slf4j.Slf4j;
import java.util.Optional;

@Slf4j
public enum Permission {
    // Product permissions
    WRITE_PRODUCTS,
    DELETE_PRODUCTS,

    // Order permissions
    READ_ORDERS,
    WRITE_ORDERS,
    CANCEL_ORDERS,

    // User management permissions
    READ_USERS,
    MANAGE_USERS,

    // Role management permissions
    MANAGE_ROLES,

    // Payment permissions
    PROCESS_PAYMENTS,
    REFUND_PAYMENTS;

    public static Optional<Permission> getPermissionByName(String name) {
        for (Permission permission : Permission.values()) {
            if (permission.name().equalsIgnoreCase(name)) {
                return Optional.of(permission);
            }
        }
        log.error("Permission with name {} not found", name);
        return Optional.empty();
    }
}