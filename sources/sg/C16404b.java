package SG;

import android.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010 \u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001f¨\u0006!"}, d2 = {"LSG/b;", "", "", "hex", "name", "", "isSelected", "isNoColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "g", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;ZZ)LSG/b;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "getName", "c", "Z", "f", "()Z", "e", "Lp1/v0;", "()J", "color", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SG.b  reason: case insensitive filesystem */
public final class C16404b {

    /* renamed from: a  reason: collision with root package name */
    private final String f138210a;

    /* renamed from: b  reason: collision with root package name */
    private final String f138211b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f138212c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f138213d;

    public C16404b(String str, String str2, boolean z10, boolean z11) {
        C17542s.j(str2, "name");
        this.f138210a = str;
        this.f138211b = str2;
        this.f138212c = z10;
        this.f138213d = z11;
    }

    public static /* synthetic */ C16404b b(C16404b bVar, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f138210a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f138211b;
        }
        if ((i10 & 4) != 0) {
            z10 = bVar.f138212c;
        }
        if ((i10 & 8) != 0) {
            z11 = bVar.f138213d;
        }
        return bVar.a(str, str2, z10, z11);
    }

    public final C16404b a(String str, String str2, boolean z10, boolean z11) {
        C17542s.j(str2, "name");
        return new C16404b(str, str2, z10, z11);
    }

    public final long c() {
        if (this.f138213d) {
            return C5747v0.f27350b.j();
        }
        String str = this.f138210a;
        if (str == null) {
            str = "#FFFFFF";
        }
        return C5751x0.b(Color.parseColor(str));
    }

    public final String d() {
        return this.f138210a;
    }

    public final boolean e() {
        return this.f138213d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16404b)) {
            return false;
        }
        C16404b bVar = (C16404b) obj;
        return C17542s.e(this.f138210a, bVar.f138210a) && C17542s.e(this.f138211b, bVar.f138211b) && this.f138212c == bVar.f138212c && this.f138213d == bVar.f138213d;
    }

    public final boolean f() {
        return this.f138212c;
    }

    public final int g() {
        if (this.f138213d) {
            return -1;
        }
        String str = this.f138210a;
        if (str == null) {
            str = "#FFFFFF";
        }
        return Color.parseColor(str);
    }

    public int hashCode() {
        String str = this.f138210a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f138211b.hashCode()) * 31) + Boolean.hashCode(this.f138212c)) * 31) + Boolean.hashCode(this.f138213d);
    }

    public String toString() {
        String str = this.f138210a;
        String str2 = this.f138211b;
        boolean z10 = this.f138212c;
        boolean z11 = this.f138213d;
        return "HelaWallColor(hex=" + str + ", name=" + str2 + ", isSelected=" + z10 + ", isNoColor=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16404b(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }
}
