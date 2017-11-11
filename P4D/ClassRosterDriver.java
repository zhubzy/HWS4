public class ClassRosterDriver
   {
   public static void main( String[] args )
      {
      // 1. Creating and printing ClassRoster    
      ClassRoster lew = new ClassRoster( "AP Computer Science" );
      System.out.println( "Class Roster:\n" + lew );

      // 2. Testing studentWithMaxGPA
      System.out.println( "Student with the max GPA is: " + lew.studentWithMaxGPA() );
      System.out.println( "\n\n" );
      
      // 3. Testing dropStudent
      System.out.println( "The number of student(s) dropped is" + lew.dropStudent( 12 ) );
      System.out.println( "Class Roster:\n" + lew );
      System.out.println( "\n\n" );

      //4 . Testing addStudent
      lew.addStudent( new Student( "Super", "Woman", 12, 6, 6, 6, 6, 6) );
      System.out.println( "Class Roster:\n" + lew );
                          
      System.out.println( "\n\n" );

          
      } // end method main
      
   } // end class ClassRosterDriver