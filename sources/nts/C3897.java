package nts;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nts.ᓰ  reason: contains not printable characters */
public class C3897 extends InputStream {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f1807;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f1808 = false;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public boolean f1809 = false;

    /* renamed from: ખ  reason: contains not printable characters */
    public InputStream f1810;

    /* renamed from: ગ  reason: contains not printable characters */
    public C4023 f1811;

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean f1812;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f1813;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public boolean f1814 = false;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long f1815 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f1816 = new byte[1];

    public C3897(InputStream inputStream) {
        this.f1810 = inputStream;
        this.f1811 = new C4023();
        this.f1807 = 0;
        this.f1813 = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f1812 = false;
    }

    public int available() {
        if (!this.f1812) {
            return this.f1811.m2618() ? 0 : 1;
        }
        throw new IOException(C3727.m1052("uSNJL\u0019IOFPWZ\u0010FS@\fLB]MHNR\u0004FJHSDF\rKvx<XHZ8t~pwxad}/g~,bdjgut`gw,\b.371d42;-*'m;.=q1? 053/y;75.9;p'\u0015\u0016\u0004\u001bC\t\u000f\n\n\u0014M\u0005\u001e\u001cI\u0019\u0011T\u0017\u001d\u0006\u001e\u0015\rQEczjzgkg$`tuos,ñÜÅÝÒÚÚÎÊÜßÛÛÐÌÍÓÉÀÀØÇÑÀÀÈÄüãåå¶äàçÿúõ·¿ÈÁÆÐ¡ÖßØÂÏ¡ú«ÜÕÒÈÅ«ð", 0, 32, 28));
    }

    public void close() {
        if (!this.f1812) {
            if (this.f1811.m2618()) {
                m1990();
            }
            if (this.f1809) {
                this.f1810.close();
            }
            this.f1812 = true;
        }
    }

    public int read() {
        if (read(this.f1816, 0, 1) > 0) {
            return this.f1816[0] & 255;
        }
        return -1;
    }

    public long skip(long j10) {
        byte[] bArr = new byte[1000];
        long j11 = j10;
        do {
            long j12 = 1000;
            if (j11 <= 1000) {
                j12 = j11;
            }
            int read = read(bArr, 0, (int) j12);
            if (read <= 0) {
                return j10 - j11;
            }
            j11 -= (long) read;
        } while (j11 != 0);
        return j10;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m1988() {
        InputStream inputStream = this.f1810;
        byte[] bArr = this.f1813;
        int read = inputStream.read(bArr, 0, bArr.length);
        this.f1807 = read;
        this.f1815 += (long) read;
        if (this.f1814 && read <= 0) {
            return 0;
        }
        if (read >= 0) {
            if (read > -1) {
                this.f1811.m2614(this.f1813, 0, read);
            }
            return this.f1807;
        }
        this.f1811.getClass();
        throw new C3625((Throwable) null, 150, C3727.m1052("\u001b!'#%<&i$++&)c48.:riKM\bCKCKWJ\u000fUv3{s6tyj;oikelgmp$Sefz`3tt}pxtt|8zijtwgpsdj/hl~j&Sp|4`5y~u{oy=\"\" 1\"a}qct(fl+ec~zD\u0010Uuu~t`rr9kohx}r>dngq%afteq%", 117, 27, 127));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1990() {
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1991(boolean z10) {
        this.f1809 = z10;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (this.f1812) {
            throw new IOException(C3727.m1052("uSNJL\u0019IOFPWZ\u0010FS@\fLB]MHNR\u0004FJHSDF\rKvx<XHZ8t~pwxad}/g~,bdjgut`gw,\b.371d42;-*'m;.=q1? 053/y;75.9;p'\u0015\u0016\u0004\u001bC\t\u000f\n\n\u0014M\u0005\u001e\u001cI\u0019\u0011T\u0017\u001d\u0006\u001e\u0015\rQEczjzgkg$`tuos,ñÜÅÝÒÚÚÎÊÜßÛÛÐÌÍÓÉÀÀØÇÑÀÀÈÄüãåå¶äàçÿúõ·¿ÈÁÆÐ¡ÖßØÂÏ¡ú«ÜÕÒÈÅ«ð", 62, 32, 95));
        } else if (i10 < 0 || i10 + i11 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(C3727.m1052("uSNJL\u0019IOFPWZ\u0010FS@\fLB]MHNR\u0004FJHSDF\rKvx<XHZ8t~pwxad}/g~,bdjgut`gw,\b.371d42;-*'m;.=q1? 053/y;75.9;p'\u0015\u0016\u0004\u001bC\t\u000f\n\n\u0014M\u0005\u001e\u001cI\u0019\u0011T\u0017\u001d\u0006\u001e\u0015\rQEczjzgkg$`tuos,ñÜÅÝÒÚÚÎÊÜßÛÛÐÌÍÓÉÀÀØÇÑÀÀÈÄüãåå¶äàçÿúõ·¿ÈÁÆÐ¡ÖßØÂÏ¡ú«ÜÕÒÈÅ«ð", 94, 26, 34));
        } else {
            while (true) {
                int r02 = this.f1811.m2616(bArr, i10, i11);
                if (r02 > 0) {
                    return r02;
                }
                if (this.f1811.m2618()) {
                    return -1;
                }
                if (this.f1811.m2613()) {
                    try {
                        if (m1988() == 0 && this.f1808) {
                            return 0;
                        }
                    } catch (C3625 e10) {
                        if (r02 > 0) {
                            return r02;
                        }
                        throw e10;
                    }
                } else {
                    throw new C3625((Throwable) null, 199, C3727.m1052("uSNJL\u0019IOFPWZ\u0010FS@\fLB]MHNR\u0004FJHSDF\rKvx<XHZ8t~pwxad}/g~,bdjgut`gw,\b.371d42;-*'m;.=q1? 053/y;75.9;p'\u0015\u0016\u0004\u001bC\t\u000f\n\n\u0014M\u0005\u001e\u001cI\u0019\u0011T\u0017\u001d\u0006\u001e\u0015\rQEczjzgkg$`tuos,ñÜÅÝÒÚÚÎÊÜßÛÛÐÌÍÓÉÀÀØÇÑÀÀÈÄüãåå¶äàçÿúõ·¿ÈÁÆÐ¡ÖßØÂÏ¡ú«ÜÕÒÈÅ«ð", 120, 15, 123));
                }
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m1989(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            i12 = (i12 << 8) + (bArr[i10 + i13] & 255);
        }
        return i12;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m1992(int i10) {
        byte[] bArr = new byte[i10];
        C4023 r22 = this.f1811;
        int r32 = i10 > r22.f2755.m1855() ? r22.f2755.m1855() : i10;
        byte[] bArr2 = new byte[r32];
        C3860 r23 = r22.f2755;
        int i11 = r23.f1668;
        int i12 = r23.f1672;
        r23.f1668 = i11 >> (i12 & 7);
        r23.f1672 = 65528 & i12;
        r23.m1856(bArr2, 0, r32);
        System.arraycopy(bArr2, 0, bArr, 0, r32);
        if (r32 < i10) {
            while (r32 < i10) {
                try {
                    int read = this.f1810.read();
                    this.f1815++;
                    if (read != -1) {
                        bArr[r32] = (byte) read;
                        r32++;
                    } else {
                        throw new C3625((Throwable) null, 127, C3727.m1052("uSNJL\u0019IOFPWZ\u0010FS@\fLB]MHNR\u0004FJHSDF\rKvx<XHZ8t~pwxad}/g~,bdjgut`gw,\b.371d42;-*'m;.=q1? 053/y;75.9;p'\u0015\u0016\u0004\u001bC\t\u000f\n\n\u0014M\u0005\u001e\u001cI\u0019\u0011T\u0017\u001d\u0006\u001e\u0015\rQEczjzgkg$`tuos,ñÜÅÝÒÚÚÎÊÜßÛÛÐÌÍÓÉÀÀØÇÑÀÀÈÄüãåå¶äàçÿúõ·¿ÈÁÆÐ¡ÖßØÂÏ¡ú«ÜÕÒÈÅ«ð", 201, 34, 30));
                    }
                } catch (IOException unused) {
                    throw new C3625((Throwable) null, 127, C3727.m1052("uSNJL\u0019IOFPWZ\u0010FS@\fLB]MHNR\u0004FJHSDF\rKvx<XHZ8t~pwxad}/g~,bdjgut`gw,\b.371d42;-*'m;.=q1? 053/y;75.9;p'\u0015\u0016\u0004\u001bC\t\u000f\n\n\u0014M\u0005\u001e\u001cI\u0019\u0011T\u0017\u001d\u0006\u001e\u0015\rQEczjzgkg$`tuos,ñÜÅÝÒÚÚÎÊÜßÛÛÐÌÍÓÉÀÀØÇÑÀÀÈÄüãåå¶äàçÿúõ·¿ÈÁÆÐ¡ÖßØÂÏ¡ú«ÜÕÒÈÅ«ð", 235, 34, 54));
                }
            }
        }
        return bArr;
    }

    public C3897(InputStream inputStream, C4023 r42, int i10) {
        this.f1810 = inputStream;
        this.f1811 = r42;
        this.f1807 = 0;
        this.f1813 = new byte[i10];
        this.f1812 = false;
    }
}
