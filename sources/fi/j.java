package Fi;

import aA.C13909a;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lD.C14762d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LFi/j;", "LFi/i;", "LaA/a;", "sessionManager", "LlD/d;", "getProfileUseCase", "<init>", "(LaA/a;LlD/d;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "LaA/a;", "b", "LlD/d;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f80866a;

    /* renamed from: b  reason: collision with root package name */
    private final C14762d f80867b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.usecase.GetUserIdUseCaseImpl", f = "GetUserIdUseCase.kt", l = {22}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f80868c;

        /* renamed from: d  reason: collision with root package name */
        Object f80869d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80870e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f80871f;

        /* renamed from: g  reason: collision with root package name */
        int f80872g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f80871f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80870e = obj;
            this.f80872g |= Integer.MIN_VALUE;
            return this.f80871f.a(this);
        }
    }

    public j(C13909a aVar, C14762d dVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(dVar, "getProfileUseCase");
        this.f80866a = aVar;
        this.f80867b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Fi.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Fi.j$a r0 = (Fi.j.a) r0
            int r1 = r0.f80872g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80872g = r1
            goto L_0x0018
        L_0x0013:
            Fi.j$a r0 = new Fi.j$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f80870e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80872g
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r5) goto L_0x0032
            java.lang.Object r7 = r0.f80869d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f80868c
            Fi.j r7 = (Fi.j) r7
            XH.y.b(r1)
            goto L_0x0054
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003a:
            XH.y.b(r1)
            aA.a r1 = r6.f80866a
            boolean r1 = r1.isLoggedIn()
            if (r1 == 0) goto L_0x0078
            lD.d r1 = r6.f80867b
            r0.f80868c = r6
            r0.f80869d = r7
            r0.f80872g = r5
            java.lang.Object r1 = r1.a(r5, r0)
            if (r1 != r2) goto L_0x0054
            return r2
        L_0x0054:
            kD.h r1 = (kD.h) r1
            if (r1 == 0) goto L_0x0078
            java.lang.String r7 = r1.b()
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0067
            java.lang.String r4 = r1.b()
            goto L_0x0078
        L_0x0067:
            java.lang.String r7 = r1.h()
            if (r7 == 0) goto L_0x0078
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0074
            goto L_0x0078
        L_0x0074:
            java.lang.String r4 = r1.h()
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Fi.j.a(dI.e):java.lang.Object");
    }
}
