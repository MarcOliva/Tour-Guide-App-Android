package oliva.marc.com.tourguide;

/**
 * Created by ThinkSoft on 22/11/2017.
 */

public class Attraction {
    private static final int NO_IMAGE =-1 ;
    private int mImageResourceId = NO_IMAGE;
    private String mTitle;
    private String mDescription;

    public Attraction(String title, String description, int imageResourceId){
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescription = description;
    }
    public Attraction(String title, String description){
        mTitle = title;
        mDescription = description;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTitle() {
        return mTitle;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE;
    }
}
