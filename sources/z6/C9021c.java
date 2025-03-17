package z6;

import E6.b;
import G6.C6515j;
import J6.c;
import android.graphics.Color;
import android.graphics.Paint;
import z6.C9019a;

/* renamed from: z6.c  reason: case insensitive filesystem */
public class C9021c implements C9019a.b {

    /* renamed from: a  reason: collision with root package name */
    private final C9019a.b f58433a;

    /* renamed from: b  reason: collision with root package name */
    private final C9019a<Integer, Integer> f58434b;

    /* renamed from: c  reason: collision with root package name */
    private final C9019a<Float, Float> f58435c;

    /* renamed from: d  reason: collision with root package name */
    private final C9019a<Float, Float> f58436d;

    /* renamed from: e  reason: collision with root package name */
    private final C9019a<Float, Float> f58437e;

    /* renamed from: f  reason: collision with root package name */
    private final C9019a<Float, Float> f58438f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58439g = true;

    /* renamed from: z6.c$a */
    class a extends c<Float> {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f58440d;

        a(c cVar) {
            this.f58440d = cVar;
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [J6.b, J6.b<java.lang.Float>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Float a(J6.b<java.lang.Float> r2) {
            /*
                r1 = this;
                J6.c r0 = r1.f58440d
                java.lang.Object r2 = r0.a(r2)
                java.lang.Float r2 = (java.lang.Float) r2
                if (r2 != 0) goto L_0x000c
                r2 = 0
                return r2
            L_0x000c:
                float r2 = r2.floatValue()
                r0 = 1076048691(0x40233333, float:2.55)
                float r2 = r2 * r0
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: z6.C9021c.a.a(J6.b):java.lang.Float");
        }
    }

    public C9021c(C9019a.b bVar, b bVar2, C6515j jVar) {
        this.f58433a = bVar;
        C9019a<Integer, Integer> h10 = jVar.a().h();
        this.f58434b = h10;
        h10.a(this);
        bVar2.i(h10);
        C9019a<Float, Float> h11 = jVar.d().h();
        this.f58435c = h11;
        h11.a(this);
        bVar2.i(h11);
        C9019a<Float, Float> h12 = jVar.b().h();
        this.f58436d = h12;
        h12.a(this);
        bVar2.i(h12);
        C9019a<Float, Float> h13 = jVar.c().h();
        this.f58437e = h13;
        h13.a(this);
        bVar2.i(h13);
        C9019a<Float, Float> h14 = jVar.e().h();
        this.f58438f = h14;
        h14.a(this);
        bVar2.i(h14);
    }

    public void a() {
        this.f58439g = true;
        this.f58433a.a();
    }

    public void b(Paint paint) {
        if (this.f58439g) {
            this.f58439g = false;
            double floatValue = ((double) this.f58436d.h().floatValue()) * 0.017453292519943295d;
            float floatValue2 = this.f58437e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f58434b.h().intValue();
            paint.setShadowLayer(this.f58438f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f58435c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(c<Integer> cVar) {
        this.f58434b.n(cVar);
    }

    public void d(c<Float> cVar) {
        this.f58436d.n(cVar);
    }

    public void e(c<Float> cVar) {
        this.f58437e.n(cVar);
    }

    public void f(c<Float> cVar) {
        if (cVar == null) {
            this.f58435c.n((c) null);
        } else {
            this.f58435c.n(new a(cVar));
        }
    }

    public void g(c<Float> cVar) {
        this.f58438f.n(cVar);
    }
}
