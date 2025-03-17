package jK;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LjK/T;", "LjK/J0;", "", "name", "LjK/N;", "generatedSerializer", "<init>", "(Ljava/lang/String;LjK/N;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "m", "Z", "isInline", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class T extends J0 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f144065m = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(String str, N<?> n10) {
        super(str, n10, 1);
        C17542s.j(str, "name");
        C17542s.j(n10, "generatedSerializer");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (C17542s.e(i(), serialDescriptor.i())) {
                T t10 = (T) obj;
                if (t10.isInline() && Arrays.equals(u(), t10.u()) && d() == serialDescriptor.d()) {
                    int d10 = d();
                    int i10 = 0;
                    while (i10 < d10) {
                        if (C17542s.e(g(i10).i(), serialDescriptor.g(i10).i()) && C17542s.e(g(i10).h(), serialDescriptor.g(i10).h())) {
                            i10++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean isInline() {
        return this.f144065m;
    }
}
