package jF;

import E1.I;
import G1.C4504g;
import U0.C4877g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import com.sugarcube.app.base.data.model.RoomTypeRenderer;
import com.sugarcube.core.network.models.RoomType;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.r;
import p0.s;
import s0.C5834E;
import s0.C5852X;
import s0.C5862h;
import u0.C5968C;
import u0.C5974I;
import u0.C5978b;
import u0.C5979c;
import u0.C5984h;
import u0.C5991o;
import u0.C5993q;

@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u0002²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u0002"}, d2 = {"", "Lcom/sugarcube/core/network/models/RoomType;", "roomTypes", "Lkotlin/Function1;", "LXH/N;", "onSelectRoom", "Lkotlin/Function0;", "onBack", "e", "(Ljava/util/List;LnI/l;LnI/a;LU0/m;I)V", "", "isLandscape", "", "numColumns", "Lc2/h;", "horizontalPadding", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jF.e  reason: case insensitive filesystem */
public final class C14633e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jF.e$a */
    static final class a implements C17642l<RoomType, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoomType f127917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f127918b;

        a(RoomType roomType, Context context) {
            this.f127917a = roomType;
            this.f127918b = context;
        }

        /* renamed from: a */
        public final String invoke(RoomType roomType) {
            C17542s.j(roomType, "it");
            RoomTypeRenderer roomTypeRenderer = RoomTypeRenderer.INSTANCE;
            RoomType roomType2 = this.f127917a;
            Resources resources = this.f127918b.getResources();
            C17542s.i(resources, "getResources(...)");
            return roomTypeRenderer.getTitle(roomType2, resources);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jF.e$b */
    static final class b implements C17642l<RoomType, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RoomType f127919a;

        b(RoomType roomType) {
            this.f127919a = roomType;
        }

        /* renamed from: a */
        public final Integer invoke(RoomType roomType) {
            C17542s.j(roomType, "it");
            return Integer.valueOf(RoomTypeRenderer.INSTANCE.getThumbnailResId(this.f127919a));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jF.e$c */
    static final class c implements C17642l<RoomType, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f127920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RoomType f127921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<RoomType, C16807N> f127922c;

        c(C17642l<? super String, C16807N> lVar, RoomType roomType, C17642l<? super RoomType, C16807N> lVar2) {
            this.f127920a = lVar;
            this.f127921b = roomType;
            this.f127922c = lVar2;
        }

        public final void a(RoomType roomType) {
            C17542s.j(roomType, "it");
            this.f127920a.invoke(this.f127921b.getApiKey());
            this.f127922c.invoke(this.f127921b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((RoomType) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: jF.e$d */
    public static final class d extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final d f127923c = new d();

        public d() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(RoomType roomType) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    /* renamed from: jF.e$e  reason: collision with other inner class name */
    public static final class C3155e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f127924c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f127925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3155e(C17642l lVar, List list) {
            super(1);
            this.f127924c = lVar;
            this.f127925d = list;
        }

        public final Object a(int i10) {
            return this.f127924c.invoke(this.f127925d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: jF.e$f */
    public static final class f extends C17544u implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f127926c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f127927d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f127928e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l f127929f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f127930g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list, String str, Context context, C17642l lVar, C17642l lVar2) {
            super(4);
            this.f127926c = list;
            this.f127927d = str;
            this.f127928e = context;
            this.f127929f = lVar;
            this.f127930g = lVar2;
        }

        public final void a(C5991o oVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(oVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                RoomType roomType = (RoomType) this.f127926c.get(i10);
                mVar.W(46850112);
                boolean e10 = C17542s.e(this.f127927d, roomType.getApiKey());
                mVar.W(1248443731);
                boolean V10 = mVar.V(roomType) | mVar.F(this.f127928e);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(roomType, this.f127928e);
                    mVar.u(D10);
                }
                C17642l lVar = (C17642l) D10;
                mVar.P();
                mVar.W(1248446475);
                boolean V11 = mVar.V(roomType);
                Object D11 = mVar.D();
                if (V11 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(roomType);
                    mVar.u(D11);
                }
                mVar.P();
                C14635g gVar = new C14635g(roomType, e10, lVar, (C17642l) D11);
                mVar.W(1248449354);
                boolean V12 = mVar.V(this.f127929f) | mVar.V(roomType) | mVar.V(this.f127930g);
                Object D12 = mVar.D();
                if (V12 || D12 == C4889m.f14007a.a()) {
                    D12 = new c(this.f127929f, roomType, this.f127930g);
                    mVar.u(D12);
                }
                mVar.P();
                C14639k.c(gVar, (C17642l) D12, mVar, 0);
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
            a((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void e(List<? extends RoomType> list, C17642l<? super RoomType, C16807N> lVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        List<? extends RoomType> list2 = list;
        C17642l<? super RoomType, C16807N> lVar2 = lVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(list2, "roomTypes");
        C17542s.j(lVar2, "onSelectRoom");
        C17542s.j(aVar2, "onBack");
        C4889m k10 = mVar.k(-1571555087);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(list2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1571555087, i11, -1, "com.sugarcube.app.base.ui.compose.capture.chooseroom.ChooseYourRoomScreen (ChooseYourRoomScreen.kt:57)");
            }
            k10.W(-399544783);
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            k10.W(-399542960);
            Object D11 = k10.D();
            if (D11 == aVar3.a()) {
                D11 = C4877g1.a(1);
                k10.u(D11);
            }
            C4894o0 o0Var = (C4894o0) D11;
            k10.P();
            k10.W(-399540943);
            Object D12 = k10.D();
            int i13 = 24;
            if (D12 == aVar3.a()) {
                D12 = u1.e(h.m(h.B((float) 24)), (o1) null, 2, (Object) null);
                k10.u(D12);
            }
            C4899r0 r0Var2 = (C4899r0) D12;
            k10.P();
            p(r0Var, ((Configuration) k10.Q(AndroidCompositionLocals_androidKt.f())).orientation == 2);
            j(o0Var, o(r0Var) ? 2 : 1);
            if (o(r0Var)) {
                i13 = 64;
            }
            l(r0Var2, h.B((float) i13));
            k10.W(-399529223);
            Object D13 = k10.D();
            if (D13 == aVar3.a()) {
                D13 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D13);
            }
            C4899r0 r0Var3 = (C4899r0) D13;
            k10.P();
            String str = (String) r0Var3.q();
            C17642l l10 = r0Var3.l();
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            d.a aVar4 = androidx.compose.ui.d.f18749a;
            C5073d dVar = C5073d.f18068a;
            I a10 = C5080k.a(dVar.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            C4889m.a aVar5 = aVar3;
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar4);
            C4504g.a aVar6 = C4504g.f6515W;
            int i14 = i11;
            C17631a<C4504g> a12 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            C17642l lVar3 = l10;
            F1.c(a13, a10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            f(aVar2, o(r0Var), k10, 0);
            androidx.compose.ui.d d10 = C5852X.d(J.d(aVar4, 0.0f, 1, (Object) null));
            C5978b.a aVar7 = new C5978b.a(i(o0Var));
            float f10 = (float) 8;
            C5834E d11 = D.d(k(r0Var2), h.B(f10), k(r0Var2), h.B((float) 16));
            C5073d.f n10 = dVar.n(h.B((float) 12));
            C5073d.f n11 = dVar.n(h.B(f10));
            k10.W(28772699);
            C17642l lVar4 = lVar3;
            boolean F10 = k10.F(list2) | k10.V(str) | k10.F(context) | k10.V(lVar4) | ((i14 & 112) == 32);
            Object D14 = k10.D();
            if (F10 || D14 == aVar5.a()) {
                C14629a aVar8 = new C14629a(list, str, context, lVar4, lVar);
                k10.u(aVar8);
                D14 = aVar8;
            }
            k10.P();
            mVar2 = k10;
            C5984h.a(aVar7, d10, (C5974I) null, d11, false, n10, n11, (s) null, false, (C17642l) D14, mVar2, 1769472, 404);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new C14630b(list2, lVar, aVar2, i10));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void f(nI.C17631a<XH.C16807N> r32, boolean r33, U0.C4889m r34, int r35) {
        /*
            r0 = r32
            r1 = r34
            r2 = 806398030(0x3010a84e, float:5.262607E-10)
            r1.W(r2)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0018
            r3 = -1
            java.lang.String r4 = "com.sugarcube.app.base.ui.compose.capture.chooseroom.ChooseYourRoomScreen.Header (ChooseYourRoomScreen.kt:61)"
            r5 = r35
            U0.C4895p.S(r2, r5, r3, r4)
        L_0x0018:
            int r2 = OE.n.f113361f2
            r3 = 0
            java.lang.String r26 = J1.j.b(r2, r1, r3)
            int r2 = OE.n.f113500z2
            java.lang.String r27 = J1.j.b(r2, r1, r3)
            r28 = 196608(0x30000, float:2.75506E-40)
            r14 = 4
            r2 = 1
            r15 = 0
            r13 = 0
            r12 = 12
            if (r33 == 0) goto L_0x018e
            r4 = 975416525(0x3a23accd, float:6.243706E-4)
            r1.W(r4)
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            float r4 = (float) r12
            float r5 = c2.h.B(r4)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.i(r10, r5)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r5, r13, r2, r15)
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r5 = r5.d()
            i1.c$a r29 = i1.C5437c.f24302a
            i1.c$c r6 = r29.l()
            r11 = 6
            E1.I r5 = androidx.compose.foundation.layout.G.b(r5, r6, r1, r11)
            int r3 = U0.C4883j.a(r1, r3)
            U0.y r6 = r34.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r34.m()
            if (r9 != 0) goto L_0x0070
            U0.C4883j.c()
        L_0x0070:
            r34.I()
            boolean r9 = r34.i()
            if (r9 == 0) goto L_0x007d
            r1.p(r8)
            goto L_0x0080
        L_0x007d:
            r34.t()
        L_0x0080:
            U0.m r8 = U0.F1.a(r34)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r5, r9)
            nI.p r5 = r7.e()
            U0.F1.c(r8, r6, r5)
            nI.p r5 = r7.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x00aa
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00b8
        L_0x00aa:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r8.u(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.w(r3, r5)
        L_0x00b8:
            nI.p r3 = r7.d()
            U0.F1.c(r8, r2, r3)
            s0.N r9 = s0.C5843N.f28726a
            i1.c$c r2 = r29.i()
            androidx.compose.ui.d r16 = r9.c(r10, r2)
            float r17 = c2.h.B(r4)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            tK.v r3 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.w r3 = r3.b(r1, r4)
            tK.r r3 = r3.c()
            N1.Y r21 = r3.a()
            Y1.t$a r3 = Y1.t.f14827a
            int r16 = r3.b()
            r24 = 3120(0xc30, float:4.372E-42)
            r25 = 55292(0xd7fc, float:7.748E-41)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r17 = 0
            r30 = r9
            r9 = r17
            r17 = 0
            r31 = r10
            r10 = r17
            r17 = 0
            r12 = r17
            r13 = r17
            r17 = 0
            r14 = r17
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            r23 = 0
            r1 = r26
            r22 = r34
            I0.b1.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 4
            float r1 = (float) r12
            float r1 = c2.h.B(r1)
            r2 = 2
            r3 = r31
            r4 = 0
            r5 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r3, r1, r5, r2, r4)
            r15 = r34
            r2 = 6
            s0.C5844O.a(r1, r15, r2)
            i1.c$c r1 = r29.i()
            r2 = r30
            androidx.compose.ui.d r2 = r2.c(r3, r1)
            uK.c r1 = uK.C18148c.Cross
            int r1 = r1.m()
            wK.m3$g r4 = wK.C18405m3.g.f151252b
            wK.k3 r5 = wK.C18381k3.Small
            r3 = -1091389182(0xffffffffbef2b902, float:-0.47406775)
            r15.W(r3)
            boolean r3 = r15.V(r0)
            java.lang.Object r6 = r34.D()
            if (r3 != 0) goto L_0x0164
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x016c
        L_0x0164:
            jF.c r6 = new jF.c
            r6.<init>(r0)
            r15.u(r6)
        L_0x016c:
            r8 = r6
            nI.a r8 = (nI.C17631a) r8
            r34.P()
            int r0 = wK.C18405m3.g.f151253c
            r6 = 12
            int r0 = r0 << r6
            r10 = r0 | r28
            r11 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r6 = 0
            r7 = 0
            r0 = r1
            r1 = r27
            r9 = r34
            wK.C18357i3.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r34.x()
            r34.P()
            goto L_0x02f7
        L_0x018e:
            r6 = r12
            r5 = r13
            r12 = r14
            r4 = r15
            r15 = r1
            r1 = 976507601(0x3a3452d1, float:6.8787957E-4)
            r15.W(r1)
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            float r1 = (float) r6
            float r7 = c2.h.B(r1)
            float r8 = c2.h.B(r1)
            r9 = 32
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            float r1 = c2.h.B(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.l(r13, r7, r9, r8, r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r5, r2, r4)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r2 = r2.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r5 = r4.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r5, r15, r3)
            int r3 = U0.C4883j.a(r15, r3)
            U0.y r5 = r34.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r34.m()
            if (r9 != 0) goto L_0x01e2
            U0.C4883j.c()
        L_0x01e2:
            r34.I()
            boolean r9 = r34.i()
            if (r9 == 0) goto L_0x01ef
            r15.p(r8)
            goto L_0x01f2
        L_0x01ef:
            r34.t()
        L_0x01f2:
            U0.m r8 = U0.F1.a(r34)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r2, r9)
            nI.p r2 = r7.e()
            U0.F1.c(r8, r5, r2)
            nI.p r2 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x021c
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x022a
        L_0x021c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r8.u(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.w(r3, r2)
        L_0x022a:
            nI.p r2 = r7.d()
            U0.F1.c(r8, r1, r2)
            s0.h r1 = s0.C5862h.f28810a
            r2 = 8
            float r2 = (float) r2
            float r17 = c2.h.B(r2)
            r2 = 18
            float r2 = (float) r2
            float r18 = c2.h.B(r2)
            r21 = 12
            r22 = 0
            r19 = 0
            r20 = 0
            r16 = r13
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            i1.c$b r3 = r4.j()
            androidx.compose.ui.d r1 = r1.b(r2, r3)
            r2 = 48
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.t(r1, r2)
            uK.c r1 = uK.C18148c.Cross
            int r1 = r1.m()
            wK.m3$g r4 = wK.C18405m3.g.f151252b
            wK.k3 r5 = wK.C18381k3.Small
            r3 = -1091365214(0xffffffffbef316a2, float:-0.47478205)
            r15.W(r3)
            boolean r3 = r15.V(r0)
            java.lang.Object r7 = r34.D()
            if (r3 != 0) goto L_0x0284
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r7 != r3) goto L_0x028c
        L_0x0284:
            jF.d r7 = new jF.d
            r7.<init>(r0)
            r15.u(r7)
        L_0x028c:
            r8 = r7
            nI.a r8 = (nI.C17631a) r8
            r34.P()
            int r0 = wK.C18405m3.g.f151253c
            int r0 = r0 << r6
            r10 = r0 | r28
            r11 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r6 = 0
            r7 = 0
            r0 = r1
            r1 = r27
            r9 = r34
            wK.C18357i3.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 10
            float r0 = (float) r0
            float r1 = c2.h.B(r0)
            r2 = 24
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            float r3 = (float) r12
            float r3 = c2.h.B(r3)
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.l(r13, r1, r3, r0, r2)
            tK.v r0 = tK.C18030v.f147664a
            int r2 = tK.C18030v.f147665b
            tK.w r0 = r0.b(r15, r2)
            tK.r r0 = r0.c()
            N1.Y r18 = r0.a()
            r22 = 0
            r23 = 49148(0xbffc, float:6.8871E-41)
            r2 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = 0
            r15 = r0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r0 = r26
            r20 = r34
            defpackage.f.f(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r34.x()
            r34.P()
        L_0x02f7:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0300
            U0.C4895p.R()
        L_0x0300:
            r34.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jF.C14633e.f(nI.a, boolean, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    private static final int i(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void j(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final float k(C4899r0<h> r0Var) {
        return r0Var.getValue().G();
    }

    private static final void l(C4899r0<h> r0Var, float f10) {
        r0Var.setValue(h.m(f10));
    }

    /* access modifiers changed from: private */
    public static final C16807N m(List list, String str, Context context, C17642l lVar, C17642l lVar2, C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        d dVar = d.f127923c;
        c10.h(list.size(), (C17642l<? super Integer, ? extends Object>) null, (p<? super C5993q, ? super Integer, C5979c>) null, new C3155e(dVar, list), c1.c.c(699646206, true, new f(list, str, context, lVar, lVar2)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(List list, C17642l lVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        e(list, lVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final boolean o(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void p(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
