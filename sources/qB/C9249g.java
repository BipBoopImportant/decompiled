package Qb;

import Tb.F;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: Qb.g  reason: case insensitive filesystem */
class C9249g implements N {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f62978a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62979b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62980c;

    C9249g(String str, String str2, byte[] bArr) {
        this.f62979b = str;
        this.f62980c = str2;
        this.f62978a = bArr;
    }

    private byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        if (b()) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(this.f62978a);
            gZIPOutputStream.finish();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
        throw th;
    }

    private boolean b() {
        byte[] bArr = this.f62978a;
        return bArr == null || bArr.length == 0;
    }

    public InputStream j() {
        if (b()) {
            return null;
        }
        return new ByteArrayInputStream(this.f62978a);
    }

    public F.d.b k() {
        byte[] a10 = a();
        if (a10 == null) {
            return null;
        }
        return F.d.b.a().b(a10).c(this.f62979b).a();
    }

    public String l() {
        return this.f62980c;
    }
}
