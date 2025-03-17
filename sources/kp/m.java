package kp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006\""}, d2 = {"Lkp/m;", "", "", "id", "purpose", "title", "description", "", "Lkp/i;", "referenceImages", "Lkp/g;", "productCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkp/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lkp/g;", "()Lkp/g;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f99075a;

    /* renamed from: b  reason: collision with root package name */
    private final String f99076b;

    /* renamed from: c  reason: collision with root package name */
    private final String f99077c;

    /* renamed from: d  reason: collision with root package name */
    private final String f99078d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i> f99079e;

    /* renamed from: f  reason: collision with root package name */
    private final g f99080f;

    public m(String str, String str2, String str3, String str4, List<i> list, g gVar) {
        C17542s.j(str, "id");
        C17542s.j(str2, "purpose");
        C17542s.j(str3, "title");
        C17542s.j(str4, "description");
        C17542s.j(list, "referenceImages");
        this.f99075a = str;
        this.f99076b = str2;
        this.f99077c = str3;
        this.f99078d = str4;
        this.f99079e = list;
        this.f99080f = gVar;
    }

    public final String a() {
        return this.f99078d;
    }

    public final String b() {
        return this.f99075a;
    }

    public final g c() {
        return this.f99080f;
    }

    public final String d() {
        return this.f99076b;
    }

    public final List<i> e() {
        return this.f99079e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C17542s.e(this.f99075a, mVar.f99075a) && C17542s.e(this.f99076b, mVar.f99076b) && C17542s.e(this.f99077c, mVar.f99077c) && C17542s.e(this.f99078d, mVar.f99078d) && C17542s.e(this.f99079e, mVar.f99079e) && C17542s.e(this.f99080f, mVar.f99080f);
    }

    public final String f() {
        return this.f99077c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f99075a.hashCode() * 31) + this.f99076b.hashCode()) * 31) + this.f99077c.hashCode()) * 31) + this.f99078d.hashCode()) * 31) + this.f99079e.hashCode()) * 31;
        g gVar = this.f99080f;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        String str = this.f99075a;
        String str2 = this.f99076b;
        String str3 = this.f99077c;
        String str4 = this.f99078d;
        List<i> list = this.f99079e;
        g gVar = this.f99080f;
        return "VisualMessage(id=" + str + ", purpose=" + str2 + ", title=" + str3 + ", description=" + str4 + ", referenceImages=" + list + ", productCategory=" + gVar + ")";
    }
}
