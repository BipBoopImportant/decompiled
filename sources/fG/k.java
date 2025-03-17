package FG;

import FG.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"LFG/k;", "", "LFG/p$b;", "colorVariants", "LFG/p$d;", "sizeVariants", "LFG/p$a;", "bedBaseVariants", "<init>", "(LFG/p$b;LFG/p$d;LFG/p$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFG/p$b;", "b", "()LFG/p$b;", "LFG/p$d;", "c", "()LFG/p$d;", "LFG/p$a;", "()LFG/p$a;", "d", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f134359d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f134360e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final p.b f134361a;

    /* renamed from: b  reason: collision with root package name */
    private final p.d f134362b;

    /* renamed from: c  reason: collision with root package name */
    private final p.a f134363c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFG/k$a;", "", "<init>", "()V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(p.b bVar, p.d dVar, p.a aVar) {
        this.f134361a = bVar;
        this.f134362b = dVar;
        this.f134363c = aVar;
    }

    public final p.a a() {
        return this.f134363c;
    }

    public final p.b b() {
        return this.f134361a;
    }

    public final p.d c() {
        return this.f134362b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return C17542s.e(this.f134361a, kVar.f134361a) && C17542s.e(this.f134362b, kVar.f134362b) && C17542s.e(this.f134363c, kVar.f134363c);
    }

    public int hashCode() {
        p.b bVar = this.f134361a;
        int i10 = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        p.d dVar = this.f134362b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        p.a aVar = this.f134363c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        p.b bVar = this.f134361a;
        p.d dVar = this.f134362b;
        p.a aVar = this.f134363c;
        return "VariantSectionUIState(colorVariants=" + bVar + ", sizeVariants=" + dVar + ", bedBaseVariants=" + aVar + ")";
    }
}
