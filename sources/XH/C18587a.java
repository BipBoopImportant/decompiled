package xH;

import HJ.C15854t;
import QJ.C16283A;
import QJ.F0;
import dI.C17164e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0018\u0010\u0017\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0018\u0010\u0018\u001a\u00060\u0014j\u0002`\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"LxH/a;", "", "LxH/e;", "logger", "<init>", "(LxH/e;)V", "", "message", "LXH/N;", "c", "(Ljava/lang/String;)V", "f", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "d", "a", "()V", "b", "(LdI/e;)Ljava/lang/Object;", "LxH/e;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "requestLog", "responseLog", "LQJ/A;", "LQJ/A;", "requestLoggedMonitor", "responseHeaderMonitor", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: xH.a  reason: case insensitive filesystem */
public final class C18587a {

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f152182f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f152183g;

    /* renamed from: a  reason: collision with root package name */
    private final C18591e f152184a;

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f152185b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f152186c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    private final C16283A f152187d = J0.b((F0) null, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final C16283A f152188e = J0.b((F0) null, 1, (Object) null);
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", l = {52}, m = "closeResponseLog")
    /* renamed from: xH.a$a  reason: collision with other inner class name */
    static final class C4323a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f152189c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f152190d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C18587a f152191e;

        /* renamed from: f  reason: collision with root package name */
        int f152192f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4323a(C18587a aVar, C17164e<? super C4323a> eVar) {
            super(eVar);
            this.f152191e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152190d = obj;
            this.f152192f |= Integer.MIN_VALUE;
            return this.f152191e.b(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", l = {34}, m = "logResponseBody")
    /* renamed from: xH.a$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f152193c;

        /* renamed from: d  reason: collision with root package name */
        Object f152194d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152195e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18587a f152196f;

        /* renamed from: g  reason: collision with root package name */
        int f152197g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C18587a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f152196f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152195e = obj;
            this.f152197g |= Integer.MIN_VALUE;
            return this.f152196f.d((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.plugins.logging.HttpClientCallLogger", f = "HttpClientCallLogger.kt", l = {29}, m = "logResponseException")
    /* renamed from: xH.a$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f152198c;

        /* renamed from: d  reason: collision with root package name */
        Object f152199d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f152200e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C18587a f152201f;

        /* renamed from: g  reason: collision with root package name */
        int f152202g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C18587a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f152201f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f152200e = obj;
            this.f152202g |= Integer.MIN_VALUE;
            return this.f152201f.e((String) null, this);
        }
    }

    static {
        Class<C18587a> cls = C18587a.class;
        f152182f = AtomicIntegerFieldUpdater.newUpdater(cls, "requestLogged");
        f152183g = AtomicIntegerFieldUpdater.newUpdater(cls, "responseLogged");
    }

    public C18587a(C18591e eVar) {
        C17542s.j(eVar, "logger");
        this.f152184a = eVar;
    }

    public final void a() {
        if (f152182f.compareAndSet(this, 0, 1)) {
            try {
                String obj = C15854t.z1(this.f152185b).toString();
                if (obj.length() > 0) {
                    this.f152184a.log(obj);
                }
            } finally {
                this.f152187d.l();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xH.C18587a.C4323a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            xH.a$a r0 = (xH.C18587a.C4323a) r0
            int r1 = r0.f152192f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152192f = r1
            goto L_0x0018
        L_0x0013:
            xH.a$a r0 = new xH.a$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f152190d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f152192f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f152189c
            xH.a r0 = (xH.C18587a) r0
            XH.y.b(r5)
            goto L_0x0052
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            XH.y.b(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = f152183g
            r2 = 0
            boolean r5 = r5.compareAndSet(r4, r2, r3)
            if (r5 != 0) goto L_0x0044
            XH.N r5 = XH.C16807N.f139792a
            return r5
        L_0x0044:
            QJ.A r5 = r4.f152187d
            r0.f152189c = r4
            r0.f152192f = r3
            java.lang.Object r5 = r5.j0(r0)
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r0 = r4
        L_0x0052:
            java.lang.StringBuilder r5 = r0.f152186c
            java.lang.CharSequence r5 = HJ.C15854t.z1(r5)
            java.lang.String r5 = r5.toString()
            int r1 = r5.length()
            if (r1 <= 0) goto L_0x0067
            xH.e r0 = r0.f152184a
            r0.log(r5)
        L_0x0067:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xH.C18587a.b(dI.e):java.lang.Object");
    }

    public final void c(String str) {
        C17542s.j(str, "message");
        StringBuilder sb2 = this.f152185b;
        sb2.append(C15854t.z1(str).toString());
        C17542s.i(sb2, "append(value)");
        sb2.append(10);
        C17542s.i(sb2, "append('\\n')");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xH.C18587a.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xH.a$b r0 = (xH.C18587a.b) r0
            int r1 = r0.f152197g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152197g = r1
            goto L_0x0018
        L_0x0013:
            xH.a$b r0 = new xH.a$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f152195e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f152197g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f152194d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f152193c
            xH.a r0 = (xH.C18587a) r0
            XH.y.b(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            XH.y.b(r6)
            QJ.A r6 = r4.f152188e
            r0.f152193c = r4
            r0.f152194d = r5
            r0.f152197g = r3
            java.lang.Object r6 = r6.j0(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.StringBuilder r6 = r0.f152186c
            r6.append(r5)
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xH.C18587a.d(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r5, dI.C17164e<? super XH.C16807N> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xH.C18587a.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            xH.a$c r0 = (xH.C18587a.c) r0
            int r1 = r0.f152202g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f152202g = r1
            goto L_0x0018
        L_0x0013:
            xH.a$c r0 = new xH.a$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f152200e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f152202g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f152199d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f152198c
            xH.a r0 = (xH.C18587a) r0
            XH.y.b(r6)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            XH.y.b(r6)
            QJ.A r6 = r4.f152187d
            r0.f152198c = r4
            r0.f152199d = r5
            r0.f152202g = r3
            java.lang.Object r6 = r6.j0(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            xH.e r6 = r0.f152184a
            java.lang.CharSequence r5 = HJ.C15854t.z1(r5)
            java.lang.String r5 = r5.toString()
            r6.log(r5)
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xH.C18587a.e(java.lang.String, dI.e):java.lang.Object");
    }

    public final void f(String str) {
        C17542s.j(str, "message");
        StringBuilder sb2 = this.f152186c;
        sb2.append(C15854t.z1(str).toString());
        C17542s.i(sb2, "append(value)");
        sb2.append(10);
        C17542s.i(sb2, "append('\\n')");
        this.f152188e.l();
    }
}
