package com.devfiqi.pipeline;

public class UserEvent {
    public String userId;
    public String eventType;
    public long timestamp;

    public UserEvent() {}

    public UserEvent(String userId, String eventType, long timestamp) {
        this.userId = userId;
        this.eventType = eventType;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "UserEvent{userId='" + userId + "', eventType='" + eventType +
               "', timestamp=" + timestamp + "}";
    }
}