package nts;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.Socket;

/* renamed from: nts.ᜉ  reason: contains not printable characters */
public class C3961 extends C4179 {

    /* renamed from: ӈ  reason: contains not printable characters */
    public RandomAccessFile f2353;

    /* renamed from: ဓ  reason: contains not printable characters */
    public int f2354;

    /* renamed from: ᒧ  reason: contains not printable characters */
    public int f2355;

    /* renamed from: ᛢ  reason: contains not printable characters */
    public C3874 f2356;

    /* renamed from: ᜉ  reason: contains not printable characters */
    public String f2357;

    /* renamed from: ᭇ  reason: contains not printable characters */
    public C3544[] f2358;

    /* renamed from: ᵛ  reason: contains not printable characters */
    public long f2359;

    /* renamed from: ⶢ  reason: contains not printable characters */
    public String f2360;

    static {
        C3823.m1620(" ");
        C3823.m1620("-");
    }

    public C3961(Object obj, Object obj2) {
        this(obj, (Socket) null, obj2);
    }

    /* renamed from: ϔ  reason: contains not printable characters */
    public long m2231() {
        String str = this.f2357;
        if (str == null || str.length() <= 0) {
            return 0;
        }
        File file = new File(this.f2357);
        if (file.exists()) {
            return file.length();
        }
        throw new C3625((Throwable) null, 303, C3727.m1052(":<8F@DBMKOI\u0001\u0005\n\t\u0000\bZDfpwztxu{>{uw9|hcv$mmu jvd$uVZ[]G\u0010^NZR\u0012MIQMC\u0007BLNF\u0000\u0003rQ]\\Z@\u0017AKQO_\u001dHP\u001eMO@CI\u0004TR[MJG\u0003qR^_YC\u0014BHRL\\\u001eYUQG\u0003\u00025\u0016\u001a\u001b\u001d\u0007P\u001e\u000e\u001a\u0012]\u001c\u0012\u0014\u001cFE³ÕÙÞÃÆàÍÏÎÂÅÑÍÄÄËÃÁÞÉ×", 18, 30, 27));
    }

    /* renamed from: њ  reason: contains not printable characters */
    public String m2232() {
        return this.f2360;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2233(int i10, byte[] bArr) {
        throw null;
    }

    /* renamed from: ภ  reason: contains not printable characters */
    public void m2238(String str) {
        String str2 = C3823.f1540;
        if (str == null) {
            str = "";
        }
        this.f2360 = str;
    }

    /* renamed from: ዢ  reason: contains not printable characters */
    public void m2239() {
        RandomAccessFile randomAccessFile = this.f2353;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } finally {
                this.f2353 = null;
            }
        }
    }

    /* renamed from: ᐾ  reason: contains not printable characters */
    public boolean m2240() {
        return this.f2360.length() != 0;
    }

    /* renamed from: ᚪ  reason: contains not printable characters */
    public void m2241() {
        int i10 = this.f3969;
        this.f3924 = i10;
        if (i10 == 0) {
            this.f3924 = this.f3926 == this.f2354 ? 2 : 1;
        }
    }

    /* renamed from: ᡅ  reason: contains not printable characters */
    public void m2242() {
        synchronized (this.f375) {
            try {
                if (!m3648()) {
                    m3535(false);
                    this.f2356.m1926();
                    m3578(true, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public void m2243(long j10) {
        try {
            this.f2353 = C3856.f1647.m2011(this.f2360, j10);
        } catch (IOException unused) {
            throw new C3625((Throwable) null, 304, C3727.m1052(":<8F@DBMKOI\u0001\u0005\n\t\u0000\bZDfpwztxu{>{uw9|hcv$mmu jvd$uVZ[]G\u0010^NZR\u0012MIQMC\u0007BLNF\u0000\u0003rQ]\\Z@\u0017AKQO_\u001dHP\u001eMO@CI\u0004TR[MJG\u0003qR^_YC\u0014BHRL\\\u001eYUQG\u0003\u00025\u0016\u001a\u001b\u001d\u0007P\u001e\u000e\u001a\u0012]\u001c\u0012\u0014\u001cFE³ÕÙÞÃÆàÍÏÎÂÅÑÍÄÄËÃÁÞÉ×", 48, 24, 30) + this.f2360 + "\".");
        }
    }

    public C3961(Object obj, Socket socket, Object obj2) {
        super(obj, (Socket) null, obj2);
        this.f2356 = new C3874();
        this.f2357 = "";
        this.f2360 = "";
        this.f2353 = null;
        this.f2359 = 0;
        this.f2358 = new C3544[]{new C3544(), new C3544()};
        this.f2354 = 0;
        m3546(60);
        m1802(true);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2234(byte[] bArr, int i10) {
        m2235(bArr, 0, bArr.length, i10, (OutputStream) null);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2235(byte[] bArr, int i10, int i11, int i12, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i10, i11);
                if (i12 != 1) {
                    m2233(i11, bArr);
                }
            } catch (IOException e10) {
                throw new C3625((Throwable) null, 304, e10.getMessage());
            }
        } else {
            m3579(bArr, i10, i11, i12);
        }
    }

    /* renamed from: ภ  reason: contains not printable characters */
    public void m2237() {
        super.m3588();
        this.f3899 = 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2236(byte[] bArr, int i10, int i11, byte[] bArr2) {
        RandomAccessFile randomAccessFile = this.f2353;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.write(bArr, i10, i11);
                if (bArr2.length > 0) {
                    this.f2353.write(bArr2);
                }
            } catch (IOException unused) {
                m2239();
                throw new C3625((Throwable) null, 304, C3727.m1052(":<8F@DBMKOI\u0001\u0005\n\t\u0000\bZDfpwztxu{>{uw9|hcv$mmu jvd$uVZ[]G\u0010^NZR\u0012MIQMC\u0007BLNF\u0000\u0003rQ]\\Z@\u0017AKQO_\u001dHP\u001eMO@CI\u0004TR[MJG\u0003qR^_YC\u0014BHRL\\\u001eYUQG\u0003\u00025\u0016\u001a\u001b\u001d\u0007P\u001e\u000e\u001a\u0012]\u001c\u0012\u0014\u001cFE³ÕÙÞÃÆàÍÏÎÂÅÑÍÄÄËÃÁÞÉ×", (int) CheckoutActivity.RESULT_CANCELED, 19, 68) + this.f2360 + "\".");
            }
        }
    }
}
