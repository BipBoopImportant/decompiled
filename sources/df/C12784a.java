package DF;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"LDF/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "setCompositionUuid", "(Ljava/util/UUID;)V", "compositionUuid", "b", "Z", "()Z", "setShowDetails", "(Z)V", "showDetails", "c", "d", "showShared", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.a  reason: case insensitive filesystem */
public final class C12784a {

    /* renamed from: a  reason: collision with root package name */
    private UUID f109012a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f109013b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f109014c;

    public final UUID a() {
        return this.f109012a;
    }

    public final boolean b() {
        return this.f109013b;
    }

    public final boolean c() {
        return this.f109014c;
    }

    public final void d(boolean z10) {
        this.f109014c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12784a)) {
            return false;
        }
        C12784a aVar = (C12784a) obj;
        return C17542s.e(this.f109012a, aVar.f109012a) && this.f109013b == aVar.f109013b && this.f109014c == aVar.f109014c;
    }

    public int hashCode() {
        return (((this.f109012a.hashCode() * 31) + Boolean.hashCode(this.f109013b)) * 31) + Boolean.hashCode(this.f109014c);
    }

    public String toString() {
        UUID uuid = this.f109012a;
        boolean z10 = this.f109013b;
        boolean z11 = this.f109014c;
        return "GalleryCompositionDetails(compositionUuid=" + uuid + ", showDetails=" + z10 + ", showShared=" + z11 + ")";
    }
}
