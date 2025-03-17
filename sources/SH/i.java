package sH;

import AH.C15413d;
import EH.C15611P;
import EH.C15631p;
import JH.C15954a;
import QJ.C16283A;
import QJ.F0;
import QJ.I0;
import QJ.P;
import dI.C17164e;
import dI.C17168i;
import java.util.ArrayList;
import kotlin.Metadata;
import pH.C17747b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"$\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"LsH/b;", "LQJ/F0;", "parentJob", "LdI/i;", "b", "(LsH/b;LQJ/F0;LdI/e;)Ljava/lang/Object;", "LAH/d;", "request", "LXH/N;", "d", "(LAH/d;)V", "LQJ/P;", "a", "LQJ/P;", "getCALL_COROUTINE", "()LQJ/P;", "CALL_COROUTINE", "LJH/a;", "LpH/b;", "LJH/a;", "c", "()LJH/a;", "CLIENT_CONFIG", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static final P f146994a = new P("call-context");

    /* renamed from: b  reason: collision with root package name */
    private static final C15954a<C17747b<?>> f146995b = new C15954a<>("client-config");

    public static final Object b(C17898b bVar, F0 f02, C17164e<? super C17168i> eVar) {
        C16283A a10 = I0.a(f02);
        C17168i plus = bVar.getCoroutineContext().plus(a10).plus(f146994a);
        F0 f03 = (F0) eVar.getContext().get(F0.f137562d0);
        if (f03 != null) {
            a10.s(new k(F0.a.d(f03, true, false, new l(a10), 2, (Object) null)));
        }
        return plus;
    }

    public static final C15954a<C17747b<?>> c() {
        return f146995b;
    }

    /* access modifiers changed from: private */
    public static final void d(C15413d dVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : dVar.e().names()) {
            if (C15631p.f134088a.p().contains((String) next)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new C15611P(arrayList.toString());
        }
    }
}
