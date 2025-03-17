package t4;

import java.util.Arrays;
import t3.C5950a;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final int f56536a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f56537b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56538c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f56539d;

    /* renamed from: e  reason: collision with root package name */
    public int f56540e;

    public w(int i10, int i11) {
        this.f56536a = i10;
        byte[] bArr = new byte[(i11 + 3)];
        this.f56539d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f56537b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f56539d;
            int length = bArr2.length;
            int i13 = this.f56540e;
            if (length < i13 + i12) {
                this.f56539d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f56539d, this.f56540e, i12);
            this.f56540e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f56537b) {
            return false;
        }
        this.f56540e -= i10;
        this.f56537b = false;
        this.f56538c = true;
        return true;
    }

    public boolean c() {
        return this.f56538c;
    }

    public void d() {
        this.f56537b = false;
        this.f56538c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        C5950a.g(!this.f56537b);
        if (i10 != this.f56536a) {
            z10 = false;
        }
        this.f56537b = z10;
        if (z10) {
            this.f56540e = 3;
            this.f56538c = false;
        }
    }
}
