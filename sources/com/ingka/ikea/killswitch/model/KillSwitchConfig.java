package com.ingka.ikea.killswitch.model;

import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b{\b\b\u0018\u0000 »\u00012\u00020\u0001:\u0005¼\u0001½\u0001MB\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u00107B»\u0003\b\u0010\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010:\u001a\u000208\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00101\u001a\u00020\u0006\u0012\u0006\u00102\u001a\u00020\u0006\u0012\u0006\u00103\u001a\u00020\u0006\u0012\u0006\u00104\u001a\u00020\u0006\u0012\u0006\u00105\u001a\u00020\u0006\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b6\u0010=J'\u0010D\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u000208HÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bK\u0010LR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bP\u0010Q\u001a\u0004\bO\u0010GR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bR\u0010N\u0012\u0004\bT\u0010Q\u001a\u0004\bS\u0010GR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bU\u0010N\u0012\u0004\bW\u0010Q\u001a\u0004\bV\u0010GR \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\b[\u0010Q\u001a\u0004\b\u0007\u0010ZR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b_\u0010Q\u001a\u0004\bM\u0010^R \u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b`\u0010Y\u0012\u0004\bb\u0010Q\u001a\u0004\ba\u0010ZR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\bc\u0010d\u0012\u0004\bf\u0010Q\u001a\u0004\bR\u0010eR \u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bg\u0010Y\u0012\u0004\bi\u0010Q\u001a\u0004\bh\u0010ZR \u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bj\u0010Y\u0012\u0004\bl\u0010Q\u001a\u0004\bk\u0010ZR \u0010\u000f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\ba\u0010Y\u0012\u0004\bn\u0010Q\u001a\u0004\bm\u0010ZR \u0010\u0010\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bo\u0010Y\u0012\u0004\bq\u0010Q\u001a\u0004\bp\u0010ZR \u0010\u0011\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\br\u0010Y\u0012\u0004\bt\u0010Q\u001a\u0004\bs\u0010ZR \u0010\u0012\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bu\u0010Y\u0012\u0004\bw\u0010Q\u001a\u0004\bv\u0010ZR \u0010\u0013\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bx\u0010Y\u0012\u0004\bz\u0010Q\u001a\u0004\by\u0010ZR \u0010\u0014\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b{\u0010Y\u0012\u0004\b}\u0010Q\u001a\u0004\b|\u0010ZR!\u0010\u0015\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0013\n\u0004\b~\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\b\u0010ZR#\u0010\u0016\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR\"\u0010\u0017\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\bc\u0010ZR\"\u0010\u0018\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\b\\\u0010ZR\"\u0010\u0019\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\b`\u0010ZR\"\u0010\u001a\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\bx\u0010ZR#\u0010\u001b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR\"\u0010\u001c\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\br\u0010ZR\"\u0010\u001d\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\bu\u0010ZR!\u0010\u001e\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0013\n\u0004\b|\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\bg\u0010ZR!\u0010\u001f\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0013\n\u0004\bh\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\bj\u0010ZR\"\u0010 \u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\b\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR#\u0010!\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR\"\u0010\"\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0004\b{\u0010ZR\"\u0010#\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\bp\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR#\u0010$\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010Y\u0012\u0005\b\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR#\u0010%\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010Y\u0012\u0005\b¡\u0001\u0010Q\u001a\u0005\b \u0001\u0010ZR#\u0010&\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b \u0001\u0010Y\u0012\u0005\b¢\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR\"\u0010'\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0004\bS\u0010Y\u0012\u0005\b¤\u0001\u0010Q\u001a\u0005\b£\u0001\u0010ZR!\u0010(\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0013\n\u0004\bO\u0010Y\u0012\u0005\b¥\u0001\u0010Q\u001a\u0004\bU\u0010ZR!\u0010)\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0013\n\u0004\bk\u0010Y\u0012\u0005\b¦\u0001\u0010Q\u001a\u0004\bo\u0010ZR&\u0010*\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0016\n\u0005\bm\u0010§\u0001\u0012\u0005\b©\u0001\u0010Q\u001a\u0006\b\u0001\u0010¨\u0001R'\u0010+\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010§\u0001\u0012\u0005\bª\u0001\u0010Q\u001a\u0006\b\u0001\u0010¨\u0001R%\u0010,\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\bs\u0010§\u0001\u0012\u0005\b«\u0001\u0010Q\u001a\u0005\b~\u0010¨\u0001R&\u0010-\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0016\n\u0005\bv\u0010§\u0001\u0012\u0005\b¬\u0001\u0010Q\u001a\u0006\b\u0001\u0010¨\u0001R&\u0010.\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0016\n\u0005\bV\u0010§\u0001\u0012\u0005\b­\u0001\u0010Q\u001a\u0006\b\u0001\u0010¨\u0001R'\u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010§\u0001\u0012\u0005\b®\u0001\u0010Q\u001a\u0006\b\u0001\u0010¨\u0001R&\u00100\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0016\n\u0005\bD\u0010§\u0001\u0012\u0005\b¯\u0001\u0010Q\u001a\u0006\b\u0001\u0010¨\u0001R#\u00101\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b°\u0001\u0010Y\u0012\u0005\b±\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR\"\u00102\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0014\n\u0005\b²\u0001\u0010Y\u0012\u0005\b³\u0001\u0010Q\u001a\u0004\bX\u0010ZR#\u00103\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b´\u0001\u0010Y\u0012\u0005\b¶\u0001\u0010Q\u001a\u0005\bµ\u0001\u0010ZR#\u00104\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b·\u0001\u0010Y\u0012\u0005\b¸\u0001\u0010Q\u001a\u0005\b\u0001\u0010ZR#\u00105\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0015\n\u0005\b¹\u0001\u0010Y\u0012\u0005\bº\u0001\u0010Q\u001a\u0005\b\u0001\u0010Z¨\u0006¾\u0001"}, d2 = {"Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "", "", "marketCode", "languageCode", "version", "", "isPerformStockCheck", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "alertConfig", "enableDynamicLinkShare", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "blockApp", "enableOnlineCheckout", "purchaseHistoryListingEnabled", "purchaseHistoryLookupEnabled", "enableShopAndGo", "showAddToCartUnrestricted", "showInAppRatingRequest", "enableDataControls", "enableOnlineAvailability", "enableOnlineClickCollectAvailability", "shopAndGoTermsAndConditions", "enableAvailabilityCart", "enableAssemblyServicesAvailability", "enableAssemblyServicesOrder", "enableFinancialServices", "enableCommunicationPostsCarousel", "enableFamilyRewards", "enableFamilyRewardsCart", "enableBackInStockNotificationsCashAndCarry", "enableBackInStockNotificationsHomeDelivery", "enableKreativEntryPoints", "redirectSearchAndBrowsePilot", "enableGiftCardBalanceCheck", "enableRegisterPushTokens", "wayfindingEnabled", "enableUpsertAddressInCheckout", "enableInboxBackgroundFetch", "enableBrowseRecommendedCarousel", "enableAdjustSdk", "enableExpressAndOnlineReturns", "enableInAppUpdates", "enableGooglePayExpressInCheckout", "enableGooglePayExpressInCart", "enableMembershipSpaceKreativ", "enableNavigeraAlertMessages", "enableNavigeraCommercialMessagesForBrowse", "enableOffersHub", "enableShoppingListRedesign", "enableAppointmentBooking", "enableCartProximity", "enableStoreModeActivation", "enablePrepaidCards", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ingka/ikea/killswitch/model/ConfigAlert;ZLcom/ingka/ikea/killswitch/model/BlockApp;ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZZZ)V", "", "seen0", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ingka/ikea/killswitch/model/ConfigAlert;ZLcom/ingka/ikea/killswitch/model/BlockApp;ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZZZZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "Q", "(Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "I", "getMarketCode$annotations", "()V", "b", "H", "getLanguageCode$annotations", "c", "O", "getVersion$annotations", "d", "Z", "()Z", "isPerformStockCheck$annotations", "e", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "()Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "getAlertConfig$annotations", "f", "j", "getEnableDynamicLinkShare$annotations", "g", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "()Lcom/ingka/ikea/killswitch/model/BlockApp;", "getBlockApp$annotations", "h", "z", "getEnableOnlineCheckout$annotations", "i", "J", "getPurchaseHistoryListingEnabled$annotations", "K", "getPurchaseHistoryLookupEnabled$annotations", "k", "D", "getEnableShopAndGo$annotations", "l", "M", "getShowAddToCartUnrestricted$annotations", "m", "N", "getShowInAppRatingRequest$annotations", "n", "getEnableDataControls", "getEnableDataControls$annotations", "o", "y", "getEnableOnlineAvailability$annotations", "p", "A", "getEnableOnlineClickCollectAvailability$annotations", "q", "L", "getShopAndGoTermsAndConditions$annotations", "r", "getEnableAvailabilityCart$annotations", "s", "getEnableAssemblyServicesAvailability$annotations", "t", "getEnableAssemblyServicesOrder$annotations", "u", "getEnableFinancialServices$annotations", "v", "getEnableCommunicationPostsCarousel", "getEnableCommunicationPostsCarousel$annotations", "w", "getEnableFamilyRewards$annotations", "x", "getEnableFamilyRewardsCart$annotations", "getEnableBackInStockNotificationsCashAndCarry$annotations", "getEnableBackInStockNotificationsHomeDelivery$annotations", "getEnableKreativEntryPoints$annotations", "B", "getRedirectSearchAndBrowsePilot", "getRedirectSearchAndBrowsePilot$annotations", "C", "getEnableGiftCardBalanceCheck$annotations", "getEnableRegisterPushTokens$annotations", "E", "P", "getWayfindingEnabled$annotations", "F", "G", "getEnableUpsertAddressInCheckout$annotations", "getEnableInboxBackgroundFetch$annotations", "getEnableBrowseRecommendedCarousel", "getEnableBrowseRecommendedCarousel$annotations", "getEnableAdjustSdk$annotations", "getEnableExpressAndOnlineReturns$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getEnableInAppUpdates$annotations", "getEnableGooglePayExpressInCheckout$annotations", "getEnableGooglePayExpressInCart$annotations", "getEnableMembershipSpaceKreativ$annotations", "getEnableNavigeraAlertMessages$annotations", "getEnableNavigeraCommercialMessagesForBrowse$annotations", "getEnableOffersHub$annotations", "R", "getEnableShoppingListRedesign$annotations", "S", "getEnableAppointmentBooking$annotations", "T", "getEnableCartProximity", "getEnableCartProximity$annotations", "U", "getEnableStoreModeActivation$annotations", "V", "getEnablePrepaidCards$annotations", "Companion", "Remote", "$serializer", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KillSwitchConfig {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private final boolean f96403A;

    /* renamed from: B  reason: collision with root package name */
    private final boolean f96404B;

    /* renamed from: C  reason: collision with root package name */
    private final boolean f96405C;

    /* renamed from: D  reason: collision with root package name */
    private final boolean f96406D;

    /* renamed from: E  reason: collision with root package name */
    private final boolean f96407E;

    /* renamed from: F  reason: collision with root package name */
    private final boolean f96408F;

    /* renamed from: G  reason: collision with root package name */
    private final boolean f96409G;

    /* renamed from: H  reason: collision with root package name */
    private final boolean f96410H;

    /* renamed from: I  reason: collision with root package name */
    private final boolean f96411I;

    /* renamed from: J  reason: collision with root package name */
    private final boolean f96412J;

    /* renamed from: K  reason: collision with root package name */
    private final Boolean f96413K;

    /* renamed from: L  reason: collision with root package name */
    private final Boolean f96414L;

    /* renamed from: M  reason: collision with root package name */
    private final Boolean f96415M;

    /* renamed from: N  reason: collision with root package name */
    private final Boolean f96416N;

    /* renamed from: O  reason: collision with root package name */
    private final Boolean f96417O;

    /* renamed from: P  reason: collision with root package name */
    private final Boolean f96418P;

    /* renamed from: Q  reason: collision with root package name */
    private final Boolean f96419Q;

    /* renamed from: R  reason: collision with root package name */
    private final boolean f96420R;

    /* renamed from: S  reason: collision with root package name */
    private final boolean f96421S;

    /* renamed from: T  reason: collision with root package name */
    private final boolean f96422T;

    /* renamed from: U  reason: collision with root package name */
    private final boolean f96423U;

    /* renamed from: V  reason: collision with root package name */
    private final boolean f96424V;

    /* renamed from: a  reason: collision with root package name */
    private final String f96425a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96426b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96427c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f96428d;

    /* renamed from: e  reason: collision with root package name */
    private final ConfigAlert f96429e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f96430f;

    /* renamed from: g  reason: collision with root package name */
    private final BlockApp f96431g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f96432h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f96433i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f96434j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f96435k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f96436l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f96437m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f96438n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f96439o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f96440p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f96441q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f96442r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f96443s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f96444t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f96445u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f96446v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f96447w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f96448x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f96449y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f96450z;

    @p
    @Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u0001\b\b\u0018\u0000 Ú\u00012\u00020\u0001:\u0003Û\u0001FBå\u0003\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J'\u0010?\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@J%\u0010F\u001a\u00020E2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020AHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020\u00052\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bM\u0010NR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bF\u0010O\u0012\u0004\bQ\u0010R\u001a\u0004\b\u0006\u0010PR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010S\u0012\u0004\bV\u0010R\u001a\u0004\bT\u0010UR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010O\u0012\u0004\bY\u0010R\u001a\u0004\bX\u0010PR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b^\u0010R\u001a\u0004\b\\\u0010]R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b_\u0010O\u0012\u0004\ba\u0010R\u001a\u0004\b`\u0010PR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bb\u0010O\u0012\u0004\bd\u0010R\u001a\u0004\bc\u0010PR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\be\u0010O\u0012\u0004\bg\u0010R\u001a\u0004\bf\u0010PR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bh\u0010O\u0012\u0004\bj\u0010R\u001a\u0004\bi\u0010PR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bk\u0010O\u0012\u0004\bm\u0010R\u001a\u0004\bl\u0010PR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bn\u0010O\u0012\u0004\bp\u0010R\u001a\u0004\bo\u0010PR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bq\u0010O\u0012\u0004\bs\u0010R\u001a\u0004\br\u0010PR\"\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bt\u0010O\u0012\u0004\bv\u0010R\u001a\u0004\bu\u0010PR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bw\u0010O\u0012\u0004\by\u0010R\u001a\u0004\bx\u0010PR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bz\u0010O\u0012\u0004\b|\u0010R\u001a\u0004\b{\u0010PR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b}\u0010O\u0012\u0004\b\u0010R\u001a\u0004\b~\u0010PR%\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b\u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010!\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010O\u0012\u0005\b \u0001\u0010R\u001a\u0005\b\u0001\u0010PR%\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b¡\u0001\u0010O\u0012\u0005\b£\u0001\u0010R\u001a\u0005\b¢\u0001\u0010PR%\u0010#\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b¤\u0001\u0010O\u0012\u0005\b¦\u0001\u0010R\u001a\u0005\b¥\u0001\u0010PR%\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b§\u0001\u0010O\u0012\u0005\b©\u0001\u0010R\u001a\u0005\b¨\u0001\u0010PR%\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bª\u0001\u0010O\u0012\u0005\b¬\u0001\u0010R\u001a\u0005\b«\u0001\u0010PR%\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b­\u0001\u0010O\u0012\u0005\b¯\u0001\u0010R\u001a\u0005\b®\u0001\u0010PR%\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b°\u0001\u0010O\u0012\u0005\b²\u0001\u0010R\u001a\u0005\b±\u0001\u0010PR%\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b³\u0001\u0010O\u0012\u0005\bµ\u0001\u0010R\u001a\u0005\b´\u0001\u0010PR%\u0010)\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b¶\u0001\u0010O\u0012\u0005\b¸\u0001\u0010R\u001a\u0005\b·\u0001\u0010PR%\u0010*\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b¹\u0001\u0010O\u0012\u0005\b»\u0001\u0010R\u001a\u0005\bº\u0001\u0010PR%\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b¼\u0001\u0010O\u0012\u0005\b¾\u0001\u0010R\u001a\u0005\b½\u0001\u0010PR%\u0010,\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b¿\u0001\u0010O\u0012\u0005\bÁ\u0001\u0010R\u001a\u0005\bÀ\u0001\u0010PR%\u0010-\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bÂ\u0001\u0010O\u0012\u0005\bÄ\u0001\u0010R\u001a\u0005\bÃ\u0001\u0010PR%\u0010.\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bÅ\u0001\u0010O\u0012\u0005\bÇ\u0001\u0010R\u001a\u0005\bÆ\u0001\u0010PR%\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bÈ\u0001\u0010O\u0012\u0005\bÊ\u0001\u0010R\u001a\u0005\bÉ\u0001\u0010PR%\u00100\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bË\u0001\u0010O\u0012\u0005\bÍ\u0001\u0010R\u001a\u0005\bÌ\u0001\u0010PR%\u00101\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bÎ\u0001\u0010O\u0012\u0005\bÐ\u0001\u0010R\u001a\u0005\bÏ\u0001\u0010PR%\u00102\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bÑ\u0001\u0010O\u0012\u0005\bÓ\u0001\u0010R\u001a\u0005\bÒ\u0001\u0010PR%\u00103\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\bÔ\u0001\u0010O\u0012\u0005\bÖ\u0001\u0010R\u001a\u0005\bÕ\u0001\u0010PR%\u00104\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0015\n\u0005\b×\u0001\u0010O\u0012\u0005\bÙ\u0001\u0010R\u001a\u0005\bØ\u0001\u0010P¨\u0006Ü\u0001"}, d2 = {"Lcom/ingka/ikea/killswitch/model/KillSwitchConfig$Remote;", "", "", "seen0", "seen1", "", "isPerformStockCheck", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "alertConfig", "enableDynamicLinkShare", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "blockApp", "enableOnlineCheckout", "purchaseHistoryListingEnabled", "purchaseHistoryLookupEnabled", "enableShopAndGo", "showAddToCartUnrestricted", "showInAppRatingRequest", "enableDataControls", "enableOnlineAvailability", "enableOnlineClickCollectAvailability", "shopAndGoTermsAndConditions", "enableAvailabilityCart", "enableAssemblyServicesAvailability", "enableAssemblyServicesOrder", "enableFinancialServices", "enableCommunicationPostsCarousel", "enableFamilyRewards", "enableFamilyRewardsCart", "enableBackInStockNotificationsCashAndCarry", "enableBackInStockNotificationsHomeDelivery", "enableKreativEntryPoints", "redirectSearchAndBrowsePilot", "enableGiftCardBalanceCheck", "enableRegisterPushTokens", "wayfindingEnabled", "enableUpsertAddressInCheckout", "enableInboxBackgroundFetch", "enableBrowseRecommendedCarousel", "enableAdjustSdk", "enableExpressAndOnlineReturns", "enableInAppUpdates", "enableGooglePayExpressInCheckout", "enableGooglePayExpressInCart", "enableMembershipSpaceKreativ", "enableNavigeraAlertMessages", "enableNavigeraCommercialMessagesForBrowse", "enableOffersHub", "enableShoppingListRedesign", "enableAppointmentBooking", "enableCartProximity", "enableStoreModeActivation", "enablePrepaidCards", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/Boolean;Lcom/ingka/ikea/killswitch/model/ConfigAlert;Ljava/lang/Boolean;Lcom/ingka/ikea/killswitch/model/BlockApp;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/killswitch/model/KillSwitchConfig$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "marketCode", "languageCode", "version", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isPerformStockCheck$annotations", "()V", "Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "getAlertConfig", "()Lcom/ingka/ikea/killswitch/model/ConfigAlert;", "getAlertConfig$annotations", "c", "getEnableDynamicLinkShare", "getEnableDynamicLinkShare$annotations", "d", "Lcom/ingka/ikea/killswitch/model/BlockApp;", "getBlockApp", "()Lcom/ingka/ikea/killswitch/model/BlockApp;", "getBlockApp$annotations", "e", "getEnableOnlineCheckout", "getEnableOnlineCheckout$annotations", "f", "getPurchaseHistoryListingEnabled", "getPurchaseHistoryListingEnabled$annotations", "g", "getPurchaseHistoryLookupEnabled", "getPurchaseHistoryLookupEnabled$annotations", "h", "getEnableShopAndGo", "getEnableShopAndGo$annotations", "i", "getShowAddToCartUnrestricted", "getShowAddToCartUnrestricted$annotations", "j", "getShowInAppRatingRequest", "getShowInAppRatingRequest$annotations", "k", "getEnableDataControls", "getEnableDataControls$annotations", "l", "getEnableOnlineAvailability", "getEnableOnlineAvailability$annotations", "m", "getEnableOnlineClickCollectAvailability", "getEnableOnlineClickCollectAvailability$annotations", "n", "getShopAndGoTermsAndConditions", "getShopAndGoTermsAndConditions$annotations", "o", "getEnableAvailabilityCart", "getEnableAvailabilityCart$annotations", "p", "getEnableAssemblyServicesAvailability", "getEnableAssemblyServicesAvailability$annotations", "q", "getEnableAssemblyServicesOrder", "getEnableAssemblyServicesOrder$annotations", "r", "getEnableFinancialServices", "getEnableFinancialServices$annotations", "s", "getEnableCommunicationPostsCarousel", "getEnableCommunicationPostsCarousel$annotations", "t", "getEnableFamilyRewards", "getEnableFamilyRewards$annotations", "u", "getEnableFamilyRewardsCart", "getEnableFamilyRewardsCart$annotations", "v", "getEnableBackInStockNotificationsCashAndCarry", "getEnableBackInStockNotificationsCashAndCarry$annotations", "w", "getEnableBackInStockNotificationsHomeDelivery", "getEnableBackInStockNotificationsHomeDelivery$annotations", "x", "getEnableKreativEntryPoints", "getEnableKreativEntryPoints$annotations", "y", "getRedirectSearchAndBrowsePilot", "getRedirectSearchAndBrowsePilot$annotations", "z", "getEnableGiftCardBalanceCheck", "getEnableGiftCardBalanceCheck$annotations", "A", "getEnableRegisterPushTokens", "getEnableRegisterPushTokens$annotations", "B", "getWayfindingEnabled", "getWayfindingEnabled$annotations", "C", "getEnableUpsertAddressInCheckout", "getEnableUpsertAddressInCheckout$annotations", "D", "getEnableInboxBackgroundFetch", "getEnableInboxBackgroundFetch$annotations", "E", "getEnableBrowseRecommendedCarousel", "getEnableBrowseRecommendedCarousel$annotations", "F", "getEnableAdjustSdk", "getEnableAdjustSdk$annotations", "G", "getEnableExpressAndOnlineReturns", "getEnableExpressAndOnlineReturns$annotations", "H", "getEnableInAppUpdates", "getEnableInAppUpdates$annotations", "I", "getEnableGooglePayExpressInCheckout", "getEnableGooglePayExpressInCheckout$annotations", "J", "getEnableGooglePayExpressInCart", "getEnableGooglePayExpressInCart$annotations", "K", "getEnableMembershipSpaceKreativ", "getEnableMembershipSpaceKreativ$annotations", "L", "getEnableNavigeraAlertMessages", "getEnableNavigeraAlertMessages$annotations", "M", "getEnableNavigeraCommercialMessagesForBrowse", "getEnableNavigeraCommercialMessagesForBrowse$annotations", "N", "getEnableOffersHub", "getEnableOffersHub$annotations", "O", "getEnableShoppingListRedesign", "getEnableShoppingListRedesign$annotations", "P", "getEnableAppointmentBooking", "getEnableAppointmentBooking$annotations", "Q", "getEnableCartProximity", "getEnableCartProximity$annotations", "R", "getEnableStoreModeActivation", "getEnableStoreModeActivation$annotations", "S", "getEnablePrepaidCards", "getEnablePrepaidCards$annotations", "Companion", "$serializer", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Remote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: A  reason: collision with root package name */
        private final Boolean f96451A;

        /* renamed from: B  reason: collision with root package name */
        private final Boolean f96452B;

        /* renamed from: C  reason: collision with root package name */
        private final Boolean f96453C;

        /* renamed from: D  reason: collision with root package name */
        private final Boolean f96454D;

        /* renamed from: E  reason: collision with root package name */
        private final Boolean f96455E;

        /* renamed from: F  reason: collision with root package name */
        private final Boolean f96456F;

        /* renamed from: G  reason: collision with root package name */
        private final Boolean f96457G;

        /* renamed from: H  reason: collision with root package name */
        private final Boolean f96458H;

        /* renamed from: I  reason: collision with root package name */
        private final Boolean f96459I;

        /* renamed from: J  reason: collision with root package name */
        private final Boolean f96460J;

        /* renamed from: K  reason: collision with root package name */
        private final Boolean f96461K;

        /* renamed from: L  reason: collision with root package name */
        private final Boolean f96462L;

        /* renamed from: M  reason: collision with root package name */
        private final Boolean f96463M;

        /* renamed from: N  reason: collision with root package name */
        private final Boolean f96464N;

        /* renamed from: O  reason: collision with root package name */
        private final Boolean f96465O;

        /* renamed from: P  reason: collision with root package name */
        private final Boolean f96466P;

        /* renamed from: Q  reason: collision with root package name */
        private final Boolean f96467Q;

        /* renamed from: R  reason: collision with root package name */
        private final Boolean f96468R;

        /* renamed from: S  reason: collision with root package name */
        private final Boolean f96469S;

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f96470a;

        /* renamed from: b  reason: collision with root package name */
        private final ConfigAlert f96471b;

        /* renamed from: c  reason: collision with root package name */
        private final Boolean f96472c;

        /* renamed from: d  reason: collision with root package name */
        private final BlockApp f96473d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f96474e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f96475f;

        /* renamed from: g  reason: collision with root package name */
        private final Boolean f96476g;

        /* renamed from: h  reason: collision with root package name */
        private final Boolean f96477h;

        /* renamed from: i  reason: collision with root package name */
        private final Boolean f96478i;

        /* renamed from: j  reason: collision with root package name */
        private final Boolean f96479j;

        /* renamed from: k  reason: collision with root package name */
        private final Boolean f96480k;

        /* renamed from: l  reason: collision with root package name */
        private final Boolean f96481l;

        /* renamed from: m  reason: collision with root package name */
        private final Boolean f96482m;

        /* renamed from: n  reason: collision with root package name */
        private final Boolean f96483n;

        /* renamed from: o  reason: collision with root package name */
        private final Boolean f96484o;

        /* renamed from: p  reason: collision with root package name */
        private final Boolean f96485p;

        /* renamed from: q  reason: collision with root package name */
        private final Boolean f96486q;

        /* renamed from: r  reason: collision with root package name */
        private final Boolean f96487r;

        /* renamed from: s  reason: collision with root package name */
        private final Boolean f96488s;

        /* renamed from: t  reason: collision with root package name */
        private final Boolean f96489t;

        /* renamed from: u  reason: collision with root package name */
        private final Boolean f96490u;

        /* renamed from: v  reason: collision with root package name */
        private final Boolean f96491v;

        /* renamed from: w  reason: collision with root package name */
        private final Boolean f96492w;

        /* renamed from: x  reason: collision with root package name */
        private final Boolean f96493x;

        /* renamed from: y  reason: collision with root package name */
        private final Boolean f96494y;

        /* renamed from: z  reason: collision with root package name */
        private final Boolean f96495z;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/killswitch/model/KillSwitchConfig$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Remote> serializer() {
                return KillSwitchConfig$Remote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Remote(int i10, int i11, Boolean bool, ConfigAlert configAlert, Boolean bool2, BlockApp blockApp, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, T0 t02) {
            boolean z10 = false;
            if ((8191 != (i11 & 8191) ? true : z10) || (-1 != i10)) {
                E0.a(new int[]{i10, i11}, new int[]{-1, 8191}, KillSwitchConfig$Remote$$serializer.INSTANCE.getDescriptor());
            }
            this.f96470a = bool;
            this.f96471b = configAlert;
            this.f96472c = bool2;
            this.f96473d = blockApp;
            this.f96474e = bool3;
            this.f96475f = bool4;
            this.f96476g = bool5;
            this.f96477h = bool6;
            this.f96478i = bool7;
            this.f96479j = bool8;
            this.f96480k = bool9;
            this.f96481l = bool10;
            this.f96482m = bool11;
            this.f96483n = bool12;
            this.f96484o = bool13;
            this.f96485p = bool14;
            this.f96486q = bool15;
            this.f96487r = bool16;
            this.f96488s = bool17;
            this.f96489t = bool18;
            this.f96490u = bool19;
            this.f96491v = bool20;
            this.f96492w = bool21;
            this.f96493x = bool22;
            this.f96494y = bool23;
            this.f96495z = bool24;
            this.f96451A = bool25;
            this.f96452B = bool26;
            this.f96453C = bool27;
            this.f96454D = bool28;
            this.f96455E = bool29;
            this.f96456F = bool30;
            this.f96457G = bool31;
            this.f96458H = bool32;
            this.f96459I = bool33;
            this.f96460J = bool34;
            this.f96461K = bool35;
            this.f96462L = bool36;
            this.f96463M = bool37;
            this.f96464N = bool38;
            this.f96465O = bool39;
            this.f96466P = bool40;
            this.f96467Q = bool41;
            this.f96468R = bool42;
            this.f96469S = bool43;
        }

        public static final /* synthetic */ void b(Remote remote, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 0, iVar, remote.f96470a);
            dVar.B(serialDescriptor, 1, ConfigAlert$$serializer.INSTANCE, remote.f96471b);
            dVar.B(serialDescriptor, 2, iVar, remote.f96472c);
            dVar.B(serialDescriptor, 3, BlockApp$$serializer.INSTANCE, remote.f96473d);
            dVar.B(serialDescriptor, 4, iVar, remote.f96474e);
            dVar.B(serialDescriptor, 5, iVar, remote.f96475f);
            dVar.B(serialDescriptor, 6, iVar, remote.f96476g);
            dVar.B(serialDescriptor, 7, iVar, remote.f96477h);
            dVar.B(serialDescriptor, 8, iVar, remote.f96478i);
            dVar.B(serialDescriptor, 9, iVar, remote.f96479j);
            dVar.B(serialDescriptor, 10, iVar, remote.f96480k);
            dVar.B(serialDescriptor, 11, iVar, remote.f96481l);
            dVar.B(serialDescriptor, 12, iVar, remote.f96482m);
            dVar.B(serialDescriptor, 13, iVar, remote.f96483n);
            dVar.B(serialDescriptor, 14, iVar, remote.f96484o);
            dVar.B(serialDescriptor, 15, iVar, remote.f96485p);
            dVar.B(serialDescriptor, 16, iVar, remote.f96486q);
            dVar.B(serialDescriptor, 17, iVar, remote.f96487r);
            dVar.B(serialDescriptor, 18, iVar, remote.f96488s);
            dVar.B(serialDescriptor, 19, iVar, remote.f96489t);
            dVar.B(serialDescriptor, 20, iVar, remote.f96490u);
            dVar.B(serialDescriptor, 21, iVar, remote.f96491v);
            dVar.B(serialDescriptor, 22, iVar, remote.f96492w);
            dVar.B(serialDescriptor, 23, iVar, remote.f96493x);
            dVar.B(serialDescriptor, 24, iVar, remote.f96494y);
            dVar.B(serialDescriptor, 25, iVar, remote.f96495z);
            dVar.B(serialDescriptor, 26, iVar, remote.f96451A);
            dVar.B(serialDescriptor, 27, iVar, remote.f96452B);
            dVar.B(serialDescriptor, 28, iVar, remote.f96453C);
            dVar.B(serialDescriptor, 29, iVar, remote.f96454D);
            dVar.B(serialDescriptor, 30, iVar, remote.f96455E);
            dVar.B(serialDescriptor, 31, iVar, remote.f96456F);
            dVar.B(serialDescriptor, 32, iVar, remote.f96457G);
            dVar.B(serialDescriptor, 33, iVar, remote.f96458H);
            dVar.B(serialDescriptor, 34, iVar, remote.f96459I);
            dVar.B(serialDescriptor, 35, iVar, remote.f96460J);
            dVar.B(serialDescriptor, 36, iVar, remote.f96461K);
            dVar.B(serialDescriptor, 37, iVar, remote.f96462L);
            dVar.B(serialDescriptor, 38, iVar, remote.f96463M);
            dVar.B(serialDescriptor, 39, iVar, remote.f96464N);
            dVar.B(serialDescriptor, 40, iVar, remote.f96465O);
            dVar.B(serialDescriptor, 41, iVar, remote.f96466P);
            dVar.B(serialDescriptor, 42, iVar, remote.f96467Q);
            dVar.B(serialDescriptor, 43, iVar, remote.f96468R);
            dVar.B(serialDescriptor, 44, iVar, remote.f96469S);
        }

        public final KillSwitchConfig a(String str, String str2, String str3) {
            C17542s.j(str, "marketCode");
            C17542s.j(str2, "languageCode");
            C17542s.j(str3, "version");
            Boolean bool = this.f96470a;
            boolean z10 = true;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            ConfigAlert configAlert = this.f96471b;
            Boolean bool2 = this.f96472c;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            BlockApp blockApp = this.f96473d;
            Boolean bool3 = this.f96474e;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : true;
            Boolean bool4 = this.f96475f;
            boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
            Boolean bool5 = this.f96476g;
            boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
            Boolean bool6 = this.f96477h;
            boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : false;
            Boolean bool7 = this.f96478i;
            boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : false;
            Boolean bool8 = this.f96479j;
            if (bool8 != null) {
                z10 = bool8.booleanValue();
            }
            boolean z11 = z10;
            Boolean bool9 = this.f96480k;
            boolean booleanValue8 = bool9 != null ? bool9.booleanValue() : false;
            Boolean bool10 = this.f96481l;
            boolean booleanValue9 = bool10 != null ? bool10.booleanValue() : false;
            Boolean bool11 = this.f96482m;
            boolean booleanValue10 = bool11 != null ? bool11.booleanValue() : false;
            Boolean bool12 = this.f96483n;
            boolean booleanValue11 = bool12 != null ? bool12.booleanValue() : false;
            Boolean bool13 = this.f96485p;
            boolean booleanValue12 = bool13 != null ? bool13.booleanValue() : false;
            Boolean bool14 = this.f96486q;
            boolean booleanValue13 = bool14 != null ? bool14.booleanValue() : false;
            Boolean bool15 = this.f96487r;
            boolean booleanValue14 = bool15 != null ? bool15.booleanValue() : false;
            Boolean bool16 = this.f96488s;
            boolean booleanValue15 = bool16 != null ? bool16.booleanValue() : false;
            Boolean bool17 = this.f96489t;
            boolean booleanValue16 = bool17 != null ? bool17.booleanValue() : false;
            Boolean bool18 = this.f96490u;
            boolean booleanValue17 = bool18 != null ? bool18.booleanValue() : false;
            Boolean bool19 = this.f96491v;
            boolean booleanValue18 = bool19 != null ? bool19.booleanValue() : false;
            Boolean bool20 = this.f96492w;
            boolean booleanValue19 = bool20 != null ? bool20.booleanValue() : false;
            Boolean bool21 = this.f96493x;
            boolean booleanValue20 = bool21 != null ? bool21.booleanValue() : false;
            Boolean bool22 = this.f96484o;
            boolean booleanValue21 = bool22 != null ? bool22.booleanValue() : false;
            Boolean bool23 = this.f96494y;
            boolean booleanValue22 = bool23 != null ? bool23.booleanValue() : false;
            Boolean bool24 = this.f96495z;
            boolean booleanValue23 = bool24 != null ? bool24.booleanValue() : false;
            Boolean bool25 = this.f96451A;
            boolean booleanValue24 = bool25 != null ? bool25.booleanValue() : false;
            Boolean bool26 = this.f96452B;
            boolean booleanValue25 = bool26 != null ? bool26.booleanValue() : false;
            Boolean bool27 = this.f96453C;
            boolean booleanValue26 = bool27 != null ? bool27.booleanValue() : false;
            Boolean bool28 = this.f96454D;
            boolean booleanValue27 = bool28 != null ? bool28.booleanValue() : false;
            Boolean bool29 = this.f96455E;
            boolean booleanValue28 = bool29 != null ? bool29.booleanValue() : false;
            Boolean bool30 = this.f96456F;
            boolean booleanValue29 = bool30 != null ? bool30.booleanValue() : false;
            Boolean bool31 = this.f96457G;
            boolean booleanValue30 = bool31 != null ? bool31.booleanValue() : false;
            Boolean bool32 = this.f96458H;
            boolean booleanValue31 = bool32 != null ? bool32.booleanValue() : false;
            Boolean bool33 = this.f96459I;
            boolean booleanValue32 = bool33 != null ? bool33.booleanValue() : false;
            Boolean bool34 = this.f96460J;
            boolean booleanValue33 = bool34 != null ? bool34.booleanValue() : false;
            Boolean bool35 = this.f96461K;
            boolean booleanValue34 = bool35 != null ? bool35.booleanValue() : false;
            Boolean bool36 = this.f96462L;
            boolean booleanValue35 = bool36 != null ? bool36.booleanValue() : false;
            Boolean bool37 = this.f96463M;
            boolean booleanValue36 = bool37 != null ? bool37.booleanValue() : false;
            Boolean bool38 = this.f96464N;
            boolean booleanValue37 = bool38 != null ? bool38.booleanValue() : false;
            Boolean bool39 = this.f96465O;
            boolean booleanValue38 = bool39 != null ? bool39.booleanValue() : false;
            Boolean bool40 = this.f96466P;
            boolean booleanValue39 = bool40 != null ? bool40.booleanValue() : false;
            Boolean bool41 = this.f96467Q;
            boolean booleanValue40 = bool41 != null ? bool41.booleanValue() : false;
            Boolean bool42 = this.f96468R;
            boolean booleanValue41 = bool42 != null ? bool42.booleanValue() : false;
            Boolean bool43 = this.f96469S;
            return new KillSwitchConfig(str, str2, str3, booleanValue, configAlert, booleanValue2, blockApp, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, z11, booleanValue8, booleanValue9, booleanValue10, booleanValue11, booleanValue21, booleanValue12, booleanValue13, booleanValue14, booleanValue15, booleanValue16, booleanValue17, booleanValue18, booleanValue19, booleanValue20, booleanValue22, booleanValue23, booleanValue24, booleanValue25, booleanValue26, booleanValue27, booleanValue28, booleanValue29, booleanValue30, Boolean.valueOf(booleanValue31), Boolean.valueOf(booleanValue32), Boolean.valueOf(booleanValue33), Boolean.valueOf(booleanValue34), Boolean.valueOf(booleanValue35), Boolean.valueOf(booleanValue36), Boolean.valueOf(booleanValue37), booleanValue38, booleanValue39, booleanValue40, booleanValue41, bool43 != null ? bool43.booleanValue() : false);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) obj;
            return C17542s.e(this.f96470a, remote.f96470a) && C17542s.e(this.f96471b, remote.f96471b) && C17542s.e(this.f96472c, remote.f96472c) && C17542s.e(this.f96473d, remote.f96473d) && C17542s.e(this.f96474e, remote.f96474e) && C17542s.e(this.f96475f, remote.f96475f) && C17542s.e(this.f96476g, remote.f96476g) && C17542s.e(this.f96477h, remote.f96477h) && C17542s.e(this.f96478i, remote.f96478i) && C17542s.e(this.f96479j, remote.f96479j) && C17542s.e(this.f96480k, remote.f96480k) && C17542s.e(this.f96481l, remote.f96481l) && C17542s.e(this.f96482m, remote.f96482m) && C17542s.e(this.f96483n, remote.f96483n) && C17542s.e(this.f96484o, remote.f96484o) && C17542s.e(this.f96485p, remote.f96485p) && C17542s.e(this.f96486q, remote.f96486q) && C17542s.e(this.f96487r, remote.f96487r) && C17542s.e(this.f96488s, remote.f96488s) && C17542s.e(this.f96489t, remote.f96489t) && C17542s.e(this.f96490u, remote.f96490u) && C17542s.e(this.f96491v, remote.f96491v) && C17542s.e(this.f96492w, remote.f96492w) && C17542s.e(this.f96493x, remote.f96493x) && C17542s.e(this.f96494y, remote.f96494y) && C17542s.e(this.f96495z, remote.f96495z) && C17542s.e(this.f96451A, remote.f96451A) && C17542s.e(this.f96452B, remote.f96452B) && C17542s.e(this.f96453C, remote.f96453C) && C17542s.e(this.f96454D, remote.f96454D) && C17542s.e(this.f96455E, remote.f96455E) && C17542s.e(this.f96456F, remote.f96456F) && C17542s.e(this.f96457G, remote.f96457G) && C17542s.e(this.f96458H, remote.f96458H) && C17542s.e(this.f96459I, remote.f96459I) && C17542s.e(this.f96460J, remote.f96460J) && C17542s.e(this.f96461K, remote.f96461K) && C17542s.e(this.f96462L, remote.f96462L) && C17542s.e(this.f96463M, remote.f96463M) && C17542s.e(this.f96464N, remote.f96464N) && C17542s.e(this.f96465O, remote.f96465O) && C17542s.e(this.f96466P, remote.f96466P) && C17542s.e(this.f96467Q, remote.f96467Q) && C17542s.e(this.f96468R, remote.f96468R) && C17542s.e(this.f96469S, remote.f96469S);
        }

        public int hashCode() {
            Boolean bool = this.f96470a;
            int i10 = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            ConfigAlert configAlert = this.f96471b;
            int hashCode2 = (hashCode + (configAlert == null ? 0 : configAlert.hashCode())) * 31;
            Boolean bool2 = this.f96472c;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            BlockApp blockApp = this.f96473d;
            int hashCode4 = (hashCode3 + (blockApp == null ? 0 : blockApp.hashCode())) * 31;
            Boolean bool3 = this.f96474e;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f96475f;
            int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.f96476g;
            int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.f96477h;
            int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.f96478i;
            int hashCode9 = (hashCode8 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.f96479j;
            int hashCode10 = (hashCode9 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.f96480k;
            int hashCode11 = (hashCode10 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.f96481l;
            int hashCode12 = (hashCode11 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.f96482m;
            int hashCode13 = (hashCode12 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.f96483n;
            int hashCode14 = (hashCode13 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.f96484o;
            int hashCode15 = (hashCode14 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.f96485p;
            int hashCode16 = (hashCode15 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.f96486q;
            int hashCode17 = (hashCode16 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.f96487r;
            int hashCode18 = (hashCode17 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.f96488s;
            int hashCode19 = (hashCode18 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            Boolean bool18 = this.f96489t;
            int hashCode20 = (hashCode19 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            Boolean bool19 = this.f96490u;
            int hashCode21 = (hashCode20 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.f96491v;
            int hashCode22 = (hashCode21 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.f96492w;
            int hashCode23 = (hashCode22 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            Boolean bool22 = this.f96493x;
            int hashCode24 = (hashCode23 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            Boolean bool23 = this.f96494y;
            int hashCode25 = (hashCode24 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
            Boolean bool24 = this.f96495z;
            int hashCode26 = (hashCode25 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
            Boolean bool25 = this.f96451A;
            int hashCode27 = (hashCode26 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
            Boolean bool26 = this.f96452B;
            int hashCode28 = (hashCode27 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
            Boolean bool27 = this.f96453C;
            int hashCode29 = (hashCode28 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
            Boolean bool28 = this.f96454D;
            int hashCode30 = (hashCode29 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
            Boolean bool29 = this.f96455E;
            int hashCode31 = (hashCode30 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
            Boolean bool30 = this.f96456F;
            int hashCode32 = (hashCode31 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
            Boolean bool31 = this.f96457G;
            int hashCode33 = (hashCode32 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
            Boolean bool32 = this.f96458H;
            int hashCode34 = (hashCode33 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
            Boolean bool33 = this.f96459I;
            int hashCode35 = (hashCode34 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
            Boolean bool34 = this.f96460J;
            int hashCode36 = (hashCode35 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
            Boolean bool35 = this.f96461K;
            int hashCode37 = (hashCode36 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
            Boolean bool36 = this.f96462L;
            int hashCode38 = (hashCode37 + (bool36 == null ? 0 : bool36.hashCode())) * 31;
            Boolean bool37 = this.f96463M;
            int hashCode39 = (hashCode38 + (bool37 == null ? 0 : bool37.hashCode())) * 31;
            Boolean bool38 = this.f96464N;
            int hashCode40 = (hashCode39 + (bool38 == null ? 0 : bool38.hashCode())) * 31;
            Boolean bool39 = this.f96465O;
            int hashCode41 = (hashCode40 + (bool39 == null ? 0 : bool39.hashCode())) * 31;
            Boolean bool40 = this.f96466P;
            int hashCode42 = (hashCode41 + (bool40 == null ? 0 : bool40.hashCode())) * 31;
            Boolean bool41 = this.f96467Q;
            int hashCode43 = (hashCode42 + (bool41 == null ? 0 : bool41.hashCode())) * 31;
            Boolean bool42 = this.f96468R;
            int hashCode44 = (hashCode43 + (bool42 == null ? 0 : bool42.hashCode())) * 31;
            Boolean bool43 = this.f96469S;
            if (bool43 != null) {
                i10 = bool43.hashCode();
            }
            return hashCode44 + i10;
        }

        public String toString() {
            Boolean bool = this.f96470a;
            ConfigAlert configAlert = this.f96471b;
            Boolean bool2 = this.f96472c;
            BlockApp blockApp = this.f96473d;
            Boolean bool3 = this.f96474e;
            Boolean bool4 = this.f96475f;
            Boolean bool5 = this.f96476g;
            Boolean bool6 = this.f96477h;
            Boolean bool7 = this.f96478i;
            Boolean bool8 = this.f96479j;
            Boolean bool9 = this.f96480k;
            Boolean bool10 = this.f96481l;
            Boolean bool11 = this.f96482m;
            Boolean bool12 = this.f96483n;
            Boolean bool13 = this.f96484o;
            Boolean bool14 = this.f96485p;
            Boolean bool15 = this.f96486q;
            Boolean bool16 = this.f96487r;
            Boolean bool17 = this.f96488s;
            Boolean bool18 = this.f96489t;
            Boolean bool19 = this.f96490u;
            Boolean bool20 = this.f96491v;
            Boolean bool21 = this.f96492w;
            Boolean bool22 = this.f96493x;
            Boolean bool23 = this.f96494y;
            Boolean bool24 = this.f96495z;
            Boolean bool25 = this.f96451A;
            Boolean bool26 = this.f96452B;
            Boolean bool27 = this.f96453C;
            Boolean bool28 = this.f96454D;
            Boolean bool29 = this.f96455E;
            Boolean bool30 = this.f96456F;
            Boolean bool31 = this.f96457G;
            Boolean bool32 = this.f96458H;
            Boolean bool33 = this.f96459I;
            Boolean bool34 = this.f96460J;
            Boolean bool35 = this.f96461K;
            Boolean bool36 = this.f96462L;
            Boolean bool37 = this.f96463M;
            Boolean bool38 = this.f96464N;
            Boolean bool39 = this.f96465O;
            Boolean bool40 = this.f96466P;
            Boolean bool41 = this.f96467Q;
            Boolean bool42 = this.f96468R;
            Boolean bool43 = this.f96469S;
            return "Remote(isPerformStockCheck=" + bool + ", alertConfig=" + configAlert + ", enableDynamicLinkShare=" + bool2 + ", blockApp=" + blockApp + ", enableOnlineCheckout=" + bool3 + ", purchaseHistoryListingEnabled=" + bool4 + ", purchaseHistoryLookupEnabled=" + bool5 + ", enableShopAndGo=" + bool6 + ", showAddToCartUnrestricted=" + bool7 + ", showInAppRatingRequest=" + bool8 + ", enableDataControls=" + bool9 + ", enableOnlineAvailability=" + bool10 + ", enableOnlineClickCollectAvailability=" + bool11 + ", shopAndGoTermsAndConditions=" + bool12 + ", enableAvailabilityCart=" + bool13 + ", enableAssemblyServicesAvailability=" + bool14 + ", enableAssemblyServicesOrder=" + bool15 + ", enableFinancialServices=" + bool16 + ", enableCommunicationPostsCarousel=" + bool17 + ", enableFamilyRewards=" + bool18 + ", enableFamilyRewardsCart=" + bool19 + ", enableBackInStockNotificationsCashAndCarry=" + bool20 + ", enableBackInStockNotificationsHomeDelivery=" + bool21 + ", enableKreativEntryPoints=" + bool22 + ", redirectSearchAndBrowsePilot=" + bool23 + ", enableGiftCardBalanceCheck=" + bool24 + ", enableRegisterPushTokens=" + bool25 + ", wayfindingEnabled=" + bool26 + ", enableUpsertAddressInCheckout=" + bool27 + ", enableInboxBackgroundFetch=" + bool28 + ", enableBrowseRecommendedCarousel=" + bool29 + ", enableAdjustSdk=" + bool30 + ", enableExpressAndOnlineReturns=" + bool31 + ", enableInAppUpdates=" + bool32 + ", enableGooglePayExpressInCheckout=" + bool33 + ", enableGooglePayExpressInCart=" + bool34 + ", enableMembershipSpaceKreativ=" + bool35 + ", enableNavigeraAlertMessages=" + bool36 + ", enableNavigeraCommercialMessagesForBrowse=" + bool37 + ", enableOffersHub=" + bool38 + ", enableShoppingListRedesign=" + bool39 + ", enableAppointmentBooking=" + bool40 + ", enableCartProximity=" + bool41 + ", enableStoreModeActivation=" + bool42 + ", enablePrepaidCards=" + bool43 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/killswitch/model/KillSwitchConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<KillSwitchConfig> serializer() {
            return KillSwitchConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KillSwitchConfig(int i10, int i11, String str, String str2, String str3, boolean z10, ConfigAlert configAlert, boolean z11, BlockApp blockApp, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, T0 t02) {
        if ((-5 != (i10 & -5)) || (65535 != (i11 & 65535))) {
            E0.a(new int[]{i10, i11}, new int[]{-5, 65535}, KillSwitchConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.f96425a = str;
        this.f96426b = str2;
        this.f96427c = (i10 & 4) == 0 ? null : str3;
        this.f96428d = z10;
        this.f96429e = configAlert;
        this.f96430f = z11;
        this.f96431g = blockApp;
        this.f96432h = z12;
        this.f96433i = z13;
        this.f96434j = z14;
        this.f96435k = z15;
        this.f96436l = z16;
        this.f96437m = z17;
        this.f96438n = z18;
        this.f96439o = z19;
        this.f96440p = z20;
        this.f96441q = z21;
        this.f96442r = z22;
        this.f96443s = z23;
        this.f96444t = z24;
        this.f96445u = z25;
        this.f96446v = z26;
        this.f96447w = z27;
        this.f96448x = z28;
        this.f96449y = z29;
        this.f96450z = z30;
        this.f96403A = z31;
        this.f96404B = z32;
        this.f96405C = z33;
        this.f96406D = z34;
        this.f96407E = z35;
        this.f96408F = z36;
        this.f96409G = z37;
        this.f96410H = z38;
        this.f96411I = z39;
        this.f96412J = z40;
        this.f96413K = bool;
        this.f96414L = bool2;
        this.f96415M = bool3;
        this.f96416N = bool4;
        this.f96417O = bool5;
        this.f96418P = bool6;
        this.f96419Q = bool7;
        this.f96420R = z41;
        this.f96421S = z42;
        this.f96422T = z43;
        this.f96423U = z44;
        this.f96424V = z45;
    }

    public static final /* synthetic */ void Q(KillSwitchConfig killSwitchConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, killSwitchConfig.f96425a);
        dVar.y(serialDescriptor, 1, killSwitchConfig.f96426b);
        if (dVar.z(serialDescriptor, 2) || killSwitchConfig.f96427c != null) {
            dVar.B(serialDescriptor, 2, Y0.f144077a, killSwitchConfig.f96427c);
        }
        dVar.x(serialDescriptor, 3, killSwitchConfig.f96428d);
        dVar.B(serialDescriptor, 4, ConfigAlert$$serializer.INSTANCE, killSwitchConfig.f96429e);
        dVar.x(serialDescriptor, 5, killSwitchConfig.f96430f);
        dVar.B(serialDescriptor, 6, BlockApp$$serializer.INSTANCE, killSwitchConfig.f96431g);
        dVar.x(serialDescriptor, 7, killSwitchConfig.f96432h);
        dVar.x(serialDescriptor, 8, killSwitchConfig.f96433i);
        dVar.x(serialDescriptor, 9, killSwitchConfig.f96434j);
        dVar.x(serialDescriptor, 10, killSwitchConfig.f96435k);
        dVar.x(serialDescriptor, 11, killSwitchConfig.f96436l);
        dVar.x(serialDescriptor, 12, killSwitchConfig.f96437m);
        dVar.x(serialDescriptor, 13, killSwitchConfig.f96438n);
        dVar.x(serialDescriptor, 14, killSwitchConfig.f96439o);
        dVar.x(serialDescriptor, 15, killSwitchConfig.f96440p);
        dVar.x(serialDescriptor, 16, killSwitchConfig.f96441q);
        dVar.x(serialDescriptor, 17, killSwitchConfig.f96442r);
        dVar.x(serialDescriptor, 18, killSwitchConfig.f96443s);
        dVar.x(serialDescriptor, 19, killSwitchConfig.f96444t);
        dVar.x(serialDescriptor, 20, killSwitchConfig.f96445u);
        dVar.x(serialDescriptor, 21, killSwitchConfig.f96446v);
        dVar.x(serialDescriptor, 22, killSwitchConfig.f96447w);
        dVar.x(serialDescriptor, 23, killSwitchConfig.f96448x);
        dVar.x(serialDescriptor, 24, killSwitchConfig.f96449y);
        dVar.x(serialDescriptor, 25, killSwitchConfig.f96450z);
        dVar.x(serialDescriptor, 26, killSwitchConfig.f96403A);
        dVar.x(serialDescriptor, 27, killSwitchConfig.f96404B);
        dVar.x(serialDescriptor, 28, killSwitchConfig.f96405C);
        dVar.x(serialDescriptor, 29, killSwitchConfig.f96406D);
        dVar.x(serialDescriptor, 30, killSwitchConfig.f96407E);
        dVar.x(serialDescriptor, 31, killSwitchConfig.f96408F);
        dVar.x(serialDescriptor, 32, killSwitchConfig.f96409G);
        dVar.x(serialDescriptor, 33, killSwitchConfig.f96410H);
        dVar.x(serialDescriptor, 34, killSwitchConfig.f96411I);
        dVar.x(serialDescriptor, 35, killSwitchConfig.f96412J);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 36, iVar, killSwitchConfig.f96413K);
        dVar.B(serialDescriptor, 37, iVar, killSwitchConfig.f96414L);
        dVar.B(serialDescriptor, 38, iVar, killSwitchConfig.f96415M);
        dVar.B(serialDescriptor, 39, iVar, killSwitchConfig.f96416N);
        dVar.B(serialDescriptor, 40, iVar, killSwitchConfig.f96417O);
        dVar.B(serialDescriptor, 41, iVar, killSwitchConfig.f96418P);
        dVar.B(serialDescriptor, 42, iVar, killSwitchConfig.f96419Q);
        dVar.x(serialDescriptor, 43, killSwitchConfig.f96420R);
        dVar.x(serialDescriptor, 44, killSwitchConfig.f96421S);
        dVar.x(serialDescriptor, 45, killSwitchConfig.f96422T);
        dVar.x(serialDescriptor, 46, killSwitchConfig.f96423U);
        dVar.x(serialDescriptor, 47, killSwitchConfig.f96424V);
    }

    public final boolean A() {
        return this.f96440p;
    }

    public final boolean B() {
        return this.f96424V;
    }

    public final boolean C() {
        return this.f96406D;
    }

    public final boolean D() {
        return this.f96435k;
    }

    public final boolean E() {
        return this.f96420R;
    }

    public final boolean F() {
        return this.f96423U;
    }

    public final boolean G() {
        return this.f96408F;
    }

    public final String H() {
        return this.f96426b;
    }

    public final String I() {
        return this.f96425a;
    }

    public final boolean J() {
        return this.f96433i;
    }

    public final boolean K() {
        return this.f96434j;
    }

    public final boolean L() {
        return this.f96441q;
    }

    public final boolean M() {
        return this.f96436l;
    }

    public final boolean N() {
        return this.f96437m;
    }

    public final String O() {
        return this.f96427c;
    }

    public final boolean P() {
        return this.f96407E;
    }

    public final ConfigAlert a() {
        return this.f96429e;
    }

    public final BlockApp b() {
        return this.f96431g;
    }

    public final boolean c() {
        return this.f96411I;
    }

    public final boolean d() {
        return this.f96421S;
    }

    public final boolean e() {
        return this.f96443s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KillSwitchConfig)) {
            return false;
        }
        KillSwitchConfig killSwitchConfig = (KillSwitchConfig) obj;
        return C17542s.e(this.f96425a, killSwitchConfig.f96425a) && C17542s.e(this.f96426b, killSwitchConfig.f96426b) && C17542s.e(this.f96427c, killSwitchConfig.f96427c) && this.f96428d == killSwitchConfig.f96428d && C17542s.e(this.f96429e, killSwitchConfig.f96429e) && this.f96430f == killSwitchConfig.f96430f && C17542s.e(this.f96431g, killSwitchConfig.f96431g) && this.f96432h == killSwitchConfig.f96432h && this.f96433i == killSwitchConfig.f96433i && this.f96434j == killSwitchConfig.f96434j && this.f96435k == killSwitchConfig.f96435k && this.f96436l == killSwitchConfig.f96436l && this.f96437m == killSwitchConfig.f96437m && this.f96438n == killSwitchConfig.f96438n && this.f96439o == killSwitchConfig.f96439o && this.f96440p == killSwitchConfig.f96440p && this.f96441q == killSwitchConfig.f96441q && this.f96442r == killSwitchConfig.f96442r && this.f96443s == killSwitchConfig.f96443s && this.f96444t == killSwitchConfig.f96444t && this.f96445u == killSwitchConfig.f96445u && this.f96446v == killSwitchConfig.f96446v && this.f96447w == killSwitchConfig.f96447w && this.f96448x == killSwitchConfig.f96448x && this.f96449y == killSwitchConfig.f96449y && this.f96450z == killSwitchConfig.f96450z && this.f96403A == killSwitchConfig.f96403A && this.f96404B == killSwitchConfig.f96404B && this.f96405C == killSwitchConfig.f96405C && this.f96406D == killSwitchConfig.f96406D && this.f96407E == killSwitchConfig.f96407E && this.f96408F == killSwitchConfig.f96408F && this.f96409G == killSwitchConfig.f96409G && this.f96410H == killSwitchConfig.f96410H && this.f96411I == killSwitchConfig.f96411I && this.f96412J == killSwitchConfig.f96412J && C17542s.e(this.f96413K, killSwitchConfig.f96413K) && C17542s.e(this.f96414L, killSwitchConfig.f96414L) && C17542s.e(this.f96415M, killSwitchConfig.f96415M) && C17542s.e(this.f96416N, killSwitchConfig.f96416N) && C17542s.e(this.f96417O, killSwitchConfig.f96417O) && C17542s.e(this.f96418P, killSwitchConfig.f96418P) && C17542s.e(this.f96419Q, killSwitchConfig.f96419Q) && this.f96420R == killSwitchConfig.f96420R && this.f96421S == killSwitchConfig.f96421S && this.f96422T == killSwitchConfig.f96422T && this.f96423U == killSwitchConfig.f96423U && this.f96424V == killSwitchConfig.f96424V;
    }

    public final boolean f() {
        return this.f96444t;
    }

    public final boolean g() {
        return this.f96442r;
    }

    public final boolean h() {
        return this.f96449y;
    }

    public int hashCode() {
        int hashCode = ((this.f96425a.hashCode() * 31) + this.f96426b.hashCode()) * 31;
        String str = this.f96427c;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f96428d)) * 31;
        ConfigAlert configAlert = this.f96429e;
        int hashCode3 = (((hashCode2 + (configAlert == null ? 0 : configAlert.hashCode())) * 31) + Boolean.hashCode(this.f96430f)) * 31;
        BlockApp blockApp = this.f96431g;
        int hashCode4 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode3 + (blockApp == null ? 0 : blockApp.hashCode())) * 31) + Boolean.hashCode(this.f96432h)) * 31) + Boolean.hashCode(this.f96433i)) * 31) + Boolean.hashCode(this.f96434j)) * 31) + Boolean.hashCode(this.f96435k)) * 31) + Boolean.hashCode(this.f96436l)) * 31) + Boolean.hashCode(this.f96437m)) * 31) + Boolean.hashCode(this.f96438n)) * 31) + Boolean.hashCode(this.f96439o)) * 31) + Boolean.hashCode(this.f96440p)) * 31) + Boolean.hashCode(this.f96441q)) * 31) + Boolean.hashCode(this.f96442r)) * 31) + Boolean.hashCode(this.f96443s)) * 31) + Boolean.hashCode(this.f96444t)) * 31) + Boolean.hashCode(this.f96445u)) * 31) + Boolean.hashCode(this.f96446v)) * 31) + Boolean.hashCode(this.f96447w)) * 31) + Boolean.hashCode(this.f96448x)) * 31) + Boolean.hashCode(this.f96449y)) * 31) + Boolean.hashCode(this.f96450z)) * 31) + Boolean.hashCode(this.f96403A)) * 31) + Boolean.hashCode(this.f96404B)) * 31) + Boolean.hashCode(this.f96405C)) * 31) + Boolean.hashCode(this.f96406D)) * 31) + Boolean.hashCode(this.f96407E)) * 31) + Boolean.hashCode(this.f96408F)) * 31) + Boolean.hashCode(this.f96409G)) * 31) + Boolean.hashCode(this.f96410H)) * 31) + Boolean.hashCode(this.f96411I)) * 31) + Boolean.hashCode(this.f96412J)) * 31;
        Boolean bool = this.f96413K;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f96414L;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f96415M;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f96416N;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f96417O;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f96418P;
        int hashCode10 = (hashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f96419Q;
        if (bool7 != null) {
            i10 = bool7.hashCode();
        }
        return ((((((((((hashCode10 + i10) * 31) + Boolean.hashCode(this.f96420R)) * 31) + Boolean.hashCode(this.f96421S)) * 31) + Boolean.hashCode(this.f96422T)) * 31) + Boolean.hashCode(this.f96423U)) * 31) + Boolean.hashCode(this.f96424V);
    }

    public final boolean i() {
        return this.f96450z;
    }

    public final boolean j() {
        return this.f96430f;
    }

    public final boolean k() {
        return this.f96412J;
    }

    public final boolean l() {
        return this.f96447w;
    }

    public final boolean m() {
        return this.f96448x;
    }

    public final boolean n() {
        return this.f96445u;
    }

    public final boolean o() {
        return this.f96405C;
    }

    public final Boolean p() {
        return this.f96415M;
    }

    public final Boolean q() {
        return this.f96414L;
    }

    public final Boolean r() {
        return this.f96413K;
    }

    public final boolean s() {
        return this.f96409G;
    }

    public final boolean t() {
        return this.f96403A;
    }

    public String toString() {
        String str = this.f96425a;
        String str2 = this.f96426b;
        String str3 = this.f96427c;
        boolean z10 = this.f96428d;
        ConfigAlert configAlert = this.f96429e;
        boolean z11 = this.f96430f;
        BlockApp blockApp = this.f96431g;
        boolean z12 = this.f96432h;
        boolean z13 = this.f96433i;
        boolean z14 = this.f96434j;
        boolean z15 = this.f96435k;
        boolean z16 = this.f96436l;
        boolean z17 = this.f96437m;
        boolean z18 = this.f96438n;
        boolean z19 = this.f96439o;
        boolean z20 = this.f96440p;
        boolean z21 = this.f96441q;
        boolean z22 = this.f96442r;
        boolean z23 = this.f96443s;
        boolean z24 = this.f96444t;
        boolean z25 = this.f96445u;
        boolean z26 = this.f96446v;
        boolean z27 = this.f96447w;
        boolean z28 = this.f96448x;
        boolean z29 = this.f96449y;
        boolean z30 = this.f96450z;
        boolean z31 = this.f96403A;
        boolean z32 = this.f96404B;
        boolean z33 = this.f96405C;
        boolean z34 = this.f96406D;
        boolean z35 = this.f96407E;
        boolean z36 = this.f96408F;
        boolean z37 = this.f96409G;
        boolean z38 = this.f96410H;
        boolean z39 = this.f96411I;
        boolean z40 = this.f96412J;
        Boolean bool = this.f96413K;
        Boolean bool2 = this.f96414L;
        Boolean bool3 = this.f96415M;
        Boolean bool4 = this.f96416N;
        Boolean bool5 = this.f96417O;
        Boolean bool6 = this.f96418P;
        Boolean bool7 = this.f96419Q;
        boolean z41 = this.f96420R;
        boolean z42 = this.f96421S;
        boolean z43 = this.f96422T;
        boolean z44 = this.f96423U;
        boolean z45 = this.f96424V;
        return "KillSwitchConfig(marketCode=" + str + ", languageCode=" + str2 + ", version=" + str3 + ", isPerformStockCheck=" + z10 + ", alertConfig=" + configAlert + ", enableDynamicLinkShare=" + z11 + ", blockApp=" + blockApp + ", enableOnlineCheckout=" + z12 + ", purchaseHistoryListingEnabled=" + z13 + ", purchaseHistoryLookupEnabled=" + z14 + ", enableShopAndGo=" + z15 + ", showAddToCartUnrestricted=" + z16 + ", showInAppRatingRequest=" + z17 + ", enableDataControls=" + z18 + ", enableOnlineAvailability=" + z19 + ", enableOnlineClickCollectAvailability=" + z20 + ", shopAndGoTermsAndConditions=" + z21 + ", enableAvailabilityCart=" + z22 + ", enableAssemblyServicesAvailability=" + z23 + ", enableAssemblyServicesOrder=" + z24 + ", enableFinancialServices=" + z25 + ", enableCommunicationPostsCarousel=" + z26 + ", enableFamilyRewards=" + z27 + ", enableFamilyRewardsCart=" + z28 + ", enableBackInStockNotificationsCashAndCarry=" + z29 + ", enableBackInStockNotificationsHomeDelivery=" + z30 + ", enableKreativEntryPoints=" + z31 + ", redirectSearchAndBrowsePilot=" + z32 + ", enableGiftCardBalanceCheck=" + z33 + ", enableRegisterPushTokens=" + z34 + ", wayfindingEnabled=" + z35 + ", enableUpsertAddressInCheckout=" + z36 + ", enableInboxBackgroundFetch=" + z37 + ", enableBrowseRecommendedCarousel=" + z38 + ", enableAdjustSdk=" + z39 + ", enableExpressAndOnlineReturns=" + z40 + ", enableInAppUpdates=" + bool + ", enableGooglePayExpressInCheckout=" + bool2 + ", enableGooglePayExpressInCart=" + bool3 + ", enableMembershipSpaceKreativ=" + bool4 + ", enableNavigeraAlertMessages=" + bool5 + ", enableNavigeraCommercialMessagesForBrowse=" + bool6 + ", enableOffersHub=" + bool7 + ", enableShoppingListRedesign=" + z41 + ", enableAppointmentBooking=" + z42 + ", enableCartProximity=" + z43 + ", enableStoreModeActivation=" + z44 + ", enablePrepaidCards=" + z45 + ")";
    }

    public final Boolean u() {
        return this.f96416N;
    }

    public final Boolean v() {
        return this.f96417O;
    }

    public final Boolean w() {
        return this.f96418P;
    }

    public final Boolean x() {
        return this.f96419Q;
    }

    public final boolean y() {
        return this.f96439o;
    }

    public final boolean z() {
        return this.f96432h;
    }

    public KillSwitchConfig(String str, String str2, String str3, boolean z10, ConfigAlert configAlert, boolean z11, BlockApp blockApp, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45) {
        C17542s.j(str, "marketCode");
        C17542s.j(str2, "languageCode");
        this.f96425a = str;
        this.f96426b = str2;
        this.f96427c = str3;
        this.f96428d = z10;
        this.f96429e = configAlert;
        this.f96430f = z11;
        this.f96431g = blockApp;
        this.f96432h = z12;
        this.f96433i = z13;
        this.f96434j = z14;
        this.f96435k = z15;
        this.f96436l = z16;
        this.f96437m = z17;
        this.f96438n = z18;
        this.f96439o = z19;
        this.f96440p = z20;
        this.f96441q = z21;
        this.f96442r = z22;
        this.f96443s = z23;
        this.f96444t = z24;
        this.f96445u = z25;
        this.f96446v = z26;
        this.f96447w = z27;
        this.f96448x = z28;
        this.f96449y = z29;
        this.f96450z = z30;
        this.f96403A = z31;
        this.f96404B = z32;
        this.f96405C = z33;
        this.f96406D = z34;
        this.f96407E = z35;
        this.f96408F = z36;
        this.f96409G = z37;
        this.f96410H = z38;
        this.f96411I = z39;
        this.f96412J = z40;
        this.f96413K = bool;
        this.f96414L = bool2;
        this.f96415M = bool3;
        this.f96416N = bool4;
        this.f96417O = bool5;
        this.f96418P = bool6;
        this.f96419Q = bool7;
        this.f96420R = z41;
        this.f96421S = z42;
        this.f96422T = z43;
        this.f96423U = z44;
        this.f96424V = z45;
    }
}
