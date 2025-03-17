package Rw;

import Nn.C10803f;
import Nn.C10813p;
import Nn.K;
import Nn.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LRw/b;", "LRw/a;", "LNn/x;", "checkoutRepository", "<init>", "(LNn/x;)V", "", "checkoutId", "LNn/p;", "a", "(Ljava/lang/String;)LNn/p;", "LNn/x;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rw.b  reason: case insensitive filesystem */
public final class C13554b implements C13553a {

    /* renamed from: a  reason: collision with root package name */
    private final x f115603a;

    public C13554b(x xVar) {
        C17542s.j(xVar, "checkoutRepository");
        this.f115603a = xVar;
    }

    public C10813p a(String str) {
        K i10;
        C17542s.j(str, "checkoutId");
        C10803f s10 = this.f115603a.s(str);
        if (s10 == null || (i10 = s10.i()) == null) {
            return null;
        }
        return i10.c();
    }
}
