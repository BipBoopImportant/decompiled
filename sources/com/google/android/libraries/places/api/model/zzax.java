package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;

final class zzax implements Parcelable.Creator {
    zzax() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        Class<Place> cls = Place.class;
        return new zzay(parcel.readInt() == 0 ? parcel.readString() : null, (AddressComponents) parcel2.readParcelable(cls.getClassLoader()), parcel2.readArrayList(cls.getClassLoader()), (Place.BusinessStatus) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (OpeningHours) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LatLng) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, (OpeningHours) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel2.readArrayList(cls.getClassLoader()), (PlusCode) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Double.valueOf(parcel.readDouble()) : null, (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), parcel2.readArrayList(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()), parcel2.readArrayList(cls.getClassLoader()), parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? Integer.valueOf(parcel.readInt()) : null, (LatLngBounds) parcel2.readParcelable(cls.getClassLoader()), (Uri) parcel2.readParcelable(cls.getClassLoader()), (Place.BooleanPlaceAttributeValue) parcel2.readParcelable(cls.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzay[i10];
    }
}
