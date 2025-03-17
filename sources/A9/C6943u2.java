package a9;

import com.google.ar.core.ImageMetadata;
import java.io.File;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.u2  reason: case insensitive filesystem */
public final class C6943u2 {

    /* renamed from: a  reason: collision with root package name */
    public final F2 f42882a;

    public C6943u2(F2 f22) {
        C17542s.j(f22, "batchWriterReader");
        this.f42882a = f22;
    }

    public final void a(long j10) {
        F2 f22 = this.f42882a;
        String str = f22.f41995e + File.separator + j10;
        f22.f41993c.f("deleting file on path: " + str);
        if (!f22.f41991a.b(str)) {
            f22.f41993c.h("failed to delete file for, file " + j10 + " in path " + str);
        }
    }

    public final void b(M1 m12) {
        C17542s.j(m12, "batchToStore");
        C6848i2 i2Var = new C6848i2(m12.f42141b, m12.f42140a);
        F2 f22 = this.f42882a;
        f22.getClass();
        C17542s.j(i2Var, "storedBatch");
        String str = f22.f41995e + File.separator + ((((long) f22.f41994d.incrementAndGet()) % ((long) ImageMetadata.LENS_APERTURE)) + (System.currentTimeMillis() << 19));
        f22.f41993c.f("Storing file to path: " + str);
        f22.f41991a.o(f22.f41995e);
        f22.f41991a.s(str, i2Var.a(), true);
        F2 f23 = this.f42882a;
        long j10 = f23.f41991a.j(f23.f41995e);
        f23.f41993c.f("current size of path " + f23.f41995e + " is " + j10 + " bytes");
        if (f23.f41992b < j10) {
            f23.f41993c.f("space used on path " + f23.f41995e + " has reached " + j10 + " bytes. it will be deleted");
            f23.f41991a.c(new File(f23.f41995e));
        }
    }
}
