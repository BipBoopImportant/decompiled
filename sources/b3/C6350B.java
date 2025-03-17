package B3;

import java.nio.ByteBuffer;
import r3.b;
import r3.d;
import t3.C5950a;

/* renamed from: B3.B  reason: case insensitive filesystem */
final class C6350B extends d {

    /* renamed from: i  reason: collision with root package name */
    private int[] f32857i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f32858j;

    C6350B() {
    }

    public void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C5950a.e(this.f32858j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m10 = m(((limit - position) / this.f28650b.f28648d) * this.f28651c.f28648d);
        while (position < limit) {
            for (int i10 : iArr) {
                m10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f28650b.f28648d;
        }
        byteBuffer.position(limit);
        m10.flip();
    }

    public b.a i(b.a aVar) {
        int[] iArr = this.f32857i;
        if (iArr == null) {
            return b.a.f28644e;
        }
        if (aVar.f28647c == 2) {
            boolean z10 = aVar.f28646b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f28646b) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new b.C0454b(aVar);
                }
            }
            return z10 ? new b.a(aVar.f28645a, iArr.length, 2) : b.a.f28644e;
        }
        throw new b.C0454b(aVar);
    }

    /* access modifiers changed from: protected */
    public void j() {
        this.f32858j = this.f32857i;
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.f32858j = null;
        this.f32857i = null;
    }

    public void n(int[] iArr) {
        this.f32857i = iArr;
    }
}
