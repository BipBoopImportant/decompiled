package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14063e;

public class CardBrandSelectionLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f120868a;

    /* renamed from: b  reason: collision with root package name */
    private Listener f120869b;

    /* renamed from: c  reason: collision with root package name */
    private String[] f120870c;

    /* renamed from: d  reason: collision with root package name */
    private C14063e f120871d;

    /* renamed from: e  reason: collision with root package name */
    private String f120872e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f120873f;

    public interface Listener {
        void onCardBrandSelected(String str);
    }

    private static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f120874a;

        /* renamed from: b  reason: collision with root package name */
        String[] f120875b;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: a */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f120874a);
            parcel.writeStringArray(this.f120875b);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f120874a = parcel.readString();
            this.f120875b = parcel.createStringArray();
        }
    }

    public CardBrandSelectionLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public String[] getCardBrands() {
        return this.f120870c;
    }

    public void hide() {
        hide(true);
    }

    public boolean isVisible() {
        return this.f120873f;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        String str = bVar.f120874a;
        this.f120872e = str;
        String[] strArr = bVar.f120875b;
        this.f120870c = strArr;
        if (strArr != null) {
            setCardBrands(strArr, str);
            Listener listener = this.f120869b;
            if (listener != null) {
                listener.onCardBrandSelected(this.f120872e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f120874a = this.f120872e;
        bVar.f120875b = this.f120870c;
        return bVar;
    }

    public void setCardBrands(String[] strArr, String str) {
        this.f120872e = str;
        C14063e eVar = (C14063e) this.f120868a.getAdapter();
        this.f120871d = eVar;
        if (eVar == null) {
            C14063e a10 = a(strArr);
            this.f120871d = a10;
            this.f120868a.setAdapter(a10);
        } else {
            eVar.a(strArr);
        }
        this.f120871d.a(str);
        this.f120871d.notifyDataSetChanged();
        this.f120870c = strArr;
    }

    public void setListener(Listener listener) {
        this.f120869b = listener;
    }

    public void setSelectedBrand(String str) {
        this.f120872e = str;
        this.f120871d.a(str);
    }

    public void show() {
        String[] strArr;
        if (!this.f120873f && (strArr = this.f120870c) != null && strArr.length != 0) {
            if (strArr.length != 1 || !TextUtils.equals(strArr[0], this.f120872e)) {
                setVisibility(4);
                C14052b.a((ViewGroup) this, getHeight(), (int) getResources().getDimension(R.dimen.card_brand_selection_layout_height));
                this.f120873f = true;
                new Handler(Looper.getMainLooper()).postDelayed(new Y0(this), 200);
            }
        }
    }

    public void updateCardBrands(String str) {
        if (this.f120871d != null) {
            int i10 = 0;
            for (String equals : this.f120870c) {
                if (equals.equals(str)) {
                    this.f120871d.notifyItemChanged(i10);
                }
                i10++;
            }
        }
    }

    public CardBrandSelectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f120873f = false;
        LayoutInflater.from(context).inflate(R.layout.opp_layout_card_brand_selection, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_brands_recycler_view);
        this.f120868a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (this.f120868a.getAdapter() != null) {
            setVisibility(0);
            C14052b.b(getContext(), this);
            this.f120868a.getAdapter().notifyDataSetChanged();
        }
    }

    public void hide(boolean z10) {
        int height = getHeight();
        if (!this.f120873f || height == 0) {
            this.f120873f = false;
            return;
        }
        this.f120873f = false;
        if (z10) {
            C14052b.a(getContext(), (View) this);
            new Handler(Looper.getMainLooper()).postDelayed(new Z0(this, height), 200);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = 0;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        setVisibility(4);
        C14052b.a((ViewGroup) this, i10, 0);
    }

    public CardBrandSelectionLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet);
    }

    public CardBrandSelectionLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet);
    }

    private C14063e a(String[] strArr) {
        C14063e eVar = new C14063e(getContext(), strArr);
        eVar.a((C14063e.a) new C14050a1(this));
        return eVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f120872e = str;
        Listener listener = this.f120869b;
        if (listener != null) {
            listener.onCardBrandSelected(str);
        }
    }
}
