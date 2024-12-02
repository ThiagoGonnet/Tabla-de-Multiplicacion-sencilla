import java.util.Scanner;

class Foranidado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mult;
    int max;
    
    System.out.println("Ingresa el máximo de tablas de multiplicación que quieres mostrar: ");
    max = scanner.nextInt();  // Usa nextInt() para leer un número entero

    // Imprimir las tablas de multiplicación
    for (int i = 1; i <= max; i++) {
      for (int j = 1; j <= 10; j++) {
        mult = i * j;
        System.out.println(i + " * " + j + " = " + mult); 
      }
      System.out.println();  // Salto de línea después de cada tabla
    }
    
    scanner.close();  // Cerrar el scanner cuando ya no se necesite
  }
}
