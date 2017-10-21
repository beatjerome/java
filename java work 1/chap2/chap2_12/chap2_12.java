package homework;

public class chap2_12 {
	class Book{
		String Bookname;
		String Author;
		int salevolume;
	public Book(){
		
	}
	
	public Book(String Bookname,String Author,int salevolume){
		
	}
	
	public void setbook(String Bookname,String Author,int salevolume){
		this.Bookname=Bookname;
		this.Author=Author;
		this.salevolume=salevolume;
	}
	
	public void printbook(){
		System.out.println(Bookname);
		System.out.println(Author);
		System.out.println(salevolume);
		}
}
}
	