package mh;

import MB.C13194a;
import QJ.Q;
import Rd.a;
import U0.A1;
import Vv.e;
import Vv.u;
import Vv.v;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import sB.C15035a;
import x4.C8951o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014²\u0006\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b8\nX\u0002"}, d2 = {"Lmh/f;", "LVv/e;", "LVv/f;", "externalNavigationContract", "<init>", "(LVv/f;)V", "LVv/l;", "destination", "Lkotlin/Function0;", "LXH/N;", "onNavigationCompleted", "b", "(LVv/l;LnI/a;LU0/m;I)V", "Lkotlin/Function1;", "LVv/u;", "onResult", "a", "(LnI/l;LU0/m;I)V", "LVv/f;", "callback", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Vv.f f75424a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.navigation.featurecontract.membership.MembershipExternalComposeNavigationImpl$HandleNavigateToDestination$1$1", f = "MembershipExternalNavigationContractImpl.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75425c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Vv.l f75426d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f75427e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f75428f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f75429g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Vv.l lVar, f fVar, b bVar, A1<? extends C17631a<C16807N>> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f75426d = lVar;
            this.f75427e = fVar;
            this.f75428f = bVar;
            this.f75429g = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f75426d, this.f75427e, this.f75428f, this.f75429g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f75425c == 0) {
                y.b(obj);
                if (this.f75426d != null) {
                    this.f75427e.f75424a.a(this.f75428f, this.f75426d);
                    f.h(this.f75429g).invoke();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"mh/f$b", "LVv/v;", "Landroidx/fragment/app/t;", "b", "()Landroidx/fragment/app/t;", "activity", "Lx4/o;", "a", "()Lx4/o;", "navController", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f75430a;

        b(C5187o oVar) {
            this.f75430a = oVar;
        }

        public C8951o a() {
            return androidx.navigation.fragment.a.a(this.f75430a);
        }

        public C5191t b() {
            C5191t requireActivity = this.f75430a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return requireActivity;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f75431a;

        static {
            int[] iArr = new int[Hq.b.values().length];
            try {
                iArr[Hq.b.OpenCollectKeys.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f75431a = iArr;
        }
    }

    public f(Vv.f fVar) {
        C17542s.j(fVar, "externalNavigationContract");
        this.f75424a = fVar;
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> h(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17642l lVar, a.b bVar) {
        C17542s.j(bVar, "result");
        if (!C17542s.e(bVar, a.b.c.f63191a) && !C17542s.e(bVar, a.b.C1080a.f63189a)) {
            if (C17542s.e(bVar, a.b.C1082b.f63190a)) {
                lVar.invoke(u.a.f40525a);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, boolean z10) {
        if (z10) {
            lVar.invoke(u.b.f40526a);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            String b10 = cVar != null ? cVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            lVar.invoke(new u.c(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17642l lVar, Hq.b bVar) {
        C17542s.j(bVar, "result");
        if (c.f75431a[bVar.ordinal()] == 1) {
            lVar.invoke(u.d.f40528a);
            return C16807N.f139792a;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar, C13194a.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof C13194a.b.C2743a) {
            lVar.invoke(u.e.f40529a);
            return C16807N.f139792a;
        }
        throw new t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(nI.C17642l<? super Vv.u, XH.C16807N> r13, U0.C4889m r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "onResult"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 2034033176(0x793ce218, float:6.1296096E34)
            r14.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.navigation.featurecontract.membership.MembershipExternalComposeNavigationImpl.HandleNavigationResult (MembershipExternalNavigationContractImpl.kt:441)"
            U0.C4895p.S(r0, r15, r1, r2)
        L_0x0017:
            U0.I0 r0 = Vo.b.c()
            java.lang.Object r0 = r14.Q(r0)
            androidx.fragment.app.o r0 = (androidx.fragment.app.C5187o) r0
            r1 = -1897328707(0xffffffff8ee90fbd, float:-5.745409E-30)
            r14.W(r1)
            java.lang.Object r1 = r14.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r3 = r2.a()
            if (r1 != r3) goto L_0x003a
            x4.o r1 = androidx.navigation.fragment.a.a(r0)
            r14.u(r1)
        L_0x003a:
            r0 = r1
            x4.o r0 = (x4.C8951o) r0
            r14.P()
            r1 = -1897320315(0xffffffff8ee93085, float:-5.7485657E-30)
            r14.W(r1)
            r1 = r15 & 14
            r1 = r1 ^ 6
            r9 = 0
            r10 = 1
            r11 = 4
            if (r1 <= r11) goto L_0x0055
            boolean r3 = r14.V(r13)
            if (r3 != 0) goto L_0x0059
        L_0x0055:
            r3 = r15 & 6
            if (r3 != r11) goto L_0x005b
        L_0x0059:
            r3 = r10
            goto L_0x005c
        L_0x005b:
            r3 = r9
        L_0x005c:
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0068
            java.lang.Object r3 = r2.a()
            if (r4 != r3) goto L_0x0070
        L_0x0068:
            mh.a r4 = new mh.a
            r4.<init>(r13)
            r14.u(r4)
        L_0x0070:
            r6 = r4
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r8 = 432(0x1b0, float:6.05E-43)
            java.lang.String r4 = "membership/membership_page"
            java.lang.String r5 = "MembershipFragment-ListPicker"
            r3 = r0
            r7 = r14
            qw.l.d(r3, r4, r5, r6, r7, r8)
            r3 = -1897299192(0xffffffff8ee98308, float:-5.7565113E-30)
            r14.W(r3)
            if (r1 <= r11) goto L_0x008f
            boolean r3 = r14.V(r13)
            if (r3 != 0) goto L_0x0093
        L_0x008f:
            r3 = r15 & 6
            if (r3 != r11) goto L_0x0095
        L_0x0093:
            r3 = r10
            goto L_0x0096
        L_0x0095:
            r3 = r9
        L_0x0096:
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x00a2
            java.lang.Object r3 = r2.a()
            if (r4 != r3) goto L_0x00aa
        L_0x00a2:
            mh.b r4 = new mh.b
            r4.<init>(r13)
            r14.u(r4)
        L_0x00aa:
            r6 = r4
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r8 = 432(0x1b0, float:6.05E-43)
            java.lang.String r4 = "membership/membership_page"
            java.lang.String r5 = "MembershipFragment-RewardDetails"
            r3 = r0
            r7 = r14
            qw.l.d(r3, r4, r5, r6, r7, r8)
            r3 = -1897285162(0xffffffff8ee9b9d6, float:-5.761789E-30)
            r14.W(r3)
            if (r1 <= r11) goto L_0x00c9
            boolean r3 = r14.V(r13)
            if (r3 != 0) goto L_0x00cd
        L_0x00c9:
            r3 = r15 & 6
            if (r3 != r11) goto L_0x00cf
        L_0x00cd:
            r3 = r10
            goto L_0x00d0
        L_0x00cf:
            r3 = r9
        L_0x00d0:
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x00dc
            java.lang.Object r3 = r2.a()
            if (r4 != r3) goto L_0x00e4
        L_0x00dc:
            mh.c r4 = new mh.c
            r4.<init>(r13)
            r14.u(r4)
        L_0x00e4:
            r6 = r4
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r8 = 432(0x1b0, float:6.05E-43)
            java.lang.String r4 = "membership/membership_page"
            java.lang.String r5 = "StorePickerFragment.Result.Key"
            r3 = r0
            r7 = r14
            qw.l.d(r3, r4, r5, r6, r7, r8)
            r3 = -1897271615(0xffffffff8ee9eec1, float:-5.7668846E-30)
            r14.W(r3)
            if (r1 <= r11) goto L_0x0103
            boolean r3 = r14.V(r13)
            if (r3 != 0) goto L_0x0107
        L_0x0103:
            r3 = r15 & 6
            if (r3 != r11) goto L_0x0109
        L_0x0107:
            r3 = r10
            goto L_0x010a
        L_0x0109:
            r3 = r9
        L_0x010a:
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0116
            java.lang.Object r3 = r2.a()
            if (r4 != r3) goto L_0x011e
        L_0x0116:
            mh.d r4 = new mh.d
            r4.<init>(r13)
            r14.u(r4)
        L_0x011e:
            r6 = r4
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r8 = 432(0x1b0, float:6.05E-43)
            java.lang.String r4 = "membership/membership_page"
            java.lang.String r5 = "DeleteAccount-Request-Key"
            r3 = r0
            r7 = r14
            qw.l.d(r3, r4, r5, r6, r7, r8)
            r3 = -1897256051(0xffffffff8eea2b8d, float:-5.772739E-30)
            r14.W(r3)
            if (r1 <= r11) goto L_0x013d
            boolean r1 = r14.V(r13)
            if (r1 != 0) goto L_0x0141
        L_0x013d:
            r15 = r15 & 6
            if (r15 != r11) goto L_0x0142
        L_0x0141:
            r9 = r10
        L_0x0142:
            java.lang.Object r15 = r14.D()
            if (r9 != 0) goto L_0x014e
            java.lang.Object r1 = r2.a()
            if (r15 != r1) goto L_0x0156
        L_0x014e:
            mh.e r15 = new mh.e
            r15.<init>(r13)
            r14.u(r15)
        L_0x0156:
            r6 = r15
            nI.l r6 = (nI.C17642l) r6
            r14.P()
            r8 = 432(0x1b0, float:6.05E-43)
            java.lang.String r4 = "membership/membership_page"
            java.lang.String r5 = "BokaBottomSheetRequestKey"
            r3 = r0
            r7 = r14
            qw.l.d(r3, r4, r5, r6, r7, r8)
            boolean r13 = U0.C4895p.J()
            if (r13 == 0) goto L_0x0170
            U0.C4895p.R()
        L_0x0170:
            r14.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.f.a(nI.l, U0.m, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: mh.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: mh.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: mh.f$a} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0074, code lost:
        if (r0 == U0.C4889m.f14007a.a()) goto L_0x0076;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(Vv.l r10, nI.C17631a<XH.C16807N> r11, U0.C4889m r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "onNavigationCompleted"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 984760626(0x3ab24132, float:0.0013599752)
            r12.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.navigation.featurecontract.membership.MembershipExternalComposeNavigationImpl.HandleNavigateToDestination (MembershipExternalNavigationContractImpl.kt:420)"
            U0.C4895p.S(r0, r13, r1, r2)
        L_0x0017:
            U0.I0 r0 = Vo.b.c()
            java.lang.Object r0 = r12.Q(r0)
            androidx.fragment.app.o r0 = (androidx.fragment.app.C5187o) r0
            r1 = 18261707(0x116a6cb, float:2.7670317E-38)
            r12.W(r1)
            boolean r1 = r12.V(r0)
            java.lang.Object r2 = r12.D()
            if (r1 != 0) goto L_0x0039
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0041
        L_0x0039:
            mh.f$b r2 = new mh.f$b
            r2.<init>(r0)
            r12.u(r2)
        L_0x0041:
            r6 = r2
            mh.f$b r6 = (mh.f.b) r6
            r12.P()
            int r0 = r13 >> 3
            r0 = r0 & 14
            U0.A1 r7 = U0.p1.q(r11, r12, r0)
            r11 = 18275527(0x116dcc7, float:2.770905E-38)
            r12.W(r11)
            boolean r11 = r12.F(r10)
            boolean r0 = r12.F(r9)
            r11 = r11 | r0
            boolean r0 = r12.V(r6)
            r11 = r11 | r0
            boolean r0 = r12.V(r7)
            r11 = r11 | r0
            java.lang.Object r0 = r12.D()
            if (r11 != 0) goto L_0x0076
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0082
        L_0x0076:
            mh.f$a r0 = new mh.f$a
            r8 = 0
            r3 = r0
            r4 = r10
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r12.u(r0)
        L_0x0082:
            nI.p r0 = (nI.p) r0
            r12.P()
            r11 = r13 & 14
            U0.P.g(r10, r0, r12, r11)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0095
            U0.C4895p.R()
        L_0x0095:
            r12.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.f.b(Vv.l, nI.a, U0.m, int):void");
    }
}
