package com.ingka.ikea.core.android.view;

import Uo.a;
import Zo.b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/core/android/view/IkeaToolBar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LXH/N;", "onAttachedToWindow", "()V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/widget/TextView;", "U", "Landroid/widget/TextView;", "titleTextView", "", "y0", "Ljava/lang/String;", "titleString", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IkeaToolBar extends Toolbar {

    /* renamed from: U  reason: collision with root package name */
    private TextView f94900U;

    /* renamed from: y0  reason: collision with root package name */
    private String f94901y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IkeaToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.g(context);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f94900U = (TextView) findViewById(a.f88328i);
        setTitle(this.f94901y0);
    }

    public void setTitle(CharSequence charSequence) {
        String str;
        String str2;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        this.f94901y0 = str;
        TextView textView = this.f94900U;
        if (textView != null) {
            textView.setText(str);
            String str3 = this.f94901y0;
            if (str3 != null) {
                str2 = str3.toLowerCase(b.f90092a.d());
                C17542s.i(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            textView.setContentDescription(str2);
        }
    }
}
