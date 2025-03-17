package v7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lv7/a;", "Lv7/x;", "", "expected", "", "received", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "b", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v7.a  reason: case insensitive filesystem */
public final class C8892a extends x {

    /* renamed from: b  reason: collision with root package name */
    private static final C0916a f56928b = new C0916a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv7/a$a;", "", "<init>", "()V", "", "expected", "", "received", "b", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v7.a$a  reason: collision with other inner class name */
    private static final class C0916a {
        public /* synthetic */ C0916a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(String str, List<String> list) {
            return "Audience (aud) claim mismatch in the ID token; expected \"" + str + "\" but was not one of \"" + list + '\"';
        }

        private C0916a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8892a(String str, List<String> list) {
        super(f56928b.b(str, list), (Throwable) null, 2, (DefaultConstructorMarker) null);
        C17542s.j(str, "expected");
        C17542s.j(list, "received");
    }

    public String toString() {
        return C8892a.class.getSuperclass().getName() + ": " + getMessage();
    }
}
