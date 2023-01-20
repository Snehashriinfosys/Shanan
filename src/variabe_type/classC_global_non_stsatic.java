package variabe_type;

public class classC_global_non_stsatic{
	static int j=10;//static
	int i = 20;//non static 
	public static void main(String[] args) {
		System.out.println(j);
		classC_global_non_stsatic g =new classC_global_non_stsatic(); 
				System.out.println(g.i);
	}

}
