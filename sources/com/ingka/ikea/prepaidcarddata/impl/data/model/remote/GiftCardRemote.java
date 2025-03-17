package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

import XH.x;
import XH.y;
import androidx.annotation.Keep;
import ep.C11256b;
import fK.p;
import iK.C17395d;
import ix.C14584a;
import ix.b;
import ix.d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 =2\u00020\u0001:\u0002>?B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!JF\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010#R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b<\u00103\u001a\u0004\b;\u0010!¨\u0006@"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;", "", "", "cardNumber", "", "amount", "currencyCode", "expiryDate", "expiryStatus", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$prepaidcarddata_implementation_release", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lep/b;", "localizedDateTimeFormatter", "dateFormatPattern", "Lix/b;", "convertToLocal$prepaidcarddata_implementation_release", "(Lep/b;Ljava/lang/String;)Lix/b;", "convertToLocal", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardNumber", "getCardNumber$annotations", "()V", "D", "getAmount", "getAmount$annotations", "getCurrencyCode", "getCurrencyCode$annotations", "getExpiryDate", "getExpiryDate$annotations", "getExpiryStatus", "getExpiryStatus$annotations", "Companion", "$serializer", "a", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GiftCardRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final double amount;
    private final String cardNumber;
    private final String currencyCode;
    private final String expiryDate;
    private final String expiryStatus;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/GiftCardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<GiftCardRemote> serializer() {
            return GiftCardRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GiftCardRemote(int i10, String str, double d10, String str2, String str3, String str4, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, GiftCardRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.cardNumber = str;
        this.amount = d10;
        this.currencyCode = str2;
        this.expiryDate = str3;
        this.expiryStatus = str4;
    }

    public static /* synthetic */ GiftCardRemote copy$default(GiftCardRemote giftCardRemote, String str, double d10, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftCardRemote.cardNumber;
        }
        if ((i10 & 2) != 0) {
            d10 = giftCardRemote.amount;
        }
        double d11 = d10;
        if ((i10 & 4) != 0) {
            str2 = giftCardRemote.currencyCode;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = giftCardRemote.expiryDate;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = giftCardRemote.expiryStatus;
        }
        return giftCardRemote.copy(str, d11, str5, str6, str4);
    }

    public static /* synthetic */ void getAmount$annotations() {
    }

    public static /* synthetic */ void getCardNumber$annotations() {
    }

    public static /* synthetic */ void getCurrencyCode$annotations() {
    }

    public static /* synthetic */ void getExpiryDate$annotations() {
    }

    public static /* synthetic */ void getExpiryStatus$annotations() {
    }

    public static final /* synthetic */ void write$Self$prepaidcarddata_implementation_release(GiftCardRemote giftCardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, giftCardRemote.cardNumber);
        dVar.E(serialDescriptor, 1, giftCardRemote.amount);
        dVar.y(serialDescriptor, 2, giftCardRemote.currencyCode);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 3, y02, giftCardRemote.expiryDate);
        dVar.B(serialDescriptor, 4, y02, giftCardRemote.expiryStatus);
    }

    public final String component1() {
        return this.cardNumber;
    }

    public final double component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final String component4() {
        return this.expiryDate;
    }

    public final String component5() {
        return this.expiryStatus;
    }

    public final b convertToLocal$prepaidcarddata_implementation_release(C11256b bVar, String str) {
        Object obj;
        C14584a aVar;
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(str, "dateFormatPattern");
        d dVar = d.GIFT_CARD;
        String str2 = this.cardNumber;
        try {
            x.a aVar2 = x.f139812b;
            LocalDate localDate = LocalDateTime.parse(this.expiryDate).toLocalDate();
            C17542s.i(localDate, "toLocalDate(...)");
            obj = x.b(bVar.e(localDate, str));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            x.a aVar3 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e11 = x.e(obj);
        String str3 = obj;
        if (e11 != null) {
            str3 = this.expiryDate;
        }
        String str4 = (String) str3;
        double d10 = this.amount;
        String str5 = this.currencyCode;
        String str6 = this.expiryStatus;
        if (str6 == null || (aVar = C14584a.valueOf(str6)) == null) {
            aVar = C14584a.VALID;
        }
        return new b(dVar, str2, d10, (Double) null, (Double) null, str5, str4, aVar, 24, (DefaultConstructorMarker) null);
    }

    public final GiftCardRemote copy(String str, double d10, String str2, String str3, String str4) {
        C17542s.j(str, "cardNumber");
        C17542s.j(str2, "currencyCode");
        return new GiftCardRemote(str, d10, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardRemote)) {
            return false;
        }
        GiftCardRemote giftCardRemote = (GiftCardRemote) obj;
        return C17542s.e(this.cardNumber, giftCardRemote.cardNumber) && Double.compare(this.amount, giftCardRemote.amount) == 0 && C17542s.e(this.currencyCode, giftCardRemote.currencyCode) && C17542s.e(this.expiryDate, giftCardRemote.expiryDate) && C17542s.e(this.expiryStatus, giftCardRemote.expiryStatus);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getExpiryStatus() {
        return this.expiryStatus;
    }

    public int hashCode() {
        int hashCode = ((((this.cardNumber.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + this.currencyCode.hashCode()) * 31;
        String str = this.expiryDate;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expiryStatus;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.cardNumber;
        double d10 = this.amount;
        String str2 = this.currencyCode;
        String str3 = this.expiryDate;
        String str4 = this.expiryStatus;
        return "GiftCardRemote(cardNumber=" + str + ", amount=" + d10 + ", currencyCode=" + str2 + ", expiryDate=" + str3 + ", expiryStatus=" + str4 + ")";
    }

    public GiftCardRemote(String str, double d10, String str2, String str3, String str4) {
        C17542s.j(str, "cardNumber");
        C17542s.j(str2, "currencyCode");
        this.cardNumber = str;
        this.amount = d10;
        this.currencyCode = str2;
        this.expiryDate = str3;
        this.expiryStatus = str4;
    }
}
