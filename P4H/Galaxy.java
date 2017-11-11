import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Galaxy extends World
   {
   public Galaxy()
      {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(800, 600, 1); 
      for( int ctr = 0; ctr < 6; ctr++ )
         {
         addObject( new Star(), (int)( 800*Math.random()  ), (int)( 600*Math.random()  ) );
         } // end for 
         
      addObject( new MagicLewShip(), 0, 0 );
      System.out.println(getObjects( Star.class ));
      } // end zero-arg constructor
   } // end class Galaxy
