package x3;

import java.util.TreeSet;

public final class p implements d {

    /* renamed from: a  reason: collision with root package name */
    private final long f31946a;

    /* renamed from: b  reason: collision with root package name */
    private final TreeSet<i> f31947b = new TreeSet<>(new o());

    /* renamed from: c  reason: collision with root package name */
    private long f31948c;

    public p(long j10) {
        this.f31946a = j10;
    }

    /* access modifiers changed from: private */
    public static int h(i iVar, i iVar2) {
        long j10 = iVar.f31915f;
        long j11 = iVar2.f31915f;
        return j10 - j11 == 0 ? iVar.compareTo(iVar2) : j10 < j11 ? -1 : 1;
    }

    private void i(a aVar, long j10) {
        while (this.f31948c + j10 > this.f31946a && !this.f31947b.isEmpty()) {
            aVar.e(this.f31947b.first());
        }
    }

    public void a(a aVar, i iVar) {
        this.f31947b.add(iVar);
        this.f31948c += iVar.f31912c;
        i(aVar, 0);
    }

    public void b(a aVar, String str, long j10, long j11) {
        if (j11 != -1) {
            i(aVar, j11);
        }
    }

    public boolean c() {
        return true;
    }

    public void d(a aVar, i iVar) {
        this.f31947b.remove(iVar);
        this.f31948c -= iVar.f31912c;
    }

    public void e() {
    }

    public void f(a aVar, i iVar, i iVar2) {
        d(aVar, iVar);
        a(aVar, iVar2);
    }
}
