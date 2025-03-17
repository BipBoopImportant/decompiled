package s0;

import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001c"}, d2 = {"Ls0/m;", "Ls0/T;", "included", "excluded", "<init>", "(Ls0/T;Ls0/T;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ls0/T;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.m  reason: case insensitive filesystem */
final class C5867m implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final C5848T f28823b;

    /* renamed from: c  reason: collision with root package name */
    private final C5848T f28824c;

    public C5867m(C5848T t10, C5848T t11) {
        this.f28823b = t10;
        this.f28824c = t11;
    }

    public int a(d dVar) {
        return C17978n.e(this.f28823b.a(dVar) - this.f28824c.a(dVar), 0);
    }

    public int b(d dVar) {
        return C17978n.e(this.f28823b.b(dVar) - this.f28824c.b(dVar), 0);
    }

    public int c(d dVar, t tVar) {
        return C17978n.e(this.f28823b.c(dVar, tVar) - this.f28824c.c(dVar, tVar), 0);
    }

    public int d(d dVar, t tVar) {
        return C17978n.e(this.f28823b.d(dVar, tVar) - this.f28824c.d(dVar, tVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5867m)) {
            return false;
        }
        C5867m mVar = (C5867m) obj;
        return C17542s.e(mVar.f28823b, this.f28823b) && C17542s.e(mVar.f28824c, this.f28824c);
    }

    public int hashCode() {
        return (this.f28823b.hashCode() * 31) + this.f28824c.hashCode();
    }

    public String toString() {
        return '(' + this.f28823b + " - " + this.f28824c + ')';
    }
}
