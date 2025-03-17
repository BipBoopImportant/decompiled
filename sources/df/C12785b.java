package DF;

import com.sugarcube.core.network.models.Composition;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"LDF/b;", "", "Lcom/sugarcube/core/network/models/Composition;", "composition", "", "showDetails", "showShared", "<init>", "(Lcom/sugarcube/core/network/models/Composition;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/core/network/models/Composition;", "()Lcom/sugarcube/core/network/models/Composition;", "setComposition", "(Lcom/sugarcube/core/network/models/Composition;)V", "b", "Z", "()Z", "setShowDetails", "(Z)V", "c", "setShowShared", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.b  reason: case insensitive filesystem */
public final class C12785b {

    /* renamed from: a  reason: collision with root package name */
    private Composition f109015a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f109016b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f109017c;

    public C12785b(Composition composition, boolean z10, boolean z11) {
        C17542s.j(composition, "composition");
        this.f109015a = composition;
        this.f109016b = z10;
        this.f109017c = z11;
    }

    public final Composition a() {
        return this.f109015a;
    }

    public final boolean b() {
        return this.f109016b;
    }

    public final boolean c() {
        return this.f109017c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12785b)) {
            return false;
        }
        C12785b bVar = (C12785b) obj;
        return C17542s.e(this.f109015a, bVar.f109015a) && this.f109016b == bVar.f109016b && this.f109017c == bVar.f109017c;
    }

    public int hashCode() {
        return (((this.f109015a.hashCode() * 31) + Boolean.hashCode(this.f109016b)) * 31) + Boolean.hashCode(this.f109017c);
    }

    public String toString() {
        Composition composition = this.f109015a;
        boolean z10 = this.f109016b;
        boolean z11 = this.f109017c;
        return "GalleryCompositionModel(composition=" + composition + ", showDetails=" + z10 + ", showShared=" + z11 + ")";
    }
}
