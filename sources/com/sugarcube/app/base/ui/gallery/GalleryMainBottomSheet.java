package com.sugarcube.app.base.ui.gallery;

import AF.C12603x;
import C4.j;
import DF.C12754C;
import Ea.C9072f;
import JF.C13084F;
import JF.C13115w;
import OE.n;
import QE.C13421B;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import cF.C14043e;
import cF.C14044f;
import cF.C14045g;
import cF.C14047i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.decorate.DecorateCompatibilityProvider;
import com.sugarcube.app.base.navigation.Kreativ;
import fI.C17221b;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import x4.C8948l;
import x4.C8951o;
import x4.v;
import xF.S;
import xF.T;
import xF.U;
import xF.V;
import xF.X;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8FX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryMainBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "LXH/N;", "B0", "A0", "E0", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "J", "Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "D0", "()Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "setDecorateCompatibilityProvider", "(Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;)V", "decorateCompatibilityProvider", "LDF/C;", "K", "LXH/o;", "F0", "()LDF/C;", "viewModel", "LQE/B;", "L", "LQE/B;", "C0", "()LQE/B;", "M0", "(LQE/B;)V", "binding", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "M", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryMainBottomSheet extends Hilt_GalleryMainBottomSheet {

    /* renamed from: J  reason: collision with root package name */
    public DecorateCompatibilityProvider f124245J;

    /* renamed from: K  reason: collision with root package name */
    private final C16824o f124246K;

    /* renamed from: L  reason: collision with root package name */
    public C13421B f124247L;

    /* renamed from: M  reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f124248M;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryMainBottomSheet$a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "DESIGN_SCENE", "DELETE_SCENE", "GET_DESKTOP_LINK", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        DESIGN_SCENE,
        DELETE_SCENE,
        GET_DESKTOP_LINK;
        
        public static final C3051a Companion = null;
        public static final String REQUEST_KEY = "GalleryMainBotomSheetOption";

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryMainBottomSheet$a$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet$a$a  reason: collision with other inner class name */
        public static final class C3051a {
            public /* synthetic */ C3051a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C3051a() {
            }
        }

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new C3051a((DefaultConstructorMarker) null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124249a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                AF.x[] r0 = AF.C12603x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AF.x r1 = AF.C12603x.SCENE_READY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                AF.x r1 = AF.C12603x.SCENE_EXISTING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                AF.x r1 = AF.C12603x.SCENE_PROCESSING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                AF.x r1 = AF.C12603x.SCENE_UPLOADING_PENDING     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                AF.x r1 = AF.C12603x.SCENE_UPLOADING_PENDING_LOGIN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                AF.x r1 = AF.C12603x.SCENE_FAILED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f124249a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124250a;

        public c(C5187o oVar) {
            this.f124250a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124250a);
            int g10 = j.g(Kreativ.INSTANCE.serializer());
            Class<Kreativ> cls = Kreativ.class;
            if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
                List value = a10.G().getValue();
                ListIterator listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (((C8948l) obj).e().x() == g10) {
                        break;
                    }
                }
                C8948l lVar = (C8948l) obj;
                if (lVar != null) {
                    return lVar;
                }
                throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
    }

    public GalleryMainBottomSheet() {
        C16824o b10 = C16825p.b(new c(this));
        this.f124246K = W.b(this, P.b(C12754C.class), new C14045g(b10), new C14043e(b10), new C14044f(this, b10));
    }

    private final void A0() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f124248M;
        if (bottomSheetBehavior == null) {
            C17542s.z("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(5);
        if (F0().u1() != null) {
            C14047i.a(this, a.DELETE_SCENE, a.REQUEST_KEY);
        }
    }

    private final void B0() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f124248M;
        if (bottomSheetBehavior == null) {
            C17542s.z("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(5);
        if (F0().u1() != null) {
            C14047i.a(this, a.DESIGN_SCENE, a.REQUEST_KEY);
        }
    }

    private final void E0() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f124248M;
        if (bottomSheetBehavior == null) {
            C17542s.z("bottomSheetBehavior");
            bottomSheetBehavior = null;
        }
        bottomSheetBehavior.X0(5);
        Scene u12 = F0().u1();
        if (u12 != null) {
            C5191t activity = getActivity();
            if (activity != null) {
                C13115w.d(activity, F0().M1(), u12.getSceneUuid());
            }
            C14047i.a(this, a.GET_DESKTOP_LINK, a.REQUEST_KEY);
        }
    }

    /* access modifiers changed from: private */
    public static final void G0(GalleryMainBottomSheet galleryMainBottomSheet, DialogInterface dialogInterface) {
        C17542s.h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.a) dialogInterface).findViewById(C9072f.f59488f);
        if (frameLayout != null) {
            galleryMainBottomSheet.f124248M = BottomSheetBehavior.q0(frameLayout);
        }
    }

    /* access modifiers changed from: private */
    public static final void H0(GalleryMainBottomSheet galleryMainBottomSheet, View view) {
        galleryMainBottomSheet.B0();
    }

    /* access modifiers changed from: private */
    public static final void I0(GalleryMainBottomSheet galleryMainBottomSheet, View view) {
        C5191t activity = galleryMainBottomSheet.getActivity();
        if (activity != null) {
            C13084F.o(activity, n.f113363f4, n.f113356e4, new XH.v(galleryMainBottomSheet.getString(n.f113365g), new xF.W(galleryMainBottomSheet)), new XH.v(galleryMainBottomSheet.getString(n.f113351e), new X()), false, 16, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(GalleryMainBottomSheet galleryMainBottomSheet) {
        galleryMainBottomSheet.A0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void L0(GalleryMainBottomSheet galleryMainBottomSheet, View view) {
        galleryMainBottomSheet.E0();
    }

    public final C13421B C0() {
        C13421B b10 = this.f124247L;
        if (b10 != null) {
            return b10;
        }
        C17542s.z("binding");
        return null;
    }

    public final DecorateCompatibilityProvider D0() {
        DecorateCompatibilityProvider decorateCompatibilityProvider = this.f124245J;
        if (decorateCompatibilityProvider != null) {
            return decorateCompatibilityProvider;
        }
        C17542s.z("decorateCompatibilityProvider");
        return null;
    }

    public final C12754C F0() {
        return (C12754C) this.f124246K.getValue();
    }

    public final void M0(C13421B b10) {
        C17542s.j(b10, "<set-?>");
        this.f124247L = b10;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C17542s.h(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new V(this));
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        C17542s.j(layoutInflater, "inflater");
        if (Build.VERSION.SDK_INT >= 30) {
            Dialog dialog = getDialog();
            if (!(dialog == null || (window2 = dialog.getWindow()) == null)) {
                window2.setDecorFitsSystemWindows(false);
            }
        } else {
            Dialog dialog2 = getDialog();
            if (!(dialog2 == null || (window = dialog2.getWindow()) == null)) {
                window.setFlags(1024, 1024);
            }
        }
        M0(C13421B.c(layoutInflater, viewGroup, false));
        NestedScrollView b10 = C0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onStart() {
        super.onStart();
        ViewParent parent = requireView().getParent();
        C17542s.h(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior q02 = BottomSheetBehavior.q0((View) parent);
        C17542s.i(q02, "from(...)");
        q02.X0(3);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        C13421B C02 = C0();
        C02.f114324d.setVisibility(8);
        C02.f114325e.setVisibility(8);
        C02.f114323c.setVisibility(8);
        C12603x f12 = F0().f1();
        switch (f12 == null ? -1 : b.f124249a[f12.ordinal()]) {
            case 1:
            case 2:
                if (D0().isSupported()) {
                    C02.f114324d.setVisibility(0);
                    C02.f114324d.setOnClickListener(new S(this));
                }
                C02.f114325e.setVisibility(0);
                C02.f114323c.setVisibility(0);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                C02.f114323c.setVisibility(0);
                break;
        }
        C02.f114323c.setOnClickListener(new T(this));
        C02.f114325e.setOnClickListener(new U(this));
    }
}
