package D7;

import F7.b;
import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class e {

    /* renamed from: f  reason: collision with root package name */
    private static final a f34571f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final a f34572a;

    /* renamed from: b  reason: collision with root package name */
    private final d f34573b;

    /* renamed from: c  reason: collision with root package name */
    private final b f34574c;

    /* renamed from: d  reason: collision with root package name */
    private final ContentResolver f34575d;

    /* renamed from: e  reason: collision with root package name */
    private final List<ImageHeaderParser> f34576e;

    e(List<ImageHeaderParser> list, d dVar, b bVar, ContentResolver contentResolver) {
        this(list, f34571f, dVar, bVar, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x001a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            D7.d r2 = r6.f34573b     // Catch:{ SecurityException -> 0x0027, all -> 0x0025 }
            android.database.Cursor r2 = r2.a(r7)     // Catch:{ SecurityException -> 0x0027, all -> 0x0025 }
            if (r2 == 0) goto L_0x001f
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x001d }
            if (r3 == 0) goto L_0x001f
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch:{ SecurityException -> 0x001d }
            r2.close()
            return r7
        L_0x001a:
            r7 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x001d:
            r3 = move-exception
            goto L_0x0029
        L_0x001f:
            if (r2 == 0) goto L_0x0024
            r2.close()
        L_0x0024:
            return r1
        L_0x0025:
            r7 = move-exception
            goto L_0x004a
        L_0x0027:
            r3 = move-exception
            r2 = r1
        L_0x0029:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
            r4.<init>()     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch:{ all -> 0x001a }
            r4.append(r7)     // Catch:{ all -> 0x001a }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x001a }
            android.util.Log.d(r0, r7, r3)     // Catch:{ all -> 0x001a }
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r2.close()
        L_0x0049:
            return r1
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()
        L_0x004f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.e.b(android.net.Uri):java.lang.String");
    }

    private boolean c(File file) {
        return this.f34572a.a(file) && 0 < this.f34572a.c(file);
    }

    /* access modifiers changed from: package-private */
    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f34575d.openInputStream(uri);
            int b10 = a.b(this.f34576e, openInputStream, this.f34574c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return b10;
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e10);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused2) {
                return -1;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    public InputStream d(Uri uri) {
        String b10 = b(uri);
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        File b11 = this.f34572a.b(b10);
        if (!c(b11)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b11);
        try {
            return this.f34575d.openInputStream(fromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e10));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, b bVar, ContentResolver contentResolver) {
        this.f34572a = aVar;
        this.f34573b = dVar;
        this.f34574c = bVar;
        this.f34575d = contentResolver;
        this.f34576e = list;
    }
}
