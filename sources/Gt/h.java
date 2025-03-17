package gt;

import EB.C12832d;
import FB.C12860a;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import bK.C17052a;
import bK.g;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import eI.C17187b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jt.C11453a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR,\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#¨\u0006%"}, d2 = {"Lgt/h;", "Lgt/e;", "Lgt/d;", "remoteDataSource", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Lgt/d;LFB/a;)V", "", "storeId", "LTJ/g;", "", "Ljt/b;", "c", "(Ljava/lang/String;)LTJ/g;", "eventId", "d", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "timeslotId", "Ljt/a;", "registrationRequest", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljt/a;LdI/e;)Ljava/lang/Object;", "", "excludeSelectedStore", "a", "(Z)V", "Lgt/d;", "LFB/a;", "LbK/a;", "LbK/a;", "mutex", "LTJ/B;", "", "LTJ/B;", "storeEventCache", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements C11357e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11356d f97993a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f97994b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17052a f97995c = g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16505B<Map<String, List<jt.b>>> f97996d = C16521S.a(new LinkedHashMap());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<jt.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f97997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97998b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gt.h$a$a  reason: collision with other inner class name */
        public static final class C2195a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f97999a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f98000b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.instore.datalayer.storeevents.StoreEventsRepositoryImpl$getStoreEvent$$inlined$map$1$2", f = "StoreEventsRepositoryImpl.kt", l = {50}, m = "emit")
            /* renamed from: gt.h$a$a$a  reason: collision with other inner class name */
            public static final class C2196a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f98001c;

                /* renamed from: d  reason: collision with root package name */
                int f98002d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2195a f98003e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2196a(C2195a aVar, C17164e eVar) {
                    super(eVar);
                    this.f98003e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f98001c = obj;
                    this.f98002d |= Integer.MIN_VALUE;
                    return this.f98003e.emit((Object) null, this);
                }
            }

            public C2195a(C16533h hVar, String str) {
                this.f97999a = hVar;
                this.f98000b = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof gt.h.a.C2195a.C2196a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    gt.h$a$a$a r0 = (gt.h.a.C2195a.C2196a) r0
                    int r1 = r0.f98002d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f98002d = r1
                    goto L_0x0018
                L_0x0013:
                    gt.h$a$a$a r0 = new gt.h$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f98001c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f98002d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x0062
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f97999a
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x003e:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L_0x0058
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    jt.b r4 = (jt.b) r4
                    java.lang.String r4 = r4.c()
                    java.lang.String r5 = r6.f98000b
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                    if (r4 == 0) goto L_0x003e
                    goto L_0x0059
                L_0x0058:
                    r2 = 0
                L_0x0059:
                    r0.f98002d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: gt.h.a.C2195a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, String str) {
            this.f97997a = gVar;
            this.f97998b = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f97997a.collect(new C2195a(hVar, this.f97998b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<List<? extends jt.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f98004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f98005b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f98006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f98007b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.instore.datalayer.storeevents.StoreEventsRepositoryImpl$getStoreEvents$$inlined$mapNotNull$1$2", f = "StoreEventsRepositoryImpl.kt", l = {52}, m = "emit")
            /* renamed from: gt.h$b$a$a  reason: collision with other inner class name */
            public static final class C2197a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f98008c;

                /* renamed from: d  reason: collision with root package name */
                int f98009d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f98010e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2197a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f98010e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f98008c = obj;
                    this.f98009d |= Integer.MIN_VALUE;
                    return this.f98010e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, String str) {
                this.f98006a = hVar;
                this.f98007b = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof gt.h.b.a.C2197a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    gt.h$b$a$a r0 = (gt.h.b.a.C2197a) r0
                    int r1 = r0.f98009d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f98009d = r1
                    goto L_0x0018
                L_0x0013:
                    gt.h$b$a$a r0 = new gt.h$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f98008c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f98009d
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
                    TJ.h r6 = r4.f98006a
                    java.util.Map r5 = (java.util.Map) r5
                    java.lang.String r2 = r4.f98007b
                    java.lang.Object r5 = r5.get(r2)
                    if (r5 == 0) goto L_0x0049
                    r0.f98009d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: gt.h.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, String str) {
            this.f98004a = gVar;
            this.f98005b = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f98004a.collect(new a(hVar, this.f98005b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Ljt/b;", "map", "LXH/N;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.datalayer.storeevents.StoreEventsRepositoryImpl$getStoreEvents$1", f = "StoreEventsRepositoryImpl.kt", l = {86, 32}, m = "invokeSuspend")
    static final class c extends l implements p<Map<String, List<? extends jt.b>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f98011c;

        /* renamed from: d  reason: collision with root package name */
        Object f98012d;

        /* renamed from: e  reason: collision with root package name */
        Object f98013e;

        /* renamed from: f  reason: collision with root package name */
        int f98014f;

        /* renamed from: g  reason: collision with root package name */
        int f98015g;

        /* renamed from: h  reason: collision with root package name */
        int f98016h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f98017i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ h f98018j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f98019k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f98018j = hVar;
            this.f98019k = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f98018j, this.f98019k, eVar);
            cVar.f98017i = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(Map<String, List<jt.b>> map, C17164e<? super C16807N> eVar) {
            return ((c) create(map, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.util.Map} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f98016h
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0048
                if (r1 == r4) goto L_0x0030
                if (r1 != r3) goto L_0x0028
                java.lang.Object r0 = r9.f98013e
                gt.h r0 = (gt.h) r0
                java.lang.Object r1 = r9.f98012d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r9.f98011c
                bK.a r2 = (bK.C17052a) r2
                java.lang.Object r3 = r9.f98017i
                java.util.Map r3 = (java.util.Map) r3
                XH.y.b(r10)     // Catch:{ all -> 0x0025 }
                goto L_0x0091
            L_0x0025:
                r10 = move-exception
                goto L_0x00b4
            L_0x0028:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0030:
                int r1 = r9.f98014f
                java.lang.Object r4 = r9.f98013e
                gt.h r4 = (gt.h) r4
                java.lang.Object r6 = r9.f98012d
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r9.f98011c
                bK.a r7 = (bK.C17052a) r7
                java.lang.Object r8 = r9.f98017i
                java.util.Map r8 = (java.util.Map) r8
                XH.y.b(r10)
                r10 = r1
                r1 = r6
                goto L_0x0070
            L_0x0048:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f98017i
                r8 = r10
                java.util.Map r8 = (java.util.Map) r8
                gt.h r10 = r9.f98018j
                bK.a r10 = r10.f97995c
                java.lang.String r1 = r9.f98019k
                gt.h r6 = r9.f98018j
                r9.f98017i = r8
                r9.f98011c = r10
                r9.f98012d = r1
                r9.f98013e = r6
                r9.f98014f = r2
                r9.f98016h = r4
                java.lang.Object r4 = r10.e(r5, r9)
                if (r4 != r0) goto L_0x006d
                return r0
            L_0x006d:
                r7 = r10
                r10 = r2
                r4 = r6
            L_0x0070:
                java.lang.Object r6 = r8.get(r1)     // Catch:{ all -> 0x00a8 }
                if (r6 != 0) goto L_0x00ab
                gt.d r6 = r4.f97993a     // Catch:{ all -> 0x00a8 }
                r9.f98017i = r8     // Catch:{ all -> 0x00a8 }
                r9.f98011c = r7     // Catch:{ all -> 0x00a8 }
                r9.f98012d = r1     // Catch:{ all -> 0x00a8 }
                r9.f98013e = r4     // Catch:{ all -> 0x00a8 }
                r9.f98014f = r10     // Catch:{ all -> 0x00a8 }
                r9.f98015g = r2     // Catch:{ all -> 0x00a8 }
                r9.f98016h = r3     // Catch:{ all -> 0x00a8 }
                java.lang.Object r10 = r6.a(r1, r9)     // Catch:{ all -> 0x00a8 }
                if (r10 != r0) goto L_0x008f
                return r0
            L_0x008f:
                r0 = r4
                r2 = r7
            L_0x0091:
                java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f97996d     // Catch:{ all -> 0x0025 }
            L_0x0097:
                java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r4 = r3
                java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0025 }
                r4.put(r1, r10)     // Catch:{ all -> 0x0025 }
                boolean r3 = r0.e(r3, r4)     // Catch:{ all -> 0x0025 }
                if (r3 == 0) goto L_0x0097
                goto L_0x00ac
            L_0x00a8:
                r10 = move-exception
                r2 = r7
                goto L_0x00b4
            L_0x00ab:
                r2 = r7
            L_0x00ac:
                XH.N r10 = XH.C16807N.f139792a     // Catch:{ all -> 0x0025 }
                r2.d(r5)
                XH.N r10 = XH.C16807N.f139792a
                return r10
            L_0x00b4:
                r2.d(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: gt.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.datalayer.storeevents.StoreEventsRepositoryImpl", f = "StoreEventsRepositoryImpl.kt", l = {53}, m = "updateRegistration")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98020c;

        /* renamed from: d  reason: collision with root package name */
        Object f98021d;

        /* renamed from: e  reason: collision with root package name */
        Object f98022e;

        /* renamed from: f  reason: collision with root package name */
        Object f98023f;

        /* renamed from: g  reason: collision with root package name */
        Object f98024g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f98025h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h f98026i;

        /* renamed from: j  reason: collision with root package name */
        int f98027j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f98026i = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98025h = obj;
            this.f98027j |= Integer.MIN_VALUE;
            return this.f98026i.b((String) null, (String) null, (C11453a) null, this);
        }
    }

    public h(C11356d dVar, C12860a aVar) {
        C17542s.j(dVar, "remoteDataSource");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f97993a = dVar;
        this.f97994b = aVar;
    }

    /* access modifiers changed from: private */
    public static final boolean j(String str, String str2) {
        C17542s.j(str2, PlaceTypes.STORE);
        return !C17542s.e(str2, str);
    }

    /* access modifiers changed from: private */
    public static final boolean k(C17642l lVar, Object obj) {
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    public void a(boolean z10) {
        if (z10) {
            C12832d c10 = this.f97994b.c();
            String e10 = c10 != null ? c10.e() : null;
            Map value = this.f97996d.getValue();
            value.keySet().removeIf(new C11359g(new C11358f(e10)));
            this.f97996d.setValue(value);
            return;
        }
        this.f97996d.setValue(new LinkedHashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r12, java.lang.String r13, jt.C11453a r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof gt.h.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            gt.h$d r0 = (gt.h.d) r0
            int r1 = r0.f98027j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f98027j = r1
            goto L_0x0018
        L_0x0013:
            gt.h$d r0 = new gt.h$d
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f98025h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f98027j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r12 = r0.f98024g
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f98023f
            jt.a r12 = (jt.C11453a) r12
            java.lang.Object r12 = r0.f98022e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f98021d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f98020c
            gt.h r12 = (gt.h) r12
            XH.y.b(r1)
            goto L_0x005e
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0045:
            XH.y.b(r1)
            gt.d r1 = r11.f97993a
            r0.f98020c = r11
            r0.f98021d = r12
            r0.f98022e = r13
            r0.f98023f = r14
            r0.f98024g = r15
            r0.f98027j = r4
            java.lang.Object r1 = r1.b(r12, r13, r14, r0)
            if (r1 != r2) goto L_0x005d
            return r2
        L_0x005d:
            r12 = r11
        L_0x005e:
            QL.x r1 = (QL.x) r1
            boolean r13 = r1.e()
            r14 = 0
            if (r13 == 0) goto L_0x006d
            r12.a(r14)
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x006d:
            qv.e r13 = qv.e.WARN
            qv.d r15 = qv.d.f102012a
            java.util.List r15 = r15.a()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r15.iterator()
        L_0x0080:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r15.next()
            r3 = r2
            qv.b r3 = (qv.C11819b) r3
            boolean r3 = r3.b(r13, r14)
            if (r3 == 0) goto L_0x0080
            r0.add(r2)
            goto L_0x0080
        L_0x0097:
            java.util.Iterator r14 = r0.iterator()
            r15 = 0
            r0 = r15
            r2 = r0
        L_0x009e:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0126
            java.lang.Object r3 = r14.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r9 = 0
            if (r0 != 0) goto L_0x00cd
            GK.E r0 = r1.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Not able to update registration: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = qv.C11818a.a(r0, r9)
            if (r0 == 0) goto L_0x0126
            java.lang.String r0 = qv.C11820c.a(r0)
        L_0x00cd:
            if (r2 != 0) goto L_0x011d
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r3 = 36
            r6 = 2
            java.lang.String r3 = HJ.C15854t.s1(r2, r3, r15, r6, r15)
            r7 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r7, r15, r6, r15)
            int r6 = r3.length()
            if (r6 != 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            java.lang.String r2 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r3, r2)
        L_0x00f4:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = "main"
            boolean r3 = HJ.C15854t.b0(r3, r6, r4)
            if (r3 == 0) goto L_0x0107
            java.lang.String r3 = "m"
            goto L_0x0109
        L_0x0107:
            java.lang.String r3 = "b"
        L_0x0109:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = "|"
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
        L_0x011d:
            r8 = 0
            r6 = r13
            r7 = r2
            r10 = r0
            r5.a(r6, r7, r8, r9, r10)
            goto L_0x009e
        L_0x0126:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Failed to updateRegistration"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.h.b(java.lang.String, java.lang.String, jt.a, dI.e):java.lang.Object");
    }

    public C16532g<List<jt.b>> c(String str) {
        C17542s.j(str, "storeId");
        return new b(C16534i.R(this.f97996d, new c(this, str, (C17164e<? super c>) null)), str);
    }

    public C16532g<jt.b> d(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "eventId");
        return new a(c(str), str2);
    }
}
