package UI;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: UI.h  reason: case insensitive filesystem */
public final class C16587h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f139036e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C16587h f139037f = new C16587h((C16590k) null, (C16588i) null, false, false, 8, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C16590k f139038a;

    /* renamed from: b  reason: collision with root package name */
    private final C16588i f139039b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f139040c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f139041d;

    /* renamed from: UI.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16587h a() {
            return C16587h.f139037f;
        }

        private a() {
        }
    }

    public C16587h(C16590k kVar, C16588i iVar, boolean z10, boolean z11) {
        this.f139038a = kVar;
        this.f139039b = iVar;
        this.f139040c = z10;
        this.f139041d = z11;
    }

    public static /* synthetic */ C16587h c(C16587h hVar, C16590k kVar, C16588i iVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = hVar.f139038a;
        }
        if ((i10 & 2) != 0) {
            iVar = hVar.f139039b;
        }
        if ((i10 & 4) != 0) {
            z10 = hVar.f139040c;
        }
        if ((i10 & 8) != 0) {
            z11 = hVar.f139041d;
        }
        return hVar.b(kVar, iVar, z10, z11);
    }

    public final C16587h b(C16590k kVar, C16588i iVar, boolean z10, boolean z11) {
        return new C16587h(kVar, iVar, z10, z11);
    }

    public final boolean d() {
        return this.f139040c;
    }

    public final C16588i e() {
        return this.f139039b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16587h)) {
            return false;
        }
        C16587h hVar = (C16587h) obj;
        return this.f139038a == hVar.f139038a && this.f139039b == hVar.f139039b && this.f139040c == hVar.f139040c && this.f139041d == hVar.f139041d;
    }

    public final C16590k f() {
        return this.f139038a;
    }

    public final boolean g() {
        return this.f139041d;
    }

    public int hashCode() {
        C16590k kVar = this.f139038a;
        int i10 = 0;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        C16588i iVar = this.f139039b;
        if (iVar != null) {
            i10 = iVar.hashCode();
        }
        return ((((hashCode + i10) * 31) + Boolean.hashCode(this.f139040c)) * 31) + Boolean.hashCode(this.f139041d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f139038a + ", mutability=" + this.f139039b + ", definitelyNotNull=" + this.f139040c + ", isNullabilityQualifierForWarning=" + this.f139041d + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16587h(C16590k kVar, C16588i iVar, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, iVar, z10, (i10 & 8) != 0 ? false : z11);
    }
}
