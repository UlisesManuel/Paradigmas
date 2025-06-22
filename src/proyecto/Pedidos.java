    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.*;

/**
 *
 * @author jorge
 */
public class Pedidos {

    LinkedList<Map.Entry<String, Double>> pedido = new LinkedList<>();
    double tot;

    public void agregar(String comida, Double precio) {
        pedido.add(new AbstractMap.SimpleEntry<>(comida, precio));
        
    }

    public void eliminar(String comida) {
        for (int i = 0; i < pedido.size(); i++) {
            if (pedido.get(i).getKey().equalsIgnoreCase(comida)) {
                pedido.remove(i);
                break;
            }
        }
        res();
    }

    public double sum() {
        tot = 0;
        for (int i = 0; i < pedido.size(); i++) {
            tot += pedido.get(i).getValue();
        }
        return tot;
    }
    
        public double res() {
        tot = 0;
        for (int i = 0; i < pedido.size(); i++) {
            tot -= pedido.get(i).getValue();
        }
        return tot;
    }
    
    public void limpiar(){
        pedido.clear();
        tot=0;
    }

}
