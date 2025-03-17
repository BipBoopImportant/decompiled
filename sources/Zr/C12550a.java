package zr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mp.C11588a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u0010¨\u0006\""}, d2 = {"Lzr/a;", "Lzr/b;", "", "Lmp/a;", "inspiration", "Lzr/c;", "facets", "", "requestId", "", "totalCount", "title", "prioritiser", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Ljava/lang/String;", "d", "I", "f", "e", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zr.a  reason: case insensitive filesystem */
public final class C12550a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C11588a> f107561a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f107562b;

    /* renamed from: c  reason: collision with root package name */
    private final String f107563c;

    /* renamed from: d  reason: collision with root package name */
    private final int f107564d;

    /* renamed from: e  reason: collision with root package name */
    private final String f107565e;

    /* renamed from: f  reason: collision with root package name */
    private final String f107566f;

    public C12550a(List<C11588a> list, List<c> list2, String str, int i10, String str2, String str3) {
        C17542s.j(list, "inspiration");
        C17542s.j(list2, "facets");
        C17542s.j(str, "requestId");
        this.f107561a = list;
        this.f107562b = list2;
        this.f107563c = str;
        this.f107564d = i10;
        this.f107565e = str2;
        this.f107566f = str3;
    }

    public final List<c> a() {
        return this.f107562b;
    }

    public final List<C11588a> b() {
        return this.f107561a;
    }

    public final String c() {
        return this.f107566f;
    }

    public final String d() {
        return this.f107563c;
    }

    public final String e() {
        return this.f107565e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12550a)) {
            return false;
        }
        C12550a aVar = (C12550a) obj;
        return C17542s.e(this.f107561a, aVar.f107561a) && C17542s.e(this.f107562b, aVar.f107562b) && C17542s.e(this.f107563c, aVar.f107563c) && this.f107564d == aVar.f107564d && C17542s.e(this.f107565e, aVar.f107565e) && C17542s.e(this.f107566f, aVar.f107566f);
    }

    public final int f() {
        return this.f107564d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f107561a.hashCode() * 31) + this.f107562b.hashCode()) * 31) + this.f107563c.hashCode()) * 31) + Integer.hashCode(this.f107564d)) * 31;
        String str = this.f107565e;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f107566f;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        List<C11588a> list = this.f107561a;
        List<c> list2 = this.f107562b;
        String str = this.f107563c;
        int i10 = this.f107564d;
        String str2 = this.f107565e;
        String str3 = this.f107566f;
        return "FirstInspirationFeed(inspiration=" + list + ", facets=" + list2 + ", requestId=" + str + ", totalCount=" + i10 + ", title=" + str2 + ", prioritiser=" + str3 + ")";
    }
}
