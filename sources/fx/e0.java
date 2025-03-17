package fx;

import B0.C4373q;
import E1.I;
import G1.C4504g;
import IC.C13021c;
import J1.j;
import KJ.C15988d;
import L1.v;
import L1.x;
import N1.C4669d;
import N1.C4670e;
import N1.C4689y;
import N1.D;
import N1.G;
import N1.P;
import O0.V;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.H0;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16795B;
import XH.C16807N;
import Y1.f;
import Y1.k;
import Y1.o;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.c;
import c2.h;
import com.google.ar.core.ImageMetadata;
import ex.C14430a;
import fI.C17220a;
import fI.C17221b;
import i1.C5437c;
import java.time.DayOfWeek;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import l0.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.g1;
import p1.i1;
import r0.m;
import r1.g;
import s0.C5843N;
import s0.C5880z;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;
import uK.C18146a;
import uK.C18148c;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aa\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aY\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b$\u0010%\u001a'\u0010'\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0013H\u0003¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b,\u0010-\u001a)\u00100\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0.2\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b0\u00101¨\u00067²\u0006\u000e\u00103\u001a\u0002028\n@\nX\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u0002²\u0006\u000e\u0010#\u001a\u00020\u00138\n@\nX\u0002²\u0006\u000e\u0010)\u001a\u0004\u0018\u00010\u00138\nX\u0002²\u0006\u000e\u00104\u001a\u0004\u0018\u00010\u001b8\nX\u0002²\u0006\u000e\u0010 \u001a\u0004\u0018\u00010\u001b8\nX\u0002²\u0006\f\u00105\u001a\u00020\u00028\nX\u0002²\u0006\f\u00106\u001a\u00020\u00028\nX\u0002"}, d2 = {"Lfx/f0;", "popularTimesUiModel", "", "isLoading", "expandedWidth", "Lkotlin/Function1;", "Lex/a;", "LXH/N;", "onAnalyticsAction", "Landroidx/compose/ui/d;", "modifier", "X", "(Lfx/f0;ZZLnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "w", "(ZLandroidx/compose/ui/d;LU0/m;II)V", "Landroid/content/Context;", "context", "LGB/d;", "popularTimesBusyness", "LN1/d;", "k0", "(Landroid/content/Context;LGB/d;)LN1/d;", "Lfx/n;", "chartData", "Lkotlin/Function0;", "onNavigatePrevious", "onNavigateNext", "", "previousDayA11y", "nextDayA11y", "N", "(Lfx/n;ZLnI/a;LnI/a;LnI/a;Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "a11yForPill", "C", "(Lfx/n;LnI/a;LnI/a;LnI/a;LnI/a;Ljava/lang/String;LU0/m;I)V", "lastTodayBusynessTitle", "F", "(LN1/d;Lfx/n;LU0/m;I)V", "content", "J", "(Landroidx/compose/ui/d;LnI/p;LU0/m;II)V", "todayBusynessTitle", "u", "(LN1/d;LU0/m;I)V", "L", "(Lfx/n;ZLU0/m;I)V", "LXH/B;", "Lc2/h;", "l0", "(ZLU0/m;I)LXH/B;", "", "dayIndex", "usuallyClosedTitle", "isUsuallyClosedPillVisible", "isOccupancyPillVisible", "populartimes-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C17220a<DayOfWeek> f127051a = C17221b.a(DayOfWeek.values());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4669d f127052a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4669d f127053a;

            a(C4669d dVar) {
                this.f127053a = dVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1015123657, i10, -1, "com.ingka.ikea.populartimes.impl.ui.Pill.<anonymous>.<anonymous> (PopularTimesUi.kt:416)");
                    }
                    e0.u(this.f127053a, mVar, 0);
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

        b(C4669d dVar) {
            this.f127052a = dVar;
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(1801741310, i10, -1, "com.ingka.ikea.populartimes.impl.ui.Pill.<anonymous> (PopularTimesUi.kt:415)");
            }
            e0.J(C5116k1.a(d.f18749a, "occupancy_pill"), c.e(1015123657, true, new a(this.f127052a), mVar, 54), mVar, 54, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(boolean z10, d dVar, int i10, int i11, C4889m mVar, int i12) {
        w(z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void C(C14471n nVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17631a<String> aVar3, C17631a<String> aVar4, String str, C4889m mVar, int i10) {
        int i11;
        String str2 = str;
        int i12 = i10;
        C4889m k10 = mVar.k(-1915358722);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(nVar) ? 4 : 2) | i12;
        } else {
            C14471n nVar2 = nVar;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        } else {
            C17631a<C16807N> aVar5 = aVar;
        }
        C17631a<C16807N> aVar6 = aVar2;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar6) ? 256 : 128;
        }
        C17631a<String> aVar7 = aVar3;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar7) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17631a<String> aVar8 = aVar4;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar8) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.V(str2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1915358722, i11, -1, "com.ingka.ikea.populartimes.impl.ui.NavigationRow (PopularTimesUi.kt:333)");
            }
            String b10 = j.b(bx.d.f118988a.j(nVar.b()), k10, 0);
            k10.W(-1386101295);
            StringBuilder sb2 = new StringBuilder();
            k10.W(-1386100651);
            if (nVar.f()) {
                sb2.append(j.b(bx.e.f119009r, k10, 0));
                sb2.append(' ');
            }
            k10.P();
            sb2.append(b10);
            String sb3 = sb2.toString();
            k10.P();
            C4669d e10 = C13021c.e(sb3, b10, new G(0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65531, (DefaultConstructorMarker) null));
            d.a aVar9 = d.f18749a;
            d h10 = J.h(aVar9, 0.0f, 1, (Object) null);
            I b11 = androidx.compose.foundation.layout.G.b(C5073d.f18068a.d(), C5437c.f24302a.i(), k10, 54);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e11 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar10 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar10.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b11, aVar10.c());
            F1.c(a12, s10, aVar10.e());
            p<C4504g, Integer, C16807N> b12 = aVar10.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b12);
            }
            F1.c(a12, e11, aVar10.d());
            C5843N n10 = C5843N.f28726a;
            int i13 = C18146a.f148051G1;
            G0 g02 = G0.XSmall;
            H0 h02 = H0.Tertiary;
            F0.b(i13, aVar3.invoke(), C5116k1.a(aVar9, "previous_day"), false, h02, g02, (m) null, false, aVar, k10, ((i11 << 21) & 234881024) | 221568, 200);
            O o10 = new O();
            T j10 = e10.j();
            o10.f144348a = j10;
            if (str2 != null) {
                o10.f144348a = j10 + "\n" + str2;
            }
            C13607l.h(e10, C13679b.a.C2855a.f116679a, L1.o.d(aVar9, false, new Q(o10), 1, (Object) null), C18030v.f147664a.a(k10, C18030v.f147665b).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, k10, 48, 0, 524272);
            F0.b(C18146a.f148096J1, aVar4.invoke(), C5116k1.a(aVar9, "next_day"), false, h02, g02, (m) null, false, aVar2, k10, ((i11 << 18) & 234881024) | 221568, 200);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new S(nVar, aVar, aVar2, aVar3, aVar4, str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N D(O o10, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, (String) o10.f144348a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C14471n nVar, C17631a aVar, C17631a aVar2, C17631a aVar3, C17631a aVar4, String str, int i10, C4889m mVar, int i11) {
        C(nVar, aVar, aVar2, aVar3, aVar4, str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: U0.r0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void F(N1.C4669d r18, fx.C14471n r19, U0.C4889m r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            r3 = -753337555(0xffffffffd318fb2d, float:-6.5704906E11)
            r4 = r20
            U0.m r13 = r4.k(r3)
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L_0x001f
            boolean r4 = r13.V(r0)
            if (r4 == 0) goto L_0x001c
            r4 = 4
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r4 = r4 | r2
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = r2 & 48
            if (r6 != 0) goto L_0x0030
            boolean r6 = r13.V(r1)
            if (r6 == 0) goto L_0x002d
            r6 = 32
            goto L_0x002f
        L_0x002d:
            r6 = 16
        L_0x002f:
            r4 = r4 | r6
        L_0x0030:
            r6 = r4 & 19
            r7 = 18
            if (r6 != r7) goto L_0x0042
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            r13.L()
            goto L_0x010a
        L_0x0042:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x004e
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.populartimes.impl.ui.Pill (PopularTimesUi.kt:387)"
            U0.C4895p.S(r3, r4, r6, r7)
        L_0x004e:
            boolean r3 = r19.e()
            r4 = -2120563175(0xffffffff819ac619, float:-5.685492E-38)
            r13.W(r4)
            boolean r3 = r13.b(r3)
            java.lang.Object r4 = r13.D()
            r14 = 1
            r15 = 0
            if (r3 != 0) goto L_0x006c
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x007c
        L_0x006c:
            boolean r3 = r19.e()
            r3 = r3 ^ r14
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            U0.r0 r4 = U0.u1.e(r3, r15, r5, r15)
            r13.u(r4)
        L_0x007c:
            U0.r0 r4 = (U0.C4899r0) r4
            r13.P()
            GB.d r3 = r19.c()
            r6 = -2120558986(0xffffffff819ad676, float:-5.68784E-38)
            r13.W(r6)
            boolean r3 = r13.V(r3)
            java.lang.Object r6 = r13.D()
            if (r3 != 0) goto L_0x009d
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x00b1
        L_0x009d:
            GB.d r3 = r19.c()
            if (r3 == 0) goto L_0x00a5
            r3 = r14
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            U0.r0 r6 = U0.u1.e(r3, r15, r5, r15)
            r13.u(r6)
        L_0x00b1:
            r3 = r6
            U0.r0 r3 = (U0.C4899r0) r3
            r13.P()
            boolean r4 = G(r4)
            r12 = 0
            r11 = 3
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r15, r12, r11, r15)
            androidx.compose.animation.k r7 = androidx.compose.animation.g.q(r15, r12, r11, r15)
            fx.o r5 = fx.C14472o.f127127a
            nI.q r9 = r5.b()
            r16 = 200064(0x30d80, float:2.8035E-40)
            r17 = 18
            r5 = 0
            r8 = 0
            r10 = r13
            r14 = r11
            r11 = r16
            r1 = r12
            r12 = r17
            l0.d.g(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r4 = H(r3)
            androidx.compose.animation.i r6 = androidx.compose.animation.g.o(r15, r1, r14, r15)
            androidx.compose.animation.k r7 = androidx.compose.animation.g.q(r15, r1, r14, r15)
            fx.e0$b r1 = new fx.e0$b
            r1.<init>(r0)
            r3 = 54
            r5 = 1801741310(0x6b6463fe, float:2.7610729E26)
            r8 = 1
            c1.a r9 = c1.c.e(r5, r8, r1, r13, r3)
            r11 = 200064(0x30d80, float:2.8035E-40)
            r12 = 18
            r5 = 0
            r8 = 0
            l0.d.g(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x010a
            U0.C4895p.R()
        L_0x010a:
            U0.Y0 r1 = r13.n()
            if (r1 == 0) goto L_0x011a
            fx.O r3 = new fx.O
            r4 = r19
            r3.<init>(r0, r4, r2)
            r1.a(r3)
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.e0.F(N1.d, fx.n, U0.m, int):void");
    }

    private static final boolean G(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final boolean H(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C4669d dVar, C14471n nVar, int i10, C4889m mVar, int i11) {
        F(dVar, nVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void J(d dVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-1355763852);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.F(pVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1355763852, i12, -1, "com.ingka.ikea.populartimes.impl.ui.PillRow (PopularTimesUi.kt:427)");
            }
            d d10 = androidx.compose.foundation.b.d(m1.e.a(androidx.compose.foundation.layout.x.b(dVar, C5880z.Max), A0.g.e(h.B((float) 40))), C18030v.f147664a.a(k10, C18030v.f147665b).U(), (i1) null, 2, (Object) null);
            C18029u uVar = C18029u.f147649a;
            d j10 = androidx.compose.foundation.layout.D.j(d10, uVar.a(), uVar.j());
            C5437c.a aVar = C5437c.f24302a;
            I b10 = androidx.compose.foundation.layout.G.b(C5073d.f18068a.o(uVar.j(), aVar.g()), aVar.i(), k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, j10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            pVar.invoke(k10, Integer.valueOf((i12 >> 3) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new T(dVar, pVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N K(d dVar, p pVar, int i10, int i11, C4889m mVar, int i12) {
        J(dVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void L(C14471n nVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C14471n nVar2 = nVar;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(-1650311832);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(nVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1650311832, i11, -1, "com.ingka.ikea.populartimes.impl.ui.PopularTimesChart (PopularTimesUi.kt:466)");
            }
            C16795B<h, h, h> l02 = l0(z11, k10, (i11 >> 3) & 14);
            float G10 = l02.a().G();
            float G11 = l02.b().G();
            float G12 = l02.c().G();
            mVar2 = k10;
            C14464g.f(nVar.a(), nVar.d(), J.i(d.f18749a, G10), G11, G12, 0, 0, 0, 0, C18030v.f147664a.a(k10, C18030v.f147665b).u0(), mVar2, 0, 480);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new P(nVar2, z11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C14471n nVar, boolean z10, int i10, C4889m mVar, int i11) {
        L(nVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N(fx.C14471n r23, boolean r24, nI.C17631a<XH.C16807N> r25, nI.C17631a<XH.C16807N> r26, nI.C17631a<java.lang.String> r27, androidx.compose.ui.d r28, nI.C17631a<java.lang.String> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r8 = r23
            r9 = r24
            r10 = r31
            r0 = 16
            r1 = 32
            r2 = 4
            r11 = 48
            r3 = 1466403543(0x57678ad7, float:2.54583499E14)
            r4 = r30
            U0.m r12 = r4.k(r3)
            r13 = 1
            r4 = r32 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001f
            r4 = r10 | 6
            goto L_0x002f
        L_0x001f:
            r4 = r10 & 6
            if (r4 != 0) goto L_0x002e
            boolean r4 = r12.V(r8)
            if (r4 == 0) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r5
        L_0x002c:
            r4 = r4 | r10
            goto L_0x002f
        L_0x002e:
            r4 = r10
        L_0x002f:
            r6 = r32 & 2
            if (r6 == 0) goto L_0x0035
            r4 = r4 | r11
            goto L_0x0043
        L_0x0035:
            r6 = r10 & 48
            if (r6 != 0) goto L_0x0043
            boolean r6 = r12.b(r9)
            if (r6 == 0) goto L_0x0041
            r6 = r1
            goto L_0x0042
        L_0x0041:
            r6 = r0
        L_0x0042:
            r4 = r4 | r6
        L_0x0043:
            r2 = r32 & 4
            if (r2 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
            r14 = r25
            goto L_0x005e
        L_0x004c:
            r2 = r10 & 384(0x180, float:5.38E-43)
            r14 = r25
            if (r2 != 0) goto L_0x005e
            boolean r2 = r12.F(r14)
            if (r2 == 0) goto L_0x005b
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r2
        L_0x005e:
            r2 = r32 & 8
            if (r2 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            r15 = r26
            goto L_0x0079
        L_0x0067:
            r2 = r10 & 3072(0xc00, float:4.305E-42)
            r15 = r26
            if (r2 != 0) goto L_0x0079
            boolean r2 = r12.F(r15)
            if (r2 == 0) goto L_0x0076
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r2
        L_0x0079:
            r0 = r32 & 16
            if (r0 == 0) goto L_0x0082
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r7 = r27
            goto L_0x0094
        L_0x0082:
            r0 = r10 & 24576(0x6000, float:3.4438E-41)
            r7 = r27
            if (r0 != 0) goto L_0x0094
            boolean r0 = r12.F(r7)
            if (r0 == 0) goto L_0x0091
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r0
        L_0x0094:
            r0 = r32 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r0 == 0) goto L_0x009e
            r4 = r4 | r1
        L_0x009b:
            r1 = r28
            goto L_0x00af
        L_0x009e:
            r1 = r1 & r10
            if (r1 != 0) goto L_0x009b
            r1 = r28
            boolean r2 = r12.V(r1)
            if (r2 == 0) goto L_0x00ac
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r4 = r4 | r2
        L_0x00af:
            r2 = r32 & 64
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r2 == 0) goto L_0x00b9
            r4 = r4 | r6
            r6 = r29
            goto L_0x00cb
        L_0x00b9:
            r2 = r10 & r6
            r6 = r29
            if (r2 != 0) goto L_0x00cb
            boolean r2 = r12.F(r6)
            if (r2 == 0) goto L_0x00c8
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ca
        L_0x00c8:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x00ca:
            r4 = r4 | r2
        L_0x00cb:
            r2 = 599187(0x92493, float:8.3964E-40)
            r2 = r2 & r4
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r13) goto L_0x00e1
            boolean r2 = r12.l()
            if (r2 != 0) goto L_0x00db
            goto L_0x00e1
        L_0x00db:
            r12.L()
            r6 = r1
            goto L_0x0350
        L_0x00e1:
            if (r0 == 0) goto L_0x00e7
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r13 = r0
            goto L_0x00e8
        L_0x00e7:
            r13 = r1
        L_0x00e8:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f4
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.populartimes.impl.ui.PopularTimesDay (PopularTimesUi.kt:245)"
            U0.C4895p.S(r3, r4, r0, r1)
        L_0x00f4:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r12.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = -1123719829(0xffffffffbd05656b, float:-0.032567423)
            r12.W(r1)
            java.lang.Object r1 = r12.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r2 = r16.a()
            r3 = 0
            if (r1 != r2) goto L_0x0129
            N1.d r1 = new N1.d
            r21 = 6
            r22 = 0
            java.lang.String r18 = ""
            r19 = 0
            r20 = 0
            r17 = r1
            r17.<init>(r18, r19, r20, r21, r22)
            U0.r0 r1 = U0.u1.e(r1, r3, r5, r3)
            r12.u(r1)
        L_0x0129:
            r2 = r1
            U0.r0 r2 = (U0.C4899r0) r2
            r12.P()
            GB.d r1 = r23.c()
            r11 = -1123716011(0xffffffffbd057455, float:-0.032581646)
            r12.W(r11)
            boolean r1 = r12.V(r1)
            java.lang.Object r11 = r12.D()
            if (r1 != 0) goto L_0x0149
            java.lang.Object r1 = r16.a()
            if (r11 != r1) goto L_0x015f
        L_0x0149:
            GB.d r1 = r23.c()
            if (r1 == 0) goto L_0x0157
            N1.d r1 = k0(r0, r1)
            P(r2, r1)
            goto L_0x0158
        L_0x0157:
            r1 = r3
        L_0x0158:
            U0.r0 r11 = U0.u1.e(r1, r3, r5, r3)
            r12.u(r11)
        L_0x015f:
            U0.r0 r11 = (U0.C4899r0) r11
            r12.P()
            boolean r1 = r23.e()
            r5 = -1123703339(0xffffffffbd05a5d5, float:-0.032628853)
            r12.W(r5)
            boolean r1 = r12.b(r1)
            java.lang.Object r5 = r12.D()
            if (r1 != 0) goto L_0x017e
            java.lang.Object r1 = r16.a()
            if (r5 != r1) goto L_0x018a
        L_0x017e:
            fx.Z r1 = new fx.Z
            r1.<init>(r8, r0)
            U0.A1 r5 = U0.p1.e(r1)
            r12.u(r5)
        L_0x018a:
            U0.A1 r5 = (U0.A1) r5
            r12.P()
            java.lang.String r0 = S(r5)
            N1.d r1 = Q(r11)
            r3 = -1123692539(0xffffffffbd05d005, float:-0.032669086)
            r12.W(r3)
            boolean r0 = r12.V(r0)
            boolean r1 = r12.V(r1)
            r0 = r0 | r1
            java.lang.Object r1 = r12.D()
            if (r0 != 0) goto L_0x01b2
            java.lang.Object r0 = r16.a()
            if (r1 != r0) goto L_0x01c2
        L_0x01b2:
            N1.d r0 = Q(r11)
            fx.a0 r1 = new fx.a0
            r1.<init>(r0, r5)
            U0.A1 r1 = U0.p1.e(r1)
            r12.u(r1)
        L_0x01c2:
            U0.A1 r1 = (U0.A1) r1
            r12.P()
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$a r11 = i1.C5437c.f24302a
            i1.c$b r3 = r11.k()
            r5 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r3, r12, r5)
            int r3 = U0.C4883j.a(r12, r5)
            U0.y r5 = r12.s()
            r19 = r2
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r13)
            G1.g$a r20 = G1.C4504g.f6515W
            nI.a r6 = r20.a()
            U0.f r21 = r12.m()
            if (r21 != 0) goto L_0x01f5
            U0.C4883j.c()
        L_0x01f5:
            r12.I()
            boolean r21 = r12.i()
            if (r21 == 0) goto L_0x0202
            r12.p(r6)
            goto L_0x0205
        L_0x0202:
            r12.t()
        L_0x0205:
            U0.m r6 = U0.F1.a(r12)
            nI.p r7 = r20.c()
            U0.F1.c(r6, r0, r7)
            nI.p r0 = r20.e()
            U0.F1.c(r6, r5, r0)
            nI.p r0 = r20.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x022f
            java.lang.Object r5 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x023d
        L_0x022f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r6.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r0)
        L_0x023d:
            nI.p r0 = r20.d()
            U0.F1.c(r6, r2, r0)
            s0.h r0 = s0.C5862h.f28810a
            java.lang.String r5 = U(r1)
            r0 = r4 & 14
            int r1 = r4 >> 3
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            int r2 = r4 >> 6
            r1 = r1 & r2
            r7 = r0 | r1
            r0 = r23
            r1 = r25
            r2 = r26
            r6 = 0
            r3 = r27
            r21 = r4
            r4 = r29
            r10 = 0
            r6 = r12
            C(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            tK.u r1 = tK.C18029u.f147649a
            float r2 = r1.j()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r0, r2)
            s0.C5844O.a(r2, r12, r10)
            r2 = 406115020(0x1834d2cc, float:2.337088E-24)
            r12.W(r2)
            java.lang.Object r2 = r12.D()
            java.lang.Object r3 = r16.a()
            if (r2 != r3) goto L_0x0298
            fx.b0 r2 = new fx.b0
            r2.<init>()
            r12.u(r2)
        L_0x0298:
            nI.l r2 = (nI.C17642l) r2
            r12.P()
            androidx.compose.ui.d r2 = L1.o.a(r0, r2)
            r3 = 48
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r2, r3)
            r3 = 0
            r4 = 1
            r5 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r2, r3, r4, r5)
            i1.c r3 = r11.m()
            E1.I r3 = androidx.compose.foundation.layout.C5077h.h(r3, r10)
            int r4 = U0.C4883j.a(r12, r10)
            U0.y r5 = r12.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r2)
            nI.a r6 = r20.a()
            U0.f r7 = r12.m()
            if (r7 != 0) goto L_0x02d4
            U0.C4883j.c()
        L_0x02d4:
            r12.I()
            boolean r7 = r12.i()
            if (r7 == 0) goto L_0x02e1
            r12.p(r6)
            goto L_0x02e4
        L_0x02e1:
            r12.t()
        L_0x02e4:
            U0.m r6 = U0.F1.a(r12)
            nI.p r7 = r20.c()
            U0.F1.c(r6, r3, r7)
            nI.p r3 = r20.e()
            U0.F1.c(r6, r5, r3)
            nI.p r3 = r20.b()
            boolean r5 = r6.i()
            if (r5 != 0) goto L_0x030e
            java.lang.Object r5 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
            if (r5 != 0) goto L_0x031c
        L_0x030e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.w(r4, r3)
        L_0x031c:
            nI.p r3 = r20.d()
            U0.F1.c(r6, r2, r3)
            androidx.compose.foundation.layout.j r2 = androidx.compose.foundation.layout.C5079j.f18125a
            N1.d r2 = O(r19)
            int r3 = r21 << 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            F(r2, r8, r12, r3)
            r12.x()
            r2 = r21 & 126(0x7e, float:1.77E-43)
            L(r8, r9, r12, r2)
            float r1 = r1.a()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r1)
            s0.C5844O.a(r0, r12, r10)
            r12.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x034f
            U0.C4895p.R()
        L_0x034f:
            r6 = r13
        L_0x0350:
            U0.Y0 r10 = r12.n()
            if (r10 == 0) goto L_0x036f
            fx.c0 r11 = new fx.c0
            r0 = r11
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r7 = r29
            r8 = r31
            r9 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x036f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.e0.N(fx.n, boolean, nI.a, nI.a, nI.a, androidx.compose.ui.d, nI.a, U0.m, int, int):void");
    }

    private static final C4669d O(C4899r0<C4669d> r0Var) {
        return r0Var.getValue();
    }

    private static final void P(C4899r0<C4669d> r0Var, C4669d dVar) {
        r0Var.setValue(dVar);
    }

    private static final C4669d Q(C4899r0<C4669d> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final String R(C14471n nVar, Context context) {
        if (!nVar.e()) {
            return context.getString(bx.e.f119004m);
        }
        return null;
    }

    private static final String S(A1<String> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final String T(C4669d dVar, A1 a12) {
        if (S(a12) != null) {
            return S(a12);
        }
        if (dVar != null) {
            return dVar.j();
        }
        return null;
    }

    private static final String U(A1<String> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N V(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        v.z(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W(C14471n nVar, boolean z10, C17631a aVar, C17631a aVar2, C17631a aVar3, d dVar, C17631a aVar4, int i10, int i11, C4889m mVar, int i12) {
        N(nVar, z10, aVar, aVar2, aVar3, dVar, aVar4, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void X(fx.f0 r19, boolean r20, boolean r21, nI.C17642l<? super ex.C14430a, XH.C16807N> r22, androidx.compose.ui.d r23, U0.C4889m r24, int r25, int r26) {
        /*
            r1 = r19
            r2 = r20
            r4 = r22
            r6 = r25
            java.lang.String r0 = "onAnalyticsAction"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = -999193224(0xffffffffc4718578, float:-966.08545)
            r3 = r24
            U0.m r3 = r3.k(r0)
            r5 = r26 & 1
            r7 = 2
            if (r5 == 0) goto L_0x001e
            r5 = r6 | 6
            goto L_0x002e
        L_0x001e:
            r5 = r6 & 6
            if (r5 != 0) goto L_0x002d
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x002a
            r5 = 4
            goto L_0x002b
        L_0x002a:
            r5 = r7
        L_0x002b:
            r5 = r5 | r6
            goto L_0x002e
        L_0x002d:
            r5 = r6
        L_0x002e:
            r8 = r26 & 2
            if (r8 == 0) goto L_0x0035
            r5 = r5 | 48
            goto L_0x0045
        L_0x0035:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0045
            boolean r8 = r3.b(r2)
            if (r8 == 0) goto L_0x0042
            r8 = 32
            goto L_0x0044
        L_0x0042:
            r8 = 16
        L_0x0044:
            r5 = r5 | r8
        L_0x0045:
            r8 = r26 & 4
            if (r8 == 0) goto L_0x004e
            r5 = r5 | 384(0x180, float:5.38E-43)
            r15 = r21
            goto L_0x0060
        L_0x004e:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r15 = r21
            if (r8 != 0) goto L_0x0060
            boolean r8 = r3.b(r15)
            if (r8 == 0) goto L_0x005d
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r5 = r5 | r8
        L_0x0060:
            r8 = r26 & 8
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0069
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0069:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0078
            boolean r8 = r3.F(r4)
            if (r8 == 0) goto L_0x0075
            r8 = r9
            goto L_0x0077
        L_0x0075:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r5 = r5 | r8
        L_0x0078:
            r8 = r26 & 16
            if (r8 == 0) goto L_0x0081
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x007e:
            r10 = r23
            goto L_0x0093
        L_0x0081:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x007e
            r10 = r23
            boolean r11 = r3.V(r10)
            if (r11 == 0) goto L_0x0090
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0092
        L_0x0090:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r5 = r5 | r11
        L_0x0093:
            r11 = r5 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r11 != r12) goto L_0x00a6
            boolean r11 = r3.l()
            if (r11 != 0) goto L_0x00a0
            goto L_0x00a6
        L_0x00a0:
            r3.L()
            r5 = r10
            goto L_0x0210
        L_0x00a6:
            if (r8 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            r17 = r8
            goto L_0x00af
        L_0x00ad:
            r17 = r10
        L_0x00af:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00bb
            r8 = -1
            java.lang.String r10 = "com.ingka.ikea.populartimes.impl.ui.PopularTimesUi (PopularTimesUi.kt:116)"
            U0.C4895p.S(r0, r5, r8, r10)
        L_0x00bb:
            r0 = 0
            if (r1 != 0) goto L_0x00d0
            r8 = -1103361810(0xffffffffbe3c08ee, float:-0.18362781)
            r3.W(r8)
            int r5 = r5 >> 3
            r5 = r5 & 14
            w(r2, r0, r3, r5, r7)
            r3.P()
            goto L_0x0205
        L_0x00d0:
            r8 = -1103253992(0xffffffffbe3dae18, float:-0.18523443)
            r3.W(r8)
            U0.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r8 = r3.Q(r8)
            android.content.Context r8 = (android.content.Context) r8
            r10 = 518601055(0x1ee9395f, float:2.4693563E-20)
            r3.W(r10)
            java.lang.Object r10 = r3.D()
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r12 = r11.a()
            if (r10 != r12) goto L_0x00fd
            int r10 = r19.b()
            U0.o0 r10 = U0.C4877g1.a(r10)
            r3.u(r10)
        L_0x00fd:
            U0.o0 r10 = (U0.C4894o0) r10
            r3.P()
            int r12 = Y(r10)
            r13 = 518603911(0x1ee94487, float:2.4698177E-20)
            r3.W(r13)
            boolean r12 = r3.d(r12)
            java.lang.Object r13 = r3.D()
            if (r12 != 0) goto L_0x011c
            java.lang.Object r12 = r11.a()
            if (r13 != r12) goto L_0x012f
        L_0x011c:
            java.util.List r12 = r19.a()
            int r13 = Y(r10)
            java.lang.Object r12 = r12.get(r13)
            U0.r0 r13 = U0.u1.e(r12, r0, r7, r0)
            r3.u(r13)
        L_0x012f:
            U0.r0 r13 = (U0.C4899r0) r13
            r3.P()
            java.util.List r0 = r19.a()
            int r0 = r0.size()
            fx.n r7 = d0(r13)
            r12 = 518618238(0x1ee97c7e, float:2.4721323E-20)
            r3.W(r12)
            r12 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != r9) goto L_0x014d
            r16 = 1
            goto L_0x014f
        L_0x014d:
            r16 = 0
        L_0x014f:
            boolean r18 = r3.d(r0)
            r16 = r16 | r18
            java.lang.Object r13 = r3.D()
            if (r16 != 0) goto L_0x0161
            java.lang.Object r14 = r11.a()
            if (r13 != r14) goto L_0x0169
        L_0x0161:
            fx.J r13 = new fx.J
            r13.<init>(r4, r10, r0)
            r3.u(r13)
        L_0x0169:
            nI.a r13 = (nI.C17631a) r13
            r3.P()
            r14 = 518624254(0x1ee993fe, float:2.4731043E-20)
            r3.W(r14)
            if (r12 != r9) goto L_0x0178
            r9 = 1
            goto L_0x0179
        L_0x0178:
            r9 = 0
        L_0x0179:
            boolean r12 = r3.d(r0)
            r9 = r9 | r12
            java.lang.Object r12 = r3.D()
            if (r9 != 0) goto L_0x018a
            java.lang.Object r9 = r11.a()
            if (r12 != r9) goto L_0x0192
        L_0x018a:
            fx.V r12 = new fx.V
            r12.<init>(r4, r10, r0)
            r3.u(r12)
        L_0x0192:
            nI.a r12 = (nI.C17631a) r12
            r3.P()
            r9 = 518630489(0x1ee9ac59, float:2.4741116E-20)
            r3.W(r9)
            boolean r9 = r3.F(r8)
            boolean r14 = r3.d(r0)
            r9 = r9 | r14
            java.lang.Object r14 = r3.D()
            if (r9 != 0) goto L_0x01b2
            java.lang.Object r9 = r11.a()
            if (r14 != r9) goto L_0x01ba
        L_0x01b2:
            fx.W r14 = new fx.W
            r14.<init>(r8, r10, r0)
            r3.u(r14)
        L_0x01ba:
            nI.a r14 = (nI.C17631a) r14
            r3.P()
            r9 = 518642385(0x1ee9dad1, float:2.4760335E-20)
            r3.W(r9)
            boolean r9 = r3.F(r8)
            boolean r16 = r3.d(r0)
            r9 = r9 | r16
            java.lang.Object r1 = r3.D()
            if (r9 != 0) goto L_0x01db
            java.lang.Object r9 = r11.a()
            if (r1 != r9) goto L_0x01e3
        L_0x01db:
            fx.X r1 = new fx.X
            r1.<init>(r8, r10, r0)
            r3.u(r1)
        L_0x01e3:
            r0 = r1
            nI.a r0 = (nI.C17631a) r0
            r3.P()
            int r1 = r5 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r8 = 458752(0x70000, float:6.42848E-40)
            int r5 = r5 << 3
            r5 = r5 & r8
            r1 = r1 | r5
            r16 = 0
            r8 = r21
            r9 = r13
            r10 = r12
            r11 = r14
            r12 = r17
            r13 = r0
            r14 = r3
            r15 = r1
            N(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.P()
        L_0x0205:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x020e
            U0.C4895p.R()
        L_0x020e:
            r5 = r17
        L_0x0210:
            U0.Y0 r8 = r3.n()
            if (r8 == 0) goto L_0x022b
            fx.Y r9 = new fx.Y
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r6 = r25
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.e0.X(fx.f0, boolean, boolean, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    private static final int Y(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final String Z(Context context, C4894o0 o0Var, int i10) {
        String string = context.getString(bx.d.f118988a.j(a.f127051a.get(g0(i10, Y(o0Var) - 1))));
        C17542s.i(string, "getString(...)");
        String string2 = context.getString(bx.e.f118994c, new Object[]{string});
        C17542s.i(string2, "getString(...)");
        return string2;
    }

    /* access modifiers changed from: private */
    public static final String a0(Context context, C4894o0 o0Var, int i10) {
        String string = context.getString(bx.d.f118988a.j(a.f127051a.get(g0(i10, Y(o0Var) + 1))));
        C17542s.i(string, "getString(...)");
        String string2 = context.getString(bx.e.f118994c, new Object[]{string});
        C17542s.i(string2, "getString(...)");
        return string2;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(f0 f0Var, boolean z10, boolean z11, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        X(f0Var, z10, z11, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void c0(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final C14471n d0(C4899r0<C14471n> r0Var) {
        return r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(C17642l lVar, C4894o0 o0Var, int i10) {
        lVar.invoke(C14430a.C3101a.f126774a);
        c0(o0Var, g0(i10, Y(o0Var) - 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17642l lVar, C4894o0 o0Var, int i10) {
        lVar.invoke(C14430a.C3101a.f126774a);
        c0(o0Var, g0(i10, Y(o0Var) + 1));
        return C16807N.f139792a;
    }

    private static final int g0(int i10, int i11) {
        return (i11 + i10) % i10;
    }

    private static final C4669d k0(Context context, GB.d dVar) {
        Context context2 = context;
        C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
        aVar.h(C4670e.b(context2.getString(bx.e.f119007p) + " ", new G(0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (U1.e) null, 0, (k) null, (g1) null, (D) null, (g) null, 65531, (DefaultConstructorMarker) null), (C4689y) null, 4, (Object) null));
        aVar.j(bx.d.f118988a.b(dVar).b(context2));
        return aVar.q();
    }

    private static final C16795B<h, h, h> l0(boolean z10, C4889m mVar, int i10) {
        C16795B<h, h, h> b10;
        mVar.W(-135586632);
        if (C4895p.J()) {
            C4895p.S(-135586632, i10, -1, "com.ingka.ikea.populartimes.impl.ui.getChartProperties (PopularTimesUi.kt:479)");
        }
        if (z10) {
            C14459b bVar = C14459b.f127006a;
            b10 = new C16795B<>(h.m(bVar.j()), h.m(bVar.h()), h.m(bVar.f()));
        } else {
            C14459b bVar2 = C14459b.f127006a;
            b10 = new C16795B<>(h.m(bVar2.i()), h.m(bVar2.g()), h.m(bVar2.e()));
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return b10;
    }

    /* access modifiers changed from: private */
    public static final void u(C4669d dVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C4669d dVar2 = dVar;
        C4889m k10 = mVar.k(-1089575193);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(dVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1089575193, i11, -1, "com.ingka.ikea.populartimes.impl.ui.IconAndText (PopularTimesUi.kt:448)");
            }
            C5942c c10 = J1.e.c(C18148c.CircleFilled.m(), k10, 0);
            C18030v vVar = C18030v.f147664a;
            int i12 = C18030v.f147665b;
            V.a(c10, "", J.t(d.f18749a, h.B((float) 16)), vVar.a(k10, i12).u0(), k10, 432, 0);
            mVar2 = k10;
            C13607l.h(dVar, C13679b.a.c.f116681a, (d) null, vVar.a(k10, i12).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, mVar2, (i11 & 14) | 48, 0, 524276);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new U(dVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C4669d dVar, int i10, C4889m mVar, int i11) {
        u(dVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void w(boolean r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r0 = r27
            r1 = r30
            r2 = r31
            r3 = 2
            r4 = 879583529(0x346d6129, float:2.2107692E-7)
            r5 = r29
            U0.m r15 = r5.k(r4)
            r14 = 1
            r5 = r2 & 1
            if (r5 == 0) goto L_0x0018
            r5 = r1 | 6
            goto L_0x0028
        L_0x0018:
            r5 = r1 & 6
            if (r5 != 0) goto L_0x0027
            boolean r5 = r15.b(r0)
            if (r5 == 0) goto L_0x0024
            r5 = 4
            goto L_0x0025
        L_0x0024:
            r5 = r3
        L_0x0025:
            r5 = r5 | r1
            goto L_0x0028
        L_0x0027:
            r5 = r1
        L_0x0028:
            r3 = r3 & r2
            if (r3 == 0) goto L_0x0031
            r5 = r5 | 48
        L_0x002d:
            r6 = r28
        L_0x002f:
            r13 = r5
            goto L_0x0044
        L_0x0031:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002d
            r6 = r28
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r5 = r5 | r7
            goto L_0x002f
        L_0x0044:
            r5 = r13 & 19
            r7 = 18
            if (r5 != r7) goto L_0x0058
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            r15.L()
            r3 = r6
            r7 = r15
            goto L_0x030d
        L_0x0058:
            if (r3 == 0) goto L_0x005d
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x005e
        L_0x005d:
            r3 = r6
        L_0x005e:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006a
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.populartimes.impl.ui.LoadingState (PopularTimesUi.kt:170)"
            U0.C4895p.S(r4, r13, r5, r6)
        L_0x006a:
            U0.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r15.Q(r4)
            android.content.Context r4 = (android.content.Context) r4
            r5 = 1479540638(0x582fff9e, float:7.7404961E14)
            r15.W(r5)
            boolean r5 = r15.F(r4)
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x008c
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0094
        L_0x008c:
            fx.d0 r6 = new fx.d0
            r6.<init>(r4)
            r15.u(r6)
        L_0x0094:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            androidx.compose.ui.d r4 = L1.o.c(r3, r14, r6)
            r5 = 1479547000(0x58301878, float:7.7447656E14)
            r15.W(r5)
            java.lang.Object r5 = r15.D()
            U0.m$a r17 = U0.C4889m.f14007a
            java.lang.Object r6 = r17.a()
            if (r5 != r6) goto L_0x00b7
            fx.K r5 = new fx.K
            r5.<init>()
            r15.u(r5)
        L_0x00b7:
            nI.l r5 = (nI.C17642l) r5
            r15.P()
            androidx.compose.ui.d r4 = L1.o.a(r4, r5)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r5.g()
            i1.c$a r18 = i1.C5437c.f24302a
            i1.c$b r7 = r18.k()
            r12 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r12)
            int r7 = U0.C4883j.a(r15, r12)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r9 = r19.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x00ec
            U0.C4883j.c()
        L_0x00ec:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x00f9
            r15.p(r9)
            goto L_0x00fc
        L_0x00f9:
            r15.t()
        L_0x00fc:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r19.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r19.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r19.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0126
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0134
        L_0x0126:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x0134:
            nI.p r6 = r19.d()
            U0.F1.c(r9, r4, r6)
            s0.h r4 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r11 = 0
            r10 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.h(r4, r11, r14, r10)
            androidx.compose.foundation.layout.d$f r5 = r5.d()
            i1.c$c r7 = r18.i()
            r8 = 54
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r7, r15, r8)
            int r7 = U0.C4883j.a(r15, r12)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            nI.a r9 = r19.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x016c
            U0.C4883j.c()
        L_0x016c:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x0179
            r15.p(r9)
            goto L_0x017c
        L_0x0179:
            r15.t()
        L_0x017c:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r19.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r19.e()
            U0.F1.c(r9, r8, r5)
            nI.p r5 = r19.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x01a6
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x01b4
        L_0x01a6:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r5)
        L_0x01b4:
            nI.p r5 = r19.d()
            U0.F1.c(r9, r6, r5)
            s0.N r5 = s0.C5843N.f28726a
            int r5 = uK.C18146a.f148051G1
            SC.G0 r20 = SC.G0.XSmall
            SC.H0 r21 = SC.H0.Tertiary
            r6 = 187121718(0xb274036, float:3.2211337E-32)
            r15.W(r6)
            java.lang.Object r6 = r15.D()
            java.lang.Object r7 = r17.a()
            if (r6 != r7) goto L_0x01db
            fx.L r6 = new fx.L
            r6.<init>()
            r15.u(r6)
        L_0x01db:
            r16 = r6
            nI.a r16 = (nI.C17631a) r16
            r15.P()
            r22 = 100887600(0x6036c30, float:2.4717845E-35)
            r23 = 196(0xc4, float:2.75E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r24 = 0
            r25 = 0
            r9 = r21
            r10 = r20
            r11 = r24
            r12 = r25
            r24 = r13
            r13 = r16
            r14 = r15
            r26 = r15
            r15 = r22
            r16 = r23
            SC.F0.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r5 = 110(0x6e, float:1.54E-43)
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r6 = 24
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.v(r4, r5, r6)
            int r6 = r24 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | 6
            r15 = r26
            r14 = 0
            SC.H2.b(r5, r0, r15, r6, r14)
            int r5 = uK.C18146a.f148096J1
            r6 = 187137110(0xb277c56, float:3.225657E-32)
            r15.W(r6)
            java.lang.Object r6 = r15.D()
            java.lang.Object r7 = r17.a()
            if (r6 != r7) goto L_0x023c
            fx.M r6 = new fx.M
            r6.<init>()
            r15.u(r6)
        L_0x023c:
            r13 = r6
            nI.a r13 = (nI.C17631a) r13
            r15.P()
            r16 = 100887600(0x6036c30, float:2.4717845E-35)
            r17 = 196(0xc4, float:2.75E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r9 = r21
            r10 = r20
            r14 = r15
            r26 = r15
            r15 = r16
            r16 = r17
            SC.F0.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r26.x()
            r5 = 80
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            fx.b r6 = fx.C14459b.f127006a
            float r6 = r6.i()
            float r5 = r5 + r6
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r4, r5)
            r5 = 1
            r6 = 0
            r7 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.h(r4, r6, r5, r7)
            tK.u r4 = tK.C18029u.f147649a
            float r12 = r4.j()
            r13 = 7
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
            i1.c r5 = r18.m()
            r6 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r6)
            r7 = r26
            int r6 = U0.C4883j.a(r7, r6)
            U0.y r8 = r7.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r7, r4)
            nI.a r9 = r19.a()
            U0.f r10 = r7.m()
            if (r10 != 0) goto L_0x02ad
            U0.C4883j.c()
        L_0x02ad:
            r7.I()
            boolean r10 = r7.i()
            if (r10 == 0) goto L_0x02ba
            r7.p(r9)
            goto L_0x02bd
        L_0x02ba:
            r7.t()
        L_0x02bd:
            U0.m r9 = U0.F1.a(r7)
            nI.p r10 = r19.c()
            U0.F1.c(r9, r5, r10)
            nI.p r5 = r19.e()
            U0.F1.c(r9, r8, r5)
            nI.p r5 = r19.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x02e7
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x02f5
        L_0x02e7:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9.u(r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x02f5:
            nI.p r5 = r19.d()
            U0.F1.c(r9, r4, r5)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            r7.x()
            r7.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x030d
            U0.C4895p.R()
        L_0x030d:
            U0.Y0 r4 = r7.n()
            if (r4 == 0) goto L_0x031b
            fx.N r5 = new fx.N
            r5.<init>(r0, r3, r1, r2)
            r4.a(r5)
        L_0x031b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fx.e0.w(boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N x(Context context, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, context.getString(Oo.b.f84808v));
        v.r0(xVar, "loading_state");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z() {
        return C16807N.f139792a;
    }
}
