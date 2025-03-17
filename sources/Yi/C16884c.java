package YI;

import XH.C16796C;
import XH.v;
import XI.m;
import eJ.C17196g;
import jI.C17416c;
import java.io.InputStream;
import kotlin.jvm.internal.C17542s;

/* renamed from: YI.c  reason: case insensitive filesystem */
public final class C16884c {
    public static final v<m, C16882a> a(InputStream inputStream) {
        m mVar;
        C17542s.j(inputStream, "<this>");
        try {
            C16882a a10 = C16882a.f140473g.a(inputStream);
            if (a10.h()) {
                C17196g d10 = C17196g.d();
                C16883b.a(d10);
                mVar = m.R(inputStream, d10);
            } else {
                mVar = null;
            }
            v<m, C16882a> a11 = C16796C.a(mVar, a10);
            C17416c.a(inputStream, (Throwable) null);
            return a11;
        } catch (Throwable th2) {
            C17416c.a(inputStream, th);
            throw th2;
        }
    }
}
