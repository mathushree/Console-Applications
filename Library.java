import java.util.*;
public class Library {
 static Scanner sc= new Scanner(System.in);
 static int  cuser=-1;
 //.........................................................//
  public static ArrayList<Book>book=new ArrayList<>();
  static ArrayList<Borrow> borrow = new ArrayList<>();
  static ArrayList<User> user = new ArrayList<>();
  static ArrayList<Cart> cart = new ArrayList<>();
  //.......................................................//
 public static void welcome() {
     flush();
	 System.out.println("************WELCOME TO LIBRARY MANAGEMENT SYSTEM*************");
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
	public static void usersignup() {
	     flush();
		System.out.println("WELCOME YOUR USER TO SIGNUP DETAILS");
        System.out.print("Enter Your Name : ");
        String uname = sc.nextLine();
        int c = 0;
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).name.equals(uname)) {
                System.out.println("Username Already Exists try another user name!");
                c++;
                
                String k = sc.nextLine();
                if (k.equals(""))
                    user();
            }
        }
        if (c == 0) {
            System.out.print("Enter Password : ");
            String upass = sc.nextLine();
            System.out.print("Re-Enter Password : ");
            String pass2 = sc.nextLine();
            if (upass.equals(pass2)) {
                String uid = "UID" + user.size();
                System.out.println("Your User Id is : " + uid);
                User temp=new User(uname,upass,uid);
                user.add(temp);
                System.out.println("Account Created Successfully !");
                System.out.println("press enter to continue");
                String k = sc.nextLine();
                if (k.equals(""))
                    user();
            } else {
                System.out.println("Re-Enter Password Correctly!");
            }
                System.out.println("press enter to continue");
                String k = sc.nextLine();
                if (k.equals(""))
                    user();
            }
        }

		
	
	public static void userlogin() {
	     flush();
		cuser = -1;
        
        System.out.println("........ Login to Continue!!!...........");

        System.out.print("Enter Your Name : ");
        String uname = sc.nextLine();
        System.out.print("Enter Password : ");
        String pass = sc.nextLine();
        int c = 0;
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i).name.equals(uname) && user.get(i).password.equals(pass)) {
                c++;
                cuser = i;
                userwork();
            }
        }
        if (c == 0) {
            System.out.println("User Not Found!\nSignup To Login!");
            
            String k = sc.nextLine();
            if (k.equals(""))
                userwork();

        }
		
	}
	public  static void userwork() {
	     flush();
		System.out.println("1. View Available Books");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        System.out.println("4. Borrow History");
        System.out.println("5. Books in Cart");
        System.out.println("6. Exit");
        int a = sc.nextInt();
        sc.nextLine();
        switch (a) {
        case 1:
        	viewavailablebook();
        	break;
        case 2:
        	bbook();
        	break;
        case 3:
        	returnbook();
        	break;
        case 4:
        	bhis();
        	break;
        case 5:
        	bcart();
        	break;
        	default:
        		user();
        }
        System.out.println("Press enter to continueee");
        String k=sc.nextLine();
        if(k.equals("")){
            welcome();
        }
	}
	public static void bcart() {
	     flush();
		System.out.println(" .............Welcome To Cart...........");
        System.out.println("1. Add  To Cart");
        System.out.println("2. Remove  From Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Exit");
        int a = sc.nextInt();
        sc.nextLine();
        switch (a) {
        case 1:
        	addcart();
        	break;
        case 2:
        	removecart();
        	break;
        case 3:
        	viewcart();
        	break;
        case 4:
        	exit();
        	default:
        		user();
        }
        System.out.println("Press enter to continueee");
        String k=sc.nextLine();
        if(k.equals("")){
            welcome();
        }
	}
	public static void viewcart() {
	     flush();
		  System.out.println("............Books in  Your Cart  are.......\n");
	        int c = 0;
	        for (int i = 0; i < cart.size(); i++) {
	            if (cart.get(i).uid.equals(user.get(cuser).userid)) {
	                c++;
	                System.out.println("Book Name : " + cart.get(i).bname);
	                System.out.println("Book Id : " + cart.get(i).bookid);
	                System.out.println("Book Type : " + cart.get(i).btype);
	                System.out.println("Book Authour : " + cart.get(i).bauthour);
	                System.out.println("-----------********-------------------");
	            }
	        }
	        if (c == 0) {
	            System.out.println(" Empty!!!");
	            System.out.println("Press enter to continueee");
	            String k = sc.nextLine();
	            if (k.equals(""))
	                bcart();
	        } else {
	        	System.out.println("Press enter to continueee");
	            String k = sc.nextLine();
	            if (k.equals(""))
	                bcart();
	        }
		
	}
	public static void removecart() {
		 flush();

        System.out.print("Enter Book Id To Be Removed From Cart : ");
        String booid = sc.nextLine();
        int in = 0;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).bookid.equals(booid) && cart.get(i).uid.equals(user.get(cuser).userid)) {
                in++;
                cart.remove(i);
                System.out.println("Book Removed From Cart Successfully!");
                System.out.println("Press enter to continueee");
                String j = sc.nextLine();
                if (j.equals(""))
                    bcart();
            }
        }
        if (in == 0) {
            System.out.println("Book Id Not Found!");
            System.out.println("Press enter to continueee");
            String j = sc.nextLine();
            if (j.equals(""))
                bcart();
        }
	}
	public static void addcart() {

		  flush();
	        System.out.print("Enter Book Id To Be Added to Cart : ");
	        String booid = sc.nextLine();
	        int in = 0;
	        for (int i = 0; i < book.size(); i++) {
	            if (book.get(i).id.equals(booid)) {
	                in++;
	                cart.add(new Cart(user.get(cuser).userid, booid, book.get(i).name,
	                        book.get(i).type, book.get(i).author));
	                System.out.println("Book Added To Cart Successfully!");
	                System.out.println("Press enter to continueee");
	                String j = sc.nextLine();
	                if (j.equals(""))
	                    bcart();
	            }
	        }
	        if (in == 0) {
	            System.out.println("Book Id Not Found!");
	            System.out.println("Press enter to continueee");
	            String j = sc.nextLine();
	            if (j.equals(""))
	               bcart();
	        }
		
	}
	public static void bhis() {
	     flush();
		 System.out.println("--------  Your Borrow History ----------");
	        int c = 0;
	        for (int i = 0; i < borrow.size(); i++) {
	            if (borrow.get(i).uid.equals(user.get(cuser).userid)
	                    && borrow.get(i).breturn.equals("No")) {
	                c++;
	                System.out.println("Book Name : " + borrow.get(i).bname);
	                System.out.println("Book Id : " + borrow.get(i).bid);
	                System.out.println("Book Type : " + borrow.get(i).btype);
	                System.out.println("Book Authour : " + borrow.get(i).author);
	                System.out.println("Book Count : " + borrow.get(i).bcount);
	                System.out.println("Borrow Status : " + borrow.get(i).breturn);
	                System.out.println("-----------------------------------------");
	            }
	        }
	        if (c == 0) {
	            System.out.println("No Current Borrow History!");
	            System.out.println("Press enter to continueee");
	            String j = sc.nextLine();
	            if (j.equals(""))
	                userwork();
	        } else {
	        	System.out.println("Press enter to continueee");
	            String j = sc.nextLine();
	            if (j.equals(""))
	                userwork();
	        }
	        System.out.println("---------------*********-------------------");
	        System.out.println("---------------*******---------------------");
	        System.out.println("\t\t-------- Return History ----------");
	        int count = 0;
	        for (int i = 0; i < borrow.size(); i++) {
	            if (borrow.get(i).uid.equals(user.get(cuser).userid)
	                    && borrow.get(i).breturn.equals("Yes")) {
	                count++;
	                System.out.println("Book Name : " + borrow.get(i).bname);
	                System.out.println("Book Id : " + borrow.get(i).bid);
	                System.out.println("Book Type : " + borrow.get(i).btype);
	                System.out.println("Book Authour : " + borrow.get(i).author);
	                System.out.println("Book Count : " + borrow.get(i).bcount);
	                System.out.println("Borrow Status : " + borrow.get(i).breturn);
	                System.out.println("-----------------------------------------");
	            }
	        }
	        if (count == 0) {
	            System.out.println("No Current Return History!");
	            System.out.println("Press enter to continueee");
	            String j = sc.nextLine();
	            if (j.equals(""))
	                userwork();
	        } else {
	        	System.out.println("Press enter to continueee");
	            String j = sc.nextLine();
	            if (j.equals(""))
	                userwork();
	        }
	        
	}
	public static void returnbook() {

	     flush();
		System.out.println("------ Return  Your Book -------");

        System.out.print("Enter Book Id to Be Returned : ");
        String booid = sc.nextLine();
        int c = 0;
        for (int i = 0; i < borrow.size(); i++) {
            if (borrow.get(i).bid.equals(booid) && borrow.get(i).uid.equals(user.get(cuser).userid)) {
                c++;
                System.out.println("Enter Number Of Books to be Returned : ");
                int num = sc.nextInt();
                sc.nextLine();
                book.get(i).count += num;
                borrow.get(i).breturn = "Yes";
                System.out.println("Book Returned Successfully!");
                System.out.println("Press enter to continueee");
                String k = sc.nextLine();
                if (k.equals(""))
                    userwork();

            }
        }
        if (c == 0)

        {
            System.out.println("Enter Correct Book Id");
            System.out.println("Press enter to continueee");
            String m = sc.nextLine();
            if (m.equals(""))
                userwork();
        }
		
	}
	public static void bbook() {
	     flush();
		System.out.println("------ Borrow Book -------");
        System.out.print("Enter Book Id to Be Borrowed : ");
        String booid = sc.nextLine();
        int c = 0;
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).id.equals(booid)) {
                c++;
                System.out.println("Enter Number Of Books Needed : ");
                int num = sc.nextInt();
                sc.nextLine();
                if (book.get(i).count <= num) {
                    book.get(i).count -= num;
                    borrow.add(new Borrow(user.get(cuser).userid, book.get(i).name,
                            book.get(i).id, book.get(i).type, book.get(i).count,
                            book.get(i).author, "No"));
                    System.out.println("Book Borrowed Successfully!");
                    System.out.println("press enter to continue");
                    String k = sc.nextLine();
                    if (k.equals(""))
                        userwork();

                } else {
                    System.out.println("Stock Available In Library is less than the Number Of Books You Needed");
                    System.out.println("press enter to continue");
                    String k = sc.nextLine();
                    if (k.equals(""))
                        userwork();
                }

            }
        }
        if (c == 0) {
            System.out.println("Enter Correct Book Id");
            System.out.println("press enter to continue");
            String m = sc.nextLine();
            if (m.equals(""))
                userwork();
        }
		
	}
	public static void viewavailablebook() {
	     flush();
		if (book.size() <= 0) {
            System.out.println("!!!!!! There is  No Books Available In the Library ------");
            System.out.println("press enter to continue");
            String k = sc.nextLine();
            if (k.equals(""))
                user();
        } else {
            System.out.println("---------- List Of All Books Available ---------");
            for (int i = 0; i < book.size(); i++) {
                System.out.println("Book Name : " + book.get(i).name);
                System.out.println("Book Id : " + book.get(i).id);
                System.out.println("Book Type : " + book.get(i).type);
                System.out.println("Book Authour : " + book.get(i).author);
                System.out.println("Book Count : " + book.get(i).count);
                System.out.println("--------***----------****--------------***---------");
                System.out.println("press enter to continue");
                String k = sc.nextLine();
                if (k.equals(""))
                    viewbook();
            }
        }
		
	}
	public static void exit() {
		System.out.println("......**THANK YOU FOR VISITING OUR LIBRARY!!! COME AGAIN!!!...... ");
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
			System.out.println("1.ADD BOOKS");
			System.out.println("2.REMOVE BOOKS");
			System.out.println("3.VIEW BOOKS");
			System.out.println("4.BORROW BOOKS");
			System.out.println("5.MODIFY BOOKS");
			System.out.println("5.EXIT");
			
			int a = sc.nextInt();
			sc.nextLine();
			switch (a) {
				case 1:
					addbook();
					break;
				case 2:
					removebook();
					break;
				case 3:
					viewbook();
					break;
				case 4:
					borrowbook();
					break;
				case 5:
				modifybook();
				
				default:
					System.out.println("Enter Valid Number!");
					welcome();
					break;
			}
		}
		else {
			System.out.println("INVALID NAME || PASSWORD");
		}
		welcome();
	}
 public static void viewbook() {
      flush();
	System.out.println("****View book*****");
	System.out.println("1. View Book Details By Id");
    System.out.println("2. View All");
    System.out.println("3. Exit");
    int a = sc.nextInt();
    sc.nextLine();
    switch(a){
    	case 1:
    		viewbookid();
    		break;
    	case 2:
    		viewall();
    		break;
    	case 3:
    		exit();
    		break;
    	default:
    	admin();
    }
	}
public static void viewall() {
     flush();
	if (book.size() <= 0) {
        
        System.out.println("...........There is No Books Available In the Library......");
        System.out.println("press enter to continuee");
        String k = sc.nextLine();
        if (k.equals(""))
            admin();
    } else {
        
        System.out.println("******** List Of All Books Available ********");
        for (int i = 0; i < book.size(); i++) {
            System.out.println("Book Name : " + book.get(i).name);
            System.out.println("Book Id : " + book.get(i).id);
            System.out.println("Book Type : " + book.get(i).type);
            System.out.println("Book Authour : " + book.get(i).author);
            System.out.println("Book Count : " + book.get(i).count);
            System.out.println("--------------x------------x---------------");
        }
        System.out.println("press enter to continuee");
        String k = sc.nextLine();
        if (k.equals(""))
            viewbook();
    }
	
}
public static void viewbookid() {
     flush();
	System.out.println("........... View By Book Id ..........");
    System.out.print("Enter Book Id to View Details : ");
    String id = sc.nextLine();
    int count = 0;
    for (int i = 0; i < book.size(); i++) {
        if (book.get(i).id.equals(id)) {
            System.out.println("Book Name : " + book.get(i).name);
            System.out.println("Book Id : " + book.get(i).id);
            System.out.println("Book Type : " + book.get(i).type);
            System.out.println("Book Author : " + book.get(i).author);
            System.out.println("Book Count : " + book.get(i).count);
            System.out.println("--------------x------------x---------------");
            count++;
            System.out.println("press enter to continue");
            String k = sc.nextLine();
            if (k.equals(""))
                viewbook();
        }
    }
        if (count == 0) {
            
            System.out.println("Book Not Found!");
        
    }
        System.out.println("press enter to continue");
            String k = sc.nextLine();
            if (k.equals(""))
                viewbook();
    }


public static void addbook() {
     flush();
	 System.out.println(".....WELCOME TO ADD BOOK......");
	 System.out.println("Enter book name:");
	 String name=sc.nextLine();
	 System.out.println("Enter book type:");
	 String type=sc.nextLine();
	 System.out.println("Enter author name:");
		String author=sc.nextLine();
		System.out.println("Enter book count:");
		int count=sc.nextInt();
		sc.nextLine();
		System.out.println("Book id is :"+"IDB"+book.size());
		 book.add(new Book(name, type, author, count,"IDB" + book.size()));
		System.out.println("************Your Book added sucessfully************");
		System.out.println("press enter to continue");
		String k=sc.nextLine();
		if(k.equals(""))
			admin();
	}
public static void removebook() {
     flush();
	 System.out.println("....WELCOME TO REMOVE BOOK....");
	 System.out.println("Enter book id to be removed:");
	 String bid=sc.nextLine();
	 int count=0;     //939462
	 for(int i=0;i<book.size();i++) {
		 if(book.get(i).id.equals(bid)) {
			 book.remove(i);
			 count++;
			 System.out.println("your book is removed successfully");
		 }   //
	 }
	 if(count==0) {
		 System.out.println("sorry!!!Invalid book id");
	 }
	 System.out.println("press enter to continue");
		String k=sc.nextLine();
		if(k.equals(""))
	 admin();
	}

public static void borrowbook() {
     flush();

	System.out.println(" --------Your Borrow Details -------");
    System.out.println("1. Current Borrowers Details");
    System.out.println("2. Returned Borrowers");
    System.out.println("3. Exit");
    int a = sc.nextInt();
    sc.nextLine();
    switch (a) {
    case 1:
    	cborrow();
    	break;
    case 2:
    	rborrow();
    	break;
    case 3:
    	exit();
    	break;
    	default:
    	admin();
    	break;
    }
    System.out.println("press enter to continue");
    String k = sc.nextLine();
    if (k.equals(""))
        borrowbook();
		
	}
public static void rborrow() {
	 flush();
	 System.out.println("------- Returned Book Borrowers ---------\n");
     int c = 0;
     for (int i = 0; i < borrow.size(); i++) {
         if (borrow.get(i).breturn.equals("No")) {
             c++;
             System.out.println("Borrower Id : " + borrow.get(i).uid);
             System.out.println("Borrowed Book Name : " + borrow.get(i).bname);
             System.out.println("Book Id : " + borrow.get(i).bid);
             System.out.println("Book Type : " + borrow.get(i).btype);
             System.out.println("Book Authour : " + borrow.get(i).author);
             System.out.println("Book Count : " + borrow.get(i).bcount);
             System.out.println("Return Status : " + borrow.get(i).breturn);
             System.out.println("-----------------------------------------");
         }

     }
     if (c == 0) {
         System.out.println(" There is no Returned Book Borrowers!");
         
         String k = sc.nextLine();
         if (k.equals(""))
             borrowbook();
     } else {
         
         String k = sc.nextLine();
         if (k.equals(""))
             borrowbook();
     }
	
}
public static void cborrow() {
	 flush();
	 System.out.println(" ..........Your Current Borrowers.........\n");
     int c = 0;
     for (int i = 0; i < borrow.size(); i++) {
         if (borrow.get(i).breturn.equals("Yes")) {
             c++;
             System.out.println("Borrower Id : " + borrow.get(i).uid);
             System.out.println("Borrowed Book Name : " + borrow.get(i).bname);
             System.out.println("Book Id : " + borrow.get(i).bid);
             System.out.println("Book Type : " + borrow.get(i).btype);
             System.out.println("Book Authour : " + borrow.get(i).author);
             System.out.println("Book Count : " + borrow.get(i).bcount);
             System.out.println("Return Status : " + borrow.get(i).breturn);
             System.out.println("-----------------------------------------");
         }

     }
     if (c == 0) {
         System.out.println(" There is no Current Borrowers!!1");
         System.out.println("press enter to continue");
         String k = sc.nextLine();
         if (k.equals(""))
             borrowbook();
     } else {
    	 System.out.println("press enter to continue");
         String k = sc.nextLine();
         if (k.equals(""))
             borrowbook();
     }
	
}
public static void modifybook() {
     flush();
	System.out.println("******* Modify Book Details *************");
    System.out.print("Enter Book Id to be Modified : ");
    String id = sc.nextLine();
    int count = 0;
    for (int i = 0; i < book.size(); i++) {
        if (book.get(i).id.equals(id)) {
            count++;
            modify(i);
        }

    }
    if (count == 0) {
        
        System.out.println("Book Not Found!");
        System.out.println("press enter to continue");
        String k = sc.nextLine();
        if (k.equals(""))
            admin();
    }
}
public static void modify(int i) {
     flush();
    System.out.println("------- Please!! Modify Book Details ----------");
    System.out.println("1. Modify Book Name");
    System.out.println("2. Modify Book Type");
    System.out.println("3. Modify Author Name");
    System.out.println("4. Modify Book Count");
    System.out.println("5.Exit");
    int a = sc.nextInt();
    sc.nextLine();
    switch(a) {
    case 1:
    	modifyname(i);
    	break;
    case 2:
    	modifytype(i);
    	break;
    case 3:
    	modifyauthor(i);
    	break;
    case 4:
    	modifycount(i);
    	break;
    case 5:
    	exit();
    	break;
    	default:
    		admin();
    	
    }
    String k = sc.nextLine();
    if (k.equals(""))
        modify(i);

    }
 public static void modifyname(int i) {
	 flush();
	 System.out.println("Current Book Name : " + book.get(i).name);
     System.out.print("Enter New Book Name : ");
     String bname = sc.nextLine();
     book.get(i).name = bname;
     System.out.println("Book Name Updated Successfully!");
     
     String k = sc.nextLine();
     if (k.equals(""))
         modify(i);

	
}
public static void modifytype(int i) {
     flush();
	System.out.println("Current Book Type : " + book.get(i).type);
    System.out.print("Enter New Book Type : ");
    String btype = sc.nextLine();
    book.get(i).type = btype;
    System.out.println("Book Type Updated Successfully!");
    
    String k = sc.nextLine();
    if (k.equals(""))
        modify(i);
}
public static void modifyauthor(int i) {
     flush();
	System.out.println("Current Author Name : " +book.get(i).author);
    System.out.print("Enter New Author Name : ");
    String bauthor = sc.nextLine();
  book.get(i).author = bauthor;
    System.out.println("Author Name Updated Successfully!");
    
    String k = sc.nextLine();
    if (k.equals(""))
        modify(i);
	
}
public static void modifycount(int i) {
     flush();
	 System.out.println("Current Book Count : " + book.get(i).count);
     System.out.print("Enter New Book Count : ");
     int bcount = sc.nextInt();
     book.get(i).count = bcount;
     System.out.println("Book Count Updated Successfully!");
     
     String k = sc.nextLine();
     if (k.equals(""))
         modify(i);
	
}
public static void flush() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

public static void main (String args[]) {
	 welcome();
 }
}
 class Book {
	String name,type, author,id;
	int count;
public Book(String name,String type,String author,int count,String id)
		 {
	this.name=name;
	this.type=type;
	
	this.author=author;
	this.id=id;
	this.count=count;
	//this.book=book;
	
	
	
}
}
 class Borrow {
	String bname, author, bid, breturn, uid, btype;
    int bcount;

    Borrow(String uid, String bname, String bid, String btype, int bcount, String author, String breturn) {
        this.bname = bname;
        this.author = author;
        this.bid = bid;
        this.btype = btype;
        this.breturn = breturn;
        this.uid = uid;
        this.bcount = bcount;

    }
}
 class Cart {
	String uid, bookid, bname, btype, bauthour;

    Cart(String uid, String bookid, String bname, String btype, String bauthour) {
        this.uid = uid;
        this.bname = bname;
        this.bookid = bookid;
        this.btype = btype;
        this.bauthour = bauthour;
}
}
 class User {
	String name, password, userid;

    User(String name, String password, String userid) {
        this.name = name;
        this.password = password;
        this.userid = userid;

}
}