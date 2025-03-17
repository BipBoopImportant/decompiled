package l4;

import java.util.Collections;
import java.util.List;
import k4.C8427k;
import s3.a;
import t3.C5950a;

final class f implements C8427k {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f54596a;

    public f(List<a> list) {
        this.f54596a = list;
    }

    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public List<a> b(long j10) {
        return j10 >= 0 ? this.f54596a : Collections.emptyList();
    }

    public long j(int i10) {
        C5950a.a(i10 == 0);
        return 0;
    }

    public int m() {
        return 1;
    }
}
