package a9;

import E8.b;
import E8.c;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatEditText;
import b8.m;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.k6;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class S5 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k6 f42281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<String> f42282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f42283c;

    public S5(k6 k6Var, List<String> list, View view) {
        this.f42281a = k6Var;
        this.f42282b = list;
        this.f42283c = view;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        C7130i0 i0Var = this.f42281a.f47486D;
        C7130i0 i0Var2 = null;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        String str = this.f42282b.get(i10);
        C17542s.i(str, "presets[position]");
        String str2 = str;
        i0Var.getClass();
        C17542s.j(str2, "value");
        c cVar = i0Var.f47431a;
        b bVar = b.DEVELOPER_SESSION_REPLAY_PRESET_URL;
        cVar.l(bVar, str2);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        k6 k6Var = this.f42281a;
        View view2 = this.f42283c;
        String str3 = this.f42282b.get(i10);
        C17542s.i(str3, "presets[position]");
        String str4 = str3;
        k6Var.getClass();
        AppCompatEditText appCompatEditText = (AppCompatEditText) view2.findViewById(m.f45538I);
        appCompatEditText.setEnabled(z10);
        if (z10) {
            C7130i0 i0Var3 = k6Var.f47486D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var2 = i0Var3;
            }
            c cVar2 = i0Var2.f47431a;
            b bVar2 = b.DEVELOPER_SESSION_REPLAY_URL;
            String f10 = cVar2.f(bVar, "from_configuration");
            C17542s.g(f10);
            String f11 = cVar2.f(bVar2, f10);
            C17542s.g(f11);
            appCompatEditText.setText(f11);
            C17542s.i(appCompatEditText, "setupSessionReplayUrl$lambda$11");
            appCompatEditText.addTextChangedListener(new C6884m6(k6Var));
            return;
        }
        appCompatEditText.setText(str4);
        C7130i0 i0Var4 = k6Var.f47486D;
        if (i0Var4 == null) {
            C17542s.z("settingsViewModel");
        } else {
            i0Var2 = i0Var4;
        }
        i0Var2.getClass();
        C17542s.j(str4, "value");
        i0Var2.f47431a.l(b.DEVELOPER_SESSION_REPLAY_URL, str4);
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
