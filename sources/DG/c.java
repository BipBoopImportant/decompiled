package dg;

import HJ.C15854t;
import Iq.a;
import Jq.c;
import Jq.d;
import KJ.C15985a;
import Ln.g;
import Ln.h;
import Qq.k;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dg.C9625a;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tf.C10253a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010#¨\u0006%"}, d2 = {"Ldg/c;", "Ldg/b;", "LJq/c;", "familyRewardsRepository", "LLn/h;", "cartRepository", "Ltf/a;", "killSwitchRepository", "LIq/b;", "familyRewardCardMapper", "<init>", "(LJq/c;LLn/h;Ltf/a;LIq/b;)V", "LQq/k;", "LLn/c;", "discountCode", "Ldg/a;", "f", "(LQq/k;LLn/c;)Ldg/a;", "LXH/N;", "a", "(LdI/e;)Ljava/lang/Object;", "LTJ/g;", "invoke", "()LTJ/g;", "LJq/c;", "b", "LLn/h;", "c", "Ltf/a;", "d", "LIq/b;", "", "e", "LTJ/g;", "enabledFlow", "()Z", "isFamilyRewardsInCartEnabled", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C9626b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Jq.c f72421a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h f72422b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f72423c;

    /* renamed from: d  reason: collision with root package name */
    private final Iq.b f72424d;

    /* renamed from: e  reason: collision with root package name */
    private final C16532g<Boolean> f72425e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.usecase.GetFamilyRewardsForOnlineUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetFamilyRewardsForOnlineUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super C9625a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72426c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f72427d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f72428e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f72429f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, c cVar) {
            super(3, eVar);
            this.f72429f = cVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C9625a> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f72429f);
            aVar.f72427d = hVar;
            aVar.f72428e = bool;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f72426c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f72427d;
                C16532g<R> a10 = !((Boolean) this.f72428e).booleanValue() ? C16521S.a(C9625a.c.f72417a) : C16534i.n(this.f72429f.f72421a.f(c.a.CART), this.f72429f.f72422b.m(), new b(this.f72429f, (C17164e<? super b>) null));
                this.f72426c = 1;
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LJq/d;", "LQq/k;", "resource", "LLn/g;", "cart", "Ldg/a;", "<anonymous>", "(LJq/d;LLn/g;)Ldg/a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.usecase.GetFamilyRewardsForOnlineUseCaseImpl$invoke$1$1", f = "GetFamilyRewardsForOnlineUseCase.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<d<k>, g, C17164e<? super C9625a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72430c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72431d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f72432e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f72433f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(3, eVar);
            this.f72433f = cVar;
        }

        /* renamed from: i */
        public final Object invoke(d<k> dVar, g gVar, C17164e<? super C9625a> eVar) {
            b bVar = new b(this.f72433f, eVar);
            bVar.f72431d = dVar;
            bVar.f72432e = gVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C17187b.f();
            if (this.f72430c == 0) {
                y.b(obj);
                d dVar = (d) this.f72431d;
                g gVar = (g) this.f72432e;
                if (dVar instanceof d.a) {
                    obj2 = C9625a.f.f72420a;
                } else if (dVar instanceof d.b) {
                    obj2 = C9625a.b.f72416a;
                } else if (dVar instanceof d.c) {
                    obj2 = C9625a.e.f72419a;
                } else if (dVar instanceof d.C1628d) {
                    obj2 = this.f72433f.f((k) ((d.C1628d) dVar).a(), gVar != null ? gVar.a() : null);
                } else {
                    throw new t();
                }
                c cVar = this.f72433f;
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Cart family rewards state: " + obj2, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = cVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return obj2;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dg.c$c  reason: collision with other inner class name */
    public static final class C1241c implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f72434a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: dg.c$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f72435a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.impl.presentation.usecase.GetFamilyRewardsForOnlineUseCaseImpl$special$$inlined$map$1$2", f = "GetFamilyRewardsForOnlineUseCase.kt", l = {50}, m = "emit")
            /* renamed from: dg.c$c$a$a  reason: collision with other inner class name */
            public static final class C1242a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f72436c;

                /* renamed from: d  reason: collision with root package name */
                int f72437d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f72438e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1242a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f72438e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f72436c = obj;
                    this.f72437d |= Integer.MIN_VALUE;
                    return this.f72438e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f72435a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof dg.c.C1241c.a.C1242a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    dg.c$c$a$a r0 = (dg.c.C1241c.a.C1242a) r0
                    int r1 = r0.f72437d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f72437d = r1
                    goto L_0x0018
                L_0x0013:
                    dg.c$c$a$a r0 = new dg.c$c$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f72436c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f72437d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x005b
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f72435a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r6 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r6
                    r2 = 0
                    if (r6 == 0) goto L_0x0040
                    boolean r4 = r6.l()
                    goto L_0x0041
                L_0x0040:
                    r4 = r2
                L_0x0041:
                    if (r4 == 0) goto L_0x004e
                    if (r6 == 0) goto L_0x004a
                    boolean r6 = r6.m()
                    goto L_0x004b
                L_0x004a:
                    r6 = r2
                L_0x004b:
                    if (r6 == 0) goto L_0x004e
                    r2 = r3
                L_0x004e:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r0.f72437d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x005b
                    return r1
                L_0x005b:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: dg.c.C1241c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C1241c(C16532g gVar) {
            this.f72434a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f72434a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public c(Jq.c cVar, h hVar, C10253a aVar, Iq.b bVar) {
        C17542s.j(cVar, "familyRewardsRepository");
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(bVar, "familyRewardCardMapper");
        this.f72421a = cVar;
        this.f72422b = hVar;
        this.f72423c = aVar;
        this.f72424d = bVar;
        this.f72425e = new C1241c(aVar.I());
    }

    private final boolean e() {
        return this.f72423c.E();
    }

    /* access modifiers changed from: private */
    public final C9625a f(k kVar, Ln.c cVar) {
        Iterable<Qq.g> f10 = kVar.f();
        Iq.b bVar = this.f72424d;
        ArrayList arrayList = new ArrayList(C16877v.y(f10, 10));
        for (Qq.g a10 : f10) {
            arrayList.add(bVar.a(a10));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (next instanceof a.c.d) {
                arrayList2.add(next);
            }
        }
        return !arrayList2.isEmpty() ? new C9625a.C1240a(C15985a.h(arrayList2), cVar) : C9625a.d.f72418a;
    }

    public Object a(C17164e<? super C16807N> eVar) {
        if (!e()) {
            return C16807N.f139792a;
        }
        Object c10 = this.f72421a.c(c.a.CART, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public C16532g<C9625a> invoke() {
        return C16534i.g0(this.f72425e, new a((C17164e) null, this));
    }
}
