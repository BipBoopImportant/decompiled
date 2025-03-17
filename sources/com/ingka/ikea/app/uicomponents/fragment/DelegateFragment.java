package com.ingka.ikea.app.uicomponents.fragment;

import Lg.d;
import Uo.a;
import XH.C16807N;
import al.C11067a;
import al.C11068b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5191t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl.C11144a;
import com.google.android.material.appbar.AppBarLayout;
import com.ingka.ikea.core.android.fragments.BaseFragment;
import com.ingka.ikea.core.android.view.BackButton;
import gl.C11311c;
import il.C11401a;
import jC.C14617d;
import jC.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C10025b;
import tK.C18010a;
import u2.C6012a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H$¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0003R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0014X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\u00020\u00178\u0014XD¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010?\u001a\u00020\u00178\u0014XD¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u0014\u0010C\u001a\u00020@8$X¤\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00048DX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0006R\u0014\u0010H\u001a\u00020%8DX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u001a8DX\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/fragment/DelegateFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "<init>", "()V", "LLg/d;", "G0", "()LLg/d;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Landroidx/recyclerview/widget/RecyclerView;", "E0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "N0", "showingSoftInput", "P0", "(Z)V", "onDestroyView", "O", "LLg/d;", "_listAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "P", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_listLayoutManager", "Q", "Landroidx/recyclerview/widget/RecyclerView;", "_recyclerView", "R", "Landroid/view/View;", "_loadingBar", "", "S", "I", "F0", "()I", "backgroundColor", "T", "Z", "v0", "()Z", "drawUnderStatusBar", "U", "Ljava/lang/Integer;", "softInputMode", "X", "H0", "excludeLastItemDecoration", "", "L0", "()Ljava/lang/String;", "pageTitle", "I0", "listAdapter", "J0", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "M0", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "K0", "()Landroid/view/View;", "loadingBar", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DelegateFragment extends BaseFragment {

    /* renamed from: O  reason: collision with root package name */
    private d f92682O;

    /* renamed from: P  reason: collision with root package name */
    private LinearLayoutManager f92683P;

    /* renamed from: Q  reason: collision with root package name */
    private RecyclerView f92684Q;

    /* renamed from: R  reason: collision with root package name */
    private View f92685R;

    /* renamed from: S  reason: collision with root package name */
    private final int f92686S = C18010a.f147420d;

    /* renamed from: T  reason: collision with root package name */
    private final boolean f92687T = true;

    /* renamed from: U  reason: collision with root package name */
    private Integer f92688U;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f92689X;

    /* access modifiers changed from: private */
    public static final C16807N O0(View view, q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(a.f88320a);
        C17542s.g(appBarLayout);
        qVar.e(appBarLayout, C14617d.Padding);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void E0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new C11144a(0, C6012a.c(recyclerView.getContext(), C10025b.f75261c), H0(), false, 9, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public int F0() {
        return this.f92686S;
    }

    /* access modifiers changed from: protected */
    public abstract d G0();

    /* access modifiers changed from: protected */
    public boolean H0() {
        return this.f92689X;
    }

    /* access modifiers changed from: protected */
    public final d I0() {
        d dVar = this.f92682O;
        C17542s.g(dVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public final LinearLayoutManager J0() {
        LinearLayoutManager linearLayoutManager = this.f92683P;
        C17542s.g(linearLayoutManager);
        return linearLayoutManager;
    }

    /* access modifiers changed from: protected */
    public final View K0() {
        View view = this.f92685R;
        C17542s.g(view);
        return view;
    }

    /* access modifiers changed from: protected */
    public abstract String L0();

    /* access modifiers changed from: protected */
    public final RecyclerView M0() {
        RecyclerView recyclerView = this.f92684Q;
        C17542s.g(recyclerView);
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    public abstract void N0();

    /* access modifiers changed from: protected */
    public final void P0(boolean z10) {
        Window window;
        Integer num = this.f92688U;
        if (num != null) {
            int intValue = num.intValue();
            if (z10) {
                intValue = 32;
            }
            C5191t activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(C11068b.f90320h, viewGroup, false);
    }

    public void onDestroyView() {
        P0(false);
        this.f92682O = null;
        this.f92683P = null;
        this.f92684Q = null;
        this.f92685R = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        N0();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.getWindow()).getAttributes();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r1 = this;
            super.onResume()
            androidx.fragment.app.t r0 = r1.getActivity()
            if (r0 == 0) goto L_0x001c
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x001c
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.softInputMode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r1.f92688U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.uicomponents.fragment.DelegateFragment.onResume():void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        b(new C11311c(view));
        view.setBackgroundResource(F0());
        setHasOptionsMenu(true);
        this.f92682O = G0();
        this.f92684Q = (RecyclerView) view.findViewById(C11067a.f90295i);
        this.f92685R = view.findViewById(C11067a.f90303q);
        this.f92683P = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView M02 = M0();
        M02.setLayoutManager(J0());
        M02.setAdapter(I0());
        E0(M02);
        M02.setItemAnimator(new C11401a());
        View findViewById = view.findViewById(a.f88327h);
        C17542s.i(findViewById, "findViewById(...)");
        BaseFragment.C0(this, (Toolbar) findViewById, L0(), BackButton.BACK, (BaseFragment.a) null, (View.OnClickListener) null, (View.OnClickListener) null, 56, (Object) null);
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f92687T;
    }
}
