package A0;

import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5662b;
import o1.C5669i;
import o1.C5672l;
import o1.C5674n;
import p1.Q0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LA0/f;", "LA0/a;", "LA0/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(LA0/b;LA0/b;LA0/b;LA0/b;)V", "Lo1/m;", "size", "", "Lc2/t;", "layoutDirection", "Lp1/Q0;", "e", "(JFFFFLc2/t;)Lp1/Q0;", "j", "(LA0/b;LA0/b;LA0/b;LA0/b;)LA0/f;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends a {
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    public Q0 e(long j10, float f10, float f11, float f12, float f13, t tVar) {
        t tVar2 = tVar;
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new Q0.b(C5674n.c(j10));
        }
        C5669i c10 = C5674n.c(j10);
        t tVar3 = t.Ltr;
        return new Q0.c(C5672l.c(c10, C5662b.b(tVar2 == tVar3 ? f10 : f11, 0.0f, 2, (Object) null), C5662b.b(tVar2 == tVar3 ? f11 : f10, 0.0f, 2, (Object) null), C5662b.b(tVar2 == tVar3 ? f12 : f13, 0.0f, 2, (Object) null), C5662b.b(tVar2 == tVar3 ? f13 : f12, 0.0f, 2, (Object) null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(i(), fVar.i()) && C17542s.e(h(), fVar.h()) && C17542s.e(f(), fVar.f()) && C17542s.e(g(), fVar.g());
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    /* renamed from: j */
    public f c(b bVar, b bVar2, b bVar3, b bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
