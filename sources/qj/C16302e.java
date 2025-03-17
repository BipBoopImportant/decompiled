package QJ;

import XH.C16807N;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH@¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u000b\u0010\r\u001a\u00020\u00028\u0002X\u0004¨\u0006\u000f"}, d2 = {"LQJ/e;", "T", "", "", "LQJ/Y;", "deferreds", "<init>", "([LQJ/Y;)V", "", "c", "(LdI/e;)Ljava/lang/Object;", "a", "[LQJ/Y;", "notCompletedCount", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.e  reason: case insensitive filesystem */
final class C16302e<T> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137615b = AtomicIntegerFieldUpdater.newUpdater(C16302e.class, "notCompletedCount$volatile");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Y<T>[] f137616a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R<\u0010\u001d\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00172\u0012\u0010\u0018\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00178F@FX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00170\"8\u0002X\u0004¨\u0006$"}, d2 = {"LQJ/e$a;", "LQJ/K0;", "LQJ/n;", "", "continuation", "<init>", "(LQJ/e;LQJ/n;)V", "", "cause", "LXH/N;", "x", "(Ljava/lang/Throwable;)V", "e", "LQJ/n;", "LQJ/k0;", "f", "LQJ/k0;", "A", "()LQJ/k0;", "D", "(LQJ/k0;)V", "handle", "LQJ/e$b;", "LQJ/e;", "value", "z", "()LQJ/e$b;", "C", "(LQJ/e$b;)V", "disposer", "", "w", "()Z", "onCancelling", "", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.e$a */
    private final class a extends K0 {
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f137617h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e  reason: collision with root package name */
        private final C16320n<List<? extends T>> f137618e;

        /* renamed from: f  reason: collision with root package name */
        public C16315k0 f137619f;

        public a(C16320n<? super List<? extends T>> nVar) {
            this.f137618e = nVar;
        }

        public final C16315k0 A() {
            C16315k0 k0Var = this.f137619f;
            if (k0Var != null) {
                return k0Var;
            }
            C17542s.z("handle");
            return null;
        }

        public final void C(C16302e<T>.defpackage.b bVar) {
            f137617h.set(this, bVar);
        }

        public final void D(C16315k0 k0Var) {
            this.f137619f = k0Var;
        }

        public boolean w() {
            return false;
        }

        public void x(Throwable th2) {
            if (th2 != null) {
                Object D10 = this.f137618e.D(th2);
                if (D10 != null) {
                    this.f137618e.T(D10);
                    C16302e<T>.defpackage.b z10 = z();
                    if (z10 != null) {
                        z10.a();
                    }
                }
            } else if (C16302e.f137615b.decrementAndGet(C16302e.this) == 0) {
                C16320n<List<? extends T>> nVar = this.f137618e;
                Y[] a10 = C16302e.this.f137616a;
                ArrayList arrayList = new ArrayList(a10.length);
                for (Y o10 : a10) {
                    arrayList.add(o10.o());
                }
                nVar.resumeWith(x.b(arrayList));
            }
        }

        public final C16302e<T>.defpackage.b z() {
            return (b) f137617h.get(this);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"LQJ/e$b;", "LQJ/m;", "", "LQJ/e$a;", "LQJ/e;", "nodes", "<init>", "(LQJ/e;[LQJ/e$a;)V", "LXH/N;", "a", "()V", "", "cause", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "[LQJ/e$a;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: QJ.e$b */
    private final class b implements C16318m {

        /* renamed from: a  reason: collision with root package name */
        private final C16302e<T>.defpackage.a[] f137621a;

        public b(C16302e<T>.defpackage.a[] aVarArr) {
            this.f137621a = aVarArr;
        }

        public final void a() {
            for (C16302e<T>.defpackage.a A10 : this.f137621a) {
                A10.A().b();
            }
        }

        public void b(Throwable th2) {
            a();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f137621a + ']';
        }
    }

    public C16302e(Y<? extends T>[] yArr) {
        this.f137616a = yArr;
        this.notCompletedCount$volatile = yArr.length;
    }

    public final Object c(C17164e<? super List<? extends T>> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        int length = this.f137616a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            Y y10 = this.f137616a[i10];
            y10.start();
            a aVar = new a(pVar);
            aVar.D(J0.o(y10, false, aVar, 1, (Object) null));
            C16807N n10 = C16807N.f139792a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].C(bVar);
        }
        if (pVar.h()) {
            bVar.a();
        } else {
            r.c(pVar, bVar);
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }
}
