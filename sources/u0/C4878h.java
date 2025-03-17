package U0;

import QJ.C16324p;
import U0.C4879h0;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0010H@¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LU0/h;", "LU0/h0;", "Lkotlin/Function0;", "LXH/N;", "onNewAwaiters", "<init>", "(LnI/a;)V", "", "cause", "p", "(Ljava/lang/Throwable;)V", "", "timeNanos", "u", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "i0", "(LnI/l;LdI/e;)Ljava/lang/Object;", "a", "LnI/a;", "", "b", "Ljava/lang/Object;", "lock", "c", "Ljava/lang/Throwable;", "failureCause", "", "LU0/h$a;", "d", "Ljava/util/List;", "awaiters", "e", "spareList", "LU0/g;", "f", "LU0/g;", "hasAwaitersUnlocked", "", "r", "()Z", "hasAwaiters", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.h  reason: case insensitive filesystem */
public final class C4878h implements C4879h0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17631a<C16807N> f13980a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f13981b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Throwable f13982c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<a<?>> f13983d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<a<?>> f13984e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C4875g f13985f = new C4875g(0);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"LU0/h$a;", "R", "", "Lkotlin/Function1;", "", "onFrame", "LdI/e;", "continuation", "<init>", "(LnI/l;LdI/e;)V", "timeNanos", "LXH/N;", "b", "(J)V", "a", "LnI/l;", "getOnFrame", "()LnI/l;", "LdI/e;", "()LdI/e;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U0.h$a */
    private static final class a<R> {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<Long, R> f13986a;

        /* renamed from: b  reason: collision with root package name */
        private final C17164e<R> f13987b;

        public a(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
            this.f13986a = lVar;
            this.f13987b = eVar;
        }

        public final C17164e<R> a() {
            return this.f13987b;
        }

        public final void b(long j10) {
            Object obj;
            C17164e<R> eVar = this.f13987b;
            try {
                x.a aVar = x.f139812b;
                obj = x.b(this.f13986a.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th2));
            }
            eVar.resumeWith(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: U0.h$b */
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4878h f13988c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a<R> f13989d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4878h hVar, a<R> aVar) {
            super(1);
            this.f13988c = hVar;
            this.f13989d = aVar;
        }

        public final void a(Throwable th2) {
            Object m10 = this.f13988c.f13981b;
            C4878h hVar = this.f13988c;
            a<R> aVar = this.f13989d;
            synchronized (m10) {
                try {
                    hVar.f13983d.remove(aVar);
                    if (hVar.f13983d.isEmpty()) {
                        hVar.f13985f.set(0);
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    public C4878h(C17631a<C16807N> aVar) {
        this.f13980a = aVar;
    }

    /* access modifiers changed from: private */
    public final void p(Throwable th2) {
        synchronized (this.f13981b) {
            try {
                if (this.f13982c == null) {
                    this.f13982c = th2;
                    List<a<?>> list = this.f13983d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C17164e a10 = list.get(i10).a();
                        x.a aVar = x.f139812b;
                        a10.resumeWith(x.b(y.a(th2)));
                    }
                    this.f13983d.clear();
                    this.f13985f.set(0);
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C4879h0.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C4879h0.a.b(this, cVar);
    }

    public <R> Object i0(C17642l<? super Long, ? extends R> lVar, C17164e<? super R> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        a aVar = new a(lVar, pVar);
        synchronized (this.f13981b) {
            Throwable j10 = this.f13982c;
            if (j10 != null) {
                x.a aVar2 = x.f139812b;
                pVar.resumeWith(x.b(y.a(j10)));
            } else {
                boolean isEmpty = this.f13983d.isEmpty();
                this.f13983d.add(aVar);
                if (isEmpty) {
                    this.f13985f.set(1);
                }
                pVar.K(new b(this, aVar));
                if (isEmpty && this.f13980a != null) {
                    try {
                        this.f13980a.invoke();
                    } catch (Throwable th2) {
                        p(th2);
                    }
                }
            }
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C4879h0.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C4879h0.a.d(this, iVar);
    }

    public final boolean r() {
        return this.f13985f.get() != 0;
    }

    public final void u(long j10) {
        synchronized (this.f13981b) {
            try {
                List<a<?>> list = this.f13983d;
                this.f13983d = this.f13984e;
                this.f13984e = list;
                this.f13985f.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).b(j10);
                }
                list.clear();
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
