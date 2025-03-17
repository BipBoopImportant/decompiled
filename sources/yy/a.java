package Yy;

import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000fH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000fH@¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\tH@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u000fH@¢\u0006\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"LYy/a;", "LRy/c;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "", "value", "LXH/N;", "g", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "e", "()LTJ/g;", "", "f", "(ZLdI/e;)Ljava/lang/Object;", "d", "h", "i", "a", "(LdI/e;)Ljava/lang/Object;", "c", "b", "LR2/h;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Ry.c {

    /* renamed from: b  reason: collision with root package name */
    public static final C2931a f118164b = new C2931a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final f.a<String> f118165c = W2.h.g("scanAndGoReceiptEmail");

    /* renamed from: d  reason: collision with root package name */
    private static final f.a<String> f118166d = W2.h.g("ScanAndGoEntryPointSource");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f.a<Boolean> f118167e = W2.h.a("scanAndGoHasAcknowledgedAllItems");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final f.a<Boolean> f118168f = W2.h.a("scanAndGoTermsAndConditionsAccepted");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final f.a<Boolean> f118169g = W2.h.a("ScanAndGoIsStoreConfirmed");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<W2.f> f118170a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"LYy/a$a;", "", "<init>", "()V", "LW2/f$a;", "", "USER_EMAIL_KEY", "LW2/f$a;", "d", "()LW2/f$a;", "", "HAS_ACKNOWLEDGED_ALL_ITEMS_KEY", "a", "TERMS_AND_CONDITIONS_ACCEPTED_KEY", "c", "IS_STORE_CONFIRMED_KEY", "b", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yy.a$a  reason: collision with other inner class name */
    public static final class C2931a {
        public /* synthetic */ C2931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f.a<Boolean> a() {
            return a.f118167e;
        }

        public final f.a<Boolean> b() {
            return a.f118169g;
        }

        public final f.a<Boolean> c() {
            return a.f118168f;
        }

        public final f.a<String> d() {
            return a.f118165c;
        }

        private C2931a() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$clear$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118171c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118172d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f118172d = obj;
            return bVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118171c == 0) {
                y.b(obj);
                ((W2.c) this.f118172d).f();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118173a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yy.a$c$a  reason: collision with other inner class name */
        public static final class C2932a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118174a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$getHasAcknowledgedAllItems$$inlined$map$1$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yy.a$c$a$a  reason: collision with other inner class name */
            public static final class C2933a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118175c;

                /* renamed from: d  reason: collision with root package name */
                int f118176d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2932a f118177e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2933a(C2932a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118177e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118175c = obj;
                    this.f118176d |= Integer.MIN_VALUE;
                    return this.f118177e.emit((Object) null, this);
                }
            }

            public C2932a(C16533h hVar) {
                this.f118174a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yy.a.c.C2932a.C2933a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yy.a$c$a$a r0 = (Yy.a.c.C2932a.C2933a) r0
                    int r1 = r0.f118176d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118176d = r1
                    goto L_0x0018
                L_0x0013:
                    Yy.a$c$a$a r0 = new Yy.a$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118175c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118176d
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
                    TJ.h r6 = r4.f118174a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = Yy.a.f118167e
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f118176d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yy.a.c.C2932a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f118173a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118173a.collect(new C2932a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118178a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yy.a$d$a  reason: collision with other inner class name */
        public static final class C2934a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118179a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$getTermsAndConditionsAccepted$$inlined$map$1$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yy.a$d$a$a  reason: collision with other inner class name */
            public static final class C2935a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118180c;

                /* renamed from: d  reason: collision with root package name */
                int f118181d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2934a f118182e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2935a(C2934a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118182e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118180c = obj;
                    this.f118181d |= Integer.MIN_VALUE;
                    return this.f118182e.emit((Object) null, this);
                }
            }

            public C2934a(C16533h hVar) {
                this.f118179a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yy.a.d.C2934a.C2935a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yy.a$d$a$a r0 = (Yy.a.d.C2934a.C2935a) r0
                    int r1 = r0.f118181d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118181d = r1
                    goto L_0x0018
                L_0x0013:
                    Yy.a$d$a$a r0 = new Yy.a$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118180c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118181d
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
                    TJ.h r6 = r4.f118179a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = Yy.a.f118168f
                    java.lang.Object r5 = r5.b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 == 0) goto L_0x0049
                    boolean r5 = r5.booleanValue()
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f118181d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yy.a.d.C2934a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f118178a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118178a.collect(new C2934a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118183a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yy.a$e$a  reason: collision with other inner class name */
        public static final class C2936a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118184a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$getUserEmail$$inlined$map$1$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yy.a$e$a$a  reason: collision with other inner class name */
            public static final class C2937a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118185c;

                /* renamed from: d  reason: collision with root package name */
                int f118186d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2936a f118187e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2937a(C2936a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118187e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118185c = obj;
                    this.f118186d |= Integer.MIN_VALUE;
                    return this.f118187e.emit((Object) null, this);
                }
            }

            public C2936a(C16533h hVar) {
                this.f118184a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yy.a.e.C2936a.C2937a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yy.a$e$a$a r0 = (Yy.a.e.C2936a.C2937a) r0
                    int r1 = r0.f118186d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118186d = r1
                    goto L_0x0018
                L_0x0013:
                    Yy.a$e$a$a r0 = new Yy.a$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118185c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118186d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f118184a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = Yy.a.f118165c
                    java.lang.Object r5 = r5.b(r2)
                    r0.f118186d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yy.a.e.C2936a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f118183a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118183a.collect(new C2936a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118188a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yy.a$f$a  reason: collision with other inner class name */
        public static final class C2938a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118189a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$isStoreConfirmed$$inlined$map$1$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Yy.a$f$a$a  reason: collision with other inner class name */
            public static final class C2939a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118190c;

                /* renamed from: d  reason: collision with root package name */
                int f118191d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2938a f118192e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2939a(C2938a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118192e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118190c = obj;
                    this.f118191d |= Integer.MIN_VALUE;
                    return this.f118192e.emit((Object) null, this);
                }
            }

            public C2938a(C16533h hVar) {
                this.f118189a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yy.a.f.C2938a.C2939a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yy.a$f$a$a r0 = (Yy.a.f.C2938a.C2939a) r0
                    int r1 = r0.f118191d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118191d = r1
                    goto L_0x0018
                L_0x0013:
                    Yy.a$f$a$a r0 = new Yy.a$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118190c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118191d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f118189a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = Yy.a.f118169g
                    java.lang.Object r5 = r5.b(r2)
                    r0.f118191d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yy.a.f.C2938a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f118188a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118188a.collect(new C2938a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {95}, m = "isStoreConfirmed")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118193c;

        /* renamed from: d  reason: collision with root package name */
        Object f118194d;

        /* renamed from: e  reason: collision with root package name */
        Object f118195e;

        /* renamed from: f  reason: collision with root package name */
        Object f118196f;

        /* renamed from: g  reason: collision with root package name */
        int f118197g;

        /* renamed from: h  reason: collision with root package name */
        int f118198h;

        /* renamed from: i  reason: collision with root package name */
        int f118199i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f118200j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ a f118201k;

        /* renamed from: l  reason: collision with root package name */
        int f118202l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f118201k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118200j = obj;
            this.f118202l |= Integer.MIN_VALUE;
            return this.f118201k.c(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$setHasAcknowledgedAllItems$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118203c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118204d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118205e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z10, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f118205e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f118205e, eVar);
            hVar.f118204d = obj;
            return hVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((h) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118203c == 0) {
                y.b(obj);
                ((W2.c) this.f118204d).j(a.f118164b.a(), kotlin.coroutines.jvm.internal.b.a(this.f118205e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "it", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$setIsStoreConfirmed$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class i extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118206c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118207d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(boolean z10, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f118208e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f118208e, eVar);
            iVar.f118207d = obj;
            return iVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((i) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118206c == 0) {
                y.b(obj);
                ((W2.c) this.f118207d).j(a.f118164b.b(), kotlin.coroutines.jvm.internal.b.a(this.f118208e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$setTermsAndConditionsAccepted$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class j extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118209c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118210d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118211e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(boolean z10, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f118211e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f118211e, eVar);
            jVar.f118210d = obj;
            return jVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((j) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118209c == 0) {
                y.b(obj);
                ((W2.c) this.f118210d).j(a.f118164b.c(), kotlin.coroutines.jvm.internal.b.a(this.f118211e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.ScanAndGoCapabilityDataSourceImpl$setUserEmail$2", f = "ScanAndGoCapabilityDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class k extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118212c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f118214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(String str, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f118214e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f118214e, eVar);
            kVar.f118213d = obj;
            return kVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((k) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118212c == 0) {
                y.b(obj);
                ((W2.c) this.f118213d).j(a.f118164b.d(), this.f118214e);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(R2.h<W2.f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f118170a = hVar;
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f118170a, new b((C17164e<? super b>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object b(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f118170a, new i(z10, (C17164e<? super i>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Yy.a.g
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Yy.a$g r0 = (Yy.a.g) r0
            int r1 = r0.f118202l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118202l = r1
            goto L_0x0018
        L_0x0013:
            Yy.a$g r0 = new Yy.a$g
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f118200j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118202l
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f118196f
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f118195e
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f118194d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f118193c
            Yy.a r7 = (Yy.a) r7
            XH.y.b(r1)
            goto L_0x0067
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r6.f118170a
            TJ.g r1 = r1.getData()
            Yy.a$f r3 = new Yy.a$f
            r3.<init>(r1)
            r0.f118193c = r6
            r0.f118194d = r7
            r0.f118195e = r1
            r0.f118196f = r1
            r0.f118197g = r5
            r0.f118198h = r5
            r0.f118199i = r5
            r0.f118202l = r4
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
        throw new UnsupportedOperationException("Method not decompiled: Yy.a.c(dI.e):java.lang.Object");
    }

    public C16532g<Boolean> d() {
        return new c(this.f118170a.getData());
    }

    public C16532g<String> e() {
        return new e(this.f118170a.getData());
    }

    public Object f(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f118170a, new h(z10, (C17164e<? super h>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object g(String str, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f118170a, new k(str, (C17164e<? super k>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public Object h(boolean z10, C17164e<? super C16807N> eVar) {
        Object a10 = W2.i.a(this.f118170a, new j(z10, (C17164e<? super j>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public C16532g<Boolean> i() {
        return new d(this.f118170a.getData());
    }
}
