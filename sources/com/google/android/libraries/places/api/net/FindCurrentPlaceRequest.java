package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzhc;
import com.google.android.libraries.places.internal.zzkh;
import java.util.List;
import xa.C8960a;

public abstract class FindCurrentPlaceRequest implements zzhc {

    public static abstract class Builder {
        @RecentlyNonNull
        public FindCurrentPlaceRequest build() {
            zza(zzkh.zzj(zzb().getPlaceFields()));
            return zzb();
        }

        @RecentlyNullable
        public abstract C8960a getCancellationToken();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(C8960a aVar);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(List list);

        /* access modifiers changed from: package-private */
        public abstract FindCurrentPlaceRequest zzb();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull List<Place.Field> list) {
        zzm zzm = new zzm();
        zzm.zza(list);
        return zzm;
    }

    @RecentlyNonNull
    public static FindCurrentPlaceRequest newInstance(@RecentlyNonNull List<Place.Field> list) {
        return builder(list).build();
    }

    @RecentlyNullable
    public abstract C8960a getCancellationToken();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();
}
