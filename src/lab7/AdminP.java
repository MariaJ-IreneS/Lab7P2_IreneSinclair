package lab7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminP {

    private ArrayList<Productos> listaP = new ArrayList();
    private File p = null;

    public AdminP(String path) {
        p = new File(path);
    }

    public ArrayList<Productos> getListaP() {
        return listaP;
    }

    public File getP() {
        return p;
    }

    public void setListaP(ArrayList<Productos> listaP) {
        this.listaP = listaP;
    }

    public void setP(File p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Lista de Porductos: " + listaP;
    }

    public void setProduct(Productos p) {
        this.listaP.add(p);
    }

    public void escribirArchivoTexto() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(p, false);
            bw = new BufferedWriter(fw);
            bw.write("Id,Nombre,Categoria,Precio,Pasillo,Bin\n");
            for (Productos produc : listaP) {
                bw.write(produc.getId() + ",");
                bw.write(produc.getNombrep() + ",");
                bw.write(produc.getCategoria() + ",");
                bw.write(produc.getPrecio() + ",");
                bw.write(produc.getPasillo() + ",");
                bw.write(produc.getBin() + "\n");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        if (!p.exists()) {
            JOptionPane.showMessageDialog(null, "No existe ese archivo, no puede ser cargado.");
        } else {
            try {
                FileReader fileReader = new FileReader(p);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                boolean linea = true;
                while ((line = bufferedReader.readLine()) != null) {
                    if (linea) {
                        linea = false;
                        continue;
                    }
                    String[] parts = line.split(",");
                    listaP.add(new Productos(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5])));
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
