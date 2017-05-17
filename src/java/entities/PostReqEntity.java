/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author gbmobile2
 */
public class PostReqEntity {
  
  public String object;
  
  public List<EntryEntity> entry;

  public PostReqEntity() {}
  
  public PostReqEntity(String object, List<EntryEntity> entry) {
    this.object = object;
    this.entry = entry;
  }
  
  // GETTERS AND SETTERS
  public String getObject() {
    return this.object;
  }

  public void setObject(String object) {
    this.object = object;
  }
  
  public List<EntryEntity> getEntry() {
    return this.entry;
  }
  
  public void setEntry(List<EntryEntity> entry) {
    this.entry = entry;
  }
  
}
