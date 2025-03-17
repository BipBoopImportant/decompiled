package Qb;

import Tb.F;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class I implements N {

    /* renamed from: a  reason: collision with root package name */
    private final File f62929a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62930b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62931c;

    I(String str, String str2, File file) {
        this.f62930b = str;
        this.f62931c = str2;
        this.f62929a = file;
    }

    private byte[] a() {
        InputStream j10;
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            j10 = j();
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (j10 == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (j10 != null) {
                    j10.close();
                }
                return null;
            }
            while (true) {
                int read = j10.read(bArr);
                if (read > 0) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    j10.close();
                    return byteArray;
                }
            }
            throw th;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public InputStream j() {
        if (this.f62929a.exists() && this.f62929a.isFile()) {
            try {
                return new FileInputStream(this.f62929a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public F.d.b k() {
        byte[] a10 = a();
        if (a10 != null) {
            return F.d.b.a().b(a10).c(this.f62930b).a();
        }
        return null;
    }

    public String l() {
        return this.f62931c;
    }
}
