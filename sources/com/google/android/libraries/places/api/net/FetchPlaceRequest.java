package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzhc;
import com.google.android.libraries.places.internal.zzkh;
import java.util.List;
import xa.C8960a;

public abstract class FetchPlaceRequest implements zzhc {

    public static abstract class Builder {
        @RecentlyNonNull
        public FetchPlaceRequest build() {
            zza(zzkh.zzj(zzc().getPlaceFields()));
            return zzc();
        }

        @RecentlyNullable
        public abstract C8960a getCancellationToken();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(C8960a aVar);

        @RecentlyNonNull
        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        /* access modifiers changed from: package-private */
        public abstract Builder zza(List list);

        /* access modifiers changed from: package-private */
        public abstract FetchPlaceRequest zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        zze zze = new zze();
        zze.zzb(str);
        zze.zza(list);
        return zze;
    }

    @RecentlyNonNull
    public static FetchPlaceRequest newInstance(@RecentlyNonNull String str, @RecentlyNonNull List<Place.Field> list) {
        return builder(str, list).build();
    }

    @RecentlyNullable
    public abstract C8960a getCancellationToken();

    @RecentlyNonNull
    public abstract List<Place.Field> getPlaceFields();

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();
}
