package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzju;
import com.google.android.libraries.places.internal.zzkt;
import java.util.Arrays;
import java.util.Locale;

public abstract class LocalDate implements Parcelable, Comparable<LocalDate> {
    @RecentlyNonNull
    public static LocalDate newInstance(int i10, int i11, int i12) {
        zzi zzi = new zzi();
        zzi.zzc(i10);
        zzi.zzb(i11);
        zzi.zza(i12);
        LocalDate zzd = zzi.zzd();
        int month = zzd.getMonth();
        zzkt zzb = zzkt.zzb(1, 12);
        Integer valueOf = Integer.valueOf(month);
        zzjp.zzg(zzb.zzd(valueOf), "Month must not be out of range of 1 to 12, but was: %s.", month);
        int day = zzd.getDay();
        zzkt zzb2 = zzkt.zzb(1, 31);
        Integer valueOf2 = Integer.valueOf(day);
        zzjp.zzg(zzb2.zzd(valueOf2), "Day must not be out of range of 1 to 31, but was: %s.", day);
        if (!Arrays.asList(new Integer[]{4, 6, 9, 11}).contains(valueOf) || zzkt.zzb(1, 30).zzd(valueOf2)) {
            if (month == 2) {
                int year = zzd.getYear();
                zzjp.zzh(zzkt.zzb(1, Integer.valueOf(year % 4 == 0 ? 29 : 28)).zzd(valueOf2), "%s is not a valid day for month %s in year %s.", valueOf2, 2, Integer.valueOf(year));
            }
            return zzd;
        }
        throw new IllegalArgumentException(zzju.zza("%s is not a valid day for month %s.", valueOf2, valueOf));
    }

    public int compareTo(@RecentlyNonNull LocalDate localDate) {
        int day;
        int day2;
        zzjp.zzc(localDate, "dateToCompare must not be null.");
        if (this == localDate) {
            return 0;
        }
        if (getYear() != localDate.getYear()) {
            day = getYear();
            day2 = localDate.getYear();
        } else if (getMonth() != localDate.getMonth()) {
            day = getMonth();
            day2 = localDate.getMonth();
        } else {
            day = getDay();
            day2 = localDate.getDay();
        }
        return day - day2;
    }

    public abstract int getDay();

    public abstract int getMonth();

    public abstract int getYear();

    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", new Object[]{Integer.valueOf(getYear()), String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(getMonth())}), String.format(Locale.getDefault(), "%02d", new Object[]{Integer.valueOf(getDay())})});
    }
}
