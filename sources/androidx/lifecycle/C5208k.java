package androidx.lifecycle;

import QJ.Q;
import SJ.C16423B;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.r;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "LTJ/g;", "Landroidx/lifecycle/r;", "lifecycle", "Landroidx/lifecycle/r$b;", "minActiveState", "a", "(LTJ/g;Landroidx/lifecycle/r;Landroidx/lifecycle/r$b;)LTJ/g;", "lifecycle-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.k  reason: case insensitive filesystem */
public final class C5208k {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LSJ/y;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.k$a */
    static final class a extends l implements p<C16449y<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22304c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f22305d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f22306e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r.b f22307f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f22308g;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.k$a$a  reason: collision with other inner class name */
        static final class C0345a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f22309c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C16532g<T> f22310d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16449y<T> f22311e;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.k$a$a$a  reason: collision with other inner class name */
            static final class C0346a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16449y<T> f22312a;

                C0346a(C16449y<? super T> yVar) {
                    this.f22312a = yVar;
                }

                public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                    Object y10 = this.f22312a.y(t10, eVar);
                    return y10 == C17187b.f() ? y10 : C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0345a(C16532g<? extends T> gVar, C16449y<? super T> yVar, C17164e<? super C0345a> eVar) {
                super(2, eVar);
                this.f22310d = gVar;
                this.f22311e = yVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0345a(this.f22310d, this.f22311e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0345a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f22309c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<T> gVar = this.f22310d;
                    C0346a aVar = new C0346a(this.f22311e);
                    this.f22309c = 1;
                    if (gVar.collect(aVar, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, r.b bVar, C16532g<? extends T> gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f22306e = rVar;
            this.f22307f = bVar;
            this.f22308g = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f22306e, this.f22307f, this.f22308g, eVar);
            aVar.f22305d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
            return ((a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16449y yVar;
            Object f10 = C17187b.f();
            int i10 = this.f22304c;
            if (i10 == 0) {
                y.b(obj);
                C16449y yVar2 = (C16449y) this.f22305d;
                r rVar = this.f22306e;
                r.b bVar = this.f22307f;
                C0345a aVar = new C0345a(this.f22308g, yVar2, (C17164e<? super C0345a>) null);
                this.f22305d = yVar2;
                this.f22304c = 1;
                if (Q.a(rVar, bVar, aVar, this) == f10) {
                    return f10;
                }
                yVar = yVar2;
            } else if (i10 == 1) {
                yVar = (C16449y) this.f22305d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16423B.a.a(yVar, (Throwable) null, 1, (Object) null);
            return C16807N.f139792a;
        }
    }

    public static final <T> C16532g<T> a(C16532g<? extends T> gVar, r rVar, r.b bVar) {
        C17542s.j(gVar, "<this>");
        C17542s.j(rVar, "lifecycle");
        C17542s.j(bVar, "minActiveState");
        return C16534i.f(new a(rVar, bVar, gVar, (C17164e<? super a>) null));
    }

    public static /* synthetic */ C16532g b(C16532g gVar, r rVar, r.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = r.b.STARTED;
        }
        return a(gVar, rVar, bVar);
    }
}
