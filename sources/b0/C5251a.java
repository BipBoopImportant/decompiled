package b0;

import a0.C4967k;
import a0.d0;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;

/* renamed from: b0.a  reason: case insensitive filesystem */
public final class C5251a {

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, MediaCodecInfo> f22932a = new LruCache<>(10);

    public static MediaCodec a(C4967k kVar) {
        return b(kVar.a());
    }

    private static MediaCodec b(String str) {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e10) {
            throw new d0(e10);
        }
    }

    public static MediaCodecInfo c(C4967k kVar) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        String a10 = kVar.a();
        LruCache<String, MediaCodecInfo> lruCache = f22932a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(a10);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodec = b(a10);
            try {
                MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(a10, codecInfo);
                }
                mediaCodec.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodec = null;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw th;
        }
    }
}
