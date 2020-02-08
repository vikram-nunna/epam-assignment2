package epam.assignment2;
import java.util.*;
public class gift 
{
	String gname;
	int pr;
public gift(String gname,int pr)
{
	setgiftname(gname);
	setgprice(pr);
}
public void setgiftname(String gname)
{
	this.gname=gname;
}
public void setgprice(int pr)
{
	this.pr=pr;
}
public int getprice()
{
	return pr;
}
	
}
