package SituationBased;

public class TripletsarePythagorean {

	public static void main(String[] args) {
		int l=12;
		int b=5;
		int h=13;
		int sum, height;
		//logic
		sum=(l*l)+(b*b);
		height=(h*h);
		if(sum==height)
		{
			System.out.println("Triplets are pyrhagorean");
		}
		else
		{
			System.out.println("Triplets are  not pyrhagorean");
		}
	}

}
