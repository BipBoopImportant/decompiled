package Ua;

import Ea.C9078l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final C9282c f64059m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    C9283d f64060a;

    /* renamed from: b  reason: collision with root package name */
    C9283d f64061b;

    /* renamed from: c  reason: collision with root package name */
    C9283d f64062c;

    /* renamed from: d  reason: collision with root package name */
    C9283d f64063d;

    /* renamed from: e  reason: collision with root package name */
    C9282c f64064e;

    /* renamed from: f  reason: collision with root package name */
    C9282c f64065f;

    /* renamed from: g  reason: collision with root package name */
    C9282c f64066g;

    /* renamed from: h  reason: collision with root package name */
    C9282c f64067h;

    /* renamed from: i  reason: collision with root package name */
    C9285f f64068i;

    /* renamed from: j  reason: collision with root package name */
    C9285f f64069j;

    /* renamed from: k  reason: collision with root package name */
    C9285f f64070k;

    /* renamed from: l  reason: collision with root package name */
    C9285f f64071l;

    public interface c {
        C9282c a(C9282c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C9280a((float) i12));
    }

    private static b d(Context context, int i10, int i11, C9282c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C9078l.f60084r6);
        try {
            int i12 = obtainStyledAttributes.getInt(C9078l.f60095s6, 0);
            int i13 = obtainStyledAttributes.getInt(C9078l.f60128v6, i12);
            int i14 = obtainStyledAttributes.getInt(C9078l.f60139w6, i12);
            int i15 = obtainStyledAttributes.getInt(C9078l.f60117u6, i12);
            int i16 = obtainStyledAttributes.getInt(C9078l.f60106t6, i12);
            C9282c m10 = m(obtainStyledAttributes, C9078l.f60150x6, cVar);
            C9282c m11 = m(obtainStyledAttributes, C9078l.f59624A6, m10);
            C9282c m12 = m(obtainStyledAttributes, C9078l.f59635B6, m10);
            C9282c m13 = m(obtainStyledAttributes, C9078l.f60172z6, m10);
            return new b().y(i13, m11).C(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, C9078l.f60161y6, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C9280a((float) i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, C9282c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9078l.f59765N4, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(C9078l.f59775O4, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C9078l.f59785P4, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static C9282c m(TypedArray typedArray, int i10, C9282c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new C9280a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public C9285f h() {
        return this.f64070k;
    }

    public C9283d i() {
        return this.f64063d;
    }

    public C9282c j() {
        return this.f64067h;
    }

    public C9283d k() {
        return this.f64062c;
    }

    public C9282c l() {
        return this.f64066g;
    }

    public C9285f n() {
        return this.f64071l;
    }

    public C9285f o() {
        return this.f64069j;
    }

    public C9285f p() {
        return this.f64068i;
    }

    public C9283d q() {
        return this.f64060a;
    }

    public C9282c r() {
        return this.f64064e;
    }

    public C9283d s() {
        return this.f64061b;
    }

    public C9282c t() {
        return this.f64065f;
    }

    public boolean u(RectF rectF) {
        Class<C9285f> cls = C9285f.class;
        boolean z10 = this.f64071l.getClass().equals(cls) && this.f64069j.getClass().equals(cls) && this.f64068i.getClass().equals(cls) && this.f64070k.getClass().equals(cls);
        float a10 = this.f64064e.a(rectF);
        return z10 && ((this.f64065f.a(rectF) > a10 ? 1 : (this.f64065f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f64067h.a(rectF) > a10 ? 1 : (this.f64067h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f64066g.a(rectF) > a10 ? 1 : (this.f64066g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f64061b instanceof j) && (this.f64060a instanceof j) && (this.f64062c instanceof j) && (this.f64063d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(C9282c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f64060a = bVar.f64072a;
        this.f64061b = bVar.f64073b;
        this.f64062c = bVar.f64074c;
        this.f64063d = bVar.f64075d;
        this.f64064e = bVar.f64076e;
        this.f64065f = bVar.f64077f;
        this.f64066g = bVar.f64078g;
        this.f64067h = bVar.f64079h;
        this.f64068i = bVar.f64080i;
        this.f64069j = bVar.f64081j;
        this.f64070k = bVar.f64082k;
        this.f64071l = bVar.f64083l;
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C9283d f64072a = h.b();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C9283d f64073b = h.b();
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public C9283d f64074c = h.b();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C9283d f64075d = h.b();
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public C9282c f64076e = new C9280a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C9282c f64077f = new C9280a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public C9282c f64078g = new C9280a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public C9282c f64079h = new C9280a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public C9285f f64080i = h.c();
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public C9285f f64081j = h.c();
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public C9285f f64082k = h.c();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public C9285f f64083l = h.c();

        public b() {
        }

        private static float n(C9283d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f64058a;
            }
            if (dVar instanceof C9284e) {
                return ((C9284e) dVar).f64006a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f64076e = new C9280a(f10);
            return this;
        }

        public b B(C9282c cVar) {
            this.f64076e = cVar;
            return this;
        }

        public b C(int i10, C9282c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(C9283d dVar) {
            this.f64073b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        public b E(float f10) {
            this.f64077f = new C9280a(f10);
            return this;
        }

        public b F(C9282c cVar) {
            this.f64077f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(C9282c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, C9282c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(C9283d dVar) {
            this.f64075d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f64079h = new C9280a(f10);
            return this;
        }

        public b t(C9282c cVar) {
            this.f64079h = cVar;
            return this;
        }

        public b u(int i10, C9282c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(C9283d dVar) {
            this.f64074c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f64078g = new C9280a(f10);
            return this;
        }

        public b x(C9282c cVar) {
            this.f64078g = cVar;
            return this;
        }

        public b y(int i10, C9282c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(C9283d dVar) {
            this.f64072a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                A(n10);
            }
            return this;
        }

        public b(k kVar) {
            this.f64072a = kVar.f64060a;
            this.f64073b = kVar.f64061b;
            this.f64074c = kVar.f64062c;
            this.f64075d = kVar.f64063d;
            this.f64076e = kVar.f64064e;
            this.f64077f = kVar.f64065f;
            this.f64078g = kVar.f64066g;
            this.f64079h = kVar.f64067h;
            this.f64080i = kVar.f64068i;
            this.f64081j = kVar.f64069j;
            this.f64082k = kVar.f64070k;
            this.f64083l = kVar.f64071l;
        }
    }

    public k() {
        this.f64060a = h.b();
        this.f64061b = h.b();
        this.f64062c = h.b();
        this.f64063d = h.b();
        this.f64064e = new C9280a(0.0f);
        this.f64065f = new C9280a(0.0f);
        this.f64066g = new C9280a(0.0f);
        this.f64067h = new C9280a(0.0f);
        this.f64068i = h.c();
        this.f64069j = h.c();
        this.f64070k = h.c();
        this.f64071l = h.c();
    }
}
