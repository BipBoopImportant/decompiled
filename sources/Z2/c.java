package Z2;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    protected int f14958a;

    /* renamed from: b  reason: collision with root package name */
    protected ByteBuffer f14959b;

    /* renamed from: c  reason: collision with root package name */
    private int f14960c;

    /* renamed from: d  reason: collision with root package name */
    private int f14961d;

    /* renamed from: e  reason: collision with root package name */
    d f14962e = d.a();

    /* access modifiers changed from: protected */
    public int a(int i10) {
        return i10 + this.f14959b.getInt(i10);
    }

    /* access modifiers changed from: protected */
    public int b(int i10) {
        if (i10 < this.f14961d) {
            return this.f14959b.getShort(this.f14960c + i10);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void c(int i10, ByteBuffer byteBuffer) {
        this.f14959b = byteBuffer;
        if (byteBuffer != null) {
            this.f14958a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f14960c = i11;
            this.f14961d = this.f14959b.getShort(i11);
            return;
        }
        this.f14958a = 0;
        this.f14960c = 0;
        this.f14961d = 0;
    }

    /* access modifiers changed from: protected */
    public int d(int i10) {
        int i11 = i10 + this.f14958a;
        return i11 + this.f14959b.getInt(i11) + 4;
    }

    /* access modifiers changed from: protected */
    public int e(int i10) {
        int i11 = i10 + this.f14958a;
        return this.f14959b.getInt(i11 + this.f14959b.getInt(i11));
    }
}
