package com.sugarcube.app.base.ui.ultrawide;

import QE.V;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawidePreviewFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawidePreviewFragment extends Hilt_UltrawidePreviewFragment {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawidePreviewFragment$onCreateView$1$2$1", f = "UltrawidePreviewFragment.kt", l = {51, 72}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        long f125491c;

        /* renamed from: d  reason: collision with root package name */
        long f125492d;

        /* renamed from: e  reason: collision with root package name */
        boolean f125493e;

        /* renamed from: f  reason: collision with root package name */
        boolean f125494f;

        /* renamed from: g  reason: collision with root package name */
        Object f125495g;

        /* renamed from: h  reason: collision with root package name */
        Object f125496h;

        /* renamed from: i  reason: collision with root package name */
        Object f125497i;

        /* renamed from: j  reason: collision with root package name */
        Object f125498j;

        /* renamed from: k  reason: collision with root package name */
        Object f125499k;

        /* renamed from: l  reason: collision with root package name */
        Object f125500l;

        /* renamed from: m  reason: collision with root package name */
        Object f125501m;

        /* renamed from: n  reason: collision with root package name */
        int f125502n;

        /* renamed from: o  reason: collision with root package name */
        int f125503o;

        /* renamed from: p  reason: collision with root package name */
        int f125504p;

        /* renamed from: q  reason: collision with root package name */
        int f125505q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ UltrawidePreviewFragment f125506r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ V f125507s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawidePreviewFragment$onCreateView$1$2$1$1", f = "UltrawidePreviewFragment.kt", l = {75}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.ultrawide.UltrawidePreviewFragment$a$a  reason: collision with other inner class name */
        static final class C3072a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f125508c;

            /* renamed from: d  reason: collision with root package name */
            Object f125509d;

            /* renamed from: e  reason: collision with root package name */
            Object f125510e;

            /* renamed from: f  reason: collision with root package name */
            Object f125511f;

            /* renamed from: g  reason: collision with root package name */
            int f125512g;

            /* renamed from: h  reason: collision with root package name */
            int f125513h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ boolean f125514i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ UltrawidePreviewFragment f125515j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ V f125516k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3072a(boolean z10, UltrawidePreviewFragment ultrawidePreviewFragment, V v10, C17164e<? super C3072a> eVar) {
                super(2, eVar);
                this.f125514i = z10;
                this.f125515j = ultrawidePreviewFragment;
                this.f125516k = v10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3072a(this.f125514i, this.f125515j, this.f125516k, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3072a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f125513h;
                if (i10 == 0) {
                    y.b(obj);
                    if (this.f125514i) {
                        C14304j w02 = this.f125515j.w0();
                        if (w02 != null) {
                            UltrawidePreviewFragment ultrawidePreviewFragment = this.f125515j;
                            I0 x02 = ultrawidePreviewFragment.x0();
                            this.f125508c = w02;
                            this.f125509d = w02;
                            this.f125510e = ultrawidePreviewFragment;
                            this.f125511f = w02;
                            this.f125512g = 0;
                            this.f125513h = 1;
                            if (x02.q2(w02, this) == f10) {
                                return f10;
                            }
                        }
                    } else {
                        this.f125516k.f114468d.setEnabled(true);
                        this.f125516k.f114473i.c();
                        return C16807N.f139792a;
                    }
                } else if (i10 == 1) {
                    C14304j jVar = (C14304j) this.f125511f;
                    UltrawidePreviewFragment ultrawidePreviewFragment2 = (UltrawidePreviewFragment) this.f125510e;
                    C14304j jVar2 = (C14304j) this.f125509d;
                    C14304j jVar3 = (C14304j) this.f125508c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C8951o.f0(androidx.navigation.fragment.a.a(this.f125515j), !this.f125515j.x0().s1() ? new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_SCAN) : new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_AR_INIT), (C) null, (I.a) null, 6, (Object) null);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(UltrawidePreviewFragment ultrawidePreviewFragment, V v10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f125506r = ultrawidePreviewFragment;
            this.f125507s = v10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f125506r, this.f125507s, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            long j10;
            v vVar;
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f125505q;
            if (i10 == 0) {
                y.b(obj);
                j10 = System.currentTimeMillis();
                I0 x02 = this.f125506r.x0();
                this.f125491c = j10;
                this.f125505q = 1;
                obj2 = x02.O1(this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                j10 = this.f125491c;
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
                I0 i02 = (I0) this.f125501m;
                I0 i03 = (I0) this.f125500l;
                Long l10 = (Long) this.f125499k;
                String str = (String) this.f125498j;
                v vVar2 = (v) this.f125497i;
                UltrawidePreviewFragment ultrawidePreviewFragment = (UltrawidePreviewFragment) this.f125496h;
                v vVar3 = (v) this.f125495g;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) obj2;
            UltrawidePreviewFragment ultrawidePreviewFragment2 = this.f125506r;
            boolean booleanValue = ((Boolean) vVar.a()).booleanValue();
            String str2 = (String) vVar.b();
            Long f11 = b.f(System.currentTimeMillis() - j10);
            long longValue = f11.longValue();
            I0 x03 = ultrawidePreviewFragment2.x0();
            Analytics b10 = x03.u1().b();
            UUID x12 = x03.x1();
            String p12 = x03.p1();
            String a12 = x03.a1();
            String Z02 = x03.Z0();
            Object obj3 = f10;
            long j11 = j10;
            long j12 = longValue;
            I0 i04 = x03;
            b10.capturePanoPreviewContinue(x12, p12, a12, Z02, booleanValue, str2, longValue + "ms");
            Log.d(AnyKt.SUGARCUBE_TAG, "Capture save pano - result=" + booleanValue + " " + j12 + "ms");
            P0 c10 = C16311i0.c();
            C3072a aVar = new C3072a(booleanValue, this.f125506r, this.f125507s, (C17164e<? super C3072a>) null);
            this.f125495g = vVar;
            this.f125496h = ultrawidePreviewFragment2;
            this.f125497i = vVar;
            this.f125498j = str2;
            this.f125499k = f11;
            I0 i05 = i04;
            this.f125500l = i05;
            this.f125501m = i05;
            this.f125491c = j11;
            this.f125493e = booleanValue;
            this.f125502n = 0;
            this.f125494f = booleanValue;
            this.f125492d = j12;
            this.f125503o = 0;
            this.f125504p = 0;
            this.f125505q = 2;
            Object obj4 = obj3;
            if (C16310i.g(c10, aVar, this) == obj4) {
                return obj4;
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void E0(V v10, UltrawidePreviewFragment ultrawidePreviewFragment, View view) {
        v10.f114466b.setVisibility(8);
        v10.f114473i.b();
        F0 unused = C16314k.d(C5222z.a(ultrawidePreviewFragment), C16311i0.b(), (T) null, new a(ultrawidePreviewFragment, v10, (C17164e<? super a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void F0(UltrawidePreviewFragment ultrawidePreviewFragment, View view) {
        I0 x02 = ultrawidePreviewFragment.x0();
        x02.u1().b().capturePanoPreviewRetry(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        C8951o.f0(androidx.navigation.fragment.a.a(ultrawidePreviewFragment), !ultrawidePreviewFragment.x0().g1() ? new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_GET_READY_1) : new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_AR_GET_READY_1), (C) null, (I.a) null, 6, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        V c10 = V.c(layoutInflater, viewGroup, false);
        x0().E1();
        I0 x02 = x0();
        x02.u1().b().capturePanoPreviewStart(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        c10.f114470f.setOnClickListener(new C14287a0(c10, this));
        c10.f114468d.setOnClickListener(new C14289b0(this));
        Bitmap k12 = x0().k1();
        if (k12 != null) {
            c10.f114471g.setImageBitmap(k12);
        }
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }
}
