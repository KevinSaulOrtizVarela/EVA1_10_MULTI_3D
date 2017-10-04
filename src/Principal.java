/**
 * @author 16550549
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        //CUBO (3 DIMENSIONES)
        int aiArreglo3D[][][] = new int[3][3][3];
        // RECORRERLO Y LLENARLO DE ENTEROS
        for (int i = 0; i < 3; i++) { //FILAS
            for (int j = 0; j < 3; j++) { //COLUMNAS
                for (int k = 0; k < 3; k++) { //NIVELES
                    aiArreglo3D[i][j][k] = (int) (Math.random() * 100) + 1;
                }
            }
        }
        //IMPRIMIR
        for (int i = 0; i < 3; i++) { //FILAS
            for (int j = 0; j < 3; j++) { //COLUMNAS
                for (int k = 0; k < 3; k++) { //NIVELES
                    System.out.print("[" + aiArreglo3D[i][j][k] + "]");
                    
                }
            }System.out.println("");
        }
        
    }

}
