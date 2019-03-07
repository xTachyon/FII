/**
 * @author Stoica Ioana-Dana on 07-Mar-19
 */

public class Restaurant extends Node implements Payable {

    public Restaurant(String restaurantName, long restaurantLongitude, long restaurantLatitude) {
        super(restaurantName, restaurantLongitude, restaurantLatitude);
    }

    public void setRestaurantName(String restaurantName) {
        this.locationName = restaurantName;
    }

    public void setRestaurantLongitude(long restaurantLongitude) {
        this.locationLongitude = restaurantLongitude;
    }

    public void setRestaurantLatitude(long restaurantLatitude) {
        this.locationLatitude = restaurantLatitude;
    }

    public String getRestaurantName() {
        return locationName;
    }

    public long getRestaurantLongitude() {
        return locationLongitude;
    }

    public long getRestaurantLatitude() {
        return locationLatitude;
    }

}
