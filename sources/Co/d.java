package Co;

import QJ.C16310i;
import QJ.C16311i0;
import QJ.M;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.location.Address;
import android.location.Geocoder;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LCo/d;", "LCo/f;", "Landroid/location/Geocoder;", "geocoder", "LQJ/M;", "workDispatcher", "<init>", "(Landroid/location/Geocoder;LQJ/M;)V", "", "locationName", "", "maxResults", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "Landroid/location/Geocoder;", "b", "LQJ/M;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Geocoder f79648a;

    /* renamed from: b  reason: collision with root package name */
    private final M f79649b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "Landroid/location/Address;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.util.GeocodeWrapper$getFromLocationName$2", f = "GeocodeWrapper.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super List<? extends Address>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f79650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f79651d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f79652e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f79653f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, String str, int i10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f79651d = dVar;
            this.f79652e = str;
            this.f79653f = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f79651d, this.f79652e, this.f79653f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super List<? extends Address>> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f79650c == 0) {
                y.b(obj);
                List<Address> fromLocationName = this.f79651d.f79648a.getFromLocationName(this.f79652e, this.f79653f);
                return fromLocationName == null ? C16877v.n() : fromLocationName;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public d(Geocoder geocoder, M m10) {
        C17542s.j(geocoder, "geocoder");
        C17542s.j(m10, "workDispatcher");
        this.f79648a = geocoder;
        this.f79649b = m10;
    }

    public Object a(String str, int i10, C17164e<? super List<? extends Address>> eVar) {
        return C16310i.g(this.f79649b, new a(this, str, i10, (C17164e<? super a>) null), eVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Geocoder geocoder, M m10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(geocoder, (i10 & 2) != 0 ? C16311i0.b() : m10);
    }
}
