package x6;

import I6.i;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: x6.a  reason: case insensitive filesystem */
public class C8955a extends Paint {
    public C8955a() {
    }

    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((i.c(i10, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(i.c(i10, 0, 255));
    }

    public void setTextLocales(LocaleList localeList) {
    }

    public C8955a(int i10) {
        super(i10);
    }

    public C8955a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C8955a(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
