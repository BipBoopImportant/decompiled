package kF;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.C5942c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LkF/y;", "", "Lt1/c;", "painter", "", "contentDescription", "", "aspectRatio", "<init>", "(Lt1/c;Ljava/lang/String;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt1/c;", "c", "()Lt1/c;", "b", "Ljava/lang/String;", "F", "()F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.y  reason: case insensitive filesystem */
public final class C14729y {

    /* renamed from: a  reason: collision with root package name */
    private final C5942c f128875a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128876b;

    /* renamed from: c  reason: collision with root package name */
    private final float f128877c;

    public C14729y(C5942c cVar, String str, float f10) {
        C17542s.j(cVar, PlaceTypes.PAINTER);
        this.f128875a = cVar;
        this.f128876b = str;
        this.f128877c = f10;
    }

    public final float a() {
        return this.f128877c;
    }

    public final String b() {
        return this.f128876b;
    }

    public final C5942c c() {
        return this.f128875a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14729y)) {
            return false;
        }
        C14729y yVar = (C14729y) obj;
        return C17542s.e(this.f128875a, yVar.f128875a) && C17542s.e(this.f128876b, yVar.f128876b) && Float.compare(this.f128877c, yVar.f128877c) == 0;
    }

    public int hashCode() {
        int hashCode = this.f128875a.hashCode() * 31;
        String str = this.f128876b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.f128877c);
    }

    public String toString() {
        C5942c cVar = this.f128875a;
        String str = this.f128876b;
        float f10 = this.f128877c;
        return "ImageParams(painter=" + cVar + ", contentDescription=" + str + ", aspectRatio=" + f10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14729y(C5942c cVar, String str, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str, (i10 & 4) != 0 ? 1.7777778f : f10);
    }
}
