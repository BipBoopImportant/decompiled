package com.ingka.ikea.commercialcontent.impl.view;

import Ae.k;
import HJ.C15854t;
import Mo.t;
import Mo.u;
import Mo.v;
import Mo.w;
import Mo.x;
import Mo.y;
import Op.c1;
import PA.C13331a;
import QA.C13352d;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.commercialcontent.impl.view.l;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.Media;
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
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rq.C11841a;
import rx.C15004a;
import rx.C15005b;
import sB.C15035a;
import x3.r;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0015¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010]\u001a\u00020W8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010j\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010o\u001a\u00020k8\u0014XD¢\u0006\f\n\u0004\bl\u0010(\u001a\u0004\bm\u0010nR\u001a\u0010r\u001a\u00020k8\u0014XD¢\u0006\f\n\u0004\bp\u0010(\u001a\u0004\bq\u0010nR\u001a\u0010u\u001a\u00020k8\u0014XD¢\u0006\f\n\u0004\bs\u0010(\u001a\u0004\bt\u0010nR\u001b\u0010{\u001a\u00020v8BX\u0002¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR!\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\b0|8\u0002X\u0004¢\u0006\u0006\n\u0004\b~\u0010R#\u0010\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0001\u0012\u0004\u0012\u00020\b0|8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/commercialcontent/impl/view/CommercialContentFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "", "categoryId", "categoryTitle", "LXH/N;", "j1", "(Ljava/lang/String;Ljava/lang/String;)V", "productsPLId", "productsPLTitle", "l1", "shoppableImageId", "n1", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/core/model/Image;", "image", "h1", "(Lcom/ingka/ikea/core/model/Image;)V", "D0", "(LU0/m;I)V", "LEo/a;", "X", "LEo/a;", "S0", "()LEo/a;", "setChromeTabsApi$commercialcontent_implementation_release", "(LEo/a;)V", "chromeTabsApi", "Liq/a;", "Y", "Liq/a;", "U0", "()Liq/a;", "setEnergyLabelNavigation$commercialcontent_implementation_release", "(Liq/a;)V", "energyLabelNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "Z", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "W0", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "LZw/a;", "y0", "LZw/a;", "X0", "()LZw/a;", "setPipNavigation$commercialcontent_implementation_release", "(LZw/a;)V", "pipNavigation", "Lon/b;", "z0", "Lon/b;", "Y0", "()Lon/b;", "setPlpNavigation", "(Lon/b;)V", "plpNavigation", "Lrx/b;", "A0", "Lrx/b;", "Z0", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "LPA/a;", "B0", "LPA/a;", "a1", "()LPA/a;", "setShoppableImageNavigation", "(LPA/a;)V", "shoppableImageNavigation", "LQA/d;", "C0", "LQA/d;", "b1", "()LQA/d;", "setShoppingListNavigation", "(LQA/d;)V", "shoppingListNavigation", "Lrq/a;", "Lrq/a;", "V0", "()Lrq/a;", "setEnlargeImagesNavigation", "(Lrq/a;)V", "enlargeImagesNavigation", "Lx3/r;", "E0", "Lx3/r;", "c1", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "F0", "Ljava/lang/String;", "T0", "()Ljava/lang/String;", "destId", "", "G0", "v0", "()Z", "drawUnderStatusBar", "H0", "u0", "drawUnderNavigationBar", "I0", "t0", "drawUnderDisplayCutout", "LNo/b;", "J0", "LXH/o;", "d1", "()LNo/b;", "viewModel", "Lkotlin/Function1;", "Lcom/ingka/ikea/commercialcontent/impl/view/l;", "K0", "LnI/l;", "handleUiEvents", "LOp/c1;", "L0", "handleItemEvents", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommercialContentFragment extends k {

    /* renamed from: A0  reason: collision with root package name */
    public C15005b f94701A0;

    /* renamed from: B0  reason: collision with root package name */
    public C13331a f94702B0;

    /* renamed from: C0  reason: collision with root package name */
    public C13352d f94703C0;

    /* renamed from: D0  reason: collision with root package name */
    public C11841a f94704D0;

    /* renamed from: E0  reason: collision with root package name */
    public r f94705E0;

    /* renamed from: F0  reason: collision with root package name */
    private final String f94706F0 = "commercialcontent/screen?storyId={storyId}";

    /* renamed from: G0  reason: collision with root package name */
    private final boolean f94707G0 = true;

    /* renamed from: H0  reason: collision with root package name */
    private final boolean f94708H0;

    /* renamed from: I0  reason: collision with root package name */
    private final boolean f94709I0;

    /* renamed from: J0  reason: collision with root package name */
    private final C16824o f94710J0;
    /* access modifiers changed from: private */

    /* renamed from: K0  reason: collision with root package name */
    public final C17642l<l, C16807N> f94711K0;
    /* access modifiers changed from: private */

    /* renamed from: L0  reason: collision with root package name */
    public final C17642l<c1, C16807N> f94712L0;

    /* renamed from: X  reason: collision with root package name */
    public Eo.a f94713X;

    /* renamed from: Y  reason: collision with root package name */
    public C11411a f94714Y;

    /* renamed from: Z  reason: collision with root package name */
    public ListPickerNavigation f94715Z;

    /* renamed from: y0  reason: collision with root package name */
    public Zw.a f94716y0;

    /* renamed from: z0  reason: collision with root package name */
    public C11687b f94717z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommercialContentFragment f94718a;

        a(CommercialContentFragment commercialContentFragment) {
            this.f94718a = commercialContentFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-80051402, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.CommercialContentFragment.FragmentContent.<anonymous> (CommercialContentFragment.kt:91)");
                }
                a.t(this.f94718a.d1(), this.f94718a.f94712L0, this.f94718a.f94711K0, mVar, 0);
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
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f94719a;

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
                kp.i$a r1 = kp.i.a.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kp.i$a r1 = kp.i.a.USER_CONTENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kp.i$a r1 = kp.i.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kp.i$a r1 = kp.i.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f94719a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.CommercialContentFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94720c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f94720c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94720c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94721c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f94721c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94721c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94722c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f94722c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94722c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94723c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94723c = aVar;
            this.f94724d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94723c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94724d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94725c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94725c = oVar;
            this.f94726d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94726d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94725c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CommercialContentFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f94710J0 = W.b(this, P.b(No.b.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        this.f94711K0 = new Mo.s(this);
        this.f94712L0 = new t(this);
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(CommercialContentFragment commercialContentFragment, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            String b10 = cVar != null ? cVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            commercialContentFragment.d1().H(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final No.b d1() {
        return (No.b) this.f94710J0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e1(CommercialContentFragment commercialContentFragment, c1 c1Var) {
        String str;
        char c10;
        char c11;
        char c12;
        String str2;
        CommercialContentFragment commercialContentFragment2 = commercialContentFragment;
        c1 c1Var2 = c1Var;
        C17542s.j(c1Var2, "event");
        if (c1Var2 instanceof c1.c) {
            C8951o f10 = rw.f.f(commercialContentFragment2, commercialContentFragment.T0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C11411a.C2225a.a(commercialContentFragment.U0(), f10, ((c1.c) c1Var2).a(), (C11412b) null, 4, (Object) null);
            }
        } else if (c1Var2 instanceof c1.d) {
            c1.d dVar = (c1.d) c1Var2;
            ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.PRODUCT_LISTING, k.BUTTON), 4, (DefaultConstructorMarker) null);
            C8951o f11 = rw.f.f(commercialContentFragment2, commercialContentFragment.T0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                ListPickerNavigation.a.a(commercialContentFragment.W0(), f11, addOrRemove, (String) null, 4, (Object) null);
            }
        } else if (c1Var2 instanceof c1.e) {
            C8951o f12 = rw.f.f(commercialContentFragment2, commercialContentFragment.T0(), (C17642l) null, 2, (Object) null);
            if (f12 != null) {
                commercialContentFragment.X0().a(f12, ((c1.e) c1Var2).a(), Interaction$Component.PRODUCT_LISTING);
            }
        } else if (c1Var2 instanceof c1.b) {
            C8951o f13 = rw.f.f(commercialContentFragment2, commercialContentFragment.T0(), (C17642l) null, 2, (Object) null);
            if (f13 != null) {
                commercialContentFragment.Z0().h(f13, ((c1.b) c1Var2).a(), C15004a.LIST_CART_ACTIONS);
            }
        } else if (c1Var2 instanceof c1.f) {
            Link a10 = ((c1.f) c1Var2).a();
            if (a10 instanceof Link.External) {
                commercialContentFragment.S0().a(commercialContentFragment.requireActivity(), ((Link.External) a10).e());
            } else {
                char c13 = '$';
                if (a10 instanceof Link.Deeplink) {
                    try {
                        C8951o f14 = rw.f.f(commercialContentFragment2, commercialContentFragment.T0(), (C17642l) null, 2, (Object) null);
                        if (f14 != null) {
                            Uri parse = Uri.parse(((Link.Deeplink) a10).e());
                            C17542s.i(parse, "parse(...)");
                            f14.X(parse);
                            C16807N n10 = C16807N.f139792a;
                        }
                    } catch (ActivityNotFoundException e10) {
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
                                String a11 = C11818a.a("No Activity found to handle Intent with url: " + ((Link.Deeplink) a10).e(), e10);
                                if (a11 == null) {
                                    break;
                                }
                                str3 = C11820c.a(a11);
                            }
                            if (str4 == null) {
                                String name = commercialContentFragment.getClass().getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, c13, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str5 = str4;
                            bVar.a(eVar, str5, false, e10, str3);
                            str4 = str5;
                            eVar = eVar;
                            c13 = '$';
                            CommercialContentFragment commercialContentFragment3 = commercialContentFragment;
                        }
                        C16807N n11 = C16807N.f139792a;
                    }
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported product info url.");
                    String str6 = "Unsupported url: " + a10.e();
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
                        if (str8 == null) {
                            String a12 = C11818a.a((String) null, illegalArgumentException);
                            if (a12 == null) {
                                break;
                            }
                            str = C11820c.a(a12);
                        } else {
                            str = str8;
                        }
                        if (str7 == null) {
                            if (str6 == null) {
                                str2 = commercialContentFragment.getClass().getName();
                                C17542s.g(str2);
                                c12 = '$';
                                c11 = 2;
                                c10 = '.';
                                String o13 = C15854t.o1(C15854t.s1(str2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o13.length() != 0) {
                                    str2 = C15854t.P0(o13, "Kt");
                                }
                            } else {
                                c12 = '$';
                                c11 = 2;
                                c10 = '.';
                                str2 = str6;
                            }
                            str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str2;
                        } else {
                            c12 = '$';
                            c11 = 2;
                            c10 = '.';
                        }
                        char c14 = c12;
                        char c15 = c11;
                        char c16 = c10;
                        bVar2.a(eVar2, str7, false, illegalArgumentException, str);
                        str8 = str;
                    }
                }
            }
        } else if (!(c1Var2 instanceof c1.a)) {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(CommercialContentFragment commercialContentFragment, l lVar) {
        C17542s.j(lVar, "event");
        if (C17542s.e(lVar, l.a.f94785a)) {
            C8951o f10 = rw.f.f(commercialContentFragment, commercialContentFragment.T0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                f10.k0();
            }
        } else if (lVar instanceof l.d) {
            l.d dVar = (l.d) lVar;
            commercialContentFragment.j1(dVar.a(), dVar.b());
        } else if (lVar instanceof l.b) {
            l.b bVar = (l.b) lVar;
            commercialContentFragment.l1(bVar.a(), bVar.b());
        } else if (lVar instanceof l.e) {
            l.e eVar = (l.e) lVar;
            int i10 = b.f94719a[eVar.a().d().ordinal()];
            if (i10 == 1 || i10 == 2) {
                commercialContentFragment.n1(eVar.a().b());
            } else if (i10 == 3) {
                commercialContentFragment.h1(new Image(eVar.a().e(), eVar.a().a()));
            } else if (i10 == 4) {
                IllegalStateException illegalStateException = new IllegalStateException("Video should not be clickable.");
                qv.e eVar2 = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar2 : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = commercialContentFragment.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar2.a(eVar2, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
            } else {
                throw new XH.t();
            }
        } else if (lVar instanceof l.f) {
            rw.f.d(commercialContentFragment, commercialContentFragment.T0(), new u(commercialContentFragment, lVar));
        } else if (!(lVar instanceof l.c)) {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(CommercialContentFragment commercialContentFragment, l lVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C13352d.a.a(commercialContentFragment.b1(), oVar, ((l.f) lVar).a(), false, (C) null, 8, (Object) null);
        return C16807N.f139792a;
    }

    private final void h1(Image image) {
        rw.f.d(this, T0(), new w(this, image));
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(CommercialContentFragment commercialContentFragment, Image image, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        commercialContentFragment.V0().e(oVar, new Media[]{new Media.Image(image.getUrl(), image.A0())}, 0);
        return C16807N.f139792a;
    }

    private final void j1(String str, String str2) {
        rw.f.d(this, T0(), new y(this, str, str2));
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(CommercialContentFragment commercialContentFragment, String str, String str2, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C11687b.C2346b.b(commercialContentFragment.Y0(), str, str2, C11687b.e.CATEGORY, Interaction$Component.ACTION_HEADER, oVar, (List) null, (List) null, (String) null, 224, (Object) null);
        return C16807N.f139792a;
    }

    private final void l1(String str, String str2) {
        rw.f.d(this, T0(), new v(this, str, str2));
    }

    /* access modifiers changed from: private */
    public static final C16807N m1(CommercialContentFragment commercialContentFragment, String str, String str2, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C11687b.C2346b.b(commercialContentFragment.Y0(), str, str2, C11687b.e.PRODUCTS, Interaction$Component.ACTION_HEADER, oVar, (List) null, (List) null, (String) null, 224, (Object) null);
        return C16807N.f139792a;
    }

    private final void n1(String str) {
        rw.f.d(this, T0(), new x(this, str));
    }

    /* access modifiers changed from: private */
    public static final C16807N o1(CommercialContentFragment commercialContentFragment, String str, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        commercialContentFragment.a1().j(oVar, str, C13331a.b.SHOPPABLE);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r9, int r10) {
        /*
            r8 = this;
            r0 = -1719967754(0xffffffff997b5ff6, float:-1.2995775E-23)
            r9.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.commercialcontent.impl.view.CommercialContentFragment.FragmentContent (CommercialContentFragment.kt:89)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0012:
            U0.I0 r10 = ZC.C13892o.H()
            x3.r r0 = r8.c1()
            U0.J0 r10 = r10.d(r0)
            com.ingka.ikea.commercialcontent.impl.view.CommercialContentFragment$a r0 = new com.ingka.ikea.commercialcontent.impl.view.CommercialContentFragment$a
            r0.<init>(r8)
            r1 = 54
            r2 = -80051402(0xfffffffffb3a8336, float:-9.684285E35)
            r3 = 1
            c1.a r0 = c1.c.e(r2, r3, r0, r9, r1)
            int r1 = U0.J0.f13770i
            r1 = r1 | 48
            U0.C4910x.a(r10, r0, r9, r1)
            U0.I0 r10 = Vo.b.c()
            java.lang.Object r10 = r9.Q(r10)
            androidx.fragment.app.o r10 = (androidx.fragment.app.C5187o) r10
            r0 = -1237732996(0xffffffffb639b17c, float:-2.7670458E-6)
            r9.W(r0)
            java.lang.Object r0 = r9.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x0057
            x4.o r0 = androidx.navigation.fragment.a.a(r10)
            r9.u(r0)
        L_0x0057:
            r2 = r0
            x4.o r2 = (x4.C8951o) r2
            r9.P()
            java.lang.String r3 = r8.T0()
            r10 = -1237724775(0xffffffffb639d199, float:-2.768915E-6)
            r9.W(r10)
            boolean r10 = r9.F(r8)
            java.lang.Object r0 = r9.D()
            if (r10 != 0) goto L_0x0077
            java.lang.Object r10 = r1.a()
            if (r0 != r10) goto L_0x007f
        L_0x0077:
            Mo.r r0 = new Mo.r
            r0.<init>(r8)
            r9.u(r0)
        L_0x007f:
            r5 = r0
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 384(0x180, float:5.38E-43)
            java.lang.String r4 = "ChooseListBottomSheet.RequestKey"
            r6 = r9
            qw.l.d(r2, r3, r4, r5, r6, r7)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0096
            U0.C4895p.R()
        L_0x0096:
            r9.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.CommercialContentFragment.D0(U0.m, int):void");
    }

    public final Eo.a S0() {
        Eo.a aVar = this.f94713X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public String T0() {
        return this.f94706F0;
    }

    public final C11411a U0() {
        C11411a aVar = this.f94714Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final C11841a V0() {
        C11841a aVar = this.f94704D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enlargeImagesNavigation");
        return null;
    }

    public final ListPickerNavigation W0() {
        ListPickerNavigation listPickerNavigation = this.f94715Z;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final Zw.a X0() {
        Zw.a aVar = this.f94716y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C11687b Y0() {
        C11687b bVar = this.f94717z0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("plpNavigation");
        return null;
    }

    public final C15005b Z0() {
        C15005b bVar = this.f94701A0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public final C13331a a1() {
        C13331a aVar = this.f94702B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("shoppableImageNavigation");
        return null;
    }

    public final C13352d b1() {
        C13352d dVar = this.f94703C0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("shoppingListNavigation");
        return null;
    }

    public final r c1() {
        r rVar = this.f94705E0;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f94709I0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f94708H0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f94707G0;
    }
}
