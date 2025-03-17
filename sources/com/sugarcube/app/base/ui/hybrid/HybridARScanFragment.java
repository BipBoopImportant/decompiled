package com.sugarcube.app.base.ui.hybrid;

import QE.G;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.data.asset.VideoAsset;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import q3.E;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridARScanFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onStop", "Lq3/E;", "P", "Lq3/E;", "player", "Landroid/widget/TextView;", "Q", "Landroid/widget/TextView;", "captionTextView", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "R", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "figure8AVD", "Landroid/widget/ProgressBar;", "S", "Landroid/widget/ProgressBar;", "progressBar", "", "T", "J", "duration", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridARScanFragment extends Hilt_HybridARScanFragment {

    /* renamed from: P  reason: collision with root package name */
    private E f124741P;

    /* renamed from: Q  reason: collision with root package name */
    private TextView f124742Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public AnimatedVectorDrawable f124743R;

    /* renamed from: S  reason: collision with root package name */
    private ProgressBar f124744S;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public long f124745T;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.HybridARScanFragment$onViewCreated$1", f = "HybridARScanFragment.kt", l = {84, 100}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f124746c;

        /* renamed from: d  reason: collision with root package name */
        Object f124747d;

        /* renamed from: e  reason: collision with root package name */
        int f124748e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ HybridARScanFragment f124749f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(HybridARScanFragment hybridARScanFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f124749f = hybridARScanFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f124749f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: type inference failed for: r1v15, types: [androidx.fragment.app.t, java.lang.Object, android.app.Activity] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f124748e
                r2 = 2
                r3 = 1
                java.lang.String r4 = "Sugarcube"
                if (r1 == 0) goto L_0x0025
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r12.f124746c
                androidx.fragment.app.t r0 = (androidx.fragment.app.C5191t) r0
                XH.y.b(r13)
                goto L_0x00ca
            L_0x0019:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0021:
                XH.y.b(r13)
                goto L_0x0056
            L_0x0025:
                XH.y.b(r13)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                long r5 = r13.f124745T
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = "Start ARScan ("
                r13.append(r1)
                r13.append(r5)
                java.lang.String r1 = ")"
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                android.util.Log.d(r4, r13)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                long r5 = r13.f124745T
                r12.f124748e = r3
                java.lang.Object r13 = QJ.C16297b0.b(r5, r12)
                if (r13 != r0) goto L_0x0056
                return r0
            L_0x0056:
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                com.sugarcube.app.base.ui.hybrid.E0 r13 = r13.u0()
                OE.q r1 = r13.w1()
                com.sugarcube.app.base.data.analytics.Analytics r5 = r1.b()
                java.util.UUID r6 = r13.y1()
                java.lang.String r7 = r13.r1()
                boolean r1 = r13.I1()
                if (r1 == 0) goto L_0x0074
                r8 = r2
                goto L_0x0075
            L_0x0074:
                r8 = r3
            L_0x0075:
                java.lang.String r10 = r13.e1()
                java.lang.String r11 = r13.d1()
                r9 = 1
                r5.captureScanEnd(r6, r7, r8, r9, r10, r11)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r1 = r12.f124749f
                com.sugarcube.app.base.ui.hybrid.E0 r1 = r1.u0()
                boolean r1 = r1.I1()
                if (r1 == 0) goto L_0x00df
                java.lang.String r1 = "stop recording (wait 2 seconds)"
                android.util.Log.d(r4, r1)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r1 = r12.f124749f
                android.graphics.drawable.AnimatedVectorDrawable r1 = r1.f124743R
                if (r1 != 0) goto L_0x00a0
                java.lang.String r1 = "figure8AVD"
                kotlin.jvm.internal.C17542s.z(r1)
                r1 = 0
            L_0x00a0:
                r1.stop()
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r1 = r12.f124749f
                androidx.fragment.app.t r1 = r1.getActivity()
                if (r1 == 0) goto L_0x00b5
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                com.sugarcube.app.base.ui.hybrid.E0 r13 = r13.u0()
                r13.I2(r1)
                r13 = r1
            L_0x00b5:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
                r5 = 2
                long r5 = r3.toMillis(r5)
                r12.f124746c = r1
                r12.f124747d = r13
                r12.f124748e = r2
                java.lang.Object r13 = QJ.C16297b0.b(r5, r12)
                if (r13 != r0) goto L_0x00ca
                return r0
            L_0x00ca:
                java.lang.String r13 = "navigate to end"
                android.util.Log.d(r4, r13)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                x4.o r0 = androidx.navigation.fragment.a.a(r13)
                com.sugarcube.app.base.navigation.Kreativ$Capture$Hybrid$g r1 = com.sugarcube.app.base.navigation.Kreativ.Capture.Hybrid.g.INSTANCE
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                x4.C8951o.f0(r0, r1, r2, r3, r4, r5)
                goto L_0x010e
            L_0x00df:
                java.lang.String r13 = "navigate to step"
                android.util.Log.d(r4, r13)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                x4.o r0 = androidx.navigation.fragment.a.a(r13)
                com.sugarcube.app.base.ui.hybrid.HybridARScanFragment r13 = r12.f124749f
                com.sugarcube.app.base.ui.hybrid.E0 r13 = r13.u0()
                boolean r13 = r13.u1()
                if (r13 != 0) goto L_0x00ff
                com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep r13 = new com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_SCAN_AGAIN
                r13.<init>(r1)
            L_0x00fd:
                r1 = r13
                goto L_0x0107
            L_0x00ff:
                com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep r13 = new com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.HY_AR_SCAN_AGAIN
                r13.<init>(r1)
                goto L_0x00fd
            L_0x0107:
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                x4.C8951o.f0(r0, r1, r2, r3, r4, r5)
            L_0x010e:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.HybridARScanFragment.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(HybridARScanFragment hybridARScanFragment) {
        E0 u02 = hybridARScanFragment.u0();
        u02.w1().b().captureScanExit(u02.y1(), u02.r1(), u02.I1() ? 2 : 1, u02.e1(), u02.d1());
        return C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        G c10 = G.c(layoutInflater, viewGroup, false);
        E0 u02 = u0();
        u02.w1().b().captureScanStart(u02.y1(), u02.r1(), u02.I1() ? 2 : 1, u02.e1(), u02.d1());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114357b;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new C14267k(this));
        E A02 = A0(v0(VideoAsset.CAPTURE_ICON_SCAN));
        this.f124741P = A02;
        c10.f114361f.setPlayer(A02);
        c10.f114360e.setClipToOutline(true);
        this.f124742Q = c10.f114358c;
        ImageView imageView = c10.f114359d;
        C17542s.i(imageView, "figure8View");
        Drawable drawable = imageView.getDrawable();
        C17542s.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        this.f124743R = (AnimatedVectorDrawable) drawable;
        this.f124744S = c10.f114362g;
        this.f124745T = E0.f124534B1.a();
        u0().X1("ARSCAN");
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onPause() {
        super.onPause();
        AnimatedVectorDrawable animatedVectorDrawable = this.f124743R;
        if (animatedVectorDrawable == null) {
            C17542s.z("figure8AVD");
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.stop();
    }

    public void onResume() {
        super.onResume();
        AnimatedVectorDrawable animatedVectorDrawable = this.f124743R;
        ProgressBar progressBar = null;
        if (animatedVectorDrawable == null) {
            C17542s.z("figure8AVD");
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.start();
        E e10 = this.f124741P;
        if (e10 != null) {
            e10.q(true);
        }
        ProgressBar progressBar2 = this.f124744S;
        if (progressBar2 == null) {
            C17542s.z("progressBar");
        } else {
            progressBar = progressBar2;
        }
        ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, 100}).setDuration(this.f124745T).start();
    }

    public void onStop() {
        super.onStop();
        E e10 = this.f124741P;
        if (e10 != null) {
            e10.stop();
        }
        E e11 = this.f124741P;
        if (e11 != null) {
            e11.release();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }
}
