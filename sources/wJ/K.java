package WJ;

import QJ.c1;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"LdI/i;", "context", "", "g", "(LdI/i;)Ljava/lang/Object;", "countOrElement", "i", "(LdI/i;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "LXH/N;", "f", "(LdI/i;Ljava/lang/Object;)V", "LWJ/D;", "a", "LWJ/D;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "LdI/i$b;", "b", "LnI/p;", "countAll", "LQJ/c1;", "c", "findOne", "LWJ/Q;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public static final C16735D f139530a = new C16735D("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, C17168i.b, Object> f139531b = new C16739H();

    /* renamed from: c  reason: collision with root package name */
    private static final p<c1<?>, C17168i.b, c1<?>> f139532c = new I();

    /* renamed from: d  reason: collision with root package name */
    private static final p<Q, C17168i.b, Q> f139533d = new J();

    /* access modifiers changed from: private */
    public static final Object d(Object obj, C17168i.b bVar) {
        if (!(bVar instanceof c1)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
    }

    /* access modifiers changed from: private */
    public static final c1<?> e(c1<?> c1Var, C17168i.b bVar) {
        if (c1Var != null) {
            return c1Var;
        }
        if (bVar instanceof c1) {
            return (c1) bVar;
        }
        return null;
    }

    public static final void f(C17168i iVar, Object obj) {
        if (obj != f139530a) {
            if (obj instanceof Q) {
                ((Q) obj).b(iVar);
                return;
            }
            Object fold = iVar.fold(null, f139532c);
            C17542s.h(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((c1) fold).N(iVar, obj);
        }
    }

    public static final Object g(C17168i iVar) {
        Object fold = iVar.fold(0, f139531b);
        C17542s.g(fold);
        return fold;
    }

    /* access modifiers changed from: private */
    public static final Q h(Q q10, C17168i.b bVar) {
        if (bVar instanceof c1) {
            c1 c1Var = (c1) bVar;
            q10.a(c1Var, c1Var.t0(q10.f139540a));
        }
        return q10;
    }

    public static final Object i(C17168i iVar, Object obj) {
        if (obj == null) {
            obj = g(iVar);
        }
        if (obj == 0) {
            return f139530a;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new Q(iVar, ((Number) obj).intValue()), f139533d);
        }
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((c1) obj).t0(iVar);
    }
}
