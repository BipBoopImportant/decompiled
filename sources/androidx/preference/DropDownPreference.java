package androidx.preference;

import G4.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {

    /* renamed from: O  reason: collision with root package name */
    private final Context f43490O;

    /* renamed from: P  reason: collision with root package name */
    private final ArrayAdapter f43491P;

    /* renamed from: Q  reason: collision with root package name */
    private Spinner f43492Q;

    /* renamed from: R  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f43493R;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String charSequence = DropDownPreference.this.d0()[i10].toString();
                if (!charSequence.equals(DropDownPreference.this.e0()) && DropDownPreference.this.a(charSequence)) {
                    DropDownPreference.this.g0(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f36030c);
    }

    private void i0() {
        this.f43491P.clear();
        if (b0() != null) {
            for (CharSequence charSequence : b0()) {
                this.f43491P.add(charSequence.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void M() {
        super.M();
        ArrayAdapter arrayAdapter = this.f43491P;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void O() {
        this.f43492Q.performClick();
    }

    /* access modifiers changed from: protected */
    public ArrayAdapter h0() {
        return new ArrayAdapter(this.f43490O, 17367049);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43493R = new a();
        this.f43490O = context;
        this.f43491P = h0();
        i0();
    }
}
