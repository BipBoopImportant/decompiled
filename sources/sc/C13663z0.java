package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wK.X2;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001b"}, d2 = {"LSC/z0;", "", "LSC/A0;", "state", "", "label", "<init>", "(LSC/A0;Ljava/lang/String;)V", "LwK/X2;", "b", "()LwK/X2;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSC/A0;", "getState", "()LSC/A0;", "Ljava/lang/String;", "getLabel", "c", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.z0  reason: case insensitive filesystem */
public final class C13663z0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f116515c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f116516d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C13663z0 f116517e = new C13663z0(A0.Regular, (String) null);

    /* renamed from: a  reason: collision with root package name */
    private final A0 f116518a;

    /* renamed from: b  reason: collision with root package name */
    private final String f116519b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSC/z0$a;", "", "<init>", "()V", "LSC/z0;", "None", "LSC/z0;", "a", "()LSC/z0;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.z0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13663z0 a() {
            return C13663z0.f116517e;
        }

        private a() {
        }
    }

    public C13663z0(A0 a02, String str) {
        C17542s.j(a02, "state");
        this.f116518a = a02;
        this.f116519b = str;
    }

    public final X2 b() {
        return new X2(this.f116518a.b(), this.f116519b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13663z0)) {
            return false;
        }
        C13663z0 z0Var = (C13663z0) obj;
        return this.f116518a == z0Var.f116518a && C17542s.e(this.f116519b, z0Var.f116519b);
    }

    public int hashCode() {
        int hashCode = this.f116518a.hashCode() * 31;
        String str = this.f116519b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        A0 a02 = this.f116518a;
        String str = this.f116519b;
        return "SkapaHelperTextParams(state=" + a02 + ", label=" + str + ")";
    }
}
