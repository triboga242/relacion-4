package E_35;

public class E_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 2 };
		int valor = 2;

		imprimeArray(array);
		System.out.println(valor);

		array = elimina1ElementoArray(array, valor);
		imprimeArray(array);

	}

	public static int[] elimina1ElementoArray(int[] array, int num) {

		int[] array2 = new int[array.length - 1];
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num && cont3 == 0) {
				cont1++;
				cont3++;
			} else {
				array2[cont2] = array[cont1];
				cont1++;
				cont2++;
			}
		}

		return array2;
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
