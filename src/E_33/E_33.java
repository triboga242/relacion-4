package E_33;

public class E_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,5};
		int valor=26;
		int indice=2;
		
		imprimeArray (array);
		imprimeArray (insertaArray(array, valor, indice));		
	}

	public static int[] insertaArray(int[] array1, int val, int ind) {
		int[] arrayI = new int[array1.length + 1];
		int cont = 0;

		for (int i = 0; i < arrayI.length; i++) {
			if (i == ind) {
				arrayI[i] = val;
			} else {
				arrayI[i] = array1[cont];
				cont++;
			}
		}
		return arrayI;
	}
	
	public static void imprimeArray(int []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + "\t ");
		}System.out.println(array[f] + "]");
	}

}
