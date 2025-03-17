package Av;

import O0.H0;
import O0.J0;
import O0.L0;
import QJ.Q;
import Rv.c;
import Rv.h;
import Rv.k;
import Rv.m;
import SC.Y2;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.M0;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.animation.g;
import androidx.compose.foundation.layout.D;
import dI.C17164e;
import e5.C7786b;
import eI.C17187b;
import jC.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import l0.C5507b;
import m0.C5548j;
import m0.M;
import m0.y0;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5834E;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0013\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LRv/m;", "uiState", "Lkotlin/Function1;", "LRv/c;", "LXH/N;", "onEvent", "LDr/d;", "kreativListsCard", "w", "(LRv/m;LnI/l;LDr/d;LU0/m;II)V", "Landroidx/compose/ui/d;", "modifier", "y", "(LRv/m;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "LO0/L0;", "snackbarHostState", "s", "(LRv/m;LO0/L0;LnI/l;LU0/m;I)V", "n", "(LRv/m;LnI/l;LU0/m;I)V", "C", "Lm0/y0;", "", "a", "Lm0/y0;", "AnimationSpec", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final y0<Float> f32805a = C5548j.j(300, 0, M.d(), 2, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.compose.MembershipRootScreenKt$HandleSnackbar$1$1", f = "MembershipRootScreen.kt", l = {124}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f32806c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f32807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f32808e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f32809f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f32810g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(L0 l02, k kVar, Context context, C17642l<? super Rv.c, C16807N> lVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f32807d = l02;
            this.f32808e = kVar;
            this.f32809f = context;
            this.f32810g = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f32807d, this.f32808e, this.f32809f, this.f32810g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f32806c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f32807d;
                String b10 = ((k.a) this.f32808e).a().b(this.f32809f);
                J0 j02 = J0.Short;
                this.f32806c = 1;
                if (L0.f(l02, b10, (String) null, false, j02, this, 6, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f32810g.invoke(c.d.f39774a);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f32811a;

        b(L0 l02) {
            this.f32811a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(323307794, i10, -1, "com.ingka.ikea.membership.impl.compose.MembershipRootScreen.<anonymous> (MembershipRootScreen.kt:65)");
                }
                Y2.c(this.f32811a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Dr.d f32812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f32813b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f32814c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f32815a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<Rv.c, C16807N> f32816b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C5834E f32817c;

            a(m mVar, C17642l<? super Rv.c, C16807N> lVar, C5834E e10) {
                this.f32815a = mVar;
                this.f32816b = lVar;
                this.f32817c = e10;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-236173783, i10, -1, "com.ingka.ikea.membership.impl.compose.MembershipRootScreen.<anonymous>.<anonymous> (MembershipRootScreen.kt:69)");
                    }
                    o.y(this.f32815a, this.f32816b, D.h(androidx.compose.ui.d.f18749a, this.f32817c), mVar, 0, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        c(Dr.d dVar, m mVar, C17642l<? super Rv.c, C16807N> lVar) {
            this.f32812a = dVar;
            this.f32813b = mVar;
            this.f32814c = lVar;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "contentPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1279078039, i10, -1, "com.ingka.ikea.membership.impl.compose.MembershipRootScreen.<anonymous> (MembershipRootScreen.kt:68)");
                }
                C4910x.a(Nv.c.f().d(this.f32812a), c1.c.e(-236173783, true, new a(this.f32813b, this.f32814c, e10), mVar, 54), mVar, U0.J0.f13770i | 48);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements r<C5507b, m, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<Rv.c, C16807N> f32818a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f32819b;

        d(C17642l<? super Rv.c, C16807N> lVar, i iVar) {
            this.f32818a = lVar;
            this.f32819b = iVar;
        }

        public final void a(C5507b bVar, m mVar, C4889m mVar2, int i10) {
            C17542s.j(bVar, "$this$AnimatedContent");
            C17542s.j(mVar, "contentState");
            if (C4895p.J()) {
                C4895p.S(1743334453, i10, -1, "com.ingka.ikea.membership.impl.compose.MembershipScaffoldContent.<anonymous> (MembershipRootScreen.kt:92)");
            }
            if (mVar instanceof m.c) {
                mVar2.W(-2083122331);
                Hv.c.c(this.f32818a, this.f32819b, mVar2, 0, 0);
                mVar2.P();
            } else if ((mVar instanceof m.b) || (mVar instanceof m.d)) {
                mVar2.W(-2082893985);
                Iv.r.h((m.a) mVar, this.f32818a, (C7786b) null, mVar2, 0, 4);
                mVar2.P();
            } else {
                mVar2.W(-482840981);
                mVar2.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5507b) obj, (m) obj2, (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Av/o$e", "Lj3/e;", "LXH/N;", "a", "()V", "lifecycle-runtime-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements j3.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j3.f f32820a;

        public e(j3.f fVar) {
            this.f32820a = fVar;
        }

        public void a() {
        }
    }

    /* access modifiers changed from: private */
    public static final Object A(m mVar) {
        C17542s.j(mVar, "it");
        return P.b(mVar.getClass());
    }

    /* access modifiers changed from: private */
    public static final C16807N B(m mVar, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar2, int i12) {
        y(mVar, lVar, dVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void C(Rv.m r7, nI.C17642l<? super Rv.c, XH.C16807N> r8, U0.C4889m r9, int r10) {
        /*
            r0 = -998323440(0xffffffffc47ecb10, float:-1019.17285)
            U0.m r9 = r9.k(r0)
            r1 = r10 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r10 & 8
            if (r1 != 0) goto L_0x0014
            boolean r1 = r9.V(r7)
            goto L_0x0018
        L_0x0014:
            boolean r1 = r9.F(r7)
        L_0x0018:
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r10
            goto L_0x0020
        L_0x001f:
            r1 = r10
        L_0x0020:
            r2 = r10 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0031
            boolean r2 = r9.F(r8)
            if (r2 == 0) goto L_0x002e
            r2 = r3
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r1 & 19
            r4 = 18
            if (r2 != r4) goto L_0x0042
            boolean r2 = r9.l()
            if (r2 != 0) goto L_0x003e
            goto L_0x0042
        L_0x003e:
            r9.L()
            goto L_0x0098
        L_0x0042:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x004e
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.membership.impl.compose.TrackScreenViewed (MembershipRootScreen.kt:181)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x004e:
            tK.h r0 = tK.C18027s.a()
            r0.l0()
            zv.d r0 = r7.h()
            r2 = -1236444128(0xffffffffb64d5c20, float:-3.0601004E-6)
            r9.W(r2)
            boolean r2 = r9.V(r0)
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 != r3) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            r1 = r1 | r2
            java.lang.Object r2 = r9.D()
            if (r1 != 0) goto L_0x0079
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0081
        L_0x0079:
            Av.d r2 = new Av.d
            r2.<init>(r0, r8)
            r9.u(r2)
        L_0x0081:
            r3 = r2
            nI.l r3 = (nI.C17642l) r3
            r9.P()
            r5 = 0
            r6 = 2
            r2 = 0
            r1 = r0
            r4 = r9
            j3.c.c(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0098
            U0.C4895p.R()
        L_0x0098:
            U0.Y0 r9 = r9.n()
            if (r9 == 0) goto L_0x00a6
            Av.e r0 = new Av.e
            r0.<init>(r7, r8, r10)
            r9.a(r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Av.o.C(Rv.m, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final j3.e D(zv.d dVar, C17642l lVar, j3.f fVar) {
        C17542s.j(fVar, "$this$LifecycleResumeEffect");
        if (dVar != null) {
            lVar.invoke(new c.h(dVar));
        }
        return new e(fVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N E(m mVar, C17642l lVar, int i10, C4889m mVar2, int i11) {
        C(mVar, lVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void n(Rv.m r17, nI.C17642l<? super Rv.c, XH.C16807N> r18, U0.C4889m r19, int r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = -1859352769(0xffffffff912c873f, float:-1.3610083E-28)
            r4 = r19
            U0.m r15 = r4.k(r3)
            r4 = r2 & 6
            if (r4 != 0) goto L_0x0027
            r4 = r2 & 8
            if (r4 != 0) goto L_0x001c
            boolean r4 = r15.V(r0)
            goto L_0x0020
        L_0x001c:
            boolean r4 = r15.F(r0)
        L_0x0020:
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r2
            goto L_0x0028
        L_0x0027:
            r4 = r2
        L_0x0028:
            r5 = r2 & 48
            r6 = 32
            if (r5 != 0) goto L_0x0039
            boolean r5 = r15.F(r1)
            if (r5 == 0) goto L_0x0036
            r5 = r6
            goto L_0x0038
        L_0x0036:
            r5 = 16
        L_0x0038:
            r4 = r4 | r5
        L_0x0039:
            r5 = r4 & 19
            r7 = 18
            if (r5 != r7) goto L_0x004b
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            r15.L()
            goto L_0x0123
        L_0x004b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0057
            r5 = -1
            java.lang.String r7 = "com.ingka.ikea.membership.impl.compose.HandleDialog (MembershipRootScreen.kt:152)"
            U0.C4895p.S(r3, r4, r5, r7)
        L_0x0057:
            Rv.b r3 = r17.c()
            if (r3 == 0) goto L_0x011a
            boolean r3 = r3 instanceof Rv.b.a
            if (r3 == 0) goto L_0x0114
            int r3 = Oo.b.f84854z4
            r5 = 0
            java.lang.String r3 = J1.j.b(r3, r15, r5)
            int r7 = Oo.b.f84854z4
            java.lang.String r7 = J1.j.b(r7, r15, r5)
            r8 = 1338186169(0x4fc319b9, float:6.5464858E9)
            r15.W(r8)
            r4 = r4 & 112(0x70, float:1.57E-43)
            r8 = 1
            if (r4 != r6) goto L_0x007b
            r9 = r8
            goto L_0x007c
        L_0x007b:
            r9 = r5
        L_0x007c:
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x008a
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0092
        L_0x008a:
            Av.l r10 = new Av.l
            r10.<init>(r1)
            r15.u(r10)
        L_0x0092:
            nI.a r10 = (nI.C17631a) r10
            r15.P()
            SC.W1 r9 = new SC.W1
            r9.<init>(r7, r10)
            int r7 = Oo.b.f84518U0
            java.lang.String r7 = J1.j.b(r7, r15, r5)
            r10 = 1338192889(0x4fc333f9, float:6.5499264E9)
            r15.W(r10)
            if (r4 != r6) goto L_0x00ac
            r10 = r8
            goto L_0x00ad
        L_0x00ac:
            r10 = r5
        L_0x00ad:
            java.lang.Object r11 = r15.D()
            if (r10 != 0) goto L_0x00bb
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x00c3
        L_0x00bb:
            Av.m r11 = new Av.m
            r11.<init>(r1)
            r15.u(r11)
        L_0x00c3:
            nI.a r11 = (nI.C17631a) r11
            r15.P()
            SC.W1 r10 = new SC.W1
            r10.<init>(r7, r11)
            r7 = 1338196025(0x4fc34039, float:6.551532E9)
            r15.W(r7)
            if (r4 != r6) goto L_0x00d6
            r5 = r8
        L_0x00d6:
            java.lang.Object r4 = r15.D()
            if (r5 != 0) goto L_0x00e4
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x00ec
        L_0x00e4:
            Av.n r4 = new Av.n
            r4.<init>(r1)
            r15.u(r4)
        L_0x00ec:
            r7 = r4
            nI.a r7 = (nI.C17631a) r7
            r15.P()
            Av.a r4 = Av.a.f32775a
            nI.p r11 = r4.a()
            int r4 = SC.W1.f116045c
            int r5 = r4 << 3
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r5 = r5 | r6
            int r4 = r4 << 6
            r13 = r5 | r4
            r14 = 112(0x70, float:1.57E-43)
            r8 = 0
            r12 = 0
            r16 = 0
            r4 = r3
            r5 = r9
            r6 = r10
            r9 = r12
            r10 = r16
            r12 = r15
            SC.Z1.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x011a
        L_0x0114:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x011a:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0123
            U0.C4895p.R()
        L_0x0123:
            U0.Y0 r3 = r15.n()
            if (r3 == 0) goto L_0x0131
            Av.c r4 = new Av.c
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Av.o.n(Rv.m, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17642l lVar) {
        lVar.invoke(c.b.Confirmed);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C17642l lVar) {
        lVar.invoke(c.b.Cancelled);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C17642l lVar) {
        lVar.invoke(c.b.Cancelled);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(m mVar, C17642l lVar, int i10, C4889m mVar2, int i11) {
        n(mVar, lVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: Av.o$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: Av.o$a} */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r2 == U0.C4889m.f14007a.a()) goto L_0x00b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void s(Rv.m r11, O0.L0 r12, nI.C17642l<? super Rv.c, XH.C16807N> r13, U0.C4889m r14, int r15) {
        /*
            r0 = 1414606058(0x54512cea, float:3.59360679E12)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            if (r1 != 0) goto L_0x001f
            r1 = r15 & 8
            if (r1 != 0) goto L_0x0014
            boolean r1 = r14.V(r11)
            goto L_0x0018
        L_0x0014:
            boolean r1 = r14.F(r11)
        L_0x0018:
            if (r1 == 0) goto L_0x001c
            r1 = 4
            goto L_0x001d
        L_0x001c:
            r1 = 2
        L_0x001d:
            r1 = r1 | r15
            goto L_0x0020
        L_0x001f:
            r1 = r15
        L_0x0020:
            r2 = r15 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0031
            boolean r2 = r14.V(r12)
            if (r2 == 0) goto L_0x002e
            r2 = r3
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r15 & 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0042
            boolean r2 = r14.F(r13)
            if (r2 == 0) goto L_0x003f
            r2 = r4
            goto L_0x0041
        L_0x003f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0041:
            r1 = r1 | r2
        L_0x0042:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r2 != r5) goto L_0x0054
            boolean r2 = r14.l()
            if (r2 != 0) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            r14.L()
            goto L_0x014e
        L_0x0054:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0060
            r2 = -1
            java.lang.String r5 = "com.ingka.ikea.membership.impl.compose.HandleSnackbar (MembershipRootScreen.kt:117)"
            U0.C4895p.S(r0, r1, r2, r5)
        L_0x0060:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r14.Q(r0)
            r8 = r0
            android.content.Context r8 = (android.content.Context) r8
            Rv.k r0 = r11.f()
            if (r0 != 0) goto L_0x007c
            r0 = -1284915952(0xffffffffb369bd10, float:-5.442149E-8)
            r14.W(r0)
            r14.P()
            goto L_0x0145
        L_0x007c:
            boolean r2 = r0 instanceof Rv.k.a
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x00d0
            r2 = -1177633170(0xffffffffb9cebe6e, float:-3.9433263E-4)
            r14.W(r2)
            r2 = -1284912957(0xffffffffb369c8c3, float:-5.443213E-8)
            r14.W(r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 != r3) goto L_0x0094
            r2 = r6
            goto L_0x0095
        L_0x0094:
            r2 = r5
        L_0x0095:
            boolean r3 = r14.F(r0)
            r2 = r2 | r3
            boolean r3 = r14.F(r8)
            r2 = r2 | r3
            r1 = r1 & 896(0x380, float:1.256E-42)
            if (r1 != r4) goto L_0x00a4
            r5 = r6
        L_0x00a4:
            r1 = r2 | r5
            java.lang.Object r2 = r14.D()
            if (r1 != 0) goto L_0x00b4
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x00c1
        L_0x00b4:
            Av.o$a r2 = new Av.o$a
            r10 = 0
            r5 = r2
            r6 = r12
            r7 = r0
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r14.u(r2)
        L_0x00c1:
            nI.p r2 = (nI.p) r2
            r14.P()
            int r1 = IC.C13023e.f110931a
            U0.P.g(r0, r2, r14, r1)
            r14.P()
            goto L_0x0145
        L_0x00d0:
            boolean r2 = r0 instanceof Rv.k.b
            if (r2 == 0) goto L_0x015d
            r2 = -1177280235(0xffffffffb9d42115, float:-4.046044E-4)
            r14.W(r2)
            Rv.k$b r0 = (Rv.k.b) r0
            sB.a r2 = r0.a()
            r0 = -1284896753(0xffffffffb36a080f, float:-5.44897E-8)
            r14.W(r0)
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != r4) goto L_0x00ec
            r3 = r6
            goto L_0x00ed
        L_0x00ec:
            r3 = r5
        L_0x00ed:
            java.lang.Object r7 = r14.D()
            if (r3 != 0) goto L_0x00fb
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x0103
        L_0x00fb:
            Av.i r7 = new Av.i
            r7.<init>(r13)
            r14.u(r7)
        L_0x0103:
            r3 = r7
            nI.l r3 = (nI.C17642l) r3
            r14.P()
            r7 = -1284892589(0xffffffffb36a1853, float:-5.4504493E-8)
            r14.W(r7)
            if (r0 != r4) goto L_0x0113
            r0 = r6
            goto L_0x0114
        L_0x0113:
            r0 = r5
        L_0x0114:
            java.lang.Object r4 = r14.D()
            if (r0 != 0) goto L_0x0122
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x012a
        L_0x0122:
            Av.j r4 = new Av.j
            r4.<init>(r13)
            r14.u(r4)
        L_0x012a:
            nI.a r4 = (nI.C17631a) r4
            r14.P()
            sB.a$a r0 = r2.a()
            sB.a$a r7 = sB.C15035a.C3239a.ADD
            if (r0 != r7) goto L_0x0138
            r5 = r6
        L_0x0138:
            int r0 = r1 >> 3
            r7 = r0 & 14
            r8 = 0
            r1 = r12
            r6 = r14
            tB.C15062c.c(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.P()
        L_0x0145:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x014e
            U0.C4895p.R()
        L_0x014e:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x015c
            Av.k r0 = new Av.k
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x015c:
            return
        L_0x015d:
            r11 = -1284916808(0xffffffffb369b9b8, float:-5.441845E-8)
            r14.W(r11)
            r14.P()
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Av.o.s(Rv.m, O0.L0, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C17642l lVar) {
        lVar.invoke(c.d.f39774a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(m mVar, L0 l02, C17642l lVar, int i10, C4889m mVar2, int i11) {
        s(mVar, l02, lVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C17642l lVar, String str) {
        C17542s.j(str, "it");
        lVar.invoke(new h(str));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0092, code lost:
        if ((r26 & 4) != 0) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(Rv.m r21, nI.C17642l<? super Rv.c, XH.C16807N> r22, Dr.d r23, U0.C4889m r24, int r25, int r26) {
        /*
            r1 = r21
            r2 = r22
            r4 = r25
            java.lang.String r0 = "uiState"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            r0 = -1722919656(0xffffffff994e5518, float:-1.0667135E-23)
            r3 = r24
            U0.m r3 = r3.k(r0)
            r5 = r26 & 1
            if (r5 == 0) goto L_0x0020
            r5 = r4 | 6
            goto L_0x0039
        L_0x0020:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0038
            r5 = r4 & 8
            if (r5 != 0) goto L_0x002d
            boolean r5 = r3.V(r1)
            goto L_0x0031
        L_0x002d:
            boolean r5 = r3.F(r1)
        L_0x0031:
            if (r5 == 0) goto L_0x0035
            r5 = 4
            goto L_0x0036
        L_0x0035:
            r5 = 2
        L_0x0036:
            r5 = r5 | r4
            goto L_0x0039
        L_0x0038:
            r5 = r4
        L_0x0039:
            r6 = r26 & 2
            if (r6 == 0) goto L_0x0040
            r5 = r5 | 48
            goto L_0x0050
        L_0x0040:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x0050
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x004d
            r6 = 32
            goto L_0x004f
        L_0x004d:
            r6 = 16
        L_0x004f:
            r5 = r5 | r6
        L_0x0050:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0069
            r6 = r26 & 4
            if (r6 != 0) goto L_0x0063
            r6 = r23
            boolean r7 = r3.F(r6)
            if (r7 == 0) goto L_0x0065
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0063:
            r6 = r23
        L_0x0065:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r5 = r5 | r7
            goto L_0x006b
        L_0x0069:
            r6 = r23
        L_0x006b:
            r7 = r5 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x007f
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x0078
            goto L_0x007f
        L_0x0078:
            r3.L()
            r20 = r6
            goto L_0x0133
        L_0x007f:
            r3.G()
            r7 = r4 & 1
            if (r7 == 0) goto L_0x0098
            boolean r7 = r3.O()
            if (r7 == 0) goto L_0x008d
            goto L_0x0098
        L_0x008d:
            r3.L()
            r7 = r26 & 4
            if (r7 == 0) goto L_0x0096
        L_0x0094:
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0096:
            r15 = r6
            goto L_0x00a7
        L_0x0098:
            r7 = r26 & 4
            if (r7 == 0) goto L_0x0096
            U0.I0 r6 = Nv.c.f()
            java.lang.Object r6 = r3.Q(r6)
            Dr.d r6 = (Dr.d) r6
            goto L_0x0094
        L_0x00a7:
            r3.y()
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00b6
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.membership.impl.compose.MembershipRootScreen (MembershipRootScreen.kt:56)"
            U0.C4895p.S(r0, r5, r6, r7)
        L_0x00b6:
            r0 = -1224773373(0xffffffffb6ff7103, float:-7.6127485E-6)
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r0 != r6) goto L_0x00d0
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r3.u(r0)
        L_0x00d0:
            O0.L0 r0 = (O0.L0) r0
            r3.P()
            r6 = r5 & 14
            r6 = r6 | 48
            int r7 = r5 << 3
            r7 = r7 & 896(0x380, float:1.256E-42)
            r6 = r6 | r7
            s(r1, r0, r2, r3, r6)
            r5 = r5 & 126(0x7e, float:1.77E-43)
            n(r1, r2, r3, r5)
            C(r1, r2, r3, r5)
            Av.o$b r5 = new Av.o$b
            r5.<init>(r0)
            r0 = 323307794(0x13454912, float:2.4900922E-27)
            r6 = 1
            r7 = 54
            c1.a r8 = c1.c.e(r0, r6, r5, r3, r7)
            r0 = 0
            float r0 = (float) r0
            float r9 = c2.h.B(r0)
            r13 = 14
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            s0.T r0 = s0.C5850V.c(r9, r10, r11, r12, r13, r14)
            Av.o$c r5 = new Av.o$c
            r5.<init>(r15, r1, r2)
            r9 = -1279078039(0xffffffffb3c2d169, float:-9.0719205E-8)
            c1.a r16 = c1.c.e(r9, r6, r5, r3, r7)
            r18 = 805309440(0x30000c00, float:4.658318E-10)
            r19 = 247(0xf7, float:3.46E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r20 = r15
            r15 = r0
            r17 = r3
            O0.C4762x0.a(r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0133
            U0.C4895p.R()
        L_0x0133:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x014c
            Av.b r7 = new Av.b
            r0 = r7
            r1 = r21
            r2 = r22
            r3 = r20
            r4 = r25
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Av.o.w(Rv.m, nI.l, Dr.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(m mVar, C17642l lVar, Dr.d dVar, int i10, int i11, C4889m mVar2, int i12) {
        w(mVar, lVar, dVar, mVar2, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void y(Rv.m r15, nI.C17642l<? super Rv.c, XH.C16807N> r16, androidx.compose.ui.d r17, U0.C4889m r18, int r19, int r20) {
        /*
            r10 = r15
            r11 = r16
            r12 = r19
            r0 = -30544643(0xfffffffffe2decfd, float:-5.779674E37)
            r1 = r18
            U0.m r13 = r1.k(r0)
            r1 = r20 & 1
            if (r1 == 0) goto L_0x0015
            r1 = r12 | 6
            goto L_0x002e
        L_0x0015:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x002d
            r1 = r12 & 8
            if (r1 != 0) goto L_0x0022
            boolean r1 = r13.V(r15)
            goto L_0x0026
        L_0x0022:
            boolean r1 = r13.F(r15)
        L_0x0026:
            if (r1 == 0) goto L_0x002a
            r1 = 4
            goto L_0x002b
        L_0x002a:
            r1 = 2
        L_0x002b:
            r1 = r1 | r12
            goto L_0x002e
        L_0x002d:
            r1 = r12
        L_0x002e:
            r2 = r20 & 2
            if (r2 == 0) goto L_0x0035
            r1 = r1 | 48
            goto L_0x0045
        L_0x0035:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x0045
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x0042
            r2 = 32
            goto L_0x0044
        L_0x0042:
            r2 = 16
        L_0x0044:
            r1 = r1 | r2
        L_0x0045:
            r2 = r20 & 4
            if (r2 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r3 = r17
            goto L_0x0060
        L_0x004e:
            r3 = r12 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r17
            boolean r4 = r13.V(r3)
            if (r4 == 0) goto L_0x005d
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r4
        L_0x0060:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0072
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            r13.L()
            goto L_0x00f7
        L_0x0072:
            if (r2 == 0) goto L_0x0078
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r14 = r2
            goto L_0x0079
        L_0x0078:
            r14 = r3
        L_0x0079:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0085
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.membership.impl.compose.MembershipScaffoldContent (MembershipRootScreen.kt:83)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0085:
            r0 = 0
            r2 = 0
            r3 = 1
            jC.i r0 = jC.k.c(r0, r13, r2, r3)
            r2 = -1403804661(0xffffffffac53a40b, float:-3.0075966E-12)
            r13.W(r2)
            java.lang.Object r2 = r13.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r5 = r4.a()
            if (r2 != r5) goto L_0x00a6
            Av.f r2 = new Av.f
            r2.<init>()
            r13.u(r2)
        L_0x00a6:
            nI.l r2 = (nI.C17642l) r2
            r13.P()
            r5 = -1403805989(0xffffffffac539edb, float:-3.0073086E-12)
            r13.W(r5)
            java.lang.Object r5 = r13.D()
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x00c3
            Av.g r5 = new Av.g
            r5.<init>()
            r13.u(r5)
        L_0x00c3:
            nI.l r5 = (nI.C17642l) r5
            r13.P()
            Av.o$d r4 = new Av.o$d
            r4.<init>(r11, r0)
            r0 = 54
            r6 = 1743334453(0x67e92c35, float:2.2022537E24)
            c1.a r6 = c1.c.e(r6, r3, r4, r13, r0)
            r0 = r1 & 14
            r3 = 1794432(0x1b6180, float:2.514535E-39)
            r0 = r0 | r3
            int r1 = r1 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r8 = r0 | r1
            r9 = 8
            r3 = 0
            java.lang.String r4 = "content transition"
            r0 = r15
            r1 = r14
            r7 = r13
            androidx.compose.animation.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f6
            U0.C4895p.R()
        L_0x00f6:
            r3 = r14
        L_0x00f7:
            U0.Y0 r6 = r13.n()
            if (r6 == 0) goto L_0x010d
            Av.h r7 = new Av.h
            r0 = r7
            r1 = r15
            r2 = r16
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Av.o.y(Rv.m, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final l0.i z(androidx.compose.animation.d dVar) {
        C17542s.j(dVar, "$this$AnimatedContent");
        y0<Float> y0Var = f32805a;
        return androidx.compose.animation.a.e(g.o(y0Var, 0.0f, 2, (Object) null), g.q(y0Var, 0.0f, 2, (Object) null));
    }
}
