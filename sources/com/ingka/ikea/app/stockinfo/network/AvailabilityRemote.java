package com.ingka.ikea.app.stockinfo.network;

import HJ.C15854t;
import Wk.a;
import Wk.e;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.app.base.ProductKey;
import com.ingka.ikea.app.stockinfo.network.ClassUnitKey;
import com.ingka.ikea.app.stockinfo.network.b;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.M;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \b\b\u0018\u0000 92\u00020\u0001:\u0007:;<=>?(BO\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u00100\u0012\u0004\b3\u0010-\u001a\u0004\b1\u00102R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010-\u001a\u0004\b6\u00107¨\u0006@"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;", "", "", "seen0", "", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote;", "availabilities", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote;", "errors", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;", "homeDeliveryPrice", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;", "homeDeliveryTime", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "isClickCollectAvailabilityEnabled", "LXk/a;", "deliveryTimeUseCase", "Lcom/ingka/ikea/app/stockinfo/network/b;", "b", "(ZLXk/a;)Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAvailabilities", "()Ljava/util/List;", "getAvailabilities$annotations", "()V", "getErrors", "getErrors$annotations", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;", "getHomeDeliveryPrice", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;", "getHomeDeliveryPrice$annotations", "d", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;", "getHomeDeliveryTime", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;", "getHomeDeliveryTime$annotations", "Companion", "ItemAvailabilityRemote", "HomeDeliveryPriceRemote", "HomeDeliveryTimeRemote", "FromToRemote", "AvailabilityErrorRemote", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailabilityRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f92555e = {new C17451f(AvailabilityRemote$ItemAvailabilityRemote$$serializer.INSTANCE), new C17451f(AvailabilityRemote$AvailabilityErrorRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<ItemAvailabilityRemote> f92556a;

    /* renamed from: b  reason: collision with root package name */
    private final List<AvailabilityErrorRemote> f92557b;

    /* renamed from: c  reason: collision with root package name */
    private final HomeDeliveryPriceRemote f92558c;

    /* renamed from: d  reason: collision with root package name */
    private final HomeDeliveryTimeRemote f92559d;

    @p
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 '2\u00020\u0001:\u0004(\u0015) B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote;", "", "", "seen0", "", "status", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;", "details", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/network/b$b;", "a", "()Lcom/ingka/ikea/app/stockinfo/network/b$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "getStatus$annotations", "()V", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;", "getDetails", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;", "getDetails$annotations", "Companion", "ErrorDetails", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AvailabilityErrorRemote {
        public static final b Companion = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92560a;

        /* renamed from: b  reason: collision with root package name */
        private final ErrorDetails.Remote f92561b;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails;", "", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "classUnitType", "", "identifier", "<init>", "(Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "()Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$a;", "b", "Ljava/lang/String;", "Remote", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ErrorDetails {

            /* renamed from: a  reason: collision with root package name */
            private final ClassUnitKey.a f92562a;

            /* renamed from: b  reason: collision with root package name */
            private final String f92563b;

            @p
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u0015B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;", "", "", "seen0", "", "classUnitType", "itemNo", "zip", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails;", "a", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClassUnitType", "getClassUnitType$annotations", "()V", "getItemNo", "getItemNo$annotations", "c", "getZip", "getZip$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Remote {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: a  reason: collision with root package name */
                private final String f92564a;

                /* renamed from: b  reason: collision with root package name */
                private final String f92565b;

                /* renamed from: c  reason: collision with root package name */
                private final String f92566c;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<Remote> serializer() {
                        return AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Remote(int i10, String str, String str2, String str3, T0 t02) {
                    if (7 != (i10 & 7)) {
                        E0.b(i10, 7, AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f92564a = str;
                    this.f92565b = str2;
                    this.f92566c = str3;
                }

                public static final /* synthetic */ void b(Remote remote, C17395d dVar, SerialDescriptor serialDescriptor) {
                    Y0 y02 = Y0.f144077a;
                    dVar.B(serialDescriptor, 0, y02, remote.f92564a);
                    dVar.B(serialDescriptor, 1, y02, remote.f92565b);
                    dVar.B(serialDescriptor, 2, y02, remote.f92566c);
                }

                public final ErrorDetails a() {
                    ClassUnitKey.a a10 = ClassUnitKey.a.Companion.a(this.f92564a);
                    if (a10 == null) {
                        return null;
                    }
                    String str = this.f92565b;
                    if (str == null) {
                        str = this.f92566c;
                    }
                    return new ErrorDetails(a10, str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Remote)) {
                        return false;
                    }
                    Remote remote = (Remote) obj;
                    return C17542s.e(this.f92564a, remote.f92564a) && C17542s.e(this.f92565b, remote.f92565b) && C17542s.e(this.f92566c, remote.f92566c);
                }

                public int hashCode() {
                    String str = this.f92564a;
                    int i10 = 0;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f92565b;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f92566c;
                    if (str3 != null) {
                        i10 = str3.hashCode();
                    }
                    return hashCode2 + i10;
                }

                public String toString() {
                    String str = this.f92564a;
                    String str2 = this.f92565b;
                    String str3 = this.f92566c;
                    return "Remote(classUnitType=" + str + ", itemNo=" + str2 + ", zip=" + str3 + ")";
                }
            }

            public ErrorDetails(ClassUnitKey.a aVar, String str) {
                C17542s.j(aVar, "classUnitType");
                this.f92562a = aVar;
                this.f92563b = str;
            }

            public final ClassUnitKey.a a() {
                return this.f92562a;
            }

            public final String b() {
                return this.f92563b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorDetails)) {
                    return false;
                }
                ErrorDetails errorDetails = (ErrorDetails) obj;
                return this.f92562a == errorDetails.f92562a && C17542s.e(this.f92563b, errorDetails.f92563b);
            }

            public int hashCode() {
                int hashCode = this.f92562a.hashCode() * 31;
                String str = this.f92563b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                ClassUnitKey.a aVar = this.f92562a;
                String str = this.f92563b;
                return "ErrorDetails(classUnitType=" + aVar + ", identifier=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$a;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "INVALID_ZIP_CODE", "INVALID_INPUT", "INVALID_LOCALITY", "NO_AVAILABLE_SERVICE", "CONNECTION_PROBLEM", "UNKNOWN", "NOT_AUTHORIZED", "INVALID_REQUEST", "PRODUCT_NOT_FOUND", "REGION_NOT_FOUND", "ZIP_NOT_FOUND", "ZIP_NOT_SERVED", "SERVICE_UNAVAILABLE", "DELIVERY_PRICE_NOT_ENABLED", "ZIP_REQUIRED_FOR_HOME_DELIVERY", "ZIP_BASED_SERVICE_INACTIVE", "CLASSUNITCODE_DOES_NOT_EXIST", "UNSUPPORTED_ENUM_REQUEST_PARAM", "CLASSUNITCODE_VALIDATION_FAILED", "REQUEST_PARAM_TOO_LONG", "REQUEST_PARAM_TOO_SHORT", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum a {
            INVALID_ZIP_CODE("INVALID_ZIP_CODE"),
            INVALID_INPUT("INVALID_INPUT"),
            INVALID_LOCALITY("INVALID_LOCALITY"),
            NO_AVAILABLE_SERVICE("NO_AVAILABLE_SERVICE"),
            CONNECTION_PROBLEM("CONNECTION_PROBLEM"),
            UNKNOWN("UNKNOWN"),
            NOT_AUTHORIZED("NOT_AUTHORIZED"),
            INVALID_REQUEST("INVALID_REQUEST"),
            PRODUCT_NOT_FOUND("PRODUCT_NOT_FOUND"),
            REGION_NOT_FOUND("REGION_NOT_FOUND"),
            ZIP_NOT_FOUND("ZIP_NOT_FOUND"),
            ZIP_NOT_SERVED("ZIP_NOT_SERVED"),
            SERVICE_UNAVAILABLE("SERVICE_UNAVAILABLE"),
            DELIVERY_PRICE_NOT_ENABLED("DELIVERY_PRICE_NOT_ENABLED"),
            ZIP_REQUIRED_FOR_HOME_DELIVERY("ZIP_REQUIRED_FOR_HOME_DELIVERY"),
            ZIP_BASED_SERVICE_INACTIVE("ZIP_BASED_SERVICE_INACTIVE"),
            CLASSUNITCODE_DOES_NOT_EXIST("CLASSUNITCODE_DOES_NOT_EXIST"),
            UNSUPPORTED_ENUM_REQUEST_PARAM("UNSUPPORTED_ENUM_REQUEST_PARAM"),
            CLASSUNITCODE_VALIDATION_FAILED("CLASSUNITCODE_VALIDATION_FAILED"),
            REQUEST_PARAM_TOO_LONG("REQUEST_PARAM_TOO_LONG"),
            REQUEST_PARAM_TOO_SHORT("REQUEST_PARAM_TOO_SHORT");
            
            public static final C2057a Companion = null;
            private final String rawValue;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$a$a;", "", "<init>", "()V", "", "rawValue", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$a;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$a;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a$a  reason: collision with other inner class name */
            public static final class C2057a {
                public /* synthetic */ C2057a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final a a(String str) {
                    T t10;
                    C17542s.j(str, "rawValue");
                    Iterator<T> it = a.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C17542s.e(((a) t10).j(), str)) {
                            break;
                        }
                    }
                    a aVar = (a) t10;
                    if (aVar != null) {
                        return aVar;
                    }
                    e eVar = e.WARN;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a("Unknown error status: " + str, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = C2057a.class.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar.a(eVar, str5, false, (Throwable) null, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                    return a.UNKNOWN;
                }

                private C2057a() {
                }
            }

            static {
                a[] a10;
                $ENTRIES = C17221b.a(a10);
                Companion = new C2057a((DefaultConstructorMarker) null);
            }

            private a(String str) {
                this.rawValue = str;
            }

            public static C17220a<a> b() {
                return $ENTRIES;
            }

            public final String j() {
                return this.rawValue;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$AvailabilityErrorRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {
            private b() {
            }

            public final KSerializer<AvailabilityErrorRemote> serializer() {
                return AvailabilityRemote$AvailabilityErrorRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f92567a;

            /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
            /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
            /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a[] r0 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.REGION_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.ZIP_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.ZIP_NOT_SERVED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.INVALID_ZIP_CODE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.NO_AVAILABLE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.ZIP_BASED_SERVICE_INACTIVE     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.NOT_AUTHORIZED     // Catch:{ NoSuchFieldError -> 0x0050 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
                L_0x0050:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.SERVICE_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x005a }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                    r2 = 9
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
                L_0x005a:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.DELIVERY_PRICE_NOT_ENABLED     // Catch:{ NoSuchFieldError -> 0x0064 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                    r2 = 10
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
                L_0x0064:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.PRODUCT_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x006e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                    r2 = 11
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
                L_0x006e:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.CONNECTION_PROBLEM     // Catch:{ NoSuchFieldError -> 0x0078 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                    r2 = 12
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
                L_0x0078:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.INVALID_INPUT     // Catch:{ NoSuchFieldError -> 0x0082 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                    r2 = 13
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
                L_0x0082:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.INVALID_REQUEST     // Catch:{ NoSuchFieldError -> 0x008c }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                    r2 = 14
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
                L_0x008c:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.INVALID_LOCALITY     // Catch:{ NoSuchFieldError -> 0x0096 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                    r2 = 15
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
                L_0x0096:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.ZIP_REQUIRED_FOR_HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                    r2 = 16
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
                L_0x00a0:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.CLASSUNITCODE_DOES_NOT_EXIST     // Catch:{ NoSuchFieldError -> 0x00aa }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                    r2 = 17
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
                L_0x00aa:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.UNSUPPORTED_ENUM_REQUEST_PARAM     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                    r2 = 18
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
                L_0x00b4:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.CLASSUNITCODE_VALIDATION_FAILED     // Catch:{ NoSuchFieldError -> 0x00be }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                    r2 = 19
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
                L_0x00be:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.REQUEST_PARAM_TOO_LONG     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                    r2 = 20
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
                L_0x00c8:
                    com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$AvailabilityErrorRemote$a r1 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.a.REQUEST_PARAM_TOO_SHORT     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                    r2 = 21
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
                L_0x00d2:
                    f92567a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.AvailabilityErrorRemote.c.<clinit>():void");
            }
        }

        public /* synthetic */ AvailabilityErrorRemote(int i10, String str, ErrorDetails.Remote remote, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, AvailabilityRemote$AvailabilityErrorRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92560a = str;
            this.f92561b = remote;
        }

        public static final /* synthetic */ void c(AvailabilityErrorRemote availabilityErrorRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, availabilityErrorRemote.f92560a);
            dVar.B(serialDescriptor, 1, AvailabilityRemote$AvailabilityErrorRemote$ErrorDetails$Remote$$serializer.INSTANCE, availabilityErrorRemote.f92561b);
        }

        public final b.C2062b a() {
            a.C1886a aVar;
            String str = this.f92560a;
            ClassUnitKey.a aVar2 = null;
            if (str == null || str.length() == 0) {
                return null;
            }
            ErrorDetails.Remote remote = this.f92561b;
            ErrorDetails a10 = remote != null ? remote.a() : null;
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a11 = C11818a.a("Error fetching availability, message: " + b() + ", details: " + a10, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = AvailabilityErrorRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
            switch (c.f92567a[a.Companion.a(this.f92560a).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    aVar = a.C1886a.UNAVAILABLE;
                    break;
                case 6:
                    aVar = a.C1886a.FEATURE_TURNED_OFF;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    aVar = a.C1886a.UNKNOWN;
                    break;
                default:
                    throw new t();
            }
            String b10 = a10 != null ? a10.b() : null;
            Wk.a aVar3 = new Wk.a(aVar);
            if (a10 != null) {
                aVar2 = a10.a();
            }
            return new b.C2062b(aVar2, aVar3, b10);
        }

        public final String b() {
            return this.f92560a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvailabilityErrorRemote)) {
                return false;
            }
            AvailabilityErrorRemote availabilityErrorRemote = (AvailabilityErrorRemote) obj;
            return C17542s.e(this.f92560a, availabilityErrorRemote.f92560a) && C17542s.e(this.f92561b, availabilityErrorRemote.f92561b);
        }

        public int hashCode() {
            String str = this.f92560a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ErrorDetails.Remote remote = this.f92561b;
            if (remote != null) {
                i10 = remote.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f92560a;
            ErrorDetails.Remote remote = this.f92561b;
            return "AvailabilityErrorRemote(status=" + str + ", details=" + remote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b!\u0010 \u001a\u0004\b\u001c\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;", "", "", "seen0", "", "presentationPattern", "from", "to", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPresentationPattern$annotations", "()V", "getFrom$annotations", "c", "getTo$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FromToRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f92568a;

        /* renamed from: b  reason: collision with root package name */
        private final String f92569b;

        /* renamed from: c  reason: collision with root package name */
        private final String f92570c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<FromToRemote> serializer() {
                return AvailabilityRemote$FromToRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FromToRemote(int i10, String str, String str2, String str3, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, AvailabilityRemote$FromToRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92568a = str;
            this.f92569b = str2;
            this.f92570c = str3;
        }

        public static final /* synthetic */ void d(FromToRemote fromToRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, fromToRemote.f92568a);
            dVar.B(serialDescriptor, 1, y02, fromToRemote.f92569b);
            dVar.B(serialDescriptor, 2, y02, fromToRemote.f92570c);
        }

        public final String a() {
            return this.f92569b;
        }

        public final String b() {
            return this.f92568a;
        }

        public final String c() {
            return this.f92570c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FromToRemote)) {
                return false;
            }
            FromToRemote fromToRemote = (FromToRemote) obj;
            return C17542s.e(this.f92568a, fromToRemote.f92568a) && C17542s.e(this.f92569b, fromToRemote.f92569b) && C17542s.e(this.f92570c, fromToRemote.f92570c);
        }

        public int hashCode() {
            String str = this.f92568a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f92569b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f92570c;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f92568a;
            String str2 = this.f92569b;
            String str3 = this.f92570c;
            return "FromToRemote(presentationPattern=" + str + ", from=" + str2 + ", to=" + str3 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u0000 (2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0013)\u0015B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b\b\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$b;", "", "seen0", "", "amount", "", "isPuPIncluded", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAmount", "()Ljava/lang/Double;", "getAmount$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isPuPIncluded$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HomeDeliveryPriceRemote implements C11768b<b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Double f92571a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f92572b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<HomeDeliveryPriceRemote> serializer() {
                return AvailabilityRemote$HomeDeliveryPriceRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$b;", "", "", "amount", "", "isPuPIncluded", "<init>", "(DZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Z", "()Z", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final double f92573a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f92574b;

            public b(double d10, boolean z10) {
                this.f92573a = d10;
                this.f92574b = z10;
            }

            public final double a() {
                return this.f92573a;
            }

            public final boolean b() {
                return this.f92574b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Double.compare(this.f92573a, bVar.f92573a) == 0 && this.f92574b == bVar.f92574b;
            }

            public int hashCode() {
                return (Double.hashCode(this.f92573a) * 31) + Boolean.hashCode(this.f92574b);
            }

            public String toString() {
                double d10 = this.f92573a;
                boolean z10 = this.f92574b;
                return "HomeDeliveryPrice(amount=" + d10 + ", isPuPIncluded=" + z10 + ")";
            }
        }

        public /* synthetic */ HomeDeliveryPriceRemote(int i10, Double d10, Boolean bool, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, AvailabilityRemote$HomeDeliveryPriceRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92571a = d10;
            this.f92572b = bool;
        }

        public static final /* synthetic */ void b(HomeDeliveryPriceRemote homeDeliveryPriceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, C17438C.f144010a, homeDeliveryPriceRemote.f92571a);
            dVar.B(serialDescriptor, 1, C17457i.f144111a, homeDeliveryPriceRemote.f92572b);
        }

        public b a() {
            Double d10 = this.f92571a;
            if (d10 == null) {
                return null;
            }
            double doubleValue = d10.doubleValue();
            Boolean bool = this.f92572b;
            return new b(doubleValue, bool != null ? bool.booleanValue() : false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeDeliveryPriceRemote)) {
                return false;
            }
            HomeDeliveryPriceRemote homeDeliveryPriceRemote = (HomeDeliveryPriceRemote) obj;
            return C17542s.e(this.f92571a, homeDeliveryPriceRemote.f92571a) && C17542s.e(this.f92572b, homeDeliveryPriceRemote.f92572b);
        }

        public int hashCode() {
            Double d10 = this.f92571a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Boolean bool = this.f92572b;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f92571a;
            Boolean bool = this.f92572b;
            return "HomeDeliveryPriceRemote(amount=" + d10 + ", isPuPIncluded=" + bool + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 %2\u00020\u0001:\u0003\u0010&\u0015B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;", "", "", "seen0", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;", "dateRange", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LXk/a;", "formatDeliveryTimeUseCase", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$b;", "a", "(LXk/a;)Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;", "getDateRange", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$FromToRemote;", "getDateRange$annotations", "()V", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HomeDeliveryTimeRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final FromToRemote f92575a;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<HomeDeliveryTimeRemote> serializer() {
                return AvailabilityRemote$HomeDeliveryTimeRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$b;", "", "LWk/e$b$a$d;", "dateRange", "<init>", "(LWk/e$b$a$d;)V", "LWk/e$b$a$b;", "a", "()LWk/e$b$a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWk/e$b$a$d;", "getDateRange", "()LWk/e$b$a$d;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final e.b.a.d f92576a;

            public b(e.b.a.d dVar) {
                C17542s.j(dVar, "dateRange");
                this.f92576a = dVar;
            }

            public final e.b.a.C1889b a() {
                return new e.b.a.C1889b(this.f92576a);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f92576a, ((b) obj).f92576a);
            }

            public int hashCode() {
                return this.f92576a.hashCode();
            }

            public String toString() {
                e.b.a.d dVar = this.f92576a;
                return "HomeDeliveryTime(dateRange=" + dVar + ")";
            }
        }

        public /* synthetic */ HomeDeliveryTimeRemote(int i10, FromToRemote fromToRemote, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, AvailabilityRemote$HomeDeliveryTimeRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92575a = fromToRemote;
        }

        public final b a(Xk.a aVar) {
            String a10;
            String c10;
            C17542s.j(aVar, "formatDeliveryTimeUseCase");
            String b10 = this.f92575a.b();
            if (b10 == null || b10.length() == 0 || (a10 = this.f92575a.a()) == null || a10.length() == 0 || (c10 = this.f92575a.c()) == null || c10.length() == 0) {
                return null;
            }
            String a11 = aVar.a(this.f92575a.b(), this.f92575a.a());
            String a12 = aVar.a(this.f92575a.b(), this.f92575a.c());
            if (a11 == null || a12 == null) {
                return null;
            }
            return new b(new e.b.a.d(a11, a12));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeDeliveryTimeRemote) && C17542s.e(this.f92575a, ((HomeDeliveryTimeRemote) obj).f92575a);
        }

        public int hashCode() {
            return this.f92575a.hashCode();
        }

        public String toString() {
            FromToRemote fromToRemote = this.f92575a;
            return "HomeDeliveryTimeRemote(dateRange=" + fromToRemote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\b\b\u0018\u0000 I2\u00020\u0001:\u0005JKLM\u0019BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J+\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010/\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010/\u0012\u0004\b5\u00103\u001a\u0004\b4\u00101R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u00106\u0012\u0004\b9\u00103\u001a\u0004\b7\u00108R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u00103\u001a\u0004\b<\u0010=R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u00103\u001a\u0004\bA\u0010BR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u00103\u001a\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote;", "", "", "seen0", "", "availableForClickCollect", "availableForHomeDelivery", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;", "itemKey", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;", "buyingOption", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;", "classUnitKey", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;", "exceptions", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;LjK/T0;)V", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$b;", "homeDeliveryPrice", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$b;", "homeDeliveryTime", "LWk/e$b$a$c;", "a", "(Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$b;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$b;)LWk/e$b$a$c;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "isClickCollectAvailabilityEnabled", "Lcom/ingka/ikea/app/stockinfo/network/b$a;", "b", "(ZLcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryPriceRemote$b;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$HomeDeliveryTimeRemote$b;)Lcom/ingka/ikea/app/stockinfo/network/b$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAvailableForClickCollect", "()Ljava/lang/Boolean;", "getAvailableForClickCollect$annotations", "()V", "getAvailableForHomeDelivery", "getAvailableForHomeDelivery$annotations", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;", "getItemKey", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;", "getItemKey$annotations", "d", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;", "getBuyingOption", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;", "getBuyingOption$annotations", "e", "Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;", "getClassUnitKey", "()Lcom/ingka/ikea/app/stockinfo/network/ClassUnitKey$Remote;", "getClassUnitKey$annotations", "f", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;", "getExceptions", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;", "getExceptions$annotations", "Companion", "ItemKey", "AvailabilityException", "BuyingOption", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ItemAvailabilityRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f92577a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f92578b;

        /* renamed from: c  reason: collision with root package name */
        private final ItemKey f92579c;

        /* renamed from: d  reason: collision with root package name */
        private final BuyingOption f92580d;

        /* renamed from: e  reason: collision with root package name */
        private final ClassUnitKey.Remote f92581e;

        /* renamed from: f  reason: collision with root package name */
        private final AvailabilityException f92582f;

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001c¨\u0006!"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;", "", "", "seen0", "", "longTermSupplyIssue", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getLongTermSupplyIssue$annotations", "()V", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AvailabilityException {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final Boolean f92583a;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<AvailabilityException> serializer() {
                    return AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ AvailabilityException(int i10, Boolean bool, T0 t02) {
                if (1 != (i10 & 1)) {
                    E0.b(i10, 1, AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException$$serializer.INSTANCE.getDescriptor());
                }
                this.f92583a = bool;
            }

            public final Boolean a() {
                return this.f92583a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AvailabilityException) && C17542s.e(this.f92583a, ((AvailabilityException) obj).f92583a);
            }

            public int hashCode() {
                Boolean bool = this.f92583a;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public String toString() {
                Boolean bool = this.f92583a;
                return "AvailabilityException(longTermSupplyIssue=" + bool + ")";
            }
        }

        @p
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 &2\u00020\u0001:\u0004'()\u001dB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010$¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;", "", "", "seen0", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;", "homeDelivery", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;", "clickCollect", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;", "b", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;", "getHomeDelivery$annotations", "()V", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;", "getClickCollect$annotations", "Companion", "HomeDeliveryAvailability", "ClickCollectDeliveryAvailability", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BuyingOption {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final HomeDeliveryAvailability f92584a;

            /* renamed from: b  reason: collision with root package name */
            private final ClickCollectDeliveryAvailability f92585b;

            @p
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 &2\u00020\u0001:\u0004'()\u001dB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b\u001d\u0010$¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;", "", "", "seen0", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;", "range", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;", "collectPrice", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;", "b", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;", "getRange$annotations", "()V", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;", "getCollectPrice$annotations", "Companion", "Range", "CollectPrice", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class ClickCollectDeliveryAvailability {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: a  reason: collision with root package name */
                private final Range f92586a;

                /* renamed from: b  reason: collision with root package name */
                private final CollectPrice f92587b;

                @p
                @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000  2\u00020\u0001:\u0002!\u001bB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001d¨\u0006\""}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;", "", "", "seen0", "", "amount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getAmount$annotations", "()V", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class CollectPrice {
                    public static final a Companion = new a((DefaultConstructorMarker) null);

                    /* renamed from: a  reason: collision with root package name */
                    private final Double f92588a;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a {
                        private a() {
                        }

                        public final KSerializer<CollectPrice> serializer() {
                            return AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice$$serializer.INSTANCE;
                        }

                        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    public /* synthetic */ CollectPrice(int i10, Double d10, T0 t02) {
                        if (1 != (i10 & 1)) {
                            E0.b(i10, 1, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice$$serializer.INSTANCE.getDescriptor());
                        }
                        this.f92588a = d10;
                    }

                    public final Double a() {
                        return this.f92588a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof CollectPrice) && C17542s.e(this.f92588a, ((CollectPrice) obj).f92588a);
                    }

                    public int hashCode() {
                        Double d10 = this.f92588a;
                        if (d10 == null) {
                            return 0;
                        }
                        return d10.hashCode();
                    }

                    public String toString() {
                        Double d10 = this.f92588a;
                        return "CollectPrice(amount=" + d10 + ")";
                    }
                }

                @p
                @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001aB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001c¨\u0006!"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;", "", "", "seen0", "", "inRange", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getInRange$annotations", "()V", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class Range {
                    public static final a Companion = new a((DefaultConstructorMarker) null);

                    /* renamed from: a  reason: collision with root package name */
                    private final Boolean f92589a;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a {
                        private a() {
                        }

                        public final KSerializer<Range> serializer() {
                            return AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range$$serializer.INSTANCE;
                        }

                        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    public /* synthetic */ Range(int i10, Boolean bool, T0 t02) {
                        if (1 != (i10 & 1)) {
                            E0.b(i10, 1, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range$$serializer.INSTANCE.getDescriptor());
                        }
                        this.f92589a = bool;
                    }

                    public final Boolean a() {
                        return this.f92589a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Range) && C17542s.e(this.f92589a, ((Range) obj).f92589a);
                    }

                    public int hashCode() {
                        Boolean bool = this.f92589a;
                        if (bool == null) {
                            return 0;
                        }
                        return bool.hashCode();
                    }

                    public String toString() {
                        Boolean bool = this.f92589a;
                        return "Range(inRange=" + bool + ")";
                    }
                }

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<ClickCollectDeliveryAvailability> serializer() {
                        return AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ ClickCollectDeliveryAvailability(int i10, Range range, CollectPrice collectPrice, T0 t02) {
                    if (3 != (i10 & 3)) {
                        E0.b(i10, 3, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f92586a = range;
                    this.f92587b = collectPrice;
                }

                public static final /* synthetic */ void c(ClickCollectDeliveryAvailability clickCollectDeliveryAvailability, C17395d dVar, SerialDescriptor serialDescriptor) {
                    dVar.B(serialDescriptor, 0, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range$$serializer.INSTANCE, clickCollectDeliveryAvailability.f92586a);
                    dVar.B(serialDescriptor, 1, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice$$serializer.INSTANCE, clickCollectDeliveryAvailability.f92587b);
                }

                public final CollectPrice a() {
                    return this.f92587b;
                }

                public final Range b() {
                    return this.f92586a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ClickCollectDeliveryAvailability)) {
                        return false;
                    }
                    ClickCollectDeliveryAvailability clickCollectDeliveryAvailability = (ClickCollectDeliveryAvailability) obj;
                    return C17542s.e(this.f92586a, clickCollectDeliveryAvailability.f92586a) && C17542s.e(this.f92587b, clickCollectDeliveryAvailability.f92587b);
                }

                public int hashCode() {
                    Range range = this.f92586a;
                    int i10 = 0;
                    int hashCode = (range == null ? 0 : range.hashCode()) * 31;
                    CollectPrice collectPrice = this.f92587b;
                    if (collectPrice != null) {
                        i10 = collectPrice.hashCode();
                    }
                    return hashCode + i10;
                }

                public String toString() {
                    Range range = this.f92586a;
                    CollectPrice collectPrice = this.f92587b;
                    return "ClickCollectDeliveryAvailability(range=" + range + ", collectPrice=" + collectPrice + ")";
                }
            }

            @p
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000  2\u00020\u0001:\u0003!\"\u001bB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010\u001d¨\u0006#"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;", "", "", "seen0", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;", "availability", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;", "()Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;", "getAvailability$annotations", "()V", "Companion", "BuyingOptionAvailability", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class HomeDeliveryAvailability {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: a  reason: collision with root package name */
                private final BuyingOptionAvailability f92590a;

                @p
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001cB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b\u001c\u0010#¨\u0006'"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;", "", "", "seen0", "", "quantity", "", "limitedDeliveryMethods", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Float;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "getQuantity$annotations", "()V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getLimitedDeliveryMethods$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class BuyingOptionAvailability {
                    public static final a Companion = new a((DefaultConstructorMarker) null);

                    /* renamed from: a  reason: collision with root package name */
                    private final Float f92591a;

                    /* renamed from: b  reason: collision with root package name */
                    private final Boolean f92592b;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class a {
                        private a() {
                        }

                        public final KSerializer<BuyingOptionAvailability> serializer() {
                            return AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability$$serializer.INSTANCE;
                        }

                        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    public /* synthetic */ BuyingOptionAvailability(int i10, Float f10, Boolean bool, T0 t02) {
                        if (3 != (i10 & 3)) {
                            E0.b(i10, 3, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$BuyingOptionAvailability$$serializer.INSTANCE.getDescriptor());
                        }
                        this.f92591a = f10;
                        this.f92592b = bool;
                    }

                    public static final /* synthetic */ void c(BuyingOptionAvailability buyingOptionAvailability, C17395d dVar, SerialDescriptor serialDescriptor) {
                        dVar.B(serialDescriptor, 0, M.f144051a, buyingOptionAvailability.f92591a);
                        dVar.B(serialDescriptor, 1, C17457i.f144111a, buyingOptionAvailability.f92592b);
                    }

                    public final Boolean a() {
                        return this.f92592b;
                    }

                    public final Float b() {
                        return this.f92591a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof BuyingOptionAvailability)) {
                            return false;
                        }
                        BuyingOptionAvailability buyingOptionAvailability = (BuyingOptionAvailability) obj;
                        return C17542s.e(this.f92591a, buyingOptionAvailability.f92591a) && C17542s.e(this.f92592b, buyingOptionAvailability.f92592b);
                    }

                    public int hashCode() {
                        Float f10 = this.f92591a;
                        int i10 = 0;
                        int hashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
                        Boolean bool = this.f92592b;
                        if (bool != null) {
                            i10 = bool.hashCode();
                        }
                        return hashCode + i10;
                    }

                    public String toString() {
                        Float f10 = this.f92591a;
                        Boolean bool = this.f92592b;
                        return "BuyingOptionAvailability(quantity=" + f10 + ", limitedDeliveryMethods=" + bool + ")";
                    }
                }

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<HomeDeliveryAvailability> serializer() {
                        return AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ HomeDeliveryAvailability(int i10, BuyingOptionAvailability buyingOptionAvailability, T0 t02) {
                    if (1 != (i10 & 1)) {
                        E0.b(i10, 1, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f92590a = buyingOptionAvailability;
                }

                public final BuyingOptionAvailability a() {
                    return this.f92590a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof HomeDeliveryAvailability) && C17542s.e(this.f92590a, ((HomeDeliveryAvailability) obj).f92590a);
                }

                public int hashCode() {
                    BuyingOptionAvailability buyingOptionAvailability = this.f92590a;
                    if (buyingOptionAvailability == null) {
                        return 0;
                    }
                    return buyingOptionAvailability.hashCode();
                }

                public String toString() {
                    BuyingOptionAvailability buyingOptionAvailability = this.f92590a;
                    return "HomeDeliveryAvailability(availability=" + buyingOptionAvailability + ")";
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$BuyingOption;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<BuyingOption> serializer() {
                    return AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ BuyingOption(int i10, HomeDeliveryAvailability homeDeliveryAvailability, ClickCollectDeliveryAvailability clickCollectDeliveryAvailability, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$$serializer.INSTANCE.getDescriptor());
                }
                this.f92584a = homeDeliveryAvailability;
                this.f92585b = clickCollectDeliveryAvailability;
            }

            public static final /* synthetic */ void c(BuyingOption buyingOption, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.B(serialDescriptor, 0, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$HomeDeliveryAvailability$$serializer.INSTANCE, buyingOption.f92584a);
                dVar.B(serialDescriptor, 1, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$$serializer.INSTANCE, buyingOption.f92585b);
            }

            public final ClickCollectDeliveryAvailability a() {
                return this.f92585b;
            }

            public final HomeDeliveryAvailability b() {
                return this.f92584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BuyingOption)) {
                    return false;
                }
                BuyingOption buyingOption = (BuyingOption) obj;
                return C17542s.e(this.f92584a, buyingOption.f92584a) && C17542s.e(this.f92585b, buyingOption.f92585b);
            }

            public int hashCode() {
                HomeDeliveryAvailability homeDeliveryAvailability = this.f92584a;
                int i10 = 0;
                int hashCode = (homeDeliveryAvailability == null ? 0 : homeDeliveryAvailability.hashCode()) * 31;
                ClickCollectDeliveryAvailability clickCollectDeliveryAvailability = this.f92585b;
                if (clickCollectDeliveryAvailability != null) {
                    i10 = clickCollectDeliveryAvailability.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                HomeDeliveryAvailability homeDeliveryAvailability = this.f92584a;
                ClickCollectDeliveryAvailability clickCollectDeliveryAvailability = this.f92585b;
                return "BuyingOption(homeDelivery=" + homeDeliveryAvailability + ", clickCollect=" + clickCollectDeliveryAvailability + ")";
            }
        }

        @p
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u0014B/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;", "", "", "seen0", "", "itemNo", "itemType", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/app/base/ProductKey;", "a", "()Lcom/ingka/ikea/app/base/ProductKey;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "()V", "getItemType", "getItemType$annotations", "Companion", "$serializer", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ItemKey {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f92593a;

            /* renamed from: b  reason: collision with root package name */
            private final String f92594b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$ItemKey;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<ItemKey> serializer() {
                    return AvailabilityRemote$ItemAvailabilityRemote$ItemKey$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ ItemKey(int i10, String str, String str2, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, AvailabilityRemote$ItemAvailabilityRemote$ItemKey$$serializer.INSTANCE.getDescriptor());
                }
                this.f92593a = str;
                this.f92594b = str2;
            }

            public static final /* synthetic */ void b(ItemKey itemKey, C17395d dVar, SerialDescriptor serialDescriptor) {
                Y0 y02 = Y0.f144077a;
                dVar.B(serialDescriptor, 0, y02, itemKey.f92593a);
                dVar.B(serialDescriptor, 1, y02, itemKey.f92594b);
            }

            public final ProductKey a() {
                String str;
                String str2 = this.f92593a;
                if (str2 == null || str2.length() == 0 || (str = this.f92594b) == null || str.length() == 0) {
                    return null;
                }
                return new ProductKey(this.f92593a, this.f92594b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ItemKey)) {
                    return false;
                }
                ItemKey itemKey = (ItemKey) obj;
                return C17542s.e(this.f92593a, itemKey.f92593a) && C17542s.e(this.f92594b, itemKey.f92594b);
            }

            public int hashCode() {
                String str = this.f92593a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f92594b;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return hashCode + i10;
            }

            public String toString() {
                String str = this.f92593a;
                String str2 = this.f92594b;
                return "ItemKey(itemNo=" + str + ", itemType=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$ItemAvailabilityRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ItemAvailabilityRemote> serializer() {
                return AvailabilityRemote$ItemAvailabilityRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f92595a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.ingka.ikea.app.stockinfo.network.ClassUnitKey$a[] r0 = com.ingka.ikea.app.stockinfo.network.ClassUnitKey.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.app.stockinfo.network.ClassUnitKey$a r1 = com.ingka.ikea.app.stockinfo.network.ClassUnitKey.a.STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.app.stockinfo.network.ClassUnitKey$a r1 = com.ingka.ikea.app.stockinfo.network.ClassUnitKey.a.RETAIL_UNIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f92595a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.ItemAvailabilityRemote.b.<clinit>():void");
            }
        }

        public /* synthetic */ ItemAvailabilityRemote(int i10, Boolean bool, Boolean bool2, ItemKey itemKey, BuyingOption buyingOption, ClassUnitKey.Remote remote, AvailabilityException availabilityException, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, AvailabilityRemote$ItemAvailabilityRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f92577a = bool;
            this.f92578b = bool2;
            this.f92579c = itemKey;
            this.f92580d = buyingOption;
            this.f92581e = remote;
            this.f92582f = availabilityException;
        }

        private final e.b.a.c a(ClassUnitKey classUnitKey, HomeDeliveryPriceRemote.b bVar, HomeDeliveryTimeRemote.b bVar2) {
            BuyingOption.HomeDeliveryAvailability b10;
            BuyingOption.HomeDeliveryAvailability.BuyingOptionAvailability a10;
            Boolean a11;
            BuyingOption.HomeDeliveryAvailability b11;
            BuyingOption.HomeDeliveryAvailability.BuyingOptionAvailability a12;
            Float b12;
            int i10 = b.f92595a[classUnitKey.b().ordinal()];
            e.b.a.C1889b bVar3 = null;
            if (i10 == 1) {
                return null;
            }
            if (i10 == 2) {
                Boolean bool = this.f92578b;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                BuyingOption buyingOption = this.f92580d;
                Integer valueOf = (buyingOption == null || (b11 = buyingOption.b()) == null || (a12 = b11.a()) == null || (b12 = a12.b()) == null) ? null : Integer.valueOf((int) b12.floatValue());
                BuyingOption buyingOption2 = this.f92580d;
                boolean booleanValue2 = (buyingOption2 == null || (b10 = buyingOption2.b()) == null || (a10 = b10.a()) == null || (a11 = a10.a()) == null) ? false : a11.booleanValue();
                Double valueOf2 = bVar != null ? Double.valueOf(bVar.a()) : null;
                if (bVar2 != null) {
                    bVar3 = bVar2.a();
                }
                return new e.b.a.c(booleanValue, valueOf, booleanValue2, valueOf2, bVar3, bVar != null ? bVar.b() : false);
            }
            throw new t();
        }

        public static final /* synthetic */ void c(ItemAvailabilityRemote itemAvailabilityRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 0, iVar, itemAvailabilityRemote.f92577a);
            dVar.B(serialDescriptor, 1, iVar, itemAvailabilityRemote.f92578b);
            dVar.B(serialDescriptor, 2, AvailabilityRemote$ItemAvailabilityRemote$ItemKey$$serializer.INSTANCE, itemAvailabilityRemote.f92579c);
            dVar.B(serialDescriptor, 3, AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$$serializer.INSTANCE, itemAvailabilityRemote.f92580d);
            dVar.B(serialDescriptor, 4, ClassUnitKey$Remote$$serializer.INSTANCE, itemAvailabilityRemote.f92581e);
            dVar.B(serialDescriptor, 5, AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException$$serializer.INSTANCE, itemAvailabilityRemote.f92582f);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: Wk.e$b$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: Wk.e$b$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: Wk.e$b$a$a} */
        /* JADX WARNING: type inference failed for: r7v19, types: [Wk.e$b$a$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ingka.ikea.app.stockinfo.network.b.a b(boolean r18, com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.HomeDeliveryPriceRemote.b r19, com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.HomeDeliveryTimeRemote.b r20) {
            /*
                r17 = this;
                r0 = r17
                com.ingka.ikea.app.stockinfo.network.ClassUnitKey$Remote r1 = r0.f92581e
                r2 = 0
                if (r1 == 0) goto L_0x000c
                com.ingka.ikea.app.stockinfo.network.ClassUnitKey r1 = r1.a()
                goto L_0x000d
            L_0x000c:
                r1 = r2
            L_0x000d:
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$ItemKey r3 = r0.f92579c
                if (r3 == 0) goto L_0x0016
                com.ingka.ikea.app.base.ProductKey r3 = r3.a()
                goto L_0x0017
            L_0x0016:
                r3 = r2
            L_0x0017:
                r4 = 1
                r5 = 2
                if (r3 == 0) goto L_0x00a5
                if (r1 != 0) goto L_0x001f
                goto L_0x00a5
            L_0x001f:
                r6 = r19
                r7 = r20
                Wk.e$b$a$c r6 = r0.a(r1, r6, r7)
                java.lang.Boolean r7 = r0.f92577a
                r8 = 0
                if (r7 == 0) goto L_0x0060
                boolean r7 = r7.booleanValue()
                Wk.e$b$a$a r9 = new Wk.e$b$a$a
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$BuyingOption r10 = r0.f92580d
                if (r10 == 0) goto L_0x0047
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability r10 = r10.a()
                if (r10 == 0) goto L_0x0047
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$Range r10 = r10.b()
                if (r10 == 0) goto L_0x0047
                java.lang.Boolean r10 = r10.a()
                goto L_0x0048
            L_0x0047:
                r10 = r2
            L_0x0048:
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$BuyingOption r11 = r0.f92580d
                if (r11 == 0) goto L_0x005c
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability r11 = r11.a()
                if (r11 == 0) goto L_0x005c
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$BuyingOption$ClickCollectDeliveryAvailability$CollectPrice r11 = r11.a()
                if (r11 == 0) goto L_0x005c
                java.lang.Double r2 = r11.a()
            L_0x005c:
                r9.<init>(r7, r10, r2)
                goto L_0x006b
            L_0x0060:
                if (r18 == 0) goto L_0x006a
                Wk.e$b$a$a r7 = new Wk.e$b$a$a
                java.lang.Boolean r9 = java.lang.Boolean.FALSE
                r7.<init>(r8, r9, r2)
                r2 = r7
            L_0x006a:
                r9 = r2
            L_0x006b:
                com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote$AvailabilityException r2 = r0.f92582f
                if (r2 == 0) goto L_0x0079
                java.lang.Boolean r2 = r2.a()
                if (r2 == 0) goto L_0x0079
                boolean r8 = r2.booleanValue()
            L_0x0079:
                Wk.e$b$a r2 = new Wk.e$b$a
                r2.<init>(r3, r9, r8, r6)
                com.ingka.ikea.app.stockinfo.network.ClassUnitKey$a r3 = r1.b()
                int[] r6 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.ItemAvailabilityRemote.b.f92595a
                int r3 = r3.ordinal()
                r3 = r6[r3]
                if (r3 == r4) goto L_0x009a
                if (r3 != r5) goto L_0x0094
                com.ingka.ikea.app.stockinfo.network.b$a$a r1 = new com.ingka.ikea.app.stockinfo.network.b$a$a
                r1.<init>(r2)
                goto L_0x00a4
            L_0x0094:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x009a:
                java.lang.String r1 = r1.a()
                com.ingka.ikea.app.stockinfo.network.b$a$b r3 = new com.ingka.ikea.app.stockinfo.network.b$a$b
                r3.<init>(r1, r2)
                r1 = r3
            L_0x00a4:
                return r1
            L_0x00a5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Missing key"
                r1.<init>(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "Invalid response: "
                r3.append(r6)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                qv.e r12 = qv.e.ERROR
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x00d0:
                boolean r8 = r6.hasNext()
                r13 = 0
                if (r8 == 0) goto L_0x00e8
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r12, r13)
                if (r9 == 0) goto L_0x00d0
                r7.add(r8)
                goto L_0x00d0
            L_0x00e8:
                java.util.Iterator r14 = r7.iterator()
                r6 = r2
                r7 = r6
            L_0x00ee:
                boolean r8 = r14.hasNext()
                if (r8 == 0) goto L_0x016a
                java.lang.Object r8 = r14.next()
                qv.b r8 = (qv.C11819b) r8
                if (r6 != 0) goto L_0x0108
                java.lang.String r6 = qv.C11818a.a(r2, r1)
                if (r6 != 0) goto L_0x0104
                goto L_0x016a
            L_0x0104:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x0108:
                r15 = r6
                if (r7 != 0) goto L_0x015a
                if (r3 != 0) goto L_0x0130
                java.lang.Class<com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$ItemAvailabilityRemote> r6 = com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.ItemAvailabilityRemote.class
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r7 = 36
                java.lang.String r7 = HJ.C15854t.s1(r6, r7, r2, r5, r2)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r2, r5, r2)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x0129
                goto L_0x0131
            L_0x0129:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r7, r6)
                goto L_0x0131
            L_0x0130:
                r6 = r3
            L_0x0131:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r9 = "main"
                boolean r7 = HJ.C15854t.b0(r7, r9, r4)
                if (r7 == 0) goto L_0x0144
                java.lang.String r7 = "m"
                goto L_0x0146
            L_0x0144:
                java.lang.String r7 = "b"
            L_0x0146:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "|"
                r9.append(r7)
                r9.append(r6)
                java.lang.String r7 = r9.toString()
            L_0x015a:
                r16 = r7
                r6 = r8
                r7 = r12
                r8 = r16
                r9 = r13
                r10 = r1
                r11 = r15
                r6.a(r7, r8, r9, r10, r11)
                r6 = r15
                r7 = r16
                goto L_0x00ee
            L_0x016a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.stockinfo.network.AvailabilityRemote.ItemAvailabilityRemote.b(boolean, com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$HomeDeliveryPriceRemote$b, com.ingka.ikea.app.stockinfo.network.AvailabilityRemote$HomeDeliveryTimeRemote$b):com.ingka.ikea.app.stockinfo.network.b$a");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemAvailabilityRemote)) {
                return false;
            }
            ItemAvailabilityRemote itemAvailabilityRemote = (ItemAvailabilityRemote) obj;
            return C17542s.e(this.f92577a, itemAvailabilityRemote.f92577a) && C17542s.e(this.f92578b, itemAvailabilityRemote.f92578b) && C17542s.e(this.f92579c, itemAvailabilityRemote.f92579c) && C17542s.e(this.f92580d, itemAvailabilityRemote.f92580d) && C17542s.e(this.f92581e, itemAvailabilityRemote.f92581e) && C17542s.e(this.f92582f, itemAvailabilityRemote.f92582f);
        }

        public int hashCode() {
            Boolean bool = this.f92577a;
            int i10 = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f92578b;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            ItemKey itemKey = this.f92579c;
            int hashCode3 = (hashCode2 + (itemKey == null ? 0 : itemKey.hashCode())) * 31;
            BuyingOption buyingOption = this.f92580d;
            int hashCode4 = (hashCode3 + (buyingOption == null ? 0 : buyingOption.hashCode())) * 31;
            ClassUnitKey.Remote remote = this.f92581e;
            int hashCode5 = (hashCode4 + (remote == null ? 0 : remote.hashCode())) * 31;
            AvailabilityException availabilityException = this.f92582f;
            if (availabilityException != null) {
                i10 = availabilityException.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            Boolean bool = this.f92577a;
            Boolean bool2 = this.f92578b;
            ItemKey itemKey = this.f92579c;
            BuyingOption buyingOption = this.f92580d;
            ClassUnitKey.Remote remote = this.f92581e;
            AvailabilityException availabilityException = this.f92582f;
            return "ItemAvailabilityRemote(availableForClickCollect=" + bool + ", availableForHomeDelivery=" + bool2 + ", itemKey=" + itemKey + ", buyingOption=" + buyingOption + ", classUnitKey=" + remote + ", exceptions=" + availabilityException + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AvailabilityRemote> serializer() {
            return AvailabilityRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AvailabilityRemote(int i10, List list, List list2, HomeDeliveryPriceRemote homeDeliveryPriceRemote, HomeDeliveryTimeRemote homeDeliveryTimeRemote, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, AvailabilityRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92556a = list;
        this.f92557b = list2;
        this.f92558c = homeDeliveryPriceRemote;
        this.f92559d = homeDeliveryTimeRemote;
    }

    public static final /* synthetic */ void c(AvailabilityRemote availabilityRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f92555e;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], availabilityRemote.f92556a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], availabilityRemote.f92557b);
        dVar.B(serialDescriptor, 2, AvailabilityRemote$HomeDeliveryPriceRemote$$serializer.INSTANCE, availabilityRemote.f92558c);
        dVar.B(serialDescriptor, 3, AvailabilityRemote$HomeDeliveryTimeRemote$$serializer.INSTANCE, availabilityRemote.f92559d);
    }

    public final List<b> b(boolean z10, Xk.a aVar) {
        List list;
        List list2;
        b.C2062b bVar;
        C17542s.j(aVar, "deliveryTimeUseCase");
        HomeDeliveryPriceRemote homeDeliveryPriceRemote = this.f92558c;
        HomeDeliveryTimeRemote.b bVar2 = null;
        HomeDeliveryPriceRemote.b a10 = homeDeliveryPriceRemote != null ? homeDeliveryPriceRemote.a() : null;
        HomeDeliveryTimeRemote homeDeliveryTimeRemote = this.f92559d;
        if (homeDeliveryTimeRemote != null) {
            bVar2 = homeDeliveryTimeRemote.a(aVar);
        }
        List<ItemAvailabilityRemote> list3 = this.f92556a;
        if (list3 != null) {
            list = new ArrayList();
            for (ItemAvailabilityRemote b10 : list3) {
                b.a b11 = b10.b(z10, a10, bVar2);
                if (b11 != null) {
                    list.add(b11);
                }
            }
        } else {
            list = C16877v.n();
        }
        List<AvailabilityErrorRemote> list4 = this.f92557b;
        if (list4 != null) {
            list2 = new ArrayList();
            for (AvailabilityErrorRemote a11 : list4) {
                b.C2062b a12 = a11.a();
                if (a12 != null) {
                    list2.add(a12);
                }
            }
        } else {
            list2 = C16877v.n();
        }
        if (!list.isEmpty() || (bVar = (b.C2062b) C16877v.y0(list2)) == null) {
            return C16877v.V0(list, list2);
        }
        throw bVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailabilityRemote)) {
            return false;
        }
        AvailabilityRemote availabilityRemote = (AvailabilityRemote) obj;
        return C17542s.e(this.f92556a, availabilityRemote.f92556a) && C17542s.e(this.f92557b, availabilityRemote.f92557b) && C17542s.e(this.f92558c, availabilityRemote.f92558c) && C17542s.e(this.f92559d, availabilityRemote.f92559d);
    }

    public int hashCode() {
        List<ItemAvailabilityRemote> list = this.f92556a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AvailabilityErrorRemote> list2 = this.f92557b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        HomeDeliveryPriceRemote homeDeliveryPriceRemote = this.f92558c;
        int hashCode3 = (hashCode2 + (homeDeliveryPriceRemote == null ? 0 : homeDeliveryPriceRemote.hashCode())) * 31;
        HomeDeliveryTimeRemote homeDeliveryTimeRemote = this.f92559d;
        if (homeDeliveryTimeRemote != null) {
            i10 = homeDeliveryTimeRemote.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        List<ItemAvailabilityRemote> list = this.f92556a;
        List<AvailabilityErrorRemote> list2 = this.f92557b;
        HomeDeliveryPriceRemote homeDeliveryPriceRemote = this.f92558c;
        HomeDeliveryTimeRemote homeDeliveryTimeRemote = this.f92559d;
        return "AvailabilityRemote(availabilities=" + list + ", errors=" + list2 + ", homeDeliveryPrice=" + homeDeliveryPriceRemote + ", homeDeliveryTime=" + homeDeliveryTimeRemote + ")";
    }
}
