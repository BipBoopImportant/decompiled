package Cs;

import Cs.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "LTJ/g;", "LCs/h;", "a", "(LTJ/g;)LTJ/g;", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<h<? extends T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f79684a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Cs.i$a$a  reason: collision with other inner class name */
        public static final class C1485a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f79685a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.inbox.impl.util.ResourceKt$asResource$$inlined$map$1$2", f = "Resource.kt", l = {50}, m = "emit")
            /* renamed from: Cs.i$a$a$a  reason: collision with other inner class name */
            public static final class C1486a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f79686c;

                /* renamed from: d  reason: collision with root package name */
                int f79687d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1485a f79688e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1486a(C1485a aVar, C17164e eVar) {
                    super(eVar);
                    this.f79688e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f79686c = obj;
                    this.f79687d |= Integer.MIN_VALUE;
                    return this.f79688e.emit((Object) null, this);
                }
            }

            public C1485a(C16533h hVar) {
                this.f79685a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Cs.i.a.C1485a.C1486a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Cs.i$a$a$a r0 = (Cs.i.a.C1485a.C1486a) r0
                    int r1 = r0.f79687d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f79687d = r1
                    goto L_0x0018
                L_0x0013:
                    Cs.i$a$a$a r0 = new Cs.i$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f79686c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f79687d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0044
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f79685a
                    Cs.h$c r2 = new Cs.h$c
                    r2.<init>(r5)
                    r0.f79687d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0044
                    return r1
                L_0x0044:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Cs.i.a.C1485a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f79684a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f79684a.collect(new C1485a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LTJ/h;", "LCs/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.util.ResourceKt$asResource$2", f = "Resource.kt", l = {21}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super h<? extends T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79689c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f79690d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f79690d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super h<? extends T>> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f79689c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f79690d;
                h.b bVar = h.b.f79682a;
                this.f79690d = hVar;
                this.f79689c = 1;
                if (hVar.emit(bVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f79690d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "LTJ/h;", "LCs/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.util.ResourceKt$asResource$3", f = "Resource.kt", l = {24}, m = "invokeSuspend")
    static final class c extends l implements q<C16533h<? super h<? extends T>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f79691c;

        /* renamed from: d  reason: collision with root package name */
        Object f79692d;

        /* renamed from: e  reason: collision with root package name */
        Object f79693e;

        /* renamed from: f  reason: collision with root package name */
        Object f79694f;

        /* renamed from: g  reason: collision with root package name */
        Object f79695g;

        /* renamed from: h  reason: collision with root package name */
        Object f79696h;

        /* renamed from: i  reason: collision with root package name */
        Object f79697i;

        /* renamed from: j  reason: collision with root package name */
        Object f79698j;

        /* renamed from: k  reason: collision with root package name */
        int f79699k;

        /* renamed from: l  reason: collision with root package name */
        int f79700l;

        /* renamed from: m  reason: collision with root package name */
        int f79701m;

        /* renamed from: n  reason: collision with root package name */
        int f79702n;

        /* renamed from: o  reason: collision with root package name */
        int f79703o;

        /* renamed from: p  reason: collision with root package name */
        int f79704p;

        /* renamed from: q  reason: collision with root package name */
        private /* synthetic */ Object f79705q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f79706r;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super h<? extends T>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f79705q = hVar;
            cVar.f79706r = th2;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f79704p
                r3 = 1
                if (r2 == 0) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r1 = r0.f79697i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f79696h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f79695g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f79694f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f79693e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f79692d
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f79691c
                TJ.h r1 = (TJ.C16533h) r1
                java.lang.Object r1 = r0.f79706r
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f79705q
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r20)
                goto L_0x012f
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                XH.y.b(r20)
                java.lang.Object r2 = r0.f79705q
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r4 = r0.f79706r
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                qv.e r11 = qv.e.DEBUG
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x005c:
                boolean r6 = r5.hasNext()
                r13 = 0
                if (r6 == 0) goto L_0x0074
                java.lang.Object r6 = r5.next()
                r7 = r6
                qv.b r7 = (qv.C11819b) r7
                boolean r7 = r7.b(r11, r13)
                if (r7 == 0) goto L_0x005c
                r12.add(r6)
                goto L_0x005c
            L_0x0074:
                java.util.Iterator r14 = r12.iterator()
                r15 = 0
                r7 = r12
                r5 = r15
                r6 = r5
            L_0x007c:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x0103
                java.lang.Object r16 = r14.next()
                r7 = r16
                qv.b r7 = (qv.C11819b) r7
                if (r5 != 0) goto L_0x009c
                java.lang.String r8 = "Exception caught in resource"
                java.lang.String r8 = qv.C11818a.a(r8, r4)
                if (r8 != 0) goto L_0x0098
                r7 = r16
                goto L_0x0103
            L_0x0098:
                java.lang.String r5 = qv.C11820c.a(r8)
            L_0x009c:
                r17 = r5
                if (r6 != 0) goto L_0x00ee
                java.lang.Class r5 = r2.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r6 = 36
                r8 = 2
                java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                r9 = 46
                java.lang.String r6 = HJ.C15854t.o1(r6, r9, r15, r8, r15)
                int r8 = r6.length()
                if (r8 != 0) goto L_0x00bf
                goto L_0x00c5
            L_0x00bf:
                java.lang.String r5 = "Kt"
                java.lang.String r5 = HJ.C15854t.P0(r6, r5)
            L_0x00c5:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r8 = "main"
                boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                if (r6 == 0) goto L_0x00d8
                java.lang.String r6 = "m"
                goto L_0x00da
            L_0x00d8:
                java.lang.String r6 = "b"
            L_0x00da:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                java.lang.String r6 = "|"
                r8.append(r6)
                r8.append(r5)
                java.lang.String r6 = r8.toString()
            L_0x00ee:
                r18 = r6
                r8 = 0
                r5 = r7
                r6 = r11
                r7 = r18
                r9 = r4
                r10 = r17
                r5.a(r6, r7, r8, r9, r10)
                r7 = r16
                r5 = r17
                r6 = r18
                goto L_0x007c
            L_0x0103:
                Cs.h$a r8 = new Cs.h$a
                r8.<init>(r4)
                r0.f79705q = r2
                r0.f79706r = r4
                r0.f79691c = r2
                r0.f79692d = r2
                r0.f79693e = r11
                r0.f79694f = r5
                r0.f79695g = r6
                r0.f79696h = r12
                r0.f79697i = r14
                r0.f79698j = r7
                r0.f79699k = r13
                r0.f79700l = r13
                r0.f79701m = r13
                r0.f79702n = r13
                r0.f79703o = r13
                r0.f79704p = r3
                java.lang.Object r2 = r2.emit(r8, r0)
                if (r2 != r1) goto L_0x012f
                return r1
            L_0x012f:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Cs.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> C16532g<h<T>> a(C16532g<? extends T> gVar) {
        C17542s.j(gVar, "<this>");
        return C16534i.g(C16534i.S(new a(gVar), new b((C17164e<? super b>) null)), new c((C17164e<? super c>) null));
    }
}
