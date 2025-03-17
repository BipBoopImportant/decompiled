package Ap;

import dI.C17164e;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import up.C12074d;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"LAp/a;", "Lgp/b;", "Lup/d;", "consentRepository", "<init>", "(Lup/d;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lup/d;", "Lgp/e;", "Lgp/e;", "()Lgp/e;", "taskId", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C12074d f79059a;

    /* renamed from: b  reason: collision with root package name */
    private final C11346e f79060b = C11346e.USER_CONSENT_CLEAR;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.dataconsent.impl.task.UserConsentClearTask", f = "UserConsentClearTask.kt", l = {22}, m = "execute")
    /* renamed from: Ap.a$a  reason: collision with other inner class name */
    static final class C1463a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f79061c;

        /* renamed from: d  reason: collision with root package name */
        Object f79062d;

        /* renamed from: e  reason: collision with root package name */
        Object f79063e;

        /* renamed from: f  reason: collision with root package name */
        Object f79064f;

        /* renamed from: g  reason: collision with root package name */
        Object f79065g;

        /* renamed from: h  reason: collision with root package name */
        int f79066h;

        /* renamed from: i  reason: collision with root package name */
        int f79067i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f79068j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f79069k;

        /* renamed from: l  reason: collision with root package name */
        int f79070l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1463a(a aVar, C17164e<? super C1463a> eVar) {
            super(eVar);
            this.f79069k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79068j = obj;
            this.f79070l |= Integer.MIN_VALUE;
            return this.f79069k.b((Object) null, this);
        }
    }

    public a(C12074d dVar) {
        C17542s.j(dVar, "consentRepository");
        this.f79059a = dVar;
    }

    public C11346e a() {
        return this.f79060b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.Object r6, dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ap.a.C1463a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Ap.a$a r0 = (Ap.a.C1463a) r0
            int r1 = r0.f79070l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f79070l = r1
            goto L_0x0018
        L_0x0013:
            Ap.a$a r0 = new Ap.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f79068j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f79070l
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f79065g
            Ap.a r6 = (Ap.a) r6
            java.lang.Object r6 = r0.f79064f
            Ap.a r6 = (Ap.a) r6
            java.lang.Object r6 = r0.f79063e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f79061c
            Ap.a r6 = (Ap.a) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0064
        L_0x0039:
            r6 = move-exception
            goto L_0x006b
        L_0x003b:
            r6 = move-exception
            goto L_0x007e
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            up.d r1 = r5.f79059a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79061c = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79062d = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79063e = r7     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79064f = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79065g = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6 = 0
            r0.f79066h = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79067i = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f79070l = r4     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r6 = r1.a(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r6 != r2) goto L_0x0064
            return r2
        L_0x0064:
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0075
        L_0x006b:
            XH.x$a r7 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0075:
            boolean r6 = XH.x.h(r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
            return r6
        L_0x007e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ap.a.b(java.lang.Object, dI.e):java.lang.Object");
    }
}
