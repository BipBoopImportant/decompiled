package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 )2\u00020\u0001:\u0002*\u001dB?\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0016R*\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010!\u001a\u0004\b%\u0010'¨\u0006+"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced;", "", "", "seen0", "code", "", "type", "", "message", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getCode$annotations", "()V", "Ljava/lang/String;", "d", "getType$annotations", "c", "Ljava/util/List;", "()Ljava/util/List;", "getMessage$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApiErrorDataModelEnhanced {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f119949d = {null, null, new C17451f(C17294a.u(Y0.f144077a))};

    /* renamed from: a  reason: collision with root package name */
    private final int f119950a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119951b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f119952c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ApiErrorDataModelEnhanced> serializer() {
            return ApiErrorDataModelEnhanced$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ApiErrorDataModelEnhanced(int i10, int i11, String str, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ApiErrorDataModelEnhanced$$serializer.INSTANCE.getDescriptor());
        }
        this.f119950a = i11;
        this.f119951b = str;
        this.f119952c = list;
    }

    public static final /* synthetic */ void e(ApiErrorDataModelEnhanced apiErrorDataModelEnhanced, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119949d;
        dVar.w(serialDescriptor, 0, apiErrorDataModelEnhanced.f119950a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, apiErrorDataModelEnhanced.f119951b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], apiErrorDataModelEnhanced.f119952c);
    }

    public final int b() {
        return this.f119950a;
    }

    public final List<String> c() {
        return this.f119952c;
    }

    public final String d() {
        return this.f119951b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorDataModelEnhanced)) {
            return false;
        }
        ApiErrorDataModelEnhanced apiErrorDataModelEnhanced = (ApiErrorDataModelEnhanced) obj;
        return this.f119950a == apiErrorDataModelEnhanced.f119950a && C17542s.e(this.f119951b, apiErrorDataModelEnhanced.f119951b) && C17542s.e(this.f119952c, apiErrorDataModelEnhanced.f119952c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f119950a) * 31;
        String str = this.f119951b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f119952c;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        int i10 = this.f119950a;
        String str = this.f119951b;
        List<String> list = this.f119952c;
        return "ApiErrorDataModelEnhanced(code=" + i10 + ", type=" + str + ", message=" + list + ")";
    }
}
