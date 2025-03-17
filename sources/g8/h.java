package G8;

import D8.c;
import HJ.C15838d;
import HJ.C15854t;
import YH.C16877v;
import android.os.StatFs;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u000eJ\u001d\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J1\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u00182\u0006\u0010\u0005\u001a\u00020\n2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b%\u0010\u000eJ\u0015\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010(J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b0\u00101J\u001f\u00103\u001a\u0002022\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\fH\u0001¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u0010+\u001a\u00020\u0004H\u0001¢\u0006\u0004\b6\u00107J\u0019\u0010:\u001a\u0002092\b\u00108\u001a\u0004\u0018\u000105H\u0001¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u000109H\u0001¢\u0006\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"LG8/h;", "", "<init>", "()V", "Ljava/io/File;", "directory", "", "blockSize", "i", "(Ljava/io/File;J)J", "", "path", "", "o", "(Ljava/lang/String;)Z", "filename", "data", "append", "LXH/N;", "t", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "s", "(Ljava/lang/String;[BZ)V", "", "q", "(Ljava/lang/String;)Ljava/util/List;", "p", "(Ljava/lang/String;)[B", "l", "", "n", "(Ljava/lang/String;)[Ljava/lang/String;", "Lkotlin/Function1;", "transform", "m", "(Ljava/lang/String;LnI/l;)Ljava/util/List;", "b", "fileOrDirectory", "c", "(Ljava/io/File;)Z", "e", "(Ljava/lang/String;)Ljava/io/File;", "file", "r", "j", "(Ljava/lang/String;)J", "Landroid/os/StatFs;", "k", "(Ljava/lang/String;)Landroid/os/StatFs;", "Ljava/io/FileOutputStream;", "g", "(Ljava/io/File;Z)Ljava/io/FileOutputStream;", "Ljava/io/FileInputStream;", "f", "(Ljava/io/File;)Ljava/io/FileInputStream;", "fileInputStream", "Ljava/io/InputStreamReader;", "h", "(Ljava/io/FileInputStream;)Ljava/io/InputStreamReader;", "inputStreamReader", "Ljava/io/BufferedReader;", "d", "(Ljava/io/InputStreamReader;)Ljava/io/BufferedReader;", "LD8/c;", "a", "LD8/c;", "logger", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36271b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f36272c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final c f36273a = new c("FileStorageUtil");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LG8/h$a;", "", "<init>", "()V", "", "INVALID_FILE", "[B", "a", "()[B", "", "CS_FILES_FOLDER", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final byte[] a() {
            return h.f36272c;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final long i(File file, long j10) {
        long j11;
        long length = file.length();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    C17542s.i(file2, "file");
                    j11 = i(file2, j10);
                } else {
                    j11 = file2.length() % j10 == 0 ? file2.length() : ((file2.length() / j10) + 1) * j10;
                }
                length += j11;
            }
        }
        return length;
    }

    public final boolean b(String str) {
        C17542s.j(str, "filename");
        return e(str).delete();
    }

    public final boolean c(File file) {
        File[] listFiles;
        C17542s.j(file, "fileOrDirectory");
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                C17542s.i(file2, "child");
                c(file2);
            }
        }
        return file.delete();
    }

    public final BufferedReader d(InputStreamReader inputStreamReader) {
        return new BufferedReader(inputStreamReader);
    }

    public final File e(String str) {
        C17542s.j(str, "path");
        return new File(str);
    }

    public final FileInputStream f(File file) {
        C17542s.j(file, "file");
        return new FileInputStream(file);
    }

    public final FileOutputStream g(File file, boolean z10) {
        C17542s.j(file, "file");
        return new FileOutputStream(file, z10);
    }

    public final InputStreamReader h(FileInputStream fileInputStream) {
        return new InputStreamReader(fileInputStream, C15838d.f135279b);
    }

    public final long j(String str) {
        C17542s.j(str, "path");
        return i(e(str), k(str).getBlockSizeLong());
    }

    public final StatFs k(String str) {
        C17542s.j(str, "path");
        return new StatFs(str);
    }

    public final boolean l(String str) {
        C17542s.j(str, "path");
        File e10 = e(str);
        return e10.isDirectory() && e10.canRead() && e10.canWrite();
    }

    public final List<String> m(String str, C17642l<? super File, String> lVar) {
        ArrayList arrayList;
        C17542s.j(str, "directory");
        C17542s.j(lVar, "transform");
        File[] listFiles = e(str).listFiles();
        if (listFiles != null) {
            arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                C17542s.i(file, "it");
                arrayList.add(lVar.invoke(file));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? C16877v.n() : arrayList;
    }

    public final String[] n(String str) {
        C17542s.j(str, "path");
        File e10 = e(str);
        if (!e10.isDirectory() || !e10.canRead()) {
            return null;
        }
        return e10.list();
    }

    public final boolean o(String str) {
        C17542s.j(str, "path");
        return e(str).mkdirs();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        jI.C17416c.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] p(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0013
            byte[] r5 = f36272c
            return r5
        L_0x0013:
            java.io.FileInputStream r0 = r4.f(r0)     // Catch:{ IOException -> 0x0020 }
            byte[] r1 = jI.C17415b.c(r0)     // Catch:{ all -> 0x0022 }
            r2 = 0
            jI.C17416c.a(r0, r2)     // Catch:{ IOException -> 0x0020 }
            goto L_0x003e
        L_0x0020:
            r0 = move-exception
            goto L_0x0029
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            jI.C17416c.a(r0, r1)     // Catch:{ IOException -> 0x0020 }
            throw r2     // Catch:{ IOException -> 0x0020 }
        L_0x0029:
            D8.c r1 = r4.f36273a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed while reading file : "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.i(r0, r5)
            byte[] r1 = f36272c
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.h.p(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        jI.C17416c.a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        jI.C17416c.a(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> q(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed while reading file : "
            java.lang.String r1 = "filename"
            kotlin.jvm.internal.C17542s.j(r7, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x005f
            java.io.FileInputStream r1 = r6.f(r1)     // Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x0032 }
            java.io.InputStreamReader r3 = r6.h(r1)     // Catch:{ all -> 0x0036 }
            java.io.BufferedReader r3 = r6.d(r3)     // Catch:{ all -> 0x0036 }
            java.util.List r4 = jI.C17431r.f(r3)     // Catch:{ all -> 0x0038 }
            r2.addAll(r4)     // Catch:{ all -> 0x0038 }
            r4 = 0
            jI.C17416c.a(r3, r4)     // Catch:{ all -> 0x0036 }
            jI.C17416c.a(r1, r4)     // Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x0032 }
            goto L_0x005f
        L_0x0032:
            r1 = move-exception
            goto L_0x0045
        L_0x0034:
            r1 = move-exception
            goto L_0x0057
        L_0x0036:
            r3 = move-exception
            goto L_0x003f
        L_0x0038:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003a }
        L_0x003a:
            r5 = move-exception
            jI.C17416c.a(r3, r4)     // Catch:{ all -> 0x0036 }
            throw r5     // Catch:{ all -> 0x0036 }
        L_0x003f:
            throw r3     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r4 = move-exception
            jI.C17416c.a(r1, r3)     // Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x0032 }
            throw r4     // Catch:{ FileNotFoundException -> 0x0034, IOException -> 0x0032 }
        L_0x0045:
            D8.c r3 = r6.f36273a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
        L_0x004c:
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r3.i(r1, r7)
            goto L_0x005f
        L_0x0057:
            D8.c r3 = r6.f36273a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            goto L_0x004c
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.h.q(java.lang.String):java.util.List");
    }

    public final boolean r(File file) {
        C17542s.j(file, "file");
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException e10) {
            this.f36273a.i(e10, "Failed to create File. exiting... ");
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        jI.C17416c.a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(java.lang.String r4, byte[] r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = "Writing to file: "
            java.lang.String r1 = "filename"
            kotlin.jvm.internal.C17542s.j(r4, r1)
            java.lang.String r1 = "data"
            kotlin.jvm.internal.C17542s.j(r5, r1)
            java.io.File r1 = r3.e(r4)
            boolean r2 = r3.r(r1)
            if (r2 == 0) goto L_0x005b
            java.io.FileOutputStream r6 = r3.g(r1, r6)     // Catch:{ IOException -> 0x003e }
            D8.c r1 = r3.f36273a     // Catch:{ all -> 0x0040 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0040 }
            r2.<init>(r0)     // Catch:{ all -> 0x0040 }
            r2.append(r4)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = ", size: "
            r2.append(r0)     // Catch:{ all -> 0x0040 }
            int r0 = r5.length     // Catch:{ all -> 0x0040 }
            r2.append(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0040 }
            r1.f(r0)     // Catch:{ all -> 0x0040 }
            r6.write(r5)     // Catch:{ all -> 0x0040 }
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ all -> 0x0040 }
            r5 = 0
            jI.C17416c.a(r6, r5)     // Catch:{ IOException -> 0x003e }
            goto L_0x006e
        L_0x003e:
            r5 = move-exception
            goto L_0x0047
        L_0x0040:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            jI.C17416c.a(r6, r5)     // Catch:{ IOException -> 0x003e }
            throw r0     // Catch:{ IOException -> 0x003e }
        L_0x0047:
            D8.c r6 = r3.f36273a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Data not written to file. Filename : "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.i(r5, r4)
            goto L_0x006e
        L_0x005b:
            D8.c r5 = r3.f36273a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to open File: "
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.h(r4)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.h.s(java.lang.String, byte[], boolean):void");
    }

    public final void t(String str, String str2, boolean z10) {
        C17542s.j(str, "filename");
        C17542s.j(str2, "data");
        s(str, C15854t.E(str2), z10);
    }
}
