// Create a class which ask the user to enter a sentence, and it should display count of 
// each vowel type in the sentence. The program should continue till user enters a word 
// “quit”. Display the total count of each vowel for all sentences.

import java.util.Scanner;

// class Vowel{
// 	int vowel;
// }

public class P6B5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = new String();
		int totalVowel = 0;

		while(true){
			System.out.println("Enter the Sentence :");
			str = sc.nextLine();

			if((str.equals("quit"))){
				break;
			}
			else{
				for(int i=0; i<str.length(); i++){
					char vol = str.charAt(i);
					if(vol == 'a' || vol == 'e' || vol == 'i' || vol == 'o' || vol == 'u' || vol == 'A' || vol == 'E' || vol == 'I' || vol == 'O' || vol == 'U'){
						totalVowel++;
					}
				}
			}
		}

		System.out.println("Total Vowel = "+totalVowel);
	}
} 