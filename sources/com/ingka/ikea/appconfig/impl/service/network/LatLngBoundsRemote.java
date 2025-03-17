package com.ingka.ikea.appconfig.impl.service.network;

import HJ.C15854t;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import com.ingka.ikea.appconfig.model.LocationLatLngBounds;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010!¨\u0006("}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;", "", "", "seen0", "Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;", "southWest", "northEast", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "a", "()Lcom/ingka/ikea/appconfig/model/LocationLatLngBounds;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;", "getSouthWest", "()Lcom/ingka/ikea/appconfig/impl/service/network/LatLngRemote;", "getSouthWest$annotations", "()V", "getNorthEast", "getNorthEast$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LatLngBoundsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final LatLngRemote f92922a;

    /* renamed from: b  reason: collision with root package name */
    private final LatLngRemote f92923b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/LatLngBoundsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LatLngBoundsRemote> serializer() {
            return LatLngBoundsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LatLngBoundsRemote(int i10, LatLngRemote latLngRemote, LatLngRemote latLngRemote2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, LatLngBoundsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92922a = latLngRemote;
        this.f92923b = latLngRemote2;
    }

    public static final /* synthetic */ void b(LatLngBoundsRemote latLngBoundsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        LatLngRemote$$serializer latLngRemote$$serializer = LatLngRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, latLngRemote$$serializer, latLngBoundsRemote.f92922a);
        dVar.B(serialDescriptor, 1, latLngRemote$$serializer, latLngBoundsRemote.f92923b);
    }

    public final LocationLatLngBounds a() {
        Double a10;
        Double a11;
        LatLngRemote latLngRemote = this.f92922a;
        if (latLngRemote == null || (a10 = latLngRemote.a()) == null) {
            return null;
        }
        double doubleValue = a10.doubleValue();
        Double b10 = this.f92922a.b();
        if (b10 == null) {
            return null;
        }
        double doubleValue2 = b10.doubleValue();
        LatLngRemote latLngRemote2 = this.f92923b;
        if (latLngRemote2 == null || (a11 = latLngRemote2.a()) == null) {
            return null;
        }
        double doubleValue3 = a11.doubleValue();
        Double b11 = this.f92923b.b();
        if (b11 == null) {
            return null;
        }
        try {
            return new LocationLatLngBounds(new LocationLatLng(doubleValue, doubleValue2), new LocationLatLng(doubleValue3, b11.doubleValue()));
        } catch (IllegalArgumentException e10) {
            e eVar = e.ERROR;
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
                    String a12 = C11818a.a("Faulty coordinates", e10);
                    if (a12 == null) {
                        return null;
                    }
                    str = C11820c.a(a12);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = LatLngBoundsRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBoundsRemote)) {
            return false;
        }
        LatLngBoundsRemote latLngBoundsRemote = (LatLngBoundsRemote) obj;
        return C17542s.e(this.f92922a, latLngBoundsRemote.f92922a) && C17542s.e(this.f92923b, latLngBoundsRemote.f92923b);
    }

    public int hashCode() {
        LatLngRemote latLngRemote = this.f92922a;
        int i10 = 0;
        int hashCode = (latLngRemote == null ? 0 : latLngRemote.hashCode()) * 31;
        LatLngRemote latLngRemote2 = this.f92923b;
        if (latLngRemote2 != null) {
            i10 = latLngRemote2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        LatLngRemote latLngRemote = this.f92922a;
        LatLngRemote latLngRemote2 = this.f92923b;
        return "LatLngBoundsRemote(southWest=" + latLngRemote + ", northEast=" + latLngRemote2 + ")";
    }
}
