package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Place;

public abstract class FetchPlaceResponse {
    @RecentlyNonNull
    public static FetchPlaceResponse newInstance(@RecentlyNonNull Place place) {
        return new zzh(place);
    }

    @RecentlyNonNull
    public abstract Place getPlace();
}
