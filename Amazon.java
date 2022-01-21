import java.util.*;
public class Amazon
{
    static Scanner sc=new Scanner(System.in);
    static int a;
    static ArrayList <Integer> i4=new ArrayList<>();
    static ArrayList <Integer> i=new ArrayList<>(); 
    static ArrayList <String> i1=new ArrayList<>();
    static ArrayList <String> i2=new ArrayList<>();
    static ArrayList <String> i3=new ArrayList<>();
    static ArrayList <Integer> i5=new ArrayList<>(); 
    static ArrayList <String> s1=new ArrayList<>();
    static ArrayList<Integer> s2=new ArrayList<>();
    static ArrayList<String> s4=new ArrayList<>();
    static ArrayList<Integer> s3=new ArrayList<>();
    //____________________//
    static ArrayList <Integer> j4=new ArrayList<>();
    static ArrayList <Integer> j=new ArrayList<>(); 
    static ArrayList <String> j1=new ArrayList<>();
    static ArrayList <String> j2=new ArrayList<>();
    static ArrayList <String> j3=new ArrayList<>();
    static ArrayList<Integer> j5=new ArrayList<>();
    //-----------------------------------------------------------//
    static ArrayList<String> o=new ArrayList<>();
    static ArrayList<String> o1=new ArrayList<>();
    //------------------------------------------------------//
    static ArrayList<String> l=new ArrayList<>();
    static ArrayList<String> l2=new ArrayList<>();

        //private static boolean add;
    public static void main(String[] args)
   {
        welcome();
    } 
    public static void welcome()
    {
        System.out.println("\t\t------WELCOME TO AMAZON-------");
        System.out.println();
        System.out.println("1. ADMIN LOGIN");
        System.out.println("2. USER LOGIN");
        System.out.println("3. MERCHANT LOGIN");
        System.out.println("4. EXIT");
         a=sc.nextInt();
        hello();
    }
    public static void hello()
    {
        if(a>3||a<1)
        welcome();
        else
        switch(a)
        {
            case 1:{
            Admin();}
            case 2:{
                user();
            }
            case 3:{
                merchant();
            }

        }
    }
    public static void Admin()
    {
       // System.out.println("\033[H\033[23");
       // System.out.flush();
       System.out.println("\t\t-------ADMIN LOGIN--------");
       System.out.println();
        System.out.println("ENTER THE ADMIN NAME");
        String a=sc.next();
        System.out.println("ENTER YOUR ID");
        int a1=sc.nextInt();
        if(a.equals("JAWA")&&a1==10)
        {
            Adminid();
        }
        else{
            System.out.println("ENTER THE PROPER ADMIN NAME OR ID");
            System.out.println("====PRESS ENTER TO CONTINUE====");
	        sc.nextLine();
	        String s=sc.nextLine();
	        if(s.equals(""))
	          Admin();
        }
    }
    public static void Adminid()
    {
        //System.out.println("\033[H\033[23");
        //System.out.flush();
        System.out.println();
        System.out.println("1.APPROVE  MERCHANT");
        System.out.println("2.ADD NEW MERCHANT");
        System.out.println("3.REMOVE EXISTING MERCHANT");
        System.out.println("4.VIEW MERCHANT");
        System.out.println("5.SHOW");
        System.out.println("6.EXIT");
        int y=sc.nextInt();
        if(y==1)
        {
            approvemerchant();
        }
        if(y==4)
        {
            viewmerchant();
        }
        if(y==2)
        {
        addnewmerchant();
        }
        else if(y==3){
            removedata();
        }
        /*else if
        {
            approvemerchant();
        }
       */
        else{
            welcome();
        }
    }
    public static void approvemerchant()
    {
        //System.out.println("\033[H\033[23");
       // System.out.flush();
       if(i1.size()-1<0)
       {
           System.out.println("***NO REQUEST ARE PENDING*****");
       }
       else{
       System.out.println(" THE MERCHANT NAME : "+i1.get(i1.size()-1));
       System.out.println(" THE PRODUCT NAME : "+i2.get(i2.size()-1));
       System.out.println(" THE PRODUCT TYPE : "+i3.get(i3.size()-1));
       System.out.println(" THE PRODUCT ID : "+i.get(i.size()-1));
       System.out.println(" THE MERCHANT ID : "+i4.get(i4.size()-1));
       System.out.println(" THE PRODUCT COUNT : "+i5.get(i5.size()-1));
        System.out.println();
        System.out.println("PRESS 10 TO ACCEPT");
        System.out.println("PRESS 5 TO REJECT");
        int d1=sc.nextInt(); 
        s3.add(d1);
        //adding();
        if(d1==5)
        {
            System.out.println("SUCESSFULLY REJECTED THE ORDER");
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            Adminid();
        }
        else if(d1==10){
            j1.add(i1.get(i1.size()-1));
            j2.add(i2.get(i2.size()-1));
            j3.add(i3.get(i3.size()-1));
            j4.add(i4.get(i4.size()-1));
            j5.add(i5.get(i5.size()-1));
            j.add(i.get(i.size()-1));
            s2.add(0000);
            s1.add(j1.get(j1.size()-1));
            System.out.println("SUCCESSFULLY ACCEPTTED THE ORDER");
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s=sc.nextLine();
            if(s.equals(""))
            Adminid();
        }
    }
    }
        public static void merchant()
        {
           System.out.println("\t\tWELCOME TO MERCHANT LOGIN PAGE");
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
        public static void loginmerchant()
        {
           System.out.println("ENTER THE MERCHANT NAME");
           String a=sc.next();
           System.out.println("ENTER THE PASSWORD");
           int a1=sc.nextInt();
           if(s1.contains(a)&& s2.contains(a1)&&s3.contains(10))
           {
            merchantid1();
           } 
           else{
               System.out.println("ENTER THE CORRECT MERCHANT NAME (OR) PASSWORD");
               System.out.println();
               //System.out.println("\t\tSIGN UP");
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               merchant();
           }       
        }
        public static void merchantid1()
        {
            System.out.println("1.ADD DATA");
            System.out.println("2.CHANGE PASSWORD");
            System.out.println("3.VIEW STOCKS");
            //System.out.println("3.CLEAR ALL DATA");
            System.out.println("4.EXIT");
            int s1=sc.nextInt();
            if(s1==1)
            {
                merchantid();
            }
            else if(s1==2)
            {
                changepass();
            }
            else if(s1==3)
            {
                viewstocks();
            }
            else
            {
                welcome();
            }
        }
        public static void merchantid()
        {
        System.out.println("ENTER THE MERCHANT NAME");
        String h=sc.next();
        j1.add(h);
        System.out.println("ENTER THE PRODUCT NAME");
        String h1=sc.next();
        j2.add(h1);
        System.out.println("ENTER THE PRODUCT TYPE");
        String h3=sc.next();
        j3.add(h3);
        System.out.println("ENTER THE PRODUCT ID");
        int h4=sc.nextInt();
        j.add(h4);
        System.out.println("ENTER THE MERCHANT ID");
        int h5=sc.nextInt();
        j4.add(h5);
        System.out.println("ENTER THE PRODUCT COUNT");
        int h6=sc.nextInt();
        j5.add(h6);
        System.out.println("YOUR DATA IS ADDED SUCCESSFULLY");
        System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
        } 
        public static void removedata(){
        System.out.println("*CHOOSE THE DATA TO BE DELETED*");
        System.out.println("1. DELETE BY MERCHANT ID");
        System.out.println("2.CLEAR ALL");
        int u1=sc.nextInt();
        if(u1==1){
        System.out.println("ENTER THE MERCHANT ID");
        int d=sc.nextInt();
        if(d<=j1.size()-1){
           System.out.println("MERCHANT NAME : "+j1.remove(d));
           System.out.println("PRODUCT NAME : "+j2.remove(d));
           System.out.println("PRODUCT NAME : "+j3.remove(d));
           System.out.println("PRODUCT ID : "+j4.remove(d));
           System.out.println("MERCHANT ID: "+j.remove(d));
           System.out.println("PRODUCT COUNT : "+j5.remove(d));
           
        System.out.println();
        System.out.println("YOUR DATA IS REMOVED ");
        System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
              Adminid();
        }
        }
        else if(u1==2)
        {
            clearall();
        }
    

    
        else
        {
            System.out.println("INVALID MERCHANT ID");
            System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
           
        }
    
    }
        
        public static void  clearall()
        {
            System.out.println("DO YOU WANT TO ERASE ALL DATA");
            System.out.println("1.YES");
            System.out.println("2.NO");
            int g=sc.nextInt();
            if(g==1)
            {
                j1.clear();
                j2.clear();
                j3.clear();
                j.clear();
                j4.clear();
                j5.clear();
                System.out.println("DATA IS CLEARED SUCCESSFULLY");
                System.out.println();
               System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
            } 
            else
            {
                welcome();
            }
        }
        public static void signup()
        {
            System.out.println("\t\t ENTER THE DETAILS TO REGISTER");
            System.out.println("ENTER THE MERCHANT NAME");
        String h=sc.next();
        i1.add(h);
        System.out.println("ENTER THE PRODUCT NAME");
        String h1=sc.next();
        i2.add(h1);
        System.out.println("ENTER THE PRODUCT TYPE");
        String h3=sc.next();
        i3.add(h3);
        System.out.println("ENTER THE PRODUCT ID");
        int h4=sc.nextInt();
        i.add(h4);
        System.out.println("ENTER THE MERCHANT ID");
        int h5=sc.nextInt();
        i4.add(h5);
        System.out.println("ENTER THE PRODUCT COUNT");
        int h6=sc.nextInt();
        i5.add(h6);
            System.out.println("*REQUEST PENDING*");
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();

        }
        public static void addnewmerchant()
        {
            System.out.println("1.MERCHANT NAME");
            String s=sc.next();
            j1.add(s);
            System.out.println("2.PRODUCT NAME");
            String s1=sc.next();
            j2.add(s1);
            System.out.println("3.PRODUCT TYPE");
            String s2=sc.next();
            j3.add(s2);
            System.out.println("4.PRODUCT ID");
            int s3=sc.nextInt();
            j.add(s3);
            System.out.println("5.MERCHANT ID");
            int s4=sc.nextInt();
            j4.add(s4);
            System.out.println("6.PRODUCT COUNT");
            int s5=sc.nextInt();
            j5.add(s5);
            System.out.println("DATA ADDED SUCCESSFULLY");
            System.out.println("-------ENTER TO CONTINUE------");
            sc.nextLine();
            String s10=sc.nextLine();
            if(s10.equals(""))
            Adminid();

        }
        public static void viewmerchant()
        {
            System.out.println("1.VIEW ALL");
            System.out.println("2.VIEW PARTICULAR");
            int u=sc.nextInt();
            if(u==1)
            {
                for (int p=0;p<j1.size();p++)
                {
                    System.out.println("---------------------------------------------");
                    System.out.println("MERCHANT NAME : "+j1.get(p));
                    System.out.println("PRODUCT NAME : "+j2.get(p));
                    System.out.println("PRODUCT TYPE : "+j3.get(p));
                    System.out.println("PRODUCT ID : "+j4.get(p));
                    System.out.println("MERCHANT ID : "+j.get(p));
                    System.out.println("PRODUCT COUNT : "+j5.get(p));
                }
                
            }
            else if(u==2)
            {
                System.out.println("ENTER THE MERCHANT ID TO BE VIEWED");
                int g=sc.nextInt();
                if(g<=j1.size()-1){
                System.out.println("MERCHANT NAME : "+j1.get(g));
                System.out.println("PRODUCT NAME : "+j2.get(g));
                System.out.println("PRODUCT TYPE : "+j3.get(g));
                System.out.println("PRODUCT ID : "+j4.get(g));
                System.out.println("MERCHANT ID : "+j.get(g));
                System.out.println("PRODUCT COUNT : "+j5.get(g));}
                else{
                System.out.println("ENTER THE VALID MERCHANT ID");}
            }
            System.out.println();
                System.out.println("-------ENTER TO CONTINUE------");
                   sc.nextLine();
                   String s=sc.nextLine();
                   if(s.equals(""))
                   Adminid();
        }
        public static void changepass()
        {
            System.out.println("ENTER THE OLD PASSWORD");
            int h=sc.nextInt();
            if(s2.contains(h))
            System.out.println("ENTER THE NEW PASSWORD");
            int y=sc.nextInt();
            s2.add(y);
            System.out.println();
            System.out.println("YOUR PASSWORD IS CHANGED");
            System.out.println();
                System.out.println("-------ENTER TO CONTINUE------");
                   sc.nextLine();
                   String s=sc.nextLine();
                   if(s.equals(""))
                   merchantid();

        } 
        public static void viewstocks()
        {
            System.out.println("\t\tWELCOME MERCHANT");
            System.out.println();
            System.out.println("1.VIEW TOTAL NO OF COUNTS");
            System.out.println("2. VIEW TOTAL NO OF STOCKS SOLD");
            int o=sc.nextInt();
            if(o==1)
            {
               
                System.out.println("ENTER YOUR MERCHANT ID");
                int u2=sc.nextInt();
                if(u2<=j5.size()-1){
                System.out.println("YOUR STOCKS COUNT IS");
                System.out.println(j5.get(u2));}
                else{
                System.out.println("ENTER THE VALID MERCHANT ID");}
            }
            else if(o==2){
                System.out.println("ENTER YOUR MERCHANT ID");
                int u2=sc.nextInt();
                if(u2<=j4.size()-1){
                System.out.println("YOUR SOLD STOCKS ARE:");
                System.out.println(j4.get(u2));}
                else{
                    System.out.println("ENTER THE VALID ,ERCHANT ID");}
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               merchantid1();
        }
        public static void user()
        {
            System.out.println("\t\t**WELCOME TO USER PAGE**");
            System.out.println("1.LOGIN");
            System.out.println("2.SIGN UP");
            System.out.println("3.EXIT");
            int p=sc.nextInt();
            if(p==1)
            {
                userlogin();
            }
            else if(p==2)
            {
                usersignup();
            }
            else
            {
                welcome();
            }
        }
        public static void userlogin()
        {
             System.out.println("\t\tWELCOME TO USER LOGIN");
             System.out.println("ENTER THE USERNAME");
             String h=sc.next();
             System.out.println("ENTER THE PASSWORD");
             String jj=sc.next();
             if(o.contains(h)&&o1.contains(jj))
             {
                 amazon();
             }
             else if((o.contains(h)&&!o1.contains(jj))||(!o.contains(h)&&o1.contains(jj)))
             {
                 System.out.println("USERNAME OR PASSWORD IS INCORRECT");
             }
             else
             {
                 System.out.println("YOUR ACCOUNT DOESN'T EXIT");
                 System.out.println("PLEASE SIGNUP");
             }
             System.out.println();
             System.out.println("-------ENTER TO CONTINUE------");
                sc.nextLine();
                String s=sc.nextLine();
                if(s.equals(""))
                welcome();
        }
        public static void usersignup()
        {
            System.out.println("ENTER THE USERNAME");
            String h=sc.next();
            System.out.println("ENTER THE YOUR PASSWORD");
            String jj=sc.next();
            System.out.println("RE-ENTER YOUR PASSWORD TO CONFIRM");
            String uu=sc.next();
            if(jj.equals(uu))
            {
              o.add(h);
              o1.add(jj);
              System.out.println("YOU HAVE SUCCESSFULLY REGISTERED");
            }
            else{
                System.out.println("PASSWORD DOESN'T MATCH");
            }
            System.out.println();
            System.out.println("-------ENTER TO CONTINUE------");
               sc.nextLine();
               String s=sc.nextLine();
               if(s.equals(""))
               welcome();
        }
        public static void amazon()
        {
            System.out.println("\t\t------WELCOME TO AMAZON------");
            System.out.println("\t\tINDIA'S LARGEST ONLINE SHOPPING ZONE");
            System.out.println();
            System.out.println("AVAILABLE ITEMS ARE LISTED BELOW ||");
            System.out.println("                                 VV");
            for(int p=0;p<j1.size();p++)
            {
               System.out.println("~~~~~~~~~~~~~~~~~");
               System.out.println(p);
               System.out.println("---");
               System.out.println();
                System.out.println("MERCHANT NAME : "+j1.get(p));
                System.out.println("PRODUCT NAME : "+j2.get(p));
                System.out.println("PRODUCT TYPE : "+j3.get(p));
                System.out.println("PRODUCT PRICE : "+j4.get(p));
                System.out.println("MERCHANT ID : "+j.get(p));
                System.out.println("PRODUCT COUNT : "+j5.get(p));  
            }
            System.out.println("1.PLACE YOUR ORDER");
            System.out.println("2.CARD");
            System.out.println("3.EXIT");
            int po=sc.nextInt();
            if(po==2)
            {
                card();
            }
            else{
                welcome();
            }
        }
        public static void card()
        {
            System.out.println("1.ADD TO CARD");
            System.out.println("2. REMOVE FROM CARD");
            System.out.println("3. VIEW CARD");
            int j=sc.nextInt();
            if(j==1)
            {
            System.out.println("ENTER THE ID TO ADD");
            int p=sc.nextInt();
            System.out.println("PRODUCT NAME : "+l.add(j2.get(p)));
            System.out.println("PRODUCT TYPE : "+ l.add(j3.get(p)));
            System.out.println("PRODUCT PRICE : "+ l.add(String.valueOf(j4.get(p))));
            System.out.println();
            System.out.println("SUCCESSFULLY ADDED TO CARD");
                }
                else if(j==2)
                {
                    System.out.println("ENTER THE ID TO REMOVE");
                    int p=sc.nextInt();
                System.out.println("PRODUCT NAME : "+l.remove(j2.get(p)));
                System.out.println("PRODUCT TYPE : "+ l.remove(j3.get(p)));
                System.out.println("PRODUCT PRICE : "+ l.remove(String.valueOf(j4.get(p))));
                System.out.println();
               System.out.println("SUCCESSFULLY REMOVED FROM CARD");
                }
                else if(j==3)
                {
                    for(int p=0;p<l.size()-1;p++){
                    System.out.println("**YOUR CARD**");
                    System.out.println(l.get(p));
                    System.out.println();
                    }
                }
                else
                {
                    welcome();
                }
                System.out.println();
                System.out.println("-------ENTER TO CONTINUE------");
                   sc.nextLine();
                   String s=sc.nextLine();
                   if(s.equals(""))
                   welcome();
            }
        }