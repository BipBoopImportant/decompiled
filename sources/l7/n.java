package L7;

import C7.h;
import C7.i;
import C7.j;
import E7.v;
import F7.d;
import L7.m;
import L7.t;
import Y7.g;
import Y7.k;
import Y7.l;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class n {

    /* renamed from: f  reason: collision with root package name */
    public static final h<C7.b> f38405f = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C7.b.DEFAULT);

    /* renamed from: g  reason: collision with root package name */
    public static final h<j> f38406g = h.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final h<m> f38407h = m.f38403h;

    /* renamed from: i  reason: collision with root package name */
    public static final h<Boolean> f38408i;

    /* renamed from: j  reason: collision with root package name */
    public static final h<Boolean> f38409j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set<String> f38410k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l  reason: collision with root package name */
    private static final b f38411l = new a();

    /* renamed from: m  reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f38412m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n  reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f38413n = l.f(0);

    /* renamed from: a  reason: collision with root package name */
    private final d f38414a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f38415b;

    /* renamed from: c  reason: collision with root package name */
    private final F7.b f38416c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageHeaderParser> f38417d;

    /* renamed from: e  reason: collision with root package name */
    private final s f38418e = s.b();

    class a implements b {
        a() {
        }

        public void a(d dVar, Bitmap bitmap) {
        }

        public void b() {
        }
    }

    public interface b {
        void a(d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f38408i = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f38409j = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public n(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, d dVar, F7.b bVar) {
        this.f38417d = list;
        this.f38415b = (DisplayMetrics) k.d(displayMetrics);
        this.f38414a = (d) k.d(dVar);
        this.f38416c = (F7.b) k.d(bVar);
    }

    private static int a(double d10) {
        int l10 = l(d10);
        int x10 = x(((double) l10) * d10);
        return x((d10 / ((double) (((float) x10) / ((float) l10)))) * ((double) x10));
    }

    private void b(t tVar, C7.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        if (!this.f38418e.g(i10, i11, options, z10, z11)) {
            if (bVar != C7.b.PREFER_ARGB_8888) {
                try {
                    z12 = tVar.d().hasAlpha();
                } catch (IOException e10) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                    }
                    z12 = false;
                }
                Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, t tVar, b bVar, d dVar, m mVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int i17;
        int i18;
        ImageHeaderParser.ImageType imageType2 = imageType;
        m mVar2 = mVar;
        int i19 = i11;
        int i20 = i12;
        int i21 = i13;
        int i22 = i14;
        BitmapFactory.Options options2 = options;
        if (i19 > 0 && i20 > 0) {
            if (r(i10)) {
                i15 = i19;
                i16 = i20;
            } else {
                i16 = i19;
                i15 = i20;
            }
            float b10 = mVar2.b(i16, i15, i21, i22);
            if (b10 > 0.0f) {
                m.g a10 = mVar2.a(i16, i15, i21, i22);
                if (a10 != null) {
                    float f10 = (float) i16;
                    float f11 = (float) i15;
                    int x10 = i16 / x((double) (b10 * f10));
                    int x11 = i15 / x((double) (b10 * f11));
                    m.g gVar = m.g.MEMORY;
                    int max = Math.max(1, Integer.highestOneBit(a10 == gVar ? Math.max(x10, x11) : Math.min(x10, x11)));
                    if (a10 == gVar && ((float) max) < 1.0f / b10) {
                        max <<= 1;
                    }
                    options2.inSampleSize = max;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(max, 8);
                        i17 = (int) Math.ceil((double) (f10 / min));
                        i18 = (int) Math.ceil((double) (f11 / min));
                        int i23 = max / 8;
                        if (i23 > 0) {
                            i17 /= i23;
                            i18 /= i23;
                        }
                    } else if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f12 = (float) max;
                        i17 = (int) Math.floor((double) (f10 / f12));
                        i18 = (int) Math.floor((double) (f11 / f12));
                    } else if (imageType.isWebp()) {
                        float f13 = (float) max;
                        i17 = Math.round(f10 / f13);
                        i18 = Math.round(f11 / f13);
                    } else if (i16 % max == 0 && i15 % max == 0) {
                        i17 = i16 / max;
                        i18 = i15 / max;
                    } else {
                        int[] m10 = m(tVar, options2, bVar, dVar);
                        i17 = m10[0];
                        i18 = m10[1];
                    }
                    double b11 = (double) mVar2.b(i17, i18, i21, i22);
                    options2.inTargetDensity = a(b11);
                    options2.inDensity = l(b11);
                    if (s(options)) {
                        options2.inScaled = true;
                    } else {
                        options2.inTargetDensity = 0;
                        options2.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i21 + "x" + i22 + "], power of two scaled: [" + i17 + "x" + i18 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b11 + ", target density: " + options2.inTargetDensity + ", density: " + options2.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i24 = i20;
            int i25 = i19;
            throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + mVar2 + ", source: [" + i25 + "x" + i24 + "], target: [" + i21 + "x" + i22 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType2 + " with target [" + i21 + "x" + i22 + "]");
        }
    }

    private v<Bitmap> d(t tVar, int i10, int i11, i iVar, b bVar) {
        i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f38416c.c(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        C7.b bVar2 = (C7.b) iVar2.c(f38405f);
        j jVar = (j) iVar2.c(f38406g);
        m mVar = (m) iVar2.c(m.f38403h);
        boolean booleanValue = ((Boolean) iVar2.c(f38408i)).booleanValue();
        h hVar = f38409j;
        try {
            return f.f(h(tVar, k10, mVar, bVar2, jVar, iVar2.c(hVar) != null && ((Boolean) iVar2.c(hVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f38414a);
        } finally {
            v(k10);
            this.f38416c.e(bArr);
        }
    }

    private Bitmap h(t tVar, BitmapFactory.Options options, m mVar, C7.b bVar, j jVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        int i13;
        String str;
        int i14;
        ColorSpace colorSpace;
        int i15;
        int i16;
        t tVar2 = tVar;
        BitmapFactory.Options options2 = options;
        b bVar3 = bVar2;
        long b10 = g.b();
        int[] m10 = m(tVar2, options2, bVar3, this.f38414a);
        int i17 = m10[0];
        int i18 = m10[1];
        String str2 = options2.outMimeType;
        boolean z12 = (i17 == -1 || i18 == -1) ? false : z10;
        int c10 = tVar.c();
        int i19 = B.i(c10);
        boolean l10 = B.l(c10);
        int i20 = i10;
        if (i20 == Integer.MIN_VALUE) {
            i13 = i11;
            i12 = r(i19) ? i18 : i17;
        } else {
            i13 = i11;
            i12 = i20;
        }
        int i21 = i13 == Integer.MIN_VALUE ? r(i19) ? i17 : i18 : i13;
        ImageHeaderParser.ImageType d10 = tVar.d();
        c(d10, tVar, bVar2, this.f38414a, mVar, i19, i17, i18, i12, i21, options);
        int i22 = i18;
        int i23 = i17;
        j jVar2 = jVar;
        b bVar4 = bVar3;
        int i24 = c10;
        BitmapFactory.Options options3 = options2;
        String str3 = str2;
        t tVar3 = tVar2;
        b(tVar, bVar, z12, l10, options, i12, i21);
        int i25 = Build.VERSION.SDK_INT;
        if (z(d10)) {
            if (i23 < 0 || i22 < 0 || !z11) {
                float f10 = s(options) ? ((float) options3.inTargetDensity) / ((float) options3.inDensity) : 1.0f;
                int i26 = options3.inSampleSize;
                float f11 = (float) i26;
                i16 = Math.round(((float) ((int) Math.ceil((double) (((float) i23) / f11)))) * f10);
                i15 = Math.round(((float) ((int) Math.ceil((double) (((float) i22) / f11)))) * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + i16 + "x" + i15 + "] for source [" + i23 + "x" + i22 + "], sampleSize: " + i26 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f10);
                }
            } else {
                str = "Downsampler";
                i16 = i12;
                i15 = i21;
            }
            if (i16 > 0 && i15 > 0) {
                y(options3, this.f38414a, i16, i15);
            }
        } else {
            str = "Downsampler";
        }
        if (jVar2 != null) {
            if (i25 >= 28) {
                options3.inPreferredColorSpace = ColorSpace.get((jVar2 != j.DISPLAY_P3 || (colorSpace = options3.outColorSpace) == null || !colorSpace.isWideGamut()) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3);
            } else {
                options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i27 = i(tVar3, options3, bVar4, this.f38414a);
        bVar4.a(this.f38414a, i27);
        if (Log.isLoggable(str, 2)) {
            i14 = i24;
            t(i23, i22, str3, options, i27, i10, i11, b10);
        } else {
            i14 = i24;
        }
        if (i27 == null) {
            return null;
        }
        i27.setDensity(this.f38415b.densityDpi);
        Bitmap m11 = B.m(this.f38414a, i27, i14);
        if (i27.equals(m11)) {
            return m11;
        }
        this.f38414a.c(i27);
        return m11;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap i(L7.t r5, android.graphics.BitmapFactory.Options r6, L7.n.b r7, F7.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.b()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = L7.B.h()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = L7.B.h()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = L7.B.h()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = L7.B.h()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.n.i(L7.t, android.graphics.BitmapFactory$Options, L7.n$b, F7.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (n.class) {
            Queue<BitmapFactory.Options> queue = f38413n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(t tVar, BitmapFactory.Options options, b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        i(tVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.n.s(android.graphics.BitmapFactory$Options):boolean");
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f38413n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, d dVar, int i10, int i11) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config != Bitmap.Config.HARDWARE) {
            Bitmap.Config config2 = options.outConfig;
            if (config2 != null) {
                config = config2;
            }
            options.inBitmap = dVar.e(i10, i11, config);
        }
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public v<Bitmap> e(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i iVar) {
        return d(new t.c(parcelFileDescriptor, this.f38417d, this.f38416c), i10, i11, iVar, f38411l);
    }

    public v<Bitmap> f(InputStream inputStream, int i10, int i11, i iVar, b bVar) {
        return d(new t.b(inputStream, this.f38417d, this.f38416c), i10, i11, iVar, bVar);
    }

    public v<Bitmap> g(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        return d(new t.a(byteBuffer, this.f38417d, this.f38416c), i10, i11, iVar, f38411l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
