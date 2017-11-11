import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class MagicLewShip extends Actor
   {
   private String name;
   private int speed;
   private List<Star> starData;
   

   public MagicLewShip()
      {
      name = null;
      speed = 0;
      starData = new ArrayList<Star>(Star.num);
      
      } // zero-arg

   public MagicLewShip( String initialName, int initialSpeed )
      {
      name = new String( initialName );
      speed = initialSpeed;
      starData = new ArrayList<Star>(Star.num);
      } // end two-arg constructor

      
   public double calcAverageLuminosity()
      {
      starData = getWorld().getObjects( Star.class );
      double totalLuminosity = 0.0;
      for( int index = 0; index < starData.size(); index++ )
         {
             
             totalLuminosity += starData.get(index).getLuminosity();
 
         } // end for
      
      return totalLuminosity / starData.size();      
      } // end method calcAverageLuminosity
      
   public int getMaxLuminosity()
      {
      starData = getWorld().getObjects( Star.class ); 
      int maxLuminosity = 0;
         for( int index = 0; index < starData.size(); index++ )
         {
             
             if (starData.get(index).getLuminosity() > maxLuminosity){
                
                 maxLuminosity = starData.get(index).getLuminosity();
                
                }
 
         } // end for
      
      return maxLuminosity;      
      } // end method getMinLuminosity
      
   public void act()
      {
      getWorld().showText( "Coordinates: " + getX() + ", " + getY(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 300 );
                           
      getWorld().showText( "Average Luminosity: " + calcAverageLuminosity(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 200 );

      getWorld().showText( "Maximum Luminosity: " + getMaxLuminosity(), 
                           getWorld().getWidth()/2, 
                           getWorld().getHeight() - 100 );
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