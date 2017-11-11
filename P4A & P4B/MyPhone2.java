import java.util.*;
public class MyPhone2
{
    private String color;
    private int memoryCapacity;
    public List<Song> songLibrary;

    public MyPhone2(String color, int memory){

        this.color = color;
        memoryCapacity = memory;

        songLibrary = new ArrayList<Song>(5);
        
        songLibrary.add(new Song ("Zero Zero Zero","Zach Zhong",666,320));
        songLibrary.add(new Song ("One two three","Zach Zhong",21,233));
        songLibrary.add(new Song ("Four Five Six","Zach Zhong",323,332));
        songLibrary.add(new Song ("Seven Eight Nine","Zach Zhong",666,120));
        songLibrary.add(new Song ("Ten Ten Ten","Zach Zhong",666,323));

    }
    public int totalPlayTime(){
        int total = 0;
        for(Song song: songLibrary)
            total += song.getLengthInSec();
        return total;

    }
    
    public void deleteAllSongs(){
    
        for (int index = 0; index < songLibrary.size(); index++){
        
            songLibrary.set(index,null);
        
        }
    
    }
    
    public String toString(){
    
        String output = "Phone Color: " + color + "\n" + "Memory Capacity: " + memoryCapacity + " GB" + "\n";
    
        
        for (Song song: songLibrary){
        
            
            output += song + "\n";
        
        }
        
        
        return output;
    }

   
}
