package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.C14049a0;
import com.oppwa.mobile.connect.checkout.dialog.ImageLoader;
import com.oppwa.mobile.connect.checkout.meta.CheckoutCardBrandsDisplayMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.ArrayList;

public class PaymentMethodSelectionFragment extends BaseFragment implements ImageLoader.Listener {

    /* renamed from: d  reason: collision with root package name */
    private Token[] f121064d;

    /* renamed from: e  reason: collision with root package name */
    private String[] f121065e;

    /* renamed from: f  reason: collision with root package name */
    private String[] f121066f;

    /* renamed from: g  reason: collision with root package name */
    private String[] f121067g;

    /* renamed from: h  reason: collision with root package name */
    private CheckoutInfo f121068h;

    /* renamed from: i  reason: collision with root package name */
    private CheckoutSettings f121069i;

    /* renamed from: j  reason: collision with root package name */
    private BrandsValidation f121070j;

    /* renamed from: k  reason: collision with root package name */
    private C14116w f121071k;

    /* renamed from: l  reason: collision with root package name */
    private GroupedCardsAdapter f121072l;

    /* renamed from: m  reason: collision with root package name */
    private C14049a0 f121073m;

    /* renamed from: n  reason: collision with root package name */
    protected CheckoutViewModel f121074n;

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        a(str, (Token) null);
    }

    private void c(View view) {
        TextView textView = (TextView) view.findViewById(R.id.payment_cards_brand_section_title);
        textView.setVisibility(0);
        textView.setText(textView.getText().toString().toUpperCase());
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.payment_cards_brands_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f121072l = new GroupedCardsAdapter(getContext(), this.f121066f);
        linearLayoutManager.a3(1);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f121072l);
        this.f121072l.setListener(new f2(this));
    }

    private void d(View view) {
        if (this.f121066f.length > 0) {
            c(view);
        }
        if (this.f121067g.length > 0) {
            e(view);
        }
    }

    private void e(View view) {
        a(view, this.f121067g);
    }

    private void f(View view) {
        a(view, this.f121065e);
    }

    private void g(View view) {
        Token[] tokenArr = this.f121064d;
        if (tokenArr != null && tokenArr.length > 0) {
            TextView textView = (TextView) view.findViewById(R.id.payment_tokens_section_title);
            textView.setVisibility(0);
            textView.setText(textView.getText().toString().toUpperCase());
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.payment_tokens_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f121073m = new C14049a0(getContext(), this.f121064d, Utils.getScreenWidth(getActivity()));
        linearLayoutManager.a3(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f121073m);
        this.f121073m.a((C14049a0.b) new h2(this));
    }

    private void h(View view) {
        view.findViewById(R.id.total_amount_view).setVisibility(0);
        ((TextView) view.findViewById(R.id.total_amount_header)).setText(getString(R.string.checkout_layout_text_total_amount));
        ((TextView) view.findViewById(R.id.total_amount_value)).setText(Utils.getFormattedAmount(this.f121068h.getAmount(), this.f121068h.getCurrencyCode()));
    }

    public static PaymentMethodSelectionFragment newInstance(C14122y yVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PAYMENT_METHODS", yVar);
        PaymentMethodSelectionFragment paymentMethodSelectionFragment = new PaymentMethodSelectionFragment();
        paymentMethodSelectionFragment.setArguments(bundle);
        return paymentMethodSelectionFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f121074n = (CheckoutViewModel) new i0((k0) requireActivity()).a(CheckoutViewModel.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C14122y yVar;
        this.f121069i = this.f121074n.requireCheckoutSettings();
        this.f121068h = this.f121074n.requireCheckoutInfo();
        this.f121070j = this.f121074n.requireBrandsValidation();
        Bundle arguments = getArguments();
        if (!(arguments == null || (yVar = (C14122y) arguments.getParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PAYMENT_METHODS")) == null)) {
            this.f121064d = yVar.d();
            this.f121065e = yVar.c();
            b();
        }
        return layoutInflater.inflate(R.layout.opp_fragment_payment_method_selection, viewGroup, false);
    }

    public void onImageLoaded(String str) {
        if (this.f121073m != null) {
            int i10 = 0;
            for (Token paymentBrand : this.f121064d) {
                if (paymentBrand.getPaymentBrand().equals(str)) {
                    this.f121073m.notifyItemChanged(i10);
                }
                i10++;
            }
        }
        if (this.f121071k != null) {
            int i11 = 0;
            for (String equalsIgnoreCase : c() ? this.f121067g : this.f121065e) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    this.f121071k.notifyItemChanged(i11);
                }
                i11++;
            }
        }
        if (this.f121072l != null) {
            int i12 = 0;
            for (String equals : this.f121066f) {
                if (equals.equals(str)) {
                    if (this.f121072l.a() != null) {
                        this.f121072l.a().notifyItemChanged(i12);
                    }
                    this.f121072l.notifyItemChanged(0);
                }
                i12++;
            }
        }
    }

    public void onPause() {
        super.onPause();
        ImageLoader.getInstance(requireContext()).removeListener(this);
    }

    public void onResume() {
        super.onResume();
        ImageLoader.getInstance(requireContext()).addListener(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C14066f V10;
        super.onViewCreated(view, bundle);
        this.f120828a.setText(R.string.checkout_layout_text_select_payment_method);
        if (this.f121064d != null) {
            g(view);
        }
        if (this.f121065e != null) {
            if (c()) {
                d(view);
            } else {
                f(view);
            }
        }
        if (this.f121069i.isTotalAmountRequired() && this.f121068h != null) {
            h(view);
        }
        C5191t activity = getActivity();
        if (activity != null && (activity instanceof CheckoutActivity) && !Utils.isScreenOrientationLandscape(getActivity()) && (V10 = ((CheckoutActivity) getActivity()).V()) != null) {
            view.post(new g2(this, view, V10));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Token token) {
        a(token.getPaymentBrand(), token);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.f121065e) {
            if (this.f121070j.isCardBrand(str)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        this.f121066f = (String[]) arrayList.toArray(new String[0]);
        this.f121067g = (String[]) arrayList2.toArray(new String[0]);
    }

    private void a(View view, String[] strArr) {
        Token[] tokenArr = this.f121064d;
        boolean z10 = tokenArr != null && tokenArr.length > 0;
        boolean z11 = this.f121066f.length > 0 && c();
        if (z10 || z11) {
            TextView textView = (TextView) view.findViewById(R.id.payment_brand_section_title);
            textView.setVisibility(0);
            textView.setText(textView.getText().toString().toUpperCase());
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.payment_brands_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f121071k = new C14116w(getContext(), strArr, this.f121070j.getLabels());
        linearLayoutManager.a3(1);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f121071k);
        this.f121071k.a(new e2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(View view, C14066f fVar) {
        int c10 = fVar.c();
        int b10 = b(view.findViewById(R.id.payment_method_selection_layout));
        if (b10 > 0) {
            a(fVar, c10, b10);
        }
    }

    private boolean c() {
        return this.f121069i.getCardBrandsDisplayMode() == CheckoutCardBrandsDisplayMode.GROUPED;
    }

    private int b(View view) {
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        a(str, (Token) null);
    }

    protected static void a(C14066f fVar, int i10, int i11) {
        if (i10 > i11) {
            int i12 = i10 - (i10 - i11);
            if (i12 < fVar.d()) {
                i12 = fVar.d();
            }
            fVar.a(i10, i12);
        } else if (i10 < i11) {
            fVar.a(i11, i10);
        }
    }

    private void a(String str, Token token) {
        Bundle bundle = new Bundle();
        bundle.putString("PAYMENT_METHOD_RESULT_KEY", str);
        bundle.putParcelable("TOKEN_RESULT_KEY", token);
        getParentFragmentManager().Q1(PaymentMethodSelectionFragment.class.getName(), bundle);
    }
}
