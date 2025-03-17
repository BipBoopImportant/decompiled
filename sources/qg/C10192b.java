package qg;

import HJ.C15854t;
import XH.C16807N;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ingka.ikea.dynamicfields.datalayer.Conditions;
import com.ingka.ikea.dynamicfields.datalayer.KeyValue;
import com.ingka.ikea.dynamicfields.datalayer.b;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b/\b\b\u0018\u0000 /2\u00020\u0001:\u0004NOPQB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010'\u001a\u0004\bF\u0010\u001dR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b8\u0016X\u0004¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\b)\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\bH\u0010'\u001a\u0004\bI\u0010\u001dR(\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0014X\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lqg/b;", "Lqg/x;", "", "key", "targetKey", "title", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "inputType", "", "Lqg/y;", "validation", "", "addressPickerData", "Lqg/b$a;", "addressPickerBounds", "Lqg/b$d;", "cursorFocusMode", "Lqg/b$b;", "pickerType", "countryCode", "Lcom/ingka/ikea/dynamicfields/datalayer/Conditions;", "visibility", "textAsCollapsed", "Lkotlin/Function1;", "LXH/N;", "onChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/b;Ljava/util/List;Ljava/util/Map;Lqg/b$a;Lqg/b$d;Lqg/b$b;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LnI/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "j", "Ljava/lang/String;", "e", "k", "g", "l", "x", "m", "Lcom/ingka/ikea/dynamicfields/datalayer/b;", "w", "()Lcom/ingka/ikea/dynamicfields/datalayer/b;", "n", "Ljava/util/List;", "i", "()Ljava/util/List;", "o", "Ljava/util/Map;", "z", "()Ljava/util/Map;", "p", "Lqg/b$a;", "y", "()Lqg/b$a;", "q", "Lqg/b$d;", "B", "()Lqg/b$d;", "r", "Lqg/b$b;", "C", "()Lqg/b$b;", "s", "A", "t", "u", "h", "v", "LnI/l;", "f", "()LnI/l;", "c", "a", "d", "b", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qg.b  reason: case insensitive filesystem */
public final class C10192b extends x {

    /* renamed from: w  reason: collision with root package name */
    public static final c f76065w = new c((DefaultConstructorMarker) null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f76066x = 8;

    /* renamed from: j  reason: collision with root package name */
    private final String f76067j;

    /* renamed from: k  reason: collision with root package name */
    private final String f76068k;

    /* renamed from: l  reason: collision with root package name */
    private final String f76069l;

    /* renamed from: m  reason: collision with root package name */
    private final b f76070m;

    /* renamed from: n  reason: collision with root package name */
    private final List<y> f76071n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, String> f76072o;

    /* renamed from: p  reason: collision with root package name */
    private final a f76073p;

    /* renamed from: q  reason: collision with root package name */
    private final d f76074q;

    /* renamed from: r  reason: collision with root package name */
    private final C1401b f76075r;

    /* renamed from: s  reason: collision with root package name */
    private final String f76076s;

    /* renamed from: t  reason: collision with root package name */
    private final List<Conditions> f76077t;

    /* renamed from: u  reason: collision with root package name */
    private final String f76078u;

    /* renamed from: v  reason: collision with root package name */
    private final C17642l<String, C16807N> f76079v;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lqg/b$a;", "", "Lcom/google/android/gms/maps/model/LatLngBounds;", "addressPickerBounds", "", "restrictPickerToBounds", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "b", "Z", "()Z", "c", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qg.b$a */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C1400a f76080c = new C1400a((DefaultConstructorMarker) null);

        /* renamed from: d  reason: collision with root package name */
        public static final int f76081d = 8;

        /* renamed from: a  reason: collision with root package name */
        private final LatLngBounds f76082a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f76083b;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqg/b$a$a;", "", "<init>", "()V", "", "southwestLat", "southwestLng", "northeastLat", "northeastLng", "Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/google/android/gms/maps/model/LatLngBounds;", "", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyValue;", "data", "Lqg/b$a;", "b", "(Ljava/util/List;)Lqg/b$a;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qg.b$a$a  reason: collision with other inner class name */
        public static final class C1400a {
            public /* synthetic */ C1400a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final LatLngBounds a(Double d10, Double d11, Double d12, Double d13) {
                if (d10 != null && d11 != null) {
                    if (d12 != null && d13 != null) {
                        return new LatLngBounds(new LatLng(d10.doubleValue(), d11.doubleValue()), new LatLng(d12.doubleValue(), d13.doubleValue()));
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Northeast coordinates are null but northeast exists");
                    e eVar = e.ERROR;
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
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        if (str2 == null) {
                            String name = C1400a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        bVar.a(eVar, str2, false, illegalArgumentException, str);
                    }
                }
                return null;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
                r1 = r2.c();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final qg.C10192b.a b(java.util.List<com.ingka.ikea.dynamicfields.datalayer.KeyValue> r13) {
                /*
                    r12 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.C17542s.j(r13, r0)
                    r0 = 0
                    r1 = r13
                    java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.util.Iterator r1 = r1.iterator()     // Catch:{ IllegalArgumentException -> 0x0027 }
                L_0x000d:
                    boolean r2 = r1.hasNext()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r2 == 0) goto L_0x002a
                    java.lang.Object r2 = r1.next()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r3 = r2
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r3 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r3     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r3 = r3.b()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r4 = "AddressPickerRestrictedToBounds"
                    boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r3 == 0) goto L_0x000d
                    goto L_0x002b
                L_0x0027:
                    r13 = move-exception
                    goto L_0x0120
                L_0x002a:
                    r2 = r0
                L_0x002b:
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r2 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r2     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r2 == 0) goto L_0x003a
                    java.lang.String r1 = r2.c()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r1 == 0) goto L_0x003a
                    boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    goto L_0x003b
                L_0x003a:
                    r1 = 0
                L_0x003b:
                    r2 = r13
                    java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x0027 }
                L_0x0042:
                    boolean r3 = r2.hasNext()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r3 == 0) goto L_0x005c
                    java.lang.Object r3 = r2.next()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r4 = r3
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r4 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r4     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r4 = r4.b()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r5 = "AddressPickerSouthwestLat"
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r4 == 0) goto L_0x0042
                    goto L_0x005d
                L_0x005c:
                    r3 = r0
                L_0x005d:
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r3 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r3     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r3 == 0) goto L_0x0070
                    java.lang.String r2 = r3.c()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r2 == 0) goto L_0x0070
                    double r2 = java.lang.Double.parseDouble(r2)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    goto L_0x0071
                L_0x0070:
                    r2 = r0
                L_0x0071:
                    r3 = r13
                    java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0027 }
                L_0x0078:
                    boolean r4 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r4 == 0) goto L_0x0092
                    java.lang.Object r4 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r5 = r4
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r5 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r5     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r5 = r5.b()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r6 = "AddressPickerSouthwestLng"
                    boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r5 == 0) goto L_0x0078
                    goto L_0x0093
                L_0x0092:
                    r4 = r0
                L_0x0093:
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r4 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r4     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r4 == 0) goto L_0x00a6
                    java.lang.String r3 = r4.c()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r3 == 0) goto L_0x00a6
                    double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    goto L_0x00a7
                L_0x00a6:
                    r3 = r0
                L_0x00a7:
                    r4 = r13
                    java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.util.Iterator r4 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x0027 }
                L_0x00ae:
                    boolean r5 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r5 == 0) goto L_0x00c8
                    java.lang.Object r5 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r6 = r5
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r6 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r6     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r6 = r6.b()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r7 = "AddressPickerNortheastLat"
                    boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r6 == 0) goto L_0x00ae
                    goto L_0x00c9
                L_0x00c8:
                    r5 = r0
                L_0x00c9:
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r5 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r5     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r5 == 0) goto L_0x00dc
                    java.lang.String r4 = r5.c()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r4 == 0) goto L_0x00dc
                    double r4 = java.lang.Double.parseDouble(r4)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    goto L_0x00dd
                L_0x00dc:
                    r4 = r0
                L_0x00dd:
                    java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.util.Iterator r13 = r13.iterator()     // Catch:{ IllegalArgumentException -> 0x0027 }
                L_0x00e3:
                    boolean r5 = r13.hasNext()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r5 == 0) goto L_0x00fd
                    java.lang.Object r5 = r13.next()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r6 = r5
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r6 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r6     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r6 = r6.b()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.String r7 = "AddressPickerNortheastLng"
                    boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r6 == 0) goto L_0x00e3
                    goto L_0x00fe
                L_0x00fd:
                    r5 = r0
                L_0x00fe:
                    com.ingka.ikea.dynamicfields.datalayer.KeyValue r5 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r5     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r5 == 0) goto L_0x0111
                    java.lang.String r13 = r5.c()     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r13 == 0) goto L_0x0111
                    double r5 = java.lang.Double.parseDouble(r13)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    java.lang.Double r13 = java.lang.Double.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    goto L_0x0112
                L_0x0111:
                    r13 = r0
                L_0x0112:
                    com.google.android.gms.maps.model.LatLngBounds r13 = r12.a(r2, r3, r4, r13)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    if (r13 == 0) goto L_0x01ca
                    qg.b$a r2 = new qg.b$a     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r2.<init>(r13, r1)     // Catch:{ IllegalArgumentException -> 0x0027 }
                    r0 = r2
                    goto L_0x01ca
                L_0x0120:
                    qv.e r7 = qv.e.ERROR
                    qv.d r1 = qv.d.f102012a
                    java.util.List r1 = r1.a()
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r1 = r1.iterator()
                L_0x0133:
                    boolean r3 = r1.hasNext()
                    r8 = 0
                    if (r3 == 0) goto L_0x014b
                    java.lang.Object r3 = r1.next()
                    r4 = r3
                    qv.b r4 = (qv.C11819b) r4
                    boolean r4 = r4.b(r7, r8)
                    if (r4 == 0) goto L_0x0133
                    r2.add(r3)
                    goto L_0x0133
                L_0x014b:
                    java.util.Iterator r9 = r2.iterator()
                    r1 = r0
                    r2 = r1
                L_0x0151:
                    boolean r3 = r9.hasNext()
                    if (r3 == 0) goto L_0x01ca
                    java.lang.Object r3 = r9.next()
                    qv.b r3 = (qv.C11819b) r3
                    if (r1 != 0) goto L_0x016d
                    java.lang.String r1 = "Faulty coordinates"
                    java.lang.String r1 = qv.C11818a.a(r1, r13)
                    if (r1 != 0) goto L_0x0169
                    goto L_0x01ca
                L_0x0169:
                    java.lang.String r1 = qv.C11820c.a(r1)
                L_0x016d:
                    r10 = r1
                    if (r2 != 0) goto L_0x01bd
                    java.lang.Class<qg.b$a$a> r1 = qg.C10192b.a.C1400a.class
                    java.lang.String r1 = r1.getName()
                    kotlin.jvm.internal.C17542s.g(r1)
                    r2 = 36
                    r4 = 2
                    java.lang.String r2 = HJ.C15854t.s1(r1, r2, r0, r4, r0)
                    r5 = 46
                    java.lang.String r2 = HJ.C15854t.o1(r2, r5, r0, r4, r0)
                    int r4 = r2.length()
                    if (r4 != 0) goto L_0x018d
                    goto L_0x0193
                L_0x018d:
                    java.lang.String r1 = "Kt"
                    java.lang.String r1 = HJ.C15854t.P0(r2, r1)
                L_0x0193:
                    java.lang.Thread r2 = java.lang.Thread.currentThread()
                    java.lang.String r2 = r2.getName()
                    java.lang.String r4 = "main"
                    r5 = 1
                    boolean r2 = HJ.C15854t.b0(r2, r4, r5)
                    if (r2 == 0) goto L_0x01a7
                    java.lang.String r2 = "m"
                    goto L_0x01a9
                L_0x01a7:
                    java.lang.String r2 = "b"
                L_0x01a9:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    r4.append(r2)
                    java.lang.String r2 = "|"
                    r4.append(r2)
                    r4.append(r1)
                    java.lang.String r2 = r4.toString()
                L_0x01bd:
                    r11 = r2
                    r1 = r3
                    r2 = r7
                    r3 = r11
                    r4 = r8
                    r5 = r13
                    r6 = r10
                    r1.a(r2, r3, r4, r5, r6)
                    r1 = r10
                    r2 = r11
                    goto L_0x0151
                L_0x01ca:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: qg.C10192b.a.C1400a.b(java.util.List):qg.b$a");
            }

            private C1400a() {
            }
        }

        public a(LatLngBounds latLngBounds, boolean z10) {
            C17542s.j(latLngBounds, "addressPickerBounds");
            this.f76082a = latLngBounds;
            this.f76083b = z10;
        }

        public final LatLngBounds a() {
            return this.f76082a;
        }

        public final boolean b() {
            return this.f76083b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f76082a, aVar.f76082a) && this.f76083b == aVar.f76083b;
        }

        public int hashCode() {
            return (this.f76082a.hashCode() * 31) + Boolean.hashCode(this.f76083b);
        }

        public String toString() {
            LatLngBounds latLngBounds = this.f76082a;
            boolean z10 = this.f76083b;
            return "AddressPickerBoundary(addressPickerBounds=" + latLngBounds + ", restrictPickerToBounds=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lqg/b$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "GOOGLE", "ADDRESS_LOOKUP", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qg.b$b  reason: collision with other inner class name */
    public enum C1401b {
        GOOGLE("Google"),
        ADDRESS_LOOKUP("AddressLookup");
        
        public static final a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqg/b$b$a;", "", "<init>", "()V", "", "rawValue", "Lqg/b$b;", "b", "(Ljava/lang/String;)Lqg/b$b;", "", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyValue;", "data", "a", "(Ljava/util/List;)Lqg/b$b;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qg.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final C1401b b(String str) {
                T t10;
                Iterator<T> it = C1401b.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((C1401b) t10).j(), str)) {
                        break;
                    }
                }
                return (C1401b) t10;
            }

            public final C1401b a(List<KeyValue> list) {
                Object obj;
                String str;
                C17542s.j(list, "data");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((KeyValue) obj).b(), "PickerType")) {
                        break;
                    }
                }
                KeyValue keyValue = (KeyValue) obj;
                if (keyValue == null || (str = keyValue.c()) == null) {
                    str = "";
                }
                C1401b b10 = b(str);
                return b10 == null ? C1401b.GOOGLE : b10;
            }

            private a() {
            }
        }

        static {
            C1401b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private C1401b(String str) {
            this.value = str;
        }

        public static C17220a<C1401b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lqg/b$c;", "", "<init>", "()V", "", "defaultCountryCode", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "Lkotlin/Function1;", "LXH/N;", "onChanged", "Lqg/b;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;LnI/l;)Lqg/b;", "SOURCE_CITY", "Ljava/lang/String;", "TARGET_CITY", "SOURCE_ZIP_CODE", "TARGET_ZIP_CODE", "SOURCE_STATE_CODE", "TARGET_STATE_CODE", "SOURCE_ZIP_CODE_ADDRESS_LOOKUP", "COUNTRY_CODE", "RESTRICT_TO_BOUNDARY", "NORTHEAST_LAT", "NORTHEAST_LNG", "SOUTHWEST_LAT", "SOUTHWEST_LNG", "CURSOR_FOCUS", "PICKER_TYPE", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qg.b$c */
    public static final class c {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qg.b$c$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f76084a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    qg.b$b[] r0 = qg.C10192b.C1401b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    qg.b$b r1 = qg.C10192b.C1401b.GOOGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    qg.b$b r1 = qg.C10192b.C1401b.ADDRESS_LOOKUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f76084a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: qg.C10192b.c.a.<clinit>():void");
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00aa, code lost:
            r4 = r5.c();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final qg.C10192b a(java.lang.String r19, com.ingka.ikea.dynamicfields.datalayer.FieldAttributes r20, nI.C17642l<? super java.lang.String, XH.C16807N> r21) {
            /*
                r18 = this;
                java.lang.String r0 = "defaultCountryCode"
                r1 = r19
                kotlin.jvm.internal.C17542s.j(r1, r0)
                java.lang.String r0 = "attrs"
                r2 = r20
                kotlin.jvm.internal.C17542s.j(r2, r0)
                qg.b$b$a r0 = qg.C10192b.C1401b.Companion
                java.util.List r3 = r20.c()
                qg.b$b r13 = r0.a(r3)
                int[] r0 = qg.C10192b.c.a.f76084a
                int r3 = r13.ordinal()
                r3 = r0[r3]
                java.lang.String r4 = "targetZipCode"
                r5 = 2
                r6 = 1
                java.lang.String r7 = "addressLookupZipCodeKey"
                if (r3 == r6) goto L_0x0039
                if (r3 != r5) goto L_0x0033
                XH.v r3 = XH.C16796C.a(r7, r4)
                java.util.Map r3 = YH.X.f(r3)
                goto L_0x0057
            L_0x0033:
                XH.t r0 = new XH.t
                r0.<init>()
                throw r0
            L_0x0039:
                java.lang.String r3 = "googleSourceCityKey"
                java.lang.String r8 = "targetCity"
                XH.v r3 = XH.C16796C.a(r3, r8)
                java.lang.String r8 = "googleSourceZipCodeKey"
                XH.v r4 = XH.C16796C.a(r8, r4)
                java.lang.String r8 = "googleSourceStateKey"
                java.lang.String r9 = "targetState"
                XH.v r8 = XH.C16796C.a(r8, r9)
                XH.v[] r3 = new XH.v[]{r3, r4, r8}
                java.util.Map r3 = YH.X.m(r3)
            L_0x0057:
                int r4 = r13.ordinal()
                r0 = r0[r4]
                java.lang.String r15 = ""
                if (r0 == r6) goto L_0x007c
                if (r0 != r5) goto L_0x0076
                java.util.List r0 = r20.c()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r0 = YH.C16877v.w1(r0)
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r4 = new com.ingka.ikea.dynamicfields.datalayer.KeyValue
                r4.<init>(r7, r7, r15)
                r0.add(r4)
                goto L_0x0080
            L_0x0076:
                XH.t r0 = new XH.t
                r0.<init>()
                throw r0
            L_0x007c:
                java.util.List r0 = r20.c()
            L_0x0080:
                java.util.List r4 = r20.c()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x008a:
                boolean r5 = r4.hasNext()
                r6 = 0
                if (r5 == 0) goto L_0x00a5
                java.lang.Object r5 = r4.next()
                r7 = r5
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r7 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r7
                java.lang.String r7 = r7.b()
                java.lang.String r8 = "googleCountryCode"
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
                if (r7 == 0) goto L_0x008a
                goto L_0x00a6
            L_0x00a5:
                r5 = r6
            L_0x00a6:
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r5 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r5
                if (r5 == 0) goto L_0x00b3
                java.lang.String r4 = r5.c()
                if (r4 != 0) goto L_0x00b1
                goto L_0x00b3
            L_0x00b1:
                r14 = r4
                goto L_0x00b4
            L_0x00b3:
                r14 = r1
            L_0x00b4:
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                int r4 = r3.size()
                int r4 = YH.X.e(r4)
                r1.<init>(r4)
                java.util.Set r3 = r3.entrySet()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x00cb:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0110
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                java.lang.String r5 = (java.lang.String) r5
                r7 = r0
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x00e4:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00fc
                java.lang.Object r8 = r7.next()
                r9 = r8
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r9 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r9
                java.lang.String r9 = r9.b()
                boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r5)
                if (r9 == 0) goto L_0x00e4
                goto L_0x00fd
            L_0x00fc:
                r8 = r6
            L_0x00fd:
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r8 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r8
                if (r8 == 0) goto L_0x0107
                java.lang.String r5 = r8.c()
                if (r5 != 0) goto L_0x0108
            L_0x0107:
                r5 = r15
            L_0x0108:
                java.lang.Object r4 = r4.getValue()
                r1.put(r5, r4)
                goto L_0x00cb
            L_0x0110:
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                int r4 = r1.size()
                int r4 = YH.X.e(r4)
                r3.<init>(r4)
                java.util.Set r1 = r1.entrySet()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0127:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x016c
                java.lang.Object r4 = r1.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                java.lang.String r4 = (java.lang.String) r4
                r7 = r0
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x0144:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x015c
                java.lang.Object r8 = r7.next()
                r9 = r8
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r9 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r9
                java.lang.String r9 = r9.b()
                boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r4)
                if (r9 == 0) goto L_0x0144
                goto L_0x015d
            L_0x015c:
                r8 = r6
            L_0x015d:
                com.ingka.ikea.dynamicfields.datalayer.KeyValue r8 = (com.ingka.ikea.dynamicfields.datalayer.KeyValue) r8
                if (r8 == 0) goto L_0x0167
                java.lang.String r4 = r8.c()
                if (r4 != 0) goto L_0x0168
            L_0x0167:
                r4 = r15
            L_0x0168:
                r3.put(r5, r4)
                goto L_0x0127
            L_0x016c:
                java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
                r10.<init>()
                java.util.Set r0 = r3.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0179:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01a9
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r3 = r1.getKey()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = HJ.C15854t.v0(r3)
                if (r3 != 0) goto L_0x0179
                java.lang.Object r3 = r1.getValue()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = HJ.C15854t.v0(r3)
                if (r3 != 0) goto L_0x0179
                java.lang.Object r3 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r10.put(r3, r1)
                goto L_0x0179
            L_0x01a9:
                qg.b$a$a r0 = qg.C10192b.a.f76080c
                java.util.List r1 = r20.c()
                qg.b$a r11 = r0.b(r1)
                qg.b$d$a r0 = qg.C10192b.d.Companion
                java.util.List r1 = r20.c()
                qg.b$d r12 = r0.a(r1)
                java.lang.String r5 = r20.h()
                java.lang.String r6 = r20.i()
                java.lang.String r7 = r20.l()
                com.ingka.ikea.dynamicfields.datalayer.b r8 = com.ingka.ikea.dynamicfields.datalayer.b.TEXT
                java.util.List r9 = qg.j.b(r20)
                java.util.List r0 = r20.o()
                java.lang.String r16 = r20.k()
                qg.b r1 = new qg.b
                r4 = r1
                r3 = r15
                r15 = r0
                r17 = r21
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.String r15 = r20.g()
                if (r15 != 0) goto L_0x01e8
                r15 = r3
            L_0x01e8:
                r1.r(r15)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C10192b.c.a(java.lang.String, com.ingka.ikea.dynamicfields.datalayer.FieldAttributes, nI.l):qg.b");
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lqg/b$d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "START", "END", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qg.b$d */
    public enum d {
        START("START"),
        END("END");
        
        public static final a Companion = null;
        private final String value;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqg/b$d$a;", "", "<init>", "()V", "", "rawValue", "Lqg/b$d;", "b", "(Ljava/lang/String;)Lqg/b$d;", "", "Lcom/ingka/ikea/dynamicfields/datalayer/KeyValue;", "data", "a", "(Ljava/util/List;)Lqg/b$d;", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qg.b$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final d b(String str) {
                T t10;
                Iterator<T> it = d.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t10 = null;
                        break;
                    }
                    t10 = it.next();
                    if (C17542s.e(((d) t10).j(), str)) {
                        break;
                    }
                }
                return (d) t10;
            }

            public final d a(List<KeyValue> list) {
                Object obj;
                String str;
                C17542s.j(list, "data");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((KeyValue) obj).b(), "CursorFocus")) {
                        break;
                    }
                }
                KeyValue keyValue = (KeyValue) obj;
                if (keyValue == null || (str = keyValue.c()) == null) {
                    str = "";
                }
                return b(str);
            }

            private a() {
            }
        }

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
        }

        private d(String str) {
            this.value = str;
        }

        public static C17220a<d> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.value;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10192b(String str, String str2, String str3, b bVar, List<? extends y> list, Map<String, String> map, a aVar, d dVar, C1401b bVar2, String str4, List<Conditions> list2, String str5, C17642l<? super String, C16807N> lVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "key");
        C17542s.j(str2, "targetKey");
        C17542s.j(str3, "title");
        C17542s.j(bVar, "inputType");
        C17542s.j(list, "validation");
        C17542s.j(map, "addressPickerData");
        C17542s.j(bVar2, "pickerType");
        C17542s.j(str4, "countryCode");
        C17542s.j(list2, "visibility");
        this.f76067j = str;
        this.f76068k = str2;
        this.f76069l = str3;
        this.f76070m = bVar;
        this.f76071n = list;
        this.f76072o = map;
        this.f76073p = aVar;
        this.f76074q = dVar;
        this.f76075r = bVar2;
        this.f76076s = str4;
        this.f76077t = list2;
        this.f76078u = str5;
        this.f76079v = lVar;
    }

    public final String A() {
        return this.f76076s;
    }

    public final d B() {
        return this.f76074q;
    }

    public final C1401b C() {
        return this.f76075r;
    }

    public String e() {
        return this.f76067j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10192b)) {
            return false;
        }
        C10192b bVar = (C10192b) obj;
        return C17542s.e(this.f76067j, bVar.f76067j) && C17542s.e(this.f76068k, bVar.f76068k) && C17542s.e(this.f76069l, bVar.f76069l) && this.f76070m == bVar.f76070m && C17542s.e(this.f76071n, bVar.f76071n) && C17542s.e(this.f76072o, bVar.f76072o) && C17542s.e(this.f76073p, bVar.f76073p) && this.f76074q == bVar.f76074q && this.f76075r == bVar.f76075r && C17542s.e(this.f76076s, bVar.f76076s) && C17542s.e(this.f76077t, bVar.f76077t) && C17542s.e(this.f76078u, bVar.f76078u) && C17542s.e(this.f76079v, bVar.f76079v);
    }

    /* access modifiers changed from: protected */
    public C17642l<String, C16807N> f() {
        return this.f76079v;
    }

    public String g() {
        return this.f76068k;
    }

    public String h() {
        return this.f76078u;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f76067j.hashCode() * 31) + this.f76068k.hashCode()) * 31) + this.f76069l.hashCode()) * 31) + this.f76070m.hashCode()) * 31) + this.f76071n.hashCode()) * 31) + this.f76072o.hashCode()) * 31;
        a aVar = this.f76073p;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        d dVar = this.f76074q;
        int hashCode3 = (((((((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f76075r.hashCode()) * 31) + this.f76076s.hashCode()) * 31) + this.f76077t.hashCode()) * 31;
        String str = this.f76078u;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C17642l<String, C16807N> lVar = this.f76079v;
        if (lVar != null) {
            i10 = lVar.hashCode();
        }
        return hashCode4 + i10;
    }

    public List<y> i() {
        return this.f76071n;
    }

    public List<Conditions> k() {
        return this.f76077t;
    }

    public String toString() {
        String str = this.f76067j;
        String str2 = this.f76068k;
        String str3 = this.f76069l;
        b bVar = this.f76070m;
        List<y> list = this.f76071n;
        Map<String, String> map = this.f76072o;
        a aVar = this.f76073p;
        d dVar = this.f76074q;
        C1401b bVar2 = this.f76075r;
        String str4 = this.f76076s;
        List<Conditions> list2 = this.f76077t;
        String str5 = this.f76078u;
        C17642l<String, C16807N> lVar = this.f76079v;
        return "AddressPickerViewModel(key=" + str + ", targetKey=" + str2 + ", title=" + str3 + ", inputType=" + bVar + ", validation=" + list + ", addressPickerData=" + map + ", addressPickerBounds=" + aVar + ", cursorFocusMode=" + dVar + ", pickerType=" + bVar2 + ", countryCode=" + str4 + ", visibility=" + list2 + ", textAsCollapsed=" + str5 + ", onChanged=" + lVar + ")";
    }

    public b w() {
        return this.f76070m;
    }

    public String x() {
        return this.f76069l;
    }

    public final a y() {
        return this.f76073p;
    }

    public final Map<String, String> z() {
        return this.f76072o;
    }
}
