package E_37;

public class E_37 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int []array1={1,2,3,7,8,9};
		int []array2={4,5,6};
		int indice=3;
		
		imprimeArray(array1);
		System.out.println("indice: "+indice);
		imprimeArray(array2);
		
		int []array3=insertaArrayEnArray(array1, array2, indice);
		imprimeArray(array3);
	}
	
	public static int[] insertaArrayEnArray(int []array1,int []array2, int num){
		int []array3=new int[array1.length+array2.length];
		int i=0;
		int j=0;
		int k=0;
				
			for (i=0;i<array3.length;i++){	
				if (i<num){
					array3[i]=array1[k];
					k++;
				}
				if (i>num-1 && i<num*2){
					array3[i]=array2[j];
					j++;
				}
				if (i>(num*2)-1 && i<array3.length){
					array3[i]=array1[k];
					k++;
				}
		}	
		return array3;
	}	
	
	public static void imprimeArray(int []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + "\t ");
		}System.out.println(array[f] + "]");
	}
}
