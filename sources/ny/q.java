package Ny;

import FB.C12860a;
import QJ.Q;
import Ry.f;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"LNy/q;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LFB/a;", "localStoreSelectionRepository", "LTy/b;", "estimatedWaitingTimeRepository", "<init>", "(LRy/f;LFB/a;LTy/b;)V", "LQJ/Q;", "coroutineScope", "LXH/N;", "c", "(LQJ/Q;LdI/e;)Ljava/lang/Object;", "a", "LRy/f;", "b", "LFB/a;", "LTy/b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final f f112709a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C12860a f112710b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Ty.b f112711c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<List<? extends Ty.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f112712a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ny.q$a$a  reason: collision with other inner class name */
        public static final class C2778a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f112713a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.UpdateOrderEstimatedWaitingTimeUseCase$invoke$$inlined$map$1$2", f = "UpdateOrderEstimatedWaitingTimeUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Ny.q$a$a$a  reason: collision with other inner class name */
            public static final class C2779a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f112714c;

                /* renamed from: d  reason: collision with root package name */
                int f112715d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2778a f112716e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2779a(C2778a aVar, C17164e eVar) {
                    super(eVar);
                    this.f112716e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f112714c = obj;
                    this.f112715d |= Integer.MIN_VALUE;
                    return this.f112716e.emit((Object) null, this);
                }
            }

            public C2778a(C16533h hVar) {
                this.f112713a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Ny.q.a.C2778a.C2779a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    Ny.q$a$a$a r0 = (Ny.q.a.C2778a.C2779a) r0
                    int r1 = r0.f112715d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f112715d = r1
                    goto L_0x0018
                L_0x0013:
                    Ny.q$a$a$a r0 = new Ny.q$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f112714c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f112715d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x0097
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f112713a
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0043:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x005a
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    rz.g r5 = (rz.C15014g) r5
                    boolean r5 = rz.J.b(r5)
                    if (r5 == 0) goto L_0x0043
                    r2.add(r4)
                    goto L_0x0043
                L_0x005a:
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r2, r4)
                    r8.<init>(r4)
                    java.util.Iterator r2 = r2.iterator()
                L_0x0069:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x008e
                    java.lang.Object r4 = r2.next()
                    rz.g r4 = (rz.C15014g) r4
                    Ty.a r5 = new Ty.a
                    com.ingka.ikea.core.model.product.ProductItem r6 = r4.g()
                    java.lang.String r6 = r6.f()
                    rz.U r4 = r4.h()
                    int r4 = r4.c()
                    r5.<init>(r6, r4)
                    r8.add(r5)
                    goto L_0x0069
                L_0x008e:
                    r0.f112715d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x0097
                    return r1
                L_0x0097:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.q.a.C2778a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f112712a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f112712a.collect(new C2778a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LTy/a;", "it", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.UpdateOrderEstimatedWaitingTimeUseCase$invoke$3", f = "UpdateOrderEstimatedWaitingTimeUseCase.kt", l = {44, 46}, m = "invokeSuspend")
    static final class b extends l implements p<List<? extends Ty.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f112717c;

        /* renamed from: d  reason: collision with root package name */
        Object f112718d;

        /* renamed from: e  reason: collision with root package name */
        Object f112719e;

        /* renamed from: f  reason: collision with root package name */
        Object f112720f;

        /* renamed from: g  reason: collision with root package name */
        Object f112721g;

        /* renamed from: h  reason: collision with root package name */
        Object f112722h;

        /* renamed from: i  reason: collision with root package name */
        Object f112723i;

        /* renamed from: j  reason: collision with root package name */
        int f112724j;

        /* renamed from: k  reason: collision with root package name */
        int f112725k;

        /* renamed from: l  reason: collision with root package name */
        int f112726l;

        /* renamed from: m  reason: collision with root package name */
        int f112727m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f112728n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ q f112729o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f112729o = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f112729o, eVar);
            bVar.f112728n = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(List<Ty.a> list, C17164e<? super C16807N> eVar) {
            return ((b) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f112727m
                r3 = 1
                r4 = 0
                r5 = 2
                if (r2 == 0) goto L_0x004e
                if (r2 == r3) goto L_0x0044
                if (r2 != r5) goto L_0x003c
                java.lang.Object r0 = r1.f112723i
                Ny.q r0 = (Ny.q) r0
                java.lang.Object r0 = r1.f112722h
                Ny.q r0 = (Ny.q) r0
                java.lang.Object r0 = r1.f112721g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f112720f
                Ny.q r0 = (Ny.q) r0
                java.lang.Object r0 = r1.f112719e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f112718d
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f112717c
                EB.d r0 = (EB.C12832d) r0
                java.lang.Object r0 = r1.f112728n
                java.util.List r0 = (java.util.List) r0
                XH.y.b(r18)     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r2 = r18
                goto L_0x009b
            L_0x0037:
                r0 = move-exception
                goto L_0x00a2
            L_0x0039:
                r0 = move-exception
                goto L_0x0162
            L_0x003c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0044:
                java.lang.Object r2 = r1.f112728n
                java.util.List r2 = (java.util.List) r2
                XH.y.b(r18)
                r6 = r18
                goto L_0x006a
            L_0x004e:
                XH.y.b(r18)
                java.lang.Object r2 = r1.f112728n
                java.util.List r2 = (java.util.List) r2
                Ny.q r6 = r1.f112729o
                FB.a r6 = r6.f112710b
                TJ.g r6 = r6.b()
                r1.f112728n = r2
                r1.f112727m = r3
                java.lang.Object r6 = TJ.C16534i.D(r6, r1)
                if (r6 != r0) goto L_0x006a
                return r0
            L_0x006a:
                EB.d r6 = (EB.C12832d) r6
                if (r6 == 0) goto L_0x0163
                java.lang.String r7 = r6.e()
                if (r7 == 0) goto L_0x0163
                Ny.q r8 = r1.f112729o
                XH.x$a r9 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                Ty.b r9 = r8.f112711c     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112728n = r2     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112717c = r6     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112718d = r7     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112719e = r7     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112720f = r8     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112721g = r7     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112722h = r8     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112723i = r8     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112724j = r4     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112725k = r4     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112726l = r4     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                r1.f112727m = r5     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                java.lang.Object r2 = r9.b(r7, r2, r1)     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                if (r2 != r0) goto L_0x009b
                return r0
            L_0x009b:
                Ty.c r2 = (Ty.c) r2     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                java.lang.Object r0 = XH.x.b(r2)     // Catch:{ CancellationException -> 0x0039, all -> 0x0037 }
                goto L_0x00ac
            L_0x00a2:
                XH.x$a r2 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x00ac:
                Ny.q r2 = r1.f112729o
                java.lang.Throwable r12 = XH.x.e(r0)
                if (r12 == 0) goto L_0x015e
                qv.e r13 = qv.e.WARN
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x00c7:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00de
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r13, r4)
                if (r9 == 0) goto L_0x00c7
                r7.add(r8)
                goto L_0x00c7
            L_0x00de:
                java.util.Iterator r4 = r7.iterator()
                r14 = 0
                r6 = r14
                r7 = r6
            L_0x00e5:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x015e
                java.lang.Object r8 = r4.next()
                qv.b r8 = (qv.C11819b) r8
                if (r6 != 0) goto L_0x00fe
                java.lang.String r6 = qv.C11818a.a(r14, r12)
                if (r6 != 0) goto L_0x00fa
                goto L_0x015e
            L_0x00fa:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x00fe:
                r15 = r6
                if (r7 != 0) goto L_0x014e
                java.lang.Class r6 = r2.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r7 = 36
                java.lang.String r7 = HJ.C15854t.s1(r6, r7, r14, r5, r14)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r14, r5, r14)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x011f
                goto L_0x0125
            L_0x011f:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r7, r6)
            L_0x0125:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r9 = "main"
                boolean r7 = HJ.C15854t.b0(r7, r9, r3)
                if (r7 == 0) goto L_0x0138
                java.lang.String r7 = "m"
                goto L_0x013a
            L_0x0138:
                java.lang.String r7 = "b"
            L_0x013a:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "|"
                r9.append(r7)
                r9.append(r6)
                java.lang.String r7 = r9.toString()
            L_0x014e:
                r16 = r7
                r9 = 0
                r6 = r8
                r7 = r13
                r8 = r16
                r10 = r12
                r11 = r15
                r6.a(r7, r8, r9, r10, r11)
                r6 = r15
                r7 = r16
                goto L_0x00e5
            L_0x015e:
                XH.x.a(r0)
                goto L_0x0163
            L_0x0162:
                throw r0
            L_0x0163:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ny.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public q(f fVar, C12860a aVar, Ty.b bVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(bVar, "estimatedWaitingTimeRepository");
        this.f112709a = fVar;
        this.f112710b = aVar;
        this.f112711c = bVar;
    }

    public final Object c(Q q10, C17164e<? super C16807N> eVar) {
        Object d02 = C16534i.d0(C16534i.R(C16534i.s(new a(this.f112709a.invoke().i())), new b(this, (C17164e<? super b>) null)), q10, eVar);
        return d02 == C17187b.f() ? d02 : C16807N.f139792a;
    }
}
