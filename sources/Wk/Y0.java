package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"LwK/Y0;", "", "", "characterLimit", "", "accessibilityCharacterLimitMessage", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Y0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f150430c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f150431d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Y0 f150432e = new Y0(0, (String) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f150433a;

    /* renamed from: b  reason: collision with root package name */
    private final String f150434b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LwK/Y0$a;", "", "<init>", "()V", "LwK/Y0;", "None", "LwK/Y0;", "a", "()LwK/Y0;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Y0 a() {
            return Y0.f150432e;
        }

        private a() {
        }
    }

    public Y0(int i10, String str) {
        this.f150433a = i10;
        this.f150434b = str;
    }

    public final String b() {
        return this.f150434b;
    }

    public final int c() {
        return this.f150433a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        return this.f150433a == y02.f150433a && C17542s.e(this.f150434b, y02.f150434b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f150433a) * 31;
        String str = this.f150434b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i10 = this.f150433a;
        String str = this.f150434b;
        return "CharacterCounterParams(characterLimit=" + i10 + ", accessibilityCharacterLimitMessage=" + str + ")";
    }
}
