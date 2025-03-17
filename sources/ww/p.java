package Ww;

import QJ.Q;
import U0.L;
import U0.M;
import Ww.r;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import dI.C17164e;
import e.C5286i;
import eI.C17187b;
import g.C5314c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "permission", "Lkotlin/Function1;", "LWw/r$a;", "LXH/N;", "initialPermissionStatus", "LWw/k;", "e", "(Ljava/lang/String;LnI/l;LU0/m;II)LWw/k;", "permissions_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.permissions.MutablePermissionRequestKt$rememberMutablePermissionRequest$2$1", f = "MutablePermissionRequest.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117714c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<r.a, C16807N> f117715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f117716e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super r.a, C16807N> lVar, k kVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f117715d = lVar;
            this.f117716e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f117715d, this.f117716e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117714c == 0) {
                y.b(obj);
                this.f117715d.invoke(this.f117716e.i());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ww/p$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f117717a;

        public b(k kVar) {
            this.f117717a = kVar;
        }

        public void b() {
            this.f117717a.g((C5314c<String>) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: Ww.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Ww.k e(java.lang.String r15, nI.C17642l<? super Ww.r.a, XH.C16807N> r16, U0.C4889m r17, int r18, int r19) {
        /*
            r0 = r15
            r7 = r17
            r8 = r18
            java.lang.String r1 = "permission"
            kotlin.jvm.internal.C17542s.j(r15, r1)
            r1 = 1570240934(0x5d97f9a6, float:1.36887081E18)
            r7.W(r1)
            r2 = r19 & 2
            if (r2 == 0) goto L_0x0034
            r2 = 1601880896(0x5f7ac340, float:1.8069356E19)
            r7.W(r2)
            java.lang.Object r2 = r17.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x002e
            Ww.l r2 = new Ww.l
            r2.<init>()
            r7.u(r2)
        L_0x002e:
            nI.l r2 = (nI.C17642l) r2
            r17.P()
            goto L_0x0036
        L_0x0034:
            r2 = r16
        L_0x0036:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0042
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.permissions.rememberMutablePermissionRequest (MutablePermissionRequest.kt:53)"
            U0.C4895p.S(r1, r8, r3, r4)
        L_0x0042:
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r7.Q(r1)
            android.content.Context r1 = (android.content.Context) r1
            android.app.Activity r9 = Xo.c.a(r1)
            if (r9 == 0) goto L_0x0178
            r1 = 1601889804(0x5f7ae60c, float:1.8079151E19)
            r7.W(r1)
            r1 = r8 & 14
            r10 = r1 ^ 6
            r11 = 1
            r12 = 0
            r13 = 4
            if (r10 <= r13) goto L_0x0067
            boolean r3 = r7.V(r15)
            if (r3 != 0) goto L_0x006b
        L_0x0067:
            r3 = r8 & 6
            if (r3 != r13) goto L_0x006d
        L_0x006b:
            r3 = r11
            goto L_0x006e
        L_0x006d:
            r3 = r12
        L_0x006e:
            java.lang.Object r4 = r17.D()
            if (r3 != 0) goto L_0x007c
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0084
        L_0x007c:
            Ww.k r4 = new Ww.k
            r4.<init>(r9, r15)
            r7.u(r4)
        L_0x0084:
            r14 = r4
            Ww.k r14 = (Ww.k) r14
            r17.P()
            r3 = 1601895341(0x5f7afbad, float:1.8085239E19)
            r7.W(r3)
            r3 = r8 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r4 = 32
            if (r3 <= r4) goto L_0x009e
            boolean r3 = r7.V(r2)
            if (r3 != 0) goto L_0x00a2
        L_0x009e:
            r3 = r8 & 48
            if (r3 != r4) goto L_0x00a4
        L_0x00a2:
            r3 = r11
            goto L_0x00a5
        L_0x00a4:
            r3 = r12
        L_0x00a5:
            boolean r4 = r7.V(r14)
            r3 = r3 | r4
            java.lang.Object r4 = r17.D()
            if (r3 != 0) goto L_0x00b8
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x00c1
        L_0x00b8:
            Ww.p$a r4 = new Ww.p$a
            r3 = 0
            r4.<init>(r2, r14, r3)
            r7.u(r4)
        L_0x00c1:
            nI.p r4 = (nI.p) r4
            r17.P()
            U0.P.g(r15, r4, r7, r1)
            androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME
            r2 = 1601899584(0x5f7b0c40, float:1.8089904E19)
            r7.W(r2)
            boolean r2 = r7.V(r14)
            java.lang.Object r3 = r17.D()
            if (r2 != 0) goto L_0x00e3
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00eb
        L_0x00e3:
            Ww.m r3 = new Ww.m
            r3.<init>(r14)
            r7.u(r3)
        L_0x00eb:
            nI.a r3 = (nI.C17631a) r3
            r17.P()
            r5 = 6
            r6 = 2
            r2 = 0
            r4 = r17
            j3.c.a(r1, r2, r3, r4, r5, r6)
            h.c r1 = new h.c
            r1.<init>()
            r2 = 1601906132(0x5f7b25d4, float:1.8097104E19)
            r7.W(r2)
            boolean r2 = r7.F(r9)
            if (r10 <= r13) goto L_0x010f
            boolean r3 = r7.V(r15)
            if (r3 != 0) goto L_0x0115
        L_0x010f:
            r3 = r8 & 6
            if (r3 != r13) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r11 = r12
        L_0x0115:
            r2 = r2 | r11
            boolean r3 = r7.V(r14)
            r2 = r2 | r3
            java.lang.Object r3 = r17.D()
            if (r2 != 0) goto L_0x0129
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0131
        L_0x0129:
            Ww.n r3 = new Ww.n
            r3.<init>(r9, r15, r14)
            r7.u(r3)
        L_0x0131:
            nI.l r3 = (nI.C17642l) r3
            r17.P()
            e.i r0 = e.C5280c.a(r1, r3, r7, r12)
            r1 = 1601933613(0x5f7b912d, float:1.812732E19)
            r7.W(r1)
            boolean r1 = r7.V(r14)
            boolean r2 = r7.F(r0)
            r1 = r1 | r2
            java.lang.Object r2 = r17.D()
            if (r1 != 0) goto L_0x0157
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x015f
        L_0x0157:
            Ww.o r2 = new Ww.o
            r2.<init>(r14, r0)
            r7.u(r2)
        L_0x015f:
            nI.l r2 = (nI.C17642l) r2
            r17.P()
            int r1 = e.C5286i.f23171c
            int r1 = r1 << 3
            U0.P.b(r14, r0, r2, r7, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0174
            U0.C4895p.R()
        L_0x0174:
            r17.P()
            return r14
        L_0x0178:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Permissions should be called in the context of an Activity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ww.p.e(java.lang.String, nI.l, U0.m, int, int):Ww.k");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(r.a aVar) {
        C17542s.j(aVar, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L g(k kVar, C5286i iVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        kVar.g(iVar);
        return new b(kVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N h(k kVar) {
        kVar.f();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(Activity activity, String str, k kVar, boolean z10) {
        boolean c10 = q.c(activity, str);
        if (z10) {
            kVar.h(r.b.d.f117723a);
        } else if (c10) {
            kVar.h(r.b.a.f117720a);
        } else if (kVar.e()) {
            kVar.h(r.b.c.f117722a);
        } else {
            kVar.h(r.b.C2906b.f117721a);
        }
        return C16807N.f139792a;
    }
}
