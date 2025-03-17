package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.c;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CancelReasonRemote;", "", "", "seen0", "", "text", "code", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CancelReasonRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LHx/c$d$b$a;", "a", "()LHx/c$d$b$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "getCode", "getCode$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CancelReasonRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119491a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119492b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CancelReasonRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CancelReasonRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CancelReasonRemote> serializer() {
            return CancelReasonRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CancelReasonRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CancelReasonRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119491a = str;
        this.f119492b = str2;
    }

    public static final /* synthetic */ void b(CancelReasonRemote cancelReasonRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, cancelReasonRemote.f119491a);
        dVar.B(serialDescriptor, 1, y02, cancelReasonRemote.f119492b);
    }

    public final c.d.b.a a() {
        String str;
        String str2 = this.f119491a;
        if (str2 != null && !C15854t.v0(str2) && (str = this.f119492b) != null && !C15854t.v0(str)) {
            return new c.d.b.a(this.f119491a, this.f119492b);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid reason: " + this);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = CancelReasonRemote.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, illegalArgumentException, str5);
            str3 = str5;
            str4 = str6;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelReasonRemote)) {
            return false;
        }
        CancelReasonRemote cancelReasonRemote = (CancelReasonRemote) obj;
        return C17542s.e(this.f119491a, cancelReasonRemote.f119491a) && C17542s.e(this.f119492b, cancelReasonRemote.f119492b);
    }

    public int hashCode() {
        String str = this.f119491a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119492b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f119491a;
        String str2 = this.f119492b;
        return "CancelReasonRemote(text=" + str + ", code=" + str2 + ")";
    }
}
