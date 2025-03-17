package androidx.preference;

import G4.c;
import G4.f;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import w2.l;

public class EditTextPreference extends DialogPreference {

    /* renamed from: J  reason: collision with root package name */
    private String f43495J;

    public static final class a implements Preference.b<EditTextPreference> {

        /* renamed from: a  reason: collision with root package name */
        private static a f43496a;

        private a() {
        }

        public static a b() {
            if (f43496a == null) {
                f43496a = new a();
            }
            return f43496a;
        }

        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.a0()) ? editTextPreference.j().getString(f.f36040a) : editTextPreference.a0();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36140v, i10, i11);
        int i12 = g.f36142w;
        if (l.b(obtainStyledAttributes, i12, i12, false)) {
            X(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object Q(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public boolean Y() {
        return TextUtils.isEmpty(this.f43495J) || super.Y();
    }

    public String a0() {
        return this.f43495J;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36031d, 16842898));
    }
}
