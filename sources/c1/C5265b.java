package c1;

import U0.C4889m;
import U0.K0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.W;
import nI.p;
import nI.q;
import nI.r;
import nI.s;
import nI.t;
import nI.w;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u001bJ@\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!Jh\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020-\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102¨\u00064"}, d2 = {"Lc1/b;", "Lc1/a;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "LXH/N;", "j", "()V", "LU0/m;", "composer", "i", "(LU0/m;)V", "k", "(Ljava/lang/Object;)V", "c", "changed", "a", "(LU0/m;I)Ljava/lang/Object;", "p1", "b", "(Ljava/lang/Object;LU0/m;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;LU0/m;I)Ljava/lang/Object;", "p3", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LU0/m;I)Ljava/lang/Object;", "p4", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LU0/m;I)Ljava/lang/Object;", "p5", "p6", "p7", "h", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LU0/m;I)Ljava/lang/Object;", "I", "getKey", "()I", "Z", "Ljava/lang/Object;", "_block", "LU0/K0;", "d", "LU0/K0;", "scope", "", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: c1.b  reason: case insensitive filesystem */
public final class C5265b implements C5264a {

    /* renamed from: a  reason: collision with root package name */
    private final int f22983a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f22984b;

    /* renamed from: c  reason: collision with root package name */
    private Object f22985c;

    /* renamed from: d  reason: collision with root package name */
    private K0 f22986d;

    /* renamed from: e  reason: collision with root package name */
    private List<K0> f22987e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/m;", "nc", "", "<anonymous parameter 1>", "LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: c1.b$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5265b f22988c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f22989d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f22990e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5265b bVar, Object obj, int i10) {
            super(2);
            this.f22988c = bVar;
            this.f22989d = obj;
            this.f22990e = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f22988c.b(this.f22989d, mVar, M0.a(this.f22990e) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/m;", "nc", "", "<anonymous parameter 1>", "LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: c1.b$b  reason: collision with other inner class name */
    static final class C0359b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5265b f22991c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f22992d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f22993e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f22994f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0359b(C5265b bVar, Object obj, Object obj2, int i10) {
            super(2);
            this.f22991c = bVar;
            this.f22992d = obj;
            this.f22993e = obj2;
            this.f22994f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f22991c.c(this.f22992d, this.f22993e, mVar, M0.a(this.f22994f) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/m;", "nc", "", "<anonymous parameter 1>", "LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: c1.b$c */
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5265b f22995c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f22996d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f22997e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f22998f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f22999g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5265b bVar, Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f22995c = bVar;
            this.f22996d = obj;
            this.f22997e = obj2;
            this.f22998f = obj3;
            this.f22999g = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f22995c.e(this.f22996d, this.f22997e, this.f22998f, mVar, M0.a(this.f22999g) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/m;", "nc", "", "<anonymous parameter 1>", "LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: c1.b$d */
    static final class d extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5265b f23000c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f23001d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f23002e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f23003f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f23004g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f23005h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5265b bVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
            super(2);
            this.f23000c = bVar;
            this.f23001d = obj;
            this.f23002e = obj2;
            this.f23003f = obj3;
            this.f23004g = obj4;
            this.f23005h = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f23000c.f(this.f23001d, this.f23002e, this.f23003f, this.f23004g, mVar, M0.a(this.f23005h) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/m;", "nc", "", "<anonymous parameter 1>", "LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: c1.b$e */
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5265b f23006c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f23007d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f23008e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f23009f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f23010g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f23011h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Object f23012i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f23013j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f23014k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5265b bVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
            super(2);
            this.f23006c = bVar;
            this.f23007d = obj;
            this.f23008e = obj2;
            this.f23009f = obj3;
            this.f23010g = obj4;
            this.f23011h = obj5;
            this.f23012i = obj6;
            this.f23013j = obj7;
            this.f23014k = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f23006c.h(this.f23007d, this.f23008e, this.f23009f, this.f23010g, this.f23011h, this.f23012i, this.f23013j, mVar, M0.a(this.f23014k) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public C5265b(int i10, boolean z10, Object obj) {
        this.f22983a = i10;
        this.f22984b = z10;
        this.f22985c = obj;
    }

    private final void i(C4889m mVar) {
        K0 A10;
        if (this.f22984b && (A10 = mVar.A()) != null) {
            mVar.M(A10);
            if (c.f(this.f22986d, A10)) {
                this.f22986d = A10;
                return;
            }
            List<K0> list = this.f22987e;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f22987e = arrayList;
                arrayList.add(A10);
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (c.f(list.get(i10), A10)) {
                    list.set(i10, A10);
                    return;
                }
            }
            list.add(A10);
        }
    }

    private final void j() {
        if (this.f22984b) {
            K0 k02 = this.f22986d;
            if (k02 != null) {
                k02.invalidate();
                this.f22986d = null;
            }
            List<K0> list = this.f22987e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(this.f22983a);
        i(k10);
        int d10 = i10 | (k10.V(this) ? c.d(0) : c.g(0));
        Object obj = this.f22985c;
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((p) W.g(obj, 2)).invoke(k10, Integer.valueOf(d10));
        Y0 n10 = k10.n();
        if (n10 != null) {
            C17542s.h(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            n10.a((p) W.g(this, 2));
        }
        return invoke;
    }

    public Object b(Object obj, C4889m mVar, int i10) {
        C4889m k10 = mVar.k(this.f22983a);
        i(k10);
        int d10 = k10.V(this) ? c.d(1) : c.g(1);
        Object obj2 = this.f22985c;
        C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((q) W.g(obj2, 3)).invoke(obj, k10, Integer.valueOf(d10 | i10));
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(this, obj, i10));
        }
        return invoke;
    }

    public Object c(Object obj, Object obj2, C4889m mVar, int i10) {
        C4889m k10 = mVar.k(this.f22983a);
        i(k10);
        int d10 = k10.V(this) ? c.d(2) : c.g(2);
        Object obj3 = this.f22985c;
        C17542s.h(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object l10 = ((r) W.g(obj3, 4)).l(obj, obj2, k10, Integer.valueOf(d10 | i10));
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C0359b(this, obj, obj2, i10));
        }
        return l10;
    }

    public Object e(Object obj, Object obj2, Object obj3, C4889m mVar, int i10) {
        C4889m k10 = mVar.k(this.f22983a);
        i(k10);
        int d10 = k10.V(this) ? c.d(3) : c.g(3);
        Object obj4 = this.f22985c;
        C17542s.h(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object z10 = ((s) W.g(obj4, 5)).z(obj, obj2, obj3, k10, Integer.valueOf(d10 | i10));
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(this, obj, obj2, obj3, i10));
        }
        return z10;
    }

    public Object f(Object obj, Object obj2, Object obj3, Object obj4, C4889m mVar, int i10) {
        C4889m k10 = mVar.k(this.f22983a);
        i(k10);
        int d10 = k10.V(this) ? c.d(4) : c.g(4);
        Object obj5 = this.f22985c;
        C17542s.h(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object o10 = ((t) W.g(obj5, 6)).o(obj, obj2, obj3, obj4, k10, Integer.valueOf(d10 | i10));
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new d(this, obj, obj2, obj3, obj4, i10));
        }
        return o10;
    }

    public Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, C4889m mVar, int i10) {
        C4889m k10 = mVar.k(this.f22983a);
        i(k10);
        int d10 = k10.V(this) ? c.d(7) : c.g(7);
        Object obj8 = this.f22985c;
        C17542s.h(obj8, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object y10 = ((w) W.g(obj8, 9)).y(obj, obj2, obj3, obj4, obj5, obj6, obj7, k10, Integer.valueOf(i10 | d10));
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new e(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, i10));
        }
        return y10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((C4889m) obj, ((Number) obj2).intValue());
    }

    public final void k(Object obj) {
        if (!C17542s.e(this.f22985c, obj)) {
            boolean z10 = this.f22985c == null;
            this.f22985c = obj;
            if (!z10) {
                j();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (C4889m) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return f(obj, obj2, obj3, obj4, (C4889m) obj5, ((Number) obj6).intValue());
    }

    public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, (C4889m) obj8, ((Number) obj9).intValue());
    }

    public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (C4889m) obj4, ((Number) obj5).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (C4889m) obj2, ((Number) obj3).intValue());
    }
}
