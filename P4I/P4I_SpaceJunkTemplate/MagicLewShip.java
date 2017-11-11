import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class MagicLewShip extends Actor
   {
   private String name;
   private int speed;
   private int numObjectsRemoved;
   private List<SpaceJunk> spaceJunkObjects;

   public MagicLewShip()
      {
      name = null;
      speed = 0;
      numObjectsRemoved = 0;
      spaceJunkObjects = new ArrayList<SpaceJunk>();
      } // zero-arg

   public MagicLewShip( String initialName, int initialSpeed )
      {
      name = new String( initialName );
      speed = initialSpeed;
      spaceJunkObjects = new ArrayList<SpaceJunk>();

      } // end two-arg constructor

   public int removeSpaceJunk( int minAltitude )
      {
      
          if (numObjectsRemoved == 0){
      spaceJunkObjects = getWorld().getObjects( SpaceJunk.class ); 
            
      for(int index = 0; index < spaceJunkObjects.size();index++){

          if (spaceJunkObjects.get(index).getAltitude() < minAltitude){
          getWorld().removeObject( spaceJunkObjects.get( index ) );
          numObjectsRemoved ++;

        }
      }
    }
      return numObjectsRemoved;      
      } // end method calcAverageLuminosity
      
      
   public void act()
      {
      getWorld().showText( "Coordinates: " + getX() + ", " + getY(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 300 );
                           
                           
                           
  
                           getWorld().showText( "Number of SpaceJunk objects removed: " + removeSpaceJunk( 500 ), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 200 );
      
      move(10);
      if( isAtEdge() )
         {
         turn( (int)(90 * Math.random() ) ); 
         } // end if
      
      } // end act


   public String toString()
      {
      return ( getX() + ", " + getY() );
      } // end toString

   } // end class Hero