package vin;

import java.util.HashMap;

/**
 * @see <a href="http://www.sae.org/standardsdev/groundvehicle/vin.htm">SAE Global Standardization
 * for VIN</a>
 */
public class ManufacturerMap extends HashMap<String, String> {

  private static final String ManufacturerCodes[] = {
      "AL", "British Leyland Rover Group",
      "AU", "Motor Coach Industries Classic",
      "BA", "Blue Bird bus",
      "BB", "Blue Bird multi-purpose vehicle",
      "BC", "Blue Bird truck",
      "BD", "Blue Bird incomplete vehicle",
      "BE", "Blue Bird",
      "BF", "Blue Bird",
      "BG", "Blue Bird",
      "B1", "Ontario Bus Industries / Orion Bus Industries",
      "DF", "Ferrari SpA Dino",
      "E2", "Van Hool NV",
      "FB", "Ford Motor Company bus (E350/E550)",
      "FC", "Ford Motor Company stripped chassis",
      "FD", "Ford Motor Company incomplete vehicle (cutaway cab)",
      "FE", "Ford Motor Company incomplete vehicle (cutaway cab)",
      "FF", "Ford Motor Company \"glider\" kit (no engine or powertrain)",
      "FF", "Ferrari SpA",
      "FM", "Ford Motor Company multi-purpose vehicle (Explorer)",
      "FT", "Ford Motor Company truck",
      "FY", "Flyer Industries Ltd./New Flyer Industries",
      "GA", "Chevrolet van",
      "GB", "Chevrolet van chasis",
      "GC", "Chevrolet pickup",
      "GD", "General Motors Corporation van chasis",
      "GH", "General Motors Corp. Diesel Division",
      "GJ", "General Motors Corporation van",
      "GN", "Chevrolet Astro/Blazer/Suburban",
      "GT", "General Motors Corp. Sierra pickup",
      "G0", "General Motors Corp. Truck & Coach",
      "G5", "General Motors Corp. Jimmy/Suburban",
      "G9", "Motor Coach Industries Classic",
      "MH", "Mercury incomplete vehicle",
      "M2", "Mercury multi-purpose vehicle",
      "M3", "Mercury incomplete vehicle",
      "M4", "Mercury truck",
      "M8", "Motor Coach Industries highway coaches",
      "NV", "Nova Bus Corporation",
      "N9", "Neoplan USA Corporation North American Bus Industries",
      "PC", "Prevost Car Compagnie",
      "P9", "Prevost Car Compagnie",
      "RK", "Nova Bus Corporation",
      "TU", "Transportation Manufacturing Corporation",
      "V1", "AB Volvo",
      "VH", "Bus Industries of America",
      "G1", "Chevrolet",
      "L1", "Chevrolet",
      "G2", "Pontiac",
      "Y2", "Pontiac",
      "G2", "Pontiac",
      "L2", "Pontiac",
      "G3", "Oldsmobile",
      "G4", "Buick",
      "G6", "Cadillac",
      "G8", "Saturn",
      "BG", "Chevrolet",
      "AG", "Chevrolet",
      "GG", "Chevrolet",
  };

  public static ManufacturerMap getDefault() {
    ManufacturerMap defaultMap = new ManufacturerMap();
    int len = ManufacturerCodes.length;
    for (int i = 0; i < len; i++) {
      String code = ManufacturerCodes[i++];
      String manufacturer = ManufacturerCodes[i];
      defaultMap.put(code, manufacturer);
    }
    return defaultMap;
  }

}
