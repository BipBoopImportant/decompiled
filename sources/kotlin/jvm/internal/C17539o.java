package kotlin.jvm.internal;

import uI.C18054c;
import uI.C18059h;

/* renamed from: kotlin.jvm.internal.o  reason: case insensitive filesystem */
public class C17539o extends C17530f implements C17538n, C18059h {
    private final int arity;
    private final int flags;

    public C17539o(int i10) {
        this(i10, C17530f.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C18054c computeReflected() {
        return P.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17539o) {
            C17539o oVar = (C17539o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && C17542s.e(getBoundReceiver(), oVar.getBoundReceiver()) && C17542s.e(getOwner(), oVar.getOwner());
        } else if (obj instanceof C18059h) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C18054c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C17539o(int i10, Object obj) {
        this(i10, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C18059h getReflected() {
        return (C18059h) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17539o(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
