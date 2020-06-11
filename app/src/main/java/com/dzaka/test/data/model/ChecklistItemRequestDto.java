package com.dzaka.test.data.model;

public class ChecklistItemRequestDto {
    private int checklistId;
    private String itemName;

    public ChecklistItemRequestDto(int checklistId, String itemName) {
        this.checklistId = checklistId;
        this.itemName = itemName;
    }

    public int getChecklistId() {
        return checklistId;
    }

    public void setChecklistId(int checklistId) {
        this.checklistId = checklistId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
