
package Models;

public class Producto {
    protected String nombre; //Nombre del producto
    protected float precio; 
    protected long codigoBarra;
    protected String categoria;
    
    /*
    public Producto() {
        this.nombre = "";
        this.categoria = "";
        this.precio = 0.0f;
        this.codigoBarra = 001L;
    }
    */
    
    public Producto(String nombre){
        this.nombre = nombre;
    }
    
    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String newName){
        this.nombre = newName;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(){
        this.precio = precio;
    }
    
    public long getCodigoBarras(){
        return this.codigoBarra;
    }
    
    public void setCodigoBarras(long codigoBarra){
        this.codigoBarra = codigoBarra; 
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria; 
    }
    
    public void mostrarProducto() {
        System.out.println("Mostrando producto ...");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Codigo barras: " + this.codigoBarra);
        System.out.println("Categoria:" + this.categoria);
        
    }
    
    

}
