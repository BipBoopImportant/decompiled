package E;

import C.U;
import C.V;
import G.f;
import M.c;
import O.B;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

class A implements O.A<a, U.h> {

    static abstract class a {
        a() {
        }

        static a c(B<byte[]> b10, U.g gVar) {
            return new C4421d(b10, gVar);
        }

        /* access modifiers changed from: package-private */
        public abstract U.g a();

        /* access modifiers changed from: package-private */
        public abstract B<byte[]> b();
    }

    A() {
    }

    private static Uri b(File file, File file2) {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new V(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri c(java.io.File r6, C.U.g r7) {
        /*
            android.content.ContentResolver r0 = r7.a()
            java.util.Objects.requireNonNull(r0)
            android.content.ContentValues r1 = r7.b()
            if (r1 == 0) goto L_0x0017
            android.content.ContentValues r1 = new android.content.ContentValues
            android.content.ContentValues r2 = r7.b()
            r1.<init>(r2)
            goto L_0x001c
        L_0x0017:
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
        L_0x001c:
            r2 = 1
            l(r1, r2)
            r3 = 0
            r4 = 0
            android.net.Uri r7 = r7.f()     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045 }
            android.net.Uri r7 = r0.insert(r7, r1)     // Catch:{ IOException -> 0x0047, SecurityException -> 0x0045 }
            if (r7 == 0) goto L_0x003b
            e(r6, r7, r0)     // Catch:{ IOException -> 0x0039, SecurityException -> 0x0036, all -> 0x0033 }
            n(r7, r0, r3)
            return r7
        L_0x0033:
            r6 = move-exception
            r4 = r7
            goto L_0x005f
        L_0x0036:
            r6 = move-exception
        L_0x0037:
            r4 = r7
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            goto L_0x0037
        L_0x003b:
            C.V r6 = new C.V     // Catch:{ IOException -> 0x0039, SecurityException -> 0x0036, all -> 0x0033 }
            java.lang.String r1 = "Failed to insert a MediaStore URI."
            r6.<init>(r2, r1, r4)     // Catch:{ IOException -> 0x0039, SecurityException -> 0x0036, all -> 0x0033 }
            throw r6     // Catch:{ IOException -> 0x0039, SecurityException -> 0x0036, all -> 0x0033 }
        L_0x0043:
            r6 = move-exception
            goto L_0x005f
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            C.V r7 = new C.V     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r1.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = "Failed to write to MediaStore URI: "
            r1.append(r5)     // Catch:{ all -> 0x0043 }
            r1.append(r4)     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0043 }
            r7.<init>(r2, r1, r6)     // Catch:{ all -> 0x0043 }
            throw r7     // Catch:{ all -> 0x0043 }
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            n(r4, r0, r3)
        L_0x0064:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E.A.c(java.io.File, C.U$g):android.net.Uri");
    }

    private static void d(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static void e(File file, Uri uri, ContentResolver contentResolver) {
        OutputStream openOutputStream = contentResolver.openOutputStream(uri);
        if (openOutputStream != null) {
            try {
                d(file, openOutputStream);
                openOutputStream.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new FileNotFoundException(uri + " cannot be resolved.");
        }
        throw th;
    }

    private static File f(U.g gVar) {
        try {
            File c10 = gVar.c();
            if (c10 == null) {
                return File.createTempFile("CameraX", ".tmp");
            }
            String parent = c10.getParent();
            return new File(parent, "CameraX" + UUID.randomUUID().toString() + g(c10));
        } catch (IOException e10) {
            throw new V(1, "Failed to create temp file.", e10);
        }
    }

    private static String g(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf >= 0 ? name.substring(lastIndexOf) : "";
    }

    private static boolean h(U.g gVar) {
        return gVar.c() != null;
    }

    private static boolean i(U.g gVar) {
        return (gVar.f() == null || gVar.a() == null || gVar.b() == null) ? false : true;
    }

    private static boolean j(U.g gVar) {
        return gVar.e() != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        throw new C.V(1, "Failed to write to OutputStream.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r3.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.net.Uri k(java.io.File r3, C.U.g r4) {
        /*
            r0 = 0
            boolean r1 = i(r4)     // Catch:{ IOException -> 0x0034 }
            if (r1 == 0) goto L_0x000e
            android.net.Uri r0 = c(r3, r4)     // Catch:{ IOException -> 0x0034 }
            goto L_0x0030
        L_0x000c:
            r4 = move-exception
            goto L_0x003d
        L_0x000e:
            boolean r1 = j(r4)     // Catch:{ IOException -> 0x0034 }
            if (r1 == 0) goto L_0x001f
            java.io.OutputStream r4 = r4.e()     // Catch:{ IOException -> 0x0034 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ IOException -> 0x0034 }
            d(r3, r4)     // Catch:{ IOException -> 0x0034 }
            goto L_0x0030
        L_0x001f:
            boolean r1 = h(r4)     // Catch:{ IOException -> 0x0034 }
            if (r1 == 0) goto L_0x0030
            java.io.File r4 = r4.c()     // Catch:{ IOException -> 0x0034 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ IOException -> 0x0034 }
            android.net.Uri r0 = b(r3, r4)     // Catch:{ IOException -> 0x0034 }
        L_0x0030:
            r3.delete()
            return r0
        L_0x0034:
            C.V r4 = new C.V     // Catch:{ all -> 0x000c }
            java.lang.String r1 = "Failed to write to OutputStream."
            r2 = 1
            r4.<init>(r2, r1, r0)     // Catch:{ all -> 0x000c }
            throw r4     // Catch:{ all -> 0x000c }
        L_0x003d:
            r3.delete()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E.A.k(java.io.File, C.U$g):android.net.Uri");
    }

    private static void l(ContentValues contentValues, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i10));
        }
    }

    private static void m(File file, f fVar, U.g gVar, int i10) {
        try {
            f h10 = f.h(file);
            fVar.g(h10);
            if (h10.s() == 0 && i10 != 0) {
                h10.z(i10);
            }
            U.d d10 = gVar.d();
            if (d10.b()) {
                h10.l();
            }
            if (d10.c()) {
                h10.m();
            }
            if (d10.a() != null) {
                h10.b(d10.a());
            }
            h10.A();
        } catch (IOException e10) {
            throw new V(1, "Failed to update Exif data", e10);
        }
    }

    private static void n(Uri uri, ContentResolver contentResolver, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            l(contentValues, i10);
            contentResolver.update(uri, contentValues, (String) null, (String[]) null);
        }
    }

    private static void o(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr, 0, new c().b(bArr));
            fileOutputStream.close();
            return;
        } catch (IOException e10) {
            throw new V(1, "Failed to write to temp file", e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: a */
    public U.h apply(a aVar) {
        B<byte[]> b10 = aVar.b();
        U.g a10 = aVar.a();
        File f10 = f(a10);
        o(f10, b10.c());
        f d10 = b10.d();
        Objects.requireNonNull(d10);
        m(f10, d10, a10, b10.f());
        return new U.h(k(f10, a10));
    }
}
