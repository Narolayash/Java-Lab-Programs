// Create a class which ask the user to enter a sentence, and it should display count of 
// each vowel type in the sentence. The program should continue till user enters a word 
// “quit”. Display the total count of each vowel for all sentences.

import java.util.Scanner;

public class P6B3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = new String();
		int totalNumberOfA = 0;
		int totalNumberOfE = 0;
		int totalNumberOfI = 0;
		int totalNumberOfO = 0;
		int totalNumberOfU = 0;
		int totalNumberOfa = 0;
		int totalNumberOfe = 0;
		int totalNumberOfi = 0;
		int totalNumberOfo = 0;
		int totalNumberOfu = 0;

		while(true){
			System.out.println("Enter the Sentence :");
			str = sc.nextLine();

			if((str.equals("quit"))){
				break;
			}
			else{
				for(int i=0; i<str.length(); i++){
					char vol = str.charAt(i);
					if(vol == 'A'){
						totalNumberOfA++;
					}
					else if(vol == 'E'){
						totalNumberOfE++;
					}
					else if(vol == 'I'){
						totalNumberOfI++;
					}
					else if(vol == 'O'){
						totalNumberOfO++;
					}
					else if(vol == 'U'){
						totalNumberOfU++;
					}
					else if(vol == 'a'){
						totalNumberOfa++;
					}
					else if(vol == 'e'){
						totalNumberOfe++;
					}
					else if(vol == 'i'){
						totalNumberOfi++;
					}
					else if(vol == 'o'){
						totalNumberOfo++;
					}
					else if(vol == 'u'){
						totalNumberOfu++;
					}
				}
			}
		}

		System.out.println("Total A = "+totalNumberOfA);
		System.out.println("Total E = "+totalNumberOfE);
		System.out.println("Total I = "+totalNumberOfI);
		System.out.println("Total O = "+totalNumberOfO);
		System.out.println("Total U = "+totalNumberOfU);
		System.out.println("Total a = "+totalNumberOfa);
		System.out.println("Total e = "+totalNumberOfe);
		System.out.println("Total i = "+totalNumberOfi);
		System.out.println("Total o = "+totalNumberOfo);
		System.out.println("Total u = "+totalNumberOfu);

	}
} 