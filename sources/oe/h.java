package Oe;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020&0\u001f8\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"LOe/h;", "Landroidx/lifecycle/f0;", "LNe/a;", "fetchPlacesUseCase", "<init>", "(LNe/a;)V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "", "locationRestriction", "", "countryCode", "componentValue", "LXH/N;", "I", "(Lcom/google/android/gms/maps/model/LatLngBounds;ZLjava/lang/String;Ljava/lang/String;)V", "text", "J", "(Ljava/lang/String;)V", "LOe/a;", "addressAndPlaceId", "F", "(LOe/a;)V", "m", "LNe/a;", "Landroidx/lifecycle/K;", "", "LJe/d;", "n", "Landroidx/lifecycle/K;", "_sections", "Landroidx/lifecycle/F;", "o", "Landroidx/lifecycle/F;", "H", "()Landroidx/lifecycle/F;", "sections", "Lip/b;", "LOe/l;", "p", "Lip/b;", "_addressSelected", "q", "G", "addressSelected", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "r", "Lcom/google/android/libraries/places/api/model/RectangularBounds;", "bounds", "s", "Z", "t", "Ljava/lang/String;", "u", "LQJ/F0;", "v", "LQJ/F0;", "job", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ne.a f62205m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final K<List<Je.d>> f62206n;

    /* renamed from: o  reason: collision with root package name */
    private final F<List<Je.d>> f62207o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11410b<l> f62208p;

    /* renamed from: q  reason: collision with root package name */
    private final F<l> f62209q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public RectangularBounds f62210r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f62211s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public String f62212t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public String f62213u;

    /* renamed from: v  reason: collision with root package name */
    private F0 f62214v;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Oe/h$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f62215a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, h hVar) {
            super(aVar);
            this.f62215a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            h hVar = this.f62215a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to find place details", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.viewmodels.AddressPickerViewModel$fetchPlaceDetails$2", f = "AddressPickerViewModel.kt", l = {93}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f62216c;

        /* renamed from: d  reason: collision with root package name */
        int f62217d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f62218e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f62219f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f62218e = hVar;
            this.f62219f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f62218e, this.f62219f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object f10 = C17187b.f();
            int i10 = this.f62217d;
            if (i10 == 0) {
                y.b(obj);
                Ne.a k10 = this.f62218e.f62205m;
                a aVar = this.f62219f;
                String i11 = this.f62218e.f62213u;
                if (i11 == null) {
                    C17542s.z("componentValue");
                    str = null;
                } else {
                    str = i11;
                }
                this.f62216c = i11;
                this.f62217d = 1;
                obj = k10.b(aVar, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str2 = (String) this.f62216c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f62218e.f62208p.d((l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Oe/h$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f62220a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, h hVar) {
            super(aVar);
            this.f62220a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            h hVar = this.f62220a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to find autocomplete predictions", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.viewmodels.AddressPickerViewModel$setAddressPredictions$2", f = "AddressPickerViewModel.kt", l = {66, 68}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f62221c;

        /* renamed from: d  reason: collision with root package name */
        int f62222d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f62223e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f62224f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar, String str, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f62223e = hVar;
            this.f62224f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f62223e, this.f62224f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0090 A[LOOP:0: B:23:0x008a->B:25:0x0090, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f62222d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                java.lang.Object r0 = r10.f62221c
                java.lang.String r0 = (java.lang.String) r0
                XH.y.b(r11)
                goto L_0x0071
            L_0x0016:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001e:
                XH.y.b(r11)
                goto L_0x0030
            L_0x0022:
                XH.y.b(r11)
                r10.f62222d = r3
                r3 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r11 = QJ.C16297b0.b(r3, r10)
                if (r11 != r0) goto L_0x0030
                return r0
            L_0x0030:
                Oe.h r11 = r10.f62223e
                Ne.a r3 = r11.f62205m
                java.lang.String r4 = r10.f62224f
                Oe.h r11 = r10.f62223e
                boolean r5 = r11.f62211s
                Oe.h r11 = r10.f62223e
                com.google.android.libraries.places.api.model.RectangularBounds r6 = r11.f62210r
                Oe.h r11 = r10.f62223e
                java.lang.String r11 = r11.f62212t
                r1 = 0
                if (r11 != 0) goto L_0x0054
                java.lang.String r11 = "countryCode"
                kotlin.jvm.internal.C17542s.z(r11)
                r7 = r1
                goto L_0x0055
            L_0x0054:
                r7 = r11
            L_0x0055:
                Oe.h r11 = r10.f62223e
                java.lang.String r11 = r11.f62213u
                if (r11 != 0) goto L_0x0064
                java.lang.String r8 = "componentValue"
                kotlin.jvm.internal.C17542s.z(r8)
                r8 = r1
                goto L_0x0065
            L_0x0064:
                r8 = r11
            L_0x0065:
                r10.f62221c = r11
                r10.f62222d = r2
                r9 = r10
                java.lang.Object r11 = r3.c(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L_0x0071
                return r0
            L_0x0071:
                java.util.List r11 = (java.util.List) r11
                Oe.h r0 = r10.f62223e
                androidx.lifecycle.K r0 = r0.f62206n
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = YH.C16877v.y(r11, r2)
                r1.<init>(r2)
                java.util.Iterator r11 = r11.iterator()
            L_0x008a:
                boolean r2 = r11.hasNext()
                if (r2 == 0) goto L_0x00ab
                java.lang.Object r2 = r11.next()
                Pe.d$a r2 = (Pe.d.a) r2
                Je.d r3 = new Je.d
                java.lang.String r4 = r2.a()
                java.lang.String r5 = r2.c()
                java.lang.String r2 = r2.b()
                r3.<init>(r4, r5, r2)
                r1.add(r3)
                goto L_0x008a
            L_0x00ab:
                r0.postValue(r1)
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Oe.h.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(Ne.a aVar) {
        C17542s.j(aVar, "fetchPlacesUseCase");
        this.f62205m = aVar;
        K<List<Je.d>> k10 = new K<>();
        this.f62206n = k10;
        this.f62207o = k10;
        C11410b<l> bVar = new C11410b<>();
        this.f62208p = bVar;
        this.f62209q = bVar;
    }

    public final void F(a aVar) {
        C17542s.j(aVar, "addressAndPlaceId");
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, aVar, (C17164e<? super b>) null), 2, (Object) null);
    }

    public final F<l> G() {
        return this.f62209q;
    }

    public final F<List<Je.d>> H() {
        return this.f62207o;
    }

    public final void I(LatLngBounds latLngBounds, boolean z10, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "countryCode");
        C17542s.j(str4, "componentValue");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        RectangularBounds rectangularBounds = null;
        String str5 = null;
        String str6 = null;
        for (C11819b bVar : arrayList) {
            if (str5 == null) {
                String a10 = C11818a.a("initialize with countryCode=" + str3, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            }
            String str7 = str5;
            if (str6 == null) {
                String name = h.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str8 = str6;
            bVar.a(eVar, str8, false, (Throwable) null, str7);
            str5 = str7;
            str6 = str8;
        }
        if (latLngBounds != null) {
            rectangularBounds = RectangularBounds.newInstance(latLngBounds);
        }
        this.f62210r = rectangularBounds;
        this.f62211s = z10;
        this.f62212t = str3;
        this.f62213u = str4;
    }

    public final void J(String str) {
        C17542s.j(str, "text");
        F0 f02 = this.f62214v;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f62214v = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new d(this, str, (C17164e<? super d>) null), 2, (Object) null);
    }
}
