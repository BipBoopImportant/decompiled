package Y7;

import I7.m;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f41022a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f41023b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f41024c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41025a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41025a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41025a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41025a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f41025a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f41025a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Y7.l.a.<clinit>():void");
        }
    }

    private l() {
    }

    public static void a() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(U7.a<?> aVar, U7.a<?> aVar2) {
        return aVar == null ? aVar2 == null : aVar.L(aVar2);
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof m ? ((m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f41022a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> f(int i10) {
        return new ArrayDeque(i10);
    }

    public static int g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * i(config);
    }

    @TargetApi(19)
    public static int h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f41025a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    public static <T> List<T> j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f41024c == null) {
            synchronized (l.class) {
                try {
                    if (f41024c == null) {
                        f41024c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f41024c;
    }

    public static int l(float f10) {
        return m(f10, 17);
    }

    public static int m(float f10, int i10) {
        return o(Float.floatToIntBits(f10), i10);
    }

    public static int n(int i10) {
        return o(i10, 17);
    }

    public static int o(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int p(Object obj, int i10) {
        return o(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int q(boolean z10, int i10) {
        return o(z10 ? 1 : 0, i10);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean t(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean u(int i10, int i11) {
        return t(i10) && t(i11);
    }

    public static void v(Runnable runnable) {
        k().post(runnable);
    }

    public static void w(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String e10;
        char[] cArr = f41023b;
        synchronized (cArr) {
            e10 = e(bArr, cArr);
        }
        return e10;
    }
}
