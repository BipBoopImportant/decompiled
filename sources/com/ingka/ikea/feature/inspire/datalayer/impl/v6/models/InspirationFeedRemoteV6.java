package com.ingka.ikea.feature.inspire.datalayer.impl.v6.models;

import YH.C16877v;
import com.ingka.ikea.core.remotemodel.InspirationFeedItemRemote;
import com.ingka.ikea.core.remotemodel.InspirationFeedItemRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import zr.C12550a;
import zr.b;
import zr.e;

@p
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002@*Bc\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010+\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010-R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u00102\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\"R\"\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u00105\u0012\u0004\b8\u0010/\u001a\u0004\b6\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u00102\u0012\u0004\b;\u0010/\u001a\u0004\b:\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u00102\u0012\u0004\b>\u0010/\u001a\u0004\b=\u0010\"¨\u0006A"}, d2 = {"Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;", "Lpp/b;", "Lzr/b;", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/InspirationFeedItemRemote;", "inspiration", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFilterRemoteV6;", "facets", "", "requestId", "totalCount", "title", "prioritiser", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lzr/a;", "b", "()Lzr/a;", "Lzr/e;", "c", "()Lzr/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getInspiration", "()Ljava/util/List;", "getInspiration$annotations", "()V", "getFacets", "getFacets$annotations", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "Ljava/lang/Integer;", "getTotalCount", "()Ljava/lang/Integer;", "getTotalCount$annotations", "e", "getTitle", "getTitle$annotations", "f", "getPrioritiser", "getPrioritiser$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspirationFeedRemoteV6 implements C11768b<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final KSerializer<Object>[] f95959g = {new C17451f(InspirationFeedItemRemote$$serializer.INSTANCE), new C17451f(InspirationFilterRemoteV6$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<InspirationFeedItemRemote> f95960a;

    /* renamed from: b  reason: collision with root package name */
    private final List<InspirationFilterRemoteV6> f95961b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95962c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f95963d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95964e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95965f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/feature/inspire/datalayer/impl/v6/models/InspirationFeedRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InspirationFeedRemoteV6> serializer() {
            return InspirationFeedRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InspirationFeedRemoteV6(int i10, List list, List list2, String str, Integer num, String str2, String str3, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, InspirationFeedRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f95960a = list;
        this.f95961b = list2;
        this.f95962c = str;
        this.f95963d = num;
        this.f95964e = str2;
        this.f95965f = str3;
    }

    public static final /* synthetic */ void d(InspirationFeedRemoteV6 inspirationFeedRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95959g;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], inspirationFeedRemoteV6.f95960a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], inspirationFeedRemoteV6.f95961b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, inspirationFeedRemoteV6.f95962c);
        dVar.B(serialDescriptor, 3, X.f144073a, inspirationFeedRemoteV6.f95963d);
        dVar.B(serialDescriptor, 4, y02, inspirationFeedRemoteV6.f95964e);
        dVar.B(serialDescriptor, 5, y02, inspirationFeedRemoteV6.f95965f);
    }

    public C12550a b() {
        List<InspirationFeedItemRemote> list = this.f95960a;
        if (list != null) {
            Iterable<InspirationFeedItemRemote> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (InspirationFeedItemRemote c10 : iterable) {
                arrayList.add(c10.c());
            }
            List<InspirationFilterRemoteV6> list2 = this.f95961b;
            if (list2 != null) {
                Iterable<InspirationFilterRemoteV6> iterable2 = list2;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                for (InspirationFilterRemoteV6 b10 : iterable2) {
                    arrayList2.add(b10.b());
                }
                String str = this.f95962c;
                if (str != null) {
                    Integer num = this.f95963d;
                    if (num != null) {
                        return new C12550a(arrayList, arrayList2, str, num.intValue(), this.f95964e, this.f95965f);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final e c() {
        List<InspirationFeedItemRemote> list = this.f95960a;
        if (list != null) {
            Iterable<InspirationFeedItemRemote> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (InspirationFeedItemRemote c10 : iterable) {
                arrayList.add(c10.c());
            }
            return new e(arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InspirationFeedRemoteV6)) {
            return false;
        }
        InspirationFeedRemoteV6 inspirationFeedRemoteV6 = (InspirationFeedRemoteV6) obj;
        return C17542s.e(this.f95960a, inspirationFeedRemoteV6.f95960a) && C17542s.e(this.f95961b, inspirationFeedRemoteV6.f95961b) && C17542s.e(this.f95962c, inspirationFeedRemoteV6.f95962c) && C17542s.e(this.f95963d, inspirationFeedRemoteV6.f95963d) && C17542s.e(this.f95964e, inspirationFeedRemoteV6.f95964e) && C17542s.e(this.f95965f, inspirationFeedRemoteV6.f95965f);
    }

    public int hashCode() {
        List<InspirationFeedItemRemote> list = this.f95960a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<InspirationFilterRemoteV6> list2 = this.f95961b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.f95962c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f95963d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f95964e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95965f;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        List<InspirationFeedItemRemote> list = this.f95960a;
        List<InspirationFilterRemoteV6> list2 = this.f95961b;
        String str = this.f95962c;
        Integer num = this.f95963d;
        String str2 = this.f95964e;
        String str3 = this.f95965f;
        return "InspirationFeedRemoteV6(inspiration=" + list + ", facets=" + list2 + ", requestId=" + str + ", totalCount=" + num + ", title=" + str2 + ", prioritiser=" + str3 + ")";
    }
}
