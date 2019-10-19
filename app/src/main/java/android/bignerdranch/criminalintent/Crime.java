package android.bignerdranch.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

    private String mTitle;
    private Date mDate;
    private String mPlace;
    private String mDetails;
    private String mSuspect;

    private double mLatitude;
    private double mLongitude;

    private UUID mId;

    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place;
    }

    public String getDetails() {
        return mDetails;
    }

    public void setDetails(String details) {
        mDetails = details;
    }

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public void setLatitude(double latitude) {
        latitude = mLatitude;
    }

    public void setLongitude(double longitude) {
        longitude = mLongitude;
    }
}
