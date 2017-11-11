import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } // end constructor
      
   public DownloadInfo getDownloadInfo( String title )
      {
       
         
          for(int index = 0; index < downloadList.size(); index ++){
            
              if (title.equals(downloadList.get(index).getTitle())) {
              
                  return downloadList.get(index);
                  
                }
              
          }
          
      return null;
      } // end method getDownloadInfo
      
   public void updateDownloads( List<String> titles )
      {
          
          
          for (int index = 0; index < titles.size(); index ++){
            
         
              DownloadInfo newDownload = getDownloadInfo(titles.get(index));
              
              if (newDownload == null){
                
                  downloadList.add(new DownloadInfo(titles.get(index),1));
                  
                  
                
               } else {
                
                   
                   newDownload.incrementTimesDownloaded();  
                   
               }
            
            }

      } // end method updateDownloads
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } // end for each
         
      return musicDownloads;
      } // end toString
   } // end class MusicDownloads