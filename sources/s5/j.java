package S5;

import F5.a;
import GK.C15776D;
import GK.C15777E;
import GK.C15802u;
import HJ.C15854t;
import I5.b;
import N5.n;
import N5.r;
import O5.c;
import O5.h;
import XH.t;
import YH.C16877v;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.f;
import com.google.ar.core.ImageMetadata;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0001*\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0012*\u00020\u0015H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020'*\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010-\u001a\u00020,*\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u00105\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u000201H\u0000¢\u0006\u0004\b5\u00106\" \u0010<\u001a\b\u0012\u0004\u0012\u000208078\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010;\"\u001a\u0010@\u001a\u0002088\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\b>\u0010?\"\u001c\u0010E\u001a\u0004\u0018\u00010A8\u0000X\u0004¢\u0006\f\n\u0004\b5\u0010B\u001a\u0004\bC\u0010D\"\u001a\u0010I\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u0002\u0010F\u001a\u0004\bG\u0010H\"\u0018\u0010N\u001a\u00020K*\u00020J8@X\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M\"\u0018\u0010R\u001a\u00020\u0015*\u00020O8@X\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\"\u0018\u0010T\u001a\u00020\u0015*\u00020O8@X\u0004¢\u0006\u0006\u001a\u0004\bS\u0010Q\"\u0018\u0010W\u001a\u00020\u0012*\u00020O8@X\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V\"\u0018\u0010 \u001a\u00020\u001f*\u00020X8@X\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\"\u001a\u0010]\u001a\u0004\u0018\u00010\u0005*\u00020#8@X\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\\"\u0018\u0010a\u001a\u00020\u0015*\u00020^8@X\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\"\u0018\u0010e\u001a\u00020b*\u00020/8@X\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d\"\u0018\u0010i\u001a\u00020\u0012*\u00020f8@X\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h\"\u0018\u0010m\u001a\u00020j*\u00020f8@X\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Ljava/io/Closeable;", "LXH/N;", "d", "(Ljava/io/Closeable;)V", "Landroid/webkit/MimeTypeMap;", "", "url", "k", "(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;", "LGK/u;", "x", "(LGK/u;)LGK/u;", "LN5/r;", "z", "(LN5/r;)LN5/r;", "LN5/n;", "y", "(LN5/n;)LN5/n;", "", "t", "()Z", "", "defaultValue", "B", "(Ljava/lang/String;I)I", "LF5/a$b;", "a", "(LF5/a$b;)V", "u", "(I)Z", "LO5/c;", "LO5/h;", "scale", "C", "(LO5/c;LO5/h;)I", "Landroid/net/Uri;", "uri", "s", "(Landroid/net/Uri;)Z", "LGK/u$a;", "line", "b", "(LGK/u$a;Ljava/lang/String;)LGK/u$a;", "LGK/D;", "LGK/E;", "A", "(LGK/D;)LGK/E;", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)D", "percent", "c", "(Landroid/content/Context;D)I", "", "Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "q", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Landroid/graphics/ColorSpace;", "Landroid/graphics/ColorSpace;", "l", "()Landroid/graphics/ColorSpace;", "NULL_COLOR_SPACE", "LGK/u;", "g", "()LGK/u;", "EMPTY_HEADERS", "Landroid/view/View;", "LN5/u;", "n", "(Landroid/view/View;)LN5/u;", "requestManager", "Landroid/graphics/drawable/Drawable;", "r", "(Landroid/graphics/drawable/Drawable;)I", "width", "j", "height", "w", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "Landroid/widget/ImageView;", "p", "(Landroid/widget/ImageView;)LO5/h;", "i", "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", "m", "(Landroid/content/res/Configuration;)I", "nightMode", "Ljava/io/File;", "o", "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "LI5/b$a;", "v", "(LI5/b$a;)Z", "isPlaceholderCached", "LB5/c;", "h", "(LI5/b$a;)LB5/c;", "eventListener", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Bitmap.Config[] f39883a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b  reason: collision with root package name */
    private static final Bitmap.Config f39884b = Bitmap.Config.HARDWARE;

    /* renamed from: c  reason: collision with root package name */
    private static final ColorSpace f39885c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final C15802u f39886d = new C15802u.a().f();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39887a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f39888b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f39889c;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        static {
            /*
                E5.e[] r0 = E5.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                E5.e r2 = E5.e.MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                E5.e r3 = E5.e.MEMORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                E5.e r4 = E5.e.DISK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                E5.e r5 = E5.e.NETWORK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f39887a = r0
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f39888b = r0
                O5.h[] r0 = O5.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                O5.h r3 = O5.h.FILL     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                O5.h r1 = O5.h.FIT     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                f39889c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: S5.j.a.<clinit>():void");
        }
    }

    public static final C15777E A(C15776D d10) {
        C15777E c10 = d10.c();
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int B(String str, int i10) {
        Long v10 = C15854t.v(str);
        if (v10 == null) {
            return i10;
        }
        long longValue = v10.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final int C(c cVar, h hVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f39247a;
        }
        int i10 = a.f39889c[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new t();
    }

    public static final void a(a.b bVar) {
        try {
            bVar.k();
        } catch (Exception unused) {
        }
    }

    public static final C15802u.a b(C15802u.a aVar, String str) {
        int r02 = C15854t.r0(str, ':', 0, false, 6, (Object) null);
        if (r02 != -1) {
            String substring = str.substring(0, r02);
            C17542s.i(substring, "substring(...)");
            String obj = C15854t.z1(substring).toString();
            String substring2 = str.substring(r02 + 1);
            C17542s.i(substring2, "substring(...)");
            aVar.e(obj, substring2);
            return aVar;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final int c(Context context, double d10) {
        int i10;
        try {
            Object j10 = C6012a.j(context, ActivityManager.class);
            C17542s.g(j10);
            ActivityManager activityManager = (ActivityManager) j10;
            i10 = (context.getApplicationInfo().flags & ImageMetadata.SHADING_MODE) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i10 = 256;
        }
        double d11 = (double) 1024;
        return (int) (d10 * ((double) i10) * d11 * d11);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object j10 = C6012a.j(context, ActivityManager.class);
            C17542s.g(j10);
            return ((ActivityManager) j10).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f39884b;
    }

    public static final C15802u g() {
        return f39886d;
    }

    public static final B5.c h(b.a aVar) {
        return aVar instanceof I5.c ? ((I5.c) aVar).f() : B5.c.f33148b;
    }

    public static final String i(Uri uri) {
        return (String) C16877v.y0(uri.getPathSegments());
    }

    public static final int j(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final String k(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || C15854t.v0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(C15854t.m1(C15854t.o1(C15854t.w1(C15854t.w1(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final ColorSpace l() {
        return f39885c;
    }

    public static final int m(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: N5.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final N5.u n(android.view.View r3) {
        /*
            int r0 = C5.a.f33729a
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof N5.u
            r2 = 0
            if (r1 == 0) goto L_0x000e
            N5.u r0 = (N5.u) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 != 0) goto L_0x0037
            monitor-enter(r3)
            int r0 = C5.a.f33729a     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r3.getTag(r0)     // Catch:{ all -> 0x0020 }
            boolean r1 = r0 instanceof N5.u     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0022
            r2 = r0
            N5.u r2 = (N5.u) r2     // Catch:{ all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r0 = move-exception
            goto L_0x0035
        L_0x0022:
            if (r2 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0033
        L_0x0026:
            N5.u r0 = new N5.u     // Catch:{ all -> 0x0020 }
            r0.<init>(r3)     // Catch:{ all -> 0x0020 }
            r3.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0020 }
            int r1 = C5.a.f33729a     // Catch:{ all -> 0x0020 }
            r3.setTag(r1, r0)     // Catch:{ all -> 0x0020 }
        L_0x0033:
            monitor-exit(r3)
            goto L_0x0037
        L_0x0035:
            monitor-exit(r3)
            throw r0
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.j.n(android.view.View):N5.u");
    }

    public static final File o(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null");
    }

    public static final h p(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i10 = scaleType == null ? -1 : a.f39888b[scaleType.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? h.FIT : h.FILL;
    }

    public static final Bitmap.Config[] q() {
        return f39883a;
    }

    public static final int r(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean s(Uri uri) {
        return C17542s.e(uri.getScheme(), "file") && C17542s.e(i(uri), "android_asset");
    }

    public static final boolean t() {
        return C17542s.e(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean u(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean v(b.a aVar) {
        return (aVar instanceof I5.c) && ((I5.c) aVar).g();
    }

    public static final boolean w(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof f);
    }

    public static final C15802u x(C15802u uVar) {
        return uVar == null ? f39886d : uVar;
    }

    public static final n y(n nVar) {
        return nVar == null ? n.f39091c : nVar;
    }

    public static final r z(r rVar) {
        return rVar == null ? r.f39107c : rVar;
    }
}
