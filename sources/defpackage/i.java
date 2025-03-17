package defpackage;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.v;
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

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "LTJ/g;", "", "interval", "LXH/v;", "b", "(LTJ/g;J)LTJ/g;", "a", "(J)LTJ/g;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: i  reason: default package */
public final class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "TimerKt$timerFlow$1", f = "Timer.kt", l = {35, 36}, m = "invokeSuspend")
    /* renamed from: i$a */
    static final class a extends l implements p<C16533h<? super Long>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        long f53057c;

        /* renamed from: d  reason: collision with root package name */
        int f53058d;

        /* renamed from: e  reason: collision with root package name */
        int f53059e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f53060f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f53061g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(long j10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f53061g = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f53061g, eVar);
            aVar.f53060f = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super Long> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f53059e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                long r4 = r10.f53057c
                java.lang.Object r1 = r10.f53060f
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r11)
            L_0x0017:
                r11 = r1
                goto L_0x0069
            L_0x0019:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0021:
                int r1 = r10.f53058d
                long r4 = r10.f53057c
                java.lang.Object r6 = r10.f53060f
                TJ.h r6 = (TJ.C16533h) r6
                XH.y.b(r11)
                r9 = r6
                r6 = r1
                r1 = r9
                goto L_0x0058
            L_0x0030:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f53060f
                TJ.h r11 = (TJ.C16533h) r11
                r4 = 0
            L_0x0039:
                dI.i r1 = r10.getContext()
                boolean r1 = QJ.I0.p(r1)
                if (r1 == 0) goto L_0x006d
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.b.f(r4)
                r10.f53060f = r11
                r10.f53057c = r4
                r6 = 0
                r10.f53058d = r6
                r10.f53059e = r3
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L_0x0057
                return r0
            L_0x0057:
                r1 = r11
            L_0x0058:
                long r7 = r10.f53061g
                r10.f53060f = r1
                r10.f53057c = r4
                r10.f53058d = r6
                r10.f53059e = r2
                java.lang.Object r11 = QJ.C16297b0.b(r7, r10)
                if (r11 != r0) goto L_0x0017
                return r0
            L_0x0069:
                long r6 = r10.f53061g
                long r4 = r4 + r6
                goto L_0x0039
            L_0x006d:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "TimerKt$withTimer$$inlined$flatMapLatest$1", f = "Timer.kt", l = {193}, m = "invokeSuspend")
    /* renamed from: i$b */
    public static final class b extends l implements q<C16533h<? super v<? extends T, ? extends Long>>, T, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f53062c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f53063d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f53064e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f53065f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, long j10) {
            super(3, eVar);
            this.f53065f = j10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super v<? extends T, ? extends Long>> hVar, T t10, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar, this.f53065f);
            bVar.f53063d = hVar;
            bVar.f53064e = t10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f53062c;
            if (i10 == 0) {
                y.b(obj);
                c cVar = new c(i.a(this.f53065f), this.f53064e);
                this.f53062c = 1;
                if (C16534i.x((C16533h) this.f53063d, cVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: i$c */
    public static final class c implements C16532g<v<? extends T, ? extends Long>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f53066a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f53067b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        /* renamed from: i$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f53068a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f53069b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "TimerKt$withTimer$lambda$1$$inlined$map$1$2", f = "Timer.kt", l = {223}, m = "emit")
            /* renamed from: i$c$a$a  reason: collision with other inner class name */
            public static final class C0854a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f53070c;

                /* renamed from: d  reason: collision with root package name */
                int f53071d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f53072e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0854a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f53072e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f53070c = obj;
                    this.f53071d |= Integer.MIN_VALUE;
                    return this.f53072e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, Object obj) {
                this.f53068a = hVar;
                this.f53069b = obj;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof defpackage.i.c.a.C0854a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    i$c$a$a r0 = (defpackage.i.c.a.C0854a) r0
                    int r1 = r0.f53071d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f53071d = r1
                    goto L_0x0018
                L_0x0013:
                    i$c$a$a r0 = new i$c$a$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.f53070c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f53071d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r8)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0031:
                    XH.y.b(r8)
                    TJ.h r8 = r6.f53068a
                    java.lang.Number r7 = (java.lang.Number) r7
                    long r4 = r7.longValue()
                    java.lang.Object r7 = r6.f53069b
                    java.lang.Long r2 = kotlin.coroutines.jvm.internal.b.f(r4)
                    XH.v r7 = XH.C16796C.a(r7, r2)
                    r0.f53071d = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r7 = XH.C16807N.f139792a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.i.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, Object obj) {
            this.f53066a = gVar;
            this.f53067b = obj;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f53066a.collect(new a(hVar, this.f53067b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public static final C16532g<Long> a(long j10) {
        return C16534i.H(new a(j10, (C17164e<? super a>) null));
    }

    public static final <T> C16532g<v<T, Long>> b(C16532g<? extends T> gVar, long j10) {
        C17542s.j(gVar, "<this>");
        return C16534i.g0(gVar, new b((C17164e) null, j10));
    }
}
