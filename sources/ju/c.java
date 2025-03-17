package Ju;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import TJ.C16532g;
import TJ.C16533h;
import W2.e;
import W2.f;
import W2.h;
import W2.i;
import XH.C16807N;
import XH.y;
import android.content.Context;
import dI.C17164e;
import eI.C17187b;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"LJu/c;", "LJu/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LR2/h;", "LTJ/g;", "", "b", "LTJ/g;", "()LTJ/g;", "wayfindingOnboardingFinishedFlow", "c", "getWayfindingPermissionRationaleShownFlow", "wayfindingPermissionRationaleShownFlow", "d", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f82758d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f82759e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final f.a<Boolean> f82760f = h.a("wayfinding_onboarding_finished_key");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final f.a<Boolean> f82761g = h.a("wayfinding_perm_rationale_seen_key");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<f> f82762a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Boolean> f82763b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f82764c;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"LJu/c$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "ioDispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "FILE_NAME", "Ljava/lang/String;", "LW2/f$a;", "", "WAYFINDING_ONBOARDING_FINISHED_KEY", "LW2/f$a;", "WAYFINDING_PERMISSION_RATIONALE_SHOWN_KEY", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<f> c(String str, Context context, M m10) {
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new b(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final R2.h<f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "ioDispatcher");
            return c("wayfinding_preferences", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.wayfinding.impl.storage.WayfindingStorageImpl$setOnboardingFinished$2", f = "WayfindingStorage.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82765c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f82766d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f82766d = obj;
            return bVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f82765c == 0) {
                y.b(obj);
                ((W2.c) this.f82766d).j(c.f82760f, kotlin.coroutines.jvm.internal.b.a(true));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ju.c$c  reason: collision with other inner class name */
    public static final class C1631c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f82767a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ju.c$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f82768a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.wayfinding.impl.storage.WayfindingStorageImpl$special$$inlined$map$1$2", f = "WayfindingStorage.kt", l = {50}, m = "emit")
            /* renamed from: Ju.c$c$a$a  reason: collision with other inner class name */
            public static final class C1632a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f82769c;

                /* renamed from: d  reason: collision with root package name */
                int f82770d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f82771e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1632a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f82771e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f82769c = obj;
                    this.f82770d |= Integer.MIN_VALUE;
                    return this.f82771e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f82768a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ju.c.C1631c.a.C1632a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ju.c$c$a$a r0 = (Ju.c.C1631c.a.C1632a) r0
                    int r1 = r0.f82770d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f82770d = r1
                    goto L_0x0018
                L_0x0013:
                    Ju.c$c$a$a r0 = new Ju.c$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f82769c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f82770d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f82768a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = Ju.c.f82760f
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f82770d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ju.c.C1631c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1631c(C16532g gVar) {
            this.f82767a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f82767a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f82772a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f82773a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.instore.wayfinding.impl.storage.WayfindingStorageImpl$special$$inlined$map$2$2", f = "WayfindingStorage.kt", l = {50}, m = "emit")
            /* renamed from: Ju.c$d$a$a  reason: collision with other inner class name */
            public static final class C1633a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f82774c;

                /* renamed from: d  reason: collision with root package name */
                int f82775d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f82776e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1633a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f82776e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f82774c = obj;
                    this.f82775d |= Integer.MIN_VALUE;
                    return this.f82776e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f82773a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ju.c.d.a.C1633a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ju.c$d$a$a r0 = (Ju.c.d.a.C1633a) r0
                    int r1 = r0.f82775d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f82775d = r1
                    goto L_0x0018
                L_0x0013:
                    Ju.c$d$a$a r0 = new Ju.c$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f82774c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f82775d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f82773a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = Ju.c.f82761g
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f82775d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ju.c.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f82772a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f82772a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public c(R2.h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f82762a = hVar;
        this.f82763b = new C1631c(hVar.getData());
        this.f82764c = new d(hVar.getData());
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f82762a, new b((C17164e<? super b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<Boolean> b() {
        return this.f82763b;
    }
}
