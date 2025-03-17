package S1;

import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LS1/d;", "LS1/K;", "", "fontWeightAdjustment", "<init>", "(I)V", "LS1/C;", "fontWeight", "d", "(LS1/C;)LS1/C;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.d  reason: case insensitive filesystem */
public final class C4811d implements K {

    /* renamed from: b  reason: collision with root package name */
    private final int f13377b;

    public C4811d(int i10) {
        this.f13377b = i10;
    }

    public C d(C c10) {
        int i10 = this.f13377b;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? c10 : new C(C17978n.m(c10.F() + this.f13377b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4811d) && this.f13377b == ((C4811d) obj).f13377b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13377b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f13377b + ')';
    }
}
