package E4;

import D4.C6433g;
import D4.C6436j;
import D4.C6445t;
import D4.C6448w;
import D4.C6450y;
import D4.C6451z;
import D4.D;
import D4.M;
import D4.N;
import TJ.C16509F;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.util.Log;
import androidx.compose.ui.platform.O;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u001f\b\u0007\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0018B\u001d\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\u0013\u0010\u0012\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R7\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"8F@BX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010/\u001a\u00020*2\u0006\u0010#\u001a\u00020*8F@BX\u0002¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"LE4/a;", "", "T", "LTJ/g;", "LD4/M;", "flow", "<init>", "(LTJ/g;)V", "LXH/N;", "o", "()V", "", "index", "f", "(I)Ljava/lang/Object;", "j", "l", "k", "d", "(LdI/e;)Ljava/lang/Object;", "e", "a", "LTJ/g;", "LdI/i;", "b", "LdI/i;", "mainDispatcher", "LD4/j;", "c", "LD4/j;", "differCallback", "E4/a$f", "LE4/a$f;", "pagingDataDiffer", "LD4/t;", "<set-?>", "LU0/r0;", "h", "()LD4/t;", "m", "(LD4/t;)V", "itemSnapshotList", "LD4/g;", "i", "()LD4/g;", "n", "(LD4/g;)V", "loadState", "g", "()I", "itemCount", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> {

    /* renamed from: g  reason: collision with root package name */
    private static final b f34836g = new b((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f34837h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<M<T>> f34838a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f34839b;

    /* renamed from: c  reason: collision with root package name */
    private final C6436j f34840c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final f f34841d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f34842e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f34843f;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"E4/a$a", "LD4/y;", "", "level", "", "b", "(I)Z", "", "message", "", "tr", "LXH/N;", "a", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E4.a$a  reason: collision with other inner class name */
    public static final class C0556a implements C6450y {
        C0556a() {
        }

        public void a(int i10, String str, Throwable th2) {
            C17542s.j(str, "message");
            if (th2 != null && i10 == 3) {
                Log.d("Paging", str, th2);
            } else if (th2 != null && i10 == 2) {
                Log.v("Paging", str, th2);
            } else if (i10 == 3) {
                Log.d("Paging", str);
            } else if (i10 == 2) {
                Log.v("Paging", str);
            } else {
                throw new IllegalArgumentException("debug level " + i10 + " is requested but Paging only supports default logging for level 2 (DEBUG) or level 3 (VERBOSE)");
            }
        }

        public boolean b(int i10) {
            return Log.isLoggable("Paging", i10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE4/a$b;", "", "<init>", "()V", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LD4/g;", "it", "LXH/N;", "<anonymous>", "(LD4/g;)V"}, k = 3, mv = {1, 8, 0})
    static final class c implements C16533h<C6433g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<T> f34844a;

        c(a<T> aVar) {
            this.f34844a = aVar;
        }

        /* renamed from: c */
        public final Object emit(C6433g gVar, C17164e<? super C16807N> eVar) {
            this.f34844a.n(gVar);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LD4/M;", "it", "LXH/N;", "<anonymous>", "(LD4/M;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", l = {210}, m = "invokeSuspend")
    static final class d extends l implements p<M<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34845c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f34846d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a<T> f34847e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a<T> aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f34847e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f34847e, eVar);
            dVar.f34846d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(M<T> m10, C17164e<? super C16807N> eVar) {
            return ((d) create(m10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34845c;
            if (i10 == 0) {
                y.b(obj);
                f a10 = this.f34847e.f34841d;
                this.f34845c = 1;
                if (a10.q((M) this.f34846d, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"E4/a$e", "LD4/j;", "", "position", "count", "LXH/N;", "c", "(II)V", "a", "b", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements C6436j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<T> f34848a;

        e(a<T> aVar) {
            this.f34848a = aVar;
        }

        public void a(int i10, int i11) {
            if (i11 > 0) {
                this.f34848a.o();
            }
        }

        public void b(int i10, int i11) {
            if (i11 > 0) {
                this.f34848a.o();
            }
        }

        public void c(int i10, int i11) {
            if (i11 > 0) {
                this.f34848a.o();
            }
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JG\u0010\n\u001a\u0004\u0018\u00010\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"E4/a$f", "LD4/N;", "LD4/D;", "previousList", "newList", "", "lastAccessedIndex", "Lkotlin/Function0;", "LXH/N;", "onListPresentable", "v", "(LD4/D;LD4/D;ILnI/a;LdI/e;)Ljava/lang/Object;", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends N<T> {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ a<T> f34849n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a<T> aVar, C6436j jVar, C17168i iVar, M<T> m10) {
            super(jVar, iVar, m10);
            this.f34849n = aVar;
        }

        public Object v(D<T> d10, D<T> d11, int i10, C17631a<C16807N> aVar, C17164e<? super Integer> eVar) {
            aVar.invoke();
            this.f34849n.o();
            return null;
        }
    }

    static {
        C6450y a10 = C6451z.a();
        if (a10 == null) {
            a10 = new C0556a();
        }
        C6451z.b(a10);
    }

    public a(C16532g<M<T>> gVar) {
        C17542s.j(gVar, "flow");
        this.f34838a = gVar;
        C17168i b10 = O.f19306l.b();
        this.f34839b = b10;
        e eVar = new e(this);
        this.f34840c = eVar;
        f fVar = new f(this, eVar, b10, gVar instanceof C16509F ? (M) C16877v.y0(((C16509F) gVar).c()) : null);
        this.f34841d = fVar;
        this.f34842e = u1.e(fVar.z(), (o1) null, 2, (Object) null);
        C6433g value = fVar.t().getValue();
        this.f34843f = u1.e(value == null ? new C6433g(b.f34851b.f(), b.f34851b.e(), b.f34851b.d(), b.f34851b, (C6448w) null, 16, (DefaultConstructorMarker) null) : value, (o1) null, 2, (Object) null);
    }

    private final void m(C6445t<T> tVar) {
        this.f34842e.setValue(tVar);
    }

    /* access modifiers changed from: private */
    public final void n(C6433g gVar) {
        this.f34843f.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void o() {
        m(this.f34841d.z());
    }

    public final Object d(C17164e<? super C16807N> eVar) {
        Object collect = C16534i.A(this.f34841d.t()).collect(new c(this), eVar);
        return collect == C17187b.f() ? collect : C16807N.f139792a;
    }

    public final Object e(C17164e<? super C16807N> eVar) {
        Object j10 = C16534i.j(this.f34838a, new d(this, (C17164e<? super d>) null), eVar);
        return j10 == C17187b.f() ? j10 : C16807N.f139792a;
    }

    public final T f(int i10) {
        this.f34841d.s(i10);
        return h().get(i10);
    }

    public final int g() {
        return h().size();
    }

    public final C6445t<T> h() {
        return (C6445t) this.f34842e.getValue();
    }

    public final C6433g i() {
        return (C6433g) this.f34843f.getValue();
    }

    public final T j(int i10) {
        return h().get(i10);
    }

    public final void k() {
        this.f34841d.x();
    }

    public final void l() {
        this.f34841d.y();
    }
}
