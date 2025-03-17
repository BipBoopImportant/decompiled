package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.internal.zzhc;
import xa.C8960a;

public abstract class FetchPhotoRequest implements zzhc {

    public static abstract class Builder {
        @RecentlyNonNull
        public FetchPhotoRequest build() {
            PhotoMetadata zza = zza();
            if (getMaxWidth() == null && getMaxHeight() == null) {
                int width = zza.getWidth();
                if (width > 0) {
                    setMaxWidth(Integer.valueOf(width));
                }
                int height = zza.getHeight();
                if (height > 0) {
                    setMaxHeight(Integer.valueOf(height));
                }
            }
            return zzc();
        }

        @RecentlyNullable
        public abstract C8960a getCancellationToken();

        @RecentlyNullable
        public abstract Integer getMaxHeight();

        @RecentlyNullable
        public abstract Integer getMaxWidth();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(C8960a aVar);

        @RecentlyNonNull
        public abstract Builder setMaxHeight(Integer num);

        @RecentlyNonNull
        public abstract Builder setMaxWidth(Integer num);

        /* access modifiers changed from: package-private */
        public abstract PhotoMetadata zza();

        /* access modifiers changed from: package-private */
        public abstract FetchPhotoRequest zzc();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull PhotoMetadata photoMetadata) {
        zza zza = new zza();
        zza.zzb(photoMetadata);
        return zza;
    }

    @RecentlyNonNull
    public static FetchPhotoRequest newInstance(@RecentlyNonNull PhotoMetadata photoMetadata) {
        return builder(photoMetadata).build();
    }

    @RecentlyNullable
    public abstract C8960a getCancellationToken();

    @RecentlyNullable
    public abstract Integer getMaxHeight();

    @RecentlyNullable
    public abstract Integer getMaxWidth();

    @RecentlyNonNull
    public abstract PhotoMetadata getPhotoMetadata();
}
