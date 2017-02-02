package E_36;

public class E_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5, 2 };
		int valor = 2;

		imprimeArray(array);
		System.out.println(valor);

		array = eliminaElementosArray(array, valor);
		imprimeArray(array);

	}

	public static int[] eliminaElementosArray(int[] array, int num) {

		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;

		// contador repeticiones
		int[] array2 = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				cont3++;
			}
		}
		// restar repeticiones al tamaño
		array2 = new int[array.length - cont3];

		// rellenar el nuevo array
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				cont1++;

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
