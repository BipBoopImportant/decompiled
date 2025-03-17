package Z6;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ6/j;", "LZ6/d;", "", "id", "", "", "payload", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j implements d {

    /* renamed from: a  reason: collision with root package name */
    private final String f41406a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f41407b;

    public j(String str, Map<String, ? extends Object> map) {
        C17542s.j(map, "payload");
        this.f41406a = str;
        this.f41407b = map;
    }

    public final Map<String, Object> a() {
        return this.f41407b;
    }

    public String getId() {
        return this.f41406a;
    }
}
