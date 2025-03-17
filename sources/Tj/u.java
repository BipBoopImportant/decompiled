package Tj;

import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006HB¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTj/u;", "LTj/t;", "LRy/f;", "scanAndGoCartRepositoryFactory", "<init>", "(LRy/f;)V", "", "barcode", "LXH/x;", "Lrz/g;", "invoke-gIAlu-s", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "invoke", "a", "LRy/f;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u implements t {

    /* renamed from: a  reason: collision with root package name */
    private final f f87683a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.LoadProductFromCartUseCaseImpl", f = "LoadProductFromCartUseCase.kt", l = {38}, m = "invoke-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87684c;

        /* renamed from: d  reason: collision with root package name */
        Object f87685d;

        /* renamed from: e  reason: collision with root package name */
        Object f87686e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f87687f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ u f87688g;

        /* renamed from: h  reason: collision with root package name */
        int f87689h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(u uVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f87688g = uVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87687f = obj;
            this.f87689h |= Integer.MIN_VALUE;
            Object r22 = this.f87688g.m10invokegIAlus((String) null, this);
            return r22 == C17187b.f() ? r22 : x.a(r22);
        }
    }

    public u(f fVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        this.f87683a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m10invokegIAlus(java.lang.String r6, dI.C17164e<? super XH.x<rz.C15014g>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Tj.u.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Tj.u$a r0 = (Tj.u.a) r0
            int r1 = r0.f87689h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87689h = r1
            goto L_0x0018
        L_0x0013:
            Tj.u$a r0 = new Tj.u$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f87687f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f87689h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f87686e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f87685d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f87684c
            Tj.u r6 = (Tj.u) r6
            XH.y.b(r1)
            goto L_0x0055
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Ry.f r1 = r5.f87683a
            Ry.e r1 = r1.invoke()
            r0.f87684c = r5
            r0.f87685d = r6
            r0.f87686e = r7
            r0.f87689h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0055
            return r2
        L_0x0055:
            rz.g r1 = (rz.C15014g) r1
            if (r1 != 0) goto L_0x0066
            XH.x$a r6 = XH.x.f139812b
            Tj.t$a$a r6 = Tj.t.a.C1829a.f87682a
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
            goto L_0x006a
        L_0x0066:
            java.lang.Object r6 = XH.x.b(r1)
        L_0x006a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.u.m10invokegIAlus(java.lang.String, dI.e):java.lang.Object");
    }
}
