 import java.util.List;
import java.util.ArrayList; 

public class CollegeListTester
{
    
    public static void main (String[] args){
    List<String> colleges = new ArrayList<String>();
    colleges.add("Stanford");
    colleges.add( "UCLA" );
    colleges.add( "UC Berkely" );
    colleges.add( "MIT" );
    colleges.add( "Cal Tech" );
    colleges.add( "UCSD" );
    
   for (String college: colleges){
    
    System.out.println(college);
    
    }
    
        System.out.println();
    
      for (int index = 0; index < colleges.size(); index ++){
    
    if (colleges.get(index).length() == 4){
    
        System.out.println(colleges.get(index) + " removed!");
        colleges.remove(index);
        
    }
    
   }
   
   
   for (String college: colleges){
    
    System.out.println(college);
    
    }
    
    
   
}
    

    
}
