package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzhc;
import com.google.android.libraries.places.internal.zzkh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xa.C8960a;

public abstract class FindAutocompletePredictionsRequest implements zzhc {

    public static abstract class Builder {
        @RecentlyNonNull
        public FindAutocompletePredictionsRequest build() {
            setCountries((List<String>) zzkh.zzj(getCountries()));
            setTypesFilter(zzkh.zzj(getTypesFilter()));
            return zza();
        }

        @RecentlyNullable
        public abstract C8960a getCancellationToken();

        @RecentlyNonNull
        public abstract List<String> getCountries();

        @RecentlyNullable
        public abstract LocationBias getLocationBias();

        @RecentlyNullable
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract LatLng getOrigin();

        @RecentlyNullable
        public abstract String getQuery();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @Deprecated
        @RecentlyNullable
        public abstract TypeFilter getTypeFilter();

        @RecentlyNonNull
        public abstract List<String> getTypesFilter();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(C8960a aVar);

        @RecentlyNonNull
        public abstract Builder setCountries(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public Builder setCountries(@RecentlyNonNull String... strArr) {
            return setCountries((List<String>) zzkh.zzk(strArr));
        }

        @RecentlyNonNull
        @Deprecated
        public Builder setCountry(String str) {
            setCountries((List<String>) str == null ? zzkh.zzl() : zzkh.zzm(str));
            return this;
        }

        @RecentlyNonNull
        public abstract Builder setLocationBias(LocationBias locationBias);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setOrigin(LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setQuery(String str);

        @RecentlyNonNull
        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        @RecentlyNonNull
        @Deprecated
        public abstract Builder setTypeFilter(TypeFilter typeFilter);

        @RecentlyNonNull
        public abstract Builder setTypesFilter(@RecentlyNonNull List<String> list);

        /* access modifiers changed from: package-private */
        public abstract FindAutocompletePredictionsRequest zza();
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzi zzi = new zzi();
        zzi.setCountries(new ArrayList());
        zzi.setTypesFilter(new ArrayList());
        return zzi;
    }

    @RecentlyNonNull
    public static FindAutocompletePredictionsRequest newInstance(String str) {
        Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @RecentlyNullable
    public abstract C8960a getCancellationToken();

    @RecentlyNonNull
    public abstract List<String> getCountries();

    @Deprecated
    @RecentlyNullable
    public String getCountry() {
        if (getCountries().size() <= 1) {
            Iterator<T> it = getCountries().iterator();
            return (String) (it.hasNext() ? it.next() : null);
        }
        throw new UnsupportedOperationException("Multiple countries found in this request - use getCountries() instead of getCountry().");
    }

    @RecentlyNullable
    public abstract LocationBias getLocationBias();

    @RecentlyNullable
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract LatLng getOrigin();

    @RecentlyNullable
    public abstract String getQuery();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();

    @Deprecated
    @RecentlyNullable
    public abstract TypeFilter getTypeFilter();

    @RecentlyNonNull
    public abstract List<String> getTypesFilter();
}
