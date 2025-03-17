package a9;

import E8.b;
import android.text.Editable;
import android.text.TextWatcher;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.k6;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.m6  reason: case insensitive filesystem */
public final class C6884m6 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k6 f42719a;

    public C6884m6(k6 k6Var) {
        this.f42719a = k6Var;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C7130i0 i0Var = this.f42719a.f47486D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        String valueOf = String.valueOf(charSequence);
        i0Var.getClass();
        C17542s.j(valueOf, "value");
        i0Var.f47431a.l(b.DEVELOPER_SESSION_REPLAY_URL, valueOf);
    }
}
