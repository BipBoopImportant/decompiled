package com.sugarcube.app.base.ui.hybrid;

import OE.n;
import QE.L;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.P0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.v;
import XH.y;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5222z;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridPreviewFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridPreviewFragment extends Hilt_HybridPreviewFragment {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.hybrid.HybridPreviewFragment$onCreateView$1$2$1", f = "HybridPreviewFragment.kt", l = {53, 74}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        long f124829c;

        /* renamed from: d  reason: collision with root package name */
        long f124830d;

        /* renamed from: e  reason: collision with root package name */
        boolean f124831e;

        /* renamed from: f  reason: collision with root package name */
        boolean f124832f;

        /* renamed from: g  reason: collision with root package name */
        Object f124833g;

        /* renamed from: h  reason: collision with root package name */
        Object f124834h;

        /* renamed from: i  reason: collision with root package name */
        Object f124835i;

        /* renamed from: j  reason: collision with root package name */
        Object f124836j;

        /* renamed from: k  reason: collision with root package name */
        Object f124837k;

        /* renamed from: l  reason: collision with root package name */
        Object f124838l;

        /* renamed from: m  reason: collision with root package name */
        Object f124839m;

        /* renamed from: n  reason: collision with root package name */
        int f124840n;

        /* renamed from: o  reason: collision with root package name */
        int f124841o;

        /* renamed from: p  reason: collision with root package name */
        int f124842p;

        /* renamed from: q  reason: collision with root package name */
        int f124843q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ HybridPreviewFragment f124844r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ L f124845s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.hybrid.HybridPreviewFragment$onCreateView$1$2$1$1", f = "HybridPreviewFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.hybrid.HybridPreviewFragment$a$a  reason: collision with other inner class name */
        static final class C3065a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124846c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f124847d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ HybridPreviewFragment f124848e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ L f124849f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3065a(boolean z10, HybridPreviewFragment hybridPreviewFragment, L l10, C17164e<? super C3065a> eVar) {
                super(2, eVar);
                this.f124847d = z10;
                this.f124848e = hybridPreviewFragment;
                this.f124849f = l10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3065a(this.f124847d, this.f124848e, this.f124849f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3065a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f124846c == 0) {
                    y.b(obj);
                    if (this.f124847d) {
                        C5191t activity = this.f124848e.getActivity();
                        if (activity != null) {
                            this.f124848e.u0().D2(activity);
                        }
                        C8951o.f0(androidx.navigation.fragment.a.a(this.f124848e), !this.f124848e.u0().u1() ? new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_SCAN) : new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_AR_SCAN), (C) null, (I.a) null, 6, (Object) null);
                    } else {
                        this.f124849f.f114399c.setEnabled(true);
                        this.f124849f.f114402f.c();
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(HybridPreviewFragment hybridPreviewFragment, L l10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f124844r = hybridPreviewFragment;
            this.f124845s = l10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f124844r, this.f124845s, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            long j10;
            v vVar;
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f124843q;
            if (i10 == 0) {
                y.b(obj);
                j10 = System.currentTimeMillis();
                E0 u02 = this.f124844r.u0();
                this.f124829c = j10;
                this.f124843q = 1;
                obj2 = u02.U1(this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                j10 = this.f124829c;
                try {
                    y.b(obj);
                    obj2 = obj;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    Boolean a10 = b.a(false);
                    String message = th2.getMessage();
                    vVar = new v(a10, "[" + message + "]");
                }
            } else if (i10 == 2) {
                E0 e02 = (E0) this.f124839m;
                E0 e03 = (E0) this.f124838l;
                Long l10 = (Long) this.f124837k;
                String str = (String) this.f124836j;
                v vVar2 = (v) this.f124835i;
                HybridPreviewFragment hybridPreviewFragment = (HybridPreviewFragment) this.f124834h;
                v vVar3 = (v) this.f124833g;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) obj2;
            HybridPreviewFragment hybridPreviewFragment2 = this.f124844r;
            boolean booleanValue = ((Boolean) vVar.a()).booleanValue();
            String str2 = (String) vVar.b();
            Long f11 = b.f(System.currentTimeMillis() - j10);
            long longValue = f11.longValue();
            E0 u03 = hybridPreviewFragment2.u0();
            Analytics b10 = u03.w1().b();
            UUID y12 = u03.y1();
            String r12 = u03.r1();
            String e12 = u03.e1();
            String d12 = u03.d1();
            Object obj3 = f10;
            long j11 = j10;
            long j12 = longValue;
            E0 e04 = u03;
            b10.capturePanoPreviewContinue(y12, r12, e12, d12, booleanValue, str2, longValue + "ms");
            Log.d(AnyKt.SUGARCUBE_TAG, "Capture save pano - result=" + booleanValue + " " + j12 + "ms");
            P0 c10 = C16311i0.c();
            C3065a aVar = new C3065a(booleanValue, this.f124844r, this.f124845s, (C17164e<? super C3065a>) null);
            this.f124833g = vVar;
            this.f124834h = hybridPreviewFragment2;
            this.f124835i = vVar;
            this.f124836j = str2;
            this.f124837k = f11;
            E0 e05 = e04;
            this.f124838l = e05;
            this.f124839m = e05;
            this.f124829c = j11;
            this.f124831e = booleanValue;
            this.f124840n = 0;
            this.f124832f = booleanValue;
            this.f124830d = j12;
            this.f124841o = 0;
            this.f124842p = 0;
            this.f124843q = 2;
            Object obj4 = obj3;
            if (C16310i.g(c10, aVar, this) == obj4) {
                return obj4;
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void D0(L l10, HybridPreviewFragment hybridPreviewFragment, View view) {
        l10.f114400d.setEnabled(false);
        l10.f114399c.setEnabled(false);
        l10.f114402f.b();
        F0 unused = C16314k.d(C5222z.a(hybridPreviewFragment), C16311i0.b(), (T) null, new a(hybridPreviewFragment, l10, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void E0(HybridPreviewFragment hybridPreviewFragment, View view) {
        E0 u02 = hybridPreviewFragment.u0();
        u02.w1().b().capturePanoPreviewRetry(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        C8951o.f0(androidx.navigation.fragment.a.a(hybridPreviewFragment), !hybridPreviewFragment.u0().u1() ? new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_GET_READY_1) : new Kreativ.Capture.TutorialStep(TutorialStepEnum.HY_AR_GET_READY), (C) null, (I.a) null, 6, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        L c10 = L.c(layoutInflater, viewGroup, false);
        u0().F1();
        E0 u02 = u0();
        u02.w1().b().capturePanoPreviewStart(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        c10.f114400d.setOnClickListener(new C14250b0(c10, this));
        c10.f114399c.setOnClickListener(new C14252c0(this));
        Bitmap o12 = u0().o1();
        if (o12 != null) {
            c10.f114401e.setImageBitmap(o12);
        }
        if (u0().u1()) {
            c10.f114403g.setText(n.f113300W0);
        }
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }
}
