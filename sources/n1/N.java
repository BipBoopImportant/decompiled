package N1;

import R1.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"LN1/N;", "", "", "capacity", "<init>", "(I)V", "LN1/O;", "key", "LN1/P;", "a", "(LN1/O;)LN1/P;", "value", "b", "(LN1/O;LN1/P;)LN1/P;", "LR1/b;", "LN1/i;", "LR1/b;", "lruCache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final b<C4674i, P> f9388a;

    public N(int i10) {
        this.f9388a = new b<>(i10);
    }

    public final P a(O o10) {
        P d10 = this.f9388a.d(new C4674i(o10));
        if (d10 != null && !d10.w().j().b()) {
            return d10;
        }
        return null;
    }

    public final P b(O o10, P p10) {
        return this.f9388a.e(new C4674i(o10), p10);
    }
}
