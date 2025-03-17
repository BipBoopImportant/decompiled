package com.ingka.ikea.energylabel.impl;

import Ar.j;
import HJ.C15854t;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.TechnicalCompliance;
import com.sugarcube.core.logger.DslKt;
import il.C11402b;
import ip.k;
import iq.C11412b;
import java.util.ArrayList;
import jq.C11445a;
import jq.C11446b;
import jq.C11447c;
import jq.C11448d;
import jq.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10025b;
import lq.C11561b;
import nI.C17631a;
import nI.C17642l;
import qq.C11804a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rq.C11841a;
import u2.C6012a;
import uK.C18146a;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0000@\u0000X.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010K\u001a\u00020F8\u0016XD¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010N\u001a\u00020F8BX\u0002¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010JR\u001d\u0010Q\u001a\u0004\u0018\u00010F8BX\u0002¢\u0006\f\n\u0004\bO\u0010>\u001a\u0004\bP\u0010JR\u0014\u0010T\u001a\u0002088BX\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/ingka/ikea/energylabel/impl/EnergyLabelDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "LXH/N;", "R0", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "technicalInformation", "M0", "(Lcom/ingka/ikea/core/model/product/TechnicalCompliance;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "L0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "onDestroyView", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LEo/a;", "P", "LEo/a;", "G0", "()LEo/a;", "setChromeTabApi", "(LEo/a;)V", "chromeTabApi", "Lrq/a;", "Q", "Lrq/a;", "I0", "()Lrq/a;", "setEnlargeImagesNavigation", "(Lrq/a;)V", "enlargeImagesNavigation", "LAr/j;", "R", "LAr/j;", "J0", "()LAr/j;", "setFeedback$energylabel_implementation_release", "(LAr/j;)V", "feedback", "Llq/b;", "S", "Llq/b;", "_binding", "Ljq/j;", "T", "LXH/o;", "K0", "()Ljq/j;", "viewModel", "Lcom/google/android/material/snackbar/Snackbar;", "U", "Lcom/google/android/material/snackbar/Snackbar;", "snackBar", "", "X", "Ljava/lang/String;", "H0", "()Ljava/lang/String;", "destId", "Y", "D0", "argProductNo", "Z", "E0", "argViewFilter", "F0", "()Llq/b;", "binding", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnergyLabelDialog extends b {

    /* renamed from: P  reason: collision with root package name */
    public Eo.a f95688P;

    /* renamed from: Q  reason: collision with root package name */
    public C11841a f95689Q;

    /* renamed from: R  reason: collision with root package name */
    public j f95690R;

    /* renamed from: S  reason: collision with root package name */
    private C11561b f95691S;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f95692T;

    /* renamed from: U  reason: collision with root package name */
    private Snackbar f95693U;

    /* renamed from: X  reason: collision with root package name */
    private final String f95694X = "energy/label?productNo={productNo}&viewFilter={viewFilter}";

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f95695Y = C16825p.b(new C11446b(this));

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f95696Z = C16825p.b(new C11447c(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f95697a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ip.k$e[] r0 = ip.k.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ip.k$e r1 = ip.k.e.LOADING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ip.k$e r1 = ip.k.e.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f95697a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.energylabel.impl.EnergyLabelDialog.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95698c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f95698c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95698c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95699c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f95699c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95699c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95700c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f95700c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95700c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95701c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95701c = aVar;
            this.f95702d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95701c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95702d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95703c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95703c = oVar;
            this.f95704d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95704d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95703c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EnergyLabelDialog() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f95692T = W.b(this, P.b(jq.j.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final String B0(EnergyLabelDialog energyLabelDialog) {
        String string = energyLabelDialog.requireArguments().getString("productNo");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final String C0(EnergyLabelDialog energyLabelDialog) {
        return energyLabelDialog.requireArguments().getString("viewFilter");
    }

    private final String D0() {
        return (String) this.f95695Y.getValue();
    }

    private final String E0() {
        return (String) this.f95696Z.getValue();
    }

    private final C11561b F0() {
        C11561b bVar = this.f95691S;
        C17542s.g(bVar);
        return bVar;
    }

    private final jq.j K0() {
        return (jq.j) this.f95692T.getValue();
    }

    private final void M0(TechnicalCompliance technicalCompliance) {
        C11412b bVar;
        RecyclerView recyclerView = F0().f99467b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.j(new C11402b(0, C6012a.c(recyclerView.getContext(), C10025b.f75261c), 0, (Drawable) null, 13, (DefaultConstructorMarker) null));
        C11804a.C2420a aVar = C11804a.f101922a;
        jq.f fVar = new jq.f(this);
        g gVar = new g(this, recyclerView);
        String E02 = E0();
        if (E02 == null || (bVar = C11412b.valueOf(E02)) == null) {
            bVar = C11412b.ALL;
        }
        recyclerView.setAdapter(aVar.a(technicalCompliance, fVar, gVar, bVar));
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(EnergyLabelDialog energyLabelDialog, RecyclerView recyclerView, Image[] imageArr, int i10) {
        C17542s.j(imageArr, "list");
        try {
            C8951o f10 = rw.f.f(energyLabelDialog, energyLabelDialog.H0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C11841a I02 = energyLabelDialog.I0();
                ArrayList arrayList = new ArrayList(imageArr.length);
                for (Image image : imageArr) {
                    arrayList.add(new Media.Image(image.getUrl(), image.A0()));
                }
                I02.e(f10, (Media[]) arrayList.toArray(new Media[0]), i10);
            }
        } catch (RuntimeException e10) {
            C17542s.g(recyclerView);
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList2) {
                if (str == null) {
                    String a10 = C11818a.a("Caught a navigation error from a non navigationUI fragment.", e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = recyclerView.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(EnergyLabelDialog energyLabelDialog, String str) {
        C17542s.j(str, "uri");
        energyLabelDialog.G0().a(energyLabelDialog.requireContext(), str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(EnergyLabelDialog energyLabelDialog, k kVar) {
        int i10 = a.f95697a[kVar.c().ordinal()];
        if (i10 == 1) {
            energyLabelDialog.F0().f99468c.setVisibility(0);
        } else if (i10 != 2) {
            energyLabelDialog.F0().f99468c.setVisibility(8);
            energyLabelDialog.f95693U = j.a.r(energyLabelDialog.J0(), energyLabelDialog.F0().getRoot(), Oo.b.f84321A3, Oo.b.f84750p7, -2, (View) null, new jq.e(energyLabelDialog), 16, (Object) null);
        } else {
            energyLabelDialog.F0().f99468c.setVisibility(8);
            energyLabelDialog.F0().f99467b.setVisibility(0);
            Object a10 = kVar.a();
            if (a10 != null) {
                energyLabelDialog.M0((TechnicalCompliance) a10);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(EnergyLabelDialog energyLabelDialog) {
        energyLabelDialog.K0().D(energyLabelDialog.D0());
        return C16807N.f139792a;
    }

    private final void R0() {
        Toolbar toolbar;
        setHasOptionsMenu(true);
        View view = getView();
        if (view != null && (toolbar = (Toolbar) view.findViewById(Uo.a.f88327h)) != null) {
            toolbar.setNavigationIcon(C18146a.f148142M2);
            toolbar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
            toolbar.setNavigationOnClickListener(new C11448d(this));
            toolbar.setTitle((CharSequence) getString(Oo.b.f84426K8));
        }
    }

    /* access modifiers changed from: private */
    public static final void S0(EnergyLabelDialog energyLabelDialog, View view) {
        energyLabelDialog.dismiss();
    }

    public final Eo.a G0() {
        Eo.a aVar = this.f95688P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabApi");
        return null;
    }

    public String H0() {
        return this.f95694X;
    }

    public final C11841a I0() {
        C11841a aVar = this.f95689Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enlargeImagesNavigation");
        return null;
    }

    public final j J0() {
        j jVar = this.f95690R;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    /* renamed from: L0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C11561b c10 = C11561b.c(layoutInflater, viewGroup, false);
        this.f95691S = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        C17542s.j(menu, "menu");
        C17542s.j(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }

    public void onDestroyView() {
        super.onDestroyView();
        Bundle bundle = Bundle.EMPTY;
        C17542s.i(bundle, "EMPTY");
        C5197z.c(this, "ENERGY_LABEL_DIALOG_DISMISSED", bundle);
        Snackbar snackbar = this.f95693U;
        if (snackbar != null) {
            snackbar.A();
            this.f95693U = null;
        }
        this.f95691S = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        R0();
        F0().f99467b.setVisibility(8);
        K0().C().observe(getViewLifecycleOwner(), new a(new C11445a(this)));
        K0().D(D0());
    }
}
