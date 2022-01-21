import java.util.*;
public class Railway {
	static Scanner sc= new Scanner(System.in);
	static int seats[][] = new int[10][7];   // 10 seats or rows   7stations
        static int waitList[][] = new int[5][7];
	//static int seat=2;
	static int count=0;
	static int k;
	static String[] cc = {"COVAI","TRIPUR","ERODE","SALEM","MADURAI","KANCHI","CHENNAI"};
	static ArrayList<String> un=new ArrayList<>(); //user name
	static ArrayList<String> up=new ArrayList<>(); //user pass
	static ArrayList<String> bp=new ArrayList<>(); // boarding point
	static ArrayList<String> dp=new ArrayList<>(); //destination point
	static ArrayList<String> tid=new ArrayList<>(); // ticket id
	//............................................................................................//
	static ArrayList<String> w1=new ArrayList<>();
	static ArrayList<String> w2=new ArrayList<>();
	static ArrayList<String> w3=new ArrayList<>();
	static ArrayList<String> w4=new ArrayList<>();
	//.............................................................................................//
	public static void welcome() {
	    flush();
		System.out.println("\t\t**!!!WELCOME TO CHENNAI EXPRESS !!!*\n");
		System.out.println("1.ADMIN");
		System.out.println("2.USER");
		System.out.println("3.EXIT");
		int a=sc.nextInt();
		sc.nextLine();
		switch(a) {
		case 1:
			admin();
			break;
		case 2:
			user();
			break;
		case 3:
			exit();
			
			break;
		 case 4:
			welcome();
			break;
		}
	}
	public static void exit() {
		System.out.println("......**THANK YOU FOR VISITING OUR EXPRESS!!! COME AGAIN!!!...... ");
        System.out.println("Press enter to continueee");
         String k=sc.nextLine();
        if(k.equals("")){
            welcome();
        }
		
	}
	public static void admin() {
	    flush();
		System.out.println("#### WELCOME YOU ADMIN ###");
		System.out.println("ENTER THE NAME");
		String name=sc.next();
		System.out.println("ENTER THE PASSWORD");
		String pass=sc.next();
		if(name.equals("mathu")&&pass.equals("1234")) {
			System.out.println("1.VIEW BOOKED TICKETS");
			System.out.println("2.EXIT");
			int a = sc.nextInt();
			sc.nextLine();
			switch (a) {
				case 1:
					viewbooked();
					break;
				case 2:
					welcome();
					break;
				default:
					System.out.println("Enter Valid Number!");
					admin();
					break;
			}
		}
		else {
			System.out.println("INVALID NAME || PASSWORD");
		}
	}
	public static void viewbooked(){
	    flush();
		System.out.println("**********Booked Tickets **********");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(seats[i][j]);
            }
            System.out.println();
        }
		System.out.println();
		System.out.println("********WaitingList Tickets **********");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(waitList[i][j]);
            }
            System.out.println();
        }
        String k = sc.nextLine();
        welcome();
	}
	public static void user() {
	    flush();
		System.out.println("#### WELCOME YOU USER ###");
		System.out.println("1.LOGIN");
		System.out.println("2.SIGN UP");
		System.out.println("3.EXIT");
		int a=sc.nextInt();
		sc.nextLine();
		if(a==1)
			userlogin();
		else if(a==2)
			usersignup();
		else if(a==3)
			exit();
		else
			welcome();
	}
	private static void usersignup() {
	    flush();
		System.out.println("* WELCOME YOU USER!! TO SIGNUP DETAILS **");
		System.out.println("Enter your name:");
		String n=sc.nextLine();
		un.add(n);
		System.out.println("Enter your password:");
		String pass=sc.nextLine();
		
		System.out.println("Re-enter your password:");
		String pass1=sc.nextLine();
		if(pass.equals(pass1)) {
			up.add(pass1);
		System.out.println("Your password is:"+pass1);
		}
		else
		{
			System.out.println("Your password doesn't match");
		}
		System.out.println("press enter to continue");
		String k=sc.nextLine();
		if(k.equals("")) {
			user();
		}
	}
	private static void userlogin() {
	    flush();
		System.out.println("* WELCOME YOU USER!! TO LOGIN YOUR PAGE**");
		System.out.println("Enter your name:");
		String uname=sc.nextLine();
		System.out.println("Enter your password:");
		String upass=sc.nextLine();
		if(un.contains(uname)&&(up.contains(upass))) {
			System.out.println("*******");
			System.out.println("1.TO BOOK TICKETS");
			System.out.println("2.TO CANCEL TICKETS");
			System.out.println("3.VIEW  AVAILABILITY OF TICKETS");
			System.out.println("4.CHANGE PASSWORD");
			System.out.println("5.EXIT");
			System.out.println();
			int a=sc.nextInt();
			sc.nextLine();
			if(a==1) {
				bookticket();
			}
			else if(a==2) {
				cancelticket();
			}
			else if(a==3) {
				viewticket();
			}
			else if(a==4) {
				chngpass();
			}
			else if(a==5) {
				exit();
			}
		}		
	}
   	public static void chngpass() {
   	    flush();
	   System.out.println("Enter the old password:");
	    String a=sc.next();
	    if(up.contains(a))
	    {
	        System.out.println();
	        System.out.println("Enter the new password:");
	        String a1=sc.next();
	        int res1=up.indexOf(a1);
	        up.set(res1,a1);
	        System.out.println();
	        System.out.println("Your password changed successfully:");
	        System.out.println();
	        System.out.println("Press enter to continue");
	           sc.nextLine();
	           String s=sc.nextLine();
	           if(s.equals(""))
	          userlogin();
	    }
	    else{
	        System.out.println("Invalid password");
	        System.out.println();
	        System.out.println("press enter continue");
	           sc.nextLine();
	           String s=sc.nextLine();
	           if(s.equals(""))
	           user();
	    }    
	}
	public static void viewticket() {
	    flush();
		System.out.println(".......Your Tickets are below.......");
		System.out.println("Enter your ticket id:");
		String vt=sc.nextLine();	
		if(tid.contains(vt)) {
			int vt1=tid.indexOf(vt);
			System.out.println("Passenger name:"+un.get(vt1));
			System.out.println("Boarding point:"+bp.get(vt1));
			System.out.println("Destination point:"+dp.get(vt1));
			System.out.println("Ticket:"+tid.get(vt1));	
		}
		else {
			System.out.println("**YOUR ID IS NOT AVAILABLE*");	
		}
		System.out.println("Press enter to continueee");
        String k=sc.nextLine();
        if(k.equals("")){
            user();
        } 
		}
	public static void cancelticket() {
	    flush();
		System.out.println("....WELCOME TO TICKET CANCELLATION......");
		System.out.println("Enter id to cancel the ticket:");
		String id=sc.nextLine();
		if(tid.contains(id)) {
			int  a=tid.indexOf(id);
			 tid.remove(a);
			 un.remove(a);
			 up.remove(a);
		count++;
		System.out.println("Your ticket was cancelled successfully!!!!!!");
		}
		else {
			System.out.println("Enter valid id");
		}
		welcome();
	}
	public static void bookticket() {
	    flush();
		System.out.println("<<<<<<<<<<<<<<<<<COVAI TO CHENNAI EXPRESS>>>>>>>>>>>>>>>>");
		System.out.println(" 1.Covai\n 2.Tripur\n 3.Erode\n 4.Salem\n 5.Madurai\n 6.Kanchi\n 7.Chennai");
		System.out.println("Enter your name:");
		String n=sc.nextLine();
		System.out.println("Enter your ticket id:");
		String id=sc.nextLine();
		tid.add(id);
		System.out.println("Enter your boarding point:");
		String a=sc.nextLine().toUpperCase();
		bp.add(a);
		System.out.println("Enter your destination point:");
		String b=sc.nextLine().toUpperCase();
		dp.add(b);
        System.out.println("Enter no.of tickets:");
        int nt=sc.nextInt();
       // if(seat >= nt) {
       // if(a.equals(b)) {
       // 	 System.out.println("NO!!!!Same stations are not available");
       //  }
       //   else if(p1>q1) {
      //   System.out.println("Reversed stations not availble for ticket booking");
      //   }
      //   else  {
        System.out.println("HI!!"+" "+n+" "+"Your trip is from:"+a+"to"+b);
        System.out.println("Your ticket was booked");
		int s=0,e=0;
		for(int i=0;i<cc.length;i++){
			if(cc[i].equals(a))
				s=i;
			else if(cc[i].equals(b)) 
				e=i;
		}
		System.out.println(s+" "+e);
		int check=0;
        for(int i=0;i<10;i++){
            int sum=0;
            for(int j=s;j<=e;j++){
                sum+=seats[i][j];
            }
            if(sum==0){
                for(int j=s;j<=e;j++){
                    seats[i][j]=1;
                }
                check=1;
            }
            if(check==1){
				System.out.println("Alloted Seat : "+(i+1));
                break;
            }
        }
        if(check==0){
            for(int i=0;i<5;i++){
                int sum=0;
                for(int j=s;j<=e;j++){
                    sum+=waitList[i][j];
                }
                if(sum==0){
                    for(int j=s;j<=e;j++){
                        waitList[i][j]=1;
                    }
                    check=2;
                }
                if(check==2){
					System.out.print("Added to waiting List "+(i+1));
                    break;
                }
            }
        }
		if(check==0){
			System.out.print("Sorry No seats available");
		}
		
        }
       welcome();
		}
	public static void waiting() {
	    flush();
		w1.add(un.get(un.size()-1));
		w2.add(bp.get(bp.size()-1));
		w3.add(dp.get(un.size()-1));
		w4.add(tid.get(tid.size()-1));
		//////
		un.remove(un.size()-1);
		bp.remove(bp.size()-1);
		dp.remove(dp.size()-1);
		tid.remove(tid.size()-1);
	}
	public static void flush() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

	public static void main(String args[]) {
		welcome();
	}
	
}
