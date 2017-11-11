public class LogMessage
   {
   private String machineID;
   private String description;
   
   public LogMessage( String message )
      {
      // to be completed in part a  
      
      int index = message.indexOf(":");
      machineID = message.substring(0,index);
      description = message.substring(index + 1,message.length());
      
      } // end one-arg constructor
      
   public boolean containsWord( String keyword )
      {
      // to be completed in part b 
      boolean condition1 = description.indexOf(keyword) >= 0;
      boolean condition2 = description.substring(0,keyword.length()).equals(keyword) || description.indexOf(" " +keyword) >= 0;
      boolean condition3 = description.substring(description.length() - keyword.length(), description.length()).equals(keyword) || description.indexOf(keyword + " ") >= 0;
      //Beginning Check
      if(condition1 && condition2 && condition3)
        return true;
        
      return false;    
      } // end method containsWord
      
   public String getMachineID()
      {
      return machineID;    
      } // end method getMachineID
      
   public String getDescription()
      {
      return description;    
      } // end method getDescription
    
      public void setMessage(String message){
        
        
        description = message;
        
        }
   public String toString(){
    
    return machineID + ":" + description;
    
    
    }
       
   } // end class LogMessage