package L7;

import C7.i;
import C7.k;
import E7.v;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;

public final class w implements k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    private final n f38443a;

    public w(n nVar) {
        this.f38443a = nVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return (!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    /* renamed from: c */
    public v<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i iVar) {
        return this.f38443a.e(parcelFileDescriptor, i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, i iVar) {
        return e(parcelFileDescriptor) && this.f38443a.o(parcelFileDescriptor);
    }
}
