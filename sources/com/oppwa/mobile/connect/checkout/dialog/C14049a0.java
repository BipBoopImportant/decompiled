package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.Card;
import com.oppwa.mobile.connect.payment.token.Token;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0  reason: case insensitive filesystem */
class C14049a0 extends RecyclerView.h<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f121117a;

    /* renamed from: b  reason: collision with root package name */
    private final Token[] f121118b;

    /* renamed from: c  reason: collision with root package name */
    private final int f121119c;

    /* renamed from: d  reason: collision with root package name */
    private b f121120d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f121121e = false;

    /* renamed from: f  reason: collision with root package name */
    private int f121122f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f121123g = 0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f121124a;

        a(c cVar) {
            this.f121124a = cVar;
        }

        public void onGlobalLayout() {
            this.f121124a.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C14049a0.this.a(this.f121124a.itemView);
            C14049a0.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0$b */
    interface b {
        void a(Token token);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.a0$c */
    class c extends RecyclerView.G {

        /* renamed from: a  reason: collision with root package name */
        ImageView f121126a;

        /* renamed from: b  reason: collision with root package name */
        TextView f121127b;

        /* renamed from: c  reason: collision with root package name */
        ProgressBar f121128c;

        c(View view) {
            super(view);
            this.f121126a = (ImageView) view.findViewById(R.id.payment_token_image);
            this.f121127b = (TextView) view.findViewById(R.id.payment_token_title);
            this.f121128c = (ProgressBar) view.findViewById(R.id.loading_panel);
            int unused = C14049a0.this.f121123g = this.f121127b.getCurrentTextColor();
        }
    }

    C14049a0(Context context, Token[] tokenArr, int i10) {
        this.f121117a = context;
        this.f121118b = tokenArr;
        this.f121119c = i10;
    }

    private boolean b(Token token) {
        Card card = token.getCard();
        return card != null && CardPaymentParams.isCardExpired(card.getExpiryMonth(), card.getExpiryYear());
    }

    public int getItemCount() {
        return this.f121118b.length;
    }

    /* renamed from: a */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        c cVar = new c(LayoutInflater.from(this.f121117a).inflate(R.layout.opp_item_payment_token, viewGroup, false));
        if (!this.f121121e) {
            ViewTreeObserver viewTreeObserver = cVar.itemView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                this.f121121e = true;
                viewTreeObserver.addOnGlobalLayoutListener(new a(cVar));
            }
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    public void a(View view) {
        this.f121122f = (int) (((double) view.getWidth()) * ((((double) this.f121119c) / (((double) (this.f121119c / view.getWidth())) - 0.5d)) / ((double) view.getWidth())));
    }

    /* renamed from: a */
    public void onBindViewHolder(c cVar, int i10) {
        Token token = this.f121118b[i10];
        String a10 = a(token);
        String format = String.format(this.f121117a.getString(R.string.checkout_layout_text_pay_with_stored_payment_method), new Object[]{C14069g.b(this.f121117a, token.getPaymentBrand())});
        Bitmap image = ImageLoader.getInstance(this.f121117a).getImage(token.getPaymentBrand());
        if (image != null) {
            cVar.f121126a.setImageBitmap(image);
            cVar.f121128c.setVisibility(8);
        }
        cVar.f121127b.setText(a10);
        cVar.itemView.setContentDescription(format);
        if (b(token)) {
            cVar.f121127b.setTextColor(this.f121117a.getResources().getColor(R.color.error_color));
        } else {
            cVar.f121127b.setTextColor(this.f121123g);
        }
        cVar.itemView.setOnClickListener(new j2(this, token));
        if (this.f121122f != 0) {
            RecyclerView.r rVar = (RecyclerView.r) cVar.itemView.getLayoutParams();
            rVar.width = this.f121122f;
            cVar.itemView.setLayoutParams(rVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Token token, View view) {
        b bVar = this.f121120d;
        if (bVar != null) {
            bVar.a(token);
        }
    }

    private String a(Token token) {
        if (CheckoutConstants.PaymentBrands.DIRECTDEBIT_SEPA.equals(token.getPaymentBrand())) {
            return Utils.maskIban(token.getBankAccount().getIban());
        }
        if (CheckoutConstants.PaymentBrands.PAYPAL.equals(token.getPaymentBrand())) {
            return a(token.getVirtualAccount().getAccountId());
        }
        Card card = token.getCard();
        return Utils.maskCardNumber(card.getLast4Digits()) + " " + Utils.getFormattedCardExpirationDate(card);
    }

    private String a(String str) {
        try {
            String[] split = str.split("@");
            return split[0].charAt(0) + "***@" + split[1];
        } catch (Exception unused) {
            return str;
        }
    }

    public void a(b bVar) {
        this.f121120d = bVar;
    }
}
