package jA;

import QJ.Q;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LjA/f;", "LjA/e;", "LjA/c;", "userSessionOrchestrator", "<init>", "(LjA/c;)V", "", "getToken", "()Ljava/lang/String;", "a", "LjA/c;", "", "b", "Z", "refreshing", "Ljava/lang/Object;", "c", "Ljava/lang/Object;", "lock", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C14611e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14609c f127842a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f127843b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f127844c = new Object();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.session.impl.usertoken.UserSessionTokenMonitorImpl$refreshToken$1$token$1", f = "UserSessionTokenMonitor.kt", l = {60}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127845c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f127846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f127846d = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f127846d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super String> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f127845c;
            if (i10 == 0) {
                y.b(obj);
                C14609c b10 = this.f127846d.f127842a;
                this.f127845c = 1;
                obj = b10.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    public f(C14609c cVar) {
        C17542s.j(cVar, "userSessionOrchestrator");
        this.f127842a = cVar;
    }

    public String a() {
        String str;
        if (this.f127843b) {
            return getToken();
        }
        synchronized (this.f127844c) {
            this.f127843b = true;
            str = (String) C16312j.b((C17168i) null, new a(this, (C17164e<? super a>) null), 1, (Object) null);
            this.f127843b = false;
            this.f127844c.notifyAll();
        }
        return str;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0003 A[DONT_GENERATE, EDGE_INSN: B:44:0x0003->B:41:0x0003 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getToken() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f127844c
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r13.f127843b     // Catch:{ all -> 0x000d }
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r13.f127844c     // Catch:{ InterruptedException -> 0x0010 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0010 }
            goto L_0x0003
        L_0x000d:
            r1 = move-exception
            goto L_0x00c7
        L_0x0010:
            qv.e r1 = qv.e.DEBUG     // Catch:{ all -> 0x000d }
            qv.d r2 = qv.d.f102012a     // Catch:{ all -> 0x000d }
            java.util.List r2 = r2.a()     // Catch:{ all -> 0x000d }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x000d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x000d }
            r3.<init>()     // Catch:{ all -> 0x000d }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x000d }
        L_0x0023:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x000d }
            r8 = 0
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x000d }
            r5 = r4
            qv.b r5 = (qv.C11819b) r5     // Catch:{ all -> 0x000d }
            boolean r5 = r5.b(r1, r8)     // Catch:{ all -> 0x000d }
            if (r5 == 0) goto L_0x0023
            r3.add(r4)     // Catch:{ all -> 0x000d }
            goto L_0x0023
        L_0x003b:
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x000d }
            r10 = 0
            r2 = r10
            r3 = r2
        L_0x0042:
            boolean r4 = r9.hasNext()     // Catch:{ all -> 0x000d }
            if (r4 == 0) goto L_0x0003
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x000d }
            qv.b r4 = (qv.C11819b) r4     // Catch:{ all -> 0x000d }
            r6 = 0
            if (r2 != 0) goto L_0x005e
            java.lang.String r2 = "Waiting for token failed."
            java.lang.String r2 = qv.C11818a.a(r2, r6)     // Catch:{ all -> 0x000d }
            if (r2 != 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            java.lang.String r2 = qv.C11820c.a(r2)     // Catch:{ all -> 0x000d }
        L_0x005e:
            r11 = r2
            if (r3 != 0) goto L_0x00ae
            java.lang.Class<jA.f> r2 = jA.f.class
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x000d }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ all -> 0x000d }
            r3 = 36
            r5 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r10, r5, r10)     // Catch:{ all -> 0x000d }
            r7 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r7, r10, r5, r10)     // Catch:{ all -> 0x000d }
            int r5 = r3.length()     // Catch:{ all -> 0x000d }
            if (r5 != 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)     // Catch:{ all -> 0x000d }
        L_0x0084:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x000d }
            java.lang.String r5 = "main"
            r7 = 1
            boolean r3 = HJ.C15854t.b0(r3, r5, r7)     // Catch:{ all -> 0x000d }
            if (r3 == 0) goto L_0x0098
            java.lang.String r3 = "m"
            goto L_0x009a
        L_0x0098:
            java.lang.String r3 = "b"
        L_0x009a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x000d }
            r5.<init>()     // Catch:{ all -> 0x000d }
            r5.append(r3)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = "|"
            r5.append(r3)     // Catch:{ all -> 0x000d }
            r5.append(r2)     // Catch:{ all -> 0x000d }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x000d }
        L_0x00ae:
            r12 = r3
            r2 = r4
            r3 = r1
            r4 = r12
            r5 = r8
            r7 = r11
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x000d }
            r2 = r11
            r3 = r12
            goto L_0x0042
        L_0x00ba:
            java.lang.Object r1 = r13.f127844c     // Catch:{ all -> 0x000d }
            r1.notifyAll()     // Catch:{ all -> 0x000d }
            jA.c r1 = r13.f127842a     // Catch:{ all -> 0x000d }
            java.lang.String r1 = r1.getToken()     // Catch:{ all -> 0x000d }
            monitor-exit(r0)
            return r1
        L_0x00c7:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jA.f.getToken():java.lang.String");
    }
}
