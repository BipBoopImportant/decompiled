package mk;

import HJ.C15854t;
import KJ.C15987c;
import KJ.C15989e;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import ok.C11682a;
import ok.C11683b;
import pk.o;
import pk.r;
import pk.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H@¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lmk/a;", "", "Lok/a;", "getListContentRecommendationsUseCase", "Lok/b;", "getRecommendedForYouCarouselUseCase", "<init>", "(Lok/a;Lok/b;)V", "", "listId", "Lkotlin/Function0;", "Lpk/s;", "state", "LTJ/g;", "Lkotlin/Function1;", "e", "(Ljava/lang/String;LnI/a;)LTJ/g;", "f", "(LnI/a;)LTJ/g;", "LXH/N;", "i", "()V", "h", "(LdI/e;)Ljava/lang/Object;", "g", "a", "Lok/a;", "b", "Lok/b;", "LTJ/B;", "", "c", "LTJ/B;", "inspirationModeSeen", "LTJ/A;", "d", "LTJ/A;", "inspirationRetryFlow", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mk.a  reason: case insensitive filesystem */
public final class C11577a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11682a f99531a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11683b f99532b;

    /* renamed from: c  reason: collision with root package name */
    private final C16505B<Boolean> f99533c = C16521S.a(Boolean.FALSE);

    /* renamed from: d  reason: collision with root package name */
    private final C16504A<C16807N> f99534d = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$a  reason: collision with other inner class name */
    public static final class C2280a implements C16532g<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f99535a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a f99536b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mk.a$a$a  reason: collision with other inner class name */
        public static final class C2281a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f99537a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17631a f99538b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getComplementListCarousel$$inlined$filter$1$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: mk.a$a$a$a  reason: collision with other inner class name */
            public static final class C2282a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f99539c;

                /* renamed from: d  reason: collision with root package name */
                int f99540d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2281a f99541e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2282a(C2281a aVar, C17164e eVar) {
                    super(eVar);
                    this.f99541e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f99539c = obj;
                    this.f99540d |= Integer.MIN_VALUE;
                    return this.f99541e.emit((Object) null, this);
                }
            }

            public C2281a(C16533h hVar, C17631a aVar) {
                this.f99537a = hVar;
                this.f99538b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mk.C11577a.C2280a.C2281a.C2282a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    mk.a$a$a$a r0 = (mk.C11577a.C2280a.C2281a.C2282a) r0
                    int r1 = r0.f99540d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f99540d = r1
                    goto L_0x0018
                L_0x0013:
                    mk.a$a$a$a r0 = new mk.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f99539c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f99540d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0060
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f99537a
                    r2 = r5
                    XH.N r2 = (XH.C16807N) r2
                    nI.a r2 = r4.f99538b
                    java.lang.Object r2 = r2.invoke()
                    pk.s r2 = (pk.s) r2
                    pk.s$d r2 = r2.g()
                    if (r2 == 0) goto L_0x0057
                    nI.a r2 = r4.f99538b
                    java.lang.Object r2 = r2.invoke()
                    pk.s r2 = (pk.s) r2
                    pk.s$d r2 = r2.g()
                    boolean r2 = r2 instanceof pk.s.d.b
                    if (r2 == 0) goto L_0x0060
                L_0x0057:
                    r0.f99540d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mk.C11577a.C2280a.C2281a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2280a(C16532g gVar, C17631a aVar) {
            this.f99535a = gVar;
            this.f99536b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f99535a.collect(new C2281a(hVar, this.f99536b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getComplementListCarousel$$inlined$flatMapLatest$1", f = "ShoppingListRecommendationsOrchestrator.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: mk.a$b */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super C17642l<? super s, ? extends s>>, C16807N, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99542c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99543d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99544e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11577a f99545f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f99546g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, C11577a aVar, String str) {
            super(3, eVar);
            this.f99545f = aVar;
            this.f99546g = str;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C17642l<? super s, ? extends s>> hVar, C16807N n10, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar, this.f99545f, this.f99546g);
            bVar.f99543d = hVar;
            bVar.f99544e = n10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99542c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99543d;
                C16807N n10 = (C16807N) this.f99544e;
                C11577a aVar = this.f99545f;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Loading new list based recommendations", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                f fVar = new f(C16534i.S(this.f99545f.f99531a.e(this.f99546g), new d((C17164e<? super d>) null)));
                this.f99542c = 1;
                if (C16534i.x(hVar, fVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getComplementListCarousel$1", f = "ShoppingListRecommendationsOrchestrator.kt", l = {68}, m = "invokeSuspend")
    /* renamed from: mk.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99547c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99548d;

        c(C17164e<? super c> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(eVar);
            cVar.f99548d = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, C17164e<? super C16807N> eVar) {
            return ((c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99547c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99548d;
                C16807N n10 = C16807N.f139792a;
                this.f99548d = hVar;
                this.f99547c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f99548d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lpk/s$d;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getComplementListCarousel$3$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: mk.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super s.d>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99549c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99550d;

        d(C17164e<? super d> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(eVar);
            dVar.f99550d = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super s.d> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99549c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99550d;
                s.d.c cVar = s.d.c.f101075a;
                this.f99550d = hVar;
                this.f99549c = 1;
                if (hVar.emit(cVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f99550d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$e */
    static final class e implements C17642l<s, s> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.d f99551a;

        e(s.d dVar) {
            this.f99551a = dVar;
        }

        /* renamed from: a */
        public final s invoke(s sVar) {
            C17542s.j(sVar, "it");
            return s.b(sVar, (pk.k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (pk.j) null, (pk.n) null, (pk.q) null, (pk.m) null, (o) null, (C15987c) null, (pk.l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, this.f99551a, (s.b) null, 1610612735, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$f */
    public static final class f implements C16532g<C17642l<? super s, ? extends s>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f99552a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mk.a$f$a  reason: collision with other inner class name */
        public static final class C2283a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f99553a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getComplementListCarousel$lambda$5$$inlined$map$1$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: mk.a$f$a$a  reason: collision with other inner class name */
            public static final class C2284a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f99554c;

                /* renamed from: d  reason: collision with root package name */
                int f99555d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2283a f99556e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2284a(C2283a aVar, C17164e eVar) {
                    super(eVar);
                    this.f99556e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f99554c = obj;
                    this.f99555d |= Integer.MIN_VALUE;
                    return this.f99556e.emit((Object) null, this);
                }
            }

            public C2283a(C16533h hVar) {
                this.f99553a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mk.C11577a.f.C2283a.C2284a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    mk.a$f$a$a r0 = (mk.C11577a.f.C2283a.C2284a) r0
                    int r1 = r0.f99555d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f99555d = r1
                    goto L_0x0018
                L_0x0013:
                    mk.a$f$a$a r0 = new mk.a$f$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f99554c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f99555d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0046
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f99553a
                    pk.s$d r5 = (pk.s.d) r5
                    mk.a$e r2 = new mk.a$e
                    r2.<init>(r5)
                    r0.f99555d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0046
                    return r1
                L_0x0046:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mk.C11577a.f.C2283a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar) {
            this.f99552a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f99552a.collect(new C2283a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$g */
    public static final class g implements C16532g<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f99557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a f99558b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mk.a$g$a  reason: collision with other inner class name */
        public static final class C2285a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f99559a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17631a f99560b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getRecommendedForYouCarousel$$inlined$filter$1$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: mk.a$g$a$a  reason: collision with other inner class name */
            public static final class C2286a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f99561c;

                /* renamed from: d  reason: collision with root package name */
                int f99562d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2285a f99563e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2286a(C2285a aVar, C17164e eVar) {
                    super(eVar);
                    this.f99563e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f99561c = obj;
                    this.f99562d |= Integer.MIN_VALUE;
                    return this.f99563e.emit((Object) null, this);
                }
            }

            public C2285a(C16533h hVar, C17631a aVar) {
                this.f99559a = hVar;
                this.f99560b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mk.C11577a.g.C2285a.C2286a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    mk.a$g$a$a r0 = (mk.C11577a.g.C2285a.C2286a) r0
                    int r1 = r0.f99562d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f99562d = r1
                    goto L_0x0018
                L_0x0013:
                    mk.a$g$a$a r0 = new mk.a$g$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f99561c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f99562d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0060
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f99559a
                    r2 = r5
                    XH.N r2 = (XH.C16807N) r2
                    nI.a r2 = r4.f99560b
                    java.lang.Object r2 = r2.invoke()
                    pk.s r2 = (pk.s) r2
                    pk.s$h r2 = r2.w()
                    if (r2 == 0) goto L_0x0057
                    nI.a r2 = r4.f99560b
                    java.lang.Object r2 = r2.invoke()
                    pk.s r2 = (pk.s) r2
                    pk.s$h r2 = r2.w()
                    boolean r2 = r2 instanceof pk.s.h.b
                    if (r2 == 0) goto L_0x0060
                L_0x0057:
                    r0.f99562d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mk.C11577a.g.C2285a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar, C17631a aVar) {
            this.f99557a = gVar;
            this.f99558b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f99557a.collect(new C2285a(hVar, this.f99558b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getRecommendedForYouCarousel$$inlined$flatMapLatest$1", f = "ShoppingListRecommendationsOrchestrator.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: mk.a$h */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super C17642l<? super s, ? extends s>>, C16807N, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99564c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99565d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99566e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11577a f99567f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17164e eVar, C11577a aVar) {
            super(3, eVar);
            this.f99567f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C17642l<? super s, ? extends s>> hVar, C16807N n10, C17164e<? super C16807N> eVar) {
            h hVar2 = new h(eVar, this.f99567f);
            hVar2.f99565d = hVar;
            hVar2.f99566e = n10;
            return hVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99564c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99565d;
                C16807N n10 = (C16807N) this.f99566e;
                C11577a aVar = this.f99567f;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Loading new recommendations", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                l lVar = new l(C16534i.S(this.f99567f.f99532b.d(), new j((C17164e<? super j>) null)));
                this.f99564c = 1;
                if (C16534i.x(hVar, lVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getRecommendedForYouCarousel$1", f = "ShoppingListRecommendationsOrchestrator.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: mk.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99568c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99569d;

        i(C17164e<? super i> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(eVar);
            iVar.f99569d = obj;
            return iVar;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, C17164e<? super C16807N> eVar) {
            return ((i) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99568c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99569d;
                C16807N n10 = C16807N.f139792a;
                this.f99569d = hVar;
                this.f99568c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f99569d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lpk/s$h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getRecommendedForYouCarousel$3$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: mk.a$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super s.h>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99570c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99571d;

        j(C17164e<? super j> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(eVar);
            jVar.f99571d = obj;
            return jVar;
        }

        public final Object invoke(C16533h<? super s.h> hVar, C17164e<? super C16807N> eVar) {
            return ((j) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99570c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99571d;
                s.h.c cVar = s.h.c.f101101a;
                this.f99571d = hVar;
                this.f99570c = 1;
                if (hVar.emit(cVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f99571d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$k */
    static final class k implements C17642l<s, s> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.h f99572a;

        k(s.h hVar) {
            this.f99572a = hVar;
        }

        /* renamed from: a */
        public final s invoke(s sVar) {
            C17542s.j(sVar, "it");
            return s.b(sVar, (pk.k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (pk.j) null, (pk.n) null, (pk.q) null, (pk.m) null, (o) null, (C15987c) null, (pk.l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, this.f99572a, (s.d) null, (s.b) null, 1879048191, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$l */
    public static final class l implements C16532g<C17642l<? super s, ? extends s>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f99573a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mk.a$l$a  reason: collision with other inner class name */
        public static final class C2287a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f99574a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$getRecommendedForYouCarousel$lambda$9$$inlined$map$1$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: mk.a$l$a$a  reason: collision with other inner class name */
            public static final class C2288a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f99575c;

                /* renamed from: d  reason: collision with root package name */
                int f99576d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2287a f99577e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2288a(C2287a aVar, C17164e eVar) {
                    super(eVar);
                    this.f99577e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f99575c = obj;
                    this.f99576d |= Integer.MIN_VALUE;
                    return this.f99577e.emit((Object) null, this);
                }
            }

            public C2287a(C16533h hVar) {
                this.f99574a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mk.C11577a.l.C2287a.C2288a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    mk.a$l$a$a r0 = (mk.C11577a.l.C2287a.C2288a) r0
                    int r1 = r0.f99576d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f99576d = r1
                    goto L_0x0018
                L_0x0013:
                    mk.a$l$a$a r0 = new mk.a$l$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f99575c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f99576d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0046
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f99574a
                    pk.s$h r5 = (pk.s.h) r5
                    mk.a$k r2 = new mk.a$k
                    r2.<init>(r5)
                    r0.f99576d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0046
                    return r1
                L_0x0046:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mk.C11577a.l.C2287a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar) {
            this.f99573a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f99573a.collect(new C2287a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.a$m */
    public static final class m implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f99578a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mk.a$m$a  reason: collision with other inner class name */
        public static final class C2289a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f99579a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$loadRecommendations$$inlined$filter$1$2", f = "ShoppingListRecommendationsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: mk.a$m$a$a  reason: collision with other inner class name */
            public static final class C2290a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f99580c;

                /* renamed from: d  reason: collision with root package name */
                int f99581d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2289a f99582e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2290a(C2289a aVar, C17164e eVar) {
                    super(eVar);
                    this.f99582e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f99580c = obj;
                    this.f99581d |= Integer.MIN_VALUE;
                    return this.f99582e.emit((Object) null, this);
                }
            }

            public C2289a(C16533h hVar) {
                this.f99579a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mk.C11577a.m.C2289a.C2290a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    mk.a$m$a$a r0 = (mk.C11577a.m.C2289a.C2290a) r0
                    int r1 = r0.f99581d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f99581d = r1
                    goto L_0x0018
                L_0x0013:
                    mk.a$m$a$a r0 = new mk.a$m$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f99580c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f99581d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f99579a
                    r2 = r5
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0048
                    r0.f99581d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mk.C11577a.m.C2289a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar) {
            this.f99578a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f99578a.collect(new C2289a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.inspiration.presentation.ShoppingListRecommendationsOrchestrator$loadRecommendations$$inlined$flatMapLatest$1", f = "ShoppingListRecommendationsOrchestrator.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: mk.a$n */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super C17642l<? super s, ? extends s>>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99583c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99584d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99585e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11577a f99586f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f99587g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a f99588h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(C17164e eVar, C11577a aVar, String str, C17631a aVar2) {
            super(3, eVar);
            this.f99586f = aVar;
            this.f99587g = str;
            this.f99588h = aVar2;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C17642l<? super s, ? extends s>> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            n nVar = new n(eVar, this.f99586f, this.f99587g, this.f99588h);
            nVar.f99584d = hVar;
            nVar.f99585e = bool;
            return nVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99583c;
            if (i10 == 0) {
                y.b(obj);
                ((Boolean) this.f99585e).booleanValue();
                C16532g P10 = C16534i.P(this.f99586f.e(this.f99587g, this.f99588h), this.f99586f.f(this.f99588h));
                this.f99583c = 1;
                if (C16534i.x((C16533h) this.f99584d, P10, this) == f10) {
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

    public C11577a(C11682a aVar, C11683b bVar) {
        C17542s.j(aVar, "getListContentRecommendationsUseCase");
        C17542s.j(bVar, "getRecommendedForYouCarouselUseCase");
        this.f99531a = aVar;
        this.f99532b = bVar;
    }

    /* access modifiers changed from: private */
    public final C16532g<C17642l<s, s>> e(String str, C17631a<s> aVar) {
        return C16534i.g0(new C2280a(C16534i.T(this.f99534d, new c((C17164e<? super c>) null)), aVar), new b((C17164e) null, this, str));
    }

    /* access modifiers changed from: private */
    public final C16532g<C17642l<s, s>> f(C17631a<s> aVar) {
        return C16534i.g0(new g(C16534i.T(this.f99534d, new i((C17164e<? super i>) null)), aVar), new h((C17164e) null, this));
    }

    public final C16532g<C17642l<s, s>> g(String str, C17631a<s> aVar) {
        C17542s.j(str, "listId");
        C17542s.j(aVar, "state");
        return C16534i.g0(new m(this.f99533c), new n((C17164e) null, this, str, aVar));
    }

    public final Object h(C17164e<? super C16807N> eVar) {
        C16504A<C16807N> a10 = this.f99534d;
        C16807N n10 = C16807N.f139792a;
        Object emit = a10.emit(n10, eVar);
        return emit == C17187b.f() ? emit : n10;
    }

    public final void i() {
        this.f99533c.setValue(Boolean.TRUE);
    }
}
