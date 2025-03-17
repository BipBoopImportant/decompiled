package xI;

import DI.C15579z;
import DI.a0;
import GI.C15745o;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LxI/j;", "LGI/o;", "LxI/A;", "LXH/N;", "LxI/d0;", "container", "<init>", "(LxI/d0;)V", "LDI/a0;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;LXH/N;)LxI/A;", "LDI/z;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;LXH/N;)LxI/A;", "a", "LxI/d0;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.j  reason: case insensitive filesystem */
public class C18640j extends C15745o<C18599A<?>, C16807N> {

    /* renamed from: a  reason: collision with root package name */
    private final C18629d0 f152427a;

    public C18640j(C18629d0 d0Var) {
        C17542s.j(d0Var, "container");
        this.f152427a = d0Var;
    }

    /* renamed from: p */
    public C18599A<?> b(C15579z zVar, C16807N n10) {
        C17542s.j(zVar, "descriptor");
        C17542s.j(n10, "data");
        return new C18639i0(this.f152427a, zVar);
    }

    /* renamed from: q */
    public C18599A<?> k(a0 a0Var, C16807N n10) {
        C17542s.j(a0Var, "descriptor");
        C17542s.j(n10, "data");
        int i10 = 0;
        int i11 = a0Var.L() != null ? 1 : 0;
        if (a0Var.O() != null) {
            i10 = 1;
        }
        int i12 = i11 + i10;
        if (a0Var.N()) {
            if (i12 == 0) {
                return new C18643k0(this.f152427a, a0Var);
            }
            if (i12 == 1) {
                return new C18647m0(this.f152427a, a0Var);
            }
            if (i12 == 2) {
                return new C18651o0(this.f152427a, a0Var);
            }
        } else if (i12 == 0) {
            return new B0(this.f152427a, a0Var);
        } else {
            if (i12 == 1) {
                return new E0(this.f152427a, a0Var);
            }
            if (i12 == 2) {
                return new H0(this.f152427a, a0Var);
            }
        }
        throw new Y0("Unsupported property: " + a0Var);
    }
}
