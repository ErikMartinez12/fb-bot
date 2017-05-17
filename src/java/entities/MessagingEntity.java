/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author gbmobile2
 */
public class MessagingEntity {
  
  public String sender;
  
  public String recipient;
  
  public int timestamp;
  
  public MessageEntity message;
  
  public PostbackEntity postback;
  
  private int currentState = 0;

  public MessagingEntity() {}
  
  public MessagingEntity(String sender, String recipient, int timestamp, MessageEntity message) {
    this.sender = sender;
    this.recipient = recipient;
    this.timestamp = timestamp;
    this.message = message;
    this.postback = null;
    this.currentState = 1;
  }

  public MessagingEntity(String sender, String recipient, int timestamp, PostbackEntity postback) {
    this.sender = sender;
    this.recipient = recipient;
    this.timestamp = timestamp;
    this.message = null;
    this.postback = postback;
    this.currentState = 2;
  }

  // GETTERS AND SENDERS
  public int getCurrentState() {
    return this.currentState;
  }
  
  public String getSender() {
    return this.sender;
  }

  public void setSender(String str) {
    this.sender = str;
  }
  
  public String getRecipient() {
    return this.sender;
  }
  
  public void setRecipient(String str) {
    this.sender = str;
  }
  
  public int getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(int str) {
    this.timestamp = str;
  }
  
  public MessageEntity getMessage() {
    return this.message;
  }
  
  public void setMessage(MessageEntity message) {
    this.message = message;
  }
  
  public PostbackEntity getPostback() {
    return this.postback;
  }
  
  public void setPostback(PostbackEntity postback) {
    this.postback = postback;
  }

}
