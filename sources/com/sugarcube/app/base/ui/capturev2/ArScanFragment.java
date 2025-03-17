package com.sugarcube.app.base.ui.capturev2;

import QE.C13436m;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5222z;
import androidx.media3.ui.PlayerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.ui.ultrawide.I0;
import dI.C17164e;
import hF.C14540b;
import hF.C14541c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import q3.E;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0014X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ArScanFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Lq3/E;", "N", "Lq3/E;", "player", "Landroid/widget/TextView;", "O", "Landroid/widget/TextView;", "captionTextView", "Landroid/widget/ImageView;", "P", "Landroid/widget/ImageView;", "figure8", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "Q", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "figure8AVD", "Landroid/widget/ProgressBar;", "R", "Landroid/widget/ProgressBar;", "progressBar", "S", "loading", "", "T", "J", "duration", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArScanFragment extends Hilt_ArScanFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123346M = C14540b.Scan;

    /* renamed from: N  reason: collision with root package name */
    private E f123347N;

    /* renamed from: O  reason: collision with root package name */
    private TextView f123348O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public ImageView f123349P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public AnimatedVectorDrawable f123350Q;

    /* renamed from: R  reason: collision with root package name */
    private ProgressBar f123351R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public ProgressBar f123352S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public long f123353T = I0.f125247A1.b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.capturev2.ArScanFragment$onViewCreated$1", f = "ArScanFragment.kt", l = {72, 74, 77}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f123354c;

        /* renamed from: d  reason: collision with root package name */
        int f123355d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArScanFragment f123356e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ArScanFragment arScanFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123356e = arScanFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123356e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f123355d
                r2 = 3
                r3 = 1
                r4 = 2
                r5 = 0
                if (r1 == 0) goto L_0x002f
                if (r1 == r3) goto L_0x002b
                if (r1 == r4) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r0 = r9.f123354c
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                XH.y.b(r10)
                goto L_0x00c3
            L_0x001b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0023:
                java.lang.Object r1 = r9.f123354c
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                XH.y.b(r10)
                goto L_0x0088
            L_0x002b:
                XH.y.b(r10)
                goto L_0x0066
            L_0x002f:
                XH.y.b(r10)
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r10 = r9.f123356e
                com.sugarcube.app.base.ui.capturev2.h1 r10 = r10.n0()
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r1 = r9.f123356e
                long r6 = r1.f123353T
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "Start ARScan ("
                r1.append(r8)
                r1.append(r6)
                java.lang.String r6 = ")"
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.sugarcube.app.base.ui.capturev2.h1.R1(r10, r1, r5, r4, r5)
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r10 = r9.f123356e
                long r6 = r10.f123353T
                r9.f123355d = r3
                java.lang.Object r10 = QJ.C16297b0.b(r6, r9)
                if (r10 != r0) goto L_0x0066
                return r0
            L_0x0066:
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r10 = r9.f123356e
                android.widget.ImageView r10 = r10.f123349P
                if (r10 != 0) goto L_0x0075
                java.lang.String r1 = "figure8"
                kotlin.jvm.internal.C17542s.z(r1)
                r1 = r5
                goto L_0x0076
            L_0x0075:
                r1 = r10
            L_0x0076:
                r3 = 8
                r1.setVisibility(r3)
                r9.f123354c = r10
                r9.f123355d = r4
                r3 = 100
                java.lang.Object r10 = QJ.C16297b0.b(r3, r9)
                if (r10 != r0) goto L_0x0088
                return r0
            L_0x0088:
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r10 = r9.f123356e
                android.graphics.drawable.AnimatedVectorDrawable r10 = r10.f123350Q
                if (r10 != 0) goto L_0x0096
                java.lang.String r10 = "figure8AVD"
                kotlin.jvm.internal.C17542s.z(r10)
                r10 = r5
            L_0x0096:
                r1 = 0
                r10.setVisible(r1, r1)
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r10 = r9.f123356e
                android.widget.ProgressBar r10 = r10.f123352S
                if (r10 != 0) goto L_0x00a8
                java.lang.String r3 = "loading"
                kotlin.jvm.internal.C17542s.z(r3)
                goto L_0x00a9
            L_0x00a8:
                r5 = r10
            L_0x00a9:
                r5.setVisibility(r1)
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r1 = r9.f123356e
                com.sugarcube.app.base.ui.capturev2.h1 r1 = r1.n0()
                com.sugarcube.app.base.ui.capturev2.ArScanFragment r3 = r9.f123356e
                com.sugarcube.app.base.ui.capturev2.q r3 = r3.m0()
                r9.f123354c = r10
                r9.f123355d = r2
                java.lang.Object r10 = r1.L1(r3, r9)
                if (r10 != r0) goto L_0x00c3
                return r0
            L_0x00c3:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.ArScanFragment.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13436m c10 = C13436m.c(layoutInflater, viewGroup, false);
        t0(true);
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114648b;
        C17542s.i(floatingActionButton, "cancelButton");
        u0(b10, floatingActionButton);
        this.f123348O = c10.f114649c;
        this.f123352S = c10.f114651e;
        ImageView imageView = c10.f114650d;
        this.f123349P = imageView;
        if (imageView == null) {
            C17542s.z("figure8");
            imageView = null;
        }
        Drawable drawable = imageView.getDrawable();
        C17542s.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        this.f123350Q = (AnimatedVectorDrawable) drawable;
        this.f123351R = c10.f114652f;
        this.f123353T = I0.f125247A1.b();
        PlayerView playerView = c10.f114654h;
        if (playerView != null) {
            E x02 = x0(r0(VideoAsset.CAPTURE_ICON_SCAN));
            this.f123347N = x02;
            playerView.setPlayer(x02);
        }
        MaterialCardView materialCardView = c10.f114653g;
        if (materialCardView != null) {
            materialCardView.setClipToOutline(true);
        }
        n0().a2(C14541c.ARSCAN);
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onPause() {
        super.onPause();
        AnimatedVectorDrawable animatedVectorDrawable = this.f123350Q;
        if (animatedVectorDrawable == null) {
            C17542s.z("figure8AVD");
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.stop();
    }

    public void onResume() {
        super.onResume();
        E e10 = this.f123347N;
        if (e10 != null) {
            e10.q(true);
        }
        AnimatedVectorDrawable animatedVectorDrawable = this.f123350Q;
        ProgressBar progressBar = null;
        if (animatedVectorDrawable == null) {
            C17542s.z("figure8AVD");
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.start();
        ProgressBar progressBar2 = this.f123351R;
        if (progressBar2 == null) {
            C17542s.z("progressBar");
        } else {
            progressBar = progressBar2;
        }
        ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, 100}).setDuration(this.f123353T).start();
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f123347N;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f123347N;
        if (e11 != null) {
            e11.release();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        F0 unused = C16314k.d(C5222z.a(this), C16311i0.c(), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123346M;
    }
}
