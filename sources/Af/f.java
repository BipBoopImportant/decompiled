package af;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import up.C12071a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Laf/f;", "", "", "titleRes", "descriptionRes", "Lup/a;", "toggleConsentType", "", "isClickable", "currentToggleState", "requiresDataControls", "<init>", "(IILup/a;ZZZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lup/a;", "d", "()Lup/a;", "Z", "e", "()Z", "f", "getRequiresDataControls", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final int f65300a;

    /* renamed from: b  reason: collision with root package name */
    private final int f65301b;

    /* renamed from: c  reason: collision with root package name */
    private final C12071a f65302c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f65303d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f65304e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f65305f;

    public f(int i10, int i11, C12071a aVar, boolean z10, boolean z11, boolean z12) {
        C17542s.j(aVar, "toggleConsentType");
        this.f65300a = i10;
        this.f65301b = i11;
        this.f65302c = aVar;
        this.f65303d = z10;
        this.f65304e = z11;
        this.f65305f = z12;
    }

    public final boolean a() {
        return this.f65304e;
    }

    public final int b() {
        return this.f65301b;
    }

    public final int c() {
        return this.f65300a;
    }

    public final C12071a d() {
        return this.f65302c;
    }

    public final boolean e() {
        return this.f65303d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f65300a == fVar.f65300a && this.f65301b == fVar.f65301b && C17542s.e(this.f65302c, fVar.f65302c) && this.f65303d == fVar.f65303d && this.f65304e == fVar.f65304e && this.f65305f == fVar.f65305f;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f65300a) * 31) + Integer.hashCode(this.f65301b)) * 31) + this.f65302c.hashCode()) * 31) + Boolean.hashCode(this.f65303d)) * 31) + Boolean.hashCode(this.f65304e)) * 31) + Boolean.hashCode(this.f65305f);
    }

    public String toString() {
        int i10 = this.f65300a;
        int i11 = this.f65301b;
        C12071a aVar = this.f65302c;
        boolean z10 = this.f65303d;
        boolean z11 = this.f65304e;
        boolean z12 = this.f65305f;
        return "DataPreferenceToggleDelegateModel(titleRes=" + i10 + ", descriptionRes=" + i11 + ", toggleConsentType=" + aVar + ", isClickable=" + z10 + ", currentToggleState=" + z11 + ", requiresDataControls=" + z12 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11, C12071a aVar, boolean z10, boolean z11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, aVar, (i12 & 8) != 0 ? true : z10, z11, (i12 & 32) != 0 ? true : z12);
    }
}
