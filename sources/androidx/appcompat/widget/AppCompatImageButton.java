package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import i.C5421a;

public class AppCompatImageButton extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private final C4990b f16073a;

    /* renamed from: b  reason: collision with root package name */
    private final C4997i f16074b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16075c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23874D);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            bVar.b();
        }
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            iVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            return iVar.e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f16074b.f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C4997i iVar = this.f16074b;
        if (!(iVar == null || drawable == null || this.f16075c)) {
            iVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        C4997i iVar2 = this.f16074b;
        if (iVar2 != null) {
            iVar2.c();
            if (!this.f16075c) {
                this.f16074b.b();
            }
        }
    }

    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f16075c = true;
    }

    public void setImageResource(int i10) {
        this.f16074b.i(i10);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.f16073a;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            iVar.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C4997i iVar = this.f16074b;
        if (iVar != null) {
            iVar.k(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(J.b(context), attributeSet, i10);
        this.f16075c = false;
        H.a(this, getContext());
        C4990b bVar = new C4990b(this);
        this.f16073a = bVar;
        bVar.e(attributeSet, i10);
        C4997i iVar = new C4997i(this);
        this.f16074b = iVar;
        iVar.g(attributeSet, i10);
    }
}
