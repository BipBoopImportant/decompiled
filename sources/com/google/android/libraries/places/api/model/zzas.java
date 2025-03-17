package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;
import java.util.List;

final class zzas extends zzn {
    public static final Parcelable.Creator<zzas> CREATOR = new zzar();

    zzas(OpeningHours.HoursType hoursType, List list, List list2, List list3) {
        super(hoursType, list, list2, list3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getHoursType(), i10);
        parcel.writeList(getPeriods());
        parcel.writeList(getSpecialDays());
        parcel.writeList(getWeekdayText());
    }
}
