package QJ;

import WJ.K;
import WJ.z;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"LQJ/o1;", "T", "LWJ/z;", "LdI/i;", "context", "LdI/e;", "uCont", "<init>", "(LdI/i;LdI/e;)V", "LXH/N;", "h1", "()V", "", "oldValue", "i1", "(LdI/i;Ljava/lang/Object;)V", "", "g1", "()Z", "f1", "state", "b1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "LXH/v;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o1<T> extends z<T> {

    /* renamed from: e  reason: collision with root package name */
    private final ThreadLocal<v<C17168i, Object>> f137661e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o1(dI.C17168i r3, dI.C17164e<? super T> r4) {
        /*
            r2 = this;
            QJ.p1 r0 = QJ.p1.f137676a
            dI.i$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            dI.i r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f137661e = r0
            dI.i r4 = r4.getContext()
            dI.f$b r0 = dI.C17165f.f142966s0
            dI.i$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof QJ.M
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = WJ.K.i(r3, r4)
            WJ.K.f(r3, r4)
            r2.i1(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.o1.<init>(dI.i, dI.e):void");
    }

    private final void h1() {
        if (this.threadLocalIsSet) {
            v vVar = this.f137661e.get();
            if (vVar != null) {
                K.f((C17168i) vVar.a(), vVar.b());
            }
            this.f137661e.remove();
        }
    }

    /* access modifiers changed from: protected */
    public void b1(Object obj) {
        h1();
        Object a10 = C16287E.a(obj, this.f139586d);
        C17164e<T> eVar = this.f139586d;
        C17168i context = eVar.getContext();
        o1<?> o1Var = null;
        Object i10 = K.i(context, o1Var);
        if (i10 != K.f139530a) {
            o1Var = C16293K.m(eVar, context, i10);
        }
        try {
            this.f139586d.resumeWith(a10);
            C16807N n10 = C16807N.f139792a;
        } finally {
            if (o1Var == null || o1Var.g1()) {
                K.f(context, i10);
            }
        }
    }

    public void f1() {
        h1();
    }

    public final boolean g1() {
        boolean z10 = this.threadLocalIsSet && this.f137661e.get() == null;
        this.f137661e.remove();
        return !z10;
    }

    public final void i1(C17168i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f137661e.set(C16796C.a(iVar, obj));
    }
}
