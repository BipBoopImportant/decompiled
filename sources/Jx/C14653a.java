package jx;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote;
import dI.C17164e;
import eI.C17187b;
import hx.C14544b;
import hx.C14545c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.K;
import kx.C14733c;
import lx.C14769a;
import mx.C14799a;
import nI.p;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0013H@¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0013H@¢\u0006\u0004\b#\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010&¨\u0006'"}, d2 = {"Ljx/a;", "Lhx/b;", "Lmx/a;", "remoteSource", "Llx/a;", "localSource", "Lkx/c;", "prepaidCardMapper", "<init>", "(Lmx/a;Llx/a;Lkx/c;)V", "LXH/N;", "k", "(LdI/e;)Ljava/lang/Object;", "", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "remote", "Lix/c;", "j", "(Ljava/util/List;)Ljava/util/List;", "", "cardNumber", "pin", "Lix/b;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "Lhx/c;", "b", "()LTJ/g;", "redemptionCode", "Lhx/a;", "c", "prepaidCardNumber", "d", "Lmx/a;", "Llx/a;", "Lkx/c;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jx.a  reason: case insensitive filesystem */
public final class C14653a implements C14544b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14799a f127989a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14769a f127990b;

    /* renamed from: c  reason: collision with root package name */
    private final C14733c f127991c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl", f = "GiftCardRepositoryImpl.kt", l = {77, 79}, m = "attachPrepaidCard")
    /* renamed from: jx.a$a  reason: collision with other inner class name */
    static final class C3158a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f127992c;

        /* renamed from: d  reason: collision with root package name */
        Object f127993d;

        /* renamed from: e  reason: collision with root package name */
        Object f127994e;

        /* renamed from: f  reason: collision with root package name */
        Object f127995f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f127996g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14653a f127997h;

        /* renamed from: i  reason: collision with root package name */
        int f127998i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3158a(C14653a aVar, C17164e<? super C3158a> eVar) {
            super(eVar);
            this.f127997h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f127996g = obj;
            this.f127998i |= Integer.MIN_VALUE;
            return this.f127997h.c((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl", f = "GiftCardRepositoryImpl.kt", l = {87, 89}, m = "detachPrepaidCard")
    /* renamed from: jx.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f127999c;

        /* renamed from: d  reason: collision with root package name */
        Object f128000d;

        /* renamed from: e  reason: collision with root package name */
        Object f128001e;

        /* renamed from: f  reason: collision with root package name */
        Object f128002f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f128003g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C14653a f128004h;

        /* renamed from: i  reason: collision with root package name */
        int f128005i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14653a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f128004h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128003g = obj;
            this.f128005i |= Integer.MIN_VALUE;
            return this.f128004h.d((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lhx/c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl$getPrepaidCards$1", f = "GiftCardRepositoryImpl.kt", l = {40, 43, 45, 48, 50, 51, 61}, m = "invokeSuspend")
    /* renamed from: jx.a$c */
    static final class c extends l implements p<C16533h<? super C14545c>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f128006c;

        /* renamed from: d  reason: collision with root package name */
        Object f128007d;

        /* renamed from: e  reason: collision with root package name */
        Object f128008e;

        /* renamed from: f  reason: collision with root package name */
        Object f128009f;

        /* renamed from: g  reason: collision with root package name */
        Object f128010g;

        /* renamed from: h  reason: collision with root package name */
        Object f128011h;

        /* renamed from: i  reason: collision with root package name */
        Object f128012i;

        /* renamed from: j  reason: collision with root package name */
        Object f128013j;

        /* renamed from: k  reason: collision with root package name */
        int f128014k;

        /* renamed from: l  reason: collision with root package name */
        int f128015l;

        /* renamed from: m  reason: collision with root package name */
        int f128016m;

        /* renamed from: n  reason: collision with root package name */
        int f128017n;

        /* renamed from: o  reason: collision with root package name */
        int f128018o;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f128019p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ C14653a f128020q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhx/c;", "it", "LXH/N;", "<anonymous>", "(Lhx/c;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl$getPrepaidCards$1$2$2", f = "GiftCardRepositoryImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: jx.a$c$a  reason: collision with other inner class name */
        static final class C3159a extends l implements p<C14545c, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f128021c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f128022d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3159a(K k10, C17164e<? super C3159a> eVar) {
                super(2, eVar);
                this.f128022d = k10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3159a(this.f128022d, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C14545c cVar, C17164e<? super C16807N> eVar) {
                return ((C3159a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f128021c == 0) {
                    y.b(obj);
                    this.f128022d.f144344a = false;
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jx.a$c$b */
        public static final class b implements C16532g<C14545c.C3141c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f128023a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14653a f128024b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: jx.a$c$b$a  reason: collision with other inner class name */
            public static final class C3160a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f128025a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C14653a f128026b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl$getPrepaidCards$1$invokeSuspend$lambda$1$$inlined$map$1$2", f = "GiftCardRepositoryImpl.kt", l = {50}, m = "emit")
                /* renamed from: jx.a$c$b$a$a  reason: collision with other inner class name */
                public static final class C3161a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f128027c;

                    /* renamed from: d  reason: collision with root package name */
                    int f128028d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C3160a f128029e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3161a(C3160a aVar, C17164e eVar) {
                        super(eVar);
                        this.f128029e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f128027c = obj;
                        this.f128028d |= Integer.MIN_VALUE;
                        return this.f128029e.emit((Object) null, this);
                    }
                }

                public C3160a(C16533h hVar, C14653a aVar) {
                    this.f128025a = hVar;
                    this.f128026b = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof jx.C14653a.c.b.C3160a.C3161a
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        jx.a$c$b$a$a r0 = (jx.C14653a.c.b.C3160a.C3161a) r0
                        int r1 = r0.f128028d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f128028d = r1
                        goto L_0x0018
                    L_0x0013:
                        jx.a$c$b$a$a r0 = new jx.a$c$b$a$a
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.f128027c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f128028d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r7)
                        goto L_0x004c
                    L_0x0029:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L_0x0031:
                        XH.y.b(r7)
                        TJ.h r7 = r5.f128025a
                        java.util.List r6 = (java.util.List) r6
                        hx.c$c r2 = new hx.c$c
                        jx.a r4 = r5.f128026b
                        java.util.List r6 = r4.j(r6)
                        r2.<init>(r6)
                        r0.f128028d = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L_0x004c
                        return r1
                    L_0x004c:
                        XH.N r6 = XH.C16807N.f139792a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: jx.C14653a.c.b.C3160a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public b(C16532g gVar, C14653a aVar) {
                this.f128023a = gVar;
                this.f128024b = aVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f128023a.collect(new C3160a(hVar, this.f128024b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: jx.a$c$c  reason: collision with other inner class name */
        public static final class C3162c implements C16532g<C14545c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f128030a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C14653a f128031b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ K f128032c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Throwable f128033d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: jx.a$c$c$a  reason: collision with other inner class name */
            public static final class C3163a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f128034a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C14653a f128035b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ K f128036c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Throwable f128037d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl$getPrepaidCards$1$invokeSuspend$lambda$3$$inlined$map$1$2", f = "GiftCardRepositoryImpl.kt", l = {50}, m = "emit")
                /* renamed from: jx.a$c$c$a$a  reason: collision with other inner class name */
                public static final class C3164a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f128038c;

                    /* renamed from: d  reason: collision with root package name */
                    int f128039d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C3163a f128040e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C3164a(C3163a aVar, C17164e eVar) {
                        super(eVar);
                        this.f128040e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f128038c = obj;
                        this.f128039d |= Integer.MIN_VALUE;
                        return this.f128040e.emit((Object) null, this);
                    }
                }

                public C3163a(C16533h hVar, C14653a aVar, K k10, Throwable th2) {
                    this.f128034a = hVar;
                    this.f128035b = aVar;
                    this.f128036c = k10;
                    this.f128037d = th2;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof jx.C14653a.c.C3162c.C3163a.C3164a
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        jx.a$c$c$a$a r0 = (jx.C14653a.c.C3162c.C3163a.C3164a) r0
                        int r1 = r0.f128039d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f128039d = r1
                        goto L_0x0018
                    L_0x0013:
                        jx.a$c$c$a$a r0 = new jx.a$c$c$a$a
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.f128038c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f128039d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r7)
                        goto L_0x005a
                    L_0x0029:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L_0x0031:
                        XH.y.b(r7)
                        TJ.h r7 = r5.f128034a
                        java.util.List r6 = (java.util.List) r6
                        jx.a r2 = r5.f128035b
                        java.util.List r6 = r2.j(r6)
                        kotlin.jvm.internal.K r2 = r5.f128036c
                        boolean r2 = r2.f144344a
                        if (r2 == 0) goto L_0x004c
                        hx.c$a r2 = new hx.c$a
                        java.lang.Throwable r4 = r5.f128037d
                        r2.<init>(r6, r4)
                        goto L_0x0051
                    L_0x004c:
                        hx.c$c r2 = new hx.c$c
                        r2.<init>(r6)
                    L_0x0051:
                        r0.f128039d = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L_0x005a
                        return r1
                    L_0x005a:
                        XH.N r6 = XH.C16807N.f139792a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: jx.C14653a.c.C3162c.C3163a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public C3162c(C16532g gVar, C14653a aVar, K k10, Throwable th2) {
                this.f128030a = gVar;
                this.f128031b = aVar;
                this.f128032c = k10;
                this.f128033d = th2;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f128030a.collect(new C3163a(hVar, this.f128031b, this.f128032c, this.f128033d), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14653a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f128020q = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f128020q, eVar);
            cVar.f128019p = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super C14545c> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ab, code lost:
            r12 = (java.util.List) r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ad, code lost:
            if (r12 != null) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00af, code lost:
            r12 = YH.C16877v.n();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b3, code lost:
            r1 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bb, code lost:
            if (r1.isEmpty() != false) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bd, code lost:
            r12 = new hx.C14545c.C3141c(jx.C14653a.h(r11.f128020q, r1));
            r11.f128019p = r4;
            r11.f128006c = r1;
            r11.f128018o = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
            if (r4.emit(r12, r11) != r0) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d6, code lost:
            r12 = hx.C14545c.b.f127514a;
            r11.f128019p = r4;
            r11.f128006c = r1;
            r11.f128018o = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
            if (r4.emit(r12, r11) != r0) goto L_0x00e6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e5, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
            r12 = jx.C14653a.g(r11.f128020q);
            r11.f128019p = r4;
            r11.f128006c = r1;
            r11.f128018o = 4;
            r12 = r12.d(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f7, code lost:
            if (r12 != r0) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fa, code lost:
            r4 = r11.f128020q;
            r12 = XH.x.e(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0100, code lost:
            if (r12 != null) goto L_0x0152;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0102, code lost:
            r2 = (java.util.List) r6;
            r12 = jx.C14653a.f(r4);
            r11.f128019p = r8;
            r11.f128006c = r7;
            r11.f128007d = r6;
            r11.f128008e = r4;
            r11.f128009f = r4;
            r11.f128010g = r2;
            r11.f128014k = 0;
            r11.f128018o = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x011e, code lost:
            if (r12.a(r2, r11) != r0) goto L_0x0121;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0120, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0121, code lost:
            r1 = 0;
            r5 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0123, code lost:
            r12 = jx.C14653a.f(r5).b();
            r9 = new jx.C14653a.c.b(r12, r5);
            r11.f128019p = r8;
            r11.f128006c = r7;
            r11.f128007d = r6;
            r11.f128008e = r5;
            r11.f128009f = r4;
            r11.f128010g = r2;
            r11.f128011h = r12;
            r11.f128012i = r12;
            r11.f128014k = r1;
            r11.f128015l = 0;
            r11.f128016m = 0;
            r11.f128017n = 0;
            r11.f128018o = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x014f, code lost:
            if (TJ.C16534i.x(r8, r9, r11) != r0) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0151, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0152, code lost:
            r1 = new kotlin.jvm.internal.K();
            r1.f144344a = true;
            r2 = jx.C14653a.f(r4).b();
            r5 = TJ.C16534i.R(new jx.C14653a.c.C3162c(r2, r4, r1, r12), new jx.C14653a.c.C3159a(r1, (dI.C17164e<? super jx.C14653a.c.C3159a>) null));
            r11.f128019p = r8;
            r11.f128006c = r7;
            r11.f128007d = r6;
            r11.f128008e = r4;
            r11.f128009f = r4;
            r11.f128010g = r12;
            r11.f128011h = r1;
            r11.f128012i = r2;
            r11.f128013j = r2;
            r11.f128014k = 0;
            r11.f128015l = 0;
            r11.f128016m = 0;
            r11.f128017n = 0;
            r11.f128018o = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0191, code lost:
            if (TJ.C16534i.x(r8, r5, r11) != r0) goto L_0x0194;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0193, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0196, code lost:
            return XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
            r0 = (jx.C14653a) r11.f128009f;
            r0 = (jx.C14653a) r11.f128008e;
            r0 = (java.util.List) r11.f128006c;
            r0 = (TJ.C16533h) r11.f128019p;
            XH.y.b(r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
            r6 = r12;
            r7 = r1;
            r8 = r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f128018o
                r2 = 1
                r3 = 0
                switch(r1) {
                    case 0: goto L_0x008d;
                    case 1: goto L_0x0084;
                    case 2: goto L_0x0078;
                    case 3: goto L_0x0078;
                    case 4: goto L_0x0062;
                    case 5: goto L_0x0045;
                    case 6: goto L_0x0024;
                    case 7: goto L_0x0013;
                    default: goto L_0x000b;
                }
            L_0x000b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0013:
                java.lang.Object r0 = r11.f128013j
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r11.f128012i
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r11.f128011h
                kotlin.jvm.internal.K r0 = (kotlin.jvm.internal.K) r0
                java.lang.Object r0 = r11.f128010g
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                goto L_0x0030
            L_0x0024:
                java.lang.Object r0 = r11.f128012i
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r11.f128011h
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r11.f128010g
                java.util.List r0 = (java.util.List) r0
            L_0x0030:
                java.lang.Object r0 = r11.f128009f
                jx.a r0 = (jx.C14653a) r0
                java.lang.Object r0 = r11.f128008e
                jx.a r0 = (jx.C14653a) r0
                java.lang.Object r0 = r11.f128006c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r11.f128019p
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r12)
                goto L_0x0194
            L_0x0045:
                int r1 = r11.f128014k
                java.lang.Object r2 = r11.f128010g
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r4 = r11.f128009f
                jx.a r4 = (jx.C14653a) r4
                java.lang.Object r5 = r11.f128008e
                jx.a r5 = (jx.C14653a) r5
                java.lang.Object r6 = r11.f128007d
                java.lang.Object r7 = r11.f128006c
                java.util.List r7 = (java.util.List) r7
                java.lang.Object r8 = r11.f128019p
                TJ.h r8 = (TJ.C16533h) r8
                XH.y.b(r12)
                goto L_0x0123
            L_0x0062:
                java.lang.Object r1 = r11.f128006c
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f128019p
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r12)
                XH.x r12 = (XH.x) r12
                java.lang.Object r12 = r12.j()
            L_0x0073:
                r6 = r12
                r7 = r1
                r8 = r4
                goto L_0x00fa
            L_0x0078:
                java.lang.Object r1 = r11.f128006c
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r11.f128019p
                TJ.h r4 = (TJ.C16533h) r4
                XH.y.b(r12)
                goto L_0x00e6
            L_0x0084:
                java.lang.Object r1 = r11.f128019p
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r12)
                r4 = r1
                goto L_0x00ab
            L_0x008d:
                XH.y.b(r12)
                java.lang.Object r12 = r11.f128019p
                TJ.h r12 = (TJ.C16533h) r12
                jx.a r1 = r11.f128020q
                lx.a r1 = r1.f127990b
                TJ.g r1 = r1.b()
                r11.f128019p = r12
                r11.f128018o = r2
                java.lang.Object r1 = TJ.C16534i.D(r1, r11)
                if (r1 != r0) goto L_0x00a9
                return r0
            L_0x00a9:
                r4 = r12
                r12 = r1
            L_0x00ab:
                java.util.List r12 = (java.util.List) r12
                if (r12 != 0) goto L_0x00b3
                java.util.List r12 = YH.C16877v.n()
            L_0x00b3:
                r1 = r12
                r12 = r1
                java.util.Collection r12 = (java.util.Collection) r12
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L_0x00d6
                hx.c$c r12 = new hx.c$c
                jx.a r5 = r11.f128020q
                java.util.List r5 = r5.j(r1)
                r12.<init>(r5)
                r11.f128019p = r4
                r11.f128006c = r1
                r5 = 2
                r11.f128018o = r5
                java.lang.Object r12 = r4.emit(r12, r11)
                if (r12 != r0) goto L_0x00e6
                return r0
            L_0x00d6:
                hx.c$b r12 = hx.C14545c.b.f127514a
                r11.f128019p = r4
                r11.f128006c = r1
                r5 = 3
                r11.f128018o = r5
                java.lang.Object r12 = r4.emit(r12, r11)
                if (r12 != r0) goto L_0x00e6
                return r0
            L_0x00e6:
                jx.a r12 = r11.f128020q
                mx.a r12 = r12.f127989a
                r11.f128019p = r4
                r11.f128006c = r1
                r5 = 4
                r11.f128018o = r5
                java.lang.Object r12 = r12.d(r11)
                if (r12 != r0) goto L_0x0073
                return r0
            L_0x00fa:
                jx.a r4 = r11.f128020q
                java.lang.Throwable r12 = XH.x.e(r6)
                if (r12 != 0) goto L_0x0152
                r2 = r6
                java.util.List r2 = (java.util.List) r2
                lx.a r12 = r4.f127990b
                r11.f128019p = r8
                r11.f128006c = r7
                r11.f128007d = r6
                r11.f128008e = r4
                r11.f128009f = r4
                r11.f128010g = r2
                r11.f128014k = r3
                r1 = 5
                r11.f128018o = r1
                java.lang.Object r12 = r12.a(r2, r11)
                if (r12 != r0) goto L_0x0121
                return r0
            L_0x0121:
                r1 = r3
                r5 = r4
            L_0x0123:
                lx.a r12 = r5.f127990b
                TJ.g r12 = r12.b()
                jx.a$c$b r9 = new jx.a$c$b
                r9.<init>(r12, r5)
                r11.f128019p = r8
                r11.f128006c = r7
                r11.f128007d = r6
                r11.f128008e = r5
                r11.f128009f = r4
                r11.f128010g = r2
                r11.f128011h = r12
                r11.f128012i = r12
                r11.f128014k = r1
                r11.f128015l = r3
                r11.f128016m = r3
                r11.f128017n = r3
                r12 = 6
                r11.f128018o = r12
                java.lang.Object r12 = TJ.C16534i.x(r8, r9, r11)
                if (r12 != r0) goto L_0x0194
                return r0
            L_0x0152:
                kotlin.jvm.internal.K r1 = new kotlin.jvm.internal.K
                r1.<init>()
                r1.f144344a = r2
                lx.a r2 = r4.f127990b
                TJ.g r2 = r2.b()
                jx.a$c$c r5 = new jx.a$c$c
                r5.<init>(r2, r4, r1, r12)
                jx.a$c$a r9 = new jx.a$c$a
                r10 = 0
                r9.<init>(r1, r10)
                TJ.g r5 = TJ.C16534i.R(r5, r9)
                r11.f128019p = r8
                r11.f128006c = r7
                r11.f128007d = r6
                r11.f128008e = r4
                r11.f128009f = r4
                r11.f128010g = r12
                r11.f128011h = r1
                r11.f128012i = r2
                r11.f128013j = r2
                r11.f128014k = r3
                r11.f128015l = r3
                r11.f128016m = r3
                r11.f128017n = r3
                r12 = 7
                r11.f128018o = r12
                java.lang.Object r12 = TJ.C16534i.x(r8, r5, r11)
                if (r12 != r0) goto L_0x0194
                return r0
            L_0x0194:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: jx.C14653a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.prepaidcarddata.impl.data.GiftCardRepositoryImpl", f = "GiftCardRepositoryImpl.kt", l = {97, 99}, m = "refreshPrepaidCards")
    /* renamed from: jx.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f128041c;

        /* renamed from: d  reason: collision with root package name */
        Object f128042d;

        /* renamed from: e  reason: collision with root package name */
        Object f128043e;

        /* renamed from: f  reason: collision with root package name */
        Object f128044f;

        /* renamed from: g  reason: collision with root package name */
        int f128045g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f128046h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14653a f128047i;

        /* renamed from: j  reason: collision with root package name */
        int f128048j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C14653a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f128047i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128046h = obj;
            this.f128048j |= Integer.MIN_VALUE;
            return this.f128047i.k(this);
        }
    }

    public C14653a(C14799a aVar, C14769a aVar2, C14733c cVar) {
        C17542s.j(aVar, "remoteSource");
        C17542s.j(aVar2, "localSource");
        C17542s.j(cVar, "prepaidCardMapper");
        this.f127989a = aVar;
        this.f127990b = aVar2;
        this.f127991c = cVar;
    }

    /* access modifiers changed from: private */
    public final List<ix.c> j(List<PrepaidCardRemote> list) {
        return this.f127991c.c(list);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(dI.C17164e<? super XH.C16807N> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof jx.C14653a.d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            jx.a$d r0 = (jx.C14653a.d) r0
            int r1 = r0.f128048j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128048j = r1
            goto L_0x0018
        L_0x0013:
            jx.a$d r0 = new jx.a$d
            r0.<init>(r14, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f128046h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f128048j
            r4 = 1
            r5 = 2
            if (r3 == 0) goto L_0x0053
            if (r3 == r4) goto L_0x0041
            if (r3 != r5) goto L_0x0039
            java.lang.Object r15 = r0.f128044f
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = r0.f128042d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r15 = r0.f128041c
            jx.a r15 = (jx.C14653a) r15
            XH.y.b(r1)
            goto L_0x012c
        L_0x0039:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0041:
            java.lang.Object r15 = r0.f128042d
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r3 = r0.f128041c
            jx.a r3 = (jx.C14653a) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x0066
        L_0x0053:
            XH.y.b(r1)
            mx.a r1 = r14.f127989a
            r0.f128041c = r14
            r0.f128042d = r15
            r0.f128048j = r4
            java.lang.Object r1 = r1.d(r0)
            if (r1 != r2) goto L_0x0065
            return r2
        L_0x0065:
            r3 = r14
        L_0x0066:
            java.lang.Throwable r12 = XH.x.e(r1)
            r6 = 0
            if (r12 != 0) goto L_0x0085
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            lx.a r7 = r3.f127990b
            r0.f128041c = r3
            r0.f128042d = r15
            r0.f128043e = r1
            r0.f128044f = r4
            r0.f128045g = r6
            r0.f128048j = r5
            java.lang.Object r15 = r7.a(r4, r0)
            if (r15 != r2) goto L_0x012c
            return r2
        L_0x0085:
            qv.e r15 = qv.e.DEBUG
            qv.d r0 = qv.d.f102012a
            java.util.List r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0098:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00af
            java.lang.Object r2 = r0.next()
            r7 = r2
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r15, r6)
            if (r7 == 0) goto L_0x0098
            r1.add(r2)
            goto L_0x0098
        L_0x00af:
            java.util.Iterator r0 = r1.iterator()
            r1 = 0
            r2 = r1
            r6 = r2
        L_0x00b6:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x012c
            java.lang.Object r7 = r0.next()
            qv.b r7 = (qv.C11819b) r7
            if (r2 != 0) goto L_0x00d1
            java.lang.String r2 = "Failed to refresh prepaid cards"
            java.lang.String r2 = qv.C11818a.a(r2, r12)
            if (r2 != 0) goto L_0x00cd
            goto L_0x012c
        L_0x00cd:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x00d1:
            if (r6 != 0) goto L_0x0120
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r1, r5, r1)
            r9 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r9, r1, r5, r1)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00f1
            goto L_0x00f7
        L_0x00f1:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x00f7:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r4)
            if (r8 == 0) goto L_0x010a
            java.lang.String r8 = "m"
            goto L_0x010c
        L_0x010a:
            java.lang.String r8 = "b"
        L_0x010c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
        L_0x0120:
            r13 = r6
            r9 = 0
            r6 = r7
            r7 = r15
            r8 = r13
            r10 = r12
            r11 = r2
            r6.a(r7, r8, r9, r10, r11)
            r6 = r13
            goto L_0x00b6
        L_0x012c:
            XH.N r15 = XH.C16807N.f139792a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: jx.C14653a.k(dI.e):java.lang.Object");
    }

    public Object a(String str, String str2, C17164e<? super ix.b> eVar) {
        return this.f127989a.a(str, str2, eVar);
    }

    public C16532g<C14545c> b() {
        return C16534i.H(new c(this, (C17164e<? super c>) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: dI.e<? super hx.a>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.lang.String r8, dI.C17164e<? super hx.C14543a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jx.C14653a.C3158a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            jx.a$a r0 = (jx.C14653a.C3158a) r0
            int r1 = r0.f127998i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f127998i = r1
            goto L_0x0018
        L_0x0013:
            jx.a$a r0 = new jx.a$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f127996g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f127998i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r8 = r0.f127994e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f127993d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f127992c
            jx.a r8 = (jx.C14653a) r8
            XH.y.b(r1)
            goto L_0x0090
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.f127994e
            r9 = r8
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r8 = r0.f127993d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r0.f127992c
            jx.a r3 = (jx.C14653a) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x006c
        L_0x0057:
            XH.y.b(r1)
            mx.a r1 = r7.f127989a
            r0.f127992c = r7
            r0.f127993d = r8
            r0.f127994e = r9
            r0.f127998i = r5
            java.lang.Object r1 = r1.c(r8, r0)
            if (r1 != r2) goto L_0x006b
            return r2
        L_0x006b:
            r3 = r7
        L_0x006c:
            boolean r6 = XH.x.g(r1)
            if (r6 == 0) goto L_0x0074
            r6 = 0
            goto L_0x0075
        L_0x0074:
            r6 = r1
        L_0x0075:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r6, r5)
            if (r5 == 0) goto L_0x0093
            r0.f127992c = r3
            r0.f127993d = r8
            r0.f127994e = r9
            r0.f127995f = r1
            r0.f127998i = r4
            java.lang.Object r8 = r3.k(r0)
            if (r8 != r2) goto L_0x0090
            return r2
        L_0x0090:
            hx.a$b r8 = hx.C14543a.b.f127511a
            goto L_0x009c
        L_0x0093:
            hx.a$a r8 = new hx.a$a
            java.lang.Throwable r9 = XH.x.e(r1)
            r8.<init>(r9)
        L_0x009c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jx.C14653a.c(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: dI.e<? super hx.a>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(java.lang.String r8, dI.C17164e<? super hx.C14543a> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jx.C14653a.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            jx.a$b r0 = (jx.C14653a.b) r0
            int r1 = r0.f128005i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128005i = r1
            goto L_0x0018
        L_0x0013:
            jx.a$b r0 = new jx.a$b
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f128003g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f128005i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0057
            if (r3 == r5) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r8 = r0.f128001e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f128000d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r0.f127999c
            jx.a r8 = (jx.C14653a) r8
            XH.y.b(r1)
            goto L_0x0090
        L_0x0038:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0040:
            java.lang.Object r8 = r0.f128001e
            r9 = r8
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r8 = r0.f128000d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r0.f127999c
            jx.a r3 = (jx.C14653a) r3
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            goto L_0x006c
        L_0x0057:
            XH.y.b(r1)
            mx.a r1 = r7.f127989a
            r0.f127999c = r7
            r0.f128000d = r8
            r0.f128001e = r9
            r0.f128005i = r5
            java.lang.Object r1 = r1.b(r8, r0)
            if (r1 != r2) goto L_0x006b
            return r2
        L_0x006b:
            r3 = r7
        L_0x006c:
            boolean r6 = XH.x.g(r1)
            if (r6 == 0) goto L_0x0074
            r6 = 0
            goto L_0x0075
        L_0x0074:
            r6 = r1
        L_0x0075:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r6, r5)
            if (r5 == 0) goto L_0x0093
            r0.f127999c = r3
            r0.f128000d = r8
            r0.f128001e = r9
            r0.f128002f = r1
            r0.f128005i = r4
            java.lang.Object r8 = r3.k(r0)
            if (r8 != r2) goto L_0x0090
            return r2
        L_0x0090:
            hx.a$b r8 = hx.C14543a.b.f127511a
            goto L_0x009c
        L_0x0093:
            hx.a$a r8 = new hx.a$a
            java.lang.Throwable r9 = XH.x.e(r1)
            r8.<init>(r9)
        L_0x009c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jx.C14653a.d(java.lang.String, dI.e):java.lang.Object");
    }

    public Object e(String str, C17164e<? super ix.b> eVar) {
        return this.f127989a.e(str, eVar);
    }
}
