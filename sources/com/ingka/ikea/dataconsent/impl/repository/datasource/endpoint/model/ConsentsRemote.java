package com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model;

import fK.p;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 72\u00020\u0001:\u00028\"BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010#\u0012\u0004\b+\u0010&\u001a\u0004\b*\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010#\u0012\u0004\b.\u0010&\u001a\u0004\b-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010#\u0012\u0004\b1\u0010&\u001a\u0004\b0\u0010\u001bR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010&\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "", "", "name", "title", "policyUrl", "version", "uiVersion", "", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsDetailsRemote;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "getTitle", "getTitle$annotations", "c", "getPolicyUrl", "getPolicyUrl$annotations", "d", "getVersion", "getVersion$annotations", "e", "getUiVersion", "getUiVersion$annotations", "f", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "getDetails$annotations", "Companion", "$serializer", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f95462g = {null, null, null, null, null, new C17451f(ConsentsDetailsRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95463a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95464b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95465c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95466d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95467e;

    /* renamed from: f  reason: collision with root package name */
    private final List<ConsentsDetailsRemote> f95468f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ConsentsRemote> serializer() {
            return ConsentsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConsentsRemote(int i10, String str, String str2, String str3, String str4, String str5, List list, T0 t02) {
        if (43 != (i10 & 43)) {
            E0.b(i10, 43, ConsentsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95463a = str;
        this.f95464b = str2;
        if ((i10 & 4) == 0) {
            this.f95465c = null;
        } else {
            this.f95465c = str3;
        }
        this.f95466d = str4;
        if ((i10 & 16) == 0) {
            this.f95467e = null;
        } else {
            this.f95467e = str5;
        }
        this.f95468f = list;
    }

    public static final /* synthetic */ void b(ConsentsRemote consentsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95462g;
        dVar.y(serialDescriptor, 0, consentsRemote.f95463a);
        dVar.y(serialDescriptor, 1, consentsRemote.f95464b);
        if (dVar.z(serialDescriptor, 2) || consentsRemote.f95465c != null) {
            dVar.B(serialDescriptor, 2, Y0.f144077a, consentsRemote.f95465c);
        }
        dVar.y(serialDescriptor, 3, consentsRemote.f95466d);
        if (dVar.z(serialDescriptor, 4) || consentsRemote.f95467e != null) {
            dVar.B(serialDescriptor, 4, Y0.f144077a, consentsRemote.f95467e);
        }
        dVar.i(serialDescriptor, 5, kSerializerArr[5], consentsRemote.f95468f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentsRemote)) {
            return false;
        }
        ConsentsRemote consentsRemote = (ConsentsRemote) obj;
        return C17542s.e(this.f95463a, consentsRemote.f95463a) && C17542s.e(this.f95464b, consentsRemote.f95464b) && C17542s.e(this.f95465c, consentsRemote.f95465c) && C17542s.e(this.f95466d, consentsRemote.f95466d) && C17542s.e(this.f95467e, consentsRemote.f95467e) && C17542s.e(this.f95468f, consentsRemote.f95468f);
    }

    public int hashCode() {
        int hashCode = ((this.f95463a.hashCode() * 31) + this.f95464b.hashCode()) * 31;
        String str = this.f95465c;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95466d.hashCode()) * 31;
        String str2 = this.f95467e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f95468f.hashCode();
    }

    public String toString() {
        String str = this.f95463a;
        String str2 = this.f95464b;
        String str3 = this.f95465c;
        String str4 = this.f95466d;
        String str5 = this.f95467e;
        List<ConsentsDetailsRemote> list = this.f95468f;
        return "ConsentsRemote(name=" + str + ", title=" + str2 + ", policyUrl=" + str3 + ", version=" + str4 + ", uiVersion=" + str5 + ", details=" + list + ")";
    }

    public ConsentsRemote(String str, String str2, String str3, String str4, String str5, List<ConsentsDetailsRemote> list) {
        C17542s.j(str, "name");
        C17542s.j(str2, "title");
        C17542s.j(str4, "version");
        C17542s.j(list, "details");
        this.f95463a = str;
        this.f95464b = str2;
        this.f95465c = str3;
        this.f95466d = str4;
        this.f95467e = str5;
        this.f95468f = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConsentsRemote(String str, String str2, String str3, String str4, String str5, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, str4, (i10 & 16) != 0 ? null : str5, list);
    }
}
