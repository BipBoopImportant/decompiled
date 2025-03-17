package s0;

import F1.d;
import F1.k;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ls0/i;", "LF1/d;", "Lkotlin/Function1;", "Ls0/T;", "LXH/N;", "block", "<init>", "(LnI/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "LF1/k;", "scope", "q", "(LF1/k;)V", "d", "LnI/l;", "e", "Ls0/T;", "oldWindowInsets", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.i  reason: case insensitive filesystem */
final class C5863i implements d {

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C5848T, C16807N> f28811d;

    /* renamed from: e  reason: collision with root package name */
    private C5848T f28812e;

    public C5863i(C17642l<? super C5848T, C16807N> lVar) {
        this.f28811d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5863i)) {
            return false;
        }
        return ((C5863i) obj).f28811d == this.f28811d;
    }

    public int hashCode() {
        return this.f28811d.hashCode();
    }

    public void q(k kVar) {
        C5848T t10 = (C5848T) kVar.c(C5851W.b());
        if (!C17542s.e(t10, this.f28812e)) {
            this.f28812e = t10;
            this.f28811d.invoke(t10);
        }
    }
}
