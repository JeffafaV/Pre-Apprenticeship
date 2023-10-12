class GetPost
{
	private String str;
	
	GetPost() {
		str = "Default State";
	}
	
	public String getStr()
	{
		return str;
	}
	
	public void postStr(String s)
	{
		str = s;
	}
}

public class MimicRestGetPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetPost obj = new GetPost();
		
		System.out.println("Retrieving data (doesn't change state)");
		System.out.println(obj.getStr());
		
		System.out.println("Sending data (changes state)");
		obj.postStr("New State");
		
		System.out.println("Retrieving data (doesn't change state)");
		System.out.println(obj.getStr());
	}
}
