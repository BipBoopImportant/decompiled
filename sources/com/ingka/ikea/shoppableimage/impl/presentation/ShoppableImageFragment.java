package com.ingka.ikea.shoppableimage.impl.presentation;

import Ae.k;
import HJ.C15854t;
import KA.C13125c;
import NA.C13246e;
import NA.C13247f;
import NA.c0;
import Op.c1;
import PA.C13331a;
import QA.C13352d;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import iq.C11411a;
import iq.C11412b;
import jC.C14614a;
import jC.h;
import jC.p;
import jC.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rw.f;
import rx.C15004a;
import rx.C15005b;
import sB.C15035a;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000f\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0012\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0015\u001a\u00020\u0006*\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0000@\u0000X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010S\u001a\u00020L8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010X\u001a\u00020T8\u0016XD¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010^\u001a\u00020Y8BX\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020\u00060\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010aR\u0014\u0010g\u001a\u00020\u00188\u0016X\u0005¢\u0006\u0006\u001a\u0004\b%\u0010fR\u0014\u0010k\u001a\u00020h8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\n8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/ingka/ikea/shoppableimage/impl/presentation/ShoppableImageFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "LjC/h;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "Landroidx/fragment/app/t;", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "a0", "(Landroidx/fragment/app/t;ZZZZ)V", "Landroidx/fragment/app/o;", "c0", "(Landroidx/fragment/app/o;ZZZZ)V", "Landroidx/fragment/app/DialogFragment;", "d", "(Landroidx/fragment/app/DialogFragment;ZZZZ)V", "Lkotlin/Function1;", "LjC/q;", "block", "b", "(LnI/l;)V", "LEo/a;", "Y", "LEo/a;", "K0", "()LEo/a;", "setChromeTabsApi$shoppableimage_implementation_release", "(LEo/a;)V", "chromeTabsApi", "Liq/a;", "Z", "Liq/a;", "M0", "()Liq/a;", "setEnergyLabelNavigation$shoppableimage_implementation_release", "(Liq/a;)V", "energyLabelNavigation", "LPA/a;", "y0", "LPA/a;", "Q0", "()LPA/a;", "setShoppableImageNavigation$shoppableimage_implementation_release", "(LPA/a;)V", "shoppableImageNavigation", "LQA/d;", "z0", "LQA/d;", "R0", "()LQA/d;", "setShoppingListNavigation$shoppableimage_implementation_release", "(LQA/d;)V", "shoppingListNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "A0", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "N0", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "LZw/a;", "B0", "LZw/a;", "O0", "()LZw/a;", "setPipNavigation$shoppableimage_implementation_release", "(LZw/a;)V", "pipNavigation", "Lrx/b;", "C0", "Lrx/b;", "P0", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "", "Ljava/lang/String;", "L0", "()Ljava/lang/String;", "destId", "LNA/c0;", "E0", "LXH/o;", "S0", "()LNA/c0;", "viewModel", "LKA/c;", "F0", "LnI/l;", "handleUiEvents", "LOp/c1;", "G0", "handleItemEvents", "()LjC/q;", "systemUi", "LjC/a;", "e0", "()LjC/a;", "drawUnderConfig", "j0", "()Z", "isSystemUiInstalled", "shoppableimage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShoppableImageFragment extends a implements h {

    /* renamed from: A0  reason: collision with root package name */
    public ListPickerNavigation f120266A0;

    /* renamed from: B0  reason: collision with root package name */
    public Zw.a f120267B0;

    /* renamed from: C0  reason: collision with root package name */
    public C15005b f120268C0;

    /* renamed from: D0  reason: collision with root package name */
    private final String f120269D0 = "shoppable_image?shoppableImageId={shoppableImageId}&shoppableImageType={shoppableImageType}";

    /* renamed from: E0  reason: collision with root package name */
    private final C16824o f120270E0;

    /* renamed from: F0  reason: collision with root package name */
    private final C17642l<C13125c, C16807N> f120271F0;

    /* renamed from: G0  reason: collision with root package name */
    private final C17642l<c1, C16807N> f120272G0;

    /* renamed from: X  reason: collision with root package name */
    private final /* synthetic */ h f120273X = p.a();

    /* renamed from: Y  reason: collision with root package name */
    public Eo.a f120274Y;

    /* renamed from: Z  reason: collision with root package name */
    public C11411a f120275Z;

    /* renamed from: y0  reason: collision with root package name */
    public C13331a f120276y0;

    /* renamed from: z0  reason: collision with root package name */
    public C13352d f120277z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120278c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C5187o oVar) {
            super(0);
            this.f120278c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120278c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120279c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17631a aVar) {
            super(0);
            this.f120279c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120279c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120280c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16824o oVar) {
            super(0);
            this.f120280c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120280c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120281c = aVar;
            this.f120282d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120281c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120282d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120283c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120283c = oVar;
            this.f120284d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120284d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120283c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ShoppableImageFragment() {
        C16824o a10 = C16825p.a(s.NONE, new b(new a(this)));
        this.f120270E0 = W.b(this, P.b(c0.class), new c(a10), new d((C17631a) null, a10), new e(this, a10));
        this.f120271F0 = new C13246e(this);
        this.f120272G0 = new C13247f(this);
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(ShoppableImageFragment shoppableImageFragment, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            String b10 = cVar != null ? cVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            shoppableImageFragment.S0().M(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10));
        }
        return C16807N.f139792a;
    }

    private final c0 S0() {
        return (c0) this.f120270E0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(ShoppableImageFragment shoppableImageFragment, c1 c1Var) {
        String str;
        char c10;
        char c11;
        char c12;
        String str2;
        ShoppableImageFragment shoppableImageFragment2 = shoppableImageFragment;
        c1 c1Var2 = c1Var;
        C17542s.j(c1Var2, "event");
        if (c1Var2 instanceof c1.c) {
            C8951o f10 = f.f(shoppableImageFragment2, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C11411a.C2225a.a(shoppableImageFragment.M0(), f10, ((c1.c) c1Var2).a(), (C11412b) null, 4, (Object) null);
            }
        } else if (c1Var2 instanceof c1.d) {
            c1.d dVar = (c1.d) c1Var2;
            ListPickerNavigation.Operation.AddOrRemove addOrRemove = new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.SHOPPABLE_IMAGE, k.BUTTON), 4, (DefaultConstructorMarker) null);
            C8951o f11 = f.f(shoppableImageFragment2, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                ListPickerNavigation.a.a(shoppableImageFragment.N0(), f11, addOrRemove, (String) null, 4, (Object) null);
            }
        } else if (c1Var2 instanceof c1.e) {
            C8951o f12 = f.f(shoppableImageFragment2, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f12 != null) {
                shoppableImageFragment.O0().a(f12, ((c1.e) c1Var2).a(), Interaction$Component.SHOPPABLE_IMAGE);
            }
        } else if (c1Var2 instanceof c1.b) {
            C8951o f13 = f.f(shoppableImageFragment2, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f13 != null) {
                shoppableImageFragment.P0().h(f13, ((c1.b) c1Var2).a(), C15004a.LIST_CART_ACTIONS);
            }
        } else if (c1Var2 instanceof c1.f) {
            Link a10 = ((c1.f) c1Var2).a();
            if (a10 instanceof Link.External) {
                shoppableImageFragment.K0().a(shoppableImageFragment.requireActivity(), ((Link.External) a10).e());
            } else {
                char c13 = '$';
                if (a10 instanceof Link.Deeplink) {
                    try {
                        C8951o f14 = f.f(shoppableImageFragment2, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
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
                                String name = shoppableImageFragment.getClass().getName();
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
                            ShoppableImageFragment shoppableImageFragment3 = shoppableImageFragment;
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
                                str2 = shoppableImageFragment.getClass().getName();
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
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(ShoppableImageFragment shoppableImageFragment, C13125c cVar) {
        C17542s.j(cVar, "event");
        if (C17542s.e(cVar, C13125c.a.f111474a)) {
            C8951o f10 = f.f(shoppableImageFragment, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                f10.k0();
            }
        } else if (cVar instanceof C13125c.C2711c) {
            C8951o f11 = f.f(shoppableImageFragment, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                shoppableImageFragment.O0().a(f11, ((C13125c.C2711c) cVar).a(), Interaction$Component.SHOPPABLE_IMAGE);
            }
        } else if (cVar instanceof C13125c.b) {
            C8951o f12 = f.f(shoppableImageFragment, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f12 != null) {
                shoppableImageFragment.Q0().j(f12, ((C13125c.b) cVar).a(), C13331a.b.INSPIRATION);
            }
        } else if (cVar instanceof C13125c.d) {
            C8951o f13 = f.f(shoppableImageFragment, shoppableImageFragment.L0(), (C17642l) null, 2, (Object) null);
            if (f13 != null) {
                C13352d.a.a(shoppableImageFragment.R0(), f13, ((C13125c.d) cVar).a(), false, (C) null, 8, (Object) null);
            }
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r9, int r10) {
        /*
            r8 = this;
            r0 = -1955447643(0xffffffff8b723ca5, float:-4.6653129E-32)
            r9.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageFragment.FragmentContent (ShoppableImageFragment.kt:69)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0012:
            NA.c0 r10 = r8.S0()
            nI.l<Op.c1, XH.N> r0 = r8.f120272G0
            nI.l<KA.c, XH.N> r1 = r8.f120271F0
            r2 = 0
            NA.C13236U.z0(r10, r0, r1, r9, r2)
            U0.I0 r10 = Vo.b.c()
            java.lang.Object r10 = r9.Q(r10)
            androidx.fragment.app.o r10 = (androidx.fragment.app.C5187o) r10
            r0 = -2002091845(0xffffffff88aa80bb, float:-1.0261767E-33)
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
            java.lang.String r3 = r8.L0()
            r10 = -2002083623(0xffffffff88aaa0d9, float:-1.0269318E-33)
            r9.W(r10)
            boolean r10 = r9.F(r8)
            java.lang.Object r0 = r9.D()
            if (r10 != 0) goto L_0x0061
            java.lang.Object r10 = r1.a()
            if (r0 != r10) goto L_0x0069
        L_0x0061:
            NA.g r0 = new NA.g
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
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageFragment.D0(U0.m, int):void");
    }

    public final Eo.a K0() {
        Eo.a aVar = this.f120274Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabsApi");
        return null;
    }

    public String L0() {
        return this.f120269D0;
    }

    public final C11411a M0() {
        C11411a aVar = this.f120275Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final ListPickerNavigation N0() {
        ListPickerNavigation listPickerNavigation = this.f120266A0;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final Zw.a O0() {
        Zw.a aVar = this.f120267B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C15005b P0() {
        C15005b bVar = this.f120268C0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public final C13331a Q0() {
        C13331a aVar = this.f120276y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("shoppableImageNavigation");
        return null;
    }

    public final C13352d R0() {
        C13352d dVar = this.f120277z0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("shoppingListNavigation");
        return null;
    }

    public q Z() {
        return this.f120273X.Z();
    }

    public void a0(C5191t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(tVar, "<this>");
        this.f120273X.a0(tVar, z10, z11, z12, z13);
    }

    public void b(C17642l<? super q, C16807N> lVar) {
        C17542s.j(lVar, "block");
        this.f120273X.b(lVar);
    }

    public void c0(C5187o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(oVar, "<this>");
        this.f120273X.c0(oVar, z10, z11, z12, z13);
    }

    public void d(DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(dialogFragment, "<this>");
        this.f120273X.d(dialogFragment, z10, z11, z12, z13);
    }

    public C14614a e0() {
        return this.f120273X.e0();
    }

    public boolean j0() {
        return this.f120273X.j0();
    }
}
