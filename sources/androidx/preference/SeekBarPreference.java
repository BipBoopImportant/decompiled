package androidx.preference;

import G4.c;
import G4.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarPreference extends Preference {

    /* renamed from: D  reason: collision with root package name */
    int f43546D;

    /* renamed from: E  reason: collision with root package name */
    int f43547E;

    /* renamed from: F  reason: collision with root package name */
    private int f43548F;

    /* renamed from: G  reason: collision with root package name */
    private int f43549G;

    /* renamed from: H  reason: collision with root package name */
    boolean f43550H;

    /* renamed from: I  reason: collision with root package name */
    SeekBar f43551I;

    /* renamed from: J  reason: collision with root package name */
    private TextView f43552J;

    /* renamed from: K  reason: collision with root package name */
    boolean f43553K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f43554L;

    /* renamed from: M  reason: collision with root package name */
    boolean f43555M;

    /* renamed from: N  reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f43556N;

    /* renamed from: O  reason: collision with root package name */
    private final View.OnKeyListener f43557O;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f43555M || !seekBarPreference.f43550H) {
                    seekBarPreference.d0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.e0(i10 + seekBarPreference2.f43547E);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f43550H = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f43550H = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f43547E != seekBarPreference.f43546D) {
                seekBarPreference.d0(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f43553K && (i10 == 21 || i10 == 22)) || i10 == 23 || i10 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f43551I;
            if (seekBar != null) {
                return seekBar.onKeyDown(i10, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43556N = new a();
        this.f43557O = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f36046C0, i10, i11);
        this.f43547E = obtainStyledAttributes.getInt(g.f36052F0, 0);
        a0(obtainStyledAttributes.getInt(g.f36048D0, 100));
        b0(obtainStyledAttributes.getInt(g.f36054G0, 0));
        this.f43553K = obtainStyledAttributes.getBoolean(g.f36050E0, true);
        this.f43554L = obtainStyledAttributes.getBoolean(g.f36056H0, false);
        this.f43555M = obtainStyledAttributes.getBoolean(g.f36058I0, false);
        obtainStyledAttributes.recycle();
    }

    private void c0(int i10, boolean z10) {
        int i11 = this.f43547E;
        if (i10 < i11) {
            i10 = i11;
        }
        int i12 = this.f43548F;
        if (i10 > i12) {
            i10 = i12;
        }
        if (i10 != this.f43546D) {
            this.f43546D = i10;
            e0(i10);
            V(i10);
            if (z10) {
                M();
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object Q(TypedArray typedArray, int i10) {
        return Integer.valueOf(typedArray.getInt(i10, 0));
    }

    public final void a0(int i10) {
        int i11 = this.f43547E;
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 != this.f43548F) {
            this.f43548F = i10;
            M();
        }
    }

    public final void b0(int i10) {
        if (i10 != this.f43549G) {
            this.f43549G = Math.min(this.f43548F - this.f43547E, Math.abs(i10));
            M();
        }
    }

    /* access modifiers changed from: package-private */
    public void d0(SeekBar seekBar) {
        int progress = this.f43547E + seekBar.getProgress();
        if (progress == this.f43546D) {
            return;
        }
        if (a(Integer.valueOf(progress))) {
            c0(progress, false);
            return;
        }
        seekBar.setProgress(this.f43546D - this.f43547E);
        e0(this.f43546D);
    }

    /* access modifiers changed from: package-private */
    public void e0(int i10) {
        TextView textView = this.f43552J;
        if (textView != null) {
            textView.setText(String.valueOf(i10));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f36035h);
    }
}
