package Ds;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LDs/C;", "", "", "LDs/y;", "notificationSettings", "", "hasNotificationsPermission", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C {

    /* renamed from: a  reason: collision with root package name */
    private final List<y> f80171a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f80172b;

    public C() {
        this((List) null, false, 3, (DefaultConstructorMarker) null);
    }

    public final boolean a() {
        return this.f80172b;
    }

    public final List<y> b() {
        return this.f80171a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        return C17542s.e(this.f80171a, c10.f80171a) && this.f80172b == c10.f80172b;
    }

    public int hashCode() {
        return (this.f80171a.hashCode() * 31) + Boolean.hashCode(this.f80172b);
    }

    public String toString() {
        List<y> list = this.f80171a;
        boolean z10 = this.f80172b;
        return "NotificationSettingsUiState(notificationSettings=" + list + ", hasNotificationsPermission=" + z10 + ")";
    }

    public C(List<y> list, boolean z10) {
        C17542s.j(list, "notificationSettings");
        this.f80171a = list;
        this.f80172b = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? false : z10);
    }
}
