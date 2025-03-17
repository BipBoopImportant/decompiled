package androidx.preference;

import G4.c;
import G4.e;
import G4.g;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import w2.l;

public class Preference implements Comparable<Preference> {

    /* renamed from: A  reason: collision with root package name */
    private List<Preference> f43506A;

    /* renamed from: B  reason: collision with root package name */
    private b f43507B;

    /* renamed from: C  reason: collision with root package name */
    private final View.OnClickListener f43508C;

    /* renamed from: a  reason: collision with root package name */
    private final Context f43509a;

    /* renamed from: b  reason: collision with root package name */
    private int f43510b;

    /* renamed from: c  reason: collision with root package name */
    private int f43511c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f43512d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f43513e;

    /* renamed from: f  reason: collision with root package name */
    private int f43514f;

    /* renamed from: g  reason: collision with root package name */
    private String f43515g;

    /* renamed from: h  reason: collision with root package name */
    private Intent f43516h;

    /* renamed from: i  reason: collision with root package name */
    private String f43517i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f43518j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f43519k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f43520l;

    /* renamed from: m  reason: collision with root package name */
    private String f43521m;

    /* renamed from: n  reason: collision with root package name */
    private Object f43522n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f43523o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f43524p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f43525q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f43526r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f43527s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f43528t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f43529u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f43530v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f43531w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f43532x;

    /* renamed from: y  reason: collision with root package name */
    private int f43533y;

    /* renamed from: z  reason: collision with root package name */
    private int f43534z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Preference.this.T(view);
        }
    }

    public interface b<T extends Preference> {
        CharSequence a(T t10);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f43510b = Integer.MAX_VALUE;
        this.f43511c = 0;
        this.f43518j = true;
        this.f43519k = true;
        this.f43520l = true;
        this.f43523o = true;
        this.f43524p = true;
        this.f43525q = true;
        this.f43526r = true;
        this.f43527s = true;
        this.f43529u = true;
        this.f43532x = true;
        this.f43533y = e.f36039a;
        this.f43508C = new a();
        this.f43509a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36057I, i10, i11);
        this.f43514f = l.l(obtainStyledAttributes, g.f36111g0, g.f36059J, 0);
        this.f43515g = l.m(obtainStyledAttributes, g.f36117j0, g.f36071P);
        this.f43512d = l.n(obtainStyledAttributes, g.f36133r0, g.f36067N);
        this.f43513e = l.n(obtainStyledAttributes, g.f36131q0, g.f36073Q);
        this.f43510b = l.d(obtainStyledAttributes, g.f36121l0, g.f36075R, Integer.MAX_VALUE);
        this.f43517i = l.m(obtainStyledAttributes, g.f36109f0, g.f36085W);
        this.f43533y = l.l(obtainStyledAttributes, g.f36119k0, g.f36065M, e.f36039a);
        this.f43534z = l.l(obtainStyledAttributes, g.f36135s0, g.f36077S, 0);
        this.f43518j = l.b(obtainStyledAttributes, g.f36106e0, g.f36063L, true);
        this.f43519k = l.b(obtainStyledAttributes, g.f36125n0, g.f36069O, true);
        this.f43520l = l.b(obtainStyledAttributes, g.f36123m0, g.f36061K, true);
        this.f43521m = l.m(obtainStyledAttributes, g.f36100c0, g.f36079T);
        int i12 = g.f36091Z;
        this.f43526r = l.b(obtainStyledAttributes, i12, i12, this.f43519k);
        int i13 = g.f36094a0;
        this.f43527s = l.b(obtainStyledAttributes, i13, i13, this.f43519k);
        if (obtainStyledAttributes.hasValue(g.f36097b0)) {
            this.f43522n = Q(obtainStyledAttributes, g.f36097b0);
        } else if (obtainStyledAttributes.hasValue(g.f36081U)) {
            this.f43522n = Q(obtainStyledAttributes, g.f36081U);
        }
        this.f43532x = l.b(obtainStyledAttributes, g.f36127o0, g.f36083V, true);
        boolean hasValue = obtainStyledAttributes.hasValue(g.f36129p0);
        this.f43528t = hasValue;
        if (hasValue) {
            this.f43529u = l.b(obtainStyledAttributes, g.f36129p0, g.f36087X, true);
        }
        this.f43530v = l.b(obtainStyledAttributes, g.f36113h0, g.f36089Y, false);
        int i14 = g.f36115i0;
        this.f43525q = l.b(obtainStyledAttributes, i14, i14, true);
        int i15 = g.f36103d0;
        this.f43531w = l.b(obtainStyledAttributes, i15, i15, false);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public boolean B(boolean z10) {
        if (!Z()) {
            return z10;
        }
        E();
        Throwable th2 = null;
        th2.getClass();
        throw th2;
    }

    /* access modifiers changed from: protected */
    public int C(int i10) {
        if (!Z()) {
            return i10;
        }
        E();
        Throwable th2 = null;
        th2.getClass();
        throw th2;
    }

    /* access modifiers changed from: protected */
    public String D(String str) {
        if (!Z()) {
            return str;
        }
        E();
        Throwable th2 = null;
        th2.getClass();
        throw th2;
    }

    public G4.a E() {
        return null;
    }

    public G4.b F() {
        return null;
    }

    public CharSequence G() {
        return H() != null ? H().a(this) : this.f43513e;
    }

    public final b H() {
        return this.f43507B;
    }

    public CharSequence I() {
        return this.f43512d;
    }

    public boolean J() {
        return !TextUtils.isEmpty(this.f43515g);
    }

    public boolean K() {
        return this.f43518j && this.f43523o && this.f43524p;
    }

    public boolean L() {
        return this.f43519k;
    }

    /* access modifiers changed from: protected */
    public void M() {
    }

    public void N(boolean z10) {
        List<Preference> list = this.f43506A;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).P(this, z10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void O() {
    }

    public void P(Preference preference, boolean z10) {
        if (this.f43523o == z10) {
            this.f43523o = !z10;
            N(Y());
            M();
        }
    }

    /* access modifiers changed from: protected */
    public Object Q(TypedArray typedArray, int i10) {
        return null;
    }

    public void R(Preference preference, boolean z10) {
        if (this.f43524p == z10) {
            this.f43524p = !z10;
            N(Y());
            M();
        }
    }

    public void S() {
        if (K() && L()) {
            O();
            F();
            if (this.f43516h != null) {
                j().startActivity(this.f43516h);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void T(View view) {
        S();
    }

    /* access modifiers changed from: protected */
    public boolean U(boolean z10) {
        if (!Z()) {
            return false;
        }
        if (z10 == B(!z10)) {
            return true;
        }
        E();
        Throwable th2 = null;
        th2.getClass();
        throw th2;
    }

    /* access modifiers changed from: protected */
    public boolean V(int i10) {
        if (!Z()) {
            return false;
        }
        if (i10 == C(~i10)) {
            return true;
        }
        E();
        Throwable th2 = null;
        th2.getClass();
        throw th2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* access modifiers changed from: protected */
    public boolean W(String str) {
        if (!Z()) {
            return false;
        }
        ? r02 = 0;
        if (TextUtils.equals(str, D(r02))) {
            return true;
        }
        E();
        r02.getClass();
        throw r02;
    }

    public final void X(b bVar) {
        this.f43507B = bVar;
        M();
    }

    public boolean Y() {
        return !K();
    }

    /* access modifiers changed from: protected */
    public boolean Z() {
        return false;
    }

    public boolean a(Object obj) {
        return true;
    }

    /* renamed from: b */
    public int compareTo(Preference preference) {
        int i10 = this.f43510b;
        int i11 = preference.f43510b;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f43512d;
        CharSequence charSequence2 = preference.f43512d;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f43512d.toString());
    }

    public Context j() {
        return this.f43509a;
    }

    /* access modifiers changed from: package-private */
    public StringBuilder m() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence I10 = I();
        if (!TextUtils.isEmpty(I10)) {
            sb2.append(I10);
            sb2.append(' ');
        }
        CharSequence G10 = G();
        if (!TextUtils.isEmpty(G10)) {
            sb2.append(G10);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String n() {
        return this.f43517i;
    }

    public String toString() {
        return m().toString();
    }

    public Intent v() {
        return this.f43516h;
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36034g, 16842894));
    }
}
