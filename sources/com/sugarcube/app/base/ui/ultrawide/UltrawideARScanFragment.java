package com.sugarcube.app.base.ui.ultrawide;

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
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideARScanFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/widget/TextView;", "P", "Landroid/widget/TextView;", "captionTextView", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "Q", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "figure8AVD", "Landroid/widget/ProgressBar;", "R", "Landroid/widget/ProgressBar;", "progressBar", "", "S", "J", "duration", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideARScanFragment extends Hilt_UltrawideARScanFragment {

    /* renamed from: P  reason: collision with root package name */
    private TextView f125411P;

    /* renamed from: Q  reason: collision with root package name */
    private AnimatedVectorDrawable f125412Q;

    /* renamed from: R  reason: collision with root package name */
    private ProgressBar f125413R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public long f125414S;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment$onViewCreated$1", f = "UltrawideARScanFragment.kt", l = {78, 93}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125415c;

        /* renamed from: d  reason: collision with root package name */
        Object f125416d;

        /* renamed from: e  reason: collision with root package name */
        int f125417e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UltrawideARScanFragment f125418f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UltrawideARScanFragment ultrawideARScanFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f125418f = ultrawideARScanFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125418f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: com.sugarcube.app.base.ui.ultrawide.I0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.sugarcube.app.base.ui.ultrawide.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: com.sugarcube.app.base.ui.ultrawide.I0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: com.sugarcube.app.base.ui.ultrawide.I0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f125417e
                r2 = 2
                java.lang.String r3 = "Sugarcube"
                r4 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r4) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r0 = r12.f125415c
                com.sugarcube.app.base.ui.ultrawide.j r0 = (com.sugarcube.app.base.ui.ultrawide.C14304j) r0
                XH.y.b(r13)
                goto L_0x00b9
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
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                long r5 = r13.f125414S
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = "Start ARScan ("
                r13.append(r1)
                r13.append(r5)
                java.lang.String r1 = ")"
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                android.util.Log.d(r3, r13)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                long r5 = r13.f125414S
                r12.f125417e = r4
                java.lang.Object r13 = QJ.C16297b0.b(r5, r12)
                if (r13 != r0) goto L_0x0056
                return r0
            L_0x0056:
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                com.sugarcube.app.base.ui.ultrawide.I0 r13 = r13.x0()
                OE.q r1 = r13.u1()
                com.sugarcube.app.base.data.analytics.Analytics r5 = r1.b()
                java.util.UUID r6 = r13.x1()
                java.lang.String r7 = r13.p1()
                boolean r1 = r13.G1()
                if (r1 == 0) goto L_0x0074
                r8 = r2
                goto L_0x0075
            L_0x0074:
                r8 = r4
            L_0x0075:
                java.lang.String r10 = r13.a1()
                java.lang.String r11 = r13.Z0()
                r9 = 1
                r5.captureScanEnd(r6, r7, r8, r9, r10, r11)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r1 = r12.f125418f
                com.sugarcube.app.base.ui.ultrawide.I0 r1 = r1.x0()
                boolean r1 = r1.G1()
                if (r1 == 0) goto L_0x00ce
                java.lang.String r1 = "stop recording (wait 2 seconds)"
                android.util.Log.d(r3, r1)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r1 = r12.f125418f
                com.sugarcube.app.base.ui.ultrawide.j r1 = r1.w0()
                if (r1 == 0) goto L_0x00a4
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                com.sugarcube.app.base.ui.ultrawide.I0 r13 = r13.x0()
                r13.v2(r1)
                r13 = r1
            L_0x00a4:
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                r5 = 2
                long r4 = r4.toMillis(r5)
                r12.f125415c = r1
                r12.f125416d = r13
                r12.f125417e = r2
                java.lang.Object r13 = QJ.C16297b0.b(r4, r12)
                if (r13 != r0) goto L_0x00b9
                return r0
            L_0x00b9:
                java.lang.String r13 = "navigate to end"
                android.util.Log.d(r3, r13)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                x4.o r0 = androidx.navigation.fragment.a.a(r13)
                com.sugarcube.app.base.navigation.Kreativ$Capture$d$f r1 = com.sugarcube.app.base.navigation.Kreativ.Capture.d.f.INSTANCE
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                x4.C8951o.f0(r0, r1, r2, r3, r4, r5)
                goto L_0x0106
            L_0x00ce:
                java.lang.String r13 = "navigate to step"
                android.util.Log.d(r3, r13)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                com.sugarcube.app.base.ui.ultrawide.I0 r13 = r13.x0()
                r13.W1(r4)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                x4.o r0 = androidx.navigation.fragment.a.a(r13)
                com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment r13 = r12.f125418f
                com.sugarcube.app.base.ui.ultrawide.I0 r13 = r13.x0()
                boolean r13 = r13.s1()
                if (r13 != 0) goto L_0x00f7
                com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep r13 = new com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_SCAN_AGAIN
                r13.<init>(r1)
            L_0x00f5:
                r1 = r13
                goto L_0x00ff
            L_0x00f7:
                com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep r13 = new com.sugarcube.app.base.navigation.Kreativ$Capture$TutorialStep
                com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum r1 = com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum.UW_AR_SCAN_AGAIN
                r13.<init>(r1)
                goto L_0x00f5
            L_0x00ff:
                r4 = 6
                r5 = 0
                r2 = 0
                r3 = 0
                x4.C8951o.f0(r0, r1, r2, r3, r4, r5)
            L_0x0106:
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(UltrawideARScanFragment ultrawideARScanFragment) {
        I0 x02 = ultrawideARScanFragment.x0();
        x02.u1().b().captureScanExit(x02.x1(), x02.p1(), x02.G1() ? 2 : 1, x02.a1(), x02.Z0());
        return C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        QE.Q c10 = QE.Q.c(layoutInflater, viewGroup, false);
        I0 x02 = x0();
        x02.u1().b().captureScanStart(x02.x1(), x02.p1(), x02.G1() ? 2 : 1, x02.a1(), x02.Z0());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114430b;
        C17542s.i(floatingActionButton, "cancelButton");
        z0(b10, floatingActionButton, new C14296f(this));
        this.f125411P = c10.f114431c;
        ImageView imageView = c10.f114432d;
        C17542s.i(imageView, "figure8View");
        Drawable drawable = imageView.getDrawable();
        C17542s.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        this.f125412Q = (AnimatedVectorDrawable) drawable;
        this.f125413R = c10.f114433e;
        this.f125414S = I0.f125247A1.b();
        x0().R1("ARSCAN");
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    public void onPause() {
        super.onPause();
        AnimatedVectorDrawable animatedVectorDrawable = this.f125412Q;
        if (animatedVectorDrawable == null) {
            C17542s.z("figure8AVD");
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.stop();
    }

    public void onResume() {
        super.onResume();
        AnimatedVectorDrawable animatedVectorDrawable = this.f125412Q;
        ProgressBar progressBar = null;
        if (animatedVectorDrawable == null) {
            C17542s.z("figure8AVD");
            animatedVectorDrawable = null;
        }
        animatedVectorDrawable.start();
        ProgressBar progressBar2 = this.f125413R;
        if (progressBar2 == null) {
            C17542s.z("progressBar");
        } else {
            progressBar = progressBar2;
        }
        ObjectAnimator.ofInt(progressBar, "progress", new int[]{0, 100}).setDuration(this.f125414S).start();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }
}
