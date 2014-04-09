package football;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Testcall {
	
	public static void main(String[] args){
		Dante b = new Dante();
		Dante c = new Dante(1);
		String d = b.getname();
		String e = b.getposition();
		String[] f = b.getfriend();
		System.out.println("Name "+d);
		System.out.println("Position "+e);
		System.out.println("Friend"+Arrays.toString(f));
	}

}
