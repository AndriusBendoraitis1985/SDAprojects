package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5;

public class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
