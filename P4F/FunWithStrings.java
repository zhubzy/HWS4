public class FunWithStrings
   {
   public static void main( String[] args )
      {
      // 1. creating a String    
      String name = new String( "The Flash" ); 
      
      System.out.println( "Part I - Creating Strings" );
      System.out.println( "Name is: " + name );
          
      // 2. getting the length of a string
      System.out.println( "\n\nPart II - Getting lengths of Strings" );
      System.out.println( "The length of the name is: " + name.length() );
      
      
      // 3. substring - one argument version
      System.out.println( "\n\nPart III - One argument substring" );
      System.out.println( name.substring( 0 ) );
      System.out.println( name.substring( 3 ) );
      //System.out.println( name.substring( 10 ) );
      
      // Try this!
      System.out.println( "\n\nCalling substring in the context of a loop" );
      for( int index = 0; index < name.length(); index++ )
         {
         System.out.println( name.substring( index ) );   
         } // end for
      
      
      
      // 4. substring - two argument version  
      System.out.println( "\n\nPart IV - Two argument substring" );
      System.out.println( "substring (0,0) = " + name.substring( 0,0 ) );
      System.out.println( "substring (0,1) = " + name.substring( 0,1 ) ); 
      System.out.println( "substring (7,8) = " + name.substring( 7,8 ) );
      System.out.println( "substring (8,9) = " + name.substring( 8,9 ) );
      System.out.println( "substring (0,9) = " + name.substring( 0,9 ) );
      System.out.println( "substring (3,5) = " + name.substring( 3,5 ) );
      //System.out.println( "substring (0,10) = " + name.substring( 0,10 ) );
      
      // Try this!
      System.out.println( "\n\nCalling two-arg substring in the context of a loop" );
      for( int index = 0; index < name.length(); index++ )
         {
         System.out.println( name.substring( 0, index ) );   
         } // end for
      

      // Try this loop below!
//       for( int index = 0; index < name.length(); index++ )
//          {
//          System.out.println( name.substring( index, index+1 ) );   
//          name += name.substring( index, index+1 );
//          
//          } // end for
        
          
      // 5. indexOf 
      System.out.println( "\n\nPart V - indexOf" );
      System.out.println( "indexOf( \"The\" ) = " + name.indexOf( "s" ) );

      
      // 6. compareTo 
      System.out.println( "\n\nPart VI - compareTo" );
      System.out.println( "indexOf( \"She\" ) = " + name.compareTo( "She" ) );      
      System.out.println( "indexOf( \"The\" ) = " + name.compareTo( "The" ) );
      System.out.println( "indexOf( \"Uhe\" ) = " + name.compareTo( "Uhe" ) );
      
      // 7. Building new strings
      System.out.println( "\n\nPart VII - Building new Strings" );

      String firstName = new String( "Silver" );
      String lastName = new String( "Surfer" );
      
      String badGuy = firstName + " " + lastName;
      System.out.println( badGuy );
      
      badGuy = new String( "Reverse Flash" );
      System.out.println( "\n" + badGuy );
      
      badGuy = "";
      for( int index = name.length(); index > 4; index-- )
         {
         badGuy += name.substring( index-1, index );    
         } // end if    
      System.out.println( "\n" + badGuy );      
      
      } // end method main
       
   } // end class FunWithStrings