package androidx.profileinstaller;

import L4.a;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f43576a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f43577b;

    /* renamed from: c  reason: collision with root package name */
    private final f.c f43578c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f43579d;

    /* renamed from: e  reason: collision with root package name */
    private final File f43580e;

    /* renamed from: f  reason: collision with root package name */
    private final String f43581f;

    /* renamed from: g  reason: collision with root package name */
    private final String f43582g;

    /* renamed from: h  reason: collision with root package name */
    private final String f43583h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f43584i = false;

    /* renamed from: j  reason: collision with root package name */
    private c[] f43585j;

    /* renamed from: k  reason: collision with root package name */
    private byte[] f43586k;

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f43576a = assetManager;
        this.f43577b = executor;
        this.f43578c = cVar;
        this.f43581f = str;
        this.f43582g = str2;
        this.f43583h = str3;
        this.f43580e = file;
        this.f43579d = d();
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream h10;
        try {
            h10 = h(this.f43576a, this.f43583h);
            if (h10 != null) {
                this.f43585j = g.r(h10, g.p(h10, g.f43599b), bArr, cVarArr);
                h10.close();
                return this;
            }
            if (h10 != null) {
                h10.close();
            }
            return null;
        } catch (FileNotFoundException e10) {
            this.f43578c.a(9, e10);
        } catch (IOException e11) {
            this.f43578c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f43585j = null;
            this.f43578c.a(8, e12);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private void c() {
        if (!this.f43584i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return i.f43611a;
        }
        switch (i10) {
            case 26:
                return i.f43614d;
            case 27:
                return i.f43613c;
            case 28:
            case 29:
            case 30:
                return i.f43612b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f43582g);
        } catch (FileNotFoundException e10) {
            this.f43578c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f43578c.a(7, e11);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f43578c.a(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f43578c.b(5, (Object) null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) {
        try {
            c[] x10 = g.x(inputStream, g.p(inputStream, g.f43598a), this.f43581f);
            try {
                inputStream.close();
                return x10;
            } catch (IOException e10) {
                this.f43578c.a(7, e10);
                return x10;
            }
        } catch (IOException e11) {
            this.f43578c.a(7, e11);
            inputStream.close();
            return null;
        } catch (IllegalStateException e12) {
            this.f43578c.a(8, e12);
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f43578c.a(7, e13);
            }
            return null;
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f43578c.a(7, e14);
            }
            throw th2;
        }
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private void l(int i10, Object obj) {
        this.f43577b.execute(new a(this, i10, obj));
    }

    public boolean e() {
        if (this.f43579d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f43580e.exists()) {
            try {
                if (!this.f43580e.createNewFile()) {
                    l(4, (Object) null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, (Object) null);
                return false;
            }
        } else if (!this.f43580e.canWrite()) {
            l(4, (Object) null);
            return false;
        }
        this.f43584i = true;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = b(r0, r2.f43579d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.profileinstaller.b i() {
        /*
            r2 = this;
            r2.c()
            byte[] r0 = r2.f43579d
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            android.content.res.AssetManager r0 = r2.f43576a
            java.io.InputStream r0 = r2.f(r0)
            if (r0 == 0) goto L_0x0016
            androidx.profileinstaller.c[] r0 = r2.j(r0)
            r2.f43585j = r0
        L_0x0016:
            androidx.profileinstaller.c[] r0 = r2.f43585j
            if (r0 == 0) goto L_0x0029
            boolean r1 = k()
            if (r1 == 0) goto L_0x0029
            byte[] r1 = r2.f43579d
            androidx.profileinstaller.b r0 = r2.b(r0, r1)
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.b.i():androidx.profileinstaller.b");
    }

    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f43585j;
        byte[] bArr = this.f43579d;
        if (!(cVarArr == null || bArr == null)) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                g.F(byteArrayOutputStream, bArr);
                if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f43578c.a(5, (Object) null);
                    this.f43585j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f43586k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f43585j = null;
            } catch (IOException e10) {
                this.f43578c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f43578c.a(8, e11);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return this;
        throw th;
    }

    public boolean n() {
        ByteArrayInputStream byteArrayInputStream;
        FileChannel channel;
        FileLock tryLock;
        byte[] bArr = this.f43586k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(this.f43580e);
            try {
                channel = fileOutputStream.getChannel();
                tryLock = channel.tryLock();
                d.l(byteArrayInputStream, fileOutputStream, tryLock);
                l(1, (Object) null);
                if (tryLock != null) {
                    tryLock.close();
                }
                channel.close();
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f43586k = null;
                this.f43585j = null;
                return true;
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f43586k = null;
            this.f43585j = null;
            return false;
        } catch (IOException e11) {
            l(7, e11);
            this.f43586k = null;
            this.f43585j = null;
            return false;
        } catch (Throwable th3) {
            this.f43586k = null;
            this.f43585j = null;
            throw th3;
        }
        throw th;
        throw th;
        throw th;
    }
}
