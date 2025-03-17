package MI;

import XH.C16822m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: MI.C  reason: case insensitive filesystem */
public final class C16042C {

    /* renamed from: d  reason: collision with root package name */
    public static final a f136266d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16042C f136267e = new C16042C(C16054O.STRICT, (C16822m) null, (C16054O) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C16054O f136268a;

    /* renamed from: b  reason: collision with root package name */
    private final C16822m f136269b;

    /* renamed from: c  reason: collision with root package name */
    private final C16054O f136270c;

    /* renamed from: MI.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16042C a() {
            return C16042C.f136267e;
        }

        private a() {
        }
    }

    public C16042C(C16054O o10, C16822m mVar, C16054O o11) {
        C17542s.j(o10, "reportLevelBefore");
        C17542s.j(o11, "reportLevelAfter");
        this.f136268a = o10;
        this.f136269b = mVar;
        this.f136270c = o11;
    }

    public final C16054O b() {
        return this.f136270c;
    }

    public final C16054O c() {
        return this.f136268a;
    }

    public final C16822m d() {
        return this.f136269b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16042C)) {
            return false;
        }
        C16042C c10 = (C16042C) obj;
        return this.f136268a == c10.f136268a && C17542s.e(this.f136269b, c10.f136269b) && this.f136270c == c10.f136270c;
    }

    public int hashCode() {
        int hashCode = this.f136268a.hashCode() * 31;
        C16822m mVar = this.f136269b;
        return ((hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31) + this.f136270c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f136268a + ", sinceVersion=" + this.f136269b + ", reportLevelAfter=" + this.f136270c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16042C(C16054O o10, C16822m mVar, C16054O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? new C16822m(1, 0) : mVar, (i10 & 4) != 0 ? o10 : o11);
    }
}
