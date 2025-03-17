package Ww;

import QJ.Q;
import U0.L;
import U0.M;
import Ww.a;
import Ww.r;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import android.app.Activity;
import dI.C17164e;
import e.C5286i;
import eI.C17187b;
import g.C5314c;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LWw/a;", "locationPermission", "Lkotlin/Function1;", "LWw/r$a;", "LXH/N;", "initialPermissionStatus", "LWw/b;", "e", "(LWw/a;LnI/l;LU0/m;II)LWw/b;", "permissions_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.permissions.MutableLocationPermissionRequestKt$rememberMutableLocationPermissionRequest$2$1", f = "MutableLocationPermissionRequest.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117698c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<r.a, C16807N> f117699d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f117700e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super r.a, C16807N> lVar, e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f117699d = lVar;
            this.f117700e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f117699d, this.f117700e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117698c == 0) {
                y.b(obj);
                this.f117699d.invoke(this.f117700e.i());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ww/j$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f117701a;

        public b(e eVar) {
            this.f117701a = eVar;
        }

        public void b() {
            this.f117701a.j((C5314c<String[]>) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Ww.b e(Ww.a r11, nI.C17642l<? super Ww.r.a, XH.C16807N> r12, U0.C4889m r13, int r14, int r15) {
        /*
            java.lang.String r0 = "locationPermission"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = -345405116(0xffffffffeb698944, float:-2.8232793E26)
            r13.W(r0)
            r15 = r15 & 2
            if (r15 == 0) goto L_0x002e
            r12 = -310669781(0xffffffffed7b8e2b, float:-4.865788E27)
            r13.W(r12)
            java.lang.Object r12 = r13.D()
            U0.m$a r15 = U0.C4889m.f14007a
            java.lang.Object r15 = r15.a()
            if (r12 != r15) goto L_0x0029
            Ww.f r12 = new Ww.f
            r12.<init>()
            r13.u(r12)
        L_0x0029:
            nI.l r12 = (nI.C17642l) r12
            r13.P()
        L_0x002e:
            boolean r15 = U0.C4895p.J()
            if (r15 == 0) goto L_0x003a
            r15 = -1
            java.lang.String r1 = "com.ingka.ikea.permissions.rememberMutableLocationPermissionRequest (MutableLocationPermissionRequest.kt:83)"
            U0.C4895p.S(r0, r14, r15, r1)
        L_0x003a:
            U0.I0 r15 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r15 = r13.Q(r15)
            android.content.Context r15 = (android.content.Context) r15
            android.app.Activity r15 = Xo.c.a(r15)
            if (r15 == 0) goto L_0x015f
            r0 = -310660521(0xffffffffed7bb257, float:-4.868521E27)
            r13.W(r0)
            r0 = r14 & 14
            r1 = r0 ^ 6
            r2 = 1
            r3 = 4
            r4 = 0
            if (r1 <= r3) goto L_0x005f
            boolean r1 = r13.V(r11)
            if (r1 != 0) goto L_0x0063
        L_0x005f:
            r1 = r14 & 6
            if (r1 != r3) goto L_0x0065
        L_0x0063:
            r1 = r2
            goto L_0x0066
        L_0x0065:
            r1 = r4
        L_0x0066:
            java.lang.Object r3 = r13.D()
            if (r1 != 0) goto L_0x0074
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x007c
        L_0x0074:
            Ww.e r3 = new Ww.e
            r3.<init>(r15, r11)
            r13.u(r3)
        L_0x007c:
            Ww.e r3 = (Ww.e) r3
            r13.P()
            r1 = -310653735(0xffffffffed7bccd9, float:-4.870524E27)
            r13.W(r1)
            r1 = r14 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r5 = 32
            if (r1 <= r5) goto L_0x0095
            boolean r1 = r13.V(r12)
            if (r1 != 0) goto L_0x009b
        L_0x0095:
            r14 = r14 & 48
            if (r14 != r5) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r2 = r4
        L_0x009b:
            boolean r14 = r13.V(r3)
            r14 = r14 | r2
            java.lang.Object r1 = r13.D()
            if (r14 != 0) goto L_0x00ae
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r1 != r14) goto L_0x00b7
        L_0x00ae:
            Ww.j$a r1 = new Ww.j$a
            r14 = 0
            r1.<init>(r12, r3, r14)
            r13.u(r1)
        L_0x00b7:
            nI.p r1 = (nI.p) r1
            r13.P()
            U0.P.g(r11, r1, r13, r0)
            androidx.lifecycle.r$a r5 = androidx.lifecycle.r.a.ON_RESUME
            r11 = -310649460(0xffffffffed7bdd8c, float:-4.8717857E27)
            r13.W(r11)
            boolean r11 = r13.V(r3)
            java.lang.Object r12 = r13.D()
            if (r11 != 0) goto L_0x00d9
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x00e1
        L_0x00d9:
            Ww.g r12 = new Ww.g
            r12.<init>(r3)
            r13.u(r12)
        L_0x00e1:
            r7 = r12
            nI.a r7 = (nI.C17631a) r7
            r13.P()
            r9 = 6
            r10 = 2
            r6 = 0
            r8 = r13
            j3.c.a(r5, r6, r7, r8, r9, r10)
            h.b r11 = new h.b
            r11.<init>()
            r12 = -310640036(0xffffffffed7c025c, float:-4.8745672E27)
            r13.W(r12)
            boolean r12 = r13.V(r3)
            boolean r14 = r13.F(r15)
            r12 = r12 | r14
            java.lang.Object r14 = r13.D()
            if (r12 != 0) goto L_0x0110
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r14 != r12) goto L_0x0118
        L_0x0110:
            Ww.h r14 = new Ww.h
            r14.<init>(r3, r15)
            r13.u(r14)
        L_0x0118:
            nI.l r14 = (nI.C17642l) r14
            r13.P()
            e.i r11 = e.C5280c.a(r11, r14, r13, r4)
            r12 = -310533222(0xffffffffed7da39a, float:-4.906093E27)
            r13.W(r12)
            boolean r12 = r13.V(r3)
            boolean r14 = r13.F(r11)
            r12 = r12 | r14
            java.lang.Object r14 = r13.D()
            if (r12 != 0) goto L_0x013e
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r14 != r12) goto L_0x0146
        L_0x013e:
            Ww.i r14 = new Ww.i
            r14.<init>(r3, r11)
            r13.u(r14)
        L_0x0146:
            nI.l r14 = (nI.C17642l) r14
            r13.P()
            int r12 = e.C5286i.f23171c
            int r12 = r12 << 3
            U0.P.b(r3, r11, r14, r13, r12)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x015b
            U0.C4895p.R()
        L_0x015b:
            r13.P()
            return r3
        L_0x015f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Permissions should be called in the context of an Activity"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ww.j.e(Ww.a, nI.l, U0.m, int, int):Ww.b");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(r.a aVar) {
        C17542s.j(aVar, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(e eVar, Activity activity, Map map) {
        Object obj;
        r.b bVar;
        C17542s.j(map, "permissionsResult");
        a d10 = eVar.d();
        a.C2904a aVar = a.C2904a.f117678a;
        if (C17542s.e(d10, aVar)) {
            String value = eVar.d().getValue();
            Boolean bool = (Boolean) map.get(value);
            if (bool != null) {
                if (bool.booleanValue()) {
                    eVar.h(aVar);
                    bVar = r.b.d.f117723a;
                } else {
                    bVar = q.c(activity, value) ? r.b.a.f117720a : eVar.f() ? r.b.c.f117722a : r.b.C2906b.f117721a;
                }
                eVar.k(bVar);
            }
        } else {
            a.b bVar2 = a.b.f117681a;
            if (C17542s.e(d10, bVar2)) {
                Boolean bool2 = Boolean.TRUE;
                if (C17542s.e((Boolean) map.get(eVar.d().getValue()), bool2)) {
                    eVar.h(bVar2);
                    eVar.k(r.b.d.f117723a);
                    return C16807N.f139792a;
                } else if (C17542s.e((Boolean) map.get(aVar.getValue()), bool2)) {
                    eVar.h(aVar);
                    eVar.k(r.b.d.f117723a);
                    return C16807N.f139792a;
                } else {
                    Iterator it = C16877v.q(bVar2, aVar).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (q.c(activity, ((a) obj).getValue())) {
                            break;
                        }
                    }
                    if (((a) obj) != null) {
                        eVar.h((a) null);
                        eVar.k(r.b.a.f117720a);
                        return C16807N.f139792a;
                    } else if (eVar.f()) {
                        eVar.h((a) null);
                        eVar.k(r.b.c.f117722a);
                        return C16807N.f139792a;
                    } else {
                        eVar.h((a) null);
                        eVar.k(r.b.C2906b.f117721a);
                    }
                }
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final L h(e eVar, C5286i iVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        eVar.j(iVar);
        return new b(eVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N i(e eVar) {
        eVar.g();
        return C16807N.f139792a;
    }
}
