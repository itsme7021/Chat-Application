package model;

public class ChatMessage {
    //this class acts as a payload for server and client or it is an object where both server and client can send there data

    private model.ChatMessage.MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public model.ChatMessage.MessageType getType() {
        return type;
    }

    public void setType(model.ChatMessage.MessageType type) {
        this.type = type;
    }

    public String getText() {
        return content;
    }

    public void setText(String text) {
        this.content = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}

