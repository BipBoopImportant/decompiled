package c1;

import HJ.C15835a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Lc1/d;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private int f23016a;

    public d() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public final int a() {
        return this.f23016a;
    }

    public final void b(int i10) {
        this.f23016a = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("IntRef(element = ");
        sb2.append(this.f23016a);
        sb2.append(")@");
        String num = Integer.toString(hashCode(), C15835a.a(16));
        C17542s.i(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    public d(int i10) {
        this.f23016a = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
