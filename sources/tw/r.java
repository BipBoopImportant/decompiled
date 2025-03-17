package tw;

import HJ.C15854t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Ltw/r;", "Ltw/q;", "", "applicationVersionCode", "", "applicationVersionName", "<init>", "(ILjava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getUserAgent", "b", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f56794b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f56795a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Ltw/r$a;", "", "<init>", "()V", "", "USER_AGENT_APPLICATION_NAME", "Ljava/lang/String;", "USER_AGENT_ANDROID_REG_EXP", "", "SEMVER_GROUPS_COUNT", "I", "DEPRECATED_VERSION_NAME_PREFIX", "networkservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r(int i10, String str) {
        C17542s.j(str, "applicationVersionName");
        if (i10 <= 0) {
            throw new IllegalStateException("applicationVersionCode must be greater than 0");
        } else if (str.length() > 0) {
            if (C15854t.X0(str, new char[]{'.'}, false, 0, 6, (Object) null).size() != 3) {
                throw new IllegalStateException(("Version name was wrongly formatted: " + str).toString());
            } else if (!C15854t.d0(str, "IKEA-", false, 2, (Object) null)) {
                this.f56795a = C15854t.z1("IKEA App/" + str + "-" + i10 + " (Android)").toString();
            } else {
                throw new IllegalStateException("Version name contains deprecated prefix");
            }
        } else {
            throw new IllegalStateException("applicationVersionName must not be empty");
        }
    }

    public String a() {
        return this.f56795a;
    }
}
