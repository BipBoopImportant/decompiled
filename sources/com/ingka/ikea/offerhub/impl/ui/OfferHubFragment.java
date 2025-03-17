package com.ingka.ikea.offerhub.impl.ui;

import Ae.k;
import HJ.C15854t;
import Op.c1;
import QA.C13352d;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.offerhub.impl.ui.i;
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
import rw.f;
import rx.C15004a;
import rx.C15005b;
import sB.C15035a;
import x4.C;
import x4.C8951o;
import zw.C15361i0;
import zw.C15363j0;
import zw.C15365k0;
import zw.C15367l0;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0015¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010N\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010R\u001a\u00020O8\u0014XD¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\bP\u0010QR\u001a\u0010T\u001a\u00020O8\u0014XD¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\bS\u0010QR\u001a\u0010W\u001a\u00020O8\u0014XD¢\u0006\f\n\u0004\bU\u0010#\u001a\u0004\bV\u0010QR\u001b\u0010]\u001a\u00020X8BX\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\t0^8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR&\u0010g\u001a\u0014\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0c8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010f¨\u0006h"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/OfferHubFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "", "itemNo", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "LXH/N;", "Z0", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Liq/a;", "X", "Liq/a;", "O0", "()Liq/a;", "setEnergyLabelNavigation", "(Liq/a;)V", "energyLabelNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "Y", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "P0", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "LQA/d;", "Z", "LQA/d;", "T0", "()LQA/d;", "setShoppingListNavigation", "(LQA/d;)V", "shoppingListNavigation", "LZw/a;", "y0", "LZw/a;", "Q0", "()LZw/a;", "setPipNavigation$offerhub_implementation_release", "(LZw/a;)V", "pipNavigation", "Lrx/b;", "z0", "Lrx/b;", "S0", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "LEo/a;", "A0", "LEo/a;", "M0", "()LEo/a;", "setChromeTabsApi$offerhub_implementation_release", "(LEo/a;)V", "chromeTabsApi", "Lon/b;", "B0", "Lon/b;", "R0", "()Lon/b;", "setPlpNavigation", "(Lon/b;)V", "plpNavigation", "C0", "Ljava/lang/String;", "N0", "()Ljava/lang/String;", "destId", "", "v0", "()Z", "drawUnderStatusBar", "u0", "drawUnderNavigationBar", "F0", "t0", "drawUnderDisplayCutout", "LBw/c;", "G0", "LXH/o;", "U0", "()LBw/c;", "viewModel", "Lkotlin/Function1;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "H0", "LnI/l;", "handleScreenUiEvent", "Lkotlin/Function2;", "LOp/c1;", "I0", "LnI/p;", "handleProductItemEvent", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OfferHubFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public Eo.a f119143A0;

    /* renamed from: B0  reason: collision with root package name */
    public C11687b f119144B0;

    /* renamed from: C0  reason: collision with root package name */
    private final String f119145C0 = "offer_hub/screen";

    /* renamed from: D0  reason: collision with root package name */
    private final boolean f119146D0;

    /* renamed from: E0  reason: collision with root package name */
    private final boolean f119147E0;

    /* renamed from: F0  reason: collision with root package name */
    private final boolean f119148F0;

    /* renamed from: G0  reason: collision with root package name */
    private final C16824o f119149G0;

    /* renamed from: H0  reason: collision with root package name */
    private final C17642l<i, C16807N> f119150H0;

    /* renamed from: I0  reason: collision with root package name */
    private final p<c1, Interaction$Component, C16807N> f119151I0;

    /* renamed from: X  reason: collision with root package name */
    public C11411a f119152X;

    /* renamed from: Y  reason: collision with root package name */
    public ListPickerNavigation f119153Y;

    /* renamed from: Z  reason: collision with root package name */
    public C13352d f119154Z;

    /* renamed from: y0  reason: collision with root package name */
    public Zw.a f119155y0;

    /* renamed from: z0  reason: collision with root package name */
    public C15005b f119156z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119157c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f119157c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119157c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119158c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f119158c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119158c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119159c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f119159c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119159c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119160c = aVar;
            this.f119161d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119160c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119161d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119162c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119162c = oVar;
            this.f119163d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119163d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119162c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public OfferHubFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f119149G0 = W.b(this, P.b(Bw.c.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
        this.f119150H0 = new C15361i0(this);
        this.f119151I0 = new C15363j0(this);
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(OfferHubFragment offerHubFragment, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            String b10 = cVar != null ? cVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            offerHubFragment.U0().O(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10));
        }
        return C16807N.f139792a;
    }

    private final Bw.c U0() {
        return (Bw.c) this.f119149G0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N V0(OfferHubFragment offerHubFragment, c1 c1Var, Interaction$Component interaction$Component) {
        String str;
        char c10;
        char c11;
        char c12;
        String str2;
        OfferHubFragment offerHubFragment2 = offerHubFragment;
        c1 c1Var2 = c1Var;
        Interaction$Component interaction$Component2 = interaction$Component;
        C17542s.j(c1Var2, "event");
        C17542s.j(interaction$Component2, "component");
        if (!(c1Var2 instanceof c1.a)) {
            if (c1Var2 instanceof c1.c) {
                C8951o f10 = f.f(offerHubFragment2, offerHubFragment.N0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    C11411a.C2225a.a(offerHubFragment.O0(), f10, ((c1.c) c1Var2).a(), (C11412b) null, 4, (Object) null);
                }
            } else if (c1Var2 instanceof c1.d) {
                c1.d dVar = (c1.d) c1Var2;
                ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(interaction$Component2, k.BUTTON), 4, (DefaultConstructorMarker) null);
                C8951o f11 = f.f(offerHubFragment2, offerHubFragment.N0(), (C17642l) null, 2, (Object) null);
                if (f11 != null) {
                    ListPickerNavigation.a.a(offerHubFragment.P0(), f11, addOrRemove, (String) null, 4, (Object) null);
                }
            } else if (c1Var2 instanceof c1.e) {
                offerHubFragment2.Z0(((c1.e) c1Var2).a(), interaction$Component2);
            } else if (c1Var2 instanceof c1.b) {
                C8951o f12 = f.f(offerHubFragment2, offerHubFragment.N0(), (C17642l) null, 2, (Object) null);
                if (f12 != null) {
                    offerHubFragment.S0().h(f12, ((c1.b) c1Var2).a(), C15004a.LIST_CART_ACTIONS);
                }
            } else if (c1Var2 instanceof c1.f) {
                Link a10 = ((c1.f) c1Var2).a();
                if (a10 instanceof Link.External) {
                    offerHubFragment.M0().a(offerHubFragment.requireActivity(), ((Link.External) a10).e());
                } else {
                    char c13 = '$';
                    if (a10 instanceof Link.Deeplink) {
                        try {
                            C8951o f13 = f.f(offerHubFragment2, offerHubFragment.N0(), (C17642l) null, 2, (Object) null);
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
                                    String name = offerHubFragment.getClass().getName();
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
                                OfferHubFragment offerHubFragment3 = offerHubFragment;
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
                                    str2 = offerHubFragment.getClass().getName();
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
    public static final C16807N W0(OfferHubFragment offerHubFragment, i iVar) {
        OfferHubFragment offerHubFragment2 = offerHubFragment;
        i iVar2 = iVar;
        C17542s.j(iVar2, "event");
        i.c cVar = i.c.f119210a;
        if (C17542s.e(iVar2, cVar)) {
            C8951o f10 = f.f(offerHubFragment2, offerHubFragment.N0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                f10.k0();
            }
        } else if (iVar2 instanceof i.d) {
            C8951o f11 = f.f(offerHubFragment2, offerHubFragment.N0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                i.d dVar = (i.d) iVar2;
                C11687b.C2346b.b(offerHubFragment.R0(), dVar.a(), dVar.b(), cVar.a(dVar.c()), dVar.d(), f11, (List) null, (List) null, (String) null, 224, (Object) null);
            }
        } else if (!(iVar2 instanceof i.g) && !(iVar2 instanceof i.f)) {
            if (iVar2 instanceof i.h) {
                f.d(offerHubFragment2, offerHubFragment.N0(), new C15365k0(offerHubFragment2, iVar2));
            } else if (iVar2 instanceof i.e) {
                f.d(offerHubFragment2, offerHubFragment.N0(), new C15367l0(iVar2, offerHubFragment2));
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X0(OfferHubFragment offerHubFragment, i iVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C13352d.a.a(offerHubFragment.T0(), oVar, ((i.h) iVar).a(), false, (C) null, 8, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y0(i iVar, OfferHubFragment offerHubFragment, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        Uri parse = Uri.parse(((i.e) iVar).a());
        if (offerHubFragment.R0().d(parse)) {
            parse = offerHubFragment.R0().c(parse, Interaction$Component.COMMERCIAL_MESSAGE_CAROUSEL);
        }
        oVar.Y(parse, rw.c.f28698a.c().a());
        return C16807N.f139792a;
    }

    private final void Z0(String str, Interaction$Component interaction$Component) {
        C8951o f10 = f.f(this, N0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Q0().a(f10, str, interaction$Component);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r9, int r10) {
        /*
            r8 = this;
            r0 = -126188235(0xfffffffff87a8535, float:-2.0324625E34)
            r9.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.offerhub.impl.ui.OfferHubFragment.FragmentContent (OfferHubFragment.kt:73)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0012:
            Bw.c r10 = r8.U0()
            nI.l<com.ingka.ikea.offerhub.impl.ui.i, XH.N> r0 = r8.f119150H0
            nI.p<Op.c1, com.ingka.ikea.analytics.Interaction$Component, XH.N> r1 = r8.f119151I0
            r2 = 0
            com.ingka.ikea.offerhub.impl.ui.b.w(r10, r0, r1, r9, r2)
            U0.I0 r10 = Vo.b.c()
            java.lang.Object r10 = r9.Q(r10)
            androidx.fragment.app.o r10 = (androidx.fragment.app.C5187o) r10
            r0 = -301827487(0xffffffffee027a61, float:-1.009525E28)
            r9.W(r0)
            java.lang.Object r0 = r9.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x0041
            x4.o r0 = androidx.navigation.fragment.a.a(r10)
            r9.u(r0)
        L_0x0041:
            r2 = r0
            x4.o r2 = (x4.C8951o) r2
            r9.P()
            java.lang.String r3 = r8.N0()
            r10 = -301819266(0xffffffffee029a7e, float:-1.0104955E28)
            r9.W(r10)
            boolean r10 = r9.F(r8)
            java.lang.Object r0 = r9.D()
            if (r10 != 0) goto L_0x0061
            java.lang.Object r10 = r1.a()
            if (r0 != r10) goto L_0x0069
        L_0x0061:
            zw.h0 r0 = new zw.h0
            r0.<init>(r8)
            r9.u(r0)
        L_0x0069:
            r5 = r0
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 384(0x180, float:5.38E-43)
            java.lang.String r4 = "ChooseListBottomSheet.RequestKey"
            r6 = r9
            qw.l.d(r2, r3, r4, r5, r6, r7)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0080
            U0.C4895p.R()
        L_0x0080:
            r9.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.offerhub.impl.ui.OfferHubFragment.D0(U0.m, int):void");
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        super.E0(bundle);
        Bw.c.L(U0(), false, 1, (Object) null);
    }

    public final Eo.a M0() {
        Eo.a aVar = this.f119143A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public String N0() {
        return this.f119145C0;
    }

    public final C11411a O0() {
        C11411a aVar = this.f119152X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final ListPickerNavigation P0() {
        ListPickerNavigation listPickerNavigation = this.f119153Y;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final Zw.a Q0() {
        Zw.a aVar = this.f119155y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C11687b R0() {
        C11687b bVar = this.f119144B0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("plpNavigation");
        return null;
    }

    public final C15005b S0() {
        C15005b bVar = this.f119156z0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public final C13352d T0() {
        C13352d dVar = this.f119154Z;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("shoppingListNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f119148F0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f119147E0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f119146D0;
    }
}
