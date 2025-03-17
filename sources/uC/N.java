package Uc;

import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import qa.j;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nRG\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012RG\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188F@FX\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0014\u0010\u0019\"\u0004\b\u001a\u0010\u001bR;\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00182\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188F@FX\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bRG\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0007\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012RG\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8F@FX\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0007\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"LUc/N;", "", "<init>", "()V", "LUc/x;", "<set-?>", "a", "LU0/r0;", "()LUc/x;", "h", "(LUc/x;)V", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "LXH/N;", "b", "()LnI/l;", "i", "(LnI/l;)V", "onMapClick", "c", "d", "k", "onMapLongClick", "Lkotlin/Function0;", "()LnI/a;", "j", "(LnI/a;)V", "onMapLoaded", "", "e", "l", "onMyLocationButtonClick", "Landroid/location/Location;", "f", "m", "onMyLocationClick", "Lqa/j;", "g", "n", "onPOIClick", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final C4899r0 f64178a = u1.e(C9315m.f64340a, (o1) null, 2, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f64179b = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f64180c = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f64181d = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f64182e = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f64183f = u1.e((Object) null, (o1) null, 2, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private final C4899r0 f64184g = u1.e((Object) null, (o1) null, 2, (Object) null);

    public final C9336x a() {
        return (C9336x) this.f64178a.getValue();
    }

    public final C17642l<LatLng, C16807N> b() {
        return (C17642l) this.f64179b.getValue();
    }

    public final C17631a<C16807N> c() {
        return (C17631a) this.f64181d.getValue();
    }

    public final C17642l<LatLng, C16807N> d() {
        return (C17642l) this.f64180c.getValue();
    }

    public final C17631a<Boolean> e() {
        return (C17631a) this.f64182e.getValue();
    }

    public final C17642l<Location, C16807N> f() {
        return (C17642l) this.f64183f.getValue();
    }

    public final C17642l<j, C16807N> g() {
        return (C17642l) this.f64184g.getValue();
    }

    public final void h(C9336x xVar) {
        C17542s.j(xVar, "<set-?>");
        this.f64178a.setValue(xVar);
    }

    public final void i(C17642l<? super LatLng, C16807N> lVar) {
        this.f64179b.setValue(lVar);
    }

    public final void j(C17631a<C16807N> aVar) {
        this.f64181d.setValue(aVar);
    }

    public final void k(C17642l<? super LatLng, C16807N> lVar) {
        this.f64180c.setValue(lVar);
    }

    public final void l(C17631a<Boolean> aVar) {
        this.f64182e.setValue(aVar);
    }

    public final void m(C17642l<? super Location, C16807N> lVar) {
        this.f64183f.setValue(lVar);
    }

    public final void n(C17642l<? super j, C16807N> lVar) {
        this.f64184g.setValue(lVar);
    }
}
