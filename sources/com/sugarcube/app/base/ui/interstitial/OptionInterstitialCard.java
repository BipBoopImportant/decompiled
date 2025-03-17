package com.sugarcube.app.base.ui.interstitial;

import GF.C12954i;
import GF.C12955j;
import GF.C12956k;
import HJ.C15854t;
import JF.C13092N;
import OE.C13318j;
import OE.n;
import OE.o;
import QE.h0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "", "list", "LXH/N;", "setBulletedListText", "(Ljava/util/List;)V", "Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard$OnClickListener;", "listener", "setListener", "(Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard$OnClickListener;)V", "j", "Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard$OnClickListener;", "interactionListener", "LQE/h0;", "k", "LQE/h0;", "binding", "OnClickListener", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OptionInterstitialCard extends CardView {

    /* renamed from: j  reason: collision with root package name */
    private OnClickListener f125154j;

    /* renamed from: k  reason: collision with root package name */
    private h0 f125155k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/interstitial/OptionInterstitialCard$OnClickListener;", "", "LXH/N;", "onClicked", "()V", "onGetStartedClicked", "onGetLinkClicked", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnClickListener {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public static void a(OnClickListener onClickListener) {
            }

            public static void b(OnClickListener onClickListener) {
            }

            public static void c(OnClickListener onClickListener) {
            }
        }

        void onClicked();

        void onGetLinkClicked();

        void onGetStartedClicked();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OptionInterstitialCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "context");
        View.inflate(context, C13318j.f113136c0, this);
        h0 a10 = h0.a(getRootView());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f113507e);
        C17542s.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        a10.f114594h.setImageDrawable(obtainStyledAttributes.getDrawable(o.f113510h));
        a10.f114595i.setText(obtainStyledAttributes.getString(o.f113512j));
        a10.f114592f.setText(obtainStyledAttributes.getString(o.f113509g));
        String string = obtainStyledAttributes.getString(o.f113508f);
        if (string != null) {
            TextView textView = a10.f114591e;
            int i10 = 8;
            a10.f114593g.setVisibility(8);
            textView.setVisibility(0);
            textView.setSingleLine(false);
            textView.setText(C13092N.a(C15854t.Y0(string, new String[]{"\n"}, false, 0, 6, (Object) null)));
            boolean z10 = obtainStyledAttributes.getBoolean(o.f113511i, false);
            MaterialButton materialButton = a10.f114589c;
            materialButton.setVisibility(z10 ? 8 : 0);
            materialButton.setOnClickListener(new C12954i(this));
            MaterialButton materialButton2 = a10.f114588b;
            materialButton2.setVisibility(z10 ? 0 : i10);
            materialButton2.setOnClickListener(new C12955j(this, materialButton2));
        }
        a10.getRoot().setCardElevation(0.0f);
        a10.getRoot().setOnClickListener(new C12956k(this));
        obtainStyledAttributes.recycle();
        this.f125155k = a10;
    }

    /* access modifiers changed from: private */
    public static final void h(OptionInterstitialCard optionInterstitialCard, View view) {
        OnClickListener onClickListener = optionInterstitialCard.f125154j;
        if (onClickListener != null) {
            onClickListener.onGetStartedClicked();
        }
    }

    /* access modifiers changed from: private */
    public static final void i(OptionInterstitialCard optionInterstitialCard, MaterialButton materialButton, View view) {
        OnClickListener onClickListener = optionInterstitialCard.f125154j;
        if (onClickListener != null) {
            onClickListener.onGetLinkClicked();
        }
        materialButton.setText(materialButton.getResources().getString(n.f113185D));
    }

    /* access modifiers changed from: private */
    public static final void j(OptionInterstitialCard optionInterstitialCard, View view) {
        OnClickListener onClickListener = optionInterstitialCard.f125154j;
        if (onClickListener != null) {
            onClickListener.onClicked();
        }
    }

    public final void setBulletedListText(List<String> list) {
        TextView textView;
        C17542s.j(list, "list");
        h0 h0Var = this.f125155k;
        if (!(h0Var == null || (textView = h0Var.f114591e) == null)) {
            textView.setText(C13092N.a(list));
        }
        invalidate();
    }

    public final void setListener(OnClickListener onClickListener) {
        C17542s.j(onClickListener, "listener");
        this.f125154j = onClickListener;
    }
}
