package Br;

import Ar.j;
import Ea.C9072f;
import Ma.C9140b;
import XH.C16807N;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.C10025b;
import nI.C17631a;
import nI.C17642l;
import tK.C18010a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J]\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0017Js\u0010%\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0001\u0010\u001c\u001a\u00020\u00062\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b%\u0010&Jo\u0010'\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010,R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0014\u00100\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u00102\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010,¨\u00063"}, d2 = {"LBr/e;", "LAr/j;", "<init>", "()V", "Landroid/view/View;", "rootView", "", "message", "actionText", "length", "anchorView", "Lkotlin/Function0;", "LXH/N;", "onAction", "Lcom/google/android/material/snackbar/Snackbar;", "b", "(Landroid/view/View;IIILandroid/view/View;LnI/a;)Lcom/google/android/material/snackbar/Snackbar;", "", "", "Lkotlin/Function1;", "LAr/j$b;", "onDismissed", "c", "(Landroid/view/View;Ljava/lang/CharSequence;Ljava/lang/String;ILandroid/view/View;LnI/a;LnI/l;)Lcom/google/android/material/snackbar/Snackbar;", "snackbarAnchorView", "j", "Landroid/content/Context;", "context", "title", "description", "", "cancelable", "positiveButtonText", "positiveAction", "negativeButtonText", "negativeAction", "dismissedAction", "a", "(Landroid/content/Context;ILjava/lang/Integer;ZILnI/a;Ljava/lang/String;LnI/a;LnI/a;)V", "d", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZILnI/a;Ljava/lang/String;LnI/a;LnI/a;)V", "snackBar", "i", "(Lcom/google/android/material/snackbar/Snackbar;)V", "I", "snackBarTextId", "snackBarActionId", "textColorId", "actionColorId", "e", "backgroundColorId", "feedback-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f79372a = C9072f.f59472O;

    /* renamed from: b  reason: collision with root package name */
    private final int f79373b = C9072f.f59471N;

    /* renamed from: c  reason: collision with root package name */
    private final int f79374c = C18010a.f147425i;

    /* renamed from: d  reason: collision with root package name */
    private final int f79375d = C10025b.f75265g;

    /* renamed from: e  reason: collision with root package name */
    private final int f79376e = C18010a.f147418b;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Br/e$a", "Lcom/google/android/material/snackbar/Snackbar$a;", "Lcom/google/android/material/snackbar/Snackbar;", "transientBottomBar", "", "event", "LXH/N;", "d", "(Lcom/google/android/material/snackbar/Snackbar;I)V", "feedback-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends Snackbar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<j.b, C16807N> f79377a;

        a(C17642l<? super j.b, C16807N> lVar) {
            this.f79377a = lVar;
        }

        /* renamed from: d */
        public void a(Snackbar snackbar, int i10) {
            this.f79377a.invoke(j.b.Companion.a(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void k(C17631a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void l(C17631a aVar, DialogInterface dialogInterface, int i10) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void m(C17631a aVar, DialogInterface dialogInterface, int i10) {
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public static final void n(C17631a aVar, DialogInterface dialogInterface) {
        aVar.invoke();
    }

    public void a(Context context, int i10, Integer num, boolean z10, int i11, C17631a<C16807N> aVar, String str, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
        Context context2 = context;
        C17542s.j(aVar, "positiveAction");
        C17542s.j(aVar2, "negativeAction");
        C17542s.j(aVar3, "dismissedAction");
        if (context2 != null) {
            String string = context.getString(i10);
            C17542s.i(string, "getString(...)");
            d(context, string, num != null ? context.getString(num.intValue()) : null, z10, i11, aVar, str, aVar2, aVar3);
        }
    }

    public Snackbar b(View view, int i10, int i11, int i12, View view2, C17631a<C16807N> aVar) {
        Context context;
        C17542s.j(aVar, "onAction");
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        int i13 = i10;
        String string = context.getString(i10);
        C17542s.i(string, "getString(...)");
        int i14 = i11;
        return j.a.s(this, view, string, context.getString(i11), i12, view2, aVar, (C17642l) null, 64, (Object) null);
    }

    public Snackbar c(View view, CharSequence charSequence, String str, int i10, View view2, C17631a<C16807N> aVar, C17642l<? super j.b, C16807N> lVar) {
        C17542s.j(view, "rootView");
        C17542s.j(charSequence, "message");
        C17542s.j(aVar, "onAction");
        C17542s.j(lVar, "onDismissed");
        Snackbar j10 = j(view, charSequence, str, i10, view2, aVar, lVar);
        j10.b0();
        return j10;
    }

    public void d(Context context, String str, String str2, boolean z10, int i10, C17631a<C16807N> aVar, String str3, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
        C17542s.j(str, "title");
        C17542s.j(aVar, "positiveAction");
        C17542s.j(aVar2, "negativeAction");
        C17542s.j(aVar3, "dismissedAction");
        if (context != null) {
            C9140b bVar = new C9140b(context);
            bVar.setTitle(str);
            bVar.f(str2);
            bVar.setPositiveButton(i10, new a(aVar));
            if (!(str3 == null || str3.length() == 0)) {
                bVar.g(str3, new b(aVar2));
            }
            bVar.D(new c(aVar3));
            bVar.u(z10);
            bVar.p();
        }
    }

    public void i(Snackbar snackbar) {
        C17542s.j(snackbar, "snackBar");
        Context E10 = snackbar.E();
        C17542s.i(E10, "getContext(...)");
        TextView textView = (TextView) snackbar.K().findViewById(this.f79372a);
        TextView textView2 = (TextView) snackbar.K().findViewById(this.f79373b);
        textView.setTextColor(E10.getColor(this.f79374c));
        textView.setMaxLines(5);
        textView2.setTextColor(E10.getColor(this.f79375d));
        textView2.setTypeface(textView2.getTypeface(), 1);
        textView2.setAllCaps(false);
        textView2.setLetterSpacing(0.0f);
        snackbar.u0(E10.getColor(this.f79376e));
    }

    public Snackbar j(View view, CharSequence charSequence, String str, int i10, View view2, C17631a<C16807N> aVar, C17642l<? super j.b, C16807N> lVar) {
        C17542s.j(view, "rootView");
        C17542s.j(charSequence, "message");
        C17542s.j(aVar, "onAction");
        C17542s.j(lVar, "onDismissed");
        Snackbar q02 = Snackbar.q0(view, charSequence, i10);
        C17542s.i(q02, "make(...)");
        q02.W(view2);
        i(q02);
        if (str != null) {
            q02.t0(str, new d(aVar));
        }
        q02.u(new a(lVar));
        return q02;
    }
}
