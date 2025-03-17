package qk;

import FB.C12860a;
import QJ.C16304f;
import QJ.Q;
import QJ.S;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Wk.d;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.x;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.app.stockinfo.local.b;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJR\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00172\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lqk/d;", "", "LFB/a;", "localStoreSelectionRepository", "LjB/b;", "shoppingListRepository", "LWk/d;", "stockRepository", "<init>", "(LFB/a;LjB/b;LWk/d;)V", "", "", "checkedItemNumbers", "availableInOtherStoresItems", "upstreamItemNumbers", "LXH/v;", "e", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/stockinfo/network/d;", "", "g", "(Lcom/ingka/ikea/app/stockinfo/network/d;)Z", "listId", "LTJ/g;", "f", "(Ljava/lang/String;)LTJ/g;", "a", "LFB/a;", "b", "LjB/b;", "c", "LWk/d;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.d  reason: case insensitive filesystem */
public final class C11791d {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f101522a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14613b f101523b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f101524c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "LXH/v;", "", "", "<anonymous>", "(LQJ/Q;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$handleItemNumbersChanged$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {114}, m = "invokeSuspend")
    /* renamed from: qk.d$a */
    static final class a extends l implements p<Q, C17164e<? super v<? extends List<? extends String>, ? extends List<? extends String>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101525c;

        /* renamed from: d  reason: collision with root package name */
        Object f101526d;

        /* renamed from: e  reason: collision with root package name */
        Object f101527e;

        /* renamed from: f  reason: collision with root package name */
        Object f101528f;

        /* renamed from: g  reason: collision with root package name */
        Object f101529g;

        /* renamed from: h  reason: collision with root package name */
        int f101530h;

        /* renamed from: i  reason: collision with root package name */
        int f101531i;

        /* renamed from: j  reason: collision with root package name */
        int f101532j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f101533k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ List<String> f101534l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<String> f101535m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ List<String> f101536n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ C11791d f101537o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lcom/ingka/ikea/app/stockinfo/local/b$c;", "<anonymous>", "(LQJ/Q;)Lcom/ingka/ikea/app/stockinfo/local/b$c;"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$handleItemNumbersChanged$2$itemsAvailableInOtherStores$1$1", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {105}, m = "invokeSuspend")
        /* renamed from: qk.d$a$a  reason: collision with other inner class name */
        static final class C2400a extends l implements p<Q, C17164e<? super b.c>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f101538c;

            /* renamed from: d  reason: collision with root package name */
            Object f101539d;

            /* renamed from: e  reason: collision with root package name */
            Object f101540e;

            /* renamed from: f  reason: collision with root package name */
            Object f101541f;

            /* renamed from: g  reason: collision with root package name */
            int f101542g;

            /* renamed from: h  reason: collision with root package name */
            int f101543h;

            /* renamed from: i  reason: collision with root package name */
            int f101544i;

            /* renamed from: j  reason: collision with root package name */
            private /* synthetic */ Object f101545j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C11791d f101546k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f101547l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2400a(C11791d dVar, String str, C17164e<? super C2400a> eVar) {
                super(2, eVar);
                this.f101546k = dVar;
                this.f101547l = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C2400a aVar = new C2400a(this.f101546k, this.f101547l, eVar);
                aVar.f101545j = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super b.c> eVar) {
                return ((C2400a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object f10 = C17187b.f();
                int i10 = this.f101544i;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f101545j;
                    C11791d dVar = this.f101546k;
                    String str = this.f101547l;
                    x.a aVar = x.f139812b;
                    d b10 = dVar.f101524c;
                    this.f101545j = q10;
                    this.f101538c = q10;
                    this.f101539d = dVar;
                    this.f101540e = str;
                    this.f101541f = q10;
                    this.f101542g = 0;
                    this.f101543h = 0;
                    this.f101544i = 1;
                    obj = b10.d(str, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    Q q11 = (Q) this.f101541f;
                    String str2 = (String) this.f101540e;
                    C11791d dVar2 = (C11791d) this.f101539d;
                    Q q12 = (Q) this.f101538c;
                    Q q13 = (Q) this.f101545j;
                    try {
                        y.b(obj);
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        x.a aVar2 = x.f139812b;
                        obj2 = x.b(y.a(th2));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = x.b((List) obj);
                if (x.e(obj2) != null) {
                    obj2 = C16877v.n();
                }
                ArrayList arrayList = new ArrayList();
                for (com.ingka.ikea.app.stockinfo.local.a b11 : (Iterable) obj2) {
                    com.ingka.ikea.app.stockinfo.local.b b12 = b11.b();
                    if (b12 != null) {
                        arrayList.add(b12);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object next : arrayList) {
                    if (next instanceof b.c) {
                        arrayList2.add(next);
                    }
                }
                C11791d dVar3 = this.f101546k;
                for (Object next2 : arrayList2) {
                    if (dVar3.g(((b.c) next2).a().k())) {
                        return next2;
                    }
                }
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<String> list, List<String> list2, List<String> list3, C11791d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f101534l = list;
            this.f101535m = list2;
            this.f101536n = list3;
            this.f101537o = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f101534l, this.f101535m, this.f101536n, this.f101537o, eVar);
            aVar.f101533k = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super v<? extends List<String>, ? extends List<String>>> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101532j;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f101533k;
                Iterable iterable = this.f101534l;
                C11791d dVar = this.f101537o;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(C16314k.b(q10, (C17168i) null, (T) null, new C2400a(dVar, (String) it.next(), (C17164e<? super C2400a>) null), 3, (Object) null));
                }
                this.f101533k = q10;
                this.f101525c = iterable;
                this.f101526d = dVar;
                this.f101527e = iterable;
                this.f101528f = arrayList;
                this.f101529g = it;
                this.f101530h = 0;
                this.f101531i = 0;
                this.f101532j = 1;
                obj = C16304f.a(arrayList, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Iterator it2 = (Iterator) this.f101529g;
                Collection collection = (Collection) this.f101528f;
                Iterable iterable2 = (Iterable) this.f101527e;
                C11791d dVar2 = (C11791d) this.f101526d;
                Iterable iterable3 = (Iterable) this.f101525c;
                Q q11 = (Q) this.f101533k;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterable<b.c> t02 = C16877v.t0((Iterable) obj);
            ArrayList arrayList2 = new ArrayList(C16877v.y(t02, 10));
            for (b.c a10 : t02) {
                arrayList2.add(a10.a().f());
            }
            return C16796C.a(this.f101536n, C16877v.m0(C16877v.V0(this.f101535m, arrayList2)));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$$inlined$flatMapLatest$1", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: qk.d$b */
    public static final class b extends l implements q<C16533h<? super List<? extends String>>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101548c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101549d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101550e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11791d f101551f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f101552g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, C11791d dVar, String str) {
            super(3, eVar);
            this.f101551f = dVar;
            this.f101552g = str;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super List<? extends String>> hVar, String str, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar, this.f101551f, this.f101552g);
            bVar.f101549d = hVar;
            bVar.f101550e = str;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101548c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f101549d;
                String str = (String) this.f101550e;
                C16532g J10 = str == null ? C16534i.J(C16877v.n()) : C16534i.g0(C16534i.s(C16534i.Y(new g(this.f101551f.f101523b.m(this.f101552g)), C16877v.n(), new C2402d((C17164e<? super C2402d>) null))), new f((C17164e) null, this.f101551f, str));
                this.f101548c = 1;
                if (C16534i.x(hVar, J10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.d$c */
    public static final class c implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101553a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.d$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101554a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$$inlined$map$1$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.d$c$a$a  reason: collision with other inner class name */
            public static final class C2401a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101555c;

                /* renamed from: d  reason: collision with root package name */
                int f101556d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101557e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2401a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101557e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101555c = obj;
                    this.f101556d |= Integer.MIN_VALUE;
                    return this.f101557e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101554a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qk.C11791d.c.a.C2401a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qk.d$c$a$a r0 = (qk.C11791d.c.a.C2401a) r0
                    int r1 = r0.f101556d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101556d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.d$c$a$a r0 = new qk.d$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101555c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101556d
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
                    TJ.h r6 = r4.f101554a
                    EB.d r5 = (EB.C12832d) r5
                    if (r5 == 0) goto L_0x003f
                    java.lang.String r5 = r5.e()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f101556d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11791d.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f101553a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101553a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "", "accumulator", "upstreamItemNumbers"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$2$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qk.d$d  reason: collision with other inner class name */
    static final class C2402d extends l implements q<List<? extends String>, List<? extends String>, C17164e<? super List<? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101558c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101559d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101560e;

        C2402d(C17164e<? super C2402d> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(List<String> list, List<String> list2, C17164e<? super List<String>> eVar) {
            C2402d dVar = new C2402d(eVar);
            dVar.f101559d = list;
            dVar.f101560e = list2;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101558c == 0) {
                y.b(obj);
                return C16877v.m0(C16877v.V0((List) this.f101559d, (List) this.f101560e));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LXH/v;", "", "", "accumulator", "upstreamItemNumbers", "<anonymous>", "(LXH/v;Ljava/util/List;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$2$3$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {71}, m = "invokeSuspend")
    /* renamed from: qk.d$e */
    static final class e extends l implements q<v<? extends List<? extends String>, ? extends List<? extends String>>, List<? extends String>, C17164e<? super v<? extends List<? extends String>, ? extends List<? extends String>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101561c;

        /* renamed from: d  reason: collision with root package name */
        Object f101562d;

        /* renamed from: e  reason: collision with root package name */
        int f101563e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f101564f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f101565g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11791d f101566h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C11791d dVar, C17164e<? super e> eVar) {
            super(3, eVar);
            this.f101566h = dVar;
        }

        /* renamed from: i */
        public final Object invoke(v<? extends List<String>, ? extends List<String>> vVar, List<String> list, C17164e<? super v<? extends List<String>, ? extends List<String>>> eVar) {
            e eVar2 = new e(this.f101566h, eVar);
            eVar2.f101564f = vVar;
            eVar2.f101565g = list;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101563e;
            if (i10 == 0) {
                y.b(obj);
                v vVar = (v) this.f101564f;
                List list = (List) this.f101565g;
                List list2 = (List) vVar.a();
                List list3 = (List) vVar.b();
                C11791d dVar = this.f101566h;
                this.f101564f = vVar;
                this.f101565g = list;
                this.f101561c = list2;
                this.f101562d = list3;
                this.f101563e = 1;
                obj = dVar.e(list2, list3, list, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list4 = (List) this.f101562d;
                List list5 = (List) this.f101561c;
                List list6 = (List) this.f101565g;
                v vVar2 = (v) this.f101564f;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$lambda$8$$inlined$flatMapLatest$1", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: qk.d$f */
    public static final class f extends l implements q<C16533h<? super List<? extends String>>, List<? extends String>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101567c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101568d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101569e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11791d f101570f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f101571g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17164e eVar, C11791d dVar, String str) {
            super(3, eVar);
            this.f101570f = dVar;
            this.f101571g = str;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super List<? extends String>> hVar, List<? extends String> list, C17164e<? super C16807N> eVar) {
            f fVar = new f(eVar, this.f101570f, this.f101571g);
            fVar.f101568d = hVar;
            fVar.f101569e = list;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101567c;
            if (i10 == 0) {
                y.b(obj);
                i iVar = new i(C16534i.Y(C16534i.s(new h(this.f101570f.f101524c.c(this.f101571g, (List) this.f101569e))), C16796C.a(C16877v.n(), C16877v.n()), new e(this.f101570f, (C17164e<? super e>) null)));
                this.f101567c = 1;
                if (C16534i.x((C16533h) this.f101568d, iVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.d$g */
    public static final class g implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101572a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.d$g$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101573a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$lambda$8$$inlined$map$1$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.d$g$a$a  reason: collision with other inner class name */
            public static final class C2403a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101574c;

                /* renamed from: d  reason: collision with root package name */
                int f101575d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101576e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2403a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101576e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101574c = obj;
                    this.f101575d |= Integer.MIN_VALUE;
                    return this.f101576e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101573a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof qk.C11791d.g.a.C2403a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    qk.d$g$a$a r0 = (qk.C11791d.g.a.C2403a) r0
                    int r1 = r0.f101575d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101575d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.d$g$a$a r0 = new qk.d$g$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f101574c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101575d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f101573a
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r6.next()
                    gB.g r4 = (gB.C14505g) r4
                    java.lang.String r4 = r4.b()
                    r2.add(r4)
                    goto L_0x0049
                L_0x005d:
                    r0.f101575d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11791d.g.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public g(C16532g gVar) {
            this.f101572a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101572a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.d$h */
    public static final class h implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101577a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.d$h$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101578a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$lambda$8$lambda$7$$inlined$map$1$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.d$h$a$a  reason: collision with other inner class name */
            public static final class C2404a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101579c;

                /* renamed from: d  reason: collision with root package name */
                int f101580d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101581e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2404a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101581e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101579c = obj;
                    this.f101580d |= Integer.MIN_VALUE;
                    return this.f101581e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101578a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof qk.C11791d.h.a.C2404a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    qk.d$h$a$a r0 = (qk.C11791d.h.a.C2404a) r0
                    int r1 = r0.f101580d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101580d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.d$h$a$a r0 = new qk.d$h$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f101579c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101580d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x0088
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f101578a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0043:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x005c
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    Wk.f r5 = (Wk.f) r5
                    com.ingka.ikea.app.stockinfo.network.d r5 = r5.k()
                    com.ingka.ikea.app.stockinfo.network.d r6 = com.ingka.ikea.app.stockinfo.network.d.OUT_OF_STOCK
                    if (r5 != r6) goto L_0x0043
                    r2.add(r4)
                    goto L_0x0043
                L_0x005c:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r2, r4)
                    r8.<init>(r4)
                    java.util.Iterator r2 = r2.iterator()
                L_0x006b:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x007f
                    java.lang.Object r4 = r2.next()
                    Wk.f r4 = (Wk.f) r4
                    java.lang.String r4 = r4.f()
                    r8.add(r4)
                    goto L_0x006b
                L_0x007f:
                    r0.f101580d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x0088
                    return r1
                L_0x0088:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11791d.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f101577a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101577a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.d$i */
    public static final class i implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101582a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.d$i$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101583a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetAvailabilityInOtherStoresUseCase$invoke$lambda$8$lambda$7$$inlined$map$2$2", f = "GetAvailabilityInOtherStoresUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.d$i$a$a  reason: collision with other inner class name */
            public static final class C2405a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101584c;

                /* renamed from: d  reason: collision with root package name */
                int f101585d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101586e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2405a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101586e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101584c = obj;
                    this.f101585d |= Integer.MIN_VALUE;
                    return this.f101586e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101583a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qk.C11791d.i.a.C2405a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qk.d$i$a$a r0 = (qk.C11791d.i.a.C2405a) r0
                    int r1 = r0.f101585d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101585d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.d$i$a$a r0 = new qk.d$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101584c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101585d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101583a
                    XH.v r5 = (XH.v) r5
                    java.lang.Object r5 = r5.d()
                    r0.f101585d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11791d.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f101582a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101582a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11791d(C12860a aVar, C14613b bVar, d dVar) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(dVar, "stockRepository");
        this.f101522a = aVar;
        this.f101523b = bVar;
        this.f101524c = dVar;
    }

    /* access modifiers changed from: private */
    public final Object e(List<String> list, List<String> list2, List<String> list3, C17164e<? super v<? extends List<String>, ? extends List<String>>> eVar) {
        Iterable iterable = list;
        Iterable iterable2 = list3;
        List t12 = C16877v.t1(C16877v.z1(iterable, iterable2));
        List R02 = C16877v.R0(iterable2, iterable);
        return !R02.isEmpty() ? S.f(new a(R02, list2, t12, this, (C17164e<? super a>) null), eVar) : C16796C.a(t12, list2);
    }

    /* access modifiers changed from: private */
    public final boolean g(com.ingka.ikea.app.stockinfo.network.d dVar) {
        return dVar == com.ingka.ikea.app.stockinfo.network.d.HIGH_IN_STOCK || dVar == com.ingka.ikea.app.stockinfo.network.d.MEDIUM_IN_STOCK || dVar == com.ingka.ikea.app.stockinfo.network.d.LOW_IN_STOCK;
    }

    public final C16532g<List<String>> f(String str) {
        C17542s.j(str, "listId");
        return C16534i.g0(new c(this.f101522a.b()), new b((C17164e) null, this, str));
    }
}
