package com.devmvk.mobilephone;

public class Contact {
    private String contactName;
    private Long contactNumber;

    public Contact(String contactName, Long contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public Long getContactNumber() {
        return contactNumber;
    }
}
