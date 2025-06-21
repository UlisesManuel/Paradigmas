/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author manugr
 */
public class Usuario {

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    protected String NombreCompleto;
    protected String Usuario;
    protected String Contraseña;

public Usuario(String NombreCompleto,String Usuario,String Contraseña){
    this.NombreCompleto=NombreCompleto;
    this.Usuario=Usuario;
    this.Contraseña=Contraseña;
}


    public String getNombreCompleto() {
        return NombreCompleto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "NombreCompleto=" + NombreCompleto + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + '}';
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }


}

