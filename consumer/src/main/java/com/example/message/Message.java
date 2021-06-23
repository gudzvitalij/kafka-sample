package com.example.message;

public class Message {
    private String message;
    private Integer categoryId;

    public Message() {
    }

    public Message(String message, Integer age) {
        this.message = message;
        this.categoryId = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getAge() {
        return categoryId;
    }

    public void setAge(Integer age) {
        this.categoryId = age;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", age=" + categoryId +
                '}';
    }
}
