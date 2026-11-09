/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.Scanner;
/**
 *
 * @author Eddy
 */
public class Principal {
    clsLibros[] libros = new clsLibros[100];
    int totalLibros = 0;
    
    
    public void interfaz(){
        System.out.println("Bienvenido al sistema");
        int operacion = 0;
        Scanner leer = new Scanner(System.in);
    
        
     while(operacion != 3){    
        
        System.out.println("1)Agregar libro: ");
        System.out.println("2)Lista de libros");
        System.out.println("3)Salir del sistema");
        System.out.println("Elige una opcion");
        operacion = leer.nextInt();
        
        
        switch (operacion) {
            case 1:
            System.out.println("Agregando libro");
            this.agregarLibros();
            
                break;
            case 2:
            System.out.println("Lista de libros");
            this.listaLibros();
                break;
                      
            case 3:
            System.out.println("Gracias por usar el sistema");
                
                break;
                                                           
            default:
                System.out.print("Numero equivocado");
                
                
                
            }           
        }
    }
    
    public void agregarLibros(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el titulo del libro: ");
        String titulo = leer.nextLine();
        
        System.out.print("Ingresa el nombre del autor: ");
        String autor = leer.nextLine();
        
        
        System.out.print("Ingresa el precio del libro: ");
        double precio = leer.nextDouble();
        
        
        System.out.print("Ingresa paginas del libro: ");
        int paginas =  leer.nextInt();
        
     
        
        clsLibros libro = new
        clsLibros(titulo,autor,precio,paginas);
        
        
        this.libros[this.totalLibros] = libro;
        this.totalLibros ++;
    
    }
    
    
     public void listaLibros(){
         
         System.out.println("+-----------------+-----------------+--------+-----------+-------------------------+");
         System.out.println("| Titulo          | Autor           | Precio | Paginas  |");
         System.out.println("+-----------------+-----------------+--------+-----------+-------------------------+");
         
         if (this.totalLibros > 0){
            for (int i = 0; i < this.totalLibros; i++) {                
                System.out.printf("| %-15s | %-15s | $%4.2f | %-8d |Costo por pagina: ",
                        this.libros[i].titulo,
                        this.libros[i].autor,  
                        this.libros[i].precio,
                        this.libros[i].paginas);
                        
                
                this.CalcularCostoPorPagina(this.libros[i].precio, this.libros[i].paginas);
                        
                                   
            }
            System.out.println("+-----------------+-----------------+--------+-----------+-------------------------+");
        }
        else{
            System.out.println("No existen alumnos registrados"); 
            
        }
    }
     
    public void CalcularCostoPorPagina(double precio, int paginas){
        
        System.out.printf("$%.2f |%n", precio / paginas);
        
                
        
    }
}   
