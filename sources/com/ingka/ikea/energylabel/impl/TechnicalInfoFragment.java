package com.ingka.ikea.energylabel.impl;

import Ar.j;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.TechnicalCompliance;
import il.C11402b;
import ip.k;
import iq.C11412b;
import java.util.ArrayList;
import jq.v;
import jq.w;
import jq.x;
import jq.y;
import jq.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10025b;
import nI.C17631a;
import nI.C17642l;
import qq.C11804a;
import rq.C11841a;
import u2.C6012a;
import x4.C8951o;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u00101\u001a\u00020,8\u0016XD¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00100R\u001b\u0010:\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/ingka/ikea/energylabel/impl/TechnicalInfoFragment;", "Lcom/ingka/ikea/energylabel/impl/SectionBaseFragment;", "", "<init>", "()V", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "technicalInformation", "LXH/N;", "Y0", "(Lcom/ingka/ikea/core/model/product/TechnicalCompliance;)V", "", "H0", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LEo/a;", "Y", "LEo/a;", "T0", "()LEo/a;", "setChromeTabApi", "(LEo/a;)V", "chromeTabApi", "Lrq/a;", "Z", "Lrq/a;", "V0", "()Lrq/a;", "setEnlargeImagesNavigation", "(Lrq/a;)V", "enlargeImagesNavigation", "LAr/j;", "y0", "LAr/j;", "W0", "()LAr/j;", "setFeedback$energylabel_implementation_release", "(LAr/j;)V", "feedback", "", "z0", "Ljava/lang/String;", "U0", "()Ljava/lang/String;", "destId", "A0", "LXH/o;", "S0", "argProductNo", "Ljq/j;", "B0", "X0", "()Ljq/j;", "viewModel", "Lcom/google/android/material/snackbar/Snackbar;", "C0", "Lcom/google/android/material/snackbar/Snackbar;", "snackBar", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TechnicalInfoFragment extends d {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f95707A0 = C16825p.b(new v(this));

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f95708B0;

    /* renamed from: C0  reason: collision with root package name */
    private Snackbar f95709C0;

    /* renamed from: Y  reason: collision with root package name */
    public Eo.a f95710Y;

    /* renamed from: Z  reason: collision with root package name */
    public C11841a f95711Z;

    /* renamed from: y0  reason: collision with root package name */
    public j f95712y0;

    /* renamed from: z0  reason: collision with root package name */
    private final String f95713z0 = "energy/information?productNo={productNo}";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f95714a;

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
                f95714a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.energylabel.impl.TechnicalInfoFragment.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f95715a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f95715a = lVar;
        }

        public final C16818i<?> c() {
            return this.f95715a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f95715a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95716c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f95716c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95716c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95717c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f95717c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95717c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95718c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f95718c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95718c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95719c = aVar;
            this.f95720d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95719c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95720d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95721c = oVar;
            this.f95722d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95722d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95721c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TechnicalInfoFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f95708B0 = W.b(this, P.b(jq.j.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final String R0(TechnicalInfoFragment technicalInfoFragment) {
        String string = technicalInfoFragment.requireArguments().getString("productNo");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String S0() {
        return (String) this.f95707A0.getValue();
    }

    private final jq.j X0() {
        return (jq.j) this.f95708B0.getValue();
    }

    private final void Y0(TechnicalCompliance technicalCompliance) {
        RecyclerView recyclerView = G0().f99476d;
        recyclerView.j(new C11402b(0, C6012a.c(requireContext(), C10025b.f75261c), 0, (Drawable) null, 13, (DefaultConstructorMarker) null));
        recyclerView.setAdapter(C11804a.C2420a.b(C11804a.f101922a, technicalCompliance, new y(this), new z(this), (C11412b) null, 8, (Object) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
    }

    /* access modifiers changed from: private */
    public static final C16807N Z0(TechnicalInfoFragment technicalInfoFragment, String str) {
        C17542s.j(str, "uri");
        technicalInfoFragment.T0().a(technicalInfoFragment.requireContext(), str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(TechnicalInfoFragment technicalInfoFragment, Image[] imageArr, int i10) {
        C17542s.j(imageArr, "list");
        C8951o f10 = rw.f.f(technicalInfoFragment, technicalInfoFragment.U0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C11841a V02 = technicalInfoFragment.V0();
            ArrayList arrayList = new ArrayList(imageArr.length);
            for (Image image : imageArr) {
                arrayList.add(new Media.Image(image.getUrl(), image.A0()));
            }
            V02.e(f10, (Media[]) arrayList.toArray(new Media[0]), i10);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b1(TechnicalInfoFragment technicalInfoFragment, k kVar) {
        int i10 = a.f95714a[kVar.c().ordinal()];
        if (i10 == 1) {
            technicalInfoFragment.G0().f99474b.setVisibility(0);
        } else if (i10 != 2) {
            technicalInfoFragment.G0().f99474b.setVisibility(8);
            technicalInfoFragment.f95709C0 = j.a.r(technicalInfoFragment.W0(), technicalInfoFragment.G0().getRoot(), Oo.b.f84321A3, Oo.b.f84750p7, -2, (View) null, new x(technicalInfoFragment), 16, (Object) null);
        } else {
            technicalInfoFragment.G0().f99474b.setVisibility(8);
            technicalInfoFragment.G0().f99476d.setVisibility(0);
            Object a10 = kVar.a();
            if (a10 != null) {
                technicalInfoFragment.Y0((TechnicalCompliance) a10);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c1(TechnicalInfoFragment technicalInfoFragment) {
        technicalInfoFragment.X0().D(technicalInfoFragment.S0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public int H0() {
        return Oo.b.f84426K8;
    }

    public final Eo.a T0() {
        Eo.a aVar = this.f95710Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabApi");
        return null;
    }

    public String U0() {
        return this.f95713z0;
    }

    public final C11841a V0() {
        C11841a aVar = this.f95711Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("enlargeImagesNavigation");
        return null;
    }

    public final j W0() {
        j jVar = this.f95712y0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onDestroyView() {
        Snackbar snackbar = this.f95709C0;
        if (snackbar != null) {
            snackbar.A();
            this.f95709C0 = null;
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        G0().f99476d.setVisibility(8);
        X0().C().observe(getViewLifecycleOwner(), new b(new w(this)));
        X0().D(S0());
    }
}
