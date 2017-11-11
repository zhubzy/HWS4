import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Galaxy extends World
   {
   public Galaxy()
      {    
      // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
      super(800, 600, 1); 
      
      int numObjects = 7;
      for( int ctr = 0; ctr < numObjects; ctr++ )
         {
         addObject( new SpaceJunk( (int)( 2000 * Math.random() ) ), (int)( 800*Math.random() ), (int)( 600*Math.random() ) );
         } // end for
      
  
      addObject( new MagicLewShip(), 0, 0 );
      
      } // end zero-arg constructor
   } // end class Galaxy
