package androidx.preference;

import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j0.b0;
import java.util.ArrayList;
import java.util.List;
import w2.l;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: D  reason: collision with root package name */
    final b0<String, Long> f43536D;

    /* renamed from: E  reason: collision with root package name */
    private final Handler f43537E;

    /* renamed from: F  reason: collision with root package name */
    private final List<Preference> f43538F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f43539G;

    /* renamed from: H  reason: collision with root package name */
    private int f43540H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f43541I;

    /* renamed from: J  reason: collision with root package name */
    private int f43542J;

    /* renamed from: K  reason: collision with root package name */
    private final Runnable f43543K;

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f43536D.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43536D = new b0<>();
        this.f43537E = new Handler(Looper.getMainLooper());
        this.f43539G = true;
        this.f43540H = 0;
        this.f43541I = false;
        this.f43542J = Integer.MAX_VALUE;
        this.f43543K = new a();
        this.f43538F = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36141v0, i10, i11);
        int i12 = g.f36145x0;
        this.f43539G = l.b(obtainStyledAttributes, i12, i12, true);
        if (obtainStyledAttributes.hasValue(g.f36143w0)) {
            int i13 = g.f36143w0;
            c0(l.d(obtainStyledAttributes, i13, i13, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public void N(boolean z10) {
        super.N(z10);
        int b02 = b0();
        for (int i10 = 0; i10 < b02; i10++) {
            a0(i10).R(this, z10);
        }
    }

    public Preference a0(int i10) {
        return this.f43538F.get(i10);
    }

    public int b0() {
        return this.f43538F.size();
    }

    public void c0(int i10) {
        if (i10 != Integer.MAX_VALUE && !J()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f43542J = i10;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
