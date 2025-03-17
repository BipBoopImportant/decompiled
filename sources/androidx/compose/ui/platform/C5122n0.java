package androidx.compose.ui.platform;

import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import g1.C5342k;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/n0;", "", "<init>", "()V", "LXH/N;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "c", "sent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.n0  reason: case insensitive filesystem */
public final class C5122n0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C5122n0 f19522a = new C5122n0();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f19523b = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicBoolean f19524c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public static final int f19525d = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.n0$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f19526c;

        /* renamed from: d  reason: collision with root package name */
        Object f19527d;

        /* renamed from: e  reason: collision with root package name */
        int f19528e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16434j<C16807N> f19529f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16434j<C16807N> jVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f19529f = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f19529f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
            SJ.C16440p.a(r3, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ all -> 0x005e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f19528e
                r2 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r5.f19527d
                SJ.l r1 = (SJ.C16436l) r1
                java.lang.Object r3 = r5.f19526c
                SJ.A r3 = (SJ.C16422A) r3
                XH.y.b(r6)     // Catch:{ all -> 0x0017 }
                goto L_0x0038
            L_0x0017:
                r6 = move-exception
                goto L_0x005d
            L_0x0019:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0021:
                XH.y.b(r6)
                SJ.j<XH.N> r3 = r5.f19529f
                SJ.l r6 = r3.iterator()     // Catch:{ all -> 0x0017 }
                r1 = r6
            L_0x002b:
                r5.f19526c = r3     // Catch:{ all -> 0x0017 }
                r5.f19527d = r1     // Catch:{ all -> 0x0017 }
                r5.f19528e = r2     // Catch:{ all -> 0x0017 }
                java.lang.Object r6 = r1.a(r5)     // Catch:{ all -> 0x0017 }
                if (r6 != r0) goto L_0x0038
                return r0
            L_0x0038:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0017 }
                boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0017 }
                if (r6 == 0) goto L_0x0054
                java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0017 }
                XH.N r6 = (XH.C16807N) r6     // Catch:{ all -> 0x0017 }
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.C5122n0.f19524c     // Catch:{ all -> 0x0017 }
                r4 = 0
                r6.set(r4)     // Catch:{ all -> 0x0017 }
                g1.k$a r6 = g1.C5342k.f23395e     // Catch:{ all -> 0x0017 }
                r6.o()     // Catch:{ all -> 0x0017 }
                goto L_0x002b
            L_0x0054:
                XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0017 }
                r6 = 0
                SJ.C16440p.a(r3, r6)
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x005d:
                throw r6     // Catch:{ all -> 0x005e }
            L_0x005e:
                r0 = move-exception
                SJ.C16440p.a(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5122n0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.n0$b */
    static final class b extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16434j<C16807N> f19530c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16434j<C16807N> jVar) {
            super(1);
            this.f19530c = jVar;
        }

        public final void a(Object obj) {
            if (C5122n0.f19524c.compareAndSet(false, true)) {
                this.f19530c.k(C16807N.f139792a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    private C5122n0() {
    }

    public final void b() {
        if (f19523b.compareAndSet(false, true)) {
            C16434j b10 = C16437m.b(1, (C16428d) null, (C17642l) null, 6, (Object) null);
            F0 unused = C16314k.d(S.a(O.f19306l.b()), (C17168i) null, (T) null, new a(b10, (C17164e<? super a>) null), 3, (Object) null);
            C5342k.f23395e.l(new b(b10));
        }
    }
}
