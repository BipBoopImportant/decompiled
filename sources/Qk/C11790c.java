package qk;

import Kf.C9133b;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import pk.s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqk/c;", "", "LjB/b;", "shoppingListRepository", "LKf/b;", "cartApi", "<init>", "(LjB/b;LKf/b;)V", "", "listId", "Lpk/s$a;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LjB/b;", "LKf/b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.c  reason: case insensitive filesystem */
public final class C11790c {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101507a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C9133b f101508b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.c$a */
    public static final class a implements C16532g<s.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11790c f101510b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.c$a$a  reason: collision with other inner class name */
        public static final class C2398a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101511a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11790c f101512b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CopyAllItemsToCartUseCase$invoke$$inlined$map$1$2", f = "CopyAllItemsToCartUseCase.kt", l = {66, 50}, m = "emit")
            /* renamed from: qk.c$a$a$a  reason: collision with other inner class name */
            public static final class C2399a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101513c;

                /* renamed from: d  reason: collision with root package name */
                int f101514d;

                /* renamed from: e  reason: collision with root package name */
                Object f101515e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C2398a f101516f;

                /* renamed from: g  reason: collision with root package name */
                Object f101517g;

                /* renamed from: h  reason: collision with root package name */
                int f101518h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2399a(C2398a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101516f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101513c = obj;
                    this.f101514d |= Integer.MIN_VALUE;
                    return this.f101516f.emit((Object) null, this);
                }
            }

            public C2398a(C16533h hVar, C11790c cVar) {
                this.f101511a = hVar;
                this.f101512b = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2 A[LOOP:3: B:35:0x00dc->B:37:0x00e2, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x011b A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r14, dI.C17164e r15) {
                /*
                    r13 = this;
                    boolean r0 = r15 instanceof qk.C11790c.a.C2398a.C2399a
                    if (r0 == 0) goto L_0x0013
                    r0 = r15
                    qk.c$a$a$a r0 = (qk.C11790c.a.C2398a.C2399a) r0
                    int r1 = r0.f101514d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101514d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.c$a$a$a r0 = new qk.c$a$a$a
                    r0.<init>(r13, r15)
                L_0x0018:
                    java.lang.Object r15 = r0.f101513c
                    java.lang.Object r8 = eI.C17187b.f()
                    int r1 = r0.f101514d
                    r9 = 0
                    r10 = 2
                    r2 = 1
                    if (r1 == 0) goto L_0x0045
                    if (r1 == r2) goto L_0x0036
                    if (r1 != r10) goto L_0x002e
                    XH.y.b(r15)
                    goto L_0x011c
                L_0x002e:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L_0x0036:
                    int r14 = r0.f101518h
                    java.lang.Object r1 = r0.f101517g
                    java.util.List r1 = (java.util.List) r1
                    java.lang.Object r2 = r0.f101515e
                    TJ.h r2 = (TJ.C16533h) r2
                    XH.y.b(r15)
                    goto L_0x00d6
                L_0x0045:
                    XH.y.b(r15)
                    TJ.h r15 = r13.f101511a
                    java.util.List r14 = (java.util.List) r14
                    java.lang.Iterable r14 = (java.lang.Iterable) r14
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.Iterator r3 = r14.iterator()
                L_0x0057:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0074
                    java.lang.Object r4 = r3.next()
                    r5 = r4
                    gB.g r5 = (gB.C14505g) r5
                    boolean r6 = r5.e()
                    if (r6 == 0) goto L_0x0057
                    boolean r5 = r5.k()
                    if (r5 == 0) goto L_0x0057
                    r1.add(r4)
                    goto L_0x0057
                L_0x0074:
                    java.util.ArrayList r11 = new java.util.ArrayList
                    r3 = 10
                    int r3 = YH.C16877v.y(r1, r3)
                    r11.<init>(r3)
                    java.util.Iterator r1 = r1.iterator()
                L_0x0083:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L_0x00a0
                    java.lang.Object r3 = r1.next()
                    gB.g r3 = (gB.C14505g) r3
                    Kf.y r4 = new Kf.y
                    java.lang.String r5 = r3.b()
                    int r3 = r3.g()
                    r4.<init>(r5, r3)
                    r11.add(r4)
                    goto L_0x0083
                L_0x00a0:
                    java.util.Iterator r14 = r14.iterator()
                    r12 = r9
                L_0x00a5:
                    boolean r1 = r14.hasNext()
                    if (r1 == 0) goto L_0x00b7
                    java.lang.Object r1 = r14.next()
                    gB.g r1 = (gB.C14505g) r1
                    int r1 = r1.g()
                    int r12 = r12 + r1
                    goto L_0x00a5
                L_0x00b7:
                    qk.c r14 = r13.f101512b
                    Kf.b r1 = r14.f101508b
                    com.ingka.ikea.analytics.Interaction$Component r3 = com.ingka.ikea.analytics.Interaction$Component.SHOPPING_LIST_ALL_ITEMS
                    r0.f101515e = r15
                    r0.f101517g = r11
                    r0.f101518h = r12
                    r0.f101514d = r2
                    r4 = 0
                    r6 = 4
                    r7 = 0
                    r2 = r11
                    r5 = r0
                    java.lang.Object r14 = Kf.C9133b.C1020b.a(r1, r2, r3, r4, r5, r6, r7)
                    if (r14 != r8) goto L_0x00d3
                    return r8
                L_0x00d3:
                    r2 = r15
                    r1 = r11
                    r14 = r12
                L_0x00d6:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.Iterator r15 = r1.iterator()
                L_0x00dc:
                    boolean r1 = r15.hasNext()
                    if (r1 == 0) goto L_0x00ee
                    java.lang.Object r1 = r15.next()
                    Kf.y r1 = (Kf.y) r1
                    int r1 = r1.b()
                    int r9 = r9 + r1
                    goto L_0x00dc
                L_0x00ee:
                    if (r9 != r14) goto L_0x00f7
                    int r14 = ik.c.f98323O
                    IC.e r14 = IC.C13026h.a(r14)
                    goto L_0x0109
                L_0x00f7:
                    int r14 = ik.b.f98308b
                    int r15 = IC.C13020b.a(r9)
                    java.lang.Integer r1 = kotlin.coroutines.jvm.internal.b.e(r9)
                    java.lang.Object[] r1 = new java.lang.Object[]{r1}
                    IC.e r14 = IC.C13026h.d(r14, r15, r1)
                L_0x0109:
                    pk.s$a$b r15 = new pk.s$a$b
                    r15.<init>(r14)
                    r14 = 0
                    r0.f101515e = r14
                    r0.f101517g = r14
                    r0.f101514d = r10
                    java.lang.Object r14 = r2.emit(r15, r0)
                    if (r14 != r8) goto L_0x011c
                    return r8
                L_0x011c:
                    XH.N r14 = XH.C16807N.f139792a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11790c.a.C2398a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, C11790c cVar) {
            this.f101509a = gVar;
            this.f101510b = cVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101509a.collect(new C2398a(hVar, this.f101510b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lpk/s$a;", "", "throwable", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.CopyAllItemsToCartUseCase$invoke$3", f = "CopyAllItemsToCartUseCase.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: qk.c$b */
    static final class b extends l implements q<C16533h<? super s.a>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101519c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101520d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101521e;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super s.a> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar);
            bVar.f101520d = hVar;
            bVar.f101521e = th2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101519c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f101520d;
                Throwable th2 = (Throwable) this.f101521e;
                s.a.C2376a aVar = new s.a.C2376a(th2);
                this.f101520d = hVar;
                this.f101521e = th2;
                this.f101519c = 1;
                if (hVar.emit(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Throwable th3 = (Throwable) this.f101521e;
                C16533h hVar2 = (C16533h) this.f101520d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C11790c(C14613b bVar, C9133b bVar2) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(bVar2, "cartApi");
        this.f101507a = bVar;
        this.f101508b = bVar2;
    }

    public final Object b(String str, C17164e<? super s.a> eVar) {
        return C16534i.B(C16534i.g(new a(C16534i.e0(this.f101507a.m(str), 1), this), new b((C17164e<? super b>) null)), eVar);
    }
}
