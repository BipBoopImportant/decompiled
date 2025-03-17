package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzhc;
import com.google.android.libraries.places.internal.zzjp;
import xa.C8960a;

public abstract class IsOpenRequest implements zzhc {

    public static abstract class Builder {
        @RecentlyNonNull
        public IsOpenRequest build() {
            IsOpenRequest zza = zza();
            Place place = zza.getPlace();
            if (place != null) {
                zzjp.zze(place.getId() != null, "Place must have a valid place id.");
            }
            return zza;
        }

        @RecentlyNullable
        public abstract C8960a getCancellationToken();

        @RecentlyNonNull
        public abstract Place getPlace();

        @RecentlyNonNull
        public abstract String getPlaceId();

        public abstract long getUtcTimeMillis();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(C8960a aVar);

        @RecentlyNonNull
        public abstract Builder setPlace(@RecentlyNonNull Place place);

        @RecentlyNonNull
        public abstract Builder setPlaceId(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setUtcTimeMillis(long j10);

        /* access modifiers changed from: package-private */
        public abstract IsOpenRequest zza();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull Place place) {
        zzq zzq = new zzq();
        zzq.setPlace(place);
        zzq.setUtcTimeMillis(System.currentTimeMillis());
        return zzq;
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull Place place) {
        return builder(place).build();
    }

    @RecentlyNullable
    public abstract C8960a getCancellationToken();

    @RecentlyNullable
    public abstract Place getPlace();

    @RecentlyNullable
    public abstract String getPlaceId();

    public abstract long getUtcTimeMillis();

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull Place place, long j10) {
        return builder(place, j10).build();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull Place place, long j10) {
        zzq zzq = new zzq();
        zzq.setPlace(place);
        zzq.setUtcTimeMillis(j10);
        return zzq;
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull String str) {
        return builder(str).build();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzq zzq = new zzq();
        zzq.setPlaceId(str);
        zzq.setUtcTimeMillis(System.currentTimeMillis());
        return zzq;
    }

    @RecentlyNonNull
    public static IsOpenRequest newInstance(@RecentlyNonNull String str, long j10) {
        return builder(str, j10).build();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, long j10) {
        zzq zzq = new zzq();
        zzq.setPlaceId(str);
        zzq.setUtcTimeMillis(j10);
        return zzq;
    }
}
