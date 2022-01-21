import java.util.*;
public class Main{
    static int sold=0;
    static int bal=1000;
    static int balanceproduct=5000;
    static Scanner sc=new Scanner(System.in);
    //******************************************************************//
    static  ArrayList<String>l=new ArrayList<>();//m name
    static  ArrayList<String>l1=new ArrayList<>();// m id
    static  ArrayList<String>l2=new ArrayList<>();// p id
    static  ArrayList<String>l3=new ArrayList<>();//p name 
    static  ArrayList<String>l4=new ArrayList<>();// p count
    //************************************************************//
    static ArrayList <String> i=new ArrayList<>(); //m name
    static ArrayList <String> i1=new ArrayList<>();// m id
    static ArrayList <String> i2=new ArrayList<>();// p id
    static ArrayList <String> i3=new ArrayList<>();// p name
    static ArrayList <String> i4=new ArrayList<>(); //p count
    static ArrayList <String> s1=new ArrayList<>();//order product
    static ArrayList<String> s2=new ArrayList<>();//order product
    static ArrayList<String> s4=new ArrayList<>();
    static ArrayList<Integer> s3=new ArrayList<>();
    static ArrayList<String> c=new ArrayList<>();
    //*******************************************************//
    static ArrayList<String> a=new ArrayList<>();// loginu user
    static ArrayList<String> a1=new ArrayList<>();
	private static String a12;
	private static String z;
    //*******************************************//
	 static ArrayList<String> mp=new ArrayList<>();
	    static ArrayList<String> mn=new ArrayList<>();
	public static void welcome() {
		flush();
        System.out.println(".....WELCOME YOU TO AMAZON!!!.....");
        System.out.println("1.ADMIN ");
        System.out.println("2.MERCHANT ");
        System.out.println("3.USER "); 
        System.out.println("4.EXIT");
        int n = sc.nextInt();
        if (n == 1)
            admin();
        else if (n == 2)
            merchantwork();
        else if (n == 3)
            user();
            else 
            exit();
    }
    public static void admin(){
    	flush();
        System.out.println("Enter your name:");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Enter your password:");
        
        String pass=sc.nextLine();
        if(name.equals("mathu") && pass.equals("1234")){
            adminwork();
        }
        else {
            System.out.println("Invalid username or password");
            welcome();
        }
        
    }
    public static void adminwork(){
    	flush();
        System.out.println("...WELCOME YOU ADMIN... ");
        System.out.println("1.ADD MERCHANT ");
        System.out.println("2.REMOVE MERCHANT ");
        System.out.println("3.APPROVE MERCHANT ");
        System.out.println("4.VIEW MERCHANT ");
        System.out.println("5.VIEW PRODUCTS");
        System.out.println("6.EXIT");
        int a=sc.nextInt();
        switch(a) {
        case 1:
        	addmerchant();
        	break;
        case 2:
        	removemerchant();
        	break;
        case 3:
        	approvemerchant();
        	break;
        case 4:
        	viewmerchant();
        	break;
        case 5:
        	viewproducts();
        	break;
        case 6:
        	exit();
        }
        
    }
    public static void addmerchant() {
    	flush();
    	System.out.println("WELCOME TO ADD NEW MERCHANT");
    	System.out.println("Enter merchant name:");
    	sc.nextLine();
    	String m=sc.nextLine();
    	l.add(m);
    	System.out.println("Enter merchant id:");
    	String m1=sc.nextLine();
    	l1.add(m1);
    	System.out.println("Enter product type:");
    	String m2=sc.nextLine();
    	l2.add(m2);
    	System.out.println("Enter product name:");
    	String m3=sc.nextLine();
    	l3.add(m3);
    	System.out.println("Enter count of products:");
    	String m4=sc.nextLine();
    	l4.add(m4);
    	System.out.println("Press enter to continueee");
       // sc.nextLine();
        String k=sc.nextLine();
        if(k.equals("")){
            adminwork();
        }
    	
    }
    public static void removemerchant() {
    	flush();
    System.out.println("....PLEASE TELL THE DATA TO BE REMOVED...");
    System.out.println(" 1.Remove data by merchant id");
    System.out.println("2.Clear all the data");
    int r=sc.nextInt();
    if(r==1) {
    	System.out.println("Enter the id which is to be removed");
    	int id=sc.nextInt();
    	id=id-1;
    	if(id<=l1.size()-1) {
    		System.out.println("Enter merchant name:"+l.remove(id));
    		System.out.println("Enter merchant id:"+l1.remove(id));
    		System.out.println("Enter product type:"+l2.remove(id));
    		System.out.println("Enter product name:"+l3.remove(id));
    		System.out.println("Enter count of products:"+l4.remove(id));
    		System.out.println("...Data's are removed successfully....");
    		System.out.println("Press enter to continueee");
            sc.nextLine();
            String k=sc.nextLine();
            if(k.equals("")){
                adminwork();
            }
    		
    	}
    }
    else if(r==2) {
    	removeall();
    }
    else {
    	System.out.println("Invalid data");
    }
    }
    public static void removeall() {
    	flush();
    	System.out.println("YOUR data will be removed soon...");
    	l.clear();
    	l1.clear();
    	l2.clear();
    	l3.clear();
    	l4.clear();
    	System.out.println("....YOUR data's are removed successfully....");
    	System.out.println("Press enter to continueee");
        sc.nextLine();
        String k=sc.nextLine();
        if(k.equals("")){
            welcome();
        }
    	
    }
    public static void approvemerchant() {
    	flush();
    	System.out.println(".......PLEASE APPROVE YOUR MERCHANT'S........");
    	if(i1.size()-1<0)
        {
            System.out.println("***NO REQUEST ARE PENDING*****");
        }
        else{
        System.out.println(" THE MERCHANT NAME : "+i.get(i.size()-1));
        System.out.println(" THE MERCHANT ID : "+i1.get(i1.size()-1));
        System.out.println(" THE PRODUCT TYPE : "+i2.get(i2.size()-1));
        System.out.println(" THE PRODUCT NAME : "+i3.get(i3.size()-1));
       
        System.out.println(" THE PRODUCT COUNT : "+i4.get(i4.size()-1));
         System.out.println();
         System.out.println(" PLEASE PRESS 1 TO ACCEPT");
         System.out.println(" PLEASE PRESS 2 TO REJECT");
         int d1=sc.nextInt(); 
        // s3.add(d1);
        
         if(d1==2)
         {
             System.out.println(" YOU !!! SUCESSFULLY REJECTED THE ORDER");
             System.out.println();
             System.out.println("press enter to continue");
             sc.nextLine();
             String s=sc.nextLine();
             if(s.equals(""))
             adminwork();
         }
         else if(d1==1){
             l.add(i.get(i.size()-1));
             l1.add(i1.get(i1.size()-1));
             l2.add(i2.get(i2.size()-1));
             l3.add(i3.get(i3.size()-1));
             l4.add(i4.get(i4.size()-1));
            
             //s2.add(0000);
           //  s1.add(l1.get(l1.size()-1)); mmmm
             System.out.println(" YOU !!!SUCCESSFULLY ACCEPTTED THE ORDER");
             System.out.println();
             System.out.println("press enter to contiue");
             sc.nextLine();
             String s=sc.nextLine();
             if(s.equals(""))
             adminwork();
         }
     }
     }
    public static void merchantwork()
    {
    	flush();
       System.out.println("WELCOME YOU TO MERCHANT LOGIN PAGE");
       System.out.println("1.LOGIN");
       System.out.println("2.SIGN UP");
       System.out.println("3.EXIT");
       int r=sc.nextInt();
       if(r==1)
       loginmerchant();
       if(r==2)
       signup();
       else
       welcome();
    }
    private static void signup() {
		flush();
    	 System.out.println("!!!Welcome to signup your Details..........");
         System.out.println("ENTER THE MERCHANT NAME");
     String h=sc.next();
     i.add(h);
     mn.add(h);
     System.out.println("ENTER THE MERCHANT ID || pass");
     String h1=sc.next();
     i1.add(h1);
     mp.add(h);
     System.out.println("ENTER THE PRODUCT TYPE");
     String h3=sc.next();
     i2.add(h3);
     System.out.println("ENTER THE PRODUCT NAME");
     String h4=sc.next();
     i3.add(h4);
     System.out.println("ENTER THE COUNT OF PRODUCT");
     String h5=sc.next();
     i4.add(h5);
     
         System.out.println("************ YOUR REQUEST  WAS PENDING*********");
         System.out.println();
         System.out.println("press enter to continuee");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            welcome();
	}
	public static void loginmerchant()
    {
		flush();
       System.out.println("Enter the merchant name");
       String a=sc.next();
       System.out.println("Enter the password || id");
       a12 = sc.next();
       if(l.contains(a)&& l1.contains(a12)) //mmmmmmmmmmmm
       {
        merchantid1();
       } 
       else{
           System.out.println("Invalid merchant name or password");
           System.out.println();
           
           System.out.println("press enter to continue");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
           merchantwork();
       }       
    }
    public static void merchantid1()
    {
    	flush();
        System.out.println("1.ADD  YOUR DATA");
        System.out.println("2.CHANGE THE PASSWORD");
        System.out.println("3.SHOW STOCKS");
      
        System.out.println("4.EXIT");
        int s1=sc.nextInt();
        if(s1==1)
        {
            merchantid();
        }
        else if(s1==2)
        {
            changepassword();
        }
        else if(s1==3)
        {
            showstocks();
        }
        else
        {
            welcome();
        }
    }
    public static void changepassword() {
    	flush();
    	System.out.println("..... change your Password......");
        System.out.print("Enter Your Old Password : ");
        sc.nextLine();
        String o = sc.nextLine();
        System.out.print("Enter Your New Password : ");
        String n = sc.nextLine();
        int p1 = l1.indexOf(o);
        l1.set(p1, n);
        System.out.println(" Your Password Changed Successfully");
        
        System.out.println("press enter to continue..");
        sc.nextLine();
        String k = sc.nextLine();
        if (k.equals(""))
            welcome();
    	
    }
    public static void showstocks() {
    	flush();
    	System.out.println("  HELLO !! YOUR STOCKS ARE BELOW ");
    	System.out.print("Enter merchant name:");
    	sc.nextLine();
    	String m=sc.nextLine();
    	if(l.contains(m)) {
    		int p1 = l.indexOf(m);
            System.out.println(" Product Type : " + l2.get(p1) );
            System.out.println(" Stock count : " + l4.get(p1));
            System.out.println("press enter to continue..");
            sc.nextLine();
            String k = sc.nextLine();
            if (k.equals(""))
                merchantwork();
    	}
           
        else {
            System.out.println("Invalid  Merchant Name!!");
            
            String k = sc.nextLine();
            if (k.equals(""))
                welcome();
        }
    	}
    	
    
    public static void merchantid()
    {
    	flush();
    System.out.println("ENTER THE MERCHANT NAME");
    String h=sc.next();
    l.add(h);
    System.out.println("ENTER THE MERCHANT ID");
    String h1=sc.next();
    l1.add(h1);
    System.out.println("ENTER THE PRODUCT TYPE");
    String h3=sc.next();
    l2.add(h3);
    System.out.println("ENTER THE PRODUCT NAME");
    String h4=sc.next();
    l3.add(h4);
    System.out.println("ENTER THE PRODUCT COUNT");
    String h5=sc.next();
    l4.add(h5);
    
    System.out.println("....YOUR DATA IS ADDED SUCCESSFULLY.....");
    System.out.println();
           System.out.println("press enter to continue");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
           welcome();
    } 
    	
    	
    	
    	
    
    public static void viewmerchant() {
    	
    	System.out.println("Your merchants are below:");
    	System.out.println("1.Show all merchant");
    	System.out.println("2.Show only particular merchant ");
    	int v=sc.nextInt();
    	if(v==1) {
    		
    		for(int i=0;i<l.size();i++) {
    			System.out.println(l.get(i)+" ");
    			
    		}
    		adminwork();
    	}
    		else if(v==2) {
    			 System.out.println("Merchants by their id's");
    	        int j=sc.nextInt(); 
    			if(j<=l.size()) {
    				System.out.println(l.get(j-1));
    				System.out.println(l1.get(j-1));
    				System.out.println(l2.get(j-1));  
    				System.out.println(l3.get(j-1));
    				System.out.println(l4.get(j-1));
    			}
    			adminwork();
    		}
    	
    
    		else {
    			System.out.println("...Your id is not matched to show");
    			System.out.println("Press enter to continueee");
    	        sc.nextLine();
    	        String s=sc.nextLine();
    	        
    	            adminwork();
    	        
    		}
    	
    }

    public static void viewproducts() {
    	flush();
    	System.out.println("Your products are below:");
    	for(int i =0;i<l2.size();i++) {
    		String a=l2.get(i);
    		if(a.equals(0)) {
    			System.out.println(".....THERE IS NOTHING TO DISPLAY.....");
    		}
    		else {
    			System.out.println("Product type:"+" "+l2.get(i));
    			System.out.println("Product name:"+" "+l3.get(i));
    			System.out.println("product count"+" "+l4.get(i));
    		
    	}
    	
    	}
    }
    
    public static void user(){
    	flush();
    	System.out.println("....AMAZON WELCOME YOU USER...");
    	System.out.println("1.LOGIN");
    	System.out.println("2.SIGN UP");
    	System.out.println("3.EXIT");
    	int a=sc.nextInt();
    	if(a==1) {
    		loginuser();
    	}
    	 if(a==2) {
    		signupuser();
    	}
    	else {
    		exit();
    	}
    	
        
    }
    private static void loginuser() {
		flush();
    	System.out.println("...AMAZON WELCOME YOU TO USER LOGIN..");
        System.out.println("Enter the username");
        String h=sc.next();
        System.out.println("Enter the password");
        String lu=sc.next();
        if(a.contains(h)&&a1.contains(lu))
        {
            userall();
        }
        else if((a.contains(h)&&!a1.contains(lu))||(!a.contains(h)&&a1.contains(lu)))
        {
            System.out.println("Invalid username or password");
        }
        else
        {
           
            System.out.println("...THERE IS NO ACCOUNT EXIST..!!PLEASE SIGNUP...");
        }
        System.out.println();
        System.out.println("press enter to continue..");
           sc.nextLine();
           String s=sc.nextLine();
           if(s.equals(""))
           welcome();
	}
	public static void signupuser(){
		flush();
		 System.out.println("Enter the user name");
         String h=sc.next();
         System.out.println("Enter the password");
         String lu=sc.next();
         System.out.println("please re-enter your password");
         String uu=sc.next();
         if(lu.equals(uu))
         {
           a.add(h);
           a1.add(lu);
           System.out.println("YOr registration was success");
         }
         else{
             System.out.println("Invalid password");
         }
         System.out.println();
         System.out.println("press enter to continue");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            welcome();
    	
    	
    }
	public static void userall() {
		flush();
		for(int p=0;p<l1.size();p++)
        {
            System.out.println("...Your details are below.....");
            System.out.println("MERCHANT NAME : "+l.get(p));
            System.out.println("MERCHANT ID : "+l1.get(p));
            System.out.println("PRODUCT NAME : "+l2.get(p));
            System.out.println("PRODUCT TYPE : "+l3.get(p));
            
            System.out.println("PRODUCT COUNT : "+l4.get(p));  
        }
        System.out.println("1.PLACE THE ORDER");
        System.out.println("2.CART");
        System.out.println("3.WALLET");
        System.out.println("4.ORDER HISTORY");
        System.out.println("5.EXIT");
        int p=sc.nextInt();
        if(p==1) {
        	order();
        }
        if(p==2)
        {
            cart();
        }
        if(p==3) {
        	wallet();
        }
        if(p==4) {
        	history();
        }
        else{
            welcome();
        }
    }
		
	
    public static void order() {
		flush();
    	System.out.println("PLEASE  ENTER PRODUCT ID TO PLACE THE ORDER");
    	int i=sc.nextInt();
    	System.out.println("Enter the product name:"+" " +l2.get(i-1));  // here(i-1) or (i) doubt
    	System.out.println("Enter the product type:"+" "+l3.get(i-1));
    	System.out.println("PRESS 5 TO CONFIRM THE PRODUCT");
    	String j=sc.next();
    	if(j.equals("5")) {
    		System.out.println("Enter the Address");
    		z = sc.next();  
           System.out.println("Enter the count of the product");
           int d=sc.nextInt();
            sold=d;
          balanceproduct-=d*Integer.parseInt(l4.get(i));
    		System.out.println(".......YOUR ORDER CONFIRMED.........");
    		s1.add(l2.get(i));
    		s2.add(l3.get(i));
    	}
    	else {
    		System.out.println("..SORRY!!! YOUR ORDER WAS CANCELLED ......");
    	}
    	 System.out.println("press enter to continue");
         sc.nextLine();
         String s=sc.nextLine();
         if(s.equals(""))
        	 userall();
    	
		
	}
	public static void wallet() {
		flush();
		System.out.println("your wallet balance:"+bal);
		System.out.println(" PRESS 1 TO ADD MONEY IN WALLET..");
		int b=sc.nextInt();
		if(b==1) {
			System.out.println("Enter the amount to be added:");
			int a=sc.nextInt();
			bal+=a;
			
		
		System.out.println("..Total money in your account is: ..."+bal);
		}else {
			System.out.println("press enter to continue");
	         sc.nextLine();
	         String s=sc.nextLine();
	         if(s.equals(""))
	        	 userall();
		}
	}
	private static void history() {
		flush();
		if(s1.size()>0) {
			System.out.println("...YOUR PURCHASED PRODUCTS ARE BELOW...");
			for(int i=s1.size()-1;i>=0;i--) {
				System.out.println("Product name:"+s1.get(i));
				System.out.println("Product name:"+s2.get(i));
				
			}
		}
			else {
				System.out.println("You purchased nothing..");	
			}
		System.out.println("press enter to continue");
        sc.nextLine();
        String s=sc.nextLine();
        if(s.equals(""))
       	userall();
		
        
		}
		
	
	private static void cart() {
	flush();
		////////
		System.out.println("1.ADD TO CART");
        System.out.println("2. REMOVE FROM CART");
        System.out.println("3. VIEW CARD");
        System.out.println("4. EXIT");
        int j=sc.nextInt();
        if(j==1)
        {
        System.out.println("ENTER THE ID TO ADD IN CART");
        int p=sc.nextInt();
        System.out.println("PRODUCT NAME : "+l2.get(p-1));
        System.out.println("PRODUCT TYPE : "+ l3.get(p-1));
        
        c.add(l2.get(p));
        c.add(l3.get(p));
        
        System.out.println();
        System.out.println("SUCCESSFULLY ADDED TO CART");
            }
            else if(j==2)
            {
                System.out.println("ENTER THE ID TO REMOVE");
                int p=sc.nextInt();
            System.out.println("PRODUCT NAME : "+(l.remove(l2.get(p))));
            System.out.println("PRODUCT TYPE : "+( l.remove(l3.get(p))));
            
            System.out.println();
           System.out.println(" ...YOU SUCCESSFULLY REMOVED FROM  THE CARD..");
            }
            else if(j==3)
            {
                System.out.println();
               
                System.out.println("****YOUR CARD*****");
                for(int p=0;p<l.size();p++){
                System.out.println(l.get(p));
                }
               
            }
            else
            {
                welcome();
            }
            System.out.println();
            System.out.println("press enter to continue");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               cart();
	}
	public static void exit(){
        System.out.println("......THANK YOU FOR VISITING...... ");
        System.out.println("Press enter to continueee");
        sc.nextLine();
        String k=sc.nextLine();
        if(k.equals("")){
            welcome();
        }
    }
	 public static void flush() {
	        System.out.print("\033[H\033[2J");
	        System.out.flush();
	    }
	
    public static void main(String[] args) {
	welcome();
	}
    
}


