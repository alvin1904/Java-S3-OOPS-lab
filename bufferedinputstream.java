import java.io.*;

class bufferedinputstream{
public static void main(String args[]){


try{
InputStreamReader ip =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ip);
System.out.println("Enter a character: ");
//char c= (char) br.read();
String str= br.readLine();
System.out.println("Entered String is: "+str);
}
catch(IOException e){
 System.out.println(e.getMessage());
}

}
}