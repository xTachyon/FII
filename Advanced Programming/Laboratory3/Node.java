/**
 * @author Stoica Ioana-Dana on 07-Mar-19
 */

public abstract class Node {

    protected String locationName;
    protected long locationLongitude;
    protected long locationLatitude;

    public Node(String locationName, long locationLongitude, long locationLatitude) {
        this.locationName = locationName;
        this.locationLongitude = locationLongitude;
        this.locationLatitude = locationLatitude;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public long getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(long locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public long getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(long locationLatitude) {
        this.locationLatitude = locationLatitude;
    }
}


