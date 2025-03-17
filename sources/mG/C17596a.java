package mG;

import RF.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LmG/a;", "", "LRF/j;", "engineViewport", "", "image", "<init>", "(LRF/j;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRF/j;", "()LRF/j;", "b", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mG.a  reason: case insensitive filesystem */
public final class C17596a {

    /* renamed from: a  reason: collision with root package name */
    private final j f144549a;

    /* renamed from: b  reason: collision with root package name */
    private final String f144550b;

    public C17596a(j jVar, String str) {
        C17542s.j(jVar, "engineViewport");
        this.f144549a = jVar;
        this.f144550b = str;
    }

    public final j a() {
        return this.f144549a;
    }

    public final String b() {
        return this.f144550b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17596a)) {
            return false;
        }
        C17596a aVar = (C17596a) obj;
        return this.f144549a == aVar.f144549a && C17542s.e(this.f144550b, aVar.f144550b);
    }

    public int hashCode() {
        int hashCode = this.f144549a.hashCode() * 31;
        String str = this.f144550b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        j jVar = this.f144549a;
        String str = this.f144550b;
        return "MultiviewItemInformation(engineViewport=" + jVar + ", image=" + str + ")";
    }
}
