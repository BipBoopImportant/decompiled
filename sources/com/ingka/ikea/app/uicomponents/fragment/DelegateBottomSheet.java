package com.ingka.ikea.app.uicomponents.fragment;

import Lg.d;
import al.C11067a;
import al.C11068b;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl.C11144a;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import il.C11401a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C10025b;
import u2.C6012a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0014XD¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00048DX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0006R\u0014\u0010/\u001a\u00020\u001b8DX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00148DX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/fragment/DelegateBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "LLg/d;", "y0", "()LLg/d;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "x0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDestroyView", "L", "LLg/d;", "_listAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "M", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_listLayoutManager", "N", "Landroidx/recyclerview/widget/RecyclerView;", "_recyclerView", "O", "Landroid/view/View;", "_loadingBar", "", "P", "Z", "z0", "()Z", "excludeLastItemDecoration", "A0", "listAdapter", "B0", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "C0", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DelegateBottomSheet extends BaseBottomSheetDialogFragment {

    /* renamed from: L  reason: collision with root package name */
    private d f92672L;

    /* renamed from: M  reason: collision with root package name */
    private LinearLayoutManager f92673M;

    /* renamed from: N  reason: collision with root package name */
    private RecyclerView f92674N;

    /* renamed from: O  reason: collision with root package name */
    private View f92675O;

    /* renamed from: P  reason: collision with root package name */
    private final boolean f92676P;

    /* access modifiers changed from: protected */
    public final d A0() {
        d dVar = this.f92672L;
        C17542s.g(dVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public final LinearLayoutManager B0() {
        LinearLayoutManager linearLayoutManager = this.f92673M;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: protected */
    public final RecyclerView C0() {
        RecyclerView recyclerView = this.f92674N;
        C17542s.g(recyclerView);
        return recyclerView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(C11068b.f90316d, viewGroup, false);
    }

    public void onDestroyView() {
        this.f92672L = null;
        this.f92673M = null;
        this.f92674N = null;
        this.f92675O = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f92672L = y0();
        this.f92674N = (RecyclerView) view.findViewById(C11067a.f90295i);
        this.f92675O = view.findViewById(C11067a.f90303q);
        this.f92673M = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView C02 = C0();
        C02.setLayoutManager(B0());
        C02.setAdapter(A0());
        x0(C02);
        C02.setItemAnimator(new C11401a());
    }

    /* access modifiers changed from: protected */
    public void x0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new C11144a(0, C6012a.c(recyclerView.getContext(), C10025b.f75261c), z0(), false, 9, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public abstract d y0();

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f92676P;
    }
}
