package string;

import java.util.*;

public class Q2_removeSpecialCharacters {
	public static void main(String[] args) {
		String str = "$ja!va$&st%ar";
		
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(plainStr);
	}
}
