package a9;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

/* renamed from: a9.e3  reason: case insensitive filesystem */
public final class C6817e3 {

    /* renamed from: a  reason: collision with root package name */
    public final C6791b1 f42521a;

    /* renamed from: b  reason: collision with root package name */
    public final int f42522b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42523c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f42524d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42525e;

    /* renamed from: f  reason: collision with root package name */
    public final String f42526f;

    /* renamed from: g  reason: collision with root package name */
    public final String f42527g;

    public C6817e3(C6791b1 b1Var, C9036b bVar, Bitmap bitmap) {
        String str;
        String str2;
        C17542s.j(b1Var, "perceptualHash");
        C17542s.j(bVar, "viewLight");
        C17542s.j(bitmap, "viewBitmap");
        this.f42521a = b1Var;
        boolean C10 = bVar.C();
        this.f42524d = C10;
        int width = bitmap.getWidth();
        this.f42522b = width;
        int height = bitmap.getHeight();
        this.f42523c = height;
        String hexString = Integer.toHexString((((((b1Var.hashCode() * 31) + width) * 31) + height) * 31) + (C10 ? 1 : 0));
        C17542s.j(bVar, "viewLight");
        boolean z10 = bVar.v() == 1.0f ? true : true;
        String str3 = null;
        if (z10) {
            str = "wpm";
        } else if (z10) {
            str = "wpl";
        } else {
            throw null;
        }
        this.f42525e = str;
        CharSequence s10 = bVar.s();
        str3 = s10 != null ? s10.toString() : str3;
        str3 = str3 == null ? "" : str3;
        this.f42526f = str3;
        if (str3.length() == 0) {
            str2 = hexString + '.' + str;
        } else {
            str2 = hexString + '.' + str + '.' + Integer.toHexString(str3.hashCode());
        }
        this.f42527g = str2;
    }
}
