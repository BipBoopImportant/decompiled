package cf;

import am.C11070a;
import cD.C14032d;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lD.C14762d;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcf/u;", "Lcf/t;", "LlD/d;", "getProfile", "Lam/a;", "appApi", "LcD/d;", "publisherAccountRepository", "<init>", "(LlD/d;Lam/a;LcD/d;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "LlD/d;", "b", "Lam/a;", "c", "LcD/d;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final C14762d f65748a;

    /* renamed from: b  reason: collision with root package name */
    private final C11070a f65749b;

    /* renamed from: c  reason: collision with root package name */
    private final C14032d f65750c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.auth.legal.CheckIfAllowedPublisherModeUseCaseImpl", f = "CheckIfAllowedPublisherModeUseCase.kt", l = {30, 38}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f65751c;

        /* renamed from: d  reason: collision with root package name */
        Object f65752d;

        /* renamed from: e  reason: collision with root package name */
        Object f65753e;

        /* renamed from: f  reason: collision with root package name */
        Object f65754f;

        /* renamed from: g  reason: collision with root package name */
        Object f65755g;

        /* renamed from: h  reason: collision with root package name */
        int f65756h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f65757i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ u f65758j;

        /* renamed from: k  reason: collision with root package name */
        int f65759k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f65758j = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f65757i = obj;
            this.f65759k |= Integer.MIN_VALUE;
            return this.f65758j.a(this);
        }
    }

    public u(C14762d dVar, C11070a aVar, C14032d dVar2) {
        C17542s.j(dVar, "getProfile");
        C17542s.j(aVar, "appApi");
        C17542s.j(dVar2, "publisherAccountRepository");
        this.f65748a = dVar;
        this.f65749b = aVar;
        this.f65750c = dVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof cf.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            cf.u$a r0 = (cf.u.a) r0
            int r1 = r0.f65759k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f65759k = r1
            goto L_0x0018
        L_0x0013:
            cf.u$a r0 = new cf.u$a
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f65757i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f65759k
            r4 = 1
            r5 = 0
            r6 = 2
            r7 = 0
            if (r3 == 0) goto L_0x0057
            if (r3 == r4) goto L_0x004b
            if (r3 != r6) goto L_0x0043
            java.lang.Object r10 = r0.f65755g
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f65754f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f65753e
            kD.h r10 = (kD.h) r10
            java.lang.Object r10 = r0.f65752d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r10 = r0.f65751c
            cf.u r10 = (cf.u) r10
            XH.y.b(r1)
            goto L_0x00c1
        L_0x0043:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x004b:
            java.lang.Object r10 = r0.f65752d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r3 = r0.f65751c
            cf.u r3 = (cf.u) r3
            XH.y.b(r1)
            goto L_0x0077
        L_0x0057:
            XH.y.b(r1)
            am.a r1 = r9.f65749b
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0067
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r10
        L_0x0067:
            lD.d r1 = r9.f65748a
            r0.f65751c = r9
            r0.f65752d = r10
            r0.f65759k = r4
            java.lang.Object r1 = lD.C14762d.a.a(r1, r7, r0, r4, r5)
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r3 = r9
        L_0x0077:
            kD.h r1 = (kD.h) r1
            if (r1 != 0) goto L_0x0080
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r10
        L_0x0080:
            java.lang.String r4 = r1.b()
            java.lang.String r8 = "@ingka.com"
            boolean r8 = HJ.C15854t.G(r4, r8, r7, r6, r5)
            if (r8 != 0) goto L_0x00aa
            java.lang.String r8 = "@ikea.com"
            boolean r8 = HJ.C15854t.G(r4, r8, r7, r6, r5)
            if (r8 != 0) goto L_0x00aa
            java.lang.String r8 = "@ingka.ikea.com"
            boolean r8 = HJ.C15854t.G(r4, r8, r7, r6, r5)
            if (r8 != 0) goto L_0x00aa
            java.lang.String r8 = "@inter.ikea.com"
            boolean r5 = HJ.C15854t.G(r4, r8, r7, r6, r5)
            if (r5 == 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r10
        L_0x00aa:
            cD.d r5 = r3.f65750c
            r0.f65751c = r3
            r0.f65752d = r10
            r0.f65753e = r1
            r0.f65754f = r4
            r0.f65755g = r4
            r0.f65756h = r7
            r0.f65759k = r6
            java.lang.Object r1 = r5.a(r0)
            if (r1 != r2) goto L_0x00c1
            return r2
        L_0x00c1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.u.a(dI.e):java.lang.Object");
    }
}
