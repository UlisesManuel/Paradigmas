/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import static proyecto.Usuario.*;
/**
 *
 * @author manugr
 */
public class ListaUsers  {
    public static ArrayList<Usuario> UsuariosLista=new ArrayList <>();
    public static void nuevoUsuario(String NombreCompleto, String Usuario,String Contraseña){
        UsuariosLista.add(new Usuario(NombreCompleto,Usuario,Contraseña));
    }
    
    public static int validarRegistro(String usuario) {
    for (int i = 0; i < UsuariosLista.size(); i++) {
        if (UsuariosLista.get(i).Usuario.equals(usuario)) {
            return i;
        }
    }
    return -1;
    }
      public static boolean existeUsuario(String username) {
    for (Usuario u : UsuariosLista) {
        if (u.Usuario.equals(username)) {
            return true;
        }
    }
    return false;
}
    public static boolean validarLogin(String usuario, String contraseña) {
    for (Usuario u : UsuariosLista) {
        if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
            return true;
        }
    }
    return false;
}
    public static ArrayList<Comida> comidaList=new ArrayList <>();
    public static void nuevaComida(int id,String nombre,double precio,String tipo){
        comidaList.add(new Comida(id,nombre,precio,tipo));
    }
    public static boolean existeComidaIDyTipo(int id, String tipo) {
    for (Comida c : comidaList) {
        if (c.getId() == id && c.getTipo().equalsIgnoreCase(tipo)) {
            return true;
        }
    }
    return false;
}
    public static int validarComida(String nom) {
    for (int i = 0; i < comidaList.size(); i++) {
        if (comidaList.get(i).nombre.equals(nom)) {
            return i;
        }
    }
    return -1;
    }
    
    
    public class Pedidos {

    LinkedList<Map.Entry<String, Double>> pedido = new LinkedList<>();

    public void agregar(String comida, double precio) {
        pedido.add(new AbstractMap.SimpleEntry<>(comida, precio));
    }

    public void eliminar(String comida) {
        for (int i = 0; i < pedido.size(); i++) {
            if (pedido.get(i).getKey().equalsIgnoreCase(comida)) {
                pedido.remove(i);
                break;
            }
        }
    }
    
    public double total(){
        double suma=0;
        for(int i=0; i<pedido.size(); i++){
            suma+=pedido.get(i).getValue();
         }
        return suma;
    }
      

}
    
}


    

  
