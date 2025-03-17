package com.ingka.ikea.discover.impl.ui;

import Ae.k;
import Fs.a;
import HJ.C15854t;
import Op.c1;
import PA.C13331a;
import QA.C13352d;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import Us.a;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import Yp.C11034y;
import Yp.C11035z;
import Yp.F;
import ZC.C13892o;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.android.fragments.j;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.discover.impl.ui.i;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kp.C11519a;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import on.C11687b;
import ov.C11718a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qw.l;
import rq.C11841a;
import rx.C15004a;
import rx.C15005b;
import sB.C15035a;
import ww.C15192a;
import x3.r;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import ye.C10473a;
import ze.C10493a;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010R\u001a\u00020L8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0007\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010z\u001a\u00020s8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR%\u0010\u0001\u001a\u00020{8\u0000@\u0000X.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0017\n\u0005\b\u0017\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0017\n\u0005\b^\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0017\n\u0005\b'\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010¤\u0001\u001a\u00030 \u00018\u0016XD¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b¡\u0001\u0010£\u0001R\u001c\u0010¦\u0001\u001a\u00020\n8\u0014XD¢\u0006\r\n\u0004\bn\u0010\u001d\u001a\u0005\b¥\u0001\u0010\fR\u001d\u0010¨\u0001\u001a\u00020\n8\u0014XD¢\u0006\u000e\n\u0005\b\u0001\u0010\u001d\u001a\u0005\b§\u0001\u0010\fR\u001c\u0010ª\u0001\u001a\u00020\n8\u0014XD¢\u0006\r\n\u0004\b\u001f\u0010\u001d\u001a\u0005\b©\u0001\u0010\fR \u0010¯\u0001\u001a\u00030«\u00018BX\u0002¢\u0006\u000f\n\u0005\b?\u0010¬\u0001\u001a\u0006\b­\u0001\u0010®\u0001R\u0017\u0010°\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010\u001dR$\u0010´\u0001\u001a\u0010\u0012\u0005\u0012\u00030²\u0001\u0012\u0004\u0012\u00020\u00060±\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bv\u0010³\u0001R$\u0010¶\u0001\u001a\u0010\u0012\u0005\u0012\u00030µ\u0001\u0012\u0004\u0012\u00020\u00060±\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bN\u0010³\u0001¨\u0006·\u0001"}, d2 = {"Lcom/ingka/ikea/discover/impl/ui/DiscoverFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "Lcom/ingka/ikea/core/android/fragments/j;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "l0", "", "Y", "()Z", "LXp/c;", "X", "LXp/c;", "W0", "()LXp/c;", "setNavigationContract", "(LXp/c;)V", "navigationContract", "Lye/a;", "Lye/a;", "L0", "()Lye/a;", "setAlertMessageNavigation", "(Lye/a;)V", "alertMessageNavigation", "LFs/a;", "Z", "LFs/a;", "R0", "()LFs/a;", "setInboxNavigation", "(LFs/a;)V", "inboxNavigation", "LIo/a;", "y0", "LIo/a;", "N0", "()LIo/a;", "setCommercialContentNavigation", "(LIo/a;)V", "commercialContentNavigation", "LPA/a;", "z0", "LPA/a;", "b1", "()LPA/a;", "setShoppableImageNavigation", "(LPA/a;)V", "shoppableImageNavigation", "LQA/d;", "A0", "LQA/d;", "c1", "()LQA/d;", "setShoppingListNavigation", "(LQA/d;)V", "shoppingListNavigation", "LUs/a;", "B0", "LUs/a;", "S0", "()LUs/a;", "setInspireNavigation", "(LUs/a;)V", "inspireNavigation", "LDr/a;", "C0", "LDr/a;", "T0", "()LDr/a;", "setKreativComposable", "(LDr/a;)V", "kreativComposable", "Lov/a;", "Lov/a;", "V0", "()Lov/a;", "setLiveShoppingEntryPointSection", "(Lov/a;)V", "liveShoppingEntryPointSection", "Lon/b;", "E0", "Lon/b;", "Z0", "()Lon/b;", "setPlpNavigation", "(Lon/b;)V", "plpNavigation", "LEo/a;", "F0", "LEo/a;", "M0", "()LEo/a;", "setChromeTabsApi", "(LEo/a;)V", "chromeTabsApi", "Lze/a;", "G0", "Lze/a;", "getAlertMessageMenuProvider", "()Lze/a;", "setAlertMessageMenuProvider", "(Lze/a;)V", "alertMessageMenuProvider", "Liq/a;", "H0", "Liq/a;", "P0", "()Liq/a;", "setEnergyLabelNavigation", "(Liq/a;)V", "energyLabelNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "I0", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "U0", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "LZw/a;", "J0", "LZw/a;", "Y0", "()LZw/a;", "setPipNavigation$discover_implementation_release", "(LZw/a;)V", "pipNavigation", "Lrx/b;", "K0", "Lrx/b;", "a1", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "Lww/a;", "Lww/a;", "X0", "()Lww/a;", "setOfferHubNavigation", "(Lww/a;)V", "offerHubNavigation", "Lrq/a;", "Lrq/a;", "Q0", "()Lrq/a;", "setEnlargeImagesNavigation", "(Lrq/a;)V", "enlargeImagesNavigation", "Lx3/r;", "Lx3/r;", "d1", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "", "O0", "Ljava/lang/String;", "()Ljava/lang/String;", "destId", "v0", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "LZp/a;", "LXH/o;", "e1", "()LZp/a;", "viewModel", "isScrolledToTop", "Lkotlin/Function1;", "Lcom/ingka/ikea/discover/impl/ui/i;", "LnI/l;", "handleUiEvents", "LOp/c1;", "handleItemEvents", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiscoverFragment extends d implements j {

    /* renamed from: A0  reason: collision with root package name */
    public C13352d f95568A0;

    /* renamed from: B0  reason: collision with root package name */
    public Us.a f95569B0;

    /* renamed from: C0  reason: collision with root package name */
    public Dr.a f95570C0;

    /* renamed from: D0  reason: collision with root package name */
    public C11718a f95571D0;

    /* renamed from: E0  reason: collision with root package name */
    public C11687b f95572E0;

    /* renamed from: F0  reason: collision with root package name */
    public Eo.a f95573F0;

    /* renamed from: G0  reason: collision with root package name */
    public C10493a f95574G0;

    /* renamed from: H0  reason: collision with root package name */
    public C11411a f95575H0;

    /* renamed from: I0  reason: collision with root package name */
    public ListPickerNavigation f95576I0;

    /* renamed from: J0  reason: collision with root package name */
    public Zw.a f95577J0;

    /* renamed from: K0  reason: collision with root package name */
    public C15005b f95578K0;

    /* renamed from: L0  reason: collision with root package name */
    public C15192a f95579L0;

    /* renamed from: M0  reason: collision with root package name */
    public C11841a f95580M0;

    /* renamed from: N0  reason: collision with root package name */
    public r f95581N0;

    /* renamed from: O0  reason: collision with root package name */
    private final String f95582O0 = "discover/screen";

    /* renamed from: P0  reason: collision with root package name */
    private final boolean f95583P0;

    /* renamed from: Q0  reason: collision with root package name */
    private final boolean f95584Q0;

    /* renamed from: R0  reason: collision with root package name */
    private final boolean f95585R0;

    /* renamed from: S0  reason: collision with root package name */
    private final C16824o f95586S0;

    /* renamed from: T0  reason: collision with root package name */
    private boolean f95587T0;
    /* access modifiers changed from: private */

    /* renamed from: U0  reason: collision with root package name */
    public final C17642l<i, C16807N> f95588U0;
    /* access modifiers changed from: private */

    /* renamed from: V0  reason: collision with root package name */
    public final C17642l<c1, C16807N> f95589V0;

    /* renamed from: X  reason: collision with root package name */
    public Xp.c f95590X;

    /* renamed from: Y  reason: collision with root package name */
    public C10473a f95591Y;

    /* renamed from: Z  reason: collision with root package name */
    public Fs.a f95592Z;

    /* renamed from: y0  reason: collision with root package name */
    public Io.a f95593y0;

    /* renamed from: z0  reason: collision with root package name */
    public C13331a f95594z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DiscoverFragment f95595a;

        a(DiscoverFragment discoverFragment) {
            this.f95595a = discoverFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(DiscoverFragment discoverFragment, ListPickerNavigation.b bVar) {
            C17542s.j(bVar, "result");
            if (bVar instanceof ListPickerNavigation.b.d) {
                ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
                ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
                String b10 = cVar != null ? cVar.b() : null;
                if (b10 == null) {
                    b10 = "";
                }
                discoverFragment.e1().H(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10));
            }
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(934519621, i10, -1, "com.ingka.ikea.discover.impl.ui.DiscoverFragment.FragmentContent.<anonymous> (DiscoverFragment.kt:133)");
                }
                a.I(this.f95595a.e1(), new F(this.f95595a.T0(), this.f95595a.V0()), this.f95595a.f95588U0, this.f95595a.f95589V0, mVar, 0);
                C5187o oVar = (C5187o) mVar.Q(Vo.b.c());
                mVar.W(-1751445772);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = androidx.navigation.fragment.a.a(oVar).H();
                    C17542s.g(D10);
                    mVar.u(D10);
                }
                C8948l lVar = (C8948l) D10;
                mVar.P();
                mVar.W(-1751436026);
                boolean F10 = mVar.F(this.f95595a);
                DiscoverFragment discoverFragment = this.f95595a;
                Object D11 = mVar.D();
                if (F10 || D11 == aVar.a()) {
                    D11 = new c(discoverFragment);
                    mVar.u(D11);
                }
                mVar.P();
                l.c(lVar, "ChooseListBottomSheet.RequestKey", (C17642l) D11, mVar, 48);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f95596a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kp.i$a[] r0 = kp.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kp.i$a r1 = kp.i.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kp.i$a r1 = kp.i.a.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kp.i$a r1 = kp.i.a.USER_CONTENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kp.i$a r1 = kp.i.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f95596a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.ui.DiscoverFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95597c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f95597c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95597c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95598c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f95598c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95598c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95599c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f95599c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95599c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95600c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95600c = aVar;
            this.f95601d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95600c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95601d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95602c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95602c = oVar;
            this.f95603d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95603d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95602c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DiscoverFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f95586S0 = W.b(this, P.b(Zp.a.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        this.f95587T0 = true;
        this.f95588U0 = new C11034y(this);
        this.f95589V0 = new C11035z(this);
    }

    /* access modifiers changed from: private */
    public final Zp.a e1() {
        return (Zp.a) this.f95586S0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(DiscoverFragment discoverFragment, c1 c1Var) {
        String str;
        char c10;
        char c11;
        String str2;
        DiscoverFragment discoverFragment2 = discoverFragment;
        c1 c1Var2 = c1Var;
        C17542s.j(c1Var2, "event");
        char c12 = '$';
        if (c1Var2 instanceof c1.a) {
            IllegalStateException illegalStateException = new IllegalStateException("Add to cart not supported in Discover.");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = discoverFragment.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, illegalStateException, str5);
                str4 = str6;
                str3 = str5;
                c12 = '$';
            }
        } else if (c1Var2 instanceof c1.c) {
            C8951o f10 = rw.f.f(discoverFragment2, discoverFragment.O0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C11411a.C2225a.a(discoverFragment.P0(), f10, ((c1.c) c1Var2).a(), (C11412b) null, 4, (Object) null);
            }
        } else if (c1Var2 instanceof c1.d) {
            c1.d dVar = (c1.d) c1Var2;
            ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.RECOMMENDED_OFFERS_CAROUSEL, k.BUTTON), 4, (DefaultConstructorMarker) null);
            C8951o f11 = rw.f.f(discoverFragment2, discoverFragment.O0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                ListPickerNavigation.a.a(discoverFragment.U0(), f11, addOrRemove, (String) null, 4, (Object) null);
            }
        } else if (c1Var2 instanceof c1.e) {
            C8951o f12 = rw.f.f(discoverFragment2, discoverFragment.O0(), (C17642l) null, 2, (Object) null);
            if (f12 != null) {
                discoverFragment.Y0().a(f12, ((c1.e) c1Var2).a(), Interaction$Component.OFFER_HUB_CAROUSEL);
            }
        } else if (c1Var2 instanceof c1.b) {
            C8951o f13 = rw.f.f(discoverFragment2, discoverFragment.O0(), (C17642l) null, 2, (Object) null);
            if (f13 != null) {
                discoverFragment.a1().h(f13, ((c1.b) c1Var2).a(), C15004a.LIST_CART_ACTIONS);
            }
        } else if (c1Var2 instanceof c1.f) {
            Link a11 = ((c1.f) c1Var2).a();
            if (a11 instanceof Link.External) {
                discoverFragment.M0().a(discoverFragment.requireActivity(), ((Link.External) a11).e());
            } else if (a11 instanceof Link.Deeplink) {
                try {
                    C8951o f14 = rw.f.f(discoverFragment2, discoverFragment.O0(), (C17642l) null, 2, (Object) null);
                    if (f14 != null) {
                        Uri parse = Uri.parse(((Link.Deeplink) a11).e());
                        C17542s.i(parse, "parse(...)");
                        f14.X(parse);
                        C16807N n10 = C16807N.f139792a;
                    }
                } catch (ActivityNotFoundException e10) {
                    qv.e eVar2 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : qv.d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str7 = null;
                    String str8 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str7 == null) {
                            String a12 = C11818a.a("No Activity found to handle Intent with url: " + ((Link.Deeplink) a11).e(), e10);
                            if (a12 == null) {
                                break;
                            }
                            str7 = C11820c.a(a12);
                        }
                        if (str8 == null) {
                            String name2 = discoverFragment.getClass().getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        String str9 = str8;
                        bVar2.a(eVar2, str9, false, e10, str7);
                        str8 = str9;
                        DiscoverFragment discoverFragment3 = discoverFragment;
                    }
                    C16807N n11 = C16807N.f139792a;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported product info url.");
                String str10 = "Unsupported url: " + a11.e();
                qv.e eVar3 = qv.e.ERROR;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str11 = null;
                String str12 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str11 == null) {
                        String a13 = C11818a.a((String) null, illegalArgumentException);
                        if (a13 == null) {
                            break;
                        }
                        str11 = C11820c.a(a13);
                    }
                    if (str12 == null) {
                        if (str10 == null) {
                            str2 = discoverFragment.getClass().getName();
                            C17542s.g(str2);
                            c11 = 2;
                            c10 = '$';
                            str = str10;
                            String o14 = C15854t.o1(C15854t.s1(str2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                str2 = C15854t.P0(o14, "Kt");
                            }
                        } else {
                            str = str10;
                            c11 = 2;
                            c10 = '$';
                            str2 = str;
                        }
                        str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str2;
                    } else {
                        str = str10;
                        c11 = 2;
                        c10 = '$';
                    }
                    char c13 = c11;
                    char c14 = c10;
                    bVar3.a(eVar3, str12, false, illegalArgumentException, str11);
                    str10 = str;
                }
            }
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(DiscoverFragment discoverFragment, i iVar) {
        DiscoverFragment discoverFragment2 = discoverFragment;
        i iVar2 = iVar;
        C17542s.j(iVar2, "event");
        if (C17542s.e(iVar2, i.a.f95638a)) {
            discoverFragment.L0().a(androidx.navigation.fragment.a.a(discoverFragment));
        } else if (C17542s.e(iVar2, i.e.f95643a)) {
            a.C1575a.a(discoverFragment.R0(), androidx.navigation.fragment.a.a(discoverFragment), (C) null, 2, (Object) null);
        } else if (iVar2 instanceof i.k) {
            discoverFragment.N0().d(androidx.navigation.fragment.a.a(discoverFragment), ((i.k) iVar2).a());
        } else if (C17542s.e(iVar2, i.b.f95639a)) {
            a.C1864a.a(discoverFragment.S0(), androidx.navigation.fragment.a.a(discoverFragment), (String) null, (String) null, 6, (Object) null);
        } else if (iVar2 instanceof i.f) {
            i.f fVar = (i.f) iVar2;
            discoverFragment.S0().a(androidx.navigation.fragment.a.a(discoverFragment), fVar.a(), fVar.b());
        } else if (iVar2 instanceof i.g) {
            androidx.navigation.fragment.a.a(discoverFragment).Y(Uri.parse(((i.g) iVar2).a()), rw.c.f28698a.c().a());
        } else if (iVar2 instanceof i.c) {
            i.c cVar = (i.c) iVar2;
            C11519a a10 = cVar.a();
            if (a10 instanceof C11519a.C2243a) {
                C11687b.C2346b.b(discoverFragment.Z0(), ((C11519a.C2243a) cVar.a()).getId(), ((C11519a.C2243a) cVar.a()).h(), C11687b.e.CAMPAIGNS, Interaction$Component.CAMPAIGN_CAROUSEL, androidx.navigation.fragment.a.a(discoverFragment), (List) null, (List) null, (String) null, 224, (Object) null);
            } else if (a10 instanceof C11519a.b) {
                discoverFragment.M0().a(discoverFragment.requireContext(), ((C11519a.b) cVar.a()).i().e());
            } else {
                throw new t();
            }
        } else if (iVar2 instanceof i.C2126i) {
            discoverFragment2.f95587T0 = ((i.C2126i) iVar2).a();
        } else if (C17542s.e(iVar2, i.h.f95647a)) {
            discoverFragment.X0().a(androidx.navigation.fragment.a.a(discoverFragment));
        } else if (iVar2 instanceof i.l) {
            i.l lVar = (i.l) iVar2;
            C11687b.C2346b.b(discoverFragment.Z0(), lVar.a(), lVar.b(), C11687b.e.CATEGORY, Interaction$Component.ACTION_HEADER, androidx.navigation.fragment.a.a(discoverFragment), (List) null, (List) null, (String) null, 224, (Object) null);
        } else if (iVar2 instanceof i.j) {
            i.j jVar = (i.j) iVar2;
            int i10 = b.f95596a[jVar.d().ordinal()];
            if (i10 == 1) {
                discoverFragment.Q0().e(androidx.navigation.fragment.a.a(discoverFragment), new Media[]{new Media.Image(jVar.c(), jVar.a())}, 0);
            } else if (i10 == 2) {
                discoverFragment.b1().j(androidx.navigation.fragment.a.a(discoverFragment), jVar.b(), C13331a.b.SHOPPABLE);
            } else if (i10 == 3) {
                discoverFragment.b1().j(androidx.navigation.fragment.a.a(discoverFragment), jVar.b(), C13331a.b.VUGC);
            } else if (i10 == 4) {
                IllegalStateException illegalStateException = new IllegalStateException("Video should not be clickable.");
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = discoverFragment.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
            } else {
                throw new t();
            }
        } else if (!(iVar2 instanceof i.d)) {
            if (iVar2 instanceof i.n) {
                C8951o f10 = rw.f.f(discoverFragment2, discoverFragment.O0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    C13352d.a.a(discoverFragment.c1(), f10, ((i.n) iVar2).a(), false, (C) null, 8, (Object) null);
                }
            } else if (iVar2 instanceof i.m) {
                discoverFragment.W0().a(androidx.navigation.fragment.a.a(discoverFragment));
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1783205509);
        if (C4895p.J()) {
            C4895p.S(1783205509, i10, -1, "com.ingka.ikea.discover.impl.ui.DiscoverFragment.FragmentContent (DiscoverFragment.kt:131)");
        }
        C4910x.a(C13892o.H().d(d1()), c1.c.e(934519621, true, new a(this), mVar, 54), mVar, J0.f13770i | 48);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final C10473a L0() {
        C10473a aVar = this.f95591Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("alertMessageNavigation");
        return null;
    }

    public final Eo.a M0() {
        Eo.a aVar = this.f95573F0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public final Io.a N0() {
        Io.a aVar = this.f95593y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("commercialContentNavigation");
        return null;
    }

    public String O0() {
        return this.f95582O0;
    }

    public final C11411a P0() {
        C11411a aVar = this.f95575H0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final C11841a Q0() {
        C11841a aVar = this.f95580M0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enlargeImagesNavigation");
        return null;
    }

    public final Fs.a R0() {
        Fs.a aVar = this.f95592Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("inboxNavigation");
        return null;
    }

    public final Us.a S0() {
        Us.a aVar = this.f95569B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("inspireNavigation");
        return null;
    }

    public final Dr.a T0() {
        Dr.a aVar = this.f95570C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("kreativComposable");
        return null;
    }

    public final ListPickerNavigation U0() {
        ListPickerNavigation listPickerNavigation = this.f95576I0;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final C11718a V0() {
        C11718a aVar = this.f95571D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("liveShoppingEntryPointSection");
        return null;
    }

    public final Xp.c W0() {
        Xp.c cVar = this.f95590X;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("navigationContract");
        return null;
    }

    public final C15192a X0() {
        C15192a aVar = this.f95579L0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("offerHubNavigation");
        return null;
    }

    public boolean Y() {
        return this.f95587T0;
    }

    public final Zw.a Y0() {
        Zw.a aVar = this.f95577J0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C11687b Z0() {
        C11687b bVar = this.f95572E0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("plpNavigation");
        return null;
    }

    public final C15005b a1() {
        C15005b bVar = this.f95578K0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public final C13331a b1() {
        C13331a aVar = this.f95594z0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("shoppableImageNavigation");
        return null;
    }

    public final C13352d c1() {
        C13352d dVar = this.f95568A0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("shoppingListNavigation");
        return null;
    }

    public void d0() {
        j.a.a(this);
    }

    public final r d1() {
        r rVar = this.f95581N0;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }

    public void l0() {
        e1().J();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f95585R0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f95584Q0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f95583P0;
    }
}
