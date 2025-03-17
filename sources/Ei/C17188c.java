package eI;

import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001ag\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0001*$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H\u0001¢\u0006\u0004\b\f\u0010\r\u001aW\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"R", "T", "Lkotlin/Function2;", "LdI/e;", "", "receiver", "completion", "d", "(LnI/p;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "e", "(LnI/q;Ljava/lang/Object;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "LXH/N;", "a", "(LnI/p;Ljava/lang/Object;LdI/e;)LdI/e;", "c", "(LdI/e;)LdI/e;", "b", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: eI.c  reason: case insensitive filesystem */
class C17188c {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"eI/c$a", "Lkotlin/coroutines/jvm/internal/j;", "LXH/x;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eI.c$a */
    public static final class a extends j {

        /* renamed from: c  reason: collision with root package name */
        private int f143000c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f143001d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f143002e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, p pVar, Object obj) {
            super(eVar);
            this.f143001d = pVar;
            this.f143002e = obj;
            C17542s.h(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f143000c;
            if (i10 == 0) {
                this.f143000c = 1;
                y.b(obj);
                C17542s.h(this.f143001d, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) W.g(this.f143001d, 2)).invoke(this.f143002e, this);
            } else if (i10 == 1) {
                this.f143000c = 2;
                y.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"eI/c$b", "Lkotlin/coroutines/jvm/internal/d;", "LXH/x;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eI.c$b */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        private int f143003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f143004d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f143005e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, C17168i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f143004d = pVar;
            this.f143005e = obj;
            C17542s.h(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f143003c;
            if (i10 == 0) {
                this.f143003c = 1;
                y.b(obj);
                C17542s.h(this.f143004d, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) W.g(this.f143004d, 2)).invoke(this.f143005e, this);
            } else if (i10 == 1) {
                this.f143003c = 2;
                y.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"eI/c$c", "Lkotlin/coroutines/jvm/internal/j;", "LXH/x;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eI.c$c  reason: collision with other inner class name */
    public static final class C3484c extends j {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3484c(C17164e<? super T> eVar) {
            super(eVar);
            C17542s.h(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            y.b(obj);
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"eI/c$d", "Lkotlin/coroutines/jvm/internal/d;", "LXH/x;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eI.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17164e<? super T> eVar, C17168i iVar) {
            super(eVar, iVar);
            C17542s.h(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            y.b(obj);
            return obj;
        }
    }

    public static <R, T> C17164e<C16807N> a(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        C17542s.j(pVar, "<this>");
        C17542s.j(eVar, "completion");
        C17164e<? super T> a10 = h.a(eVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        C17168i context = a10.getContext();
        return context == C17169j.f142968a ? new a(a10, pVar, r10) : new b(a10, context, pVar, r10);
    }

    private static final <T> C17164e<T> b(C17164e<? super T> eVar) {
        C17168i context = eVar.getContext();
        return context == C17169j.f142968a ? new C3484c(eVar) : new d(eVar, context);
    }

    public static <T> C17164e<T> c(C17164e<? super T> eVar) {
        C17164e<Object> intercepted;
        C17542s.j(eVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = eVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) eVar : null;
        return (dVar == null || (intercepted = dVar.intercepted()) == null) ? eVar : intercepted;
    }

    public static <R, T> Object d(p<? super R, ? super C17164e<? super T>, ? extends Object> pVar, R r10, C17164e<? super T> eVar) {
        C17542s.j(pVar, "<this>");
        C17542s.j(eVar, "completion");
        return ((p) W.g(pVar, 2)).invoke(r10, b(h.a(eVar)));
    }

    public static <R, P, T> Object e(q<? super R, ? super P, ? super C17164e<? super T>, ? extends Object> qVar, R r10, P p10, C17164e<? super T> eVar) {
        C17542s.j(qVar, "<this>");
        C17542s.j(eVar, "completion");
        return ((q) W.g(qVar, 3)).invoke(r10, p10, b(h.a(eVar)));
    }
}
