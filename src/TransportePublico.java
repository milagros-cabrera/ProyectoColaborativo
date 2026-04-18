/**
 * La clase TransportePublico representa un tipo de vehículo destinado
 * al traslado de pasajeros, heredando las características generales de Vehiculo.
 ** @author ceciliaromero-
 */
public class TransportePublico extends Vehiculo{
    /**
     * Constructor que inicializa el transporte público con un identificador único.
     * @param id Identificador del vehículo.
     */
    public TransportePublico(int id){
        super(id);
    }
     /**
     * Define el patrón de movimiento específico del transporte público.
     * Este comportamiento sobrescribe el método de la clase base Vehiculo.
     */
    @Override
    public void patronMovimiento(){
        System.out.println("El transporte avanza de forma segura con los pasajeros a bordo.");
    }
}
