/**
 * @author Stoica Ioana-Dana on 07-Mar-19
 */

public class Church extends Node implements Visitable {

    public Church(String churchName, long churchLongitude, long churchLatitude) {
        super(churchName, churchLongitude, churchLatitude);
    }

    public void setChurchName(String churchName) {
        this.locationName = churchName;
    }

    public void setChurchLongitude(long churchLongitude) {
        this.locationLongitude = churchLongitude;
    }

    public void setChurchLatitude(long churchLatitude) {
        this.locationLatitude = churchLatitude;
    }

    public String getChurchName() {
        return locationName;
    }

    public long getChurchLongitude() {
        return locationLongitude;
    }

    public long getChurchLatitude() {
        return locationLatitude;
    }


}
