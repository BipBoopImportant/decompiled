package L7;

import C7.c;
import C7.i;
import C7.l;
import E7.v;
import F7.d;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: L7.b  reason: case insensitive filesystem */
public class C6645b implements l<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    private final d f38379a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Bitmap> f38380b;

    public C6645b(d dVar, l<Bitmap> lVar) {
        this.f38379a = dVar;
        this.f38380b = lVar;
    }

    public c a(i iVar) {
        return this.f38380b.a(iVar);
    }

    /* renamed from: c */
    public boolean b(v<BitmapDrawable> vVar, File file, i iVar) {
        return this.f38380b.b(new f(vVar.get().getBitmap(), this.f38379a), file, iVar);
    }
}
