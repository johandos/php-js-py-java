import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    Integer passenger;
    
    public UberVan(final String license, final Account driver) {
        super(license, driver);
    }

    public UberVan(final String license, final Account driver, final Map<String, Map<String, Integer>> typeCarAccepted,
            final ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public void setPassenger(final Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    
}