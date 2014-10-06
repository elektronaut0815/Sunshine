package com.example.android.sunshine.app;

import java.util.ArrayList;
import java.util.List;

public class Forecast {

    private String cod;
    private Double message;
    private City city;
    private Integer cnt;
    private List<DayForecast> list = new ArrayList<DayForecast>();

    public String getCod() {
        return cod;
    }

    public Double getMessage() {
        return message;
    }

    public City getCity() {
        return city;
    }

    public Integer getCnt() {
        return cnt;
    }

    public List<DayForecast> getList() {
        return list;
    }

    public static class City {

        private String id;
        private String name;
        private Coord coord;
        private String country;
        private Integer population;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Coord getCoord() {
            return coord;
        }

        public String getCountry() {
            return country;
        }

        public Integer getPopulation() {
            return population;
        }

    }

    public static class Coord {

        private Double lon;
        private Double lat;

        public Double getLon() {
            return lon;
        }

        public Double getLat() {
            return lat;
        }
    }

    public static class DayForecast {

        private Integer dt;
        private Temp temp;
        private Double pressure;
        private Integer humidity;
        private java.util.List<Weather> weather = new ArrayList<Weather>();
        private Double speed;
        private Integer deg;
        private Integer clouds;
        private Double rain;

        public Integer getDt() {
            return dt;
        }

        public Temp getTemp() {
            return temp;
        }

        public Double getPressure() {
            return pressure;
        }

        public Integer getHumidity() {
            return humidity;
        }

        public java.util.List<Weather> getWeather() {
            return weather;
        }

        public Double getSpeed() {
            return speed;
        }

        public Integer getDeg() {
            return deg;
        }

        public Integer getClouds() {
            return clouds;
        }

        public Double getRain() {
            return rain;
        }
    }

    public static class Temp {

        private Double day;
        private Double min;
        private Double max;
        private Double night;
        private Double eve;
        private Double morn;

        public Double getDay() {
            return day;
        }

        public Double getMin() {
            return min;
        }

        public Double getMax() {
            return max;
        }

        public Double getNight() {
            return night;
        }

        public Double getEve() {
            return eve;
        }

        public Double getMorn() {
            return morn;
        }
    }

    public static class Weather {

        private Integer id;
        private String main;
        private String description;
        private String icon;

        public Integer getId() {
            return id;
        }

        public String getMain() {
            return main;
        }

        public String getDescription() {
            return description;
        }

        public String getIcon() {
            return icon;
        }
    }
}
