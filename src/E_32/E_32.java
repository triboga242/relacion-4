package E_32;

public class E_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[] b;
		b = CopiaArrayPro(a);
		imprimeArray(a);
		imprimeArray(b);
	}
	public static int[] CopiaArrayPro(int array1[]){
		int [] array= new int[array1.length];
		for (int i=0;i<array.length;i++){
			array[i]=array1[i];
		}
		return array;
	}
	public static void imprimeArray(int []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + "\t ");
		}System.out.println(array[f] + "]");
	}

}
