package qD;

import com.ingka.ikea.userappointments.impl.models.remote.AppointmentRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;
import rD.C14992a;
import rD.C14993b;
import rD.C14994c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LqD/a;", "Lpp/c;", "LrD/a;", "Lcom/ingka/ikea/userappointments/impl/models/remote/AppointmentRemote;", "<init>", "()V", "remote", "c", "(Lcom/ingka/ikea/userappointments/impl/models/remote/AppointmentRemote;)LrD/a;", "userappointments-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qD.a  reason: case insensitive filesystem */
public final class C14939a implements C11769c<C14992a, AppointmentRemote> {
    public List<C14992a> b(List<AppointmentRemote> list) {
        return C11769c.a.a(this, list);
    }

    /* renamed from: c */
    public C14992a a(AppointmentRemote appointmentRemote) {
        C17542s.j(appointmentRemote, "remote");
        return new C14992a(appointmentRemote.n(), appointmentRemote.x(), appointmentRemote.A(), appointmentRemote.b(), appointmentRemote.m(), appointmentRemote.a(), appointmentRemote.g(), appointmentRemote.e(), appointmentRemote.k(), appointmentRemote.l(), appointmentRemote.i(), appointmentRemote.s(), appointmentRemote.f(), appointmentRemote.z(), appointmentRemote.v(), appointmentRemote.o(), appointmentRemote.c(), appointmentRemote.B() != null ? C14993b.Companion.a(appointmentRemote.B()) : null, appointmentRemote.C() != null ? C14994c.Companion.a(appointmentRemote.C()) : null, appointmentRemote.u(), appointmentRemote.q(), appointmentRemote.r(), appointmentRemote.h(), appointmentRemote.p(), appointmentRemote.t(), appointmentRemote.w(), appointmentRemote.d(), appointmentRemote.j(), appointmentRemote.y());
    }
}
