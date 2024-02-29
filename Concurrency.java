import java.util.*;

public class MyClass extends Thread {
    public static void main(String args[]) {
      
      Scanner SC = new Scanner(System.in);
      
      MyClass t1 = new MyClass();
      MyClass t2 = new MyClass();
      MyClass t3 = new MyClass();
      
      System.out.print("Enter Name for 1st Thread: ");
      String name1 = SC.nextLine();
      
      System.out.print("Priority Level: ");
      int prio1 = Integer.parseInt(SC.nextLine());
      
      System.out.print("Enter Name for 2nd Thread: ");
      String name2 = SC.nextLine();
      
      System.out.print("Priority Level: ");
      int prio2 = Integer.parseInt(SC.nextLine());
      
      System.out.print("Enter Name for 3rd Thread: ");
      String name3 = SC.nextLine();
      
      System.out.print("Priority Level: ");
      int prio3 = Integer.parseInt(SC.nextLine());
      
      t1.setName(name1);
      t2.setName(name2);
      t3.setName(name3);
      
      t1.setPriority(prio1);
      t2.setPriority(prio2);
      t3.setPriority(prio3);
      
      System.out.println(t1.getName() + " - " + t1.getPriority());
      System.out.println(t2.getName() + " - " + t2.getPriority());
      System.out.println(t3.getName() + " - " + t3.getPriority());
      
      System.out.println("\nStarting Threads...\n");
      
      t1.start();
      t2.start();
      t3.start();
      
    }
    
    public void run(){
        
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}