package Allvariables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class product{
	String username;
	//int password1=12345;
	String item;
	double price;
	String location;
	long id;
	
	//String name1="noorbasha";
	public product() {
		
		
	}
	public void  login() {
		System.out.println("enter the logindetails:");
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the username:");
		
		String name=s.next();
		System.out.println("enter password");
		
	 Integer password=s.nextInt();
		if(name.equals("noor")) {
			if(password.equals(12345)){
			System.out.println("login successfully");
			}
			
		
		}else {
			System.out.println("login failed try again");
			
		}
		
			
		}
	
	public product(double price, String item, String location, long id) {
		
		this.item = item;
		this.price = price;
		this.location = location;
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "product [item=" + item + ", price=" + price + ", location=" + location + ", id=" + id + "]";
	}

		
	}

public class onlinegroceryapp{
	public static void main(String[]args) {
		product obj3=new product();
		obj3.login();
		ArrayList<product>obj=new ArrayList<product>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Dmart online grocery app:");
			System.out.println("1 add the products");
			System.out.println("2 view the product name");
			System.out.println("3 search the products");
			System.out.println("4 delete your products");
			System.out.println("5 update your products");
			System.out.println("6 exit");
			System.out.println("7 logout");
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter item");
				String item=sc.next();
				System.out.println("enter price");
				double price=sc.nextDouble();
				System.out.println("enter location");
				String location=sc.next();
				System.out.println("enter id");
				long id=sc.nextLong();
				obj.add(new product( price,item,location, id));
				break;
			
			case 2:
				Iterator<product>obj1=obj.iterator();
				while(obj1.hasNext()) {
				product  obj2=obj1.next();
					System.out.println(obj2);
				}
			case 3:
				boolean found = false;
		        System.out.print("Enter product id to Search : ");
		        long p = sc.nextLong();
		        Iterator k = obj.iterator();
		        while (k.hasNext()) {
		            product e = (product) k.next();
		            if (e.getId()== p) {
		                System.out.println(e);
		                found = true;
		            }
		        }
		        if (found==false) {
		            System.out.println("Record Not Found");
		        }
		        else {
		        	System.out.println("Record found" );
		        }
		        break;
			case 4:
				boolean found1=false;
				System.out.println("enter deleted id1");
				long sr=sc.nextLong();
				Iterator u=obj.iterator();
				while(u.hasNext()) {
					product t=(product) u.next();
					if( t.getId()==sr) {
						u.remove();
						found1=true;
					}
				}
					if (found1!=false) {
			            System.out.println("Record is deleted");
			        }
			        else {
			        	System.out.println("Record  not found" );
				}
			break;
			case 5:
				boolean found2=false;
				System.out.println("enter updated id");
				long sy=sc.nextLong();
				Iterator s=obj.iterator();
				while(s.hasNext()) {
					product t=(product) s.next();
					if( t.getId()==sy) {
						System.out.println("enter update id value");
						long updateId=sc.nextLong();
						System.out.println("enter update item value");
						String updateItem=sc.next();
								System.out.println("enter update location value");
						String updateLocation=sc.next();
								System.out.println("enter update price value");
						double updateprice=sc.nextDouble();
						
						t.setId(updateId);
						t.setItem(updateItem);
						t.setLocation(updateLocation);
						t.setPrice(updateprice);
						found2=true;
					}
				}
					if (found2!=false) {
			            System.out.println("Record is updated");
			        }
			        else {
			        	System.out.println("Record  not updated" );
				}
				
			break;
		
			case 6:
				System.out.println("Thank you for visiting dmart online grocery app");
				break;
			case 7:
				System.out.println(" your logout successfully");
				break;
			}
				
			
		
	}while(choice>0&&choice<=7);
	}
	
}	
		
		
	
		
		
		

			
		
			
	
		
	
			
	
		
	


