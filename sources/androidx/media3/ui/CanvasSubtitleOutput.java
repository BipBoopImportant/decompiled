package androidx.media3.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.a;
import w4.C8911a;

final class CanvasSubtitleOutput extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<z> f43109a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f43110b;

    /* renamed from: c  reason: collision with root package name */
    private int f43111c;

    /* renamed from: d  reason: collision with root package name */
    private float f43112d;

    /* renamed from: e  reason: collision with root package name */
    private C8911a f43113e;

    /* renamed from: f  reason: collision with root package name */
    private float f43114f;

    public CanvasSubtitleOutput(Context context) {
        this(context, (AttributeSet) null);
    }

    private static a b(a aVar) {
        a.b p10 = aVar.a().k(-3.4028235E38f).l(Integer.MIN_VALUE).p((Layout.Alignment) null);
        if (aVar.f29046f == 0) {
            p10.h(1.0f - aVar.f29045e, 0);
        } else {
            p10.h((-aVar.f29045e) - 1.0f, 1);
        }
        int i10 = aVar.f29047g;
        if (i10 == 0) {
            p10.i(2);
        } else if (i10 == 2) {
            p10.i(0);
        }
        return p10.a();
    }

    public void a(List<a> list, C8911a aVar, float f10, int i10, float f11) {
        this.f43110b = list;
        this.f43113e = aVar;
        this.f43112d = f10;
        this.f43111c = i10;
        this.f43114f = f11;
        while (this.f43109a.size() < list.size()) {
            this.f43109a.add(new z(getContext()));
        }
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        List<a> list = this.f43110b;
        if (!list.isEmpty()) {
            int height = getHeight();
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int paddingBottom = height - getPaddingBottom();
            if (paddingBottom > paddingTop && width > paddingLeft) {
                int i10 = paddingBottom - paddingTop;
                float h10 = C.h(this.f43111c, this.f43112d, height, i10);
                if (h10 > 0.0f) {
                    int size = list.size();
                    int i11 = 0;
                    while (i11 < size) {
                        a aVar = list.get(i11);
                        if (aVar.f29056p != Integer.MIN_VALUE) {
                            aVar = b(aVar);
                        }
                        a aVar2 = aVar;
                        int i12 = paddingBottom;
                        this.f43109a.get(i11).b(aVar2, this.f43113e, h10, C.h(aVar2.f29054n, aVar2.f29055o, height, i10), this.f43114f, canvas, paddingLeft, paddingTop, width, i12);
                        i11++;
                        size = size;
                        i10 = i10;
                        paddingBottom = i12;
                        width = width;
                    }
                }
            }
        }
    }

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43109a = new ArrayList();
        this.f43110b = Collections.emptyList();
        this.f43111c = 0;
        this.f43112d = 0.0533f;
        this.f43113e = C8911a.f57084g;
        this.f43114f = 0.08f;
    }
}
