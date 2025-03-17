package Wb;

import Nb.g;
import Qb.C;
import Qb.C9255m;
import Sb.p;
import Tb.F;
import Ub.j;
import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e {

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f64615e = Charset.forName(Constants.ENCODING);

    /* renamed from: f  reason: collision with root package name */
    private static final int f64616f = 15;

    /* renamed from: g  reason: collision with root package name */
    private static final j f64617g = new j();

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<? super File> f64618h = new a();

    /* renamed from: i  reason: collision with root package name */
    private static final FilenameFilter f64619i = new b();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f64620a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    private final g f64621b;

    /* renamed from: c  reason: collision with root package name */
    private final Yb.j f64622c;

    /* renamed from: d  reason: collision with root package name */
    private final C9255m f64623d;

    public e(g gVar, Yb.j jVar, C9255m mVar) {
        this.f64621b = gVar;
        this.f64622c = jVar;
        this.f64623d = mVar;
    }

    private static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f64615e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        throw th;
    }

    private void B(File file, F.d dVar, String str, F.a aVar) {
        String d10 = this.f64623d.d(str);
        try {
            j jVar = f64617g;
            F(this.f64621b.i(str), jVar.M(jVar.L(A(file)).u(dVar).q(aVar).p(d10)));
        } catch (IOException e10) {
            g f10 = g.f();
            f10.l("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void C(String str, long j10) {
        boolean z10;
        List<File> r10 = this.f64621b.r(str, f64619i);
        if (r10.isEmpty()) {
            g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(r10);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = r10.iterator();
        loop0:
        while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f64617g.j(A(next)));
                    if (z10 || s(next.getName())) {
                        z10 = true;
                    }
                } catch (IOException e10) {
                    g.f().l("Could not add event to report for " + next, e10);
                }
            }
        }
        if (arrayList.isEmpty()) {
            g.f().k("Could not parse event files for session " + str);
            return;
        }
        D(this.f64621b.q(str, "report"), arrayList, j10, z10, p.n(str, this.f64621b), this.f64623d.d(str));
    }

    private void D(File file, List<F.e.d> list, long j10, boolean z10, String str, String str2) {
        try {
            j jVar = f64617g;
            F r10 = jVar.L(A(file)).v(j10, z10, str).p(str2).r(list);
            F.e n10 = r10.n();
            if (n10 != null) {
                g f10 = g.f();
                f10.b("appQualitySessionId: " + str2);
                F(z10 ? this.f64621b.l(n10.i()) : this.f64621b.n(n10.i()), jVar.M(r10));
            }
        } catch (IOException e10) {
            g f11 = g.f();
            f11.l("Could not synthesize final report file for " + file, e10);
        }
    }

    private int E(String str, int i10) {
        List<File> r10 = this.f64621b.r(str, new c());
        Collections.sort(r10, new d());
        return f(r10, i10);
    }

    private static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f64615e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static void G(File file, String str, long j10) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f64615e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private SortedSet<String> e(String str) {
        this.f64621b.d();
        SortedSet<String> p10 = p();
        if (str != null) {
            p10.remove(str);
        }
        if (p10.size() <= 8) {
            return p10;
        }
        while (p10.size() > 8) {
            String last = p10.last();
            g f10 = g.f();
            f10.b("Removing session over cap: " + last);
            this.f64621b.e(last);
            p10.remove(last);
        }
        return p10;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File next : list) {
            if (size <= i10) {
                return size;
            }
            g.v(next);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f64622c.b().f64899a.f64911b;
        List<File> n10 = n();
        int size = n10.size();
        if (size > i10) {
            for (File delete : n10.subList(i10, size)) {
                delete.delete();
            }
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    private static String m(int i10, boolean z10) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i10)});
        String str = z10 ? "_" : "";
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f64621b.m());
        arrayList.addAll(this.f64621b.j());
        Comparator<? super File> comparator = f64618h;
        Collections.sort(arrayList, comparator);
        List<File> o10 = this.f64621b.o();
        Collections.sort(o10, comparator);
        arrayList.addAll(o10);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f64616f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.f64621b.o());
        j(this.f64621b.m());
        j(this.f64621b.j());
    }

    public void k(String str, long j10) {
        for (String next : e(str)) {
            g f10 = g.f();
            f10.i("Finalizing report for session " + next);
            C(next, j10);
            this.f64621b.e(next);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File q10 = this.f64621b.q(str, "report");
        g f10 = g.f();
        f10.b("Writing native session report for " + str + " to file: " + q10);
        B(q10, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f64621b.f()).descendingSet();
    }

    public long q(String str) {
        return this.f64621b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return !this.f64621b.o().isEmpty() || !this.f64621b.m().isEmpty() || !this.f64621b.j().isEmpty();
    }

    public List<C> w() {
        List<File> n10 = n();
        ArrayList arrayList = new ArrayList();
        for (File next : n10) {
            try {
                arrayList.add(C.a(f64617g.L(A(next)), next.getName(), next));
            } catch (IOException e10) {
                g f10 = g.f();
                f10.l("Could not load report file " + next + "; deleting", e10);
                next.delete();
            }
        }
        return arrayList;
    }

    public void y(F.e.d dVar, String str, boolean z10) {
        int i10 = this.f64622c.b().f64899a.f64910a;
        try {
            F(this.f64621b.q(str, m(this.f64620a.getAndIncrement(), z10)), f64617g.k(dVar));
        } catch (IOException e10) {
            g f10 = g.f();
            f10.l("Could not persist event for session " + str, e10);
        }
        E(str, i10);
    }

    public void z(F f10) {
        F.e n10 = f10.n();
        if (n10 == null) {
            g.f().b("Could not get session for report");
            return;
        }
        String i10 = n10.i();
        try {
            F(this.f64621b.q(i10, "report"), f64617g.M(f10));
            G(this.f64621b.q(i10, "start-time"), "", n10.l());
        } catch (IOException e10) {
            g f11 = g.f();
            f11.c("Could not persist report for session " + i10, e10);
        }
    }
}
