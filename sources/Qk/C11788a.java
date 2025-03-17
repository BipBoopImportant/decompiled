package qk;

import Kf.C9133b;
import Nd.c;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import gB.C14505g;
import jB.C14613b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import pk.s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqk/a;", "", "LjB/b;", "shoppingListRepository", "LKf/b;", "cartApi", "LNd/c;", "abTesting", "<init>", "(LjB/b;LKf/b;LNd/c;)V", "", "itemNo", "listId", "Lpk/s$a;", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LjB/b;", "LKf/b;", "c", "LNd/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.a  reason: case insensitive filesystem */
public final class C11788a {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101412a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C9133b f101413b;

    /* renamed from: c  reason: collision with root package name */
    private final Nd.c f101414c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.a$a  reason: collision with other inner class name */
    public static final class C2387a implements C16532g<C14505g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101415a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f101416b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.a$a$a  reason: collision with other inner class name */
        public static final class C2388a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101417a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f101418b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.AddItemToCartUseCase$invoke$$inlined$map$1$2", f = "AddItemToCartUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.a$a$a$a  reason: collision with other inner class name */
            public static final class C2389a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101419c;

                /* renamed from: d  reason: collision with root package name */
                int f101420d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2388a f101421e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2389a(C2388a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101421e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101419c = obj;
                    this.f101420d |= Integer.MIN_VALUE;
                    return this.f101421e.emit((Object) null, this);
                }
            }

            public C2388a(C16533h hVar, String str) {
                this.f101417a = hVar;
                this.f101418b = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof qk.C11788a.C2387a.C2388a.C2389a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    qk.a$a$a$a r0 = (qk.C11788a.C2387a.C2388a.C2389a) r0
                    int r1 = r0.f101420d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101420d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.a$a$a$a r0 = new qk.a$a$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f101419c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101420d
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
                    TJ.h r8 = r6.f101417a
                    java.util.List r7 = (java.util.List) r7
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x003e:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L_0x0058
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    gB.g r4 = (gB.C14505g) r4
                    java.lang.String r4 = r4.b()
                    java.lang.String r5 = r6.f101418b
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                    if (r4 == 0) goto L_0x003e
                    goto L_0x0059
                L_0x0058:
                    r2 = 0
                L_0x0059:
                    r0.f101420d = r3
                    java.lang.Object r7 = r8.emit(r2, r0)
                    if (r7 != r1) goto L_0x0062
                    return r1
                L_0x0062:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11788a.C2387a.C2388a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2387a(C16532g gVar, String str) {
            this.f101415a = gVar;
            this.f101416b = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101415a.collect(new C2388a(hVar, this.f101416b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.a$b */
    public static final class b implements C16532g<s.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11788a f101423b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.a$b$a  reason: collision with other inner class name */
        public static final class C2390a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101424a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11788a f101425b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.AddItemToCartUseCase$invoke$$inlined$map$2$2", f = "AddItemToCartUseCase.kt", l = {55, 50}, m = "emit")
            /* renamed from: qk.a$b$a$a  reason: collision with other inner class name */
            public static final class C2391a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101426c;

                /* renamed from: d  reason: collision with root package name */
                int f101427d;

                /* renamed from: e  reason: collision with root package name */
                Object f101428e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C2390a f101429f;

                /* renamed from: g  reason: collision with root package name */
                Object f101430g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2391a(C2390a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101429f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101426c = obj;
                    this.f101427d |= Integer.MIN_VALUE;
                    return this.f101429f.emit((Object) null, this);
                }
            }

            public C2390a(C16533h hVar, C11788a aVar) {
                this.f101424a = hVar;
                this.f101425b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r12, dI.C17164e r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof qk.C11788a.b.C2390a.C2391a
                    if (r0 == 0) goto L_0x0013
                    r0 = r13
                    qk.a$b$a$a r0 = (qk.C11788a.b.C2390a.C2391a) r0
                    int r1 = r0.f101427d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101427d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.a$b$a$a r0 = new qk.a$b$a$a
                    r0.<init>(r11, r13)
                L_0x0018:
                    java.lang.Object r13 = r0.f101426c
                    java.lang.Object r8 = eI.C17187b.f()
                    int r1 = r0.f101427d
                    r9 = 2
                    r2 = 1
                    if (r1 == 0) goto L_0x0041
                    if (r1 == r2) goto L_0x0035
                    if (r1 != r9) goto L_0x002d
                    XH.y.b(r13)
                    goto L_0x00a6
                L_0x002d:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L_0x0035:
                    java.lang.Object r12 = r0.f101430g
                    gB.g r12 = (gB.C14505g) r12
                    java.lang.Object r1 = r0.f101428e
                    TJ.h r1 = (TJ.C16533h) r1
                    XH.y.b(r13)
                    goto L_0x0079
                L_0x0041:
                    XH.y.b(r13)
                    TJ.h r13 = r11.f101424a
                    gB.g r12 = (gB.C14505g) r12
                    Kf.y r1 = new Kf.y
                    java.lang.String r3 = r12.b()
                    int r4 = r12.g()
                    r1.<init>(r3, r4)
                    qk.a r3 = r11.f101425b
                    Kf.b r3 = r3.f101413b
                    java.util.List r4 = YH.C16877v.e(r1)
                    com.ingka.ikea.analytics.Interaction$Component r5 = com.ingka.ikea.analytics.Interaction$Component.SHOPPING_LIST_DETAILS
                    r0.f101428e = r13
                    r0.f101430g = r12
                    r0.f101427d = r2
                    r6 = 0
                    r7 = 4
                    r10 = 0
                    r1 = r3
                    r2 = r4
                    r3 = r5
                    r4 = r6
                    r5 = r0
                    r6 = r7
                    r7 = r10
                    java.lang.Object r1 = Kf.C9133b.C1020b.a(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 != r8) goto L_0x0078
                    return r8
                L_0x0078:
                    r1 = r13
                L_0x0079:
                    pk.s$a$b r13 = new pk.s$a$b
                    int r2 = ik.c.f98321M
                    gB.b r12 = r12.f()
                    r3 = 0
                    if (r12 == 0) goto L_0x0089
                    java.lang.String r12 = r12.f()
                    goto L_0x008a
                L_0x0089:
                    r12 = r3
                L_0x008a:
                    if (r12 != 0) goto L_0x008e
                    java.lang.String r12 = ""
                L_0x008e:
                    java.lang.Object[] r12 = new java.lang.Object[]{r12}
                    IC.e r12 = IC.C13026h.b(r2, r12)
                    r13.<init>(r12)
                    r0.f101428e = r3
                    r0.f101430g = r3
                    r0.f101427d = r9
                    java.lang.Object r12 = r1.emit(r13, r0)
                    if (r12 != r8) goto L_0x00a6
                    return r8
                L_0x00a6:
                    XH.N r12 = XH.C16807N.f139792a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11788a.b.C2390a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, C11788a aVar) {
            this.f101422a = gVar;
            this.f101423b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101422a.collect(new C2390a(hVar, this.f101423b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lpk/s$a;", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.AddItemToCartUseCase$invoke$4", f = "AddItemToCartUseCase.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: qk.a$c */
    static final class c extends l implements q<C16533h<? super s.a>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101431c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101432d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101433e;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super s.a> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f101432d = hVar;
            cVar.f101433e = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101431c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f101432d;
                Throwable th2 = (Throwable) this.f101433e;
                s.a.C2376a aVar = new s.a.C2376a(th2);
                this.f101432d = hVar;
                this.f101433e = th2;
                this.f101431c = 1;
                if (hVar.emit(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Throwable th3 = (Throwable) this.f101433e;
                C16533h hVar2 = (C16533h) this.f101432d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C11788a(C14613b bVar, C9133b bVar2, Nd.c cVar) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(bVar2, "cartApi");
        C17542s.j(cVar, "abTesting");
        this.f101412a = bVar;
        this.f101413b = bVar2;
        this.f101414c = cVar;
    }

    public final Object b(String str, String str2, C17164e<? super s.a> eVar) {
        c.a.a(this.f101414c, "sl_add_to_cart", (Map) null, (Map) null, 6, (Object) null);
        return C16534i.B(C16534i.g(new b(C16534i.e0(C16534i.A(new C2387a(this.f101412a.m(str2), str)), 1), this), new c((C17164e<? super c>) null)), eVar);
    }
}
