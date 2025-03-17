package d2;

import XH.C16807N;
import c2.m;
import j0.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010\u001cR\u0014\u0010#\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\"R.\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010$\u0012\u0004\b)\u0010\u0003\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010,¨\u0006."}, d2 = {"Ld2/b;", "", "<init>", "()V", "Ld2/a;", "start", "end", "", "interpolationPoint", "a", "(Ld2/a;Ld2/a;F)Ld2/a;", "fontScale", "", "d", "(F)I", "key", "e", "(I)F", "scaleKey", "fontScaleConverter", "LXH/N;", "g", "(FLd2/a;)V", "Lj0/c0;", "table", "h", "(Lj0/c0;FLd2/a;)V", "c", "(F)Ld2/a;", "", "f", "(F)Z", "b", "", "[F", "CommonFontSizes", "Lj0/c0;", "getSLookupTables", "()Lj0/c0;", "setSLookupTables", "(Lj0/c0;)V", "getSLookupTables$annotations", "sLookupTables", "", "[Ljava/lang/Object;", "LookupTablesWriteLock", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d2.b  reason: case insensitive filesystem */
public final class C5275b {

    /* renamed from: a  reason: collision with root package name */
    public static final C5275b f23112a;

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f23113b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: c  reason: collision with root package name */
    private static volatile c0<C5274a> f23114c = new c0<>(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Object[] f23115d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23116e = 8;

    static {
        C5275b bVar = new C5275b();
        f23112a = bVar;
        boolean z10 = false;
        Object[] objArr = new Object[0];
        f23115d = objArr;
        synchronized (objArr) {
            bVar.h(f23114c, 1.15f, new C5276c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(f23114c, 1.3f, new C5276c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(f23114c, 1.5f, new C5276c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(f23114c, 1.8f, new C5276c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(f23114c, 2.0f, new C5276c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            C16807N n10 = C16807N.f139792a;
        }
        if (bVar.e(f23114c.k(0)) - 0.01f > 1.03f) {
            z10 = true;
        }
        if (!z10) {
            m.b("You should only apply non-linear scaling to font scales > 1");
        }
    }

    private C5275b() {
    }

    private final C5274a a(C5274a aVar, C5274a aVar2, float f10) {
        float[] fArr = f23113b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f23113b[i10];
            fArr2[i10] = C5277d.f23121a.b(aVar.b(f11), aVar2.b(f11), f10);
        }
        return new C5276c(f23113b, fArr2);
    }

    private final C5274a c(float f10) {
        return f23114c.e(d(f10));
    }

    private final int d(float f10) {
        return (int) (f10 * 100.0f);
    }

    private final float e(int i10) {
        return ((float) i10) / 100.0f;
    }

    private final void g(float f10, C5274a aVar) {
        synchronized (f23115d) {
            c0<C5274a> c10 = f23114c.clone();
            f23112a.h(c10, f10, aVar);
            f23114c = c10;
            C16807N n10 = C16807N.f139792a;
        }
    }

    private final void h(c0<C5274a> c0Var, float f10, C5274a aVar) {
        c0Var.l(d(f10), aVar);
    }

    public final C5274a b(float f10) {
        C5274a p10;
        if (!f(f10)) {
            return null;
        }
        C5274a c10 = f23112a.c(f10);
        if (c10 != null) {
            return c10;
        }
        int f11 = f23114c.f(d(f10));
        if (f11 >= 0) {
            return f23114c.p(f11);
        }
        int i10 = -(f11 + 1);
        int i11 = i10 - 1;
        float f12 = 1.0f;
        if (i10 >= f23114c.o()) {
            C5276c cVar = new C5276c(new float[]{1.0f}, new float[]{f10});
            g(f10, cVar);
            return cVar;
        }
        if (i11 < 0) {
            float[] fArr = f23113b;
            p10 = new C5276c(fArr, fArr);
        } else {
            f12 = e(f23114c.k(i11));
            p10 = f23114c.p(i11);
        }
        C5274a a10 = a(p10, f23114c.p(i10), C5277d.f23121a.a(0.0f, 1.0f, f12, e(f23114c.k(i10)), f10));
        g(f10, a10);
        return a10;
    }

    public final boolean f(float f10) {
        return f10 >= 1.03f;
    }
}
