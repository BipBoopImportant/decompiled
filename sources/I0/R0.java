package I0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jv\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LI0/R0;", "", "<init>", "()V", "Lp1/v0;", "checkedThumbColor", "checkedTrackColor", "", "checkedTrackAlpha", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "LI0/Q0;", "a", "(JJFJJFJJJJLU0/m;III)LI0/Q0;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class R0 {

    /* renamed from: a  reason: collision with root package name */
    public static final R0 f7503a = new R0();

    private R0() {
    }

    public final Q0 a(long j10, long j11, float f10, long j12, long j13, float f11, long j14, long j15, long j16, long j17, C4889m mVar, int i10, int i11, int i12) {
        long j18;
        long j19;
        long j20;
        int i13;
        long j21;
        long j22;
        long j23;
        C4889m mVar2 = mVar;
        int i14 = i12;
        long m10 = (i14 & 1) != 0 ? C4553d0.f7988a.a(mVar2, 6).m() : j10;
        long j24 = (i14 & 2) != 0 ? m10 : j11;
        float f12 = (i14 & 4) != 0 ? 0.54f : f10;
        long n10 = (i14 & 8) != 0 ? C4553d0.f7988a.a(mVar2, 6).n() : j12;
        long i15 = (i14 & 16) != 0 ? C4553d0.f7988a.a(mVar2, 6).i() : j13;
        float f13 = (i14 & 32) != 0 ? 0.38f : f11;
        if ((i14 & 64) != 0) {
            j18 = m10;
            j19 = C5751x0.h(C5747v0.o(m10, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), C4553d0.f7988a.a(mVar2, 6).n());
        } else {
            j18 = m10;
            j19 = j14;
        }
        if ((i14 & 128) != 0) {
            i13 = 6;
            j20 = j19;
            j21 = C5751x0.h(C5747v0.o(j24, C4578q.f8304a.b(mVar2, 6), 0.0f, 0.0f, 0.0f, 14, (Object) null), C4553d0.f7988a.a(mVar2, 6).n());
        } else {
            j20 = j19;
            i13 = 6;
            j21 = j15;
        }
        if ((i14 & 256) != 0) {
            i13 = 6;
            j22 = n10;
            j23 = C5751x0.h(C5747v0.o(n10, C4578q.f8304a.b(mVar2, i13), 0.0f, 0.0f, 0.0f, 14, (Object) null), C4553d0.f7988a.a(mVar2, 6).n());
        } else {
            j22 = n10;
            j23 = j16;
        }
        long h10 = (i14 & 512) != 0 ? C5751x0.h(C5747v0.o(i15, C4578q.f8304a.b(mVar2, i13), 0.0f, 0.0f, 0.0f, 14, (Object) null), C4553d0.f7988a.a(mVar2, 6).n()) : j17;
        if (C4895p.J()) {
            C4895p.S(-1032127534, i10, i11, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:344)");
        }
        C4593y yVar = new C4593y(j18, C5747v0.o(j24, f12, 0.0f, 0.0f, 0.0f, 14, (Object) null), j22, C5747v0.o(i15, f13, 0.0f, 0.0f, 0.0f, 14, (Object) null), j20, C5747v0.o(j21, f12, 0.0f, 0.0f, 0.0f, 14, (Object) null), j23, C5747v0.o(h10, f13, 0.0f, 0.0f, 0.0f, 14, (Object) null), (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        return yVar;
    }
}
