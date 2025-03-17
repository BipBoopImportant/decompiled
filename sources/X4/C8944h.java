package x4;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lx4/h;", "", "", "destinationId", "Lx4/C;", "navOptions", "Landroid/os/Bundle;", "defaultArguments", "<init>", "(ILx4/C;Landroid/os/Bundle;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "Lx4/C;", "c", "()Lx4/C;", "e", "(Lx4/C;)V", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "d", "(Landroid/os/Bundle;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.h  reason: case insensitive filesystem */
public final class C8944h {

    /* renamed from: a  reason: collision with root package name */
    private final int f57503a;

    /* renamed from: b  reason: collision with root package name */
    private C f57504b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f57505c;

    public C8944h(int i10, C c10, Bundle bundle) {
        this.f57503a = i10;
        this.f57504b = c10;
        this.f57505c = bundle;
    }

    public final Bundle a() {
        return this.f57505c;
    }

    public final int b() {
        return this.f57503a;
    }

    public final C c() {
        return this.f57504b;
    }

    public final void d(Bundle bundle) {
        this.f57505c = bundle;
    }

    public final void e(C c10) {
        this.f57504b = c10;
    }

    public boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8944h)) {
            return false;
        }
        C8944h hVar = (C8944h) obj;
        if (this.f57503a == hVar.f57503a && C17542s.e(this.f57504b, hVar.f57504b)) {
            if (C17542s.e(this.f57505c, hVar.f57505c)) {
                return true;
            }
            Bundle bundle = this.f57505c;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                Iterable<String> iterable = keySet;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return true;
                }
                for (String str : iterable) {
                    Bundle bundle2 = this.f57505c;
                    Object obj2 = null;
                    Object obj3 = bundle2 != null ? bundle2.get(str) : null;
                    Bundle bundle3 = hVar.f57505c;
                    if (bundle3 != null) {
                        obj2 = bundle3.get(str);
                    }
                    if (!C17542s.e(obj3, obj2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f57503a) * 31;
        C c10 = this.f57504b;
        int hashCode2 = hashCode + (c10 != null ? c10.hashCode() : 0);
        Bundle bundle = this.f57505c;
        if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
            for (String str : keySet) {
                int i10 = hashCode2 * 31;
                Bundle bundle2 = this.f57505c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C8944h.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f57503a));
        sb2.append(")");
        if (this.f57504b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f57504b);
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8944h(int i10, C c10, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : c10, (i11 & 4) != 0 ? null : bundle);
    }
}
