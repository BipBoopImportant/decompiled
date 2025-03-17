package sl;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u001b"}, d2 = {"Lsl/g;", "", "", "badge", "title", "description", "imageUrl", "imageContentDescription", "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "d", "e", "uicomposables_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sl.g  reason: case insensitive filesystem */
public final class C11867g {

    /* renamed from: g  reason: collision with root package name */
    public static final int f102472g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f102473a;

    /* renamed from: b  reason: collision with root package name */
    private final String f102474b;

    /* renamed from: c  reason: collision with root package name */
    private final String f102475c;

    /* renamed from: d  reason: collision with root package name */
    private final String f102476d;

    /* renamed from: e  reason: collision with root package name */
    private final String f102477e;

    /* renamed from: f  reason: collision with root package name */
    private final String f102478f;

    public C11867g(String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(str, "badge");
        C17542s.j(str2, "title");
        C17542s.j(str3, "description");
        C17542s.j(str4, "imageUrl");
        C17542s.j(str6, "buttonText");
        this.f102473a = str;
        this.f102474b = str2;
        this.f102475c = str3;
        this.f102476d = str4;
        this.f102477e = str5;
        this.f102478f = str6;
    }

    public final String a() {
        return this.f102473a;
    }

    public final String b() {
        return this.f102478f;
    }

    public final String c() {
        return this.f102475c;
    }

    public final String d() {
        return this.f102477e;
    }

    public final String e() {
        return this.f102476d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11867g)) {
            return false;
        }
        C11867g gVar = (C11867g) obj;
        return C17542s.e(this.f102473a, gVar.f102473a) && C17542s.e(this.f102474b, gVar.f102474b) && C17542s.e(this.f102475c, gVar.f102475c) && C17542s.e(this.f102476d, gVar.f102476d) && C17542s.e(this.f102477e, gVar.f102477e) && C17542s.e(this.f102478f, gVar.f102478f);
    }

    public final String f() {
        return this.f102474b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f102473a.hashCode() * 31) + this.f102474b.hashCode()) * 31) + this.f102475c.hashCode()) * 31) + this.f102476d.hashCode()) * 31;
        String str = this.f102477e;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f102478f.hashCode();
    }

    public String toString() {
        String str = this.f102473a;
        String str2 = this.f102474b;
        String str3 = this.f102475c;
        String str4 = this.f102476d;
        String str5 = this.f102477e;
        String str6 = this.f102478f;
        return "DataContent(badge=" + str + ", title=" + str2 + ", description=" + str3 + ", imageUrl=" + str4 + ", imageContentDescription=" + str5 + ", buttonText=" + str6 + ")";
    }
}
