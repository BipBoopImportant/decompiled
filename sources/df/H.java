package DF;

import OE.C13316h;
import OE.n;
import com.sugarcube.app.base.ui.gallery.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"LDF/H;", "", "Lcom/sugarcube/app/base/ui/gallery/h;", "homeTab", "<init>", "(Lcom/sugarcube/app/base/ui/gallery/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/ui/gallery/h;", "b", "()Lcom/sugarcube/app/base/ui/gallery/h;", "I", "bannerImage", "c", "title", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final h f109009a;

    /* renamed from: b  reason: collision with root package name */
    private final int f109010b;

    /* renamed from: c  reason: collision with root package name */
    private final int f109011c;

    public H(h hVar) {
        this.f109009a = hVar;
        h.c cVar = h.c.f124419e;
        int i10 = -1;
        this.f109010b = C17542s.e(hVar, cVar) ? C13316h.f112839U : C17542s.e(hVar, h.d.f124420e) ? C13316h.f112840V : C17542s.e(hVar, h.b.f124418e) ? C13316h.f112838T : -1;
        if (C17542s.e(hVar, cVar)) {
            i10 = n.f113220I4;
        } else if (C17542s.e(hVar, h.d.f124420e)) {
            i10 = n.f113256O4;
        } else if (C17542s.e(hVar, h.b.f124418e)) {
            i10 = n.f113329a5;
        }
        this.f109011c = i10;
    }

    public final int a() {
        return this.f109010b;
    }

    public final h b() {
        return this.f109009a;
    }

    public final int c() {
        return this.f109011c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && C17542s.e(this.f109009a, ((H) obj).f109009a);
    }

    public int hashCode() {
        h hVar = this.f109009a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }

    public String toString() {
        h hVar = this.f109009a;
        return "TabType(homeTab=" + hVar + ")";
    }
}
