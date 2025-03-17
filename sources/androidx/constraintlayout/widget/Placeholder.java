package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p2.e;

public class Placeholder extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f20281a;

    /* renamed from: b  reason: collision with root package name */
    private View f20282b;

    /* renamed from: c  reason: collision with root package name */
    private int f20283c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f20282b != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f20282b.getLayoutParams();
            bVar2.f20251v0.n1(0);
            e.b A10 = bVar.f20251v0.A();
            e.b bVar3 = e.b.FIXED;
            if (A10 != bVar3) {
                bVar.f20251v0.o1(bVar2.f20251v0.Y());
            }
            if (bVar.f20251v0.V() != bVar3) {
                bVar.f20251v0.P0(bVar2.f20251v0.x());
            }
            bVar2.f20251v0.n1(8);
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f20281a == -1 && !isInEditMode()) {
            setVisibility(this.f20283c);
        }
        View findViewById = constraintLayout.findViewById(this.f20281a);
        this.f20282b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f20227j0 = true;
            this.f20282b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f20282b;
    }

    public int getEmptyVisibility() {
        return this.f20283c;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f20281a != i10) {
            View view = this.f20282b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.f20282b.getLayoutParams()).f20227j0 = false;
                this.f20282b = null;
            }
            this.f20281a = i10;
            if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i10) {
        this.f20283c = i10;
    }
}
