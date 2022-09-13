import java.io.*;

class mergefiles{

public static void main(String args[]){

try{
	FileInputStream fin1=new FileInputStream("a.txt");
	FileInputStream fin2=new FileInputStream("b.txt");
	FileOutputStream fout = new FileOutputStream("c.txt");
	int i;
	while((i=fin1.read())!=-1){
		System.out.print((char)i); 
		fout.write((char)i);}	
	while((i=fin2.read())!=-1){
		System.out.print((char)i); 
		fout.write((char)i);}	



fin1.close();
fin2.close();
	fout.close();
}
catch(IOException e){
	System.out.println(e.getMessage());
}



 

}

}