package sample;
public class IllegalTextException; 
import com.exception.*; 
public class candidate {
	
	public void stringLenght(int l) throws IllegalTextException { 
		if(l<1) { 
			throw new IllegalTextException(l);
			} } 
	public static void main(String[] args) { 
		// TODO Auto-generated method stub Text 
		obj =new Text(); 
		String str= ""; 
		int l=str.length();
		try { obj.stringLenght(l); } 
		catch(IllegalTextException exception) 
		{ exception.printMessage(); } }
	}
}



	