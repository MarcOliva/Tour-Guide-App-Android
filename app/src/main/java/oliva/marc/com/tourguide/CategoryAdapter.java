package oliva.marc.com.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ThinkSoft on 22/11/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(android.support.v4.app.FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new GastronomyFragment();
            case 1: return new TouristAttractionsFragment();
            case 2: return new CitiesDistanceFragment();
            case 3: return new TouristCalendarFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return mContext.getString(R.string.category_gastronomy);
            case 1: return mContext.getString(R.string.category_tourist_attraction);
            case 2: return mContext.getString(R.string.category_cities_distance);
            case 3: return mContext.getString(R.string.category_tourist_calendar);
            default: return null;
        }
    }
}
