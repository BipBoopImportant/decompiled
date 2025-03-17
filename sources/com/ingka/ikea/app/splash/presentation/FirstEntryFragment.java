package com.ingka.ikea.app.splash.presentation;

import Ar.j;
import Cw.C12727a;
import HJ.C15854t;
import Rk.a;
import TJ.C16532g;
import TJ.C16534i;
import To.a;
import U0.C4889m;
import U0.C4895p;
import XD.C13804b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.app.splash.n;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import gy.C14522a;
import jC.C14615b;
import jC.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pv.C11781a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import x4.C;
import x4.C8948l;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J=\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0014*\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0015¢\u0006\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020\u00168\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001a\u0010<\u001a\u0002088\u0014XD¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\u0002088\u0014XD¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u0010;R\u001a\u0010B\u001a\u0002088\u0014XD¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010;R\"\u0010J\u001a\u00020C8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Y\u001a\u00020S8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b&\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001a\u00020Z8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b$\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/ingka/ikea/app/splash/presentation/FirstEntryFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LRk/a$b;", "state", "LXH/N;", "o1", "(LRk/a$b;)V", "r1", "p1", "f1", "b1", "d1", "c1", "g1", "e1", "h1", "S0", "T", "Landroidx/fragment/app/o;", "", "route", "requestKey", "Lkotlin/Function1;", "onResult", "Q0", "(Landroidx/fragment/app/o;Ljava/lang/String;Ljava/lang/String;LnI/l;)V", "Lx4/l;", "backStackEntry", "key", "R0", "(Landroidx/fragment/app/o;Lx4/l;Ljava/lang/String;LnI/l;)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "X", "Ljava/lang/String;", "T0", "()Ljava/lang/String;", "destId", "LRk/a;", "Y", "LXH/o;", "Z0", "()LRk/a;", "viewModel", "LRk/f;", "Z", "Y0", "()LRk/f;", "splashViewModel", "", "y0", "v0", "()Z", "drawUnderStatusBar", "z0", "u0", "drawUnderNavigationBar", "A0", "t0", "drawUnderDisplayCutout", "Lgy/a;", "B0", "Lgy/a;", "X0", "()Lgy/a;", "setRegionSettingsNavigation$splash_release", "(Lgy/a;)V", "regionSettingsNavigation", "LCw/a;", "C0", "LCw/a;", "W0", "()LCw/a;", "setOnboardingNavigation$splash_release", "(LCw/a;)V", "onboardingNavigation", "Lpv/a;", "Lpv/a;", "V0", "()Lpv/a;", "setLocalNotification", "(Lpv/a;)V", "localNotification", "LAr/j;", "LAr/j;", "U0", "()LAr/j;", "setFeedback$splash_release", "(LAr/j;)V", "feedback", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FirstEntryFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final boolean f92506A0;

    /* renamed from: B0  reason: collision with root package name */
    public C14522a f92507B0;

    /* renamed from: C0  reason: collision with root package name */
    public C12727a f92508C0;

    /* renamed from: D0  reason: collision with root package name */
    public C11781a f92509D0;

    /* renamed from: E0  reason: collision with root package name */
    public Ar.j f92510E0;

    /* renamed from: X  reason: collision with root package name */
    private final String f92511X = "firstEntry";

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f92512Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f92513Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f92514y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f92515z0;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.presentation.FirstEntryFragment$consumeResult$1", f = "FirstEntryFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92516c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92517d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f92518e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8948l f92519f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f92520g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super T, C16807N> lVar, C8948l lVar2, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f92518e = lVar;
            this.f92519f = lVar2;
            this.f92520g = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f92518e, this.f92519f, this.f92520g, eVar);
            aVar.f92517d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C17164e<? super C16807N> eVar) {
            return ((a) create(t10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92516c == 0) {
                y.b(obj);
                Object obj2 = this.f92517d;
                if (obj2 != null) {
                    this.f92518e.invoke(obj2);
                    this.f92519f.h().m(this.f92520g, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.presentation.FirstEntryFragment$initViewModel$$inlined$collectOnStarted$1", f = "FirstEntryFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92521c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FirstEntryFragment f92523e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, FirstEntryFragment firstEntryFragment) {
            super(2, eVar);
            this.f92523e = firstEntryFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar, this.f92523e);
            bVar.f92522d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(a.b bVar, C17164e<? super C16807N> eVar) {
            return ((b) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92521c == 0) {
                y.b(obj);
                this.f92523e.o1((a.b) this.f92522d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92524c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f92524c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f92524c.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92525c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5187o f92526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar, C5187o oVar) {
            super(0);
            this.f92525c = aVar;
            this.f92526d = oVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f92525c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0016
            L_0x000c:
                androidx.fragment.app.o r0 = r1.f92526d
                androidx.fragment.app.t r0 = r0.requireActivity()
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0016:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.splash.presentation.FirstEntryFragment.d.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92527c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f92527c = oVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f92527c.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92528c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar) {
            super(0);
            this.f92528c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92528c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92529c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar) {
            super(0);
            this.f92529c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92529c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92530c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C16824o oVar) {
            super(0);
            this.f92530c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92530c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92531c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92532d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92531c = aVar;
            this.f92532d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92531c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92532d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92533c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92534d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92533c = oVar;
            this.f92534d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92534d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92533c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FirstEntryFragment() {
        C16824o a10 = C16825p.a(s.NONE, new g(new f(this)));
        this.f92512Y = W.b(this, P.b(Rk.a.class), new h(a10), new i((C17631a) null, a10), new j(this, a10));
        this.f92513Z = W.b(this, P.b(Rk.f.class), new c(this), new d((C17631a) null, this), new e(this));
        this.f92514y0 = true;
        this.f92515z0 = true;
        this.f92506A0 = true;
    }

    private final <T> void Q0(C5187o oVar, String str, String str2, C17642l<? super T, C16807N> lVar) {
        R0(oVar, androidx.navigation.fragment.a.a(oVar).E(str), str2, lVar);
    }

    private final <T> void R0(C5187o oVar, C8948l lVar, String str, C17642l<? super T, C16807N> lVar2) {
        C16532g R10 = C16534i.R(C5208k.a(lVar.h().i(str, null), oVar.getViewLifecycleOwner().getLifecycle(), r.b.RESUMED), new a(lVar2, lVar, str, (C17164e<? super a>) null));
        C5221y viewLifecycleOwner = oVar.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void S0() {
        Y0().F();
    }

    private final Rk.f Y0() {
        return (Rk.f) this.f92513Z.getValue();
    }

    private final Rk.a Z0() {
        return (Rk.a) this.f92512Y.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N a1(q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        lC.l a10 = qVar.a();
        C14615b.C3152b bVar = C14615b.C3152b.f127857b;
        a10.a(bVar);
        qVar.b().a(bVar);
        return C16807N.f139792a;
    }

    private final void b1() {
        W0().b(androidx.navigation.fragment.a.a(this), rw.c.f28698a.d().d(true).a());
    }

    private final void c1() {
        W0().c(androidx.navigation.fragment.a.a(this), rw.c.f28698a.a().d(true).a());
    }

    private final void d1() {
        W0().e(androidx.navigation.fragment.a.a(this), rw.c.f28698a.a().d(true).a());
    }

    private final void e1() {
        W0().a(androidx.navigation.fragment.a.a(this), rw.c.f28698a.a().d(true).a());
    }

    private final void f1() {
        X0().a(androidx.navigation.fragment.a.a(this), new C.a().d(true).a());
    }

    private final void g1() {
        W0().d(androidx.navigation.fragment.a.a(this), rw.c.f28698a.a().d(true).a());
    }

    private final void h1() {
        Q0(this, T0(), "RegionSelectKey", new Ok.d(this));
        Q0(this, T0(), "ConsentKey", new Ok.e(this));
        Q0(this, T0(), "FeaturesResult", new Ok.f(this));
        Q0(this, T0(), "NotificationsResult", new Ok.g(this));
        Q0(this, T0(), "Welcome", new Ok.h(this));
        Q0(this, T0(), "Promo", new Ok.i(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N i1(FirstEntryFragment firstEntryFragment, C12727a.C2595a aVar) {
        C17542s.j(aVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - Features Screen Result: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = firstEntryFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (C17542s.e(aVar, C12727a.C2595a.C2596a.f108464a)) {
            firstEntryFragment.b1();
        } else if (!C17542s.e(aVar, C12727a.C2595a.b.f108465a)) {
            throw new t();
        } else if (firstEntryFragment.V0().a()) {
            firstEntryFragment.g1();
        } else {
            firstEntryFragment.c1();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(FirstEntryFragment firstEntryFragment, C12727a.C2595a aVar) {
        C17542s.j(aVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - Notifications Screen result: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = firstEntryFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (C17542s.e(aVar, C12727a.C2595a.C2596a.f108464a)) {
            firstEntryFragment.d1();
        } else if (C17542s.e(aVar, C12727a.C2595a.b.f108465a)) {
            firstEntryFragment.g1();
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k1(FirstEntryFragment firstEntryFragment, C13804b.a aVar) {
        C17542s.j(aVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - Welcome Screeen result: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = firstEntryFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        firstEntryFragment.S0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l1(FirstEntryFragment firstEntryFragment, C13804b.a aVar) {
        C17542s.j(aVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - Promo Screen result: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = firstEntryFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        firstEntryFragment.S0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m1(FirstEntryFragment firstEntryFragment, C14522a.C3128a aVar) {
        C17542s.j(aVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - Region Screen result " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = firstEntryFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (C17542s.e(aVar, C14522a.C3128a.C3129a.f127376a)) {
            firstEntryFragment.Y0().E();
        } else if (C17542s.e(aVar, C14522a.C3128a.b.f127377a)) {
            firstEntryFragment.b1();
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n1(FirstEntryFragment firstEntryFragment, a.C1832a aVar) {
        C17542s.j(aVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - Consent Screen result " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = firstEntryFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (C17542s.e(aVar, a.C1832a.C1833a.f87743a)) {
            firstEntryFragment.Y0().E();
        } else if (C17542s.e(aVar, a.C1832a.b.f87744a)) {
            firstEntryFragment.d1();
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void o1(a.b bVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, true)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment - observeState(state) = " + bVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = FirstEntryFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, true, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (bVar instanceof a.b.d) {
            return;
        }
        if (bVar instanceof a.b.C1785a) {
            p1();
        } else if (bVar instanceof a.b.C1786b) {
            Z0().F();
            a.C1783a a11 = ((a.b.C1786b) bVar).a();
            if (C17542s.e(a11, a.C1783a.C1784a.f86457a)) {
                b1();
            } else if (C17542s.e(a11, a.C1783a.b.f86458a)) {
                e1();
            } else if (C17542s.e(a11, a.C1783a.c.f86459a)) {
                f1();
            } else {
                throw new t();
            }
            Y0().C();
        } else if (bVar instanceof a.b.e) {
            r1();
        } else if (!(bVar instanceof a.b.c)) {
            throw new t();
        }
    }

    private final void p1() {
        Ar.j U02 = U0();
        View requireView = requireView();
        C17542s.i(requireView, "requireView(...)");
        String string = getString(Oo.b.f84812v3);
        C17542s.i(string, "getString(...)");
        j.a.s(U02, requireView, string, getString(Oo.b.f84750p7), -2, (View) null, (C17631a) null, new Ok.b(this), 48, (Object) null);
        Y0().C();
    }

    /* access modifiers changed from: private */
    public static final C16807N q1(FirstEntryFragment firstEntryFragment, j.b bVar) {
        C17542s.j(bVar, "it");
        firstEntryFragment.Y0().E();
        return C16807N.f139792a;
    }

    private final void r1() {
        Ar.j U02 = U0();
        C5191t requireActivity = requireActivity();
        String string = getString(n.f92441h);
        C17542s.i(string, "getString(...)");
        j.a.k(U02, requireActivity, string, getString(n.f92440g), false, 0, new Ok.a(this), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N s1(FirstEntryFragment firstEntryFragment) {
        firstEntryFragment.Z0().D();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(133216034);
        if (C4895p.J()) {
            C4895p.S(133216034, i10, -1, "com.ingka.ikea.app.splash.presentation.FirstEntryFragment.FragmentContent (FirstEntryFragment.kt:75)");
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("FirstEntryFragment initViewModel()", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = FirstEntryFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        h1();
        C16532g R10 = C16534i.R(C5208k.b(Z0().getState(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new b((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        b(new Ok.c());
    }

    public String T0() {
        return this.f92511X;
    }

    public final Ar.j U0() {
        Ar.j jVar = this.f92510E0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C11781a V0() {
        C11781a aVar = this.f92509D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("localNotification");
        return null;
    }

    public final C12727a W0() {
        C12727a aVar = this.f92508C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("onboardingNavigation");
        return null;
    }

    public final C14522a X0() {
        C14522a aVar = this.f92507B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("regionSettingsNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f92506A0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f92515z0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f92514y0;
    }
}
