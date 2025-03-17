package com.sugarcube.app.base.ui.feedback;

import QE.C13432i;
import XH.t;
import YH.C16877v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wF.i;
import wF.j;
import wF.k;
import wF.l;
import wF.m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002&'B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "smile", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "rating", "LXH/N;", "N", "(Landroid/view/View;Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;)V", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$OnRatingSelectedListener;", "listener", "setListener", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$OnRatingSelectedListener;)V", "setRating", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;)V", "z", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$OnRatingSelectedListener;", "LQE/i;", "A", "LQE/i;", "binding", "", "Landroid/widget/ImageView;", "B", "Ljava/util/List;", "smileList", "C", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "currentRating", "a", "OnRatingSelectedListener", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeedbackSmileRatingBar extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    private C13432i f124165A;

    /* renamed from: B  reason: collision with root package name */
    private List<? extends ImageView> f124166B;

    /* renamed from: C  reason: collision with root package name */
    private a f124167C;

    /* renamed from: z  reason: collision with root package name */
    private OnRatingSelectedListener f124168z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$OnRatingSelectedListener;", "", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "rating", "LXH/N;", "onRatingSelected", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnRatingSelectedListener {
        void onRatingSelected(a aVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "", "", "rating", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "SAD", "DISSATISFIED", "NEUTRAL", "SATISFIED", "HAPPY", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        SAD(1),
        DISSATISFIED(2),
        NEUTRAL(3),
        SATISFIED(4),
        HAPPY(5);
        
        private final int rating;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(int i10) {
            this.rating = i10;
        }

        public final int b() {
            return this.rating;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124169a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a[] r0 = com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a r1 = com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.a.SAD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a r1 = com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.a.DISSATISFIED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a r1 = com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.a.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a r1 = com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.a.SATISFIED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar$a r1 = com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.a.HAPPY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f124169a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar.b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FeedbackSmileRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, (DefaultConstructorMarker) null);
        C17542s.j(context, "context");
    }

    /* access modifiers changed from: private */
    public static final void I(FeedbackSmileRatingBar feedbackSmileRatingBar, View view) {
        feedbackSmileRatingBar.N(view, a.SAD);
    }

    /* access modifiers changed from: private */
    public static final void J(FeedbackSmileRatingBar feedbackSmileRatingBar, View view) {
        feedbackSmileRatingBar.N(view, a.DISSATISFIED);
    }

    /* access modifiers changed from: private */
    public static final void K(FeedbackSmileRatingBar feedbackSmileRatingBar, View view) {
        feedbackSmileRatingBar.N(view, a.NEUTRAL);
    }

    /* access modifiers changed from: private */
    public static final void L(FeedbackSmileRatingBar feedbackSmileRatingBar, View view) {
        feedbackSmileRatingBar.N(view, a.SATISFIED);
    }

    /* access modifiers changed from: private */
    public static final void M(FeedbackSmileRatingBar feedbackSmileRatingBar, View view) {
        feedbackSmileRatingBar.N(view, a.HAPPY);
    }

    private final void N(View view, a aVar) {
        this.f124167C = aVar;
        List<? extends ImageView> list = this.f124166B;
        if (list != null) {
            for (ImageView imageView : list) {
                imageView.setSelected(false);
                imageView.setActivated(true);
            }
        }
        if (view != null) {
            view.setSelected(true);
        }
        OnRatingSelectedListener onRatingSelectedListener = this.f124168z;
        if (onRatingSelectedListener != null) {
            onRatingSelectedListener.onRatingSelected(aVar);
        }
    }

    public final void setListener(OnRatingSelectedListener onRatingSelectedListener) {
        C17542s.j(onRatingSelectedListener, "listener");
        this.f124168z = onRatingSelectedListener;
    }

    public final void setRating(a aVar) {
        C17542s.j(aVar, "rating");
        int i10 = b.f124169a[aVar.ordinal()];
        ImageView imageView = null;
        if (i10 == 1) {
            C13432i iVar = this.f124165A;
            if (iVar != null) {
                imageView = iVar.f114600e;
            }
        } else if (i10 == 2) {
            C13432i iVar2 = this.f124165A;
            if (iVar2 != null) {
                imageView = iVar2.f114597b;
            }
        } else if (i10 == 3) {
            C13432i iVar3 = this.f124165A;
            if (iVar3 != null) {
                imageView = iVar3.f114599d;
            }
        } else if (i10 == 4) {
            C13432i iVar4 = this.f124165A;
            if (iVar4 != null) {
                imageView = iVar4.f114601f;
            }
        } else if (i10 == 5) {
            C13432i iVar5 = this.f124165A;
            if (iVar5 != null) {
                imageView = iVar5.f114598c;
            }
        } else {
            throw new t();
        }
        N(imageView, aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FeedbackSmileRatingBar(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackSmileRatingBar(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        C17542s.j(context, "context");
        C13432i c10 = C13432i.c(LayoutInflater.from(context), this, true);
        this.f124166B = C16877v.t(c10.f114600e, c10.f114597b, c10.f114599d, c10.f114601f, c10.f114598c);
        c10.f114600e.setOnClickListener(new i(this));
        c10.f114597b.setOnClickListener(new j(this));
        c10.f114599d.setOnClickListener(new k(this));
        c10.f114601f.setOnClickListener(new l(this));
        c10.f114598c.setOnClickListener(new m(this));
        this.f124165A = c10;
    }
}
