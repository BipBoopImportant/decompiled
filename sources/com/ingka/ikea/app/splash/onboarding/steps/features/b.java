package com.ingka.ikea.app.splash.onboarding.steps.features;

import HJ.C15854t;
import KJ.C15985a;
import KJ.C15990f;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002-.B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020#0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/b;", "Landroidx/lifecycle/f0;", "LKk/c;", "onboardingFeaturesRepository", "LFk/a;", "onboardingFeaturesAnalytics", "<init>", "(LKk/c;LFk/a;)V", "LXH/N;", "E", "()V", "D", "LIk/a;", "result", "H", "(LIk/a;)V", "", "error", "G", "(Ljava/lang/Throwable;)V", "", "errorMessage", "Lkotlin/Function1;", "LdI/e;", "", "block", "F", "(Ljava/lang/String;LnI/l;)V", "I", "J", "m", "LKk/c;", "n", "LFk/a;", "LTJ/B;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$b;", "o", "LTJ/B;", "_state", "LTJ/P;", "p", "LTJ/P;", "getState", "()LTJ/P;", "state", "b", "a", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Kk.c f92463m;

    /* renamed from: n  reason: collision with root package name */
    private final Fk.a f92464n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<C2055b> f92465o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<C2055b> f92466p;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "", "a", "c", "b", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a$a;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a$b;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a$c;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a$a;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.splash.onboarding.steps.features.b$a$a  reason: collision with other inner class name */
        public static final class C2053a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2053a f92467a = new C2053a();

            private C2053a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2053a);
            }

            public int hashCode() {
                return -1340540468;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a$b;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.splash.onboarding.steps.features.b$a$b  reason: collision with other inner class name */
        public static final class C2054b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2054b f92468a = new C2054b();

            private C2054b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2054b);
            }

            public int hashCode() {
                return 2046437376;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a$c;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f92469a = new c();

            private c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -157382969;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010 ¨\u0006\""}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$b;", "", "", "currentFeatureIndex", "LKJ/f;", "LGh/b;", "features", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "status", "<init>", "(ILKJ/f;Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;)V", "a", "(ILKJ/f;Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;)Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "LKJ/f;", "e", "()LKJ/f;", "c", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "f", "()Lcom/ingka/ikea/app/splash/onboarding/steps/features/b$a;", "()LGh/b;", "currentFeature", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.splash.onboarding.steps.features.b$b  reason: collision with other inner class name */
    public static final class C2055b {

        /* renamed from: a  reason: collision with root package name */
        private final int f92470a;

        /* renamed from: b  reason: collision with root package name */
        private final C15990f<Gh.b> f92471b;

        /* renamed from: c  reason: collision with root package name */
        private final a f92472c;

        public C2055b() {
            this(0, (C15990f) null, (a) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ C2055b b(C2055b bVar, int i10, C15990f<Gh.b> fVar, a aVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = bVar.f92470a;
            }
            if ((i11 & 2) != 0) {
                fVar = bVar.f92471b;
            }
            if ((i11 & 4) != 0) {
                aVar = bVar.f92472c;
            }
            return bVar.a(i10, fVar, aVar);
        }

        public final C2055b a(int i10, C15990f<Gh.b> fVar, a aVar) {
            C17542s.j(fVar, "features");
            C17542s.j(aVar, "status");
            return new C2055b(i10, fVar, aVar);
        }

        public final Gh.b c() {
            return this.f92471b.get(this.f92470a);
        }

        public final int d() {
            return this.f92470a;
        }

        public final C15990f<Gh.b> e() {
            return this.f92471b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2055b)) {
                return false;
            }
            C2055b bVar = (C2055b) obj;
            return this.f92470a == bVar.f92470a && C17542s.e(this.f92471b, bVar.f92471b) && C17542s.e(this.f92472c, bVar.f92472c);
        }

        public final a f() {
            return this.f92472c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f92470a) * 31) + this.f92471b.hashCode()) * 31) + this.f92472c.hashCode();
        }

        public String toString() {
            int i10 = this.f92470a;
            C15990f<Gh.b> fVar = this.f92471b;
            a aVar = this.f92472c;
            return "UIState(currentFeatureIndex=" + i10 + ", features=" + fVar + ", status=" + aVar + ")";
        }

        public C2055b(int i10, C15990f<Gh.b> fVar, a aVar) {
            C17542s.j(fVar, "features");
            C17542s.j(aVar, "status");
            this.f92470a = i10;
            this.f92471b = fVar;
            this.f92472c = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2055b(int i10, C15990f fVar, a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? C15985a.a() : fVar, (i11 & 4) != 0 ? a.C2054b.f92468a : aVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.splash.onboarding.steps.features.OnboardingFeaturesGalleryViewModel$fetchOnboardingFeatures$1", f = "OnboardingFeaturesGalleryViewModel.kt", l = {60}, m = "invokeSuspend")
    static final class c extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f92474d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(1, eVar);
            this.f92474d = bVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f92474d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f92473c;
            if (i10 == 0) {
                y.b(obj);
                this.f92474d.D();
                Kk.c i11 = this.f92474d.f92463m;
                this.f92473c = 1;
                obj2 = i11.a(this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = this.f92474d;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                bVar.H((Ik.a) obj2);
            } else {
                bVar.G(e10);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/splash/onboarding/steps/features/b$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92475a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f92476b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, b bVar, String str) {
            super(aVar);
            this.f92475a = bVar;
            this.f92476b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            C16505B j10 = this.f92475a.f92465o;
            do {
                value = j10.getValue();
            } while (!j10.e(value, ((C2055b) value).a(0, C15985a.a(), a.C2053a.f92467a)));
            b bVar = this.f92475a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a(this.f92476b, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.splash.onboarding.steps.features.OnboardingFeaturesGalleryViewModel$launch$2", f = "OnboardingFeaturesGalleryViewModel.kt", l = {119}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92477c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f92478d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f92478d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f92478d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92477c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f92478d;
                this.f92477c = 1;
                if (lVar.invoke(this) == f10) {
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

    public b(Kk.c cVar, Fk.a aVar) {
        C17542s.j(cVar, "onboardingFeaturesRepository");
        C17542s.j(aVar, "onboardingFeaturesAnalytics");
        this.f92463m = cVar;
        this.f92464n = aVar;
        C16505B<C2055b> a10 = C16521S.a(new C2055b(0, (C15990f) null, (a) null, 7, (DefaultConstructorMarker) null));
        this.f92465o = a10;
        this.f92466p = C16534i.c0(a10, g0.a(this), ip.f.a(), a10.getValue());
        E();
    }

    /* access modifiers changed from: private */
    public final void D() {
        C2055b value;
        C16505B<C2055b> b10 = this.f92465o;
        do {
            value = b10.getValue();
        } while (!b10.e(value, value.a(0, C15985a.a(), a.C2054b.f92468a)));
    }

    private final void E() {
        F("Failed to init fte region view model.", new c(this, (C17164e<? super c>) null));
    }

    private final void F(String str, C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this, str), (T) null, new e(lVar, (C17164e<? super e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void G(Throwable th2) {
        C2055b value;
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
                String a10 = C11818a.a("Failed to fetch feature gallery", th2);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = b.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, th2, str3);
            str = str3;
            str2 = str4;
        }
        C16505B<C2055b> b10 = this.f92465o;
        do {
            value = b10.getValue();
        } while (!b10.e(value, value.a(0, C15985a.a(), a.C2053a.f92467a)));
    }

    /* access modifiers changed from: private */
    public final void H(Ik.a aVar) {
        C2055b value;
        C2055b a10;
        C16505B<C2055b> b10 = this.f92465o;
        do {
            value = b10.getValue();
            a10 = value.a(0, C15985a.l(aVar.a()), aVar.a().isEmpty() ? a.C2053a.f92467a : a.c.f92469a);
            this.f92464n.c(a10.c());
        } while (!b10.e(value, a10));
    }

    public final void I() {
        C2055b value;
        C2055b b10;
        C16505B<C2055b> b11 = this.f92465o;
        do {
            value = b11.getValue();
            C2055b bVar = value;
            b10 = C2055b.b(bVar, (bVar.d() + 1) % bVar.e().size(), (C15990f) null, (a) null, 6, (Object) null);
            this.f92464n.c(b10.c());
        } while (!b11.e(value, b10));
    }

    public final void J() {
        E();
    }

    public final C16519P<C2055b> getState() {
        return this.f92466p;
    }
}
