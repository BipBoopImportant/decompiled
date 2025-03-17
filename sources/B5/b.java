package B5;

import E5.h;
import H5.i;
import K5.d;
import N5.m;
import S5.c;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001)B«\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J?\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,R9\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b)\u0010,¨\u00060"}, d2 = {"LB5/b;", "", "", "LI5/b;", "interceptors", "LXH/v;", "LK5/d;", "Ljava/lang/Class;", "mappers", "LJ5/b;", "keyers", "LH5/i$a;", "fetcherFactories", "LE5/h$a;", "decoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "LN5/m;", "options", "g", "(Ljava/lang/Object;LN5/m;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;LN5/m;)Ljava/lang/String;", "LB5/h;", "imageLoader", "", "startIndex", "LH5/i;", "j", "(Ljava/lang/Object;LN5/m;LB5/h;I)LXH/v;", "LH5/m;", "result", "LE5/h;", "i", "(LH5/m;LN5/m;LB5/h;I)LXH/v;", "LB5/b$a;", "h", "()LB5/b$a;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "e", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<I5.b> f33137a;

    /* renamed from: b  reason: collision with root package name */
    private final List<v<d<? extends Object, ? extends Object>, Class<? extends Object>>> f33138b;

    /* renamed from: c  reason: collision with root package name */
    private final List<v<J5.b<? extends Object>, Class<? extends Object>>> f33139c;

    /* renamed from: d  reason: collision with root package name */
    private final List<v<i.a<? extends Object>, Class<? extends Object>>> f33140d;

    /* renamed from: e  reason: collision with root package name */
    private final List<h.a> f33141e;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR@\u0010\"\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\u0007\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b!\u0010\u001eR<\u0010$\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b#\u0010\u001eR<\u0010&\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0011\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0 0\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b%\u0010\u001eR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"LB5/b$a;", "", "LB5/b;", "registry", "<init>", "(LB5/b;)V", "T", "LK5/d;", "mapper", "Ljava/lang/Class;", "type", "d", "(LK5/d;Ljava/lang/Class;)LB5/b$a;", "LJ5/b;", "keyer", "c", "(LJ5/b;Ljava/lang/Class;)LB5/b$a;", "LH5/i$a;", "factory", "b", "(LH5/i$a;Ljava/lang/Class;)LB5/b$a;", "LE5/h$a;", "a", "(LE5/h$a;)LB5/b$a;", "e", "()LB5/b;", "", "LI5/b;", "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "LXH/v;", "getMappers$coil_base_release", "mappers", "getKeyers$coil_base_release", "keyers", "g", "fetcherFactories", "f", "decoderFactories", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<I5.b> f33142a;

        /* renamed from: b  reason: collision with root package name */
        private final List<v<d<? extends Object, ?>, Class<? extends Object>>> f33143b;

        /* renamed from: c  reason: collision with root package name */
        private final List<v<J5.b<? extends Object>, Class<? extends Object>>> f33144c;

        /* renamed from: d  reason: collision with root package name */
        private final List<v<i.a<? extends Object>, Class<? extends Object>>> f33145d;

        /* renamed from: e  reason: collision with root package name */
        private final List<h.a> f33146e;

        public a(b bVar) {
            this.f33142a = C16877v.w1(bVar.c());
            this.f33143b = C16877v.w1(bVar.e());
            this.f33144c = C16877v.w1(bVar.d());
            this.f33145d = C16877v.w1(bVar.b());
            this.f33146e = C16877v.w1(bVar.a());
        }

        public final a a(h.a aVar) {
            this.f33146e.add(aVar);
            return this;
        }

        public final <T> a b(i.a<T> aVar, Class<T> cls) {
            this.f33145d.add(C16796C.a(aVar, cls));
            return this;
        }

        public final <T> a c(J5.b<T> bVar, Class<T> cls) {
            this.f33144c.add(C16796C.a(bVar, cls));
            return this;
        }

        public final <T> a d(d<T, ?> dVar, Class<T> cls) {
            this.f33143b.add(C16796C.a(dVar, cls));
            return this;
        }

        public final b e() {
            return new b(c.a(this.f33142a), c.a(this.f33143b), c.a(this.f33144c), c.a(this.f33145d), c.a(this.f33146e), (DefaultConstructorMarker) null);
        }

        public final List<h.a> f() {
            return this.f33146e;
        }

        public final List<v<i.a<? extends Object>, Class<? extends Object>>> g() {
            return this.f33145d;
        }
    }

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List<h.a> a() {
        return this.f33141e;
    }

    public final List<v<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f33140d;
    }

    public final List<I5.b> c() {
        return this.f33137a;
    }

    public final List<v<J5.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f33139c;
    }

    public final List<v<d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f33138b;
    }

    public final String f(Object obj, m mVar) {
        List<v<J5.b<? extends Object>, Class<? extends Object>>> list = this.f33139c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = list.get(i10);
            J5.b bVar = (J5.b) vVar.a();
            if (((Class) vVar.b()).isAssignableFrom(obj.getClass())) {
                C17542s.h(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a10 = bVar.a(obj, mVar);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, m mVar) {
        List<v<d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f33138b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = list.get(i10);
            d dVar = (d) vVar.a();
            if (((Class) vVar.b()).isAssignableFrom(obj.getClass())) {
                C17542s.h(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a10 = dVar.a(obj, mVar);
                if (a10 != null) {
                    obj = a10;
                }
            }
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final v<h, Integer> i(H5.m mVar, m mVar2, h hVar, int i10) {
        int size = this.f33141e.size();
        while (i10 < size) {
            h a10 = this.f33141e.get(i10).a(mVar, mVar2, hVar);
            if (a10 != null) {
                return C16796C.a(a10, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final v<i, Integer> j(Object obj, m mVar, h hVar, int i10) {
        int size = this.f33140d.size();
        while (i10 < size) {
            v vVar = this.f33140d.get(i10);
            i.a aVar = (i.a) vVar.a();
            if (((Class) vVar.b()).isAssignableFrom(obj.getClass())) {
                C17542s.h(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                i a10 = aVar.a(obj, mVar, hVar);
                if (a10 != null) {
                    return C16796C.a(a10, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    private b(List<? extends I5.b> list, List<? extends v<? extends d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends v<? extends J5.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends v<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends h.a> list5) {
        this.f33137a = list;
        this.f33138b = list2;
        this.f33139c = list3;
        this.f33140d = list4;
        this.f33141e = list5;
    }

    public b() {
        this(C16877v.n(), C16877v.n(), C16877v.n(), C16877v.n(), C16877v.n());
    }
}
