package k4;

import java.util.List;
import kb.C9967v;
import s3.a;

/* renamed from: k4.e  reason: case insensitive filesystem */
public class C8421e {

    /* renamed from: a  reason: collision with root package name */
    public final C9967v<a> f54100a;

    /* renamed from: b  reason: collision with root package name */
    public final long f54101b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54102c;

    /* renamed from: d  reason: collision with root package name */
    public final long f54103d;

    public C8421e(List<a> list, long j10, long j11) {
        this.f54100a = C9967v.A(list);
        this.f54101b = j10;
        this.f54102c = j11;
        long j12 = -9223372036854775807L;
        if (!(j10 == -9223372036854775807L || j11 == -9223372036854775807L)) {
            j12 = j10 + j11;
        }
        this.f54103d = j12;
    }
}
