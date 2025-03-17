package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.t;

class l extends C14190a<ImageView> {

    /* renamed from: m  reason: collision with root package name */
    C14194e f122575m;

    l(t tVar, ImageView imageView, w wVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj, C14194e eVar, boolean z10) {
        super(tVar, imageView, wVar, i10, i11, i12, drawable, str, obj, z10);
        this.f122575m = eVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        super.a();
        if (this.f122575m != null) {
            this.f122575m = null;
        }
    }

    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f122506c.get();
            if (imageView != null) {
                t tVar = this.f122504a;
                Bitmap bitmap2 = bitmap;
                t.e eVar2 = eVar;
                u.c(imageView, tVar.f122600d, bitmap2, eVar2, this.f122507d, tVar.f122608l);
                C14194e eVar3 = this.f122575m;
                if (eVar3 != null) {
                    eVar3.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f122506c.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            int i10 = this.f122510g;
            if (i10 != 0) {
                imageView.setImageResource(i10);
            } else {
                Drawable drawable2 = this.f122511h;
                if (drawable2 != null) {
                    imageView.setImageDrawable(drawable2);
                }
            }
            C14194e eVar = this.f122575m;
            if (eVar != null) {
                eVar.a(exc);
            }
        }
    }
}
