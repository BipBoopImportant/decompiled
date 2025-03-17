package com.ingka.ikea.app.splash;

import Ae.s;
import Dk.g;
import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rk.f;
import TJ.C16519P;
import TJ.C16533h;
import TJ.C16534i;
import XD.C13803a;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.g0;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.j;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jC.C14615b;
import jC.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import lg.C10024a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tK.C18010a;
import u2.C6012a;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0012\u0010\u0005J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0015¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0019\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0005R\u001a\u0010(\u001a\u00020\u001a8\u0016XD¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020\u001a8\u0016XD¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001a\u0010.\u001a\u00020\u001a8\u0014XD¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\"\u00106\u001a\u00020/8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0000@\u0000X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010W\u001a\b\u0012\u0004\u0012\u00020P0O8V@\u0016X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010]\u001a\u00020X8BX\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010e\u001a\u00020b8\u0014XD¢\u0006\f\n\u0004\bc\u0010H\u001a\u0004\bY\u0010dR\u001a\u0010g\u001a\u00020b8\u0014XD¢\u0006\f\n\u0004\bf\u0010H\u001a\u0004\bQ\u0010dR\u001a\u0010i\u001a\u00020b8\u0014XD¢\u0006\f\n\u0004\bS\u0010H\u001a\u0004\bh\u0010d¨\u0006j"}, d2 = {"Lcom/ingka/ikea/app/splash/FirstEntryActivity;", "Lcom/ingka/ikea/core/android/activities/NavigationHostActivity;", "Low/d;", "LXD/a;", "<init>", "()V", "LRk/f$b;", "state", "LXH/N;", "e1", "(LRk/f$b;)V", "Landroid/net/Uri;", "deeplink", "b1", "(Landroid/net/Uri;)V", "deepLink", "c1", "V0", "d1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStop", "outState", "onSaveInstanceState", "", "market", "language", "h", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "b0", "R", "Ljava/lang/String;", "K0", "()Ljava/lang/String;", "startRoute", "S", "I0", "path", "T", "E0", "graphRootRoute", "Lpw/c;", "U", "Lpw/c;", "a1", "()Lpw/c;", "setWelcomeActivityApi$splash_release", "(Lpw/c;)V", "welcomeActivityApi", "Lcom/ingka/ikea/app/splash/o;", "X", "Lcom/ingka/ikea/app/splash/o;", "Y0", "()Lcom/ingka/ikea/app/splash/o;", "setSplashHandler$splash_release", "(Lcom/ingka/ikea/app/splash/o;)V", "splashHandler", "LDk/g;", "Y", "LDk/g;", "X0", "()LDk/g;", "setSplashDestinationBuilder$splash_release", "(LDk/g;)V", "splashDestinationBuilder", "LAe/s;", "Z", "LAe/s;", "W0", "()LAe/s;", "setScreenAnalyticsTracker", "(LAe/s;)V", "screenAnalyticsTracker", "", "Low/b;", "y0", "Ljava/util/Set;", "D0", "()Ljava/util/Set;", "setDestinationBuilders", "(Ljava/util/Set;)V", "destinationBuilders", "LRk/f;", "z0", "LXH/o;", "Z0", "()LRk/f;", "splashViewModel", "Ljava/util/Locale;", "A0", "Ljava/util/Locale;", "selectedLocale", "", "B0", "()Z", "drawUnderStatusBar", "C0", "drawUnderNavigationBar", "x0", "drawUnderDisplayCutout", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CommitTransaction"})
public final class FirstEntryActivity extends Hilt_FirstEntryActivity implements ow.d, C13803a {

    /* renamed from: A0  reason: collision with root package name */
    private Locale f92390A0;

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f92391B0 = true;

    /* renamed from: C0  reason: collision with root package name */
    private final boolean f92392C0 = true;

    /* renamed from: D0  reason: collision with root package name */
    private final boolean f92393D0 = true;

    /* renamed from: R  reason: collision with root package name */
    private final String f92394R = "firstEntry";

    /* renamed from: S  reason: collision with root package name */
    private final String f92395S = "splash";

    /* renamed from: T  reason: collision with root package name */
    private final String f92396T = "root";

    /* renamed from: U  reason: collision with root package name */
    public pw.c f92397U;

    /* renamed from: X  reason: collision with root package name */
    public o f92398X;

    /* renamed from: Y  reason: collision with root package name */
    public g f92399Y;

    /* renamed from: Z  reason: collision with root package name */
    public s f92400Z;

    /* renamed from: y0  reason: collision with root package name */
    private Set<? extends ow.b> f92401y0 = g0.d();

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f92402z0 = new h0(P.b(f.class), new d(this), new c(this), new e((C17631a) null, this));

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lx4/l;", "backStack", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.FirstEntryActivity$observeAndPrintNavStack$1", f = "FirstEntryActivity.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<List<? extends C8948l>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92403c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92404d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ FirstEntryActivity f92405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FirstEntryActivity firstEntryActivity, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f92405e = firstEntryActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f92405e, eVar);
            aVar.f92404d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(List<C8948l> list, C17164e<? super C16807N> eVar) {
            return ((a) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            int i10;
            C17187b.f();
            if (this.f92403c == 0) {
                y.b(obj);
                List V10 = C16877v.V((List) this.f92404d);
                FirstEntryActivity firstEntryActivity = this.f92405e;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                Iterator it = qv.d.f102012a.a().iterator();
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        Iterable iterable = V10;
                        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                        int i11 = i10;
                        for (Object next2 : iterable) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                C16877v.x();
                            }
                            arrayList2.add("\t" + ((C8948l) next2).e().C() + "@depth " + i11);
                            i11 = i12;
                        }
                        String a10 = C11818a.a("FirstEntryActivity backstack has changed: \n" + C16877v.G0(arrayList2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = firstEntryActivity.getClass().getName();
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
                    i10 = 0;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.FirstEntryActivity$onCreate$5", f = "FirstEntryActivity.kt", l = {122}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92406c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FirstEntryActivity f92407d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.splash.FirstEntryActivity$onCreate$5$1", f = "FirstEntryActivity.kt", l = {123}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f92408c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ FirstEntryActivity f92409d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.splash.FirstEntryActivity$b$a$a  reason: collision with other inner class name */
            static final class C2051a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FirstEntryActivity f92410a;

                C2051a(FirstEntryActivity firstEntryActivity) {
                    this.f92410a = firstEntryActivity;
                }

                /* renamed from: c */
                public final Object emit(f.b bVar, C17164e<? super C16807N> eVar) {
                    this.f92410a.e1(bVar);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(FirstEntryActivity firstEntryActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f92409d = firstEntryActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f92409d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f92408c;
                if (i10 == 0) {
                    y.b(obj);
                    C16519P<f.b> state = this.f92409d.Z0().getState();
                    C2051a aVar = new C2051a(this.f92409d);
                    this.f92408c = 1;
                    if (state.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y.b(obj);
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FirstEntryActivity firstEntryActivity, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f92407d = firstEntryActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f92407d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92406c;
            if (i10 == 0) {
                y.b(obj);
                FirstEntryActivity firstEntryActivity = this.f92407d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(firstEntryActivity, (C17164e<? super a>) null);
                this.f92406c = 1;
                if (androidx.lifecycle.Q.b(firstEntryActivity, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f92411c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar) {
            super(0);
            this.f92411c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f92411c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f92412c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j jVar) {
            super(0);
            this.f92412c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f92412c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92413c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f92414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, j jVar) {
            super(0);
            this.f92413c = aVar;
            this.f92414d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f92413c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f92414d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.splash.FirstEntryActivity.e.invoke():l3.a");
        }
    }

    private final void V0() {
        Y0().a();
        getWindow().setBackgroundDrawable(new ColorDrawable(C6012a.c(this, C18010a.f147420d)));
    }

    /* access modifiers changed from: private */
    public final f Z0() {
        return (f) this.f92402z0.getValue();
    }

    private final void b1(Uri uri) {
        startActivity(AppLinkActivity.f92375C.a(this, uri));
        finish();
    }

    private final void c1(Uri uri) {
        Intent a10 = a1().a(this);
        if (uri != null) {
            a10.setAction("android.intent.action.VIEW");
            a10.setData(uri);
        }
        startActivity(a10);
        overridePendingTransition(k.f92427b, k.f92426a);
        V0();
        finishAfterTransition();
    }

    @SuppressLint({"RestrictedApi"})
    private final void d1() {
        C16534i.M(C16534i.R(C5208k.a(F0().G(), getLifecycle(), r.b.STARTED), new a(this, (C17164e<? super a>) null)), C5222z.a(this));
    }

    /* access modifiers changed from: private */
    public final void e1(f.b bVar) {
        if (bVar instanceof f.b.a) {
            finish();
        } else if (bVar instanceof f.b.C1790b) {
            String a10 = ((f.b.C1790b) bVar).a();
            c1(a10 != null ? Uri.parse(a10) : null);
        } else if (bVar instanceof f.b.c) {
            b1(Uri.parse(((f.b.c) bVar).a()));
        } else if (bVar instanceof f.b.d) {
            V0();
        } else if (!(bVar instanceof f.b.e)) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        lC.l a10 = qVar.a();
        C14615b.C3152b bVar = C14615b.C3152b.f127857b;
        a10.a(bVar);
        qVar.b().a(bVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void g1(FirstEntryActivity firstEntryActivity, C8951o oVar, v vVar, Bundle bundle) {
        r lifecycle;
        C17542s.j(oVar, "navController");
        C17542s.j(vVar, "destination");
        C8948l H10 = oVar.H();
        if (H10 != null && (lifecycle = H10.getLifecycle()) != null) {
            firstEntryActivity.W0().a(vVar, firstEntryActivity, lifecycle, Xo.b.a(bundle));
        }
    }

    public Set<ow.b> D0() {
        return g0.c(X0());
    }

    /* access modifiers changed from: protected */
    public String E0() {
        return this.f92396T;
    }

    public String I0() {
        return this.f92395S;
    }

    public String K0() {
        return this.f92394R;
    }

    public final s W0() {
        s sVar = this.f92400Z;
        if (sVar != null) {
            return sVar;
        }
        C17542s.z("screenAnalyticsTracker");
        return null;
    }

    public final g X0() {
        g gVar = this.f92399Y;
        if (gVar != null) {
            return gVar;
        }
        C17542s.z("splashDestinationBuilder");
        return null;
    }

    public final o Y0() {
        o oVar = this.f92398X;
        if (oVar != null) {
            return oVar;
        }
        C17542s.z("splashHandler");
        return null;
    }

    public final pw.c a1() {
        pw.c cVar = this.f92397U;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("welcomeActivityApi");
        return null;
    }

    public void b0() {
        Z0().F();
    }

    public void h(String str, String str2) {
        C17542s.j(str, "market");
        C17542s.j(str2, "language");
        Locale locale = new Locale(str2, str);
        if (!C17542s.e(this.f92390A0, locale)) {
            this.f92390A0 = locale;
            w0().b(locale);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        androidx.appcompat.app.g.R(true);
        super.onCreate(bundle);
        b(new f());
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
                String a10 = C11818a.a("FistEntryActivity onCreate()", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = FirstEntryActivity.class.getName();
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
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("locale");
            Locale locale = serializable instanceof Locale ? (Locale) serializable : null;
            if (locale != null) {
                w0().b(locale);
            }
        }
        this.f92390A0 = Zo.b.f90092a.d();
        overridePendingTransition(C10024a.f75258j, 0);
        F0().r(new g(this));
        if (bundle == null) {
            Z0().D(Rk.e.f86503c.a(getIntent()));
            F2.c.f6024b.a(this).c(Y0());
        }
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        d1();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C17542s.j(intent, "intent");
        super.onNewIntent(intent);
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
                String a10 = C11818a.a("FistEntryActivity - onNewIntent()", (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = FirstEntryActivity.class.getName();
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
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("locale", this.f92390A0);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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
                String a10 = C11818a.a("FistEntryActivity onStop()", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = FirstEntryActivity.class.getName();
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
        super.onStop();
        V0();
    }

    /* access modifiers changed from: protected */
    public boolean x0() {
        return this.f92393D0;
    }

    /* access modifiers changed from: protected */
    public boolean y0() {
        return this.f92392C0;
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f92391B0;
    }
}
