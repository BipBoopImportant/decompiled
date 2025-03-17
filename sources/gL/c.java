package Gl;

import KJ.C15987c;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import ow.f;
import uI.C18055d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R!\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0\u001d8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b#\u0010 ¨\u0006%"}, d2 = {"LGl/c;", "", "LKJ/c;", "Low/f;", "tabs", "", "selectedIndex", "<init>", "(LKJ/c;I)V", "tab", "", "g", "(Low/f;)Z", "a", "(LKJ/c;I)LGl/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LKJ/c;", "e", "()LKJ/c;", "b", "I", "d", "", "c", "Ljava/util/List;", "()Ljava/util/List;", "routes", "LuI/d;", "f", "typeSafeRoutes", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<f> f81155a;

    /* renamed from: b  reason: collision with root package name */
    private final int f81156b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f81157c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C18055d<?>> f81158d;

    public c(C15987c<? extends f> cVar, int i10) {
        C17542s.j(cVar, "tabs");
        this.f81155a = cVar;
        this.f81156b = i10;
        ArrayList<f> arrayList = new ArrayList<>();
        for (T next : cVar) {
            if (((f) next).c() == null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (f a10 : arrayList) {
            arrayList2.add(a10.a());
        }
        this.f81157c = arrayList2;
        C15987c<f> cVar2 = this.f81155a;
        ArrayList arrayList3 = new ArrayList();
        for (f c10 : cVar2) {
            Object c11 = c10.c();
            C18055d b10 = c11 != null ? P.b(c11.getClass()) : null;
            if (b10 != null) {
                arrayList3.add(b10);
            }
        }
        this.f81158d = arrayList3;
    }

    public static /* synthetic */ c b(c cVar, C15987c<f> cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = cVar.f81155a;
        }
        if ((i11 & 2) != 0) {
            i10 = cVar.f81156b;
        }
        return cVar.a(cVar2, i10);
    }

    public final c a(C15987c<? extends f> cVar, int i10) {
        C17542s.j(cVar, "tabs");
        return new c(cVar, i10);
    }

    public final List<String> c() {
        return this.f81157c;
    }

    public final int d() {
        return this.f81156b;
    }

    public final C15987c<f> e() {
        return this.f81155a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f81155a, cVar.f81155a) && this.f81156b == cVar.f81156b;
    }

    public final List<C18055d<?>> f() {
        return this.f81158d;
    }

    public final boolean g(f fVar) {
        C17542s.j(fVar, "tab");
        return this.f81155a.indexOf(fVar) == this.f81156b;
    }

    public int hashCode() {
        return (this.f81155a.hashCode() * 31) + Integer.hashCode(this.f81156b);
    }

    public String toString() {
        C15987c<f> cVar = this.f81155a;
        int i10 = this.f81156b;
        return "UiState(tabs=" + cVar + ", selectedIndex=" + i10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(C15987c cVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i11 & 2) != 0 ? -1 : i10);
    }
}
