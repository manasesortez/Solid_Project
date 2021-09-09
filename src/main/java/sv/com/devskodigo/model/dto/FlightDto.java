package sv.com.devskodigo.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class FlightDto {

    public FlightDto(int flightId, String  flightDescriptor, Date flightDateTimeDep, Date flightDateTimeArr, String flightWeatherRpt, int flightCountryIdDep, int flightCityIdDep,  int flightCityIdArr, int flightCountryIdArr, int flightStatus, int aircfratId, int airlineId, int userId){
        this.flightId = flightId;
        this.flightDescriptor = flightDescriptor;
        this.flightDateTimeDep = flightDateTimeDep;
        this.flightDateTimeArr = flightDateTimeArr;
        this.flightCountryIdDep = flightCountryIdDep;
        this.flightCityIdDep = flightCityIdDep;
        this.flightCityIdArr = flightCityIdArr;
        this.flightCountryIdArr = flightCountryIdArr;
        this.flightStatus = flightStatus;
        this.aircfratId = aircfratId;
        this.airlineId = airlineId;
        this.userId = userId;
    }
    public FlightDto(int anInt, java.sql.Date date, java.sql.Date rsDate, String string, int rsInt, int i, int anInt1, int rsInt1, int i1, int anInt2, int rsInt2, int i2){}

    private int flightId;
    private String flightDescriptor;
    private Date flightDateTimeDep;
    private Date flightDateTimeArr;
    private String flightWeatherRpt;
    private int flightCountryIdDep;
    private int flightCityIdDep;
    private int flightCityIdArr;
    private int flightCountryIdArr;
    private int flightStatus;
    private int aircfratId;
    private int airlineId;
    private int userId;
}
