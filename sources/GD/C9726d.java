package gd;

import K9.C6612j;
import K9.C6620s;
import T9.b;
import T9.d;
import Vc.a;
import android.graphics.Bitmap;
import android.media.Image;
import fd.C9707a;
import java.nio.ByteBuffer;

/* renamed from: gd.d  reason: case insensitive filesystem */
public class C9726d {

    /* renamed from: a  reason: collision with root package name */
    private static final C6612j f73045a = new C6612j("MLKitImageUtils", "");

    /* renamed from: b  reason: collision with root package name */
    private static final C9726d f73046b = new C9726d();

    private C9726d() {
    }

    public static C9726d b() {
        return f73046b;
    }

    public b a(C9707a aVar) {
        int e10 = aVar.e();
        if (e10 == -1) {
            return d.L3((Bitmap) C6620s.l(aVar.b()));
        }
        if (e10 != 17) {
            if (e10 == 35) {
                return d.L3(aVar.g());
            }
            if (e10 != 842094169) {
                int e11 = aVar.e();
                throw new a("Unsupported image format: " + e11, 3);
            }
        }
        return d.L3((ByteBuffer) C6620s.l(aVar.c()));
    }

    public int c(C9707a aVar) {
        if (aVar.e() == -1) {
            return ((Bitmap) C6620s.l(aVar.b())).getAllocationByteCount();
        }
        if (aVar.e() == 17 || aVar.e() == 842094169) {
            return ((ByteBuffer) C6620s.l(aVar.c())).limit();
        }
        if (aVar.e() != 35) {
            return 0;
        }
        return (((Image.Plane[]) C6620s.l(aVar.h()))[0].getBuffer().limit() * 3) / 2;
    }
}
