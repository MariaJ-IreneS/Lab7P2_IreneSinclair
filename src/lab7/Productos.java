package lab7;

public class Productos {

    public int id, categoria, pasillo, bin;
    public String nombrep;
    public double precio;

    public Productos() {
    }

    public Productos(int id, String nombrep, int categoria, double precio, int pasillo, int bin) {
        this.id = id;
        this.nombrep = nombrep;
        this.categoria = categoria;
        this.precio = precio;
        this.pasillo = pasillo;
        this.bin = bin;

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
        this.categoria = categoria;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", categoria=" + categoria + ", pasillo=" + pasillo + ", bin=" + bin + ", nombrep=" + nombrep + ", precio=" + precio + '}';
    }

}
