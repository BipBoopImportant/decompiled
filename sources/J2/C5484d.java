package j2;

import java.util.HashMap;
import java.util.HashSet;
import k2.n;
import k2.u;

/* renamed from: j2.d  reason: case insensitive filesystem */
public class C5484d extends C5481a {

    /* renamed from: g  reason: collision with root package name */
    public int f24769g;

    /* renamed from: h  reason: collision with root package name */
    public String f24770h = null;

    /* renamed from: i  reason: collision with root package name */
    public int f24771i;

    /* renamed from: j  reason: collision with root package name */
    public int f24772j;

    /* renamed from: k  reason: collision with root package name */
    public float f24773k;

    /* renamed from: l  reason: collision with root package name */
    public float f24774l;

    /* renamed from: m  reason: collision with root package name */
    public float f24775m;

    /* renamed from: n  reason: collision with root package name */
    public float f24776n;

    /* renamed from: o  reason: collision with root package name */
    public float f24777o;

    /* renamed from: p  reason: collision with root package name */
    public float f24778p;

    /* renamed from: q  reason: collision with root package name */
    public int f24779q;

    /* renamed from: r  reason: collision with root package name */
    private float f24780r;

    /* renamed from: s  reason: collision with root package name */
    private float f24781s;

    public C5484d() {
        int i10 = C5481a.f24727f;
        this.f24769g = i10;
        this.f24771i = i10;
        this.f24772j = 0;
        this.f24773k = Float.NaN;
        this.f24774l = Float.NaN;
        this.f24775m = Float.NaN;
        this.f24776n = Float.NaN;
        this.f24777o = Float.NaN;
        this.f24778p = Float.NaN;
        this.f24779q = 0;
        this.f24780r = Float.NaN;
        this.f24781s = Float.NaN;
        this.f24731d = 2;
    }

    public int a(String str) {
        return u.d.a(str);
    }

    public boolean b(int i10, int i11) {
        if (i10 == 100) {
            this.f24728a = i11;
            return true;
        } else if (i10 == 508) {
            this.f24769g = i11;
            return true;
        } else if (i10 != 510) {
            return super.b(i10, i11);
        } else {
            this.f24779q = i11;
            return true;
        }
    }

    public boolean c(int i10, float f10) {
        switch (i10) {
            case 503:
                this.f24773k = f10;
                return true;
            case 504:
                this.f24774l = f10;
                return true;
            case 505:
                this.f24773k = f10;
                this.f24774l = f10;
                return true;
            case 506:
                this.f24775m = f10;
                return true;
            case 507:
                this.f24776n = f10;
                return true;
            default:
                return super.c(i10, f10);
        }
    }

    public boolean e(int i10, String str) {
        if (i10 != 501) {
            return super.e(i10, str);
        }
        this.f24770h = str.toString();
        return true;
    }

    public void f(HashMap<String, n> hashMap) {
    }

    /* renamed from: g */
    public C5481a clone() {
        return new C5484d().h(this);
    }

    public C5481a h(C5481a aVar) {
        super.h(aVar);
        C5484d dVar = (C5484d) aVar;
        this.f24770h = dVar.f24770h;
        this.f24771i = dVar.f24771i;
        this.f24772j = dVar.f24772j;
        this.f24773k = dVar.f24773k;
        this.f24774l = Float.NaN;
        this.f24775m = dVar.f24775m;
        this.f24776n = dVar.f24776n;
        this.f24777o = dVar.f24777o;
        this.f24778p = dVar.f24778p;
        this.f24780r = dVar.f24780r;
        this.f24781s = dVar.f24781s;
        return this;
    }

    public void i(HashSet<String> hashSet) {
    }
}
