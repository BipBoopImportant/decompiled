package k4;

import java.util.List;
import s3.a;
import t3.C5950a;
import y3.g;

public abstract class q extends g implements C8427k {

    /* renamed from: e  reason: collision with root package name */
    private C8427k f54124e;

    /* renamed from: f  reason: collision with root package name */
    private long f54125f;

    public void K(long j10, C8427k kVar, long j11) {
        this.f32287b = j10;
        this.f54124e = kVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f54125f = j10;
    }

    public int a(long j10) {
        return ((C8427k) C5950a.e(this.f54124e)).a(j10 - this.f54125f);
    }

    public List<a> b(long j10) {
        return ((C8427k) C5950a.e(this.f54124e)).b(j10 - this.f54125f);
    }

    public long j(int i10) {
        return ((C8427k) C5950a.e(this.f54124e)).j(i10) + this.f54125f;
    }

    public int m() {
        return ((C8427k) C5950a.e(this.f54124e)).m();
    }

    public void v() {
        super.v();
        this.f54124e = null;
    }
}
