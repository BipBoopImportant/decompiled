package UJ;

import QJ.F0;
import WJ.z;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LUJ/v;", "LdI/i;", "currentContext", "LXH/N;", "b", "(LUJ/v;LdI/i;)V", "LQJ/F0;", "collectJob", "d", "(LQJ/F0;LQJ/F0;)LQJ/F0;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.y  reason: case insensitive filesystem */
public final class C16632y {
    public static final void b(C16629v<?> vVar, C17168i iVar) {
        if (((Number) iVar.fold(0, new C16631x(vVar))).intValue() != vVar.f139168e) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f139167d + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* access modifiers changed from: private */
    public static final int c(C16629v vVar, int i10, C17168i.b bVar) {
        C17168i.c key = bVar.getKey();
        C17168i.b bVar2 = vVar.f139167d.get(key);
        if (key == F0.f137562d0) {
            F0 f02 = (F0) bVar2;
            C17542s.h(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            F0 d10 = d((F0) bVar, f02);
            if (d10 == f02) {
                return f02 == null ? i10 : i10 + 1;
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d10 + ", expected child of " + f02 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        } else if (bVar != bVar2) {
            return Integer.MIN_VALUE;
        } else {
            return i10 + 1;
        }
    }

    public static final F0 d(F0 f02, F0 f03) {
        while (f02 != null) {
            if (f02 == f03 || !(f02 instanceof z)) {
                return f02;
            }
            f02 = ((z) f02).o0();
        }
        return null;
    }
}
