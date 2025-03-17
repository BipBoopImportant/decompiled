package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"LwK/X2;", "", "LwK/Z2;", "state", "", "label", "<init>", "(LwK/Z2;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/Z2;", "c", "()LwK/Z2;", "b", "Ljava/lang/String;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class X2 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f150380c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f150381d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final X2 f150382e = new X2(Z2.Regular, (String) null);

    /* renamed from: a  reason: collision with root package name */
    private final Z2 f150383a;

    /* renamed from: b  reason: collision with root package name */
    private final String f150384b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LwK/X2$a;", "", "<init>", "()V", "LwK/X2;", "None", "LwK/X2;", "a", "()LwK/X2;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X2 a() {
            return X2.f150382e;
        }

        private a() {
        }
    }

    public X2(Z2 z22, String str) {
        C17542s.j(z22, "state");
        this.f150383a = z22;
        this.f150384b = str;
    }

    public final String b() {
        return this.f150384b;
    }

    public final Z2 c() {
        return this.f150383a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X2)) {
            return false;
        }
        X2 x22 = (X2) obj;
        return this.f150383a == x22.f150383a && C17542s.e(this.f150384b, x22.f150384b);
    }

    public int hashCode() {
        int hashCode = this.f150383a.hashCode() * 31;
        String str = this.f150384b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Z2 z22 = this.f150383a;
        String str = this.f150384b;
        return "HelperTextParams(state=" + z22 + ", label=" + str + ")";
    }
}
