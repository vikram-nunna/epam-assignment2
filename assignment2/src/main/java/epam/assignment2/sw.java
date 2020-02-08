package epam.assignment2;
import java.util.*;
public class sw 
{
	String choco;
	int pr;
	int quat;
public sw(String choco,int pr,int quat)
{
	setchoclatename(choco);
	setprice(pr);
	setquantity(quat);
}
public void setchoclatename(String choco)
{
	this.choco=choco;
}
public void setprice(int choco)
{
	this.pr=pr;
}
public void setquantity(int choco)
{
	this.quat=quat;
}
public String getchoclatename()
{
	return choco;
}
public int getprice()
{
	return pr;
}
public int getquantity()
{
	return quat;
}
	
}
