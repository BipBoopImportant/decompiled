package nF;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0018\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"LnF/a;", "", "", "id", "title", "LnF/d;", "media", "body", "icon", "secondaryId", "<init>", "(Ljava/lang/String;Ljava/lang/String;LnF/d;Ljava/lang/String;LnF/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "f", "LnF/d;", "d", "()LnF/d;", "e", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nF.a  reason: case insensitive filesystem */
public final class C14850a {

    /* renamed from: a  reason: collision with root package name */
    private final String f129807a;

    /* renamed from: b  reason: collision with root package name */
    private final String f129808b;

    /* renamed from: c  reason: collision with root package name */
    private final C14853d f129809c;

    /* renamed from: d  reason: collision with root package name */
    private final String f129810d;

    /* renamed from: e  reason: collision with root package name */
    private final C14853d f129811e;

    /* renamed from: f  reason: collision with root package name */
    private final String f129812f;

    public C14850a(String str, String str2, C14853d dVar, String str3, C14853d dVar2, String str4) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        C17542s.j(dVar, "media");
        this.f129807a = str;
        this.f129808b = str2;
        this.f129809c = dVar;
        this.f129810d = str3;
        this.f129811e = dVar2;
        this.f129812f = str4;
    }

    public final String a() {
        return this.f129810d;
    }

    public final C14853d b() {
        return this.f129811e;
    }

    public final String c() {
        return this.f129807a;
    }

    public final C14853d d() {
        return this.f129809c;
    }

    public final String e() {
        return this.f129812f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14850a)) {
            return false;
        }
        C14850a aVar = (C14850a) obj;
        return C17542s.e(this.f129807a, aVar.f129807a) && C17542s.e(this.f129808b, aVar.f129808b) && C17542s.e(this.f129809c, aVar.f129809c) && C17542s.e(this.f129810d, aVar.f129810d) && C17542s.e(this.f129811e, aVar.f129811e) && C17542s.e(this.f129812f, aVar.f129812f);
    }

    public final String f() {
        return this.f129808b;
    }

    public int hashCode() {
        int hashCode = ((((this.f129807a.hashCode() * 31) + this.f129808b.hashCode()) * 31) + this.f129809c.hashCode()) * 31;
        String str = this.f129810d;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C14853d dVar = this.f129811e;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str2 = this.f129812f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f129807a;
        String str2 = this.f129808b;
        C14853d dVar = this.f129809c;
        String str3 = this.f129810d;
        C14853d dVar2 = this.f129811e;
        String str4 = this.f129812f;
        return "CarouselItem(id=" + str + ", title=" + str2 + ", media=" + dVar + ", body=" + str3 + ", icon=" + dVar2 + ", secondaryId=" + str4 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14850a(String str, String str2, C14853d dVar, String str3, C14853d dVar2, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dVar, str3, (i10 & 16) != 0 ? null : dVar2, (i10 & 32) != 0 ? null : str4);
    }
}
