package z7;

import android.annotation.TargetApi;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: z7.a  reason: case insensitive filesystem */
public final class C9032a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final File f58483a;

    /* renamed from: b  reason: collision with root package name */
    private final File f58484b;

    /* renamed from: c  reason: collision with root package name */
    private final File f58485c;

    /* renamed from: d  reason: collision with root package name */
    private final File f58486d;

    /* renamed from: e  reason: collision with root package name */
    private final int f58487e;

    /* renamed from: f  reason: collision with root package name */
    private long f58488f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final int f58489g;

    /* renamed from: h  reason: collision with root package name */
    private long f58490h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Writer f58491i;

    /* renamed from: j  reason: collision with root package name */
    private final LinkedHashMap<String, d> f58492j = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f58493k;

    /* renamed from: l  reason: collision with root package name */
    private long f58494l = 0;

    /* renamed from: m  reason: collision with root package name */
    final ThreadPoolExecutor f58495m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b((C0954a) null));

    /* renamed from: n  reason: collision with root package name */
    private final Callable<Void> f58496n = new C0954a();

    /* renamed from: z7.a$a  reason: collision with other inner class name */
    class C0954a implements Callable<Void> {
        C0954a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                z7.a r0 = z7.C9032a.this
                monitor-enter(r0)
                z7.a r1 = z7.C9032a.this     // Catch:{ all -> 0x000e }
                java.io.Writer r1 = r1.f58491i     // Catch:{ all -> 0x000e }
                r2 = 0
                if (r1 != 0) goto L_0x0010
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                return r2
            L_0x000e:
                r1 = move-exception
                goto L_0x002a
            L_0x0010:
                z7.a r1 = z7.C9032a.this     // Catch:{ all -> 0x000e }
                r1.h0()     // Catch:{ all -> 0x000e }
                z7.a r1 = z7.C9032a.this     // Catch:{ all -> 0x000e }
                boolean r1 = r1.z()     // Catch:{ all -> 0x000e }
                if (r1 == 0) goto L_0x0028
                z7.a r1 = z7.C9032a.this     // Catch:{ all -> 0x000e }
                r1.U()     // Catch:{ all -> 0x000e }
                z7.a r1 = z7.C9032a.this     // Catch:{ all -> 0x000e }
                r3 = 0
                int unused = r1.f58493k = r3     // Catch:{ all -> 0x000e }
            L_0x0028:
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                return r2
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x000e }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z7.C9032a.C0954a.call():java.lang.Void");
        }
    }

    /* renamed from: z7.a$b */
    private static final class b implements ThreadFactory {
        private b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(C0954a aVar) {
            this();
        }
    }

    /* renamed from: z7.a$c */
    public final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final d f58498a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f58499b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f58500c;

        /* synthetic */ c(C9032a aVar, d dVar, C0954a aVar2) {
            this(dVar);
        }

        public void a() {
            C9032a.this.q(this, false);
        }

        public void b() {
            if (!this.f58500c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() {
            C9032a.this.q(this, true);
            this.f58500c = true;
        }

        public File f(int i10) {
            File k10;
            synchronized (C9032a.this) {
                try {
                    if (this.f58498a.f58507f == this) {
                        if (!this.f58498a.f58506e) {
                            this.f58499b[i10] = true;
                        }
                        k10 = this.f58498a.k(i10);
                        C9032a.this.f58483a.mkdirs();
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k10;
        }

        private c(d dVar) {
            this.f58498a = dVar;
            this.f58499b = dVar.f58506e ? null : new boolean[C9032a.this.f58489g];
        }
    }

    /* renamed from: z7.a$d */
    private final class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f58502a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long[] f58503b;

        /* renamed from: c  reason: collision with root package name */
        File[] f58504c;

        /* renamed from: d  reason: collision with root package name */
        File[] f58505d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f58506e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f58507f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public long f58508g;

        /* synthetic */ d(C9032a aVar, String str, C0954a aVar2) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length == C9032a.this.f58489g) {
                int i10 = 0;
                while (i10 < strArr.length) {
                    try {
                        this.f58503b[i10] = Long.parseLong(strArr[i10]);
                        i10++;
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i10) {
            return this.f58504c[i10];
        }

        public File k(int i10) {
            return this.f58505d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f58503b) {
                sb2.append(' ');
                sb2.append(append);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f58502a = str;
            this.f58503b = new long[C9032a.this.f58489g];
            this.f58504c = new File[C9032a.this.f58489g];
            this.f58505d = new File[C9032a.this.f58489g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < C9032a.this.f58489g; i10++) {
                sb2.append(i10);
                this.f58504c[i10] = new File(C9032a.this.f58483a, sb2.toString());
                sb2.append(".tmp");
                this.f58505d[i10] = new File(C9032a.this.f58483a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* renamed from: z7.a$e */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f58510a;

        /* renamed from: b  reason: collision with root package name */
        private final long f58511b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f58512c;

        /* renamed from: d  reason: collision with root package name */
        private final File[] f58513d;

        /* synthetic */ e(C9032a aVar, String str, long j10, File[] fileArr, long[] jArr, C0954a aVar2) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f58513d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f58510a = str;
            this.f58511b = j10;
            this.f58513d = fileArr;
            this.f58512c = jArr;
        }
    }

    private C9032a(File file, int i10, int i11, long j10) {
        File file2 = file;
        this.f58483a = file2;
        this.f58487e = i10;
        this.f58484b = new File(file2, "journal");
        this.f58485c = new File(file2, "journal.tmp");
        this.f58486d = new File(file2, "journal.bkp");
        this.f58489g = i11;
        this.f58488f = j10;
    }

    public static C9032a B(File file, int i10, int i11, long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    f0(file2, file3, false);
                }
            }
            C9032a aVar = new C9032a(file, i10, i11, j10);
            if (aVar.f58484b.exists()) {
                try {
                    aVar.J();
                    aVar.F();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.s();
                }
            }
            file.mkdirs();
            C9032a aVar2 = new C9032a(file, i10, i11, j10);
            aVar2.U();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void F() {
        t(this.f58485c);
        Iterator<d> it = this.f58492j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f58507f == null) {
                while (i10 < this.f58489g) {
                    this.f58490h += next.f58503b[i10];
                    i10++;
                }
            } else {
                c unused = next.f58507f = null;
                while (i10 < this.f58489g) {
                    t(next.j(i10));
                    t(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|(1:20)(1:21)|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r9.f58493k = r0 - r9.f58492j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r1.e() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r9.f58491i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f58484b, true), z7.C9034c.f58521a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0061 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0061=Splitter:B:17:0x0061, B:24:0x008e=Splitter:B:24:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void J() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            z7.b r1 = new z7.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f58484b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = z7.C9034c.f58521a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.f()     // Catch:{ all -> 0x005f }
            java.lang.String r3 = r1.f()     // Catch:{ all -> 0x005f }
            java.lang.String r4 = r1.f()     // Catch:{ all -> 0x005f }
            java.lang.String r5 = r1.f()     // Catch:{ all -> 0x005f }
            java.lang.String r6 = r1.f()     // Catch:{ all -> 0x005f }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x008e
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x008e
            int r7 = r9.f58487e     // Catch:{ all -> 0x005f }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x005f }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            int r4 = r9.f58489g     // Catch:{ all -> 0x005f }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x005f }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x008e
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.f()     // Catch:{ EOFException -> 0x0061 }
            r9.N(r2)     // Catch:{ EOFException -> 0x0061 }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            r0 = move-exception
            goto L_0x00bc
        L_0x0061:
            java.util.LinkedHashMap<java.lang.String, z7.a$d> r2 = r9.f58492j     // Catch:{ all -> 0x005f }
            int r2 = r2.size()     // Catch:{ all -> 0x005f }
            int r0 = r0 - r2
            r9.f58493k = r0     // Catch:{ all -> 0x005f }
            boolean r0 = r1.e()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0074
            r9.U()     // Catch:{ all -> 0x005f }
            goto L_0x008a
        L_0x0074:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x005f }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x005f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x005f }
            java.io.File r4 = r9.f58484b     // Catch:{ all -> 0x005f }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x005f }
            java.nio.charset.Charset r4 = z7.C9034c.f58521a     // Catch:{ all -> 0x005f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x005f }
            r0.<init>(r2)     // Catch:{ all -> 0x005f }
            r9.f58491i = r0     // Catch:{ all -> 0x005f }
        L_0x008a:
            z7.C9034c.a(r1)
            return
        L_0x008e:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x005f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r7.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x005f }
            r7.append(r2)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r3)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r5)     // Catch:{ all -> 0x005f }
            r7.append(r0)     // Catch:{ all -> 0x005f }
            r7.append(r6)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x005f }
            r4.<init>(r0)     // Catch:{ all -> 0x005f }
            throw r4     // Catch:{ all -> 0x005f }
        L_0x00bc:
            z7.C9034c.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C9032a.J():void");
    }

    private void N(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                str2 = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f58492j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i10, indexOf2);
            }
            d dVar = this.f58492j.get(str2);
            if (dVar == null) {
                dVar = new d(this, str2, (C0954a) null);
                this.f58492j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f58506e = true;
                c unused2 = dVar.f58507f = null;
                dVar.n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c unused3 = dVar.f58507f = new c(this, dVar, (C0954a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public synchronized void U() {
        BufferedWriter bufferedWriter;
        try {
            Writer writer = this.f58491i;
            if (writer != null) {
                o(writer);
            }
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f58485c), C9034c.f58521a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f58487e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f58489g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d next : this.f58492j.values()) {
                if (next.f58507f != null) {
                    bufferedWriter.write("DIRTY " + next.f58502a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f58502a + next.l() + 10);
                }
            }
            o(bufferedWriter);
            if (this.f58484b.exists()) {
                f0(this.f58484b, this.f58486d, true);
            }
            f0(this.f58485c, this.f58484b, false);
            this.f58486d.delete();
            this.f58491i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f58484b, true), C9034c.f58521a));
        } catch (Throwable th2) {
            o(bufferedWriter);
            throw th2;
        } finally {
        }
    }

    private static void f0(File file, File file2, boolean z10) {
        if (z10) {
            t(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* access modifiers changed from: private */
    public void h0() {
        while (this.f58490h > this.f58488f) {
            e0((String) this.f58492j.entrySet().iterator().next().getKey());
        }
    }

    private void n() {
        if (this.f58491i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void o(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void q(z7.C9032a.c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            z7.a$d r0 = r10.f58498a     // Catch:{ all -> 0x0030 }
            z7.a$c r1 = r0.f58507f     // Catch:{ all -> 0x0030 }
            if (r1 != r10) goto L_0x010b
            r1 = 0
            if (r11 == 0) goto L_0x0050
            boolean r2 = r0.f58506e     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0050
            r2 = r1
        L_0x0015:
            int r3 = r9.f58489g     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0050
            boolean[] r3 = r10.f58499b     // Catch:{ all -> 0x0030 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0030 }
            if (r3 == 0) goto L_0x0036
            java.io.File r3 = r0.k(r2)     // Catch:{ all -> 0x0030 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0030 }
            if (r3 != 0) goto L_0x0033
            r10.a()     // Catch:{ all -> 0x0030 }
            monitor-exit(r9)
            return
        L_0x0030:
            r10 = move-exception
            goto L_0x0111
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0036:
            r10.a()     // Catch:{ all -> 0x0030 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r11.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0030 }
            r11.append(r2)     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0030 }
            r10.<init>(r11)     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0050:
            int r10 = r9.f58489g     // Catch:{ all -> 0x0030 }
            if (r1 >= r10) goto L_0x0084
            java.io.File r10 = r0.k(r1)     // Catch:{ all -> 0x0030 }
            if (r11 == 0) goto L_0x007e
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0081
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x0030 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0030 }
            long[] r10 = r0.f58503b     // Catch:{ all -> 0x0030 }
            r3 = r10[r1]     // Catch:{ all -> 0x0030 }
            long r5 = r2.length()     // Catch:{ all -> 0x0030 }
            long[] r10 = r0.f58503b     // Catch:{ all -> 0x0030 }
            r10[r1] = r5     // Catch:{ all -> 0x0030 }
            long r7 = r9.f58490h     // Catch:{ all -> 0x0030 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f58490h = r7     // Catch:{ all -> 0x0030 }
            goto L_0x0081
        L_0x007e:
            t(r10)     // Catch:{ all -> 0x0030 }
        L_0x0081:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0084:
            int r10 = r9.f58493k     // Catch:{ all -> 0x0030 }
            r1 = 1
            int r10 = r10 + r1
            r9.f58493k = r10     // Catch:{ all -> 0x0030 }
            r10 = 0
            z7.C9032a.c unused = r0.f58507f = r10     // Catch:{ all -> 0x0030 }
            boolean r10 = r0.f58506e     // Catch:{ all -> 0x0030 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00cc
            boolean unused = r0.f58506e = r1     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            r10.append(r3)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.f58502a     // Catch:{ all -> 0x0030 }
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r0.l()     // Catch:{ all -> 0x0030 }
            r10.append(r1)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            r10.append(r2)     // Catch:{ all -> 0x0030 }
            if (r11 == 0) goto L_0x00ef
            long r10 = r9.f58494l     // Catch:{ all -> 0x0030 }
            r1 = 1
            long r1 = r1 + r10
            r9.f58494l = r1     // Catch:{ all -> 0x0030 }
            long unused = r0.f58508g = r10     // Catch:{ all -> 0x0030 }
            goto L_0x00ef
        L_0x00cc:
            java.util.LinkedHashMap<java.lang.String, z7.a$d> r10 = r9.f58492j     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r0.f58502a     // Catch:{ all -> 0x0030 }
            r10.remove(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            r10.append(r3)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            java.lang.String r11 = r0.f58502a     // Catch:{ all -> 0x0030 }
            r10.append(r11)     // Catch:{ all -> 0x0030 }
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            r10.append(r2)     // Catch:{ all -> 0x0030 }
        L_0x00ef:
            java.io.Writer r10 = r9.f58491i     // Catch:{ all -> 0x0030 }
            w(r10)     // Catch:{ all -> 0x0030 }
            long r10 = r9.f58490h     // Catch:{ all -> 0x0030 }
            long r0 = r9.f58488f     // Catch:{ all -> 0x0030 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0102
            boolean r10 = r9.z()     // Catch:{ all -> 0x0030 }
            if (r10 == 0) goto L_0x0109
        L_0x0102:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f58495m     // Catch:{ all -> 0x0030 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f58496n     // Catch:{ all -> 0x0030 }
            r10.submit(r11)     // Catch:{ all -> 0x0030 }
        L_0x0109:
            monitor-exit(r9)
            return
        L_0x010b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            r10.<init>()     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0111:
            monitor-exit(r9)     // Catch:{ all -> 0x0030 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C9032a.q(z7.a$c, boolean):void");
    }

    private static void t(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized z7.C9032a.c v(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.n()     // Catch:{ all -> 0x001e }
            java.util.LinkedHashMap<java.lang.String, z7.a$d> r0 = r5.f58492j     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x001e }
            z7.a$d r0 = (z7.C9032a.d) r0     // Catch:{ all -> 0x001e }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r3 = r0.f58508g     // Catch:{ all -> 0x001e }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0022
            goto L_0x0020
        L_0x001e:
            r6 = move-exception
            goto L_0x0060
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            z7.a$d r0 = new z7.a$d     // Catch:{ all -> 0x001e }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x001e }
            java.util.LinkedHashMap<java.lang.String, z7.a$d> r7 = r5.f58492j     // Catch:{ all -> 0x001e }
            r7.put(r6, r0)     // Catch:{ all -> 0x001e }
            goto L_0x0037
        L_0x002f:
            z7.a$c r7 = r0.f58507f     // Catch:{ all -> 0x001e }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r2
        L_0x0037:
            z7.a$c r7 = new z7.a$c     // Catch:{ all -> 0x001e }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x001e }
            z7.C9032a.c unused = r0.f58507f = r7     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f58491i     // Catch:{ all -> 0x001e }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f58491i     // Catch:{ all -> 0x001e }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x001e }
            java.io.Writer r8 = r5.f58491i     // Catch:{ all -> 0x001e }
            r8.append(r6)     // Catch:{ all -> 0x001e }
            java.io.Writer r6 = r5.f58491i     // Catch:{ all -> 0x001e }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x001e }
            java.io.Writer r6 = r5.f58491i     // Catch:{ all -> 0x001e }
            w(r6)     // Catch:{ all -> 0x001e }
            monitor-exit(r5)
            return r7
        L_0x0060:
            monitor-exit(r5)     // Catch:{ all -> 0x001e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C9032a.v(java.lang.String, long):z7.a$c");
    }

    @TargetApi(26)
    private static void w(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* access modifiers changed from: private */
    public boolean z() {
        int i10 = this.f58493k;
        return i10 >= 2000 && i10 >= this.f58492j.size();
    }

    public synchronized void close() {
        try {
            if (this.f58491i != null) {
                Iterator it = new ArrayList(this.f58492j.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f58507f != null) {
                        dVar.f58507f.a();
                    }
                }
                h0();
                o(this.f58491i);
                this.f58491i = null;
            }
        } finally {
            while (true) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean e0(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.n()     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap<java.lang.String, z7.a$d> r0 = r7.f58492j     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0043 }
            z7.a$d r0 = (z7.C9032a.d) r0     // Catch:{ all -> 0x0043 }
            r1 = 0
            if (r0 == 0) goto L_0x008f
            z7.a$c r2 = r0.f58507f     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0017
            goto L_0x008f
        L_0x0017:
            int r2 = r7.f58489g     // Catch:{ all -> 0x0043 }
            if (r1 >= r2) goto L_0x005b
            java.io.File r2 = r0.j(r1)     // Catch:{ all -> 0x0043 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0045
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x002c
            goto L_0x0045
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r0.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0043 }
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0043 }
            r8.<init>(r0)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r8 = move-exception
            goto L_0x0091
        L_0x0045:
            long r2 = r7.f58490h     // Catch:{ all -> 0x0043 }
            long[] r4 = r0.f58503b     // Catch:{ all -> 0x0043 }
            r5 = r4[r1]     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r5
            r7.f58490h = r2     // Catch:{ all -> 0x0043 }
            long[] r2 = r0.f58503b     // Catch:{ all -> 0x0043 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0043 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x005b:
            int r0 = r7.f58493k     // Catch:{ all -> 0x0043 }
            r1 = 1
            int r0 = r0 + r1
            r7.f58493k = r0     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f58491i     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f58491i     // Catch:{ all -> 0x0043 }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f58491i     // Catch:{ all -> 0x0043 }
            r0.append(r8)     // Catch:{ all -> 0x0043 }
            java.io.Writer r0 = r7.f58491i     // Catch:{ all -> 0x0043 }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x0043 }
            java.util.LinkedHashMap<java.lang.String, z7.a$d> r0 = r7.f58492j     // Catch:{ all -> 0x0043 }
            r0.remove(r8)     // Catch:{ all -> 0x0043 }
            boolean r8 = r7.z()     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x008d
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f58495m     // Catch:{ all -> 0x0043 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f58496n     // Catch:{ all -> 0x0043 }
            r8.submit(r0)     // Catch:{ all -> 0x0043 }
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C9032a.e0(java.lang.String):boolean");
    }

    public void s() {
        close();
        C9034c.b(this.f58483a);
    }

    public c u(String str) {
        return v(str, -1);
    }

    public synchronized e x(String str) {
        n();
        d dVar = this.f58492j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f58506e) {
            return null;
        }
        for (File exists : dVar.f58504c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f58493k++;
        this.f58491i.append("READ");
        this.f58491i.append(' ');
        this.f58491i.append(str);
        this.f58491i.append(10);
        if (z()) {
            this.f58495m.submit(this.f58496n);
        }
        return new e(this, str, dVar.f58508g, dVar.f58504c, dVar.f58503b, (C0954a) null);
    }
}
