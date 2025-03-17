package cf;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lcf/z;", "Lcf/m;", "", "url", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "", "()I", "preferredPositionInList", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f65768a;

    /* renamed from: b  reason: collision with root package name */
    private final String f65769b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(String str, String str2) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "url");
        C17542s.j(str2, "description");
        this.f65768a = str;
        this.f65769b = str2;
    }

    public int a() {
        return o.IMPRESSUM.ordinal();
    }

    public String b() {
        return this.f65769b;
    }

    public String c() {
        return this.f65768a;
    }
}
