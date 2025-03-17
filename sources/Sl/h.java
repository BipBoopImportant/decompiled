package Sl;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"LSl/h;", "", "", "description", "url", "LSl/g;", "linkType", "<init>", "(Ljava/lang/String;Ljava/lang/String;LSl/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LSl/g;", "()LSl/g;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f87225a;

    /* renamed from: b  reason: collision with root package name */
    private final String f87226b;

    /* renamed from: c  reason: collision with root package name */
    private final g f87227c;

    public h(String str, String str2, g gVar) {
        C17542s.j(str, "description");
        C17542s.j(str2, "url");
        C17542s.j(gVar, "linkType");
        this.f87225a = str;
        this.f87226b = str2;
        this.f87227c = gVar;
    }

    public final String a() {
        return this.f87225a;
    }

    public final g b() {
        return this.f87227c;
    }

    public final String c() {
        return this.f87226b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f87225a, hVar.f87225a) && C17542s.e(this.f87226b, hVar.f87226b) && this.f87227c == hVar.f87227c;
    }

    public int hashCode() {
        return (((this.f87225a.hashCode() * 31) + this.f87226b.hashCode()) * 31) + this.f87227c.hashCode();
    }

    public String toString() {
        String str = this.f87225a;
        String str2 = this.f87226b;
        g gVar = this.f87227c;
        return "MarketLink(description=" + str + ", url=" + str2 + ", linkType=" + gVar + ")";
    }
}
