package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import xa.C8960a;

final class zza extends FetchPhotoRequest.Builder {
    private Integer zza;
    private Integer zzb;
    private PhotoMetadata zzc;
    private C8960a zzd;

    zza() {
    }

    public final C8960a getCancellationToken() {
        return this.zzd;
    }

    public final Integer getMaxHeight() {
        return this.zzb;
    }

    public final Integer getMaxWidth() {
        return this.zza;
    }

    public final FetchPhotoRequest.Builder setCancellationToken(C8960a aVar) {
        this.zzd = aVar;
        return this;
    }

    public final FetchPhotoRequest.Builder setMaxHeight(Integer num) {
        this.zzb = num;
        return this;
    }

    public final FetchPhotoRequest.Builder setMaxWidth(Integer num) {
        this.zza = num;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final PhotoMetadata zza() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return photoMetadata;
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    /* access modifiers changed from: package-private */
    public final FetchPhotoRequest.Builder zzb(PhotoMetadata photoMetadata) {
        if (photoMetadata != null) {
            this.zzc = photoMetadata;
            return this;
        }
        throw new NullPointerException("Null photoMetadata");
    }

    /* access modifiers changed from: package-private */
    public final FetchPhotoRequest zzc() {
        PhotoMetadata photoMetadata = this.zzc;
        if (photoMetadata != null) {
            return new zzc(this.zza, this.zzb, photoMetadata, this.zzd, (zzb) null);
        }
        throw new IllegalStateException("Missing required properties: photoMetadata");
    }
}
