import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class calculatorwithprocesspriority{
public static void main(String[] Args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("CALCULATOR WITH THE PROCESS PRIORITY");
    
    System.out.println("PLEASE INPUT THE OPERATION:");
    
    List<String> operationinput = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));

    int operationinputsize = operationinput.size(); 

    

    for(int i = 1; i < (operationinputsize); i = i + 1){

        
        
        if(operationinput.get(i).equals("*")){
            
            int equalsto = Integer.valueOf(operationinput.get(i-1)) * Integer.valueOf(operationinput.get(i+1));

            operationinput.set(i-1 , String.valueOf(equalsto));

            operationinput.remove(i);

            operationinput.remove(i);

            i--;

            
            
        }
        
        if(operationinput.get(i).equals("/")){
            
            int equalsto = Integer.valueOf(operationinput.get(i-1)) / Integer.valueOf(operationinput.get(i+1));

            operationinput.set(i-1 , String.valueOf(equalsto));
            
            operationinput.remove(i);

            operationinput.remove(i);

            i--;

            
        }
        
        operationinputsize = operationinput.size();
    }

    for(int z = 1; z < operationinputsize; z++){
        
        if(operationinput.get(z).equals("+")){
            int equalsto = Integer.valueOf(operationinput.get(z-1)) + Integer.valueOf(operationinput.get(z+1));
            operationinput.set(z-1 , String.valueOf(equalsto));
            operationinput.remove(z);
            operationinput.remove(z);

            z--;
        }
        
        if(operationinput.get(z).equals("-")){
            int equalsto = Integer.valueOf(operationinput.get(z-1)) - Integer.valueOf(operationinput.get(z+1));
            operationinput.set(z-1 , String.valueOf(equalsto));
            operationinput.remove(z);
            operationinput.remove(z);

            z--;

        }
        operationinputsize = operationinput.size();
    }
    int theanswer = Integer.valueOf(operationinput.get(0));

    System.out.println("The answer = "+ theanswer);
    }
}