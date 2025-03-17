package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

final class zzag extends zzc {
    public static final Parcelable.Creator<zzag> CREATOR = new zzaf();

    zzag(List list) {
        super(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(asList());
    }
}
