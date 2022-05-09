package SituationBased;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10,firstterm=0,secondterm=1;
		for(int i=0;i<=n;i++)
		{
			System.out.println(firstterm );
			int nextTerm = firstterm + secondterm;
			firstterm = secondterm;
		      secondterm = nextTerm;
		}
	}

}
