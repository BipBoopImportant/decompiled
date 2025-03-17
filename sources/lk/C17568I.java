package lK;

import hK.m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006\u001f"}, d2 = {"LlK/I;", "", "<init>", "()V", "LXH/N;", "e", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "g", "(I)V", "key", "f", "(Ljava/lang/Object;)V", "d", "b", "", "a", "()Ljava/lang/String;", "toString", "", "[Ljava/lang/Object;", "currentObjectPath", "", "[I", "indicies", "I", "currentDepth", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.I  reason: case insensitive filesystem */
public final class C17568I {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f144425a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    private int[] f144426b;

    /* renamed from: c  reason: collision with root package name */
    private int f144427c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlK/I$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lK.I$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144428a = new a();

        private a() {
        }
    }

    public C17568I() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f144426b = iArr;
        this.f144427c = -1;
    }

    private final void e() {
        int i10 = this.f144427c * 2;
        Object[] copyOf = Arrays.copyOf(this.f144425a, i10);
        C17542s.i(copyOf, "copyOf(...)");
        this.f144425a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f144426b, i10);
        C17542s.i(copyOf2, "copyOf(...)");
        this.f144426b = copyOf2;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f144427c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f144425a[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!C17542s.e(serialDescriptor.h(), m.b.f143471a)) {
                    int i12 = this.f144426b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.e(i12));
                    }
                } else if (this.f144426b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f144426b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f144428a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i10 = this.f144427c;
        int[] iArr = this.f144426b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f144427c = i10 - 1;
        }
        int i11 = this.f144427c;
        if (i11 != -1) {
            this.f144427c = i11 - 1;
        }
    }

    public final void c(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "sd");
        int i10 = this.f144427c + 1;
        this.f144427c = i10;
        if (i10 == this.f144425a.length) {
            e();
        }
        this.f144425a[i10] = serialDescriptor;
    }

    public final void d() {
        int[] iArr = this.f144426b;
        int i10 = this.f144427c;
        if (iArr[i10] == -2) {
            this.f144425a[i10] = a.f144428a;
        }
    }

    public final void f(Object obj) {
        int[] iArr = this.f144426b;
        int i10 = this.f144427c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f144427c = i11;
            if (i11 == this.f144425a.length) {
                e();
            }
        }
        Object[] objArr = this.f144425a;
        int i12 = this.f144427c;
        objArr[i12] = obj;
        this.f144426b[i12] = -2;
    }

    public final void g(int i10) {
        this.f144426b[this.f144427c] = i10;
    }

    public String toString() {
        return a();
    }
}
