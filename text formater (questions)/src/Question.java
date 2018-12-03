
public abstract class Question 
{
	//fields
	private int number;
	private String text;
	public Question(int number, String text)
	{
		this.number = number;
		this.text = text;
	}
	//public int getNumber(int countQ)
	public int getNumber()
	{
		return number;
	}
	public String getText()
	{
		return text;
	}
	public abstract String getSolution();
}
