package com.contentsquare.android.sdk;

import E8.b;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import b8.k;
import b8.m;
import b8.n;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareSwitchPreference;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/sdk/N1;", "Landroidx/fragment/app/o;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class N1 extends C5187o {

    /* renamed from: D  reason: collision with root package name */
    public C7130i0 f47048D;

    public static final class a extends C17544u implements C17642l<Boolean, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Set<String> f47049c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f47050d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ N1 f47051e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Set<String> set, String str, N1 n12) {
            super(1);
            this.f47049c = set;
            this.f47050d = str;
            this.f47051e = n12;
        }

        public final Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f47049c.add(this.f47050d);
            } else {
                this.f47049c.remove(this.f47050d);
            }
            C7130i0 i0Var = this.f47051e.f47048D;
            if (i0Var == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            }
            Set<String> set = this.f47049c;
            i0Var.getClass();
            C17542s.j(set, "value");
            i0Var.f47431a.m(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_STATES, set);
            return C16807N.f139792a;
        }
    }

    public final void a(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(m.f45568m);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            C7130i0 i0Var = this.f47048D;
            C7130i0 i0Var2 = null;
            if (i0Var == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            }
            Set<String> g10 = i0Var.f47431a.g(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_STATES, g0.d());
            if (g10 == null) {
                g10 = g0.d();
            }
            Set<T> x12 = C16877v.x1(g10);
            C7130i0 i0Var3 = this.f47048D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
                i0Var3 = null;
            }
            for (String str : i0Var3.f47439i) {
                Context context = linearLayout.getContext();
                C17542s.i(context, "context");
                ContentsquareSwitchPreference contentsquareSwitchPreference = new ContentsquareSwitchPreference(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                contentsquareSwitchPreference.setSwitchContentDescription("contentsquare_switch_" + str);
                ((TextView) contentsquareSwitchPreference.findViewById(m.f45574s)).setText(str);
                contentsquareSwitchPreference.setPadding(0, 0, 0, contentsquareSwitchPreference.getResources().getDimensionPixelSize(k.f45526a));
                contentsquareSwitchPreference.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                contentsquareSwitchPreference.setChecked(x12.contains(str));
                contentsquareSwitchPreference.setOnSwitchStateChangeListener(new a(x12, str, this));
                linearLayout.addView(contentsquareSwitchPreference);
            }
            C7130i0 i0Var4 = this.f47048D;
            if (i0Var4 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var2 = i0Var4;
            }
            if (i0Var2.f47431a.b(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_ENABLED, false)) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(n.f45586e, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        C5191t requireActivity = requireActivity();
        C17542s.h(requireActivity, "null cannot be cast to non-null type com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity");
        C7130i0 i0Var = ((SettingsActivity) requireActivity).f46663y;
        C7130i0 i0Var2 = null;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        this.f47048D = i0Var;
        ContentsquareSwitchPreference contentsquareSwitchPreference = (ContentsquareSwitchPreference) view.findViewById(m.f45569n);
        if (contentsquareSwitchPreference != null) {
            contentsquareSwitchPreference.setSwitchContentDescription("contentsquare_switch_override_feature_flags");
            C7130i0 i0Var3 = this.f47048D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var2 = i0Var3;
            }
            contentsquareSwitchPreference.setChecked(i0Var2.f47431a.b(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_ENABLED, false));
            contentsquareSwitchPreference.setOnSwitchStateChangeListener(new L(this, view));
        }
        a(view);
    }
}
