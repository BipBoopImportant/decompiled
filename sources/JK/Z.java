package jK;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import uI.C18055d;
import uI.C18057f;
import uI.C18068q;
import uI.C18070s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LjK/Z;", "LuI/q;", "origin", "<init>", "(LuI/q;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LuI/q;", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "LuI/s;", "i", "arguments", "LuI/f;", "e", "()LuI/f;", "classifier", "k", "()Z", "isMarkedNullable", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class Z implements C18068q {

    /* renamed from: a  reason: collision with root package name */
    private final C18068q f144079a;

    public Z(C18068q qVar) {
        C17542s.j(qVar, "origin");
        this.f144079a = qVar;
    }

    public C18057f e() {
        return this.f144079a.e();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C18068q qVar = this.f144079a;
        C18057f fVar = null;
        Z z10 = obj instanceof Z ? (Z) obj : null;
        if (!C17542s.e(qVar, z10 != null ? z10.f144079a : null)) {
            return false;
        }
        C18057f e10 = e();
        if (e10 instanceof C18055d) {
            C18068q qVar2 = obj instanceof C18068q ? (C18068q) obj : null;
            if (qVar2 != null) {
                fVar = qVar2.e();
            }
            if (fVar != null && (fVar instanceof C18055d)) {
                return C17542s.e(C17603a.b((C18055d) e10), C17603a.b((C18055d) fVar));
            }
        }
        return false;
    }

    public List<Annotation> getAnnotations() {
        return this.f144079a.getAnnotations();
    }

    public int hashCode() {
        return this.f144079a.hashCode();
    }

    public List<C18070s> i() {
        return this.f144079a.i();
    }

    public boolean k() {
        return this.f144079a.k();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f144079a;
    }
}
