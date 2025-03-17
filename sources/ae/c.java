package Ae;

import com.optimizely.ab.config.FeatureVariable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LAe/c;", "", "<init>", "()V", "", "string", "", "maxLength", "d", "(Ljava/lang/String;I)Ljava/lang/String;", "a", "(Ljava/lang/String;)Ljava/lang/String;", "b", "c", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f58680a = new c();

    private c() {
    }

    private final String d(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i10) {
            return str;
        }
        String substring = str.substring(0, i10 - 3);
        C17542s.i(substring, "substring(...)");
        return substring + "...";
    }

    public final String a(String str) {
        return d(str, 100);
    }

    public final String b(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        String d10 = d(str, 24);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final String c(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        String d10 = d(str, 36);
        if (d10 != null) {
            return d10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
