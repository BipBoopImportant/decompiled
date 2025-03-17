package Jw;

import Dw.C12792a;
import Dw.c;
import Dw.e;
import Fw.C12909b;
import Fw.d;
import Iw.C13034a;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import am.h;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H@¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0015H@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'¨\u0006("}, d2 = {"LJw/b;", "LJw/a;", "LIw/a;", "ongoingOrdersMapper", "LFw/b;", "ongoingOrdersDao", "Lam/h;", "timeProvider", "<init>", "(LIw/a;LFw/b;Lam/h;)V", "LTJ/g;", "", "LDw/a;", "d", "()LTJ/g;", "", "timeSlotId", "a", "(Ljava/lang/String;)LTJ/g;", "LDw/e;", "timeSlot", "LXH/N;", "b", "(LDw/e;LdI/e;)Ljava/lang/Object;", "LDw/c;", "pickupStatus", "e", "(Ljava/lang/String;LDw/c;LdI/e;)Ljava/lang/Object;", "salesOrderId", "LDw/d;", "purchaseInformation", "c", "(Ljava/lang/String;Ljava/lang/String;LDw/d;LdI/e;)Ljava/lang/Object;", "f", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "g", "(LdI/e;)Ljava/lang/Object;", "LIw/a;", "LFw/b;", "Lam/h;", "ongoinginstoreordersrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jw.b  reason: case insensitive filesystem */
public final class C13120b implements C13119a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C13034a f111360a;

    /* renamed from: b  reason: collision with root package name */
    private final C12909b f111361b;

    /* renamed from: c  reason: collision with root package name */
    private final h f111362c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jw.b$a */
    public static final class a implements C16532g<List<? extends C12792a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f111363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13120b f111364b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jw.b$a$a  reason: collision with other inner class name */
        public static final class C2703a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f111365a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13120b f111366b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.ongoinginstoreordersrepository.impl.source.OngoingOrdersLocalDataSourceImpl$getOnGoingOrders$$inlined$map$1$2", f = "OngoingOrderLocalDataSource.kt", l = {50}, m = "emit")
            /* renamed from: Jw.b$a$a$a  reason: collision with other inner class name */
            public static final class C2704a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f111367c;

                /* renamed from: d  reason: collision with root package name */
                int f111368d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2703a f111369e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2704a(C2703a aVar, C17164e eVar) {
                    super(eVar);
                    this.f111369e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f111367c = obj;
                    this.f111368d |= Integer.MIN_VALUE;
                    return this.f111369e.emit((Object) null, this);
                }
            }

            public C2703a(C16533h hVar, C13120b bVar) {
                this.f111365a = hVar;
                this.f111366b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Jw.C13120b.a.C2703a.C2704a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Jw.b$a$a$a r0 = (Jw.C13120b.a.C2703a.C2704a) r0
                    int r1 = r0.f111368d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f111368d = r1
                    goto L_0x0018
                L_0x0013:
                    Jw.b$a$a$a r0 = new Jw.b$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f111367c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f111368d
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
                    TJ.h r6 = r4.f111365a
                    java.util.List r5 = (java.util.List) r5
                    Jw.b r2 = r4.f111366b
                    Iw.a r2 = r2.f111360a
                    java.util.List r5 = r2.a(r5)
                    r0.f111368d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Jw.C13120b.a.C2703a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, C13120b bVar) {
            this.f111363a = gVar;
            this.f111364b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f111363a.collect(new C2703a(hVar, this.f111364b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jw.b$b  reason: collision with other inner class name */
    public static final class C2705b implements C16532g<C12792a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f111370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13120b f111371b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Jw.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f111372a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C13120b f111373b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.ongoinginstoreordersrepository.impl.source.OngoingOrdersLocalDataSourceImpl$getOngoingOrder$$inlined$map$1$2", f = "OngoingOrderLocalDataSource.kt", l = {50}, m = "emit")
            /* renamed from: Jw.b$b$a$a  reason: collision with other inner class name */
            public static final class C2706a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f111374c;

                /* renamed from: d  reason: collision with root package name */
                int f111375d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f111376e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2706a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f111376e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f111374c = obj;
                    this.f111375d |= Integer.MIN_VALUE;
                    return this.f111376e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C13120b bVar) {
                this.f111372a = hVar;
                this.f111373b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Jw.C13120b.C2705b.a.C2706a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Jw.b$b$a$a r0 = (Jw.C13120b.C2705b.a.C2706a) r0
                    int r1 = r0.f111375d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f111375d = r1
                    goto L_0x0018
                L_0x0013:
                    Jw.b$b$a$a r0 = new Jw.b$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f111374c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f111375d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f111372a
                    Fw.d r5 = (Fw.d) r5
                    if (r5 == 0) goto L_0x0045
                    Jw.b r2 = r4.f111373b
                    Iw.a r2 = r2.f111360a
                    Dw.a r5 = r2.b(r5)
                    goto L_0x0046
                L_0x0045:
                    r5 = 0
                L_0x0046:
                    r0.f111375d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Jw.C13120b.C2705b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2705b(C16532g gVar, C13120b bVar) {
            this.f111370a = gVar;
            this.f111371b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f111370a.collect(new a(hVar, this.f111371b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C13120b(C13034a aVar, C12909b bVar, h hVar) {
        C17542s.j(aVar, "ongoingOrdersMapper");
        C17542s.j(bVar, "ongoingOrdersDao");
        C17542s.j(hVar, "timeProvider");
        this.f111360a = aVar;
        this.f111361b = bVar;
        this.f111362c = hVar;
    }

    public C16532g<C12792a> a(String str) {
        C17542s.j(str, "timeSlotId");
        return new C2705b(this.f111361b.get(str), this);
    }

    public Object b(e eVar, C17164e<? super C16807N> eVar2) {
        Object c10 = this.f111361b.c(this.f111360a.c(eVar), eVar2);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public Object c(String str, String str2, Dw.d dVar, C17164e<? super C16807N> eVar) {
        Object f10 = this.f111361b.f(new d.a.C2628a(str, str2, this.f111362c.c(), dVar.a(), dVar.b()), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public C16532g<List<C12792a>> d() {
        return new a(this.f111361b.getAll(), this);
    }

    public Object e(String str, c cVar, C17164e<? super C16807N> eVar) {
        Object d10 = this.f111361b.d(new d.a.b(str, cVar.j()), eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    public Object f(String str, C17164e<? super C16807N> eVar) {
        Object e10 = this.f111361b.e(str, eVar);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    public Object g(C17164e<? super C16807N> eVar) {
        Object b10 = this.f111361b.b(eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }
}
