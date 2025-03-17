package R2;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LR2/k;", "T", "", "<init>", "()V", "LR2/v;", "newState", "c", "(LR2/v;)LR2/v;", "LTJ/B;", "a", "LTJ/B;", "getCachedValue$annotations", "cachedValue", "()LR2/v;", "currentState", "LTJ/g;", "b", "()LTJ/g;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C16505B<v<T>> f12467a;

    public k() {
        z zVar = z.f12509b;
        C17542s.h(zVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f12467a = C16521S.a(zVar);
    }

    public final v<T> a() {
        return this.f12467a.getValue();
    }

    public final C16532g<v<T>> b() {
        return this.f12467a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r6.a() > r2.a()) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final R2.v<T> c(R2.v<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            TJ.B<R2.v<T>> r0 = r5.f12467a
        L_0x0007:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            R2.v r2 = (R2.v) r2
            boolean r3 = r2 instanceof R2.q
            if (r3 == 0) goto L_0x0014
            r3 = 1
            goto L_0x001a
        L_0x0014:
            R2.z r3 = R2.z.f12509b
            boolean r3 = kotlin.jvm.internal.C17542s.e(r2, r3)
        L_0x001a:
            if (r3 == 0) goto L_0x001d
            goto L_0x002b
        L_0x001d:
            boolean r3 = r2 instanceof R2.e
            if (r3 == 0) goto L_0x002d
            int r3 = r6.a()
            int r4 = r2.a()
            if (r3 <= r4) goto L_0x0031
        L_0x002b:
            r2 = r6
            goto L_0x0031
        L_0x002d:
            boolean r3 = r2 instanceof R2.l
            if (r3 == 0) goto L_0x0038
        L_0x0031:
            boolean r1 = r0.e(r1, r2)
            if (r1 == 0) goto L_0x0007
            return r2
        L_0x0038:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.k.c(R2.v):R2.v");
    }
}
