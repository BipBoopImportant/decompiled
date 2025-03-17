package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

final class zzay extends zzt {
    public static final Parcelable.Creator<zzay> CREATOR = new zzax();

    zzay(String str, AddressComponents addressComponents, List list, Place.BusinessStatus businessStatus, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue, OpeningHours openingHours, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue2, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue3, String str2, String str3, Integer num, String str4, String str5, LatLng latLng, String str6, OpeningHours openingHours2, String str7, List list2, PlusCode plusCode, Integer num2, Double d10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue4, List list3, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue5, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue6, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue7, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue8, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue9, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue10, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue11, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue12, List list4, Integer num3, Integer num4, LatLngBounds latLngBounds, Uri uri, Place.BooleanPlaceAttributeValue booleanPlaceAttributeValue13) {
        super(str, addressComponents, list, businessStatus, booleanPlaceAttributeValue, openingHours, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3, str2, str3, num, str4, str5, latLng, str6, openingHours2, str7, list2, plusCode, num2, d10, booleanPlaceAttributeValue4, list3, booleanPlaceAttributeValue5, booleanPlaceAttributeValue6, booleanPlaceAttributeValue7, booleanPlaceAttributeValue8, booleanPlaceAttributeValue9, booleanPlaceAttributeValue10, booleanPlaceAttributeValue11, booleanPlaceAttributeValue12, list4, num3, num4, latLngBounds, uri, booleanPlaceAttributeValue13);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        if (getAddress() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getAddress());
        }
        parcel.writeParcelable(getAddressComponents(), i10);
        parcel.writeList(getAttributions());
        parcel.writeParcelable(getBusinessStatus(), i10);
        parcel.writeParcelable(getCurbsidePickup(), i10);
        parcel.writeParcelable(getCurrentOpeningHours(), i10);
        parcel.writeParcelable(getDelivery(), i10);
        parcel.writeParcelable(getDineIn(), i10);
        if (getEditorialSummary() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummary());
        }
        if (getEditorialSummaryLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getEditorialSummaryLanguageCode());
        }
        if (getIconBackgroundColor() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getIconBackgroundColor().intValue());
        }
        if (getIconUrl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getIconUrl());
        }
        if (getId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getId());
        }
        parcel.writeParcelable(getLatLng(), i10);
        if (getName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getName());
        }
        parcel.writeParcelable(getOpeningHours(), i10);
        if (getPhoneNumber() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPhoneNumber());
        }
        parcel.writeList(getPhotoMetadatas());
        parcel.writeParcelable(getPlusCode(), i10);
        if (getPriceLevel() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getPriceLevel().intValue());
        }
        if (getRating() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getRating().doubleValue());
        }
        parcel.writeParcelable(getReservable(), i10);
        parcel.writeList(getSecondaryOpeningHours());
        parcel.writeParcelable(getServesBeer(), i10);
        parcel.writeParcelable(getServesBreakfast(), i10);
        parcel.writeParcelable(getServesBrunch(), i10);
        parcel.writeParcelable(getServesDinner(), i10);
        parcel.writeParcelable(getServesLunch(), i10);
        parcel.writeParcelable(getServesVegetarianFood(), i10);
        parcel.writeParcelable(getServesWine(), i10);
        parcel.writeParcelable(getTakeout(), i10);
        parcel.writeList(getTypes());
        if (getUserRatingsTotal() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUserRatingsTotal().intValue());
        }
        if (getUtcOffsetMinutes() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getUtcOffsetMinutes().intValue());
        }
        parcel.writeParcelable(getViewport(), i10);
        parcel.writeParcelable(getWebsiteUri(), i10);
        parcel.writeParcelable(getWheelchairAccessibleEntrance(), i10);
    }
}
