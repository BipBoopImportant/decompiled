package com.ingka.ikea.app.browseandsearch.browseV2;

import Ae.l;
import Es.a;
import Fs.a;
import HJ.C15854t;
import Iz.Y;
import Op.c1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import Ya.C9364a;
import aA.C13909a;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.browseandsearch.browseV2.a;
import com.ingka.ikea.app.browseandsearch.browseV2.e;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import dI.C17168i;
import g.C5312a;
import g.C5314c;
import g.C5318g;
import gn.C11314a;
import h.C5407e;
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
import rx.C15004a;
import rx.C15005b;
import tf.C10253a;
import ww.C15192a;
import x4.C;
import x4.C8951o;
import ye.C10473a;
import yf.C10474a;
import yf.C10475b;
import yf.n;
import yf.o;
import zf.C10504K;
import zf.C10521f0;

@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001a\u0002098\u0006@\u0006X.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010H\u001a\u00020A8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010_\u001a\u00020Y8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010\u001a\u00020x8\u0006@\u0006X.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020\b8\u0016XD¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010*R \u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030£\u00010¢\u00018\u0002@\u0002X.¢\u0006\u0007\n\u0005\bs\u0010¤\u0001R\u001e\u0010§\u0001\u001a\u00020\u00178BX\u0002¢\u0006\u000e\n\u0005\b$\u0010\u0001\u001a\u0005\b¦\u0001\u0010\u0019R$\u0010«\u0001\u001a\u0010\u0012\u0005\u0012\u00030©\u0001\u0012\u0004\u0012\u00020\u00060¨\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010ª\u0001R*\u0010¯\u0001\u001a\u0016\u0012\u0005\u0012\u00030­\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060¬\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bT\u0010®\u0001¨\u0006³\u0001²\u0006\u0012\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\n@\nX\u0002²\u0006\u000f\u0010²\u0001\u001a\u00020\u00178\n@\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/BrowseFragmentV2;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "Lcom/ingka/ikea/core/android/fragments/j;", "<init>", "()V", "LXH/N;", "m1", "", "itemNo", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "l1", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "D0", "(LU0/m;I)V", "d0", "l0", "", "Y", "()Z", "Lgn/a;", "X", "Lgn/a;", "Q0", "()Lgn/a;", "setBrowseNavigation", "(Lgn/a;)V", "browseNavigation", "Lye/a;", "Lye/a;", "P0", "()Lye/a;", "setAlertMessageNavigation", "(Lye/a;)V", "alertMessageNavigation", "LFs/a;", "Z", "LFs/a;", "V0", "()LFs/a;", "setInboxNavigation", "(LFs/a;)V", "inboxNavigation", "Liq/a;", "y0", "Liq/a;", "T0", "()Liq/a;", "setEnergyLabelNavigation", "(Liq/a;)V", "energyLabelNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "z0", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "Y0", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "LZw/a;", "A0", "LZw/a;", "a1", "()LZw/a;", "setPipNavigation$browse_implementation_release", "(LZw/a;)V", "pipNavigation", "Lrx/b;", "B0", "Lrx/b;", "c1", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "LEo/a;", "C0", "LEo/a;", "R0", "()LEo/a;", "setChromeTabsApi$browse_implementation_release", "(LEo/a;)V", "chromeTabsApi", "Lon/b;", "Lon/b;", "b1", "()Lon/b;", "setPlpNavigation", "(Lon/b;)V", "plpNavigation", "LIz/Y;", "E0", "LIz/Y;", "d1", "()LIz/Y;", "setScanAndGoNavigation", "(LIz/Y;)V", "scanAndGoNavigation", "Ltf/a;", "F0", "Ltf/a;", "W0", "()Ltf/a;", "setKillSwitchRepository", "(Ltf/a;)V", "killSwitchRepository", "LRd/a;", "G0", "LRd/a;", "O0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LaA/a;", "H0", "LaA/a;", "e1", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "Lww/a;", "I0", "Lww/a;", "Z0", "()Lww/a;", "setOfferHubNavigation", "(Lww/a;)V", "offerHubNavigation", "LDr/a;", "J0", "LDr/a;", "X0", "()LDr/a;", "setKreativComposable", "(LDr/a;)V", "kreativComposable", "K0", "Ljava/lang/String;", "S0", "()Ljava/lang/String;", "destId", "Lcom/ingka/ikea/app/browseandsearch/browseV2/c;", "L0", "LXH/o;", "f1", "()Lcom/ingka/ikea/app/browseandsearch/browseV2/c;", "viewModel", "Lyf/n;", "M0", "U0", "()Lyf/n;", "inAppUpdateViewModel", "N0", "isScrolledToTop", "Lg/c;", "Lg/g;", "Lg/c;", "activityResultLauncher", "i1", "isInAppUpdatesEnabled", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/e;", "LnI/l;", "handleScreenUiEvents", "Lkotlin/Function2;", "LOp/c1;", "LnI/p;", "handleItemEvents", "Lzf/f0;", "inAppUpdateUiState", "showAppUpdatedSnackbar", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BrowseFragmentV2 extends d implements com.ingka.ikea.core.android.fragments.j {

    /* renamed from: A0  reason: collision with root package name */
    public Zw.a f70229A0;

    /* renamed from: B0  reason: collision with root package name */
    public C15005b f70230B0;

    /* renamed from: C0  reason: collision with root package name */
    public Eo.a f70231C0;

    /* renamed from: D0  reason: collision with root package name */
    public C11687b f70232D0;

    /* renamed from: E0  reason: collision with root package name */
    public Y f70233E0;

    /* renamed from: F0  reason: collision with root package name */
    public C10253a f70234F0;

    /* renamed from: G0  reason: collision with root package name */
    public Rd.a f70235G0;

    /* renamed from: H0  reason: collision with root package name */
    public C13909a f70236H0;

    /* renamed from: I0  reason: collision with root package name */
    public C15192a f70237I0;

    /* renamed from: J0  reason: collision with root package name */
    public Dr.a f70238J0;

    /* renamed from: K0  reason: collision with root package name */
    private final String f70239K0 = "browse/browse_page";

    /* renamed from: L0  reason: collision with root package name */
    private final C16824o f70240L0;

    /* renamed from: M0  reason: collision with root package name */
    private final C16824o f70241M0;

    /* renamed from: N0  reason: collision with root package name */
    private boolean f70242N0;

    /* renamed from: O0  reason: collision with root package name */
    private C5314c<C5318g> f70243O0;

    /* renamed from: P0  reason: collision with root package name */
    private final C16824o f70244P0;

    /* renamed from: Q0  reason: collision with root package name */
    private final C17642l<e, C16807N> f70245Q0;

    /* renamed from: R0  reason: collision with root package name */
    private final p<c1, Interaction$Component, C16807N> f70246R0;

    /* renamed from: X  reason: collision with root package name */
    public C11314a f70247X;

    /* renamed from: Y  reason: collision with root package name */
    public C10473a f70248Y;

    /* renamed from: Z  reason: collision with root package name */
    public Fs.a f70249Z;

    /* renamed from: y0  reason: collision with root package name */
    public C11411a f70250y0;

    /* renamed from: z0  reason: collision with root package name */
    public ListPickerNavigation f70251z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f70252a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                yf.g[] r0 = yf.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yf.g r1 = yf.g.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yf.g r1 = yf.g.ROOMS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f70252a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.browseandsearch.browseV2.BrowseFragmentV2.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70253c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70253c = oVar;
            this.f70254d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70254d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70253c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70255c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f70255c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70255c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70256c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f70256c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70256c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70257c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f70257c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70257c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70258c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70259d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70258c = aVar;
            this.f70259d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70258c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70259d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70260c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f70260c = oVar;
            this.f70261d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f70261d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f70260c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f70262c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar) {
            super(0);
            this.f70262c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f70262c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70263c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar) {
            super(0);
            this.f70263c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f70263c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f70264c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C16824o oVar) {
            super(0);
            this.f70264c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f70264c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f70265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f70266d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17631a aVar, C16824o oVar) {
            super(0);
            this.f70265c = aVar;
            this.f70266d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f70265c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f70266d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    public BrowseFragmentV2() {
        c cVar = new c(this);
        s sVar = s.NONE;
        C16824o a10 = C16825p.a(sVar, new d(cVar));
        this.f70240L0 = W.b(this, P.b(c.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        C16824o a11 = C16825p.a(sVar, new i(new h(this)));
        this.f70241M0 = W.b(this, P.b(n.class), new j(a11), new k((C17631a) null, a11), new b(this, a11));
        this.f70242N0 = true;
        this.f70244P0 = C16825p.b(new C10475b(this));
        this.f70245Q0 = new yf.c(this);
        this.f70246R0 = new yf.d(this);
    }

    private static final C10521f0 K0(C4899r0<C10521f0> r0Var) {
        return r0Var.getValue();
    }

    private static final void L0(C4899r0<C10521f0> r0Var, C10521f0 f0Var) {
        r0Var.setValue(f0Var);
    }

    private static final boolean M0(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void N0(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    private final n U0() {
        return (n) this.f70241M0.getValue();
    }

    private final c f1() {
        return (c) this.f70240L0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N g1(BrowseFragmentV2 browseFragmentV2, c1 c1Var, Interaction$Component interaction$Component) {
        String str;
        char c10;
        char c11;
        char c12;
        String str2;
        BrowseFragmentV2 browseFragmentV22 = browseFragmentV2;
        c1 c1Var2 = c1Var;
        Interaction$Component interaction$Component2 = interaction$Component;
        C17542s.j(c1Var2, "event");
        C17542s.j(interaction$Component2, "component");
        if (!(c1Var2 instanceof c1.a)) {
            if (c1Var2 instanceof c1.c) {
                C8951o f10 = rw.f.f(browseFragmentV22, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    C11411a.C2225a.a(browseFragmentV2.T0(), f10, ((c1.c) c1Var2).a(), (C11412b) null, 4, (Object) null);
                }
            } else if (c1Var2 instanceof c1.d) {
                c1.d dVar = (c1.d) c1Var2;
                ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(interaction$Component2, Ae.k.BUTTON), 4, (DefaultConstructorMarker) null);
                C8951o f11 = rw.f.f(browseFragmentV22, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                if (f11 != null) {
                    ListPickerNavigation.a.a(browseFragmentV2.Y0(), f11, addOrRemove, (String) null, 4, (Object) null);
                }
            } else if (c1Var2 instanceof c1.e) {
                browseFragmentV22.l1(((c1.e) c1Var2).a(), interaction$Component2);
            } else if (c1Var2 instanceof c1.b) {
                C8951o f12 = rw.f.f(browseFragmentV22, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                if (f12 != null) {
                    browseFragmentV2.c1().h(f12, ((c1.b) c1Var2).a(), C15004a.LIST_CART_ACTIONS);
                }
            } else if (c1Var2 instanceof c1.f) {
                Link a10 = ((c1.f) c1Var2).a();
                if (a10 instanceof Link.External) {
                    browseFragmentV2.R0().a(browseFragmentV2.requireActivity(), ((Link.External) a10).e());
                } else {
                    char c13 = '$';
                    if (a10 instanceof Link.Deeplink) {
                        try {
                            C8951o f13 = rw.f.f(browseFragmentV22, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                            if (f13 != null) {
                                Uri parse = Uri.parse(((Link.Deeplink) a10).e());
                                C17542s.i(parse, "parse(...)");
                                f13.X(parse);
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
                                    String name = browseFragmentV2.getClass().getName();
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
                                BrowseFragmentV2 browseFragmentV23 = browseFragmentV2;
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
                                    str2 = browseFragmentV2.getClass().getName();
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
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(BrowseFragmentV2 browseFragmentV2, e eVar) {
        C11687b.e eVar2;
        C17542s.j(eVar, "event");
        if (C17542s.e(eVar, e.a.f70348a)) {
            browseFragmentV2.P0().a(androidx.navigation.fragment.a.a(browseFragmentV2));
        } else {
            C5314c<C5318g> cVar = null;
            if (C17542s.e(eVar, e.C1216e.f70355a)) {
                a.C1575a.a(browseFragmentV2.V0(), androidx.navigation.fragment.a.a(browseFragmentV2), (C) null, 2, (Object) null);
            } else if (C17542s.e(eVar, e.m.f70367a)) {
                browseFragmentV2.d1().h(androidx.navigation.fragment.a.a(browseFragmentV2), l.SEARCH_VIEW_BUTTON);
            } else if (C17542s.e(eVar, e.o.f70369a)) {
                browseFragmentV2.m1();
            } else if (eVar instanceof e.f) {
                androidx.navigation.fragment.a.a(browseFragmentV2).Y(((e.f) eVar).a(), rw.c.f28698a.c().a());
            } else if (eVar instanceof e.g) {
                C8951o f10 = rw.f.f(browseFragmentV2, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    e.g gVar = (e.g) eVar;
                    C11687b.C2346b.b(browseFragmentV2.b1(), gVar.a(), gVar.b(), C11687b.e.CATEGORY, Interaction$Component.LAST_CHANCE_CAROUSEL, f10, (List) null, (List) null, (String) null, 224, (Object) null);
                }
            } else if (eVar instanceof e.l) {
                String b10 = browseFragmentV2.e1().isLoggedIn() ? C11687b.c.RECOMMENDATIONS_PERSONAL_ID.b() : C11687b.c.RECOMMENDATIONS_SIMILAR_ID.b();
                C8951o f11 = rw.f.f(browseFragmentV2, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                if (f11 != null) {
                    e.l lVar = (e.l) eVar;
                    C11687b.C2346b.b(browseFragmentV2.b1(), b10, lVar.b(), C11687b.e.USER_RECOMMENDATION, Interaction$Component.RECOMMENDATION_CAROUSEL, f11, (List) null, lVar.a(), (String) null, 160, (Object) null);
                }
            } else if (eVar instanceof e.c) {
                C8951o f12 = rw.f.f(browseFragmentV2, browseFragmentV2.S0(), (C17642l) null, 2, (Object) null);
                if (f12 != null) {
                    C11687b b12 = browseFragmentV2.b1();
                    e.c cVar2 = (e.c) eVar;
                    String a10 = cVar2.a();
                    String b11 = cVar2.b();
                    int i10 = a.f70252a[cVar2.d().ordinal()];
                    if (i10 == 1) {
                        eVar2 = C11687b.e.CATEGORY;
                    } else if (i10 == 2) {
                        eVar2 = C11687b.e.ROOM;
                    } else {
                        throw new t();
                    }
                    C11687b.C2346b.b(b12, a10, b11, eVar2, Interaction$Component.CATEGORIES_CAROUSEL, f12, (List) null, (List) null, cVar2.c(), 96, (Object) null);
                }
            } else if (eVar instanceof e.k) {
                browseFragmentV2.l1(((e.k) eVar).a(), Interaction$Component.RECENTLY_VIEWED);
            } else if (C17542s.e(eVar, e.d.f70354a)) {
                browseFragmentV2.U0().D();
            } else if (eVar instanceof e.q) {
                n U02 = browseFragmentV2.U0();
                C9364a a11 = ((e.q) eVar).a().a();
                C5314c<C5318g> cVar3 = browseFragmentV2.f70243O0;
                if (cVar3 == null) {
                    C17542s.z("activityResultLauncher");
                } else {
                    cVar = cVar3;
                }
                U02.O(a11, cVar);
            } else if (C17542s.e(eVar, e.h.f70359a)) {
                Rd.a O02 = browseFragmentV2.O0();
                C5191t requireActivity = browseFragmentV2.requireActivity();
                C17542s.i(requireActivity, "requireActivity(...)");
                O02.d(requireActivity);
            } else if (C17542s.e(eVar, e.p.f70370a)) {
                Rd.a O03 = browseFragmentV2.O0();
                C5191t requireActivity2 = browseFragmentV2.requireActivity();
                C17542s.i(requireActivity2, "requireActivity(...)");
                O03.e(requireActivity2);
            } else if (eVar instanceof e.n) {
                browseFragmentV2.f70242N0 = ((e.n) eVar).a();
            } else if (C17542s.e(eVar, e.b.f70349a)) {
                browseFragmentV2.U0().L();
            } else if (C17542s.e(eVar, e.i.f70360a)) {
                browseFragmentV2.Z0().a(androidx.navigation.fragment.a.a(browseFragmentV2));
            } else if (!(eVar instanceof e.j)) {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    private final boolean i1() {
        return ((Boolean) this.f70244P0.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final boolean j1(BrowseFragmentV2 browseFragmentV2) {
        return browseFragmentV2.W0().e();
    }

    /* access modifiers changed from: private */
    public static final void k1(BrowseFragmentV2 browseFragmentV2, C5312a aVar) {
        C17542s.j(aVar, "activityResult");
        browseFragmentV2.U0().I(aVar);
    }

    private final void l1(String str, Interaction$Component interaction$Component) {
        C8951o f10 = rw.f.f(this, S0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            a1().a(f10, str, interaction$Component);
        }
    }

    private final void m1() {
        int i10;
        Es.a d10 = f1().getState().getValue().d();
        if (d10 instanceof a.C1544a) {
            i10 = ((a.C1544a) d10).a();
        } else if (C17542s.e(d10, a.b.f80780a)) {
            i10 = 0;
        } else {
            throw new t();
        }
        Q0().e(androidx.navigation.fragment.a.a(this), i10);
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1388008412);
        if (C4895p.J()) {
            C4895p.S(1388008412, i10, -1, "com.ingka.ikea.app.browseandsearch.browseV2.BrowseFragmentV2.FragmentContent (BrowseFragmentV2.kt:132)");
        }
        mVar.W(2077751356);
        Object D10 = mVar.D();
        C4889m.a aVar = C4889m.f14007a;
        C10521f0 f0Var = null;
        if (D10 == aVar.a()) {
            D10 = u1.e((Object) null, (o1) null, 2, (Object) null);
            mVar.u(D10);
        }
        C4899r0 r0Var = (C4899r0) D10;
        mVar.P();
        mVar.W(2077754312);
        Object D11 = mVar.D();
        if (D11 == aVar.a()) {
            D11 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
            mVar.u(D11);
        }
        C4899r0 r0Var2 = (C4899r0) D11;
        mVar.P();
        mVar.W(2077756058);
        if (i1()) {
            yf.l value = j3.a.c(U0().G(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7).getValue();
            if (value != null) {
                f0Var = o.a(value);
            }
            L0(r0Var, f0Var);
            N0(r0Var2, j3.a.c(U0().H(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7).getValue().booleanValue());
        }
        mVar.P();
        C10504K.Q(f1(), K0(r0Var), M0(r0Var2), X0(), this.f70246R0, this.f70245Q0, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final Rd.a O0() {
        Rd.a aVar = this.f70235G0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final C10473a P0() {
        C10473a aVar = this.f70248Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("alertMessageNavigation");
        return null;
    }

    public final C11314a Q0() {
        C11314a aVar = this.f70247X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("browseNavigation");
        return null;
    }

    public final Eo.a R0() {
        Eo.a aVar = this.f70231C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public String S0() {
        return this.f70239K0;
    }

    public final C11411a T0() {
        C11411a aVar = this.f70250y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final Fs.a V0() {
        Fs.a aVar = this.f70249Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("inboxNavigation");
        return null;
    }

    public final C10253a W0() {
        C10253a aVar = this.f70234F0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("killSwitchRepository");
        return null;
    }

    public final Dr.a X0() {
        Dr.a aVar = this.f70238J0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("kreativComposable");
        return null;
    }

    public boolean Y() {
        return this.f70242N0;
    }

    public final ListPickerNavigation Y0() {
        ListPickerNavigation listPickerNavigation = this.f70251z0;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final C15192a Z0() {
        C15192a aVar = this.f70237I0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("offerHubNavigation");
        return null;
    }

    public final Zw.a a1() {
        Zw.a aVar = this.f70229A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C11687b b1() {
        C11687b bVar = this.f70232D0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("plpNavigation");
        return null;
    }

    public final C15005b c1() {
        C15005b bVar = this.f70230B0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public void d0() {
        m1();
    }

    public final Y d1() {
        Y y10 = this.f70233E0;
        if (y10 != null) {
            return y10;
        }
        C17542s.z("scanAndGoNavigation");
        return null;
    }

    public final C13909a e1() {
        C13909a aVar = this.f70236H0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public void l0() {
        f1().b(a.i.f70276a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70243O0 = registerForActivityResult(new C5407e(), new C10474a(this));
    }

    public void onResume() {
        super.onResume();
        if (i1()) {
            U0().N();
        }
    }
}
