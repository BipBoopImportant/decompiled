package Qg;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LQg/b;", "LQg/a;", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "", "throwable", "LXH/N;", "recordException", "(Ljava/lang/Throwable;)V", "", "message", "log", "(Ljava/lang/String;)V", "a", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseCrashlytics f63116a;

    public b(FirebaseCrashlytics firebaseCrashlytics) {
        C17542s.j(firebaseCrashlytics, "crashlytics");
        this.f63116a = firebaseCrashlytics;
    }

    public void log(String str) {
        C17542s.j(str, "message");
        this.f63116a.log(str);
    }

    public void recordException(Throwable th2) {
        C17542s.j(th2, "throwable");
        this.f63116a.recordException(th2);
    }
}
