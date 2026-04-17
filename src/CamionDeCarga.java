/**
 * Esta clase representa a un vehículo de tipo camión de carga, el cual mantiene un
 * patrón de movimiento y está monitoreado por GPS.
 ** @author milagros-cabrera
 */
public class CamionDeCarga extends Vehiculo implements IConectable{

    public CamionCarga(int id){
        super(id);
    }
    
    @Override
    public void patronMovimiento(){
        System.out.println("El camion avanza lentamente con la carga.");
    }
    
    @Override
    public void sincronizarGPS(){
        System.out.println("Se monitorea el trayecto del camion de carga");
    }
}
