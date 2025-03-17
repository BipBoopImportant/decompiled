package Xy;

import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\fB\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0012"}, d2 = {"LXy/b;", "LXy/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "LTy/c;", "pickupWaitingTime", "LXH/N;", "b", "(LTy/c;LdI/e;)Ljava/lang/Object;", "a", "LR2/h;", "LTJ/g;", "LTJ/g;", "()LTJ/g;", "c", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f117845c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f117846a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Ty.c> f117847b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXy/b$a;", "", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "waitingTIme", "", "pickupTime", "LTy/c;", "<anonymous>", "(IJ)LTy/c;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.source.FullServePickupWaitingTimeLocalDataSourceImpl$pickupWaitingTime$3", f = "FullServePickupWaitingTimeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Xy.b$b  reason: collision with other inner class name */
    static final class C2921b extends l implements q<Integer, Long, C17164e<? super Ty.c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117848c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f117849d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f117850e;

        C2921b(C17164e<? super C2921b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(Integer num, Long l10, C17164e<? super Ty.c> eVar) {
            C2921b bVar = new C2921b(eVar);
            bVar.f117849d = num;
            bVar.f117850e = l10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117848c == 0) {
                y.b(obj);
                Integer num = (Integer) this.f117849d;
                Long l10 = (Long) this.f117850e;
                if (num == null || l10 == null) {
                    return null;
                }
                return new Ty.c(num.intValue(), l10.longValue());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f117851a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f117852a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.source.FullServePickupWaitingTimeLocalDataSourceImpl$special$$inlined$map$1$2", f = "FullServePickupWaitingTimeLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Xy.b$c$a$a  reason: collision with other inner class name */
            public static final class C2922a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f117853c;

                /* renamed from: d  reason: collision with root package name */
                int f117854d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f117855e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2922a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f117855e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f117853c = obj;
                    this.f117854d |= Integer.MIN_VALUE;
                    return this.f117855e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f117852a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Xy.b.c.a.C2922a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Xy.b$c$a$a r0 = (Xy.b.c.a.C2922a) r0
                    int r1 = r0.f117854d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f117854d = r1
                    goto L_0x0018
                L_0x0013:
                    Xy.b$c$a$a r0 = new Xy.b$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f117853c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f117854d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f117852a
                    W2.f r5 = (W2.f) r5
                    java.lang.String r2 = "estimated_waiting_time"
                    W2.f$a r2 = W2.h.e(r2)
                    java.lang.Object r5 = r5.b(r2)
                    r0.f117854d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Xy.b.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f117851a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f117851a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<Long> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f117856a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f117857a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.source.FullServePickupWaitingTimeLocalDataSourceImpl$special$$inlined$map$2$2", f = "FullServePickupWaitingTimeLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: Xy.b$d$a$a  reason: collision with other inner class name */
            public static final class C2923a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f117858c;

                /* renamed from: d  reason: collision with root package name */
                int f117859d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f117860e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2923a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f117860e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f117858c = obj;
                    this.f117859d |= Integer.MIN_VALUE;
                    return this.f117860e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f117857a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Xy.b.d.a.C2923a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Xy.b$d$a$a r0 = (Xy.b.d.a.C2923a) r0
                    int r1 = r0.f117859d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f117859d = r1
                    goto L_0x0018
                L_0x0013:
                    Xy.b$d$a$a r0 = new Xy.b$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f117858c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f117859d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f117857a
                    W2.f r5 = (W2.f) r5
                    java.lang.String r2 = "estimated_pickup_time"
                    W2.f$a r2 = W2.h.f(r2)
                    java.lang.Object r5 = r5.b(r2)
                    r0.f117859d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Xy.b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f117856a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f117856a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.source.FullServePickupWaitingTimeLocalDataSourceImpl$updatePickupWaitingTime$2", f = "FullServePickupWaitingTimeLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f117861c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f117862d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Ty.c f117863e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Ty.c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f117863e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f117863e, eVar);
            eVar2.f117862d = obj;
            return eVar2;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((e) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f117861c == 0) {
                y.b(obj);
                W2.c cVar = (W2.c) this.f117862d;
                Ty.c cVar2 = this.f117863e;
                if (cVar2 == null) {
                    cVar.i(W2.h.e("estimated_waiting_time"));
                    cVar.i(W2.h.f("estimated_pickup_time"));
                } else {
                    cVar.j(W2.h.e("estimated_waiting_time"), kotlin.coroutines.jvm.internal.b.e(cVar2.b()));
                    cVar.j(W2.h.f("estimated_pickup_time"), kotlin.coroutines.jvm.internal.b.f(cVar2.a()));
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(h<f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f117846a = hVar;
        this.f117847b = C16534i.s(C16534i.n(new c(hVar.getData()), new d(hVar.getData()), new C2921b((C17164e<? super C2921b>) null)));
    }

    public C16532g<Ty.c> a() {
        return this.f117847b;
    }

    public Object b(Ty.c cVar, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f117846a, new e(cVar, (C17164e<? super e>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
