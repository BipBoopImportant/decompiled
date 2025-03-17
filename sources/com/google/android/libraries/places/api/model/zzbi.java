package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

final class zzbi extends zzac {
    public static final Parcelable.Creator<zzbi> CREATOR = new zzbh();

    zzbi(LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10) {
        super(localDate, dayOfWeek, localTime, z10);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getDate(), i10);
        parcel.writeParcelable(getDay(), i10);
        parcel.writeParcelable(getTime(), i10);
        parcel.writeInt(isTruncated() ? 1 : 0);
    }
}
