import java.util.*;
import java.io.*;
public class Main{
     static Scanner sc=new Scanner(System.in);
     static int Mbalance=50000;
     static String l="1234";
     static String m="mathu";
     static int count=0;
     // 231//
     static List<Integer> list1=new ArrayList<>();
     static List<String> list2=new ArrayList<>();
     static int[] Mdep={10,40,25,50};
     static int ubal=8000;
     static int ubal2=40000;
     public static void welcome(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.println("Welcome to state bank of SBI");
         System.out.println("1.ADMIN");
         System.out.println("2.USER");
         System.out.println("3.EXIT");
         int n=sc.nextInt();
         if(n==1)
             admin();
        else if(n==2)
        user();
        else
        exit();
         
     }
     public static void admin(){
         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("Welome you ADMIN!!!");
         System.out.print("Enter your name: ");
         sc.nextLine();
         String name=sc.nextLine();
         System.out.print("Enter your password:");
         String k=sc.nextLine();
         
          if(name.equals("m")&&k.equals("1234")){
             adminwork();
         }
         else{
             System.out.println("Invalid user name Password");
             
             welcome();
         }
         
     }
     public static void adminwork(){
         System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("1.ATM Balance");
         System.out.println("2.Deposit");
         System.out.println("3.Exit");
         int k=sc.nextInt();
         
         switch(k){
             case 1:
                 atmbalance();
             case 2:
                 deposite();
             case 3:
                 welcome();
             default:
                 System.out.println("Error occured!!!!!!!!!!");
                 welcome();
        }
     }
     
     public static void atmbalance(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.println("ATM Balance is: "+Mbalance);
         System.out.println("No of $2000 ----->"+Mdep[0]);
          System.out.println("No of $500 ----->"+Mdep[1]); 
          System.out.println("No of $200 ----->"+Mdep[2]);
          System.out.println("No of $100 ----->"+Mdep[3]);
         System.out.println("Press enter to continueee");
         sc.nextLine();
         String k=sc.nextLine();
         if(k.equals("")){
         adminwork();
         }
     }
     public static void deposite(){
         System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.println("Enter no of notes: ");
         System.out.print("No of 2000 Notes: ");
         sc.nextLine();
         Mdep[0]=sc.nextInt();
          System.out.print("No of 500 Notes: ");
          sc.nextLine();
          Mdep[1]=sc.nextInt();
          System.out.print("No of 200 Notes: ");
          sc.nextLine();
          Mdep[2]=sc.nextInt();
          System.out.println("No of 100 Notes: ");
          sc.nextLine();
          Mdep[3]=sc.nextInt();
         Mbalance+=Mdep[0]*2000+Mdep[1]*500+Mdep[2]*200+Mdep[3]*100;
         System.out.println("Amount Added Successfully: ");
         System.out.println("Total amount is: "+Mbalance);
         adminwork();
         
     }
     public static void user(){
         System.out.print("\033[H\033[2J");
        System.out.flush();
          System.out.println("Welome you USER!!!");
         System.out.print("Enter your name: ");
         sc.nextLine();
         String name=sc.nextLine();
         System.out.print("Enter your password:");
          String k=sc.nextLine();
          if(count>=3){
             System.out.println(".....YOUR ACCOUNT HAS BEEN LOCKED......");
         }
         else if(name.equals("m")&&k.equals(l)){
             userwork();
         }
         else{
             System.out.println("Invalid user name Password");
             count++;
             welcome();
         }
     }
     public static void userwork(){
         System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.println("1.BALANCE ENQUIRY");
         System.out.println("2.WITHDRAW");
         System.out.println("3.PINCHANGE");
         System.out.println("4.TRANSACTION");
         System.out.println("5.MINI");
         System.out.println("6.EXIT");
         int k=sc.nextInt();
         switch(k){
             case 1:
                 ube();
             case 2:
                 withdraw();
             case 3:
                 upinc();
             case 4:
            	 user2();
             case 5:
            	 mini();
             case 6:
                 welcome();
            default:
            System.out.println("Error occured!!!!!");
            System.out.println("Press enter to continueee");
           sc.nextLine();
           String a=sc.nextLine();
            if(a.equals("")){
             userwork();
         }
         }
     }
     public static void ube(){
         System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.println("Your Account Balance is: "+ubal);
        System.out.println("Press enter to continueee");
         sc.nextLine();
         String k=sc.nextLine();
         if(k.equals("")){
         userwork();
         }
         
     }
     public static void withdraw(){
          System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.print("Enter the amount to be withdrawn:");
         sc.nextLine();
         int k=sc.nextInt();
         list1.add(k);
         list2.add("w");
         if(k<=ubal){
            ubal-=k;
            System.out.println("Available user balance :"+ubal);
            while(k>0){
        if (k>=2000 &&Mdep[0]>0){
             Mdep[0]--;
             k-=2000;
         }
          else if(k>=500&&Mdep[1]>0){
             Mdep[1]--;
             k-=500;
         }
          else if(k>=200&&Mdep[2]>0){
             Mdep[2]--;
             k-=200;
         }
          else if(k>=100&&Mdep[3]>0){
             Mdep[3]--;
             k-=100;
         }
         Mbalance-=k;
          System.out.println("Press enter to continueee");
         sc.nextLine();
         String a=sc.nextLine();
         if(a.equals(""))
             userwork();
         
            }
         }
         else{
             System.out.println("Sorry Insufficient Balance:");
        System.out.println("Press enter to continueee");
         sc.nextLine();
         String a=sc.nextLine();
         if(a.equals(""))
             userwork();
     }
     }
     public static void upinc(){
          
         System.out.println("Enter your old pin:");
         sc.nextLine();
         String a=sc.nextLine();
         System.out.println("Enter your new pin:");
         
         String b=sc.nextLine();
         if(a.equals(b)){
         System.out.println("New Pin Must be different from old Pin!!!!");
         }
         else{
             l=b;
             System.out.println("Pin has been changed");
         }
         
     }
     public static void user2() {
    	    
            System.out.println("Welcome to transaction!!!!");
            System.out.println("Enter the amount to be tranfered:");
            int amount=sc.nextInt();
            System.out.println("Enter your account number:");
            sc.nextLine();
            String a=sc.nextLine();
            System.out.print("Enter your IFSC Code:");
            
            String i=sc.nextLine();
            if(amount<=ubal && amount<=Mbalance) {
            if(i.contains("CANARA")) {
            	ubal =ubal- 10;
            	
            }
            if(i.contains("BOI")) {
            	ubal =ubal-20;
            	
            }
            
            	ubal-=amount;
            	Mbalance-=amount;
            	list1.add(amount);
            	list2.add("t");
            	System.out.println("....YOUR'S TRANSACTION WAS SUCCESSFULL...");
            	System.out.println("Your balance after transfer is"+ubal);
            	}
            	else {
            		System.out.println(" SORRY!! INSUFFICIENT BALANCE");
            	}
            System.out.println("Press enter to continue!!!");
            //jj
            String k=sc.nextLine();
            if(k.equals("")){
            	userwork();
            	
            }
            }
     public static void mini() {
          System.out.print("\033[H\033[2J");
        System.out.flush();
    	/* System.out.println("Your Transactions are below:");
    	for(int i=0;i<list1.size();i++){
    	    
    	    System.out.println(m+" Transferred"+"  "+list2.get(i)+"  "+"  "+"withdrawn" +"  "+list1.get(i));
    	}
    	System.out.println("Thank you for your visiting");*/
    	if(list1.size()>5){
    	    list1.remove(0);
    	    list2.remove(0);
    	}
    	for(int k =list1.size()-1;k>=0;k--){
    	    if(list2.get(k).equals("t")){
    	        System.out.println(list1.get(k)+" Transferred");
    	    } else {
    	        System.out.println(list1.get(k)+" Withdrawn");
    	    }
    	}
    	System.out.println("Press enter to continueee");
         sc.nextLine();
         String a=sc.nextLine();
         if(a.equals(""))
             userwork();
     }
                             

     public static void exit(){
          System.out.print("\033[H\033[2J");
        System.out.flush();
         System.out.println("Thank you for visiting!!!!!!!!");
         System.out.println("Press enter to continueee");
         sc.nextLine();
         String k=sc.nextLine();
         if(k.equals("")){
             welcome();
             
         }
     }
     
    public static void main(String args[]){
          welcome();
          
            
        }
}
          
         