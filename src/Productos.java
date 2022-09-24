public class Productos {
    String nombre;
    Double Precio;
    Integer Cantidad;

    public Productos(String nombre, Double precio, Integer cantidad) {
        this.nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre+","+Precio+","+Cantidad;

    }
}
