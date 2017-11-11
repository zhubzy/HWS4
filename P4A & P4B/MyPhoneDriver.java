public class MyPhoneDriver
{
   public static void main(String[] args){
    
    MyPhone phone = new MyPhone("Gray",64);
    System.out.println("\n" + phone);
    System.out.println("Total Play time: " + phone.totalPlayTime() + " seconds.");
    
    phone.deleteAllSongs();
    System.out.println("\n" +phone);    
    
    
    System.out.println("\nUsing ArrayList: Output should be same\n");
    MyPhone2 phone2 = new MyPhone2("Gray",64);
    System.out.println("\n" +phone2);
    System.out.println("Total Play time: " + phone2.totalPlayTime() + " seconds.\n");
    
    
    phone2.deleteAllSongs();
    System.out.println("\n" +phone2);    
    
    }
}
