package JE;

import com.optimizely.ab.config.parser.ConfigParser;
import com.optimizely.ab.config.parser.DefaultConfigParser;
import com.optimizely.ab.config.parser.JsonParseException;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: JE.a  reason: case insensitive filesystem */
public class C13078a {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f111276d = LoggerFactory.getLogger((Class<?>) C13078a.class);

    /* renamed from: a  reason: collision with root package name */
    private String f111277a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f111278b;

    /* renamed from: c  reason: collision with root package name */
    private ConfigParser f111279c;

    public C13078a(String str) {
        this(str, DefaultConfigParser.getInstance());
    }

    public Map<String, Object> a() {
        String str;
        if (this.f111278b == null && (str = this.f111277a) != null) {
            try {
                this.f111278b = (Map) this.f111279c.fromJson(str, Map.class);
            } catch (Exception e10) {
                f111276d.error("Provided string could not be converted to a dictionary ({})", (Object) e10.toString());
            }
        }
        return this.f111278b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (a() == null) {
            return false;
        }
        return a().equals(((C13078a) obj).a());
    }

    public int hashCode() {
        if (a() != null) {
            return a().hashCode();
        }
        return 0;
    }

    public String toString() {
        Map<String, Object> map;
        if (this.f111277a == null && (map = this.f111278b) != null) {
            try {
                this.f111277a = this.f111279c.toJson(map);
            } catch (JsonParseException e10) {
                f111276d.error("Provided map could not be converted to a string ({})", (Object) e10.toString());
            }
        }
        String str = this.f111277a;
        return str != null ? str : "";
    }

    public C13078a(String str, ConfigParser configParser) {
        this.f111277a = str;
        this.f111279c = configParser;
    }

    public C13078a(Map<String, Object> map) {
        this(map, DefaultConfigParser.getInstance());
    }

    public C13078a(Map<String, Object> map, ConfigParser configParser) {
        this.f111278b = map;
        this.f111279c = configParser;
    }
}
