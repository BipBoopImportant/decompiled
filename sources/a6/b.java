package A6;

import I6.d;
import I6.j;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import w6.C8921c;
import w6.v;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f32701d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f32702a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32703b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, v> f32704c;

    public b(Drawable.Callback callback, String str, C8921c cVar, Map<String, v> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f32703b = str;
        } else {
            this.f32703b = str + '/';
        }
        this.f32704c = map;
        d(cVar);
        if (!(callback instanceof View)) {
            this.f32702a = null;
        } else {
            this.f32702a = ((View) callback).getContext().getApplicationContext();
        }
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f32701d) {
            this.f32704c.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        v vVar = this.f32704c.get(str);
        if (vVar == null) {
            return null;
        }
        Bitmap a10 = vVar.a();
        if (a10 != null) {
            return a10;
        }
        Context context = this.f32702a;
        if (context == null) {
            return null;
        }
        String b10 = vVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b10.startsWith("data:") || b10.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f32703b)) {
                    AssetManager assets = context.getAssets();
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f32703b + b10), (Rect) null, options);
                        if (decodeStream != null) {
                            return c(str, j.l(decodeStream, vVar.e(), vVar.c()));
                        }
                        d.c("Decoded image `" + str + "` is null.");
                        return null;
                    } catch (IllegalArgumentException e10) {
                        d.d("Unable to decode image `" + str + "`.", e10);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e11) {
                d.d("Unable to open asset.", e11);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b10.substring(b10.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e12) {
                d.d("data URL did not have correct base64 format.", e12);
                return null;
            }
        }
    }

    public boolean b(Context context) {
        if (this.f32702a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f32702a;
    }

    public void d(C8921c cVar) {
    }
}
