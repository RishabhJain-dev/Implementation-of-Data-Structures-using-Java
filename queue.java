import java.util.Scanner;
class queue 
{
 static int a[] = new int[10];
 static int rear=0, front=0;
 static void insert(int d)
     {
      if(rear==9)
        {
         System.out.printn("Queue is full");
        }
      else
        {
         a[rear] = d;
         rear=rear+1;
        }
     }
 static void delete()
     {
      if(rear==front)
         {
          System.out.println("Queue is Empty");
         }
      else 
         {
          System.out.println("Deleted Element is "+a[front]);
          front=front+1;
         }
     }
 static void display()
     {
      int n;
      if(front==rear)
         {  
          System.out.println("Queue is Empty");
         }
      else
         {
          System.out.println("\n");
          for(n=front; n<rear; n++)
            {
             System.out.println(a[n]);
            }
         }
     }
 public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     int ch,i;     
     while(true)
         {
          System.out.println("1. Insert\n2.Delete\n3. Display\n4. Exit");
          System.out.println("Enter Your Choice");
          ch = in.nextInt();
          switch(ch)
               {
                case 1: System.out.println("Enter The Data");
                                    i=in.nextInt();
		    insert(i);
                                    break;

                        case 2: delete();
                                    break;

                        case 3: display();
                                    break;
                        case 4: System.exit(1);
                        default: System.out.println("Wrong Choice"); 
               }
         }
    }
}
