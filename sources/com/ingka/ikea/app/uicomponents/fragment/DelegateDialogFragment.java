package com.ingka.ikea.app.uicomponents.fragment;

import Lg.d;
import Oo.b;
import Uo.a;
import XH.C16824o;
import XH.C16825p;
import al.C11067a;
import al.C11068b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import cl.C11144a;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import gl.C11309a;
import gl.C11310b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C10025b;
import lg.f;
import u2.C6012a;
import uK.C18146a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010\u0003R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\u0004\u0018\u0001028TX\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002028$X¤\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020\u00048DX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\u0006R\u0014\u0010>\u001a\u00020'8DX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u001b8DX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/fragment/DelegateDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LLg/d;", "x0", "()LLg/d;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "B0", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "w0", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onDestroyView", "M", "LLg/d;", "_listAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "N", "Landroidx/recyclerview/widget/LinearLayoutManager;", "_listLayoutManager", "O", "Landroidx/recyclerview/widget/RecyclerView;", "_recyclerView", "Lcom/ingka/ikea/app/uicomponents/view/progress/HorizontalProgressView;", "P", "Lcom/ingka/ikea/app/uicomponents/view/progress/HorizontalProgressView;", "_progressBar", "", "Q", "LXH/o;", "A0", "()Ljava/lang/String;", "navigationContentDescription", "C0", "pageTitle", "y0", "listAdapter", "z0", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "D0", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class DelegateDialogFragment extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private d f92677M;

    /* renamed from: N  reason: collision with root package name */
    private LinearLayoutManager f92678N;

    /* renamed from: O  reason: collision with root package name */
    private RecyclerView f92679O;

    /* renamed from: P  reason: collision with root package name */
    private HorizontalProgressView f92680P;

    /* renamed from: Q  reason: collision with root package name */
    private final C16824o f92681Q = C16825p.b(new C11309a(this));

    /* access modifiers changed from: private */
    public static final String E0(DelegateDialogFragment delegateDialogFragment) {
        return delegateDialogFragment.getString(b.f84665i);
    }

    /* access modifiers changed from: private */
    public static final void F0(DelegateDialogFragment delegateDialogFragment, View view) {
        delegateDialogFragment.dismiss();
    }

    /* access modifiers changed from: protected */
    public String A0() {
        return (String) this.f92681Q.getValue();
    }

    /* access modifiers changed from: protected */
    public Drawable B0(Context context) {
        C17542s.j(context, "context");
        return C6012a.e(context, C18146a.f148142M2);
    }

    /* access modifiers changed from: protected */
    public abstract String C0();

    /* access modifiers changed from: protected */
    public final RecyclerView D0() {
        RecyclerView recyclerView = this.f92679O;
        C17542s.g(recyclerView);
        return recyclerView;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(C11068b.f90320h, viewGroup, false);
    }

    public void onDestroyView() {
        this.f92677M = null;
        this.f92679O = null;
        this.f92678N = null;
        this.f92680P = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        dismiss();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.f92677M = x0();
        this.f92679O = (RecyclerView) view.findViewById(C11067a.f90295i);
        this.f92678N = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView D02 = D0();
        D02.setLayoutManager(z0());
        D02.setAdapter(y0());
        w0(D02);
        g gVar = new g();
        gVar.setSupportsChangeAnimations(false);
        D02.setItemAnimator(gVar);
        Toolbar toolbar = (Toolbar) view.findViewById(a.f88327h);
        toolbar.setTitle((CharSequence) C0());
        Context context = view.getContext();
        C17542s.i(context, "getContext(...)");
        toolbar.setNavigationIcon(B0(context));
        toolbar.setNavigationContentDescription((CharSequence) A0());
        toolbar.setNavigationOnClickListener(new C11310b(this));
        this.f92680P = (HorizontalProgressView) view.findViewById(C11067a.f90303q);
    }

    /* access modifiers changed from: protected */
    public void w0(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "view");
        recyclerView.j(new C11144a(0, C6012a.c(recyclerView.getContext(), C10025b.f75261c), false, false, 13, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    public abstract d x0();

    /* access modifiers changed from: protected */
    public final d y0() {
        d dVar = this.f92677M;
        C17542s.g(dVar);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public final LinearLayoutManager z0() {
        LinearLayoutManager linearLayoutManager = this.f92678N;
        C17542s.g(linearLayoutManager);
        return linearLayoutManager;
    }
}
