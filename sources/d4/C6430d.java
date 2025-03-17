package D4;

import QJ.F0;
import SJ.C16423B;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"T", "LQJ/F0;", "controller", "Lkotlin/Function2;", "LD4/W;", "LdI/e;", "LXH/N;", "", "block", "LTJ/g;", "a", "(LQJ/F0;LnI/p;)LTJ/g;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.d  reason: case insensitive filesystem */
public final class C6430d {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LD4/W;", "LXH/N;", "<anonymous>", "(LD4/W;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: D4.d$a */
    static final class a extends l implements p<W<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34329c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f34330d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F0 f34331e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<W<T>, C17164e<? super C16807N>, Object> f34332f;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D4.d$a$a  reason: collision with other inner class name */
        static final class C0546a extends C17544u implements C17642l<Throwable, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ W<T> f34333c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0546a(W<T> w10) {
                super(1);
                this.f34333c = w10;
            }

            public final void a(Throwable th2) {
                C16423B.a.a(this.f34333c, (Throwable) null, 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F0 f02, p<? super W<T>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f34331e = f02;
            this.f34332f = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f34331e, this.f34332f, eVar);
            aVar.f34330d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(W<T> w10, C17164e<? super C16807N> eVar) {
            return ((a) create(w10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34329c;
            if (i10 == 0) {
                y.b(obj);
                W w10 = (W) this.f34330d;
                this.f34331e.s(new C0546a(w10));
                p<W<T>, C17164e<? super C16807N>, Object> pVar = this.f34332f;
                this.f34329c = 1;
                if (pVar.invoke(w10, this) == f10) {
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

    public static final <T> C16532g<T> a(F0 f02, p<? super W<T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(f02, "controller");
        C17542s.j(pVar, "block");
        return V.a(new a(f02, pVar, (C17164e<? super a>) null));
    }
}
