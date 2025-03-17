package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11697h;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-!B?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/FacetsRemote;", "", "", "seen0", "", "text", "", "Lcom/ingka/ikea/core/remotemodel/product/ValuesRemote;", "values", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/FacetsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lop/h;", "b", "()Lop/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getText", "getText$annotations", "()V", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "getValues$annotations", "getType", "getType$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FacetsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f95271d = {null, new C17451f(ValuesRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95272a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ValuesRemote> f95273b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95274c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/FacetsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/FacetsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FacetsRemote> serializer() {
            return FacetsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FacetsRemote(int i10, String str, List list, String str2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, FacetsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95272a = str;
        this.f95273b = list;
        this.f95274c = str2;
    }

    public static final /* synthetic */ void c(FacetsRemote facetsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95271d;
        dVar.y(serialDescriptor, 0, facetsRemote.f95272a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], facetsRemote.f95273b);
        dVar.y(serialDescriptor, 2, facetsRemote.f95274c);
    }

    public final C11697h b() {
        List list;
        String str = this.f95272a;
        List<ValuesRemote> list2 = this.f95273b;
        if (list2 != null) {
            Iterable<ValuesRemote> iterable = list2;
            list = new ArrayList(C16877v.y(iterable, 10));
            for (ValuesRemote a10 : iterable) {
                list.add(a10.a());
            }
        } else {
            list = C16877v.n();
        }
        return new C11697h(str, list, this.f95274c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FacetsRemote)) {
            return false;
        }
        FacetsRemote facetsRemote = (FacetsRemote) obj;
        return C17542s.e(this.f95272a, facetsRemote.f95272a) && C17542s.e(this.f95273b, facetsRemote.f95273b) && C17542s.e(this.f95274c, facetsRemote.f95274c);
    }

    public int hashCode() {
        int hashCode = this.f95272a.hashCode() * 31;
        List<ValuesRemote> list = this.f95273b;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f95274c.hashCode();
    }

    public String toString() {
        String str = this.f95272a;
        List<ValuesRemote> list = this.f95273b;
        String str2 = this.f95274c;
        return "FacetsRemote(text=" + str + ", values=" + list + ", type=" + str2 + ")";
    }
}
