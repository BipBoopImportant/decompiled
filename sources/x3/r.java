package x3;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import t3.C5950a;
import t3.q;
import v3.b;
import x3.a;

public final class r implements a {

    /* renamed from: l  reason: collision with root package name */
    private static final HashSet<File> f31950l = new HashSet<>();

    /* renamed from: a  reason: collision with root package name */
    private final File f31951a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d f31952b;

    /* renamed from: c  reason: collision with root package name */
    private final k f31953c;

    /* renamed from: d  reason: collision with root package name */
    private final f f31954d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, ArrayList<a.b>> f31955e;

    /* renamed from: f  reason: collision with root package name */
    private final Random f31956f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f31957g;

    /* renamed from: h  reason: collision with root package name */
    private long f31958h;

    /* renamed from: i  reason: collision with root package name */
    private long f31959i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31960j;

    /* renamed from: k  reason: collision with root package name */
    private a.C0493a f31961k;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConditionVariable f31962a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f31962a = conditionVariable;
        }

        public void run() {
            synchronized (r.this) {
                this.f31962a.open();
                r.this.p();
                r.this.f31952b.e();
            }
        }
    }

    public r(File file, d dVar, b bVar) {
        this(file, dVar, bVar, (byte[]) null, false, false);
    }

    private void k(s sVar) {
        this.f31953c.k(sVar.f31910a).a(sVar);
        this.f31959i += sVar.f31912c;
        t(sVar);
    }

    private static void m(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            String str = "Failed to create cache directory: " + file;
            q.c("SimpleCache", str);
            throw new a.C0493a(str);
        }
    }

    private static long n(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0 : Math.abs(nextLong);
        String l10 = Long.toString(abs, 16);
        File file2 = new File(file, l10 + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private s o(String str, long j10, long j11) {
        s d10;
        j f10 = this.f31953c.f(str);
        if (f10 == null) {
            return s.B(str, j10, j11);
        }
        while (true) {
            d10 = f10.d(j10, j11);
            if (!d10.f31913d || ((File) C5950a.e(d10.f31914e)).length() == d10.f31912c) {
                return d10;
            }
            y();
        }
        return d10;
    }

    /* access modifiers changed from: private */
    public void p() {
        if (!this.f31951a.exists()) {
            try {
                m(this.f31951a);
            } catch (a.C0493a e10) {
                this.f31961k = e10;
                return;
            }
        }
        File[] listFiles = this.f31951a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.f31951a;
            q.c("SimpleCache", str);
            this.f31961k = new a.C0493a(str);
            return;
        }
        long r10 = r(listFiles);
        this.f31958h = r10;
        if (r10 == -1) {
            try {
                this.f31958h = n(this.f31951a);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f31951a;
                q.d("SimpleCache", str2, e11);
                this.f31961k = new a.C0493a(str2, e11);
                return;
            }
        }
        try {
            this.f31953c.l(this.f31958h);
            f fVar = this.f31954d;
            if (fVar != null) {
                fVar.e(this.f31958h);
                Map<String, e> b10 = this.f31954d.b();
                q(this.f31951a, true, listFiles, b10);
                this.f31954d.g(b10.keySet());
            } else {
                q(this.f31951a, true, listFiles, (Map<String, e>) null);
            }
            this.f31953c.p();
            try {
                this.f31953c.q();
            } catch (IOException e12) {
                q.d("SimpleCache", "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.f31951a;
            q.d("SimpleCache", str3, e13);
            this.f31961k = new a.C0493a(str3, e13);
        }
    }

    private void q(File file, boolean z10, File[] fileArr, Map<String, e> map) {
        long j10;
        long j11;
        if (fileArr != null && fileArr.length != 0) {
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (z10 && name.indexOf(46) == -1) {
                    q(file2, false, file2.listFiles(), map);
                } else if (!z10 || (!k.m(name) && !name.endsWith(".uid"))) {
                    e remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j11 = remove.f31904a;
                        j10 = remove.f31905b;
                    } else {
                        j10 = -9223372036854775807L;
                        j11 = -1;
                    }
                    s n10 = s.n(file2, j11, j10, this.f31953c);
                    if (n10 != null) {
                        k(n10);
                    } else {
                        file2.delete();
                    }
                }
            }
        } else if (!z10) {
            file.delete();
        }
    }

    private static long r(File[] fileArr) {
        int length = fileArr.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return w(name);
                } catch (NumberFormatException unused) {
                    q.c("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            } else {
                i10++;
            }
        }
        return -1;
    }

    private static synchronized boolean s(File file) {
        boolean add;
        synchronized (r.class) {
            add = f31950l.add(file.getAbsoluteFile());
        }
        return add;
    }

    private void t(s sVar) {
        ArrayList arrayList = this.f31955e.get(sVar.f31910a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.b) arrayList.get(size)).a(this, sVar);
            }
        }
        this.f31952b.a(this, sVar);
    }

    private void u(i iVar) {
        ArrayList arrayList = this.f31955e.get(iVar.f31910a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.b) arrayList.get(size)).d(this, iVar);
            }
        }
        this.f31952b.d(this, iVar);
    }

    private void v(s sVar, i iVar) {
        ArrayList arrayList = this.f31955e.get(sVar.f31910a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a.b) arrayList.get(size)).f(this, sVar, iVar);
            }
        }
        this.f31952b.f(this, sVar, iVar);
    }

    private static long w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void x(i iVar) {
        j f10 = this.f31953c.f(iVar.f31910a);
        if (f10 != null && f10.j(iVar)) {
            this.f31959i -= iVar.f31912c;
            if (this.f31954d != null) {
                String name = ((File) C5950a.e(iVar.f31914e)).getName();
                try {
                    this.f31954d.f(name);
                } catch (IOException unused) {
                    q.h("SimpleCache", "Failed to remove file index entry for: " + name);
                }
            }
            this.f31953c.n(f10.f31917b);
            u(iVar);
        }
    }

    private void y() {
        ArrayList arrayList = new ArrayList();
        for (j e10 : this.f31953c.g()) {
            Iterator<s> it = e10.e().iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (((File) C5950a.e(next.f31914e)).length() != next.f31912c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x((i) arrayList.get(i10));
        }
    }

    private s z(String str, s sVar) {
        boolean z10;
        if (!this.f31957g) {
            return sVar;
        }
        String name = ((File) C5950a.e(sVar.f31914e)).getName();
        long j10 = sVar.f31912c;
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = this.f31954d;
        if (fVar != null) {
            try {
                fVar.h(name, j10, currentTimeMillis);
            } catch (IOException unused) {
                q.h("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        s k10 = ((j) C5950a.e(this.f31953c.f(str))).k(sVar, currentTimeMillis, z10);
        v(sVar, k10);
        return k10;
    }

    public synchronized File a(String str, long j10, long j11) {
        j f10;
        File file;
        try {
            C5950a.g(!this.f31960j);
            l();
            f10 = this.f31953c.f(str);
            C5950a.e(f10);
            C5950a.g(f10.g(j10, j11));
            if (!this.f31951a.exists()) {
                m(this.f31951a);
                y();
            }
            this.f31952b.b(this, str, j10, j11);
            file = new File(this.f31951a, Integer.toString(this.f31956f.nextInt(10)));
            if (!file.exists()) {
                m(file);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return s.D(file, f10.f31916a, j10, System.currentTimeMillis());
    }

    public synchronized l b(String str) {
        C5950a.g(!this.f31960j);
        return this.f31953c.h(str);
    }

    public synchronized void c(String str, m mVar) {
        C5950a.g(!this.f31960j);
        l();
        this.f31953c.d(str, mVar);
        try {
            this.f31953c.q();
        } catch (IOException e10) {
            throw new a.C0493a((Throwable) e10);
        }
    }

    public synchronized i d(String str, long j10, long j11) {
        C5950a.g(!this.f31960j);
        l();
        s o10 = o(str, j10, j11);
        if (o10.f31913d) {
            return z(str, o10);
        } else if (this.f31953c.k(str).i(j10, o10.f31912c)) {
            return o10;
        } else {
            return null;
        }
    }

    public synchronized void e(i iVar) {
        C5950a.g(!this.f31960j);
        x(iVar);
    }

    public synchronized void f(i iVar) {
        C5950a.g(!this.f31960j);
        j jVar = (j) C5950a.e(this.f31953c.f(iVar.f31910a));
        jVar.l(iVar.f31911b);
        this.f31953c.n(jVar.f31917b);
        notifyAll();
    }

    public synchronized i g(String str, long j10, long j11) {
        i d10;
        C5950a.g(!this.f31960j);
        l();
        while (true) {
            d10 = d(str, j10, j11);
            if (d10 == null) {
                wait();
            }
        }
        return d10;
    }

    public synchronized void h(File file, long j10) {
        boolean z10 = false;
        C5950a.g(!this.f31960j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            s sVar = (s) C5950a.e(s.v(file, j10, this.f31953c));
            j jVar = (j) C5950a.e(this.f31953c.f(sVar.f31910a));
            C5950a.g(jVar.g(sVar.f31911b, sVar.f31912c));
            long c10 = l.c(jVar.c());
            if (c10 != -1) {
                if (sVar.f31911b + sVar.f31912c <= c10) {
                    z10 = true;
                }
                C5950a.g(z10);
            }
            if (this.f31954d != null) {
                try {
                    this.f31954d.h(file.getName(), sVar.f31912c, sVar.f31915f);
                } catch (IOException e10) {
                    throw new a.C0493a((Throwable) e10);
                } catch (IOException e11) {
                    throw new a.C0493a((Throwable) e11);
                }
            }
            k(sVar);
            this.f31953c.q();
            notifyAll();
        }
    }

    public synchronized void l() {
        a.C0493a aVar = this.f31961k;
        if (aVar != null) {
            throw aVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(File file, d dVar, b bVar, byte[] bArr, boolean z10, boolean z11) {
        this(file, dVar, new k(bVar, file, bArr, z10, z11), (bVar == null || z11) ? null : new f(bVar));
    }

    r(File file, d dVar, k kVar, f fVar) {
        if (s(file)) {
            this.f31951a = file;
            this.f31952b = dVar;
            this.f31953c = kVar;
            this.f31954d = fVar;
            this.f31955e = new HashMap<>();
            this.f31956f = new Random();
            this.f31957g = dVar.c();
            this.f31958h = -1;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
