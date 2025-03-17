package wK;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.C5942c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LwK/v3;", "", "Lt1/c;", "painter", "", "contentDescription", "LwK/H9;", "aspectRatio", "<init>", "(Lt1/c;Ljava/lang/String;LwK/H9;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "c", "()Lt1/c;", "b", "Ljava/lang/String;", "LwK/H9;", "()LwK/H9;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.v3  reason: case insensitive filesystem */
public final class C18513v3 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f151778d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final C5942c f151779a;

    /* renamed from: b  reason: collision with root package name */
    private final String f151780b;

    /* renamed from: c  reason: collision with root package name */
    private final H9 f151781c;

    public C18513v3(C5942c cVar, String str, H9 h92) {
        C17542s.j(cVar, PlaceTypes.PAINTER);
        C17542s.j(h92, "aspectRatio");
        this.f151779a = cVar;
        this.f151780b = str;
        this.f151781c = h92;
    }

    public final H9 a() {
        return this.f151781c;
    }

    public final String b() {
        return this.f151780b;
    }

    public final C5942c c() {
        return this.f151779a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18513v3)) {
            return false;
        }
        C18513v3 v3Var = (C18513v3) obj;
        return C17542s.e(this.f151779a, v3Var.f151779a) && C17542s.e(this.f151780b, v3Var.f151780b) && this.f151781c == v3Var.f151781c;
    }

    public int hashCode() {
        int hashCode = this.f151779a.hashCode() * 31;
        String str = this.f151780b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f151781c.hashCode();
    }

    public String toString() {
        C5942c cVar = this.f151779a;
        String str = this.f151780b;
        H9 h92 = this.f151781c;
        return "ImageParams(painter=" + cVar + ", contentDescription=" + str + ", aspectRatio=" + h92 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18513v3(C5942c cVar, String str, H9 h92, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, (i10 & 4) != 0 ? H9.Ratio16by9 : h92);
    }
}
