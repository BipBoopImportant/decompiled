package y6;

import B6.e;
import D6.k;
import D6.t;
import E6.b;
import I6.i;
import J6.c;
import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.o;
import java.util.List;
import w6.z;
import z6.C9019a;

public class n implements m, C9019a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57925a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f57926b;

    /* renamed from: c  reason: collision with root package name */
    private final o f57927c;

    /* renamed from: d  reason: collision with root package name */
    private final k.a f57928d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f57929e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f57930f;

    /* renamed from: g  reason: collision with root package name */
    private final C9019a<?, Float> f57931g;

    /* renamed from: h  reason: collision with root package name */
    private final C9019a<?, PointF> f57932h;

    /* renamed from: i  reason: collision with root package name */
    private final C9019a<?, Float> f57933i;

    /* renamed from: j  reason: collision with root package name */
    private final C9019a<?, Float> f57934j;

    /* renamed from: k  reason: collision with root package name */
    private final C9019a<?, Float> f57935k;

    /* renamed from: l  reason: collision with root package name */
    private final C9019a<?, Float> f57936l;

    /* renamed from: m  reason: collision with root package name */
    private final C9019a<?, Float> f57937m;

    /* renamed from: n  reason: collision with root package name */
    private final C8985b f57938n = new C8985b();

    /* renamed from: o  reason: collision with root package name */
    private boolean f57939o;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57940a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                D6.k$a[] r0 = D6.k.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57940a = r0
                D6.k$a r1 = D6.k.a.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57940a     // Catch:{ NoSuchFieldError -> 0x001d }
                D6.k$a r1 = D6.k.a.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.n.a.<clinit>():void");
        }
    }

    public n(o oVar, b bVar, k kVar) {
        this.f57927c = oVar;
        this.f57926b = kVar.d();
        k.a j10 = kVar.j();
        this.f57928d = j10;
        this.f57929e = kVar.k();
        this.f57930f = kVar.l();
        C9019a<Float, Float> h10 = kVar.g().h();
        this.f57931g = h10;
        C9019a<PointF, PointF> h11 = kVar.h().h();
        this.f57932h = h11;
        C9019a<Float, Float> h12 = kVar.i().h();
        this.f57933i = h12;
        C9019a<Float, Float> h13 = kVar.e().h();
        this.f57935k = h13;
        C9019a<Float, Float> h14 = kVar.f().h();
        this.f57937m = h14;
        k.a aVar = k.a.STAR;
        if (j10 == aVar) {
            this.f57934j = kVar.b().h();
            this.f57936l = kVar.c().h();
        } else {
            this.f57934j = null;
            this.f57936l = null;
        }
        bVar.i(h10);
        bVar.i(h11);
        bVar.i(h12);
        bVar.i(h13);
        bVar.i(h14);
        if (j10 == aVar) {
            bVar.i(this.f57934j);
            bVar.i(this.f57936l);
        }
        h10.a(this);
        h11.a(this);
        h12.a(this);
        h13.a(this);
        h14.a(this);
        if (j10 == aVar) {
            this.f57934j.a(this);
            this.f57936l.a(this);
        }
    }

    private void f() {
        double d10;
        double d11;
        double d12;
        int i10;
        int floor = (int) Math.floor((double) this.f57931g.h().floatValue());
        C9019a<?, Float> aVar = this.f57933i;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.h().floatValue()) - 90.0d);
        double d13 = (double) floor;
        float floatValue = this.f57937m.h().floatValue() / 100.0f;
        float floatValue2 = this.f57935k.h().floatValue();
        double d14 = (double) floatValue2;
        float cos = (float) (Math.cos(radians) * d14);
        float sin = (float) (Math.sin(radians) * d14);
        this.f57925a.moveTo(cos, sin);
        double d15 = (double) ((float) (6.283185307179586d / d13));
        double d16 = radians + d15;
        double ceil = Math.ceil(d13);
        int i11 = 0;
        while (((double) i11) < ceil) {
            float cos2 = (float) (Math.cos(d16) * d14);
            double d17 = ceil;
            float sin2 = (float) (d14 * Math.sin(d16));
            if (floatValue != 0.0f) {
                d12 = d14;
                i10 = i11;
                d11 = d16;
                double atan2 = (double) ((float) (Math.atan2((double) sin, (double) cos) - 1.5707963267948966d));
                float cos3 = (float) Math.cos(atan2);
                d10 = d15;
                double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos2) - 1.5707963267948966d));
                float f10 = floatValue2 * floatValue * 0.25f;
                this.f57925a.cubicTo(cos - (cos3 * f10), sin - (((float) Math.sin(atan2)) * f10), cos2 + (((float) Math.cos(atan22)) * f10), sin2 + (f10 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i10 = i11;
                d11 = d16;
                d12 = d14;
                d10 = d15;
                this.f57925a.lineTo(cos2, sin2);
            }
            d16 = d11 + d10;
            i11 = i10 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d17;
            d14 = d12;
            d15 = d10;
        }
        PointF h10 = this.f57932h.h();
        this.f57925a.offset(h10.x, h10.y);
        this.f57925a.close();
    }

    private void i() {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        double d10;
        float f14;
        float f15;
        double d11;
        float f16;
        double d12;
        float f17;
        float f18;
        float floatValue = this.f57931g.h().floatValue();
        C9019a<?, Float> aVar = this.f57933i;
        double radians = Math.toRadians((aVar == null ? 0.0d : (double) aVar.h().floatValue()) - 90.0d);
        double d13 = (double) floatValue;
        float f19 = (float) (6.283185307179586d / d13);
        if (this.f57930f) {
            f19 *= -1.0f;
        }
        float f20 = f19 / 2.0f;
        float f21 = floatValue - ((float) ((int) floatValue));
        int i11 = (f21 > 0.0f ? 1 : (f21 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (double) ((1.0f - f21) * f20);
        }
        float floatValue2 = this.f57935k.h().floatValue();
        float floatValue3 = this.f57934j.h().floatValue();
        C9019a<?, Float> aVar2 = this.f57936l;
        float floatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        C9019a<?, Float> aVar3 = this.f57937m;
        float floatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (i11 != 0) {
            f10 = ((floatValue2 - floatValue3) * f21) + floatValue3;
            i10 = i11;
            double d14 = (double) f10;
            float f22 = f20;
            float cos = (float) (d14 * Math.cos(radians));
            f12 = (float) (d14 * Math.sin(radians));
            this.f57925a.moveTo(cos, f12);
            d10 = radians + ((double) ((f19 * f21) / 2.0f));
            f11 = cos;
            f13 = f22;
        } else {
            float f23 = f20;
            i10 = i11;
            double d15 = (double) floatValue2;
            float cos2 = (float) (Math.cos(radians) * d15);
            float sin = (float) (d15 * Math.sin(radians));
            this.f57925a.moveTo(cos2, sin);
            f11 = cos2;
            f13 = f23;
            d10 = radians + ((double) f13);
            f12 = sin;
            f10 = 0.0f;
        }
        double ceil = Math.ceil(d13) * 2.0d;
        int i12 = 0;
        float f24 = f13;
        float f25 = f11;
        float f26 = floatValue2;
        float f27 = floatValue3;
        boolean z10 = false;
        while (true) {
            double d16 = (double) i12;
            if (d16 < ceil) {
                float f28 = z10 ? f26 : f27;
                int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i13 == 0 || d16 != ceil - 2.0d) {
                    f14 = f19;
                    f15 = f24;
                } else {
                    f14 = f19;
                    f15 = (f19 * f21) / 2.0f;
                }
                if (i13 == 0 || d16 != ceil - 1.0d) {
                    d11 = d16;
                    f16 = f10;
                    f10 = f28;
                } else {
                    d11 = d16;
                    f16 = f10;
                }
                double d17 = (double) f10;
                double d18 = ceil;
                float cos3 = (float) (d17 * Math.cos(d10));
                float sin2 = (float) (d17 * Math.sin(d10));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.f57925a.lineTo(cos3, sin2);
                    d12 = d10;
                    f17 = floatValue4;
                    f18 = floatValue5;
                } else {
                    f17 = floatValue4;
                    double atan2 = (double) ((float) (Math.atan2((double) f12, (double) f25) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f18 = floatValue5;
                    d12 = d10;
                    double atan22 = (double) ((float) (Math.atan2((double) sin2, (double) cos3) - 1.5707963267948966d));
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f29 = z10 ? f17 : f18;
                    float f30 = z10 ? f18 : f17;
                    float f31 = (z10 ? f27 : f26) * f29 * 0.47829f;
                    float f32 = cos4 * f31;
                    float f33 = f31 * sin3;
                    float f34 = (z10 ? f26 : f27) * f30 * 0.47829f;
                    float f35 = cos5 * f34;
                    float f36 = f34 * sin4;
                    if (i10 != 0) {
                        if (i12 == 0) {
                            f32 *= f21;
                            f33 *= f21;
                        } else if (d11 == d18 - 1.0d) {
                            f35 *= f21;
                            f36 *= f21;
                        }
                    }
                    this.f57925a.cubicTo(f25 - f32, f12 - f33, cos3 + f35, sin2 + f36, cos3, sin2);
                }
                d10 = d12 + ((double) f15);
                z10 = !z10;
                i12++;
                f25 = cos3;
                f12 = sin2;
                floatValue5 = f18;
                floatValue4 = f17;
                f10 = f16;
                f19 = f14;
                ceil = d18;
            } else {
                PointF h10 = this.f57932h.h();
                this.f57925a.offset(h10.x, h10.y);
                this.f57925a.close();
                return;
            }
        }
    }

    private void j() {
        this.f57939o = false;
        this.f57927c.invalidateSelf();
    }

    public void a() {
        j();
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C8986c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f57938n.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    public void c(e eVar, int i10, List<e> list, e eVar2) {
        i.k(eVar, i10, list, eVar2, this);
    }

    public String getName() {
        return this.f57926b;
    }

    public <T> void h(T t10, c<T> cVar) {
        C9019a<?, Float> aVar;
        C9019a<?, Float> aVar2;
        if (t10 == z.f57329w) {
            this.f57931g.n(cVar);
        } else if (t10 == z.f57330x) {
            this.f57933i.n(cVar);
        } else if (t10 == z.f57320n) {
            this.f57932h.n(cVar);
        } else if (t10 == z.f57331y && (aVar2 = this.f57934j) != null) {
            aVar2.n(cVar);
        } else if (t10 == z.f57332z) {
            this.f57935k.n(cVar);
        } else if (t10 == z.f57292A && (aVar = this.f57936l) != null) {
            aVar.n(cVar);
        } else if (t10 == z.f57293B) {
            this.f57937m.n(cVar);
        }
    }

    public Path m() {
        if (this.f57939o) {
            return this.f57925a;
        }
        this.f57925a.reset();
        if (this.f57929e) {
            this.f57939o = true;
            return this.f57925a;
        }
        int i10 = a.f57940a[this.f57928d.ordinal()];
        if (i10 == 1) {
            i();
        } else if (i10 == 2) {
            f();
        }
        this.f57925a.close();
        this.f57938n.b(this.f57925a);
        this.f57939o = true;
        return this.f57925a;
    }
}
