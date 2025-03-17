package androidx.preference;

import G4.c;
import android.content.Context;
import android.util.AttributeSet;
import w2.l;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public boolean K() {
        return false;
    }

    public boolean Y() {
        return !super.K();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36032e, 16842892));
    }
}
