package s0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls0/F;", "Ls0/t;", "Ls0/E;", "paddingValues", "<init>", "(Ls0/E;)V", "Ls0/T;", "modifierLocalInsets", "a", "(Ls0/T;)Ls0/T;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "e", "Ls0/E;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.F  reason: case insensitive filesystem */
final class C5835F extends C5874t {

    /* renamed from: e  reason: collision with root package name */
    private final C5834E f28717e;

    public C5835F(C5834E e10) {
        super((DefaultConstructorMarker) null);
        this.f28717e = e10;
    }

    public C5848T a(C5848T t10) {
        return C5850V.d(C5850V.e(this.f28717e), t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5835F)) {
            return false;
        }
        return C17542s.e(((C5835F) obj).f28717e, this.f28717e);
    }

    public int hashCode() {
        return this.f28717e.hashCode();
    }
}
