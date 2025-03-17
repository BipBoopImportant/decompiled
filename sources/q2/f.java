package q2;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f27784a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27785b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27786c = false;

    /* renamed from: d  reason: collision with root package name */
    p f27787d;

    /* renamed from: e  reason: collision with root package name */
    a f27788e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f27789f;

    /* renamed from: g  reason: collision with root package name */
    public int f27790g;

    /* renamed from: h  reason: collision with root package name */
    int f27791h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f27792i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f27793j = false;

    /* renamed from: k  reason: collision with root package name */
    List<d> f27794k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List<f> f27795l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f27787d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f27795l) {
            if (!fVar.f27793j) {
                return;
            }
        }
        this.f27786c = true;
        d dVar2 = this.f27784a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f27785b) {
            this.f27787d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f next : this.f27795l) {
            if (!(next instanceof g)) {
                i10++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f27793j) {
            g gVar = this.f27792i;
            if (gVar != null) {
                if (gVar.f27793j) {
                    this.f27789f = this.f27791h * gVar.f27790g;
                } else {
                    return;
                }
            }
            d(fVar2.f27790g + this.f27789f);
        }
        d dVar3 = this.f27784a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f27794k.add(dVar);
        if (this.f27793j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f27795l.clear();
        this.f27794k.clear();
        this.f27793j = false;
        this.f27790g = 0;
        this.f27786c = false;
        this.f27785b = false;
    }

    public void d(int i10) {
        if (!this.f27793j) {
            this.f27793j = true;
            this.f27790g = i10;
            for (d next : this.f27794k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27787d.f27828b.t());
        sb2.append(":");
        sb2.append(this.f27788e);
        sb2.append("(");
        sb2.append(this.f27793j ? Integer.valueOf(this.f27790g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f27795l.size());
        sb2.append(":d=");
        sb2.append(this.f27794k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
