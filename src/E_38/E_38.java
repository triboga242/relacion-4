package E_38;

public class E_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array={0,1,2,3,4,5,6,7,8,9};
		int desde=2;
		int hasta=5;
		int []array2;
		imprimeArray(array);
		System.out.println("Desde: " + desde);
		System.out.println("Hasta: " + hasta);
		
		array2=subArray(array, desde, hasta);
		
		imprimeArray(array2);
		
	}
	public static int[] subArray (int array[], int desde, int hasta){
		int array2[]=new int[(hasta-desde)+1]; 
		int cont=0;
		
		for(int i=0;i<array.length;i++){
			if (i>=desde && i<=hasta){
				array2[cont]=array[i];
				cont++;
			}
		}
		return array2;
	}

	public static void imprimeArray(int []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + "\t ");
		}System.out.println(array[f] + "]");
	}
}
