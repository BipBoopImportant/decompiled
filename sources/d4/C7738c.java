package d4;

import W3.C6712b;
import W3.C6713c;
import java.nio.ByteBuffer;
import q3.z;
import t3.A;
import t3.B;
import t3.H;

/* renamed from: d4.c  reason: case insensitive filesystem */
public final class C7738c extends C6713c {

    /* renamed from: a  reason: collision with root package name */
    private final B f50688a = new B();

    /* renamed from: b  reason: collision with root package name */
    private final A f50689b = new A();

    /* renamed from: c  reason: collision with root package name */
    private H f50690c;

    /* access modifiers changed from: protected */
    public z b(C6712b bVar, ByteBuffer byteBuffer) {
        H h10 = this.f50690c;
        if (h10 == null || bVar.f40530j != h10.f()) {
            H h11 = new H(bVar.f32281f);
            this.f50690c = h11;
            h11.a(bVar.f32281f - bVar.f40530j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f50688a.U(array, limit);
        this.f50689b.o(array, limit);
        this.f50689b.r(39);
        long h12 = (((long) this.f50689b.h(1)) << 32) | ((long) this.f50689b.h(32));
        this.f50689b.r(20);
        int h13 = this.f50689b.h(12);
        int h14 = this.f50689b.h(8);
        this.f50688a.X(14);
        z.b a10 = h14 != 0 ? h14 != 255 ? h14 != 4 ? h14 != 5 ? h14 != 6 ? null : C7742g.a(this.f50688a, h12, this.f50690c) : C7739d.a(this.f50688a, h12, this.f50690c) : C7741f.a(this.f50688a) : C7736a.a(this.f50688a, h13, h12) : new C7740e();
        if (a10 == null) {
            return new z(new z.b[0]);
        }
        return new z(a10);
    }
}
