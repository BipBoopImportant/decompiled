package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.OpeningHours;
import java.util.List;

abstract class zzn extends OpeningHours {
    private final OpeningHours.HoursType zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;

    zzn(OpeningHours.HoursType hoursType, List list, List list2, List list3) {
        this.zza = hoursType;
        if (list != null) {
            this.zzb = list;
            if (list2 != null) {
                this.zzc = list2;
                if (list3 != null) {
                    this.zzd = list3;
                    return;
                }
                throw new NullPointerException("Null weekdayText");
            }
            throw new NullPointerException("Null specialDays");
        }
        throw new NullPointerException("Null periods");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpeningHours) {
            OpeningHours openingHours = (OpeningHours) obj;
            OpeningHours.HoursType hoursType = this.zza;
            if (hoursType != null ? hoursType.equals(openingHours.getHoursType()) : openingHours.getHoursType() == null) {
                return this.zzb.equals(openingHours.getPeriods()) && this.zzc.equals(openingHours.getSpecialDays()) && this.zzd.equals(openingHours.getWeekdayText());
            }
        }
    }

    public final OpeningHours.HoursType getHoursType() {
        return this.zza;
    }

    public final List<Period> getPeriods() {
        return this.zzb;
    }

    public final List<SpecialDay> getSpecialDays() {
        return this.zzc;
    }

    public final List<String> getWeekdayText() {
        return this.zzd;
    }

    public final int hashCode() {
        OpeningHours.HoursType hoursType = this.zza;
        return (((((((hoursType == null ? 0 : hoursType.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String obj = this.zzb.toString();
        String obj2 = this.zzc.toString();
        String obj3 = this.zzd.toString();
        return "OpeningHours{hoursType=" + valueOf + ", periods=" + obj + ", specialDays=" + obj2 + ", weekdayText=" + obj3 + "}";
    }
}
