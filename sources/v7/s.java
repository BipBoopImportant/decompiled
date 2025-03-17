package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lv7/s;", "Lv7/x;", "", "expected", "received", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "b", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s extends x {

    /* renamed from: b  reason: collision with root package name */
    private static final a f56946b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv7/s$a;", "", "<init>", "()V", "", "expected", "received", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(String str, String str2) {
            return "Organization Name (org_name) claim mismatch in the ID token; expected \"" + str + "\", found \"" + str2 + '\"';
        }

        private a() {
        }
    }

    public s(String str, String str2) {
        super(f56946b.b(str, str2), (Throwable) null, 2, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return s.class.getSuperclass().getName() + ": " + getMessage();
    }
}
