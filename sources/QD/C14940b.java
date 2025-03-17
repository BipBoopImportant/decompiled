package qD;

import com.ingka.ikea.userappointments.impl.models.remote.UserAppointmentsRemote;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;
import rD.C14995d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LqD/b;", "Lpp/c;", "LrD/d;", "Lcom/ingka/ikea/userappointments/impl/models/remote/UserAppointmentsRemote;", "LqD/a;", "appointmentToLocalMapper", "<init>", "(LqD/a;)V", "remote", "b", "(Lcom/ingka/ikea/userappointments/impl/models/remote/UserAppointmentsRemote;)LrD/d;", "a", "LqD/a;", "userappointments-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qD.b  reason: case insensitive filesystem */
public final class C14940b implements C11769c<C14995d, UserAppointmentsRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final C14939a f130401a;

    public C14940b(C14939a aVar) {
        C17542s.j(aVar, "appointmentToLocalMapper");
        this.f130401a = aVar;
    }

    /* renamed from: b */
    public C14995d a(UserAppointmentsRemote userAppointmentsRemote) {
        C17542s.j(userAppointmentsRemote, "remote");
        return new C14995d(this.f130401a.b(userAppointmentsRemote.b()));
    }
}
