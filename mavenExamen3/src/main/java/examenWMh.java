
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class examenWMh {
     public int[][] cuadradosXnum(int numero){
    int[][] tablaM=new int[numero][2];
        for(int i = 0; i < tablaM.length; i++) {
           tablaM[i][0]=i+1;
           tablaM[i][1]=(i+1)*(i+1);           
        }
        return tablaM;
    }    
    public void sumaDeValoresxParesImpar(){
        int[][]  datos={{3,40,70,30},{50,5,20,4},{60,18,6,10},{16,5,9,7}};
        int par=0, impar=0, todos=0;        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if(datos[i][j]%2==0){
                    par=par+datos[i][j];
                }else{
                    impar=impar+datos[i][j];
                }
                todos=todos+datos[i][j];
            }
        }
        System.out.println("PAR:"+par);
        System.out.println("impar:"+impar);
        System.out.println("todos:"+todos);
     }

   
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public int[][] transformada08(int dimen, int NumInit){
         System.out.println("Ejercicio 8: ");
          int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                   if (j>=i){
                       matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
    
    public int[][] transformada24(int dimen, int NumInit){
         System.out.println("Ejercicio 24: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = matriz[0].length-1; i>=0; i--) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) {
                    matriz[j][i]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = 0; j< matriz.length ; j ++) {
                matriz[j][i]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
    
     public int[][] transformada25(int dimen, int NumInit){
         System.out.println("Ejercicio 25: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = 0; j< matriz.length ; j ++) {
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = matriz[0].length-1; j>=0; j--) {  
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
     
  public int[][] transformada27(int dimen, int NumInit){
        System.out.println("Ejercicio 27: ");
    int cont=0; int[][] matriz=new int[dimen][dimen];
        for (int i = matriz.length-1; i >=0 ; i--) {
            if (cont%2==0){
                for (int j = matriz[0].length-1;j >=0; j--) {
            matriz[i][j]=NumInit;
             NumInit++;
         }
   
         }else{
                 for (int j = 0 ; j < matriz[0].length; j++) {
            matriz[i][j]=NumInit;
            NumInit++;
        }
      }
          cont++;   
   }
     return matriz;
  }
  
   public int[][] transformada35(int xy, int NumInit){
     System.out.println("Ejercicio 35: ");
        int matriz[][] = new int[xy][xy];
        int x,x1,x2,y,y1;
        
        for (x =matriz.length-1;x>=matriz.length/2; x --) {
           for (y =(xy-1)-x ;y<=x;y++) {
               matriz[x][y] = NumInit++;
            }
           for (x1 =y-2;x1>=(xy-1)-x; x1 --) {
               matriz[x1][x]=NumInit++;
           }
            for (y1=y-2; y1>=(xy-1)-x;y1--) {
               matriz[x1+1][y1]=NumInit++; 
            }
            for (x2=y1+2;x2<y-1;x2++){
                matriz[x2][y1+1]=NumInit++;
            }
         }
          return matriz;
   }
  


    public static void main ( String [] args ) {
        examenWMh ag = new  examenWMh ();
        int[][] matriX=ag.cuadradosXnum(10);
        for (int[] matriX1 : matriX) {
            System.out.println(matriX1[0] + "|" + matriX1[1]);
        }
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        System.out.println ( " Resultados de Suma de contenido de Matriz " );
        while (opcion!=0) {            
            switch(opcion){
           
            case 1: ag.imprimirMatriz(ag.transformada08(5, 0)); break;
            case 2: ag.imprimirMatriz(ag.transformada24(5, 0)); break;
            case 3: ag.imprimirMatriz(ag.transformada25(5, 0)); break;
            case 4: ag.imprimirMatriz(ag.transformada27(5, 0)); break;
            case 5: ag.imprimirMatriz(ag.transformada35(5, 0)); break;
           
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
}
