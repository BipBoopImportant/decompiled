package i7;

import HJ.C15835a;
import d7.C7750b;
import java.io.InputStream;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;
import q7.C8679a;
import q7.C8682d;
import q7.C8683e;
import q7.C8684f;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li7/a;", "", "<init>", "()V", "Ljava/io/InputStream;", "inputStream", "Lq7/a;", "b", "(Ljava/io/InputStream;)Lq7/a;", "Lq7/e;", "c", "(Ljava/io/InputStream;)Lq7/e;", "", "maxDataLength", "a", "(I)I", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: i7.a  reason: case insensitive filesystem */
public final class C8215a {

    /* renamed from: a  reason: collision with root package name */
    public static final C8215a f53152a = new C8215a();

    private C8215a() {
    }

    private final C8679a b(InputStream inputStream) {
        int b10 = (int) C8216b.b(inputStream, 1);
        C8679a.C0893a a10 = C8679a.C0893a.Companion.a(b10);
        if (a10 != null) {
            int b11 = (int) C8216b.b(inputStream, 1);
            C8679a.b a11 = C8679a.b.Companion.a(b11);
            if (a11 != null) {
                return new C8679a(a10, a11, C8216b.c(inputStream, 65535));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown signature algorithm: ");
            String num = Integer.toString(b11, C15835a.a(16));
            C17542s.i(num, "toString(...)");
            sb2.append(num);
            throw new C7750b(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unknown hash algorithm: ");
        String num2 = Integer.toString(b10, C15835a.a(16));
        C17542s.i(num2, "toString(...)");
        sb3.append(num2);
        throw new C7750b(sb3.toString());
    }

    public final int a(int i10) {
        return (int) (Math.ceil(C17752b.c((double) i10)) / ((double) 8));
    }

    public final C8683e c(InputStream inputStream) {
        C17542s.j(inputStream, "inputStream");
        C8684f a10 = C8684f.Companion.a((int) C8216b.b(inputStream, 1));
        if (a10 == C8684f.V1) {
            byte[] a11 = C8216b.a(inputStream, 32);
            Instant ofEpochMilli = Instant.ofEpochMilli(C8216b.b(inputStream, 8));
            byte[] c10 = C8216b.c(inputStream, 65535);
            C8679a b10 = b(inputStream);
            C8682d dVar = new C8682d(a11);
            C17542s.g(ofEpochMilli);
            return new C8683e(a10, dVar, ofEpochMilli, b10, c10);
        }
        throw new C7750b("Unknown version: " + a10);
    }
}
