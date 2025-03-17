package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzkh;
import java.util.ArrayList;
import java.util.List;

public abstract class OpeningHours implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public OpeningHours build() {
            OpeningHours zza = zza();
            for (String isEmpty : zza.getWeekdayText()) {
                zzjp.zzk(!TextUtils.isEmpty(isEmpty), "WeekdayText must not contain null or empty values.");
            }
            setPeriods(zzkh.zzj(zza.getPeriods()));
            setWeekdayText(zzkh.zzj(zza.getWeekdayText()));
            setSpecialDays(zzkh.zzj(zza.getSpecialDays()));
            return zza();
        }

        @RecentlyNullable
        public abstract HoursType getHoursType();

        @RecentlyNonNull
        public abstract List<Period> getPeriods();

        @RecentlyNonNull
        public abstract List<SpecialDay> getSpecialDays();

        @RecentlyNonNull
        public abstract List<String> getWeekdayText();

        @RecentlyNonNull
        public abstract Builder setHoursType(HoursType hoursType);

        @RecentlyNonNull
        public abstract Builder setPeriods(@RecentlyNonNull List<Period> list);

        @RecentlyNonNull
        public abstract Builder setSpecialDays(@RecentlyNonNull List<SpecialDay> list);

        @RecentlyNonNull
        public abstract Builder setWeekdayText(@RecentlyNonNull List<String> list);

        /* access modifiers changed from: package-private */
        public abstract OpeningHours zza();
    }

    public enum HoursType implements Parcelable {
        ACCESS,
        BREAKFAST,
        BRUNCH,
        DELIVERY,
        DINNER,
        DRIVE_THROUGH,
        HAPPY_HOUR,
        KITCHEN,
        LUNCH,
        ONLINE_SERVICE_HOURS,
        PICKUP,
        SENIOR_HOURS,
        TAKEOUT;
        
        @RecentlyNonNull
        public static final Parcelable.Creator<HoursType> CREATOR = null;

        static {
            CREATOR = new zzbo();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            parcel.writeString(name());
        }
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzm zzm = new zzm();
        zzm.setPeriods(new ArrayList());
        zzm.setSpecialDays(new ArrayList());
        zzm.setWeekdayText(new ArrayList());
        return zzm;
    }

    @RecentlyNullable
    public abstract HoursType getHoursType();

    @RecentlyNonNull
    public abstract List<Period> getPeriods();

    @RecentlyNonNull
    public abstract List<SpecialDay> getSpecialDays();

    @RecentlyNonNull
    public abstract List<String> getWeekdayText();
}
