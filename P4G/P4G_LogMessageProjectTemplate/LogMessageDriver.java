public class LogMessageDriver
   {
   public static void main( String[] args )
      {
      LogMessage message1 = new LogMessage( "Webserver:disk offline" );
      System.out.println( message1 );
      System.out.println( message1.getMachineID() );
      System.out.println( message1.getDescription() + "\n\n");
      
      String keyword = "disk";
      message1.setMessage("disk");
      System.out.println("disk: " + message1.containsWord(keyword));
      
      message1.setMessage("Disk");      
      System.out.println("Disk: " + message1.containsWord(keyword));
      
      message1.setMessage("error on disk");
      System.out.println("error on disk: " + message1.containsWord(keyword));
      
      message1.setMessage("error on disk3");
      System.out.println("error on disk3: " + message1.containsWord(keyword));
      
      message1.setMessage("error on /dev/disk disk");
      System.out.println("error on /dev/disk disk: " + message1.containsWord(keyword));
      
      message1.setMessage("error on /dev/disk");
      System.out.println("error on /dev/disk: " + message1.containsWord(keyword));
      
      message1.setMessage("error on disk DSK1");
      System.out.println("error on disk DSK1: " + message1.containsWord(keyword));
      
      message1.setMessage("diskette");
      System.out.println("diskette: " + message1.containsWord(keyword));
      } // end method main
 
       
   } // end class LogMessageDriver