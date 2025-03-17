package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Date;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.m  reason: case insensitive filesystem */
class C14087m {

    /* renamed from: a  reason: collision with root package name */
    private static final String f121273a = "com.oppwa.mobile.connect.checkout.dialog.m";

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[SYNTHETIC, Splitter:B:16:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r2, java.lang.String r3, android.graphics.Bitmap r4) {
        /*
            java.io.File r2 = a((android.content.Context) r2)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0022 }
            java.lang.String r2 = a((java.io.File) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0022 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0022 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch:{ Exception -> 0x001d, all -> 0x001b }
            r1.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x0037
        L_0x0019:
            r2 = move-exception
            goto L_0x0030
        L_0x001b:
            r2 = move-exception
            goto L_0x0039
        L_0x001d:
            r2 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0020:
            r2 = move-exception
            goto L_0x0038
        L_0x0022:
            r2 = move-exception
        L_0x0023:
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0020 }
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.String) r2)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x0037
        L_0x0030:
            java.lang.String r2 = r2.getMessage()
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.String) r2)
        L_0x0037:
            return
        L_0x0038:
            r1 = r0
        L_0x0039:
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0047
        L_0x003f:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.String) r3)
        L_0x0047:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C14087m.a(android.content.Context, java.lang.String, android.graphics.Bitmap):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.io.FileInputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0037 A[SYNTHETIC, Splitter:B:21:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048 A[SYNTHETIC, Splitter:B:28:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap b(android.content.Context r4, java.lang.String r5) {
        /*
            java.io.File r0 = a((android.content.Context) r4)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            long r2 = a((android.content.Context) r4, (java.lang.String) r5)
            boolean r4 = a((long) r2)
            if (r4 == 0) goto L_0x0055
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r5 = a((java.io.File) r0, (java.lang.String) r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ Exception -> 0x0027, all -> 0x0025 }
            r4.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0071
        L_0x0023:
            r4 = move-exception
            goto L_0x003b
        L_0x0025:
            r5 = move-exception
            goto L_0x0046
        L_0x0027:
            r5 = move-exception
            goto L_0x002e
        L_0x0029:
            r4 = move-exception
            r5 = r4
            goto L_0x0045
        L_0x002c:
            r5 = move-exception
            r4 = r1
        L_0x002e:
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0043 }
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.String) r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x0071
            r4.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0071
        L_0x003b:
            java.lang.String r4 = r4.getMessage()
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.String) r4)
            goto L_0x0071
        L_0x0043:
            r5 = move-exception
            r1 = r4
        L_0x0045:
            r4 = r1
        L_0x0046:
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x0054
        L_0x004c:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            com.oppwa.mobile.connect.utils.Logger.error((java.lang.String) r4)
        L_0x0054:
            throw r5
        L_0x0055:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = a((java.io.File) r0, (java.lang.String) r5)
            r4.<init>(r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x0071
            boolean r4 = r4.delete()
            if (r4 != 0) goto L_0x0071
            java.lang.String r4 = f121273a
            java.lang.String r5 = "Cannot delete file"
            android.util.Log.d(r4, r5)
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C14087m.b(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    private static long a(Context context, String str) {
        File file = new File(a(context) + "/" + str + ".png");
        if (!file.exists()) {
            return 0;
        }
        String str2 = f121273a;
        Log.d(str2, "Check creation date " + str);
        return new Date(file.lastModified()).getTime();
    }

    private static boolean a(long j10) {
        long currentTimeMillis = System.currentTimeMillis() - j10;
        if (currentTimeMillis >= 1209600000) {
            return false;
        }
        String str = f121273a;
        Log.d(str, "Prepare to delete " + currentTimeMillis);
        return true;
    }

    private static File a(Context context) {
        return context.getFilesDir();
    }

    private static String a(File file, String str) {
        return file.getPath() + "/" + str + ".png";
    }
}
