package model.enums.peso;

import java.util.Arrays;
import java.util.List;

public enum PesoEnum {
    
    GRAMO("Gramo"),
    DECAGRAMO("Decagramo"),
    KILOGRAMO("Kilogramo"),
    LIBRA("Libra"),
    ONZA("Onza"),
    TONELADA("Tonelada");
    
    private final String dataName;

    
    private PesoEnum(String dataName) {
        this.dataName = dataName;
    }
    
    public String getDataName() {
        return dataName;
    }
    
    public static List<PesoEnum> getAllPesoEnums() {
        return Arrays.asList(PesoEnum.values());
    }

    @Override
    public String toString() {
        return dataName;
    }
    
    
}
