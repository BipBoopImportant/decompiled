package com.sugarcube.decorate.v1.internal.v1.tooltip;

import SF.C16401b;
import SF.C16402c;
import XH.C16807N;
import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import cG.C17058a;
import cG.C17059b;
import cG.C17060c;
import cG.C17061d;
import com.sugarcube.common.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;
import q3.w;
import w3.z;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003T'+B\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u00101\u001a\u0004\b4\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00107R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010C\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u00100\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u001dR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\b6\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "Landroidx/lifecycle/v;", "Landroid/app/Activity;", "activity", "Ljava/util/Locale;", "locale", "Landroid/view/View;", "anchorView", "", "title", "content", "LcG/d;", "tooltipContentPosition", "horizontalOffset", "verticalOffset", "videoAsset", "", "playInLoop", "", "playbackSpeed", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;", "listener", "Landroidx/lifecycle/r;", "lifecycle", "<init>", "(Landroid/app/Activity;Ljava/util/Locale;Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;LcG/d;IILjava/lang/Integer;ZFLcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;Landroidx/lifecycle/r;)V", "contentView", "LXH/N;", "d", "(Landroid/view/View;)V", "f", "()V", "h", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "a", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "b", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "c", "Landroid/view/View;", "Ljava/lang/Integer;", "getTitle", "()Ljava/lang/Integer;", "getContent", "LcG/d;", "g", "I", "i", "j", "Z", "k", "F", "l", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;", "m", "getRoot", "()Landroid/view/View;", "setRoot", "root", "Landroid/widget/PopupWindow;", "n", "Landroid/widget/PopupWindow;", "()Landroid/widget/PopupWindow;", "setPopupWindow", "(Landroid/widget/PopupWindow;)V", "popupWindow", "Landroidx/media3/exoplayer/ExoPlayer;", "o", "Landroidx/media3/exoplayer/ExoPlayer;", "getPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "setPlayer", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "player", "p", "TooltipListener", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecorateToolbarTooltipObject implements C5218v {

    /* renamed from: p  reason: collision with root package name */
    public static final b f142254p = new b((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f142255q = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Activity f142256a;

    /* renamed from: b  reason: collision with root package name */
    private final Locale f142257b;

    /* renamed from: c  reason: collision with root package name */
    private final View f142258c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f142259d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f142260e;

    /* renamed from: f  reason: collision with root package name */
    private final C17061d f142261f;

    /* renamed from: g  reason: collision with root package name */
    private final int f142262g;

    /* renamed from: h  reason: collision with root package name */
    private final int f142263h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f142264i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f142265j;

    /* renamed from: k  reason: collision with root package name */
    private final float f142266k;

    /* renamed from: l  reason: collision with root package name */
    private final TooltipListener f142267l;

    /* renamed from: m  reason: collision with root package name */
    private View f142268m;

    /* renamed from: n  reason: collision with root package name */
    private PopupWindow f142269n;

    /* renamed from: o  reason: collision with root package name */
    private ExoPlayer f142270o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;", "", "LXH/N;", "onTooltipShown", "()V", "onTooltipDismissed", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TooltipListener {
        void onTooltipDismissed();

        void onTooltipShown();
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J!\u0010(\u001a\u0004\u0018\u00010'2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b(\u0010*R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010,R\u0016\u0010.\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u00101R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u00103R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u00104R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0012\u00106¨\u00068"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "", "<init>", "()V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "", "title", "g", "(I)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "content", "c", "offset", "d", "j", "videoAsset", "k", "", "playbackSpeed", "f", "(F)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;", "listener", "h", "(Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "Landroidx/lifecycle/r;", "observer", "e", "(Landroidx/lifecycle/r;)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "LcG/d;", "tooltipPosition", "i", "(LcG/d;)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$a;", "Landroid/app/Activity;", "activity", "Ljava/util/Locale;", "locale", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "a", "(Landroid/app/Activity;Ljava/util/Locale;)Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject;", "Landroid/view/View;", "anchorView", "Ljava/lang/Integer;", "I", "horizontalOffset", "verticalOffset", "", "Z", "playInLoop", "F", "Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$TooltipListener;", "LcG/d;", "Landroidx/lifecycle/r;", "lifecycleObserver", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private View f142271a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f142272b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f142273c;

        /* renamed from: d  reason: collision with root package name */
        private int f142274d;

        /* renamed from: e  reason: collision with root package name */
        private int f142275e;

        /* renamed from: f  reason: collision with root package name */
        private Integer f142276f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f142277g;

        /* renamed from: h  reason: collision with root package name */
        private float f142278h = 1.0f;

        /* renamed from: i  reason: collision with root package name */
        private TooltipListener f142279i;

        /* renamed from: j  reason: collision with root package name */
        private C17061d f142280j = C17061d.LEFT;

        /* renamed from: k  reason: collision with root package name */
        private r f142281k;

        public final DecorateToolbarTooltipObject a(Activity activity, Locale locale) {
            View view;
            r rVar;
            C17542s.j(locale, "locale");
            C17060c cVar = C17060c.f141229a;
            View view2 = this.f142271a;
            View view3 = null;
            if (view2 == null) {
                C17542s.z("anchorView");
                view2 = null;
            }
            DecorateToolbarTooltipObject c10 = cVar.c(view2.getId());
            if (c10 != null) {
                View view4 = this.f142271a;
                if (view4 == null) {
                    C17542s.z("anchorView");
                } else {
                    view3 = view4;
                }
                Log.i("SugarcubeTooltipObject", "Existing tooltip instance found for anchor view id: " + view3.getId());
                return c10;
            }
            View view5 = this.f142271a;
            if (view5 == null) {
                C17542s.z("anchorView");
                view5 = null;
            }
            Log.i("SugarcubeTooltipObject", "Creating new tooltip instance for anchor view id: " + view5.getId());
            if (activity == null) {
                return null;
            }
            View view6 = this.f142271a;
            if (view6 == null) {
                C17542s.z("anchorView");
                view = null;
            } else {
                view = view6;
            }
            Integer num = this.f142272b;
            Integer num2 = this.f142273c;
            C17061d dVar = this.f142280j;
            int i10 = this.f142274d;
            int i11 = this.f142275e;
            Integer num3 = this.f142276f;
            boolean z10 = this.f142277g;
            float f10 = this.f142278h;
            TooltipListener tooltipListener = this.f142279i;
            r rVar2 = this.f142281k;
            if (rVar2 == null) {
                C17542s.z("lifecycleObserver");
                rVar = null;
            } else {
                rVar = rVar2;
            }
            DecorateToolbarTooltipObject decorateToolbarTooltipObject = r2;
            DecorateToolbarTooltipObject decorateToolbarTooltipObject2 = new DecorateToolbarTooltipObject(activity, locale, view, num, num2, dVar, i10, i11, num3, z10, f10, tooltipListener, rVar, (DefaultConstructorMarker) null);
            View view7 = this.f142271a;
            if (view7 == null) {
                C17542s.z("anchorView");
            } else {
                view3 = view7;
            }
            DecorateToolbarTooltipObject decorateToolbarTooltipObject3 = decorateToolbarTooltipObject;
            cVar.d(view3.getId(), decorateToolbarTooltipObject3);
            return decorateToolbarTooltipObject3;
        }

        public final a b(View view) {
            C17542s.j(view, "view");
            this.f142271a = view;
            return this;
        }

        public final a c(int i10) {
            this.f142273c = Integer.valueOf(i10);
            return this;
        }

        public final a d(int i10) {
            this.f142274d = i10;
            return this;
        }

        public final a e(r rVar) {
            C17542s.j(rVar, "observer");
            this.f142281k = rVar;
            return this;
        }

        public final a f(float f10) {
            this.f142278h = f10;
            return this;
        }

        public final a g(int i10) {
            this.f142272b = Integer.valueOf(i10);
            return this;
        }

        public final a h(TooltipListener tooltipListener) {
            C17542s.j(tooltipListener, "listener");
            this.f142279i = tooltipListener;
            return this;
        }

        public final a i(C17061d dVar) {
            C17542s.j(dVar, "tooltipPosition");
            this.f142280j = dVar;
            return this;
        }

        public final a j(int i10) {
            this.f142275e = i10;
            return this;
        }

        public final a k(int i10) {
            this.f142276f = Integer.valueOf(i10);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/tooltip/DecorateToolbarTooltipObject$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f142282a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f142282a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.v1.tooltip.DecorateToolbarTooltipObject.c.<clinit>():void");
        }
    }

    public /* synthetic */ DecorateToolbarTooltipObject(Activity activity, Locale locale, View view, Integer num, Integer num2, C17061d dVar, int i10, int i11, Integer num3, boolean z10, float f10, TooltipListener tooltipListener, r rVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, locale, view, num, num2, dVar, i10, i11, num3, z10, f10, tooltipListener, rVar);
    }

    private final void d(View view) {
        if (this.f142264i != null) {
            PlayerView playerView = (PlayerView) view.findViewById(C16401b.f138179v1);
            ExoPlayer f10 = new ExoPlayer.b(this.f142256a).f();
            if (playerView != null) {
                playerView.setPlayer(f10);
            }
            if (playerView != null) {
                playerView.setClipToOutline(true);
            }
            if (this.f142265j) {
                f10.Z(2);
            }
            f10.j(this.f142266k);
            ExoPlayer exoPlayer = this.f142270o;
            if (exoPlayer != null) {
                exoPlayer.j(0.5f);
            }
            f10.q(true);
            Uri buildRawResourceUri = z.buildRawResourceUri(this.f142264i.intValue());
            C17542s.i(buildRawResourceUri, "buildRawResourceUri(...)");
            w b10 = w.b(buildRawResourceUri);
            C17542s.i(b10, "fromUri(...)");
            f10.O(b10);
            f10.d();
            this.f142270o = f10;
        }
    }

    /* access modifiers changed from: private */
    public static final void i(PopupWindow popupWindow, DecorateToolbarTooltipObject decorateToolbarTooltipObject, M m10, M m11) {
        popupWindow.showAtLocation(decorateToolbarTooltipObject.f142258c, 8388659, m10.f144346a, m11.f144346a);
        C16807N n10 = C16807N.f139792a;
        TooltipListener tooltipListener = decorateToolbarTooltipObject.f142267l;
        if (tooltipListener != null) {
            tooltipListener.onTooltipShown();
        }
    }

    /* access modifiers changed from: private */
    public static final void j(DecorateToolbarTooltipObject decorateToolbarTooltipObject) {
        ExoPlayer exoPlayer = decorateToolbarTooltipObject.f142270o;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        ExoPlayer exoPlayer2 = decorateToolbarTooltipObject.f142270o;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        C17060c.f141229a.e(decorateToolbarTooltipObject.f142258c.getId());
        TooltipListener tooltipListener = decorateToolbarTooltipObject.f142267l;
        if (tooltipListener != null) {
            tooltipListener.onTooltipDismissed();
        }
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        int i10 = c.f142282a[aVar.ordinal()];
        if (i10 == 1) {
            PopupWindow popupWindow = this.f142269n;
            if (popupWindow != null && popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.f142269n;
                View contentView = popupWindow2 != null ? popupWindow2.getContentView() : null;
                C17542s.g(contentView);
                d(contentView);
            }
        } else if (i10 == 2) {
            ExoPlayer exoPlayer = this.f142270o;
            if (exoPlayer != null) {
                exoPlayer.q(false);
            }
        } else if (i10 == 3) {
            C17060c.f141229a.a();
        }
    }

    public final void f() {
        PopupWindow popupWindow = this.f142269n;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        ExoPlayer exoPlayer = this.f142270o;
        if (exoPlayer != null) {
            exoPlayer.release();
        }
        this.f142270o = null;
    }

    public final PopupWindow g() {
        return this.f142269n;
    }

    public final void h() {
        int[] iArr = new int[2];
        this.f142258c.getLocationInWindow(iArr);
        Rect rect = new Rect();
        int i10 = 0;
        int i11 = iArr[0];
        rect.left = i11;
        rect.top = iArr[1];
        rect.right = i11 + this.f142258c.getWidth();
        rect.bottom = rect.top + this.f142258c.getHeight();
        PopupWindow popupWindow = this.f142269n;
        if (popupWindow != null) {
            popupWindow.setOverlapAnchor(false);
            popupWindow.setTouchable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            popupWindow.setClippingEnabled(false);
            popupWindow.setAnimationStyle(R.style.TooltipPopupWindowAnimation);
            if (Build.VERSION.SDK_INT >= 29) {
                popupWindow.setTouchModal(true);
            }
            if (this.f142264i != null) {
                i10 = popupWindow.getContentView().getMeasuredHeight() / 2;
            }
            M m10 = new M();
            m10.f144346a = (rect.left - popupWindow.getContentView().getMeasuredWidth()) + this.f142262g;
            M m11 = new M();
            m11.f144346a = (rect.top - i10) + this.f142263h;
            if (this.f142261f == C17061d.RIGHT) {
                m10.f144346a = rect.right + this.f142262g;
            }
            popupWindow.setOnDismissListener(new C17058a(this));
            if (this.f142258c.getVisibility() == 0 && this.f142258c.getRootView().getVisibility() == 0) {
                this.f142258c.post(new C17059b(popupWindow, this, m10, m11));
            }
        }
    }

    private DecorateToolbarTooltipObject(Activity activity, Locale locale, View view, Integer num, Integer num2, C17061d dVar, int i10, int i11, Integer num3, boolean z10, float f10, TooltipListener tooltipListener, r rVar) {
        int i12;
        View contentView;
        this.f142256a = activity;
        this.f142257b = locale;
        this.f142258c = view;
        this.f142259d = num;
        this.f142260e = num2;
        this.f142261f = dVar;
        this.f142262g = i10;
        this.f142263h = i11;
        this.f142264i = num3;
        this.f142265j = z10;
        this.f142266k = f10;
        this.f142267l = tooltipListener;
        rVar.c(this);
        View inflate = LayoutInflater.from(activity).inflate(num3 != null ? C16402c.f138204m : C16402c.f138203l, (ViewGroup) null, true);
        this.f142268m = inflate;
        if (inflate != null) {
            TextView textView = (TextView) inflate.findViewById(C16401b.f138149l1);
            if (num != null) {
                textView.setText(num.intValue());
            }
            TextView textView2 = (TextView) inflate.findViewById(C16401b.f138146k1);
            int i13 = 8;
            if (num2 != null) {
                textView2.setText(num2.intValue());
                Integer num4 = 0;
                i12 = num4.intValue();
            } else {
                i12 = 8;
            }
            textView2.setVisibility(i12);
            this.f142269n = new PopupWindow(inflate, -2, -2, false);
            d(inflate);
            PopupWindow popupWindow = this.f142269n;
            if (!(popupWindow == null || (contentView = popupWindow.getContentView()) == null)) {
                contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            inflate.findViewById(C16401b.f138121c0).setVisibility(dVar == C17061d.RIGHT ? 0 : 8);
            inflate.findViewById(C16401b.f138163q0).setVisibility(dVar == C17061d.LEFT ? 0 : i13);
        }
    }
}
