import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class calculatorwithprocesspriority {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please input the process you want to calculate ( if you gonna use paranthesis, use space ).");
		
		List<String> process = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));

		
		for(int i = 0; i< process.size();i++)
			if(process.get(i).equals("(")) {
				process.remove(i);
				for(int k = 0; k<process.size(); k++) {
					if(process.get(k).equals(")")) {
						process.remove(k);
						for(int c = i+1; c<k; c++) {
							if(process.get(c).equals("*")) {
								process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))*Integer.valueOf(process.get(c+1))));
								process.remove(c);
								process.remove(c);
								break;
								}
							
							if(process.get(c).equals("/")) {
								process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))/Integer.valueOf(process.get(c+1))));
								process.remove(c);
								process.remove(c);
								break;
								}
						}
						for(int c = i+1; c<k; c++) {
							if(process.get(c).equals("+")) {
								process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))+Integer.valueOf(process.get(c+1))));
								process.remove(c);
								process.remove(c);
								break;
								}
							if(process.get(c).equals("-")) {
								process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))-Integer.valueOf(process.get(c+1))));
								process.remove(c);
								process.remove(c);
								break;
								}

						}
					}
					
				}
					
			}
	
		for(int c = 0; c<process.size(); c++) {
			if(process.get(c).equals("*")) {
				process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))*Integer.valueOf(process.get(c+1))));
				process.remove(c);
				process.remove(c);
				break;
				}
			
			if(process.get(c).equals("/")) {
				process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))/Integer.valueOf(process.get(c+1))));
				process.remove(c);
				process.remove(c);
				break;
				}
		}
		for(int c = 0; c<process.size(); c++) {
			if(process.get(c).equals("+")) {
				process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))+Integer.valueOf(process.get(c+1))));
				process.remove(c);
				process.remove(c);
				break;
				}
			if(process.get(c).equals("-")) {
				process.set(c-1, String.valueOf(Integer.valueOf(process.get(c-1))-Integer.valueOf(process.get(c+1))));
				process.remove(c);
				process.remove(c);
				break;
				}

		}
		
		System.out.println(process);
	}
	}


