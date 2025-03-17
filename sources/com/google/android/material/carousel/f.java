package com.google.android.material.carousel;

import Fa.C9081a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f66318a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f66319b;

    /* renamed from: c  reason: collision with root package name */
    private final int f66320c;

    /* renamed from: d  reason: collision with root package name */
    private final int f66321d;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f66322a;

        /* renamed from: b  reason: collision with root package name */
        private final float f66323b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c> f66324c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private c f66325d;

        /* renamed from: e  reason: collision with root package name */
        private c f66326e;

        /* renamed from: f  reason: collision with root package name */
        private int f66327f = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f66328g = -1;

        /* renamed from: h  reason: collision with root package name */
        private float f66329h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f66330i = -1;

        b(float f10, float f11) {
            this.f66322a = f10;
            this.f66323b = f11;
        }

        private static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (((float) i10) * f11)) + (((float) i11) * f11);
        }

        /* access modifiers changed from: package-private */
        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        /* access modifiers changed from: package-private */
        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        /* access modifiers changed from: package-private */
        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        /* access modifiers changed from: package-private */
        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float f14 = f12 / 2.0f;
            float f15 = f10 - f14;
            float f16 = f14 + f10;
            float f17 = this.f66323b;
            if (f16 > f17) {
                f13 = Math.abs(f16 - Math.max(f16 - f12, f17));
            } else {
                f13 = 0.0f;
                if (f15 < 0.0f) {
                    f13 = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, f13);
        }

        /* access modifiers changed from: package-private */
        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        /* access modifiers changed from: package-private */
        public b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (!z10) {
                    int i10 = this.f66330i;
                    if (i10 == -1 || i10 == 0) {
                        this.f66330i = this.f66324c.size();
                    } else {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f66325d == null) {
                    this.f66325d = cVar;
                    this.f66327f = this.f66324c.size();
                }
                if (this.f66328g != -1 && this.f66324c.size() - this.f66328g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                } else if (f12 == this.f66325d.f66334d) {
                    this.f66326e = cVar;
                    this.f66328g = this.f66324c.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.f66325d == null && cVar.f66334d < this.f66329h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else if (this.f66326e != null && cVar.f66334d > this.f66329h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
            this.f66329h = cVar.f66334d;
            this.f66324c.add(cVar);
            return this;
        }

        /* access modifiers changed from: package-private */
        public b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        /* access modifiers changed from: package-private */
        public b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((((float) i11) * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public f i() {
            if (this.f66325d != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f66324c.size(); i10++) {
                    c cVar = this.f66324c.get(i10);
                    arrayList.add(new c(j(this.f66325d.f66332b, this.f66322a, this.f66327f, i10), cVar.f66332b, cVar.f66333c, cVar.f66334d, cVar.f66335e, cVar.f66336f, cVar.f66337g, cVar.f66338h));
                }
                return new f(this.f66322a, arrayList, this.f66327f, this.f66328g);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        final float f66331a;

        /* renamed from: b  reason: collision with root package name */
        final float f66332b;

        /* renamed from: c  reason: collision with root package name */
        final float f66333c;

        /* renamed from: d  reason: collision with root package name */
        final float f66334d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f66335e;

        /* renamed from: f  reason: collision with root package name */
        final float f66336f;

        /* renamed from: g  reason: collision with root package name */
        final float f66337g;

        /* renamed from: h  reason: collision with root package name */
        final float f66338h;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(C9081a.a(cVar.f66331a, cVar2.f66331a, f10), C9081a.a(cVar.f66332b, cVar2.f66332b, f10), C9081a.a(cVar.f66333c, cVar2.f66333c, f10), C9081a.a(cVar.f66334d, cVar2.f66334d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f66331a = f10;
            this.f66332b = f11;
            this.f66333c = f12;
            this.f66334d = f13;
            this.f66335e = z10;
            this.f66336f = f14;
            this.f66337g = f15;
            this.f66338h = f16;
        }
    }

    static f m(f fVar, f fVar2, float f10) {
        if (fVar.f() == fVar2.f()) {
            List<c> g10 = fVar.g();
            List<c> g11 = fVar2.g();
            if (g10.size() == g11.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < fVar.g().size(); i10++) {
                    arrayList.add(c.a(g10.get(i10), g11.get(i10), f10));
                }
                return new f(fVar.f(), arrayList, C9081a.c(fVar.b(), fVar2.b(), f10), C9081a.c(fVar.i(), fVar2.i(), f10));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    static f n(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f66332b) - (fVar.j().f66334d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = fVar.g().get(size);
            bVar.d(f11 + (cVar.f66334d / 2.0f), cVar.f66333c, cVar.f66334d, size >= fVar.b() && size <= fVar.i(), cVar.f66335e);
            f11 += cVar.f66334d;
            size--;
        }
        return bVar.i();
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return this.f66319b.get(this.f66320c);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f66320c;
    }

    /* access modifiers changed from: package-private */
    public c c() {
        return this.f66319b.get(0);
    }

    /* access modifiers changed from: package-private */
    public c d() {
        for (int i10 = 0; i10 < this.f66319b.size(); i10++) {
            c cVar = this.f66319b.get(i10);
            if (!cVar.f66335e) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List<c> e() {
        return this.f66319b.subList(this.f66320c, this.f66321d + 1);
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f66318a;
    }

    /* access modifiers changed from: package-private */
    public List<c> g() {
        return this.f66319b;
    }

    /* access modifiers changed from: package-private */
    public c h() {
        return this.f66319b.get(this.f66321d);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f66321d;
    }

    /* access modifiers changed from: package-private */
    public c j() {
        List<c> list = this.f66319b;
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public c k() {
        for (int size = this.f66319b.size() - 1; size >= 0; size--) {
            c cVar = this.f66319b.get(size);
            if (!cVar.f66335e) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        int i10 = 0;
        for (c cVar : this.f66319b) {
            if (cVar.f66335e) {
                i10++;
            }
        }
        return this.f66319b.size() - i10;
    }

    private f(float f10, List<c> list, int i10, int i11) {
        this.f66318a = f10;
        this.f66319b = Collections.unmodifiableList(list);
        this.f66320c = i10;
        this.f66321d = i11;
    }
}
