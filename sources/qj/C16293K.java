package QJ;

import dI.C17164e;
import dI.C17165f;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LQJ/Q;", "LdI/i;", "context", "j", "(LQJ/Q;LdI/i;)LdI/i;", "addedContext", "k", "(LdI/i;LdI/i;)LdI/i;", "", "h", "(LdI/i;)Z", "originalContext", "appendContext", "isNewCoroutine", "d", "(LdI/i;LdI/i;Z)LdI/i;", "LdI/e;", "", "oldValue", "LQJ/o1;", "m", "(LdI/e;LdI/i;Ljava/lang/Object;)LQJ/o1;", "Lkotlin/coroutines/jvm/internal/e;", "l", "(Lkotlin/coroutines/jvm/internal/e;)LQJ/o1;", "", "g", "(LdI/i;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.K  reason: case insensitive filesystem */
public final class C16293K {
    private static final C17168i d(C17168i iVar, C17168i iVar2, boolean z10) {
        boolean h10 = h(iVar);
        boolean h11 = h(iVar2);
        if (!h10 && !h11) {
            return iVar.plus(iVar2);
        }
        O o10 = new O();
        o10.f144348a = iVar2;
        C17169j jVar = C17169j.f142968a;
        C17168i iVar3 = (C17168i) iVar.fold(jVar, new C16291I(o10, z10));
        if (h11) {
            o10.f144348a = ((C17168i) o10.f144348a).fold(jVar, new C16292J());
        }
        return iVar3.plus((C17168i) o10.f144348a);
    }

    /* access modifiers changed from: private */
    public static final C17168i e(O o10, boolean z10, C17168i iVar, C17168i.b bVar) {
        if (!(bVar instanceof C16288F)) {
            return iVar.plus(bVar);
        }
        C17168i.b bVar2 = ((C17168i) o10.f144348a).get(bVar.getKey());
        if (bVar2 == null) {
            return iVar.plus(z10 ? ((C16288F) bVar).F() : (C16288F) bVar);
        }
        o10.f144348a = ((C17168i) o10.f144348a).minusKey(bVar.getKey());
        return iVar.plus(((C16288F) bVar).B(bVar2));
    }

    /* access modifiers changed from: private */
    public static final C17168i f(C17168i iVar, C17168i.b bVar) {
        return bVar instanceof C16288F ? iVar.plus(((C16288F) bVar).F()) : iVar.plus(bVar);
    }

    public static final String g(C17168i iVar) {
        return null;
    }

    private static final boolean h(C17168i iVar) {
        return ((Boolean) iVar.fold(Boolean.FALSE, new C16290H())).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final boolean i(boolean z10, C17168i.b bVar) {
        return z10 || (bVar instanceof C16288F);
    }

    public static final C17168i j(Q q10, C17168i iVar) {
        C17168i d10 = d(q10.getCoroutineContext(), iVar, true);
        return (d10 == C16311i0.a() || d10.get(C17165f.f142966s0) != null) ? d10 : d10.plus(C16311i0.a());
    }

    public static final C17168i k(C17168i iVar, C17168i iVar2) {
        return !h(iVar2) ? iVar.plus(iVar2) : d(iVar, iVar2, false);
    }

    public static final o1<?> l(e eVar) {
        while (!(eVar instanceof C16303e0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof o1) {
                return (o1) eVar;
            }
        }
        return null;
    }

    public static final o1<?> m(C17164e<?> eVar, C17168i iVar, Object obj) {
        if (!(eVar instanceof e) || iVar.get(p1.f137676a) == null) {
            return null;
        }
        o1<?> l10 = l((e) eVar);
        if (l10 != null) {
            l10.i1(iVar, obj);
        }
        return l10;
    }
}
