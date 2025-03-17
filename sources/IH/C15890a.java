package IH;

import HJ.C15838d;
import HJ.C15854t;
import QH.C16246a;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"LIH/a;", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "a", "[B", "()[B", "beginArray", "b", "endArray", "c", "objectSeparator", "ktor-serialization-kotlinx-json"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: IH.a  reason: case insensitive filesystem */
final class C15890a {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f135437a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f135438b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f135439c;

    public C15890a(Charset charset) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C17542s.j(charset, "charset");
        Charset charset2 = C15838d.f135279b;
        if (C17542s.e(charset, charset2)) {
            bArr = C15854t.E("[");
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            C17542s.i(newEncoder, "charset.newEncoder()");
            bArr = C16246a.g(newEncoder, "[", 0, 1);
        }
        this.f135437a = bArr;
        if (C17542s.e(charset, charset2)) {
            bArr2 = C15854t.E("]");
        } else {
            CharsetEncoder newEncoder2 = charset.newEncoder();
            C17542s.i(newEncoder2, "charset.newEncoder()");
            bArr2 = C16246a.g(newEncoder2, "]", 0, 1);
        }
        this.f135438b = bArr2;
        if (C17542s.e(charset, charset2)) {
            bArr3 = C15854t.E(",");
        } else {
            CharsetEncoder newEncoder3 = charset.newEncoder();
            C17542s.i(newEncoder3, "charset.newEncoder()");
            bArr3 = C16246a.g(newEncoder3, ",", 0, 1);
        }
        this.f135439c = bArr3;
    }

    public final byte[] a() {
        return this.f135437a;
    }

    public final byte[] b() {
        return this.f135438b;
    }

    public final byte[] c() {
        return this.f135439c;
    }
}
