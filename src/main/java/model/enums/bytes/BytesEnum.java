package model.enums.bytes;

import java.util.Arrays;
import java.util.List;

public enum BytesEnum {
   
    BIT("Bit"),
    BYTE("Byte"),
    KILOBYTE("Kilobyte"),
    MEGABYTE("Megabyte"),
    GIGABYTE("Gigabyte"),
    TERABYTE("Terabyte");
    
    private final String dataName;
    
    
    private BytesEnum(String dataName) {
        this.dataName = dataName;
    }
    
    public static List<BytesEnum> getAllBytesEnums() {
        return Arrays.asList(BytesEnum.values());
    }

    public String getDataName() {
        return dataName;
    }
    
}
