public class HiddenWordDriver
   {
   public static void main( String[] args )
      {
      HiddenWord puzzle = new HiddenWord( "HARPS" );
      System.out.println( puzzle );
      
      System.out.println( "\n\n" );
      
      System.out.println( "Getting hint with guess \"AAAAA\": " + puzzle.getHint( "AAAAA" ) );      
      System.out.println( "Getting hint with guess \"HELLO\": " + puzzle.getHint( "HELLO" ) );      
      System.out.println( "Getting hint with guess \"HEART\": " + puzzle.getHint( "HEART" ) );      
      System.out.println( "Getting hint with guess \"HARMS\": " + puzzle.getHint( "HARMS" ) );      
      System.out.println( "Getting hint with guess \"HARPS\": " + puzzle.getHint( "HARPS" ) );      
      } // end method main
       
   } // end class HiddenWordDriver