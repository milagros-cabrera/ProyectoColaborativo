/**
 *Clase abstracta que define la estructura base para cualquier tipo de vehículo.
 *Proporciona un id único y obliga a las subclases a implementar su propio patrón de movimiento.
 ** @author milagros-cabrera
 */

public abstract class Vehiculo {
    private int id;

    public Vehiculo(int id) {
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    //Metodo abstracto que define cómo se mueve el vehículo.
    public abstract void patronMovimiento();
}
