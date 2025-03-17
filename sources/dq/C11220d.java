package dq;

import com.ingka.ikea.dynamicfields.datalayer.b;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ldq/d;", "Ldq/a;", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "<init>", "()V", "dynamicfields-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dq.d  reason: case insensitive filesystem */
public final class C11220d extends C11217a<b> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11220d() {
        /*
            r3 = this;
            java.lang.Class<com.ingka.ikea.dynamicfields.datalayer.b> r0 = com.ingka.ikea.dynamicfields.datalayer.b.class
            uI.d r0 = kotlin.jvm.internal.P.b(r0)
            java.lang.String r0 = r0.f()
            kotlin.jvm.internal.C17542s.g(r0)
            dq.b r1 = new dq.b
            r1.<init>()
            dq.c r2 = new dq.c
            r2.<init>()
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.C11220d.<init>():void");
    }

    /* access modifiers changed from: private */
    public static final int f(b bVar) {
        C17542s.j(bVar, "it");
        return bVar.v();
    }

    /* access modifiers changed from: private */
    public static final b g(int i10) {
        for (b bVar : b.n()) {
            if (bVar.v() == i10) {
                return bVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
