package parvej;

interface Method
{
	void say();
}

public class Method_Reference {
	
	public static void saysome()
	{
		System.out.println("shahid bhai tailorW");
	}
	
	public static void main(String[] args)
	{
		//Method_Reference m = new Method_Reference();
		Method mb = Method_Reference::saysome;
		
		mb.say();
	}

}
