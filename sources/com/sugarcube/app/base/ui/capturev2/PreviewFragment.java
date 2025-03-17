package com.sugarcube.app.base.ui.capturev2;

import QE.C13441s;
import XH.C16807N;
import XH.C16818i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.L;
import com.squareup.picasso.t;
import com.sugarcube.core.analytics.Trackable;
import hF.C14540b;
import hF.C14542d;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0014X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/PreviewFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LQE/s;", "binding", "H0", "(LQE/s;)LQE/s;", "L0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewFragment extends Hilt_PreviewFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123552M = C14540b.PanoPreview;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f123553a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f123553a = lVar;
        }

        public final C16818i<?> c() {
            return this.f123553a;
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
            this.f123553a.invoke(obj);
        }
    }

    private final C13441s H0(C13441s sVar) {
        sVar.f114701e.setEnabled(false);
        sVar.f114700d.setVisibility(4);
        sVar.f114702f.setVisibility(0);
        n0().J0();
        n0().k1().observe(getViewLifecycleOwner(), new a(new C14227p0(this, sVar)));
        return sVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(PreviewFragment previewFragment, C13441s sVar, File file) {
        if (file != null) {
            t c10 = previewFragment.n0().o1().c();
            c10.k(file);
            c10.m(file).h().d(sVar.f114703g);
            sVar.f114701e.setEnabled(true);
            sVar.f114700d.setVisibility(0);
            sVar.f114702f.setVisibility(8);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void J0(PreviewFragment previewFragment, C13441s sVar, View view) {
        BaseFragment.z0(previewFragment, C14542d.Continue, (Trackable) null, 2, (Object) null);
        C17542s.g(sVar);
        previewFragment.L0(sVar);
    }

    /* access modifiers changed from: private */
    public static final void K0(PreviewFragment previewFragment, View view) {
        BaseFragment.z0(previewFragment, C14542d.Retry, (Trackable) null, 2, (Object) null);
        previewFragment.n0().F1();
    }

    private final C13441s L0(C13441s sVar) {
        sVar.f114701e.setEnabled(false);
        sVar.f114702f.setVisibility(0);
        n0().E1();
        return sVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13441s c10 = C13441s.c(layoutInflater, viewGroup, false);
        C17542s.g(c10);
        H0(c10);
        c10.f114701e.setOnClickListener(new C14223n0(this, c10));
        c10.f114699c.setOnClickListener(new C14225o0(this));
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123552M;
    }
}
