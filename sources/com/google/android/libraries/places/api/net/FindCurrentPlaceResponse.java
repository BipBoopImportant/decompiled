package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.internal.zzkh;
import java.util.List;

public abstract class FindCurrentPlaceResponse {
    @RecentlyNonNull
    public static FindCurrentPlaceResponse newInstance(@RecentlyNonNull List<PlaceLikelihood> list) {
        return new zzp(zzkh.zzj(list));
    }

    @RecentlyNonNull
    public abstract List<PlaceLikelihood> getPlaceLikelihoods();
}
