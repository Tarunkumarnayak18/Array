import java.util.Scanner;

class Array
{
    private int arr[];
    
    private Scanner scan = new Scanner(System.in);

    public Array(int n)
    {
       arr = new int[n];
    }

    public void insert()
    {  
        System.out.println("Enter the position 0 to "+(arr.length-1));
        int pos = scan.nextInt();
        System.out.println("Enter an element");
        int elem = scan.nextInt();
        arr[pos] = elem;
    }

    public void delete()
    {
        System.out.println( "Enter the position to deleted the element" );
        int pos = scan.nextInt();
        System.out.println("Element delete is:"+arr[pos]);
        arr[pos] = 0;
    }

    public void display()
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class ArrayApp
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Length");
        int n = scan.nextInt();

        Array array = new Array(n);

        while(true)
        {
            System.out.println("Press 1 ---------> INSERT");
            System.out.println("Press 2 ---------> DELETE");
            System.out.println("Press 3 ---------> DISPLAY");
            System.out.println("Any other number ------> STOP");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: array.insert(); 
                break;
                case 2: array.delete();
                break;
                case 3: array.display();
                break;
                default: System.exit(0);
                break;
            }
        }
    }
}
