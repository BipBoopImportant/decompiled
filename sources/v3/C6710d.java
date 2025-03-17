package V3;

import N3.C6679q;
import N3.z;
import t3.C5950a;

/* renamed from: V3.d  reason: case insensitive filesystem */
final class C6710d extends z {

    /* renamed from: b  reason: collision with root package name */
    private final long f40415b;

    public C6710d(C6679q qVar, long j10) {
        super(qVar);
        C5950a.a(qVar.getPosition() >= j10);
        this.f40415b = j10;
    }

    public long getLength() {
        return super.getLength() - this.f40415b;
    }

    public long getPosition() {
        return super.getPosition() - this.f40415b;
    }

    public long h() {
        return super.h() - this.f40415b;
    }
}
