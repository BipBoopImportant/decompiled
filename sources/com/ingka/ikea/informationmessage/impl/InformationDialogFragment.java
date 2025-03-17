package com.ingka.ikea.informationmessage.impl;

import XH.C16807N;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment;
import kotlin.Metadata;
import lg.f;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/informationmessage/impl/InformationDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "", "C0", "()Ljava/lang/String;", "title", "B0", "description", "A0", "buttonText", "informationmessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InformationDialogFragment extends BaseComposeDialogFragment {
    private final String A0() {
        return requireArguments().getString("buttonText");
    }

    private final String B0() {
        String string = requireArguments().getString("message");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String C0() {
        String string = requireArguments().getString("title");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N z0(InformationDialogFragment informationDialogFragment) {
        informationDialogFragment.dismiss();
        return C16807N.f139792a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r12, int r13) {
        /*
            r11 = this;
            r0 = -1000234109(0xffffffffc461a383, float:-902.5549)
            r12.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.informationmessage.impl.InformationDialogFragment.DialogContent (InformationDialogFragment.kt:27)"
            U0.C4895p.S(r0, r13, r1, r2)
        L_0x0012:
            java.lang.String r3 = r11.C0()
            java.lang.String r4 = r11.B0()
            java.lang.String r5 = r11.A0()
            r0 = 763557992(0x2d82f868, float:1.4889603E-11)
            r12.W(r0)
            r0 = r13 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L_0x0031
            boolean r0 = r12.V(r11)
            if (r0 != 0) goto L_0x0035
        L_0x0031:
            r13 = r13 & 6
            if (r13 != r1) goto L_0x0037
        L_0x0035:
            r13 = 1
            goto L_0x0038
        L_0x0037:
            r13 = 0
        L_0x0038:
            java.lang.Object r0 = r12.D()
            if (r13 != 0) goto L_0x0046
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x004e
        L_0x0046:
            Rs.b r0 = new Rs.b
            r0.<init>(r11)
            r12.u(r0)
        L_0x004e:
            r7 = r0
            nI.a r7 = (nI.C17631a) r7
            r12.P()
            r9 = 0
            r10 = 8
            r6 = 0
            r8 = r12
            sl.C11865e.i(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r13 = U0.C4895p.J()
            if (r13 == 0) goto L_0x0065
            U0.C4895p.R()
        L_0x0065:
            r12.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.informationmessage.impl.InformationDialogFragment.u0(U0.m, int):void");
    }
}
