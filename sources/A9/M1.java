package a9;

import java.util.Arrays;
import kotlin.jvm.internal.C17542s;

public final class M1 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f42140a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42141b;

    public M1(String str, byte[] bArr) {
        C17542s.j(bArr, "payload");
        C17542s.j(str, "url");
        this.f42140a = bArr;
        this.f42141b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(M1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type com.contentsquare.android.internal.features.sessionreplay.processing.dispatcher.BatchContainer");
        M1 m12 = (M1) obj;
        return Arrays.equals(this.f42140a, m12.f42140a) && C17542s.e(this.f42141b, m12.f42141b);
    }

    public final int hashCode() {
        return this.f42141b.hashCode() + (Arrays.hashCode(this.f42140a) * 31);
    }

    public final String toString() {
        return "BatchContainer(payload=" + Arrays.toString(this.f42140a) + ", url=" + this.f42141b + ')';
    }
}
