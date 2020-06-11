package com.dzaka.test.data.model;

public class ChecklistRequestDto {
    private String name;

    public ChecklistRequestDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
