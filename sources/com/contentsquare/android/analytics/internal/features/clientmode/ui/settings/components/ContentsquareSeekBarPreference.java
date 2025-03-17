package com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components;

import XH.C16807N;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b8.m;
import b8.n;
import b8.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/settings/components/ContentsquareSeekBarPreference;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "LXH/N;", "listener", "setOnSeekBarChangeListener", "(LnI/l;)V", "value", "getCurrentValue", "()I", "setCurrentValue", "(I)V", "currentValue", "library_release"}, k = 1, mv = {1, 8, 0})
public final class ContentsquareSeekBarPreference extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public final SeekBar f46665A;

    /* renamed from: B  reason: collision with root package name */
    public C17642l<? super Integer, C16807N> f46666B;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f46667z;

    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f46668a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ContentsquareSeekBarPreference f46669b;

        public a(int i10, ContentsquareSeekBarPreference contentsquareSeekBarPreference) {
            this.f46668a = i10;
            this.f46669b = contentsquareSeekBarPreference;
        }

        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            int i11 = this.f46668a;
            if (i11 > 1) {
                int i12 = (i10 / i11) * i11;
                if (seekBar != null) {
                    seekBar.setProgress(i12);
                }
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            int progress = this.f46669b.f46665A.getProgress();
            C17642l<? super Integer, C16807N> lVar = this.f46669b.f46666B;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(progress));
            }
            this.f46669b.f46667z.setText(String.valueOf(progress));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentsquareSeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    public final int getCurrentValue() {
        return this.f46665A.getProgress();
    }

    public final void setCurrentValue(int i10) {
        this.f46665A.setProgress(i10);
        this.f46667z.setText(String.valueOf(i10));
    }

    public final void setOnSeekBarChangeListener(C17642l<? super Integer, C16807N> lVar) {
        C17542s.j(lVar, "listener");
        this.f46666B = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentsquareSeekBarPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C17542s.j(context, "context");
        View.inflate(context, n.f45588g, this);
        View findViewById = findViewById(m.f45570o);
        C17542s.i(findViewById, "findViewById(R.id.conten…quare_preference_seekbar)");
        SeekBar seekBar = (SeekBar) findViewById;
        this.f46665A = seekBar;
        View findViewById2 = findViewById(m.f45571p);
        C17542s.i(findViewById2, "findViewById(R.id.conten…ce_seekbar_current_value)");
        this.f46667z = (TextView) findViewById2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f45621a);
        C17542s.i(obtainStyledAttributes, "context.obtainStyledAttr…tsquareSeekBarPreference)");
        seekBar.setOnSeekBarChangeListener(new a(obtainStyledAttributes.getInteger(q.f45623c, 0), this));
        try {
            ((TextView) findViewById(m.f45574s)).setText(obtainStyledAttributes.getString(q.f45625e));
            ((TextView) findViewById(m.f45572q)).setText(obtainStyledAttributes.getString(q.f45624d));
            seekBar.setMax(obtainStyledAttributes.getInteger(q.f45622b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentsquareSeekBarPreference(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
