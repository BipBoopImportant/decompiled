package w2;

import H2.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: w2.h  reason: case insensitive filesystem */
public final class C6214h {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f31364a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f31365b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    private static final Object f31366c = new Object();

    /* renamed from: w2.h$a */
    static class a {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* renamed from: w2.h$b */
    static class b {
        static ColorStateList a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* renamed from: w2.h$c */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final ColorStateList f31367a;

        /* renamed from: b  reason: collision with root package name */
        final Configuration f31368b;

        /* renamed from: c  reason: collision with root package name */
        final int f31369c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f31367a = colorStateList;
            this.f31368b = configuration;
            this.f31369c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: w2.h$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Resources f31370a;

        /* renamed from: b  reason: collision with root package name */
        final Resources.Theme f31371b;

        d(Resources resources, Resources.Theme theme) {
            this.f31370a = resources;
            this.f31371b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f31370a.equals(dVar.f31370a) && H2.c.a(this.f31371b, dVar.f31371b);
        }

        public int hashCode() {
            return H2.c.b(this.f31370a, this.f31371b);
        }
    }

    /* renamed from: w2.h$e */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(int i10, Handler handler) {
            e(handler).post(new C6216j(this, i10));
        }

        public final void d(Typeface typeface, Handler handler) {
            e(handler).post(new C6215i(this, typeface));
        }

        /* renamed from: h */
        public abstract void f(int i10);

        /* renamed from: i */
        public abstract void g(Typeface typeface);
    }

    /* renamed from: w2.h$f */
    public static final class f {

        /* renamed from: w2.h$f$a */
        static class a {

            /* renamed from: a  reason: collision with root package name */
            private static final Object f31372a = new Object();

            /* renamed from: b  reason: collision with root package name */
            private static Method f31373b;

            /* renamed from: c  reason: collision with root package name */
            private static boolean f31374c;

            @SuppressLint({"BanUncheckedReflection"})
            static void a(Resources.Theme theme) {
                synchronized (f31372a) {
                    if (!f31374c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", (Class[]) null);
                            f31373b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        f31374c = true;
                    }
                    Method method = f31373b;
                    if (method != null) {
                        try {
                            method.invoke(theme, (Object[]) null);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            f31373b = null;
                        }
                    }
                }
            }
        }

        /* renamed from: w2.h$f$b */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    private static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f31366c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = f31365b;
                SparseArray sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i10, new c(colorStateList, dVar.f31370a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r2.f31369c == r5.hashCode()) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList b(w2.C6214h.d r5, int r6) {
        /*
            java.lang.Object r0 = f31366c
            monitor-enter(r0)
            java.util.WeakHashMap<w2.h$d, android.util.SparseArray<w2.h$c>> r1 = f31365b     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0045
            int r2 = r1.size()     // Catch:{ all -> 0x0032 }
            if (r2 <= 0) goto L_0x0045
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0032 }
            w2.h$c r2 = (w2.C6214h.c) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0045
            android.content.res.Configuration r3 = r2.f31368b     // Catch:{ all -> 0x0032 }
            android.content.res.Resources r4 = r5.f31370a     // Catch:{ all -> 0x0032 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x0042
            android.content.res.Resources$Theme r5 = r5.f31371b     // Catch:{ all -> 0x0032 }
            if (r5 != 0) goto L_0x0034
            int r3 = r2.f31369c     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            goto L_0x0034
        L_0x0032:
            r5 = move-exception
            goto L_0x0048
        L_0x0034:
            if (r5 == 0) goto L_0x0042
            int r3 = r2.f31369c     // Catch:{ all -> 0x0032 }
            int r5 = r5.hashCode()     // Catch:{ all -> 0x0032 }
            if (r3 != r5) goto L_0x0042
        L_0x003e:
            android.content.res.ColorStateList r5 = r2.f31367a     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return r5
        L_0x0042:
            r1.remove(r6)     // Catch:{ all -> 0x0032 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            r5 = 0
            return r5
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6214h.b(w2.h$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, (e) null, (Handler) null, false, true);
    }

    public static ColorStateList d(Resources resources, int i10, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b10 = b(dVar, i10);
        if (b10 != null) {
            return b10;
        }
        ColorStateList k10 = k(resources, i10, theme);
        if (k10 == null) {
            return b.a(resources, i10, theme);
        }
        a(dVar, i10, k10, theme);
        return k10;
    }

    public static Drawable e(Resources resources, int i10, Resources.Theme theme) {
        return a.a(resources, i10, theme);
    }

    public static Drawable f(Resources resources, int i10, int i11, Resources.Theme theme) {
        return a.b(resources, i10, i11, theme);
    }

    public static Typeface g(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, new TypedValue(), 0, (e) null, (Handler) null, false, false);
    }

    public static Typeface h(Context context, int i10, TypedValue typedValue, int i11, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i10, typedValue, i11, eVar, (Handler) null, true, false);
    }

    public static void i(Context context, int i10, e eVar, Handler handler) {
        i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
            return;
        }
        m(context, i10, new TypedValue(), 0, eVar, handler, false, false);
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = f31364a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList k(Resources resources, int i10, Resources.Theme theme) {
        if (l(resources, i10)) {
            return null;
        }
        try {
            return C6209c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean l(Resources resources, int i10) {
        TypedValue j10 = j();
        resources.getValue(i10, j10, true);
        int i11 = j10.type;
        return i11 >= 28 && i11 <= 31;
    }

    private static Typeface m(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        int i12 = i10;
        resources.getValue(i10, typedValue, true);
        Typeface n10 = n(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (n10 != null || eVar != null || z11) {
            return n10;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface n(android.content.Context r16, android.content.res.Resources r17, android.util.TypedValue r18, int r19, int r20, w2.C6214h.e r21, android.os.Handler r22, boolean r23, boolean r24) {
        /*
            r0 = r17
            r1 = r18
            r4 = r19
            r11 = r21
            r12 = r22
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x00c6
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = 0
            r10 = -3
            if (r2 != 0) goto L_0x0024
            if (r11 == 0) goto L_0x0023
            r11.c(r10, r12)
        L_0x0023:
            return r15
        L_0x0024:
            int r2 = r1.assetCookie
            r7 = r20
            android.graphics.Typeface r2 = x2.i.g(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L_0x0034
            if (r11 == 0) goto L_0x0033
            r11.d(r2, r12)
        L_0x0033:
            return r2
        L_0x0034:
            if (r24 == 0) goto L_0x0037
            return r15
        L_0x0037:
            java.lang.String r2 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r2 == 0) goto L_0x007a
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            w2.e$b r2 = w2.C6211e.b(r2, r0)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r2 != 0) goto L_0x005f
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            if (r11 == 0) goto L_0x005e
            r11.c(r10, r12)     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r0 = move-exception
            r15 = r10
            goto L_0x0096
        L_0x005b:
            r0 = move-exception
            r15 = r10
            goto L_0x00ab
        L_0x005e:
            return r15
        L_0x005f:
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x005b, IOException -> 0x0058 }
            r1 = r16
            r3 = r17
            r4 = r19
            r5 = r14
            r7 = r20
            r8 = r21
            r9 = r22
            r15 = r10
            r10 = r23
            android.graphics.Typeface r0 = x2.i.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            return r0
        L_0x0076:
            r0 = move-exception
            goto L_0x0096
        L_0x0078:
            r0 = move-exception
            goto L_0x00ab
        L_0x007a:
            r15 = r10
            int r5 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r14
            r6 = r20
            android.graphics.Typeface r0 = x2.i.e(r1, r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            if (r11 == 0) goto L_0x0095
            if (r0 == 0) goto L_0x0092
            r11.d(r0, r12)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
            goto L_0x0095
        L_0x0092:
            r11.c(r15, r12)     // Catch:{ XmlPullParserException -> 0x0078, IOException -> 0x0076 }
        L_0x0095:
            return r0
        L_0x0096:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto L_0x00bf
        L_0x00ab:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        L_0x00bf:
            if (r11 == 0) goto L_0x00c4
            r11.c(r15, r12)
        L_0x00c4:
            r1 = 0
            return r1
        L_0x00c6:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r19)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C6214h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, w2.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
