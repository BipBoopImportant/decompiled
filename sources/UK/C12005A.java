package uk;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pk.s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Luk/A;", "", "Lpk/s$g$d;", "result", "<init>", "(Lpk/s$g$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/s$g$d;", "()Lpk/s$g$d;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uk.A  reason: case insensitive filesystem */
public final class C12005A implements C12056w {

    /* renamed from: a  reason: collision with root package name */
    private final s.g.d f103426a;

    public C12005A(s.g.d dVar) {
        C17542s.j(dVar, "result");
        this.f103426a = dVar;
    }

    public final s.g.d a() {
        return this.f103426a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12005A) && C17542s.e(this.f103426a, ((C12005A) obj).f103426a);
    }

    public int hashCode() {
        return this.f103426a.hashCode();
    }

    public String toString() {
        s.g.d dVar = this.f103426a;
        return "ShowFallback(result=" + dVar + ")";
    }
}
