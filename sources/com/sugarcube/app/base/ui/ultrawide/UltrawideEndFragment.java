package com.sugarcube.app.base.ui.ultrawide;

import OE.n;
import QE.U;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C5222z;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.utils.BouncingBallView;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideEndFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "LXH/N;", "E0", "(LdI/e;)Ljava/lang/Object;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/sugarcube/app/base/ui/utils/BouncingBallView;", "P", "Lcom/sugarcube/app/base/ui/utils/BouncingBallView;", "bouncingBall", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideEndFragment extends Hilt_UltrawideEndFragment {
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public BouncingBallView f125473P;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment$doSave$2", f = "UltrawideEndFragment.kt", l = {60, 63, 65}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        long f125474c;

        /* renamed from: d  reason: collision with root package name */
        long f125475d;

        /* renamed from: e  reason: collision with root package name */
        int f125476e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UltrawideEndFragment f125477f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment$doSave$2$1", f = "UltrawideEndFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment$a$a  reason: collision with other inner class name */
        static final class C3071a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f125478c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ UltrawideEndFragment f125479d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3071a(UltrawideEndFragment ultrawideEndFragment, C17164e<? super C3071a> eVar) {
                super(2, eVar);
                this.f125479d = ultrawideEndFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3071a(this.f125479d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3071a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f125478c == 0) {
                    y.b(obj);
                    C8951o.f0(androidx.navigation.fragment.a.a(this.f125479d), Kreativ.Capture.d.e.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UltrawideEndFragment ultrawideEndFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f125477f = ultrawideEndFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125477f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f125476e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002d
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                XH.y.b(r12)
                goto L_0x0095
            L_0x0016:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001e:
                long r3 = r11.f125475d
                long r5 = r11.f125474c
                XH.y.b(r12)
                goto L_0x007b
            L_0x0026:
                long r4 = r11.f125474c
                XH.y.b(r12)
                r5 = r4
                goto L_0x0051
            L_0x002d:
                XH.y.b(r12)
                long r5 = java.lang.System.currentTimeMillis()
                com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment r12 = r11.f125477f
                com.sugarcube.app.base.ui.ultrawide.I0 r12 = r12.x0()
                com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment r1 = r11.f125477f
                androidx.fragment.app.t r1 = r1.getActivity()
                com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment r7 = r11.f125477f
                com.sugarcube.app.base.ui.ultrawide.j r7 = r7.w0()
                r11.f125474c = r5
                r11.f125476e = r4
                java.lang.Object r12 = r12.N1(r1, r7, r11)
                if (r12 != r0) goto L_0x0051
                return r0
            L_0x0051:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x0095
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
                r7 = 3
                long r7 = r12.toMillis(r7)
                long r9 = java.lang.System.currentTimeMillis()
                long r9 = r9 - r5
                long r7 = r7 - r9
                r9 = 0
                int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r12 <= 0) goto L_0x007c
                r11.f125474c = r5
                r11.f125475d = r7
                r11.f125476e = r3
                java.lang.Object r12 = QJ.C16297b0.b(r7, r11)
                if (r12 != r0) goto L_0x007a
                return r0
            L_0x007a:
                r3 = r7
            L_0x007b:
                r7 = r3
            L_0x007c:
                QJ.P0 r12 = QJ.C16311i0.c()
                com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment$a$a r1 = new com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment$a$a
                com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment r3 = r11.f125477f
                r4 = 0
                r1.<init>(r3, r4)
                r11.f125474c = r5
                r11.f125475d = r7
                r11.f125476e = r2
                java.lang.Object r12 = QJ.C16310i.g(r12, r1, r11)
                if (r12 != r0) goto L_0x0095
                return r0
            L_0x0095:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment$onViewCreated$1", f = "UltrawideEndFragment.kt", l = {53}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125480c;

        /* renamed from: d  reason: collision with root package name */
        int f125481d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UltrawideEndFragment f125482e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UltrawideEndFragment ultrawideEndFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f125482e = ultrawideEndFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f125482e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            BouncingBallView bouncingBallView;
            Object f10 = C17187b.f();
            int i10 = this.f125481d;
            BouncingBallView bouncingBallView2 = null;
            if (i10 == 0) {
                y.b(obj);
                BouncingBallView D02 = this.f125482e.f125473P;
                if (D02 == null) {
                    C17542s.z("bouncingBall");
                    bouncingBallView = null;
                } else {
                    bouncingBallView = D02;
                }
                bouncingBallView.b();
                UltrawideEndFragment ultrawideEndFragment = this.f125482e;
                this.f125480c = D02;
                this.f125481d = 1;
                if (ultrawideEndFragment.E0(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                BouncingBallView bouncingBallView3 = (BouncingBallView) this.f125480c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BouncingBallView D03 = this.f125482e.f125473P;
            if (D03 == null) {
                C17542s.z("bouncingBall");
            } else {
                bouncingBallView2 = D03;
            }
            bouncingBallView2.c();
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final Object E0(C17164e<? super C16807N> eVar) {
        Object g10 = C16310i.g(C16311i0.b(), new a(this, (C17164e<? super a>) null), eVar);
        return g10 == C17187b.f() ? g10 : C16807N.f139792a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        U c10 = U.c(layoutInflater, viewGroup, false);
        this.f125473P = c10.f114461g;
        Bitmap k12 = x0().k1();
        if (k12 != null) {
            c10.f114459e.setImageBitmap(k12);
        }
        if (!x0().w1().isLoggedIn().getValue().booleanValue()) {
            c10.f114456b.setText(getText(n.f113282T0));
        }
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }
}
