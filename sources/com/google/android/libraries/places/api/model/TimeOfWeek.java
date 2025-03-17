package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public abstract class TimeOfWeek implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract TimeOfWeek build();

        @RecentlyNullable
        public abstract LocalDate getDate();

        @RecentlyNonNull
        public abstract DayOfWeek getDay();

        @RecentlyNonNull
        public abstract LocalTime getTime();

        public abstract boolean isTruncated();

        @RecentlyNonNull
        public abstract Builder setDate(LocalDate localDate);

        @RecentlyNonNull
        public abstract Builder setDay(@RecentlyNonNull DayOfWeek dayOfWeek);

        @RecentlyNonNull
        public abstract Builder setTime(@RecentlyNonNull LocalTime localTime);

        @RecentlyNonNull
        public abstract Builder setTruncated(boolean z10);
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull DayOfWeek dayOfWeek, @RecentlyNonNull LocalTime localTime) {
        zzab zzab = new zzab();
        zzab.setDay(dayOfWeek);
        zzab.setTime(localTime);
        zzab.setTruncated(false);
        return zzab;
    }

    @RecentlyNonNull
    public static TimeOfWeek newInstance(@RecentlyNonNull DayOfWeek dayOfWeek, @RecentlyNonNull LocalTime localTime) {
        return builder(dayOfWeek, localTime).build();
    }

    @RecentlyNullable
    public abstract LocalDate getDate();

    @RecentlyNonNull
    public abstract DayOfWeek getDay();

    @RecentlyNonNull
    public abstract LocalTime getTime();

    public abstract boolean isTruncated();
}
