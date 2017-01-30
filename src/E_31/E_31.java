package E_31;

public class E_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[] b = {4,5,6,7,2};
		int[] c;
		c = ConcatenaArraysPro(a, b); 
		imprime (a);
		imprime (b);
		imprime(c);
			}
		public static int[] ConcatenaArraysPro (int []array1, int []array2){
			int []arrayC=new int[array1.length+array2.length];
			
			for (int i=0;i<array1.length;i++){
				arrayC[i]=array1[i];
			}
			for (int i=arrayC.length-1;i>array1.length-1;i--){
				arrayC[i]=array2[i-array1.length];
			}
				
			return arrayC;
		}
		
		public static void imprime(int array[]){
			int f;
			System.out.print("[");
			for(f=0;f<array.length-1;f++){
				System.out.print(array[f] + "\t ");
			}System.out.println(array[f] + "]");
	}

}
