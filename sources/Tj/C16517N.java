package TJ;

import XH.C16807N;
import XH.C16820k;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.K;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LTJ/N;", "LTJ/L;", "<init>", "()V", "LTJ/P;", "", "subscriptionCount", "LTJ/g;", "LTJ/J;", "a", "(LTJ/P;)LTJ/g;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: TJ.N  reason: case insensitive filesystem */
final class C16517N implements C16515L {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LTJ/J;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: TJ.N$a */
    static final class a extends l implements p<C16533h<? super C16513J>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138574c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f138575d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16519P<Integer> f138576e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TJ.N$a$a  reason: collision with other inner class name */
        static final class C3383a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ K f138577a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16533h<C16513J> f138578b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            /* renamed from: TJ.N$a$a$a  reason: collision with other inner class name */
            static final class C3384a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f138579c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C3383a<T> f138580d;

                /* renamed from: e  reason: collision with root package name */
                int f138581e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C3384a(C3383a<? super T> aVar, C17164e<? super C3384a> eVar) {
                    super(eVar);
                    this.f138580d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f138579c = obj;
                    this.f138581e |= Integer.MIN_VALUE;
                    return this.f138580d.c(0, this);
                }
            }

            C3383a(K k10, C16533h<? super C16513J> hVar) {
                this.f138577a = k10;
                this.f138578b = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object c(int r5, dI.C17164e<? super XH.C16807N> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof TJ.C16517N.a.C3383a.C3384a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    TJ.N$a$a$a r0 = (TJ.C16517N.a.C3383a.C3384a) r0
                    int r1 = r0.f138581e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f138581e = r1
                    goto L_0x0018
                L_0x0013:
                    TJ.N$a$a$a r0 = new TJ.N$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f138579c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f138581e
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    if (r5 <= 0) goto L_0x004e
                    kotlin.jvm.internal.K r5 = r4.f138577a
                    boolean r6 = r5.f144344a
                    if (r6 != 0) goto L_0x004e
                    r5.f144344a = r3
                    TJ.h<TJ.J> r5 = r4.f138578b
                    TJ.J r6 = TJ.C16513J.START
                    r0.f138581e = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                L_0x004e:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: TJ.C16517N.a.C3383a.c(int, dI.e):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                return c(((Number) obj).intValue(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16519P<Integer> p10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f138576e = p10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f138576e, eVar);
            aVar.f138575d = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super C16513J> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f138574c;
            if (i10 == 0) {
                y.b(obj);
                K k10 = new K();
                C16519P<Integer> p10 = this.f138576e;
                C3383a aVar = new C3383a(k10, (C16533h) this.f138575d);
                this.f138574c = 1;
                if (p10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    public C16532g<C16513J> a(C16519P<Integer> p10) {
        return C16534i.H(new a(p10, (C17164e<? super a>) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
