package ap;

import HJ.C15854t;
import SJ.C16440p;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import na.C8594c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lap/g;", "Lap/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "useCachedLocationIfAvailable", "LTJ/g;", "LXH/x;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "a", "(Z)LTJ/g;", "Landroid/content/Context;", "b", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f90377b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f90378c = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f90379a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lap/g$a;", "", "<init>", "()V", "", "LOCATION_REQUEST_INTERVAL_MILLIS", "J", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSJ/y;", "LXH/x;", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.core.android.location.GetUserLocationUseCaseImpl$invoke$1", f = "GetUserLocationUseCase.kt", l = {51, 82}, m = "invokeSuspend")
    static final class b extends l implements p<C16449y<? super x<? extends LocationLatLng>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f90380c;

        /* renamed from: d  reason: collision with root package name */
        Object f90381d;

        /* renamed from: e  reason: collision with root package name */
        Object f90382e;

        /* renamed from: f  reason: collision with root package name */
        int f90383f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f90384g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ g f90385h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f90386i;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"ap/g$b$a", "Lna/f;", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "LXH/N;", "b", "(Lcom/google/android/gms/location/LocationResult;)V", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends na.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16449y<x<LocationLatLng>> f90387a;

            a(C16449y<? super x<LocationLatLng>> yVar) {
                this.f90387a = yVar;
            }

            public void b(LocationResult locationResult) {
                C17542s.j(locationResult, "locationResult");
                Location x10 = locationResult.x();
                LocationLatLng locationLatLng = x10 != null ? new LocationLatLng(x10.getLatitude(), x10.getLongitude()) : null;
                if (locationLatLng != null) {
                    C16440p.b(this.f90387a, x.a(x.b(locationLatLng)));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, boolean z10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f90385h = gVar;
            this.f90386i = z10;
        }

        /* access modifiers changed from: private */
        public static final void m(C16449y yVar, Exception exc) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("failed to get location updates", exc);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = yVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, exc, str3);
                str = str3;
                str2 = str4;
            }
            x.a aVar = x.f139812b;
            C17542s.g(exc);
            C16440p.b(yVar, x.a(x.b(y.a(exc))));
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C8594c cVar, a aVar) {
            cVar.c(aVar);
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f90385h, this.f90386i, eVar);
            bVar.f90384g = obj;
            return bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: SJ.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00d1 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f90383f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x003f
                if (r1 == r3) goto L_0x002b
                if (r1 != r2) goto L_0x0023
                java.lang.Object r0 = r10.f90382e
                ap.g$b$a r0 = (ap.g.b.a) r0
                java.lang.Object r0 = r10.f90381d
                com.google.android.gms.location.LocationRequest r0 = (com.google.android.gms.location.LocationRequest) r0
                java.lang.Object r0 = r10.f90380c
                na.c r0 = (na.C8594c) r0
                java.lang.Object r0 = r10.f90384g
                SJ.y r0 = (SJ.C16449y) r0
                XH.y.b(r11)
                goto L_0x00d2
            L_0x0023:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x002b:
                java.lang.Object r1 = r10.f90382e
                xa.l r1 = (xa.C8971l) r1
                java.lang.Object r1 = r10.f90381d
                na.c r1 = (na.C8594c) r1
                java.lang.Object r1 = r10.f90380c
                na.c r1 = (na.C8594c) r1
                java.lang.Object r4 = r10.f90384g
                SJ.y r4 = (SJ.C16449y) r4
                XH.y.b(r11)
                goto L_0x0074
            L_0x003f:
                XH.y.b(r11)
                java.lang.Object r11 = r10.f90384g
                r4 = r11
                SJ.y r4 = (SJ.C16449y) r4
                ap.g r11 = r10.f90385h
                android.content.Context r11 = r11.f90379a
                na.c r1 = na.g.b(r11)
                java.lang.String r11 = "getFusedLocationProviderClient(...)"
                kotlin.jvm.internal.C17542s.i(r1, r11)
                boolean r11 = r10.f90386i
                if (r11 == 0) goto L_0x0094
                xa.l r11 = r1.f()
                java.lang.String r5 = "getLastLocation(...)"
                kotlin.jvm.internal.C17542s.i(r11, r5)
                r10.f90384g = r4
                r10.f90380c = r1
                r10.f90381d = r1
                r10.f90382e = r11
                r10.f90383f = r3
                java.lang.Object r11 = cK.C17078d.g(r11, r10)
                if (r11 != r0) goto L_0x0074
                return r0
            L_0x0074:
                android.location.Location r11 = (android.location.Location) r11
                if (r11 == 0) goto L_0x0094
                com.ingka.ikea.appconfig.model.LocationLatLng r5 = new com.ingka.ikea.appconfig.model.LocationLatLng
                double r6 = r11.getLatitude()
                double r8 = r11.getLongitude()
                r5.<init>(r6, r8)
                java.lang.Object r11 = XH.x.b(r5)
                XH.x r11 = XH.x.a(r11)
                java.lang.Object r11 = SJ.C16440p.b(r4, r11)
                SJ.C16438n.b(r11)
            L_0x0094:
                com.google.android.gms.location.LocationRequest$a r11 = new com.google.android.gms.location.LocationRequest$a
                r5 = 100
                r6 = 100
                r11.<init>(r5, r6)
                com.google.android.gms.location.LocationRequest$a r11 = r11.k(r3)
                com.google.android.gms.location.LocationRequest r11 = r11.a()
                java.lang.String r3 = "build(...)"
                kotlin.jvm.internal.C17542s.i(r11, r3)
                ap.g$b$a r3 = new ap.g$b$a
                r3.<init>(r4)
                r5 = 0
                xa.l r5 = r1.b(r11, r3, r5)
                ap.h r6 = new ap.h
                r6.<init>(r4)
                r5.e(r6)
                ap.i r5 = new ap.i
                r5.<init>(r1, r3)
                r10.f90384g = r4
                r10.f90380c = r1
                r10.f90381d = r11
                r10.f90382e = r3
                r10.f90383f = r2
                java.lang.Object r11 = SJ.C16447w.a(r4, r5, r10)
                if (r11 != r0) goto L_0x00d2
                return r0
            L_0x00d2:
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ap.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: k */
        public final Object invoke(C16449y<? super x<LocationLatLng>> yVar, C17164e<? super C16807N> eVar) {
            return ((b) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    public g(Context context) {
        C17542s.j(context, "context");
        this.f90379a = context;
    }

    @SuppressLint({"MissingPermission"})
    public C16532g<x<LocationLatLng>> a(boolean z10) {
        return C16534i.f(new b(this, z10, (C17164e<? super b>) null));
    }
}
