package com.sugarcube.app.base.data.asset;

import java.io.OutputStream;
import java.security.MessageDigest;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"com/sugarcube/app/base/data/asset/VideoAssetCacheImpl$md5$digest$1$1$1", "Ljava/io/OutputStream;", "", "b", "LXH/N;", "write", "(I)V", "", "off", "len", "([BII)V", "([B)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoAssetCacheImpl$md5$digest$1$1$1 extends OutputStream {
    final /* synthetic */ MessageDigest $messageDigest;

    VideoAssetCacheImpl$md5$digest$1$1$1(MessageDigest messageDigest) {
        this.$messageDigest = messageDigest;
    }

    public void write(int i10) {
        this.$messageDigest.update(new byte[]{(byte) i10});
    }

    public void write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            this.$messageDigest.update(bArr, i10, i11);
        }
    }

    public void write(byte[] bArr) {
        if (bArr != null) {
            this.$messageDigest.update(bArr);
        }
    }
}
