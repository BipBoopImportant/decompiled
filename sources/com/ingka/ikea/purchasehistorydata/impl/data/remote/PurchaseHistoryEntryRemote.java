package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.c;
import Hx.d;
import YH.C16877v;
import androidx.annotation.Keep;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@p
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u001c\b\b\u0018\u0000 H2\u00020\u0001:\u0005IJKLMBS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+Jj\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u00105\u0012\u0004\b:\u00108\u001a\u0004\b9\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010;\u0012\u0004\b=\u00108\u001a\u0004\b<\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b?\u00108\u001a\u0004\b>\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010B\u0012\u0004\bD\u00108\u001a\u0004\bC\u0010)R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010E\u0012\u0004\bG\u00108\u001a\u0004\bF\u0010+¨\u0006N"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;", "", "", "id", "type", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;", "dateAndTime", "status", "storeName", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;", "totalCost", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$Thumbnail;", "articles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$purchasehistorydata_implementation_release", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LHx/d;", "convertToLocal", "()LHx/d;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;", "component4", "component5", "component6", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;Ljava/util/List;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getType", "getType$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;", "getDateAndTime", "getDateAndTime$annotations", "getStatus", "getStatus$annotations", "getStoreName", "getStoreName$annotations", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;", "getTotalCost", "getTotalCost$annotations", "Ljava/util/List;", "getArticles", "getArticles$annotations", "Companion", "DateAndTime", "TotalCost", "Thumbnail", "$serializer", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchaseHistoryEntryRemote {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new C17451f(PurchaseHistoryEntryRemote$Thumbnail$$serializer.INSTANCE)};
    public static final int $stable = 8;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final List<Thumbnail> articles;
    private final DateAndTime dateAndTime;

    /* renamed from: id  reason: collision with root package name */
    private final String f119549id;
    private final String status;
    private final String storeName;
    private final TotalCost totalCost;
    private final String type;

    @p
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;", "", "", "seen0", "", "formattedLongDate", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFormattedLongDate$annotations", "()V", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateAndTime {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119554a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$DateAndTime;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DateAndTime> serializer() {
                return PurchaseHistoryEntryRemote$DateAndTime$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DateAndTime(int i10, String str, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PurchaseHistoryEntryRemote$DateAndTime$$serializer.INSTANCE.getDescriptor());
            }
            this.f119554a = str;
        }

        public final String a() {
            return this.f119554a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateAndTime) && C17542s.e(this.f119554a, ((DateAndTime) obj).f119554a);
        }

        public int hashCode() {
            String str = this.f119554a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f119554a;
            return "DateAndTime(formattedLongDate=" + str + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001f\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$Thumbnail;", "", "", "seen0", "", "imageUrl", "", "price", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$Thumbnail;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getImageUrl$annotations", "()V", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getPrice$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Thumbnail {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f119555a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f119556b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$Thumbnail$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$Thumbnail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Thumbnail> serializer() {
                return PurchaseHistoryEntryRemote$Thumbnail$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Thumbnail(int i10, String str, Double d10, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, PurchaseHistoryEntryRemote$Thumbnail$$serializer.INSTANCE.getDescriptor());
            }
            this.f119555a = str;
            this.f119556b = d10;
        }

        public static final /* synthetic */ void c(Thumbnail thumbnail, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, thumbnail.f119555a);
            dVar.B(serialDescriptor, 1, C17438C.f144010a, thumbnail.f119556b);
        }

        public final String a() {
            return this.f119555a;
        }

        public final Double b() {
            return this.f119556b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Thumbnail)) {
                return false;
            }
            Thumbnail thumbnail = (Thumbnail) obj;
            return C17542s.e(this.f119555a, thumbnail.f119555a) && C17542s.e(this.f119556b, thumbnail.f119556b);
        }

        public int hashCode() {
            String str = this.f119555a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Double d10 = this.f119556b;
            if (d10 != null) {
                i10 = d10.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f119555a;
            Double d10 = this.f119556b;
            return "Thumbnail(imageUrl=" + str + ", price=" + d10 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000  2\u00020\u0001:\u0002!\u001bB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001d¨\u0006\""}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;", "", "", "seen0", "", "value", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getValue$annotations", "()V", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TotalCost {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f119557a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$TotalCost;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<TotalCost> serializer() {
                return PurchaseHistoryEntryRemote$TotalCost$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ TotalCost(int i10, Double d10, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, PurchaseHistoryEntryRemote$TotalCost$$serializer.INSTANCE.getDescriptor());
            }
            this.f119557a = d10;
        }

        public final Double a() {
            return this.f119557a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TotalCost) && C17542s.e(this.f119557a, ((TotalCost) obj).f119557a);
        }

        public int hashCode() {
            Double d10 = this.f119557a;
            if (d10 == null) {
                return 0;
            }
            return d10.hashCode();
        }

        public String toString() {
            Double d10 = this.f119557a;
            return "TotalCost(value=" + d10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PurchaseHistoryEntryRemote> serializer() {
            return PurchaseHistoryEntryRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PurchaseHistoryEntryRemote(int i10, String str, String str2, DateAndTime dateAndTime2, String str3, String str4, TotalCost totalCost2, List list, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, PurchaseHistoryEntryRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119549id = str;
        this.type = str2;
        this.dateAndTime = dateAndTime2;
        this.status = str3;
        this.storeName = str4;
        this.totalCost = totalCost2;
        this.articles = list;
    }

    public static /* synthetic */ PurchaseHistoryEntryRemote copy$default(PurchaseHistoryEntryRemote purchaseHistoryEntryRemote, String str, String str2, DateAndTime dateAndTime2, String str3, String str4, TotalCost totalCost2, List<Thumbnail> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchaseHistoryEntryRemote.f119549id;
        }
        if ((i10 & 2) != 0) {
            str2 = purchaseHistoryEntryRemote.type;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            dateAndTime2 = purchaseHistoryEntryRemote.dateAndTime;
        }
        DateAndTime dateAndTime3 = dateAndTime2;
        if ((i10 & 8) != 0) {
            str3 = purchaseHistoryEntryRemote.status;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = purchaseHistoryEntryRemote.storeName;
        }
        String str7 = str4;
        if ((i10 & 32) != 0) {
            totalCost2 = purchaseHistoryEntryRemote.totalCost;
        }
        TotalCost totalCost3 = totalCost2;
        if ((i10 & 64) != 0) {
            list = purchaseHistoryEntryRemote.articles;
        }
        return purchaseHistoryEntryRemote.copy(str, str5, dateAndTime3, str6, str7, totalCost3, list);
    }

    public static /* synthetic */ void getArticles$annotations() {
    }

    public static /* synthetic */ void getDateAndTime$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getStoreName$annotations() {
    }

    public static /* synthetic */ void getTotalCost$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchasehistorydata_implementation_release(PurchaseHistoryEntryRemote purchaseHistoryEntryRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, purchaseHistoryEntryRemote.f119549id);
        dVar.B(serialDescriptor, 1, y02, purchaseHistoryEntryRemote.type);
        dVar.B(serialDescriptor, 2, PurchaseHistoryEntryRemote$DateAndTime$$serializer.INSTANCE, purchaseHistoryEntryRemote.dateAndTime);
        dVar.B(serialDescriptor, 3, y02, purchaseHistoryEntryRemote.status);
        dVar.B(serialDescriptor, 4, y02, purchaseHistoryEntryRemote.storeName);
        dVar.B(serialDescriptor, 5, PurchaseHistoryEntryRemote$TotalCost$$serializer.INSTANCE, purchaseHistoryEntryRemote.totalCost);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], purchaseHistoryEntryRemote.articles);
    }

    public final String component1() {
        return this.f119549id;
    }

    public final String component2() {
        return this.type;
    }

    public final DateAndTime component3() {
        return this.dateAndTime;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.storeName;
    }

    public final TotalCost component6() {
        return this.totalCost;
    }

    public final List<Thumbnail> component7() {
        return this.articles;
    }

    public final d convertToLocal() {
        ArrayList arrayList;
        DateAndTime dateAndTime2 = this.dateAndTime;
        String a10 = dateAndTime2 != null ? dateAndTime2.a() : null;
        TotalCost totalCost2 = this.totalCost;
        Double a11 = totalCost2 != null ? totalCost2.a() : null;
        String str = this.f119549id;
        if (str == null || C15854t.v0(str) || a11 == null || this.status == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing required purchase data, id:" + this.f119549id + ", status:" + this.status + ", amount:" + a11);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList2) {
                if (str2 == null) {
                    String a12 = C11818a.a((String) null, illegalArgumentException);
                    if (a12 == null) {
                        break;
                    }
                    str2 = C11820c.a(a12);
                }
                if (str3 == null) {
                    String name = PurchaseHistoryEntryRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str3, false, illegalArgumentException, str2);
            }
            return null;
        }
        List<Thumbnail> list = this.articles;
        if (list != null) {
            Iterable<Thumbnail> iterable = list;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
            for (Thumbnail thumbnail : iterable) {
                arrayList3.add(new d.a(thumbnail.a(), thumbnail.b()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = C16877v.n();
        }
        return new d(this.f119549id, PurchaseTypeRemote.Companion.a(this.type), a10, a11.doubleValue(), c.e.Companion.a(this.status), this.storeName, arrayList);
    }

    public final PurchaseHistoryEntryRemote copy(String str, String str2, DateAndTime dateAndTime2, String str3, String str4, TotalCost totalCost2, List<Thumbnail> list) {
        return new PurchaseHistoryEntryRemote(str, str2, dateAndTime2, str3, str4, totalCost2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryEntryRemote)) {
            return false;
        }
        PurchaseHistoryEntryRemote purchaseHistoryEntryRemote = (PurchaseHistoryEntryRemote) obj;
        return C17542s.e(this.f119549id, purchaseHistoryEntryRemote.f119549id) && C17542s.e(this.type, purchaseHistoryEntryRemote.type) && C17542s.e(this.dateAndTime, purchaseHistoryEntryRemote.dateAndTime) && C17542s.e(this.status, purchaseHistoryEntryRemote.status) && C17542s.e(this.storeName, purchaseHistoryEntryRemote.storeName) && C17542s.e(this.totalCost, purchaseHistoryEntryRemote.totalCost) && C17542s.e(this.articles, purchaseHistoryEntryRemote.articles);
    }

    public final List<Thumbnail> getArticles() {
        return this.articles;
    }

    public final DateAndTime getDateAndTime() {
        return this.dateAndTime;
    }

    public final String getId() {
        return this.f119549id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final TotalCost getTotalCost() {
        return this.totalCost;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.f119549id;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateAndTime dateAndTime2 = this.dateAndTime;
        int hashCode3 = (hashCode2 + (dateAndTime2 == null ? 0 : dateAndTime2.hashCode())) * 31;
        String str3 = this.status;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TotalCost totalCost2 = this.totalCost;
        int hashCode6 = (hashCode5 + (totalCost2 == null ? 0 : totalCost2.hashCode())) * 31;
        List<Thumbnail> list = this.articles;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        String str = this.f119549id;
        String str2 = this.type;
        DateAndTime dateAndTime2 = this.dateAndTime;
        String str3 = this.status;
        String str4 = this.storeName;
        TotalCost totalCost2 = this.totalCost;
        List<Thumbnail> list = this.articles;
        return "PurchaseHistoryEntryRemote(id=" + str + ", type=" + str2 + ", dateAndTime=" + dateAndTime2 + ", status=" + str3 + ", storeName=" + str4 + ", totalCost=" + totalCost2 + ", articles=" + list + ")";
    }

    public PurchaseHistoryEntryRemote(String str, String str2, DateAndTime dateAndTime2, String str3, String str4, TotalCost totalCost2, List<Thumbnail> list) {
        this.f119549id = str;
        this.type = str2;
        this.dateAndTime = dateAndTime2;
        this.status = str3;
        this.storeName = str4;
        this.totalCost = totalCost2;
        this.articles = list;
    }
}
