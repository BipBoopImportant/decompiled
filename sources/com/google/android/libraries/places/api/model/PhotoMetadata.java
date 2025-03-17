package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzjp;

public abstract class PhotoMetadata implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public PhotoMetadata build() {
            PhotoMetadata zzb = zzb();
            int width = zzb.getWidth();
            boolean z10 = false;
            zzjp.zzl(width >= 0, "Width must not be < 0, but was: %s.", width);
            int height = zzb.getHeight();
            if (height >= 0) {
                z10 = true;
            }
            zzjp.zzl(z10, "Height must not be < 0, but was: %s.", height);
            zzjp.zzk(!TextUtils.isEmpty(zzb.zza()), "PhotoReference must not be null or empty.");
            return zzb;
        }

        @RecentlyNonNull
        public abstract String getAttributions();

        public abstract int getHeight();

        public abstract int getWidth();

        @RecentlyNonNull
        public abstract Builder setAttributions(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setHeight(int i10);

        @RecentlyNonNull
        public abstract Builder setWidth(int i10);

        /* access modifiers changed from: package-private */
        public abstract PhotoMetadata zzb();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzq zzq = new zzq();
        zzq.zza(str);
        zzq.setWidth(0);
        zzq.setHeight(0);
        zzq.setAttributions("");
        return zzq;
    }

    @RecentlyNonNull
    public abstract String getAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    @RecentlyNonNull
    public abstract String zza();
}
