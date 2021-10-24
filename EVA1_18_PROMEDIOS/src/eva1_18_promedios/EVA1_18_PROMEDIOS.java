/*
        Programa que calcule las edades de cualquier cantidad de grupos
        
        No sabemos cuantos grupos son, ni cuantos alumnos tiene cada grupo
*/
package eva1_18_promedios;

import java.util.Scanner;

public class EVA1_18_PROMEDIOS {
    
    
    public static void main(String[] args) {
        
        Scanner ingresa = new Scanner(System.in);
        int [][] aiGrupos;
        
        // PReguntar al usuario los grupos
        System.out.println("Cuantos grupos son?");
        int iNoGrupos = ingresa.nextInt();
        
        // Este numero de grupos es el numero de filas
        aiGrupos = new int[iNoGrupos][];
        
        // Pasamos por cada fila del array
        for (int i = 0; i < iNoGrupos; i++) {
            // Preguntar el numero de estudieantes
            System.out.println("Para el grupo[" + i + "] Cuants estudiantes son?");
            int iNoEstu = ingresa.nextInt();
            
            // Este numero de estudiantes es el numero de columnas
            // LAs cuales cambian dependiendo del grupo
            aiGrupos[i] = new int[iNoEstu];
            
        }
        
        // Pediremos la edad de cada alumno, de cada grupo
        for (int i = 0; i < aiGrupos.length; i++) {
            
            // Pediremos la edad
            for (int j = 0; j < aiGrupos[i].length; j++) {
                
                System.out.print("Edad del alumno [" + j + "] del grupo [" + i + "] es: ");
                int iNoEdad = ingresa.nextInt();
                aiGrupos[i][j] = iNoEdad;
            }
            System.out.println("");
        }
        int[] aiAcumGrup = new int[aiGrupos.length];
        int iAcumGen = 0;
        for (int i = 0; i < aiAcumGrup.length; i++) {
            aiAcumGrup[i] = 0;
        }
        System.out.println("Las edades de cada grupo son: ");
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.print("Edades grupo " + i + ": ");
            for (int j = 0; j < aiGrupos[i].length; j++) {
                
                System.out.print("[" + aiGrupos[i][j] + "]");
                aiAcumGrup[i] += aiGrupos[i][j];
            }
            System.out.println("");
        }
        System.out.println("A continuacion se imprimiran los promedios de cada grupo");
        for (int i = 0; i < aiGrupos.length; i++) {
            System.out.print("Promedio del grupo " + i + ":");
            double dProm = (double)(aiAcumGrup[i])/(double)(aiGrupos[i].length);
            System.out.println(dProm);
            iAcumGen += dProm;
        }
        double dProm = (double) iAcumGen / (double) aiAcumGrup.length;
        System.out.println("Promedio general de la escuela: " + dProm);
    }
    
}
