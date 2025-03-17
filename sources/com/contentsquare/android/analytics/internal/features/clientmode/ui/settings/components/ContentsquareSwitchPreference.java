package com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components;

import XH.C16807N;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import b8.m;
import b8.n;
import b8.q;
import h8.C7939a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0013\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00118F@FX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/settings/components/ContentsquareSwitchPreference;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "title", "LXH/N;", "setTitle", "(I)V", "summary", "setSummary", "Lkotlin/Function1;", "", "listener", "setOnSwitchStateChangeListener", "(LnI/l;)V", "", "contentDescription", "setSwitchContentDescription", "(Ljava/lang/String;)V", "value", "isChecked", "()Z", "setChecked", "(Z)V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class ContentsquareSwitchPreference extends ConstraintLayout {

    /* renamed from: z  reason: collision with root package name */
    public final SwitchCompat f46670z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentsquareSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    public static final void D(C17642l lVar, CompoundButton compoundButton, boolean z10) {
        C17542s.j(lVar, "$listener");
        if (compoundButton.isPressed()) {
            lVar.invoke(Boolean.valueOf(z10));
        }
    }

    public final void setChecked(boolean z10) {
        this.f46670z.setChecked(z10);
    }

    public final void setOnSwitchStateChangeListener(C17642l<? super Boolean, C16807N> lVar) {
        C17542s.j(lVar, "listener");
        this.f46670z.setOnCheckedChangeListener(new C7939a(lVar));
    }

    public final void setSummary(int i10) {
        ((TextView) findViewById(m.f45572q)).setText(getResources().getString(i10));
    }

    public final void setSwitchContentDescription(String str) {
        C17542s.j(str, "contentDescription");
        this.f46670z.setContentDescription(str);
    }

    public final void setTitle(int i10) {
        ((TextView) findViewById(m.f45574s)).setText(getResources().getString(i10));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentsquareSwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        View.inflate(context, n.f45592k, this);
        View findViewById = findViewById(m.f45573r);
        C17542s.i(findViewById, "findViewById(R.id.contentsquare_preference_switch)");
        this.f46670z = (SwitchCompat) findViewById;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f45626f);
        C17542s.i(obtainStyledAttributes, "context.obtainStyledAttr…ntsquareSwitchPreference)");
        try {
            ((TextView) findViewById(m.f45574s)).setText(obtainStyledAttributes.getString(q.f45628h));
            ((TextView) findViewById(m.f45572q)).setText(obtainStyledAttributes.getString(q.f45627g));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentsquareSwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
