package k7;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import m7.c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000  2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lk7/a;", "Lk7/o;", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "<init>", "(Lm7/c;Ll7/b;Lk7/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lm7/c;", "i", "()Lm7/c;", "f", "Ll7/b;", "g", "()Ll7/b;", "Lk7/h;", "getLogger", "()Lk7/h;", "h", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: k7.a  reason: case insensitive filesystem */
public final class C8461a extends o {

    /* renamed from: h  reason: collision with root package name */
    public static final C0860a f54289h = new C0860a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final c f54290e;

    /* renamed from: f  reason: collision with root package name */
    private final C8533b f54291f;

    /* renamed from: g  reason: collision with root package name */
    private final h f54292g;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk7/a$a;", "", "<init>", "()V", "Lm7/c;", "tag", "Ll7/b;", "encoded", "Lk7/h;", "logger", "Lk7/a;", "a", "(Lm7/c;Ll7/b;Lk7/h;)Lk7/a;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: k7.a$a  reason: collision with other inner class name */
    public static final class C0860a {
        public /* synthetic */ C0860a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8461a a(c cVar, C8533b bVar, h hVar) {
            C17542s.j(cVar, "tag");
            C17542s.j(bVar, "encoded");
            C17542s.j(hVar, "logger");
            return new C8461a(cVar, bVar, hVar);
        }

        private C0860a() {
        }
    }

    public C8461a(c cVar, C8533b bVar, h hVar) {
        C17542s.j(cVar, "tag");
        C17542s.j(bVar, "encoded");
        C17542s.j(hVar, "logger");
        this.f54290e = cVar;
        this.f54291f = bVar;
        this.f54292g = hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8461a)) {
            return false;
        }
        C8461a aVar = (C8461a) obj;
        return C17542s.e(this.f54290e, aVar.f54290e) && C17542s.e(this.f54291f, aVar.f54291f) && C17542s.e(this.f54292g, aVar.f54292g);
    }

    public C8533b g() {
        return this.f54291f;
    }

    public int hashCode() {
        return (((this.f54290e.hashCode() * 31) + this.f54291f.hashCode()) * 31) + this.f54292g.hashCode();
    }

    public c i() {
        return this.f54290e;
    }

    public String toString() {
        return "BIT STRING";
    }
}
