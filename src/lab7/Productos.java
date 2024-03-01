package lab7;

import javax.swing.JOptionPane;

public class Productos {

    public int id, categoria, pasillo, bin;
    public String nombrep;
    public double precio;

    public Productos() {
    }

    public Productos(int id, String nombrep, int categoria, double precio, int pasillo, int bin) {
        this.id = id;
        this.nombrep = nombrep;
        setCategoria(categoria);
        this.precio = precio;
        setPasillo(pasillo);
        setBin(bin);

    }

    public int getId() {
        return id;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getPasillo() {
        return pasillo;
    }

    public int getBin() {
        return bin;
    }

    public String getNombrep() {
        return nombrep;
    }

    public double getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoria(int categoria) {
        if (categoria >= 0 && categoria <= 9) {
            this.categoria = categoria;
        } else {
            JOptionPane.showMessageDialog(null, "El numero debe ser mayor que 0 y menor que 9");
        }
    }

    public void setPasillo(int pasillo) {
        if (pasillo >= 100 && pasillo <= 999) {
            this.pasillo = pasillo;
        } else {
            JOptionPane.showMessageDialog(null, "El numero debe ser de 3 digitos");
        }
    }

    public void setBin(int bin) {
        if (bin >= 100 && bin <= 999) {
            this.bin = bin;
        } else {
            JOptionPane.showMessageDialog(null, "El numero debe ser de 3 digitos");
        }
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos:" + "Id: " + id + "Nombre Producto: " + nombrep + "Categoria: " + categoria + "Precio: " + precio + "Pasillo:" + pasillo + "Bin: " + bin;
    }

}
