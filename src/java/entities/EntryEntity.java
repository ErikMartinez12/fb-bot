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
public class EntryEntity {
  
  public String id;
  
  public int time;
  
  public MessagingEntity messaging;
  
  public EntryEntity() {}
  
  public EntryEntity(String id, int time, MessagingEntity messaging) {
    this.id = id;
    this.time = time;
    this.messaging = messaging;
  }

  // GETTERS AND SETTERS
  public String getId() {
    return this.id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public int getTime() {
    return this.time;
  }
  
  public void setTime(int time) {
    this.time = time;
  }
  
  public MessagingEntity getMessaging() {
    return this.messaging;
  }
  
  public void setMessaging(MessagingEntity messaging) {
    this.messaging = messaging;
  }

}
