package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f21157a = aVar.p(iconCompat.f21157a, 1);
        iconCompat.f21159c = aVar.j(iconCompat.f21159c, 2);
        iconCompat.f21160d = aVar.r(iconCompat.f21160d, 3);
        iconCompat.f21161e = aVar.p(iconCompat.f21161e, 4);
        iconCompat.f21162f = aVar.p(iconCompat.f21162f, 5);
        iconCompat.f21163g = (ColorStateList) aVar.r(iconCompat.f21163g, 6);
        iconCompat.f21165i = aVar.t(iconCompat.f21165i, 7);
        iconCompat.f21166j = aVar.t(iconCompat.f21166j, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.m(aVar.f());
        int i10 = iconCompat.f21157a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f21159c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f21160d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f21161e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f21162f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f21163g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f21165i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f21166j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
