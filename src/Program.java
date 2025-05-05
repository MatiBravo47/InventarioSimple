import java.util.Scanner;
public class Program {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        Producto p1 = new Producto();
        
        //p1.setNombre(scn.nextLine()); //No es buena practica
        //p1.setNombre("Coca cola 1.5Lt"); 
        //p1.setPrecio(3000);
        //p1.setCodigoDeBarra(1267492615);
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = scn.nextLine();
        p1.setNombre(nombre);
        //Validacion de entrada
        
        System.out.println("Ingrese el precio del producto");
        float precio = scn.nextFloat();
        p1.setPrecio(precio);
        scn.nextLine();
        
        System.out.println("Ingrese la marca del producto");
        String marca = scn.nextLine();
        p1.setMarca(marca);
        
        System.out.println("Ingrese el codigo de barras de producto");
        long codigoBarra = scn.nextLong();
        p1.setCodigoDeBarra(codigoBarra);
        scn.nextLine();
        
        System.out.println("Datos del producto");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Precio: " + p1.getPrecio());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Codigo de barras: " + p1.getCodigoDeBarra());
        scn.nextLine();
                        
    }
    
}