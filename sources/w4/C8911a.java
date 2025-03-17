package w4;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: w4.a  reason: case insensitive filesystem */
public final class C8911a {

    /* renamed from: g  reason: collision with root package name */
    public static final C8911a f57084g = new C8911a(-1, -16777216, 0, 0, -1, (Typeface) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f57085a;

    /* renamed from: b  reason: collision with root package name */
    public final int f57086b;

    /* renamed from: c  reason: collision with root package name */
    public final int f57087c;

    /* renamed from: d  reason: collision with root package name */
    public final int f57088d;

    /* renamed from: e  reason: collision with root package name */
    public final int f57089e;

    /* renamed from: f  reason: collision with root package name */
    public final Typeface f57090f;

    public C8911a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f57085a = i10;
        this.f57086b = i11;
        this.f57087c = i12;
        this.f57088d = i13;
        this.f57089e = i14;
        this.f57090f = typeface;
    }

    public static C8911a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C8911a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f57084g.f57085a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f57084g.f57086b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f57084g.f57087c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f57084g.f57088d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f57084g.f57089e, captionStyle.getTypeface());
    }
}
