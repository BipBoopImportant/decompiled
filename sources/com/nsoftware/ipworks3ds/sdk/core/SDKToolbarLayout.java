package com.nsoftware.ipworks3ds.sdk.core;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import qE.C14946f;
import qE.C14948h;
import qE.C14949i;

public class SDKToolbarLayout extends AppBarLayout {

    /* renamed from: B  reason: collision with root package name */
    public static Button f120794B;

    /* renamed from: A  reason: collision with root package name */
    public final TextView f120795A = ((TextView) findViewById(C14948h.f130464w));

    public SDKToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C14949i.f130472e, this);
        f120794B = (Button) findViewById(C14948h.f130443b);
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (context.getTheme().resolveAttribute(C14946f.f130435b, typedValue, true)) {
            setBackgroundColor(typedValue.data);
        }
        if (context.getTheme().resolveAttribute(C14946f.f130434a, typedValue2, true)) {
            setActionBarHeight(typedValue2.data);
            LinearLayout linearLayout = (LinearLayout) findViewById(C14948h.f130463v);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = TypedValue.complexToDimensionPixelSize(typedValue2.data, getResources().getDisplayMetrics());
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    public static Button getCancelButton() {
        return f120794B;
    }

    public void setActionBarHeight(int i10) {
        this.f120795A.setHeight(TypedValue.complexToDimensionPixelSize(i10, getResources().getDisplayMetrics()));
    }

    public void setCancelButtonText(String str) {
        f120794B.setText(str);
    }

    public void setCancelButtonTextColor(int i10) {
        f120794B.setTextColor(i10);
    }

    public void setCancelButtonTextTypeface(Typeface typeface) {
        f120794B.setTypeface(typeface);
    }

    public void setTitle(String str) {
        this.f120795A.setText(str);
    }

    public void setTitleFontSize(Integer num) {
        this.f120795A.setTextSize((float) num.intValue());
    }

    public void setTitleTextColor(int i10) {
        this.f120795A.setTextColor(i10);
    }

    public void setTitleTypeface(Typeface typeface) {
        this.f120795A.setTypeface(typeface);
    }
}
