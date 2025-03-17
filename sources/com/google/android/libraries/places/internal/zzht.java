package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

final class zzht extends zzhr {
    public static final Parcelable.Creator<zzht> CREATOR = new zzhs();

    zzht(AutocompleteActivityMode autocompleteActivityMode, zzkh zzkh, zzhy zzhy, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, zzkh zzkh2, TypeFilter typeFilter, zzkh zzkh3, int i10, int i11) {
        super(autocompleteActivityMode, zzkh, zzhy, str, str2, locationBias, locationRestriction, zzkh2, typeFilter, zzkh3, i10, i11);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(zzh(), i10);
        parcel.writeList(zzj());
        parcel.writeParcelable(zzf(), i10);
        if (zzm() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzm());
        }
        if (zzl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzl());
        }
        parcel.writeParcelable(zzc(), i10);
        parcel.writeParcelable(zzd(), i10);
        parcel.writeList(zzi());
        parcel.writeParcelable(zze(), i10);
        parcel.writeList(zzk());
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}
