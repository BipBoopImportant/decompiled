package A0;

import c2.d;
import c2.t;
import kotlin.Metadata;
import o1.C5673m;
import p1.Q0;
import p1.i1;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LA0/a;", "Lp1/i1;", "LA0/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(LA0/b;LA0/b;LA0/b;LA0/b;)V", "Lo1/m;", "size", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Lp1/Q0;", "a", "(JLc2/t;Lc2/d;)Lp1/Q0;", "", "e", "(JFFFFLc2/t;)Lp1/Q0;", "c", "(LA0/b;LA0/b;LA0/b;LA0/b;)LA0/a;", "all", "b", "(LA0/b;)LA0/a;", "LA0/b;", "i", "()LA0/b;", "h", "f", "d", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a implements i1 {

    /* renamed from: a  reason: collision with root package name */
    private final b f4297a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4298b;

    /* renamed from: c  reason: collision with root package name */
    private final b f4299c;

    /* renamed from: d  reason: collision with root package name */
    private final b f4300d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f4297a = bVar;
        this.f4298b = bVar2;
        this.f4299c = bVar3;
        this.f4300d = bVar4;
    }

    public static /* synthetic */ a d(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f4297a;
            }
            if ((i10 & 2) != 0) {
                bVar2 = aVar.f4298b;
            }
            if ((i10 & 4) != 0) {
                bVar3 = aVar.f4299c;
            }
            if ((i10 & 8) != 0) {
                bVar4 = aVar.f4300d;
            }
            return aVar.c(bVar, bVar2, bVar3, bVar4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }

    public final Q0 a(long j10, t tVar, d dVar) {
        float a10 = this.f4297a.a(j10, dVar);
        float a11 = this.f4298b.a(j10, dVar);
        float a12 = this.f4299c.a(j10, dVar);
        float a13 = this.f4300d.a(j10, dVar);
        float k10 = C5673m.k(j10);
        float f10 = a10 + a13;
        if (f10 > k10) {
            float f11 = k10 / f10;
            a10 *= f11;
            a13 *= f11;
        }
        float f12 = a13;
        float f13 = a11 + a12;
        if (f13 > k10) {
            float f14 = k10 / f13;
            a11 *= f14;
            a12 *= f14;
        }
        if (a10 >= 0.0f && a11 >= 0.0f && a12 >= 0.0f && f12 >= 0.0f) {
            return e(j10, a10, a11, a12, f12, tVar);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + f12 + ")!").toString());
    }

    public final a b(b bVar) {
        return c(bVar, bVar, bVar, bVar);
    }

    public abstract a c(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract Q0 e(long j10, float f10, float f11, float f12, float f13, t tVar);

    public final b f() {
        return this.f4299c;
    }

    public final b g() {
        return this.f4300d;
    }

    public final b h() {
        return this.f4298b;
    }

    public final b i() {
        return this.f4297a;
    }
}
