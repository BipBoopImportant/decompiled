package a9;

import java.util.Arrays;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.a0  reason: case insensitive filesystem */
public final class C6782a0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f42429a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f42430b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42431c;

    public C6782a0(String str, byte[] bArr, String str2) {
        C17542s.j(str, "key");
        C17542s.j(bArr, "data");
        C17542s.j(str2, "mimeType");
        this.f42429a = str;
        this.f42430b = bArr;
        this.f42431c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C6782a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type com.contentsquare.android.internal.features.srm.SrmResource");
        return C17542s.e(this.f42429a, ((C6782a0) obj).f42429a);
    }

    public final int hashCode() {
        return this.f42429a.hashCode();
    }

    public final String toString() {
        return "SrmResource(key=" + this.f42429a + ", data=" + Arrays.toString(this.f42430b) + ", mimeType=" + this.f42431c + ')';
    }
}
