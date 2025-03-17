package com.contentsquare.android.sdk;

import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import YH.C16870n;
import a9.A5;
import a9.C6787a5;
import a9.C6851i5;
import a9.C6915q5;
import a9.L5;
import a9.Q4;
import a9.S5;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import b8.j;
import b8.k;
import b8.m;
import b8.n;
import b8.o;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareSeekBarPreference;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareSwitchPreference;
import com.contentsquare.android.sdk.C7146q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/sdk/k6;", "Landroidx/fragment/app/o;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class k6 extends C5187o {

    /* renamed from: D  reason: collision with root package name */
    public C7130i0 f47486D;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47487a;

        static {
            int[] iArr = new int[C7146q.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f47487a = iArr;
        }
    }

    public static final class b extends C17544u implements C17642l<Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k6 f47488c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k6 k6Var) {
            super(1);
            this.f47488c = k6Var;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C7130i0 i0Var = this.f47488c.f47486D;
            if (i0Var == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            }
            i0Var.f47431a.j(E8.b.DEVELOPER_SESSION_REPLAY_FPS_VALUE, intValue);
            return C16807N.f139792a;
        }
    }

    public static final class c extends C17544u implements C17642l<Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k6 f47489c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k6 k6Var) {
            super(1);
            this.f47489c = k6Var;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C7130i0 i0Var = this.f47489c.f47486D;
            if (i0Var == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            }
            i0Var.f47431a.j(E8.b.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, intValue);
            return C16807N.f139792a;
        }
    }

    public final void a(View view) {
        ContentsquareSeekBarPreference contentsquareSeekBarPreference = (ContentsquareSeekBarPreference) view.findViewById(m.f45579x);
        C7130i0 i0Var = this.f47486D;
        C7130i0 i0Var2 = null;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        if (i0Var.f47431a.b(E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false)) {
            C7130i0 i0Var3 = this.f47486D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var2 = i0Var3;
            }
            contentsquareSeekBarPreference.setCurrentValue(i0Var2.f47431a.d(E8.b.DEVELOPER_SESSION_REPLAY_FPS_VALUE, com.contentsquare.android.core.features.config.model.a.Companion.b(i0Var2.b()).m()));
            contentsquareSeekBarPreference.setOnSeekBarChangeListener(new b(this));
            contentsquareSeekBarPreference.setVisibility(0);
        } else if (contentsquareSeekBarPreference != null) {
            contentsquareSeekBarPreference.setVisibility(8);
        }
    }

    public final void b(View view) {
        ContentsquareSeekBarPreference contentsquareSeekBarPreference = (ContentsquareSeekBarPreference) view.findViewById(m.f45530A);
        C7130i0 i0Var = this.f47486D;
        C7130i0 i0Var2 = null;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        if (i0Var.f47431a.b(E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false)) {
            C7130i0 i0Var3 = this.f47486D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
            } else {
                i0Var2 = i0Var3;
            }
            contentsquareSeekBarPreference.setCurrentValue(i0Var2.f47431a.d(E8.b.DEVELOPER_SESSION_REPLAY_IMAGE_QUALITY_VALUE, com.contentsquare.android.core.features.config.model.a.Companion.b(i0Var2.b()).ordinal()));
            contentsquareSeekBarPreference.setOnSeekBarChangeListener(new c(this));
            contentsquareSeekBarPreference.setVisibility(0);
        } else if (contentsquareSeekBarPreference != null) {
            contentsquareSeekBarPreference.setVisibility(8);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(n.f45591j, viewGroup, false);
    }

    public final void onResume() {
        C7130i0 i0Var;
        boolean contains;
        super.onResume();
        View view = getView();
        if (view != null) {
            C5191t requireActivity = requireActivity();
            C17542s.h(requireActivity, "null cannot be cast to non-null type com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity");
            C7130i0 i0Var2 = ((SettingsActivity) requireActivity).f46663y;
            if (i0Var2 == null) {
                C17542s.z("settingsViewModel");
                i0Var2 = null;
            }
            this.f47486D = i0Var2;
            ContentsquareSwitchPreference contentsquareSwitchPreference = (ContentsquareSwitchPreference) view.findViewById(m.f45581z);
            if (contentsquareSwitchPreference != null) {
                C7130i0 i0Var3 = this.f47486D;
                if (i0Var3 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var3 = null;
                }
                contentsquareSwitchPreference.setChecked(i0Var3.f47431a.b(E8.b.SESSION_REPLAY_FORCE_START, false));
                contentsquareSwitchPreference.setOnSwitchStateChangeListener(new C6851i5(this));
            }
            ContentsquareSwitchPreference contentsquareSwitchPreference2 = (ContentsquareSwitchPreference) view.findViewById(m.f45578w);
            if (contentsquareSwitchPreference2 != null) {
                C7130i0 i0Var4 = this.f47486D;
                if (i0Var4 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var4 = null;
                }
                contentsquareSwitchPreference2.setChecked(i0Var4.f47431a.b(E8.b.SESSION_REPLAY_DEFAULT_MASKING, false));
                contentsquareSwitchPreference2.setOnSwitchStateChangeListener(new C6787a5(this));
            }
            ContentsquareSwitchPreference contentsquareSwitchPreference3 = (ContentsquareSwitchPreference) view.findViewById(m.f45577v);
            if (contentsquareSwitchPreference3 != null) {
                C7130i0 i0Var5 = this.f47486D;
                if (i0Var5 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var5 = null;
                }
                contentsquareSwitchPreference3.setChecked(i0Var5.f47431a.b(E8.b.DEVELOPER_SESSION_REPLAY_FORCE_ANIMATION_DETECTION, false));
                contentsquareSwitchPreference3.setOnSwitchStateChangeListener(new Q4(this));
            }
            ContentsquareSwitchPreference contentsquareSwitchPreference4 = (ContentsquareSwitchPreference) view.findViewById(m.f45580y);
            if (contentsquareSwitchPreference4 != null) {
                C7130i0 i0Var6 = this.f47486D;
                if (i0Var6 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var6 = null;
                }
                contentsquareSwitchPreference4.setChecked(i0Var6.f47431a.b(E8.b.DEVELOPER_SESSION_REPLAY_FORCE_QUALITY_LEVEL, false));
                contentsquareSwitchPreference4.setOnSwitchStateChangeListener(new C6915q5(this, view));
            }
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) view.findViewById(m.f45534E);
            ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(appCompatSpinner.getContext(), j.f45524a, 17367048);
            createFromResource.setDropDownViewResource(17367049);
            appCompatSpinner.setAdapter((SpinnerAdapter) createFromResource);
            String[] stringArray = appCompatSpinner.getContext().getResources().getStringArray(j.f45525b);
            C17542s.i(stringArray, "context.resources\n      …replay_preset_url_values)");
            List c12 = C16870n.c1(stringArray);
            C7130i0 i0Var7 = this.f47486D;
            if (i0Var7 == null) {
                C17542s.z("settingsViewModel");
                i0Var7 = null;
            }
            String f10 = i0Var7.f47431a.f(E8.b.DEVELOPER_SESSION_REPLAY_PRESET_URL, "from_configuration");
            C17542s.g(f10);
            appCompatSpinner.setSelection(c12.indexOf(f10));
            appCompatSpinner.setOnItemSelectedListener(new S5(this, c12, view));
            a(view);
            b(view);
            ContentsquareSeekBarPreference contentsquareSeekBarPreference = (ContentsquareSeekBarPreference) view.findViewById(m.f45537H);
            C7130i0 i0Var8 = this.f47486D;
            if (i0Var8 == null) {
                C17542s.z("settingsViewModel");
                i0Var8 = null;
            }
            contentsquareSeekBarPreference.setCurrentValue(i0Var8.f47431a.d(E8.b.DEVELOPER_SESSION_REPLAY_MAXIMUM_USAGE_ON_UI_THREAD_IN_MILLI_SEC, 40));
            contentsquareSeekBarPreference.setOnSeekBarChangeListener(new L5(this));
            LinearLayout linearLayout = (LinearLayout) view.findViewById(m.f45536G);
            ContentsquareSwitchPreference contentsquareSwitchPreference5 = (ContentsquareSwitchPreference) view.findViewById(m.f45535F);
            C7130i0 i0Var9 = this.f47486D;
            if (i0Var9 == null) {
                C17542s.z("settingsViewModel");
                i0Var9 = null;
            }
            contentsquareSwitchPreference5.setChecked(i0Var9.f47437g.f41929b);
            contentsquareSwitchPreference5.setOnSwitchStateChangeListener(new f1(this, linearLayout));
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(m.f45536G);
            if (linearLayout2 != null) {
                C7146q.b[] values = C7146q.b.values();
                int length = values.length;
                int i10 = 0;
                while (i10 < length) {
                    C7146q.b bVar = values[i10];
                    if (a.f47487a[bVar.ordinal()] == 1) {
                        v a10 = C16796C.a(Integer.valueOf(o.f45597d), Integer.valueOf(o.f45596c));
                        int intValue = ((Number) a10.a()).intValue();
                        int intValue2 = ((Number) a10.b()).intValue();
                        Context context = linearLayout2.getContext();
                        C17542s.i(context, "container.context");
                        ContentsquareSwitchPreference contentsquareSwitchPreference6 = r11;
                        ContentsquareSwitchPreference contentsquareSwitchPreference7 = new ContentsquareSwitchPreference(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        C7130i0 i0Var10 = this.f47486D;
                        if (i0Var10 == null) {
                            C17542s.z("settingsViewModel");
                            i0Var10 = null;
                        }
                        C7146q qVar = i0Var10.f47437g;
                        synchronized (qVar) {
                            contains = qVar.f41928a.contains(bVar);
                        }
                        contentsquareSwitchPreference6.setChecked(contains);
                        contentsquareSwitchPreference6.setTitle(intValue);
                        contentsquareSwitchPreference6.setSummary(intValue2);
                        contentsquareSwitchPreference6.setOnSwitchStateChangeListener(new i1(this, bVar));
                        contentsquareSwitchPreference6.setPadding(0, 0, 0, contentsquareSwitchPreference6.getResources().getDimensionPixelSize(k.f45526a));
                        contentsquareSwitchPreference6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        linearLayout2.addView(contentsquareSwitchPreference6);
                        i10++;
                    } else {
                        throw new t();
                    }
                }
                C7130i0 i0Var11 = this.f47486D;
                if (i0Var11 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var11 = null;
                }
                if (i0Var11.f47437g.f41929b) {
                    linearLayout2.setVisibility(0);
                } else {
                    linearLayout2.setVisibility(8);
                }
            }
            ContentsquareSwitchPreference contentsquareSwitchPreference8 = (ContentsquareSwitchPreference) view.findViewById(m.f45532C);
            C7130i0 i0Var12 = this.f47486D;
            if (i0Var12 == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            } else {
                i0Var = i0Var12;
            }
            contentsquareSwitchPreference8.setChecked(i0Var.f47431a.b(E8.b.DEVELOPER_SESSION_REPLAY_LOG_VIEWLIGHT_TREE, false));
            contentsquareSwitchPreference8.setOnSwitchStateChangeListener(new A5(this));
        }
    }
}
