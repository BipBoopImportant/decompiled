package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.vectordrawable.graphics.drawable.f;
import j0.C5444A;
import j0.C5468y;
import j0.b0;
import j0.c0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import l.C5504a;
import org.xmlpull.v1.XmlPullParser;
import u2.C6012a;
import y2.C6260a;

public final class D {

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f16176h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    private static D f16177i;

    /* renamed from: j  reason: collision with root package name */
    private static final a f16178j = new a(6);

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, c0<ColorStateList>> f16179a;

    /* renamed from: b  reason: collision with root package name */
    private b0<String, b> f16180b;

    /* renamed from: c  reason: collision with root package name */
    private c0<String> f16181c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, C5468y<WeakReference<Drawable.ConstantState>>> f16182d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f16183e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16184f;

    /* renamed from: g  reason: collision with root package name */
    private c f16185g;

    private static class a extends C5444A<Integer, PorterDuffColorFilter> {
        public a(int i10) {
            super(i10);
        }

        private static int m(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter n(int i10, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) d(Integer.valueOf(m(i10, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter o(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) f(Integer.valueOf(m(i10, mode)), porterDuffColorFilter);
        }
    }

    private interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface c {
        Drawable a(D d10, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    private synchronized boolean a(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C5468y yVar = this.f16182d.get(context);
            if (yVar == null) {
                yVar = new C5468y();
                this.f16182d.put(context, yVar);
            }
            yVar.k(j10, new WeakReference(constantState));
            return true;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private void b(Context context, int i10, ColorStateList colorStateList) {
        if (this.f16179a == null) {
            this.f16179a = new WeakHashMap<>();
        }
        c0 c0Var = this.f16179a.get(context);
        if (c0Var == null) {
            c0Var = new c0();
            this.f16179a.put(context, c0Var);
        }
        c0Var.a(i10, colorStateList);
    }

    private void c(Context context) {
        if (!this.f16184f) {
            this.f16184f = true;
            Drawable i10 = i(context, C5504a.f25300a);
            if (i10 == null || !p(i10)) {
                this.f16184f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static long d(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable e(Context context, int i10) {
        if (this.f16183e == null) {
            this.f16183e = new TypedValue();
        }
        TypedValue typedValue = this.f16183e;
        context.getResources().getValue(i10, typedValue, true);
        long d10 = d(typedValue);
        Drawable h10 = h(context, d10);
        if (h10 != null) {
            return h10;
        }
        c cVar = this.f16185g;
        Drawable a10 = cVar == null ? null : cVar.a(this, context, i10);
        if (a10 != null) {
            a10.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d10, a10);
        }
        return a10;
    }

    private static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized D g() {
        D d10;
        synchronized (D.class) {
            try {
                if (f16177i == null) {
                    D d11 = new D();
                    f16177i = d11;
                    o(d11);
                }
                d10 = f16177i;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return d10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable h(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, j0.y<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f16182d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            j0.y r0 = (j0.C5468y) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.d(r5)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x002f
        L_0x002a:
            r0.m(r5)     // Catch:{ all -> 0x0028 }
        L_0x002d:
            monitor-exit(r3)
            return r1
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.D.h(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter k(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter n10;
        synchronized (D.class) {
            a aVar = f16178j;
            n10 = aVar.n(i10, mode);
            if (n10 == null) {
                n10 = new PorterDuffColorFilter(i10, mode);
                aVar.o(i10, mode, n10);
            }
        }
        return n10;
    }

    private ColorStateList m(Context context, int i10) {
        c0 c0Var;
        WeakHashMap<Context, c0<ColorStateList>> weakHashMap = this.f16179a;
        if (weakHashMap == null || (c0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c0Var.e(i10);
    }

    private static void o(D d10) {
    }

    private static boolean p(Drawable drawable) {
        return (drawable instanceof f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c A[Catch:{ Exception -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable q(android.content.Context r11, int r12) {
        /*
            r10 = this;
            j0.b0<java.lang.String, androidx.appcompat.widget.D$b> r0 = r10.f16180b
            r1 = 0
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b3
            j0.c0<java.lang.String> r0 = r10.f16181c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.e(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            j0.b0<java.lang.String, androidx.appcompat.widget.D$b> r3 = r10.f16180b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            j0.c0 r0 = new j0.c0
            r0.<init>()
            r10.f16181c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f16183e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f16183e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f16183e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = d(r0)
            android.graphics.drawable.Drawable r6 = r10.h(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00ab
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00ab
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x008f }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x008f }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x008f }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009c
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x008f }
            j0.c0<java.lang.String> r8 = r10.f16181c     // Catch:{ Exception -> 0x008f }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x008f }
            j0.b0<java.lang.String, androidx.appcompat.widget.D$b> r8 = r10.f16180b     // Catch:{ Exception -> 0x008f }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x008f }
            androidx.appcompat.widget.D$b r3 = (androidx.appcompat.widget.D.b) r3     // Catch:{ Exception -> 0x008f }
            if (r3 == 0) goto L_0x0091
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x008f }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x008f }
            goto L_0x0091
        L_0x008f:
            r11 = move-exception
            goto L_0x00a4
        L_0x0091:
            if (r6 == 0) goto L_0x00ab
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x008f }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x008f }
            r10.a(r11, r4, r6)     // Catch:{ Exception -> 0x008f }
            goto L_0x00ab
        L_0x009c:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x008f }
            throw r11     // Catch:{ Exception -> 0x008f }
        L_0x00a4:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00ab:
            if (r6 != 0) goto L_0x00b2
            j0.c0<java.lang.String> r11 = r10.f16181c
            r11.a(r12, r2)
        L_0x00b2:
            return r6
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.D.q(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable u(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList l10 = l(context, i10);
        if (l10 != null) {
            Drawable r10 = C6260a.r(drawable.mutate());
            C6260a.o(r10, l10);
            PorterDuff.Mode n10 = n(i10);
            if (n10 == null) {
                return r10;
            }
            C6260a.p(r10, n10);
            return r10;
        }
        c cVar = this.f16185g;
        if ((cVar == null || !cVar.e(context, i10, drawable)) && !w(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    static void v(Drawable drawable, K k10, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z10 = k10.f16253d;
            if (z10 || k10.f16252c) {
                drawable.setColorFilter(f(z10 ? k10.f16250a : null, k10.f16252c ? k10.f16251b : f16176h, iArr));
            } else {
                drawable.clearColorFilter();
            }
        } else {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
        }
    }

    public synchronized Drawable i(Context context, int i10) {
        return j(context, i10, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable j(Context context, int i10, boolean z10) {
        Drawable q10;
        try {
            c(context);
            q10 = q(context, i10);
            if (q10 == null) {
                q10 = e(context, i10);
            }
            if (q10 == null) {
                q10 = C6012a.e(context, i10);
            }
            if (q10 != null) {
                q10 = u(context, i10, z10, q10);
            }
            if (q10 != null) {
                y.b(q10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return q10;
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList l(Context context, int i10) {
        ColorStateList m10;
        m10 = m(context, i10);
        if (m10 == null) {
            c cVar = this.f16185g;
            m10 = cVar == null ? null : cVar.b(context, i10);
            if (m10 != null) {
                b(context, i10, m10);
            }
        }
        return m10;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode n(int i10) {
        c cVar = this.f16185g;
        if (cVar == null) {
            return null;
        }
        return cVar.d(i10);
    }

    public synchronized void r(Context context) {
        C5468y yVar = this.f16182d.get(context);
        if (yVar != null) {
            yVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable s(Context context, T t10, int i10) {
        try {
            Drawable q10 = q(context, i10);
            if (q10 == null) {
                q10 = t10.a(i10);
            }
            if (q10 == null) {
                return null;
            }
            return u(context, i10, false, q10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void t(c cVar) {
        this.f16185g = cVar;
    }

    /* access modifiers changed from: package-private */
    public boolean w(Context context, int i10, Drawable drawable) {
        c cVar = this.f16185g;
        return cVar != null && cVar.c(context, i10, drawable);
    }
}
