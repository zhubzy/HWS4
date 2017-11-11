import greenfoot.*;

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
   {
   private int luminosity;
   public static int num  = 6;
   
   public Star()
      {
      luminosity = (int)(500* Math.random()+500 );   
      } // end zero-arg constructo
        
   public void setLuminosity( int newLuminosity )
      {
      luminosity  = newLuminosity;   
      } // end method setLuminosity
   
   public int getLuminosity()
      {
      return luminosity;    
      } // end method getLuminosity
   
   public String getLuminosityAsString()
      {
      return "" + luminosity;    
      }
   
   public void act() 
      {
      getWorld().showText( getLuminosityAsString(), getX(), getY() );    
      turn(100);
      luminosity--;
      if( luminosity < 0 )
         {
                       getWorld().showText( "", getX(), getY() );
         getWorld().removeObject( this ); 

         } // end if
      } // end method act
   
   } // end class Star
