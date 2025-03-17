package Qg;

import H2.e;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqv/c;", "", "a", "(Ljava/lang/String;)Z", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "LQg/a;", "b", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)LQg/a;", "IKEA_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final boolean a(String str) {
        C17542s.j(str, "$this$containsSensitiveData");
        return e.f7063j.matcher(str).find();
    }

    public static final a b(FirebaseCrashlytics firebaseCrashlytics) {
        C17542s.j(firebaseCrashlytics, "<this>");
        return new b(firebaseCrashlytics);
    }
}
