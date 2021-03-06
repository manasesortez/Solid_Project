package sv.com.devskodigo.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CountryDto {
    public CountryDto(int countryId, String countryName, float countryCoords) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCoords = countryCoords;
    }

    public CountryDto() {}

    private int countryId;
    private String countryName;
    private float countryCoords;
}
