public class SystemLogDriver
   {
   public static void main( String[] args )
      {
      SystemLog log1 = new SystemLog();
      
      
      
      System.out.println( log1 );
      System.out.println( log1.removeMessages( "disk" ) );
      System.out.println( log1 );    
      } // end method main
 
       
   } // end class LogMessageDriver