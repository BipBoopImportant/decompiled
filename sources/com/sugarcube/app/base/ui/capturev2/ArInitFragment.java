package com.sugarcube.app.base.ui.capturev2;

import QE.C13434k;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5222z;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hF.C14540b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ArInitFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "LXH/N;", "H0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "", "N", "Z", "isInitDone", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArInitFragment extends Hilt_ArInitFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123315M = C14540b.Init;

    /* renamed from: N  reason: collision with root package name */
    private boolean f123316N;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.ArInitFragment$onCreateView$1$2", f = "ArInitFragment.kt", l = {43}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123317c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13434k f123318d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArInitFragment f123319e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13434k kVar, ArInitFragment arInitFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123318d = kVar;
            this.f123319e = arInitFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123318d, this.f123319e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123317c;
            if (i10 == 0) {
                y.b(obj);
                this.f123318d.f114624d.setVisibility(8);
                long millis = TimeUnit.SECONDS.toMillis(this.f123319e.n0().S0());
                this.f123317c = 1;
                if (C16297b0.b(millis, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f123319e.H0();
            this.f123318d.f114624d.setVisibility(0);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void H0() {
        synchronized (this) {
            try {
                if (!this.f123316N) {
                    this.f123316N = true;
                    n0().B1();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void I0(ArInitFragment arInitFragment, View view) {
        arInitFragment.n0().B1();
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(ArInitFragment arInitFragment) {
        arInitFragment.H0();
        return C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13434k c10 = C13434k.c(layoutInflater, viewGroup, false);
        t0(true);
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114622b;
        C17542s.i(floatingActionButton, "cancelButton");
        u0(b10, floatingActionButton);
        c10.f114624d.setOnClickListener(new C14204e(this));
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(c10, this, (C17164e<? super a>) null), 3, (Object) null);
        n0().s2(new C14206f(this));
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123315M;
    }
}
