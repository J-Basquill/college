public class switchTest
{
	public static void main(String[] args)
	{
		int rating = 1;
		String Approval;
		switch(rating)
		{
			case(1): Approval = "Strongly against";
			break;
			case(2): Approval = "Against";
			break;
			case(3): Approval = "On the fence";
			break;
			case(4): Approval = "For";
			break;
			case(5): Approval = "Strongly for";
			break;
			default: Approval = "No comment";
			break;
		}
		
		
		System.out.println(Approval);
		
		
		
	}
}