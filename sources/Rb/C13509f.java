package RB;

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
import kotlin.jvm.internal.K;
import nI.p;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "LTJ/g;", "", "periodMillis", "b", "(LTJ/g;J)LTJ/g;", "storepicker-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.f  reason: case insensitive filesystem */
public final class C13509f {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseKt$emitFirstThenThrottle$1", f = "GetStoreDataUseCase.kt", l = {182}, m = "invokeSuspend")
    /* renamed from: RB.f$a */
    static final class a extends l implements p<C16533h<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f115264c;

        /* renamed from: d  reason: collision with root package name */
        int f115265d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f115266e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f115267f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f115268g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: RB.f$a$a  reason: collision with other inner class name */
        static final class C2835a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h<T> f115269a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f115270b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f115271c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCaseKt$emitFirstThenThrottle$1$1", f = "GetStoreDataUseCase.kt", l = {183, 187}, m = "emit")
            /* renamed from: RB.f$a$a$a  reason: collision with other inner class name */
            static final class C2836a extends d {

                /* renamed from: c  reason: collision with root package name */
                Object f115272c;

                /* renamed from: d  reason: collision with root package name */
                Object f115273d;

                /* renamed from: e  reason: collision with root package name */
                Object f115274e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f115275f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C2835a<T> f115276g;

                /* renamed from: h  reason: collision with root package name */
                int f115277h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2836a(C2835a<? super T> aVar, C17164e<? super C2836a> eVar) {
                    super(eVar);
                    this.f115276g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f115275f = obj;
                    this.f115277h |= Integer.MIN_VALUE;
                    return this.f115276g.emit(null, this);
                }
            }

            C2835a(C16533h<? super T> hVar, K k10, long j10) {
                this.f115269a = hVar;
                this.f115270b = k10;
                this.f115271c = j10;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: dI.e<? super XH.N>} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r8, dI.C17164e<? super XH.C16807N> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof RB.C13509f.a.C2835a.C2836a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    RB.f$a$a$a r0 = (RB.C13509f.a.C2835a.C2836a) r0
                    int r1 = r0.f115277h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f115277h = r1
                    goto L_0x0018
                L_0x0013:
                    RB.f$a$a$a r0 = new RB.f$a$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r1 = r0.f115275f
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f115277h
                    r4 = 2
                    r5 = 1
                    if (r3 == 0) goto L_0x004b
                    if (r3 == r5) goto L_0x003c
                    if (r3 != r4) goto L_0x0034
                    java.lang.Object r8 = r0.f115274e
                    dI.e r8 = (dI.C17164e) r8
                    java.lang.Object r8 = r0.f115272c
                    RB.f$a$a r8 = (RB.C13509f.a.C2835a) r8
                    XH.y.b(r1)
                    goto L_0x007d
                L_0x0034:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003c:
                    java.lang.Object r8 = r0.f115274e
                    r9 = r8
                    dI.e r9 = (dI.C17164e) r9
                    java.lang.Object r8 = r0.f115273d
                    java.lang.Object r3 = r0.f115272c
                    RB.f$a$a r3 = (RB.C13509f.a.C2835a) r3
                    XH.y.b(r1)
                    goto L_0x0060
                L_0x004b:
                    XH.y.b(r1)
                    TJ.h<T> r1 = r7.f115269a
                    r0.f115272c = r7
                    r0.f115273d = r8
                    r0.f115274e = r9
                    r0.f115277h = r5
                    java.lang.Object r1 = r1.emit(r8, r0)
                    if (r1 != r2) goto L_0x005f
                    return r2
                L_0x005f:
                    r3 = r7
                L_0x0060:
                    kotlin.jvm.internal.K r1 = r3.f115270b
                    boolean r5 = r1.f144344a
                    if (r5 == 0) goto L_0x006c
                    r8 = 0
                    r1.f144344a = r8
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                L_0x006c:
                    long r5 = r3.f115271c
                    r0.f115272c = r3
                    r0.f115273d = r8
                    r0.f115274e = r9
                    r0.f115277h = r4
                    java.lang.Object r8 = QJ.C16297b0.b(r5, r0)
                    if (r8 != r2) goto L_0x007d
                    return r2
                L_0x007d:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: RB.C13509f.a.C2835a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16532g<? extends T> gVar, long j10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f115267f = gVar;
            this.f115268g = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f115267f, this.f115268g, eVar);
            aVar.f115266e = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f115265d;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f115266e;
                K k10 = new K();
                k10.f144344a = true;
                C16532g<T> o10 = C16534i.o(this.f115267f);
                C2835a aVar = new C2835a(hVar, k10, this.f115268g);
                this.f115266e = hVar;
                this.f115264c = k10;
                this.f115265d = 1;
                if (o10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                K k11 = (K) this.f115264c;
                C16533h hVar2 = (C16533h) this.f115266e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final <T> C16532g<T> b(C16532g<? extends T> gVar, long j10) {
        return j10 < 0 ? gVar : C16534i.H(new a(gVar, j10, (C17164e<? super a>) null));
    }
}
