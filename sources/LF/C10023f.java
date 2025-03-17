package lf;

import XH.t;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Llf/f;", "Landroidx/recyclerview/widget/RecyclerView$u;", "Llf/a;", "direction", "<init>", "(Llf/a;)V", "", "dx", "dy", "", "b", "(FF)Z", "Landroidx/recyclerview/widget/RecyclerView;", "rv", "Landroid/view/MotionEvent;", "e", "c", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "LXH/N;", "a", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", "ignore", "(Z)V", "Llf/a;", "Ljava/lang/Float;", "initialX", "initialY", "", "d", "Ljava/lang/Integer;", "touchSlop", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lf.f  reason: case insensitive filesystem */
public final class C10023f implements RecyclerView.u {

    /* renamed from: a  reason: collision with root package name */
    private final C10018a f75244a;

    /* renamed from: b  reason: collision with root package name */
    private Float f75245b;

    /* renamed from: c  reason: collision with root package name */
    private Float f75246c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f75247d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lf.f$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f75248a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                lf.a[] r0 = lf.C10018a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lf.a r1 = lf.C10018a.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lf.a r1 = lf.C10018a.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f75248a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.C10023f.a.<clinit>():void");
        }
    }

    public C10023f(C10018a aVar) {
        C17542s.j(aVar, "direction");
        this.f75244a = aVar;
    }

    private final boolean b(float f10, float f11) {
        int i10 = a.f75248a[this.f75244a.ordinal()];
        if (i10 == 1) {
            Integer num = this.f75247d;
            if (f11 > ((float) (num != null ? num.intValue() : 0)) && f11 > f10) {
                return true;
            }
        } else if (i10 == 2) {
            Integer num2 = this.f75247d;
            if (f10 > ((float) (num2 != null ? num2.intValue() : 0)) && f10 > f11) {
                return true;
            }
        } else {
            throw new t();
        }
        return false;
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C17542s.j(recyclerView, "rv");
        C17542s.j(motionEvent, "e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r6 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(androidx.recyclerview.widget.RecyclerView r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "rv"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            float r0 = r6.getRawX()
            float r1 = r6.getRawY()
            int r6 = r6.getActionMasked()
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L_0x0056
            if (r6 == r3) goto L_0x004e
            r3 = 2
            if (r6 == r3) goto L_0x0023
            r5 = 3
            if (r6 == r5) goto L_0x004e
            goto L_0x007b
        L_0x0023:
            java.lang.Float r6 = r4.f75245b
            r3 = 0
            if (r6 == 0) goto L_0x002d
            float r6 = r6.floatValue()
            goto L_0x002e
        L_0x002d:
            r6 = r3
        L_0x002e:
            float r0 = r0 - r6
            float r6 = java.lang.Math.abs(r0)
            java.lang.Float r0 = r4.f75246c
            if (r0 == 0) goto L_0x003b
            float r3 = r0.floatValue()
        L_0x003b:
            float r1 = r1 - r3
            float r0 = java.lang.Math.abs(r1)
            boolean r6 = r4.b(r6, r0)
            if (r6 == 0) goto L_0x007b
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L_0x007b
        L_0x004e:
            r5 = 0
            r4.f75245b = r5
            r4.f75246c = r5
            r4.f75247d = r5
            goto L_0x007b
        L_0x0056:
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r4.f75245b = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r4.f75246c = r6
            android.content.Context r6 = r5.getContext()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            int r6 = r6.getScaledTouchSlop()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.f75247d = r6
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r3)
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.C10023f.c(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public void e(boolean z10) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10023f(C10018a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C10018a.HORIZONTAL : aVar);
    }
}
