package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.Y0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"LSC/Z;", "", "", "characterLimit", "", "accessibilityCharacterLimitMessage", "<init>", "(ILjava/lang/String;)V", "LwK/Y0;", "b", "()LwK/Y0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCharacterLimit", "Ljava/lang/String;", "getAccessibilityCharacterLimitMessage", "c", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Z {

    /* renamed from: c  reason: collision with root package name */
    public static final a f116083c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final Z f116084d = new Z(0, (String) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f116085a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116086b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSC/Z$a;", "", "<init>", "()V", "LSC/Z;", "None", "LSC/Z;", "a", "()LSC/Z;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Z a() {
            return Z.f116084d;
        }

        private a() {
        }
    }

    public Z(int i10, String str) {
        this.f116085a = i10;
        this.f116086b = str;
    }

    public final Y0 b() {
        return new Y0(this.f116085a, this.f116086b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        return this.f116085a == z10.f116085a && C17542s.e(this.f116086b, z10.f116086b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f116085a) * 31;
        String str = this.f116086b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i10 = this.f116085a;
        String str = this.f116086b;
        return "SkapaCharacterCounterParams(characterLimit=" + i10 + ", accessibilityCharacterLimitMessage=" + str + ")";
    }
}
