package k6;

import T5.l;
import T5.m;
import T5.n;
import T5.u;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import androidx.lifecycle.r;
import k6.C8441h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q6.C8675b;
import q6.C8677d;
import r6.C8696d;
import r6.F;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013\"\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013\"\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013\"\u0015\u0010$\u001a\u00020\u0007*\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010'\u001a\u00020\u0015*\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010'\u001a\u00020\u0015*\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0017\u00100\u001a\u0004\u0018\u00010\u0017*\u00020(8G¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00103\u001a\u00020\r*\u00020(8F¢\u0006\u0006\u001a\u0004\b1\u00102\"\u0017\u00106\u001a\u0004\u0018\u00010\u001a*\u00020!8F¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0015\u00108\u001a\u00020\r*\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001d\u00107\"\u0015\u0010:\u001a\u00020\r*\u00020!8F¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0015\u0010:\u001a\u00020\r*\u00020(8F¢\u0006\u0006\u001a\u0004\b;\u00102\"\u001b\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u0011*\u00020+8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010-¨\u0006<"}, d2 = {"Lk6/h$a;", "", "drawableResId", "d", "(Lk6/h$a;I)Lk6/h$a;", "durationMillis", "c", "Lq6/d$a;", "q", "(I)Lq6/d$a;", "factory", "r", "(Lk6/h$a;Lq6/d$a;)Lk6/h$a;", "", "enable", "b", "(Lk6/h$a;Z)Lk6/h$a;", "LT5/l$c;", "a", "LT5/l$c;", "transitionFactoryKey", "Landroid/graphics/Bitmap$Config;", "bitmapConfigKey", "Landroid/graphics/ColorSpace;", "colorSpaceKey", "premultipliedAlphaKey", "Landroidx/lifecycle/r;", "e", "lifecycleKey", "f", "allowHardwareKey", "g", "allowRgb565Key", "Lk6/h;", "p", "(Lk6/h;)Lq6/d$a;", "transitionFactory", "k", "(Lk6/h;)Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lk6/q;", "l", "(Lk6/q;)Landroid/graphics/Bitmap$Config;", "LT5/l$c$a;", "j", "(LT5/l$c$a;)LT5/l$c;", "m", "(Lk6/q;)Landroid/graphics/ColorSpace;", "colorSpace", "o", "(Lk6/q;)Z", "premultipliedAlpha", "n", "(Lk6/h;)Landroidx/lifecycle/r;", "lifecycle", "(Lk6/h;)Z", "allowHardware", "h", "allowRgb565", "i", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: k6.k  reason: case insensitive filesystem */
public final class C8444k {

    /* renamed from: a  reason: collision with root package name */
    private static final l.c<C8677d.a> f54242a = new l.c<>(C8677d.a.f55560b);

    /* renamed from: b  reason: collision with root package name */
    private static final l.c<Bitmap.Config> f54243b = new l.c<>(F.a());

    /* renamed from: c  reason: collision with root package name */
    private static final l.c<ColorSpace> f54244c = new l.c<>(F.c());

    /* renamed from: d  reason: collision with root package name */
    private static final l.c<Boolean> f54245d;

    /* renamed from: e  reason: collision with root package name */
    private static final l.c<r> f54246e = new l.c<>(null);

    /* renamed from: f  reason: collision with root package name */
    private static final l.c<Boolean> f54247f;

    /* renamed from: g  reason: collision with root package name */
    private static final l.c<Boolean> f54248g = new l.c<>(Boolean.FALSE);

    static {
        Boolean bool = Boolean.TRUE;
        f54245d = new l.c<>(bool);
        f54247f = new l.c<>(bool);
    }

    public static final C8441h.a b(C8441h.a aVar, boolean z10) {
        aVar.j().b(f54247f, Boolean.valueOf(z10));
        return aVar;
    }

    public static final C8441h.a c(C8441h.a aVar, int i10) {
        return r(aVar, q(i10));
    }

    public static final C8441h.a d(C8441h.a aVar, int i10) {
        return aVar.h(new C8443j(i10));
    }

    /* access modifiers changed from: private */
    public static final n e(int i10, C8441h hVar) {
        return u.c(C8696d.c(hVar.c(), i10));
    }

    public static final boolean f(C8441h hVar) {
        return ((Boolean) m.a(hVar, f54247f)).booleanValue();
    }

    public static final l.c<Boolean> g(l.c.a aVar) {
        return f54248g;
    }

    public static final boolean h(C8441h hVar) {
        return ((Boolean) m.a(hVar, f54248g)).booleanValue();
    }

    public static final boolean i(C8450q qVar) {
        return ((Boolean) m.b(qVar, f54248g)).booleanValue();
    }

    public static final l.c<Bitmap.Config> j(l.c.a aVar) {
        return f54243b;
    }

    public static final Bitmap.Config k(C8441h hVar) {
        return (Bitmap.Config) m.a(hVar, f54243b);
    }

    public static final Bitmap.Config l(C8450q qVar) {
        return (Bitmap.Config) m.b(qVar, f54243b);
    }

    public static final ColorSpace m(C8450q qVar) {
        return (ColorSpace) m.b(qVar, f54244c);
    }

    public static final r n(C8441h hVar) {
        return (r) m.a(hVar, f54246e);
    }

    public static final boolean o(C8450q qVar) {
        return ((Boolean) m.b(qVar, f54245d)).booleanValue();
    }

    public static final C8677d.a p(C8441h hVar) {
        return (C8677d.a) m.a(hVar, f54242a);
    }

    private static final C8677d.a q(int i10) {
        return i10 > 0 ? new C8675b.a(i10, false, 2, (DefaultConstructorMarker) null) : C8677d.a.f55560b;
    }

    public static final C8441h.a r(C8441h.a aVar, C8677d.a aVar2) {
        aVar.j().b(f54242a, aVar2);
        return aVar;
    }
}
