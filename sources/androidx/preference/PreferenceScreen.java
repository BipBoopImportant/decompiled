package androidx.preference;

import G4.c;
import android.content.Context;
import android.util.AttributeSet;
import w2.l;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: L  reason: collision with root package name */
    private boolean f43545L = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, l.a(context, c.f36033f, 16842891));
    }

    /* access modifiers changed from: protected */
    public void O() {
        if (v() == null && n() == null && b0() != 0) {
            F();
            throw null;
        }
    }
}
