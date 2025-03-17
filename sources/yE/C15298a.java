package yE;

import android.content.Context;
import java.util.Arrays;
import org.slf4j.Logger;

/* renamed from: yE.a  reason: case insensitive filesystem */
public class C15298a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f132207a;

    /* renamed from: b  reason: collision with root package name */
    private final Logger f132208b;

    public C15298a(Context context, Logger logger) {
        this.f132207a = context;
        this.f132208b = logger;
    }

    public boolean a(String str) {
        return this.f132207a.deleteFile(str);
    }

    public boolean b(String str) {
        String[] fileList = this.f132207a.fileList();
        return fileList != null && Arrays.asList(fileList).contains(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|(2:24|25)|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.f132208b.warn("Unable to load file {}.", (java.lang.Object) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r2 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        r7.f132208b.warn("Unable to close file {}.", (java.lang.Object) r8, (java.lang.Object) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0055, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
        r7.f132208b.warn("Unable to close file {}.", (java.lang.Object) r8, (java.lang.Object) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051 A[SYNTHETIC, Splitter:B:30:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Unable to close file {}."
            r1 = 0
            android.content.Context r2 = r7.f132207a     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
            java.io.FileInputStream r2 = r2.openFileInput(r8)     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003b }
            r3.<init>(r2)     // Catch:{ Exception -> 0x003b }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b }
            r4.<init>(r3)     // Catch:{ Exception -> 0x003b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b }
            r3.<init>()     // Catch:{ Exception -> 0x003b }
        L_0x0018:
            java.lang.String r5 = r4.readLine()     // Catch:{ Exception -> 0x003b }
            if (r5 == 0) goto L_0x0024
            r3.append(r5)     // Catch:{ Exception -> 0x003b }
            goto L_0x0018
        L_0x0022:
            r1 = move-exception
            goto L_0x004f
        L_0x0024:
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x003b }
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ Exception -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r2 = move-exception
            org.slf4j.Logger r3 = r7.f132208b
            r3.warn((java.lang.String) r0, (java.lang.Object) r8, (java.lang.Object) r2)
        L_0x0034:
            return r1
        L_0x0035:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x004f
        L_0x003a:
            r2 = r1
        L_0x003b:
            org.slf4j.Logger r3 = r7.f132208b     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = "Unable to load file {}."
            r3.warn((java.lang.String) r4, (java.lang.Object) r8)     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ Exception -> 0x0048 }
            goto L_0x004e
        L_0x0048:
            r2 = move-exception
            org.slf4j.Logger r3 = r7.f132208b
            r3.warn((java.lang.String) r0, (java.lang.Object) r8, (java.lang.Object) r2)
        L_0x004e:
            return r1
        L_0x004f:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x005b
        L_0x0055:
            r2 = move-exception
            org.slf4j.Logger r3 = r7.f132208b
            r3.warn((java.lang.String) r0, (java.lang.Object) r8, (java.lang.Object) r2)
        L_0x005b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yE.C15298a.c(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r4.f132208b.warn("Unable to close file {}.", (java.lang.Object) r5, (java.lang.Object) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4.f132208b.error("Error saving file {}.", (java.lang.Object) r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "Unable to close file {}."
            r1 = 0
            r2 = 0
            android.content.Context r3 = r4.f132207a     // Catch:{ Exception -> 0x001f }
            java.io.FileOutputStream r2 = r3.openFileOutput(r5, r1)     // Catch:{ Exception -> 0x001f }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x001f }
            r2.write(r6)     // Catch:{ Exception -> 0x001f }
            r2.close()     // Catch:{ Exception -> 0x0015 }
            goto L_0x001b
        L_0x0015:
            r6 = move-exception
            org.slf4j.Logger r1 = r4.f132208b
            r1.warn((java.lang.String) r0, (java.lang.Object) r5, (java.lang.Object) r6)
        L_0x001b:
            r5 = 1
            return r5
        L_0x001d:
            r6 = move-exception
            goto L_0x0033
        L_0x001f:
            org.slf4j.Logger r6 = r4.f132208b     // Catch:{ all -> 0x001d }
            java.lang.String r3 = "Error saving file {}."
            r6.error((java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0032
            r2.close()     // Catch:{ Exception -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r6 = move-exception
            org.slf4j.Logger r2 = r4.f132208b
            r2.warn((java.lang.String) r0, (java.lang.Object) r5, (java.lang.Object) r6)
        L_0x0032:
            return r1
        L_0x0033:
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r1 = move-exception
            org.slf4j.Logger r2 = r4.f132208b
            r2.warn((java.lang.String) r0, (java.lang.Object) r5, (java.lang.Object) r1)
        L_0x003f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yE.C15298a.d(java.lang.String, java.lang.String):boolean");
    }
}
