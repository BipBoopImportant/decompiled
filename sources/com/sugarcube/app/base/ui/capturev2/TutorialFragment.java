package com.sugarcube.app.base.ui.capturev2;

import JF.C13113u;
import U0.C4889m;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import YH.X;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.core.analytics.BaseEventProperty;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import hF.C14540b;
import hF.C14542d;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;
import p1.C5747v0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0014X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8DX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/TutorialFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LhF/d;", "action", "Lcom/sugarcube/core/analytics/Trackable;", "trackable", "y0", "(LhF/d;Lcom/sugarcube/core/analytics/Trackable;)V", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "Lcom/sugarcube/app/base/ui/capturev2/r1;", "N", "LXH/o;", "E0", "()Lcom/sugarcube/app/base/ui/capturev2/r1;", "tutorialModel", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TutorialFragment extends Hilt_TutorialFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123604M = C14540b.Tutorial;

    /* renamed from: N  reason: collision with root package name */
    private final C16824o f123605N = W.b(this, P.b(r1.class), new b(this), new c((C17631a) null, this), new d(this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TutorialFragment f123606a;

        a(TutorialFragment tutorialFragment) {
            this.f123606a = tutorialFragment;
        }

        /* access modifiers changed from: private */
        public static final Uri h(TutorialFragment tutorialFragment, VideoAsset videoAsset) {
            C17542s.j(videoAsset, "it");
            return tutorialFragment.E0().G(videoAsset);
        }

        /* access modifiers changed from: private */
        public static final C16807N i(TutorialFragment tutorialFragment, TutorialStepEnum tutorialStepEnum) {
            C17542s.j(tutorialStepEnum, "stepEnum");
            BaseFragment.z0(tutorialFragment, C14542d.Next, (Trackable) null, 2, (Object) null);
            tutorialFragment.E0().I(tutorialStepEnum);
            tutorialFragment.n0().O1(tutorialStepEnum);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(TutorialFragment tutorialFragment, TutorialStepEnum tutorialStepEnum) {
            C17542s.j(tutorialStepEnum, "stepEnum");
            tutorialFragment.n0().x1(tutorialFragment.q0());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(TutorialFragment tutorialFragment, C14681B b10) {
            C17542s.j(b10, "playbackState");
            tutorialFragment.E0().H(b10);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(U0.C4889m r9, int r10) {
            /*
                r8 = this;
                r0 = r10 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r9.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r9.L()
                goto L_0x00e7
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.sugarcube.app.base.ui.capturev2.TutorialFragment.onCreateView.<anonymous>.<anonymous> (TutorialFragment.kt:46)"
                r2 = 895087024(0x3559f1b0, float:8.11905E-7)
                U0.C4895p.S(r2, r10, r0, r1)
            L_0x0020:
                com.sugarcube.app.base.ui.capturev2.TutorialFragment r10 = r8.f123606a
                com.sugarcube.app.base.ui.capturev2.r1 r10 = r10.E0()
                androidx.lifecycle.F r10 = r10.F()
                androidx.lifecycle.F r10 = androidx.lifecycle.e0.a(r10)
                r0 = 0
                U0.A1 r10 = d1.b.a(r10, r9, r0)
                java.lang.Object r10 = r10.getValue()
                r0 = r10
                pF.f r0 = (pF.C14926f) r0
                if (r0 != 0) goto L_0x003e
                goto L_0x00de
            L_0x003e:
                com.sugarcube.app.base.ui.capturev2.TutorialFragment r10 = r8.f123606a
                r1 = -1282203939(0xffffffffb3931edd, float:-6.850835E-8)
                r9.W(r1)
                boolean r1 = r9.F(r10)
                java.lang.Object r2 = r9.D()
                if (r1 != 0) goto L_0x0058
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x0060
            L_0x0058:
                com.sugarcube.app.base.ui.capturev2.n1 r2 = new com.sugarcube.app.base.ui.capturev2.n1
                r2.<init>(r10)
                r9.u(r2)
            L_0x0060:
                r1 = r2
                nI.l r1 = (nI.C17642l) r1
                r9.P()
                r2 = -1282201100(0xffffffffb39329f4, float:-6.852852E-8)
                r9.W(r2)
                boolean r2 = r9.F(r10)
                java.lang.Object r3 = r9.D()
                if (r2 != 0) goto L_0x007e
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0086
            L_0x007e:
                com.sugarcube.app.base.ui.capturev2.o1 r3 = new com.sugarcube.app.base.ui.capturev2.o1
                r3.<init>(r10)
                r9.u(r3)
            L_0x0086:
                r2 = r3
                nI.l r2 = (nI.C17642l) r2
                r9.P()
                r3 = -1282193129(0xffffffffb3934917, float:-6.858516E-8)
                r9.W(r3)
                boolean r3 = r9.F(r10)
                java.lang.Object r4 = r9.D()
                if (r3 != 0) goto L_0x00a4
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x00ac
            L_0x00a4:
                com.sugarcube.app.base.ui.capturev2.p1 r4 = new com.sugarcube.app.base.ui.capturev2.p1
                r4.<init>(r10)
                r9.u(r4)
            L_0x00ac:
                r3 = r4
                nI.l r3 = (nI.C17642l) r3
                r9.P()
                r4 = -1282188364(0xffffffffb3935bb4, float:-6.8619016E-8)
                r9.W(r4)
                boolean r4 = r9.F(r10)
                java.lang.Object r5 = r9.D()
                if (r4 != 0) goto L_0x00ca
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r5 != r4) goto L_0x00d2
            L_0x00ca:
                com.sugarcube.app.base.ui.capturev2.q1 r5 = new com.sugarcube.app.base.ui.capturev2.q1
                r5.<init>(r10)
                r9.u(r5)
            L_0x00d2:
                r4 = r5
                nI.l r4 = (nI.C17642l) r4
                r9.P()
                r6 = 0
                r7 = 0
                r5 = r9
                pF.C14925e.e(r0, r1, r2, r3, r4, r5, r6, r7)
            L_0x00de:
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x00e7
                U0.C4895p.R()
            L_0x00e7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.TutorialFragment.a.f(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            f((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123607c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f123607c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123607c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123608c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f123609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar, C5187o oVar) {
            super(0);
            this.f123608c = aVar;
            this.f123609d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123608c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f123609d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.TutorialFragment.c.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123610c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f123610c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123610c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* access modifiers changed from: protected */
    public final r1 E0() {
        return (r1) this.f123605N.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        E0().J(n0().p1());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new s1.c(viewLifecycleOwner));
        C13113u.h(composeView, (C5747v0) null, c1.c.c(895087024, true, new a(this)), 1, (Object) null);
        return composeView;
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123604M;
    }

    /* access modifiers changed from: protected */
    public void y0(C14542d dVar, Trackable trackable) {
        C17542s.j(dVar, "action");
        super.y0(dVar, new BaseEventProperty(X.l(C16796C.a(TrackingKey.Step, String.valueOf(n0().p1().getStepNum())))));
    }
}
