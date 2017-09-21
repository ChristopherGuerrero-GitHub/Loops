package loops;

/**
 *
 * @author Christopher
 */
public class Loops {

    public static void main(String[] args) {
        
        /*
            This program uses three types of loops (Do while, For, While)
            to print out a message as long as the condition it true.
        */
        
        //do while loop
        System.out.println("Results of a do/while loop: ");
        int count = 0;
        
        do{
            System.out.println("Hello World");
            count++;
        }while(count < 3);
        
        //while loop
        System.out.println("Results of while loop: ");
        count = 0;
        
        while(count < 3){
            System.out.println("Hello World");
            count++;
        }
        
        //for loop
        System.out.println("Results of for loop");
        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }
        
    }
    
}
