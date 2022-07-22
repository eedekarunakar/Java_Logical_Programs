import java.util.Scanner;

public class Lowest {
	public static void main(String[] args) {
		String minOccStr;
		int i, min;
		Scanner sc= new Scanner(System.in);
System.out.print("\nEnter String to find Minimum Char Occurrence =  ");
		minOccStr = sc.nextLine();
		
		int[] charFreq = new int[minOccStr.length()];
		char[] minOccArr = minOccStr.toCharArray();
		char minChar = minOccStr.charAt(0);
		
		for(i = 0; i < minOccArr.length; i++)
		{
			charFreq[i] = 1;
			for(int j = i + 1; j < minOccArr.length; j++) {
				if(minOccArr[i] == minOccArr[j] && minOccArr[i] != ' ' && minOccArr[i] != '0') {
					charFreq[i]++;
					minOccArr[j] = '0';
				}
			}		
		}
		min = charFreq[0];
		for(i = 0; i < charFreq.length; i++) 
		{
			if(min > charFreq[i] && charFreq[i] != '0') {
				min = charFreq[i];
				minChar = minOccArr[i];
			}
		}
		System.out.println("\nThe Minimum Occurring Character = " +  minChar);
		System.out.format("'%c' Character Occurs %d Times ", minChar, min);			
	}
}
