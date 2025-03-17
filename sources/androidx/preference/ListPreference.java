package androidx.preference;

import G4.c;
import G4.f;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import w2.l;

public class ListPreference extends DialogPreference {

    /* renamed from: J  reason: collision with root package name */
    private CharSequence[] f43497J;

    /* renamed from: K  reason: collision with root package name */
    private CharSequence[] f43498K;

    /* renamed from: L  reason: collision with root package name */
    private String f43499L;

    /* renamed from: M  reason: collision with root package name */
    private String f43500M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f43501N;

    public static final class a implements Preference.b<ListPreference> {

        /* renamed from: a  reason: collision with root package name */
        private static a f43502a;

        private a() {
        }

        public static a b() {
            if (f43502a == null) {
                f43502a = new a();
            }
            return f43502a;
        }

        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.c0()) ? listPreference.j().getString(f.f36040a) : listPreference.c0();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36144x, i10, i11);
        this.f43497J = l.o(obtainStyledAttributes, g.f36041A, g.f36146y);
        this.f43498K = l.o(obtainStyledAttributes, g.f36043B, g.f36148z);
        int i12 = g.f36045C;
        if (l.b(obtainStyledAttributes, i12, i12, false)) {
            X(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f36057I, i10, i11);
        this.f43500M = l.m(obtainStyledAttributes2, g.f36131q0, g.f36073Q);
        obtainStyledAttributes2.recycle();
    }

    private int f0() {
        return a0(this.f43499L);
    }

    public CharSequence G() {
        if (H() != null) {
            return H().a(this);
        }
        Object c02 = c0();
        CharSequence G10 = super.G();
        String str = this.f43500M;
        if (str == null) {
            return G10;
        }
        if (c02 == null) {
            c02 = "";
        }
        String format = String.format(str, new Object[]{c02});
        if (TextUtils.equals(format, G10)) {
            return G10;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    /* access modifiers changed from: protected */
    public Object Q(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public int a0(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f43498K) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f43498K[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] b0() {
        return this.f43497J;
    }

    public CharSequence c0() {
        CharSequence[] charSequenceArr;
        int f02 = f0();
        if (f02 < 0 || (charSequenceArr = this.f43497J) == null) {
            return null;
        }
        return charSequenceArr[f02];
    }

    public CharSequence[] d0() {
        return this.f43498K;
    }

    public String e0() {
        return this.f43499L;
    }

    public void g0(String str) {
        boolean equals = TextUtils.equals(this.f43499L, str);
        if (!equals || !this.f43501N) {
            this.f43499L = str;
            this.f43501N = true;
            W(str);
            if (!equals) {
                M();
            }
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, c.f36029b, 16842897));
    }
}
