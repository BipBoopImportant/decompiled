package com.google.android.material.internal;

import I2.C4597a;
import I2.C4600b0;
import J2.t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import i.C5421a;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f66822g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f66823d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f66824e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f66825f;

    class a extends C4597a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.g0(CheckableImageButton.this.a());
            tVar.h0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends O2.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        boolean f66827c;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f66827c = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f66827c ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23874D);
    }

    public boolean a() {
        return this.f66824e;
    }

    public boolean isChecked() {
        return this.f66823d;
    }

    public int[] onCreateDrawableState(int i10) {
        if (!this.f66823d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f66822g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f66827c);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f66827c = this.f66823d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f66824e != z10) {
            this.f66824e = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f66824e && this.f66823d != z10) {
            this.f66823d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(RecyclerView.n.FLAG_MOVED);
        }
    }

    public void setPressable(boolean z10) {
        this.f66825f = z10;
    }

    public void setPressed(boolean z10) {
        if (this.f66825f) {
            super.setPressed(z10);
        }
    }

    public void toggle() {
        setChecked(!this.f66823d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66824e = true;
        this.f66825f = true;
        C4600b0.p0(this, new a());
    }
}
