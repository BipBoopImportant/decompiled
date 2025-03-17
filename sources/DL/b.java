package Dl;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import uK.C18146a;
import xB.C15201a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"LDl/b;", "LxB/a;", "", "id", "contentDescription", "imageUrl", "", "fallbackImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "g", "c", "i", "d", "I", "h", "", "e", "J", "f", "()J", "stableId", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C15201a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f79786f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f79787a;

    /* renamed from: b  reason: collision with root package name */
    private final String f79788b;

    /* renamed from: c  reason: collision with root package name */
    private final String f79789c;

    /* renamed from: d  reason: collision with root package name */
    private final int f79790d;

    /* renamed from: e  reason: collision with root package name */
    private final long f79791e;

    public b(String str, String str2, String str3, int i10) {
        C17542s.j(str, "id");
        this.f79787a = str;
        this.f79788b = str2;
        this.f79789c = str3;
        this.f79790d = i10;
        Object[] objArr = {str2, str3};
        U u10 = new U(3);
        u10.a(P.b(b.class));
        u10.a(str);
        u10.b(objArr);
        this.f79791e = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f79787a, bVar.f79787a) && C17542s.e(this.f79788b, bVar.f79788b) && C17542s.e(this.f79789c, bVar.f79789c) && this.f79790d == bVar.f79790d;
    }

    public long f() {
        return this.f79791e;
    }

    public final String g() {
        return this.f79788b;
    }

    public final String getId() {
        return this.f79787a;
    }

    public final int h() {
        return this.f79790d;
    }

    public int hashCode() {
        int hashCode = this.f79787a.hashCode() * 31;
        String str = this.f79788b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f79789c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Integer.hashCode(this.f79790d);
    }

    public final String i() {
        return this.f79789c;
    }

    public String toString() {
        String str = this.f79787a;
        String str2 = this.f79788b;
        String str3 = this.f79789c;
        int i10 = this.f79790d;
        return "HorizontalImageContentData(id=" + str + ", contentDescription=" + str2 + ", imageUrl=" + str3 + ", fallbackImage=" + i10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? C18146a.f148160N5 : i10);
    }
}
