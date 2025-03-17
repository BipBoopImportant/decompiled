package GJ;

import XH.C16807N;
import XH.y;
import YH.C16870n;
import YH.C16877v;
import com.optimizely.ab.config.Group;
import dI.C17164e;
import eI.C17187b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import rI.C17853c;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\f\u001aE\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\f\u001a-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\f\u001a-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0007¢\u0006\u0004\b \u0010!\u001aC\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u001a2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"T", "", "LGJ/h;", "h", "(Ljava/util/Iterator;)LGJ/h;", "", "elements", "v", "([Ljava/lang/Object;)LGJ/h;", "j", "()LGJ/h;", "k", "(LGJ/h;)LGJ/h;", "", "p", "R", "Lkotlin/Function1;", "iterator", "l", "(LGJ/h;LnI/l;)LGJ/h;", "w", "LrI/c;", "random", "x", "(LGJ/h;LrI/c;)LGJ/h;", "i", "", "Lkotlin/Function0;", "nextFunction", "r", "(LnI/a;)LGJ/h;", "seed", "q", "(Ljava/lang/Object;LnI/l;)LGJ/h;", "seedFunction", "s", "(LnI/a;LnI/l;)LGJ/h;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
class s extends C15770m {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"GJ/s$a", "LGJ/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C15765h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f134754a;

        public a(Iterator it) {
            this.f134754a = it;
        }

        public Iterator<T> iterator() {
            return this.f134754a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LGJ/j;", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", l = {145}, m = "invokeSuspend")
    static final class b extends k implements p<C15767j<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f134755d;

        /* renamed from: e  reason: collision with root package name */
        int f134756e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f134757f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C15765h<T> f134758g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17853c f134759h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15765h<? extends T> hVar, C17853c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f134758g = hVar;
            this.f134759h = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f134758g, this.f134759h, eVar);
            bVar.f134757f = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C15767j<? super T> jVar, C17164e<? super C16807N> eVar) {
            return ((b) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C15767j jVar;
            List<T> list;
            Object f10 = C17187b.f();
            int i10 = this.f134756e;
            if (i10 == 0) {
                y.b(obj);
                list = C15768k.b0(this.f134758g);
                jVar = (C15767j) this.f134757f;
            } else if (i10 == 1) {
                list = (List) this.f134755d;
                jVar = (C15767j) this.f134757f;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (!list.isEmpty()) {
                int e10 = this.f134759h.e(list.size());
                T O10 = C16877v.O(list);
                if (e10 < list.size()) {
                    O10 = list.set(e10, O10);
                }
                this.f134757f = jVar;
                this.f134755d = list;
                this.f134756e = 1;
                if (jVar.d(O10, this) == f10) {
                    return f10;
                }
            }
            return C16807N.f139792a;
        }
    }

    public static <T> C15765h<T> h(Iterator<? extends T> it) {
        C17542s.j(it, "<this>");
        return C15768k.i(new a(it));
    }

    public static <T> C15765h<T> i(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        return hVar instanceof C15758a ? hVar : new C15758a(hVar);
    }

    public static <T> C15765h<T> j() {
        return C15761d.f134727a;
    }

    public static <T> C15765h<T> k(C15765h<? extends C15765h<? extends T>> hVar) {
        C17542s.j(hVar, "<this>");
        return l(hVar, new p());
    }

    private static final <T, R> C15765h<R> l(C15765h<? extends T> hVar, C17642l<? super T, ? extends Iterator<? extends R>> lVar) {
        return hVar instanceof C15757A ? ((C15757A) hVar).e(lVar) : new C15763f(hVar, new q(), lVar);
    }

    /* access modifiers changed from: private */
    public static final Iterator m(C15765h hVar) {
        C17542s.j(hVar, "it");
        return hVar.iterator();
    }

    /* access modifiers changed from: private */
    public static final Iterator n(Iterable iterable) {
        C17542s.j(iterable, "it");
        return iterable.iterator();
    }

    /* access modifiers changed from: private */
    public static final Object o(Object obj) {
        return obj;
    }

    public static <T> C15765h<T> p(C15765h<? extends Iterable<? extends T>> hVar) {
        C17542s.j(hVar, "<this>");
        return l(hVar, new r());
    }

    public static <T> C15765h<T> q(T t10, C17642l<? super T, ? extends T> lVar) {
        C17542s.j(lVar, "nextFunction");
        return t10 == null ? C15761d.f134727a : new C15764g(new C15771n(t10), lVar);
    }

    public static <T> C15765h<T> r(C17631a<? extends T> aVar) {
        C17542s.j(aVar, "nextFunction");
        return C15768k.i(new C15764g(aVar, new C15772o(aVar)));
    }

    public static <T> C15765h<T> s(C17631a<? extends T> aVar, C17642l<? super T, ? extends T> lVar) {
        C17542s.j(aVar, "seedFunction");
        C17542s.j(lVar, "nextFunction");
        return new C15764g(aVar, lVar);
    }

    /* access modifiers changed from: private */
    public static final Object t(C17631a aVar, Object obj) {
        C17542s.j(obj, "it");
        return aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final Object u(Object obj) {
        return obj;
    }

    public static <T> C15765h<T> v(T... tArr) {
        C17542s.j(tArr, "elements");
        return C16870n.U(tArr);
    }

    public static <T> C15765h<T> w(C15765h<? extends T> hVar) {
        C17542s.j(hVar, "<this>");
        return x(hVar, C17853c.f146670a);
    }

    public static final <T> C15765h<T> x(C15765h<? extends T> hVar, C17853c cVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(cVar, Group.RANDOM_POLICY);
        return C15768k.b(new b(hVar, cVar, (C17164e<? super b>) null));
    }
}
