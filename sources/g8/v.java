package G8;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J!\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u0011\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"LG8/v;", "", "<init>", "()V", "", "appId", "e", "(Ljava/lang/String;)Ljava/lang/String;", "endpoint", "a", "buildType", "b", "f", "", "isQA", "c", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "getProjectConfigUrl", "()Ljava/lang/String;", "setProjectConfigUrl", "(Ljava/lang/String;)V", "getProjectConfigUrl$annotations", "projectConfigUrl", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f36295a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static String f36296b = "https://mobile-production.content-square.net/android/config/v2/";

    private v() {
    }

    public static final String a(String str) {
        C17542s.j(str, "endpoint");
        return str + "/mobile/v2/events";
    }

    public static final String b(String str) {
        C17542s.j(str, "buildType");
        return !C17542s.e(str, "release") ? "https://dc-monitor-staging-eu-west-1.csq.io/log/android" : "https://l.contentsquare.net/log/android";
    }

    public static /* synthetic */ String d(v vVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "release";
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return vVar.c(str, z10);
    }

    public static final String e(String str) {
        C17542s.j(str, "appId");
        return f36296b + str + ".json";
    }

    public final String c(String str, boolean z10) {
        C17542s.j(str, "buildType");
        return z10 ? "https://qa-mock-server.contentsquare.net/log/sdkmetric" : !C17542s.e(str, "release") ? "https://dc-monitor-staging-eu-west-1.csq.io/log/sdkmetric" : "https://l.contentsquare.net/log/sdkmetric";
    }

    public final String f(String str) {
        C17542s.j(str, "endpoint");
        return str + "/snapshots/v2/snapshot";
    }
}
