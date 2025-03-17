package com.ingka.ikea.app.productinformationpage.ui.sections;

import HJ.C15854t;
import Rh.h;
import Xh.o;
import Xh.p;
import Xh.q;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5191t;
import androidx.navigation.fragment.a;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.core.logger.DslKt;
import ii.t0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0013H%¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00168DX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/ui/sections/SectionBaseFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "<init>", "()V", "LXH/N;", "L0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "H0", "()I", "LRh/h;", "R", "LRh/h;", "_binding", "Ljava/lang/Runnable;", "S", "Ljava/lang/Runnable;", "runnable", "G0", "()LRh/h;", "binding", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SectionBaseFragment extends Hilt_SectionBaseFragment {

    /* renamed from: R  reason: collision with root package name */
    private h f72133R;

    /* renamed from: S  reason: collision with root package name */
    private final Runnable f72134S = new o(this);

    /* access modifiers changed from: private */
    public static final void I0(SectionBaseFragment sectionBaseFragment, View view) {
        a.a(sectionBaseFragment).k0();
    }

    /* access modifiers changed from: private */
    public static final void J0(SectionBaseFragment sectionBaseFragment, View view) {
        RecyclerView recyclerView;
        h hVar = sectionBaseFragment.f72133R;
        if (hVar != null && (recyclerView = hVar.f63241d) != null) {
            recyclerView.F1(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void K0(SectionBaseFragment sectionBaseFragment) {
        sectionBaseFragment.G0().f63239b.setVisibility(0);
    }

    private final void L0() {
        C5191t activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Activity not AppCompatActivity ");
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
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
            return;
        }
        androidx.appcompat.app.a supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A(getString(H0()));
        }
    }

    /* access modifiers changed from: protected */
    public final h G0() {
        h hVar = this.f72133R;
        C17542s.g(hVar);
        return hVar;
    }

    /* access modifiers changed from: protected */
    public abstract int H0();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f72133R = h.c(layoutInflater, viewGroup, false);
        return G0().getRoot();
    }

    public void onDestroyView() {
        super.onDestroyView();
        G0().getRoot().removeCallbacks(this.f72134S);
        this.f72133R = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) G0().getRoot().findViewById(Uo.a.f88327h);
        C17542s.g(toolbar);
        t0.h(this, toolbar, new p(this), new q(this));
        L0();
    }
}
