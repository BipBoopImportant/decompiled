package l0;

import c2.r;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.N;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Ll0/g;", "", "Li1/c;", "alignment", "Lkotlin/Function1;", "Lc2/r;", "size", "Lm0/N;", "animationSpec", "", "clip", "<init>", "(Li1/c;LnI/l;Lm0/N;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li1/c;", "()Li1/c;", "b", "LnI/l;", "d", "()LnI/l;", "c", "Lm0/N;", "()Lm0/N;", "Z", "()Z", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final C5437c f25385a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<r, r> f25386b;

    /* renamed from: c  reason: collision with root package name */
    private final N<r> f25387c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f25388d;

    public g(C5437c cVar, C17642l<? super r, r> lVar, N<r> n10, boolean z10) {
        this.f25385a = cVar;
        this.f25386b = lVar;
        this.f25387c = n10;
        this.f25388d = z10;
    }

    public final C5437c a() {
        return this.f25385a;
    }

    public final N<r> b() {
        return this.f25387c;
    }

    public final boolean c() {
        return this.f25388d;
    }

    public final C17642l<r, r> d() {
        return this.f25386b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f25385a, gVar.f25385a) && C17542s.e(this.f25386b, gVar.f25386b) && C17542s.e(this.f25387c, gVar.f25387c) && this.f25388d == gVar.f25388d;
    }

    public int hashCode() {
        return (((((this.f25385a.hashCode() * 31) + this.f25386b.hashCode()) * 31) + this.f25387c.hashCode()) * 31) + Boolean.hashCode(this.f25388d);
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f25385a + ", size=" + this.f25386b + ", animationSpec=" + this.f25387c + ", clip=" + this.f25388d + ')';
    }
}
