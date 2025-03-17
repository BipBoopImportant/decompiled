package N1;

import Y1.t;
import c2.C5267b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LN1/i;", "", "LN1/O;", "textLayoutInput", "<init>", "(LN1/O;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/O;", "getTextLayoutInput", "()LN1/O;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.i  reason: case insensitive filesystem */
public final class C4674i {

    /* renamed from: a  reason: collision with root package name */
    private final O f9463a;

    public C4674i(O o10) {
        this.f9463a = o10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4674i)) {
            return false;
        }
        O o10 = this.f9463a;
        C4674i iVar = (C4674i) obj;
        return C17542s.e(o10.j(), iVar.f9463a.j()) && o10.i().G(iVar.f9463a.i()) && C17542s.e(o10.g(), iVar.f9463a.g()) && o10.e() == iVar.f9463a.e() && o10.h() == iVar.f9463a.h() && t.e(o10.f(), iVar.f9463a.f()) && C17542s.e(o10.b(), iVar.f9463a.b()) && o10.d() == iVar.f9463a.d() && o10.c() == iVar.f9463a.c() && C5267b.l(o10.a()) == C5267b.l(iVar.f9463a.a()) && C5267b.k(o10.a()) == C5267b.k(iVar.f9463a.a());
    }

    public int hashCode() {
        O o10 = this.f9463a;
        return (((((((((((((((((((o10.j().hashCode() * 31) + o10.i().H()) * 31) + o10.g().hashCode()) * 31) + o10.e()) * 31) + Boolean.hashCode(o10.h())) * 31) + t.f(o10.f())) * 31) + o10.b().hashCode()) * 31) + o10.d().hashCode()) * 31) + o10.c().hashCode()) * 31) + Integer.hashCode(C5267b.l(o10.a()))) * 31) + Integer.hashCode(C5267b.k(o10.a()));
    }
}
