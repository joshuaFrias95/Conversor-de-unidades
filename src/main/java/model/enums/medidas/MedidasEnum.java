package model.enums.medidas;

import java.util.Arrays;
import java.util.List;

public enum MedidasEnum {
    
    MILIMETROS("Milímetros"),
    CENTIMETROS("Centímetros"),
    DECIMETROS("Decímetros"),
    METROS("Metros"),
    DECÁMETROS("Decámetros"),
    KILOMETROS("Kilómetros");
    
    private final String dataName;

    private MedidasEnum(String dataName) {
        this.dataName = dataName;
    }
    
    public String getDataName() {
        return dataName;
    }
    
    public static List<MedidasEnum> getAllMedidasEnum() {
        return Arrays.asList(MedidasEnum.values());
    }

    @Override
    public String toString() {
        return dataName;
    }
    
    
}
