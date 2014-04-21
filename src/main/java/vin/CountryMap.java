package vin;

import java.util.HashMap;

/**
 * @see <a href="http://www.sae.org/standardsdev/groundvehicle/vin.htm">SAE Global Standardization
 * for VIN</a>
 */
public class CountryMap extends HashMap<String, String> {

  private static final String CountryCode[] = {
      "AA-AH", "South Africa",
      "AJ-AN", "Ivory Coast",
      "AP-A0", "not assigned",
      "BA-BE", "Angola",
      "BF-BK", "Kenya",
      "BL-BR", "Tanzania",
      "BS-B0", "not assigned",
      "CA-CE", "Benin",
      "CF-CK", "Malagasy",
      "CL-CR", "Tunisia",
      "CS-C0", "not assigned",
      "DA-DE", "Egypt",
      "DF-DK", "Morocco",
      "DL-DR", "Zambia",
      "DS-D0", "not assigned",
      "EA-EE", "Ethiopia",
      "EF-EK", "Mozambique",
      "EL-E0", "not assigned",
      "FA-FE", "Ghana",
      "FF-FK", "Nigeria",
      "FF-FK", "Madagascar",
      "FL-F0", "not assigned",
      "GA-G0", "not assigned",
      "HA-H0", "not assigned",
      "JA-J0", "Japan",
      "KA-KE", "Sri Lanka",
      "KF-KK", "Israel",
      "KL-KR", "Korea (South)",
      "KS-K0", "not assigned",
      "LA-L0", "China",
      "MA-ME", "India",
      "MF-MK", "Indonesia",
      "ML-MR", "Thailand",
      "MS-M0", "not assigned",
      "NF-NK", "Pakistan",
      "NL-NR", "Turkey",
      "NS-N0", "not assigned",
      "PA-PE", "Philipines",
      "PF-PK", "Singapore",
      "PL-PR", "Malaysia",
      "PS-P0", "not assigned",
      "RA-RE", "United Arab Emirates",
      "RF-RK", "Taiwan",
      "RL-RR", "Vietnam",
      "RS-R0", "not assigned",
      "SA-SM", "Great Britain",
      "SN-ST", "Germany",
      "SU-SZ", "Poland",
      "S1-S0", "not assigned",
      "TA-TH", "Switzerland",
      "TJ-TP", "Czechoslovakia",
      "TR-TV", "Hungary",
      "TW-T1", "Portugal",
      "T2-T0", "not assigned",
      "UA-UG", "not assigned",
      "UH-UM", "Denmark",
      "UN-UT", "Ireland",
      "UU-UZ", "Romania",
      "U1-U4", "not assigned",
      "U5-U7", "Slovakia",
      "U8-U0", "not assigned",
      "VA-VE", "Austria",
      "VF-VR", "France",
      "VS-VW", "Spain",
      "VX-V2", "Yugoslavia",
      "V3-V5", "Croatia",
      "V6-V0", "Estonia",
      "WA-W0", "Germany",
      "XA-XE", "Bulgaria",
      "XF-XK", "Greece",
      "XL-XR", "Netherlands",
      "XS-XW", "U.S.S.R.",
      "XX-X2", "Luxembourg",
      "X3-X0", "Russia",
      "YA-YE", "Belgium",
      "YF-YK", "Finland",
      "YL-YR", "Malta",
      "YS-YW", "Sweden",
      "YX-Y2", "Norway",
      "Y3-Y5", "Belarus",
      "Y6-Y0", "Ukraine",
      "ZA-ZR", "Italy",
      "ZS-ZW", "not assigned",
      "ZX-Z2", "Slovenia",
      "Z3-Z5", "Lithuania",
      "Z6-Z0", "not assigned",
      "1A-10", "United States",
      "2A-20", "Canada",
      "3A-3W", "Mexico",
      "3X-37", "Costa Rica",
      "38-30", "not assigned",
      "4A-40", "United States",
      "5A-50", "United States",
      "6A-6W", "Australia",
      "6X-60", "not assigned",
      "7A-7E", "New Zealand",
      "7F-70", "not assigned",
      "8A-8E", "Argentina",
      "8F-8K", "Chile",
      "8L-8R", "Ecuador",
      "8S-8W", "Peru",
      "8X-82", "Venezuela",
      "83-80", "not assigned",
      "9A-9E", "Brazil",
      "9F-9K", "Colombia",
      "9L-9R", "Paraguay",
      "9S-9W", "Uruguay",
      "9X-92", "Trinidad & Tobago",
      "93-99", "Brazil",
      "90-90", "not assigned",
  };

  public static CountryMap getDefault() {
    CountryMap defaultMap = new CountryMap();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < CountryCode.length; i++) {
      String rangeStr = CountryCode[i++];
      String country = CountryCode[i];
      String rangeStart = rangeStr.substring(1, 2);
      String rangeEnd = rangeStr.substring(4, 5);
      int startIndex = VinConstants.ALPHABET_INDEX.get(rangeStart);
      int endIndex = VinConstants.ALPHABET_INDEX.get(rangeEnd);
      for (int j = startIndex; j <= endIndex; j++) {
        sb.setLength(0);
        sb.append(rangeStr.charAt(0));
        sb.append(VinConstants.ALPHABET_CHARS[j]);
        defaultMap.put(sb.toString(), country);
      }
    }
    return defaultMap;
  }

}
