package jK;

import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import hK.i;
import hK.k;
import hK.l;
import hK.m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LjK/G;", "LjK/J0;", "", "name", "", "elementsCount", "<init>", "(Ljava/lang/String;I)V", "index", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "g", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "LhK/l;", "m", "LhK/l;", "h", "()LhK/l;", "kind", "", "n", "LXH/o;", "C", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G extends J0 {

    /* renamed from: m  reason: collision with root package name */
    private final l f144025m = l.b.f143469a;

    /* renamed from: n  reason: collision with root package name */
    private final C16824o f144026n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public G(String str, int i10) {
        super(str, (N) null, i10, 2, (DefaultConstructorMarker) null);
        C17542s.j(str, "name");
        this.f144026n = C16825p.b(new F(i10, str, this));
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor[] B(int i10, String str, G g10) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            serialDescriptorArr[i11] = k.f(str + '.' + g10.e(i11), m.d.f143473a, new SerialDescriptor[0], (C17642l) null, 8, (Object) null);
        }
        return serialDescriptorArr;
    }

    private final SerialDescriptor[] C() {
        return (SerialDescriptor[]) this.f144026n.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.h() == l.b.f143469a && C17542s.e(i(), serialDescriptor.i()) && C17542s.e(D0.a(this), D0.a(serialDescriptor));
    }

    public SerialDescriptor g(int i10) {
        return C()[i10];
    }

    public l h() {
        return this.f144025m;
    }

    public int hashCode() {
        int hashCode = i().hashCode();
        Iterator<String> it = i.b(this).iterator();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 * 31;
            String next = it.next();
            i10 = i11 + (next != null ? next.hashCode() : 0);
        }
        return (hashCode * 31) + i10;
    }

    public String toString() {
        Iterable<String> b10 = i.b(this);
        return C16877v.G0(b10, ", ", i() + '(', ")", 0, (CharSequence) null, (C17642l) null, 56, (Object) null);
    }
}
