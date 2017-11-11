//Written By Zach Zhong

public class Song
{
    // instance variables - replace the example below with your own
    public String title;
    public double cost;
    public String artist;
    private int lengthInSecs;


    public Song(String songTitle,String songArtist, double songCost, int songlength)
    {
        title = songTitle;
        cost = songCost;
        artist = songArtist;
        lengthInSecs = songlength;
        
    }
    
    public Song(){
        
                  
        
        
    
    }
    
    public String toString() {
    
      
        return "Song Title: " + title + "\n" + "Song Artist: " + artist + "\n" + "Song Cost: $ " + cost + "\n" + "Song Length: " + lengthInSecs + "\n" + convertToMinSec();
        
    
    } 
    
    public void setLengthInSec(int newSecond) {
    
        
        lengthInSecs = newSecond;
        
    }
    
    public int getLengthInSec() {
    
        return lengthInSecs;
        
    }
    public String convertToMinSec() {
    
        int min = lengthInSecs / 60;
        int seconds = lengthInSecs % 60;
        
        return "The length of the song is: " + min + " minutes and "+ seconds + " seconds.";
    
    
    }
    
    public int getMinutes() {
    
        
        return lengthInSecs / 60;
    }
    
    public int getSeconds(){
        
        return lengthInSecs % 60;
        
    }

  
    
}

