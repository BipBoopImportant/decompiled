package DF;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"LDF/g;", "", "Ljava/util/UUID;", "sceneUuid", "", "isSelected", "isHighlighted", "<init>", "(Ljava/util/UUID;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "setSceneUuid", "(Ljava/util/UUID;)V", "b", "Z", "c", "()Z", "setSelected", "(Z)V", "setHighlighted", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.g  reason: case insensitive filesystem */
public final class C12790g {

    /* renamed from: a  reason: collision with root package name */
    private UUID f109037a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f109038b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f109039c;

    public C12790g(UUID uuid, boolean z10, boolean z11) {
        C17542s.j(uuid, "sceneUuid");
        this.f109037a = uuid;
        this.f109038b = z10;
        this.f109039c = z11;
    }

    public final UUID a() {
        return this.f109037a;
    }

    public final boolean b() {
        return this.f109039c;
    }

    public final boolean c() {
        return this.f109038b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12790g)) {
            return false;
        }
        C12790g gVar = (C12790g) obj;
        return C17542s.e(this.f109037a, gVar.f109037a) && this.f109038b == gVar.f109038b && this.f109039c == gVar.f109039c;
    }

    public int hashCode() {
        return (((this.f109037a.hashCode() * 31) + Boolean.hashCode(this.f109038b)) * 31) + Boolean.hashCode(this.f109039c);
    }

    public String toString() {
        UUID uuid = this.f109037a;
        boolean z10 = this.f109038b;
        boolean z11 = this.f109039c;
        return "GallerySelectionDetails(sceneUuid=" + uuid + ", isSelected=" + z10 + ", isHighlighted=" + z11 + ")";
    }
}
