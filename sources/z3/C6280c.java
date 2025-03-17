package z3;

import q3.C5807s;
import t3.C5950a;

/* renamed from: z3.c  reason: case insensitive filesystem */
public final class C6280c {

    /* renamed from: a  reason: collision with root package name */
    public final String f32418a;

    /* renamed from: b  reason: collision with root package name */
    public final C5807s f32419b;

    /* renamed from: c  reason: collision with root package name */
    public final C5807s f32420c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32421d;

    /* renamed from: e  reason: collision with root package name */
    public final int f32422e;

    public C6280c(String str, C5807s sVar, C5807s sVar2, int i10, int i11) {
        C5950a.a(i10 == 0 || i11 == 0);
        this.f32418a = C5950a.d(str);
        this.f32419b = (C5807s) C5950a.e(sVar);
        this.f32420c = (C5807s) C5950a.e(sVar2);
        this.f32421d = i10;
        this.f32422e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6280c.class != obj.getClass()) {
            return false;
        }
        C6280c cVar = (C6280c) obj;
        return this.f32421d == cVar.f32421d && this.f32422e == cVar.f32422e && this.f32418a.equals(cVar.f32418a) && this.f32419b.equals(cVar.f32419b) && this.f32420c.equals(cVar.f32420c);
    }

    public int hashCode() {
        return ((((((((527 + this.f32421d) * 31) + this.f32422e) * 31) + this.f32418a.hashCode()) * 31) + this.f32419b.hashCode()) * 31) + this.f32420c.hashCode();
    }
}
