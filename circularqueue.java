import java.util.Scanner;
public class circularqueue {
    static int x = 10;
    static int a[] = new int[10];
    static int count = 0;
    static int rear = 0;
    static int front = 0;
    static void insert(int d){
        if(x==rear && front==0){
            System.out.println("Queue is full, delete some data to insert new.");
        }
        else if(rear==front && count!=0){
            System.out.println("Queue is full, delete some data to insert new.");
        }
        else{
            if(rear==x && front!=0){
                rear=0;
                count++;
                a[rear]=d;
                rear++;
            }
            else{
                a[rear]=d;
                rear++;
            }
        }
    }
    static void delete(){
        if(rear==front && count==0){
            System.out.println("Queue is empty, cann't delete anything.");
        }
        else{
            if(front==(x-1)){
                front=0;
                count--;
                System.out.println("Deleted data= "+a[front]);
                front++;
            }
            else{
                System.out.println("Deleted data= "+a[front]);
                front++;
            }
            
        }
    }
    static void display(){
        System.out.println("\nContents of Queue are:");
        if(count==0){
            for(int n=front; n<rear; n++){
                System.out.println(a[n]);
            }
            System.out.println();
        }
        else{
            for(int n=front; n<x; n++){
                System.out.println(a[n]);
            }
            for(int n=0; n<rear; n++){
                System.out.println(a[n]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter the length of your queue");
        //x = in.nextInt();
        int ch, i;
        while(true){
            System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
            System.out.println("Enter your choice");
            ch=in.nextInt();
            switch(ch){
                case 1: System.out.println("Enter your data");
                        i = in.nextInt();
                        insert(i);
                        break;
                
                case 2: delete();
                        break;
                
                case 3: display();
                        break;
                        
                case 4: System.exit(1);
                
                default: System.out.println("Entered wrong choice");
            }
        }    
    }
}
