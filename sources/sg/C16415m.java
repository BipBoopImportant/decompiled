package SG;

import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LSG/m;", "", "", "LSG/b;", "colors", "selectedColor", "<init>", "(Ljava/util/List;LSG/b;)V", "a", "(Ljava/util/List;LSG/b;)LSG/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "LSG/b;", "c", "()LSG/b;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SG.m  reason: case insensitive filesystem */
public final class C16415m {

    /* renamed from: a  reason: collision with root package name */
    private final List<C16404b> f138253a;

    /* renamed from: b  reason: collision with root package name */
    private final C16404b f138254b;

    public C16415m() {
        this((List) null, (C16404b) null, 3, (DefaultConstructorMarker) null);
    }

    public final C16415m a(List<C16404b> list, C16404b bVar) {
        C17542s.j(list, "colors");
        return new C16415m(list, bVar);
    }

    public final List<C16404b> b() {
        return this.f138253a;
    }

    public final C16404b c() {
        return this.f138254b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16415m)) {
            return false;
        }
        C16415m mVar = (C16415m) obj;
        return C17542s.e(this.f138253a, mVar.f138253a) && C17542s.e(this.f138254b, mVar.f138254b);
    }

    public int hashCode() {
        int hashCode = this.f138253a.hashCode() * 31;
        C16404b bVar = this.f138254b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        List<C16404b> list = this.f138253a;
        C16404b bVar = this.f138254b;
        return "HelaWallColorToolbarUIState(colors=" + list + ", selectedColor=" + bVar + ")";
    }

    public C16415m(List<C16404b> list, C16404b bVar) {
        C17542s.j(list, "colors");
        this.f138253a = list;
        this.f138254b = bVar;
    }

    public /* synthetic */ C16415m(List list, C16404b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        C16415m mVar;
        C16404b bVar2;
        if ((i10 & 1) != 0) {
            list2 = C16877v.q(new C16404b((String) null, (String) null, false, true, 6, (DefaultConstructorMarker) null), new C16404b("#F2F1ED", "color1", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#D1C8BB", "color2", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#E3D4CA", "color3", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#C39757", "color4", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#8D5544", "color5", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#BDCACD", "color6", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#7D9BA3", "color7", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#B1B8A7", "color8", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#84837E", "color9", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#958277", "color10", false, false, 12, (DefaultConstructorMarker) null), new C16404b("#75586C", "color11", false, false, 12, (DefaultConstructorMarker) null));
        } else {
            list2 = list;
        }
        if ((i10 & 2) != 0) {
            bVar2 = null;
            mVar = this;
        } else {
            mVar = this;
            bVar2 = bVar;
        }
        new C16415m(list2, bVar2);
    }
}
