package com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b8.m;
import b8.n;
import b8.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138F@FX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00198F@FX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/settings/components/ContentsquareTextPreference;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "getTitle", "()I", "setTitle", "(I)V", "title", "getSummary", "setSummary", "summary", "", "getSummaryText", "()Ljava/lang/CharSequence;", "setSummaryText", "(Ljava/lang/CharSequence;)V", "summaryText", "", "isSummaryVisible", "()Z", "setSummaryVisible", "(Z)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class ContentsquareTextPreference extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public final TextView f46671A;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f46672z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentsquareTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    public final int getSummary() {
        return 0;
    }

    public final CharSequence getSummaryText() {
        CharSequence text = this.f46671A.getText();
        C17542s.i(text, "summaryTextView.text");
        return text;
    }

    public final int getTitle() {
        return 0;
    }

    public final void setSummary(int i10) {
        this.f46671A.setText(i10);
    }

    public final void setSummaryText(CharSequence charSequence) {
        C17542s.j(charSequence, "value");
        this.f46671A.setText(charSequence);
    }

    public final void setSummaryVisible(boolean z10) {
        this.f46671A.setVisibility(z10 ? 0 : 8);
    }

    public final void setTitle(int i10) {
        this.f46672z.setText(i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentsquareTextPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        View.inflate(context, n.f45593l, this);
        View findViewById = findViewById(m.f45574s);
        C17542s.i(findViewById, "findViewById(R.id.contentsquare_preference_title)");
        TextView textView = (TextView) findViewById;
        this.f46672z = textView;
        View findViewById2 = findViewById(m.f45572q);
        C17542s.i(findViewById2, "findViewById(R.id.conten…quare_preference_summary)");
        TextView textView2 = (TextView) findViewById2;
        this.f46671A = textView2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f45629i);
        C17542s.i(obtainStyledAttributes, "context.obtainStyledAttr…tentsquareTextPreference)");
        try {
            textView.setText(obtainStyledAttributes.getString(q.f45631k));
            textView2.setText(obtainStyledAttributes.getString(q.f45630j));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentsquareTextPreference(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
