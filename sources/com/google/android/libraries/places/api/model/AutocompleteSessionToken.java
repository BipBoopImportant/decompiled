package com.google.android.libraries.places.api.model;

import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;

public abstract class AutocompleteSessionToken implements Parcelable {
    @RecentlyNonNull
    public static AutocompleteSessionToken newInstance() {
        return new zzam(new ParcelUuid(UUID.randomUUID()));
    }

    @RecentlyNonNull
    public final String toString() {
        return zza().toString();
    }

    /* access modifiers changed from: package-private */
    public abstract ParcelUuid zza();
}
