package com.sugarcube.app.base.ui.capture.tutorial;

import JF.C13113u;
import JF.T;
import U0.C4889m;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.app.Activity;
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
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.sugarcube.app.base.data.asset.VideoAsset;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import com.sugarcube.app.base.ui.hybrid.E0;
import com.sugarcube.app.base.ui.ultrawide.I0;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import gF.C14517a;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import p1.C5747v0;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/sugarcube/app/base/ui/capture/tutorial/TutorialPageFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "LXH/N;", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "LgF/a;", "J", "LXH/o;", "w0", "()LgF/a;", "viewModel", "Lcom/sugarcube/app/base/ui/hybrid/E0;", "K", "u0", "()Lcom/sugarcube/app/base/ui/hybrid/E0;", "hybridViewModel", "Lcom/sugarcube/app/base/ui/ultrawide/I0;", "L", "v0", "()Lcom/sugarcube/app/base/ui/ultrawide/I0;", "ultrawideViewModel", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TutorialPageFragment extends Hilt_TutorialPageFragment implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f123271I = new T();

    /* renamed from: J  reason: collision with root package name */
    private final C16824o f123272J;

    /* renamed from: K  reason: collision with root package name */
    private final C16824o f123273K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f123274L;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TutorialPageFragment f123275a;

        a(TutorialPageFragment tutorialPageFragment) {
            this.f123275a = tutorialPageFragment;
        }

        /* access modifiers changed from: private */
        public static final Uri j(TutorialPageFragment tutorialPageFragment, VideoAsset videoAsset) {
            C17542s.j(videoAsset, "it");
            return tutorialPageFragment.w0().L(videoAsset);
        }

        /* access modifiers changed from: private */
        public static final C16807N k(TutorialPageFragment tutorialPageFragment, TutorialStepEnum tutorialStepEnum) {
            C17542s.j(tutorialStepEnum, "stepEnum");
            tutorialPageFragment.w0().Q(tutorialStepEnum);
            C8951o.f0(androidx.navigation.fragment.a.a(tutorialPageFragment), tutorialPageFragment.w0().H(tutorialStepEnum), (C) null, (I.a) null, 6, (Object) null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(TutorialPageFragment tutorialPageFragment, TutorialStepEnum tutorialStepEnum) {
            C17542s.j(tutorialStepEnum, "stepEnum");
            if (tutorialStepEnum.isLandscape()) {
                tutorialPageFragment.v0().A1(new e(tutorialPageFragment));
            } else {
                tutorialPageFragment.u0().C1(new f(tutorialPageFragment));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(TutorialPageFragment tutorialPageFragment) {
            tutorialPageFragment.w0().K().b().captureTutorialVideoExit();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N p(TutorialPageFragment tutorialPageFragment) {
            tutorialPageFragment.w0().K().b().captureTutorialVideoExit();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(TutorialPageFragment tutorialPageFragment, C14681B b10) {
            C17542s.j(b10, "playbackState");
            tutorialPageFragment.w0().M(b10);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(U0.C4889m r9, int r10) {
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
                java.lang.String r1 = "com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment.onCreateView.<anonymous>.<anonymous> (TutorialPageFragment.kt:69)"
                r2 = -1008549546(0xffffffffc3e2c156, float:-453.51044)
                U0.C4895p.S(r2, r10, r0, r1)
            L_0x0020:
                com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment r10 = r8.f123275a
                gF.a r10 = r10.w0()
                androidx.lifecycle.F r10 = r10.I()
                androidx.lifecycle.F r10 = androidx.lifecycle.e0.a(r10)
                r0 = 0
                U0.A1 r10 = d1.b.a(r10, r9, r0)
                java.lang.Object r10 = r10.getValue()
                r0 = r10
                pF.f r0 = (pF.C14926f) r0
                if (r0 != 0) goto L_0x003e
                goto L_0x00de
            L_0x003e:
                com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment r10 = r8.f123275a
                r1 = -15344126(0xffffffffff15de02, float:-1.992077E38)
                r9.W(r1)
                boolean r1 = r9.F(r10)
                java.lang.Object r2 = r9.D()
                if (r1 != 0) goto L_0x0058
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r2 != r1) goto L_0x0060
            L_0x0058:
                com.sugarcube.app.base.ui.capture.tutorial.a r2 = new com.sugarcube.app.base.ui.capture.tutorial.a
                r2.<init>(r10)
                r9.u(r2)
            L_0x0060:
                r1 = r2
                nI.l r1 = (nI.C17642l) r1
                r9.P()
                r2 = -15341254(0xffffffffff15e93a, float:-1.9926595E38)
                r9.W(r2)
                boolean r2 = r9.F(r10)
                java.lang.Object r3 = r9.D()
                if (r2 != 0) goto L_0x007e
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r3 != r2) goto L_0x0086
            L_0x007e:
                com.sugarcube.app.base.ui.capture.tutorial.b r3 = new com.sugarcube.app.base.ui.capture.tutorial.b
                r3.<init>(r10)
                r9.u(r3)
            L_0x0086:
                r2 = r3
                nI.l r2 = (nI.C17642l) r2
                r9.P()
                r3 = -15331791(0xffffffffff160e31, float:-1.9945789E38)
                r9.W(r3)
                boolean r3 = r9.F(r10)
                java.lang.Object r4 = r9.D()
                if (r3 != 0) goto L_0x00a4
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x00ac
            L_0x00a4:
                com.sugarcube.app.base.ui.capture.tutorial.c r4 = new com.sugarcube.app.base.ui.capture.tutorial.c
                r4.<init>(r10)
                r9.u(r4)
            L_0x00ac:
                r3 = r4
                nI.l r3 = (nI.C17642l) r3
                r9.P()
                r4 = -15312479(0xffffffffff1659a1, float:-1.9984958E38)
                r9.W(r4)
                boolean r4 = r9.F(r10)
                java.lang.Object r5 = r9.D()
                if (r4 != 0) goto L_0x00ca
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r5 != r4) goto L_0x00d2
            L_0x00ca:
                com.sugarcube.app.base.ui.capture.tutorial.d r5 = new com.sugarcube.app.base.ui.capture.tutorial.d
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
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment.a.i(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            i((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123276c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f123276c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123276c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123277c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f123278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar, C5187o oVar) {
            super(0);
            this.f123277c = aVar;
            this.f123278d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123277c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f123278d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment.c.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123279c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f123279c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123279c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123280c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f123280c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f123280c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123281c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f123282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C5187o oVar) {
            super(0);
            this.f123281c = aVar;
            this.f123282d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f123281c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f123282d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment.f.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123283c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar) {
            super(0);
            this.f123283c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f123283c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123284c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar) {
            super(0);
            this.f123284c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f123284c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123285c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar) {
            super(0);
            this.f123285c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f123285c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f123286c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C16824o oVar) {
            super(0);
            this.f123286c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f123286c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f123287c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f123288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C17631a aVar, C16824o oVar) {
            super(0);
            this.f123287c = aVar;
            this.f123288d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f123287c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f123288d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f123289c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f123290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f123289c = oVar;
            this.f123290d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f123290d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f123289c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TutorialPageFragment() {
        C16824o a10 = C16825p.a(s.NONE, new i(new h(this)));
        this.f123272J = W.b(this, P.b(C14517a.class), new j(a10), new k((C17631a) null, a10), new l(this, a10));
        this.f123273K = W.b(this, P.b(E0.class), new b(this), new c((C17631a) null, this), new d(this));
        this.f123274L = W.b(this, P.b(I0.class), new e(this), new f((C17631a) null, this), new g(this));
    }

    /* access modifiers changed from: private */
    public final E0 u0() {
        return (E0) this.f123273K.getValue();
    }

    /* access modifiers changed from: private */
    public final I0 v0() {
        return (I0) this.f123274L.getValue();
    }

    /* access modifiers changed from: private */
    public final C14517a w0() {
        return (C14517a) this.f123272J.getValue();
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f123271I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C14517a w02 = w0();
        C5191t requireActivity2 = requireActivity();
        C17542s.i(requireActivity2, "requireActivity(...)");
        installSystemUiDelegate(requireActivity, viewLifecycleOwner, false, true, Integer.valueOf(w02.N(requireActivity2) ? 6 : 1));
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new s1.c(viewLifecycleOwner2));
        C13113u.h(composeView, (C5747v0) null, c1.c.c(-1008549546, true, new a(this)), 1, (Object) null);
        return composeView;
    }
}
