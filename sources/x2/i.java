package x2;

import C.F;
import E2.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import j0.C5444A;
import java.util.List;
import w2.C6211e;
import w2.C6214h;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final n f31845a;

    /* renamed from: b  reason: collision with root package name */
    private static final C5444A<String, Typeface> f31846b = new C5444A<>(16);

    public static class a extends k.c {

        /* renamed from: a  reason: collision with root package name */
        private C6214h.e f31847a;

        public a(C6214h.e eVar) {
            this.f31847a = eVar;
        }

        public void a(int i10) {
            C6214h.e eVar = this.f31847a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        public void b(Typeface typeface) {
            C6214h.e eVar = this.f31847a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        V4.a.c("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f31845a = new m();
        } else if (i10 >= 28) {
            f31845a = new l();
        } else {
            f31845a = new k();
        }
        V4.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        V4.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f31845a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            V4.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i10) {
        V4.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f31845a.c(context, cancellationSignal, list, i10);
        } finally {
            V4.a.f();
        }
    }

    public static Typeface d(Context context, C6211e.b bVar, Resources resources, int i10, String str, int i11, int i12, C6214h.e eVar, Handler handler, boolean z10) {
        Typeface typeface;
        C6211e.b bVar2 = bVar;
        C6214h.e eVar2 = eVar;
        Handler handler2 = handler;
        if (bVar2 instanceof C6211e.C0484e) {
            C6211e.C0484e eVar3 = (C6211e.C0484e) bVar2;
            Typeface h10 = h(eVar3.d());
            if (h10 != null) {
                if (eVar2 != null) {
                    eVar2.d(h10, handler2);
                }
                return h10;
            }
            typeface = k.c(context, eVar3.a() != null ? F.a(new Object[]{eVar3.c(), eVar3.a()}) : F.a(new Object[]{eVar3.c()}), i12, !z10 ? eVar2 == null : eVar3.b() == 0, z10 ? eVar3.e() : -1, C6214h.e.e(handler), new a(eVar2));
            Resources resources2 = resources;
            int i13 = i12;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f31845a.a(context, (C6211e.c) bVar2, resources, i12);
            if (eVar2 != null) {
                if (typeface != null) {
                    eVar2.d(typeface, handler2);
                } else {
                    eVar2.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f31846b.f(f(resources, i10, str, i11, i12), typeface);
        }
        return typeface;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface d10 = f31845a.d(context, resources, i10, str, i12);
        if (d10 != null) {
            f31846b.f(f(resources, i10, str, i11, i12), d10);
        }
        return d10;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return f31846b.d(f(resources, i10, str, i11, i12));
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
