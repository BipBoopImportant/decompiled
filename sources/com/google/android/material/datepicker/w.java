package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

class w extends LinearLayoutManager {

    class a extends p {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    w(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public void i2(RecyclerView recyclerView, RecyclerView.C c10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        j2(aVar);
    }
}
