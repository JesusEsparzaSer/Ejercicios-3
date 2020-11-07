package caminocorto;
/**
 *
 * @author Jesus
 */
import java.util.*;
import java.text.DecimalFormat;
public class CaminoCorto {
    static DecimalFormat formateador = new DecimalFormat("0.00");
    public static Scanner leer;
    static int costo=0;
    public static void main(String[] args) {
        
        leer = new Scanner(System.in);
        int[][] matriz={{ 0, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        { 1, 1, 1, 1, 5, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 5},
                        { 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 5, 5},
                        { 1, 1, 1, 1, 5, 1, 2, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 1},
                        { 1, 1, 1, 1, 5, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 5, 5, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 2, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 5, 1, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 2, 2, 2, 2, 2, 1, 3, 1, 1, 1, 1, 1, 1, 1},
                        { 5, 1, 1, 3, 3, 3, 3, 3, 3, 5, 5, 1, 1, 1, 5, 2, 1, 3, 1, 1, 1, 1, 1, 1, 1},
                        { 1, 5, 1, 1, 1, 1, 1, 1, 5, 5, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        { 1, 1, 5, 1, 1, 1, 1, 5, 5, 1, 1, 1, 1, 1, 1, 2, 1, 5, 1, 1, 1, 1, 1, 1, 1},
                        { 1, 1, 1, 5, 1, 1, 5, 5, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 5, 1, 1, 3, 3, 3, 1},
                        { 1, 1, 1, 1, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 1, 1, 5, 1, 1, 1, 3, 3, 1, 5, 1, 1, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 1, 3, 3, 3, 1, 1, 5, 1, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 5, 5, 1, 5, 5, 3, 3, 1, 1, 1, 1, 1, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2},
                        { 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 5, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1},
                        { 5, 5, 5, 5, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 5, 1},
                        { 1, 1, 1, 1, 5, 5, 5, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 3, 5, 1, 1, 1, 1, 5},
                        { 1, 1, 1, 1, 1, 1, 1, 5, 5, 5, 1, 1, 3, 1, 1, 1, 1, 1, 5, 1, 5, 1, 1, 1, 1},
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 2, 2},
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2},
                        { 1, 1, 5, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 5, 5, 1, 1, 1, 1, 1, 1, 3, 1, 1, 2},
                        { 1, 1, 5, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 5, 1, 1, 1, 5, 1, 1, 3, 1, 1, 1},
                        { 1, 1, 5, 1, 1, 1, 1, 3, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 5, 1, 1, 3, 1, 5, 5}};//matriz de camino
        
         double [][] camino = new double[matriz.length][matriz.length];
         int caminante = 1;
         int nodoFinal;
         
         Mostrar_matriz(matriz);
         
         System.out.println("Escribir punto B");
         nodoFinal = leer.nextInt();
         
         nodoFinal-=1;
        
         for (int i = 0; i < camino.length; i++){
            for (int j = 0; j < camino.length; j++) {
            camino[i][j]=1;
            }
        }
        
        for (int i = 0; i < caminante; i++) {

                recorrer(matriz,nodoFinal,camino);
                System.out.println();

        }
        
        int nodo_sol = 0;
        System.out.println("Camino Final");
        double mayor_temp;
        int temp_index_sol;
        int costo_final=0;
        int columna=0;
        
        while(nodo_sol != nodoFinal){
            System.out.print((nodo_sol+1) + " , ");

            mayor_temp = camino[nodo_sol][0];
            temp_index_sol = 0;

            for(int i = 1; i < camino.length; i++){
            
                    if(camino[nodo_sol][i] > mayor_temp)
                    {
                            mayor_temp = camino[nodo_sol][i];
                            temp_index_sol = i;
                            columna=i;
                    }	
            }
        costo_final += matriz[nodo_sol][columna];
        nodo_sol = temp_index_sol;
        }
  
        System.out.println("Costo Final del camino "+costo_final);
    }
    
    public static void Mostrar_matriz(int matriz[][]){
    	System.out.println("-------CAMINO MAS CORTO-------");
	
	for (int i = 0; i < matriz.length; i++) {  // Muestra la Red de transporte 
	
		for (int j = 0; j < matriz.length; j++) {
			System.out.print(matriz[i][j]+"\t");
		}
		System.out.println();
	}
	
	System.out.println();
    }
    
    public static void recorrer(int matriz[][], int nodoFinal, double camino[][]){
      	// nodo de la red 
	int nodo=0;     
	// nodos recorridos
	ArrayList<Integer> Nodos_visitados = new ArrayList<Integer>();
	// matriz temporal para recorrido 
	int [][] matriz_temporal = new int[matriz.length][matriz.length];
	double camino_antes[][]= new double [camino.length][camino.length];
	
	    
	       //Genera copia temporal
	   	   clonar_matriz(matriz,matriz_temporal); 
	   	   clonar_camino(camino,camino_antes);
	      
	 //System.out.print("Ruta 1"); 
	 Nodos_visitados.add(0);
	while(nodo != nodoFinal){
	   				
		nodo = elegir_camino(matriz_temporal,nodo,camino,camino_antes,matriz,Nodos_visitados);
		
		if (nodo==-1) {
			System.out.print("Mal camino");
			break;
		}
		System.out.print(+(nodo+1));
		
	} //End while
	//System.out.println();
	costo=0;
	Nodos_visitados.clear();  
    }
    public static void  clonar_matriz(int matriz[][],int matriz_temporal[][]){
	
	for (int i = 0; i < matriz_temporal.length; i++) {
		
		for (int j = 0; j < matriz_temporal.length; j++) {
			matriz_temporal[i][j]=matriz[i][j];
		}
		
        }
    }
    public static void clonar_camino(double camino[][],double camino_antes[][]){
	for (int i = 0; i < camino.length; i++) {
			
		for (int j = 0; j < camino.length; j++) {
			camino_antes[i][j]=camino[i][j];
		}
			
	}

    }
    public static int elegir_camino(int matriz_temporal[][], int nodo, double camino[][],double camino_antes[][],int matriz[][],ArrayList<Integer>Nodos_visitados){
		
		double evaluacion=0;
		double random;    
		Random r = new Random(); 
		ArrayList<Integer> NodosBuenos = new ArrayList<Integer>();
		double caminos=0;
		int nodo_siguiente = -1;
		double variacion_camino=0;
		int indice;
		//System.out.print(" --> ");
		//Obtener nodos viables
		
		for (int j = 0; j < matriz_temporal.length; j++) {
			
			if (matriz_temporal[nodo][j]>0) {
				NodosBuenos.add(j); // agrega la posición del nodo bueno  
			}	
			
		}
		
		
		//Sumar el total de camino de los nodos viables, para la posterior normalización
		for (int i = 0; i < NodosBuenos.size(); i++) {
			evaluacion+=camino[nodo][NodosBuenos.get(i)];
		}
		
		
		random=r.nextDouble();
		
		
		for (int i = 0; i < NodosBuenos.size(); i++) {
		
			caminos += (camino[nodo][NodosBuenos.get(i)] / evaluacion);
		
			
			//Si el random está en el rango
			if ( random < caminos ) {
					nodo_siguiente = NodosBuenos.get(i);
				break;
			}	
		}
		
		Nodos_visitados.add(nodo_siguiente);
		// eliminar de la matriz temporal la columna actual
		for (int i = 0; i < matriz_temporal[nodo].length; i++) {  
			matriz_temporal[i][nodo]=-1;
		}
		
		NodosBuenos.clear();
		
		if (nodo_siguiente==-1) {
		   
		}
		else{
			variacion_camino=(matriz[nodo][nodo_siguiente]*0.01);
		}
		
		if (nodo_siguiente==-1) {
			
			for (int i = 0; i < camino.length; i++) {
				
				for (int j = 0; j < camino.length; j++) {
					
					camino[i][j]=camino_antes[i][j];
					
				}
				
			}
			
		}
		else{
			
			for (int i = 1; i < Nodos_visitados.size(); i++) {
				
				if (Nodos_visitados.get(i-1)==nodo && Nodos_visitados.get(i)==nodo_siguiente) {
					
					camino[Nodos_visitados.get(i-1)][Nodos_visitados.get(i)]+=1;
					
				}
				else{
					
					camino[Nodos_visitados.get(i-1)][Nodos_visitados.get(i)]-=variacion_camino;
					
				}
				
			}
			
		}
		if(nodo_siguiente==-1){
			
		}
		else{
		indice=matriz[nodo][nodo_siguiente];
		costo=costo + indice;
		}
		nodo=nodo_siguiente;
		
		return nodo_siguiente;
	}
}
