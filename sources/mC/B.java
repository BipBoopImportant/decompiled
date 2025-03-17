package Mc;

import Fb.f;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import android.util.Log;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nc.e;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"LMc/B;", "Lcom/google/firebase/sessions/b;", "LFb/f;", "firebaseApp", "Lnc/e;", "firebaseInstallations", "LOc/f;", "sessionSettings", "LMc/h;", "eventGDTLogger", "LdI/i;", "backgroundDispatcher", "<init>", "(LFb/f;Lnc/e;LOc/f;LMc/h;LdI/i;)V", "LMc/z;", "sessionEvent", "LXH/N;", "g", "(LMc/z;)V", "", "i", "(LdI/e;)Ljava/lang/Object;", "h", "()Z", "LMc/y;", "sessionDetails", "a", "(LMc/y;)V", "b", "LFb/f;", "c", "Lnc/e;", "d", "LOc/f;", "e", "LMc/h;", "f", "LdI/i;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class B implements com.google.firebase.sessions.b {

    /* renamed from: g  reason: collision with root package name */
    public static final a f61713g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    private static final double f61714h = Math.random();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final f f61715b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final e f61716c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Oc.f f61717d;

    /* renamed from: e  reason: collision with root package name */
    private final C9149h f61718e;

    /* renamed from: f  reason: collision with root package name */
    private final C17168i f61719f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LMc/B$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "randomValueForSampling", "D", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {63, 64, 70}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f61720c;

        /* renamed from: d  reason: collision with root package name */
        Object f61721d;

        /* renamed from: e  reason: collision with root package name */
        Object f61722e;

        /* renamed from: f  reason: collision with root package name */
        Object f61723f;

        /* renamed from: g  reason: collision with root package name */
        Object f61724g;

        /* renamed from: h  reason: collision with root package name */
        Object f61725h;

        /* renamed from: i  reason: collision with root package name */
        int f61726i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ B f61727j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ y f61728k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(B b10, y yVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f61727j = b10;
            this.f61728k = yVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f61727j, this.f61728k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f61726i
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0045
                if (r1 == r4) goto L_0x0041
                if (r1 == r3) goto L_0x003d
                if (r1 != r2) goto L_0x0035
                java.lang.Object r0 = r10.f61725h
                Oc.f r0 = (Oc.f) r0
                java.lang.Object r1 = r10.f61724g
                Mc.y r1 = (Mc.y) r1
                java.lang.Object r2 = r10.f61723f
                Fb.f r2 = (Fb.f) r2
                java.lang.Object r3 = r10.f61722e
                Mc.A r3 = (Mc.A) r3
                java.lang.Object r4 = r10.f61721d
                Mc.B r4 = (Mc.B) r4
                java.lang.Object r5 = r10.f61720c
                Mc.s r5 = (Mc.s) r5
                XH.y.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L_0x009d
            L_0x0035:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x003d:
                XH.y.b(r11)
                goto L_0x006c
            L_0x0041:
                XH.y.b(r11)
                goto L_0x0053
            L_0x0045:
                XH.y.b(r11)
                Mc.B r11 = r10.f61727j
                r10.f61726i = r4
                java.lang.Object r11 = r11.i(r10)
                if (r11 != r0) goto L_0x0053
                return r0
            L_0x0053:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x00b0
                Mc.s$a r11 = Mc.s.f61821c
                Mc.B r1 = r10.f61727j
                nc.e r1 = r1.f61716c
                r10.f61726i = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L_0x006c
                return r0
            L_0x006c:
                r5 = r11
                Mc.s r5 = (Mc.s) r5
                Mc.B r4 = r10.f61727j
                Mc.A r3 = Mc.A.f61711a
                Fb.f r11 = r4.f61715b
                Mc.y r1 = r10.f61728k
                Mc.B r6 = r10.f61727j
                Oc.f r6 = r6.f61717d
                Nc.a r7 = Nc.a.f61986a
                r10.f61720c = r5
                r10.f61721d = r4
                r10.f61722e = r3
                r10.f61723f = r11
                r10.f61724g = r1
                r10.f61725h = r6
                r10.f61726i = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L_0x0096
                return r0
            L_0x0096:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L_0x009d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.b()
                java.lang.String r6 = r5.a()
                r5 = r11
                Mc.z r11 = r0.a(r1, r2, r3, r4, r5, r6)
                r7.g(r11)
            L_0x00b0:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Mc.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {94}, m = "shouldLogSession")
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f61729c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f61730d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ B f61731e;

        /* renamed from: f  reason: collision with root package name */
        int f61732f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(B b10, C17164e<? super c> eVar) {
            super(eVar);
            this.f61731e = b10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61730d = obj;
            this.f61732f |= Integer.MIN_VALUE;
            return this.f61731e.i(this);
        }
    }

    public B(f fVar, e eVar, Oc.f fVar2, C9149h hVar, C17168i iVar) {
        C17542s.j(fVar, "firebaseApp");
        C17542s.j(eVar, "firebaseInstallations");
        C17542s.j(fVar2, "sessionSettings");
        C17542s.j(hVar, "eventGDTLogger");
        C17542s.j(iVar, "backgroundDispatcher");
        this.f61715b = fVar;
        this.f61716c = eVar;
        this.f61717d = fVar2;
        this.f61718e = hVar;
        this.f61719f = iVar;
    }

    /* access modifiers changed from: private */
    public final void g(z zVar) {
        try {
            this.f61718e.a(zVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        return f61714h <= this.f61717d.b();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Mc.B.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Mc.B$c r0 = (Mc.B.c) r0
            int r1 = r0.f61732f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f61732f = r1
            goto L_0x0018
        L_0x0013:
            Mc.B$c r0 = new Mc.B$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f61730d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f61732f
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.f61729c
            Mc.B r0 = (Mc.B) r0
            XH.y.b(r6)
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            XH.y.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            Oc.f r6 = r5.f61717d
            r0.f61729c = r5
            r0.f61732f = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
        L_0x004d:
            Oc.f r6 = r0.f61717d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L_0x0060
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L_0x0060:
            boolean r6 = r0.h()
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L_0x0070:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Mc.B.i(dI.e):java.lang.Object");
    }

    public void a(y yVar) {
        C17542s.j(yVar, "sessionDetails");
        F0 unused = C16314k.d(S.a(this.f61719f), (C17168i) null, (T) null, new b(this, yVar, (C17164e<? super b>) null), 3, (Object) null);
    }
}
