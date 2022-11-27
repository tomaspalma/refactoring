package pt.up.fe.ldts.example6;

public class Location {
    private final String latitude;
    private final String longitude;
    private final String name;

    public Location(String latitude, String longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.latitude + "," + this.longitude + " (" + this.name + ")";
    }
}
