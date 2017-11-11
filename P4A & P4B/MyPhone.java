public class MyPhone
{
    private String color;
    private int memoryCapacity;
    public Song[] songLibrary;

    public MyPhone(String color, int memory){

        this.color = color;
        memoryCapacity = memory;

        songLibrary = new Song[5];
        
        songLibrary[0] = new Song ("Zero Zero Zero","Zach Zhong",666,320);
        songLibrary[1] = new Song ("One two three","Zach Zhong",21,233);
        songLibrary[2] = new Song ("Four Five Six","Zach Zhong",323,332);
        songLibrary[3] = new Song ("Seven Eight Nine","Zach Zhong",666,120);
        songLibrary[4] = new Song ("Ten Ten Ten","Zach Zhong",666,323);

    }
    public int totalPlayTime(){
        int total = 0;
        for(Song song: songLibrary)
            total += song.getLengthInSec();
        return total;

    }
    
    public void deleteAllSongs(){
    
        for (int index = 0; index < songLibrary.length; index++){
        
            songLibrary[index] = null;
        
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
