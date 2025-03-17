package l6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.C8529a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Ll6/h;", "", "Ll6/a;", "width", "height", "<init>", "(Ll6/a;Ll6/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll6/a;", "b", "()Ll6/a;", "c", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f54770c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final h f54771d;

    /* renamed from: a  reason: collision with root package name */
    private final C8529a f54772a;

    /* renamed from: b  reason: collision with root package name */
    private final C8529a f54773b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll6/h$a;", "", "<init>", "()V", "Ll6/h;", "ORIGINAL", "Ll6/h;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C8529a.b bVar = C8529a.b.f54761a;
        f54771d = new h(bVar, bVar);
    }

    public h(C8529a aVar, C8529a aVar2) {
        this.f54772a = aVar;
        this.f54773b = aVar2;
    }

    public final C8529a a() {
        return this.f54773b;
    }

    public final C8529a b() {
        return this.f54772a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f54772a, hVar.f54772a) && C17542s.e(this.f54773b, hVar.f54773b);
    }

    public int hashCode() {
        return (this.f54772a.hashCode() * 31) + this.f54773b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f54772a + ", height=" + this.f54773b + ')';
    }
}
