package M6;

import M6.w;
import M6.w.a;
import YH.X;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0017Bc\b\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r8\u0006X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"LM6/g;", "LM6/w$a;", "D", "", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "LM6/w;", "operation", "data", "", "LM6/o;", "errors", "", "", "extensions", "LM6/r;", "executionContext", "", "isLast", "<init>", "(Ljava/util/UUID;LM6/w;LM6/w$a;Ljava/util/List;Ljava/util/Map;LM6/r;Z)V", "LM6/g$a;", "a", "()LM6/g$a;", "Ljava/util/UUID;", "b", "LM6/w;", "c", "LM6/w$a;", "d", "Ljava/util/List;", "e", "Ljava/util/Map;", "f", "LM6/r;", "g", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g<D extends w.a> {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f38569a;

    /* renamed from: b  reason: collision with root package name */
    public final w<D> f38570b;

    /* renamed from: c  reason: collision with root package name */
    public final D f38571c;

    /* renamed from: d  reason: collision with root package name */
    public final List<o> f38572d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Object> f38573e;

    /* renamed from: f  reason: collision with root package name */
    public final r f38574f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f38575g;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u001a\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010$R\u0016\u0010\t\u001a\u0004\u0018\u00018\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"LM6/g$a;", "LM6/w$a;", "D", "", "LM6/w;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "data", "<init>", "(LM6/w;Ljava/util/UUID;LM6/w$a;)V", "LM6/r;", "executionContext", "a", "(LM6/r;)LM6/g$a;", "", "LM6/o;", "errors", "c", "(Ljava/util/List;)LM6/g$a;", "", "", "extensions", "d", "(Ljava/util/Map;)LM6/g$a;", "f", "(Ljava/util/UUID;)LM6/g$a;", "", "isLast", "e", "(Z)LM6/g$a;", "LM6/g;", "b", "()LM6/g;", "LM6/w;", "Ljava/util/UUID;", "LM6/w$a;", "LM6/r;", "Ljava/util/List;", "Ljava/util/Map;", "g", "Z", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<D extends w.a> {

        /* renamed from: a  reason: collision with root package name */
        private final w<D> f38576a;

        /* renamed from: b  reason: collision with root package name */
        private UUID f38577b;

        /* renamed from: c  reason: collision with root package name */
        private final D f38578c;

        /* renamed from: d  reason: collision with root package name */
        private r f38579d = r.f38608b;

        /* renamed from: e  reason: collision with root package name */
        private List<o> f38580e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, ? extends Object> f38581f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f38582g;

        public a(w<D> wVar, UUID uuid, D d10) {
            C17542s.j(wVar, "operation");
            C17542s.j(uuid, "requestUuid");
            this.f38576a = wVar;
            this.f38577b = uuid;
            this.f38578c = d10;
        }

        public final a<D> a(r rVar) {
            C17542s.j(rVar, "executionContext");
            this.f38579d = this.f38579d.c(rVar);
            return this;
        }

        public final g<D> b() {
            w<D> wVar = this.f38576a;
            UUID uuid = this.f38577b;
            D d10 = this.f38578c;
            r rVar = this.f38579d;
            Map<String, ? extends Object> map = this.f38581f;
            if (map == null) {
                map = X.j();
            }
            return new g(uuid, wVar, d10, this.f38580e, map, rVar, this.f38582g, (DefaultConstructorMarker) null);
        }

        public final a<D> c(List<o> list) {
            this.f38580e = list;
            return this;
        }

        public final a<D> d(Map<String, ? extends Object> map) {
            this.f38581f = map;
            return this;
        }

        public final a<D> e(boolean z10) {
            this.f38582g = z10;
            return this;
        }

        public final a<D> f(UUID uuid) {
            C17542s.j(uuid, "requestUuid");
            this.f38577b = uuid;
            return this;
        }
    }

    public /* synthetic */ g(UUID uuid, w wVar, w.a aVar, List list, Map map, r rVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, wVar, aVar, list, map, rVar, z10);
    }

    public final a<D> a() {
        return new a(this.f38570b, this.f38569a, this.f38571c).c(this.f38572d).d(this.f38573e).a(this.f38574f).e(this.f38575g);
    }

    private g(UUID uuid, w<D> wVar, D d10, List<o> list, Map<String, ? extends Object> map, r rVar, boolean z10) {
        this.f38569a = uuid;
        this.f38570b = wVar;
        this.f38571c = d10;
        this.f38572d = list;
        this.f38573e = map;
        this.f38574f = rVar;
        this.f38575g = z10;
    }
}
