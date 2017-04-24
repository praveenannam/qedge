package oops;



interface  java{
	 public void javaclass();
	 public void selenium();
	 
 }
interface room{
	void danceroom();
	
}
interface collage extends java,room
{
	
}
public class Interface  implements java{
 public static void main(String[] args) {
	Interface i= new Interface();
	i.javaclass();
	i.selenium();
	i.danceroom();
}
	private void danceroom() {
	// TODO Auto-generated method stub
		System.out.println("danceing");
}
	@Override
	public void javaclass() {
		// TODO Auto-generated method stub
		System.out.println("danceing");
		
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		 System.out.println("danceing");
	}
	

}


