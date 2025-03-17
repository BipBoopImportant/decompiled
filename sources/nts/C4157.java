package nts;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nts.ⵎ  reason: contains not printable characters */
public class C4157 extends C3935 {
    public C4157() {
        this.f910 = new C4124[]{new C4124(C3596.f361 ? 8 : 112, RecyclerView.n.FLAG_MOVED, 8)};
        this.f916 = new C4124[]{new C4124(8, RecyclerView.n.FLAG_MOVED, 8)};
        this.f912 = 64;
        this.f914 = 64;
        this.f913 = 128;
        this.f909 = 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3471(byte[] bArr, C4201 r42) {
        byte[] bArr2 = new byte[bArr.length];
        r42.m3755(bArr2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3472() {
        m901(C3990.m2428(this.f913 / 8));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public C4193 m3473(byte[] bArr, byte[] bArr2) {
        if (C3596.f363) {
            return new C3970(bArr, bArr2, this.f911, this.f909);
        }
        throw new C3738(C3727.m1052("-=I\\\u0012\tY\u001c\u0012\u0006\u0007\u0011\u0010\u0013\u0005\u0015\u000b@#3GR\u001c\u0007W\u0012\u001c\b\t\u001f\u001e\u001d\u000b\u001b\u0005N", 18, 18, 113));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3475() {
        m905(C3990.m2428(this.f912 / 8));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public C4193 m3474(byte[] bArr, byte[] bArr2) {
        if (C3596.f363) {
            return new C3872(bArr, bArr2, this.f911, this.f909);
        }
        throw new C3738(C3727.m1052("-=I\\\u0012\tY\u001c\u0012\u0006\u0007\u0011\u0010\u0013\u0005\u0015\u000b@#3GR\u001c\u0007W\u0012\u001c\b\t\u001f\u001e\u001d\u000b\u001b\u0005N", 0, 18, 109));
    }
}
