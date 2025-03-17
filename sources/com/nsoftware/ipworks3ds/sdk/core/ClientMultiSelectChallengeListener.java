package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import nts.C3727;
import nts.C3875;
import nts.C4158;
import qE.C14948h;
import tE.C15075d;

public class ClientMultiSelectChallengeListener extends C4158 {

    /* renamed from: v  reason: collision with root package name */
    public C3875 f120783v;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public AppCompatActivity f120784a;

        public a(AppCompatActivity appCompatActivity) {
            this.f120784a = appCompatActivity;
        }

        public void onClick(View view) {
            LinearLayout linearLayout = (LinearLayout) ClientMultiSelectChallengeListener.this.findViewById(C14948h.f130444c);
            int childCount = linearLayout.getChildCount();
            C3875 r12 = ClientMultiSelectChallengeListener.this.f120783v;
            String[] strArr = r12 == null ? new String[0] : r12.f1732;
            String str = "";
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = linearLayout.getChildAt(i11);
                if (childAt instanceof CheckBox) {
                    if (((CheckBox) childAt).isChecked()) {
                        if (str.length() > 0) {
                            str = str + ",";
                        }
                        if (strArr.length > i10) {
                            str = str + strArr[i10];
                        } else {
                            throw new C15075d(C3727.m1052("F`{mgcm(tcia`vdd?wsx~b7", 0, 23, 24));
                        }
                    }
                    i10++;
                }
            }
            ClientMultiSelectChallengeListener.this.m3496(str, (String) null, this.f120784a, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) new a(this));
    }
}
