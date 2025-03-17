package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lv7/u;", "Lv7/x;", "", "keyId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "b", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u extends x {

    /* renamed from: b  reason: collision with root package name */
    private static final a f56948b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv7/u$a;", "", "<init>", "()V", "", "keyId", "b", "(Ljava/lang/String;)Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(String str) {
            return "Could not find a public key for kid \"" + str + '\"';
        }

        private a() {
        }
    }

    public u(String str) {
        super(f56948b.b(str), (Throwable) null, 2, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return u.class.getSuperclass().getName() + ": " + getMessage();
    }
}
