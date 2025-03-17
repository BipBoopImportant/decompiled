package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lv7/f;", "Lv7/x;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "b", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v7.f  reason: case insensitive filesystem */
public final class C8897f extends x {

    /* renamed from: b  reason: collision with root package name */
    private static final a f56933b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv7/f$a;", "", "<init>", "()V", "", "MESSAGE", "Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v7.f$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C8897f() {
        super("Authorized Party (azp) claim must be a string present in the ID token when Audience (aud) claim has multiple values", (Throwable) null, 2, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return C8897f.class.getSuperclass().getName() + ": " + getMessage();
    }
}
