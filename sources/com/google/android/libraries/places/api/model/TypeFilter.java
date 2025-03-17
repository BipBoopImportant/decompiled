package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

@Deprecated
public enum TypeFilter implements Parcelable {
    ADDRESS,
    CITIES,
    ESTABLISHMENT,
    GEOCODE,
    REGIONS;
    
    @RecentlyNonNull
    public static final Parcelable.Creator<TypeFilter> CREATOR = null;

    static {
        CREATOR = new zzbw();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
