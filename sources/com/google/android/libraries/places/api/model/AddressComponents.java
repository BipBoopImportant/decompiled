package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public abstract class AddressComponents implements Parcelable {
    @RecentlyNonNull
    public static AddressComponents newInstance(@RecentlyNonNull List<AddressComponent> list) {
        return new zzag(list);
    }

    @RecentlyNonNull
    public abstract List<AddressComponent> asList();
}
