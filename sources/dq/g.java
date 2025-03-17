package dq;

import com.ingka.ikea.dynamicfields.datalayer.c;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldq/g;", "Ldq/a;", "Lcom/ingka/ikea/dynamicfields/datalayer/c;", "<init>", "()V", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends C11217a<c> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g() {
        /*
            r3 = this;
            java.lang.Class<com.ingka.ikea.dynamicfields.datalayer.c> r0 = com.ingka.ikea.dynamicfields.datalayer.c.class
            uI.d r0 = kotlin.jvm.internal.P.b(r0)
            java.lang.String r0 = r0.f()
            kotlin.jvm.internal.C17542s.g(r0)
            dq.e r1 = new dq.e
            r1.<init>()
            dq.f r2 = new dq.f
            r2.<init>()
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.g.<init>():void");
    }

    /* access modifiers changed from: private */
    public static final int f(c cVar) {
        C17542s.j(cVar, "it");
        return cVar.v();
    }

    /* access modifiers changed from: private */
    public static final c g(int i10) {
        for (c cVar : c.n()) {
            if (cVar.v() == i10) {
                return cVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
