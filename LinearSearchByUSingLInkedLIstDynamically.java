import java.util.Scanner;

class Node1
{
	int data;
	Node1 next;
	Node1(int data , Node1 next)
	{
		this.data= data;
		this.next= next;
		
		
	}
}

public class LinearSearchByUSingLInkedLIstDynamically
{
	static Scanner sc = new Scanner(System.in);
			
			static int target= sc.nextInt();


  public static void main(String... args)
  {
	  // declare the number of elements
	  int n = sc.nextInt();
	  
	  // when list contain no elements
	  if(n<=0)
	  {
		  System.out.println("LIst is Empty");
		  return;
	  }
	  
	  // declare the first node
	  
	  Node1 first= new Node1(sc.nextInt(),null);
	  Node1 head= first;
	  
	  // if list size has more than one elements
	  
	  if(n>1)
	  
		  
		  //initiate the loop for more elements in the loop
		  for(int i=0;i<n;i++)
		  {
			  Node1 rest = new Node1(sc.nextInt(),null);
			  first.next= rest;
			  first=  first.next;
			  	  
		  }
		  
		  int index= findElement(head);
		  if(index==-1)
			  System.out.println("Elemnet not found");
		  else
		  
			  System.out.println("Element found at Index : " +index);
		  
				  
	  }
	  static int findElement(Node1 head)
	  {
		  int count =1;
		  
		  while(head!=null)
		  {
			  if(head.data == target)
			  
				  return count;
			  
			  else
			  {
				  ++count;
				  head=head.next;
				  if(head==null)
					  return -1;
			  }
				  
		  }
		  return count;
	 
  }}

//Liner Searching Via Link List
//Time Complexity = O(n)
//Space Complexity = O(1)
