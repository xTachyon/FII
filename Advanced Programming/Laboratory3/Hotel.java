/**
 * @author Stoica Ioana-Dana on 07-Mar-19
 */

public class Hotel extends Node implements Classifiable {

    public Hotel(String hotelName, long hotelLongitude, long hotelLatitude) {
        super(hotelName, hotelLongitude, hotelLatitude);
    }

    public void setHotelName(String hotelName) {
        this.locationName = hotelName;
    }

    public void setHotelLongitude(long hotelLongitude) {
        this.locationLongitude = hotelLongitude;
    }

    public void setHotelLatitude(long hotelLatitude) {
        this.locationLatitude = hotelLatitude;
    }

    public String getHotelName() {
        return locationName;
    }

    public long getHotelLongitude() {
        return locationLongitude;
    }

    public long getHotelLatitude() {
        return locationLatitude;
    }


}
