package L7;

import C7.h;
import C7.i;
import C7.k;
import E7.v;
import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class E<T> implements k<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final C7.h<Long> f38366d = C7.h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final C7.h<Integer> f38367e = C7.h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    private static final f f38368f = new f();

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f38369g = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));

    /* renamed from: a  reason: collision with root package name */
    private final e<T> f38370a;

    /* renamed from: b  reason: collision with root package name */
    private final F7.d f38371b;

    /* renamed from: c  reason: collision with root package name */
    private final f f38372c;

    class a implements h.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f38373a = ByteBuffer.allocate(8);

        a() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f38373a) {
                this.f38373a.position(0);
                messageDigest.update(this.f38373a.putLong(l10.longValue()).array());
            }
        }
    }

    class b implements h.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f38374a = ByteBuffer.allocate(4);

        b() {
        }

        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f38374a) {
                    this.f38374a.position(0);
                    messageDigest.update(this.f38374a.putInt(num.intValue()).array());
                }
            }
        }
    }

    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* renamed from: c */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* renamed from: d */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements e<ByteBuffer> {

        class a extends MediaDataSource {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ByteBuffer f38375a;

            a(ByteBuffer byteBuffer) {
                this.f38375a = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f38375a.limit();
            }

            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= ((long) this.f38375a.limit())) {
                    return -1;
                }
                this.f38375a.position((int) j10);
                int min = Math.min(i11, this.f38375a.remaining());
                this.f38375a.get(bArr, i10, min);
                return min;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        /* renamed from: d */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        /* renamed from: e */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e<T> {
        void a(MediaExtractor mediaExtractor, T t10);

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        /* renamed from: c */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        /* renamed from: d */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    E(F7.d dVar, e<T> eVar) {
        this(dVar, eVar, f38368f);
    }

    public static k<AssetFileDescriptor, Bitmap> c(F7.d dVar) {
        return new E(dVar, new c((a) null));
    }

    public static k<ByteBuffer, Bitmap> d(F7.d dVar) {
        return new E(dVar, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever) && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(180.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        return bitmap;
    }

    private Bitmap f(T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, m mVar) {
        if (!l(t10, mediaMetadataRetriever)) {
            Bitmap h10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || mVar == m.f38401f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, mVar);
            if (h10 == null) {
                h10 = g(mediaMetadataRetriever, j10, i10);
            }
            Bitmap e10 = e(mediaMetadataRetriever, h10);
            if (e10 != null) {
                return e10;
            }
            throw new h();
        }
        throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @TargetApi(27)
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, m mVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i13 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i13;
            }
            float b10 = mVar.b(parseInt, parseInt2, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(((float) parseInt) * b10), Math.round(b10 * ((float) parseInt2)));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        for (String startsWith : f38369g) {
            if (Build.ID.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059 A[Catch:{ all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l(T r6, android.media.MediaMetadataRetriever r7) {
        /*
            r5 = this;
            java.lang.String r0 = "VideoDecoder"
            java.lang.String r1 = android.os.Build.DEVICE
            r2 = 0
            if (r1 == 0) goto L_0x006d
            java.lang.String r3 = ".+_cheets|cheets_.+"
            boolean r1 = r1.matches(r3)
            if (r1 == 0) goto L_0x006d
            r1 = 12
            r3 = 0
            java.lang.String r7 = r7.extractMetadata(r1)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "video/webm"
            boolean r7 = r1.equals(r7)     // Catch:{ all -> 0x0051 }
            if (r7 != 0) goto L_0x001f
            return r2
        L_0x001f:
            android.media.MediaExtractor r7 = new android.media.MediaExtractor     // Catch:{ all -> 0x0051 }
            r7.<init>()     // Catch:{ all -> 0x0051 }
            L7.E$e<T> r1 = r5.f38370a     // Catch:{ all -> 0x004a }
            r1.a(r7, r6)     // Catch:{ all -> 0x004a }
            int r6 = r7.getTrackCount()     // Catch:{ all -> 0x004a }
            r1 = r2
        L_0x002e:
            if (r1 >= r6) goto L_0x004d
            android.media.MediaFormat r3 = r7.getTrackFormat(r1)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "mime"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "video/x-vnd.on2.vp8"
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0047
            r7.release()
            r6 = 1
            return r6
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x002e
        L_0x004a:
            r6 = move-exception
            r3 = r7
            goto L_0x0052
        L_0x004d:
            r7.release()
            goto L_0x0066
        L_0x0051:
            r6 = move-exception
        L_0x0052:
            r7 = 3
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0061
            java.lang.String r7 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r0, r7, r6)     // Catch:{ all -> 0x005f }
            goto L_0x0061
        L_0x005f:
            r6 = move-exception
            goto L_0x0067
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            r3.release()
        L_0x0066:
            return r2
        L_0x0067:
            if (r3 == 0) goto L_0x006c
            r3.release()
        L_0x006c:
            throw r6
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.E.l(java.lang.Object, android.media.MediaMetadataRetriever):boolean");
    }

    public static k<ParcelFileDescriptor, Bitmap> m(F7.d dVar) {
        return new E(dVar, new g());
    }

    public v<Bitmap> a(T t10, int i10, int i11, i iVar) {
        int i12;
        long longValue = ((Long) iVar.c(f38366d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.c(f38367e);
            if (num == null) {
                num = 2;
            }
            m mVar = (m) iVar.c(m.f38403h);
            if (mVar == null) {
                mVar = m.f38402g;
            }
            m mVar2 = mVar;
            MediaMetadataRetriever a10 = this.f38372c.a();
            try {
                this.f38370a.b(a10, t10);
                Bitmap f10 = f(t10, a10, longValue, num.intValue(), i10, i11, mVar2);
                if (i12 < 29) {
                    a10.release();
                }
                return f.f(f10, this.f38371b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    a10.release();
                } else {
                    a10.release();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public boolean b(T t10, i iVar) {
        return true;
    }

    E(F7.d dVar, e<T> eVar, f fVar) {
        this.f38371b = dVar;
        this.f38370a = eVar;
        this.f38372c = fVar;
    }
}
