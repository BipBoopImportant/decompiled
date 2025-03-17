package io.ktor.utils.io;

import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
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
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\\\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u000e*\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"LQJ/Q;", "LdI/i;", "coroutineContext", "", "autoFlush", "Lkotlin/Function2;", "Lio/ktor/utils/io/u;", "LdI/e;", "LXH/N;", "", "block", "Lio/ktor/utils/io/t;", "b", "(LQJ/Q;LdI/i;ZLnI/p;)Lio/ktor/utils/io/t;", "S", "context", "Lio/ktor/utils/io/c;", "channel", "attachJob", "Lio/ktor/utils/io/l;", "a", "(LQJ/Q;LdI/i;Lio/ktor/utils/io/c;ZLnI/p;)Lio/ktor/utils/io/l;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LQJ/Q;", "S", "", "cause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f143829c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f143829c = cVar;
        }

        public final void a(Throwable th2) {
            this.f143829c.a(th2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "S", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", l = {147}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f143830c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f143831d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f143832e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f143833f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ p<S, C17164e<? super C16807N>, Object> f143834g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ M f143835h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z10, c cVar, p<? super S, ? super C17164e<? super C16807N>, ? extends Object> pVar, M m10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f143832e = z10;
            this.f143833f = cVar;
            this.f143834g = pVar;
            this.f143835h = m10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f143832e, this.f143833f, this.f143834g, this.f143835h, eVar);
            bVar.f143831d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f143830c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f143831d;
                if (this.f143832e) {
                    c cVar = this.f143833f;
                    C17168i.b bVar = q10.getCoroutineContext().get(F0.f137562d0);
                    C17542s.g(bVar);
                    cVar.f((F0) bVar);
                }
                m mVar = new m(q10, this.f143833f);
                p<S, C17164e<? super C16807N>, Object> pVar = this.f143834g;
                this.f143830c = 1;
                if (pVar.invoke(mVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    if (C17542s.e(this.f143835h, C16311i0.d()) || this.f143835h == null) {
                        this.f143833f.p(th2);
                    } else {
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    private static final <S extends Q> l a(Q q10, C17168i iVar, c cVar, boolean z10, p<? super S, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        c cVar2 = cVar;
        Q q11 = q10;
        C17168i iVar2 = iVar;
        F0 d10 = C16314k.d(q11, iVar2, (T) null, new b(z10, cVar, pVar, (M) q10.getCoroutineContext().get(M.f137585a), (C17164e<? super b>) null), 2, (Object) null);
        d10.s(new a(cVar));
        return new l(d10, cVar);
    }

    public static final t b(Q q10, C17168i iVar, boolean z10, p<? super u, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(q10, "<this>");
        C17542s.j(iVar, "coroutineContext");
        C17542s.j(pVar, "block");
        return a(q10, iVar, e.a(z10), true, pVar);
    }

    public static /* synthetic */ t c(Q q10, C17168i iVar, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(q10, iVar, z10, pVar);
    }
}
