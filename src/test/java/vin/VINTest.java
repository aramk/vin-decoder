package vin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VINTest {

  @Test
  public void testCreate() {
    VIN vin = new VIN("1J4FF68S5XL503754");
    assertEquals(vin.getYear(), 1999);
    assertEquals(vin.getSerialNumber(), "503754");
    assertEquals(vin.getCountryCode(), "1J");
    assertEquals(vin.getCountry(), "United States");
    assertEquals(vin.isLess500(), false);
    assertEquals(vin.getVdsCode(), "FF68S");
    assertEquals(vin.getWMICode(), "1J4");
    assertEquals(vin.getPlantCode(), "L");
    assertEquals(vin.getManufacturerCode(), "J4");
  }

}
