/**
 * @author Stoica Ioana-Dana on 07-Mar-19
 */

public class Museum extends Node implements Visitable {

    public Museum(String museumName, long museumLongitude, long museumLatitude) {
        super(museumName, museumLongitude, museumLatitude);
    }

    public void setMuseumName(String museumName) {
        this.locationName = museumName;
    }

    public void setMuseumLongitude(long museumLongitude) {
        this.locationLongitude = museumLongitude;
    }

    public void setMuseumLatitude(long museumLatitude) {
        this.locationLatitude = museumLatitude;
    }

    public String getMuseumName() {
        return locationName;
    }

    public long getMuseumLongitude() {
        return locationLongitude;
    }

    public long getMuseumLatitude() {
        return locationLatitude;
    }

}