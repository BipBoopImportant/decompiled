package kp;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lkp/i;", "", "", "url", "contentDescription", "id", "Lkp/i$a;", "type", "Lkp/j;", "source", "", "aspectRatio", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkp/i$a;Lkp/j;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "Lkp/i$a;", "()Lkp/i$a;", "Lkp/j;", "()Lkp/j;", "f", "Ljava/lang/Double;", "getAspectRatio", "()Ljava/lang/Double;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f99063a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99064b;

    /* renamed from: c  reason: collision with root package name */
    private final String f99065c;

    /* renamed from: d  reason: collision with root package name */
    private final a f99066d;

    /* renamed from: e  reason: collision with root package name */
    private final j f99067e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f99068f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkp/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "USER_CONTENT", "VIDEO", "SHOPPABLE", "REGULAR", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        USER_CONTENT,
        VIDEO,
        SHOPPABLE,
        REGULAR;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public i(String str, String str2, String str3, a aVar, j jVar, Double d10) {
        C17542s.j(str, "url");
        C17542s.j(str2, "contentDescription");
        C17542s.j(str3, "id");
        C17542s.j(aVar, "type");
        this.f99063a = str;
        this.f99064b = str2;
        this.f99065c = str3;
        this.f99066d = aVar;
        this.f99067e = jVar;
        this.f99068f = d10;
    }

    public final String a() {
        return this.f99064b;
    }

    public final String b() {
        return this.f99065c;
    }

    public final j c() {
        return this.f99067e;
    }

    public final a d() {
        return this.f99066d;
    }

    public final String e() {
        return this.f99063a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C17542s.e(this.f99063a, iVar.f99063a) && C17542s.e(this.f99064b, iVar.f99064b) && C17542s.e(this.f99065c, iVar.f99065c) && this.f99066d == iVar.f99066d && C17542s.e(this.f99067e, iVar.f99067e) && C17542s.e(this.f99068f, iVar.f99068f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f99063a.hashCode() * 31) + this.f99064b.hashCode()) * 31) + this.f99065c.hashCode()) * 31) + this.f99066d.hashCode()) * 31;
        j jVar = this.f99067e;
        int i10 = 0;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Double d10 = this.f99068f;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f99063a;
        String str2 = this.f99064b;
        String str3 = this.f99065c;
        a aVar = this.f99066d;
        j jVar = this.f99067e;
        Double d10 = this.f99068f;
        return "ReferenceMedia(url=" + str + ", contentDescription=" + str2 + ", id=" + str3 + ", type=" + aVar + ", source=" + jVar + ", aspectRatio=" + d10 + ")";
    }
}
