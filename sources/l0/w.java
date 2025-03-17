package l0;

import c2.n;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.N;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Ll0/w;", "", "Lkotlin/Function1;", "Lc2/r;", "Lc2/n;", "slideOffset", "Lm0/N;", "animationSpec", "<init>", "(LnI/l;Lm0/N;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/l;", "b", "()LnI/l;", "Lm0/N;", "()Lm0/N;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<r, n> f25438a;

    /* renamed from: b  reason: collision with root package name */
    private final N<n> f25439b;

    public w(C17642l<? super r, n> lVar, N<n> n10) {
        this.f25438a = lVar;
        this.f25439b = n10;
    }

    public final N<n> a() {
        return this.f25439b;
    }

    public final C17642l<r, n> b() {
        return this.f25438a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return C17542s.e(this.f25438a, wVar.f25438a) && C17542s.e(this.f25439b, wVar.f25439b);
    }

    public int hashCode() {
        return (this.f25438a.hashCode() * 31) + this.f25439b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f25438a + ", animationSpec=" + this.f25439b + ')';
    }
}
