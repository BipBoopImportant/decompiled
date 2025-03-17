package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17457i;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\b\u0018\u0000 $2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002%\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u0012\u0004\b#\u0010!¨\u0006&"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote;", "Lpp/b;", "", "", "seen0", "", "enable", "thresholdCartValue", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Ljava/lang/Double;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnable$annotations", "()V", "Ljava/lang/Double;", "getThresholdCartValue$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteShoppingConfigurationRemote implements C11768b<Double> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f96725a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f96726b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RemoteShoppingConfigurationRemote> serializer() {
            return RemoteShoppingConfigurationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RemoteShoppingConfigurationRemote(int i10, Boolean bool, Double d10, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, RemoteShoppingConfigurationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f96725a = bool;
        this.f96726b = d10;
    }

    public static final /* synthetic */ void b(RemoteShoppingConfigurationRemote remoteShoppingConfigurationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17457i.f144111a, remoteShoppingConfigurationRemote.f96725a);
        dVar.B(serialDescriptor, 1, C17438C.f144010a, remoteShoppingConfigurationRemote.f96726b);
    }

    public Double a() {
        String str;
        char c10;
        String str2;
        Boolean bool = this.f96725a;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<RemoteShoppingConfigurationRemote> cls = RemoteShoppingConfigurationRemote.class;
        if (bool == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("enabled variable missing");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        return null;
                    }
                    str5 = C11820c.a(a10);
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str2 = str3;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str2) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str2 = str3;
                }
                String str7 = str6;
                bVar.a(eVar, str7, false, illegalArgumentException, str5);
                str6 = str7;
                eVar = eVar;
                str3 = str2;
            }
            return null;
        }
        String str8 = str3;
        Double d10 = this.f96726b;
        if (d10 == null) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("thresholdCartValue variable missing");
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str9 = null;
            String str10 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str9 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        return null;
                    }
                    str9 = C11820c.a(a11);
                }
                if (str10 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    c10 = '$';
                    str = str4;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str8) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str = str4;
                    c10 = '$';
                }
                char c11 = c10;
                bVar2.a(eVar2, str10, false, illegalArgumentException2, str9);
                str4 = str;
            }
            return null;
        }
        d10.doubleValue();
        if (this.f96725a.booleanValue()) {
            return d10;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteShoppingConfigurationRemote)) {
            return false;
        }
        RemoteShoppingConfigurationRemote remoteShoppingConfigurationRemote = (RemoteShoppingConfigurationRemote) obj;
        return C17542s.e(this.f96725a, remoteShoppingConfigurationRemote.f96725a) && C17542s.e(this.f96726b, remoteShoppingConfigurationRemote.f96726b);
    }

    public int hashCode() {
        Boolean bool = this.f96725a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f96726b;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Boolean bool = this.f96725a;
        Double d10 = this.f96726b;
        return "RemoteShoppingConfigurationRemote(enable=" + bool + ", thresholdCartValue=" + d10 + ")";
    }
}
