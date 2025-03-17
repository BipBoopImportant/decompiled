package CE;

import EE.C12846a;
import com.optimizely.ab.event.internal.payload.EventBatch;
import java.util.Map;
import java.util.Objects;

/* renamed from: CE.f  reason: case insensitive filesystem */
public class C12699f {

    /* renamed from: a  reason: collision with root package name */
    private final a f108412a;

    /* renamed from: b  reason: collision with root package name */
    private final String f108413b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f108414c;

    /* renamed from: d  reason: collision with root package name */
    private final EventBatch f108415d;

    /* renamed from: CE.f$a */
    public enum a {
        GET,
        POST
    }

    public C12699f(a aVar, String str, Map<String, String> map, EventBatch eventBatch) {
        this.f108412a = aVar;
        this.f108413b = str;
        this.f108414c = map;
        this.f108415d = eventBatch;
    }

    public String a() {
        return this.f108415d == null ? "" : C12846a.c().a(this.f108415d);
    }

    public String b() {
        return this.f108413b;
    }

    public Map<String, String> c() {
        return this.f108414c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12699f fVar = (C12699f) obj;
        return this.f108412a == fVar.f108412a && Objects.equals(this.f108413b, fVar.f108413b) && Objects.equals(this.f108414c, fVar.f108414c) && Objects.equals(this.f108415d, fVar.f108415d);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f108412a, this.f108413b, this.f108414c, this.f108415d});
    }

    public String toString() {
        return "LogEvent{requestMethod=" + this.f108412a + ", endpointUrl='" + this.f108413b + '\'' + ", requestParams=" + this.f108414c + ", body='" + a() + '\'' + '}';
    }
}
