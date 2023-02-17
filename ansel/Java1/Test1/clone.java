import java.util.*;
import java.io.*;

public class clone {
	public static void main (String[] args) {
	ArrayList<Integer> AL1 = new ArrayList<>();
	AL1.add(1);
	AL1.add(2);
	AL1.add(2);
	AL1.add(1);

	ArrayList<Integer> AL2= new ArrayList<>();
	AL2 = (ArrayList)AL1.clone();
	System.out.println("Original ArrayList : " + AL1);
	System.out.println("Copied Arraylist : " + AL2);
	}
}   


