package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.internal.zzjp;
import com.google.android.libraries.places.internal.zzkh;
import java.util.List;

public abstract class AddressComponent implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public AddressComponent build() {
            AddressComponent zzc = zzc();
            zzjp.zzk(!zzc.getName().isEmpty(), "Name must not be empty.");
            List<String> types = zzc.getTypes();
            for (String isEmpty : types) {
                zzjp.zzk(!TextUtils.isEmpty(isEmpty), "Types must not contain null or empty values.");
            }
            zzb(zzkh.zzj(types));
            return zzc();
        }

        @RecentlyNullable
        public abstract String getShortName();

        @RecentlyNonNull
        public abstract Builder setShortName(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder zzb(List list);

        /* access modifiers changed from: package-private */
        public abstract AddressComponent zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str, @RecentlyNonNull List<String> list) {
        zza zza = new zza();
        zza.zza(str);
        zza.zzb(list);
        return zza;
    }

    @RecentlyNonNull
    public abstract String getName();

    @RecentlyNullable
    public abstract String getShortName();

    @RecentlyNonNull
    public abstract List<String> getTypes();
}
