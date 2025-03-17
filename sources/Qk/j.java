package qk;

import BA.C12609a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import gB.C14503e;
import gB.C14505g;
import jB.C14613b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import pk.s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqk/j;", "", "LjB/b;", "shoppingListRepository", "LBA/a;", "shareRepository", "<init>", "(LjB/b;LBA/a;)V", "", "listId", "Lpk/s$m;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LjB/b;", "LBA/a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101669a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12609a f101670b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<s.m> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f101672b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.j$a$a  reason: collision with other inner class name */
        public static final class C2410a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101673a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f101674b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.ShareListUseCase$invoke$$inlined$map$1$2", f = "ShareListUseCase.kt", l = {64, 50}, m = "emit")
            /* renamed from: qk.j$a$a$a  reason: collision with other inner class name */
            public static final class C2411a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101675c;

                /* renamed from: d  reason: collision with root package name */
                int f101676d;

                /* renamed from: e  reason: collision with root package name */
                Object f101677e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C2410a f101678f;

                /* renamed from: g  reason: collision with root package name */
                Object f101679g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2411a(C2410a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101678f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101675c = obj;
                    this.f101676d |= Integer.MIN_VALUE;
                    return this.f101678f.emit((Object) null, this);
                }
            }

            public C2410a(C16533h hVar, j jVar) {
                this.f101673a = hVar;
                this.f101674b = jVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x00cd A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r12, dI.C17164e r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof qk.j.a.C2410a.C2411a
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    qk.j$a$a$a r0 = (qk.j.a.C2410a.C2411a) r0
                    int r1 = r0.f101676d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101676d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.j$a$a$a r0 = new qk.j$a$a$a
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.f101675c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101676d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0047
                    if (r2 == r4) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    XH.y.b(r13)
                    goto L_0x00ce
                L_0x002d:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x0035:
                    java.lang.Object r12 = r0.f101679g
                    gB.e r12 = (gB.C14503e) r12
                    java.lang.Object r2 = r0.f101677e
                    TJ.h r2 = (TJ.C16533h) r2
                    XH.y.b(r13)
                    XH.x r13 = (XH.x) r13
                    java.lang.Object r13 = r13.j()
                    goto L_0x00b2
                L_0x0047:
                    XH.y.b(r13)
                    TJ.h r2 = r11.f101673a
                    XH.v r12 = (XH.v) r12
                    java.lang.Object r13 = r12.a()
                    gB.e r13 = (gB.C14503e) r13
                    java.lang.Object r12 = r12.b()
                    java.util.List r12 = (java.util.List) r12
                    java.lang.Iterable r12 = (java.lang.Iterable) r12
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r6 = 10
                    int r6 = YH.C16877v.y(r12, r6)
                    r5.<init>(r6)
                    java.util.Iterator r12 = r12.iterator()
                L_0x006b:
                    boolean r6 = r12.hasNext()
                    if (r6 == 0) goto L_0x0096
                    java.lang.Object r6 = r12.next()
                    gB.g r6 = (gB.C14505g) r6
                    java.lang.String r7 = r6.c()
                    if (r7 == 0) goto L_0x008e
                    FA.a$a r8 = new FA.a$a
                    java.lang.String r9 = r6.b()
                    int r6 = r6.g()
                    r8.<init>(r9, r7, r6)
                    r5.add(r8)
                    goto L_0x006b
                L_0x008e:
                    java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                    java.lang.String r13 = "Item type is null"
                    r12.<init>(r13)
                    throw r12
                L_0x0096:
                    qk.j r12 = r11.f101674b
                    BA.a r12 = r12.f101670b
                    java.lang.String r6 = r13.b()
                    CA.b r7 = CA.C12683b.LIST
                    r0.f101677e = r2
                    r0.f101679g = r13
                    r0.f101676d = r4
                    java.lang.Object r12 = r12.b(r6, r5, r7, r0)
                    if (r12 != r1) goto L_0x00af
                    return r1
                L_0x00af:
                    r10 = r13
                    r13 = r12
                    r12 = r10
                L_0x00b2:
                    XH.y.b(r13)
                    java.lang.String r13 = (java.lang.String) r13
                    pk.s$m$b r4 = new pk.s$m$b
                    java.lang.String r12 = r12.b()
                    r4.<init>(r13, r12)
                    r12 = 0
                    r0.f101677e = r12
                    r0.f101679g = r12
                    r0.f101676d = r3
                    java.lang.Object r12 = r2.emit(r4, r0)
                    if (r12 != r1) goto L_0x00ce
                    return r1
                L_0x00ce:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.j.a.C2410a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, j jVar) {
            this.f101671a = gVar;
            this.f101672b = jVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101671a.collect(new C2410a(hVar, this.f101672b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LgB/e;", "list", "", "LgB/g;", "items", "LXH/v;", "<anonymous>", "(LgB/e;Ljava/util/List;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.ShareListUseCase$invoke$2", f = "ShareListUseCase.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements q<C14503e, List<? extends C14505g>, C17164e<? super v<? extends C14503e, ? extends List<? extends C14505g>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101680c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101681d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101682e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C14503e eVar, List<C14505g> list, C17164e<? super v<C14503e, ? extends List<C14505g>>> eVar2) {
            b bVar = new b(eVar2);
            bVar.f101681d = eVar;
            bVar.f101682e = list;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101680c == 0) {
                y.b(obj);
                return C16796C.a((C14503e) this.f101681d, (List) this.f101682e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lpk/s$m;", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.ShareListUseCase$invoke$4", f = "ShareListUseCase.kt", l = {56}, m = "invokeSuspend")
    static final class c extends l implements q<C16533h<? super s.m>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101683c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101684d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101685e;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super s.m> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f101684d = hVar;
            cVar.f101685e = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101683c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f101684d;
                Throwable th2 = (Throwable) this.f101685e;
                s.m.a aVar = new s.m.a(th2);
                this.f101684d = hVar;
                this.f101685e = th2;
                this.f101683c = 1;
                if (hVar.emit(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Throwable th3 = (Throwable) this.f101685e;
                C16533h hVar2 = (C16533h) this.f101684d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public j(C14613b bVar, C12609a aVar) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar, "shareRepository");
        this.f101669a = bVar;
        this.f101670b = aVar;
    }

    public final Object b(String str, C17164e<? super s.m> eVar) {
        return C16534i.B(C16534i.g(new a(C16534i.e0(C16534i.n(this.f101669a.e(str), this.f101669a.m(str), new b((C17164e<? super b>) null)), 1), this), new c((C17164e<? super c>) null)), eVar);
    }
}
