package oK;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R)\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"LoK/k;", "", "LoK/j;", "base", "", "LoK/l;", "", "foreground", "<init>", "(LoK/j;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LoK/j;", "()LoK/j;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.k  reason: case insensitive filesystem */
public final class C17718k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f145384c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f145385d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C17717j f145386a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C17719l, List<C17717j>> f145387b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoK/k$a;", "", "<init>", "()V", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17718k(C17717j jVar, Map<C17719l, ? extends List<C17717j>> map) {
        C17542s.j(jVar, "base");
        C17542s.j(map, "foreground");
        this.f145386a = jVar;
        this.f145387b = map;
    }

    public final C17717j a() {
        return this.f145386a;
    }

    public final Map<C17719l, List<C17717j>> b() {
        return this.f145387b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17718k)) {
            return false;
        }
        C17718k kVar = (C17718k) obj;
        return C17542s.e(this.f145386a, kVar.f145386a) && C17542s.e(this.f145387b, kVar.f145387b);
    }

    public int hashCode() {
        return (this.f145386a.hashCode() * 31) + this.f145387b.hashCode();
    }

    public String toString() {
        C17717j jVar = this.f145386a;
        Map<C17719l, List<C17717j>> map = this.f145387b;
        return "ImageRegionTileGrid(base=" + jVar + ", foreground=" + map + ")";
    }
}
