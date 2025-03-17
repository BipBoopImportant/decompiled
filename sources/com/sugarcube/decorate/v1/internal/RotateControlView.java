package com.sugarcube.decorate.v1.internal;

import HK.C15864d;
import TF.C16457A;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001PB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b,\u0010-R\u0014\u00100\u001a\u00020.8\u0002XD¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b'\u00105R\u0016\u00107\u001a\u00020.8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000201088\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u00109R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010<R\u0016\u0010@\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010?R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/RotateControlView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LXH/N;", "a", "(Landroid/util/AttributeSet;)V", "", "newDegrees", "", "invokeCallback", "b", "(FZ)V", "d", "()V", "f", "e", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lcom/sugarcube/decorate/v1/internal/RotateControlView$OnItemRotateListener;", "rotateListener", "setListener", "(Lcom/sugarcube/decorate/v1/internal/RotateControlView$OnItemRotateListener;)V", "getIsVisible", "()Z", "isVisible", "startDegrees", "c", "(ZF)V", "getDegrees", "()F", "degs", "setDegrees", "(F)V", "", "Ljava/lang/String;", "valueFormatAttr", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "valueText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "ticks", "valueFormat", "", "Ljava/util/List;", "tickLabels", "", "[Ljava/lang/Float;", "tickLabelYPositions", "g", "F", "tenDegreesToPx", "h", "pxToDegrees", "i", "degrees", "Landroid/view/MotionEvent$PointerCoords;", "j", "Landroid/view/MotionEvent$PointerCoords;", "ppc0", "", "k", "I", "ptrId", "l", "Lcom/sugarcube/decorate/v1/internal/RotateControlView$OnItemRotateListener;", "listener", "OnItemRotateListener", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RotateControlView extends LinearLayout implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f141377a = "gmg_valueFormat";

    /* renamed from: b  reason: collision with root package name */
    private TextView f141378b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f141379c;

    /* renamed from: d  reason: collision with root package name */
    private String f141380d;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends TextView> f141381e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private Float[] f141382f = new Float[0];

    /* renamed from: g  reason: collision with root package name */
    private float f141383g;

    /* renamed from: h  reason: collision with root package name */
    private float f141384h;

    /* renamed from: i  reason: collision with root package name */
    private float f141385i = -720.0f;

    /* renamed from: j  reason: collision with root package name */
    private MotionEvent.PointerCoords f141386j = new MotionEvent.PointerCoords();

    /* renamed from: k  reason: collision with root package name */
    private int f141387k = -1;

    /* renamed from: l  reason: collision with root package name */
    private OnItemRotateListener f141388l;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/RotateControlView$OnItemRotateListener;", "", "", "newDegrees", "LXH/N;", "onValueChanged", "(F)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemRotateListener {
        void onValueChanged(float f10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotateControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C17542s.j(context, "ctx");
        C17542s.j(attributeSet, "attributeSet");
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        C16457A b10 = C16457A.b(LayoutInflater.from(getContext()), this);
        C17542s.i(b10, "inflate(...)");
        if (attributeSet != null) {
            String attributeValue = attributeSet.getAttributeValue((String) null, this.f141377a);
            if (attributeValue == null) {
                attributeValue = "%d";
            }
            this.f141380d = attributeValue;
        }
        setOnTouchListener(this);
        setOnClickListener(this);
        this.f141378b = b10.f138372o;
        this.f141379c = b10.f138373p;
        ArrayList arrayList = new ArrayList();
        TextView textView = b10.f138362e;
        C17542s.i(textView, "rotatorTickLabel0");
        arrayList.add(textView);
        TextView textView2 = b10.f138363f;
        C17542s.i(textView2, "rotatorTickLabel1");
        arrayList.add(textView2);
        TextView textView3 = b10.f138364g;
        C17542s.i(textView3, "rotatorTickLabel2");
        arrayList.add(textView3);
        TextView textView4 = b10.f138365h;
        C17542s.i(textView4, "rotatorTickLabel3");
        arrayList.add(textView4);
        TextView textView5 = b10.f138366i;
        C17542s.i(textView5, "rotatorTickLabel4");
        arrayList.add(textView5);
        TextView textView6 = b10.f138367j;
        C17542s.i(textView6, "rotatorTickLabel5");
        arrayList.add(textView6);
        TextView textView7 = b10.f138368k;
        C17542s.i(textView7, "rotatorTickLabel6");
        arrayList.add(textView7);
        TextView textView8 = b10.f138369l;
        C17542s.i(textView8, "rotatorTickLabel7");
        arrayList.add(textView8);
        TextView textView9 = b10.f138370m;
        C17542s.i(textView9, "rotatorTickLabel8");
        arrayList.add(textView9);
        List<? extends TextView> W10 = C15864d.W(arrayList);
        this.f141381e = W10;
        int size = W10.size();
        Float[] fArr = new Float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = Float.valueOf(((TextView) this.f141381e.get(i10)).getTranslationY());
        }
        this.f141382f = fArr;
        float floatValue = fArr[1].floatValue() - this.f141382f[0].floatValue();
        this.f141383g = floatValue;
        this.f141384h = 10.0f / floatValue;
        b(0.0f, false);
    }

    private final void b(float f10, boolean z10) {
        OnItemRotateListener onItemRotateListener;
        float f11 = f10 / 360.0f;
        float signum = Math.signum(f10) * (Math.abs(f11) - ((float) ((int) Math.abs(f11)))) * 360.0f;
        if (this.f141385i != signum) {
            this.f141385i = signum;
            d();
            f();
            e();
            if (z10 && (onItemRotateListener = this.f141388l) != null) {
                onItemRotateListener.onValueChanged(getDegrees());
            }
        }
    }

    private final void d() {
        String str = ((int) this.f141385i) + "°";
        TextView textView = this.f141378b;
        if (textView == null) {
            C17542s.z("valueText");
            textView = null;
        }
        textView.setText(str);
    }

    private final void e() {
        ImageView imageView = this.f141379c;
        if (imageView == null) {
            C17542s.z("ticks");
            imageView = null;
        }
        float translationY = imageView.getTranslationY();
        int i10 = (int) this.f141385i;
        int i11 = ((i10 / 10) * 10) + 40;
        int size = this.f141381e.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((TextView) this.f141381e.get(i12)).setText(String.valueOf(((int) Math.signum((float) i11)) * (Math.abs(i11) % 360)));
            ((TextView) this.f141381e.get(i12)).setTranslationY(this.f141382f[i12].floatValue() + translationY);
            ((TextView) this.f141381e.get(i12)).setAlpha(Math.max(0.0f, Math.min(1.0f, ((float) Math.abs(i11 - i10)) * 0.1f)));
            i11 -= 10;
        }
    }

    private final void f() {
        float f10 = this.f141385i * 0.1f;
        float f11 = f10 - ((float) ((int) f10));
        ImageView imageView = this.f141379c;
        if (imageView == null) {
            C17542s.z("ticks");
            imageView = null;
        }
        imageView.setTranslationY(this.f141383g * f11);
    }

    public final void c(boolean z10, float f10) {
        setVisibility(z10 ? 0 : 8);
        if (z10) {
            b(f10, false);
        }
    }

    public final float getDegrees() {
        return this.f141385i;
    }

    public final boolean getIsVisible() {
        return getVisibility() == 0;
    }

    public void onClick(View view) {
        C17542s.j(view, "v");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C17542s.j(view, "v");
        C17542s.j(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f141386j.x = motionEvent.getX();
            this.f141386j.y = motionEvent.getY();
            this.f141387k = motionEvent.getPointerId(motionEvent.getActionIndex());
            return true;
        } else if (actionMasked == 1) {
            this.f141387k = -1;
            return true;
        } else if (motionEvent.getActionMasked() != 2 || motionEvent.getPointerId(motionEvent.getActionIndex()) != this.f141387k) {
            return false;
        } else {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(motionEvent.getActionIndex(), pointerCoords);
            this.f141386j = pointerCoords;
            b(((pointerCoords.y - this.f141386j.y) * this.f141384h) + this.f141385i, true);
            return true;
        }
    }

    public final void setDegrees(float f10) {
        b(f10, false);
    }

    public final void setListener(OnItemRotateListener onItemRotateListener) {
        C17542s.j(onItemRotateListener, "rotateListener");
        this.f141388l = onItemRotateListener;
    }
}
