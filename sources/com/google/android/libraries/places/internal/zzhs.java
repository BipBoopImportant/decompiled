package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

final class zzhs implements Parcelable.Creator {
    zzhs() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Class<zzia> cls = zzia.class;
        AutocompleteActivityMode autocompleteActivityMode = (AutocompleteActivityMode) parcel.readParcelable(cls.getClassLoader());
        zzkh zzj = zzkh.zzj(parcel.readArrayList(Place.Field.class.getClassLoader()));
        zzhy zzhy = (zzhy) parcel.readParcelable(cls.getClassLoader());
        String str = null;
        String readString = parcel.readInt() == 0 ? parcel.readString() : null;
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        }
        Class<String> cls2 = String.class;
        return new zzht(autocompleteActivityMode, zzj, zzhy, readString, str, (LocationBias) parcel.readParcelable(cls.getClassLoader()), (LocationRestriction) parcel.readParcelable(cls.getClassLoader()), zzkh.zzj(parcel.readArrayList(cls2.getClassLoader())), (TypeFilter) parcel.readParcelable(cls.getClassLoader()), zzkh.zzj(parcel.readArrayList(cls2.getClassLoader())), parcel.readInt(), parcel.readInt());
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzht[i10];
    }
}
