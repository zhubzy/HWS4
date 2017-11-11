import greenfoot.*;

public class SpaceJunk extends Actor
   {
   private int altitude;
   
   public SpaceJunk( int initialAltitude)
      {
      altitude = initialAltitude;
      //altitude = (int)( 100 * Math.random() );
      } // end zero-arg constructo
        
   public void setAltitude( int newAltitude )
      {      
      altitude  = newAltitude;   
      } // end method setLuminosity
   
   public int getAltitude()
      {
      return altitude;    
      } // end method getLuminosity
      
   
   public void act() 
      {
      move( 10 );    
      if( isAtEdge() )
         {
         turn(100);
         } // end if
      } // end method act
   } // end class SpaceJunk
