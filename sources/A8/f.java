package a8;

import a8.C6752b;
import a8.g;

public class f {

    /* renamed from: a  reason: collision with root package name */
    C6752b.r f41595a = null;

    /* renamed from: b  reason: collision with root package name */
    e f41596b = null;

    /* renamed from: c  reason: collision with root package name */
    String f41597c = null;

    /* renamed from: d  reason: collision with root package name */
    g.C6756b f41598d = null;

    /* renamed from: e  reason: collision with root package name */
    String f41599e = null;

    /* renamed from: f  reason: collision with root package name */
    g.C6756b f41600f = null;

    public f() {
    }

    public f a(String str) {
        this.f41595a = new C6752b(C6752b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        C6752b.r rVar = this.f41595a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.f41596b != null;
    }

    public boolean d() {
        return this.f41597c != null;
    }

    public boolean e() {
        return this.f41599e != null;
    }

    public boolean f() {
        return this.f41598d != null;
    }

    public boolean g() {
        return this.f41600f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f41600f = new g.C6756b(f10, f11, f12, f13);
        return this;
    }

    public f(f fVar) {
        if (fVar != null) {
            this.f41595a = fVar.f41595a;
            this.f41596b = fVar.f41596b;
            this.f41598d = fVar.f41598d;
            this.f41599e = fVar.f41599e;
            this.f41600f = fVar.f41600f;
        }
    }
}
