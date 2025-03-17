package Sb;

import Nb.g;
import Qb.C9251i;
import Sb.h;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

class i implements d {

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f63299d = Charset.forName(Constants.ENCODING);

    /* renamed from: a  reason: collision with root package name */
    private final File f63300a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63301b;

    /* renamed from: c  reason: collision with root package name */
    private h f63302c;

    class a implements h.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ byte[] f63303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f63304b;

        a(byte[] bArr, int[] iArr) {
            this.f63303a = bArr;
            this.f63304b = iArr;
        }

        public void a(InputStream inputStream, int i10) {
            try {
                inputStream.read(this.f63303a, this.f63304b[0], i10);
                int[] iArr = this.f63304b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f63306a;

        /* renamed from: b  reason: collision with root package name */
        public final int f63307b;

        b(byte[] bArr, int i10) {
            this.f63306a = bArr;
            this.f63307b = i10;
        }
    }

    i(File file, int i10) {
        this.f63300a = file;
        this.f63301b = i10;
    }

    private void f(long j10, String str) {
        if (this.f63302c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i10 = this.f63301b / 4;
                if (str.length() > i10) {
                    str = "..." + str.substring(str.length() - i10);
                }
                this.f63302c.g(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f63299d));
                while (!this.f63302c.q() && this.f63302c.N() > this.f63301b) {
                    this.f63302c.z();
                }
            } catch (IOException e10) {
                g.f().e("There was a problem writing to the Crashlytics log.", e10);
            }
        }
    }

    private b g() {
        if (!this.f63300a.exists()) {
            return null;
        }
        h();
        h hVar = this.f63302c;
        if (hVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[hVar.N()];
        try {
            this.f63302c.n(new a(bArr, iArr));
        } catch (IOException e10) {
            g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f63302c == null) {
            try {
                this.f63302c = new h(this.f63300a);
            } catch (IOException e10) {
                g f10 = g.f();
                f10.e("Could not open log file: " + this.f63300a, e10);
            }
        }
    }

    public void a() {
        C9251i.f(this.f63302c, "There was a problem closing the Crashlytics log file.");
        this.f63302c = null;
    }

    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f63299d);
        }
        return null;
    }

    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f63307b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f63306a, 0, bArr, 0, i10);
        return bArr;
    }

    public void d() {
        a();
        this.f63300a.delete();
    }

    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
