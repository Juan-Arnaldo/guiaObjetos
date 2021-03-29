package com.company;

public class itemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private int precioUnitario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int precioFinal(int cantidad, int precioUnitario) {
        return precioUnitario * cantidad;
    }

    public void mostrarItem(itemVenta i){
        System.out.println("ItemVenta[id:" + i.getId() + ", Descripcion:" + i.getDescripcion() + ", Cantidad:" + i.getCantidad() + ", Precio Unitario:" + i.getPrecioUnitario() + "]");
    }
}
