package qb;

import Cb.C;
import Cb.t;
import com.google.crypto.tink.shaded.protobuf.C9533p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: qb.b  reason: case insensitive filesystem */
public final class C10157b implements C10171p {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f75964a;

    private C10157b(InputStream inputStream) {
        this.f75964a = inputStream;
    }

    public static C10171p c(byte[] bArr) {
        return new C10157b(new ByteArrayInputStream(bArr));
    }

    public t a() {
        try {
            return t.V(this.f75964a, C9533p.b());
        } finally {
            this.f75964a.close();
        }
    }

    public C b() {
        try {
            return C.a0(this.f75964a, C9533p.b());
        } finally {
            this.f75964a.close();
        }
    }
}
