// DAY-II ASSIGNMENT  part - I
				 
/*Day-2 Assignment Questions: Part-1
1. Write a program that uses if statement to find the minimum of three numbers.
2. Write a program to do the following patterns using for loop?
a) 1 1 R R R R
1 1 R R
1 R R R R
1 1 R R
1 1 R R
3. Write a program to do the following patterns using while loop?
a) 1 b) w
2 3 w w
4 5 6 w w w
7 8 w w
9 w
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS
5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
6. Define a method to convert the decimal number to a binary number?
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
*/
				 
 

// 1. Write a program that uses if statement to find the minimum of three numbers.

class MinNum{
	public static void main(String[] args){
		int x=27;
		int y=297;
		int z=89;
		if(x<y && x<z){
			System.out.println("The Minimum Number is: " + x);
		}else if(y < x && y < z){
			System.out.println("The Minimum Number is: " + y);
		}else{
			System.out.println("The Minimum Number is: " + z);
		}
	}
}

/*2.Write a program to do the following patterns using for loop?
a)/* 1    1
      1  1 
	1 
      1  1
     1     1
class OneXpattern{
	public static void main(String[] args){
		int rows =5;
		for(int i=0;i<rows;i++){
			for(int j =0;j<rows;j++){
				if(i == j || i+j == rows - 1 ){
					System.out.print("1"+ " " );
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*R R R R
  R     R
  R  R  R
  R    R
  R     R */

class Rpatern{
	public static void main(String[] args){
		int rows = 5;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
		           if(i == 1 || i == 3){
					System.out.print("R ");
		           }else if(j==1 || (i == 2 && j == col) || (i == 4 && j == 3)  || (i == 5 && j == 4)){
					System.out.print("R ");
			   }else{
					System.out.print("  ");
			}
			System.out.println();
		}
	}
 }


/* 3.Write a program to do the following patterns using while loop?
a) 1        
  2 3 
 4 5 6 
  7 8    
   9   */
   
class DiamondPatern{
	public static void main(String[] args){
		int m=3;
		int num=1;
		int i=1;
		while(i <= m){
			int space=1;
			while(space <= m-i){
				System.out.print(" ");
	            space++;
			}
			int k=1;
			while(k<=i){
				System.out.print(num + " ");
				num++;
				k++;
			}
			System.out.println();
			i++;
		}
		i=m-1;
		while(i >= 1){
			int space=1;
			while(space <= m-i){
				System.out.print(" ");
	            space++;
			}
			int k=1;
			while(k<=i){
				System.out.print(num + " ");
				num++;
				k++;
			}
			System.out.println();
			i--;
		}
	}
}

/*3.B. w
       w w 
	   w w w 
	   w w
	   w   */
	   
class RightTriangle{
	public static void main(String[] args){
		int row=3;
		int i=1;
		while(i <= row){
			int j=1;
			while(j <= i){
				System.out.print("W ");
				j++;
			}
			System.out.println();
			i++;
		}
		i=row-1;
		while(i >= 1){
			int j=1;
			while(j <= i){
				System.out.print("W ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
				
/* 4.a.Write a program to do the following patterns using do...while loop?
a) Pascal Triangle */

class PascalTriangle{
	public static void main(String[] args){
		int i=0;
		int n=7;
		do{
			int space=0;
			do{
				System.out.print(" ");
				space++;
			}while(space < n-i);
			int j=0;
			int value=1;
			do{
				if(j == 0 || i == 0){
					value=1;
				}else{
					value=value * (i-j+1)/j;
				}
				System.out.print(value + " ");
				j++;
			}
			while(j <= i);
			System.out.println();
			i++;
		}
		while(i < n);
	}
}	

/* b.  ZOHO
       CORP  
       ORAT
       IONS   */
	   
class ZohoCorp{
	public static void main(String[] args){
		int row=4;
		int i=0;
		String word="ZOHOCORPORATIONS";
		int len=word.length();
        do{
			int j=0;
			do{
				if(i + j < len){
					System.out.print(word.charAt(i+j));
				}
				j++;
			}
			while(j < row);
			System.out.println();
			i+=row;
		}
		while(i < len);
	}
}
		
		
// 5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

class SumEven{
	public static void main(String[] args){
		int sum=0;
		for(int i=1; i<=100; i++){
			if( i % 2 == 0){
				sum+=i;
			}
			else{
				continue;
			}
		}
		System.out.println("The Sum of Even Numbers From the Series 1, 2, 3, 4, 5, ...100 is : " + sum);
    }
}	

//____________________________________________________________________________________________________________

// 6. Define a method to convert the decimal number to a binary number?

class DeciToBin{
	static String convertBinary(int decimalNum){
		String binaryNum="";
		while(decimalNum > 0){
			int remainder =decimalNum % 2;
			binaryNum=remainder + binaryNum;
			decimalNum/=2;
	    }
		return binaryNum;
	}
	public static void main(String[] args){
		int decimalNum=10;
		System.out.println("The Binary Value of the Decimal Number is : " + convertBinary(decimalNum));
    }
}

/* 7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail” */

// IF Condition

class StudGrade{
	public static void main(String[] args){
		int percent=89;
		if(percent >= 85 && percent <= 100){
			System.out.println("Grade A");
		}else if(percent >= 70 && percent <= 85){
			System.out.println("Grade B");
		}else if(percent >= 50 && percent <= 70){
			System.out.println("Grade C");
		}else{
			System.out.println("Fail");
		}
	}
}


 // Switch Statement
 
 class StudGradeSwch{
	public static void main(String[] args){
		int mark=495;
		int percentage=mark / 5;
		char grade;
		switch(percentage/10){
			case 10:
			  grade='A';
			  break;
			case 9:
			  grade='B';
			  break;
			case 8:
			  grade='C';
			  break;
			case 7:
			  grade='D';
			  break;
			default:
			  grade='F';
		}
		System.out.println("The Student Grade is : " + grade);
	}
 }
			
//============================================================================================================================================================
			
                                /*Day-2 Assignment Questions: Part-2 Arrays
1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
2. Write a program to take in 10 values and print only those numbers which are prime.
3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }
6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x */

// 1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.

class SumOddArr{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0; i < arr.length; i++){
			if(arr[i] % 2 != 0){
				sum += arr[i];
			}
		}
		System.out.println("The Sum of all odd Number's is : " + sum);
	}
}


// 2. Write a program to take in 10 values and print only those numbers which are prime.

class PrimeNum{
	static boolean chkPrime(int n){
		if(n <= 1)return false;
		for(int i=2; i * i <= n; i++){
			if(n % i == 0)return false;
		}
		return true;
	}
	public static void main(String[] args){
		int n=50;
		System.out.println("The Prime Number's are : ");
		for(int i=2; i <= n; i++){
			if(chkPrime(i)){
				System.out.println(i + " ");
			}
		}
	}
}

//  3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.

class FiboNacci{
	public static void main(String[] args){
		int num=30;
		int[] fiboSeries=new int[num];
		fiboSeries[0]=0;
		fiboSeries[1]=1;
	    for(int i=2; i < num; i++){
			fiboSeries[i]=fiboSeries[i-1] + fiboSeries[i-2];
		}
		for(int i=0; i < fiboSeries.length; i++){
			System.out.println(fiboSeries[i] + " ");
		}
	}
}

/*4.Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and
sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the
required result by invoking the function print( ).*/
 
 class SingleDouble{
	static void print(int[] x,int n){
		int singleSum=0, doubleSum=0;
		for(int i=0; i < n; i++){
			if(x[i] >= 0 && x[i] <= 9) singleSum+=x[i];
			else if(x[i] >= 10 && x[i] <= 99) doubleSum+=x[i];
		}
        System.out.println("The Sum of Single Digit Number is : " + singleSum);
	    System.out.println("The Sum of Single Digit Number is : " + doubleSum);
	}
	public static void main(String[] args){
		int[] x={2,3,4,55,77,99,22,3,9};
		int n=9;
		print(x,n);
	}
 }
 
 /* 5.Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make 
suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/

class ArrIdentical{
	public static void main(String[] args){
		char x[]={'m','n','o','p'};
	    char y[]={'m','n','o','p'}; // Identicalcase
		//char y[]={'n','m','o','p'}; // Not Identical
        boolean identical=true;
		if(x.length != y.length) identical=false;
		for(int i=0; i<y.length; i++){
			if(y[i] != x[i]){
				identical=false;
				break;
			}
		}
	    if(identical){
			System.out.println("Yes, The Array x&y are Identical");
	    }else{
			System.out.println("No, The Array x&y are Not Identical");
		}
    }
}

/*6.Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given
below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/

class GraduateYear{
	static boolean availCheck(int arr[],int year){
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left <= right){
			mid=left + right/2;
			if(arr[mid] == year) return true;
			else if(arr[mid] < year) left=mid+1;
			else{
				right=mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args){
		int[] arr={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int userYear=scan.nextInt();
		boolean checkExist=availCheck(arr,userYear);
		if(checkExist){
			System.out.println("Record Exists");
		}else{
			System.out.println("Record Doesn't Exists");
		}
	}
}
		
 // 7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique. 

class WeightTen{
	public static void main(String[] args){
		int[] arr={25,38,97,19,40};
		for(int i=0; i<arr.length-1; i++){
			int minVal=i;
			for(int j=i+1; j < arr.length; j++){
				if(arr[j] < arr[minVal]){
					minVal=j;
				}
			}
		    int temp=arr[minVal];
			arr[minVal]=arr[i];
			arr[i]=temp;
		}
		for(int result:arr){
			System.out.println(result + " ");
		}
	}
}

// 8.Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.

class TenPeopleAge{
	public static void main(String[] args){
		int lessEighteen=0;
		int eighteenToSixty=0;
		int aboveSixty=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Age:");
		for(int i=0; i<= 10; i++){
			int peopleAge=input.nextInt();
			if(peopleAge < 18){
				lessEighteen++;
			}else if(peopleAge >= 18 && peopleAge <= 60){
				eighteenToSixty++;
			}else{
				aboveSixty++;
			}
		}
		System.out.println("No.of Age less than 18 : " + lessEighteen);
		System.out.println("No.of Age Greater than 18 && less than 60 : " + eighteenToSixty);
		System.out.println("No.of Age Greater than 60 : " + aboveSixty);
	}
}

// 9.Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.

class StudData{
	public static void main(String[] args){
		int[] rollNum={101,102,103,104,105,106,107,108,109,110};
		int[] sub1={98,78,85,35,23,78,90,100,39,68};
		int[] sub2={55,65,75,85,95,45,35,25,78,98};
		int[] sub3={11,22,33,44,55,66,77,88,99,100};
		int[] totalMarks=new int[10];
		int[] avg=new int[10];
		System.out.println(" || " + "RollNum" + " || " + "TotalMarks" + " || " + "Avg" + " || ");
		System.out.println("_______________________________________");
		for(int i=0; i < 10; i++){
			totalMarks[i]=sub1[i]+sub2[i]+sub3[i];
			avg[i]=totalMarks[i]/3;
			System.out.println(" || " + rollNum[i] + "\t" + " || " + totalMarks[i] + "\t" + " || " + avg[i] + " || ");
		}
	}
}

/*10.Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size
  m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x */


class TwoDarray{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Row-Size: ");
		int m=scan.nextInt();
		System.out.println("Enter the Column-Size: ");
		int n=scan.nextInt();
		int[][] matrix=new int[m][n];
		inputElements(m,n,matrix,scan);
		displayElements(m,n,matrix);
		sumOfallElements(m,n,matrix);
		sumofRow(m,n,matrix);
		sumofCol(m,n,matrix);
		transposeMatrix(m,n,matrix);
	}
	static void inputElements(int m,int n,int matrix[][],Scanner scan){
		System.out.println("Enter the No.of Row & Column : ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix[i][j]=scan.nextInt();
		    }
		}
	}
	static void displayElements(int m,int n,int matrix[][]){
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j] + " ");
	        }
			System.out.println();
		}
	}
	static int sumOfallElements(int m,int n,int matrix[][]){
		int sumAllelem=0;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				sumAllelem+=matrix[i][j];
            }
		}
		System.out.println("Sum Of all Elements are: " + sumAllelem);
		return sumAllelem;
	}
	static void sumofRow(int m,int n,int[][] matrix){
		for(int i=0; i<m; i++){
			int rowSum=0;
			for(int j=0; j<n; j++){
				rowSum+=matrix[i][j];
			}
			System.out.println("Sum of the Row : " + rowSum);
		}
	}
	static void sumofCol(int m,int n,int[][] matrix){
		for(int j=0; j<m; j++){
			int colSum=0;
			for(int i=0; i<n; i++){
				colSum+=matrix[i][j];
			}
			System.out.println("Sum of the Column : " + colSum);
		}
	}
	static void transposeMatrix(int m,int n,int matrix[][]){
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[j][i] + "\t");
			}
			System.out.println();
		}
	}
}	

	//============================================================================================================================================================		
	
                                               //Day-2 Assignment Questions: Part-3 Strings
/*1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
‌
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
‌
3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
‌
4. You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters.
‌
5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
‌
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
‌
7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
‌
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.*/
		
		
/*1.Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself */

class ConvertBinary{
	static String calcBinary(String a,String b){
		StringBuilder result=new StringBuilder();
		int aLength=a.length()-1;
		int bLength=b.length()-1;
		int carry=0;
		while(aLength >= 0 || bLength >= 0 || carry==1){
			if(aLength >= 0){
				carry += a.charAt(aLength--)- '0';
			}
			if(bLength >= 0){
				carry += b.charAt(bLength--)-'0';
			}
			result.append(carry % 2);
			carry /= 2;
		}
		return result.reverse().toString();
	}
	public static void main(String[] args){
		String a="1100";
		String b="1010";
		System.out.println(calcBinary(a,b));
	}
}


/*2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1 */

class ColumnTitle{
	static String colVal(int colNum){
		String result="";
		//colNum=1;
		while(colNum > 0){
			colNum--;
			int remainVal=colNum % 26;
			char charVal =(char)('A' + remainVal);
			result=charVal + result;
			colNum/=26;
		}
	    return result;
	}
	public static void main(String[] args){
		int colNum=28;
		String title=colVal(colNum);
		System.out.println("The Column title is : "+ title);
	}
}
	
/*3.Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.*/

class ReverseVowels{
	static String vowel(String c){
		char ch[]=c.toCharArray();
		int left=0;
		int right=c.length()-1;
		while(left < right){
			while(left < right && !isVowel(ch[left]))left++;
			while(left < right && !isVowel(ch[right]))right--;
			char temp=ch[left];
			ch[left] = ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	    return new String(ch);
	}
	static boolean isVowel(char s){
		if(s =='a' || s =='e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U'){
			return true;
        }
		return false;
    }
    public static void main(String[] args){
		String c="IceCreAm";
		String result=vowel(c);
		System.out.println("The Reversed Vowel String is : " + result);
	}
}


/*4.You are given two strings s and t.
‌
String t is generated by random shuffling string s and then add one more letter at a random position.
‌
Return the letter that was added to t.
‌
Example 1:
Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
‌
Example 2:
Input: s = "", t = "y"
Output: "y"
‌
Constraints:
0 <= s.length <= 1000
t.length == s.length + 1
s and t consist of lowercase English letters. */
 

 
class RandomShuffle{
	static Character difference(String s,String t){
		int sum=0;
		for(int i=0; i<t.length(); i++){
			sum +=t.charAt(i);
		}
		for(int i=0; i<s.length(); i++){
			sum  -= s.charAt(i);
		}
		return (char)sum;
	}
	public static void main(String[] args){
		String t="abcd";
		String s="abcde";
		//String result=difference(t1,s1);
		System.out.println(difference(t,s));
	}
}


/* 5. Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of
 the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how
 would you ch
 */
 
 class SubSequence{
	static boolean isSubsequence(String s,String t){
		if(s.length()==0){
			return true;
		}
		if(s.length() > t.length()){
			return false;
		}
		char[] sArray=s.toCharArray();
		char[] tArray=t.toCharArray();
		int i=0,j=0;
		while(j < tArray.length){
			if(sArray[i] == tArray[j]){
				i++;
				if(i == sArray.length){
					return true;
				}
			}
			j++;
		}
		return i == sArray.length;
	}
	public static void main(String[] args){
		String s1="abc";
		String t1="ahbgdc";
		System.out.println( isSubsequence(s1,t1) + " : The String is Subsequence ");
		String s2="wxyz";
		String t2="abcd";
		System.out.println(  isSubsequence(s2,t2) + " : The String is Not Subsequence ");
	}
}


/* 6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself. */
			

class StrSum{
	static String addStr(String num1,String num2){
		StringBuilder result=new StringBuilder();
		int i=num1.length()-1;
		int j=num2.length()-1;
		int carry=0;
		while(i >= 0 || j >= 0 || carry > 0){
			if(i >= 0){
				carry += num1.charAt(i--)- '0';
			}
			if(j >= 0){
				carry += num2.charAt(j--)-'0';
			}
			result.append(carry % 10);
			carry /= 10;
		}
		return result.reverse().toString();
	}
	public static void main(String[] args){
		String num1="123";
		String num2="100";
		System.out.println(addStr(num1,num2));
	}
}



/* 7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/
		
class NumofSegments{
	static int countSegments(String s){
		int segmentCount=0;
		if(s.length() < 0){
			return 0;
	    }
		for(int i=0; i<s.length(); i++){
			if((i == 0 || s.charAt(i-1) == ' ')&&s.charAt(i) != ' '){
				segmentCount++;
		    }
		}
		return segmentCount;
	}
    public static void main(String[] args){
		String s1="Welcome To ZOHO Corporation";
		System.out.println("The Number of Segments in a String is:" + countSegments(s1));
	}
}
		
/*8.We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.*/


class CapitalCase{
	static boolean isCapital(String word){
		int capitalCount=0;
		int n=word.length();
		for(int i=0; i<n; i++){
			char ch=word.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				capitalCount++;
			}
		}
		if(capitalCount == 0 || capitalCount == n || capitalCount == 1 && Character.isUpperCase(word.charAt(0))){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String word1="USA";
		System.out.println(isCapital(word1));
		String word2="FlaG";
		System.out.println(isCapital(word2));
	}
}

//==========================================================================================================================================================
