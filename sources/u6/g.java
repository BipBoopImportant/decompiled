package U6;

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

@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a^\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "R", "LTJ/g;", "Lkotlin/Function3;", "LTJ/h;", "LdI/e;", "", "", "transform", "a", "(LTJ/g;LnI/q;)LTJ/g;", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 5, 1})
    @f(c = "com.apollographql.apollo3.internal.FlowsKt$transformWhile$1", f = "flows.kt", l = {61}, m = "invokeSuspend")
    static final class a extends l implements p<C16533h<? super R>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40269c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40270d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f40271e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q<C16533h<? super R>, T, C17164e<? super Boolean>, Object> f40272f;

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"U6/g$a$a", "LTJ/h;", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: U6.g$a$a  reason: collision with other inner class name */
        public static final class C0661a implements C16533h<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f40273a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C16533h f40274b;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @f(c = "com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", l = {53}, m = "emit")
            /* renamed from: U6.g$a$a$a  reason: collision with other inner class name */
            public static final class C0662a extends d {

                /* renamed from: c  reason: collision with root package name */
                Object f40275c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f40276d;

                /* renamed from: e  reason: collision with root package name */
                int f40277e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C0661a f40278f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0662a(C0661a aVar, C17164e eVar) {
                    super(eVar);
                    this.f40278f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f40276d = obj;
                    this.f40277e |= Integer.MIN_VALUE;
                    return this.f40278f.emit(null, this);
                }
            }

            public C0661a(q qVar, C16533h hVar) {
                this.f40273a = qVar;
                this.f40274b = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(T r5, dI.C17164e<? super XH.C16807N> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof U6.g.a.C0661a.C0662a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    U6.g$a$a$a r0 = (U6.g.a.C0661a.C0662a) r0
                    int r1 = r0.f40277e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f40277e = r1
                    goto L_0x0018
                L_0x0013:
                    U6.g$a$a$a r0 = new U6.g$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f40276d
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f40277e
                    r3 = 1
                    if (r2 == 0) goto L_0x0035
                    if (r2 != r3) goto L_0x002d
                    java.lang.Object r5 = r0.f40275c
                    U6.g$a$a r5 = (U6.g.a.C0661a) r5
                    XH.y.b(r6)
                    goto L_0x0050
                L_0x002d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0035:
                    XH.y.b(r6)
                    nI.q r6 = r4.f40273a
                    TJ.h r2 = r4.f40274b
                    r0.f40275c = r4
                    r0.f40277e = r3
                    r3 = 6
                    kotlin.jvm.internal.C17541q.c(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.C17541q.c(r5)
                    if (r6 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    r5 = r4
                L_0x0050:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L_0x005b
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                L_0x005b:
                    U6.a r6 = new U6.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: U6.g.a.C0661a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0661a f40279a;

            public b(C0661a aVar) {
                this.f40279a = aVar;
            }

            public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                Object emit = this.f40279a.emit(t10, eVar);
                return emit == C17187b.f() ? emit : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16532g<? extends T> gVar, q<? super C16533h<? super R>, ? super T, ? super C17164e<? super Boolean>, ? extends Object> qVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f40271e = gVar;
            this.f40272f = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f40271e, this.f40272f, eVar);
            aVar.f40270d = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super R> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C0661a aVar;
            Object f10 = C17187b.f();
            int i10 = this.f40269c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<T> gVar = this.f40271e;
                C0661a aVar2 = new C0661a(this.f40272f, (C16533h) this.f40270d);
                try {
                    b bVar = new b(aVar2);
                    this.f40270d = aVar2;
                    this.f40269c = 1;
                    if (gVar.collect(bVar, this) == f10) {
                        return f10;
                    }
                } catch (a e10) {
                    e = e10;
                    aVar = aVar2;
                    e.a(aVar);
                    return C16807N.f139792a;
                }
            } else if (i10 == 1) {
                aVar = (C0661a) this.f40270d;
                try {
                    y.b(obj);
                } catch (a e11) {
                    e = e11;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final <T, R> C16532g<R> a(C16532g<? extends T> gVar, q<? super C16533h<? super R>, ? super T, ? super C17164e<? super Boolean>, ? extends Object> qVar) {
        C17542s.j(gVar, "<this>");
        C17542s.j(qVar, "transform");
        return C16534i.H(new a(gVar, qVar, (C17164e<? super a>) null));
    }
}
