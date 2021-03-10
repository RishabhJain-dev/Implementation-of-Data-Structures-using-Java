import java.util.Scanner;
public class stack {
    static int pointer=0;
    static int a[] = new int[5];
    static void push(int data){
        if(pointer==a.length){
            System.out.println("Stack is full, pop some data to push new.");
        }
        else{
            a[pointer]=data;
            pointer++;
        }
        System.out.println();
    }
    static void pop(){
        if(pointer==0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Data popped is: "+a[pointer-1]);
            pointer--;
            
        }
        System.out.println();
    }
    static void display(){
        if(pointer==0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("\nContents of stack are:");
            for(int n=0; n<pointer; n++){
                System.out.println(a[n]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ch, i;
        while(true){
            System.out.println("1.Push on Stack\n2.Pop from Stack\n3.Display Stack\n4.Exit");
            System.out.println("Enter your choice:");
            ch = in.nextInt();
            switch(ch){
                case 1: System.out.println("Enter the data");
                        i = in.nextInt();
                        push(i);
                        break;
                       
                case 2: pop();
                        break;
                        
                case 3: display();
                        break;
                        
                case 4: System.exit(1);
                default: System.out.println("Wrong choice entered");
            }
        }
    }
}
