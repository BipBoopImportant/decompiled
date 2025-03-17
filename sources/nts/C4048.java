package nts;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: nts.ᴎ  reason: contains not printable characters */
public class C4048 extends C3856 {

    /* renamed from: Ⴓ  reason: contains not printable characters */
    public static final /* synthetic */ int f2896 = 0;

    /* renamed from: љ  reason: contains not printable characters */
    public C3722 f2897 = null;

    /* renamed from: ҁ  reason: contains not printable characters */
    public ByteArrayOutputStream f2898 = null;

    /* renamed from: ঙ  reason: contains not printable characters */
    public C4194 f2899;

    /* renamed from: ฃ  reason: contains not printable characters */
    public C3897 f2900 = null;

    /* renamed from: ບ  reason: contains not printable characters */
    public int f2901 = 4;

    /* renamed from: ᯝ  reason: contains not printable characters */
    public C3636 f2902 = null;

    /* renamed from: Ὴ  reason: contains not printable characters */
    public int f2903 = 0;

    /* renamed from: ⳇ  reason: contains not printable characters */
    public boolean f2904 = false;

    /* renamed from: 〺  reason: contains not printable characters */
    public byte[] f2905 = null;

    /* renamed from: ヺ  reason: contains not printable characters */
    public OutputStream f2906 = null;

    /* renamed from: ㅼ  reason: contains not printable characters */
    public C3874 f2907 = new C3874();

    public C4048(Object obj, Object obj2) {
        super(obj2);
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public void m2741(boolean z10) {
        try {
            if (this.f2906 == null) {
                if (this.f2898 == null) {
                    this.f2898 = new ByteArrayOutputStream();
                }
                this.f2906 = m2742(this.f2898);
            }
            byte[] bArr = this.f2905;
            if (bArr != null && bArr.length > 0) {
                this.f2906.write(bArr, 0, bArr.length);
                this.f2905 = null;
            }
            if (z10) {
                this.f2906.flush();
                this.f2906.close();
                this.f2906 = null;
            }
            byte[] byteArray = this.f2898.toByteArray();
            if (byteArray != null && byteArray.length > 0) {
                if (this.f2904) {
                    this.f2907.m1920(byteArray);
                }
                C3722 r22 = this.f2897;
                if (r22 != null) {
                    r22.m1017(byteArray);
                }
            }
            if (z10) {
                this.f2898 = null;
            } else {
                this.f2898.reset();
            }
        } catch (IOException e10) {
            throw new C3625((Throwable) e10, C3625.m589(e10));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final OutputStream m2742(OutputStream outputStream) {
        int i10 = this.f2903;
        C3664 r32 = null;
        if (i10 == 2) {
            r32 = new C4080(outputStream, "", (C3883) null);
        } else if (i10 == 1) {
            r32 = new C3991(outputStream);
        } else if (i10 == 0) {
            r32 = new C3664(outputStream);
        }
        if (r32 != null) {
            C3590 r52 = r32.f779;
            if (r52 != null) {
                r52.f338 = false;
            }
            int i11 = this.f2901;
            C4070 r02 = r32.f780.f4062;
            if (r02 instanceof C4035) {
                C4035 r03 = (C4035) r02;
                if (i11 < 1) {
                    i11 = 1;
                }
                if (i11 > 6) {
                    i11 = 6;
                }
                r03.f2809 = r03.f2812[i11 - 1];
            }
        }
        return r32;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: ᚪ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2744() {
        /*
            r8 = this;
            nts.ץ r0 = r8.f2902     // Catch:{ IOException -> 0x000c }
            if (r0 != 0) goto L_0x000f
            nts.ץ r0 = new nts.ץ     // Catch:{ IOException -> 0x000c }
            r0.<init>()     // Catch:{ IOException -> 0x000c }
            r8.f2902 = r0     // Catch:{ IOException -> 0x000c }
            goto L_0x000f
        L_0x000c:
            r0 = move-exception
            goto L_0x00e3
        L_0x000f:
            nts.〹 r0 = r8.f2899     // Catch:{ IOException -> 0x000c }
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L_0x0032
            int r0 = r8.f2903     // Catch:{ IOException -> 0x000c }
            if (r1 != r0) goto L_0x0021
            nts.ۉ r0 = new nts.ۉ     // Catch:{ IOException -> 0x000c }
            r0.<init>()     // Catch:{ IOException -> 0x000c }
            r8.f2899 = r0     // Catch:{ IOException -> 0x000c }
            goto L_0x0032
        L_0x0021:
            if (r2 != r0) goto L_0x002b
            nts.ʜ r0 = new nts.ʜ     // Catch:{ IOException -> 0x000c }
            r0.<init>()     // Catch:{ IOException -> 0x000c }
            r8.f2899 = r0     // Catch:{ IOException -> 0x000c }
            goto L_0x0032
        L_0x002b:
            nts.〹 r0 = new nts.〹     // Catch:{ IOException -> 0x000c }
            r0.<init>()     // Catch:{ IOException -> 0x000c }
            r8.f2899 = r0     // Catch:{ IOException -> 0x000c }
        L_0x0032:
            nts.〹 r0 = r8.f2899     // Catch:{ IOException -> 0x000c }
            int r3 = r0.f4036     // Catch:{ IOException -> 0x000c }
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x003b
            goto L_0x0054
        L_0x003b:
            byte[] r3 = r8.f2905     // Catch:{ IOException -> 0x000c }
            int r6 = r3.length     // Catch:{ IOException -> 0x000c }
            int r0 = r0.m3725(r3, r5, r6)     // Catch:{ IOException -> 0x000c }
            nts.〹 r3 = r8.f2899     // Catch:{ IOException -> 0x000c }
            int r3 = r3.f4036     // Catch:{ IOException -> 0x000c }
            if (r3 != 0) goto L_0x00e0
            nts.ץ r3 = r8.f2902     // Catch:{ IOException -> 0x000c }
            byte[] r6 = r8.f2905     // Catch:{ IOException -> 0x000c }
            int r7 = r6.length     // Catch:{ IOException -> 0x000c }
            nts.ᐯ r3 = r3.f620     // Catch:{ IOException -> 0x000c }
            r3.m1921(r6, r0, r7)     // Catch:{ IOException -> 0x000c }
            r8.f2905 = r4     // Catch:{ IOException -> 0x000c }
        L_0x0054:
            byte[] r0 = r8.f2905     // Catch:{ IOException -> 0x000c }
            if (r0 == 0) goto L_0x0064
            int r3 = r0.length     // Catch:{ IOException -> 0x000c }
            if (r3 <= 0) goto L_0x0064
            nts.ץ r3 = r8.f2902     // Catch:{ IOException -> 0x000c }
            nts.ᐯ r3 = r3.f620     // Catch:{ IOException -> 0x000c }
            r3.m1920((byte[]) r0)     // Catch:{ IOException -> 0x000c }
            r8.f2905 = r4     // Catch:{ IOException -> 0x000c }
        L_0x0064:
            nts.ᓰ r0 = r8.f2900     // Catch:{ IOException -> 0x000c }
            if (r0 != 0) goto L_0x00a0
            nts.ץ r0 = r8.f2902     // Catch:{ IOException -> 0x000c }
            int r3 = r8.f2903     // Catch:{ IOException -> 0x0074 }
            if (r3 != r1) goto L_0x0076
            nts.ᕷ r4 = new nts.ᕷ     // Catch:{ IOException -> 0x0074 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0074 }
            goto L_0x0087
        L_0x0074:
            r0 = move-exception
            goto L_0x0092
        L_0x0076:
            if (r3 != r2) goto L_0x0080
            nts.Ⱍ r4 = new nts.Ⱍ     // Catch:{ IOException -> 0x0074 }
            r4.<init>(r0, r5)     // Catch:{ IOException -> 0x0074 }
            r4.f3644 = r2     // Catch:{ IOException -> 0x0074 }
            goto L_0x0087
        L_0x0080:
            if (r3 != 0) goto L_0x0087
            nts.ᓰ r4 = new nts.ᓰ     // Catch:{ IOException -> 0x0074 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0074 }
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            r4.f1809 = r5     // Catch:{ IOException -> 0x0074 }
        L_0x008b:
            r8.f2900 = r4     // Catch:{ IOException -> 0x000c }
            r4.f1808 = r2     // Catch:{ IOException -> 0x000c }
            r4.f1814 = r2     // Catch:{ IOException -> 0x000c }
            goto L_0x00a0
        L_0x0092:
            nts.Ԕ r1 = new nts.Ԕ     // Catch:{ IOException -> 0x000c }
            java.lang.String r2 = nts.C3625.m589(r0)     // Catch:{ IOException -> 0x000c }
            int r3 = nts.C3625.m591(r0)     // Catch:{ IOException -> 0x000c }
            r1.<init>(r0, r3, r2)     // Catch:{ IOException -> 0x000c }
            throw r1     // Catch:{ IOException -> 0x000c }
        L_0x00a0:
            r0 = 1048576(0x100000, float:1.469368E-39)
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x000c }
        L_0x00a4:
            nts.ᓰ r2 = r8.f2900     // Catch:{ IOException -> 0x000c }
            int r2 = r2.available()     // Catch:{ IOException -> 0x000c }
            if (r2 <= 0) goto L_0x00cd
            nts.ᓰ r2 = r8.f2900     // Catch:{ IOException -> 0x000c }
            int r2 = r2.read(r1, r5, r0)     // Catch:{ IOException -> 0x000c }
            if (r2 > 0) goto L_0x00b5
            goto L_0x00cd
        L_0x00b5:
            if (r2 <= 0) goto L_0x00a4
            byte[] r3 = new byte[r2]     // Catch:{ IOException -> 0x000c }
            java.lang.System.arraycopy(r1, r5, r3, r5, r2)     // Catch:{ IOException -> 0x000c }
            boolean r2 = r8.f2904     // Catch:{ IOException -> 0x000c }
            if (r2 == 0) goto L_0x00c5
            nts.ᐯ r2 = r8.f2907     // Catch:{ IOException -> 0x000c }
            r2.m1920((byte[]) r3)     // Catch:{ IOException -> 0x000c }
        L_0x00c5:
            nts.ದ r2 = r8.f2897     // Catch:{ IOException -> 0x000c }
            if (r2 == 0) goto L_0x00a4
            r2.m1019(r3)     // Catch:{ IOException -> 0x000c }
            goto L_0x00a4
        L_0x00cd:
            nts.ץ r0 = r8.f2902     // Catch:{ IOException -> 0x000c }
            int r1 = r0.f619     // Catch:{ IOException -> 0x000c }
            if (r1 < 0) goto L_0x00df
            nts.ᐯ r2 = r0.f620     // Catch:{ IOException -> 0x000c }
            int r3 = r2.f1728     // Catch:{ IOException -> 0x000c }
            if (r3 <= 0) goto L_0x00df
            r2.m1919((int) r5, (int) r1)     // Catch:{ IOException -> 0x000c }
            r1 = -1
            r0.f619 = r1     // Catch:{ IOException -> 0x000c }
        L_0x00df:
            return
        L_0x00e0:
            r8.f2905 = r4     // Catch:{ IOException -> 0x000c }
            return
        L_0x00e3:
            nts.Ԕ r1 = new nts.Ԕ
            java.lang.String r2 = nts.C3625.m589(r0)
            int r3 = nts.C3625.m591(r0)
            r1.<init>(r0, r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4048.m2744():void");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2743(int i10, String str) {
        C3722 r02 = this.f2897;
        if (r02 != null) {
            r02.m1018(i10, str);
        }
    }
}
