package com.sugarcube.decorate.v1.internal.catalog;

import HJ.C15854t;
import NF.C13291e;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.P0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import YH.C16877v;
import ZF.C16942a;
import android.util.Log;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bK.C17052a;
import com.sugarcube.app.base.data.Loadable;
import com.sugarcube.app.base.data.Result;
import com.sugarcube.app.base.data.analytics.Analytics;
import com.sugarcube.app.base.data.analytics.RoomSource;
import com.sugarcube.app.base.data.analytics.SearchType;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.feature.FeatureFlags;
import com.sugarcube.app.base.data.source.CatalogRepository;
import com.sugarcube.app.base.data.source.QuickFilterRepository;
import com.sugarcube.app.base.data.source.QuickFilterRepositorySource;
import com.sugarcube.app.base.external.shoppinglist.AddToShoppingListUseCase;
import com.sugarcube.app.base.external.shoppinglist.FetchShoppingListItemsUseCase;
import com.sugarcube.app.base.network.AutocompleteClient;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.CatalogCategory;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17221b;
import iF.X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0002BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u0018J\u000f\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010\u0018JM\u0010.\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0&2(\u0010-\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0+0*\u0012\u0006\u0012\u0004\u0018\u00010,0)H\u0002¢\u0006\u0004\b.\u0010/J1\u00102\u001a\u00020\u00142\u0012\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0&2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u0010\u0018J\u0015\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J-\u0010>\u001a\u00020\u00142\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\b\b\u0002\u0010;\u001a\u00020\u001d2\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u0012¢\u0006\u0004\bA\u0010\u0016J3\u0010D\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010B\u001a\u0004\u0018\u0001092\b\u0010C\u001a\u0004\u0018\u000109¢\u0006\u0004\bD\u0010EJ\u0015\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00142\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\u00142\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bN\u0010MJ\u001b\u0010P\u001a\u00020\u00142\f\u0010O\u001a\b\u0012\u0004\u0012\u00020J0'¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\u0014¢\u0006\u0004\bR\u0010\u0018J\r\u0010S\u001a\u00020\u0014¢\u0006\u0004\bS\u0010\u0018J\r\u0010T\u001a\u00020\u0014¢\u0006\u0004\bT\u0010\u0018J\u0015\u0010U\u001a\u00020\u00142\u0006\u0010B\u001a\u00020F¢\u0006\u0004\bU\u0010IJ\u0017\u0010W\u001a\u00020\u00142\b\b\u0002\u0010V\u001a\u00020\u001d¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u00142\u0006\u0010Y\u001a\u000209¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J\u0015\u0010`\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b`\u0010\u0016J\u0015\u0010b\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u001d¢\u0006\u0004\bb\u0010XJ\r\u0010c\u001a\u00020\u0014¢\u0006\u0004\bc\u0010\u0018J\r\u0010d\u001a\u00020\u0014¢\u0006\u0004\bd\u0010\u0018J\r\u0010e\u001a\u00020\u0014¢\u0006\u0004\be\u0010\u0018J\r\u0010f\u001a\u00020\u0014¢\u0006\u0004\bf\u0010\u0018J\r\u0010g\u001a\u00020\u0014¢\u0006\u0004\bg\u0010\u0018J\r\u0010h\u001a\u00020\u001d¢\u0006\u0004\bh\u0010\u001fJ\r\u0010i\u001a\u00020\u0014¢\u0006\u0004\bi\u0010\u0018J\u001d\u0010l\u001a\u00020\u001d2\u0006\u0010k\u001a\u00020j2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bl\u0010mJ\u0015\u0010n\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\bn\u0010\u0016J\r\u0010o\u001a\u00020\u0014¢\u0006\u0004\bo\u0010\u0018J%\u0010r\u001a\u00020\u00142\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00120'2\b\u0010q\u001a\u0004\u0018\u000109¢\u0006\u0004\br\u0010sR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\r\u001a\u00020\f8\u0006¢\u0006\u000e\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0&8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\u0011\u0012\r\u0012\u000b \u0001*\u0004\u0018\u00010\u00190\u00190&8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020J0&8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R#\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0&8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R#\u0010¡\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0&8\u0002X\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u0001R#\u0010£\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120'0&8\u0002X\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010\u0001R*\u0010§\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¤\u00010'0\u00018\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u0001\u001a\u0006\b¦\u0001\u0010\u0001R\u001f\u0010©\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0&8\u0002X\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010\u0001R!\u0010«\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0&8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u0001R\u001d\u0010­\u0001\u001a\b\u0012\u0004\u0012\u0002090&8\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u0001R#\u0010¯\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0'0&8\u0002X\u0004¢\u0006\b\n\u0006\b®\u0001\u0010\u0001R+\u0010²\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020F\u0018\u00010'0\u00018\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010\u0001\u001a\u0006\b±\u0001\u0010\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R#\u0010¸\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090'0&8\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010\u0001R\u001b\u0010»\u0001\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001b\u0010¾\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R.\u0010Ä\u0001\u001a\u0004\u0018\u0001092\t\u0010¿\u0001\u001a\u0004\u0018\u0001098\u0006@BX\u000e¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R$\u0010Ç\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00120Å\u00010&8\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010\u0001R2\u0010Ê\u0001\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020J0È\u0001\u0018\u00010'0&8\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010\u0001R%\u0010Ì\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0&8\u0002X\u0004¢\u0006\b\n\u0006\bË\u0001\u0010\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Í\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R\u001b\u0010×\u0001\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001d\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0&8\u0002X\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010\u0001R#\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020\u001d0\u00018\u0006¢\u0006\u0010\n\u0006\bÚ\u0001\u0010\u0001\u001a\u0006\bÛ\u0001\u0010\u0001R$\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030Ý\u00010Ü\u00018\u0006¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001e\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030ä\u00010ã\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bH\u0010å\u0001R#\u0010ë\u0001\u001a\n\u0012\u0005\u0012\u00030ä\u00010ç\u00018\u0006¢\u0006\u000f\n\u0005\bA\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R\u0017\u0010ì\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bP\u0010\u0001R1\u0010í\u0001\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u000209 \u0001*\n\u0012\u0004\u0012\u000209\u0018\u00010'0'0&8\u0002X\u0004¢\u0006\u0007\n\u0005\bL\u0010\u0001R(\u0010ï\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002090'0\u00018\u0006¢\u0006\u000f\n\u0005\b\u0015\u0010\u0001\u001a\u0006\bî\u0001\u0010\u0001R(\u0010ñ\u0001\u001a\u00020\u001d2\u0007\u0010¿\u0001\u001a\u00020\u001d8\u0006@BX\u000e¢\u0006\u000e\n\u0005\bN\u0010Þ\u0001\u001a\u0005\bð\u0001\u0010\u001fR\u001a\u0010\u001a\u001a\t\u0012\u0004\u0012\u00020\u00190\u00018F¢\u0006\b\u001a\u0006\bò\u0001\u0010\u0001R\u001b\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020J0\u00018F¢\u0006\b\u001a\u0006\bó\u0001\u0010\u0001R#\u0010ö\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0\u00018F¢\u0006\b\u001a\u0006\bõ\u0001\u0010\u0001R#\u0010ø\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0\u00018F¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u0001R#\u0010ú\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0\u00018F¢\u0006\b\u001a\u0006\bù\u0001\u0010\u0001R\u001d\u0010ü\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010F0\u00018F¢\u0006\b\u001a\u0006\bû\u0001\u0010\u0001R\u001b\u0010þ\u0001\u001a\t\u0012\u0004\u0012\u0002090\u00018F¢\u0006\b\u001a\u0006\bý\u0001\u0010\u0001R!\u0010\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0'0\u00018F¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u0001R!\u0010\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002090'0\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R\"\u0010\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00120Å\u00010\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R0\u0010\u0002\u001a\u001e\u0012\u0019\u0012\u0017\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020J0È\u0001\u0018\u00010'0\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R#\u0010\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010'0\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R\u001a\u0010a\u001a\t\u0012\u0004\u0012\u00020\u001d0\u00018F¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001¨\u0006\u0002"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/Z;", "Landroidx/lifecycle/f0;", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "catalogRepository", "Lcom/sugarcube/app/base/data/source/QuickFilterRepository;", "quickFilterRepository", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "addToShoppingListUseCase", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "fetchShoppingListItemsUseCase", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "configRepository", "LOE/q;", "sugarcube", "Lcom/sugarcube/app/base/external/config/a;", "config", "<init>", "(Lcom/sugarcube/app/base/data/source/CatalogRepository;Lcom/sugarcube/app/base/data/source/QuickFilterRepository;Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;Lcom/sugarcube/app/base/data/feature/ConfigRepository;LOE/q;Lcom/sugarcube/app/base/external/config/a;)V", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LXH/N;", "C0", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)V", "s0", "()V", "Lcom/sugarcube/decorate/v1/internal/catalog/Z$c;", "viewMode", "D1", "(Lcom/sugarcube/decorate/v1/internal/catalog/Z$c;)V", "", "r1", "()Z", "u0", "v1", "w1", "y1", "x1", "u1", "Landroidx/lifecycle/K;", "", "targetList", "Lkotlin/Function1;", "LdI/e;", "Lcom/sugarcube/app/base/data/Result;", "", "stepFunction", "t1", "(Landroidx/lifecycle/K;LnI/l;)V", "list", "results", "p0", "(Landroidx/lifecycle/K;Ljava/util/List;)V", "C1", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "v0", "(Lcom/sugarcube/core/network/models/RoomType;)V", "", "searchTerm", "isFilter", "Lcom/sugarcube/app/base/data/analytics/SearchType;", "searchType", "w0", "(Ljava/lang/String;ZLcom/sugarcube/app/base/data/analytics/SearchType;)V", "swapItem", "z0", "category", "subCategory", "g1", "(Lcom/sugarcube/app/base/data/analytics/SearchType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/sugarcube/core/network/models/CatalogCategory;", "subcategory", "y0", "(Lcom/sugarcube/core/network/models/CatalogCategory;)V", "", "itemId", "B0", "(I)V", "D0", "itemIds", "A0", "(Ljava/util/List;)V", "l1", "s1", "q1", "m1", "isFiltered", "k1", "(Z)V", "searchQuery", "e1", "(Ljava/lang/String;)V", "Lcom/sugarcube/decorate/v1/internal/catalog/Z$d;", "params", "p1", "(Lcom/sugarcube/decorate/v1/internal/catalog/Z$d;)V", "A1", "isScrolling", "n1", "q0", "r0", "h1", "i1", "j1", "b1", "d1", "Lx4/o;", "navController", "o0", "(Lx4/o;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)Z", "c1", "t0", "items", "errorMessage", "f1", "(Ljava/util/List;Ljava/lang/String;)V", "m", "Lcom/sugarcube/app/base/data/source/CatalogRepository;", "n", "Lcom/sugarcube/app/base/data/source/QuickFilterRepository;", "o", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "p", "Lcom/sugarcube/app/base/external/shoppinglist/FetchShoppingListItemsUseCase;", "q", "Lcom/sugarcube/app/base/data/feature/ConfigRepository;", "r", "LOE/q;", "X0", "()LOE/q;", "s", "Landroidx/lifecycle/K;", "_closeDrawer", "Landroidx/lifecycle/F;", "t", "Landroidx/lifecycle/F;", "M0", "()Landroidx/lifecycle/F;", "closeDrawer", "LbK/a;", "u", "LbK/a;", "defaultItemsMutex", "v", "filteredItemsMutex", "w", "subcategoryItemsMutex", "x", "productInfoMutex", "y", "cartMutex", "z", "variantMutex", "kotlin.jvm.PlatformType", "A", "_viewMode", "B", "_catalogTitleRes", "C", "_defaultCatalogItems", "D", "_filteredCatalogItems", "E", "_subcategoryCatalogItems", "Lcom/sugarcube/core/network/models/QuickFilter;", "F", "R0", "quickFilters", "G", "_activeCategory", "H", "activeSubcategory", "I", "_searchResultsTitle", "J", "_categories", "K", "V0", "subcategories", "Lcom/sugarcube/app/base/network/AutocompleteClient;", "L", "Lcom/sugarcube/app/base/network/AutocompleteClient;", "autocompleteClient", "M", "_autocompleteSuggestions", "N", "Lcom/sugarcube/core/network/models/RoomType;", "activeRoomType", "O", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "activeSwapItem", "value", "P", "Ljava/lang/String;", "H0", "()Ljava/lang/String;", "activeSearchTerm", "Lcom/sugarcube/app/base/data/Loadable;", "Q", "_activeProductInfoItem", "LXH/v;", "R", "_activeCartList", "S", "_variantList", "LZF/a;", "T", "LZF/a;", "S0", "()LZF/a;", "o1", "(LZF/a;)V", "reporter", "U", "Lcom/sugarcube/decorate/v1/internal/catalog/Z$d;", "roomParams", "X", "_isScrolling", "Y", "isLoading", "LU0/r0;", "LiF/X;", "Z", "LU0/r0;", "T0", "()LU0/r0;", "searchBarUiState", "LTJ/B;", "Lcom/sugarcube/decorate/v1/internal/catalog/W;", "LTJ/B;", "_catalogUIState", "LTJ/P;", "LTJ/P;", "K0", "()LTJ/P;", "catalogUIState", "pagingMutex", "_favoriteListLiveData", "O0", "favoriteListLiveData", "P0", "favoritesEnabled", "Z0", "J0", "catalogTitleRes", "N0", "defaultCatalogItems", "Q0", "filteredCatalogItems", "W0", "subcategoryCatalogItems", "F0", "activeCategory", "U0", "searchResultsTitle", "L0", "categories", "I0", "autocompleteSuggestions", "G0", "activeProductInfoItem", "E0", "activeCartList", "Y0", "variantList", "a1", "c", "d", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Z extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final K<c> f141522A = new K<>(c.BROWSE);

    /* renamed from: A0  reason: collision with root package name */
    private final C17052a f141523A0;

    /* renamed from: B  reason: collision with root package name */
    private final K<Integer> f141524B = new K<>();
    /* access modifiers changed from: private */

    /* renamed from: B0  reason: collision with root package name */
    public final K<List<String>> f141525B0;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final K<List<CachedCatalogItem>> f141526C = new K<>();

    /* renamed from: C0  reason: collision with root package name */
    private final F<List<String>> f141527C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final K<List<CachedCatalogItem>> f141528D = new K<>();
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public boolean f141529D0;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final K<List<CachedCatalogItem>> f141530E = new K<>();

    /* renamed from: F  reason: collision with root package name */
    private final F<List<QuickFilter>> f141531F;

    /* renamed from: G  reason: collision with root package name */
    private final K<CatalogCategory> f141532G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public K<CatalogCategory> f141533H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final K<String> f141534I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final K<List<CatalogCategory>> f141535J;

    /* renamed from: K  reason: collision with root package name */
    private final F<List<CatalogCategory>> f141536K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public final AutocompleteClient f141537L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public final K<List<String>> f141538M;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public RoomType f141539N;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public CachedCatalogItem f141540O;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public String f141541P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public final K<Loadable<CachedCatalogItem>> f141542Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public final K<List<XH.v<CachedCatalogItem, Integer>>> f141543R;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public final K<List<CachedCatalogItem>> f141544S;

    /* renamed from: T  reason: collision with root package name */
    private C16942a f141545T;

    /* renamed from: U  reason: collision with root package name */
    private d f141546U;

    /* renamed from: X  reason: collision with root package name */
    private final K<Boolean> f141547X;

    /* renamed from: Y  reason: collision with root package name */
    private final F<Boolean> f141548Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C4899r0<X> f141549Z;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final CatalogRepository f141550m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final QuickFilterRepository f141551n;

    /* renamed from: o  reason: collision with root package name */
    private final AddToShoppingListUseCase f141552o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final FetchShoppingListItemsUseCase f141553p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final ConfigRepository f141554q;

    /* renamed from: r  reason: collision with root package name */
    private final OE.q f141555r;

    /* renamed from: s  reason: collision with root package name */
    private final K<Boolean> f141556s;

    /* renamed from: t  reason: collision with root package name */
    private final F<Boolean> f141557t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C17052a f141558u = bK.g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C17052a f141559v = bK.g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C17052a f141560w = bK.g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C17052a f141561x = bK.g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C17052a f141562y = bK.g.b(false, 1, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: y0  reason: collision with root package name */
    public final C16505B<W> f141563y0;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C17052a f141564z = bK.g.b(false, 1, (Object) null);

    /* renamed from: z0  reason: collision with root package name */
    private final C16519P<W> f141565z0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$1", f = "CatalogViewModelV2.kt", l = {177}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141566c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141567d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.decorate.v1.internal.catalog.Z$a$a  reason: collision with other inner class name */
        static final class C3465a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Z f141568a;

            C3465a(Z z10) {
                this.f141568a = z10;
            }

            /* renamed from: c */
            public final Object emit(List<String> list, C17164e<? super C16807N> eVar) {
                this.f141568a.f141525B0.setValue(list);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Z z10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f141567d = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f141567d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141566c;
            if (i10 == 0) {
                XH.y.b(obj);
                C16532g<List<String>> invoke = this.f141567d.f141553p.invoke();
                C3465a aVar = new C3465a(this.f141567d);
                this.f141566c = 1;
                if (invoke.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$2", f = "CatalogViewModelV2.kt", l = {183}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141569c;

        /* renamed from: d  reason: collision with root package name */
        int f141570d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Z f141571e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Z z10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f141571e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f141571e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Z z10;
            Object f10 = C17187b.f();
            int i10 = this.f141570d;
            if (i10 == 0) {
                XH.y.b(obj);
                Z z11 = this.f141571e;
                ConfigRepository I10 = z11.f141554q;
                FeatureFlags.EnableFavorites enableFavorites = FeatureFlags.EnableFavorites.INSTANCE;
                this.f141569c = z11;
                this.f141570d = 1;
                Object obj2 = I10.get(enableFavorites, this);
                if (obj2 == f10) {
                    return f10;
                }
                z10 = z11;
                obj = obj2;
            } else if (i10 == 1) {
                z10 = (Z) this.f141569c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10.f141529D0 = ((Boolean) obj).booleanValue();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/Z$c;", "", "<init>", "(Ljava/lang/String;I)V", "BROWSE", "CATEGORIES", "FILTER", "SEARCH", "SWAP", "RESULTS", "PRODUCT_INFO", "CART", "PRODUCT_RECOMMENDATIONS", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        BROWSE,
        CATEGORIES,
        FILTER,
        SEARCH,
        SWAP,
        RESULTS,
        PRODUCT_INFO,
        CART,
        PRODUCT_RECOMMENDATIONS;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/catalog/Z$d;", "", "", "name", "Ljava/util/UUID;", "uuid", "", "isStock", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "roomSource", "<init>", "(Ljava/lang/String;Ljava/util/UUID;ZLcom/sugarcube/app/base/data/analytics/RoomSource;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/UUID;", "c", "()Ljava/util/UUID;", "Z", "()Z", "d", "Lcom/sugarcube/app/base/data/analytics/RoomSource;", "()Lcom/sugarcube/app/base/data/analytics/RoomSource;", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f141572a;

        /* renamed from: b  reason: collision with root package name */
        private final UUID f141573b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f141574c;

        /* renamed from: d  reason: collision with root package name */
        private final RoomSource f141575d;

        public d(String str, UUID uuid, boolean z10, RoomSource roomSource) {
            C17542s.j(str, "name");
            C17542s.j(uuid, "uuid");
            C17542s.j(roomSource, "roomSource");
            this.f141572a = str;
            this.f141573b = uuid;
            this.f141574c = z10;
            this.f141575d = roomSource;
        }

        public final String a() {
            return this.f141572a;
        }

        public final RoomSource b() {
            return this.f141575d;
        }

        public final UUID c() {
            return this.f141573b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f141572a, dVar.f141572a) && C17542s.e(this.f141573b, dVar.f141573b) && this.f141574c == dVar.f141574c && this.f141575d == dVar.f141575d;
        }

        public int hashCode() {
            return (((((this.f141572a.hashCode() * 31) + this.f141573b.hashCode()) * 31) + Boolean.hashCode(this.f141574c)) * 31) + this.f141575d.hashCode();
        }

        public String toString() {
            String str = this.f141572a;
            UUID uuid = this.f141573b;
            boolean z10 = this.f141574c;
            RoomSource roomSource = this.f141575d;
            return "RoomParameters(name=" + str + ", uuid=" + uuid + ", isStock=" + z10 + ", roomSource=" + roomSource + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f141576a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.sugarcube.decorate.v1.internal.catalog.Z$c[] r0 = com.sugarcube.decorate.v1.internal.catalog.Z.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.BROWSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.FILTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SEARCH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SWAP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.RESULTS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.PRODUCT_INFO     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CART     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.PRODUCT_RECOMMENDATIONS     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f141576a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.e.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$clearProductVariants$1", f = "CatalogViewModelV2.kt", l = {873}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141577c;

        /* renamed from: d  reason: collision with root package name */
        Object f141578d;

        /* renamed from: e  reason: collision with root package name */
        int f141579e;

        /* renamed from: f  reason: collision with root package name */
        int f141580f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Z f141581g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Z z10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f141581g = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f141581g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX INFO: finally extract failed */
        public final Object invokeSuspend(Object obj) {
            C17052a aVar;
            Z z10;
            Object f10 = C17187b.f();
            int i10 = this.f141580f;
            if (i10 == 0) {
                XH.y.b(obj);
                aVar = this.f141581g.f141564z;
                Z z11 = this.f141581g;
                this.f141577c = aVar;
                this.f141578d = z11;
                this.f141579e = 0;
                this.f141580f = 1;
                if (aVar.e((Object) null, this) == f10) {
                    return f10;
                }
                z10 = z11;
            } else if (i10 == 1) {
                z10 = (Z) this.f141578d;
                aVar = (C17052a) this.f141577c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                z10.f141544S.postValue(null);
                C16807N n10 = C16807N.f139792a;
                aVar.d((Object) null);
                return C16807N.f139792a;
            } catch (Throwable th2) {
                aVar.d((Object) null);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchCatalogItemsForRoomType$1", f = "CatalogViewModelV2.kt", l = {873, 202}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141582c;

        /* renamed from: d  reason: collision with root package name */
        Object f141583d;

        /* renamed from: e  reason: collision with root package name */
        Object f141584e;

        /* renamed from: f  reason: collision with root package name */
        int f141585f;

        /* renamed from: g  reason: collision with root package name */
        int f141586g;

        /* renamed from: h  reason: collision with root package name */
        int f141587h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Z f141588i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ RoomType f141589j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Z z10, RoomType roomType, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f141588i = z10;
            this.f141589j = roomType;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f141588i, this.f141589j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c9 A[Catch:{ all -> 0x0025 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00e8 A[Catch:{ all -> 0x0025 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f141587h
                r3 = 0
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0048
                if (r2 == r5) goto L_0x0030
                if (r2 != r4) goto L_0x0028
                java.lang.Object r0 = r1.f141584e
                com.sugarcube.core.network.models.RoomType r0 = (com.sugarcube.core.network.models.RoomType) r0
                java.lang.Object r0 = r1.f141583d
                com.sugarcube.decorate.v1.internal.catalog.Z r0 = (com.sugarcube.decorate.v1.internal.catalog.Z) r0
                java.lang.Object r2 = r1.f141582c
                bK.a r2 = (bK.C17052a) r2
                XH.y.b(r18)     // Catch:{ all -> 0x0025 }
                r3 = r18
                goto L_0x00c3
            L_0x0025:
                r0 = move-exception
                goto L_0x0128
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0030:
                int r2 = r1.f141585f
                java.lang.Object r5 = r1.f141584e
                com.sugarcube.core.network.models.RoomType r5 = (com.sugarcube.core.network.models.RoomType) r5
                java.lang.Object r7 = r1.f141583d
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = (com.sugarcube.decorate.v1.internal.catalog.Z) r7
                java.lang.Object r8 = r1.f141582c
                bK.a r8 = (bK.C17052a) r8
                XH.y.b(r18)
                r16 = r5
                r5 = r2
                r2 = r8
                r8 = r16
                goto L_0x00ab
            L_0x0048:
                XH.y.b(r18)
                java.lang.String r2 = "Sugarcube"
                java.lang.String r7 = "CatalogViewModelV2::fetchCatalogItemsForRoomType"
                android.util.Log.d(r2, r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141588i
                TJ.B r2 = r2.f141563y0
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141588i
                TJ.B r7 = r7.f141563y0
                java.lang.Object r7 = r7.getValue()
                r8 = r7
                com.sugarcube.decorate.v1.internal.catalog.W r8 = (com.sugarcube.decorate.v1.internal.catalog.W) r8
                r14 = 29
                r15 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 0
                r13 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = com.sugarcube.decorate.v1.internal.catalog.W.b(r8, r9, r10, r11, r12, r13, r14, r15)
                r2.setValue(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141588i
                androidx.lifecycle.K r2 = r2.f141526C
                java.util.List r7 = YH.C16877v.n()
                r2.postValue(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141588i
                com.sugarcube.core.network.models.RoomType r7 = r1.f141589j
                r2.f141539N = r7
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141588i
                com.sugarcube.decorate.v1.internal.catalog.Z$c r7 = com.sugarcube.decorate.v1.internal.catalog.Z.c.BROWSE
                r2.D1(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141588i
                bK.a r2 = r2.f141558u
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141588i
                com.sugarcube.core.network.models.RoomType r8 = r1.f141589j
                r1.f141582c = r2
                r1.f141583d = r7
                r1.f141584e = r8
                r1.f141585f = r3
                r1.f141587h = r5
                java.lang.Object r5 = r2.e(r6, r1)
                if (r5 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                r5 = r3
            L_0x00ab:
                com.sugarcube.app.base.data.source.CatalogRepository r9 = r7.f141550m     // Catch:{ all -> 0x0025 }
                r1.f141582c = r2     // Catch:{ all -> 0x0025 }
                r1.f141583d = r7     // Catch:{ all -> 0x0025 }
                r1.f141584e = r8     // Catch:{ all -> 0x0025 }
                r1.f141585f = r5     // Catch:{ all -> 0x0025 }
                r1.f141586g = r3     // Catch:{ all -> 0x0025 }
                r1.f141587h = r4     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r9.fetchCatalogItems((com.sugarcube.core.network.models.RoomType) r8, (dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>) r1)     // Catch:{ all -> 0x0025 }
                if (r3 != r0) goto L_0x00c2
                return r0
            L_0x00c2:
                r0 = r7
            L_0x00c3:
                com.sugarcube.app.base.data.Result r3 = (com.sugarcube.app.base.data.Result) r3     // Catch:{ all -> 0x0025 }
                boolean r4 = r3 instanceof com.sugarcube.app.base.data.Result.Error     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x00e8
                TJ.B r3 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r7 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = (com.sugarcube.decorate.v1.internal.catalog.W) r7     // Catch:{ all -> 0x0025 }
                r13 = 21
                r14 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 1
                r12 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0025 }
                r3.setValue(r0)     // Catch:{ all -> 0x0025 }
                goto L_0x011a
            L_0x00e8:
                boolean r4 = r3 instanceof com.sugarcube.app.base.data.Result.Success     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0122
                r0.C1()     // Catch:{ all -> 0x0025 }
                androidx.lifecycle.K r4 = r0.f141526C     // Catch:{ all -> 0x0025 }
                com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r3.getData()     // Catch:{ all -> 0x0025 }
                r4.postValue(r3)     // Catch:{ all -> 0x0025 }
                TJ.B r3 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r7 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = (com.sugarcube.decorate.v1.internal.catalog.W) r7     // Catch:{ all -> 0x0025 }
                r13 = 29
                r14 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0025 }
                r3.setValue(r0)     // Catch:{ all -> 0x0025 }
            L_0x011a:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0025 }
                r2.d(r6)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0122:
                XH.t r0 = new XH.t     // Catch:{ all -> 0x0025 }
                r0.<init>()     // Catch:{ all -> 0x0025 }
                throw r0     // Catch:{ all -> 0x0025 }
            L_0x0128:
                r2.d(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchCatalogItemsForSearchTerm$1", f = "CatalogViewModelV2.kt", l = {874, 244}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141590c;

        /* renamed from: d  reason: collision with root package name */
        Object f141591d;

        /* renamed from: e  reason: collision with root package name */
        Object f141592e;

        /* renamed from: f  reason: collision with root package name */
        Object f141593f;

        /* renamed from: g  reason: collision with root package name */
        Object f141594g;

        /* renamed from: h  reason: collision with root package name */
        int f141595h;

        /* renamed from: i  reason: collision with root package name */
        int f141596i;

        /* renamed from: j  reason: collision with root package name */
        int f141597j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f141598k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Z f141599l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f141600m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ SearchType f141601n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, Z z10, boolean z11, SearchType searchType, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f141598k = str;
            this.f141599l = z10;
            this.f141600m = z11;
            this.f141601n = searchType;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f141598k, this.f141599l, this.f141600m, this.f141601n, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x010a A[Catch:{ all -> 0x0029 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0129 A[Catch:{ all -> 0x0029 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f141597j
                r2 = 2
                r3 = 0
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0051
                if (r1 == r4) goto L_0x0034
                if (r1 != r2) goto L_0x002c
                java.lang.Object r0 = r14.f141594g
                com.sugarcube.app.base.data.analytics.SearchType r0 = (com.sugarcube.app.base.data.analytics.SearchType) r0
                java.lang.Object r1 = r14.f141593f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r14.f141592e
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = (com.sugarcube.decorate.v1.internal.catalog.Z) r2
                java.lang.Object r3 = r14.f141591d
                bK.a r3 = (bK.C17052a) r3
                java.lang.Object r4 = r14.f141590c
                com.sugarcube.decorate.v1.internal.catalog.Z$c r4 = (com.sugarcube.decorate.v1.internal.catalog.Z.c) r4
                XH.y.b(r15)     // Catch:{ all -> 0x0029 }
                goto L_0x0104
            L_0x0029:
                r15 = move-exception
                goto L_0x0187
            L_0x002c:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0034:
                int r1 = r14.f141595h
                java.lang.Object r4 = r14.f141594g
                com.sugarcube.app.base.data.analytics.SearchType r4 = (com.sugarcube.app.base.data.analytics.SearchType) r4
                java.lang.Object r6 = r14.f141593f
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r14.f141592e
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = (com.sugarcube.decorate.v1.internal.catalog.Z) r7
                java.lang.Object r8 = r14.f141591d
                bK.a r8 = (bK.C17052a) r8
                java.lang.Object r9 = r14.f141590c
                com.sugarcube.decorate.v1.internal.catalog.Z$c r9 = (com.sugarcube.decorate.v1.internal.catalog.Z.c) r9
                XH.y.b(r15)
                r15 = r1
            L_0x004e:
                r1 = r6
                goto L_0x00e6
            L_0x0051:
                XH.y.b(r15)
                java.lang.String r15 = r14.f141598k
                if (r15 == 0) goto L_0x018b
                int r15 = r15.length()
                if (r15 != 0) goto L_0x0060
                goto L_0x018b
            L_0x0060:
                java.lang.String r15 = "Sugarcube"
                java.lang.String r1 = "CatalogViewModelV2::fetchCatalogItemsForSearchTerm"
                android.util.Log.d(r15, r1)
                com.sugarcube.decorate.v1.internal.catalog.Z r15 = r14.f141599l
                java.lang.String r1 = r14.f141598k
                r15.f141541P = r1
                com.sugarcube.decorate.v1.internal.catalog.Z r15 = r14.f141599l
                TJ.B r15 = r15.f141563y0
                com.sugarcube.decorate.v1.internal.catalog.Z r1 = r14.f141599l
                TJ.B r1 = r1.f141563y0
                java.lang.Object r1 = r1.getValue()
                r6 = r1
                com.sugarcube.decorate.v1.internal.catalog.W r6 = (com.sugarcube.decorate.v1.internal.catalog.W) r6
                r12 = 13
                r13 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r1 = com.sugarcube.decorate.v1.internal.catalog.W.b(r6, r7, r8, r9, r10, r11, r12, r13)
                r15.setValue(r1)
                com.sugarcube.decorate.v1.internal.catalog.Z r15 = r14.f141599l
                androidx.lifecycle.K r15 = r15.f141534I
                java.lang.String r1 = r14.f141598k
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "\""
                r6.append(r7)
                r6.append(r1)
                r6.append(r7)
                java.lang.String r1 = r6.toString()
                r15.postValue(r1)
                boolean r15 = r14.f141600m
                if (r15 == 0) goto L_0x00b7
                com.sugarcube.decorate.v1.internal.catalog.Z$c r15 = com.sugarcube.decorate.v1.internal.catalog.Z.c.FILTER
            L_0x00b5:
                r9 = r15
                goto L_0x00ba
            L_0x00b7:
                com.sugarcube.decorate.v1.internal.catalog.Z$c r15 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SEARCH
                goto L_0x00b5
            L_0x00ba:
                com.sugarcube.decorate.v1.internal.catalog.Z r15 = r14.f141599l
                r15.D1(r9)
                com.sugarcube.decorate.v1.internal.catalog.Z r15 = r14.f141599l
                bK.a r15 = r15.f141559v
                com.sugarcube.decorate.v1.internal.catalog.Z r1 = r14.f141599l
                java.lang.String r6 = r14.f141598k
                com.sugarcube.app.base.data.analytics.SearchType r7 = r14.f141601n
                r14.f141590c = r9
                r14.f141591d = r15
                r14.f141592e = r1
                r14.f141593f = r6
                r14.f141594g = r7
                r14.f141595h = r3
                r14.f141597j = r4
                java.lang.Object r4 = r15.e(r5, r14)
                if (r4 != r0) goto L_0x00e0
                return r0
            L_0x00e0:
                r8 = r15
                r15 = r3
                r4 = r7
                r7 = r1
                goto L_0x004e
            L_0x00e6:
                com.sugarcube.app.base.data.source.CatalogRepository r6 = r7.f141550m     // Catch:{ all -> 0x0185 }
                r14.f141590c = r9     // Catch:{ all -> 0x0185 }
                r14.f141591d = r8     // Catch:{ all -> 0x0185 }
                r14.f141592e = r7     // Catch:{ all -> 0x0185 }
                r14.f141593f = r1     // Catch:{ all -> 0x0185 }
                r14.f141594g = r4     // Catch:{ all -> 0x0185 }
                r14.f141595h = r15     // Catch:{ all -> 0x0185 }
                r14.f141596i = r3     // Catch:{ all -> 0x0185 }
                r14.f141597j = r2     // Catch:{ all -> 0x0185 }
                java.lang.Object r15 = r6.fetchCatalogItems((java.lang.String) r1, (dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>) r14)     // Catch:{ all -> 0x0185 }
                if (r15 != r0) goto L_0x0101
                return r0
            L_0x0101:
                r0 = r4
                r2 = r7
                r3 = r8
            L_0x0104:
                com.sugarcube.app.base.data.Result r15 = (com.sugarcube.app.base.data.Result) r15     // Catch:{ all -> 0x0029 }
                boolean r4 = r15 instanceof com.sugarcube.app.base.data.Result.Error     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0129
                TJ.B r15 = r2.f141563y0     // Catch:{ all -> 0x0029 }
                TJ.B r0 = r2.f141563y0     // Catch:{ all -> 0x0029 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0029 }
                r6 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r6 = (com.sugarcube.decorate.v1.internal.catalog.W) r6     // Catch:{ all -> 0x0029 }
                r12 = 21
                r13 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0029 }
                r15.setValue(r0)     // Catch:{ all -> 0x0029 }
                goto L_0x0177
            L_0x0129:
                boolean r4 = r15 instanceof com.sugarcube.app.base.data.Result.Success     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x017f
                r2.C1()     // Catch:{ all -> 0x0029 }
                androidx.lifecycle.K r4 = r2.f141528D     // Catch:{ all -> 0x0029 }
                java.util.List r6 = YH.C16877v.n()     // Catch:{ all -> 0x0029 }
                r4.postValue(r6)     // Catch:{ all -> 0x0029 }
                androidx.lifecycle.K r4 = r2.f141528D     // Catch:{ all -> 0x0029 }
                r6 = r15
                com.sugarcube.app.base.data.Result$Success r6 = (com.sugarcube.app.base.data.Result.Success) r6     // Catch:{ all -> 0x0029 }
                java.lang.Object r6 = r6.getData()     // Catch:{ all -> 0x0029 }
                r4.postValue(r6)     // Catch:{ all -> 0x0029 }
                if (r0 == 0) goto L_0x014e
                r2.g1(r0, r1, r5, r5)     // Catch:{ all -> 0x0029 }
            L_0x014e:
                TJ.B r0 = r2.f141563y0     // Catch:{ all -> 0x0029 }
                TJ.B r1 = r2.f141563y0     // Catch:{ all -> 0x0029 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0029 }
                r6 = r1
                com.sugarcube.decorate.v1.internal.catalog.W r6 = (com.sugarcube.decorate.v1.internal.catalog.W) r6     // Catch:{ all -> 0x0029 }
                com.sugarcube.app.base.data.Result$Success r15 = (com.sugarcube.app.base.data.Result.Success) r15     // Catch:{ all -> 0x0029 }
                java.lang.Object r15 = r15.getData()     // Catch:{ all -> 0x0029 }
                java.util.List r15 = (java.util.List) r15     // Catch:{ all -> 0x0029 }
                boolean r11 = r15.isEmpty()     // Catch:{ all -> 0x0029 }
                r12 = 13
                r13 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r15 = com.sugarcube.decorate.v1.internal.catalog.W.b(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0029 }
                r0.setValue(r15)     // Catch:{ all -> 0x0029 }
            L_0x0177:
                XH.N r15 = XH.C16807N.f139792a     // Catch:{ all -> 0x0029 }
                r3.d(r5)
                XH.N r15 = XH.C16807N.f139792a
                return r15
            L_0x017f:
                XH.t r15 = new XH.t     // Catch:{ all -> 0x0029 }
                r15.<init>()     // Catch:{ all -> 0x0029 }
                throw r15     // Catch:{ all -> 0x0029 }
            L_0x0185:
                r15 = move-exception
                r3 = r8
            L_0x0187:
                r3.d(r5)
                throw r15
            L_0x018b:
                com.sugarcube.decorate.v1.internal.catalog.Z r15 = r14.f141599l
                com.sugarcube.core.network.models.RoomType r15 = r15.f141539N
                if (r15 == 0) goto L_0x0198
                com.sugarcube.decorate.v1.internal.catalog.Z r0 = r14.f141599l
                r0.v0(r15)
            L_0x0198:
                XH.N r15 = XH.C16807N.f139792a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchCatalogItemsForSubcategory$1", f = "CatalogViewModelV2.kt", l = {874, 352}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141602c;

        /* renamed from: d  reason: collision with root package name */
        Object f141603d;

        /* renamed from: e  reason: collision with root package name */
        Object f141604e;

        /* renamed from: f  reason: collision with root package name */
        int f141605f;

        /* renamed from: g  reason: collision with root package name */
        int f141606g;

        /* renamed from: h  reason: collision with root package name */
        int f141607h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Z f141608i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ CatalogCategory f141609j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(Z z10, CatalogCategory catalogCategory, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f141608i = z10;
            this.f141609j = catalogCategory;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f141608i, this.f141609j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00d1 A[Catch:{ all -> 0x0025 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00f0 A[Catch:{ all -> 0x0025 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f141607h
                r3 = 0
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0048
                if (r2 == r5) goto L_0x0030
                if (r2 != r4) goto L_0x0028
                java.lang.Object r0 = r1.f141604e
                com.sugarcube.core.network.models.CatalogCategory r0 = (com.sugarcube.core.network.models.CatalogCategory) r0
                java.lang.Object r0 = r1.f141603d
                com.sugarcube.decorate.v1.internal.catalog.Z r0 = (com.sugarcube.decorate.v1.internal.catalog.Z) r0
                java.lang.Object r2 = r1.f141602c
                bK.a r2 = (bK.C17052a) r2
                XH.y.b(r18)     // Catch:{ all -> 0x0025 }
                r3 = r18
                goto L_0x00cb
            L_0x0025:
                r0 = move-exception
                goto L_0x013b
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0030:
                int r2 = r1.f141605f
                java.lang.Object r5 = r1.f141604e
                com.sugarcube.core.network.models.CatalogCategory r5 = (com.sugarcube.core.network.models.CatalogCategory) r5
                java.lang.Object r7 = r1.f141603d
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = (com.sugarcube.decorate.v1.internal.catalog.Z) r7
                java.lang.Object r8 = r1.f141602c
                bK.a r8 = (bK.C17052a) r8
                XH.y.b(r18)
                r16 = r5
                r5 = r2
                r2 = r8
                r8 = r16
                goto L_0x00b3
            L_0x0048:
                XH.y.b(r18)
                java.lang.String r2 = "Sugarcube"
                java.lang.String r7 = "CatalogViewModelV2::fetchCatalogItemsForSubcategory"
                android.util.Log.d(r2, r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141608i
                TJ.B r2 = r2.f141563y0
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141608i
                TJ.B r7 = r7.f141563y0
                java.lang.Object r7 = r7.getValue()
                r8 = r7
                com.sugarcube.decorate.v1.internal.catalog.W r8 = (com.sugarcube.decorate.v1.internal.catalog.W) r8
                r14 = 29
                r15 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 0
                r13 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = com.sugarcube.decorate.v1.internal.catalog.W.b(r8, r9, r10, r11, r12, r13, r14, r15)
                r2.setValue(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141608i
                androidx.lifecycle.K r2 = r2.f141533H
                com.sugarcube.core.network.models.CatalogCategory r7 = r1.f141609j
                r2.postValue(r7)
                com.sugarcube.core.network.models.CatalogCategory r2 = r1.f141609j
                java.lang.String r2 = r2.getName()
                if (r2 == 0) goto L_0x0090
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141608i
                androidx.lifecycle.K r7 = r7.f141534I
                r7.postValue(r2)
            L_0x0090:
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141608i
                com.sugarcube.decorate.v1.internal.catalog.Z$c r7 = com.sugarcube.decorate.v1.internal.catalog.Z.c.RESULTS
                r2.D1(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141608i
                bK.a r2 = r2.f141560w
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141608i
                com.sugarcube.core.network.models.CatalogCategory r8 = r1.f141609j
                r1.f141602c = r2
                r1.f141603d = r7
                r1.f141604e = r8
                r1.f141605f = r3
                r1.f141607h = r5
                java.lang.Object r5 = r2.e(r6, r1)
                if (r5 != r0) goto L_0x00b2
                return r0
            L_0x00b2:
                r5 = r3
            L_0x00b3:
                com.sugarcube.app.base.data.source.CatalogRepository r9 = r7.f141550m     // Catch:{ all -> 0x0025 }
                r1.f141602c = r2     // Catch:{ all -> 0x0025 }
                r1.f141603d = r7     // Catch:{ all -> 0x0025 }
                r1.f141604e = r8     // Catch:{ all -> 0x0025 }
                r1.f141605f = r5     // Catch:{ all -> 0x0025 }
                r1.f141606g = r3     // Catch:{ all -> 0x0025 }
                r1.f141607h = r4     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r9.fetchCatalogItems((com.sugarcube.core.network.models.CatalogCategory) r8, (dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>) r1)     // Catch:{ all -> 0x0025 }
                if (r3 != r0) goto L_0x00ca
                return r0
            L_0x00ca:
                r0 = r7
            L_0x00cb:
                com.sugarcube.app.base.data.Result r3 = (com.sugarcube.app.base.data.Result) r3     // Catch:{ all -> 0x0025 }
                boolean r4 = r3 instanceof com.sugarcube.app.base.data.Result.Error     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x00f0
                TJ.B r3 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r7 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = (com.sugarcube.decorate.v1.internal.catalog.W) r7     // Catch:{ all -> 0x0025 }
                r13 = 21
                r14 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 1
                r12 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0025 }
                r3.setValue(r0)     // Catch:{ all -> 0x0025 }
                goto L_0x012d
            L_0x00f0:
                boolean r4 = r3 instanceof com.sugarcube.app.base.data.Result.Success     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0135
                r0.C1()     // Catch:{ all -> 0x0025 }
                androidx.lifecycle.K r4 = r0.f141530E     // Catch:{ all -> 0x0025 }
                java.util.List r5 = YH.C16877v.n()     // Catch:{ all -> 0x0025 }
                r4.postValue(r5)     // Catch:{ all -> 0x0025 }
                androidx.lifecycle.K r4 = r0.f141530E     // Catch:{ all -> 0x0025 }
                com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r3.getData()     // Catch:{ all -> 0x0025 }
                r4.postValue(r3)     // Catch:{ all -> 0x0025 }
                TJ.B r3 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r7 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = (com.sugarcube.decorate.v1.internal.catalog.W) r7     // Catch:{ all -> 0x0025 }
                r13 = 29
                r14 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0025 }
                r3.setValue(r0)     // Catch:{ all -> 0x0025 }
            L_0x012d:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0025 }
                r2.d(r6)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0135:
                XH.t r0 = new XH.t     // Catch:{ all -> 0x0025 }
                r0.<init>()     // Catch:{ all -> 0x0025 }
                throw r0     // Catch:{ all -> 0x0025 }
            L_0x013b:
                r2.d(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchCatalogItemsForSwap$1", f = "CatalogViewModelV2.kt", l = {873, 287}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141610c;

        /* renamed from: d  reason: collision with root package name */
        Object f141611d;

        /* renamed from: e  reason: collision with root package name */
        Object f141612e;

        /* renamed from: f  reason: collision with root package name */
        int f141613f;

        /* renamed from: g  reason: collision with root package name */
        int f141614g;

        /* renamed from: h  reason: collision with root package name */
        int f141615h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Z f141616i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f141617j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(Z z10, CachedCatalogItem cachedCatalogItem, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f141616i = z10;
            this.f141617j = cachedCatalogItem;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f141616i, this.f141617j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c7 A[Catch:{ all -> 0x0025 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6 A[Catch:{ all -> 0x0025 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f141615h
                r3 = 0
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0048
                if (r2 == r5) goto L_0x0030
                if (r2 != r4) goto L_0x0028
                java.lang.Object r0 = r1.f141612e
                com.sugarcube.app.base.data.database.CachedCatalogItem r0 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r0
                java.lang.Object r0 = r1.f141611d
                com.sugarcube.decorate.v1.internal.catalog.Z r0 = (com.sugarcube.decorate.v1.internal.catalog.Z) r0
                java.lang.Object r2 = r1.f141610c
                bK.a r2 = (bK.C17052a) r2
                XH.y.b(r18)     // Catch:{ all -> 0x0025 }
                r3 = r18
                goto L_0x00c1
            L_0x0025:
                r0 = move-exception
                goto L_0x0126
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0030:
                int r2 = r1.f141613f
                java.lang.Object r5 = r1.f141612e
                com.sugarcube.app.base.data.database.CachedCatalogItem r5 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r5
                java.lang.Object r7 = r1.f141611d
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = (com.sugarcube.decorate.v1.internal.catalog.Z) r7
                java.lang.Object r8 = r1.f141610c
                bK.a r8 = (bK.C17052a) r8
                XH.y.b(r18)
                r16 = r5
                r5 = r2
                r2 = r8
                r8 = r16
                goto L_0x009e
            L_0x0048:
                XH.y.b(r18)
                java.lang.String r2 = "Sugarcube"
                java.lang.String r7 = "CatalogViewModelV2::fetchCatalogItemsForSwap"
                android.util.Log.d(r2, r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141616i
                TJ.B r2 = r2.f141563y0
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141616i
                TJ.B r7 = r7.f141563y0
                java.lang.Object r7 = r7.getValue()
                r8 = r7
                com.sugarcube.decorate.v1.internal.catalog.W r8 = (com.sugarcube.decorate.v1.internal.catalog.W) r8
                r14 = 29
                r15 = 0
                r9 = 0
                r10 = 1
                r11 = 0
                r12 = 0
                r13 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = com.sugarcube.decorate.v1.internal.catalog.W.b(r8, r9, r10, r11, r12, r13, r14, r15)
                r2.setValue(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141616i
                com.sugarcube.app.base.data.database.CachedCatalogItem r7 = r1.f141617j
                r2.f141540O = r7
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141616i
                com.sugarcube.decorate.v1.internal.catalog.Z$c r7 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SWAP
                r2.D1(r7)
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r1.f141616i
                bK.a r2 = r2.f141559v
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = r1.f141616i
                com.sugarcube.app.base.data.database.CachedCatalogItem r8 = r1.f141617j
                r1.f141610c = r2
                r1.f141611d = r7
                r1.f141612e = r8
                r1.f141613f = r3
                r1.f141615h = r5
                java.lang.Object r5 = r2.e(r6, r1)
                if (r5 != r0) goto L_0x009d
                return r0
            L_0x009d:
                r5 = r3
            L_0x009e:
                androidx.lifecycle.K r9 = r7.f141528D     // Catch:{ all -> 0x0025 }
                java.util.List r10 = YH.C16877v.n()     // Catch:{ all -> 0x0025 }
                r9.postValue(r10)     // Catch:{ all -> 0x0025 }
                com.sugarcube.app.base.data.source.CatalogRepository r9 = r7.f141550m     // Catch:{ all -> 0x0025 }
                r1.f141610c = r2     // Catch:{ all -> 0x0025 }
                r1.f141611d = r7     // Catch:{ all -> 0x0025 }
                r1.f141612e = r8     // Catch:{ all -> 0x0025 }
                r1.f141613f = r5     // Catch:{ all -> 0x0025 }
                r1.f141614g = r3     // Catch:{ all -> 0x0025 }
                r1.f141615h = r4     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r9.fetchCatalogItems((com.sugarcube.app.base.data.database.CachedCatalogItem) r8, (dI.C17164e<? super com.sugarcube.app.base.data.Result<? extends java.util.List<com.sugarcube.app.base.data.database.CachedCatalogItem>>>) r1)     // Catch:{ all -> 0x0025 }
                if (r3 != r0) goto L_0x00c0
                return r0
            L_0x00c0:
                r0 = r7
            L_0x00c1:
                com.sugarcube.app.base.data.Result r3 = (com.sugarcube.app.base.data.Result) r3     // Catch:{ all -> 0x0025 }
                boolean r4 = r3 instanceof com.sugarcube.app.base.data.Result.Error     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x00e6
                TJ.B r3 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r7 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = (com.sugarcube.decorate.v1.internal.catalog.W) r7     // Catch:{ all -> 0x0025 }
                r13 = 21
                r14 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 1
                r12 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0025 }
                r3.setValue(r0)     // Catch:{ all -> 0x0025 }
                goto L_0x0118
            L_0x00e6:
                boolean r4 = r3 instanceof com.sugarcube.app.base.data.Result.Success     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0120
                r0.C1()     // Catch:{ all -> 0x0025 }
                androidx.lifecycle.K r4 = r0.f141528D     // Catch:{ all -> 0x0025 }
                com.sugarcube.app.base.data.Result$Success r3 = (com.sugarcube.app.base.data.Result.Success) r3     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r3.getData()     // Catch:{ all -> 0x0025 }
                r4.postValue(r3)     // Catch:{ all -> 0x0025 }
                TJ.B r3 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                TJ.B r0 = r0.f141563y0     // Catch:{ all -> 0x0025 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0025 }
                r7 = r0
                com.sugarcube.decorate.v1.internal.catalog.W r7 = (com.sugarcube.decorate.v1.internal.catalog.W) r7     // Catch:{ all -> 0x0025 }
                r13 = 29
                r14 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                com.sugarcube.decorate.v1.internal.catalog.W r0 = com.sugarcube.decorate.v1.internal.catalog.W.b(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0025 }
                r3.setValue(r0)     // Catch:{ all -> 0x0025 }
            L_0x0118:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0025 }
                r2.d(r6)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0120:
                XH.t r0 = new XH.t     // Catch:{ all -> 0x0025 }
                r0.<init>()     // Catch:{ all -> 0x0025 }
                throw r0     // Catch:{ all -> 0x0025 }
            L_0x0126:
                r2.d(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchProductInformationForCart$1", f = "CatalogViewModelV2.kt", l = {873, 414}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141618c;

        /* renamed from: d  reason: collision with root package name */
        Object f141619d;

        /* renamed from: e  reason: collision with root package name */
        Object f141620e;

        /* renamed from: f  reason: collision with root package name */
        int f141621f;

        /* renamed from: g  reason: collision with root package name */
        int f141622g;

        /* renamed from: h  reason: collision with root package name */
        int f141623h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Z f141624i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List<Integer> f141625j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(Z z10, List<Integer> list, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f141624i = z10;
            this.f141625j = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f141624i, this.f141625j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x008a A[Catch:{ all -> 0x0020 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                r0 = 1
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r12.f141623h
                r3 = 2
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x003f
                if (r2 == r0) goto L_0x002b
                if (r2 != r3) goto L_0x0023
                java.lang.Object r1 = r12.f141620e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r12.f141619d
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = (com.sugarcube.decorate.v1.internal.catalog.Z) r2
                java.lang.Object r3 = r12.f141618c
                bK.a r3 = (bK.C17052a) r3
                XH.y.b(r13)     // Catch:{ all -> 0x0020 }
                goto L_0x0086
            L_0x0020:
                r13 = move-exception
                goto L_0x00f9
            L_0x0023:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x002b:
                int r2 = r12.f141621f
                java.lang.Object r6 = r12.f141620e
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r12.f141619d
                com.sugarcube.decorate.v1.internal.catalog.Z r7 = (com.sugarcube.decorate.v1.internal.catalog.Z) r7
                java.lang.Object r8 = r12.f141618c
                bK.a r8 = (bK.C17052a) r8
                XH.y.b(r13)
                r13 = r2
                r2 = r7
                goto L_0x006d
            L_0x003f:
                XH.y.b(r13)
                java.lang.String r13 = "Sugarcube"
                java.lang.String r2 = "CatalogViewModelV2::fetchProductInformationForCart"
                android.util.Log.d(r13, r2)
                com.sugarcube.decorate.v1.internal.catalog.Z r13 = r12.f141624i
                com.sugarcube.decorate.v1.internal.catalog.Z$c r2 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CART
                r13.D1(r2)
                com.sugarcube.decorate.v1.internal.catalog.Z r13 = r12.f141624i
                bK.a r13 = r13.f141562y
                com.sugarcube.decorate.v1.internal.catalog.Z r2 = r12.f141624i
                java.util.List<java.lang.Integer> r6 = r12.f141625j
                r12.f141618c = r13
                r12.f141619d = r2
                r12.f141620e = r6
                r12.f141621f = r4
                r12.f141623h = r0
                java.lang.Object r7 = r13.e(r5, r12)
                if (r7 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r8 = r13
                r13 = r4
            L_0x006d:
                com.sugarcube.app.base.data.source.CatalogRepository r7 = r2.f141550m     // Catch:{ all -> 0x00f7 }
                r12.f141618c = r8     // Catch:{ all -> 0x00f7 }
                r12.f141619d = r2     // Catch:{ all -> 0x00f7 }
                r12.f141620e = r6     // Catch:{ all -> 0x00f7 }
                r12.f141621f = r13     // Catch:{ all -> 0x00f7 }
                r12.f141622g = r4     // Catch:{ all -> 0x00f7 }
                r12.f141623h = r3     // Catch:{ all -> 0x00f7 }
                java.lang.Object r13 = r7.fetchProductInformation(r6, r12)     // Catch:{ all -> 0x00f7 }
                if (r13 != r1) goto L_0x0084
                return r1
            L_0x0084:
                r1 = r6
                r3 = r8
            L_0x0086:
                java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0020 }
                if (r13 == 0) goto L_0x00ef
                java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x0020 }
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0020 }
                r7 = 10
                int r7 = YH.C16877v.y(r13, r7)     // Catch:{ all -> 0x0020 }
                r6.<init>(r7)     // Catch:{ all -> 0x0020 }
                java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0020 }
            L_0x009b:
                boolean r7 = r13.hasNext()     // Catch:{ all -> 0x0020 }
                if (r7 == 0) goto L_0x00e8
                java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x0020 }
                com.sugarcube.app.base.data.database.CachedCatalogItem r7 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r7     // Catch:{ all -> 0x0020 }
                r8 = r1
                java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x0020 }
                boolean r9 = r8 instanceof java.util.Collection     // Catch:{ all -> 0x0020 }
                if (r9 == 0) goto L_0x00b9
                r9 = r8
                java.util.Collection r9 = (java.util.Collection) r9     // Catch:{ all -> 0x0020 }
                boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0020 }
                if (r9 == 0) goto L_0x00b9
                r9 = r4
                goto L_0x00db
            L_0x00b9:
                java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0020 }
                r9 = r4
            L_0x00be:
                boolean r10 = r8.hasNext()     // Catch:{ all -> 0x0020 }
                if (r10 == 0) goto L_0x00db
                java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x0020 }
                java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0020 }
                int r10 = r10.intValue()     // Catch:{ all -> 0x0020 }
                int r11 = r7.getId()     // Catch:{ all -> 0x0020 }
                if (r10 != r11) goto L_0x00be
                int r9 = r9 + r0
                if (r9 >= 0) goto L_0x00be
                YH.C16877v.w()     // Catch:{ all -> 0x0020 }
                goto L_0x00be
            L_0x00db:
                XH.v r8 = new XH.v     // Catch:{ all -> 0x0020 }
                java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.e(r9)     // Catch:{ all -> 0x0020 }
                r8.<init>(r7, r9)     // Catch:{ all -> 0x0020 }
                r6.add(r8)     // Catch:{ all -> 0x0020 }
                goto L_0x009b
            L_0x00e8:
                androidx.lifecycle.K r13 = r2.f141543R     // Catch:{ all -> 0x0020 }
                r13.postValue(r6)     // Catch:{ all -> 0x0020 }
            L_0x00ef:
                XH.N r13 = XH.C16807N.f139792a     // Catch:{ all -> 0x0020 }
                r3.d(r5)
                XH.N r13 = XH.C16807N.f139792a
                return r13
            L_0x00f7:
                r13 = move-exception
                r3 = r8
            L_0x00f9:
                r3.d(r5)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchProductInformationForItem$1", f = "CatalogViewModelV2.kt", l = {873, 378}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141626c;

        /* renamed from: d  reason: collision with root package name */
        Object f141627d;

        /* renamed from: e  reason: collision with root package name */
        int f141628e;

        /* renamed from: f  reason: collision with root package name */
        int f141629f;

        /* renamed from: g  reason: collision with root package name */
        int f141630g;

        /* renamed from: h  reason: collision with root package name */
        int f141631h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Z f141632i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f141633j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Z z10, int i10, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f141632i = z10;
            this.f141633j = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f141632i, this.f141633j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[Catch:{ all -> 0x001d }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[Catch:{ all -> 0x001d }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009e A[Catch:{ all -> 0x001d }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[Catch:{ all -> 0x001d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f141631h
                r2 = 2
                r3 = 1
                r4 = 0
                r5 = 0
                if (r1 == 0) goto L_0x003d
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r0 = r10.f141627d
                com.sugarcube.decorate.v1.internal.catalog.Z r0 = (com.sugarcube.decorate.v1.internal.catalog.Z) r0
                java.lang.Object r1 = r10.f141626c
                bK.a r1 = (bK.C17052a) r1
                XH.y.b(r11)     // Catch:{ all -> 0x001d }
                goto L_0x008c
            L_0x001d:
                r11 = move-exception
                goto L_0x00b8
            L_0x0020:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0028:
                int r1 = r10.f141629f
                int r3 = r10.f141628e
                java.lang.Object r6 = r10.f141627d
                com.sugarcube.decorate.v1.internal.catalog.Z r6 = (com.sugarcube.decorate.v1.internal.catalog.Z) r6
                java.lang.Object r7 = r10.f141626c
                bK.a r7 = (bK.C17052a) r7
                XH.y.b(r11)
                r11 = r7
                r9 = r3
                r3 = r1
                r1 = r6
                r6 = r9
                goto L_0x006a
            L_0x003d:
                XH.y.b(r11)
                java.lang.String r11 = "Sugarcube"
                java.lang.String r1 = "CatalogViewModelV2::fetchProductInformationForItem"
                android.util.Log.d(r11, r1)
                com.sugarcube.decorate.v1.internal.catalog.Z r11 = r10.f141632i
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.PRODUCT_INFO
                r11.D1(r1)
                com.sugarcube.decorate.v1.internal.catalog.Z r11 = r10.f141632i
                bK.a r11 = r11.f141561x
                com.sugarcube.decorate.v1.internal.catalog.Z r1 = r10.f141632i
                int r6 = r10.f141633j
                r10.f141626c = r11
                r10.f141627d = r1
                r10.f141628e = r6
                r10.f141629f = r4
                r10.f141631h = r3
                java.lang.Object r3 = r11.e(r5, r10)
                if (r3 != r0) goto L_0x0069
                return r0
            L_0x0069:
                r3 = r4
            L_0x006a:
                com.sugarcube.app.base.data.source.CatalogRepository r7 = r1.f141550m     // Catch:{ all -> 0x00b5 }
                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.e(r6)     // Catch:{ all -> 0x00b5 }
                java.util.List r8 = YH.C16877v.e(r8)     // Catch:{ all -> 0x00b5 }
                r10.f141626c = r11     // Catch:{ all -> 0x00b5 }
                r10.f141627d = r1     // Catch:{ all -> 0x00b5 }
                r10.f141628e = r6     // Catch:{ all -> 0x00b5 }
                r10.f141629f = r3     // Catch:{ all -> 0x00b5 }
                r10.f141630g = r4     // Catch:{ all -> 0x00b5 }
                r10.f141631h = r2     // Catch:{ all -> 0x00b5 }
                java.lang.Object r2 = r7.fetchProductInformation(r8, r10)     // Catch:{ all -> 0x00b5 }
                if (r2 != r0) goto L_0x0089
                return r0
            L_0x0089:
                r0 = r1
                r1 = r11
                r11 = r2
            L_0x008c:
                java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x001d }
                if (r11 == 0) goto L_0x0097
                java.lang.Object r11 = YH.C16877v.z0(r11, r4)     // Catch:{ all -> 0x001d }
                com.sugarcube.app.base.data.database.CachedCatalogItem r11 = (com.sugarcube.app.base.data.database.CachedCatalogItem) r11     // Catch:{ all -> 0x001d }
                goto L_0x0098
            L_0x0097:
                r11 = r5
            L_0x0098:
                androidx.lifecycle.K r0 = r0.f141542Q     // Catch:{ all -> 0x001d }
                if (r11 != 0) goto L_0x00a4
                com.sugarcube.app.base.data.Loadable$Failure r11 = new com.sugarcube.app.base.data.Loadable$Failure     // Catch:{ all -> 0x001d }
                r11.<init>()     // Catch:{ all -> 0x001d }
                goto L_0x00aa
            L_0x00a4:
                com.sugarcube.app.base.data.Loadable$Loaded r2 = new com.sugarcube.app.base.data.Loadable$Loaded     // Catch:{ all -> 0x001d }
                r2.<init>(r11)     // Catch:{ all -> 0x001d }
                r11 = r2
            L_0x00aa:
                r0.postValue(r11)     // Catch:{ all -> 0x001d }
                XH.N r11 = XH.C16807N.f139792a     // Catch:{ all -> 0x001d }
                r1.d(r5)
                XH.N r11 = XH.C16807N.f139792a
                return r11
            L_0x00b5:
                r0 = move-exception
                r1 = r11
                r11 = r0
            L_0x00b8:
                r1.d(r5)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchProductRecommendations$1", f = "CatalogViewModelV2.kt", l = {310}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141635d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f141636e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(Z z10, CachedCatalogItem cachedCatalogItem, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f141635d = z10;
            this.f141636e = cachedCatalogItem;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f141635d, this.f141636e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141634c;
            if (i10 == 0) {
                XH.y.b(obj);
                this.f141635d.f141563y0.setValue(W.b((W) this.f141635d.f141563y0.getValue(), (Integer) null, true, false, false, false, 29, (Object) null));
                this.f141635d.D1(c.PRODUCT_RECOMMENDATIONS);
                this.f141635d.f141526C.postValue(C16877v.n());
                this.f141635d.f141528D.postValue(C16877v.n());
                CatalogRepository H10 = this.f141635d.f141550m;
                int id2 = this.f141636e.getId();
                this.f141634c = 1;
                obj = H10.fetchProductRecommendations(id2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) obj;
            if (list == null) {
                list = C16877v.n();
            }
            this.f141635d.f141528D.postValue(list);
            this.f141635d.f141563y0.setValue(W.b((W) this.f141635d.f141563y0.getValue(), (Integer) null, false, false, false, false, 29, (Object) null));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$fetchProductVariantsForItem$1", f = "CatalogViewModelV2.kt", l = {873, 400}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141637c;

        /* renamed from: d  reason: collision with root package name */
        Object f141638d;

        /* renamed from: e  reason: collision with root package name */
        Object f141639e;

        /* renamed from: f  reason: collision with root package name */
        int f141640f;

        /* renamed from: g  reason: collision with root package name */
        int f141641g;

        /* renamed from: h  reason: collision with root package name */
        int f141642h;

        /* renamed from: i  reason: collision with root package name */
        int f141643i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Z f141644j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f141645k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(Z z10, int i10, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f141644j = z10;
            this.f141645k = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f141644j, this.f141645k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17052a aVar;
            K k10;
            int i10;
            Z z10;
            int i11;
            Object f10 = C17187b.f();
            int i12 = this.f141643i;
            if (i12 == 0) {
                XH.y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::fetchProductVariantsForItem");
                C17052a P10 = this.f141644j.f141564z;
                z10 = this.f141644j;
                int i13 = this.f141645k;
                this.f141637c = P10;
                this.f141638d = z10;
                this.f141640f = i13;
                this.f141641g = 0;
                this.f141643i = 1;
                if (P10.e((Object) null, this) == f10) {
                    return f10;
                }
                i11 = i13;
                aVar = P10;
                i10 = 0;
            } else if (i12 == 1) {
                int i14 = this.f141641g;
                i11 = this.f141640f;
                z10 = (Z) this.f141638d;
                XH.y.b(obj);
                i10 = i14;
                aVar = (C17052a) this.f141637c;
            } else if (i12 == 2) {
                k10 = (K) this.f141639e;
                Z z11 = (Z) this.f141638d;
                aVar = (C17052a) this.f141637c;
                try {
                    XH.y.b(obj);
                    k10.postValue(obj);
                    C16807N n10 = C16807N.f139792a;
                    aVar.d((Object) null);
                    return C16807N.f139792a;
                } catch (Throwable th2) {
                    aVar.d((Object) null);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K a02 = z10.f141544S;
            CatalogRepository H10 = z10.f141550m;
            Integer e10 = kotlin.coroutines.jvm.internal.b.e(i11);
            this.f141637c = aVar;
            this.f141638d = z10;
            this.f141639e = a02;
            this.f141640f = i11;
            this.f141641g = i10;
            this.f141642h = 0;
            this.f141643i = 2;
            obj = H10.fetchProductVariants(e10, this);
            if (obj == f10) {
                return f10;
            }
            k10 = a02;
            k10.postValue(obj);
            C16807N n102 = C16807N.f139792a;
            aVar.d((Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$provideSuggestions$1", f = "CatalogViewModelV2.kt", l = {507}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141646c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141647d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f141648e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$provideSuggestions$1$1", f = "CatalogViewModelV2.kt", l = {508}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f141649c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Z f141650d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f141651e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Z z10, String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f141650d = z10;
                this.f141651e = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f141650d, this.f141651e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f141649c;
                if (i10 == 0) {
                    XH.y.b(obj);
                    AutocompleteClient F10 = this.f141650d.f141537L;
                    String str = this.f141651e;
                    this.f141649c = 1;
                    obj = F10.getPartialSearch(str, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    XH.y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f141650d.f141538M.postValue((List) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(Z z10, String str, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f141647d = z10;
            this.f141648e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f141647d, this.f141648e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141646c;
            if (i10 == 0) {
                XH.y.b(obj);
                P0 c10 = C16311i0.c();
                a aVar = new a(this.f141647d, this.f141648e, (C17164e<? super a>) null);
                this.f141646c = 1;
                if (C16310i.g(c10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$reportSearchAnalytics$1", f = "CatalogViewModelV2.kt", l = {326}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141652c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141653d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f141654e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ SearchType f141655f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f141656g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f141657h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(Z z10, String str, SearchType searchType, String str2, String str3, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f141653d = z10;
            this.f141654e = str;
            this.f141655f = searchType;
            this.f141656g = str2;
            this.f141657h = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f141653d, this.f141654e, this.f141655f, this.f141656g, this.f141657h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141652c;
            if (i10 == 0) {
                XH.y.b(obj);
                CatalogRepository H10 = this.f141653d.f141550m;
                String str = this.f141654e;
                this.f141652c = 1;
                obj = H10.getCount(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Integer num = (Integer) obj;
            if (num != null) {
                Z z10 = this.f141653d;
                z10.X0().b().catalogSearch("Success", this.f141655f, this.f141656g, this.f141657h, this.f141654e, String.valueOf(num.intValue()));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$showCategories$1", f = "CatalogViewModelV2.kt", l = {873, 471}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141658c;

        /* renamed from: d  reason: collision with root package name */
        Object f141659d;

        /* renamed from: e  reason: collision with root package name */
        int f141660e;

        /* renamed from: f  reason: collision with root package name */
        int f141661f;

        /* renamed from: g  reason: collision with root package name */
        int f141662g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Z f141663h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(Z z10, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f141663h = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f141663h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x007e A[Catch:{ all -> 0x001c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f141662g
                r2 = 0
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0039
                if (r1 == r4) goto L_0x0027
                if (r1 != r3) goto L_0x001f
                java.lang.Object r0 = r9.f141659d
                com.sugarcube.decorate.v1.internal.catalog.Z r0 = (com.sugarcube.decorate.v1.internal.catalog.Z) r0
                java.lang.Object r1 = r9.f141658c
                bK.a r1 = (bK.C17052a) r1
                XH.y.b(r10)     // Catch:{ all -> 0x001c }
                goto L_0x007a
            L_0x001c:
                r10 = move-exception
                goto L_0x0090
            L_0x001f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0027:
                int r1 = r9.f141660e
                java.lang.Object r6 = r9.f141659d
                com.sugarcube.decorate.v1.internal.catalog.Z r6 = (com.sugarcube.decorate.v1.internal.catalog.Z) r6
                java.lang.Object r7 = r9.f141658c
                bK.a r7 = (bK.C17052a) r7
                XH.y.b(r10)
                r10 = r7
                r8 = r6
                r6 = r1
                r1 = r8
                goto L_0x0062
            L_0x0039:
                XH.y.b(r10)
                java.lang.String r10 = "Sugarcube"
                java.lang.String r1 = "CatalogViewModelV2::showCategories"
                android.util.Log.d(r10, r1)
                com.sugarcube.decorate.v1.internal.catalog.Z r10 = r9.f141663h
                com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CATEGORIES
                r10.D1(r1)
                com.sugarcube.decorate.v1.internal.catalog.Z r10 = r9.f141663h
                bK.a r10 = r10.f141558u
                com.sugarcube.decorate.v1.internal.catalog.Z r1 = r9.f141663h
                r9.f141658c = r10
                r9.f141659d = r1
                r9.f141660e = r2
                r9.f141662g = r4
                java.lang.Object r6 = r10.e(r5, r9)
                if (r6 != r0) goto L_0x0061
                return r0
            L_0x0061:
                r6 = r2
            L_0x0062:
                com.sugarcube.app.base.data.source.CatalogRepository r7 = r1.f141550m     // Catch:{ all -> 0x008d }
                r9.f141658c = r10     // Catch:{ all -> 0x008d }
                r9.f141659d = r1     // Catch:{ all -> 0x008d }
                r9.f141660e = r6     // Catch:{ all -> 0x008d }
                r9.f141661f = r2     // Catch:{ all -> 0x008d }
                r9.f141662g = r3     // Catch:{ all -> 0x008d }
                java.lang.Object r2 = com.sugarcube.app.base.data.source.CatalogRepositorySource.fetchCatalogCategories$default(r7, r5, r9, r4, r5)     // Catch:{ all -> 0x008d }
                if (r2 != r0) goto L_0x0077
                return r0
            L_0x0077:
                r0 = r1
                r1 = r10
                r10 = r2
            L_0x007a:
                java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x001c }
                if (r10 == 0) goto L_0x0085
                androidx.lifecycle.K r0 = r0.f141535J     // Catch:{ all -> 0x001c }
                r0.postValue(r10)     // Catch:{ all -> 0x001c }
            L_0x0085:
                XH.N r10 = XH.C16807N.f139792a     // Catch:{ all -> 0x001c }
                r1.d(r5)
                XH.N r10 = XH.C16807N.f139792a
                return r10
            L_0x008d:
                r0 = move-exception
                r1 = r10
                r10 = r0
            L_0x0090:
                r1.d(r5)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItems$1", f = "CatalogViewModelV2.kt", l = {}, m = "invokeSuspend")
    static final class r extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141665d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f141666a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    com.sugarcube.decorate.v1.internal.catalog.Z$c[] r0 = com.sugarcube.decorate.v1.internal.catalog.Z.c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.BROWSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.CATEGORIES     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.FILTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.RESULTS     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SEARCH     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SWAP     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f141666a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.r.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(Z z10, C17164e<? super r> eVar) {
            super(2, eVar);
            this.f141665d = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new r(this.f141665d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((r) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f141664c == 0) {
                XH.y.b(obj);
                c cVar = (c) this.f141665d.f141522A.getValue();
                int i10 = cVar == null ? -1 : a.f141666a[cVar.ordinal()];
                if (i10 == 1) {
                    this.f141665d.v1();
                } else if (i10 == 3) {
                    this.f141665d.u1();
                } else if (i10 == 4) {
                    this.f141665d.x1();
                } else if (i10 == 5) {
                    this.f141665d.w1();
                } else if (i10 == 6) {
                    this.f141665d.y1();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItems$2", f = "CatalogViewModelV2.kt", l = {773}, m = "invokeSuspend")
    static final class s extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141668d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super Result<? extends List<CachedCatalogItem>>>, Object> f141669e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ K<List<CachedCatalogItem>> f141670f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(Z z10, C17642l<? super C17164e<? super Result<? extends List<CachedCatalogItem>>>, ? extends Object> lVar, K<List<CachedCatalogItem>> k10, C17164e<? super s> eVar) {
            super(2, eVar);
            this.f141668d = z10;
            this.f141669e = lVar;
            this.f141670f = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new s(this.f141668d, this.f141669e, this.f141670f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((s) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141667c;
            if (i10 == 0) {
                XH.y.b(obj);
                if (this.f141668d.r1()) {
                    this.f141668d.f141563y0.setValue(W.b((W) this.f141668d.f141563y0.getValue(), (Integer) null, false, true, false, false, 27, (Object) null));
                    C17642l<C17164e<? super Result<? extends List<CachedCatalogItem>>>, Object> lVar = this.f141669e;
                    this.f141667c = 1;
                    obj = lVar.invoke(this);
                    if (obj == f10) {
                        return f10;
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                try {
                    XH.y.b(obj);
                } catch (Throwable th2) {
                    this.f141668d.u0();
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Result result = (Result) obj;
            if (result instanceof Result.Error) {
                this.f141668d.f141563y0.setValue(W.b((W) this.f141668d.f141563y0.getValue(), (Integer) null, false, false, true, false, 19, (Object) null));
            } else if (result instanceof Result.Success) {
                this.f141668d.p0(this.f141670f, (List) ((Result.Success) result).getData());
                if (((List) ((Result.Success) result).getData()).isEmpty()) {
                    this.f141668d.f141563y0.setValue(W.b((W) this.f141668d.f141563y0.getValue(), (Integer) null, false, false, false, false, 19, (Object) null));
                } else {
                    this.f141668d.f141563y0.setValue(W.b((W) this.f141668d.f141563y0.getValue(), (Integer) null, false, false, false, false, 23, (Object) null));
                }
            } else {
                throw new XH.t();
            }
            this.f141668d.u0();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItemsForFilter$1$1", f = "CatalogViewModelV2.kt", l = {753}, m = "invokeSuspend")
    static final class t extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends List<? extends CachedCatalogItem>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141672d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f141673e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(Z z10, String str, C17164e<? super t> eVar) {
            super(1, eVar);
            this.f141672d = z10;
            this.f141673e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new t(this.f141672d, this.f141673e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar) {
            return ((t) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141671c;
            if (i10 == 0) {
                XH.y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::stepCatalogItemsForFilter");
                CatalogRepository H10 = this.f141672d.f141550m;
                String str = this.f141673e;
                this.f141671c = 1;
                obj = H10.stepCatalogItems(str, (C17164e<? super Result<? extends List<CachedCatalogItem>>>) this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItemsForRoomType$1$1", f = "CatalogViewModelV2.kt", l = {717}, m = "invokeSuspend")
    static final class u extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends List<? extends CachedCatalogItem>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141674c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141675d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RoomType f141676e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(Z z10, RoomType roomType, C17164e<? super u> eVar) {
            super(1, eVar);
            this.f141675d = z10;
            this.f141676e = roomType;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new u(this.f141675d, this.f141676e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar) {
            return ((u) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141674c;
            if (i10 == 0) {
                XH.y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::stepCatalogItemsForRoomType");
                CatalogRepository H10 = this.f141675d.f141550m;
                RoomType roomType = this.f141676e;
                this.f141674c = 1;
                obj = H10.stepCatalogItems(roomType, (C17164e<? super Result<? extends List<CachedCatalogItem>>>) this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItemsForSearchTerm$1$1", f = "CatalogViewModelV2.kt", l = {726}, m = "invokeSuspend")
    static final class v extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends List<? extends CachedCatalogItem>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141677c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141678d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f141679e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(Z z10, String str, C17164e<? super v> eVar) {
            super(1, eVar);
            this.f141678d = z10;
            this.f141679e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new v(this.f141678d, this.f141679e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar) {
            return ((v) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141677c;
            if (i10 == 0) {
                XH.y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::stepCatalogItemsForSearchTerm");
                CatalogRepository H10 = this.f141678d.f141550m;
                String str = this.f141679e;
                this.f141677c = 1;
                obj = H10.stepCatalogItems(str, (C17164e<? super Result<? extends List<CachedCatalogItem>>>) this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItemsForSubcategories$1$1", f = "CatalogViewModelV2.kt", l = {744}, m = "invokeSuspend")
    static final class w extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends List<? extends CachedCatalogItem>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141680c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141681d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CatalogCategory f141682e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(Z z10, CatalogCategory catalogCategory, C17164e<? super w> eVar) {
            super(1, eVar);
            this.f141681d = z10;
            this.f141682e = catalogCategory;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new w(this.f141681d, this.f141682e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar) {
            return ((w) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141680c;
            if (i10 == 0) {
                XH.y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::stepCatalogItemsForSubcategories");
                CatalogRepository H10 = this.f141681d.f141550m;
                CatalogCategory catalogCategory = this.f141682e;
                this.f141680c = 1;
                obj = H10.stepCatalogItems(catalogCategory, (C17164e<? super Result<? extends List<CachedCatalogItem>>>) this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/sugarcube/app/base/data/Result;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$stepCatalogItemsForSwap$1$1", f = "CatalogViewModelV2.kt", l = {735}, m = "invokeSuspend")
    static final class x extends kotlin.coroutines.jvm.internal.l implements C17642l<C17164e<? super Result<? extends List<? extends CachedCatalogItem>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f141683c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Z f141684d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f141685e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(Z z10, CachedCatalogItem cachedCatalogItem, C17164e<? super x> eVar) {
            super(1, eVar);
            this.f141684d = z10;
            this.f141685e = cachedCatalogItem;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new x(this.f141684d, this.f141685e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super Result<? extends List<CachedCatalogItem>>> eVar) {
            return ((x) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141683c;
            if (i10 == 0) {
                XH.y.b(obj);
                Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::stepCatalogItemsForSwap");
                CatalogRepository H10 = this.f141684d.f141550m;
                CachedCatalogItem cachedCatalogItem = this.f141685e;
                this.f141683c = 1;
                obj = H10.stepCatalogItems(cachedCatalogItem, (C17164e<? super Result<? extends List<CachedCatalogItem>>>) this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$updateCount$1", f = "CatalogViewModelV2.kt", l = {817, 824, 831}, m = "invokeSuspend")
    static final class y extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141686c;

        /* renamed from: d  reason: collision with root package name */
        int f141687d;

        /* renamed from: e  reason: collision with root package name */
        int f141688e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Z f141689f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f141690a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    com.sugarcube.decorate.v1.internal.catalog.Z$c[] r0 = com.sugarcube.decorate.v1.internal.catalog.Z.c.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.BROWSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SEARCH     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.RESULTS     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.sugarcube.decorate.v1.internal.catalog.Z$c r1 = com.sugarcube.decorate.v1.internal.catalog.Z.c.SWAP     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f141690a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v1.internal.catalog.Z.y.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(Z z10, C17164e<? super y> eVar) {
            super(2, eVar);
            this.f141689f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new y(this.f141689f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((y) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Integer num;
            Object f10 = C17187b.f();
            int i10 = this.f141688e;
            if (i10 == 0) {
                XH.y.b(obj);
                c cVar = (c) this.f141689f.f141522A.getValue();
                int i11 = cVar == null ? -1 : a.f141690a[cVar.ordinal()];
                if (i11 != 1) {
                    num = null;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                CatalogRepository H10 = this.f141689f.f141550m;
                                CachedCatalogItem E10 = this.f141689f.f141540O;
                                this.f141686c = cVar;
                                this.f141687d = i11;
                                this.f141688e = 3;
                                obj = H10.getCount(E10, this);
                                if (obj == f10) {
                                    return f10;
                                }
                                num = (Integer) obj;
                            }
                        } else if (this.f141689f.H0() == null) {
                            CatalogRepository H11 = this.f141689f.f141550m;
                            Object value = this.f141689f.f141533H.getValue();
                            this.f141686c = cVar;
                            this.f141687d = i11;
                            this.f141688e = 2;
                            obj = H11.getCount(value, this);
                            if (obj == f10) {
                                return f10;
                            }
                            num = (Integer) obj;
                        }
                    }
                } else {
                    CatalogRepository H12 = this.f141689f.f141550m;
                    RoomType C10 = this.f141689f.f141539N;
                    this.f141686c = cVar;
                    this.f141687d = i11;
                    this.f141688e = 1;
                    obj = H12.getCount(C10, this);
                    if (obj == f10) {
                        return f10;
                    }
                    num = (Integer) obj;
                }
            } else if (i10 == 1) {
                c cVar2 = (c) this.f141686c;
                XH.y.b(obj);
                num = (Integer) obj;
            } else if (i10 == 2) {
                c cVar3 = (c) this.f141686c;
                XH.y.b(obj);
                num = (Integer) obj;
            } else if (i10 == 3) {
                c cVar4 = (c) this.f141686c;
                XH.y.b(obj);
                num = (Integer) obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f141689f.f141563y0.setValue(W.b((W) this.f141689f.f141563y0.getValue(), num, false, false, false, false, 30, (Object) null));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.decorate.v1.internal.catalog.CatalogViewModelV2$updateViewMode$1", f = "CatalogViewModelV2.kt", l = {656}, m = "invokeSuspend")
    static final class z extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f141691c;

        /* renamed from: d  reason: collision with root package name */
        Object f141692d;

        /* renamed from: e  reason: collision with root package name */
        Object f141693e;

        /* renamed from: f  reason: collision with root package name */
        Object f141694f;

        /* renamed from: g  reason: collision with root package name */
        int f141695g;

        /* renamed from: h  reason: collision with root package name */
        int f141696h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Z f141697i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(Z z10, C17164e<? super z> eVar) {
            super(2, eVar);
            this.f141697i = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new z(this.f141697i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f141696h;
            if (i10 == 0) {
                XH.y.b(obj);
                RoomType C10 = this.f141697i.f141539N;
                if (C10 != null) {
                    Z z10 = this.f141697i;
                    QuickFilterRepository N10 = z10.f141551n;
                    this.f141691c = C10;
                    this.f141692d = C10;
                    this.f141693e = z10;
                    this.f141694f = C10;
                    this.f141695g = 0;
                    this.f141696h = 1;
                    if (QuickFilterRepositorySource.getQuickFilters$default(N10, C10, (String) null, (String) null, this, 6, (Object) null) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                RoomType roomType = (RoomType) this.f141694f;
                Z z11 = (Z) this.f141693e;
                RoomType roomType2 = (RoomType) this.f141692d;
                RoomType roomType3 = (RoomType) this.f141691c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public Z(CatalogRepository catalogRepository, QuickFilterRepository quickFilterRepository, AddToShoppingListUseCase addToShoppingListUseCase, FetchShoppingListItemsUseCase fetchShoppingListItemsUseCase, ConfigRepository configRepository, OE.q qVar, com.sugarcube.app.base.external.config.a aVar) {
        QuickFilterRepository quickFilterRepository2 = quickFilterRepository;
        AddToShoppingListUseCase addToShoppingListUseCase2 = addToShoppingListUseCase;
        FetchShoppingListItemsUseCase fetchShoppingListItemsUseCase2 = fetchShoppingListItemsUseCase;
        ConfigRepository configRepository2 = configRepository;
        OE.q qVar2 = qVar;
        com.sugarcube.app.base.external.config.a aVar2 = aVar;
        C17542s.j(catalogRepository, "catalogRepository");
        C17542s.j(quickFilterRepository2, "quickFilterRepository");
        C17542s.j(addToShoppingListUseCase2, "addToShoppingListUseCase");
        C17542s.j(fetchShoppingListItemsUseCase2, "fetchShoppingListItemsUseCase");
        C17542s.j(configRepository2, "configRepository");
        C17542s.j(qVar2, "sugarcube");
        C17542s.j(aVar2, "config");
        this.f141550m = catalogRepository;
        this.f141551n = quickFilterRepository2;
        this.f141552o = addToShoppingListUseCase2;
        this.f141553p = fetchShoppingListItemsUseCase2;
        this.f141554q = configRepository2;
        this.f141555r = qVar2;
        K<Boolean> k10 = new K<>(Boolean.FALSE);
        this.f141556s = k10;
        this.f141557t = k10;
        this.f141531F = quickFilterRepository.getRoomFilters();
        K<CatalogCategory> k11 = new K<>();
        this.f141532G = k11;
        this.f141533H = new K<>();
        this.f141534I = new K<>();
        this.f141535J = new K<>();
        this.f141536K = e0.b(k11, new X());
        this.f141537L = new AutocompleteClient(aVar2);
        this.f141538M = new K<>();
        this.f141542Q = new K<>();
        this.f141543R = new K<>();
        this.f141544S = new K<>();
        this.f141547X = new K<>();
        this.f141548Y = catalogRepository.isRefreshing();
        this.f141549Z = u1.e(new X(false, false, (String) null, 7, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);
        C16505B<W> a10 = C16521S.a(new W((Integer) null, false, false, false, false, 31, (DefaultConstructorMarker) null));
        this.f141563y0 = a10;
        this.f141565z0 = a10;
        this.f141523A0 = bK.g.b(false, 1, (Object) null);
        K<List<String>> k12 = new K<>(C16877v.n());
        this.f141525B0 = k12;
        this.f141527C0 = k12;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final HashMap B1(Z z10, d dVar, CachedCatalogItem cachedCatalogItem, String str, String str2, String str3, String str4) {
        C17542s.j(str, "cId");
        String str5 = str2;
        C17542s.j(str5, "cName");
        String str6 = str3;
        C17542s.j(str6, "scId");
        String str7 = str4;
        C17542s.j(str7, "scName");
        return z10.f141555r.b().catalogBrowseSelect(dVar.a(), 0, dVar.c(), dVar.b(), cachedCatalogItem.getId(), str, str5, str6, str7, "");
    }

    private final void C0(CachedCatalogItem cachedCatalogItem) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new m(this, cachedCatalogItem, (C17164e<? super m>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void C1() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new y(this, (C17164e<? super y>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void D1(c cVar) {
        switch (e.f141576a[cVar.ordinal()]) {
            case 1:
                this.f141524B.postValue(Integer.valueOf(OE.n.f113493y1));
                s0();
                this.f141540O = null;
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new z(this, (C17164e<? super z>) null), 3, (Object) null);
                break;
            case 2:
                s0();
                break;
            case 3:
                this.f141540O = null;
                break;
            case 4:
                X.f127640g.f(this.f141549Z, this.f141541P);
                this.f141524B.postValue(Integer.valueOf(OE.n.f113281T));
                this.f141540O = null;
                break;
            case 5:
                X.f127640g.f(this.f141549Z, (String) null);
                this.f141524B.postValue(Integer.valueOf(OE.n.f113338c0));
                break;
            case 6:
            case 7:
            case 8:
                break;
            case 9:
                this.f141524B.postValue(Integer.valueOf(OE.n.f113350d5));
                break;
            default:
                throw new XH.t();
        }
        this.f141522A.postValue(cVar);
    }

    /* access modifiers changed from: private */
    public final void p0(K<List<CachedCatalogItem>> k10, List<CachedCatalogItem> list) {
        List list2;
        List value = k10.getValue();
        if (value == null || (list2 = C16877v.w1(value)) == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        k10.postValue(list2);
        C1();
        C16505B<W> b10 = this.f141563y0;
        b10.setValue(W.b(b10.getValue(), (Integer) null, false, false, false, false, 19, (Object) null));
    }

    /* access modifiers changed from: private */
    public final boolean r1() {
        return C17052a.C3460a.b(this.f141523A0, (Object) null, 1, (Object) null);
    }

    private final void s0() {
        C16505B<W> b10 = this.f141563y0;
        b10.setValue(W.b(b10.getValue(), (Integer) null, false, false, false, false, 15, (Object) null));
        this.f141541P = null;
        X.f127640g.f(this.f141549Z, (String) null);
    }

    private final void t1(K<List<CachedCatalogItem>> k10, C17642l<? super C17164e<? super Result<? extends List<CachedCatalogItem>>>, ? extends Object> lVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new s(this, lVar, k10, (C17164e<? super s>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void u0() {
        C17052a.C3460a.c(this.f141523A0, (Object) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void u1() {
        String str = this.f141541P;
        if (str != null) {
            t1(this.f141528D, new t(this, str, (C17164e<? super t>) null));
        }
    }

    /* access modifiers changed from: private */
    public final void v1() {
        RoomType roomType = this.f141539N;
        if (roomType != null) {
            t1(this.f141526C, new u(this, roomType, (C17164e<? super u>) null));
        }
    }

    /* access modifiers changed from: private */
    public final void w1() {
        String str = this.f141541P;
        if (str != null) {
            t1(this.f141528D, new v(this, str, (C17164e<? super v>) null));
        }
    }

    public static /* synthetic */ void x0(Z z10, String str, boolean z11, SearchType searchType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        z10.w0(str, z11, searchType);
    }

    /* access modifiers changed from: private */
    public final void x1() {
        CatalogCategory value = this.f141533H.getValue();
        if (value != null) {
            t1(this.f141530E, new w(this, value, (C17164e<? super w>) null));
        }
    }

    /* access modifiers changed from: private */
    public final void y1() {
        CachedCatalogItem cachedCatalogItem = this.f141540O;
        if (cachedCatalogItem != null) {
            t1(this.f141528D, new x(this, cachedCatalogItem, (C17164e<? super x>) null));
        }
    }

    /* access modifiers changed from: private */
    public static final List z1(CatalogCategory catalogCategory) {
        if (catalogCategory != null) {
            return catalogCategory.getSubcategories();
        }
        return null;
    }

    public final void A0(List<Integer> list) {
        C17542s.j(list, "itemIds");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new k(this, list, (C17164e<? super k>) null), 3, (Object) null);
    }

    public final void A1(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        d dVar = this.f141546U;
        if (dVar != null) {
            CatalogCategory value = this.f141532G.getValue();
            String str = null;
            String categoryId = value != null ? value.getCategoryId() : null;
            CatalogCategory value2 = this.f141532G.getValue();
            String name = value2 != null ? value2.getName() : null;
            CatalogCategory value3 = this.f141533H.getValue();
            String categoryId2 = value3 != null ? value3.getCategoryId() : null;
            CatalogCategory value4 = this.f141533H.getValue();
            if (value4 != null) {
                str = value4.getName();
            }
            if (((HashMap) C13291e.b(categoryId, name, categoryId2, str, new Y(this, dVar, cachedCatalogItem))) == null) {
                this.f141555r.b().catalogBrowseSelect(dVar.a(), 0, dVar.c(), dVar.b(), cachedCatalogItem.getId());
            }
        }
    }

    public final void B0(int i10) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new l(this, i10, (C17164e<? super l>) null), 3, (Object) null);
    }

    public final void D0(int i10) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new n(this, i10, (C17164e<? super n>) null), 3, (Object) null);
    }

    public final F<List<XH.v<CachedCatalogItem, Integer>>> E0() {
        return this.f141543R;
    }

    public final F<CatalogCategory> F0() {
        return this.f141532G;
    }

    public final F<Loadable<CachedCatalogItem>> G0() {
        return this.f141542Q;
    }

    public final String H0() {
        return this.f141541P;
    }

    public final F<List<String>> I0() {
        return this.f141538M;
    }

    public final F<Integer> J0() {
        return this.f141524B;
    }

    public final C16519P<W> K0() {
        return this.f141565z0;
    }

    public final F<List<CatalogCategory>> L0() {
        return this.f141535J;
    }

    public final F<Boolean> M0() {
        return this.f141557t;
    }

    public final F<List<CachedCatalogItem>> N0() {
        return this.f141526C;
    }

    public final F<List<String>> O0() {
        return this.f141527C0;
    }

    public final boolean P0() {
        return this.f141529D0;
    }

    public final F<List<CachedCatalogItem>> Q0() {
        return this.f141528D;
    }

    public final F<List<QuickFilter>> R0() {
        return this.f141531F;
    }

    public final C16942a S0() {
        return this.f141545T;
    }

    public final C4899r0<X> T0() {
        return this.f141549Z;
    }

    public final F<String> U0() {
        return this.f141534I;
    }

    public final F<List<CatalogCategory>> V0() {
        return this.f141536K;
    }

    public final F<List<CachedCatalogItem>> W0() {
        return this.f141530E;
    }

    public final OE.q X0() {
        return this.f141555r;
    }

    public final F<List<CachedCatalogItem>> Y0() {
        return this.f141544S;
    }

    public final F<c> Z0() {
        return this.f141522A;
    }

    public final F<Boolean> a1() {
        return this.f141547X;
    }

    public final boolean b1() {
        String e10 = this.f141549Z.getValue().e();
        boolean z10 = false;
        if (!(e10 == null || e10.length() == 0)) {
            z10 = true;
        }
        return !z10;
    }

    public final void c1(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        C0(cachedCatalogItem);
    }

    public final void d1() {
        x0(this, (String) null, false, (SearchType) null, 2, (Object) null);
        C16942a aVar = this.f141545T;
        if (aVar != null) {
            aVar.i();
        }
    }

    public final void e1(String str) {
        C17542s.j(str, "searchQuery");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new o(this, str, (C17164e<? super o>) null), 3, (Object) null);
    }

    public final void f1(List<CachedCatalogItem> list, String str) {
        C17542s.j(list, "items");
        Analytics b10 = this.f141555r.b();
        if (str == null) {
            str = "";
        }
        b10.addToCartError(list, str);
    }

    public final void g1(SearchType searchType, String str, String str2, String str3) {
        C17542s.j(searchType, "searchType");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new p(this, str, searchType, str2, str3, (C17164e<? super p>) null), 3, (Object) null);
    }

    public final void h1() {
        X.f127640g.b(this.f141549Z);
    }

    public final void i1() {
        X.f127640g.c(this.f141549Z);
    }

    public final void j1() {
        X.f127640g.a(this.f141549Z);
    }

    public final void k1(boolean z10) {
        Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::resetCategories");
        this.f141533H.postValue(null);
        this.f141532G.postValue(null);
        D1(z10 ? c.FILTER : c.BROWSE);
    }

    public final void l1() {
        C16505B<W> b10 = this.f141563y0;
        b10.setValue(W.b(b10.getValue(), (Integer) null, false, true, false, false, 19, (Object) null));
        s1();
    }

    public final void m1(CatalogCategory catalogCategory) {
        C17542s.j(catalogCategory, "category");
        Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::setActiveCategory");
        this.f141532G.postValue(catalogCategory);
    }

    public final void n1(boolean z10) {
        if (!C17542s.e(this.f141547X.getValue(), Boolean.valueOf(z10))) {
            this.f141547X.setValue(Boolean.valueOf(z10));
        }
    }

    public final boolean o0(C8951o oVar, CachedCatalogItem cachedCatalogItem) {
        boolean z10;
        C17542s.j(oVar, "navController");
        C17542s.j(cachedCatalogItem, "item");
        String localItemNumber = cachedCatalogItem.getCatalogItem().getLocalItemNumber();
        if (localItemNumber != null) {
            AddToShoppingListUseCase.a.a(this.f141552o, oVar, cachedCatalogItem.getName(), localItemNumber, "ART", 0, 16, (Object) null);
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.e(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::addItemToFav failed, no localItemNumber present");
        }
        return z10;
    }

    public final void o1(C16942a aVar) {
        this.f141545T = aVar;
    }

    public final void p1(d dVar) {
        C17542s.j(dVar, "params");
        this.f141546U = dVar;
    }

    public final void q0() {
        this.f141542Q.postValue(new Loadable.Loading());
    }

    public final void q1() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new q(this, (C17164e<? super q>) null), 3, (Object) null);
    }

    public final void r0() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    public final void s1() {
        if (C17542s.e(this.f141550m.isRefreshing().getValue(), Boolean.FALSE)) {
            Log.d(AnyKt.SUGARCUBE_TAG, "CatalogViewModelV2::stepCatalogItems");
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new r(this, (C17164e<? super r>) null), 3, (Object) null);
        }
    }

    public final void t0() {
        this.f141556s.postValue(Boolean.TRUE);
    }

    public final void v0(RoomType roomType) {
        C17542s.j(roomType, "roomType");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, roomType, (C17164e<? super g>) null), 3, (Object) null);
    }

    public final void w0(String str, boolean z10, SearchType searchType) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(str != null ? C15854t.z1(str).toString() : null, this, z10, searchType, (C17164e<? super h>) null), 3, (Object) null);
    }

    public final void y0(CatalogCategory catalogCategory) {
        C17542s.j(catalogCategory, "subcategory");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new i(this, catalogCategory, (C17164e<? super i>) null), 3, (Object) null);
    }

    public final void z0(CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "swapItem");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new j(this, cachedCatalogItem, (C17164e<? super j>) null), 3, (Object) null);
    }
}
