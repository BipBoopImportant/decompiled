package T5;

import X5.C6724i;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import YH.C16877v;
import Z5.j;
import Z5.o;
import c6.C7098d;
import d6.C7747c;
import e6.C7790c;
import java.util.ArrayList;
import java.util.List;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import r6.C8695c;
import uI.C18055d;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001'BÃ\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u00124\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u0002\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*RD\u0010\r\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00020\u000b0\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010(R(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00020\u000b0\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010(R=\u00103\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028FX\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028FX\u0002¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b0\u0010*¨\u00065"}, d2 = {"LT5/h;", "", "", "Lc6/d;", "interceptors", "LXH/v;", "Le6/c;", "LuI/d;", "mappers", "Ld6/c;", "keyers", "Lkotlin/Function0;", "LZ5/j$a;", "lazyFetcherFactories", "LX5/i$a;", "lazyDecoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "Lk6/q;", "options", "j", "(Ljava/lang/Object;Lk6/q;)Ljava/lang/Object;", "LT5/r;", "imageLoader", "", "startIndex", "LZ5/j;", "m", "(Ljava/lang/Object;Lk6/q;LT5/r;I)LXH/v;", "LZ5/o;", "result", "LX5/i;", "l", "(LZ5/o;Lk6/q;LT5/r;I)LXH/v;", "LT5/h$a;", "k", "()LT5/h$a;", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "i", "c", "h", "d", "e", "f", "LXH/o;", "fetcherFactories", "decoderFactories", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: T5.h  reason: case insensitive filesystem */
public final class C6704h {

    /* renamed from: a  reason: collision with root package name */
    private final List<C7098d> f40031a;

    /* renamed from: b  reason: collision with root package name */
    private final List<v<C7790c<? extends Object, ? extends Object>, C18055d<? extends Object>>> f40032b;

    /* renamed from: c  reason: collision with root package name */
    private final List<v<C7747c<? extends Object>, C18055d<? extends Object>>> f40033c;

    /* renamed from: d  reason: collision with root package name */
    private List<? extends C17631a<? extends List<? extends v<? extends j.a<? extends Object>, ? extends C18055d<? extends Object>>>>> f40034d;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends C17631a<? extends List<? extends C6724i.a>>> f40035e;

    /* renamed from: f  reason: collision with root package name */
    private final C16824o f40036f;

    /* renamed from: g  reason: collision with root package name */
    private final C16824o f40037g;

    public /* synthetic */ C6704h(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    /* access modifiers changed from: private */
    public static final List c(C6704h hVar) {
        List<? extends C17631a<? extends List<? extends C6724i.a>>> list = hVar.f40035e;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C16877v.E(arrayList, (List) ((C17631a) list.get(i10)).invoke());
        }
        hVar.f40035e = C16877v.n();
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List d(C6704h hVar) {
        List<? extends C17631a<? extends List<? extends v<? extends j.a<? extends Object>, ? extends C18055d<? extends Object>>>>> list = hVar.f40034d;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C16877v.E(arrayList, (List) ((C17631a) list.get(i10)).invoke());
        }
        hVar.f40034d = C16877v.n();
        return arrayList;
    }

    public final List<C6724i.a> e() {
        return (List) this.f40037g.getValue();
    }

    public final List<v<j.a<? extends Object>, C18055d<? extends Object>>> f() {
        return (List) this.f40036f.getValue();
    }

    public final List<C7098d> g() {
        return this.f40031a;
    }

    public final List<v<C7747c<? extends Object>, C18055d<? extends Object>>> h() {
        return this.f40033c;
    }

    public final List<v<C7790c<? extends Object, ? extends Object>, C18055d<? extends Object>>> i() {
        return this.f40032b;
    }

    public final Object j(Object obj, C8450q qVar) {
        List<v<C7790c<? extends Object, ? extends Object>, C18055d<? extends Object>>> list = this.f40032b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = list.get(i10);
            C7790c cVar = (C7790c) vVar.a();
            if (((C18055d) vVar.b()).s(obj)) {
                C17542s.h(cVar, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                Object a10 = cVar.a(obj, qVar);
                if (a10 != null) {
                    obj = a10;
                }
            }
        }
        return obj;
    }

    public final a k() {
        return new a(this);
    }

    public final v<C6724i, Integer> l(o oVar, C8450q qVar, r rVar, int i10) {
        int size = e().size();
        while (i10 < size) {
            C6724i a10 = e().get(i10).a(oVar, qVar, rVar);
            if (a10 != null) {
                return C16796C.a(a10, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final v<j, Integer> m(Object obj, C8450q qVar, r rVar, int i10) {
        int size = f().size();
        while (i10 < size) {
            v vVar = f().get(i10);
            j.a aVar = (j.a) vVar.a();
            if (((C18055d) vVar.b()).s(obj)) {
                C17542s.h(aVar, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                j a10 = aVar.a(obj, qVar, rVar);
                if (a10 != null) {
                    return C16796C.a(a10, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    private C6704h(List<? extends C7098d> list, List<? extends v<? extends C7790c<? extends Object, ? extends Object>, ? extends C18055d<? extends Object>>> list2, List<? extends v<? extends C7747c<? extends Object>, ? extends C18055d<? extends Object>>> list3, List<? extends C17631a<? extends List<? extends v<? extends j.a<? extends Object>, ? extends C18055d<? extends Object>>>>> list4, List<? extends C17631a<? extends List<? extends C6724i.a>>> list5) {
        this.f40031a = list;
        this.f40032b = list2;
        this.f40033c = list3;
        this.f40034d = list4;
        this.f40035e = list5;
        this.f40036f = C16825p.b(new C6698b(this));
        this.f40037g = C16825p.b(new C6699c(this));
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001d\u001a\u00020\u00002.\u0010\u0017\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070%8\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R@\u0010-\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R<\u00100\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0%8\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)RH\u00103\u001a0\u0012,\u0012*\u0012&\u0012$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e0\u001c0\u001b0\u001a0%8\u0000X\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001b0\u001a0%8\u0000X\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)¨\u00067"}, d2 = {"LT5/h$a;", "", "<init>", "()V", "LT5/h;", "registry", "(LT5/h;)V", "Lc6/d;", "interceptor", "i", "(Lc6/d;)LT5/h$a;", "T", "Le6/c;", "mapper", "LuI/d;", "type", "k", "(Le6/c;LuI/d;)LT5/h$a;", "Ld6/c;", "keyer", "j", "(Ld6/c;LuI/d;)LT5/h$a;", "LZ5/j$a;", "factory", "h", "(LZ5/j$a;LuI/d;)LT5/h$a;", "Lkotlin/Function0;", "", "LXH/v;", "o", "(LnI/a;)LT5/h$a;", "LX5/i$a;", "g", "(LX5/i$a;)LT5/h$a;", "n", "p", "()LT5/h;", "", "a", "Ljava/util/List;", "getInterceptors$coil_core_release", "()Ljava/util/List;", "interceptors", "b", "getMappers$coil_core_release", "mappers", "c", "getKeyers$coil_core_release", "keyers", "d", "r", "lazyFetcherFactories", "e", "q", "lazyDecoderFactories", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: T5.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C7098d> f40038a;

        /* renamed from: b  reason: collision with root package name */
        private final List<v<C7790c<? extends Object, ?>, C18055d<? extends Object>>> f40039b;

        /* renamed from: c  reason: collision with root package name */
        private final List<v<C7747c<? extends Object>, C18055d<? extends Object>>> f40040c;

        /* renamed from: d  reason: collision with root package name */
        private final List<C17631a<List<v<j.a<? extends Object>, C18055d<? extends Object>>>>> f40041d;

        /* renamed from: e  reason: collision with root package name */
        private final List<C17631a<List<C6724i.a>>> f40042e;

        public a() {
            this.f40038a = new ArrayList();
            this.f40039b = new ArrayList();
            this.f40040c = new ArrayList();
            this.f40041d = new ArrayList();
            this.f40042e = new ArrayList();
        }

        /* access modifiers changed from: private */
        public static final List e(v vVar) {
            return C16877v.e(vVar);
        }

        /* access modifiers changed from: private */
        public static final List f(C6724i.a aVar) {
            return C16877v.e(aVar);
        }

        /* access modifiers changed from: private */
        public static final List l(C6724i.a aVar) {
            return C16877v.e(aVar);
        }

        /* access modifiers changed from: private */
        public static final List m(j.a aVar, C18055d dVar) {
            return C16877v.e(C16796C.a(aVar, dVar));
        }

        public final a g(C6724i.a aVar) {
            this.f40042e.add(new C6700d(aVar));
            return this;
        }

        public final <T> a h(j.a<T> aVar, C18055d<T> dVar) {
            this.f40041d.add(new C6703g(aVar, dVar));
            return this;
        }

        public final a i(C7098d dVar) {
            this.f40038a.add(dVar);
            return this;
        }

        public final <T> a j(C7747c<T> cVar, C18055d<T> dVar) {
            this.f40040c.add(C16796C.a(cVar, dVar));
            return this;
        }

        public final <T> a k(C7790c<T, ?> cVar, C18055d<T> dVar) {
            this.f40039b.add(C16796C.a(cVar, dVar));
            return this;
        }

        public final a n(C17631a<? extends List<? extends C6724i.a>> aVar) {
            this.f40042e.add(aVar);
            return this;
        }

        public final a o(C17631a<? extends List<? extends v<? extends j.a<? extends Object>, ? extends C18055d<? extends Object>>>> aVar) {
            this.f40041d.add(aVar);
            return this;
        }

        public final C6704h p() {
            return new C6704h(C8695c.c(this.f40038a), C8695c.c(this.f40039b), C8695c.c(this.f40040c), C8695c.c(this.f40041d), C8695c.c(this.f40042e), (DefaultConstructorMarker) null);
        }

        public final List<C17631a<List<C6724i.a>>> q() {
            return this.f40042e;
        }

        public final List<C17631a<List<v<j.a<? extends Object>, C18055d<? extends Object>>>>> r() {
            return this.f40041d;
        }

        public a(C6704h hVar) {
            this.f40038a = C16877v.w1(hVar.g());
            this.f40039b = C16877v.w1(hVar.i());
            this.f40040c = C16877v.w1(hVar.h());
            ArrayList arrayList = new ArrayList();
            for (v eVar : hVar.f()) {
                arrayList.add(new C6701e(eVar));
            }
            this.f40041d = arrayList;
            ArrayList arrayList2 = new ArrayList();
            for (C6724i.a fVar : hVar.e()) {
                arrayList2.add(new C6702f(fVar));
            }
            this.f40042e = arrayList2;
        }
    }

    public C6704h() {
        this(C16877v.n(), C16877v.n(), C16877v.n(), C16877v.n(), C16877v.n());
    }
}
