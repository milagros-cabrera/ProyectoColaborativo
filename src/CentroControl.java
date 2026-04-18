import java.util.ArrayList;
import java.util.List;
/**
 * La clase CentroControl se encarga de gestionar y monitorear una flota de vehículos.
 * Permite registrar nuevas unidades y ejecutar un monitoreo general sobre cada una.
 ** @author ceciliaromero-
 */
public class CentroControl {
    private List<Vehiculo> listaDeVehiculos;

    public CentroControl(){
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v){
        listaDeVehiculos.add(v);
    }
    /**
     * Recorre todos los vehículos registrados y ejecuta su comportamiento de movimiento.
     * 
     * Además, si el vehículo implementa la interfaz IConectable, se sincroniza su GPS.
     * Se utiliza pattern matching con instanceof para evitar casteos explícitos.
     */
    public void monitorearFlota(){
        for(Vehiculo v:listaDeVehiculos){
            v.patronMovimiento();
            if (v instanceof IConectable unidadGps) {
                unidadGps.sincronizarGPS();
            }
        }
    }

}
