import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n1 = Integer.valueOf(bf.readLine()), n2 = Integer.valueOf(bf.readLine());
		int m[] = new int[n1];
		int n[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			n[i] = Integer.valueOf(bf.readLine());
		}
		for (int i = 0; i < n2; i++) {
			m[i] = Integer.valueOf(bf.readLine());
		}
		int n3= n1+n2;
		int i,j;
		int median;		
		int mre[]=new int[n3];
		for(i= 0;i<n1;i++)
		{
			mre[i]=m[i];
		}
		for(j=0;j<n2;j++)
		{
			mre[i+j]=n[j];
		}
		Arrays.sort(mre);
		for (i = 0; i < n3; i++)
		{
	System.out.println(mre[i]);
		}

if (mre.length % 2 == 0)
{
            median = (mre[mre.length / 2] + mre[mre.length / 2 - 1]) / 2;
          
}
        else
        {
            median = mre[mre.length / 2];

            
	}
System.out.println(median);
	
}}
