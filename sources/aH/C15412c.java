package AH;

import CH.C15491c;
import EH.C15596A;
import EH.C15602G;
import EH.C15608M;
import EH.C15610O;
import EH.C15612Q;
import EH.C15627l;
import EH.C15628m;
import EH.C15634s;
import EH.C15636u;
import JH.C15955b;
import JH.d;
import JH.e;
import JH.z;
import OH.C16158a;
import QJ.F0;
import QJ.b1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import sH.C17901e;
import sH.C17902f;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\tJ-\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\f*\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0016\u0010%R*\u0010-\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u000b8\u0006@GX\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R*\u00105\u001a\u00020.2\u0006\u0010'\u001a\u00020.8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0017\u00109\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b#\u00108R(\u0010?\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:8F@GX\u000e¢\u0006\f\u001a\u0004\b/\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"LAH/c;", "LEH/s;", "<init>", "()V", "LAH/d;", "b", "()LAH/d;", "builder", "p", "(LAH/c;)LAH/c;", "o", "", "T", "LsH/e;", "key", "capability", "LXH/N;", "l", "(LsH/e;Ljava/lang/Object;)V", "f", "(LsH/e;)Ljava/lang/Object;", "LEH/G;", "a", "LEH/G;", "i", "()LEH/G;", "url", "LEH/u;", "LEH/u;", "h", "()LEH/u;", "n", "(LEH/u;)V", "method", "LEH/m;", "c", "LEH/m;", "()LEH/m;", "headers", "<set-?>", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "body", "LQJ/F0;", "e", "LQJ/F0;", "g", "()LQJ/F0;", "m", "(LQJ/F0;)V", "executionContext", "LJH/b;", "LJH/b;", "()LJH/b;", "attributes", "LOH/a;", "value", "()LOH/a;", "k", "(LOH/a;)V", "bodyType", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: AH.c  reason: case insensitive filesystem */
public final class C15412c implements C15634s {

    /* renamed from: g  reason: collision with root package name */
    public static final a f132938g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15602G f132939a = new C15602G((C15608M) null, (String) null, 0, (String) null, (String) null, (List) null, (C15596A) null, (String) null, false, 511, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private C15636u f132940b = C15636u.f134140b.a();

    /* renamed from: c  reason: collision with root package name */
    private final C15628m f132941c = new C15628m(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private Object f132942d = C15491c.f133484a;

    /* renamed from: e  reason: collision with root package name */
    private F0 f132943e = b1.b((F0) null, 1, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final C15955b f132944f = d.a(true);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAH/c$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: AH.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "", "LsH/e;", "b", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: AH.c$b */
    static final class b extends C17544u implements C17631a<Map<C17901e<?>, Object>> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f132945c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Map<C17901e<?>, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public C15628m a() {
        return this.f132941c;
    }

    public final C15413d b() {
        C15612Q b10 = this.f132939a.b();
        C15636u uVar = this.f132940b;
        C15627l p10 = a().p();
        Object obj = this.f132942d;
        FH.d dVar = obj instanceof FH.d ? (FH.d) obj : null;
        if (dVar != null) {
            return new C15413d(b10, uVar, p10, dVar, this.f132943e, this.f132944f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f132942d).toString());
    }

    public final C15955b c() {
        return this.f132944f;
    }

    public final Object d() {
        return this.f132942d;
    }

    public final C16158a e() {
        return (C16158a) this.f132944f.e(C15418i.a());
    }

    public final <T> T f(C17901e<T> eVar) {
        C17542s.j(eVar, "key");
        Map map = (Map) this.f132944f.e(C17902f.a());
        if (map != null) {
            return map.get(eVar);
        }
        return null;
    }

    public final F0 g() {
        return this.f132943e;
    }

    public final C15636u h() {
        return this.f132940b;
    }

    public final C15602G i() {
        return this.f132939a;
    }

    public final void j(Object obj) {
        C17542s.j(obj, "<set-?>");
        this.f132942d = obj;
    }

    public final void k(C16158a aVar) {
        if (aVar != null) {
            this.f132944f.c(C15418i.a(), aVar);
        } else {
            this.f132944f.d(C15418i.a());
        }
    }

    public final <T> void l(C17901e<T> eVar, T t10) {
        C17542s.j(eVar, "key");
        C17542s.j(t10, "capability");
        ((Map) this.f132944f.b(C17902f.a(), b.f132945c)).put(eVar, t10);
    }

    public final void m(F0 f02) {
        C17542s.j(f02, "<set-?>");
        this.f132943e = f02;
    }

    public final void n(C15636u uVar) {
        C17542s.j(uVar, "<set-?>");
        this.f132940b = uVar;
    }

    public final C15412c o(C15412c cVar) {
        C17542s.j(cVar, "builder");
        this.f132940b = cVar.f132940b;
        this.f132942d = cVar.f132942d;
        k(cVar.e());
        C15610O.h(this.f132939a, cVar.f132939a);
        C15602G g10 = this.f132939a;
        g10.u(g10.g());
        z.c(a(), cVar.a());
        e.a(this.f132944f, cVar.f132944f);
        return this;
    }

    public final C15412c p(C15412c cVar) {
        C17542s.j(cVar, "builder");
        this.f132943e = cVar.f132943e;
        return o(cVar);
    }
}
