package com.google.android.material.timepicker;

import Ea.C9072f;
import Ea.C9074h;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private final Chip f67605A;

    /* renamed from: B  reason: collision with root package name */
    private final ClockHandView f67606B;

    /* renamed from: C  reason: collision with root package name */
    private final ClockFaceView f67607C;

    /* renamed from: D  reason: collision with root package name */
    private final MaterialButtonToggleGroup f67608D;

    /* renamed from: E  reason: collision with root package name */
    private final View.OnClickListener f67609E;

    /* renamed from: z  reason: collision with root package name */
    private final Chip f67610z;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            e unused = TimePickerView.this.getClass();
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            d unused = TimePickerView.this.getClass();
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GestureDetector f67613a;

        c(GestureDetector gestureDetector) {
            this.f67613a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f67613a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
    }

    private void H() {
        this.f67610z.setTag(C9072f.f59470M, 12);
        this.f67605A.setTag(C9072f.f59470M, 10);
        this.f67610z.setOnClickListener(this.f67609E);
        this.f67605A.setOnClickListener(this.f67609E);
        this.f67610z.setAccessibilityClassName("android.view.View");
        this.f67605A.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f67610z.setOnTouchListener(cVar);
        this.f67605A.setOnTouchListener(cVar);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f67605A.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f67609E = new a();
        LayoutInflater.from(context).inflate(C9074h.f59535s, this);
        this.f67607C = (ClockFaceView) findViewById(C9072f.f59493k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C9072f.f59496n);
        this.f67608D = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new e(this));
        this.f67610z = (Chip) findViewById(C9072f.f59499q);
        this.f67605A = (Chip) findViewById(C9072f.f59497o);
        this.f67606B = (ClockHandView) findViewById(C9072f.f59494l);
        I();
        H();
    }
}
