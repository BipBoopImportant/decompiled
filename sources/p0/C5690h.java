package p0;

import U0.C4908w;
import U0.C4910x;
import U0.I0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import m0.C5546i;
import m0.C5548j;
import m0.C5568x;
import nI.C17642l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\"&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008GX\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0002\u0010\u0004\" \u0010\f\u001a\u00020\u00018\u0000X\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"LU0/I0;", "Lp0/g;", "a", "LU0/I0;", "()LU0/I0;", "getLocalBringIntoViewSpec$annotations", "()V", "LocalBringIntoViewSpec", "b", "Lp0/g;", "()Lp0/g;", "getPivotBringIntoViewSpec$annotations", "PivotBringIntoViewSpec", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.h  reason: case insensitive filesystem */
public final class C5690h {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5689g> f27003a = C4910x.e(a.f27005c);

    /* renamed from: b  reason: collision with root package name */
    private static final C5689g f27004b = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/w;", "Lp0/g;", "a", "(LU0/w;)Lp0/g;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: p0.h$a */
    static final class a extends C17544u implements C17642l<C4908w, C5689g> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f27005c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final C5689g invoke(C4908w wVar) {
            return !((Context) wVar.j(AndroidCompositionLocals_androidKt.g())).getPackageManager().hasSystemFeature("android.software.leanback") ? C5689g.f26999a.b() : C5690h.b();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"p0/h$b", "Lp0/g;", "", "offset", "size", "containerSize", "a", "(FFF)F", "b", "F", "getParentFraction", "()F", "parentFraction", "c", "getChildFraction", "childFraction", "Lm0/i;", "d", "Lm0/i;", "()Lm0/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.h$b */
    public static final class b implements C5689g {

        /* renamed from: b  reason: collision with root package name */
        private final float f27006b = 0.3f;

        /* renamed from: c  reason: collision with root package name */
        private final float f27007c;

        /* renamed from: d  reason: collision with root package name */
        private final C5546i<Float> f27008d = C5548j.j(125, 0, new C5568x(0.25f, 0.1f, 0.25f, 1.0f), 2, (Object) null);

        b() {
        }

        public float a(float f10, float f11, float f12) {
            float abs = Math.abs((f11 + f10) - f10);
            boolean z10 = abs <= f12;
            float f13 = (this.f27006b * f12) - (this.f27007c * abs);
            float f14 = f12 - f13;
            if (z10 && f14 < abs) {
                f13 = f12 - abs;
            }
            return f10 - f13;
        }

        public C5546i<Float> b() {
            return this.f27008d;
        }
    }

    public static final I0<C5689g> a() {
        return f27003a;
    }

    public static final C5689g b() {
        return f27004b;
    }
}
