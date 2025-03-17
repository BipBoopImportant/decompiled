package VG;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mG.C17596a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"LVG/f;", "", "LKJ/c;", "LmG/a;", "viewports", "", "selectedViewportIndex", "<init>", "(LKJ/c;I)V", "a", "(LKJ/c;I)LVG/f;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LKJ/c;", "d", "()LKJ/c;", "b", "I", "c", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: VG.f  reason: case insensitive filesystem */
public final class C16653f {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<C17596a> f139299a;

    /* renamed from: b  reason: collision with root package name */
    private final int f139300b;

    public C16653f(C15987c<C17596a> cVar, int i10) {
        C17542s.j(cVar, "viewports");
        this.f139299a = cVar;
        this.f139300b = i10;
    }

    public static /* synthetic */ C16653f b(C16653f fVar, C15987c<C17596a> cVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = fVar.f139299a;
        }
        if ((i11 & 2) != 0) {
            i10 = fVar.f139300b;
        }
        return fVar.a(cVar, i10);
    }

    public final C16653f a(C15987c<C17596a> cVar, int i10) {
        C17542s.j(cVar, "viewports");
        return new C16653f(cVar, i10);
    }

    public final int c() {
        return this.f139300b;
    }

    public final C15987c<C17596a> d() {
        return this.f139299a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16653f)) {
            return false;
        }
        C16653f fVar = (C16653f) obj;
        return C17542s.e(this.f139299a, fVar.f139299a) && this.f139300b == fVar.f139300b;
    }

    public int hashCode() {
        return (this.f139299a.hashCode() * 31) + Integer.hashCode(this.f139300b);
    }

    public String toString() {
        C15987c<C17596a> cVar = this.f139299a;
        int i10 = this.f139300b;
        return "MultiviewToolbarState(viewports=" + cVar + ", selectedViewportIndex=" + i10 + ")";
    }
}
