package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzkt;

public abstract class PlaceLikelihood implements Parcelable {
    public static final double LIKELIHOOD_MAX_VALUE = 1.0d;
    public static final double LIKELIHOOD_MIN_VALUE = 0.0d;

    @RecentlyNonNull
    public static PlaceLikelihood newInstance(@RecentlyNonNull Place place, double d10) {
        Double valueOf = Double.valueOf(0.0d);
        Double valueOf2 = Double.valueOf(1.0d);
        zzkt zzb = zzkt.zzb(valueOf, valueOf2);
        Double valueOf3 = Double.valueOf(d10);
        zzjp.zzh(zzb.zzd(valueOf3), "Likelihood must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, valueOf3);
        return new zzba(place, d10);
    }

    public abstract double getLikelihood();

    @RecentlyNonNull
    public abstract Place getPlace();
}
