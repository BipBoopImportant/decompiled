package DE;

import com.optimizely.ab.config.ProjectConfig;
import java.util.Map;
import java.util.StringJoiner;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private final ProjectConfig f108639a;

    /* renamed from: b  reason: collision with root package name */
    private final String f108640b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, ?> f108641c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private ProjectConfig f108642a;

        /* renamed from: b  reason: collision with root package name */
        private String f108643b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, ?> f108644c;

        public g a() {
            return new g(this.f108642a, this.f108643b, this.f108644c);
        }

        public b b(Map<String, ?> map) {
            this.f108644c = map;
            return this;
        }

        public b c(ProjectConfig projectConfig) {
            this.f108642a = projectConfig;
            return this;
        }

        public b d(String str) {
            this.f108643b = str;
            return this;
        }
    }

    public Map<String, ?> a() {
        return this.f108641c;
    }

    public ProjectConfig b() {
        return this.f108639a;
    }

    public String c() {
        return this.f108640b;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", g.class.getSimpleName() + "[", "]");
        StringJoiner add = stringJoiner.add("projectConfig=" + this.f108639a.getRevision());
        StringJoiner add2 = add.add("userId='" + this.f108640b + "'");
        return add2.add("attributes=" + this.f108641c).toString();
    }

    private g(ProjectConfig projectConfig, String str, Map<String, ?> map) {
        this.f108639a = projectConfig;
        this.f108640b = str;
        this.f108641c = map;
    }
}
