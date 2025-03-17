package com.sugarcube.decorate;

import C4.h;
import C4.j;
import JF.C13113u;
import JF.T;
import PF.C13344a;
import PF.C13346c;
import QJ.F0;
import QJ.Q;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.x;
import XH.y;
import YH.X;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import p1.C5747v0;
import x4.C8945i;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/sugarcube/decorate/DecorateLandingFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "LXH/N;", "x0", "(LdI/e;)Ljava/lang/Object;", "", "B0", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onActivityCreated", "(Landroid/os/Bundle;)V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/navigation/Kreativ$Decorate;", "J", "LXH/o;", "y0", "()Lcom/sugarcube/app/base/navigation/Kreativ$Decorate;", "args", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "K", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "z0", "()Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "setConfigRepository", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;)V", "configRepository", "Lcom/sugarcube/decorate/DesignStateManager;", "L", "Lcom/sugarcube/decorate/DesignStateManager;", "A0", "()Lcom/sugarcube/decorate/DesignStateManager;", "setDesignStateManager", "(Lcom/sugarcube/decorate/DesignStateManager;)V", "designStateManager", "M", "a", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecorateLandingFragment extends a implements SystemUiDelegate {

    /* renamed from: M  reason: collision with root package name */
    public static final a f126089M = new a((DefaultConstructorMarker) null);

    /* renamed from: N  reason: collision with root package name */
    public static final int f126090N = 8;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public static boolean f126091O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public static boolean f126092P;

    /* renamed from: Q  reason: collision with root package name */
    private static final int f126093Q = 3000;

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f126094I = new T();

    /* renamed from: J  reason: collision with root package name */
    private final C16824o f126095J = C16825p.b(new C13346c(this));

    /* renamed from: K  reason: collision with root package name */
    public ConfigRepository f126096K;

    /* renamed from: L  reason: collision with root package name */
    public DesignStateManager f126097L;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/decorate/DecorateLandingFragment$a;", "", "<init>", "()V", "", "requestedLandscape", "Z", "getRequestedLandscape", "()Z", "b", "(Z)V", "recreated", "getRecreated", "a", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(boolean z10) {
            DecorateLandingFragment.f126092P = z10;
        }

        public final void b(boolean z10) {
            DecorateLandingFragment.f126091O = z10;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.decorate.DecorateLandingFragment", f = "DecorateLandingFragment.kt", l = {142, 144}, m = "awaitLandscape")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f126098c;

        /* renamed from: d  reason: collision with root package name */
        Object f126099d;

        /* renamed from: e  reason: collision with root package name */
        long f126100e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f126101f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DecorateLandingFragment f126102g;

        /* renamed from: h  reason: collision with root package name */
        int f126103h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DecorateLandingFragment decorateLandingFragment, C17164e<? super b> eVar) {
            super(eVar);
            this.f126102g = decorateLandingFragment;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126101f = obj;
            this.f126103h |= Integer.MIN_VALUE;
            return this.f126102g.x0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.DecorateLandingFragment$onCreateView$1", f = "DecorateLandingFragment.kt", l = {72}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f126104c;

        /* renamed from: d  reason: collision with root package name */
        Object f126105d;

        /* renamed from: e  reason: collision with root package name */
        Object f126106e;

        /* renamed from: f  reason: collision with root package name */
        Object f126107f;

        /* renamed from: g  reason: collision with root package name */
        Object f126108g;

        /* renamed from: h  reason: collision with root package name */
        int f126109h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f126110i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ DecorateLandingFragment f126111j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DecorateLandingFragment decorateLandingFragment, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f126111j = decorateLandingFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f126111j, eVar);
            cVar.f126110i = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object f10 = C17187b.f();
            int i10 = this.f126109h;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f126110i;
                DecorateLandingFragment decorateLandingFragment = this.f126111j;
                try {
                    x.a aVar = x.f139812b;
                    obj2 = x.b(UUID.fromString(decorateLandingFragment.y0().e()));
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj2 = x.b(y.a(th2));
                }
                UUID uuid = null;
                if (x.g(obj2)) {
                    obj2 = null;
                }
                UUID uuid2 = (UUID) obj2;
                if (uuid2 == null) {
                    uuid2 = UUID.randomUUID();
                }
                DecorateLandingFragment decorateLandingFragment2 = this.f126111j;
                try {
                    obj3 = x.b(UUID.fromString(decorateLandingFragment2.y0().a()));
                } catch (Throwable th3) {
                    x.a aVar3 = x.f139812b;
                    obj3 = x.b(y.a(th3));
                }
                if (!x.g(obj3)) {
                    uuid = obj3;
                }
                UUID uuid3 = uuid;
                DesignStateManager A02 = this.f126111j.A0();
                C17542s.g(uuid2);
                this.f126110i = q10;
                this.f126104c = uuid2;
                this.f126105d = uuid3;
                this.f126106e = obj3;
                this.f126107f = decorateLandingFragment2;
                this.f126108g = obj3;
                this.f126109h = 1;
                if (A02.cleanUpTemporaryDesignState(uuid2, uuid3, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                DecorateLandingFragment decorateLandingFragment3 = (DecorateLandingFragment) this.f126107f;
                UUID uuid4 = (UUID) this.f126105d;
                UUID uuid5 = (UUID) this.f126104c;
                Q q11 = (Q) this.f126110i;
                try {
                    y.b(obj);
                } catch (IOException e10) {
                    Log.v(AnyKt.SUGARCUBE_TAG, "Exception while clearing the temp storage for v1: " + e10.getMessage());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.DecorateLandingFragment$onCreateView$2", f = "DecorateLandingFragment.kt", l = {84, 88}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f126112c;

        /* renamed from: d  reason: collision with root package name */
        int f126113d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DecorateLandingFragment f126114e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DecorateLandingFragment decorateLandingFragment, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f126114e = decorateLandingFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f126114e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f126113d
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0025
                if (r2 == r4) goto L_0x001f
                if (r2 != r3) goto L_0x0017
                boolean r1 = r0.f126112c
                XH.y.b(r19)
                goto L_0x004f
            L_0x0017:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001f:
                XH.y.b(r19)
                r2 = r19
                goto L_0x0039
            L_0x0025:
                XH.y.b(r19)
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.data.feature.ConfigRepository r2 = r2.z0()
                com.sugarcube.app.base.data.feature.FeatureFlags$EnableDecorationV2 r6 = com.sugarcube.app.base.data.feature.FeatureFlags.EnableDecorationV2.INSTANCE
                r0.f126113d = r4
                java.lang.Object r2 = r2.isEnabled(r6, r0)
                if (r2 != r1) goto L_0x0039
                return r1
            L_0x0039:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0058
                com.sugarcube.decorate.DecorateLandingFragment r4 = r0.f126114e
                r0.f126112c = r2
                r0.f126113d = r3
                java.lang.Object r3 = r4.x0(r0)
                if (r3 != r1) goto L_0x004e
                return r1
            L_0x004e:
                r1 = r2
            L_0x004f:
                com.sugarcube.decorate.DecorateLandingFragment$a r2 = com.sugarcube.decorate.DecorateLandingFragment.f126089M
                r2.b(r5)
                r2.a(r5)
                r2 = r1
            L_0x0058:
                com.sugarcube.decorate.DecorateLandingFragment r1 = r0.f126114e
                x4.o r6 = androidx.navigation.fragment.a.a(r1)
                r1 = 0
                java.lang.String r3 = ","
                if (r2 == 0) goto L_0x00be
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = r2.y0()
                java.lang.String r2 = r2.e()
                com.sugarcube.decorate.DecorateLandingFragment r4 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r4 = r4.y0()
                java.lang.String r4 = r4.a()
                com.sugarcube.decorate.DecorateLandingFragment r7 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r7 = r7.y0()
                java.lang.String r7 = r7.b()
                java.lang.String r8 = android.net.Uri.decode(r7)
                if (r8 == 0) goto L_0x00b7
                java.lang.String[] r9 = new java.lang.String[]{r3}
                r12 = 6
                r13 = 0
                r10 = 0
                r11 = 0
                java.util.List r3 = HJ.C15854t.Y0(r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L_0x00b7
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x00a0:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x00b7
                java.lang.Object r7 = r3.next()
                r8 = r7
                java.lang.String r8 = (java.lang.String) r8
                int r8 = r8.length()
                if (r8 <= 0) goto L_0x00a0
                r1.add(r7)
                goto L_0x00a0
            L_0x00b7:
                com.sugarcube.decorate.internal.navigation.V2 r3 = new com.sugarcube.decorate.internal.navigation.V2
                r3.<init>(r2, r4, r1)
                r7 = r3
                goto L_0x012f
            L_0x00be:
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = r2.y0()
                java.lang.String r8 = r2.e()
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = r2.y0()
                java.lang.String r9 = r2.a()
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = r2.y0()
                int r10 = r2.c()
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = r2.y0()
                boolean r11 = r2.d()
                com.sugarcube.decorate.DecorateLandingFragment r2 = r0.f126114e
                com.sugarcube.app.base.navigation.Kreativ$Decorate r2 = r2.y0()
                java.lang.String r2 = r2.b()
                java.lang.String r12 = android.net.Uri.decode(r2)
                if (r12 == 0) goto L_0x0128
                java.lang.String[] r13 = new java.lang.String[]{r3}
                r16 = 6
                r17 = 0
                r14 = 0
                r15 = 0
                java.util.List r2 = HJ.C15854t.Y0(r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x0128
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x0111:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0128
                java.lang.Object r3 = r2.next()
                r4 = r3
                java.lang.String r4 = (java.lang.String) r4
                int r4 = r4.length()
                if (r4 <= 0) goto L_0x0111
                r1.add(r3)
                goto L_0x0111
            L_0x0128:
                r12 = r1
                com.sugarcube.decorate.internal.navigation.V1 r1 = new com.sugarcube.decorate.internal.navigation.V1
                r7 = r1
                r7.<init>(r8, r9, r10, r11, r12)
            L_0x012f:
                x4.C$a r1 = new x4.C$a
                r1.<init>()
                java.lang.Class<com.sugarcube.app.base.navigation.Kreativ$Decorate> r2 = com.sugarcube.app.base.navigation.Kreativ.Decorate.class
                uI.d r2 = kotlin.jvm.internal.P.b(r2)
                r1.j(r2, r5, r5)
                x4.C r8 = r1.a()
                r10 = 4
                r11 = 0
                r9 = 0
                x4.C8951o.f0(r6, r7, r8, r9, r10, r11)
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.DecorateLandingFragment.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = (r0 = r0.getResources()).getConfiguration();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean B0() {
        /*
            r3 = this;
            androidx.fragment.app.t r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0019
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0019
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x0019
            int r0 = r0.orientation
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            int r1 = r0.intValue()
            r2 = 6
            if (r1 == r2) goto L_0x0058
        L_0x0024:
            if (r0 != 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x0058
        L_0x002d:
            if (r0 != 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            int r1 = r0.intValue()
            r2 = 8
            if (r1 == r2) goto L_0x0058
        L_0x0038:
            if (r0 != 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            int r1 = r0.intValue()
            r2 = 11
            if (r1 == r2) goto L_0x0058
        L_0x0043:
            if (r0 != 0) goto L_0x0046
            goto L_0x0056
        L_0x0046:
            int r0 = r0.intValue()
            r1 = 2
            if (r0 != r1) goto L_0x0056
            boolean r0 = f126091O
            if (r0 == 0) goto L_0x0056
            boolean r0 = f126092P
            if (r0 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r0 = 0
            goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.DecorateLandingFragment.B0():boolean");
    }

    /* access modifiers changed from: private */
    public static final Kreativ.Decorate w0(DecorateLandingFragment decorateLandingFragment) {
        Object obj;
        C8951o a10 = androidx.navigation.fragment.a.a(decorateLandingFragment);
        int g10 = j.g(Kreativ.Decorate.Companion.serializer());
        Class<Kreativ.Decorate> cls = Kreativ.Decorate.class;
        if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
            List value = a10.G().getValue();
            ListIterator listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C8948l) obj).e().x() == g10) {
                    break;
                }
            }
            C8948l lVar = (C8948l) obj;
            if (lVar != null) {
                Bundle c10 = lVar.c();
                if (c10 == null) {
                    c10 = new Bundle();
                }
                Map<String, C8945i> s10 = lVar.e().s();
                LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
                for (Map.Entry entry : s10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
                }
                return (Kreativ.Decorate) h.a(Kreativ.Decorate.Companion.serializer(), c10, linkedHashMap);
            }
            throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x0(dI.C17164e<? super XH.C16807N> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.sugarcube.decorate.DecorateLandingFragment.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.sugarcube.decorate.DecorateLandingFragment$b r0 = (com.sugarcube.decorate.DecorateLandingFragment.b) r0
            int r1 = r0.f126103h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f126103h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.decorate.DecorateLandingFragment$b r0 = new com.sugarcube.decorate.DecorateLandingFragment$b
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f126101f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f126103h
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x004a
            if (r3 == r5) goto L_0x003c
            if (r3 != r4) goto L_0x0034
            java.lang.Object r15 = r0.f126099d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f126098c
            com.sugarcube.decorate.DecorateLandingFragment r15 = (com.sugarcube.decorate.DecorateLandingFragment) r15
            XH.y.b(r1)
            goto L_0x0076
        L_0x0034:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x003c:
            long r6 = r0.f126100e
            java.lang.Object r15 = r0.f126099d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r3 = r0.f126098c
            com.sugarcube.decorate.DecorateLandingFragment r3 = (com.sugarcube.decorate.DecorateLandingFragment) r3
            XH.y.b(r1)
            goto L_0x0052
        L_0x004a:
            XH.y.b(r1)
            long r6 = java.lang.System.currentTimeMillis()
            r3 = r14
        L_0x0052:
            boolean r1 = r3.B0()
            r8 = 200(0xc8, double:9.9E-322)
            if (r1 == 0) goto L_0x0079
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r6
            int r1 = f126093Q
            long r12 = (long) r1
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x0067
            goto L_0x0079
        L_0x0067:
            r0.f126098c = r3
            r0.f126099d = r15
            r0.f126100e = r6
            r0.f126103h = r4
            java.lang.Object r15 = QJ.C16297b0.b(r8, r0)
            if (r15 != r2) goto L_0x0076
            return r2
        L_0x0076:
            XH.N r15 = XH.C16807N.f139792a
            return r15
        L_0x0079:
            r0.f126098c = r3
            r0.f126099d = r15
            r0.f126100e = r6
            r0.f126103h = r5
            java.lang.Object r1 = QJ.C16297b0.b(r8, r0)
            if (r1 != r2) goto L_0x0052
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.DecorateLandingFragment.x0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Kreativ.Decorate y0() {
        return (Kreativ.Decorate) this.f126095J.getValue();
    }

    public final DesignStateManager A0() {
        DesignStateManager designStateManager = this.f126097L;
        if (designStateManager != null) {
            return designStateManager;
        }
        C17542s.z("designStateManager");
        return null;
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f126094I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        f126092P = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (QJ.T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        SystemUiDelegate.a.a(this, requireActivity, viewLifecycleOwner, false, false, 6, 12, (Object) null);
        f126091O = true;
        C5191t requireActivity2 = requireActivity();
        C17542s.i(requireActivity2, "requireActivity(...)");
        F0 unused2 = C16314k.d(C5222z.a(requireActivity2), (C17168i) null, (QJ.T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C13113u.h(composeView, (C5747v0) null, C13344a.f114037a.a(), 1, (Object) null);
        return composeView;
    }

    public final ConfigRepository z0() {
        ConfigRepository configRepository = this.f126096K;
        if (configRepository != null) {
            return configRepository;
        }
        C17542s.z("configRepository");
        return null;
    }
}
