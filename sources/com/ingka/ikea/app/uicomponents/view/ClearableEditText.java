package com.ingka.ikea.app.uicomponents.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import jp.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10027d;
import u2.C6012a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010%\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010*\u001a\u00020\r2\u0006\u0010 \u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/ingka/ikea/app/uicomponents/view/ClearableEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/text/TextWatcher;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "visible", "LXH/N;", "setClearIconVisible", "(Z)V", "Landroid/view/View;", "view", "hasFocus", "onFocusChange", "(Landroid/view/View;Z)V", "Landroid/view/MotionEvent;", "motionEvent", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "listener", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "onTouchListener", "setOnTouchListener", "(Landroid/view/View$OnTouchListener;)V", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Landroid/graphics/drawable/Drawable;", "c", "Landroid/graphics/drawable/Drawable;", "clearTextIcon", "d", "Landroid/view/View$OnFocusChangeListener;", "onFocusChangeListener", "e", "Landroid/view/View$OnTouchListener;", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
public final class ClearableEditText extends AppCompatEditText implements View.OnTouchListener, View.OnFocusChangeListener, TextWatcher {

    /* renamed from: c  reason: collision with root package name */
    private Drawable f92691c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnFocusChangeListener f92692d;

    /* renamed from: e  reason: collision with root package name */
    private View.OnTouchListener f92693e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "context");
        Drawable e10 = C6012a.e(context, C10027d.f75278i);
        this.f92691c = e10;
        if (e10 != null) {
            e10.setBounds(0, 0, e10.getIntrinsicHeight(), e10.getIntrinsicHeight());
            setClearIconVisible(false);
        }
        super.setOnTouchListener(this);
        super.setOnFocusChangeListener(this);
        addTextChangedListener(this);
    }

    private final void setClearIconVisible(boolean z10) {
        Drawable drawable = this.f92691c;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        C17542s.i(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], z10 ? this.f92691c : null, compoundDrawablesRelative[3]);
    }

    public void afterTextChanged(Editable editable) {
        C17542s.j(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C17542s.j(charSequence, "s");
    }

    public void onFocusChange(View view, boolean z10) {
        C17542s.j(view, "view");
        boolean z11 = false;
        if (z10) {
            Editable text = getText();
            if (text == null || text.length() == 0) {
                z11 = true;
            }
            setClearIconVisible(!z11);
            g.c(view);
        } else {
            setClearIconVisible(false);
            g.b(view);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f92692d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z10);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C17542s.j(charSequence, "s");
        if (isFocused()) {
            setClearIconVisible(charSequence.length() > 0);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C17542s.j(view, "view");
        C17542s.j(motionEvent, "motionEvent");
        Drawable drawable = this.f92691c;
        if (drawable != null && drawable.isVisible() && motionEvent.getAction() == 1) {
            Drawable drawable2 = getCompoundDrawablesRelative()[2];
            if ((getLayoutDirection() == 1 && motionEvent.getRawX() <= ((float) drawable2.getBounds().width())) || motionEvent.getRawX() >= ((float) (getRight() - drawable2.getBounds().width()))) {
                setText((CharSequence) null);
                return false;
            }
        }
        View.OnTouchListener onTouchListener = this.f92693e;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        C17542s.j(onFocusChangeListener, "listener");
        this.f92692d = onFocusChangeListener;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        C17542s.j(onTouchListener, "onTouchListener");
        this.f92693e = onTouchListener;
    }
}
