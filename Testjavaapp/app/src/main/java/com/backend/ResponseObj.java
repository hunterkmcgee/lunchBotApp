package com.backend;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class ResponseObj
{

    public class Category {
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("title")
        @Expose
        private String title;

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

    }

    public class Coordinates {
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("longitude")
        @Expose
        private Double longitude;

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

    }

    public class Hour {

        @SerializedName("open")
        @Expose
        private List<Open> open = new ArrayList<Open>();
        @SerializedName("hours_type")
        @Expose
        private String hoursType;
        @SerializedName("is_open_now")
        @Expose
        private Boolean isOpenNow;

        public List<Open> getOpen() {
            return open;
        }

        public void setOpen(List<Open> open) {
            this.open = open;
        }

        public String getHoursType() {
            return hoursType;
        }

        public void setHoursType(String hoursType) {
            this.hoursType = hoursType;
        }

        public Boolean getIsOpenNow() {
            return isOpenNow;
        }

        public void setIsOpenNow(Boolean isOpenNow) {
            this.isOpenNow = isOpenNow;
        }

    }

    public class Location {
        @SerializedName("address1")
        @Expose
        private String address1;
        @SerializedName("address2")
        @Expose
        private String address2;
        @SerializedName("address3")
        @Expose
        private String address3;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("zip_code")
        @Expose
        private String zipCode;
        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("display_address")
        @Expose
        private List<String> displayAddress = new ArrayList<String>();
        @SerializedName("cross_streets")
        @Expose
        private String crossStreets;

        public String getAddress1() {
            return address1;
        }

        public void setAddress1(String address1) {
            this.address1 = address1;
        }

        public String getAddress2() {
            return address2;
        }

        public void setAddress2(String address2) {
            this.address2 = address2;
        }

        public String getAddress3() {
            return address3;
        }

        public void setAddress3(String address3) {
            this.address3 = address3;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public List<String> getDisplayAddress() {
            return displayAddress;
        }

        public void setDisplayAddress(List<String> displayAddress) {
            this.displayAddress = displayAddress;
        }

        public String getCrossStreets() {
            return crossStreets;
        }

        public void setCrossStreets(String crossStreets) {
            this.crossStreets = crossStreets;
        }



    }


    public class Open {

        @SerializedName("is_overnight")
        @Expose
        private Boolean isOvernight;
        @SerializedName("start")
        @Expose
        private String start;
        @SerializedName("end")
        @Expose
        private String end;
        @SerializedName("day")
        @Expose
        private Integer day;

        public Boolean getIsOvernight() {
            return isOvernight;
        }

        public void setIsOvernight(Boolean isOvernight) {
            this.isOvernight = isOvernight;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        public Integer getDay() {
            return day;
        }

        public void setDay(Integer day) {
            this.day = day;
        }


    }

    public class Req {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image_url")
        @Expose
        private String imageUrl;
        @SerializedName("is_claimed")
        @Expose
        private Boolean isClaimed;
        @SerializedName("is_closed")
        @Expose
        private Boolean isClosed;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("display_phone")
        @Expose
        private String displayPhone;
        @SerializedName("review_count")
        @Expose
        private Integer reviewCount;
        @SerializedName("categories")
        @Expose
        private List<Category> categories = new ArrayList<Category>();
        @SerializedName("rating")
        @Expose
        private Double rating;
        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("coordinates")
        @Expose
        private Coordinates coordinates;
        @SerializedName("photos")
        @Expose
        private List<String> photos = new ArrayList<String>();
        @SerializedName("price")
        @Expose
        private String price;
        @SerializedName("hours")
        @Expose
        private List<Hour> hours = new ArrayList<Hour>();
        @SerializedName("transactions")
        @Expose
        private List<Object> transactions = new ArrayList<Object>();
        @SerializedName("special_hours")
        @Expose
        private List<SpecialHour> specialHours = new ArrayList<SpecialHour>();

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public Boolean getIsClaimed() {
            return isClaimed;
        }

        public void setIsClaimed(Boolean isClaimed) {
            this.isClaimed = isClaimed;
        }

        public Boolean getIsClosed() {
            return isClosed;
        }

        public void setIsClosed(Boolean isClosed) {
            this.isClosed = isClosed;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getDisplayPhone() {
            return displayPhone;
        }

        public void setDisplayPhone(String displayPhone) {
            this.displayPhone = displayPhone;
        }

        public Integer getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(Integer reviewCount) {
            this.reviewCount = reviewCount;
        }

        public List<Category> getCategories() {
            return categories;
        }

        public void setCategories(List<Category> categories) {
            this.categories = categories;
        }

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public List<String> getPhotos() {
            return photos;
        }

        public void setPhotos(List<String> photos) {
            this.photos = photos;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public List<Hour> getHours() {
            return hours;
        }

        public void setHours(List<Hour> hours) {
            this.hours = hours;
        }

        public List<Object> getTransactions() {
            return transactions;
        }

        public void setTransactions(List<Object> transactions) {
            this.transactions = transactions;
        }

        public List<SpecialHour> getSpecialHours() {
            return specialHours;
        }

        public void setSpecialHours(List<SpecialHour> specialHours) {
            this.specialHours = specialHours;
        }

    }

    public class SpecialHour {
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("is_closed")
        @Expose
        private Object isClosed;
        @SerializedName("start")
        @Expose
        private String start;
        @SerializedName("end")
        @Expose
        private String end;
        @SerializedName("is_overnight")
        @Expose
        private Boolean isOvernight;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Object getIsClosed() {
            return isClosed;
        }

        public void setIsClosed(Object isClosed) {
            this.isClosed = isClosed;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        public Boolean getIsOvernight() {
            return isOvernight;
        }

        public void setIsOvernight(Boolean isOvernight) {
            this.isOvernight = isOvernight;
        }

    }
}

