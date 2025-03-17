package mG;

import RF.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LmG/b;", "", "", "itemId", "LRF/k;", "modelInstanceInfo", "", "canRotate", "", "rotationDegrees", "<init>", "(ILRF/k;ZF)V", "a", "(ILRF/k;ZF)LmG/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "LRF/k;", "e", "()LRF/k;", "c", "Z", "()Z", "F", "f", "()F", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mG.b  reason: case insensitive filesystem */
public final class C17597b {

    /* renamed from: a  reason: collision with root package name */
    private final int f144551a;

    /* renamed from: b  reason: collision with root package name */
    private final k f144552b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f144553c;

    /* renamed from: d  reason: collision with root package name */
    private final float f144554d;

    public C17597b(int i10, k kVar, boolean z10, float f10) {
        C17542s.j(kVar, "modelInstanceInfo");
        this.f144551a = i10;
        this.f144552b = kVar;
        this.f144553c = z10;
        this.f144554d = f10;
    }

    public static /* synthetic */ C17597b b(C17597b bVar, int i10, k kVar, boolean z10, float f10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.f144551a;
        }
        if ((i11 & 2) != 0) {
            kVar = bVar.f144552b;
        }
        if ((i11 & 4) != 0) {
            z10 = bVar.f144553c;
        }
        if ((i11 & 8) != 0) {
            f10 = bVar.f144554d;
        }
        return bVar.a(i10, kVar, z10, f10);
    }

    public final C17597b a(int i10, k kVar, boolean z10, float f10) {
        C17542s.j(kVar, "modelInstanceInfo");
        return new C17597b(i10, kVar, z10, f10);
    }

    public final boolean c() {
        return this.f144553c;
    }

    public final int d() {
        return this.f144551a;
    }

    public final k e() {
        return this.f144552b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17597b)) {
            return false;
        }
        C17597b bVar = (C17597b) obj;
        return this.f144551a == bVar.f144551a && C17542s.e(this.f144552b, bVar.f144552b) && this.f144553c == bVar.f144553c && Float.compare(this.f144554d, bVar.f144554d) == 0;
    }

    public final float f() {
        return this.f144554d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f144551a) * 31) + this.f144552b.hashCode()) * 31) + Boolean.hashCode(this.f144553c)) * 31) + Float.hashCode(this.f144554d);
    }

    public String toString() {
        int i10 = this.f144551a;
        k kVar = this.f144552b;
        boolean z10 = this.f144553c;
        float f10 = this.f144554d;
        return "SelectedInstanceInfo(itemId=" + i10 + ", modelInstanceInfo=" + kVar + ", canRotate=" + z10 + ", rotationDegrees=" + f10 + ")";
    }
}
