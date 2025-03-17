package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public abstract class IsOpenResponse {
    @RecentlyNonNull
    public static IsOpenResponse newInstance(Boolean bool) {
        return new zzt(bool);
    }

    @RecentlyNullable
    public abstract Boolean isOpen();
}
