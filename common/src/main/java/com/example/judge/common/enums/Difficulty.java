package com.example.judge.common.enums;

public enum Difficulty {
    EASY,
    MEDIUM,
    HARD;

    @Override
    public String toString() {
        return this.name();
    }
}
