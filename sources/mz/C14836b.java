package mz;

import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import eI.C17187b;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB#\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmz/b;", "Lmz/a;", "LR2/h;", "LW2/f;", "dataStore", "LkK/c;", "json", "<init>", "(LR2/h;LkK/c;)V", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "settings", "LXH/N;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;LdI/e;)Ljava/lang/Object;", "c", "(LdI/e;)Ljava/lang/Object;", "LR2/h;", "b", "LkK/c;", "LTJ/g;", "()LTJ/g;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mz.b  reason: case insensitive filesystem */
public final class C14836b implements C14835a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f129648c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f129649a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17514c f129650b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmz/b$a;", "", "<init>", "()V", "", "SETTINGS", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mz.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsDataStoreImpl$delete$2", f = "ScanAndGoSettingsDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mz.b$b  reason: collision with other inner class name */
    static final class C3186b extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129651c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f129652d;

        C3186b(C17164e<? super C3186b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3186b bVar = new C3186b(eVar);
            bVar.f129652d = obj;
            return bVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((C3186b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f129651c == 0) {
                y.b(obj);
                ((W2.c) this.f129652d).f();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsDataStoreImpl$save$2", f = "ScanAndGoSettingsDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mz.b$c */
    static final class c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129653c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f129654d;

        c(C17164e<? super c> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f129654d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f129653c == 0) {
                y.b(obj);
                ((W2.c) this.f129654d).i(W2.h.g("ScanAndGoDataStore.ScanAndGoSettings.Key"));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsDataStoreImpl$save$3", f = "ScanAndGoSettingsDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mz.b$d */
    static final class d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f129655c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f129656d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f129657e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f129657e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f129657e, eVar);
            dVar.f129656d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f129655c == 0) {
                y.b(obj);
                ((W2.c) this.f129656d).j(W2.h.g("ScanAndGoDataStore.ScanAndGoSettings.Key"), this.f129657e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mz.b$e */
    public static final class e implements C16532g<ScanAndGoSettings> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f129658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14836b f129659b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mz.b$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f129660a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14836b f129661b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.settings.ScanAndGoSettingsDataStoreImpl$special$$inlined$map$1$2", f = "ScanAndGoSettingsDataStore.kt", l = {50}, m = "emit")
            /* renamed from: mz.b$e$a$a  reason: collision with other inner class name */
            public static final class C3187a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f129662c;

                /* renamed from: d  reason: collision with root package name */
                int f129663d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f129664e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3187a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f129664e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f129662c = obj;
                    this.f129663d |= Integer.MIN_VALUE;
                    return this.f129664e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C14836b bVar) {
                this.f129660a = hVar;
                this.f129661b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof mz.C14836b.e.a.C3187a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    mz.b$e$a$a r0 = (mz.C14836b.e.a.C3187a) r0
                    int r1 = r0.f129663d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f129663d = r1
                    goto L_0x0018
                L_0x0013:
                    mz.b$e$a$a r0 = new mz.b$e$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f129662c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f129663d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0081
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f129660a
                    W2.f r7 = (W2.f) r7
                    java.lang.String r2 = "ScanAndGoDataStore.ScanAndGoSettings.Key"
                    W2.f$a r2 = W2.h.g(r2)
                    java.lang.Object r7 = r7.b(r2)
                    java.lang.String r7 = (java.lang.String) r7
                    r2 = 0
                    if (r7 == 0) goto L_0x0078
                    XH.x$a r4 = XH.x.f139812b     // Catch:{ all -> 0x0063 }
                    mz.b r4 = r6.f129661b     // Catch:{ all -> 0x0063 }
                    kK.c r4 = r4.f129650b     // Catch:{ all -> 0x0063 }
                    r4.a()     // Catch:{ all -> 0x0063 }
                    com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings$a r5 = com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings.Companion     // Catch:{ all -> 0x0063 }
                    kotlinx.serialization.KSerializer r5 = r5.serializer()     // Catch:{ all -> 0x0063 }
                    java.lang.Object r7 = r4.c(r5, r7)     // Catch:{ all -> 0x0063 }
                    com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r7 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r7     // Catch:{ all -> 0x0063 }
                    java.lang.Object r7 = XH.x.b(r7)     // Catch:{ all -> 0x0063 }
                    goto L_0x006e
                L_0x0063:
                    r7 = move-exception
                    XH.x$a r4 = XH.x.f139812b
                    java.lang.Object r7 = XH.y.a(r7)
                    java.lang.Object r7 = XH.x.b(r7)
                L_0x006e:
                    boolean r4 = XH.x.g(r7)
                    if (r4 == 0) goto L_0x0075
                    goto L_0x0076
                L_0x0075:
                    r2 = r7
                L_0x0076:
                    com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings r2 = (com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings) r2
                L_0x0078:
                    r0.f129663d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0081
                    return r1
                L_0x0081:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mz.C14836b.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, C14836b bVar) {
            this.f129658a = gVar;
            this.f129659b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f129658a.collect(new a(hVar, this.f129659b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C14836b(h<f> hVar, C17514c cVar) {
        C17542s.j(hVar, "dataStore");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f129649a = hVar;
        this.f129650b = cVar;
    }

    public Object a(ScanAndGoSettings scanAndGoSettings, C17164e<? super C16807N> eVar) {
        if (scanAndGoSettings == null) {
            Object a10 = i.a(this.f129649a, new c((C17164e<? super c>) null), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
        C17514c cVar = this.f129650b;
        cVar.a();
        Object a11 = i.a(this.f129649a, new d(cVar.b(ScanAndGoSettings.Companion.serializer(), scanAndGoSettings), (C17164e<? super d>) null), eVar);
        return a11 == C17187b.f() ? a11 : C16807N.f139792a;
    }

    public C16532g<ScanAndGoSettings> b() {
        return new e(this.f129649a.getData(), this);
    }

    public Object c(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f129649a, new C3186b((C17164e<? super C3186b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
