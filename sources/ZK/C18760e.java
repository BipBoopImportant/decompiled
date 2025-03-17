package zK;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LzK/e;", "Landroid/view/View$OnTouchListener;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "Landroid/widget/TextView;", "textView", "Landroid/text/Spannable;", "spannable", "", "a", "(Landroid/view/MotionEvent;Landroid/widget/TextView;Landroid/text/Spannable;)Z", "Landroid/view/View;", "view", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "LzK/e$a;", "LzK/e$a;", "longClickCallback", "", "b", "J", "pressDuration", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.e  reason: case insensitive filesystem */
public final class C18760e implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private a f152827a;

    /* renamed from: b  reason: collision with root package name */
    private final long f152828b = ((long) ViewConfiguration.getPressedStateDuration());

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LzK/e$a;", "Ljava/lang/Runnable;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "LXH/N;", "run", "()V", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: zK.e$a */
    private static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f152829a;

        public a(View view) {
            C17542s.j(view, "view");
            this.f152829a = view;
        }

        public void run() {
            View view = this.f152829a;
            boolean performLongClick = view.performLongClick();
            while (!performLongClick && view != null) {
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
                performLongClick = view != null ? view.performLongClick() : true;
            }
        }
    }

    private final boolean a(MotionEvent motionEvent, TextView textView, Spannable spannable) {
        int offsetForHorizontal = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((C17752b.e(motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (motionEvent.getX() - ((float) textView.getTotalPaddingLeft())) + ((float) textView.getScrollX()));
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        C17542s.g(clickableSpanArr);
        if (clickableSpanArr.length == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            textView.postDelayed(this.f152827a, this.f152828b);
        } else {
            textView.removeCallbacks(this.f152827a);
            clickableSpanArr[0].onClick(textView);
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C17542s.j(view, "view");
        C17542s.j(motionEvent, "event");
        if (this.f152827a == null) {
            this.f152827a = new a(view);
        }
        TextView textView = (TextView) view;
        textView.setMovementMethod((MovementMethod) null);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            C17542s.g(newSpannable);
            return a(motionEvent, textView, newSpannable);
        } else if (action != 3) {
            return false;
        } else {
            view.removeCallbacks(this.f152827a);
            return false;
        }
    }
}
