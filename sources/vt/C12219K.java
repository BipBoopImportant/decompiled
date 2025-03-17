package vt;

import Gt.a;
import IC.C13023e;
import It.A;
import It.B;
import It.C10749l;
import It.q;
import KJ.C15985a;
import Op.c1;
import Op.d1;
import QJ.Q;
import SC.H2;
import SC.K0;
import SC.L;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.P;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.platform.C5116k1;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.C5507b;
import m0.C5548j;
import m0.M;
import m0.y0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.J0;
import p1.i1;
import r0.m;
import s0.C5844O;
import t0.C5938c;
import t0.x;
import tK.C18030v;
import tt.C11991a;
import ut.G;
import ut.t0;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0001\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072&\u0010\u0012\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0001\u0010\u0019\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u00072&\u0010\u0012\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u001b\u0010\u001c\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001aS\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b!\u0010\"\u001aC\u0010$\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020#2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b$\u0010%\u001a?\u0010(\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b(\u0010)\u001ak\u0010+\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020*2&\u0010\u0012\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b+\u0010,\u001aS\u0010.\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020-2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b.\u0010/\u001a/\u00101\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u0002002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002¢\u0006\u0004\b1\u00102\u001a)\u00106\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u0002032\f\u00105\u001a\b\u0012\u0004\u0012\u00020\t04H\u0002¢\u0006\u0004\b6\u00107\u001a)\u00109\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u0002082\f\u00105\u001a\b\u0012\u0004\u0012\u00020\t04H\u0002¢\u0006\u0004\b9\u0010:\u001a?\u0010>\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020;2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\t04H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010A\u001a\u00020\u000e*\u00020@H\u0001¢\u0006\u0004\bA\u0010B\"\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006I²\u0006\u0010\u0010H\u001a\u0004\u0018\u00010\u00108\n@\nX\u0002"}, d2 = {"Lt0/x;", "LIt/B$c;", "state", "", "isExpandedWidth", "Lc2/h;", "peekHeight", "Lkotlin/Function1;", "LIt/q;", "LXH/N;", "action", "LIt/l;", "analyticsAction", "Lkotlin/Function2;", "", "LdI/e;", "Lp1/J0;", "", "qrCodeGenerator", "LMt/a;", "onBenefitClicked", "n", "(Lt0/x;LIt/B$c;ZFLnI/l;LnI/l;LnI/p;LnI/l;)V", "s", "(Lt0/x;F)V", "g", "Landroidx/compose/ui/d;", "modifier", "q", "(Lt0/x;Landroidx/compose/ui/d;)V", "LIt/A$f;", "item", "roundedCorners", "r", "(Lt0/x;LIt/A$f;ZZLnI/l;LnI/l;)V", "LIt/A$a;", "f", "(Lt0/x;LIt/A$a;LnI/l;LnI/l;)V", "LIt/A$j;", "storeId", "v", "(Lt0/x;LIt/A$j;Ljava/lang/String;ZLnI/l;)V", "LIt/A$e;", "p", "(Lt0/x;LIt/A$e;LnI/p;LnI/l;LnI/l;)V", "LIt/A$b;", "l", "(Lt0/x;LIt/A$b;Ljava/lang/String;ZLnI/l;LnI/l;)V", "LIt/A$k;", "w", "(Lt0/x;LIt/A$k;LnI/l;)V", "LIt/A$d;", "Lkotlin/Function0;", "onClick", "m", "(Lt0/x;LIt/A$d;LnI/a;)V", "LIt/A$i;", "u", "(Lt0/x;LIt/A$i;LnI/a;)V", "LIt/A$g;", "onLearnMoreClicked", "onDismiss", "t", "(Lt0/x;LIt/A$g;ZLnI/a;LnI/a;)V", "LIt/A;", "o", "(LIt/A;)Ljava/lang/String;", "Lm0/y0;", "", "a", "Lm0/y0;", "AnimationSpec", "barcodeBitmap", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vt.K  reason: case insensitive filesystem */
public final class C12219K {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final y0<Float> f105455a = C5548j.j(300, 0, M.d(), 2, (Object) null);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.a f105456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105457b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105458c;

        a(A.a aVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105456a = aVar;
            this.f105457b = lVar;
            this.f105458c = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C17642l lVar2) {
            lVar.invoke(q.x.f82408a);
            lVar2.invoke(new C10749l.j(C11991a.C2461a.CHANGE_STORE_BUTTON));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r7, U0.C4889m r8, int r9) {
            /*
                r6 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                r7 = r9 & 17
                r0 = 16
                if (r7 != r0) goto L_0x0016
                boolean r7 = r8.l()
                if (r7 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                r8.L()
                goto L_0x007c
            L_0x0016:
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x0025
                r7 = -1
                java.lang.String r0 = "com.ingka.ikea.instore.impl.composables.storeselected.changeStore.<anonymous> (FrontLayerContent.kt:330)"
                r1 = 1327952399(0x4f26f20f, float:2.80088141E9)
                U0.C4895p.S(r1, r9, r7, r0)
            L_0x0025:
                It.A$a r7 = r6.f105456a
                java.util.List r7 = r7.b()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                KJ.f r0 = KJ.C15985a.l(r7)
                androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
                java.lang.String r9 = "store_selected_change_store"
                androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r7, r9)
                r7 = 1677038349(0x63f5930d, float:9.060097E21)
                r8.W(r7)
                nI.l<It.q, XH.N> r7 = r6.f105457b
                boolean r7 = r8.V(r7)
                nI.l<It.l, XH.N> r9 = r6.f105458c
                boolean r9 = r8.V(r9)
                r7 = r7 | r9
                nI.l<It.q, XH.N> r9 = r6.f105457b
                nI.l<It.l, XH.N> r2 = r6.f105458c
                java.lang.Object r3 = r8.D()
                if (r7 != 0) goto L_0x005e
                U0.m$a r7 = U0.C4889m.f14007a
                java.lang.Object r7 = r7.a()
                if (r3 != r7) goto L_0x0066
            L_0x005e:
                vt.J r3 = new vt.J
                r3.<init>(r9, r2)
                r8.u(r3)
            L_0x0066:
                r2 = r3
                nI.a r2 = (nI.C17631a) r2
                r8.P()
                r4 = 48
                r5 = 0
                r3 = r8
                ut.C12096e.g(r0, r1, r2, r3, r4, r5)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x007c
                U0.C4895p.R()
            L_0x007c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12219K.a.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$b */
    static final class b implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B.c f105459a;

        b(B.c cVar) {
            this.f105459a = cVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1100773482, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.content.<anonymous> (FrontLayerContent.kt:252)");
                }
                mVar.W(-838445142);
                androidx.compose.ui.d d10 = C16877v.K0(this.f105459a.d()) instanceof A.a ? androidx.compose.foundation.b.d(androidx.compose.ui.d.f18749a, C18030v.f147664a.a(mVar, C18030v.f147665b).B0(), (i1) null, 2, (Object) null) : androidx.compose.ui.d.f18749a;
                mVar.P();
                C5844O.a(J.i(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), c2.h.B((float) 64)).s(d10), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$c */
    static final class c implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.b f105460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f105461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f105462c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105463d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105464e;

        c(A.b bVar, String str, boolean z10, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105460a = bVar;
            this.f105461b = str;
            this.f105462c = z10;
            this.f105463d = lVar;
            this.f105464e = lVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(161866650, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.contextualCards.<anonymous> (FrontLayerContent.kt:425)");
                }
                C12210B.m(C15985a.l(this.f105460a.c()), this.f105461b, this.f105462c, this.f105463d, this.f105464e, C5116k1.a(androidx.compose.ui.d.f18749a, "store_selected_contextual_cards"), mVar, ImageMetadata.EDGE_MODE, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$d */
    static final class d implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105465a;

        d(C17631a<C16807N> aVar) {
            this.f105465a = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11;
            C5938c cVar2 = cVar;
            C4889m mVar2 = mVar;
            C17542s.j(cVar2, "$this$item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1286746497, i11, -1, "com.ingka.ikea.instore.impl.composables.storeselected.disableStoreModeButton.<anonymous> (FrontLayerContent.kt:501)");
                }
                String b10 = J1.j.b(st.c.f102754b, mVar2, 0);
                N n10 = N.Tertiary;
                L.b(b10, C5116k1.a(D.j(C5938c.b(cVar2, androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), c2.h.B((float) 16), c2.h.B((float) 24)), "store_selected_disable_store_mode"), false, n10, (SC.M) null, false, (Integer) null, (K0) null, (m) null, this.f105465a, mVar, 3072, 500);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$e */
    static final class e implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.e f105466a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, C17164e<? super J0>, Object> f105467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105468c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105469d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.impl.composables.storeselected.FrontLayerContentKt$ikeaFamilyEntry$1$1$1", f = "FrontLayerContent.kt", l = {400}, m = "invokeSuspend")
        /* renamed from: vt.K$e$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f105470c;

            /* renamed from: d  reason: collision with root package name */
            int f105471d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<String, C17164e<? super J0>, Object> f105472e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f105473f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4899r0<J0> f105474g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar, String str, C4899r0<J0> r0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f105472e = pVar;
                this.f105473f = str;
                this.f105474g = r0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f105472e, this.f105473f, this.f105474g, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C4899r0<J0> r0Var;
                Object f10 = C17187b.f();
                int i10 = this.f105471d;
                if (i10 == 0) {
                    y.b(obj);
                    C4899r0<J0> r0Var2 = this.f105474g;
                    p<String, C17164e<? super J0>, Object> pVar = this.f105472e;
                    String str = this.f105473f;
                    this.f105470c = r0Var2;
                    this.f105471d = 1;
                    Object invoke = pVar.invoke(str, this);
                    if (invoke == f10) {
                        return f10;
                    }
                    r0Var = r0Var2;
                    obj = invoke;
                } else if (i10 == 1) {
                    r0Var = (C4899r0) this.f105470c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.e(r0Var, (J0) obj);
                return C16807N.f139792a;
            }
        }

        e(A.e eVar, p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar, C17642l<? super C10749l, C16807N> lVar, C17642l<? super It.q, C16807N> lVar2) {
            this.f105466a = eVar;
            this.f105467b = pVar;
            this.f105468c = lVar;
            this.f105469d = lVar2;
        }

        private static final J0 c(C4899r0<J0> r0Var) {
            return r0Var.getValue();
        }

        /* access modifiers changed from: private */
        public static final void e(C4899r0<J0> r0Var, J0 j02) {
            r0Var.setValue(j02);
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1187898780, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ikeaFamilyEntry.<anonymous> (FrontLayerContent.kt:395)");
                }
                mVar.W(-1258984555);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = u1.e((Object) null, (o1) null, 2, (Object) null);
                    mVar.u(D10);
                }
                C4899r0 r0Var = (C4899r0) D10;
                mVar.P();
                Gt.a b10 = this.f105466a.b();
                a.C1584a aVar2 = b10 instanceof a.C1584a ? (a.C1584a) b10 : null;
                String a10 = aVar2 != null ? aVar2.a() : null;
                mVar.W(-1258979888);
                if (a10 != null) {
                    mVar.W(-1258978131);
                    boolean F10 = mVar.F(this.f105467b) | mVar.V(a10);
                    p<String, C17164e<? super J0>, Object> pVar = this.f105467b;
                    Object D11 = mVar.D();
                    if (F10 || D11 == aVar.a()) {
                        D11 = new a(pVar, a10, r0Var, (C17164e<? super a>) null);
                        mVar.u(D11);
                    }
                    mVar.P();
                    P.g(a10, (p) D11, mVar, 0);
                }
                mVar.P();
                G.h(this.f105466a.b(), this.f105468c, (androidx.compose.ui.d) null, c(r0Var), this.f105469d, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$f */
    static final class f implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f105475a;

        f(androidx.compose.ui.d dVar) {
            this.f105475a = dVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(557888850, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.peekItem.<anonymous> (FrontLayerContent.kt:270)");
                }
                float B10 = c2.h.B((float) 20);
                C5077h.a(androidx.compose.foundation.b.d(m1.e.a(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), A0.g.g(B10, B10, 0.0f, 0.0f, 12, (Object) null)), C18030v.f147664a.a(mVar, C18030v.f147665b).k0(), (i1) null, 2, (Object) null).s(this.f105475a), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$g */
    static final class g implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f105476a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A.f f105477b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f105478c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105479d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C10749l, C16807N> f105480e;

        g(boolean z10, A.f fVar, boolean z11, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
            this.f105476a = z10;
            this.f105477b = fVar;
            this.f105478c = z11;
            this.f105479d = lVar;
            this.f105480e = lVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, String str) {
            lVar.invoke(new q.y(str));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r15, U0.C4889m r16, int r17) {
            /*
                r14 = this;
                r0 = r14
                r6 = r16
                r1 = r17
                java.lang.String r2 = "$this$item"
                r3 = r15
                kotlin.jvm.internal.C17542s.j(r15, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001d
                boolean r2 = r16.l()
                if (r2 != 0) goto L_0x0018
                goto L_0x001d
            L_0x0018:
                r16.L()
                goto L_0x00bc
            L_0x001d:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002c
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.instore.impl.composables.storeselected.shoppingList.<anonymous> (FrontLayerContent.kt:297)"
                r4 = 285246484(0x11008414, float:1.0138119E-28)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002c:
                tK.d r1 = tK.C18013d.f147437a
                A0.f r2 = r1.f()
                boolean r3 = r0.f105476a
                r4 = 1
                r5 = 0
                if (r3 != r4) goto L_0x0057
                A0.f r1 = new A0.f
                A0.b r3 = r2.i()
                A0.b r2 = r2.h()
                float r4 = (float) r5
                float r7 = c2.h.B(r4)
                A0.b r7 = A0.c.b(r7)
                float r4 = c2.h.B(r4)
                A0.b r4 = A0.c.b(r4)
                r1.<init>(r3, r2, r7, r4)
                goto L_0x005d
            L_0x0057:
                if (r3 != 0) goto L_0x00bd
                p1.i1 r1 = r1.d()
            L_0x005d:
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                java.lang.String r3 = "store_selected_shopping_list"
                androidx.compose.ui.d r2 = androidx.compose.ui.platform.C5116k1.a(r2, r3)
                androidx.compose.ui.d r7 = m1.e.a(r2, r1)
                float r1 = (float) r5
                float r11 = c2.h.B(r1)
                r12 = 7
                r13 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
                It.A$f r1 = r0.f105477b
                vB.b r1 = r1.b()
                boolean r2 = r0.f105478c
                r3 = -473978321(0xffffffffe3bfaa2f, float:-7.071182E21)
                r6.W(r3)
                nI.l<It.q, XH.N> r3 = r0.f105479d
                boolean r3 = r6.V(r3)
                nI.l<It.q, XH.N> r5 = r0.f105479d
                java.lang.Object r7 = r16.D()
                if (r3 != 0) goto L_0x009b
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r7 != r3) goto L_0x00a3
            L_0x009b:
                vt.L r7 = new vt.L
                r7.<init>(r5)
                r6.u(r7)
            L_0x00a3:
                r3 = r7
                nI.l r3 = (nI.C17642l) r3
                r16.P()
                nI.l<It.l, XH.N> r5 = r0.f105480e
                int r7 = vB.C15129b.f131420c
                r8 = 0
                r6 = r16
                ut.C12105i0.e(r1, r2, r3, r4, r5, r6, r7, r8)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00bc
                U0.C4895p.R()
            L_0x00bc:
                return
            L_0x00bd:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12219K.g.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$h */
    static final class h implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A0.f f105481a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vt.K$h$a */
        static final class a implements nI.q<C5938c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A0.f f105482a;

            a(A0.f fVar) {
                this.f105482a = fVar;
            }

            public final void a(C5938c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$item");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-428199086, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.skeletonLoading.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FrontLayerContent.kt:119)");
                    }
                    H2.b(m1.e.a(J.v(androidx.compose.ui.d.f18749a, c2.h.B((float) 152), c2.h.B((float) 128)), this.f105482a), true, mVar, 48, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        h(A0.f fVar) {
            this.f105481a = fVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(A0.f fVar, x xVar) {
            C17542s.j(xVar, "$this$LazyRow");
            for (int i10 = 0; i10 < 4; i10++) {
                x.i(xVar, (Object) null, (Object) null, c1.c.c(-428199086, true, new a(fVar)), 3, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r21, U0.C4889m r22, int r23) {
            /*
                r20 = this;
                r12 = r22
                r0 = r23
                java.lang.String r1 = "$this$item"
                r2 = r21
                kotlin.jvm.internal.C17542s.j(r2, r1)
                r1 = r0 & 17
                r2 = 16
                if (r1 != r2) goto L_0x001f
                boolean r1 = r22.l()
                if (r1 != 0) goto L_0x0018
                goto L_0x001f
            L_0x0018:
                r22.L()
                r14 = r20
                goto L_0x0195
            L_0x001f:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x002e
                r1 = -1
                java.lang.String r3 = "com.ingka.ikea.instore.impl.composables.storeselected.skeletonLoading.<anonymous> (FrontLayerContent.kt:100)"
                r4 = 2135939788(0x7f4fdacc, float:2.7628625E38)
                U0.C4895p.S(r4, r0, r1, r3)
            L_0x002e:
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                androidx.compose.ui.d r0 = TC.e.i(r13)
                java.lang.String r1 = "store_selected_skeleton_loading"
                androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r1)
                r14 = r20
                A0.f r15 = r14.f105481a
                androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r3 = r1.g()
                i1.c$a r4 = i1.C5437c.f24302a
                i1.c$b r4 = r4.k()
                r11 = 0
                E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r12, r11)
                int r4 = U0.C4883j.a(r12, r11)
                U0.y r5 = r22.s()
                androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r12, r0)
                G1.g$a r6 = G1.C4504g.f6515W
                nI.a r7 = r6.a()
                U0.f r8 = r22.m()
                if (r8 != 0) goto L_0x006a
                U0.C4883j.c()
            L_0x006a:
                r22.I()
                boolean r8 = r22.i()
                if (r8 == 0) goto L_0x0077
                r12.p(r7)
                goto L_0x007a
            L_0x0077:
                r22.t()
            L_0x007a:
                U0.m r7 = U0.F1.a(r22)
                nI.p r8 = r6.c()
                U0.F1.c(r7, r3, r8)
                nI.p r3 = r6.e()
                U0.F1.c(r7, r5, r3)
                nI.p r3 = r6.b()
                boolean r5 = r7.i()
                if (r5 != 0) goto L_0x00a4
                java.lang.Object r5 = r7.D()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
                if (r5 != 0) goto L_0x00b2
            L_0x00a4:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r7.u(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7.w(r4, r3)
            L_0x00b2:
                nI.p r3 = r6.d()
                U0.F1.c(r7, r0, r3)
                s0.h r0 = s0.C5862h.f28810a
                r4 = 1058642330(0x3f19999a, float:0.6)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.g(r13, r4)
                r3 = 32
                float r3 = (float) r3
                float r5 = c2.h.B(r3)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r5)
                androidx.compose.ui.d r0 = m1.e.a(r0, r15)
                r10 = 1
                r9 = 48
                SC.H2.b(r0, r10, r12, r9, r11)
                r0 = 24
                float r0 = (float) r0
                float r7 = c2.h.B(r0)
                r16 = 13
                r17 = 0
                r6 = 0
                r8 = 0
                r18 = 0
                r5 = r13
                r9 = r18
                r10 = r16
                r11 = r17
                androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                androidx.compose.foundation.layout.d$f r6 = r1.n(r2)
                r1 = 467239916(0x1bd983ec, float:3.598489E-22)
                r12.W(r1)
                boolean r1 = r12.V(r15)
                java.lang.Object r2 = r22.D()
                if (r1 != 0) goto L_0x0112
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x011a
            L_0x0112:
                vt.M r2 = new vt.M
                r2.<init>(r15)
                r12.u(r2)
            L_0x011a:
                r8 = r2
                nI.l r8 = (nI.C17642l) r8
                r22.P()
                r10 = 24582(0x6006, float:3.4447E-41)
                r11 = 238(0xee, float:3.34E-43)
                r1 = 0
                r2 = 0
                r7 = 0
                r9 = 0
                r16 = 0
                r17 = 0
                r18 = r0
                r0 = r5
                r19 = r3
                r3 = r7
                r7 = r4
                r4 = r6
                r5 = r9
                r6 = r16
                r9 = r7
                r7 = r17
                r9 = r22
                t0.C5937b.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0 = 64
                float r0 = (float) r0
                float r7 = c2.h.B(r0)
                r10 = 13
                r11 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r5 = r13
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
                r1 = 1058642330(0x3f19999a, float:0.6)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.g(r0, r1)
                float r1 = c2.h.B(r19)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r1)
                androidx.compose.ui.d r0 = m1.e.a(r0, r15)
                r1 = 0
                r2 = 1
                r3 = 48
                SC.H2.b(r0, r2, r12, r3, r1)
                float r7 = c2.h.B(r18)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r5, r6, r7, r8, r9, r10, r11)
                r3 = 0
                r4 = 0
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r3, r2, r4)
                r3 = 200(0xc8, float:2.8E-43)
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r3)
                r3 = 54
                SC.H2.b(r0, r2, r12, r3, r1)
                r22.x()
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0195
                U0.C4895p.R()
            L_0x0195:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12219K.h.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$i */
    static final class i implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.g f105483a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105484b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105485c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105486d;

        i(A.g gVar, boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            this.f105483a = gVar;
            this.f105484b = z10;
            this.f105485c = aVar;
            this.f105486d = aVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(639984391, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.smallStore.<anonymous> (FrontLayerContent.kt:539)");
                }
                t0.b(this.f105483a.b(), this.f105484b, this.f105485c, androidx.compose.ui.d.f18749a, this.f105486d, mVar, C13023e.f110931a | 3072, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$j */
    static final class j implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.i f105487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105488b;

        j(A.i iVar, C17631a<C16807N> aVar) {
            this.f105487a = iVar;
            this.f105488b = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-21686353, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.storeBenefit.<anonymous> (FrontLayerContent.kt:521)");
                }
                Kt.i.l(this.f105487a.b(), J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), this.f105488b, mVar, 48, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$k */
    static final class k implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.j f105489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f105492d;

        k(A.j jVar, boolean z10, C17642l<? super It.q, C16807N> lVar, String str) {
            this.f105489a = jVar;
            this.f105490b = z10;
            this.f105491c = lVar;
            this.f105492d = str;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, String str, Xt.a aVar) {
            C17542s.j(aVar, "event");
            lVar.invoke(new q.n(aVar.e(), str));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, String str, boolean z10) {
            lVar.invoke(new q.C10753a(str, z10 ? C10749l.h.a.SECTION_HEADER : C10749l.h.a.LAST_CARD));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(t0.C5938c r9, U0.C4889m r10, int r11) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                r9 = r11 & 17
                r0 = 16
                if (r9 != r0) goto L_0x0017
                boolean r9 = r10.l()
                if (r9 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r10.L()
                goto L_0x00be
            L_0x0017:
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0026
                r9 = -1
                java.lang.String r0 = "com.ingka.ikea.instore.impl.composables.storeselected.storeEvents.<anonymous> (FrontLayerContent.kt:358)"
                r1 = 1695075671(0x6508cd57, float:4.0376856E22)
                U0.C4895p.S(r1, r11, r9, r0)
            L_0x0026:
                It.A$j r9 = r8.f105489a
                Xt.b r0 = r9.b()
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r9 = 34
                float r9 = (float) r9
                float r5 = c2.h.B(r9)
                r6 = 7
                r7 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.m(r1, r2, r3, r4, r5, r6, r7)
                java.lang.String r11 = "store_selected_store_events"
                androidx.compose.ui.d r4 = androidx.compose.ui.platform.C5116k1.a(r9, r11)
                boolean r1 = r8.f105490b
                r9 = -2002326002(0xffffffff88a6ee0e, float:-1.0046728E-33)
                r10.W(r9)
                nI.l<It.q, XH.N> r9 = r8.f105491c
                boolean r9 = r10.V(r9)
                java.lang.String r11 = r8.f105492d
                boolean r11 = r10.V(r11)
                r9 = r9 | r11
                nI.l<It.q, XH.N> r11 = r8.f105491c
                java.lang.String r2 = r8.f105492d
                java.lang.Object r3 = r10.D()
                if (r9 != 0) goto L_0x006b
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r3 != r9) goto L_0x0073
            L_0x006b:
                vt.N r3 = new vt.N
                r3.<init>(r11, r2)
                r10.u(r3)
            L_0x0073:
                r2 = r3
                nI.l r2 = (nI.C17642l) r2
                r10.P()
                r9 = -2002317605(0xffffffff88a70edb, float:-1.0054439E-33)
                r10.W(r9)
                nI.l<It.q, XH.N> r9 = r8.f105491c
                boolean r9 = r10.V(r9)
                java.lang.String r11 = r8.f105492d
                boolean r11 = r10.V(r11)
                r9 = r9 | r11
                nI.l<It.q, XH.N> r11 = r8.f105491c
                java.lang.String r3 = r8.f105492d
                java.lang.Object r5 = r10.D()
                if (r9 != 0) goto L_0x009e
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r5 != r9) goto L_0x00a6
            L_0x009e:
                vt.O r5 = new vt.O
                r5.<init>(r11, r3)
                r10.u(r5)
            L_0x00a6:
                r3 = r5
                nI.l r3 = (nI.C17642l) r3
                r10.P()
                int r9 = IC.C13023e.f110931a
                r6 = r9 | 24576(0x6000, float:3.4438E-41)
                r7 = 0
                r5 = r10
                Qt.u.c(r0, r1, r2, r3, r4, r5, r6, r7)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x00be
                U0.C4895p.R()
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vt.C12219K.k.c(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vt.K$l */
    static final class l implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A.k f105493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<It.q, C16807N> f105494b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: vt.K$l$a */
        static final class a implements r<C5507b, Boolean, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ A.k f105495a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<It.q, C16807N> f105496b;

            a(A.k kVar, C17642l<? super It.q, C16807N> lVar) {
                this.f105495a = kVar;
                this.f105496b = lVar;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(C17642l lVar) {
                lVar.invoke(q.C1616q.f82397a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(C17642l lVar, c1 c1Var) {
                C17542s.j(c1Var, "it");
                lVar.invoke(new q.o(c1Var));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N i(C17642l lVar, A.k kVar, List list) {
                C17542s.j(list, "it");
                Iterable<d1> c10 = kVar.c();
                ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
                for (d1 p10 : c10) {
                    arrayList.add(p10.p().f());
                }
                lVar.invoke(new q.F(C15985a.h(arrayList)));
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void e(l0.C5507b r16, boolean r17, U0.C4889m r18, int r19) {
                /*
                    r15 = this;
                    r0 = r15
                    r14 = r18
                    java.lang.String r1 = "$this$AnimatedContent"
                    r2 = r16
                    kotlin.jvm.internal.C17542s.j(r2, r1)
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x001b
                    r1 = -1
                    java.lang.String r2 = "com.ingka.ikea.instore.impl.composables.storeselected.storeOffers.<anonymous>.<anonymous> (FrontLayerContent.kt:451)"
                    r3 = -1681669109(0xffffffff9bc3c40b, float:-3.2386734E-22)
                    r4 = r19
                    U0.C4895p.S(r3, r4, r1, r2)
                L_0x001b:
                    r1 = 1
                    r2 = r17
                    if (r2 != r1) goto L_0x0035
                    r1 = 471098715(0x1c14655b, float:4.910009E-22)
                    r14.W(r1)
                    r5 = 6
                    r6 = 6
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    r4 = r18
                    Op.P.e(r1, r2, r3, r4, r5, r6)
                    r18.P()
                    goto L_0x00f3
                L_0x0035:
                    r1 = 471310662(0x1c17a146, float:5.017015E-22)
                    r14.W(r1)
                    It.A$k r1 = r0.f105495a
                    java.util.List r1 = r1.c()
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    KJ.f r1 = KJ.C15985a.l(r1)
                    int r2 = st.c.f102822x1
                    r3 = 0
                    java.lang.String r2 = J1.j.b(r2, r14, r3)
                    androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
                    java.lang.String r4 = "store_selected_store_offers"
                    androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
                    r3 = 12
                    float r3 = (float) r3
                    float r10 = c2.h.B(r3)
                    r3 = -1785902175(0xffffffff958d4ba1, float:-5.706877E-26)
                    r14.W(r3)
                    nI.l<It.q, XH.N> r3 = r0.f105496b
                    boolean r3 = r14.V(r3)
                    nI.l<It.q, XH.N> r4 = r0.f105496b
                    java.lang.Object r5 = r18.D()
                    if (r3 != 0) goto L_0x0079
                    U0.m$a r3 = U0.C4889m.f14007a
                    java.lang.Object r3 = r3.a()
                    if (r5 != r3) goto L_0x0081
                L_0x0079:
                    vt.Q r5 = new vt.Q
                    r5.<init>(r4)
                    r14.u(r5)
                L_0x0081:
                    r3 = r5
                    nI.a r3 = (nI.C17631a) r3
                    r18.P()
                    r4 = -1785896963(0xffffffff958d5ffd, float:-5.710089E-26)
                    r14.W(r4)
                    nI.l<It.q, XH.N> r4 = r0.f105496b
                    boolean r4 = r14.V(r4)
                    nI.l<It.q, XH.N> r5 = r0.f105496b
                    java.lang.Object r6 = r18.D()
                    if (r4 != 0) goto L_0x00a3
                    U0.m$a r4 = U0.C4889m.f14007a
                    java.lang.Object r4 = r4.a()
                    if (r6 != r4) goto L_0x00ab
                L_0x00a3:
                    vt.S r6 = new vt.S
                    r6.<init>(r5)
                    r14.u(r6)
                L_0x00ab:
                    r4 = r6
                    nI.l r4 = (nI.C17642l) r4
                    r18.P()
                    r5 = -1785884354(0xffffffff958d913e, float:-5.71786E-26)
                    r14.W(r5)
                    nI.l<It.q, XH.N> r5 = r0.f105496b
                    boolean r5 = r14.V(r5)
                    It.A$k r6 = r0.f105495a
                    boolean r6 = r14.F(r6)
                    r5 = r5 | r6
                    nI.l<It.q, XH.N> r6 = r0.f105496b
                    It.A$k r8 = r0.f105495a
                    java.lang.Object r9 = r18.D()
                    if (r5 != 0) goto L_0x00d6
                    U0.m$a r5 = U0.C4889m.f14007a
                    java.lang.Object r5 = r5.a()
                    if (r9 != r5) goto L_0x00de
                L_0x00d6:
                    vt.T r9 = new vt.T
                    r9.<init>(r6, r8)
                    r14.u(r9)
                L_0x00de:
                    r5 = r9
                    nI.l r5 = (nI.C17642l) r5
                    r18.P()
                    r12 = 807075840(0x301b0000, float:5.638867E-10)
                    r13 = 384(0x180, float:5.38E-43)
                    r6 = 1
                    r8 = 0
                    r9 = 0
                    r11 = r18
                    Op.P.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                    r18.P()
                L_0x00f3:
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x00fc
                    U0.C4895p.R()
                L_0x00fc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: vt.C12219K.l.a.e(l0.b, boolean, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
                e((C5507b) obj, ((Boolean) obj2).booleanValue(), (C4889m) obj3, ((Number) obj4).intValue());
                return C16807N.f139792a;
            }
        }

        l(A.k kVar, C17642l<? super It.q, C16807N> lVar) {
            this.f105493a = kVar;
            this.f105494b = lVar;
        }

        /* access modifiers changed from: private */
        public static final l0.i c(androidx.compose.animation.d dVar) {
            C17542s.j(dVar, "$this$AnimatedContent");
            return androidx.compose.animation.a.e(androidx.compose.animation.g.o(C12219K.f105455a, 0.0f, 2, (Object) null), androidx.compose.animation.g.q(C12219K.f105455a, 0.0f, 2, (Object) null));
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-371760466, i10, -1, "com.ingka.ikea.instore.impl.composables.storeselected.storeOffers.<anonymous> (FrontLayerContent.kt:446)");
                }
                Boolean valueOf = Boolean.valueOf(this.f105493a.b());
                mVar.W(-439755829);
                Object D10 = mVar.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C12224P();
                    mVar.u(D10);
                }
                mVar.P();
                androidx.compose.animation.a.a(valueOf, (androidx.compose.ui.d) null, (C17642l) D10, (C5437c) null, "store offers loading transition", (C17642l) null, c1.c.e(-1681669109, true, new a(this.f105493a, this.f105494b), mVar, 54), mVar, 1597824, 42);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void f(x xVar, A.a aVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
        xVar.b(o(aVar), o(aVar), c1.c.c(1327952399, true, new a(aVar, lVar, lVar2)));
    }

    private static final void g(x xVar, B.c cVar, boolean z10, float f10, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar, C17642l<? super Mt.a, C16807N> lVar3) {
        x xVar2 = xVar;
        B.c cVar2 = cVar;
        boolean z11 = z10;
        C17642l<? super It.q, C16807N> lVar4 = lVar;
        C17642l<? super C10749l, C16807N> lVar5 = lVar2;
        boolean z12 = C16877v.y0(cVar.d()) instanceof A.f;
        if (!z12) {
            q(xVar, J.i(androidx.compose.ui.d.f18749a, f10));
        }
        for (A a10 : cVar.d()) {
            if (a10 instanceof A.f) {
                r(xVar, (A.f) a10, z10, z12, lVar, lVar2);
            } else if (a10 instanceof A.a) {
                f(xVar, (A.a) a10, lVar4, lVar5);
            } else if (a10 instanceof A.j) {
                v(xVar, (A.j) a10, cVar.k(), z11, lVar4);
            } else {
                if (a10 instanceof A.e) {
                    p(xVar, (A.e) a10, pVar, lVar4, lVar5);
                } else {
                    p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar2 = pVar;
                    if (a10 instanceof A.b) {
                        l(xVar, (A.b) a10, cVar.k(), z10, lVar, lVar2);
                    } else if (a10 instanceof A.k) {
                        w(xVar, (A.k) a10, lVar4);
                    } else if (a10 instanceof A.d) {
                        m(xVar, (A.d) a10, new C12214F(lVar4));
                    } else if (a10 instanceof A.i) {
                        u(xVar, (A.i) a10, new C12215G(lVar3, a10));
                    } else {
                        C17642l<? super Mt.a, C16807N> lVar6 = lVar3;
                        if (a10 instanceof A.g) {
                            t(xVar, (A.g) a10, z11, new C12216H(lVar4, cVar), new C12217I(lVar4, cVar));
                        } else {
                            throw new t();
                        }
                    }
                }
                C17642l<? super Mt.a, C16807N> lVar7 = lVar3;
            }
            p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar3 = pVar;
            C17642l<? super Mt.a, C16807N> lVar72 = lVar3;
        }
        x.i(xVar, (Object) null, (Object) null, c1.c.c(-1100773482, true, new b(cVar)), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar) {
        lVar.invoke(q.C10758f.f82384a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C17642l lVar, A a10) {
        lVar.invoke(((A.i) a10).b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, B.c cVar) {
        lVar.invoke(new q.A(cVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, B.c cVar) {
        lVar.invoke(new q.B(cVar.k()));
        return C16807N.f139792a;
    }

    private static final void l(x xVar, A.b bVar, String str, boolean z10, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
        if (!bVar.c().isEmpty()) {
            xVar.b(o(bVar), o(bVar), c1.c.c(161866650, true, new c(bVar, str, z10, lVar, lVar2)));
        }
    }

    private static final void m(x xVar, A.d dVar, C17631a<C16807N> aVar) {
        xVar.b(o(dVar), o(dVar), c1.c.c(1286746497, true, new d(aVar)));
    }

    public static final void n(x xVar, B.c cVar, boolean z10, float f10, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2, p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar, C17642l<? super Mt.a, C16807N> lVar3) {
        C17542s.j(xVar, "$this$frontLayerContent");
        C17542s.j(cVar, "state");
        C17542s.j(lVar, "action");
        C17542s.j(lVar2, "analyticsAction");
        C17542s.j(pVar, "qrCodeGenerator");
        C17542s.j(lVar3, "onBenefitClicked");
        boolean l10 = cVar.l();
        if (l10) {
            s(xVar, f10);
        } else if (!l10) {
            g(xVar, cVar, z10, f10, lVar, lVar2, pVar, lVar3);
        } else {
            throw new t();
        }
    }

    public static final String o(A a10) {
        C17542s.j(a10, "<this>");
        if (a10 instanceof A.f) {
            return "ShoppingList";
        }
        if (a10 instanceof A.a) {
            return "ChangeStore";
        }
        if (a10 instanceof A.j) {
            return "StoreEvents";
        }
        if (a10 instanceof A.e) {
            return "FamilyEntry";
        }
        if (a10 instanceof A.b) {
            return "StoreReminders";
        }
        if (a10 instanceof A.k) {
            return "StoreOffers";
        }
        if (a10 instanceof A.d) {
            return "DisableStoreMode";
        }
        if (a10 instanceof A.i) {
            return "StoreBenefit";
        }
        if (a10 instanceof A.g) {
            return "SmallStore";
        }
        throw new t();
    }

    private static final void p(x xVar, A.e eVar, p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
        xVar.b(o(eVar), o(eVar), c1.c.c(-1187898780, true, new e(eVar, pVar, lVar2, lVar)));
    }

    private static final void q(x xVar, androidx.compose.ui.d dVar) {
        x.i(xVar, (Object) null, (Object) null, c1.c.c(557888850, true, new f(dVar)), 3, (Object) null);
    }

    private static final void r(x xVar, A.f fVar, boolean z10, boolean z11, C17642l<? super It.q, C16807N> lVar, C17642l<? super C10749l, C16807N> lVar2) {
        xVar.b(o(fVar), o(fVar), c1.c.c(285246484, true, new g(z11, fVar, z10, lVar, lVar2)));
    }

    private static final void s(x xVar, float f10) {
        q(xVar, J.i(androidx.compose.ui.d.f18749a, f10));
        x.i(xVar, (Object) null, (Object) null, c1.c.c(2135939788, true, new h(A0.g.e(c2.h.B((float) 4)))), 3, (Object) null);
    }

    private static final void t(x xVar, A.g gVar, boolean z10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        xVar.b(o(gVar), o(gVar), c1.c.c(639984391, true, new i(gVar, z10, aVar, aVar2)));
    }

    private static final void u(x xVar, A.i iVar, C17631a<C16807N> aVar) {
        xVar.b(o(iVar), o(iVar), c1.c.c(-21686353, true, new j(iVar, aVar)));
    }

    private static final void v(x xVar, A.j jVar, String str, boolean z10, C17642l<? super It.q, C16807N> lVar) {
        if (!jVar.b().a().isEmpty()) {
            xVar.b(o(jVar), o(jVar), c1.c.c(1695075671, true, new k(jVar, z10, lVar, str)));
        }
    }

    private static final void w(x xVar, A.k kVar, C17642l<? super It.q, C16807N> lVar) {
        if (kVar.b() || !kVar.c().isEmpty()) {
            xVar.b(o(kVar), o(kVar), c1.c.c(-371760466, true, new l(kVar, lVar)));
        }
    }
}
