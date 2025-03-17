package HD;

import GD.C12933f;
import GD.i;
import GD.j;
import GD.k;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LHD/e;", "", "<init>", "()V", "", "LGD/k;", "", "code", "", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Integer;", "LGD/j;", "state", "LGD/i;", "b", "(LGD/j;)LGD/i;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HD.e  reason: case insensitive filesystem */
public final class C12995e {
    private final Integer a(List<? extends k> list, String str) {
        Iterator<? extends k> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            k kVar = (k) it.next();
            k.b.f fVar = kVar instanceof k.b.f ? (k.b.f) kVar : null;
            if (C17542s.e(fVar != null ? fVar.b() : null, str)) {
                break;
            }
            i10++;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public final i b(j jVar) {
        C17542s.j(jVar, "state");
        ArrayList arrayList = new ArrayList();
        for (C12933f a10 : jVar.i()) {
            C16877v.E(arrayList, a10.a());
        }
        String g10 = jVar.g();
        return new i(arrayList, jVar.d(), jVar.j(), jVar.h(), jVar.c(), g10 != null ? a(arrayList, g10) : null, !(jVar.f() instanceof C12933f.a));
    }
}
