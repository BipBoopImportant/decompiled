package WJ;

import QJ.c1;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LWJ/Q;", "", "LdI/i;", "context", "", "n", "<init>", "(LdI/i;I)V", "LQJ/c1;", "element", "value", "LXH/N;", "a", "(LQJ/c1;Ljava/lang/Object;)V", "b", "(LdI/i;)V", "LdI/i;", "", "[Ljava/lang/Object;", "values", "c", "[LQJ/c1;", "elements", "d", "I", "i", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Q {

    /* renamed from: a  reason: collision with root package name */
    public final C17168i f139540a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f139541b;

    /* renamed from: c  reason: collision with root package name */
    private final c1<Object>[] f139542c;

    /* renamed from: d  reason: collision with root package name */
    private int f139543d;

    public Q(C17168i iVar, int i10) {
        this.f139540a = iVar;
        this.f139541b = new Object[i10];
        this.f139542c = new c1[i10];
    }

    public final void a(c1<?> c1Var, Object obj) {
        Object[] objArr = this.f139541b;
        int i10 = this.f139543d;
        objArr[i10] = obj;
        c1<Object>[] c1VarArr = this.f139542c;
        this.f139543d = i10 + 1;
        C17542s.h(c1Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        c1VarArr[i10] = c1Var;
    }

    public final void b(C17168i iVar) {
        int length = this.f139542c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                c1<Object> c1Var = this.f139542c[length];
                C17542s.g(c1Var);
                c1Var.N(iVar, this.f139541b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
