package v0;

import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.P;
import XH.C16807N;
import c1.c;
import f1.C5303e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u00060\u0018R\u00020\u00000\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lv0/r;", "", "Lf1/e;", "saveableStateHolder", "Lkotlin/Function0;", "Lv0/t;", "itemProvider", "<init>", "(Lf1/e;LnI/a;)V", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "index", "contentType", "LXH/N;", "b", "(ILjava/lang/Object;Ljava/lang/Object;)LnI/p;", "a", "Lf1/e;", "LnI/a;", "d", "()LnI/a;", "", "Lv0/r$a;", "Ljava/util/Map;", "lambdasCache", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5303e f30917a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<t> f30918b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, a> f30919c = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u001a"}, d2 = {"Lv0/r$a;", "", "", "index", "key", "contentType", "<init>", "(Lv0/r;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "LXH/N;", "c", "()LnI/p;", "a", "Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "b", "e", "<set-?>", "I", "f", "()I", "d", "LnI/p;", "_content", "content", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f30920a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f30921b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f30922c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public p<? super C4889m, ? super Integer, C16807N> f30923d;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: v0.r$a$a  reason: collision with other inner class name */
        static final class C0478a extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ r f30925c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f30926d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
            /* renamed from: v0.r$a$a$a  reason: collision with other inner class name */
            static final class C0479a extends C17544u implements C17642l<M, L> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f30927c;

                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"v0/r$a$a$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                /* renamed from: v0.r$a$a$a$a  reason: collision with other inner class name */
                public static final class C0480a implements L {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f30928a;

                    public C0480a(a aVar) {
                        this.f30928a = aVar;
                    }

                    public void b() {
                        this.f30928a.f30923d = null;
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0479a(a aVar) {
                    super(1);
                    this.f30927c = aVar;
                }

                /* renamed from: a */
                public final L invoke(M m10) {
                    return new C0480a(this.f30927c);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0478a(r rVar, a aVar) {
                super(2);
                this.f30925c = rVar;
                this.f30926d = aVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1403994769, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:91)");
                    }
                    t invoke = this.f30925c.d().invoke();
                    int f10 = this.f30926d.f();
                    if ((f10 >= invoke.a() || !C17542s.e(invoke.d(f10), this.f30926d.g())) && (f10 = invoke.c(this.f30926d.g())) != -1) {
                        this.f30926d.f30922c = f10;
                    }
                    int i11 = f10;
                    if (i11 != -1) {
                        mVar.W(-660479623);
                        C6152s.a(invoke, S.a(this.f30925c.f30917a), i11, S.a(this.f30926d.g()), mVar, 0);
                        mVar.P();
                    } else {
                        mVar.W(-660272047);
                        mVar.P();
                    }
                    Object g10 = this.f30926d.g();
                    boolean F10 = mVar.F(this.f30926d);
                    a aVar = this.f30926d;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C0479a(aVar);
                        mVar.u(D10);
                    }
                    P.c(g10, (C17642l) D10, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.f30920a = obj;
            this.f30921b = obj2;
            this.f30922c = i10;
        }

        private final p<C4889m, Integer, C16807N> c() {
            return c.c(1403994769, true, new C0478a(r.this, this));
        }

        public final p<C4889m, Integer, C16807N> d() {
            p<? super C4889m, ? super Integer, C16807N> pVar = this.f30923d;
            if (pVar != null) {
                return pVar;
            }
            p<C4889m, Integer, C16807N> c10 = c();
            this.f30923d = c10;
            return c10;
        }

        public final Object e() {
            return this.f30921b;
        }

        public final int f() {
            return this.f30922c;
        }

        public final Object g() {
            return this.f30920a;
        }
    }

    public r(C5303e eVar, C17631a<? extends t> aVar) {
        this.f30917a = eVar;
        this.f30918b = aVar;
    }

    public final p<C4889m, Integer, C16807N> b(int i10, Object obj, Object obj2) {
        a aVar = this.f30919c.get(obj);
        if (aVar != null && aVar.f() == i10 && C17542s.e(aVar.e(), obj2)) {
            return aVar.d();
        }
        a aVar2 = new a(i10, obj, obj2);
        this.f30919c.put(obj, aVar2);
        return aVar2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = this.f30919c.get(obj);
        if (aVar != null) {
            return aVar.e();
        }
        t invoke = this.f30918b.invoke();
        int c10 = invoke.c(obj);
        if (c10 != -1) {
            return invoke.e(c10);
        }
        return null;
    }

    public final C17631a<t> d() {
        return this.f30918b;
    }
}
