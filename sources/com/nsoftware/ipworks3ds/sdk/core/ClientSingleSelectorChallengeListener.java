package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;
import nts.C3727;
import nts.C3875;
import nts.C4158;
import qE.C14948h;
import tE.C15075d;

public class ClientSingleSelectorChallengeListener extends C4158 {

    /* renamed from: v  reason: collision with root package name */
    public C3875 f120788v;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public AppCompatActivity f120789a;

        public a(AppCompatActivity appCompatActivity) {
            this.f120789a = appCompatActivity;
        }

        public void onClick(View view) {
            String str;
            int checkedRadioButtonId = ((RadioGroup) ((LinearLayout) ClientSingleSelectorChallengeListener.this.findViewById(C14948h.f130444c)).getChildAt(0)).getCheckedRadioButtonId() - 5000;
            if (checkedRadioButtonId < 0) {
                str = "";
            } else {
                C3875 r12 = ClientSingleSelectorChallengeListener.this.f120788v;
                String[] strArr = r12 == null ? new String[0] : r12.f1732;
                if (checkedRadioButtonId <= strArr.length) {
                    str = strArr[checkedRadioButtonId];
                } else {
                    throw new C15075d(C3727.m1052("5\u0013\b\u001e\u0014\u0010\u001e[\u0007\u0010\u001a\u0012\u0013\u0005\u0017\u0017L\u0004\u0000\u000b\r\u0011D", 0, 23, 107));
                }
            }
            ClientSingleSelectorChallengeListener.this.m3496(str, (String) null, this.f120789a, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3490((AppCompatActivity) this, (Context) this, (View.OnClickListener) new a(this));
    }
}
