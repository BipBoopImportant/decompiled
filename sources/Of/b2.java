package Of;

import HJ.C15854t;
import J1.j;
import KJ.C15987c;
import Kf.A;
import O0.C4762x0;
import O0.H0;
import O0.L0;
import O0.e1;
import O0.g1;
import Op.Z0;
import Op.a1;
import SC.Y2;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "showReplacementRecommendations", "loading", "LKJ/c;", "LOp/a1;", "products", "LOf/R1;", "actions", "LO0/L0;", "snackbarHostState", "LXH/N;", "o", "(ZZLKJ/c;LOf/R1;LO0/L0;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "j", "(ZZLKJ/c;LOf/R1;Landroidx/compose/ui/d;LU0/m;II)V", "product", "q", "(LOp/a1;ZLOf/R1;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final a f62485c = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(a1 a1Var) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f62486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f62487d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17642l lVar, List list) {
            super(1);
            this.f62486c = lVar;
            this.f62487d = list;
        }

        public final Object a(int i10) {
            return this.f62486c.invoke(this.f62487d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f62488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f62489d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17642l lVar, List list) {
            super(1);
            this.f62488c = lVar;
            this.f62489d = list;
        }

        public final Object a(int i10) {
            return this.f62488c.invoke(this.f62489d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f62490c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f62491d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ R1 f62492e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(List list, boolean z10, R1 r12) {
            super(4);
            this.f62490c = list;
            this.f62491d = z10;
            this.f62492e = r12;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                mVar.W(1511600086);
                b2.q((a1) this.f62490c.get(i10), this.f62491d, this.f62492e, mVar, 0);
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ R1 f62493a;

        e(R1 r12) {
            this.f62493a = r12;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(136691661, i10, -1, "com.ingka.ikea.app.cart.compose.UnavailableItemsScreen.<anonymous> (UnavailableItemsScreen.kt:72)");
                }
                ol.p.c(v.BACK, this.f62493a.a(), (androidx.compose.ui.d) null, j.b(C11849b.f102295g, mVar, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, mVar, 6, 500);
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
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f62494a;

        f(L0 l02) {
            this.f62494a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-111276533, i10, -1, "com.ingka.ikea.app.cart.compose.UnavailableItemsScreen.<anonymous> (UnavailableItemsScreen.kt:62)");
                }
                Y2.c(this.f62494a, D.m(androidx.compose.ui.d.f18749a, 0.0f, 0.0f, 0.0f, h.B(J1.f.a(A.f61485a, mVar, 0) + h.B((float) 16)), 7, (Object) null), (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 0, 4);
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
    static final class g implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f62495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f62496b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15987c<a1> f62497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ R1 f62498d;

        g(boolean z10, boolean z11, C15987c<a1> cVar, R1 r12) {
            this.f62495a = z10;
            this.f62496b = z11;
            this.f62497c = cVar;
            this.f62498d = r12;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "padding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-936525470, i10, -1, "com.ingka.ikea.app.cart.compose.UnavailableItemsScreen.<anonymous> (UnavailableItemsScreen.kt:81)");
                }
                b2.j(this.f62495a, this.f62496b, this.f62497c, this.f62498d, D.h(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), e10), mVar, 0, 0);
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(boolean r28, boolean r29, KJ.C15987c<Op.a1> r30, Of.R1 r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r34
            r0 = 512069685(0x1e859035, float:1.4141565E-20)
            r5 = r33
            U0.m r5 = r5.k(r0)
            r7 = r35 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x002a
        L_0x001a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0029
            boolean r7 = r5.b(r1)
            if (r7 == 0) goto L_0x0026
            r7 = 4
            goto L_0x0027
        L_0x0026:
            r7 = 2
        L_0x0027:
            r7 = r7 | r6
            goto L_0x002a
        L_0x0029:
            r7 = r6
        L_0x002a:
            r9 = r35 & 2
            r10 = 32
            if (r9 == 0) goto L_0x0033
            r7 = r7 | 48
            goto L_0x0042
        L_0x0033:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x0042
            boolean r9 = r5.b(r2)
            if (r9 == 0) goto L_0x003f
            r9 = r10
            goto L_0x0041
        L_0x003f:
            r9 = 16
        L_0x0041:
            r7 = r7 | r9
        L_0x0042:
            r9 = r35 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x004b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x005a
        L_0x004b:
            r9 = r6 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x005a
            boolean r9 = r5.V(r3)
            if (r9 == 0) goto L_0x0057
            r9 = r11
            goto L_0x0059
        L_0x0057:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r7 = r7 | r9
        L_0x005a:
            r9 = r35 & 8
            if (r9 == 0) goto L_0x0061
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0071
        L_0x0061:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0071
            boolean r9 = r5.V(r4)
            if (r9 == 0) goto L_0x006e
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0070
        L_0x006e:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0070:
            r7 = r7 | r9
        L_0x0071:
            r9 = r35 & 16
            if (r9 == 0) goto L_0x007a
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0077:
            r12 = r32
            goto L_0x008c
        L_0x007a:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0077
            r12 = r32
            boolean r13 = r5.V(r12)
            if (r13 == 0) goto L_0x0089
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r7 = r7 | r13
        L_0x008c:
            r13 = r7 & 9363(0x2493, float:1.312E-41)
            r15 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r15) goto L_0x009e
            boolean r13 = r5.l()
            if (r13 != 0) goto L_0x0099
            goto L_0x009e
        L_0x0099:
            r5.L()
            goto L_0x0236
        L_0x009e:
            if (r9 == 0) goto L_0x00a4
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r15 = r9
            goto L_0x00a5
        L_0x00a4:
            r15 = r12
        L_0x00a5:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00b1
            r9 = -1
            java.lang.String r12 = "com.ingka.ikea.app.cart.compose.UnavailableItemsContent (UnavailableItemsScreen.kt:101)"
            U0.C4895p.S(r0, r7, r9, r12)
        L_0x00b1:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$b r9 = r9.k()
            r13 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r9, r5, r13)
            int r9 = U0.C4883j.a(r5, r13)
            U0.y r12 = r5.s()
            androidx.compose.ui.d r13 = androidx.compose.ui.c.e(r5, r15)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r14 = r16.a()
            U0.f r18 = r5.m()
            if (r18 != 0) goto L_0x00dd
            U0.C4883j.c()
        L_0x00dd:
            r5.I()
            boolean r18 = r5.i()
            if (r18 == 0) goto L_0x00ea
            r5.p(r14)
            goto L_0x00ed
        L_0x00ea:
            r5.t()
        L_0x00ed:
            U0.m r14 = U0.F1.a(r5)
            nI.p r8 = r16.c()
            U0.F1.c(r14, r0, r8)
            nI.p r0 = r16.e()
            U0.F1.c(r14, r12, r0)
            nI.p r0 = r16.b()
            boolean r8 = r14.i()
            if (r8 != 0) goto L_0x0117
            java.lang.Object r8 = r14.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r12)
            if (r8 != 0) goto L_0x0125
        L_0x0117:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r14.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r14.w(r8, r0)
        L_0x0125:
            nI.p r0 = r16.d()
            U0.F1.c(r14, r13, r0)
            s0.h r19 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r8 = 8
            float r8 = (float) r8
            float r24 = c2.h.B(r8)
            r25 = 7
            r26 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            androidx.compose.ui.d r20 = androidx.compose.foundation.layout.D.m(r20, r21, r22, r23, r24, r25, r26)
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            androidx.compose.ui.d r8 = s0.C5861g.c(r19, r20, r21, r22, r23, r24)
            r9 = -760632707(0xffffffffd2a9aa7d, float:-3.64354896E11)
            r5.W(r9)
            r9 = r7 & 112(0x70, float:1.57E-43)
            r14 = 1
            if (r9 != r10) goto L_0x0160
            r9 = r14
            goto L_0x0161
        L_0x0160:
            r9 = 0
        L_0x0161:
            r10 = r7 & 896(0x380, float:1.256E-42)
            if (r10 != r11) goto L_0x0167
            r10 = r14
            goto L_0x0168
        L_0x0167:
            r10 = 0
        L_0x0168:
            r9 = r9 | r10
            r10 = r7 & 14
            r11 = 4
            if (r10 != r11) goto L_0x0170
            r10 = r14
            goto L_0x0171
        L_0x0170:
            r10 = 0
        L_0x0171:
            r9 = r9 | r10
            r13 = r7 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r13 != r12) goto L_0x017a
            r7 = r14
            goto L_0x017b
        L_0x017a:
            r7 = 0
        L_0x017b:
            r7 = r7 | r9
            java.lang.Object r9 = r5.D()
            if (r7 != 0) goto L_0x018a
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x0192
        L_0x018a:
            Of.T1 r9 = new Of.T1
            r9.<init>(r2, r3, r1, r4)
            r5.u(r9)
        L_0x0192:
            r16 = r9
            nI.l r16 = (nI.C17642l) r16
            r5.P()
            r17 = 0
            r18 = 254(0xfe, float:3.56E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r19
            r19 = r12
            r12 = r20
            r27 = r13
            r13 = r21
            r14 = r22
            r20 = r15
            r15 = r16
            r16 = r5
            t0.C5937b.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r7 = -760597013(0xffffffffd2aa35eb, float:-3.65524517E11)
            r5.W(r7)
            if (r2 != 0) goto L_0x0225
            java.lang.String r7 = "UnavailableItemsTestTag_CONTINUE_BUTTON"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r7)
            r7 = 0
            r8 = 0
            r9 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r7, r9, r8)
            r7 = 16
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.i(r0, r7)
            int r0 = rv.C11849b.f102286e
            r7 = 0
            java.lang.String r0 = J1.j.b(r0, r5, r7)
            r10 = -760589563(0xffffffffd2aa5305, float:-3.65768638E11)
            r5.W(r10)
            r11 = r27
            r10 = 2048(0x800, float:2.87E-42)
            if (r11 != r10) goto L_0x01f6
            r13 = r9
            goto L_0x01f7
        L_0x01f6:
            r13 = r7
        L_0x01f7:
            java.lang.Object r7 = r5.D()
            if (r13 != 0) goto L_0x0205
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r7 != r9) goto L_0x020d
        L_0x0205:
            Of.U1 r7 = new Of.U1
            r7.<init>(r4)
            r5.u(r7)
        L_0x020d:
            r16 = r7
            nI.a r16 = (nI.C17631a) r16
            r5.P()
            r18 = 48
            r19 = 508(0x1fc, float:7.12E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r7 = r0
            r17 = r5
            SC.L.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0225:
            r5.P()
            r5.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0234
            U0.C4895p.R()
        L_0x0234:
            r12 = r20
        L_0x0236:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x0252
            Of.V1 r9 = new Of.V1
            r0 = r9
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r12
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Of.b2.j(boolean, boolean, KJ.c, Of.R1, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(boolean z10, C15987c cVar, boolean z11, R1 r12, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        R0 r02 = R0.f62421a;
        x.i(xVar, (Object) null, (Object) null, r02.a(), 3, (Object) null);
        if (z10) {
            x.a(xVar, 6, (C17642l) null, (C17642l) null, r02.b(), 6, (Object) null);
        } else {
            xVar.e(cVar.size(), new b(new W1(), cVar), new c(a.f62485c, cVar), c1.c.c(-632812321, true, new d(cVar, z11, r12)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object l(a1 a1Var) {
        C17542s.j(a1Var, "it");
        return a1Var.o().f();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(R1 r12) {
        r12.b().invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(boolean z10, boolean z11, C15987c cVar, R1 r12, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(z10, z11, cVar, r12, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void o(boolean z10, boolean z11, C15987c<a1> cVar, R1 r12, L0 l02, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z12 = z10;
        boolean z13 = z11;
        C15987c<a1> cVar2 = cVar;
        R1 r13 = r12;
        L0 l03 = l02;
        int i12 = i10;
        C17542s.j(cVar2, "products");
        C17542s.j(r13, "actions");
        C17542s.j(l03, "snackbarHostState");
        C4889m k10 = mVar.k(-1859852271);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z12) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(cVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.V(r13) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(l03) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1859852271, i11, -1, "com.ingka.ikea.app.cart.compose.UnavailableItemsScreen (UnavailableItemsScreen.kt:59)");
            }
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(136691661, true, new e(r13), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(-111276533, true, new f(l03), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(-936525470, true, new g(z12, z13, cVar2, r13), k10, 54), mVar2, 805309488, 501);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new S1(z10, z11, cVar, r12, l02, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(boolean z10, boolean z11, C15987c cVar, R1 r12, L0 l02, int i10, C4889m mVar, int i11) {
        o(z10, z11, cVar, r12, l02, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(Op.a1 r30, boolean r31, Of.R1 r32, U0.C4889m r33, int r34) {
        /*
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r34
            r0 = -630599957(0xffffffffda69ceeb, float:-1.64527946E16)
            r1 = r33
            U0.m r15 = r1.k(r0)
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0020
            boolean r1 = r15.V(r10)
            if (r1 == 0) goto L_0x001d
            r1 = 4
            goto L_0x001e
        L_0x001d:
            r1 = 2
        L_0x001e:
            r1 = r1 | r13
            goto L_0x0021
        L_0x0020:
            r1 = r13
        L_0x0021:
            r2 = r13 & 48
            r3 = 16
            if (r2 != 0) goto L_0x0032
            boolean r2 = r15.b(r11)
            if (r2 == 0) goto L_0x0030
            r2 = 32
            goto L_0x0031
        L_0x0030:
            r2 = r3
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r2 = r13 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0043
            boolean r2 = r15.V(r12)
            if (r2 == 0) goto L_0x0040
            r2 = r9
            goto L_0x0042
        L_0x0040:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r2 != r4) goto L_0x0056
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.L()
            r3 = r15
            goto L_0x01f0
        L_0x0056:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0062
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.cart.compose.UnavailableProduct (UnavailableItemsScreen.kt:164)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0062:
            r0 = -1886176133(0xffffffff8f933c7b, float:-1.4518615E-29)
            r15.W(r0)
            r8 = r1 & 896(0x380, float:1.256E-42)
            r6 = 0
            if (r8 != r9) goto L_0x006f
            r0 = 1
            goto L_0x0070
        L_0x006f:
            r0 = r6
        L_0x0070:
            java.lang.Object r2 = r15.D()
            if (r0 != 0) goto L_0x007e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0086
        L_0x007e:
            Of.X1 r2 = new Of.X1
            r2.<init>(r12)
            r15.u(r2)
        L_0x0086:
            nI.l r2 = (nI.C17642l) r2
            r15.P()
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r4 = r4.k()
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r4, r15, r6)
            int r4 = U0.C4883j.a(r15, r6)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r14 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x00b8
            U0.C4883j.c()
        L_0x00b8:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x00c5
            r15.p(r14)
            goto L_0x00c8
        L_0x00c5:
            r15.t()
        L_0x00c8:
            U0.m r14 = U0.F1.a(r15)
            nI.p r7 = r16.c()
            U0.F1.c(r14, r0, r7)
            nI.p r0 = r16.e()
            U0.F1.c(r14, r6, r0)
            nI.p r0 = r16.b()
            boolean r6 = r14.i()
            if (r6 != 0) goto L_0x00f2
            java.lang.Object r6 = r14.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 != 0) goto L_0x0100
        L_0x00f2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r14.u(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.w(r4, r0)
        L_0x0100:
            nI.p r0 = r16.d()
            U0.F1.c(r14, r9, r0)
            s0.h r0 = s0.C5862h.f28810a
            tK.v r0 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r15, r4)
            long r17 = r0.k0()
            r20 = 2
            r21 = 0
            r19 = 0
            r16 = r5
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            float r14 = (float) r3
            float r3 = c2.h.B(r14)
            r4 = 0
            r6 = 0
            r7 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r0, r6, r3, r7, r4)
            r0 = -2052680599(0xffffffff85a69469, float:-1.5665082E-35)
            r15.W(r0)
            boolean r0 = r15.V(r2)
            java.lang.Object r4 = r15.D()
            if (r0 != 0) goto L_0x0145
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x014d
        L_0x0145:
            Of.Y1 r4 = new Of.Y1
            r4.<init>(r2)
            r15.u(r4)
        L_0x014d:
            r6 = r4
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            r9 = r1 & 14
            r16 = 60
            r2 = 0
            r4 = 0
            r17 = 0
            r18 = 0
            r0 = r30
            r1 = r3
            r3 = r4
            r4 = r17
            r27 = r5
            r5 = r18
            r17 = 0
            r18 = r7
            r7 = r15
            r28 = r8
            r8 = r9
            r29 = r9
            r13 = 256(0x100, float:3.59E-43)
            r9 = r16
            Op.Y0.O(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -2052677526(0xffffffff85a6a06a, float:-1.5669492E-35)
            r15.W(r0)
            if (r11 == 0) goto L_0x01e0
            float r0 = c2.h.B(r14)
            r1 = r27
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r1, r0)
            SC.M r1 = SC.M.Small
            SC.N r2 = SC.N.Secondary
            r3 = -2052664159(0xffffffff85a6d4a1, float:-1.5688673E-35)
            r15.W(r3)
            r3 = r28
            if (r3 != r13) goto L_0x019e
            r7 = r18
        L_0x019a:
            r4 = r29
            r3 = 4
            goto L_0x01a1
        L_0x019e:
            r7 = r17
            goto L_0x019a
        L_0x01a1:
            if (r4 != r3) goto L_0x01a5
            r17 = r18
        L_0x01a5:
            r3 = r7 | r17
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x01b5
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x01bd
        L_0x01b5:
            Of.Z1 r4 = new Of.Z1
            r4.<init>(r12, r10)
            r15.u(r4)
        L_0x01bd:
            r23 = r4
            nI.a r23 = (nI.C17631a) r23
            r15.P()
            r25 = 27702(0x6c36, float:3.8819E-41)
            r26 = 484(0x1e4, float:6.78E-43)
            java.lang.String r14 = "Explore alternatives (LABS only)"
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r3 = r15
            r15 = r0
            r17 = r2
            r18 = r1
            r24 = r3
            SC.L.b(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01e1
        L_0x01e0:
            r3 = r15
        L_0x01e1:
            r3.P()
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01f0
            U0.C4895p.R()
        L_0x01f0:
            U0.Y0 r0 = r3.n()
            if (r0 == 0) goto L_0x0200
            Of.a2 r1 = new Of.a2
            r2 = r34
            r1.<init>(r10, r11, r12, r2)
            r0.a(r1)
        L_0x0200:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Of.b2.q(Op.a1, boolean, Of.R1, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(R1 r12, Z0 z02) {
        boolean z10;
        boolean z11;
        Z0 z03 = z02;
        C17542s.j(z03, "event");
        if ((z03 instanceof Z0.g) || (z03 instanceof Z0.a) || (z03 instanceof Z0.b) || (z03 instanceof Z0.e)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported event: " + z03);
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            Iterator it = qv.d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "UnavailableProduct";
                }
                String str4 = str2;
                bVar.a(eVar, str4, z10, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
                z10 = z10;
            }
        } else if (z03 instanceof Z0.c) {
            Z0.c cVar = (Z0.c) z03;
            Z0.c.a c10 = cVar.c();
            if (C17542s.e(c10, Z0.c.a.g.f85058b) || C17542s.e(c10, Z0.c.a.C1718a.f85052b) || (c10 instanceof Z0.c.a.b) || C17542s.e(c10, Z0.c.a.d.f85055b) || C17542s.e(c10, Z0.c.a.e.f85056b)) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unsupported event: " + z03);
                qv.e eVar2 = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                Iterator it2 = qv.d.f102012a.a().iterator();
                while (true) {
                    z11 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str5 == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException2);
                        if (a11 == null) {
                            break;
                        }
                        str5 = C11820c.a(a11);
                    }
                    String str7 = str5;
                    if (str6 == null) {
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "UnavailableProduct";
                    }
                    String str8 = str6;
                    bVar2.a(eVar2, str8, z11, illegalArgumentException2, str7);
                    str5 = str7;
                    str6 = str8;
                    z11 = z11;
                }
            } else if (C17542s.e(c10, Z0.c.a.C1719c.f85054b)) {
                r12.c().invoke(cVar.a());
            } else if (C17542s.e(c10, Z0.c.a.f.f85057b)) {
                r12.g().invoke(cVar.a());
            } else {
                throw new t();
            }
        } else if (z03 instanceof Z0.f) {
            r12.f().invoke(((Z0.f) z03).a());
        } else if (z03 instanceof Z0.d) {
            r12.d().invoke(((Z0.d) z03).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar, Z0 z02) {
        C17542s.j(z02, "it");
        lVar.invoke(z02);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(R1 r12, a1 a1Var) {
        r12.e().invoke(a1Var.o().f());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(a1 a1Var, boolean z10, R1 r12, int i10, C4889m mVar, int i11) {
        q(a1Var, z10, r12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
