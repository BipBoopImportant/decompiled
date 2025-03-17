package kotlin.jvm.internal;

import uI.C18054c;
import uI.C18064m;

public abstract class J extends C17530f implements C18064m {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f144343a;

    public J() {
        this.f144343a = false;
    }

    public C18054c compute() {
        return this.f144343a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            J j10 = (J) obj;
            return getOwner().equals(j10.getOwner()) && getName().equals(j10.getName()) && getSignature().equals(j10.getSignature()) && C17542s.e(getBoundReceiver(), j10.getBoundReceiver());
        } else if (obj instanceof C18064m) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C18064m getReflected() {
        if (!this.f144343a) {
            return (C18064m) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public String toString() {
        C18054c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z10 = false;
        this.f144343a = (i10 & 2) == 2 ? true : z10;
    }
}
