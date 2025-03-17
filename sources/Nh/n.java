package NH;

import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Ba\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012H\u0010\f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010 \u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b \u0010!RV\u0010\f\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u000b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u001b\u001a\u00028\u00008\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*\"\u0004\b+\u0010\u0016R\"\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0,8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0016\u00103\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00107\u001a\u0002048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"LNH/n;", "", "TSubject", "TContext", "LNH/e;", "initial", "context", "", "Lkotlin/Function3;", "LdI/e;", "LXH/N;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "blocks", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "", "direct", "m", "(Z)Z", "LXH/x;", "result", "n", "(Ljava/lang/Object;)V", "l", "()V", "e", "(LdI/e;)Ljava/lang/Object;", "subject", "f", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "continuation", "k", "(LdI/e;)V", "b", "Ljava/util/List;", "c", "LdI/e;", "getContinuation$ktor_utils", "()LdI/e;", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "o", "", "[LdI/e;", "suspensions", "", "I", "lastSuspensionIndex", "g", "index", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n<TSubject, TContext> extends e<TSubject, TContext> {

    /* renamed from: b  reason: collision with root package name */
    private final List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> f136530b;

    /* renamed from: c  reason: collision with root package name */
    private final C17164e<C16807N> f136531c = new a(this);

    /* renamed from: d  reason: collision with root package name */
    private TSubject f136532d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C17164e<TSubject>[] f136533e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f136534f;

    /* renamed from: g  reason: collision with root package name */
    private int f136535g;

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0015\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"NH/n$a", "LdI/e;", "LXH/N;", "Lkotlin/coroutines/jvm/internal/e;", "Lio/ktor/util/CoroutineStackFrame;", "a", "()LdI/e;", "LXH/x;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "I", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "currentIndex", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "LdI/i;", "getContext", "()LdI/i;", "context", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C17164e<C16807N>, e {

        /* renamed from: a  reason: collision with root package name */
        private int f136536a = Integer.MIN_VALUE;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n<TSubject, TContext> f136537b;

        a(n<TSubject, TContext> nVar) {
            this.f136537b = nVar;
        }

        private final C17164e<?> a() {
            if (this.f136536a == Integer.MIN_VALUE) {
                this.f136536a = this.f136537b.f136534f;
            }
            if (this.f136536a < 0) {
                this.f136536a = Integer.MIN_VALUE;
                return null;
            }
            try {
                C17164e<?>[] h10 = this.f136537b.f136533e;
                int i10 = this.f136536a;
                C17164e<?> eVar = h10[i10];
                if (eVar == null) {
                    return m.f136529a;
                }
                this.f136536a = i10 - 1;
                return eVar;
            } catch (Throwable unused) {
                return m.f136529a;
            }
        }

        public e getCallerFrame() {
            C17164e<?> a10 = a();
            if (a10 instanceof e) {
                return (e) a10;
            }
            return null;
        }

        public C17168i getContext() {
            C17164e eVar = this.f136537b.f136533e[this.f136537b.f136534f];
            if (eVar != this && eVar != null) {
                return eVar.getContext();
            }
            int g10 = this.f136537b.f136534f - 1;
            while (g10 >= 0) {
                int i10 = g10 - 1;
                C17164e eVar2 = this.f136537b.f136533e[g10];
                if (eVar2 != this && eVar2 != null) {
                    return eVar2.getContext();
                }
                g10 = i10;
            }
            throw new IllegalStateException("Not started");
        }

        public void resumeWith(Object obj) {
            if (x.g(obj)) {
                n<TSubject, TContext> nVar = this.f136537b;
                Throwable e10 = x.e(obj);
                C17542s.g(e10);
                nVar.n(x.b(y.a(e10)));
                return;
            }
            boolean unused = this.f136537b.m(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(TSubject tsubject, TContext tcontext, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object>> list) {
        super(tcontext);
        C17542s.j(tsubject, "initial");
        C17542s.j(tcontext, "context");
        C17542s.j(list, "blocks");
        this.f136530b = list;
        this.f136532d = tsubject;
        this.f136533e = new C17164e[list.size()];
        this.f136534f = -1;
    }

    private final void l() {
        int i10 = this.f136534f;
        if (i10 >= 0) {
            C17164e<TSubject>[] eVarArr = this.f136533e;
            this.f136534f = i10 - 1;
            eVarArr[i10] = null;
            return;
        }
        throw new IllegalStateException("No more continuations to resume");
    }

    /* access modifiers changed from: private */
    public final boolean m(boolean z10) {
        int i10;
        do {
            i10 = this.f136535g;
            if (i10 != this.f136530b.size()) {
                this.f136535g = i10 + 1;
                try {
                } catch (Throwable th2) {
                    x.a aVar = x.f139812b;
                    n(x.b(y.a(th2)));
                    return false;
                }
            } else if (z10) {
                return true;
            } else {
                x.a aVar2 = x.f139812b;
                n(x.b(c()));
                return false;
            }
        } while (this.f136530b.get(i10).invoke(this, c(), this.f136531c) != C17187b.f());
        return false;
    }

    /* access modifiers changed from: private */
    public final void n(Object obj) {
        int i10 = this.f136534f;
        if (i10 >= 0) {
            C17164e<TSubject> eVar = this.f136533e[i10];
            C17542s.g(eVar);
            C17164e<TSubject>[] eVarArr = this.f136533e;
            int i11 = this.f136534f;
            this.f136534f = i11 - 1;
            eVarArr[i11] = null;
            if (!x.g(obj)) {
                eVar.resumeWith(obj);
                return;
            }
            Throwable e10 = x.e(obj);
            C17542s.g(e10);
            eVar.resumeWith(x.b(y.a(k.a(e10, eVar))));
            return;
        }
        throw new IllegalStateException("No more continuations to resume");
    }

    public Object a(TSubject tsubject, C17164e<? super TSubject> eVar) {
        this.f136535g = 0;
        if (this.f136530b.size() == 0) {
            return tsubject;
        }
        o(tsubject);
        if (this.f136534f < 0) {
            return e(eVar);
        }
        throw new IllegalStateException("Already started");
    }

    public TSubject c() {
        return this.f136532d;
    }

    public Object e(C17164e<? super TSubject> eVar) {
        Object obj;
        if (this.f136535g == this.f136530b.size()) {
            obj = c();
        } else {
            k(C17187b.c(eVar));
            if (m(true)) {
                l();
                obj = c();
            } else {
                obj = C17187b.f();
            }
        }
        if (obj == C17187b.f()) {
            h.c(eVar);
        }
        return obj;
    }

    public Object f(TSubject tsubject, C17164e<? super TSubject> eVar) {
        o(tsubject);
        return e(eVar);
    }

    public C17168i getCoroutineContext() {
        return this.f136531c.getContext();
    }

    public final void k(C17164e<? super TSubject> eVar) {
        C17542s.j(eVar, "continuation");
        C17164e<TSubject>[] eVarArr = this.f136533e;
        int i10 = this.f136534f + 1;
        this.f136534f = i10;
        eVarArr[i10] = eVar;
    }

    public void o(TSubject tsubject) {
        C17542s.j(tsubject, "<set-?>");
        this.f136532d = tsubject;
    }
}
