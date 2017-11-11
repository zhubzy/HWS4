public class HiddenWord
   {
   private String word;
   
   public HiddenWord( String initialWord )
      {
      word = new String( initialWord );    
      } // end one-arg constructor
       
      
   public String getHint( String guess )  
      {
      
          String hint = "";
          
          
     
          
          
          for (int j = 0; j < word.length(); j++){
            
              if (guess.substring(j,j+1).equals(word.substring(j,j+1))){
                
                
                  hint += word.substring(j,j+1);
                
                } else if (word.indexOf(guess.charAt(j)) >= 0) {
                
                   hint += "+";
                } else {
                
                
                    hint+= "*";
                }
            
            
        
        
        }    
          
      
      return hint;    
      } // end method getHint
      
   public String toString()
      {
      return word;   
      } // end method toString
   } // end class HiddenWord