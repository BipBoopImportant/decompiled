package Yv;

import Qr.a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import Yv.o;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import yv.C8996a;
import yv.C8998c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LYv/p;", "LYv/o;", "LQr/a;", "getKreativActionListUseCase", "Lyv/a;", "membershipFeatures", "<init>", "(LQr/a;Lyv/a;)V", "LTJ/g;", "LYv/o$a;", "c", "()LTJ/g;", "", "LQr/a$a;", "actions", "d", "(Ljava/util/List;)LYv/o$a;", "invoke", "a", "LQr/a;", "b", "Lyv/a;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Qr.a f41226a;

    /* renamed from: b  reason: collision with root package name */
    private final C8996a f41227b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<o.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f41228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f41229b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Yv.p$a$a  reason: collision with other inner class name */
        public static final class C0712a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f41230a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ p f41231b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.membership.impl.usecase.GetKreativActionStateUseCaseImpl$enabledKreativFlow$$inlined$map$1$2", f = "GetKreativActionStateUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Yv.p$a$a$a  reason: collision with other inner class name */
            public static final class C0713a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f41232c;

                /* renamed from: d  reason: collision with root package name */
                int f41233d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0712a f41234e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0713a(C0712a aVar, C17164e eVar) {
                    super(eVar);
                    this.f41234e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f41232c = obj;
                    this.f41233d |= Integer.MIN_VALUE;
                    return this.f41234e.emit((Object) null, this);
                }
            }

            public C0712a(C16533h hVar, p pVar) {
                this.f41230a = hVar;
                this.f41231b = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Yv.p.a.C0712a.C0713a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Yv.p$a$a$a r0 = (Yv.p.a.C0712a.C0713a) r0
                    int r1 = r0.f41233d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f41233d = r1
                    goto L_0x0018
                L_0x0013:
                    Yv.p$a$a$a r0 = new Yv.p$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f41232c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f41233d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f41230a
                    java.util.List r5 = (java.util.List) r5
                    Yv.p r2 = r4.f41231b
                    Yv.o$a r5 = r2.d(r5)
                    r0.f41233d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Yv.p.a.C0712a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, p pVar) {
            this.f41228a = gVar;
            this.f41229b = pVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f41228a.collect(new C0712a(hVar, this.f41229b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LYv/o$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetKreativActionStateUseCaseImpl$enabledKreativFlow$2", f = "GetKreativActionStateUseCase.kt", l = {57}, m = "invokeSuspend")
    static final class b extends l implements nI.p<C16533h<? super o.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41235c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41236d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f41236d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super o.a> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41235c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f41236d;
                o.a.d dVar = o.a.d.f41225a;
                this.f41236d = hVar;
                this.f41235c = 1;
                if (hVar.emit(dVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f41236d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.usecase.GetKreativActionStateUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetKreativActionStateUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class c extends l implements q<C16533h<? super o.a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41237c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f41238d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41239e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f41240f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17164e eVar, p pVar) {
            super(3, eVar);
            this.f41240f = pVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super o.a> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar, this.f41240f);
            cVar.f41238d = hVar;
            cVar.f41239e = bool;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f41237c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f41238d;
                C16532g a10 = ((Boolean) this.f41239e).booleanValue() ? this.f41240f.c() : C16534i.J(o.a.C0711a.f41221a);
                this.f41237c = 1;
                if (C16534i.x(hVar, a10, this) == f10) {
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

    public p(Qr.a aVar, C8996a aVar2) {
        C17542s.j(aVar, "getKreativActionListUseCase");
        C17542s.j(aVar2, "membershipFeatures");
        this.f41226a = aVar;
        this.f41227b = aVar2;
    }

    /* access modifiers changed from: private */
    public final C16532g<o.a> c() {
        return C16534i.S(new a(this.f41226a.invoke(), this), new b((C17164e<? super b>) null));
    }

    /* access modifiers changed from: private */
    public final o.a d(List<a.C1771a> list) {
        a.C1771a aVar = (a.C1771a) C16877v.y0(list);
        if (aVar == null) {
            return o.a.b.f41222a;
        }
        String b10 = aVar.b();
        return b10 == null ? o.a.b.f41222a : new o.a.c(b10, aVar.a());
    }

    public C16532g<o.a> invoke() {
        return C16534i.g0(C8998c.d(this.f41227b), new c((C17164e) null, this));
    }
}
