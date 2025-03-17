package com.sugarcube.app.base.ui.gallery;

import C4.h;
import C4.j;
import DF.C12754C;
import JF.C13115w;
import JF.T;
import OE.C13315g;
import QE.C13446x;
import XH.C16807N;
import XH.C16816g;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import YH.X;
import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cF.C14040b;
import cF.C14043e;
import cF.C14044f;
import cF.C14045g;
import cF.C14046h;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.app.base.data.model.Design;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.core.network.models.Composition;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.C17642l;
import x4.C;
import x4.C8945i;
import x4.C8948l;
import x4.C8951o;
import x4.v;
import xF.C15230c;
import xF.C15232d;
import xF.C15234e;
import xF.C15236f;
import xF.C15238g;
import xF.C15240h;
import xF.C15242i;
import xF.C15244j;
import xF.C15246k;
import yF.C15305c;
import yF.C15306d;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J:\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8FX\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/sugarcube/app/base/ui/gallery/GalleryDetailFragment;", "Lcom/sugarcube/app/base/ui/BaseFragment;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "D0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroy", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/DeviceCompatibility;", "P", "Lcom/sugarcube/app/base/DeviceCompatibility;", "G0", "()Lcom/sugarcube/app/base/DeviceCompatibility;", "setDeviceCompatibility", "(Lcom/sugarcube/app/base/DeviceCompatibility;)V", "deviceCompatibility", "Landroid/content/ClipboardManager;", "Q", "Landroid/content/ClipboardManager;", "clipboardManager", "LDF/C;", "R", "LXH/o;", "H0", "()LDF/C;", "viewModel", "LyF/c;", "S", "LyF/c;", "viewModelAdapter", "LQE/x;", "T", "LQE/x;", "_binding", "Lcom/sugarcube/app/base/navigation/Kreativ$Gallery$Detail;", "E0", "()Lcom/sugarcube/app/base/navigation/Kreativ$Gallery$Detail;", "args", "F0", "()LQE/x;", "binding", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GalleryDetailFragment extends e implements SystemUiDelegate {

    /* renamed from: O  reason: collision with root package name */
    private final /* synthetic */ T f124175O = new T();

    /* renamed from: P  reason: collision with root package name */
    public DeviceCompatibility f124176P;

    /* renamed from: Q  reason: collision with root package name */
    private ClipboardManager f124177Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f124178R;

    /* renamed from: S  reason: collision with root package name */
    private C15305c f124179S;

    /* renamed from: T  reason: collision with root package name */
    private C13446x f124180T;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124181a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124181a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124181a;
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
            this.f124181a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f124182a;

        public b(C5187o oVar) {
            this.f124182a = oVar;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            Object obj;
            C8951o a10 = androidx.navigation.fragment.a.a(this.f124182a);
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

    public GalleryDetailFragment() {
        C16824o b10 = C16825p.b(new b(this));
        this.f124178R = W.b(this, P.b(C12754C.class), new C14045g(b10), new C14043e(b10), new C14044f(this, b10));
    }

    private final void D0() {
        C8951o a10 = androidx.navigation.fragment.a.a(this);
        int g10 = j.g(Kreativ.Gallery.Detail.Companion.serializer());
        if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
            a10.m0(g10, true, false);
            return;
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(Kreativ.Gallery.Detail.class).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    private final Kreativ.Gallery.Detail E0() {
        Object obj;
        C8951o a10 = androidx.navigation.fragment.a.a(this);
        int g10 = j.g(Kreativ.Gallery.Detail.Companion.serializer());
        Class<Kreativ.Gallery.Detail> cls = Kreativ.Gallery.Detail.class;
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
                Bundle c10 = lVar.c();
                if (c10 == null) {
                    c10 = new Bundle();
                }
                Map<String, C8945i> s10 = lVar.e().s();
                LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
                for (Map.Entry entry : s10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
                }
                return (Kreativ.Gallery.Detail) h.a(Kreativ.Gallery.Detail.Companion.serializer(), c10, linkedHashMap);
            }
            throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    private final C13446x F0() {
        C13446x xVar = this.f124180T;
        C17542s.g(xVar);
        return xVar;
    }

    /* access modifiers changed from: private */
    public static final void I0(GalleryDetailFragment galleryDetailFragment, View view) {
        galleryDetailFragment.D0();
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(GalleryDetailFragment galleryDetailFragment, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            galleryDetailFragment.H0().Q2();
            new Handler(Looper.getMainLooper()).postDelayed(new C15244j(galleryDetailFragment, intValue), 300);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void K0(GalleryDetailFragment galleryDetailFragment, int i10) {
        View view = galleryDetailFragment.getView();
        if (view != null) {
            String string = galleryDetailFragment.getResources().getString(i10);
            C17542s.i(string, "getString(...)");
            Snackbar q02 = Snackbar.q0(view, string, 0);
            C17542s.i(q02, "make(...)");
            View K10 = q02.K();
            C17542s.i(K10, "getView(...)");
            K10.setBackgroundColor(-16777216);
            q02.b0();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(GalleryDetailFragment galleryDetailFragment, Composition composition) {
        UUID x12;
        if (composition != null) {
            galleryDetailFragment.H0().R2();
            Composition t12 = galleryDetailFragment.H0().t1();
            if (!(t12 == null || (x12 = galleryDetailFragment.H0().x1()) == null)) {
                galleryDetailFragment.H0().p1().k();
                C8951o a10 = androidx.navigation.fragment.a.a(galleryDetailFragment);
                String uuid = x12.toString();
                C17542s.i(uuid, "toString(...)");
                String uuid2 = t12.getCompositionUuid().toString();
                int v12 = galleryDetailFragment.H0().v1();
                C.a aVar = new C.a();
                aVar.j(P.b(Kreativ.Gallery.Detail.class), true, false);
                C14040b.b(a10, uuid, uuid2, v12, false, (String) null, aVar.a(), 24, (Object) null);
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(GalleryDetailFragment galleryDetailFragment, Design design) {
        if (design != null) {
            galleryDetailFragment.H0().F0();
            C8951o a10 = androidx.navigation.fragment.a.a(galleryDetailFragment);
            String uuid = design.getUuid().toString();
            C17542s.i(uuid, "toString(...)");
            UUID compositionUUID = design.getCompositionUUID();
            if (!design.isShowroom()) {
                compositionUUID = null;
            }
            C14040b.b(a10, uuid, String.valueOf(compositionUUID), design.getRoomId(), true, (String) null, (C) null, 48, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void N0(GalleryDetailFragment galleryDetailFragment, View view) {
        galleryDetailFragment.H0().P1();
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(GalleryDetailFragment galleryDetailFragment, List list) {
        int size = list.size();
        Log.d(AnyKt.SUGARCUBE_TAG, "Refreshing comps " + size);
        C15305c cVar = galleryDetailFragment.f124179S;
        if (cVar == null) {
            C17542s.z("viewModelAdapter");
            cVar = null;
        }
        cVar.submitList(list);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(GalleryDetailFragment galleryDetailFragment, Boolean bool) {
        if (bool.booleanValue()) {
            galleryDetailFragment.D0();
        }
        return C16807N.f139792a;
    }

    public final DeviceCompatibility G0() {
        DeviceCompatibility deviceCompatibility = this.f124176P;
        if (deviceCompatibility != null) {
            return deviceCompatibility;
        }
        C17542s.z("deviceCompatibility");
        return null;
    }

    public final C12754C H0() {
        return (C12754C) this.f124178R.getValue();
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f124175O.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        UUID e10 = C14046h.e(E0().a());
        if (e10 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Scene UUID is not valid. Exiting GalleryDetailFragment.");
            Priority priority = Priority.ERROR;
            String message = illegalArgumentException.getMessage();
            String str = "";
            if (message == null) {
                message = str;
            }
            String b10 = C16816g.b(illegalArgumentException);
            if (b10 != null) {
                str = b10;
            }
            int i10 = C15246k.f132009a[priority.ordinal()];
            if (i10 == 1) {
                Log.v(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 2) {
                Log.d(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 3) {
                Log.i(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 4) {
                Log.w(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else if (i10 == 5) {
                Log.e(AnyKt.SUGARCUBE_TAG, message + " " + str);
            } else {
                throw new t();
            }
            androidx.navigation.fragment.a.a(this).k0();
            return new View(getContext());
        }
        H0().A2(e10);
        H0().k2(e10);
        C5191t activity = getActivity();
        C15305c cVar = null;
        this.f124177Q = (ClipboardManager) (activity != null ? activity.getSystemService("clipboard") : null);
        this.f124180T = C13446x.c(layoutInflater, viewGroup, false);
        F0().f114744b.f114550c.setNavigationOnClickListener(new C15230c(this));
        this.f124179S = new C15305c(H0(), viewGroup);
        String w12 = H0().w1();
        if (w12 != null) {
            F0().f114744b.f114550c.setTitle((CharSequence) w12);
            H0().p1().d();
        }
        RecyclerView recyclerView = F0().f114747e;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C15305c cVar2 = this.f124179S;
        if (cVar2 == null) {
            C17542s.z("viewModelAdapter");
        } else {
            cVar = cVar2;
        }
        recyclerView.setAdapter(cVar);
        recyclerView.j(new C15306d(recyclerView.getResources().getDimension(C13315g.f112818b)));
        H0().g1().observe(getViewLifecycleOwner(), new a(new C15232d(this)));
        if (G0().isDecorateSupported()) {
            FloatingActionButton floatingActionButton = F0().f114745c;
            floatingActionButton.setVisibility(0);
            floatingActionButton.setOnClickListener(new C15234e(this));
        }
        H0().J1().observe(getViewLifecycleOwner(), new a(new C15236f(this)));
        H0().O1().observe(getViewLifecycleOwner(), new a(new C15238g(this)));
        ConstraintLayout b11 = F0().getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onDestroy() {
        super.onDestroy();
        H0().A0();
    }

    public void onResume() {
        C5191t activity;
        super.onResume();
        H0().h2();
        Scene u12 = H0().u1();
        if (u12 != null && (activity = getActivity()) != null) {
            C13115w.a(activity, this.f124177Q, u12, H0().t1(), H0().L1(u12.getSceneUuid()), "GALLERY", H0().M1());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, -1, 12, (Object) null);
        H0().X0().observe(getViewLifecycleOwner(), new a(new C15240h(this)));
        H0().y1().observe(getViewLifecycleOwner(), new a(new C15242i(this)));
    }
}
