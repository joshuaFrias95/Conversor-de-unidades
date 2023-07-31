package model.enums.temperatura;

import java.util.Arrays;
import java.util.List;

public enum TempEnum {
    
   CELSIUS("Celsius"),
   KELVIN("Kelvin"),
   FAHRENHEIT("Farenheit"),
   NEWTON("Newton");

    
    private final String dataName;

    private TempEnum(String dataName) {
        this.dataName = dataName;
    }

    public String getDataName() {
        return dataName;
    }
    
    public static List<TempEnum> getAllTempEnums() {
        
       return Arrays.asList(TempEnum.values());
        
    }

    @Override
    public String toString() {
        return dataName;
    }
    
    
}
