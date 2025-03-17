package n2;

import m2.f;
import m2.g;
import p2.e;

public class h implements e, f {

    /* renamed from: a  reason: collision with root package name */
    final g f26568a;

    /* renamed from: b  reason: collision with root package name */
    private int f26569b;

    /* renamed from: c  reason: collision with root package name */
    private p2.h f26570c;

    /* renamed from: d  reason: collision with root package name */
    private int f26571d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f26572e = -1;

    /* renamed from: f  reason: collision with root package name */
    private float f26573f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private Object f26574g;

    public h(g gVar) {
        this.f26568a = gVar;
    }

    public e a() {
        if (this.f26570c == null) {
            this.f26570c = new p2.h();
        }
        return this.f26570c;
    }

    public void apply() {
        this.f26570c.E1(this.f26569b);
        int i10 = this.f26571d;
        if (i10 != -1) {
            this.f26570c.B1(i10);
            return;
        }
        int i11 = this.f26572e;
        if (i11 != -1) {
            this.f26570c.C1(i11);
        } else {
            this.f26570c.D1(this.f26573f);
        }
    }

    public void b(e eVar) {
        if (eVar instanceof p2.h) {
            this.f26570c = (p2.h) eVar;
        } else {
            this.f26570c = null;
        }
    }

    public void c(Object obj) {
        this.f26574g = obj;
    }

    public e d() {
        return null;
    }

    public h e(Object obj) {
        this.f26571d = -1;
        this.f26572e = this.f26568a.e(obj);
        this.f26573f = 0.0f;
        return this;
    }

    public h f(float f10) {
        this.f26571d = -1;
        this.f26572e = -1;
        this.f26573f = f10;
        return this;
    }

    public void g(int i10) {
        this.f26569b = i10;
    }

    public Object getKey() {
        return this.f26574g;
    }

    public h h(Object obj) {
        this.f26571d = this.f26568a.e(obj);
        this.f26572e = -1;
        this.f26573f = 0.0f;
        return this;
    }
}
