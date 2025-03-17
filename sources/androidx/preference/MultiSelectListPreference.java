package androidx.preference;

import G4.c;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import w2.l;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: J  reason: collision with root package name */
    private CharSequence[] f43503J;

    /* renamed from: K  reason: collision with root package name */
    private CharSequence[] f43504K;

    /* renamed from: L  reason: collision with root package name */
    private Set<String> f43505L;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43505L = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36047D, i10, i11);
        this.f43503J = l.o(obtainStyledAttributes, g.f36053G, g.f36049E);
        this.f43504K = l.o(obtainStyledAttributes, g.f36055H, g.f36051F);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public Object Q(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36029b, 16842897));
    }
}
