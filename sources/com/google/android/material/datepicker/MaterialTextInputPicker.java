package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class MaterialTextInputPicker<S> extends u<S> {

    /* renamed from: E  reason: collision with root package name */
    private int f66581E;

    /* renamed from: F  reason: collision with root package name */
    private i<S> f66582F;

    /* renamed from: G  reason: collision with root package name */
    private a f66583G;

    class a extends t<S> {
        a() {
        }

        public void a() {
            Iterator<t<S>> it = MaterialTextInputPicker.this.f66658D.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public void b(S s10) {
            Iterator<t<S>> it = MaterialTextInputPicker.this.f66658D.iterator();
            while (it.hasNext()) {
                it.next().b(s10);
            }
        }
    }

    static <T> MaterialTextInputPicker<T> n0(i<T> iVar, int i10, a aVar) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", iVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f66581E = bundle.getInt("THEME_RES_ID_KEY");
        this.f66582F = (i) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f66583G = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f66582F.t2(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f66581E)), viewGroup, bundle, this.f66583G, new a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f66581E);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f66582F);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f66583G);
    }
}
