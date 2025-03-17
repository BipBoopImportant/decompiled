package v7;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lv7/c;", "Lv7/x;", "", "expected", "received", "<init>", "(JLjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "b", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v7.c  reason: case insensitive filesystem */
public final class C8894c extends x {

    /* renamed from: b  reason: collision with root package name */
    private static final a f56930b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv7/c$a;", "", "<init>", "()V", "", "nowInSeconds", "expInSeconds", "", "b", "(JLjava/lang/Long;)Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v7.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(long j10, Long l10) {
            return "Authentication Time (auth_time) claim in the ID token indicates that too much time has passed since the last end-user authentication. Current time (" + j10 + ") is after last auth at (" + l10 + ')';
        }

        private a() {
        }
    }

    public C8894c(long j10, Long l10) {
        super(f56930b.b(j10, l10), (Throwable) null, 2, (DefaultConstructorMarker) null);
    }

    public String toString() {
        return C8894c.class.getSuperclass().getName() + ": " + getMessage();
    }
}
