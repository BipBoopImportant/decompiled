package Mc;

import Fb.f;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LMc/k;", "", "LFb/f;", "firebaseApp", "LOc/f;", "settings", "LdI/i;", "backgroundDispatcher", "LMc/F;", "lifecycleServiceBinder", "<init>", "(LFb/f;LOc/f;LdI/i;LMc/F;)V", "a", "LFb/f;", "b", "LOc/f;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final b f61813c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f61814a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Oc.f f61815b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {45, 49}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61816c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f61817d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17168i f61818e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F f61819f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, C17168i iVar, F f10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f61817d = kVar;
            this.f61818e = iVar;
            this.f61819f = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f61817d, this.f61818e, this.f61819f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f61816c
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r4) goto L_0x001c
                if (r1 != r3) goto L_0x0014
                XH.y.b(r6)
                goto L_0x0069
            L_0x0014:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001c:
                XH.y.b(r6)
                goto L_0x002e
            L_0x0020:
                XH.y.b(r6)
                Nc.a r6 = Nc.a.f61986a
                r5.f61816c = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L_0x002e
                return r0
            L_0x002e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L_0x0044
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0044
                goto L_0x009b
            L_0x0044:
                java.util.Iterator r6 = r6.iterator()
            L_0x0048:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x009b
                java.lang.Object r1 = r6.next()
                Nc.b r1 = (Nc.b) r1
                boolean r1 = r1.a()
                if (r1 == 0) goto L_0x0048
                Mc.k r6 = r5.f61817d
                Oc.f r6 = r6.f61815b
                r5.f61816c = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L_0x0069
                return r0
            L_0x0069:
                Mc.k r6 = r5.f61817d
                Oc.f r6 = r6.f61815b
                boolean r6 = r6.d()
                if (r6 != 0) goto L_0x007b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L_0x00a0
            L_0x007b:
                Mc.D r6 = new Mc.D
                dI.i r0 = r5.f61818e
                r6.<init>(r0)
                Mc.F r0 = r5.f61819f
                r6.i(r0)
                Mc.H r0 = Mc.H.f61755a
                r0.a(r6)
                Mc.k r6 = r5.f61817d
                Fb.f r6 = r6.f61814a
                Mc.j r0 = new Mc.j
                r0.<init>()
                r6.h(r0)
                goto L_0x00a0
            L_0x009b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            L_0x00a0:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Mc.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMc/k$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public k(f fVar, Oc.f fVar2, C17168i iVar, F f10) {
        C17542s.j(fVar, "firebaseApp");
        C17542s.j(fVar2, "settings");
        C17542s.j(iVar, "backgroundDispatcher");
        C17542s.j(f10, "lifecycleServiceBinder");
        this.f61814a = fVar;
        this.f61815b = fVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = fVar.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f61755a);
            F0 unused = C16314k.d(S.a(iVar), (C17168i) null, (T) null, new a(this, iVar, f10, (C17164e<? super a>) null), 3, (Object) null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
