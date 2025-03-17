package J2;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f8805a;

    /* renamed from: b  reason: collision with root package name */
    private final t f8806b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8807c;

    public a(int i10, t tVar, int i11) {
        this.f8805a = i10;
        this.f8806b = tVar;
        this.f8807c = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8805a);
        this.f8806b.Y(this.f8807c, bundle);
    }
}
