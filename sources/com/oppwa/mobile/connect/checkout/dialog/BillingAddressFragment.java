package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.activity.v;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;
import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.utils.FeatureSwitch;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class BillingAddressFragment extends BaseFragment implements AdapterView.OnItemSelectedListener {
    public static final String BILLING_ADDRESS_KEY = "BILLING_ADDRESS_KEY";

    /* renamed from: d  reason: collision with root package name */
    private final Set<InputLayout> f120837d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private BillingAddress f120838e;

    /* renamed from: f  reason: collision with root package name */
    private AppCompatSpinner f120839f;

    /* renamed from: g  reason: collision with root package name */
    private CheckoutTextView f120840g;

    /* renamed from: h  reason: collision with root package name */
    private AppCompatSpinner f120841h;

    /* renamed from: i  reason: collision with root package name */
    private CheckoutTextView f120842i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayAdapter<String> f120843j;

    /* renamed from: k  reason: collision with root package name */
    private InputLayout f120844k;

    /* renamed from: l  reason: collision with root package name */
    private InputLayout f120845l;

    /* renamed from: m  reason: collision with root package name */
    private InputLayout f120846m;

    /* renamed from: n  reason: collision with root package name */
    private InputLayout f120847n;

    /* renamed from: o  reason: collision with root package name */
    private InputLayout f120848o;

    /* renamed from: p  reason: collision with root package name */
    private v f120849p;

    /* renamed from: q  reason: collision with root package name */
    private LinkedList<String> f120850q;

    /* renamed from: r  reason: collision with root package name */
    private LinkedList<String> f120851r;

    class a extends v {
        a(boolean z10) {
            super(z10);
        }

        public void handleOnBackPressed() {
            BillingAddressFragment.this.h();
        }
    }

    class b extends ArrayAdapter<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f120853a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f120854b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, int i10, List list, String str, List list2) {
            super(context, i10, list);
            this.f120853a = str;
            this.f120854b = list2;
        }

        /* renamed from: a */
        public String getItem(int i10) {
            return i10 == 0 ? this.f120853a : (String) this.f120854b.get(i10);
        }
    }

    public BillingAddressFragment() {
        super(R.layout.opp_fragment_billing_address);
    }

    private void b(View view) {
        InputLayout inputLayout = (InputLayout) view.findViewById(R.id.city_input_layout);
        this.f120845l = inputLayout;
        a(inputLayout, this.f120838e.getCity(), this.f120838e.isCityRequired(), R.string.checkout_billing_address_city_hint, R.string.checkout_billing_address_city_required_error);
    }

    private void c(View view) {
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) view.findViewById(R.id.country_spinner);
        this.f120839f = appCompatSpinner;
        appCompatSpinner.setOnItemSelectedListener(this);
        LinkedList linkedList = new LinkedList(C14072h.b().values());
        linkedList.addFirst("NOT_SELECTED");
        ArrayAdapter<String> a10 = a(linkedList, R.string.checkout_billing_address_country_spinner_hint, this.f120838e.isCountryRequired());
        this.f120839f.setAdapter((SpinnerAdapter) a10);
        this.f120839f.setSelection(a(a10, C14072h.b().get(this.f120838e.getCountry())), false);
        this.f120840g = (CheckoutTextView) view.findViewById(R.id.country_spinner_helper_text_view);
    }

    private void d(View view) {
        InputLayout inputLayout = (InputLayout) view.findViewById(R.id.post_code_input_layout);
        this.f120846m = inputLayout;
        a(inputLayout, this.f120838e.getPostCode(), this.f120838e.isPostCodeRequired(), R.string.checkout_billing_address_post_code_hint, R.string.checkout_billing_address_post_code_required_error);
    }

    private void e(View view) {
        InputLayout inputLayout = (InputLayout) view.findViewById(R.id.state_input_layout);
        this.f120844k = inputLayout;
        a(inputLayout, this.f120838e.getState(), this.f120838e.isStateRequired(), R.string.checkout_billing_address_state_hint, R.string.checkout_billing_address_state_required_error);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) view.findViewById(R.id.state_spinner);
        this.f120841h = appCompatSpinner;
        appCompatSpinner.setOnItemSelectedListener(this);
        this.f120842i = (CheckoutTextView) view.findViewById(R.id.state_spinner_helper_text_view);
    }

    private void f(View view) {
        InputLayout inputLayout = (InputLayout) view.findViewById(R.id.street1_input_layout);
        this.f120847n = inputLayout;
        a(inputLayout, this.f120838e.getStreet1(), this.f120838e.isStreet1Required(), R.string.checkout_billing_address_street1_hint, R.string.checkout_billing_address_street_required_error);
    }

    private void g(View view) {
        InputLayout inputLayout = (InputLayout) view.findViewById(R.id.street2_input_layout);
        this.f120848o = inputLayout;
        a(inputLayout, this.f120838e.getStreet2(), this.f120838e.isStreet2Required(), R.string.checkout_billing_address_street2_hint, R.string.checkout_billing_address_street_required_error);
    }

    /* access modifiers changed from: private */
    public void h() {
        if (g()) {
            this.f120849p.setEnabled(false);
            if (FeatureSwitch.isActivated(FeatureSwitch.DEFAULT_UI_COMPONENTS)) {
                Optional.ofNullable(getParentFragment()).ifPresent(new J0(this));
                return;
            }
            getParentFragmentManager().Q1(BillingAddressFragment.class.getName(), c());
            requireActivity().onBackPressed();
        }
    }

    private void i() {
        String e10 = e();
        this.f120840g.setVisibility(4);
        if ("CA".equals(e10)) {
            a((List<String>) new LinkedList(d()), C14072h.a().get(this.f120838e.getState()));
        } else if (CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY.equals(e10)) {
            a((List<String>) new LinkedList(f()), C14072h.c().get(this.f120838e.getState()));
        } else {
            if (!TextUtils.equals(e10, this.f120838e.getCountry()) || !this.f120844k.getText().equals(this.f120838e.getState())) {
                this.f120844k.getEditText().setText("");
            }
            this.f120841h.setVisibility(8);
            this.f120842i.setVisibility(8);
            this.f120844k.setVisibility(0);
        }
    }

    private void j() {
        this.f120842i.setVisibility(4);
        this.f120844k.clearError();
        this.f120844k.getEditText().setText(this.f120841h.getSelectedItem().toString());
    }

    private void k() {
        this.f120844k.setVisibility(8);
        this.f120841h.setVisibility(0);
        this.f120842i.setVisibility(4);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f120849p = new a(true);
        requireActivity().getOnBackPressedDispatcher().i(this, this.f120849p);
    }

    public void onDetach() {
        super.onDetach();
        this.f120849p.remove();
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        if (adapterView == this.f120839f) {
            i();
        }
        if (adapterView == this.f120841h) {
            j();
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120838e = (BillingAddress) requireArguments().getParcelable(BILLING_ADDRESS_KEY);
        this.f120828a.setText(R.string.checkout_billing_address_title);
        this.f120829b.setVisibility(0);
        this.f120829b.setOnClickListener(new K0(this));
        c(view);
        e(view);
        b(view);
        d(view);
        f(view);
        g(view);
        b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        h();
    }

    private int a(ArrayAdapter<String> arrayAdapter, String str) {
        if (arrayAdapter.getPosition(str) == -1) {
            return 0;
        }
        return arrayAdapter.getPosition(str);
    }

    private ArrayAdapter<String> a(List<String> list, int i10, boolean z10) {
        String format;
        if (z10) {
            format = getString(i10);
        } else {
            format = String.format(getString(R.string.checkout_billing_address_optional), new Object[]{getString(i10)});
        }
        return new b(getActivity(), R.layout.opp_item_countries_states, list, format, list);
    }

    private void b() {
        this.f120844k.getEditText().setInputType(528384);
        this.f120844k.getEditText().setImeOptions(5);
        this.f120845l.getEditText().setInputType(528384);
        this.f120845l.getEditText().setImeOptions(5);
        this.f120846m.getEditText().setInputType(2);
        this.f120846m.getEditText().setImeOptions(5);
        this.f120847n.getEditText().setInputType(528384);
        this.f120847n.getEditText().setImeOptions(5);
        this.f120848o.getEditText().setInputType(528384);
        this.f120848o.getEditText().setImeOptions(6);
    }

    private List<String> d() {
        if (this.f120851r == null) {
            LinkedList<String> linkedList = new LinkedList<>(C14072h.a().values());
            this.f120851r = linkedList;
            linkedList.addFirst("NOT_SELECTED");
        }
        return this.f120851r;
    }

    private List<String> f() {
        if (this.f120850q == null) {
            LinkedList<String> linkedList = new LinkedList<>(C14072h.c().values());
            this.f120850q = linkedList;
            linkedList.addFirst("NOT_SELECTED");
        }
        return this.f120850q;
    }

    private boolean g() {
        boolean z10;
        if (!this.f120838e.isCountryRequired() || this.f120839f.getSelectedItemPosition() != 0) {
            z10 = true;
        } else {
            this.f120840g.setVisibility(0);
            z10 = false;
        }
        if (this.f120841h.getVisibility() == 0 && this.f120838e.isStateRequired() && this.f120841h.getSelectedItemPosition() == 0) {
            this.f120842i.setVisibility(0);
            z10 = false;
        }
        for (InputLayout validate : this.f120837d) {
            if (!validate.validate()) {
                z10 = false;
            }
        }
        return z10;
    }

    private String e() {
        return a(C14072h.b(), this.f120839f.getSelectedItem().toString());
    }

    private void a(InputLayout inputLayout, String str, boolean z10, int i10, int i11) {
        String string = getString(i10);
        if (!z10) {
            string = String.format(getString(R.string.checkout_billing_address_optional), new Object[]{string});
            inputLayout.setOptional(true);
        }
        inputLayout.setHint(string);
        inputLayout.setText(str);
        inputLayout.setInputValidator(C14099q.c(i11));
        this.f120837d.add(inputLayout);
    }

    private String b(String str) {
        if (CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY.equals(str)) {
            return a(C14072h.c(), this.f120841h.getSelectedItem().toString());
        }
        if ("CA".equals(str)) {
            return a(C14072h.a(), this.f120841h.getSelectedItem().toString());
        }
        return null;
    }

    private Bundle c() {
        String e10 = e();
        String a10 = a(e10);
        String text = this.f120845l.getText();
        String text2 = this.f120846m.getText();
        String text3 = this.f120847n.getText();
        String text4 = this.f120848o.getText();
        BillingAddress.Builder country = new BillingAddress.Builder().setCountry(e10);
        if (TextUtils.isEmpty(a10)) {
            a10 = null;
        }
        BillingAddress.Builder state = country.setState(a10);
        if (TextUtils.isEmpty(text)) {
            text = null;
        }
        BillingAddress.Builder city = state.setCity(text);
        if (TextUtils.isEmpty(text2)) {
            text2 = null;
        }
        BillingAddress.Builder postCode = city.setPostCode(text2);
        if (TextUtils.isEmpty(text3)) {
            text3 = null;
        }
        BillingAddress.Builder street1 = postCode.setStreet1(text3);
        if (TextUtils.isEmpty(text4)) {
            text4 = null;
        }
        BillingAddress build = street1.setStreet2(text4).setCountryRequired(Boolean.valueOf(this.f120838e.isCountryRequired())).setStateRequired(Boolean.valueOf(this.f120838e.isStateRequired())).setCityRequired(Boolean.valueOf(this.f120838e.isCityRequired())).setPostCodeRequired(Boolean.valueOf(this.f120838e.isPostCodeRequired())).setStreet1Required(Boolean.valueOf(this.f120838e.isStreet1Required())).setStreet2Required(Boolean.valueOf(this.f120838e.isStreet2Required())).build();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BILLING_ADDRESS_KEY, build);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(C5187o oVar) {
        FragmentManager childFragmentManager = oVar.getChildFragmentManager();
        childFragmentManager.Q1(BillingAddressFragment.class.getName(), c());
        childFragmentManager.p1();
    }

    private String a(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (TextUtils.equals((CharSequence) next.getValue(), str)) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    private String a(String str) {
        if (this.f120844k.getVisibility() == 0) {
            return this.f120844k.getText();
        }
        return b(str);
    }

    private void a(List<String> list, String str) {
        ArrayAdapter<String> arrayAdapter = this.f120843j;
        if (arrayAdapter == null) {
            ArrayAdapter<String> a10 = a(list, R.string.checkout_billing_address_state_spinner_hint, this.f120838e.isStateRequired());
            this.f120843j = a10;
            this.f120841h.setAdapter((SpinnerAdapter) a10);
        } else {
            arrayAdapter.clear();
            this.f120843j.addAll(list);
            this.f120843j.notifyDataSetChanged();
        }
        this.f120841h.setSelection(a(this.f120843j, str), false);
        k();
    }
}
