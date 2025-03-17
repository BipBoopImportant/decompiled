package com.sugarcube.decorate.v2.internal;

import HK.C15864d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import fG.C17218a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\r¢\u0006\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020*8\u0002XD¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0016\u00103\u001a\u00020*8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020-048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\r078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010A\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/RotateControlView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attributeSet", "LXH/N;", "a", "(Landroid/util/AttributeSet;)V", "", "newDegrees", "", "invokeCallback", "b", "(FZ)V", "c", "()V", "e", "d", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/view/MotionEvent;", "event", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lcom/sugarcube/decorate/v2/internal/RotateControlView$OnItemRotateListener;", "rotateListener", "setListener", "(Lcom/sugarcube/decorate/v2/internal/RotateControlView$OnItemRotateListener;)V", "getIsVisible", "()Z", "getDegrees", "()F", "degs", "setDegrees", "(F)V", "", "Ljava/lang/String;", "valueFormatAttr", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "valueText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "ticks", "valueFormat", "", "Ljava/util/List;", "tickLabels", "", "f", "[Ljava/lang/Float;", "tickLabelYPositions", "g", "F", "tenDegreesToPx", "h", "pxToDegrees", "i", "degrees", "Landroid/view/MotionEvent$PointerCoords;", "j", "Landroid/view/MotionEvent$PointerCoords;", "ppc0", "", "k", "I", "ptrId", "l", "Lcom/sugarcube/decorate/v2/internal/RotateControlView$OnItemRotateListener;", "listener", "OnItemRotateListener", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RotateControlView extends LinearLayout implements View.OnTouchListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f142300a = "gmg_valueFormat";

    /* renamed from: b  reason: collision with root package name */
    private TextView f142301b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f142302c;

    /* renamed from: d  reason: collision with root package name */
    private String f142303d;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends TextView> f142304e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private Float[] f142305f = new Float[0];

    /* renamed from: g  reason: collision with root package name */
    private float f142306g;

    /* renamed from: h  reason: collision with root package name */
    private float f142307h;

    /* renamed from: i  reason: collision with root package name */
    private float f142308i = -720.0f;

    /* renamed from: j  reason: collision with root package name */
    private MotionEvent.PointerCoords f142309j = new MotionEvent.PointerCoords();

    /* renamed from: k  reason: collision with root package name */
    private int f142310k = -1;

    /* renamed from: l  reason: collision with root package name */
    private OnItemRotateListener f142311l;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/RotateControlView$OnItemRotateListener;", "", "", "newDegrees", "LXH/N;", "onValueChanged", "(F)V", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnItemRotateListener {
        void onValueChanged(float f10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RotateControlView(Context context) {
        super(context);
        C17542s.j(context, "ctx");
        a((AttributeSet) null);
    }

    private final void a(AttributeSet attributeSet) {
        C17218a b10 = C17218a.b(LayoutInflater.from(getContext()), this);
        C17542s.i(b10, "inflate(...)");
        if (attributeSet != null) {
            String attributeValue = attributeSet.getAttributeValue((String) null, this.f142300a);
            if (attributeValue == null) {
                attributeValue = "%d";
            }
            this.f142303d = attributeValue;
        }
        setOnTouchListener(this);
        setOnClickListener(this);
        this.f142301b = b10.f143152o;
        this.f142302c = b10.f143153p;
        ArrayList arrayList = new ArrayList();
        TextView textView = b10.f143142e;
        C17542s.i(textView, "rotatorTickLabel0");
        arrayList.add(textView);
        TextView textView2 = b10.f143143f;
        C17542s.i(textView2, "rotatorTickLabel1");
        arrayList.add(textView2);
        TextView textView3 = b10.f143144g;
        C17542s.i(textView3, "rotatorTickLabel2");
        arrayList.add(textView3);
        TextView textView4 = b10.f143145h;
        C17542s.i(textView4, "rotatorTickLabel3");
        arrayList.add(textView4);
        TextView textView5 = b10.f143146i;
        C17542s.i(textView5, "rotatorTickLabel4");
        arrayList.add(textView5);
        TextView textView6 = b10.f143147j;
        C17542s.i(textView6, "rotatorTickLabel5");
        arrayList.add(textView6);
        TextView textView7 = b10.f143148k;
        C17542s.i(textView7, "rotatorTickLabel6");
        arrayList.add(textView7);
        TextView textView8 = b10.f143149l;
        C17542s.i(textView8, "rotatorTickLabel7");
        arrayList.add(textView8);
        TextView textView9 = b10.f143150m;
        C17542s.i(textView9, "rotatorTickLabel8");
        arrayList.add(textView9);
        List<? extends TextView> W10 = C15864d.W(arrayList);
        this.f142304e = W10;
        int size = W10.size();
        Float[] fArr = new Float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = Float.valueOf(((TextView) this.f142304e.get(i10)).getTranslationY());
        }
        this.f142305f = fArr;
        float floatValue = fArr[1].floatValue() - this.f142305f[0].floatValue();
        this.f142306g = floatValue;
        this.f142307h = 10.0f / floatValue;
        b(0.0f, false);
    }

    private final void b(float f10, boolean z10) {
        OnItemRotateListener onItemRotateListener;
        float f11 = f10 / 360.0f;
        float signum = Math.signum(f10) * (Math.abs(f11) - ((float) ((int) Math.abs(f11)))) * 360.0f;
        if (this.f142308i != signum) {
            this.f142308i = signum;
            c();
            e();
            d();
            if (z10 && (onItemRotateListener = this.f142311l) != null) {
                onItemRotateListener.onValueChanged(getDegrees());
            }
        }
    }

    private final void c() {
        String str = ((int) this.f142308i) + "°";
        TextView textView = this.f142301b;
        if (textView == null) {
            C17542s.z("valueText");
            textView = null;
        }
        textView.setText(str);
    }

    private final void d() {
        ImageView imageView = this.f142302c;
        if (imageView == null) {
            C17542s.z("ticks");
            imageView = null;
        }
        float translationY = imageView.getTranslationY();
        int i10 = (int) this.f142308i;
        int i11 = ((i10 / 10) * 10) + 40;
        int size = this.f142304e.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((TextView) this.f142304e.get(i12)).setText(String.valueOf(((int) Math.signum((float) i11)) * (Math.abs(i11) % 360)));
            ((TextView) this.f142304e.get(i12)).setTranslationY(this.f142305f[i12].floatValue() + translationY);
            ((TextView) this.f142304e.get(i12)).setAlpha(Math.max(0.0f, Math.min(1.0f, ((float) Math.abs(i11 - i10)) * 0.1f)));
            i11 -= 10;
        }
    }

    private final void e() {
        float f10 = this.f142308i * 0.1f;
        float f11 = f10 - ((float) ((int) f10));
        ImageView imageView = this.f142302c;
        if (imageView == null) {
            C17542s.z("ticks");
            imageView = null;
        }
        imageView.setTranslationY(this.f142306g * f11);
    }

    public final float getDegrees() {
        return this.f142308i;
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
            this.f142309j.x = motionEvent.getX();
            this.f142309j.y = motionEvent.getY();
            this.f142310k = motionEvent.getPointerId(motionEvent.getActionIndex());
            return true;
        } else if (actionMasked == 1) {
            this.f142310k = -1;
            return true;
        } else if (motionEvent.getActionMasked() != 2 || motionEvent.getPointerId(motionEvent.getActionIndex()) != this.f142310k) {
            return false;
        } else {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(motionEvent.getActionIndex(), pointerCoords);
            this.f142309j = pointerCoords;
            b(((pointerCoords.y - this.f142309j.y) * this.f142307h) + this.f142308i, true);
            return true;
        }
    }

    public final void setDegrees(float f10) {
        b(f10, false);
    }

    public final void setListener(OnItemRotateListener onItemRotateListener) {
        C17542s.j(onItemRotateListener, "rotateListener");
        this.f142311l = onItemRotateListener;
    }
}
