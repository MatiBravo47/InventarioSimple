public class Producto {
    
    private String nombre;
    private float precio;
    private long codigoDeBarra;
    private String marca;
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String newName) {
        this.nombre = newName;
    }
    
    public float getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(float newPrecio){
        this.precio = newPrecio;
    }
    
    public long getCodigoDeBarra(){
        return this.codigoDeBarra;
    }
    
    public void setCodigoDeBarra(long newCodigoDeBarra){
        this.codigoDeBarra = newCodigoDeBarra;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String newMarca){
        this.marca = newMarca;
    };
    
    public Producto(String nombre, String marca, float precio, long codigoDeBarra){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigoDeBarra = codigoDeBarra;
    }
    
    public Producto(){};
}
