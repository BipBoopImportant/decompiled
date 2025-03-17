package com.google.android.material.datepicker;

import H2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.v;
import java.util.Collection;

public interface i<S> extends Parcelable {
    /* access modifiers changed from: private */
    static /* synthetic */ void D1(EditText[] editTextArr, View view, boolean z10) {
        int length = editTextArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (!editTextArr[i10].hasFocus()) {
                i10++;
            } else {
                return;
            }
        }
        v.h(view, false);
    }

    static void r2(EditText... editTextArr) {
        if (editTextArr.length != 0) {
            g gVar = new g(editTextArr);
            for (EditText onFocusChangeListener : editTextArr) {
                onFocusChangeListener.setOnFocusChangeListener(gVar);
            }
            EditText editText = editTextArr[0];
            editText.postDelayed(new h(editText), 100);
        }
    }

    int F0();

    String F1(Context context);

    boolean J2();

    Collection<d<Long, Long>> L1();

    void N1(S s10);

    String P0(Context context);

    Collection<Long> Q2();

    int T0(Context context);

    S W2();

    void n3(long j10);

    View t2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, t<S> tVar);
}
