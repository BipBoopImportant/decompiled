package com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.scanandgo.datalayer.model.ScanAndGoSettings;
import com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings;
import com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.C17458i0;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import rz.N;

@p
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bI\b\b\u0018\u0000 m2\u00020\u0001:\u0002noB­\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018BÁ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u000f\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010+J\u0012\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b6\u00103J\u0012\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b7\u00103J\u0012\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b8\u00103J\u0012\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b9\u00103J\u0012\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b:\u00103J\u0012\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b;\u00103J\u0012\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b<\u00103J\u0012\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b=\u00103J\u0012\u0010>\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b>\u00103JÖ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010+J\u0010\u0010B\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010G\u0012\u0004\bI\u0010J\u001a\u0004\bH\u0010+R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010K\u0012\u0004\bM\u0010J\u001a\u0004\bL\u0010-R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bO\u0010J\u001a\u0004\bN\u0010+R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010G\u0012\u0004\bQ\u0010J\u001a\u0004\bP\u0010+R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010R\u0012\u0004\bT\u0010J\u001a\u0004\bS\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010U\u0012\u0004\bW\u0010J\u001a\u0004\bV\u00103R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\r\u0010X\u0012\u0004\bZ\u0010J\u001a\u0004\bY\u00105R\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010U\u0012\u0004\b\\\u0010J\u001a\u0004\b[\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010U\u0012\u0004\b^\u0010J\u001a\u0004\b]\u00103R\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010U\u0012\u0004\b`\u0010J\u001a\u0004\b_\u00103R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010U\u0012\u0004\bb\u0010J\u001a\u0004\ba\u00103R\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010U\u0012\u0004\bd\u0010J\u001a\u0004\bc\u00103R\"\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010U\u0012\u0004\bf\u0010J\u001a\u0004\be\u00103R\"\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010U\u0012\u0004\bh\u0010J\u001a\u0004\bg\u00103R\"\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010U\u0012\u0004\bj\u0010J\u001a\u0004\bi\u00103R\"\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010U\u0012\u0004\bl\u0010J\u001a\u0004\bk\u00103¨\u0006p"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "", "", "countryCode", "", "languageCodes", "version", "storeName", "", "timeout", "", "digitalReceipt", "Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;", "upptacka", "couponsEnable", "ptagLinkSupport", "caasEnabled", "coworkerDiscountEnabled", "caasCheckoutEnabled", "caasFullserveEnabled", "showTotalPricesInclVat", "fullserveTimeSlotsEnabled", "fullserveEarlyPaymentEnabled", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$datalayer_implementation_release", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "toLocal", "()Lcom/ingka/ikea/scanandgo/datalayer/model/ScanAndGoSettings;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryCode", "getCountryCode$annotations", "()V", "Ljava/util/List;", "getLanguageCodes", "getLanguageCodes$annotations", "getVersion", "getVersion$annotations", "getStoreName", "getStoreName$annotations", "Ljava/lang/Long;", "getTimeout", "getTimeout$annotations", "Ljava/lang/Boolean;", "getDigitalReceipt", "getDigitalReceipt$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/model/UpptackaSettings;", "getUpptacka", "getUpptacka$annotations", "getCouponsEnable", "getCouponsEnable$annotations", "getPtagLinkSupport", "getPtagLinkSupport$annotations", "getCaasEnabled", "getCaasEnabled$annotations", "getCoworkerDiscountEnabled", "getCoworkerDiscountEnabled$annotations", "getCaasCheckoutEnabled", "getCaasCheckoutEnabled$annotations", "getCaasFullserveEnabled", "getCaasFullserveEnabled$annotations", "getShowTotalPricesInclVat", "getShowTotalPricesInclVat$annotations", "getFullserveTimeSlotsEnabled", "getFullserveTimeSlotsEnabled$annotations", "getFullserveEarlyPaymentEnabled", "getFullserveEarlyPaymentEnabled$annotations", "Companion", "$serializer", "a", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoSettingsRemote {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, new C17451f(Y0.f144077a), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final Boolean caasCheckoutEnabled;
    private final Boolean caasEnabled;
    private final Boolean caasFullserveEnabled;
    private final String countryCode;
    private final Boolean couponsEnable;
    private final Boolean coworkerDiscountEnabled;
    private final Boolean digitalReceipt;
    private final Boolean fullserveEarlyPaymentEnabled;
    private final Boolean fullserveTimeSlotsEnabled;
    private final List<String> languageCodes;
    private final Boolean ptagLinkSupport;
    private final Boolean showTotalPricesInclVat;
    private final String storeName;
    private final Long timeout;
    private final UpptackaSettings upptacka;
    private final String version;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoSettingsRemote> serializer() {
            return ScanAndGoSettingsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoSettingsRemote(int i10, String str, List list, String str2, String str3, Long l10, Boolean bool, UpptackaSettings upptackaSettings, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, T0 t02) {
        if (65535 != (i10 & 65535)) {
            E0.b(i10, 65535, ScanAndGoSettingsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.countryCode = str;
        this.languageCodes = list;
        this.version = str2;
        this.storeName = str3;
        this.timeout = l10;
        this.digitalReceipt = bool;
        this.upptacka = upptackaSettings;
        this.couponsEnable = bool2;
        this.ptagLinkSupport = bool3;
        this.caasEnabled = bool4;
        this.coworkerDiscountEnabled = bool5;
        this.caasCheckoutEnabled = bool6;
        this.caasFullserveEnabled = bool7;
        this.showTotalPricesInclVat = bool8;
        this.fullserveTimeSlotsEnabled = bool9;
        this.fullserveEarlyPaymentEnabled = bool10;
    }

    public static /* synthetic */ ScanAndGoSettingsRemote copy$default(ScanAndGoSettingsRemote scanAndGoSettingsRemote, String str, List list, String str2, String str3, Long l10, Boolean bool, UpptackaSettings upptackaSettings, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, int i10, Object obj) {
        ScanAndGoSettingsRemote scanAndGoSettingsRemote2 = scanAndGoSettingsRemote;
        int i11 = i10;
        return scanAndGoSettingsRemote.copy((i11 & 1) != 0 ? scanAndGoSettingsRemote2.countryCode : str, (i11 & 2) != 0 ? scanAndGoSettingsRemote2.languageCodes : list, (i11 & 4) != 0 ? scanAndGoSettingsRemote2.version : str2, (i11 & 8) != 0 ? scanAndGoSettingsRemote2.storeName : str3, (i11 & 16) != 0 ? scanAndGoSettingsRemote2.timeout : l10, (i11 & 32) != 0 ? scanAndGoSettingsRemote2.digitalReceipt : bool, (i11 & 64) != 0 ? scanAndGoSettingsRemote2.upptacka : upptackaSettings, (i11 & 128) != 0 ? scanAndGoSettingsRemote2.couponsEnable : bool2, (i11 & 256) != 0 ? scanAndGoSettingsRemote2.ptagLinkSupport : bool3, (i11 & 512) != 0 ? scanAndGoSettingsRemote2.caasEnabled : bool4, (i11 & 1024) != 0 ? scanAndGoSettingsRemote2.coworkerDiscountEnabled : bool5, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? scanAndGoSettingsRemote2.caasCheckoutEnabled : bool6, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? scanAndGoSettingsRemote2.caasFullserveEnabled : bool7, (i11 & 8192) != 0 ? scanAndGoSettingsRemote2.showTotalPricesInclVat : bool8, (i11 & 16384) != 0 ? scanAndGoSettingsRemote2.fullserveTimeSlotsEnabled : bool9, (i11 & 32768) != 0 ? scanAndGoSettingsRemote2.fullserveEarlyPaymentEnabled : bool10);
    }

    public static /* synthetic */ void getCaasCheckoutEnabled$annotations() {
    }

    public static /* synthetic */ void getCaasEnabled$annotations() {
    }

    public static /* synthetic */ void getCaasFullserveEnabled$annotations() {
    }

    public static /* synthetic */ void getCountryCode$annotations() {
    }

    public static /* synthetic */ void getCouponsEnable$annotations() {
    }

    public static /* synthetic */ void getCoworkerDiscountEnabled$annotations() {
    }

    public static /* synthetic */ void getDigitalReceipt$annotations() {
    }

    public static /* synthetic */ void getFullserveEarlyPaymentEnabled$annotations() {
    }

    public static /* synthetic */ void getFullserveTimeSlotsEnabled$annotations() {
    }

    public static /* synthetic */ void getLanguageCodes$annotations() {
    }

    public static /* synthetic */ void getPtagLinkSupport$annotations() {
    }

    public static /* synthetic */ void getShowTotalPricesInclVat$annotations() {
    }

    public static /* synthetic */ void getStoreName$annotations() {
    }

    public static /* synthetic */ void getTimeout$annotations() {
    }

    public static /* synthetic */ void getUpptacka$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$datalayer_implementation_release(ScanAndGoSettingsRemote scanAndGoSettingsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, scanAndGoSettingsRemote.countryCode);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], scanAndGoSettingsRemote.languageCodes);
        dVar.B(serialDescriptor, 2, y02, scanAndGoSettingsRemote.version);
        dVar.B(serialDescriptor, 3, y02, scanAndGoSettingsRemote.storeName);
        dVar.B(serialDescriptor, 4, C17458i0.f144113a, scanAndGoSettingsRemote.timeout);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 5, iVar, scanAndGoSettingsRemote.digitalReceipt);
        dVar.B(serialDescriptor, 6, UpptackaSettings$$serializer.INSTANCE, scanAndGoSettingsRemote.upptacka);
        dVar.B(serialDescriptor, 7, iVar, scanAndGoSettingsRemote.couponsEnable);
        dVar.B(serialDescriptor, 8, iVar, scanAndGoSettingsRemote.ptagLinkSupport);
        dVar.B(serialDescriptor, 9, iVar, scanAndGoSettingsRemote.caasEnabled);
        dVar.B(serialDescriptor, 10, iVar, scanAndGoSettingsRemote.coworkerDiscountEnabled);
        dVar.B(serialDescriptor, 11, iVar, scanAndGoSettingsRemote.caasCheckoutEnabled);
        dVar.B(serialDescriptor, 12, iVar, scanAndGoSettingsRemote.caasFullserveEnabled);
        dVar.B(serialDescriptor, 13, iVar, scanAndGoSettingsRemote.showTotalPricesInclVat);
        dVar.B(serialDescriptor, 14, iVar, scanAndGoSettingsRemote.fullserveTimeSlotsEnabled);
        dVar.B(serialDescriptor, 15, iVar, scanAndGoSettingsRemote.fullserveEarlyPaymentEnabled);
    }

    public final String component1() {
        return this.countryCode;
    }

    public final Boolean component10() {
        return this.caasEnabled;
    }

    public final Boolean component11() {
        return this.coworkerDiscountEnabled;
    }

    public final Boolean component12() {
        return this.caasCheckoutEnabled;
    }

    public final Boolean component13() {
        return this.caasFullserveEnabled;
    }

    public final Boolean component14() {
        return this.showTotalPricesInclVat;
    }

    public final Boolean component15() {
        return this.fullserveTimeSlotsEnabled;
    }

    public final Boolean component16() {
        return this.fullserveEarlyPaymentEnabled;
    }

    public final List<String> component2() {
        return this.languageCodes;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.storeName;
    }

    public final Long component5() {
        return this.timeout;
    }

    public final Boolean component6() {
        return this.digitalReceipt;
    }

    public final UpptackaSettings component7() {
        return this.upptacka;
    }

    public final Boolean component8() {
        return this.couponsEnable;
    }

    public final Boolean component9() {
        return this.ptagLinkSupport;
    }

    public final ScanAndGoSettingsRemote copy(String str, List<String> list, String str2, String str3, Long l10, Boolean bool, UpptackaSettings upptackaSettings, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        return new ScanAndGoSettingsRemote(str, list, str2, str3, l10, bool, upptackaSettings, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoSettingsRemote)) {
            return false;
        }
        ScanAndGoSettingsRemote scanAndGoSettingsRemote = (ScanAndGoSettingsRemote) obj;
        return C17542s.e(this.countryCode, scanAndGoSettingsRemote.countryCode) && C17542s.e(this.languageCodes, scanAndGoSettingsRemote.languageCodes) && C17542s.e(this.version, scanAndGoSettingsRemote.version) && C17542s.e(this.storeName, scanAndGoSettingsRemote.storeName) && C17542s.e(this.timeout, scanAndGoSettingsRemote.timeout) && C17542s.e(this.digitalReceipt, scanAndGoSettingsRemote.digitalReceipt) && C17542s.e(this.upptacka, scanAndGoSettingsRemote.upptacka) && C17542s.e(this.couponsEnable, scanAndGoSettingsRemote.couponsEnable) && C17542s.e(this.ptagLinkSupport, scanAndGoSettingsRemote.ptagLinkSupport) && C17542s.e(this.caasEnabled, scanAndGoSettingsRemote.caasEnabled) && C17542s.e(this.coworkerDiscountEnabled, scanAndGoSettingsRemote.coworkerDiscountEnabled) && C17542s.e(this.caasCheckoutEnabled, scanAndGoSettingsRemote.caasCheckoutEnabled) && C17542s.e(this.caasFullserveEnabled, scanAndGoSettingsRemote.caasFullserveEnabled) && C17542s.e(this.showTotalPricesInclVat, scanAndGoSettingsRemote.showTotalPricesInclVat) && C17542s.e(this.fullserveTimeSlotsEnabled, scanAndGoSettingsRemote.fullserveTimeSlotsEnabled) && C17542s.e(this.fullserveEarlyPaymentEnabled, scanAndGoSettingsRemote.fullserveEarlyPaymentEnabled);
    }

    public final Boolean getCaasCheckoutEnabled() {
        return this.caasCheckoutEnabled;
    }

    public final Boolean getCaasEnabled() {
        return this.caasEnabled;
    }

    public final Boolean getCaasFullserveEnabled() {
        return this.caasFullserveEnabled;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final Boolean getCouponsEnable() {
        return this.couponsEnable;
    }

    public final Boolean getCoworkerDiscountEnabled() {
        return this.coworkerDiscountEnabled;
    }

    public final Boolean getDigitalReceipt() {
        return this.digitalReceipt;
    }

    public final Boolean getFullserveEarlyPaymentEnabled() {
        return this.fullserveEarlyPaymentEnabled;
    }

    public final Boolean getFullserveTimeSlotsEnabled() {
        return this.fullserveTimeSlotsEnabled;
    }

    public final List<String> getLanguageCodes() {
        return this.languageCodes;
    }

    public final Boolean getPtagLinkSupport() {
        return this.ptagLinkSupport;
    }

    public final Boolean getShowTotalPricesInclVat() {
        return this.showTotalPricesInclVat;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final Long getTimeout() {
        return this.timeout;
    }

    public final UpptackaSettings getUpptacka() {
        return this.upptacka;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.countryCode;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.languageCodes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.timeout;
        int hashCode5 = (hashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.digitalReceipt;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        UpptackaSettings upptackaSettings = this.upptacka;
        int hashCode7 = (hashCode6 + (upptackaSettings == null ? 0 : upptackaSettings.hashCode())) * 31;
        Boolean bool2 = this.couponsEnable;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.ptagLinkSupport;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.caasEnabled;
        int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.coworkerDiscountEnabled;
        int hashCode11 = (hashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.caasCheckoutEnabled;
        int hashCode12 = (hashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.caasFullserveEnabled;
        int hashCode13 = (hashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.showTotalPricesInclVat;
        int hashCode14 = (hashCode13 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.fullserveTimeSlotsEnabled;
        int hashCode15 = (hashCode14 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.fullserveEarlyPaymentEnabled;
        if (bool10 != null) {
            i10 = bool10.hashCode();
        }
        return hashCode15 + i10;
    }

    public final ScanAndGoSettings toLocal() {
        String str = this.storeName;
        if (str == null) {
            return null;
        }
        N a10 = N.Companion.a(this.version);
        String str2 = this.countryCode;
        List<String> list = this.languageCodes;
        Long l10 = this.timeout;
        Boolean bool = this.digitalReceipt;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        UpptackaSettings upptackaSettings = this.upptacka;
        Boolean bool2 = this.ptagLinkSupport;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = this.couponsEnable;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = this.caasEnabled;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = this.coworkerDiscountEnabled;
        boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Boolean bool6 = this.caasCheckoutEnabled;
        boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = this.caasFullserveEnabled;
        boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        Boolean bool8 = this.showTotalPricesInclVat;
        boolean booleanValue8 = bool8 != null ? bool8.booleanValue() : false;
        Boolean bool9 = this.fullserveTimeSlotsEnabled;
        boolean booleanValue9 = bool9 != null ? bool9.booleanValue() : false;
        Boolean bool10 = this.fullserveEarlyPaymentEnabled;
        return new ScanAndGoSettings(str2, list, a10, str, l10, booleanValue, upptackaSettings, booleanValue3, booleanValue2, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, booleanValue9, bool10 != null ? bool10.booleanValue() : false);
    }

    public String toString() {
        String str = this.countryCode;
        List<String> list = this.languageCodes;
        String str2 = this.version;
        String str3 = this.storeName;
        Long l10 = this.timeout;
        Boolean bool = this.digitalReceipt;
        UpptackaSettings upptackaSettings = this.upptacka;
        Boolean bool2 = this.couponsEnable;
        Boolean bool3 = this.ptagLinkSupport;
        Boolean bool4 = this.caasEnabled;
        Boolean bool5 = this.coworkerDiscountEnabled;
        Boolean bool6 = this.caasCheckoutEnabled;
        Boolean bool7 = this.caasFullserveEnabled;
        Boolean bool8 = this.showTotalPricesInclVat;
        Boolean bool9 = this.fullserveTimeSlotsEnabled;
        Boolean bool10 = this.fullserveEarlyPaymentEnabled;
        return "ScanAndGoSettingsRemote(countryCode=" + str + ", languageCodes=" + list + ", version=" + str2 + ", storeName=" + str3 + ", timeout=" + l10 + ", digitalReceipt=" + bool + ", upptacka=" + upptackaSettings + ", couponsEnable=" + bool2 + ", ptagLinkSupport=" + bool3 + ", caasEnabled=" + bool4 + ", coworkerDiscountEnabled=" + bool5 + ", caasCheckoutEnabled=" + bool6 + ", caasFullserveEnabled=" + bool7 + ", showTotalPricesInclVat=" + bool8 + ", fullserveTimeSlotsEnabled=" + bool9 + ", fullserveEarlyPaymentEnabled=" + bool10 + ")";
    }

    public ScanAndGoSettingsRemote(String str, List<String> list, String str2, String str3, Long l10, Boolean bool, UpptackaSettings upptackaSettings, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10) {
        this.countryCode = str;
        this.languageCodes = list;
        this.version = str2;
        this.storeName = str3;
        this.timeout = l10;
        this.digitalReceipt = bool;
        this.upptacka = upptackaSettings;
        this.couponsEnable = bool2;
        this.ptagLinkSupport = bool3;
        this.caasEnabled = bool4;
        this.coworkerDiscountEnabled = bool5;
        this.caasCheckoutEnabled = bool6;
        this.caasFullserveEnabled = bool7;
        this.showTotalPricesInclVat = bool8;
        this.fullserveTimeSlotsEnabled = bool9;
        this.fullserveEarlyPaymentEnabled = bool10;
    }
}
