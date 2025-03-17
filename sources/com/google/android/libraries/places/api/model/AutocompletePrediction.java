package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.internal.zzkh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AutocompletePrediction implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public AutocompletePrediction build() {
            AutocompletePrediction zze = zze();
            setPlaceTypes(zzkh.zzj(zze.getPlaceTypes()));
            List zzd = zze.zzd();
            if (zzd != null) {
                zza(zzkh.zzj(zzd));
            }
            List zze2 = zze.zze();
            if (zze2 != null) {
                zzc(zzkh.zzj(zze2));
            }
            List zzf = zze.zzf();
            if (zzf != null) {
                zzd(zzkh.zzj(zzf));
            }
            return zze();
        }

        @RecentlyNullable
        public abstract Integer getDistanceMeters();

        @RecentlyNonNull
        public abstract String getFullText();

        @RecentlyNonNull
        public abstract List<Place.Type> getPlaceTypes();

        @RecentlyNonNull
        public abstract String getPrimaryText();

        @RecentlyNonNull
        public abstract String getSecondaryText();

        @RecentlyNonNull
        public abstract Builder setDistanceMeters(Integer num);

        @RecentlyNonNull
        public abstract Builder setFullText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setPlaceTypes(@RecentlyNonNull List<Place.Type> list);

        @RecentlyNonNull
        public abstract Builder setPrimaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setSecondaryText(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder zza(List list);

        @RecentlyNonNull
        public abstract Builder zzc(List list);

        @RecentlyNonNull
        public abstract Builder zzd(List list);

        /* access modifiers changed from: package-private */
        public abstract AutocompletePrediction zze();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzd zzd = new zzd();
        zzd.zzb(str);
        zzd.setPlaceTypes(new ArrayList());
        zzd.setFullText("");
        zzd.setPrimaryText("");
        zzd.setSecondaryText("");
        return zzd;
    }

    private static final SpannableString zzg(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (!(str.length() == 0 || characterStyle == null || list == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbk zzbk = (zzbk) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzbk.zzb(), zzbk.zzb() + zzbk.zza(), 0);
            }
        }
        return spannableString;
    }

    @RecentlyNullable
    public abstract Integer getDistanceMeters();

    @RecentlyNonNull
    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    @RecentlyNonNull
    public abstract String getPlaceId();

    @RecentlyNonNull
    public abstract List<Place.Type> getPlaceTypes();

    @RecentlyNonNull
    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    @RecentlyNonNull
    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }

    /* access modifiers changed from: package-private */
    public abstract String zza();

    /* access modifiers changed from: package-private */
    public abstract String zzb();

    /* access modifiers changed from: package-private */
    public abstract String zzc();

    /* access modifiers changed from: package-private */
    public abstract List zzd();

    /* access modifiers changed from: package-private */
    public abstract List zze();

    /* access modifiers changed from: package-private */
    public abstract List zzf();
}
