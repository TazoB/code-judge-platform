package com.example.backend.roles;

public enum UserRole {
    USER_ROLE,
    ADMIN_ROLE;

    @Override
    public String toString() {
        return this.name();
    }
}