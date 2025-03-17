package qJ;

import DI.i0;
import XI.C16830c;
import ZI.C17004a;
import ZI.c;
import kotlin.jvm.internal.C17542s;

/* renamed from: qJ.i  reason: case insensitive filesystem */
public final class C17821i {

    /* renamed from: a  reason: collision with root package name */
    private final c f146554a;

    /* renamed from: b  reason: collision with root package name */
    private final C16830c f146555b;

    /* renamed from: c  reason: collision with root package name */
    private final C17004a f146556c;

    /* renamed from: d  reason: collision with root package name */
    private final i0 f146557d;

    public C17821i(c cVar, C16830c cVar2, C17004a aVar, i0 i0Var) {
        C17542s.j(cVar, "nameResolver");
        C17542s.j(cVar2, "classProto");
        C17542s.j(aVar, "metadataVersion");
        C17542s.j(i0Var, "sourceElement");
        this.f146554a = cVar;
        this.f146555b = cVar2;
        this.f146556c = aVar;
        this.f146557d = i0Var;
    }

    public final c a() {
        return this.f146554a;
    }

    public final C16830c b() {
        return this.f146555b;
    }

    public final C17004a c() {
        return this.f146556c;
    }

    public final i0 d() {
        return this.f146557d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17821i)) {
            return false;
        }
        C17821i iVar = (C17821i) obj;
        return C17542s.e(this.f146554a, iVar.f146554a) && C17542s.e(this.f146555b, iVar.f146555b) && C17542s.e(this.f146556c, iVar.f146556c) && C17542s.e(this.f146557d, iVar.f146557d);
    }

    public int hashCode() {
        return (((((this.f146554a.hashCode() * 31) + this.f146555b.hashCode()) * 31) + this.f146556c.hashCode()) * 31) + this.f146557d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f146554a + ", classProto=" + this.f146555b + ", metadataVersion=" + this.f146556c + ", sourceElement=" + this.f146557d + ')';
    }
}
