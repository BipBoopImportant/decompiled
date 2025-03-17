package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzkt;

public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    @RecentlyNonNull
    public static LocalTime newInstance(int i10, int i11) {
        try {
            zzk zzk = new zzk();
            zzk.zza(i10);
            zzk.zzb(i11);
            LocalTime zzc = zzk.zzc();
            int hours = zzc.getHours();
            zzjp.zzl(zzkt.zzb(0, 23).zzd(Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = zzc.getMinutes();
            zzjp.zzl(zzkt.zzb(0, 59).zzd(Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return zzc;
        } catch (IllegalStateException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public int compareTo(@RecentlyNonNull LocalTime localTime) {
        int hours;
        int hours2;
        zzjp.zzc(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public abstract int getHours();

    public abstract int getMinutes();
}
