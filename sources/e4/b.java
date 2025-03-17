package E4;

import D4.C6447v;
import D4.C6448w;
import D4.M;
import QJ.C16310i;
import QJ.Q;
import TJ.C16532g;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"", "T", "LTJ/g;", "LD4/M;", "LdI/i;", "context", "LE4/a;", "b", "(LTJ/g;LdI/i;LU0/m;II)LE4/a;", "LD4/v$c;", "a", "LD4/v$c;", "IncompleteLoadState", "LD4/w;", "LD4/w;", "InitialLoadStates", "paging-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final C6447v.c f34850a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C6448w f34851b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1", f = "LazyPagingItems.kt", l = {273, 275}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34852c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17168i f34853d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a<T> f34854e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {276}, m = "invokeSuspend")
        /* renamed from: E4.b$a$a  reason: collision with other inner class name */
        static final class C0557a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34855c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a<T> f34856d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0557a(a<T> aVar, C17164e<? super C0557a> eVar) {
                super(2, eVar);
                this.f34856d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0557a(this.f34856d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0557a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f34855c;
                if (i10 == 0) {
                    y.b(obj);
                    a<T> aVar = this.f34856d;
                    this.f34855c = 1;
                    if (aVar.e(this) == f10) {
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
        a(C17168i iVar, a<T> aVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f34853d = iVar;
            this.f34854e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f34853d, this.f34854e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34852c;
            if (i10 == 0) {
                y.b(obj);
                if (C17542s.e(this.f34853d, C17169j.f142968a)) {
                    a<T> aVar = this.f34854e;
                    this.f34852c = 1;
                    if (aVar.e(this) == f10) {
                        return f10;
                    }
                } else {
                    C17168i iVar = this.f34853d;
                    C0557a aVar2 = new C0557a(this.f34854e, (C17164e<? super C0557a>) null);
                    this.f34852c = 2;
                    if (C16310i.g(iVar, aVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2", f = "LazyPagingItems.kt", l = {283, 285}, m = "invokeSuspend")
    /* renamed from: E4.b$b  reason: collision with other inner class name */
    static final class C0558b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17168i f34858d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a<T> f34859e;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {286}, m = "invokeSuspend")
        /* renamed from: E4.b$b$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f34860c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a<T> f34861d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(a<T> aVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f34861d = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f34861d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f34860c;
                if (i10 == 0) {
                    y.b(obj);
                    a<T> aVar = this.f34861d;
                    this.f34860c = 1;
                    if (aVar.d(this) == f10) {
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
        C0558b(C17168i iVar, a<T> aVar, C17164e<? super C0558b> eVar) {
            super(2, eVar);
            this.f34858d = iVar;
            this.f34859e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C0558b(this.f34858d, this.f34859e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C0558b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34857c;
            if (i10 == 0) {
                y.b(obj);
                if (C17542s.e(this.f34858d, C17169j.f142968a)) {
                    a<T> aVar = this.f34859e;
                    this.f34857c = 1;
                    if (aVar.d(this) == f10) {
                        return f10;
                    }
                } else {
                    C17168i iVar = this.f34858d;
                    a aVar2 = new a(this.f34859e, (C17164e<? super a>) null);
                    this.f34857c = 2;
                    if (C16310i.g(iVar, aVar2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    static {
        C6447v.c cVar = new C6447v.c(false);
        f34850a = cVar;
        f34851b = new C6448w(C6447v.b.f34456b, cVar, cVar);
    }

    public static final <T> a<T> b(C16532g<M<T>> gVar, C17168i iVar, C4889m mVar, int i10, int i11) {
        C17542s.j(gVar, "<this>");
        mVar.C(388053246);
        if ((i11 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if (C4895p.J()) {
            C4895p.S(388053246, i10, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:264)");
        }
        mVar.C(1157296644);
        boolean V10 = mVar.V(gVar);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(gVar);
            mVar.u(D10);
        }
        mVar.U();
        a<T> aVar = (a) D10;
        P.g(aVar, new a(iVar, aVar, (C17164e<? super a>) null), mVar, 72);
        P.g(aVar, new C0558b(iVar, aVar, (C17164e<? super C0558b>) null), mVar, 72);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return aVar;
    }
}
