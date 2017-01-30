package E_40;

public class E_40_V_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={3,5,1,7,6,8,9,2,0,4};
		imprimeArray(array);
		
		array=ordenaSeleccion(array);
		
		imprimeArray(array);
	}
	public static void imprimeArray(int []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + "\t ");
		}System.out.println(array[f] + "]");
	}
	public static int[] ordenaSeleccion (int array[]){
		int array2[]=new int[array.length];
		
		for(int i=0;i<array.length;i++){
		array2[i]=array[posMinArray(array)];		
		}
		return array2;		
	}
	public static int posMinArray (int array[]){
		int pos=0;
		int menor = 0;
		
		for(int i=0;i<array.length;i++){
			
			if(i==0){
				menor=array[i];
				pos=0;
			}
			if (array[i]<menor){
				menor=array[i];
				pos=i;
			}
		}
		return pos;
	}
	public static int []insertaFinalArray (int array[]){
		int []array2=new int[array.length];
		
		return array2;
	}
}
