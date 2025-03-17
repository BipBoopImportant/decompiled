package P7;

import A7.a;
import F7.d;
import android.graphics.Bitmap;

public final class b implements a.C0503a {

    /* renamed from: a  reason: collision with root package name */
    private final d f39394a;

    /* renamed from: b  reason: collision with root package name */
    private final F7.b f39395b;

    public b(d dVar, F7.b bVar) {
        this.f39394a = dVar;
        this.f39395b = bVar;
    }

    public void a(Bitmap bitmap) {
        this.f39394a.c(bitmap);
    }

    public byte[] b(int i10) {
        F7.b bVar = this.f39395b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return this.f39394a.e(i10, i11, config);
    }

    public int[] d(int i10) {
        F7.b bVar = this.f39395b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    public void e(byte[] bArr) {
        F7.b bVar = this.f39395b;
        if (bVar != null) {
            bVar.e(bArr);
        }
    }

    public void f(int[] iArr) {
        F7.b bVar = this.f39395b;
        if (bVar != null) {
            bVar.e(iArr);
        }
    }
}
