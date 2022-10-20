package com.assignment.boot2;

public class aBean {
    private String message;
    private int id;

    public aBean(int id,String message) {
        this.id=id;
        this.message=message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }


}
