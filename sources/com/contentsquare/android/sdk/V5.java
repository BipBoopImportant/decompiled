package com.contentsquare.android.sdk;

import E8.b;
import QJ.F0;
import QJ.T;
import XH.C16807N;
import a9.A2;
import a9.B2;
import a9.C2;
import a9.C6840h2;
import a9.C6919r2;
import a9.C6983z2;
import a9.C6985z4;
import a9.D2;
import a9.L2;
import a9.R1;
import a9.R2;
import a9.S0;
import a9.X1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import b8.m;
import b8.n;
import b8.o;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.deactivationdialog.DeactivationActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareSeekBarPreference;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareSwitchPreference;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.components.ContentsquareTextPreference;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/sdk/V5;", "Landroidx/fragment/app/o;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class V5 extends C5187o {

    /* renamed from: D  reason: collision with root package name */
    public C7130i0 f47193D;

    public static final class a extends C17544u implements C17642l<Intent, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ V5 f47194c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(V5 v52) {
            super(1);
            this.f47194c = v52;
        }

        public final Object invoke(Object obj) {
            Intent intent = (Intent) obj;
            C17542s.j(intent, "intent");
            C5191t activity = this.f47194c.getActivity();
            if (activity != null) {
                activity.startActivity(Intent.createChooser(intent, (CharSequence) null));
            }
            return C16807N.f139792a;
        }
    }

    public static final void q(V5 v52, View view) {
        C17542s.j(v52, "this$0");
        v52.startActivity(new Intent(v52.getActivity(), DeactivationActivity.class));
    }

    public static final void r(V5 v52, View view) {
        C17542s.j(v52, "this$0");
        v52.getParentFragmentManager().s().s(m.f45559d, new N1()).i((String) null).j();
    }

    public static final void s(V5 v52, View view) {
        String str;
        C6985z4 z4Var;
        C17542s.j(v52, "this$0");
        v52.getClass();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        C7130i0 i0Var = v52.f47193D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        C7131j jVar = i0Var.f47435e;
        if (jVar == null || (z4Var = jVar.f47455i) == null || (str = z4Var.a()) == null) {
            str = "INACTIVE";
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        v52.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public static final void t(V5 v52, View view) {
        C17542s.j(v52, "this$0");
        Context context = v52.getContext();
        if (context != null) {
            C7130i0 i0Var = v52.f47193D;
            if (i0Var == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            }
            C7130i0 i0Var2 = i0Var;
            String absolutePath = context.getFilesDir().getAbsolutePath();
            C17542s.i(absolutePath, "safeContext.filesDir.absolutePath");
            a aVar = new a(v52);
            i0Var2.getClass();
            C17542s.j(absolutePath, "appFilesDir");
            C17542s.j(context, "context");
            C17542s.j(aVar, "onIntentReady");
            F0 unused = C16314k.d(i0Var2.f47438h, (C17168i) null, (T) null, new R2(absolutePath, i0Var2, context, aVar, (C17164e) null), 3, (Object) null);
        }
    }

    public static final void u(V5 v52, View view) {
        C17542s.j(v52, "this$0");
        v52.getParentFragmentManager().s().s(m.f45559d, new k6()).i((String) null).j();
    }

    public final void a(View view, boolean z10) {
        ContentsquareTextPreference contentsquareTextPreference = (ContentsquareTextPreference) view.findViewById(m.f45565j);
        if (contentsquareTextPreference == null) {
            return;
        }
        if (!z10) {
            contentsquareTextPreference.setVisibility(8);
            return;
        }
        contentsquareTextPreference.setVisibility(0);
        C7130i0 i0Var = this.f47193D;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        String a10 = new S0(i0Var.f47431a).a();
        if (a10.length() > 6) {
            a10 = a10.substring(a10.length() - 6);
            C17542s.i(a10, "this as java.lang.String).substring(startIndex)");
        }
        contentsquareTextPreference.setSummaryText(a10);
    }

    public final void b(View view) {
        Button button = (Button) view.findViewById(m.f45563h);
        if (button != null) {
            button.setOnClickListener(new A2(this));
        }
    }

    public final void c(View view) {
        ContentsquareTextPreference contentsquareTextPreference = (ContentsquareTextPreference) view.findViewById(m.f45531B);
        if (contentsquareTextPreference == null) {
            return;
        }
        if (C7131j.f47442k != null) {
            contentsquareTextPreference.setTitle(o.f45600g);
            contentsquareTextPreference.setSummary(o.f45599f);
            contentsquareTextPreference.setSummaryVisible(true);
            contentsquareTextPreference.setOnClickListener(new C2(this));
            return;
        }
        contentsquareTextPreference.setEnabled(false);
        contentsquareTextPreference.setSummaryVisible(false);
        contentsquareTextPreference.setTitle(o.f45598e);
    }

    public final void d(View view) {
        ContentsquareTextPreference contentsquareTextPreference = (ContentsquareTextPreference) view.findViewById(m.f45576u);
        if (contentsquareTextPreference != null) {
            contentsquareTextPreference.setOnClickListener(new C6983z2(this));
        }
    }

    public final void e(View view) {
        Button button = (Button) view.findViewById(m.f45540K);
        if (button != null) {
            button.setOnClickListener(new B2(this));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(n.f45589h, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view != null) {
            C5191t requireActivity = requireActivity();
            C17542s.h(requireActivity, "null cannot be cast to non-null type com.contentsquare.android.analytics.internal.features.clientmode.ui.settings.SettingsActivity");
            C7130i0 i0Var = ((SettingsActivity) requireActivity).f46663y;
            C7130i0 i0Var2 = null;
            if (i0Var == null) {
                C17542s.z("settingsViewModel");
                i0Var = null;
            }
            this.f47193D = i0Var;
            d(view);
            ContentsquareSeekBarPreference contentsquareSeekBarPreference = (ContentsquareSeekBarPreference) view.findViewById(m.f45567l);
            C7130i0 i0Var3 = this.f47193D;
            if (i0Var3 == null) {
                C17542s.z("settingsViewModel");
                i0Var3 = null;
            }
            contentsquareSeekBarPreference.setCurrentValue(i0Var3.f47431a.d(b.CLIENT_MODE_LONG_SNAPSHOT_SCROLL_DELAY_MILLISECONDS, 0));
            contentsquareSeekBarPreference.setOnSeekBarChangeListener(new C6840h2(this));
            a(view);
            c(view);
            C7130i0 i0Var4 = this.f47193D;
            if (i0Var4 == null) {
                C17542s.z("settingsViewModel");
                i0Var4 = null;
            }
            boolean d10 = i0Var4.f47434d.d("session_recording");
            ContentsquareSwitchPreference contentsquareSwitchPreference = (ContentsquareSwitchPreference) view.findViewById(m.f45533D);
            if (contentsquareSwitchPreference != null) {
                if (!d10) {
                    contentsquareSwitchPreference.setVisibility(8);
                } else {
                    C7130i0 i0Var5 = this.f47193D;
                    if (i0Var5 == null) {
                        C17542s.z("settingsViewModel");
                        i0Var5 = null;
                    }
                    contentsquareSwitchPreference.setChecked(i0Var5.f47431a.b(b.LOCAL_SESSION_REPLAY_MODE, false));
                    contentsquareSwitchPreference.setOnSwitchStateChangeListener(new R1(this));
                }
            }
            ContentsquareSwitchPreference contentsquareSwitchPreference2 = (ContentsquareSwitchPreference) view.findViewById(m.f45566k);
            if (contentsquareSwitchPreference2 != null) {
                C7130i0 i0Var6 = this.f47193D;
                if (i0Var6 == null) {
                    C17542s.z("settingsViewModel");
                    i0Var6 = null;
                }
                contentsquareSwitchPreference2.setChecked(i0Var6.f47431a.b(b.LOCAL_LOG_VISUALIZER_MODE, false));
                contentsquareSwitchPreference2.setOnSwitchStateChangeListener(new X1(this, view));
            }
            C7130i0 i0Var7 = this.f47193D;
            if (i0Var7 == null) {
                C17542s.z("settingsViewModel");
                i0Var7 = null;
            }
            a(view, i0Var7.f47431a.b(b.LOCAL_LOG_VISUALIZER_MODE, false));
            ViewGroup viewGroup = (ViewGroup) view.findViewById(m.f45560e);
            C7130i0 i0Var8 = this.f47193D;
            if (i0Var8 == null) {
                C17542s.z("settingsViewModel");
                i0Var8 = null;
            }
            if (i0Var8.f47431a.b(b.DEVELOPER_MODE_ACTIVATION_STATE, false)) {
                ContentsquareSwitchPreference contentsquareSwitchPreference3 = (ContentsquareSwitchPreference) view.findViewById(m.f45575t);
                if (contentsquareSwitchPreference3 != null) {
                    C7130i0 i0Var9 = this.f47193D;
                    if (i0Var9 == null) {
                        C17542s.z("settingsViewModel");
                        i0Var9 = null;
                    }
                    contentsquareSwitchPreference3.setChecked(i0Var9.f47431a.b(b.CLIENT_MODE_SCREENGRAPH_OPTIMIZATION_MODE, false));
                    contentsquareSwitchPreference3.setOnSwitchStateChangeListener(new C6919r2(this));
                }
                ContentsquareSwitchPreference contentsquareSwitchPreference4 = (ContentsquareSwitchPreference) view.findViewById(m.f45539J);
                if (contentsquareSwitchPreference4 != null) {
                    C7130i0 i0Var10 = this.f47193D;
                    if (i0Var10 == null) {
                        C17542s.z("settingsViewModel");
                    } else {
                        i0Var2 = i0Var10;
                    }
                    contentsquareSwitchPreference4.setChecked(i0Var2.f47431a.b(b.DEVELOPER_SESSION_TIMEOUT_TO_0, false));
                    contentsquareSwitchPreference4.setOnSwitchStateChangeListener(new L2(this));
                }
                e(view);
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
            } else if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            b(view);
        }
    }

    public final void a(View view) {
        TextView textView = (TextView) view.findViewById(m.f45561f);
        if (textView != null) {
            textView.setOnClickListener(new D2(this));
        }
    }
}
