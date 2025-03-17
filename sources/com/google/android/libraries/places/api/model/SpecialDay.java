package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

public abstract class SpecialDay implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract SpecialDay build();

        @RecentlyNonNull
        public abstract LocalDate getDate();

        public abstract boolean isExceptional();

        @RecentlyNonNull
        public abstract Builder setDate(@RecentlyNonNull LocalDate localDate);

        @RecentlyNonNull
        public abstract Builder setExceptional(boolean z10);
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull LocalDate localDate) {
        zzz zzz = new zzz();
        zzz.setDate(localDate);
        zzz.setExceptional(false);
        return zzz;
    }

    @RecentlyNonNull
    public abstract LocalDate getDate();

    public abstract boolean isExceptional();
}
