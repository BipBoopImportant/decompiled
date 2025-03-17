package eD;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LeD/t;", "", "<init>", "()V", "", "cc", "lc", "user", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "base", "suffix", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f126602a = new t();

    private t() {
    }

    public final String a(String str, String str2, String str3) {
        C17542s.j(str, "cc");
        C17542s.j(str2, "lc");
        C17542s.j(str3, "user");
        return "ProfileRepository/Configuration/" + str + "/" + str2 + "/" + str3 + "/";
    }

    public final String b(String str, String str2, String str3) {
        C17542s.j(str, "cc");
        C17542s.j(str2, "lc");
        C17542s.j(str3, "user");
        return "ProfileRepository/Profile/" + str + "/" + str2 + "/" + str3 + "/";
    }

    public final String c(String str, String str2) {
        C17542s.j(str, "base");
        C17542s.j(str2, "suffix");
        return str + str2;
    }
}
