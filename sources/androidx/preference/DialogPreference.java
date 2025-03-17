package androidx.preference;

import G4.c;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import w2.l;

public abstract class DialogPreference extends Preference {

    /* renamed from: D  reason: collision with root package name */
    private CharSequence f43484D;

    /* renamed from: E  reason: collision with root package name */
    private CharSequence f43485E;

    /* renamed from: F  reason: collision with root package name */
    private Drawable f43486F;

    /* renamed from: G  reason: collision with root package name */
    private CharSequence f43487G;

    /* renamed from: H  reason: collision with root package name */
    private CharSequence f43488H;

    /* renamed from: I  reason: collision with root package name */
    private int f43489I;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36114i, i10, i11);
        String m10 = l.m(obtainStyledAttributes, g.f36134s, g.f36116j);
        this.f43484D = m10;
        if (m10 == null) {
            this.f43484D = I();
        }
        this.f43485E = l.m(obtainStyledAttributes, g.f36132r, g.f36118k);
        this.f43486F = l.c(obtainStyledAttributes, g.f36128p, g.f36120l);
        this.f43487G = l.m(obtainStyledAttributes, g.f36138u, g.f36122m);
        this.f43488H = l.m(obtainStyledAttributes, g.f36136t, g.f36124n);
        this.f43489I = l.l(obtainStyledAttributes, g.f36130q, g.f36126o, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void O() {
        F();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36029b, 16842897));
    }
}
