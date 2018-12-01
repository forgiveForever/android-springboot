package com.weibo.entity;

public class MessageInfo {
    private Long id;
    private String message_info;
    private String send_id;
    private String receive_id;
    private String send_name;
    private String receive_name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage_info() {
        return message_info;
    }
    public void setMessage_info(String message_info) {
        this.message_info = message_info;
    }
    public String getSend_id() {
        return send_id;
    }
    public void setSend_id(String send_id) {
        this.send_id = send_id;
    }
    public String getReceive_id() {
        return receive_id;
    }
    public void setReceive_id(String receive_id) {
        this.receive_id = receive_id;
    }
    public String getSend_name() {
        return send_name;
    }
    public void setSend_name(String send_name) {
        this.send_name = send_name;
    }
    public String getReceive_name() {
        return receive_name;
    }
    public void setReceive_name(String receive_name) {
        this.receive_name = receive_name;
    }
    @Override
    public String toString() {
        return "MessageInfo [message_info=" + message_info + ", send_id="
                + send_id + ", receive_id=" + receive_id + ", send_name="
                + send_name + ", receive_name=" + receive_name + "]";
    }


}