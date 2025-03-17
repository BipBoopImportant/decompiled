package com.sugarcube.app.base.debug;

import OE.C13313e;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import VE.C13760b;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.sugarcube.app.base.data.feature.ConfigItem;
import com.sugarcube.app.base.data.feature.ConfigItemGroup;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.ConfigState;
import com.sugarcube.app.base.debug.a;
import com.sugarcube.app.base.debug.b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 62\u00020\u0001:\u00017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R8\u00101\u001a\u0018\u0012\u0004\u0012\u00020(\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)0'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R%\u00105\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u00010\u00140\u00140!8\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u0010%¨\u00068"}, d2 = {"Lcom/sugarcube/app/base/debug/o;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepo", "LVE/b;", "networkConfig", "LOE/e;", "installationConfig", "<init>", "(Lcom/sugarcube/app/base/data/feature/ConfigRepository;LVE/b;LOE/e;)V", "LXH/N;", "j", "(LdI/e;)Ljava/lang/Object;", "k", "Lcom/sugarcube/app/base/data/feature/ConfigItem;", "Lcom/sugarcube/app/base/debug/b;", "F", "(Lcom/sugarcube/app/base/data/feature/ConfigItem;)Lcom/sugarcube/app/base/debug/b;", "Lcom/sugarcube/app/base/debug/a;", "action", "", "G", "(Lcom/sugarcube/app/base/debug/a;)Z", "m", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "n", "LVE/b;", "o", "LOE/e;", "", "p", "Ljava/util/List;", "treeRoot", "Landroidx/lifecycle/K;", "q", "Landroidx/lifecycle/K;", "E", "()Landroidx/lifecycle/K;", "uiTree", "", "", "LTJ/g;", "Lcom/sugarcube/app/base/data/feature/ConfigState;", "r", "Ljava/util/Map;", "C", "()Ljava/util/Map;", "H", "(Ljava/util/Map;)V", "flows", "kotlin.jvm.PlatformType", "s", "D", "suggestKill", "t", "b", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends f0 {

    /* renamed from: t  reason: collision with root package name */
    public static final b f123051t = new b((DefaultConstructorMarker) null);

    /* renamed from: u  reason: collision with root package name */
    public static final int f123052u = 8;

    /* renamed from: m  reason: collision with root package name */
    private final ConfigRepository f123053m;

    /* renamed from: n  reason: collision with root package name */
    private final C13760b f123054n;

    /* renamed from: o  reason: collision with root package name */
    private final C13313e f123055o;

    /* renamed from: p  reason: collision with root package name */
    private List<? extends b> f123056p;

    /* renamed from: q  reason: collision with root package name */
    private final K<List<b>> f123057q = new K<>();

    /* renamed from: r  reason: collision with root package name */
    public Map<String, ? extends C16532g<? extends ConfigState<?>>> f123058r;

    /* renamed from: s  reason: collision with root package name */
    private final K<Boolean> f123059s = new K<>(Boolean.FALSE);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.debug.DebugScreenViewModel$1", f = "DebugFragment.kt", l = {138, 139}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123060c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f123061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123061d = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f123061d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f123060c;
            if (i10 == 0) {
                y.b(obj);
                o oVar = this.f123061d;
                this.f123060c = 1;
                if (oVar.j(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o oVar2 = this.f123061d;
            this.f123060c = 2;
            if (oVar2.k(this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/debug/o$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.debug.DebugScreenViewModel", f = "DebugFragment.kt", l = {145}, m = "buildFlows")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f123062c;

        /* renamed from: d  reason: collision with root package name */
        Object f123063d;

        /* renamed from: e  reason: collision with root package name */
        Object f123064e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f123065f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ o f123066g;

        /* renamed from: h  reason: collision with root package name */
        int f123067h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f123066g = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123065f = obj;
            this.f123067h |= Integer.MIN_VALUE;
            return this.f123066g.j(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((ConfigItem.FeatureFlag) t10).getMeta().getSortOrder()), Integer.valueOf(((ConfigItem.FeatureFlag) t11).getMeta().getSortOrder()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        public final int compare(T t10, T t11) {
            ConfigItemGroup configItemGroup = (ConfigItemGroup) t10;
            Integer num = null;
            Integer valueOf = configItemGroup != null ? Integer.valueOf(configItemGroup.getSortOrder()) : null;
            ConfigItemGroup configItemGroup2 = (ConfigItemGroup) t11;
            if (configItemGroup2 != null) {
                num = Integer.valueOf(configItemGroup2.getSortOrder());
            }
            return C17035a.e(valueOf, num);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.debug.DebugScreenViewModel", f = "DebugFragment.kt", l = {153}, m = "buildTree")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f123068c;

        /* renamed from: d  reason: collision with root package name */
        Object f123069d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f123070e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o f123071f;

        /* renamed from: g  reason: collision with root package name */
        int f123072g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(o oVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f123071f = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123070e = obj;
            this.f123072g |= Integer.MIN_VALUE;
            return this.f123071f.k(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((ConfigItem) t10).getMeta().getSortOrder()), Integer.valueOf(((ConfigItem) t11).getMeta().getSortOrder()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((ConfigItem) t10).getMeta().getSortOrder()), Integer.valueOf(((ConfigItem) t11).getMeta().getSortOrder()));
        }
    }

    public o(ConfigRepository configRepository, C13760b bVar, C13313e eVar) {
        C17542s.j(configRepository, "configRepo");
        C17542s.j(bVar, "networkConfig");
        C17542s.j(eVar, "installationConfig");
        this.f123053m = configRepository;
        this.f123054n = bVar;
        this.f123055o = eVar;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    private final b F(ConfigItem<?> configItem) {
        if (configItem instanceof ConfigItem.FeatureFlag) {
            return new b.C3027b(configItem);
        }
        if (configItem instanceof ConfigItem.BooleanConfigItem) {
            return new b.C3027b(configItem);
        }
        if (configItem instanceof ConfigItem.IntegerConfigItem) {
            return new b.g(configItem);
        }
        if (configItem instanceof ConfigItem.DoubleConfigItem) {
            return new b.c(configItem);
        }
        if (configItem instanceof ConfigItem.StringListConfigItem) {
            return new b.i((ConfigItem.StringListConfigItem) configItem);
        }
        if (configItem instanceof ConfigItem.StringConfigItem) {
            return new b.j((ConfigItem.StringConfigItem) configItem);
        }
        if (configItem instanceof ConfigItem.ObjectListConfigItem) {
            return new b.h((ConfigItem.ObjectListConfigItem) configItem);
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074 A[LOOP:0: B:17:0x006e->B:19:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sugarcube.app.base.debug.o.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.sugarcube.app.base.debug.o$c r0 = (com.sugarcube.app.base.debug.o.c) r0
            int r1 = r0.f123067h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f123067h = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.debug.o$c r0 = new com.sugarcube.app.base.debug.o$c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f123065f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f123067h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r7 = r0.f123064e
            com.sugarcube.app.base.debug.o r7 = (com.sugarcube.app.base.debug.o) r7
            java.lang.Object r2 = r0.f123063d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f123062c
            com.sugarcube.app.base.debug.o r0 = (com.sugarcube.app.base.debug.o) r0
            XH.y.b(r1)
            goto L_0x0053
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x003d:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r6.f123053m
            r0.f123062c = r6
            r0.f123063d = r7
            r0.f123064e = r6
            r0.f123067h = r4
            java.lang.Object r1 = r1.getAllConfigItems(r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            r7 = r6
            r0 = r7
        L_0x0053:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 10
            int r2 = YH.C16877v.y(r1, r2)
            int r2 = YH.X.e(r2)
            r3 = 16
            int r2 = tI.C17978n.e(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = r1.next()
            com.sugarcube.app.base.data.feature.ConfigItem r2 = (com.sugarcube.app.base.data.feature.ConfigItem) r2
            com.sugarcube.app.base.data.feature.ConfigItemMeta r4 = r2.getMeta()
            java.lang.String r4 = r4.getLocalKey()
            com.sugarcube.app.base.data.feature.ConfigRepository r5 = r0.f123053m
            TJ.g r2 = r5.observeState(r2)
            XH.v r2 = XH.C16796C.a(r4, r2)
            java.lang.Object r4 = r2.c()
            java.lang.Object r2 = r2.d()
            r3.put(r4, r2)
            goto L_0x006e
        L_0x0098:
            r7.H(r3)
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.o.j(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e1 A[LOOP:1: B:23:0x00db->B:25:0x00e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(dI.C17164e<? super XH.C16807N> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.sugarcube.app.base.debug.o.f
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.sugarcube.app.base.debug.o$f r0 = (com.sugarcube.app.base.debug.o.f) r0
            int r1 = r0.f123072g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f123072g = r1
            goto L_0x0018
        L_0x0013:
            com.sugarcube.app.base.debug.o$f r0 = new com.sugarcube.app.base.debug.o$f
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r1 = r0.f123070e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f123072g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r12 = r0.f123069d
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f123068c
            com.sugarcube.app.base.debug.o r12 = (com.sugarcube.app.base.debug.o) r12
            XH.y.b(r1)
            goto L_0x004c
        L_0x0031:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0039:
            XH.y.b(r1)
            com.sugarcube.app.base.data.feature.ConfigRepository r1 = r11.f123053m
            r0.f123068c = r11
            r0.f123069d = r12
            r0.f123072g = r4
            java.lang.Object r1 = r1.getAllConfigItems(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            r12 = r11
        L_0x004c:
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.sugarcube.app.base.debug.b$f r2 = new com.sugarcube.app.base.debug.b$f
            java.lang.String r3 = "Configuration"
            r2.<init>(r3)
            r0.add(r2)
            com.sugarcube.app.base.debug.b$d r2 = new com.sugarcube.app.base.debug.b$d
            VE.b r3 = r12.f123054n
            TJ.B r3 = r3.c()
            VE.b r4 = r12.f123054n
            java.util.List r4 = r4.a()
            r2.<init>(r3, r4)
            r0.add(r2)
            com.sugarcube.app.base.debug.b$a r2 = new com.sugarcube.app.base.debug.b$a
            OE.e r3 = r12.f123055o
            java.lang.String r6 = r3.g()
            OE.e r3 = r12.f123055o
            java.lang.String r7 = r3.i()
            OE.e r3 = r12.f123055o
            java.lang.String r8 = r3.f()
            OE.e r3 = r12.f123055o
            java.lang.String r9 = r3.d()
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r0.add(r2)
            com.sugarcube.app.base.debug.b$f r2 = new com.sugarcube.app.base.debug.b$f
            com.sugarcube.app.base.data.feature.ConfigItemGroup$FeatureFlagGroup r3 = com.sugarcube.app.base.data.feature.ConfigItemGroup.FeatureFlagGroup.INSTANCE
            java.lang.String r3 = r3.getName()
            r2.<init>(r3)
            java.util.List r2 = YH.C16877v.e(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x00af:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c1
            java.lang.Object r5 = r4.next()
            boolean r6 = r5 instanceof com.sugarcube.app.base.data.feature.ConfigItem.FeatureFlag
            if (r6 == 0) goto L_0x00af
            r3.add(r5)
            goto L_0x00af
        L_0x00c1:
            com.sugarcube.app.base.debug.o$d r4 = new com.sugarcube.app.base.debug.o$d
            r4.<init>()
            java.util.List r3 = YH.C16877v.g1(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r6 = YH.C16877v.y(r3, r5)
            r4.<init>(r6)
            java.util.Iterator r3 = r3.iterator()
        L_0x00db:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x00ef
            java.lang.Object r6 = r3.next()
            com.sugarcube.app.base.data.feature.ConfigItem$FeatureFlag r6 = (com.sugarcube.app.base.data.feature.ConfigItem.FeatureFlag) r6
            com.sugarcube.app.base.debug.b r6 = r12.F(r6)
            r4.add(r6)
            goto L_0x00db
        L_0x00ef:
            java.util.List r2 = YH.C16877v.V0(r2, r4)
            com.sugarcube.app.base.debug.b$e r3 = new com.sugarcube.app.base.debug.b$e
            com.sugarcube.app.base.data.feature.ConfigItemGroup$FeatureFlagGroup r4 = com.sugarcube.app.base.data.feature.ConfigItemGroup.FeatureFlagGroup.INSTANCE
            r3.<init>(r4, r2)
            r0.add(r3)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0106:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x012f
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sugarcube.app.base.data.feature.ConfigItem r4 = (com.sugarcube.app.base.data.feature.ConfigItem) r4
            com.sugarcube.app.base.data.feature.ConfigItemMeta r4 = r4.getMeta()
            com.sugarcube.app.base.data.feature.ConfigItemGroup r4 = r4.getGroup()
            java.lang.Object r6 = r2.get(r4)
            if (r6 != 0) goto L_0x0129
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2.put(r4, r6)
        L_0x0129:
            java.util.List r6 = (java.util.List) r6
            r6.add(r3)
            goto L_0x0106
        L_0x012f:
            java.util.Set r1 = r2.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            com.sugarcube.app.base.debug.o$e r3 = new com.sugarcube.app.base.debug.o$e
            r3.<init>()
            java.util.List r1 = YH.C16877v.g1(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0144:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01a8
            java.lang.Object r3 = r1.next()
            com.sugarcube.app.base.data.feature.ConfigItemGroup r3 = (com.sugarcube.app.base.data.feature.ConfigItemGroup) r3
            if (r3 == 0) goto L_0x0144
            java.lang.Object r4 = r2.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x015e
            java.util.List r4 = YH.C16877v.n()
        L_0x015e:
            com.sugarcube.app.base.debug.b$f r6 = new com.sugarcube.app.base.debug.b$f
            java.lang.String r7 = r3.getName()
            r6.<init>(r7)
            java.util.List r6 = YH.C16877v.e(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            com.sugarcube.app.base.debug.o$h r7 = new com.sugarcube.app.base.debug.o$h
            r7.<init>()
            java.util.List r4 = YH.C16877v.g1(r4, r7)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = YH.C16877v.y(r4, r5)
            r7.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
        L_0x0187:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x019b
            java.lang.Object r8 = r4.next()
            com.sugarcube.app.base.data.feature.ConfigItem r8 = (com.sugarcube.app.base.data.feature.ConfigItem) r8
            com.sugarcube.app.base.debug.b r8 = r12.F(r8)
            r7.add(r8)
            goto L_0x0187
        L_0x019b:
            java.util.List r4 = YH.C16877v.V0(r6, r7)
            com.sugarcube.app.base.debug.b$e r6 = new com.sugarcube.app.base.debug.b$e
            r6.<init>(r3, r4)
            r0.add(r6)
            goto L_0x0144
        L_0x01a8:
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0204
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x01bc:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01d1
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.sugarcube.app.base.data.feature.ConfigItem r4 = (com.sugarcube.app.base.data.feature.ConfigItem) r4
            boolean r4 = r4 instanceof com.sugarcube.app.base.data.feature.ConfigItem.FeatureFlag
            if (r4 != 0) goto L_0x01bc
            r2.add(r3)
            goto L_0x01bc
        L_0x01d1:
            com.sugarcube.app.base.debug.o$g r1 = new com.sugarcube.app.base.debug.o$g
            r1.<init>()
            java.util.List r1 = YH.C16877v.g1(r2, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = YH.C16877v.y(r1, r5)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x01e9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01fd
            java.lang.Object r3 = r1.next()
            com.sugarcube.app.base.data.feature.ConfigItem r3 = (com.sugarcube.app.base.data.feature.ConfigItem) r3
            com.sugarcube.app.base.debug.b r3 = r12.F(r3)
            r2.add(r3)
            goto L_0x01e9
        L_0x01fd:
            boolean r1 = r0.addAll(r2)
            kotlin.coroutines.jvm.internal.b.a(r1)
        L_0x0204:
            r12.f123056p = r0
            androidx.lifecycle.K<java.util.List<com.sugarcube.app.base.debug.b>> r12 = r12.f123057q
            r12.setValue(r0)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.debug.o.k(dI.e):java.lang.Object");
    }

    public final Map<String, C16532g<ConfigState<?>>> C() {
        Map<String, ? extends C16532g<? extends ConfigState<?>>> map = this.f123058r;
        if (map != null) {
            return map;
        }
        C17542s.z("flows");
        return null;
    }

    public final K<Boolean> D() {
        return this.f123059s;
    }

    public final K<List<b>> E() {
        return this.f123057q;
    }

    public final boolean G(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.g) {
            a.g gVar = (a.g) aVar;
            this.f123053m.blockingOverride(gVar.a(), gVar.b());
            return true;
        } else if (aVar instanceof a.b) {
            this.f123053m.clearAllOverrides();
            return true;
        } else {
            List<? extends b> list = null;
            if (aVar instanceof a.c) {
                this.f123053m.blockingOverride(((a.c) aVar).a(), null);
                return true;
            } else if (aVar instanceof a.d) {
                this.f123057q.setValue(((a.d) aVar).a().a());
                return true;
            } else if (aVar instanceof a.C3026a) {
                List<b> value = this.f123057q.getValue();
                List<? extends b> list2 = this.f123056p;
                if (list2 == null) {
                    C17542s.z("treeRoot");
                    list2 = null;
                }
                if (C17542s.e(value, list2)) {
                    return false;
                }
                K<List<b>> k10 = this.f123057q;
                List<? extends b> list3 = this.f123056p;
                if (list3 == null) {
                    C17542s.z("treeRoot");
                } else {
                    list = list3;
                }
                k10.setValue(list);
                return true;
            } else if (aVar instanceof a.e) {
                this.f123054n.e(((a.e) aVar).a());
                this.f123059s.setValue(Boolean.TRUE);
                return true;
            } else if (aVar instanceof a.f) {
                throw new RuntimeException("Force kill app from debug menu");
            } else {
                throw new t();
            }
        }
    }

    public final void H(Map<String, ? extends C16532g<? extends ConfigState<?>>> map) {
        C17542s.j(map, "<set-?>");
        this.f123058r = map;
    }
}
