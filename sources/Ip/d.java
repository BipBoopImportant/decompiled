package ip;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tJ/\u0010\f\u001a\u00020\u00072\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lip/d;", "T", "", "data", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "LXH/N;", "onConsumedCallback", "(Ljava/lang/Object;LnI/a;)V", "Lkotlin/Function2;", "block", "a", "(LnI/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "Z", "consumed", "c", "LnI/a;", "onConsumed", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f98522a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f98523b;

    /* renamed from: c  reason: collision with root package name */
    private C17631a<C16807N> f98524c;

    public d(T t10) {
        this.f98522a = t10;
    }

    public final void a(p<? super d<T>, ? super T, C16807N> pVar) {
        C17542s.j(pVar, "block");
        if (!this.f98523b) {
            pVar.invoke(this, this.f98522a);
            C17631a<C16807N> aVar = this.f98524c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
        this.f98523b = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && C17542s.e(this.f98522a, ((d) obj).f98522a);
    }

    public int hashCode() {
        T t10 = this.f98522a;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public String toString() {
        T t10 = this.f98522a;
        return "ConsumableValue(data=" + t10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(T t10, C17631a<C16807N> aVar) {
        this(t10);
        C17542s.j(aVar, "onConsumedCallback");
        this.f98524c = aVar;
    }
}
