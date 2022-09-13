import java.util.*;

class Occurenceofchar{

public static void main(String args[]){

int len, count=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
len=str.length();

System.out.println("Enter the key char");
char key=sc.next().charAt(0);
i=len-1;
while(i!=0){
if(str.charAt(i)==key)
	count++;
i--;}

System.out.println("Key is present "+count+" times");
}
}