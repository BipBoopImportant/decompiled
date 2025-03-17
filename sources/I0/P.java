package I0;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u001c\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR-\u0010\b\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"LI0/P;", "T", "", "key", "Lkotlin/Function1;", "Lkotlin/Function0;", "LXH/N;", "Landroidx/compose/material/FadeInFadeOutTransition;", "transition", "<init>", "(Ljava/lang/Object;LnI/q;)V", "a", "()Ljava/lang/Object;", "b", "()LnI/q;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "c", "LnI/q;", "getTransition", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class P<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f7443a;

    /* renamed from: b  reason: collision with root package name */
    private final q<p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f7444b;

    public P(T t10, q<? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N> qVar) {
        this.f7443a = t10;
        this.f7444b = qVar;
    }

    public final T a() {
        return this.f7443a;
    }

    public final q<p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> b() {
        return this.f7444b;
    }

    public final T c() {
        return this.f7443a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return C17542s.e(this.f7443a, p10.f7443a) && C17542s.e(this.f7444b, p10.f7444b);
    }

    public int hashCode() {
        T t10 = this.f7443a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + this.f7444b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f7443a + ", transition=" + this.f7444b + ')';
    }
}
