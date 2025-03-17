package v7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lv7/i;", "Lv7/x;", "", "tokenAlgorithm", "", "supportedAlgorithms", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "b", "a", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v7.i  reason: case insensitive filesystem */
public final class C8900i extends x {

    /* renamed from: b  reason: collision with root package name */
    private static final a f56936b = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv7/i$a;", "", "<init>", "()V", "", "tokenAlgorithm", "", "supportedAlgorithms", "b", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v7.i$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String b(String str, List<String> list) {
            if (list.size() == 1) {
                return "Signature algorithm of \"" + str + "\" is not supported. Expected the ID token to be signed with " + list.get(0) + '.';
            }
            return "Signature algorithm of \"" + str + "\" is not supported. Expected the ID token to be signed with any of " + list + '.';
        }

        private a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8900i(String str, List<String> list) {
        super(f56936b.b(str, list), (Throwable) null, 2, (DefaultConstructorMarker) null);
        C17542s.j(str, "tokenAlgorithm");
        C17542s.j(list, "supportedAlgorithms");
    }

    public String toString() {
        return C8900i.class.getSuperclass().getName() + ": " + getMessage();
    }
}
