package E_40;

public class E_40 {

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
		int []array2=new int[array.length];
		int menor=0;
		int posMenor=0;
		//int mayor=0;
		for (int i=0;i<array2.length;i++){			
			int j;
			for (j=0;j<array.length;j++){
				if (j==0)
		    	{
		    		menor=array[j];
		    		posMenor=j;
		    	}
		    	if ( array[j]<menor)
		    	{
		    		menor=array[j];
		    		posMenor=j;
		    	}
		    //	if (mayor<array[j])
		    //	{
		    //		mayor=array[j];
		    //	}
			}
			array2[i]=menor;	
			array=eliminaArray(array, posMenor);
		}
		return array2;				
	}
	public static int []eliminaArray (int []array1, int ind){
		int []arrayI=new int [array1.length-1];
		int cont=0;
		 
		for (int i=0;i<arrayI.length;i++){
			if (i==ind){
				cont+=1;
				arrayI[i]=array1[cont];
				cont++;
				
			}
			else{
				arrayI[i]=array1[cont];	
				cont++;	
			}
		}
		return arrayI;
	}
}
