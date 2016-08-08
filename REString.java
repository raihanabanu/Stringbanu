# Stringbanu
import java.util.Scanner;


public class REString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		sb.toString();
		String j=new String(sb);
		System.out.println(j);
		}
}
