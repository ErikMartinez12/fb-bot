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
public class PostbackEntity {
  
  public String payload;
  
  public PostbackEntity() {}
  
  public PostbackEntity(String payload) {
    this.payload = payload;
  }
  
  // GETTERS AND SETTERS
  public String getPayload() {
    return this.payload;
  }
  
  public void setPayload(String payload) {
    this.payload = payload;
  }
 
}
