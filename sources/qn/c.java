package qn;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
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
import pn.C11761a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000bH@¢\u0006\u0004\b\u000f\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0007H@¢\u0006\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lqn/c;", "Lpn/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "isAvailable", "LXH/N;", "d", "(ZLdI/e;)Ljava/lang/Object;", "c", "f", "showInlineMessage", "b", "LR2/h;", "LTJ/g;", "LTJ/g;", "g", "()LTJ/g;", "homeDeliveryAvailabilityFlow", "e", "inStoreAvailabilityFlow", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11761a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f101699d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f.a<Boolean> f101700e = W2.h.a("plp_availability_home_delivery");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final f.a<Boolean> f101701f = W2.h.a("plp_availability_in_store");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final f.a<Boolean> f101702g = W2.h.a("plp_availability_inline_message");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<W2.f> f101703a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Boolean> f101704b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f101705c;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lqn/c$a;", "", "<init>", "()V", "", "fileName", "Landroid/content/Context;", "applicationContext", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "c", "(Ljava/lang/String;Landroid/content/Context;LQJ/M;)LR2/h;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATA_STORE_FILE_NAME", "Ljava/lang/String;", "LW2/f$a;", "", "KEY_HOME_DELIVERY_AVAILABILITY", "LW2/f$a;", "KEY_IN_STORE_AVAILABILITY", "KEY_SHOW_AVAILABILITY_INLINE_MESSAGE", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final R2.h<W2.f> c(String str, Context context, M m10) {
            return W2.e.c(W2.e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new C11800b(context, str), 3, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final File d(Context context, String str) {
            return V2.b.a(context, str);
        }

        public final R2.h<W2.f> b(Context context, M m10) {
            C17542s.j(context, "applicationContext");
            C17542s.j(m10, "dispatcher");
            return c("availability_settings_data_store", context, m10);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$deleteAvailabilitySettings$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101706c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101707d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f101707d = obj;
            return bVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101706c == 0) {
                y.b(obj);
                ((W2.c) this.f101707d).f();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$setHomeDeliveryAvailability$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qn.c$c  reason: collision with other inner class name */
    static final class C2413c extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101708c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101709d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f101710e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2413c(boolean z10, C17164e<? super C2413c> eVar) {
            super(2, eVar);
            this.f101710e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2413c cVar = new C2413c(this.f101710e, eVar);
            cVar.f101709d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((C2413c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101708c == 0) {
                y.b(obj);
                ((W2.c) this.f101709d).j(c.f101700e, kotlin.coroutines.jvm.internal.b.a(this.f101710e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$setInStoreAvailability$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101711c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101712d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f101713e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f101713e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f101713e, eVar);
            dVar.f101712d = obj;
            return dVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((d) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101711c == 0) {
                y.b(obj);
                ((W2.c) this.f101712d).j(c.f101701f, kotlin.coroutines.jvm.internal.b.a(this.f101713e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$setShowAvailabilityInlineMessage$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101714c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101715d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f101716e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f101716e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f101716e, eVar);
            eVar2.f101715d = obj;
            return eVar2;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((e) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101714c == 0) {
                y.b(obj);
                ((W2.c) this.f101715d).j(c.f101702g, kotlin.coroutines.jvm.internal.b.a(this.f101716e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101717a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101718a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$shouldShowAvailabilityInlineMessage$$inlined$map$1$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: qn.c$f$a$a  reason: collision with other inner class name */
            public static final class C2414a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101719c;

                /* renamed from: d  reason: collision with root package name */
                int f101720d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101721e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2414a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101721e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101719c = obj;
                    this.f101720d |= Integer.MIN_VALUE;
                    return this.f101721e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101718a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qn.c.f.a.C2414a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qn.c$f$a$a r0 = (qn.c.f.a.C2414a) r0
                    int r1 = r0.f101720d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101720d = r1
                    goto L_0x0018
                L_0x0013:
                    qn.c$f$a$a r0 = new qn.c$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101719c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101720d
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
                    TJ.h r6 = r4.f101718a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = qn.c.f101702g
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = r3
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f101720d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qn.c.f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f101717a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101717a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl", f = "AvailabilitySettingsDataSourceImpl.kt", l = {34}, m = "shouldShowAvailabilityInlineMessage")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f101722c;

        /* renamed from: d  reason: collision with root package name */
        Object f101723d;

        /* renamed from: e  reason: collision with root package name */
        Object f101724e;

        /* renamed from: f  reason: collision with root package name */
        Object f101725f;

        /* renamed from: g  reason: collision with root package name */
        int f101726g;

        /* renamed from: h  reason: collision with root package name */
        int f101727h;

        /* renamed from: i  reason: collision with root package name */
        int f101728i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f101729j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f101730k;

        /* renamed from: l  reason: collision with root package name */
        int f101731l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f101730k = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f101729j = obj;
            this.f101731l |= Integer.MIN_VALUE;
            return this.f101730k.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101732a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101733a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$special$$inlined$map$1$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: qn.c$h$a$a  reason: collision with other inner class name */
            public static final class C2415a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101734c;

                /* renamed from: d  reason: collision with root package name */
                int f101735d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101736e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2415a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101736e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101734c = obj;
                    this.f101735d |= Integer.MIN_VALUE;
                    return this.f101736e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101733a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qn.c.h.a.C2415a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qn.c$h$a$a r0 = (qn.c.h.a.C2415a) r0
                    int r1 = r0.f101735d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101735d = r1
                    goto L_0x0018
                L_0x0013:
                    qn.c$h$a$a r0 = new qn.c$h$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101734c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101735d
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
                    TJ.h r6 = r4.f101733a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = qn.c.f101700e
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = r3
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f101735d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qn.c.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f101732a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101732a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101737a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101738a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.datalayer.impl.AvailabilitySettingsDataSourceImpl$special$$inlined$map$2$2", f = "AvailabilitySettingsDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: qn.c$i$a$a  reason: collision with other inner class name */
            public static final class C2416a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101739c;

                /* renamed from: d  reason: collision with root package name */
                int f101740d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101741e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2416a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101741e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101739c = obj;
                    this.f101740d |= Integer.MIN_VALUE;
                    return this.f101741e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101738a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qn.c.i.a.C2416a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qn.c$i$a$a r0 = (qn.c.i.a.C2416a) r0
                    int r1 = r0.f101740d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101740d = r1
                    goto L_0x0018
                L_0x0013:
                    qn.c$i$a$a r0 = new qn.c$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101739c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101740d
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
                    TJ.h r6 = r4.f101738a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = qn.c.f101701f
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = r3
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f101740d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qn.c.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f101737a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101737a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public c(R2.h<W2.f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f101703a = hVar;
        this.f101704b = new h(hVar.getData());
        this.f101705c = new i(hVar.getData());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qn.c.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qn.c$g r0 = (qn.c.g) r0
            int r1 = r0.f101731l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f101731l = r1
            goto L_0x0018
        L_0x0013:
            qn.c$g r0 = new qn.c$g
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f101729j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f101731l
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f101725f
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f101724e
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f101723d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f101722c
            qn.c r7 = (qn.c) r7
            XH.y.b(r1)
            goto L_0x0067
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r6.f101703a
            TJ.g r1 = r1.getData()
            qn.c$f r3 = new qn.c$f
            r3.<init>(r1)
            r0.f101722c = r6
            r0.f101723d = r7
            r0.f101724e = r1
            r0.f101725f = r1
            r0.f101726g = r5
            r0.f101727h = r5
            r0.f101728i = r5
            r0.f101731l = r4
            java.lang.Object r1 = TJ.C16534i.D(r3, r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x006f
            boolean r5 = r1.booleanValue()
        L_0x006f:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qn.c.a(dI.e):java.lang.Object");
    }

    public Object b(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f101703a, new e(z10, (C17164e<? super e>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object c(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f101703a, new d(z10, (C17164e<? super d>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object d(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f101703a, new C2413c(z10, (C17164e<? super C2413c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<Boolean> e() {
        return this.f101705c;
    }

    public Object f(C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f101703a, new b((C17164e<? super b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<Boolean> g() {
        return this.f101704b;
    }
}
