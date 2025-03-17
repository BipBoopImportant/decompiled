package com.contentsquare.android.analytics.internal.features.clientmode.ui.developer;

import E8.b;
import HJ.C15835a;
import HJ.C15854t;
import YH.C16877v;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import b8.m;
import b8.n;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.developer.a;
import e8.C7808a;
import e8.C7809b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/developer/DeveloperActivationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class DeveloperActivationActivity extends AppCompatActivity {

    /* renamed from: v  reason: collision with root package name */
    public final a.C0811a f46614v = new a.C0811a(C8886a.f56874d.b(this).f());

    /* renamed from: w  reason: collision with root package name */
    public a f46615w;

    public static final void w(DeveloperActivationActivity developerActivationActivity, EditText editText, View view) {
        C17542s.j(developerActivationActivity, "this$0");
        developerActivationActivity.a(editText.getText().toString());
    }

    public static final boolean x(DeveloperActivationActivity developerActivationActivity, TextView textView, int i10, KeyEvent keyEvent) {
        C17542s.j(developerActivationActivity, "this$0");
        C17542s.j(textView, "textView");
        if (i10 != 2) {
            return false;
        }
        developerActivationActivity.a(textView.getText().toString());
        return true;
    }

    public final void a(String str) {
        boolean z10;
        a aVar = this.f46615w;
        a aVar2 = null;
        if (aVar == null) {
            C17542s.z("developerActivationViewModel");
            aVar = null;
        }
        aVar.getClass();
        C17542s.j(str, "code");
        List<String> Y02 = C15854t.Y0("28/04/20/08", new String[]{"/"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(C16877v.y(Y02, 10));
        for (String parseInt : Y02) {
            arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
        }
        if (C15854t.t(str) == null || str.length() != arrayList.size()) {
            z10 = false;
        } else {
            String str2 = "";
            for (int i10 = 0; i10 < str.length(); i10++) {
                str2 = str2 + ((((Number) arrayList.get(i10)).intValue() ^ C15835a.e(str.charAt(i10))) << 1);
            }
            z10 = C17542s.e(str2, "62144216");
        }
        if (z10) {
            a aVar3 = this.f46615w;
            if (aVar3 == null) {
                C17542s.z("developerActivationViewModel");
            } else {
                aVar2 = aVar3;
            }
            aVar2.f46616m.h(b.DEVELOPER_MODE_ACTIVATION_STATE, true);
            aVar2.f46616m.h(b.SESSION_REPLAY_DEFAULT_MASKING, true);
            aVar2.f46616m.h(b.VERBOSE_LOG, true);
            setResult(-1);
            finish();
            return;
        }
        Toast.makeText(this, "Invalid password.", 0).show();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(n.f45584c);
        a();
        setFinishOnTouchOutside(false);
        this.f46615w = (a) this.f46614v.create(a.class);
    }

    public final void a() {
        EditText editText = (EditText) findViewById(m.f45543N);
        editText.setOnEditorActionListener(new C7808a(this));
        ((Button) findViewById(m.f45544O)).setOnClickListener(new C7809b(this, editText));
    }
}
