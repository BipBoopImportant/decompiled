package M6;

import M6.w;
import M6.w.a;
import N6.d;
import YH.C16877v;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0017Bm\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\"\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b+\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b\u001b\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u0017\u0010*¨\u0006,"}, d2 = {"LM6/f;", "LM6/w$a;", "D", "", "LM6/w;", "operation", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "requestUuid", "LM6/r;", "executionContext", "LN6/f;", "httpMethod", "", "LN6/d;", "httpHeaders", "", "sendApqExtensions", "sendDocument", "enableAutoPersistedQueries", "canBeBatched", "<init>", "(LM6/w;Ljava/util/UUID;LM6/r;LN6/f;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "LM6/w;", "f", "()LM6/w;", "b", "Ljava/util/UUID;", "g", "()Ljava/util/UUID;", "c", "LM6/r;", "()LM6/r;", "d", "LN6/f;", "e", "()LN6/f;", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "i", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class f<D extends w.a> {

    /* renamed from: a  reason: collision with root package name */
    private final w<D> f38551a;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f38552b;

    /* renamed from: c  reason: collision with root package name */
    private final r f38553c;

    /* renamed from: d  reason: collision with root package name */
    private final N6.f f38554d;

    /* renamed from: e  reason: collision with root package name */
    private final List<d> f38555e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f38556f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f38557g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f38558h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f38559i;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\u001a\u0010,\u001a\u00060)j\u0002`*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010+R\"\u0010!\u001a\u00020 8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b&\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001d\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\bD\u0010<\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R$\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b.\u0010<\u001a\u0004\bA\u0010>\"\u0004\bF\u0010@¨\u0006G"}, d2 = {"LM6/f$a;", "LM6/w$a;", "D", "", "LM6/w;", "operation", "<init>", "(LM6/w;)V", "LN6/f;", "httpMethod", "o", "(LN6/f;)LM6/f$a;", "", "LN6/d;", "httpHeaders", "n", "(Ljava/util/List;)LM6/f$a;", "", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)LM6/f$a;", "", "sendApqExtensions", "p", "(Ljava/lang/Boolean;)LM6/f$a;", "sendDocument", "q", "enableAutoPersistedQueries", "e", "canBeBatched", "d", "LM6/r;", "executionContext", "f", "(LM6/r;)LM6/f$a;", "a", "LM6/f;", "c", "()LM6/f;", "LM6/w;", "Ljava/util/UUID;", "Lcom/benasher44/uuid/Uuid;", "Ljava/util/UUID;", "requestUuid", "LM6/r;", "i", "()LM6/r;", "t", "(LM6/r;)V", "LN6/f;", "k", "()LN6/f;", "v", "(LN6/f;)V", "Ljava/util/List;", "j", "()Ljava/util/List;", "u", "(Ljava/util/List;)V", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "w", "(Ljava/lang/Boolean;)V", "g", "m", "x", "h", "s", "r", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<D extends w.a> {

        /* renamed from: a  reason: collision with root package name */
        private w<D> f38560a;

        /* renamed from: b  reason: collision with root package name */
        private UUID f38561b;

        /* renamed from: c  reason: collision with root package name */
        private r f38562c = r.f38608b;

        /* renamed from: d  reason: collision with root package name */
        private N6.f f38563d;

        /* renamed from: e  reason: collision with root package name */
        private List<d> f38564e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f38565f;

        /* renamed from: g  reason: collision with root package name */
        private Boolean f38566g;

        /* renamed from: h  reason: collision with root package name */
        private Boolean f38567h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f38568i;

        public a(w<D> wVar) {
            C17542s.j(wVar, "operation");
            this.f38560a = wVar;
            UUID randomUUID = UUID.randomUUID();
            C17542s.i(randomUUID, "randomUUID()");
            this.f38561b = randomUUID;
        }

        public a<D> a(r rVar) {
            C17542s.j(rVar, "executionContext");
            t(i().c(rVar));
            return this;
        }

        public a<D> b(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "value");
            List<d> j10 = j();
            if (j10 == null) {
                j10 = C16877v.n();
            }
            u(C16877v.W0(j10, new d(str, str2)));
            return this;
        }

        public final f<D> c() {
            return new f(this.f38560a, this.f38561b, i(), k(), j(), l(), m(), h(), g(), (DefaultConstructorMarker) null);
        }

        public a<D> d(Boolean bool) {
            r(bool);
            return this;
        }

        public a<D> e(Boolean bool) {
            s(bool);
            return this;
        }

        public final a<D> f(r rVar) {
            C17542s.j(rVar, "executionContext");
            t(rVar);
            return this;
        }

        public Boolean g() {
            return this.f38568i;
        }

        public Boolean h() {
            return this.f38567h;
        }

        public r i() {
            return this.f38562c;
        }

        public List<d> j() {
            return this.f38564e;
        }

        public N6.f k() {
            return this.f38563d;
        }

        public Boolean l() {
            return this.f38565f;
        }

        public Boolean m() {
            return this.f38566g;
        }

        public a<D> n(List<d> list) {
            u(list);
            return this;
        }

        public a<D> o(N6.f fVar) {
            v(fVar);
            return this;
        }

        public a<D> p(Boolean bool) {
            w(bool);
            return this;
        }

        public a<D> q(Boolean bool) {
            x(bool);
            return this;
        }

        public void r(Boolean bool) {
            this.f38568i = bool;
        }

        public void s(Boolean bool) {
            this.f38567h = bool;
        }

        public void t(r rVar) {
            C17542s.j(rVar, "<set-?>");
            this.f38562c = rVar;
        }

        public void u(List<d> list) {
            this.f38564e = list;
        }

        public void v(N6.f fVar) {
            this.f38563d = fVar;
        }

        public void w(Boolean bool) {
            this.f38565f = bool;
        }

        public void x(Boolean bool) {
            this.f38566g = bool;
        }
    }

    public /* synthetic */ f(w wVar, UUID uuid, r rVar, N6.f fVar, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, uuid, rVar, fVar, list, bool, bool2, bool3, bool4);
    }

    public Boolean a() {
        return this.f38559i;
    }

    public Boolean b() {
        return this.f38558h;
    }

    public r c() {
        return this.f38553c;
    }

    public List<d> d() {
        return this.f38555e;
    }

    public N6.f e() {
        return this.f38554d;
    }

    public final w<D> f() {
        return this.f38551a;
    }

    public final UUID g() {
        return this.f38552b;
    }

    public Boolean h() {
        return this.f38556f;
    }

    public Boolean i() {
        return this.f38557g;
    }

    private f(w<D> wVar, UUID uuid, r rVar, N6.f fVar, List<d> list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.f38551a = wVar;
        this.f38552b = uuid;
        this.f38553c = rVar;
        this.f38554d = fVar;
        this.f38555e = list;
        this.f38556f = bool;
        this.f38557g = bool2;
        this.f38558h = bool3;
        this.f38559i = bool4;
    }
}
