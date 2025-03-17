package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import nts.C4158;

public class ClientTextChallengeListener extends C4158 {

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public AppCompatActivity f120791a;

        public a(AppCompatActivity appCompatActivity) {
            this.f120791a = appCompatActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0090 A[Catch:{ Exception -> 0x0037 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0098 A[Catch:{ Exception -> 0x0037 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r7) {
            /*
                r6 = this;
                nts.ഴ r7 = nts.C3734.f1057
                r7.m1121()
                nts.ഗ r7 = r7.f1064
                com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener r0 = com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener.this
                int r1 = qE.C14948h.f130444c
                android.view.View r0 = r0.findViewById(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener r1 = com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener.this     // Catch:{ Exception -> 0x0037 }
                r1.getClass()     // Catch:{ Exception -> 0x0037 }
                boolean r1 = r7.m1109()     // Catch:{ Exception -> 0x0037 }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0045
                int r1 = r0.getChildCount()     // Catch:{ Exception -> 0x0037 }
                if (r1 != r3) goto L_0x003a
                android.view.View r1 = r0.getChildAt(r2)     // Catch:{ Exception -> 0x0037 }
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x0037 }
                android.view.View r1 = r1.getChildAt(r2)     // Catch:{ Exception -> 0x0037 }
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x0037 }
                android.view.View r1 = r1.getChildAt(r3)     // Catch:{ Exception -> 0x0037 }
                com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1     // Catch:{ Exception -> 0x0037 }
                goto L_0x0040
            L_0x0037:
                r7 = move-exception
                goto L_0x00a8
            L_0x003a:
                android.view.View r1 = r0.getChildAt(r3)     // Catch:{ Exception -> 0x0037 }
                com.google.android.material.textfield.TextInputLayout r1 = (com.google.android.material.textfield.TextInputLayout) r1     // Catch:{ Exception -> 0x0037 }
            L_0x0040:
                android.widget.EditText r1 = r1.getEditText()     // Catch:{ Exception -> 0x0037 }
                goto L_0x004b
            L_0x0045:
                android.view.View r1 = r0.getChildAt(r2)     // Catch:{ Exception -> 0x0037 }
                android.widget.EditText r1 = (android.widget.EditText) r1     // Catch:{ Exception -> 0x0037 }
            L_0x004b:
                android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0037 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0037 }
                com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener r4 = com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener.this     // Catch:{ Exception -> 0x0037 }
                r4.getClass()     // Catch:{ Exception -> 0x0037 }
                boolean r7 = r7.m1109()     // Catch:{ Exception -> 0x0037 }
                r4 = 0
                if (r7 == 0) goto L_0x0095
                int r7 = r0.getChildCount()     // Catch:{ Exception -> 0x0037 }
                if (r7 != r3) goto L_0x007f
                android.view.View r7 = r0.getChildAt(r2)     // Catch:{ Exception -> 0x0037 }
                android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7     // Catch:{ Exception -> 0x0037 }
                android.view.View r7 = r7.getChildAt(r3)     // Catch:{ Exception -> 0x0037 }
                android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7     // Catch:{ Exception -> 0x0037 }
                int r0 = r7.getChildCount()     // Catch:{ Exception -> 0x0037 }
                r5 = 2
                if (r0 != r5) goto L_0x008d
                android.view.View r7 = r7.getChildAt(r3)     // Catch:{ Exception -> 0x0037 }
                com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7     // Catch:{ Exception -> 0x0037 }
                goto L_0x008e
            L_0x007f:
                int r7 = r0.getChildCount()     // Catch:{ Exception -> 0x0037 }
                r3 = 3
                if (r7 <= r3) goto L_0x008d
                android.view.View r7 = r0.getChildAt(r3)     // Catch:{ Exception -> 0x0037 }
                com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7     // Catch:{ Exception -> 0x0037 }
                goto L_0x008e
            L_0x008d:
                r7 = r4
            L_0x008e:
                if (r7 == 0) goto L_0x0095
                android.widget.EditText r7 = r7.getEditText()     // Catch:{ Exception -> 0x0037 }
                goto L_0x0096
            L_0x0095:
                r7 = r4
            L_0x0096:
                if (r7 == 0) goto L_0x00a0
                android.text.Editable r7 = r7.getText()     // Catch:{ Exception -> 0x0037 }
                java.lang.String r4 = r7.toString()     // Catch:{ Exception -> 0x0037 }
            L_0x00a0:
                com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener r7 = com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener.this     // Catch:{ Exception -> 0x0037 }
                androidx.appcompat.app.AppCompatActivity r0 = r6.f120791a     // Catch:{ Exception -> 0x0037 }
                r7.m3496((java.lang.String) r1, (java.lang.String) r4, (androidx.appcompat.app.AppCompatActivity) r0, (int) r2)     // Catch:{ Exception -> 0x0037 }
                goto L_0x00c6
            L_0x00a8:
                nts.ഴ r0 = nts.C3734.f1057
                nts.ϴ r1 = r0.m1119()
                if (r1 == 0) goto L_0x00bf
                nts.ภ r0 = new nts.ภ
                java.lang.String r7 = r7.getMessage()
                java.lang.String r2 = "-1"
                r0.<init>(r2, r7)
                r1.runtimeError(r0)
                goto L_0x00c6
            L_0x00bf:
                java.lang.String r7 = r7.getMessage()
                r0.m1123((java.lang.String) r7)
            L_0x00c6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nsoftware.ipworks3ds.sdk.core.ClientTextChallengeListener.a.onClick(android.view.View):void");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) new a(this));
    }
}
