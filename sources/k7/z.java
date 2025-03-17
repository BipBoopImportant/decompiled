package k7;

import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import m7.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u001eB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188FX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lk7/z;", "Lk7/o;", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "<init>", "(Lm7/c;Ll7/b;Lk7/h;)V", "", "toString", "()Ljava/lang/String;", "e", "Lm7/c;", "i", "()Lm7/c;", "f", "Ll7/b;", "g", "()Ll7/b;", "Lk7/h;", "getLogger", "()Lk7/h;", "Ljava/time/Instant;", "h", "LXH/o;", "o", "()Ljava/time/Instant;", "value", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z extends o {

    /* renamed from: i  reason: collision with root package name */
    public static final a f54347i = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final c f54348e;

    /* renamed from: f  reason: collision with root package name */
    private final C8533b f54349f;

    /* renamed from: g  reason: collision with root package name */
    private final h f54350g;

    /* renamed from: h  reason: collision with root package name */
    private final C16824o f54351h;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk7/z$a;", "", "<init>", "()V", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "Lk7/z;", "a", "(Lm7/c;Ll7/b;Lk7/h;)Lk7/z;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(c cVar, C8533b bVar, h hVar) {
            C17542s.j(cVar, "tag");
            C17542s.j(bVar, "encoded");
            C17542s.j(hVar, "logger");
            return new z(cVar, bVar, hVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ z(c cVar, C8533b bVar, h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, bVar, hVar);
    }

    /* access modifiers changed from: private */
    public static final Instant p(z zVar) {
        return LocalDateTime.parse(C15854t.B(C16877v.n1(C16877v.t1(zVar.g()))), DateTimeFormatter.ofPattern(zVar.g().a() == 13 ? "yyMMddHHmmss'Z'" : "yyyyMMddHHmmss'Z'")).toInstant(ZoneOffset.UTC);
    }

    public C8533b g() {
        return this.f54349f;
    }

    public c i() {
        return this.f54348e;
    }

    public final Instant o() {
        Object value = this.f54351h.getValue();
        C17542s.i(value, "getValue(...)");
        return (Instant) value;
    }

    public String toString() {
        return "TIME " + o();
    }

    private z(c cVar, C8533b bVar, h hVar) {
        this.f54348e = cVar;
        this.f54349f = bVar;
        this.f54350g = hVar;
        this.f54351h = C16825p.b(new y(this));
    }
}
