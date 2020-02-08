package epam.assignment2;
import java.util.*;
public class swtest{
	public static void main()
	{
	sw s1=new sw("kitkat",10,5);
	gift g1=new gift("toy car",250);
	sweet ll=new sweet2("laddu",100,2);
	int bill=0;
	bill=bill+((s1.getprice())*(s1.getquantity()));
	bill=bill+(g1.getprice());
	bill=bill+((ll.getPp())*(ll.getQ2()));
	System.out.println(bill);
	}
}
