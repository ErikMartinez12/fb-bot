/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.send.*;

/**
 *
 * @author gbmobile2
 */
public class FB_API {
  
  // FACEBOOK DATA
  protected final String VERIFY_TOKEN = "A6B5C4D3E2F1";
  private final String PAGE_ACCESS_TOKEN = "EAAFVoUdoca0BAO8KpDMXUvWWBW1jIoeZBuCbuf8T3SnNRxnMZBMt6Fs5UzQ9eT7IeZCGaOHCRUbZBZA6lPyWa3n7ZBgwDFwSvsMSVvOnvZB4UT67X9GfC3EsL41sCtsxa0lPv8N1T8ej4FyvCL9xB3L0qAoagSeVMzIU1hbazSJyvvtG27ZAG79M";
  
  // GLOBAL VARIABLES
  public IdMessageRecipient recipient;
  public Message simpleTextMessage;

  // CONSTRUCTOR
  public FB_API() {}
  
  public void sendTextMessage(String recipient, String message) {
    
    FacebookClient pageClient = new DefaultFacebookClient(this.PAGE_ACCESS_TOKEN, Version.VERSION_2_9);
    this.recipient = new IdMessageRecipient(recipient);
    this.simpleTextMessage = new Message(message);
    
    SendResponse response = pageClient.publish("me/messages", SendResponse.class,
            Parameter.with("recipient", this.recipient),
            Parameter.with("message", this.simpleTextMessage));

  }

}
