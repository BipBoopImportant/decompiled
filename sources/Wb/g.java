package Wb;

import Nb.j;
import Qb.C9251i;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g {

    /* renamed from: a  reason: collision with root package name */
    final String f64625a;

    /* renamed from: b  reason: collision with root package name */
    private final File f64626b;

    /* renamed from: c  reason: collision with root package name */
    private final File f64627c;

    /* renamed from: d  reason: collision with root package name */
    private final File f64628d;

    /* renamed from: e  reason: collision with root package name */
    private final File f64629e;

    /* renamed from: f  reason: collision with root package name */
    private final File f64630f;

    /* renamed from: g  reason: collision with root package name */
    private final File f64631g;

    public g(Context context) {
        String str;
        String d10 = j.f61983a.e(context).d();
        this.f64625a = d10;
        File filesDir = context.getFilesDir();
        this.f64626b = filesDir;
        if (y()) {
            str = ".crashlytics.v3" + File.separator + x(d10);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File t10 = t(new File(filesDir, str));
        this.f64627c = t10;
        this.f64628d = t(new File(t10, "open-sessions"));
        this.f64629e = t(new File(t10, "reports"));
        this.f64630f = t(new File(t10, "priority-reports"));
        this.f64631g = t(new File(t10, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.f64626b, str);
        if (file.exists() && v(file)) {
            Nb.g f10 = Nb.g.f();
            f10.b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(String str) {
        String[] list;
        if (this.f64626b.exists() && (list = this.f64626b.list(new f(str))) != null) {
            for (String b10 : list) {
                b(b10);
            }
        }
    }

    private File p(String str) {
        return u(new File(this.f64628d, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File t(java.io.File r4) {
        /*
            java.lang.Class<Wb.g> r0 = Wb.g.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0034
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            Nb.g r1 = Nb.g.f()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0032 }
            r2.append(r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0032 }
            r1.b(r2)     // Catch:{ all -> 0x0032 }
            r4.delete()     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r4 = move-exception
            goto L_0x0054
        L_0x0034:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0052
            Nb.g r1 = Nb.g.f()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r2.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0032 }
            r2.append(r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0032 }
            r1.d(r2)     // Catch:{ all -> 0x0032 }
        L_0x0052:
            monitor-exit(r0)
            return r4
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Wb.g.t(java.io.File):java.io.File");
    }

    private static File u(File file) {
        file.mkdirs();
        return file;
    }

    static boolean v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File v10 : listFiles) {
                v(v10);
            }
        }
        return file.delete();
    }

    private static <T> List<T> w(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    static String x(String str) {
        return str.length() > 40 ? C9251i.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean y() {
        return !this.f64625a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (y()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return v(new File(this.f64628d, str));
    }

    public List<String> f() {
        return w(this.f64628d.list());
    }

    public File g(String str) {
        return new File(this.f64627c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return w(this.f64627c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.f64631g, str);
    }

    public List<File> j() {
        return w(this.f64631g.listFiles());
    }

    public File k(String str) {
        return u(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f64630f, str);
    }

    public List<File> m() {
        return w(this.f64630f.listFiles());
    }

    public File n(String str) {
        return new File(this.f64629e, str);
    }

    public List<File> o() {
        return w(this.f64629e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return w(p(str).listFiles(filenameFilter));
    }
}
