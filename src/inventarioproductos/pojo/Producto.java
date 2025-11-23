
package inventarioproductos.pojo;

/**
 * clase que representa un producto con sus atributos principales.
 * Incluye id(clave), nombre, precio y cantidad.
 * @author Stephanie
 */

//atributos del producto
public class Producto {
    private int id_producto;
    private String nombre;
    private double precio;
    private int cantidad;

/** Constructor vacío*/    
    public Producto(){
}
/**
 * 
 * Constructor con todos los atributos
 * @param id_producto
 * @param nombre
 * @param precio
 * @param cantidad 
 */
    public Producto(int id_producto,String nombre,double precio, int cantidad){
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
//Getters y Setters

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
/**
 * Devuelve la representación en String del producto
 * @return 
 */
    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
    
    
}
