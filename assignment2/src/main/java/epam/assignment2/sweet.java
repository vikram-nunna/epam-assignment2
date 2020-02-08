package epam.assignment2;

public class sweet {
	private String name;
	private int pp;
	private int q2;
	private float q1;
	public sweet(String name,int pp,int q2)
	{
		setName(name);
		setPp(pp);
		setQ2(q2);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
	public int getQ2() {
		return q2;
	}
	public void setQ2(int q2) {
		this.q2 = q2;
	}
	
}
