package E_34;

public class E_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 5, 7, 2, 8, 1 };

		int indice = 3;

		imprimeArray(array);

		int[] array2 = eliminaArray(array, indice);
		imprimeArray(array2);
	}

	public static int[] eliminaArray(int[] array1, int ind) {
		int[] arrayI = new int[array1.length - 1];
		int cont = 0;

		for (int i = 0; i < arrayI.length; i++) {
			if (i == ind) {
				cont += 1;
				arrayI[i] = array1[cont];
				cont++;
			} else {
				arrayI[i] = array1[cont];
				cont++;
			}
		}
		return arrayI;
	}

	public static void imprimeArray(int[] array) {
		int f;
		System.out.print("[");
		for (f = 0; f < array.length - 1; f++) {
			System.out.print(array[f] + "\t ");
		}
		System.out.println(array[f] + "]");
	}

}
