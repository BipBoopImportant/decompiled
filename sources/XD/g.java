package xd;

import wd.C10359a;
import wd.C10360b;
import wd.C10361c;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private C10360b f77746a;

    /* renamed from: b  reason: collision with root package name */
    private C10359a f77747b;

    /* renamed from: c  reason: collision with root package name */
    private C10361c f77748c;

    /* renamed from: d  reason: collision with root package name */
    private int f77749d = -1;

    /* renamed from: e  reason: collision with root package name */
    private C10385b f77750e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public C10385b a() {
        return this.f77750e;
    }

    public void c(C10359a aVar) {
        this.f77747b = aVar;
    }

    public void d(int i10) {
        this.f77749d = i10;
    }

    public void e(C10385b bVar) {
        this.f77750e = bVar;
    }

    public void f(C10360b bVar) {
        this.f77746a = bVar;
    }

    public void g(C10361c cVar) {
        this.f77748c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f77746a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f77747b);
        sb2.append("\n version: ");
        sb2.append(this.f77748c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f77749d);
        if (this.f77750e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f77750e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
