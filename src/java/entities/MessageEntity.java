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
public class MessageEntity {
  
  public String mid;
  
  public int seq;
  
  public String text;
  
  public MessageEntity() {}
  
  public MessageEntity(String mid, int seq, String text) {
    this.mid = mid;
    this.seq = seq;
    this.text = text;
  }

  // GETTERS AND SETTERS
  public String getMid() {
    return this.mid;
  }
  
  public void setMid(String mid) {
    this.mid = mid;
  }
  
  public int getSeq() {
    return this.seq;
  }
  
  public void setSeq(int seq) {
    this.seq = seq;
  }
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String text) {
    this.text = text;
  }

}
