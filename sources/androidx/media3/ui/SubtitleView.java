package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;
import w4.C8911a;

public final class SubtitleView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private List<s3.a> f43291a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    private C8911a f43292b = C8911a.f57084g;

    /* renamed from: c  reason: collision with root package name */
    private int f43293c = 0;

    /* renamed from: d  reason: collision with root package name */
    private float f43294d = 0.0533f;

    /* renamed from: e  reason: collision with root package name */
    private float f43295e = 0.08f;

    /* renamed from: f  reason: collision with root package name */
    private boolean f43296f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f43297g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f43298h;

    /* renamed from: i  reason: collision with root package name */
    private a f43299i;

    /* renamed from: j  reason: collision with root package name */
    private View f43300j;

    interface a {
        void a(List<s3.a> list, C8911a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f43299i = canvasSubtitleOutput;
        this.f43300j = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f43298h = 1;
    }

    private s3.a a(s3.a aVar) {
        a.b a10 = aVar.a();
        if (!this.f43296f) {
            C.e(a10);
        } else if (!this.f43297g) {
            C.f(a10);
        }
        return a10.a();
    }

    private void c(int i10, float f10) {
        this.f43293c = i10;
        this.f43294d = f10;
        f();
    }

    private void f() {
        this.f43299i.a(getCuesWithStylingPreferencesApplied(), this.f43292b, this.f43294d, this.f43293c, this.f43295e);
    }

    private List<s3.a> getCuesWithStylingPreferencesApplied() {
        if (this.f43296f && this.f43297g) {
            return this.f43291a;
        }
        ArrayList arrayList = new ArrayList(this.f43291a.size());
        for (int i10 = 0; i10 < this.f43291a.size(); i10++) {
            arrayList.add(a(this.f43291a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (!isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            return captioningManager.getFontScale();
        }
        return 1.0f;
    }

    private C8911a getUserCaptionStyle() {
        if (isInEditMode()) {
            return C8911a.f57084g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C8911a.f57084g : C8911a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f43300j);
        View view = this.f43300j;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).g();
        }
        this.f43300j = t10;
        this.f43299i = (a) t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f43297g = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f43296f = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f43295e = f10;
        f();
    }

    public void setCues(List<s3.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f43291a = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(C8911a aVar) {
        this.f43292b = aVar;
        f();
    }

    public void setViewType(int i10) {
        if (this.f43298h != i10) {
            if (i10 == 1) {
                setView(new CanvasSubtitleOutput(getContext()));
            } else if (i10 == 2) {
                setView(new WebViewSubtitleOutput(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f43298h = i10;
        }
    }
}
