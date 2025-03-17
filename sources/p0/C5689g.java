package p0;

import kotlin.Metadata;
import m0.C5546i;
import m0.C5548j;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp0/g;", "", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lm0/i;", "b", "()Lm0/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p0.g  reason: case insensitive filesystem */
public interface C5689g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f26999a = a.f27000a;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lp0/g$a;", "", "<init>", "()V", "", "offset", "size", "containerSize", "a", "(FFF)F", "Lm0/i;", "b", "Lm0/i;", "c", "()Lm0/i;", "DefaultScrollAnimationSpec", "Lp0/g;", "Lp0/g;", "()Lp0/g;", "DefaultBringIntoViewSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: p0.g$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f27000a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final C5546i<Float> f27001b = C5548j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);

        /* renamed from: c  reason: collision with root package name */
        private static final C5689g f27002c = new C0438a();

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p0/g$a$a", "Lp0/g;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: p0.g$a$a  reason: collision with other inner class name */
        public static final class C0438a implements C5689g {
            C0438a() {
            }
        }

        private a() {
        }

        public final float a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if ((f10 >= 0.0f && f13 <= f12) || (f10 < 0.0f && f13 > f12)) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
        }

        public final C5689g b() {
            return f27002c;
        }

        public final C5546i<Float> c() {
            return f27001b;
        }
    }

    float a(float f10, float f11, float f12) {
        return f26999a.a(f10, f11, f12);
    }

    C5546i<Float> b() {
        return f26999a.c();
    }
}
