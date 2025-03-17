package com.sugarcube.app.base;

import OE.C13309a;
import OE.C13311c;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.g0;
import android.content.Context;
import bK.C17052a;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.decorate.DecorateCompatibilityProvider;
import dI.C17164e;
import eI.C17187b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u0001:\u0001\u001dB;\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H@¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0010H@¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014H@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/sugarcube/app/base/a;", "Lcom/sugarcube/app/base/DeviceCompatibility;", "LOE/a;", "appEnvironment", "Landroid/content/Context;", "appContext", "Lcom/sugarcube/app/base/external/config/a;", "appConfig", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LOE/c;", "wrapper", "Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "decorateCompatibilityProvider", "<init>", "(LOE/a;Landroid/content/Context;Lcom/sugarcube/app/base/external/config/a;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LOE/c;Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;)V", "Lcom/sugarcube/app/base/DeviceCompatibility$a;", "d", "(LdI/e;)Ljava/lang/Object;", "LXH/v;", "", "c", "updateCompatibility", "isKreativEnabled", "isDecorateSupported", "()Z", "isCaptureEnabled", "a", "LOE/a;", "b", "Landroid/content/Context;", "Lcom/sugarcube/app/base/external/config/a;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "e", "LOE/c;", "f", "Lcom/sugarcube/app/base/decorate/DecorateCompatibilityProvider;", "LTJ/B;", "g", "LTJ/B;", "_supportedFeatures", "LTJ/g;", "h", "LTJ/g;", "getSupportedFeatures", "()LTJ/g;", "supportedFeatures", "LbK/a;", "i", "LbK/a;", "updateMutex", "j", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements DeviceCompatibility {

    /* renamed from: j  reason: collision with root package name */
    public static final b f122707j = new b((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f122708k = 8;

    /* renamed from: l  reason: collision with root package name */
    private static final Set<String> f122709l = g0.h("us", "ca", "gb", "ie", "es", "de", "fr", "nl", "se", "dk", "jp", "kr", "au", "pl", "it", "at", "ch", "be", "fi", "pt", "no", "cz", "hu", "sk", "ro", "hr", "rs", "sl", "in");

    /* renamed from: a  reason: collision with root package name */
    private final C13309a f122710a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f122711b;

    /* renamed from: c  reason: collision with root package name */
    private final com.sugarcube.app.base.external.config.a f122712c;

    /* renamed from: d  reason: collision with root package name */
    private final ConfigRepository f122713d;

    /* renamed from: e  reason: collision with root package name */
    private final C13311c f122714e;

    /* renamed from: f  reason: collision with root package name */
    private final DecorateCompatibilityProvider f122715f;

    /* renamed from: g  reason: collision with root package name */
    private final C16505B<DeviceCompatibility.a> f122716g;

    /* renamed from: h  reason: collision with root package name */
    private final C16532g<DeviceCompatibility.a> f122717h;

    /* renamed from: i  reason: collision with root package name */
    private final C17052a f122718i = bK.g.b(false, 1, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.DeviceCompatibilityImpl$1", f = "DeviceCompatibility.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.a$a  reason: collision with other inner class name */
    static final class C3023a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f122719c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f122720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3023a(a aVar, C17164e<? super C3023a> eVar) {
            super(2, eVar);
            this.f122720d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3023a(this.f122720d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3023a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f122719c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f122720d;
                this.f122719c = 1;
                if (aVar.updateCompatibility(this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sugarcube/app/base/a$b;", "", "<init>", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.DeviceCompatibilityImpl", f = "DeviceCompatibility.kt", l = {200}, m = "isKreativEnabled")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122721c;

        /* renamed from: d  reason: collision with root package name */
        Object f122722d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f122723e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f122724f;

        /* renamed from: g  reason: collision with root package name */
        int f122725g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f122724f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122723e = obj;
            this.f122725g |= Integer.MIN_VALUE;
            return this.f122724f.isKreativEnabled(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.DeviceCompatibilityImpl", f = "DeviceCompatibility.kt", l = {209}, m = "isKreativEnabledInternal")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122726c;

        /* renamed from: d  reason: collision with root package name */
        Object f122727d;

        /* renamed from: e  reason: collision with root package name */
        Object f122728e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f122729f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f122730g;

        /* renamed from: h  reason: collision with root package name */
        int f122731h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f122730g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122729f = obj;
            this.f122731h |= Integer.MIN_VALUE;
            return this.f122730g.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lcom/sugarcube/app/base/DeviceCompatibility$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.DeviceCompatibilityImpl$supportedFeatures$1", f = "DeviceCompatibility.kt", l = {86}, m = "invokeSuspend")
    static final class e extends l implements p<C16533h<? super DeviceCompatibility.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f122732c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f122733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f122733d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f122733d, eVar);
        }

        public final Object invoke(C16533h<? super DeviceCompatibility.a> hVar, C17164e<? super C16807N> eVar) {
            return ((e) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f122732c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f122733d;
                this.f122732c = 1;
                if (aVar.updateCompatibility(this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.DeviceCompatibilityImpl", f = "DeviceCompatibility.kt", l = {278, 100}, m = "updateCompatibility")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122734c;

        /* renamed from: d  reason: collision with root package name */
        Object f122735d;

        /* renamed from: e  reason: collision with root package name */
        Object f122736e;

        /* renamed from: f  reason: collision with root package name */
        int f122737f;

        /* renamed from: g  reason: collision with root package name */
        int f122738g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f122739h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f122740i;

        /* renamed from: j  reason: collision with root package name */
        int f122741j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f122740i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122739h = obj;
            this.f122741j |= Integer.MIN_VALUE;
            return this.f122740i.updateCompatibility(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.DeviceCompatibilityImpl", f = "DeviceCompatibility.kt", l = {104, 122, 129, 135, 149, 151, 189}, m = "updateCompatibilityInternal")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f122742c;

        /* renamed from: d  reason: collision with root package name */
        Object f122743d;

        /* renamed from: e  reason: collision with root package name */
        Object f122744e;

        /* renamed from: f  reason: collision with root package name */
        Object f122745f;

        /* renamed from: g  reason: collision with root package name */
        Object f122746g;

        /* renamed from: h  reason: collision with root package name */
        Object f122747h;

        /* renamed from: i  reason: collision with root package name */
        Object f122748i;

        /* renamed from: j  reason: collision with root package name */
        Object f122749j;

        /* renamed from: k  reason: collision with root package name */
        boolean f122750k;

        /* renamed from: l  reason: collision with root package name */
        boolean f122751l;

        /* renamed from: m  reason: collision with root package name */
        boolean f122752m;

        /* renamed from: n  reason: collision with root package name */
        boolean f122753n;

        /* renamed from: o  reason: collision with root package name */
        boolean f122754o;

        /* renamed from: p  reason: collision with root package name */
        int f122755p;

        /* renamed from: q  reason: collision with root package name */
        int f122756q;

        /* renamed from: r  reason: collision with root package name */
        int f122757r;

        /* renamed from: s  reason: collision with root package name */
        int f122758s;

        /* renamed from: t  reason: collision with root package name */
        int f122759t;

        /* renamed from: u  reason: collision with root package name */
        int f122760u;

        /* renamed from: v  reason: collision with root package name */
        /* synthetic */ Object f122761v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ a f122762w;

        /* renamed from: x  reason: collision with root package name */
        int f122763x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f122762w = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f122761v = obj;
            this.f122763x |= Integer.MIN_VALUE;
            return this.f122762w.d(this);
        }
    }

    public a(C13309a aVar, Context context, com.sugarcube.app.base.external.config.a aVar2, ConfigRepository configRepository, C13311c cVar, DecorateCompatibilityProvider decorateCompatibilityProvider) {
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(context, "appContext");
        C17542s.j(aVar2, "appConfig");
        C17542s.j(configRepository, "configRepository");
        C17542s.j(cVar, "wrapper");
        C17542s.j(decorateCompatibilityProvider, "decorateCompatibilityProvider");
        this.f122710a = aVar;
        this.f122711b = context;
        this.f122712c = aVar2;
        this.f122713d = configRepository;
        this.f122714e = cVar;
        this.f122715f = decorateCompatibilityProvider;
        C16505B<DeviceCompatibility.a> a10 = C16521S.a(null);
        this.f122716g = a10;
        this.f122717h = C16534i.A(C16534i.T(a10, new e(this, (C17164e<? super e>) null)));
        F0 unused = C16314k.d(aVar.b(), aVar.e(), (T) null, new C3023a(this, (C17164e<? super C3023a>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(dI.C17164e<? super XH.v<java.lang.Boolean, java.lang.Boolean>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.a.d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.a$d r0 = (com.sugarcube.app.base.a.d) r0
            int r1 = r0.f122731h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f122731h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.a$d r0 = new com.sugarcube.app.base.a$d
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f122729f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f122731h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r7 = r0.f122728e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f122727d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f122726c
            com.sugarcube.app.base.a r7 = (com.sugarcube.app.base.a) r7
            XH.y.b(r1)
            goto L_0x0076
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.app.base.external.config.a r1 = r6.f122712c
            java.lang.String r1 = r1.getCountry()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.String r3 = "toLowerCase(...)"
            kotlin.jvm.internal.C17542s.i(r1, r3)
            java.util.Set<java.lang.String> r3 = f122709l
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0063
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r4)
            r0 = 0
            XH.v r7 = XH.C16796C.a(r7, r0)
            goto L_0x0088
        L_0x0063:
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r6.f122713d
            com.sugarcube.app.base.data.feature.FeatureFlags$Kreativ r5 = com.sugarcube.app.base.data.feature.FeatureFlags.Kreativ.INSTANCE
            r0.f122726c = r6
            r0.f122727d = r7
            r0.f122728e = r1
            r0.f122731h = r4
            java.lang.Object r1 = r3.getState(r5, r0)
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            com.sugarcube.app.base.data.feature.ConfigState r1 = (com.sugarcube.app.base.data.feature.ConfigState) r1
            java.lang.Object r7 = r1.getCurrentValue()
            boolean r0 = r1.getInitialized()
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
            XH.v r7 = XH.C16796C.a(r7, r0)
        L_0x0088:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.a.c(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0132, code lost:
        r3 = (XH.v) r3;
        r6 = ((java.lang.Boolean) r3.a()).booleanValue();
        r9 = (java.lang.Boolean) r3.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0145, code lost:
        if (r6 != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0147, code lost:
        r8 = new com.sugarcube.app.base.DeviceCompatibility.a(r9, false, false, false, (com.google.ar.core.ArCoreApk.Availability) null, (java.lang.Boolean) null, false);
        r5.f122716g.setValue(r8);
        YE.C13868b.f118106a.b("Kreativ not enabled", YE.e.Meta);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0161, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0162, code lost:
        r7 = r5.f122713d;
        r8 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureAndDesignBlacklisted.INSTANCE;
        r2.f122742c = r5;
        r2.f122743d = r1;
        r2.f122744e = r3;
        r2.f122745f = r9;
        r2.f122750k = r6;
        r2.f122763x = 2;
        r7 = r7.getState(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0177, code lost:
        if (r7 != r4) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0179, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x017a, code lost:
        r9 = r1;
        r8 = r3;
        r10 = r5;
        r5 = r6;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x017f, code lost:
        r6 = (com.sugarcube.app.base.data.feature.ConfigState) r3;
        r1 = ((java.lang.Boolean) r6.getCurrentValue()).booleanValue();
        r7 = kotlin.coroutines.jvm.internal.b.a(r6.getInitialized());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0194, code lost:
        if (r1 == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0196, code lost:
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r1;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x019f, code lost:
        r3 = r10.f122713d;
        r11 = com.sugarcube.app.base.data.feature.FeatureFlags.DesignBlacklisted.INSTANCE;
        r2.f122742c = r10;
        r2.f122743d = r9;
        r2.f122744e = r8;
        r2.f122745f = r7;
        r2.f122746g = r6;
        r2.f122750k = r5;
        r2.f122751l = r1;
        r2.f122763x = 3;
        r3 = r3.get(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01b8, code lost:
        if (r3 != r4) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01ba, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01bb, code lost:
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r1;
        r1 = ((java.lang.Boolean) r3).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01c9, code lost:
        if (r5 == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01cb, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01cd, code lost:
        r3 = r11.f122713d;
        r12 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureBlacklisted.INSTANCE;
        r2.f122742c = r11;
        r2.f122743d = r10;
        r2.f122744e = r9;
        r2.f122745f = r8;
        r2.f122746g = r7;
        r2.f122750k = r6;
        r2.f122751l = r5;
        r2.f122755p = r1;
        r2.f122763x = 4;
        r3 = r3.get(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01e8, code lost:
        if (r3 != r4) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01ea, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01eb, code lost:
        r3 = ((java.lang.Boolean) r3).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01f1, code lost:
        r12 = r11.f122715f.isSupported();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01f7, code lost:
        if (r12 == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (r1 != 0) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01fb, code lost:
        r13 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01fd, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01fe, code lost:
        r14 = null;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0200, code lost:
        r0 = r11.f122714e;
        r18 = r4;
        r4 = r11.f122711b;
        r2.f122742c = r11;
        r2.f122743d = r10;
        r2.f122744e = r9;
        r2.f122745f = r8;
        r2.f122746g = r7;
        r2.f122747h = r14;
        r2.f122750k = r6;
        r2.f122751l = r5;
        r2.f122755p = r1;
        r2.f122756q = r3;
        r2.f122752m = r12;
        r2.f122757r = r13;
        r2.f122758s = r15;
        r2.f122763x = 5;
        r0 = r0.a(r4, r2);
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0229, code lost:
        if (r0 != r4) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x022b, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x022c, code lost:
        r32 = r3;
        r3 = r0;
        r0 = r7;
        r7 = r8;
        r8 = r10;
        r10 = r32;
        r33 = r11;
        r11 = r1;
        r1 = r15;
        r15 = r33;
        r34 = r12;
        r12 = r5;
        r5 = r13;
        r13 = r6;
        r6 = r9;
        r9 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0242, code lost:
        r14 = (com.google.ar.core.ArCoreApk.Availability) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0249, code lost:
        if (r14.isTransient() == false) goto L_0x0290;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x024b, code lost:
        r3 = java.util.concurrent.TimeUnit.SECONDS.toMillis(3);
        r2.f122742c = r15;
        r2.f122743d = r8;
        r2.f122744e = r6;
        r2.f122745f = r7;
        r2.f122746g = r0;
        r2.f122747h = r14;
        r2.f122750k = r13;
        r2.f122751l = r12;
        r2.f122755p = r11;
        r2.f122756q = r10;
        r2.f122752m = r9;
        r5 = r5;
        r2.f122757r = r5;
        r2.f122758s = r1;
        r36 = r0;
        r2.f122763x = 6;
        r0 = QJ.C16297b0.b(r3, r2);
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x027e, code lost:
        if (r0 != r3) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0280, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0281, code lost:
        r0 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0283, code lost:
        r4 = r8;
        r8 = r7;
        r7 = r0;
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0287, code lost:
        r32 = r13;
        r13 = r5;
        r5 = r12;
        r12 = r9;
        r9 = r6;
        r6 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0290, code lost:
        r36 = r0;
        r3 = r4;
        r4 = r8;
        r0 = 1;
        r8 = r7;
        r7 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0299, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x029e, code lost:
        if (r14.isTransient() == false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02a1, code lost:
        if (r1 < 5) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02a4, code lost:
        r32 = r15;
        r15 = r1;
        r1 = r11;
        r11 = r32;
        r33 = r4;
        r4 = r3;
        r3 = r10;
        r10 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b2, code lost:
        r0 = r15.f122714e.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02b8, code lost:
        if (r0 == false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02ba, code lost:
        if (r10 != 0) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02bc, code lost:
        r36 = r1;
        r16 = r3;
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02c2, code lost:
        r36 = r1;
        r16 = r3;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02c7, code lost:
        r25 = r7;
        r1 = r15.f122714e.c(r15.f122711b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02d1, code lost:
        if (r11 == 0) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02d3, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02d5, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02d6, code lost:
        r26 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02d8, code lost:
        if (r13 == 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02da, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02dc, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02dd, code lost:
        r28 = r9;
        r27 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02e1, code lost:
        if (r10 == 0) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02e3, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02e5, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02e6, code lost:
        r9 = r15.f122712c.getCountry();
        r29 = r4;
        r4 = r15.f122713d.getEnabledFeatures();
        r30 = r2;
        r2 = new java.lang.StringBuilder();
        r31 = r15;
        r2.append("\n                configReady: ");
        r2.append(r8);
        r2.append("\n                isDesignBlacklisted: ");
        r2.append(r7);
        r2.append(" \n                isDecorateSupported: ");
        r2.append(r12);
        r2.append(" \n                isDecorateEnabled: ");
        r2.append(r11);
        r2.append(" \n                arCoreAvailability: ");
        r2.append(r14);
        r2.append(" \n                isCaptureSupported: ");
        r2.append(r0);
        r2.append(" \n                isCaptureBlacklisted: ");
        r2.append(r10);
        r2.append("\n                isCaptureEnabled: ");
        r2.append(r3);
        r2.append("\n                isCaptureAndDesignBlacklisted: ");
        r2.append(r5);
        r2.append("\n                isUltrawideSupported: ");
        r2.append(r1);
        r2.append("\n                country: ");
        r2.append(r9);
        r2.append("\n                OptimizelyFlags: ");
        r2.append(r4);
        r2.append("\n            ");
        r2 = r2.toString();
        YE.C13868b.f118106a.b(r2, YE.e.Meta);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x036d, code lost:
        if (r6 == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x036f, code lost:
        if (r3 != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0371, code lost:
        if (r13 == 0) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0373, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0375, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0378, code lost:
        if (r13 == 0) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x037a, code lost:
        r21 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x037d, code lost:
        r21 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x037f, code lost:
        r17 = new com.sugarcube.app.base.DeviceCompatibility.a(r8, r4, r3, r21, r14, kotlin.coroutines.jvm.internal.b.a(r5), r1);
        r15 = r31;
        r9 = r15.f122716g;
        r10 = r30;
        r10.f122742c = r15;
        r10.f122743d = r29;
        r10.f122744e = r28;
        r10.f122745f = r8;
        r10.f122746g = r25;
        r10.f122747h = r14;
        r10.f122748i = r2;
        r10.f122749j = r17;
        r10.f122750k = r6;
        r10.f122751l = r5;
        r10.f122755p = r26;
        r10.f122756q = r27;
        r10.f122752m = r12;
        r10.f122757r = r13;
        r10.f122758s = r36;
        r10.f122753n = r0;
        r10.f122759t = r3 ? 1 : 0;
        r10.f122754o = r1;
        r10.f122760u = r4 ? 1 : 0;
        r10.f122763x = 7;
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03d3, code lost:
        if (r9.emit(r17, r10) != r1) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03d5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return r17;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(dI.C17164e<? super com.sugarcube.app.base.DeviceCompatibility.a> r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            boolean r2 = r1 instanceof com.sugarcube.app.base.a.g
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.a$g r2 = (com.sugarcube.app.base.a.g) r2
            int r3 = r2.f122763x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f122763x = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.a$g r2 = new com.sugarcube.app.base.a$g
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f122761v
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f122763x
            switch(r5) {
                case 0: goto L_0x0120;
                case 1: goto L_0x0114;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00bd;
                case 5: goto L_0x0086;
                case 6: goto L_0x0054;
                case 7: goto L_0x002f;
                default: goto L_0x0027;
            }
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            java.lang.Object r1 = r2.f122749j
            com.sugarcube.app.base.DeviceCompatibility$a r1 = (com.sugarcube.app.base.DeviceCompatibility.a) r1
            java.lang.Object r4 = r2.f122748i
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r2.f122747h
            com.google.ar.core.ArCoreApk$Availability r4 = (com.google.ar.core.ArCoreApk.Availability) r4
            java.lang.Object r4 = r2.f122746g
            com.sugarcube.app.base.data.feature.ConfigState r4 = (com.sugarcube.app.base.data.feature.ConfigState) r4
            java.lang.Object r4 = r2.f122745f
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Object r4 = r2.f122744e
            XH.v r4 = (XH.v) r4
            java.lang.Object r4 = r2.f122743d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r2 = r2.f122742c
            com.sugarcube.app.base.a r2 = (com.sugarcube.app.base.a) r2
            XH.y.b(r3)
            goto L_0x03d7
        L_0x0054:
            int r1 = r2.f122758s
            int r5 = r2.f122757r
            boolean r9 = r2.f122752m
            int r10 = r2.f122756q
            int r11 = r2.f122755p
            boolean r12 = r2.f122751l
            boolean r13 = r2.f122750k
            java.lang.Object r14 = r2.f122747h
            com.google.ar.core.ArCoreApk$Availability r14 = (com.google.ar.core.ArCoreApk.Availability) r14
            java.lang.Object r15 = r2.f122746g
            com.sugarcube.app.base.data.feature.ConfigState r15 = (com.sugarcube.app.base.data.feature.ConfigState) r15
            java.lang.Object r7 = r2.f122745f
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Object r6 = r2.f122744e
            XH.v r6 = (XH.v) r6
            java.lang.Object r8 = r2.f122743d
            dI.e r8 = (dI.C17164e) r8
            r36 = r1
            java.lang.Object r1 = r2.f122742c
            com.sugarcube.app.base.a r1 = (com.sugarcube.app.base.a) r1
            XH.y.b(r3)
            r3 = r4
            r0 = r15
            r15 = r1
            r1 = r36
            goto L_0x0283
        L_0x0086:
            int r1 = r2.f122758s
            int r5 = r2.f122757r
            boolean r6 = r2.f122752m
            int r7 = r2.f122756q
            int r8 = r2.f122755p
            boolean r9 = r2.f122751l
            boolean r10 = r2.f122750k
            java.lang.Object r11 = r2.f122747h
            com.google.ar.core.ArCoreApk$Availability r11 = (com.google.ar.core.ArCoreApk.Availability) r11
            java.lang.Object r11 = r2.f122746g
            com.sugarcube.app.base.data.feature.ConfigState r11 = (com.sugarcube.app.base.data.feature.ConfigState) r11
            java.lang.Object r12 = r2.f122745f
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            java.lang.Object r13 = r2.f122744e
            XH.v r13 = (XH.v) r13
            java.lang.Object r14 = r2.f122743d
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r2.f122742c
            com.sugarcube.app.base.a r15 = (com.sugarcube.app.base.a) r15
            XH.y.b(r3)
            r0 = r11
            r11 = r8
            r8 = r14
            r32 = r9
            r9 = r6
            r6 = r13
            r13 = r10
            r10 = r7
            r7 = r12
            r12 = r32
            goto L_0x0242
        L_0x00bd:
            int r1 = r2.f122755p
            boolean r5 = r2.f122751l
            boolean r6 = r2.f122750k
            java.lang.Object r7 = r2.f122746g
            com.sugarcube.app.base.data.feature.ConfigState r7 = (com.sugarcube.app.base.data.feature.ConfigState) r7
            java.lang.Object r8 = r2.f122745f
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r9 = r2.f122744e
            XH.v r9 = (XH.v) r9
            java.lang.Object r10 = r2.f122743d
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r2.f122742c
            com.sugarcube.app.base.a r11 = (com.sugarcube.app.base.a) r11
            XH.y.b(r3)
            goto L_0x01eb
        L_0x00dc:
            boolean r1 = r2.f122751l
            boolean r5 = r2.f122750k
            java.lang.Object r6 = r2.f122746g
            com.sugarcube.app.base.data.feature.ConfigState r6 = (com.sugarcube.app.base.data.feature.ConfigState) r6
            java.lang.Object r7 = r2.f122745f
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Object r8 = r2.f122744e
            XH.v r8 = (XH.v) r8
            java.lang.Object r9 = r2.f122743d
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r10 = r2.f122742c
            com.sugarcube.app.base.a r10 = (com.sugarcube.app.base.a) r10
            XH.y.b(r3)
            goto L_0x01bb
        L_0x00f9:
            boolean r1 = r2.f122750k
            java.lang.Object r5 = r2.f122745f
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Object r5 = r2.f122744e
            XH.v r5 = (XH.v) r5
            java.lang.Object r6 = r2.f122743d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r2.f122742c
            com.sugarcube.app.base.a r7 = (com.sugarcube.app.base.a) r7
            XH.y.b(r3)
            r8 = r5
            r9 = r6
            r10 = r7
            r5 = r1
            goto L_0x017f
        L_0x0114:
            java.lang.Object r1 = r2.f122743d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f122742c
            com.sugarcube.app.base.a r5 = (com.sugarcube.app.base.a) r5
            XH.y.b(r3)
            goto L_0x0132
        L_0x0120:
            XH.y.b(r3)
            r2.f122742c = r0
            r2.f122743d = r1
            r3 = 1
            r2.f122763x = r3
            java.lang.Object r3 = r0.c(r2)
            if (r3 != r4) goto L_0x0131
            return r4
        L_0x0131:
            r5 = r0
        L_0x0132:
            XH.v r3 = (XH.v) r3
            java.lang.Object r6 = r3.a()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r7 = r3.b()
            r9 = r7
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r6 != 0) goto L_0x0162
            com.sugarcube.app.base.DeviceCompatibility$a r1 = new com.sugarcube.app.base.DeviceCompatibility$a
            r14 = 0
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            TJ.B<com.sugarcube.app.base.DeviceCompatibility$a> r2 = r5.f122716g
            r2.setValue(r1)
            YE.b r2 = YE.C13868b.f118106a
            java.lang.String r3 = "Kreativ not enabled"
            YE.e r4 = YE.e.Meta
            r2.b(r3, r4)
            return r1
        L_0x0162:
            com.sugarcube.app.base.data.feature.ConfigRepository r7 = r5.f122713d
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureAndDesignBlacklisted r8 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureAndDesignBlacklisted.INSTANCE
            r2.f122742c = r5
            r2.f122743d = r1
            r2.f122744e = r3
            r2.f122745f = r9
            r2.f122750k = r6
            r9 = 2
            r2.f122763x = r9
            java.lang.Object r7 = r7.getState(r8, r2)
            if (r7 != r4) goto L_0x017a
            return r4
        L_0x017a:
            r9 = r1
            r8 = r3
            r10 = r5
            r5 = r6
            r3 = r7
        L_0x017f:
            r6 = r3
            com.sugarcube.app.base.data.feature.ConfigState r6 = (com.sugarcube.app.base.data.feature.ConfigState) r6
            java.lang.Object r1 = r6.getCurrentValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r3 = r6.getInitialized()
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r3)
            if (r1 == 0) goto L_0x019f
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = 1
            goto L_0x01c9
        L_0x019f:
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r10.f122713d
            com.sugarcube.app.base.data.feature.FeatureFlags$DesignBlacklisted r11 = com.sugarcube.app.base.data.feature.FeatureFlags.DesignBlacklisted.INSTANCE
            r2.f122742c = r10
            r2.f122743d = r9
            r2.f122744e = r8
            r2.f122745f = r7
            r2.f122746g = r6
            r2.f122750k = r5
            r2.f122751l = r1
            r12 = 3
            r2.f122763x = r12
            java.lang.Object r3 = r3.get(r11, r2)
            if (r3 != r4) goto L_0x01bb
            return r4
        L_0x01bb:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r3
        L_0x01c9:
            if (r5 == 0) goto L_0x01cd
            r3 = 1
            goto L_0x01f1
        L_0x01cd:
            com.sugarcube.app.base.data.feature.ConfigRepository r3 = r11.f122713d
            com.sugarcube.app.base.data.feature.FeatureFlags$CaptureBlacklisted r12 = com.sugarcube.app.base.data.feature.FeatureFlags.CaptureBlacklisted.INSTANCE
            r2.f122742c = r11
            r2.f122743d = r10
            r2.f122744e = r9
            r2.f122745f = r8
            r2.f122746g = r7
            r2.f122750k = r6
            r2.f122751l = r5
            r2.f122755p = r1
            r13 = 4
            r2.f122763x = r13
            java.lang.Object r3 = r3.get(r12, r2)
            if (r3 != r4) goto L_0x01eb
            return r4
        L_0x01eb:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
        L_0x01f1:
            com.sugarcube.app.base.decorate.DecorateCompatibilityProvider r12 = r11.f122715f
            boolean r12 = r12.isSupported()
            if (r12 == 0) goto L_0x01fd
            if (r1 != 0) goto L_0x01fd
            r13 = 1
            goto L_0x01fe
        L_0x01fd:
            r13 = 0
        L_0x01fe:
            r14 = 0
            r15 = 0
        L_0x0200:
            OE.c r0 = r11.f122714e
            r18 = r4
            android.content.Context r4 = r11.f122711b
            r2.f122742c = r11
            r2.f122743d = r10
            r2.f122744e = r9
            r2.f122745f = r8
            r2.f122746g = r7
            r2.f122747h = r14
            r2.f122750k = r6
            r2.f122751l = r5
            r2.f122755p = r1
            r2.f122756q = r3
            r2.f122752m = r12
            r2.f122757r = r13
            r2.f122758s = r15
            r14 = 5
            r2.f122763x = r14
            java.lang.Object r0 = r0.a(r4, r2)
            r4 = r18
            if (r0 != r4) goto L_0x022c
            return r4
        L_0x022c:
            r32 = r3
            r3 = r0
            r0 = r7
            r7 = r8
            r8 = r10
            r10 = r32
            r33 = r11
            r11 = r1
            r1 = r15
            r15 = r33
            r34 = r12
            r12 = r5
            r5 = r13
            r13 = r6
            r6 = r9
            r9 = r34
        L_0x0242:
            r14 = r3
            com.google.ar.core.ArCoreApk$Availability r14 = (com.google.ar.core.ArCoreApk.Availability) r14
            boolean r3 = r14.isTransient()
            if (r3 == 0) goto L_0x0290
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r18 = r4
            r36 = r5
            r4 = 3
            long r3 = r3.toMillis(r4)
            r2.f122742c = r15
            r2.f122743d = r8
            r2.f122744e = r6
            r2.f122745f = r7
            r2.f122746g = r0
            r2.f122747h = r14
            r2.f122750k = r13
            r2.f122751l = r12
            r2.f122755p = r11
            r2.f122756q = r10
            r2.f122752m = r9
            r5 = r36
            r2.f122757r = r5
            r2.f122758s = r1
            r36 = r0
            r0 = 6
            r2.f122763x = r0
            java.lang.Object r0 = QJ.C16297b0.b(r3, r2)
            r3 = r18
            if (r0 != r3) goto L_0x0281
            return r3
        L_0x0281:
            r0 = r36
        L_0x0283:
            r4 = r8
            r8 = r7
            r7 = r0
            r0 = 1
        L_0x0287:
            r32 = r13
            r13 = r5
            r5 = r12
            r12 = r9
            r9 = r6
            r6 = r32
            goto L_0x0299
        L_0x0290:
            r36 = r0
            r3 = r4
            r4 = r8
            r0 = 1
            r8 = r7
            r7 = r36
            goto L_0x0287
        L_0x0299:
            int r1 = r1 + r0
            boolean r17 = r14.isTransient()
            if (r17 == 0) goto L_0x02b2
            r0 = 5
            if (r1 < r0) goto L_0x02a4
            goto L_0x02b2
        L_0x02a4:
            r32 = r15
            r15 = r1
            r1 = r11
            r11 = r32
            r33 = r4
            r4 = r3
            r3 = r10
            r10 = r33
            goto L_0x0200
        L_0x02b2:
            OE.c r0 = r15.f122714e
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x02c2
            if (r10 != 0) goto L_0x02c2
            r36 = r1
            r16 = r3
            r3 = 1
            goto L_0x02c7
        L_0x02c2:
            r36 = r1
            r16 = r3
            r3 = 0
        L_0x02c7:
            OE.c r1 = r15.f122714e
            r25 = r7
            android.content.Context r7 = r15.f122711b
            boolean r1 = r1.c(r7)
            if (r11 == 0) goto L_0x02d5
            r7 = 1
            goto L_0x02d6
        L_0x02d5:
            r7 = 0
        L_0x02d6:
            r26 = r11
            if (r13 == 0) goto L_0x02dc
            r11 = 1
            goto L_0x02dd
        L_0x02dc:
            r11 = 0
        L_0x02dd:
            r28 = r9
            r27 = r10
            if (r10 == 0) goto L_0x02e5
            r10 = 1
            goto L_0x02e6
        L_0x02e5:
            r10 = 0
        L_0x02e6:
            com.sugarcube.app.base.external.config.a r9 = r15.f122712c
            java.lang.String r9 = r9.getCountry()
            r29 = r4
            com.sugarcube.app.base.data.feature.ConfigRepository r4 = r15.f122713d
            java.util.List r4 = r4.getEnabledFeatures()
            r30 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r31 = r15
            java.lang.String r15 = "\n                configReady: "
            r2.append(r15)
            r2.append(r8)
            java.lang.String r15 = "\n                isDesignBlacklisted: "
            r2.append(r15)
            r2.append(r7)
            java.lang.String r7 = " \n                isDecorateSupported: "
            r2.append(r7)
            r2.append(r12)
            java.lang.String r7 = " \n                isDecorateEnabled: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r7 = " \n                arCoreAvailability: "
            r2.append(r7)
            r2.append(r14)
            java.lang.String r7 = " \n                isCaptureSupported: "
            r2.append(r7)
            r2.append(r0)
            java.lang.String r7 = " \n                isCaptureBlacklisted: "
            r2.append(r7)
            r2.append(r10)
            java.lang.String r7 = "\n                isCaptureEnabled: "
            r2.append(r7)
            r2.append(r3)
            java.lang.String r7 = "\n                isCaptureAndDesignBlacklisted: "
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = "\n                isUltrawideSupported: "
            r2.append(r7)
            r2.append(r1)
            java.lang.String r7 = "\n                country: "
            r2.append(r7)
            r2.append(r9)
            java.lang.String r7 = "\n                OptimizelyFlags: "
            r2.append(r7)
            r2.append(r4)
            java.lang.String r4 = "\n            "
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            YE.b r4 = YE.C13868b.f118106a
            YE.e r7 = YE.e.Meta
            r4.b(r2, r7)
            if (r6 == 0) goto L_0x0375
            if (r3 != 0) goto L_0x0373
            if (r13 == 0) goto L_0x0375
        L_0x0373:
            r4 = 1
            goto L_0x0376
        L_0x0375:
            r4 = 0
        L_0x0376:
            com.sugarcube.app.base.DeviceCompatibility$a r7 = new com.sugarcube.app.base.DeviceCompatibility$a
            if (r13 == 0) goto L_0x037d
            r21 = 1
            goto L_0x037f
        L_0x037d:
            r21 = 0
        L_0x037f:
            java.lang.Boolean r23 = kotlin.coroutines.jvm.internal.b.a(r5)
            r17 = r7
            r18 = r8
            r19 = r4
            r20 = r3
            r22 = r14
            r24 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r15 = r31
            TJ.B<com.sugarcube.app.base.DeviceCompatibility$a> r9 = r15.f122716g
            r10 = r30
            r10.f122742c = r15
            r11 = r29
            r10.f122743d = r11
            r11 = r28
            r10.f122744e = r11
            r10.f122745f = r8
            r8 = r25
            r10.f122746g = r8
            r10.f122747h = r14
            r10.f122748i = r2
            r10.f122749j = r7
            r10.f122750k = r6
            r10.f122751l = r5
            r11 = r26
            r10.f122755p = r11
            r2 = r27
            r10.f122756q = r2
            r10.f122752m = r12
            r10.f122757r = r13
            r2 = r36
            r10.f122758s = r2
            r10.f122753n = r0
            r10.f122759t = r3
            r10.f122754o = r1
            r10.f122760u = r4
            r0 = 7
            r10.f122763x = r0
            java.lang.Object r0 = r9.emit(r7, r10)
            r1 = r16
            if (r0 != r1) goto L_0x03d6
            return r1
        L_0x03d6:
            r1 = r7
        L_0x03d7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.a.d(dI.e):java.lang.Object");
    }

    public C16532g<DeviceCompatibility.a> getSupportedFeatures() {
        return this.f122717h;
    }

    public boolean isCaptureEnabled() {
        DeviceCompatibility.a value = this.f122716g.getValue();
        return value != null && value.b();
    }

    public boolean isDecorateSupported() {
        DeviceCompatibility.a value = this.f122716g.getValue();
        return value != null && value.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object isKreativEnabled(dI.C17164e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.sugarcube.app.base.a.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.sugarcube.app.base.a$c r0 = (com.sugarcube.app.base.a.c) r0
            int r1 = r0.f122725g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f122725g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.a$c r0 = new com.sugarcube.app.base.a$c
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f122723e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f122725g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f122722d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f122721c
            com.sugarcube.app.base.a r6 = (com.sugarcube.app.base.a) r6
            XH.y.b(r1)
            goto L_0x0049
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            r0.f122721c = r5
            r0.f122722d = r6
            r0.f122725g = r4
            java.lang.Object r1 = r5.c(r0)
            if (r1 != r2) goto L_0x0049
            return r2
        L_0x0049:
            XH.v r1 = (XH.v) r1
            java.lang.Object r6 = r1.c()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.a.isKreativEnabled(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object updateCompatibility(dI.C17164e<? super com.sugarcube.app.base.DeviceCompatibility.a> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.sugarcube.app.base.a.f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.sugarcube.app.base.a$f r0 = (com.sugarcube.app.base.a.f) r0
            int r1 = r0.f122741j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f122741j = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.a$f r0 = new com.sugarcube.app.base.a$f
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f122739h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f122741j
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x0059
            if (r3 == r6) goto L_0x0044
            if (r3 != r5) goto L_0x003c
            java.lang.Object r11 = r0.f122736e
            bK.a r11 = (bK.C17052a) r11
            java.lang.Object r2 = r0.f122735d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f122734c
            com.sugarcube.app.base.a r0 = (com.sugarcube.app.base.a) r0
            XH.y.b(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0087
        L_0x003a:
            r0 = move-exception
            goto L_0x008f
        L_0x003c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0044:
            int r11 = r0.f122737f
            java.lang.Object r3 = r0.f122736e
            bK.a r3 = (bK.C17052a) r3
            java.lang.Object r6 = r0.f122735d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r0.f122734c
            com.sugarcube.app.base.a r8 = (com.sugarcube.app.base.a) r8
            XH.y.b(r1)
            r1 = r3
            r3 = r11
            r11 = r6
            goto L_0x0071
        L_0x0059:
            XH.y.b(r1)
            bK.a r1 = r10.f122718i
            r0.f122734c = r10
            r0.f122735d = r11
            r0.f122736e = r1
            r0.f122737f = r4
            r0.f122741j = r6
            java.lang.Object r3 = r1.e(r7, r0)
            if (r3 != r2) goto L_0x006f
            return r2
        L_0x006f:
            r8 = r10
            r3 = r4
        L_0x0071:
            r0.f122734c = r8     // Catch:{ all -> 0x008d }
            r0.f122735d = r11     // Catch:{ all -> 0x008d }
            r0.f122736e = r1     // Catch:{ all -> 0x008d }
            r0.f122737f = r3     // Catch:{ all -> 0x008d }
            r0.f122738g = r4     // Catch:{ all -> 0x008d }
            r0.f122741j = r5     // Catch:{ all -> 0x008d }
            java.lang.Object r11 = r8.d(r0)     // Catch:{ all -> 0x008d }
            if (r11 != r2) goto L_0x0084
            return r2
        L_0x0084:
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x0087:
            com.sugarcube.app.base.DeviceCompatibility$a r1 = (com.sugarcube.app.base.DeviceCompatibility.a) r1     // Catch:{ all -> 0x003a }
            r11.d(r7)
            return r1
        L_0x008d:
            r0 = move-exception
            r11 = r1
        L_0x008f:
            r11.d(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.a.updateCompatibility(dI.e):java.lang.Object");
    }
}
