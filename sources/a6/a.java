package A6;

import B6.c;
import B6.i;
import I6.d;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import w6.C8920b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final i<String> f32696a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<i<String>, Typeface> f32697b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Typeface> f32698c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final AssetManager f32699d;

    /* renamed from: e  reason: collision with root package name */
    private String f32700e = ".ttf";

    public a(Drawable.Callback callback, C8920b bVar) {
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f32699d = null;
            return;
        }
        this.f32699d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(c cVar) {
        String a10 = cVar.a();
        Typeface typeface = this.f32698c.get(a10);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f32699d, "fonts/" + a10 + this.f32700e);
        this.f32698c.put(a10, createFromAsset);
        return createFromAsset;
    }

    private Typeface e(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(c cVar) {
        this.f32696a.b(cVar.a(), cVar.c());
        Typeface typeface = this.f32697b.get(this.f32696a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e10 = e(a(cVar), cVar.c());
        this.f32697b.put(this.f32696a, e10);
        return e10;
    }

    public void c(String str) {
        this.f32700e = str;
    }

    public void d(C8920b bVar) {
    }
}
