package PB;

import IC.C13023e;
import KJ.C15985a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LPB/e;", "", "", "showEmptyResultInfo", "LKJ/c;", "LPB/g;", "stores", "<init>", "(ZLKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "LKJ/c;", "()LKJ/c;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final int f113848c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f113849a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<g> f113850b;

    public e() {
        this(false, (C15987c) null, 3, (DefaultConstructorMarker) null);
    }

    public final boolean a() {
        return this.f113849a;
    }

    public final C15987c<g> b() {
        return this.f113850b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f113849a == eVar.f113849a && C17542s.e(this.f113850b, eVar.f113850b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f113849a) * 31) + this.f113850b.hashCode();
    }

    public String toString() {
        boolean z10 = this.f113849a;
        C15987c<g> cVar = this.f113850b;
        return "SearchResult(showEmptyResultInfo=" + z10 + ", stores=" + cVar + ")";
    }

    public e(boolean z10, C15987c<g> cVar) {
        C17542s.j(cVar, "stores");
        this.f113849a = z10;
        this.f113850b = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z10, C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? C15985a.a() : cVar);
    }
}
