package com.ingka.ikea.store.impl.data.remotemodel;

import GB.C12918c;
import GB.h;
import GB.i;
import HJ.C15854t;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import bI.C17035a;
import com.ingka.ikea.appconfig.model.LocationLatLng;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\b\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005MNOP/B\u0001\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b/\u00100\u0012\u0004\b1\u00102R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b$\u00100\u0012\u0004\b3\u00102R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\f\n\u0004\b\"\u00104\u0012\u0004\b5\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\f\n\u0004\b6\u00104\u0012\u0004\b7\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b;\u00100\u0012\u0004\b<\u00102R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b=\u00100\u0012\u0004\b>\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\b?\u00100\u0012\u0004\b@\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\f\n\u0004\bA\u00100\u0012\u0004\bB\u00102R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0004¢\u0006\f\n\u0004\bC\u0010D\u0012\u0004\bE\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0004¢\u0006\f\n\u0004\bF\u0010G\u0012\u0004\bH\u00102R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u00102¨\u0006Q"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote;", "Lpp/b;", "LGB/h;", "", "seen0", "", "storeId", "title", "", "latitude", "longitude", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;", "storeAddress", "displayName", "displayNameAlternate", "storePageUrl", "placeId", "", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote;", "storeHours", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsInformationRemote;", "storeInformation", "Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote;", "smallStoreDetails", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsInformationRemote;Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/h;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreId$annotations", "()V", "getTitle$annotations", "Ljava/lang/Double;", "getLatitude$annotations", "d", "getLongitude$annotations", "e", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;", "getStoreAddress$annotations", "f", "getDisplayName$annotations", "g", "getDisplayNameAlternate$annotations", "h", "getStorePageUrl$annotations", "i", "getPlaceId$annotations", "j", "Ljava/util/List;", "getStoreHours$annotations", "k", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsInformationRemote;", "getStoreInformation$annotations", "l", "Lcom/ingka/ikea/store/impl/data/remotemodel/SmallStoreDetailsRemote;", "getSmallStoreDetails$annotations", "Companion", "AddressRemote", "AmenitiesHoursRemote", "ExtraRemote", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreDetailsRemote implements C11768b<h> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final KSerializer<Object>[] f120442m = {null, null, null, null, null, null, null, null, null, new C17451f(StoreDetailsRemote$AmenitiesHoursRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f120443a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120444b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f120445c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f120446d;

    /* renamed from: e  reason: collision with root package name */
    private final AddressRemote f120447e;

    /* renamed from: f  reason: collision with root package name */
    private final String f120448f;

    /* renamed from: g  reason: collision with root package name */
    private final String f120449g;

    /* renamed from: h  reason: collision with root package name */
    private final String f120450h;

    /* renamed from: i  reason: collision with root package name */
    private final String f120451i;

    /* renamed from: j  reason: collision with root package name */
    private final List<AmenitiesHoursRemote> f120452j;

    /* renamed from: k  reason: collision with root package name */
    private final StoreDetailsInformationRemote f120453k;

    /* renamed from: l  reason: collision with root package name */
    private final SmallStoreDetailsRemote f120454l;

    @p
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b8\b\b\u0018\u0000 ]2\u00020\u0001:\u0002^*BÅ\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010+\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010+\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010+\u0012\u0004\b9\u0010.\u001a\u0004\b8\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010+\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010+\u0012\u0004\b?\u0010.\u001a\u0004\b>\u0010#R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u0010+\u0012\u0004\bB\u0010.\u001a\u0004\bA\u0010#R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u0010+\u0012\u0004\bE\u0010.\u001a\u0004\bD\u0010#R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010+\u0012\u0004\bH\u0010.\u001a\u0004\bG\u0010#R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010+\u0012\u0004\bK\u0010.\u001a\u0004\bJ\u0010#R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bL\u0010+\u0012\u0004\bN\u0010.\u001a\u0004\bM\u0010#R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bO\u0010+\u0012\u0004\bQ\u0010.\u001a\u0004\bP\u0010#R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bR\u0010+\u0012\u0004\bT\u0010.\u001a\u0004\bS\u0010#R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bU\u0010+\u0012\u0004\bW\u0010.\u001a\u0004\bV\u0010#R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bX\u0010+\u0012\u0004\bZ\u0010.\u001a\u0004\bY\u0010#R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b[\u0010+\u0012\u0004\b\\\u0010.\u001a\u0004\b*\u0010#¨\u0006_"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;", "", "", "seen0", "", "title", "firstName", "lastName", "companyName", "phone", "email", "mobile", "addressLine1", "addressLine2", "addressLine3", "streetName", "streetNumber", "postcode", "city", "state", "country", "displayAddress", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getFirstName", "getFirstName$annotations", "c", "getLastName", "getLastName$annotations", "d", "getCompanyName", "getCompanyName$annotations", "e", "getPhone", "getPhone$annotations", "f", "getEmail", "getEmail$annotations", "g", "getMobile", "getMobile$annotations", "h", "getAddressLine1", "getAddressLine1$annotations", "i", "getAddressLine2", "getAddressLine2$annotations", "j", "getAddressLine3", "getAddressLine3$annotations", "k", "getStreetName", "getStreetName$annotations", "l", "getStreetNumber", "getStreetNumber$annotations", "m", "getPostcode", "getPostcode$annotations", "n", "getCity", "getCity$annotations", "o", "getState", "getState$annotations", "p", "getCountry", "getCountry$annotations", "q", "getDisplayAddress$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddressRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f120455a;

        /* renamed from: b  reason: collision with root package name */
        private final String f120456b;

        /* renamed from: c  reason: collision with root package name */
        private final String f120457c;

        /* renamed from: d  reason: collision with root package name */
        private final String f120458d;

        /* renamed from: e  reason: collision with root package name */
        private final String f120459e;

        /* renamed from: f  reason: collision with root package name */
        private final String f120460f;

        /* renamed from: g  reason: collision with root package name */
        private final String f120461g;

        /* renamed from: h  reason: collision with root package name */
        private final String f120462h;

        /* renamed from: i  reason: collision with root package name */
        private final String f120463i;

        /* renamed from: j  reason: collision with root package name */
        private final String f120464j;

        /* renamed from: k  reason: collision with root package name */
        private final String f120465k;

        /* renamed from: l  reason: collision with root package name */
        private final String f120466l;

        /* renamed from: m  reason: collision with root package name */
        private final String f120467m;

        /* renamed from: n  reason: collision with root package name */
        private final String f120468n;

        /* renamed from: o  reason: collision with root package name */
        private final String f120469o;

        /* renamed from: p  reason: collision with root package name */
        private final String f120470p;

        /* renamed from: q  reason: collision with root package name */
        private final String f120471q;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AddressRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AddressRemote> serializer() {
                return StoreDetailsRemote$AddressRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ AddressRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, T0 t02) {
            if (131071 != (i10 & 131071)) {
                E0.b(i10, 131071, StoreDetailsRemote$AddressRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f120455a = str;
            this.f120456b = str2;
            this.f120457c = str3;
            this.f120458d = str4;
            this.f120459e = str5;
            this.f120460f = str6;
            this.f120461g = str7;
            this.f120462h = str8;
            this.f120463i = str9;
            this.f120464j = str10;
            this.f120465k = str11;
            this.f120466l = str12;
            this.f120467m = str13;
            this.f120468n = str14;
            this.f120469o = str15;
            this.f120470p = str16;
            this.f120471q = str17;
        }

        public static final /* synthetic */ void b(AddressRemote addressRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, addressRemote.f120455a);
            dVar.B(serialDescriptor, 1, y02, addressRemote.f120456b);
            dVar.B(serialDescriptor, 2, y02, addressRemote.f120457c);
            dVar.B(serialDescriptor, 3, y02, addressRemote.f120458d);
            dVar.B(serialDescriptor, 4, y02, addressRemote.f120459e);
            dVar.B(serialDescriptor, 5, y02, addressRemote.f120460f);
            dVar.B(serialDescriptor, 6, y02, addressRemote.f120461g);
            dVar.B(serialDescriptor, 7, y02, addressRemote.f120462h);
            dVar.B(serialDescriptor, 8, y02, addressRemote.f120463i);
            dVar.B(serialDescriptor, 9, y02, addressRemote.f120464j);
            dVar.B(serialDescriptor, 10, y02, addressRemote.f120465k);
            dVar.B(serialDescriptor, 11, y02, addressRemote.f120466l);
            dVar.B(serialDescriptor, 12, y02, addressRemote.f120467m);
            dVar.B(serialDescriptor, 13, y02, addressRemote.f120468n);
            dVar.B(serialDescriptor, 14, y02, addressRemote.f120469o);
            dVar.B(serialDescriptor, 15, y02, addressRemote.f120470p);
            dVar.B(serialDescriptor, 16, y02, addressRemote.f120471q);
        }

        public final String a() {
            return this.f120471q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressRemote)) {
                return false;
            }
            AddressRemote addressRemote = (AddressRemote) obj;
            return C17542s.e(this.f120455a, addressRemote.f120455a) && C17542s.e(this.f120456b, addressRemote.f120456b) && C17542s.e(this.f120457c, addressRemote.f120457c) && C17542s.e(this.f120458d, addressRemote.f120458d) && C17542s.e(this.f120459e, addressRemote.f120459e) && C17542s.e(this.f120460f, addressRemote.f120460f) && C17542s.e(this.f120461g, addressRemote.f120461g) && C17542s.e(this.f120462h, addressRemote.f120462h) && C17542s.e(this.f120463i, addressRemote.f120463i) && C17542s.e(this.f120464j, addressRemote.f120464j) && C17542s.e(this.f120465k, addressRemote.f120465k) && C17542s.e(this.f120466l, addressRemote.f120466l) && C17542s.e(this.f120467m, addressRemote.f120467m) && C17542s.e(this.f120468n, addressRemote.f120468n) && C17542s.e(this.f120469o, addressRemote.f120469o) && C17542s.e(this.f120470p, addressRemote.f120470p) && C17542s.e(this.f120471q, addressRemote.f120471q);
        }

        public int hashCode() {
            String str = this.f120455a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f120456b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f120457c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f120458d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f120459e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f120460f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f120461g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f120462h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f120463i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f120464j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f120465k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f120466l;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f120467m;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f120468n;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f120469o;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f120470p;
            int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.f120471q;
            if (str17 != null) {
                i10 = str17.hashCode();
            }
            return hashCode16 + i10;
        }

        public String toString() {
            String str = this.f120455a;
            String str2 = this.f120456b;
            String str3 = this.f120457c;
            String str4 = this.f120458d;
            String str5 = this.f120459e;
            String str6 = this.f120460f;
            String str7 = this.f120461g;
            String str8 = this.f120462h;
            String str9 = this.f120463i;
            String str10 = this.f120464j;
            String str11 = this.f120465k;
            String str12 = this.f120466l;
            String str13 = this.f120467m;
            String str14 = this.f120468n;
            String str15 = this.f120469o;
            String str16 = this.f120470p;
            String str17 = this.f120471q;
            return "AddressRemote(title=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", companyName=" + str4 + ", phone=" + str5 + ", email=" + str6 + ", mobile=" + str7 + ", addressLine1=" + str8 + ", addressLine2=" + str9 + ", addressLine3=" + str10 + ", streetName=" + str11 + ", streetNumber=" + str12 + ", postcode=" + str13 + ", city=" + str14 + ", state=" + str15 + ", country=" + str16 + ", displayAddress=" + str17 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000378%Be\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001dR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010,R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010*\u0012\u0004\b2\u0010)\u001a\u0004\b1\u0010,R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010*\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010,¨\u00069"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote;", "Lpp/b;", "LGB/c;", "", "seen0", "", "type", "", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote;", "hours", "closed", "exceptions", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$ExtraRemote;", "extras", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/util/List;", "getHours", "()Ljava/util/List;", "getHours$annotations", "getClosed", "getClosed$annotations", "d", "getExceptions", "getExceptions$annotations", "e", "getExtras", "getExtras$annotations", "Companion", "DayOpeningHoursRemote", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AmenitiesHoursRemote implements C11768b<C12918c> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final KSerializer<Object>[] f120472f;

        /* renamed from: a  reason: collision with root package name */
        private final String f120473a;

        /* renamed from: b  reason: collision with root package name */
        private final List<DayOpeningHoursRemote> f120474b;

        /* renamed from: c  reason: collision with root package name */
        private final List<DayOpeningHoursRemote> f120475c;

        /* renamed from: d  reason: collision with root package name */
        private final List<DayOpeningHoursRemote> f120476d;

        /* renamed from: e  reason: collision with root package name */
        private final List<ExtraRemote> f120477e;

        @p
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\b\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:\u0019Ba\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010$\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010$\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010$\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010$\u0012\u0004\b8\u0010'\u001a\u0004\b7\u0010\u001c¨\u0006;"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote;", "Lpp/b;", "LGB/c$b;", "", "seen0", "", "day", "open", "close", "open2", "close2", "reason", "date", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LGB/c$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDay", "getDay$annotations", "()V", "getOpen", "getOpen$annotations", "c", "getClose", "getClose$annotations", "d", "getOpen2", "getOpen2$annotations", "e", "getClose2", "getClose2$annotations", "f", "getReason", "getReason$annotations", "g", "getDate", "getDate$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DayOpeningHoursRemote implements C11768b<C12918c.b> {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f120478a;

            /* renamed from: b  reason: collision with root package name */
            private final String f120479b;

            /* renamed from: c  reason: collision with root package name */
            private final String f120480c;

            /* renamed from: d  reason: collision with root package name */
            private final String f120481d;

            /* renamed from: e  reason: collision with root package name */
            private final String f120482e;

            /* renamed from: f  reason: collision with root package name */
            private final String f120483f;

            /* renamed from: g  reason: collision with root package name */
            private final String f120484g;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<DayOpeningHoursRemote> serializer() {
                    return StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ C17220a<DayOfWeek> f120485a = C17221b.a(DayOfWeek.values());
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class c<T> implements Comparator {
                public final int compare(T t10, T t11) {
                    return C17035a.e((LocalTime) ((v) t10).c(), (LocalTime) ((v) t11).c());
                }
            }

            public /* synthetic */ DayOpeningHoursRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, T0 t02) {
                if (127 != (i10 & 127)) {
                    E0.b(i10, 127, StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer.INSTANCE.getDescriptor());
                }
                this.f120478a = str;
                this.f120479b = str2;
                this.f120480c = str3;
                this.f120481d = str4;
                this.f120482e = str5;
                this.f120483f = str6;
                this.f120484g = str7;
            }

            public static final /* synthetic */ void b(DayOpeningHoursRemote dayOpeningHoursRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
                Y0 y02 = Y0.f144077a;
                dVar.B(serialDescriptor, 0, y02, dayOpeningHoursRemote.f120478a);
                dVar.B(serialDescriptor, 1, y02, dayOpeningHoursRemote.f120479b);
                dVar.B(serialDescriptor, 2, y02, dayOpeningHoursRemote.f120480c);
                dVar.B(serialDescriptor, 3, y02, dayOpeningHoursRemote.f120481d);
                dVar.B(serialDescriptor, 4, y02, dayOpeningHoursRemote.f120482e);
                dVar.B(serialDescriptor, 5, y02, dayOpeningHoursRemote.f120483f);
                dVar.B(serialDescriptor, 6, y02, dayOpeningHoursRemote.f120484g);
            }

            public C12918c.b a() {
                DayOfWeek dayOfWeek;
                T t10;
                String str = this.f120484g;
                v vVar = null;
                LocalDate parse = str != null ? LocalDate.parse(str) : null;
                if (this.f120478a != null) {
                    Iterator<T> it = b.f120485a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        if (C15854t.W(((DayOfWeek) t10).name(), this.f120478a, false, 2, (Object) null)) {
                            break;
                        }
                    }
                    dayOfWeek = (DayOfWeek) t10;
                } else {
                    dayOfWeek = null;
                }
                String str2 = this.f120479b;
                LocalTime parse2 = str2 != null ? LocalTime.parse(str2) : null;
                String str3 = this.f120480c;
                LocalTime parse3 = str3 != null ? LocalTime.parse(str3) : null;
                String str4 = this.f120481d;
                LocalTime parse4 = str4 != null ? LocalTime.parse(str4) : null;
                String str5 = this.f120482e;
                LocalTime parse5 = str5 != null ? LocalTime.parse(str5) : null;
                v a10 = (parse2 == null || parse3 == null) ? null : C16796C.a(parse2, parse3);
                if (!(parse4 == null || parse5 == null)) {
                    vVar = C16796C.a(parse4, parse5);
                }
                return new C12918c.b(dayOfWeek, parse, C16877v.g1(C16877v.s(a10, vVar), new c()), this.f120483f);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DayOpeningHoursRemote)) {
                    return false;
                }
                DayOpeningHoursRemote dayOpeningHoursRemote = (DayOpeningHoursRemote) obj;
                return C17542s.e(this.f120478a, dayOpeningHoursRemote.f120478a) && C17542s.e(this.f120479b, dayOpeningHoursRemote.f120479b) && C17542s.e(this.f120480c, dayOpeningHoursRemote.f120480c) && C17542s.e(this.f120481d, dayOpeningHoursRemote.f120481d) && C17542s.e(this.f120482e, dayOpeningHoursRemote.f120482e) && C17542s.e(this.f120483f, dayOpeningHoursRemote.f120483f) && C17542s.e(this.f120484g, dayOpeningHoursRemote.f120484g);
            }

            public int hashCode() {
                String str = this.f120478a;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f120479b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f120480c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f120481d;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.f120482e;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f120483f;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.f120484g;
                if (str7 != null) {
                    i10 = str7.hashCode();
                }
                return hashCode6 + i10;
            }

            public String toString() {
                String str = this.f120478a;
                String str2 = this.f120479b;
                String str3 = this.f120480c;
                String str4 = this.f120481d;
                String str5 = this.f120482e;
                String str6 = this.f120483f;
                String str7 = this.f120484g;
                return "DayOpeningHoursRemote(day=" + str + ", open=" + str2 + ", close=" + str3 + ", open2=" + str4 + ", close2=" + str5 + ", reason=" + str6 + ", date=" + str7 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$AmenitiesHoursRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AmenitiesHoursRemote> serializer() {
                return StoreDetailsRemote$AmenitiesHoursRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer storeDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer = StoreDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer.INSTANCE;
            f120472f = new KSerializer[]{null, new C17451f(storeDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer), new C17451f(storeDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer), new C17451f(storeDetailsRemote$AmenitiesHoursRemote$DayOpeningHoursRemote$$serializer), new C17451f(StoreDetailsRemote$ExtraRemote$$serializer.INSTANCE)};
        }

        public /* synthetic */ AmenitiesHoursRemote(int i10, String str, List list, List list2, List list3, List list4, T0 t02) {
            if (31 != (i10 & 31)) {
                E0.b(i10, 31, StoreDetailsRemote$AmenitiesHoursRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f120473a = str;
            this.f120474b = list;
            this.f120475c = list2;
            this.f120476d = list3;
            this.f120477e = list4;
        }

        public static final /* synthetic */ void c(AmenitiesHoursRemote amenitiesHoursRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f120472f;
            dVar.y(serialDescriptor, 0, amenitiesHoursRemote.f120473a);
            dVar.i(serialDescriptor, 1, kSerializerArr[1], amenitiesHoursRemote.f120474b);
            dVar.B(serialDescriptor, 2, kSerializerArr[2], amenitiesHoursRemote.f120475c);
            dVar.B(serialDescriptor, 3, kSerializerArr[3], amenitiesHoursRemote.f120476d);
            dVar.B(serialDescriptor, 4, kSerializerArr[4], amenitiesHoursRemote.f120477e);
        }

        public C12918c b() {
            ArrayList arrayList;
            ArrayList arrayList2;
            C12918c.C2642c a10 = C12918c.C2642c.Companion.a(this.f120473a);
            Iterable<DayOpeningHoursRemote> iterable = this.f120474b;
            ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
            for (DayOpeningHoursRemote a11 : iterable) {
                arrayList3.add(a11.a());
            }
            List<DayOpeningHoursRemote> list = this.f120475c;
            ArrayList arrayList4 = null;
            if (list != null) {
                Iterable<DayOpeningHoursRemote> iterable2 = list;
                arrayList = new ArrayList(C16877v.y(iterable2, 10));
                for (DayOpeningHoursRemote a12 : iterable2) {
                    arrayList.add(a12.a());
                }
            } else {
                arrayList = null;
            }
            List<DayOpeningHoursRemote> list2 = this.f120476d;
            if (list2 != null) {
                Iterable<DayOpeningHoursRemote> iterable3 = list2;
                arrayList2 = new ArrayList(C16877v.y(iterable3, 10));
                for (DayOpeningHoursRemote a13 : iterable3) {
                    arrayList2.add(a13.a());
                }
            } else {
                arrayList2 = null;
            }
            List<ExtraRemote> list3 = this.f120477e;
            if (list3 != null) {
                Iterable<ExtraRemote> iterable4 = list3;
                arrayList4 = new ArrayList(C16877v.y(iterable4, 10));
                for (ExtraRemote a14 : iterable4) {
                    arrayList4.add(a14.a());
                }
            }
            return new C12918c(a10, arrayList3, arrayList, arrayList2, arrayList4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AmenitiesHoursRemote)) {
                return false;
            }
            AmenitiesHoursRemote amenitiesHoursRemote = (AmenitiesHoursRemote) obj;
            return C17542s.e(this.f120473a, amenitiesHoursRemote.f120473a) && C17542s.e(this.f120474b, amenitiesHoursRemote.f120474b) && C17542s.e(this.f120475c, amenitiesHoursRemote.f120475c) && C17542s.e(this.f120476d, amenitiesHoursRemote.f120476d) && C17542s.e(this.f120477e, amenitiesHoursRemote.f120477e);
        }

        public int hashCode() {
            int hashCode = ((this.f120473a.hashCode() * 31) + this.f120474b.hashCode()) * 31;
            List<DayOpeningHoursRemote> list = this.f120475c;
            int i10 = 0;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<DayOpeningHoursRemote> list2 = this.f120476d;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<ExtraRemote> list3 = this.f120477e;
            if (list3 != null) {
                i10 = list3.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f120473a;
            List<DayOpeningHoursRemote> list = this.f120474b;
            List<DayOpeningHoursRemote> list2 = this.f120475c;
            List<DayOpeningHoursRemote> list3 = this.f120476d;
            List<ExtraRemote> list4 = this.f120477e;
            return "AmenitiesHoursRemote(type=" + str + ", hours=" + list + ", closed=" + list2 + ", exceptions=" + list3 + ", extras=" + list4 + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$ExtraRemote;", "Lpp/b;", "LGB/c$a;", "", "seen0", "", "heading", "body", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$ExtraRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LGB/c$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeading", "getHeading$annotations", "()V", "getBody", "getBody$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraRemote implements C11768b<C12918c.a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f120486a;

        /* renamed from: b  reason: collision with root package name */
        private final String f120487b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$ExtraRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$ExtraRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ExtraRemote> serializer() {
                return StoreDetailsRemote$ExtraRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ExtraRemote(int i10, String str, String str2, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, StoreDetailsRemote$ExtraRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f120486a = str;
            this.f120487b = str2;
        }

        public static final /* synthetic */ void b(ExtraRemote extraRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, extraRemote.f120486a);
            dVar.B(serialDescriptor, 1, y02, extraRemote.f120487b);
        }

        public C12918c.a a() {
            return new C12918c.a(this.f120486a, this.f120487b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraRemote)) {
                return false;
            }
            ExtraRemote extraRemote = (ExtraRemote) obj;
            return C17542s.e(this.f120486a, extraRemote.f120486a) && C17542s.e(this.f120487b, extraRemote.f120487b);
        }

        public int hashCode() {
            String str = this.f120486a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f120487b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f120486a;
            String str2 = this.f120487b;
            return "ExtraRemote(heading=" + str + ", body=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/StoreDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StoreDetailsRemote> serializer() {
            return StoreDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StoreDetailsRemote(int i10, String str, String str2, Double d10, Double d11, AddressRemote addressRemote, String str3, String str4, String str5, String str6, List list, StoreDetailsInformationRemote storeDetailsInformationRemote, SmallStoreDetailsRemote smallStoreDetailsRemote, T0 t02) {
        if (4095 != (i10 & 4095)) {
            E0.b(i10, 4095, StoreDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120443a = str;
        this.f120444b = str2;
        this.f120445c = d10;
        this.f120446d = d11;
        this.f120447e = addressRemote;
        this.f120448f = str3;
        this.f120449g = str4;
        this.f120450h = str5;
        this.f120451i = str6;
        this.f120452j = list;
        this.f120453k = storeDetailsInformationRemote;
        this.f120454l = smallStoreDetailsRemote;
    }

    public static final /* synthetic */ void c(StoreDetailsRemote storeDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f120442m;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, storeDetailsRemote.f120443a);
        dVar.B(serialDescriptor, 1, y02, storeDetailsRemote.f120444b);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 2, c10, storeDetailsRemote.f120445c);
        dVar.B(serialDescriptor, 3, c10, storeDetailsRemote.f120446d);
        dVar.B(serialDescriptor, 4, StoreDetailsRemote$AddressRemote$$serializer.INSTANCE, storeDetailsRemote.f120447e);
        dVar.B(serialDescriptor, 5, y02, storeDetailsRemote.f120448f);
        dVar.B(serialDescriptor, 6, y02, storeDetailsRemote.f120449g);
        dVar.B(serialDescriptor, 7, y02, storeDetailsRemote.f120450h);
        dVar.B(serialDescriptor, 8, y02, storeDetailsRemote.f120451i);
        dVar.i(serialDescriptor, 9, kSerializerArr[9], storeDetailsRemote.f120452j);
        dVar.B(serialDescriptor, 10, StoreDetailsInformationRemote$$serializer.INSTANCE, storeDetailsRemote.f120453k);
        dVar.B(serialDescriptor, 11, SmallStoreDetailsRemote$$serializer.INSTANCE, storeDetailsRemote.f120454l);
    }

    public h b() {
        String str = this.f120443a;
        if (str != null) {
            String str2 = this.f120448f;
            if (str2 != null) {
                AddressRemote addressRemote = this.f120447e;
                String a10 = addressRemote != null ? addressRemote.a() : null;
                Double d10 = this.f120445c;
                if (d10 != null) {
                    double doubleValue = d10.doubleValue();
                    Double d11 = this.f120446d;
                    if (d11 != null) {
                        LocationLatLng locationLatLng = new LocationLatLng(doubleValue, d11.doubleValue());
                        Iterable<AmenitiesHoursRemote> iterable = this.f120452j;
                        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                        for (AmenitiesHoursRemote b10 : iterable) {
                            arrayList.add(b10.b());
                        }
                        StoreDetailsInformationRemote storeDetailsInformationRemote = this.f120453k;
                        i a11 = storeDetailsInformationRemote != null ? storeDetailsInformationRemote.a() : null;
                        SmallStoreDetailsRemote smallStoreDetailsRemote = this.f120454l;
                        return new h(str, str2, a10, locationLatLng, arrayList, a11, smallStoreDetailsRemote != null ? smallStoreDetailsRemote.b() : null);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreDetailsRemote)) {
            return false;
        }
        StoreDetailsRemote storeDetailsRemote = (StoreDetailsRemote) obj;
        return C17542s.e(this.f120443a, storeDetailsRemote.f120443a) && C17542s.e(this.f120444b, storeDetailsRemote.f120444b) && C17542s.e(this.f120445c, storeDetailsRemote.f120445c) && C17542s.e(this.f120446d, storeDetailsRemote.f120446d) && C17542s.e(this.f120447e, storeDetailsRemote.f120447e) && C17542s.e(this.f120448f, storeDetailsRemote.f120448f) && C17542s.e(this.f120449g, storeDetailsRemote.f120449g) && C17542s.e(this.f120450h, storeDetailsRemote.f120450h) && C17542s.e(this.f120451i, storeDetailsRemote.f120451i) && C17542s.e(this.f120452j, storeDetailsRemote.f120452j) && C17542s.e(this.f120453k, storeDetailsRemote.f120453k) && C17542s.e(this.f120454l, storeDetailsRemote.f120454l);
    }

    public int hashCode() {
        String str = this.f120443a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120444b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f120445c;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f120446d;
        int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        AddressRemote addressRemote = this.f120447e;
        int hashCode5 = (hashCode4 + (addressRemote == null ? 0 : addressRemote.hashCode())) * 31;
        String str3 = this.f120448f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120449g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f120450h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120451i;
        int hashCode9 = (((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f120452j.hashCode()) * 31;
        StoreDetailsInformationRemote storeDetailsInformationRemote = this.f120453k;
        int hashCode10 = (hashCode9 + (storeDetailsInformationRemote == null ? 0 : storeDetailsInformationRemote.hashCode())) * 31;
        SmallStoreDetailsRemote smallStoreDetailsRemote = this.f120454l;
        if (smallStoreDetailsRemote != null) {
            i10 = smallStoreDetailsRemote.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        String str = this.f120443a;
        String str2 = this.f120444b;
        Double d10 = this.f120445c;
        Double d11 = this.f120446d;
        AddressRemote addressRemote = this.f120447e;
        String str3 = this.f120448f;
        String str4 = this.f120449g;
        String str5 = this.f120450h;
        String str6 = this.f120451i;
        List<AmenitiesHoursRemote> list = this.f120452j;
        StoreDetailsInformationRemote storeDetailsInformationRemote = this.f120453k;
        SmallStoreDetailsRemote smallStoreDetailsRemote = this.f120454l;
        return "StoreDetailsRemote(storeId=" + str + ", title=" + str2 + ", latitude=" + d10 + ", longitude=" + d11 + ", storeAddress=" + addressRemote + ", displayName=" + str3 + ", displayNameAlternate=" + str4 + ", storePageUrl=" + str5 + ", placeId=" + str6 + ", storeHours=" + list + ", storeInformation=" + storeDetailsInformationRemote + ", smallStoreDetails=" + smallStoreDetailsRemote + ")";
    }
}
