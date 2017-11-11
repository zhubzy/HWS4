import java.util.*;
public class ClassRoster
   {
       
       private String courseName;
       private ArrayList <Student> studentList;
   

   public ClassRoster( String initialCourseName )
      {
          
      courseName = initialCourseName;    
          
      studentList = new ArrayList <Student>();
      studentList.add( new Student( "Super", "Man", 12, 1, 1, 1, 1, 1 ) );
      studentList.add( new Student( "Silver", "Surfer", 11, 2, 2, 2, 2, 2 ) );
      studentList.add( new Student( "Captain", "America", 12, 3, 3, 3, 3, 3 ) );
      studentList.add( new Student( "Bat", "Man", 11, 4, 4, 4, 4, 4 ) );
      studentList.add( new Student( "Black", "Panther", 11, 5, 5, 5, 5, 5 ) );
    
          
      } // end zero-arg constructor
      
   public String studentWithMaxGPA()
      {
      
      double maxGPA = 0;
      String studentLastName = "";
          
      for (Student student: studentList){
        
          if (student.calcGPA() > maxGPA){
            
              studentLastName = student.getLastName();
              
            }
        
        }
      
      return studentLastName;
      } // end method studentWithMaxGPA 
       
   public int dropStudent( int minGradeLevel )
      {
      
      int numberDropped = 0;
          
      for (int index = 0; index < studentList.size(); index++){
        
          if (studentList.get(index).getGradeLevel() < minGradeLevel){
            
              studentList.remove(index);
              numberDropped ++;
              index --;
            
            }
        
        }
          
          
      return numberDropped;
      } // end method dropStudent
      
   public void addStudent( Student newStudent )
      {
          
          studentList.add(newStudent);
          
          
      } // end method addStudent
       
      
   public String toString()
      {
      String output = new String();
       output += "Class: " + courseName + "\n";       
     for( int index = 0; index < studentList.size(); index++ )
        {
            output += studentList.get( index ) + "\n";  
      } // end for
      return output;
      } // end method toString
   } // end ClassRoster