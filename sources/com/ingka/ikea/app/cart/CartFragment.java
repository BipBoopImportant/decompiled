package com.ingka.ikea.app.cart;

import Ae.e;
import HJ.C15854t;
import IC.C13026h;
import Kf.C9133b;
import Kf.u;
import MB.C13194a;
import Nd.c;
import O0.J0;
import Of.C9155a;
import Of.C9230z;
import Op.Z0;
import Op.c1;
import QA.C13352d;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SA.C13560a;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.C16877v;
import YH.X;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import ay.C13992a;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.app.cart.availability.b;
import com.ingka.ikea.app.cart.b;
import com.ingka.ikea.app.inappfeedback.i;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.informationmessage.InformationMessageNavigation;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5312a;
import g.C5314c;
import gE.C14515b;
import gE.C14516c;
import h.C5406d;
import hg.C9788A;
import hg.F;
import hg.K;
import hg.q;
import hg.r;
import hg.v;
import ip.C11410b;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lm.d;
import me.C10038a;
import me.b;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;
import rx.C15004a;
import rx.C15005b;
import sB.C15035a;
import sf.C10243d;
import tl.C11923c;
import x4.C;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000Ú\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 ð\u00022\u00020\u00012\u00020\u0002:\u0002ñ\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\u0005H\u0002¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0005H\u0002¢\u0006\u0004\b1\u0010\u0004J\u001f\u00104\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0005H\u0002¢\u0006\u0004\b;\u0010\u0004J\u0017\u0010=\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u00107J\u0017\u0010B\u001a\u00020\u00052\u0006\u0010,\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0005H\u0002¢\u0006\u0004\bH\u0010\u0004J\u0017\u0010K\u001a\u00020\u00052\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020MH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ'\u0010V\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\\H\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020_H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010d\u001a\u00020\u00052\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bf\u00107J\u0019\u0010h\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010l\u001a\u00020\u00052\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u0005H\u0002¢\u0006\u0004\bn\u0010\u0004J\u0019\u0010q\u001a\u00020\u00052\b\u0010p\u001a\u0004\u0018\u00010oH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u0005H\u0015¢\u0006\u0004\bs\u0010tJ\u0019\u0010u\u001a\u00020\u00052\b\u0010p\u001a\u0004\u0018\u00010oH\u0014¢\u0006\u0004\bu\u0010rJ\u0017\u0010w\u001a\u00020\u00052\u0006\u0010v\u001a\u00020oH\u0016¢\u0006\u0004\bw\u0010rJ\u000f\u0010x\u001a\u00020\u0005H\u0016¢\u0006\u0004\bx\u0010\u0004J\u000f\u0010y\u001a\u00020\u0005H\u0016¢\u0006\u0004\by\u0010\u0004R#\u0010U\u001a\u00020z8\u0006@\u0006X.¢\u0006\u0013\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010 \u0001\u001a\u00030\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R*\u0010°\u0001\u001a\u00030©\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010­\u0001\"\u0006\b®\u0001\u0010¯\u0001R*\u0010¸\u0001\u001a\u00030±\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R)\u0010¿\u0001\u001a\u00030¹\u00018\u0000@\u0000X.¢\u0006\u0017\n\u0005\bs\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R)\u0010Æ\u0001\u001a\u00030À\u00018\u0006@\u0006X.¢\u0006\u0017\n\u0005\bu\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Î\u0001\u001a\u00030Ç\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R*\u0010Ö\u0001\u001a\u00030Ï\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÐ\u0001\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010æ\u0001\u001a\u00030ß\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R*\u0010î\u0001\u001a\u00030ç\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R*\u0010ö\u0001\u001a\u00030ï\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\bô\u0001\u0010õ\u0001R*\u0010þ\u0001\u001a\u00030÷\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R*\u0010\u0002\u001a\u00030ÿ\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010¦\u0002\u001a\u00030\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b \u0002\u0010¡\u0002\u001a\u0006\b¢\u0002\u0010£\u0002\"\u0006\b¤\u0002\u0010¥\u0002R*\u0010®\u0002\u001a\u00030§\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¨\u0002\u0010©\u0002\u001a\u0006\bª\u0002\u0010«\u0002\"\u0006\b¬\u0002\u0010­\u0002R*\u0010¶\u0002\u001a\u00030¯\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b°\u0002\u0010±\u0002\u001a\u0006\b²\u0002\u0010³\u0002\"\u0006\b´\u0002\u0010µ\u0002R*\u0010¾\u0002\u001a\u00030·\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b¸\u0002\u0010¹\u0002\u001a\u0006\bº\u0002\u0010»\u0002\"\u0006\b¼\u0002\u0010½\u0002R&\u0010Ä\u0002\u001a\t\u0012\u0004\u0012\u00020\u00050¿\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\bÀ\u0002\u0010Á\u0002\u001a\u0006\bÂ\u0002\u0010Ã\u0002R\u001f\u0010É\u0002\u001a\u00020\n8\u0016XD¢\u0006\u0010\n\u0006\bÅ\u0002\u0010Æ\u0002\u001a\u0006\bÇ\u0002\u0010È\u0002R\u001f\u0010Í\u0002\u001a\u00020D8\u0014XD¢\u0006\u0010\n\u0006\bÊ\u0002\u0010\u0001\u001a\u0006\bË\u0002\u0010Ì\u0002R\u001f\u0010Ð\u0002\u001a\u00020D8\u0014XD¢\u0006\u0010\n\u0006\bÎ\u0002\u0010\u0001\u001a\u0006\bÏ\u0002\u0010Ì\u0002R\u001f\u0010Ó\u0002\u001a\u00020D8\u0014XD¢\u0006\u0010\n\u0006\bÑ\u0002\u0010\u0001\u001a\u0006\bÒ\u0002\u0010Ì\u0002R\u0019\u0010Õ\u0002\u001a\u00020D8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÔ\u0002\u0010\u0001R!\u0010Û\u0002\u001a\u00030Ö\u00028BX\u0002¢\u0006\u0010\n\u0006\b×\u0002\u0010Ø\u0002\u001a\u0006\bÙ\u0002\u0010Ú\u0002R!\u0010à\u0002\u001a\u00030Ü\u00028BX\u0002¢\u0006\u0010\n\u0006\bÝ\u0002\u0010Ø\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002R!\u0010å\u0002\u001a\u00030á\u00028BX\u0002¢\u0006\u0010\n\u0006\bâ\u0002\u0010Ø\u0002\u001a\u0006\bã\u0002\u0010ä\u0002R)\u0010ë\u0002\u001a\u0014\u0012\u000f\u0012\r è\u0002*\u0005\u0018\u00010ç\u00020ç\u00020æ\u00028\u0002X\u0004¢\u0006\b\n\u0006\bé\u0002\u0010ê\u0002R\u0017\u0010í\u0002\u001a\u00020D8BX\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010Ì\u0002R\u0019\u0010ï\u0002\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\b\u001a\u0006\bî\u0002\u0010È\u0002¨\u0006ò\u0002"}, d2 = {"Lcom/ingka/ikea/app/cart/CartFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "g1", "G2", "A2", "b2", "", "itemNo", "", "newQuantity", "u2", "(Ljava/lang/String;I)V", "f2", "Lcom/ingka/ikea/app/cart/a;", "result", "P1", "(Lcom/ingka/ikea/app/cart/a;)V", "Llm/d;", "Q1", "(Llm/d;)V", "Lcom/ingka/ikea/app/inappfeedback/i;", "W1", "(Lcom/ingka/ikea/app/inappfeedback/i;)V", "s2", "g2", "LOf/z$k;", "event", "l2", "(LOf/z$k;)V", "LOf/z$f;", "i2", "(LOf/z$f;)V", "LOf/z$r;", "p2", "(LOf/z$r;)V", "Ltl/c;", "tab", "j2", "(Ltl/c;)V", "Lhg/q$a$a;", "action", "h2", "(Lhg/q$a$a;)V", "K2", "Z1", "i1", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "C2", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "z2", "(Ljava/lang/String;)V", "LOf/z$l;", "m2", "(LOf/z$l;)V", "J2", "LOf/z;", "R1", "(LOf/z;)V", "phoneNumber", "y2", "Lhg/q$f$b;", "T1", "(Lhg/q$f$b;)V", "", "shouldStartCheckout", "D2", "(Z)V", "B2", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "postalCodePickerConfig", "w2", "(Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;)V", "LOp/Z0;", "t2", "(LOp/Z0;)V", "LOp/Z0$c;", "r2", "(LOp/Z0$c;)V", "productName", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "analytics", "q2", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;)V", "Lcom/ingka/ikea/app/inappfeedback/e;", "feedbackArguments", "H2", "(Lcom/ingka/ikea/app/inappfeedback/e;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "O1", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;)V", "Lcom/ingka/ikea/app/cart/availability/b;", "X1", "(Lcom/ingka/ikea/app/cart/availability/b;)V", "LOf/a;", "availabilityCallbackAction", "x2", "(LOf/a;)V", "E2", "Lme/b;", "N1", "(Lme/b;)V", "LOf/z$o;", "productItemEvent", "S1", "(LOf/z$o;)V", "I2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "E0", "outState", "onSaveInstanceState", "onResume", "onStart", "LAe/e;", "X", "LAe/e;", "m1", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "LLf/b;", "Y", "LLf/b;", "p1", "()LLf/b;", "setCartAnalytics", "(LLf/b;)V", "cartAnalytics", "LSA/a;", "Z", "LSA/a;", "K1", "()LSA/a;", "setShoppingListSharedAnalytics", "(LSA/a;)V", "shoppingListSharedAnalytics", "LZw/a;", "y0", "LZw/a;", "F1", "()LZw/a;", "setPipNavigation", "(LZw/a;)V", "pipNavigation", "LAr/j;", "z0", "LAr/j;", "getFeedback", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LEo/a;", "A0", "LEo/a;", "w1", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LNf/d;", "B0", "LNf/d;", "t1", "()LNf/d;", "setCheckoutInteractor$cart_implementation_release", "(LNf/d;)V", "checkoutInteractor", "LMn/e;", "C0", "LMn/e;", "u1", "()LMn/e;", "setCheckoutNavigation", "(LMn/e;)V", "checkoutNavigation", "LNf/b;", "LNf/b;", "B1", "()LNf/b;", "setFeedbackInteractor$cart_implementation_release", "(LNf/b;)V", "feedbackInteractor", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "C1", "()Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "setInformationMessageNavigation", "(Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;)V", "informationMessageNavigation", "LKf/b;", "F0", "LKf/b;", "q1", "()LKf/b;", "setCartApi", "(LKf/b;)V", "cartApi", "LZf/k;", "G0", "LZf/k;", "r1", "()LZf/k;", "setCartNavigation", "(LZf/k;)V", "cartNavigation", "LIl/a;", "H0", "LIl/a;", "n1", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "Liq/a;", "I0", "Liq/a;", "A1", "()Liq/a;", "setEnergyLabelNavigation", "(Liq/a;)V", "energyLabelNavigation", "LTu/a;", "J0", "LTu/a;", "D1", "()LTu/a;", "setItemAvailabilityNavigation", "(LTu/a;)V", "itemAvailabilityNavigation", "LgE/c;", "K0", "LgE/c;", "M1", "()LgE/c;", "setZipSelectorNavigation", "(LgE/c;)V", "zipSelectorNavigation", "LNd/c;", "L0", "LNd/c;", "j1", "()LNd/c;", "setAbTesting", "(LNd/c;)V", "abTesting", "LMB/a;", "M0", "LMB/a;", "L1", "()LMB/a;", "setStorePickerNavigation", "(LMB/a;)V", "storePickerNavigation", "LRd/a;", "N0", "LRd/a;", "k1", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "Lme/a;", "O0", "Lme/a;", "l1", "()Lme/a;", "setAddressPickerNavigation", "(Lme/a;)V", "addressPickerNavigation", "Lay/a;", "P0", "Lay/a;", "H1", "()Lay/a;", "setReassuranceNavigation", "(Lay/a;)V", "reassuranceNavigation", "LAy/c;", "Q0", "LAy/c;", "I1", "()LAy/c;", "setScanAndGoCartNavigation", "(LAy/c;)V", "scanAndGoCartNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "R0", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "E1", "()Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "setListPickerNavigation", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "listPickerNavigation", "Lrx/b;", "S0", "Lrx/b;", "G1", "()Lrx/b;", "setProductConfiguratorNavigation", "(Lrx/b;)V", "productConfiguratorNavigation", "LQA/d;", "T0", "LQA/d;", "J1", "()LQA/d;", "setShoppingListNavigation", "(LQA/d;)V", "shoppingListNavigation", "Lkotlin/Function0;", "U0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "V0", "Ljava/lang/String;", "x1", "()Ljava/lang/String;", "destId", "W0", "v0", "()Z", "drawUnderStatusBar", "X0", "u0", "drawUnderNavigationBar", "Y0", "t0", "drawUnderDisplayCutout", "Z0", "startCheckoutAfterPostalCodeInput", "Lhg/v;", "a1", "LXH/o;", "s1", "()Lhg/v;", "cartViewModel", "Lhg/F;", "b1", "z1", "()Lhg/F;", "editPostalCodeViewModel", "Lhg/A;", "c1", "v1", "()Lhg/A;", "combinedCartViewModel", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "d1", "Lg/c;", "launchCheckoutActivity", "o1", "autoNavigate", "y1", "dynamicLinkViewValue", "e1", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CartFragment extends d {

    /* renamed from: e1  reason: collision with root package name */
    public static final a f71601e1 = new a((DefaultConstructorMarker) null);

    /* renamed from: f1  reason: collision with root package name */
    public static final int f71602f1 = 8;

    /* renamed from: A0  reason: collision with root package name */
    public Eo.a f71603A0;

    /* renamed from: B0  reason: collision with root package name */
    public Nf.d f71604B0;

    /* renamed from: C0  reason: collision with root package name */
    public Mn.e f71605C0;

    /* renamed from: D0  reason: collision with root package name */
    public Nf.b f71606D0;

    /* renamed from: E0  reason: collision with root package name */
    public InformationMessageNavigation f71607E0;

    /* renamed from: F0  reason: collision with root package name */
    public C9133b f71608F0;

    /* renamed from: G0  reason: collision with root package name */
    public Zf.k f71609G0;

    /* renamed from: H0  reason: collision with root package name */
    public Il.a f71610H0;

    /* renamed from: I0  reason: collision with root package name */
    public C11411a f71611I0;

    /* renamed from: J0  reason: collision with root package name */
    public Tu.a f71612J0;

    /* renamed from: K0  reason: collision with root package name */
    public C14516c f71613K0;

    /* renamed from: L0  reason: collision with root package name */
    public Nd.c f71614L0;

    /* renamed from: M0  reason: collision with root package name */
    public C13194a f71615M0;

    /* renamed from: N0  reason: collision with root package name */
    public Rd.a f71616N0;

    /* renamed from: O0  reason: collision with root package name */
    public C10038a f71617O0;

    /* renamed from: P0  reason: collision with root package name */
    public C13992a f71618P0;

    /* renamed from: Q0  reason: collision with root package name */
    public Ay.c f71619Q0;

    /* renamed from: R0  reason: collision with root package name */
    public ListPickerNavigation f71620R0;

    /* renamed from: S0  reason: collision with root package name */
    public C15005b f71621S0;

    /* renamed from: T0  reason: collision with root package name */
    public C13352d f71622T0;

    /* renamed from: U0  reason: collision with root package name */
    private final C17631a<C16807N> f71623U0 = new Kf.h(this);

    /* renamed from: V0  reason: collision with root package name */
    private final String f71624V0 = "cart/cart?view={view}&autoNavigate={autoNavigate}";

    /* renamed from: W0  reason: collision with root package name */
    private final boolean f71625W0;

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f71626X;

    /* renamed from: X0  reason: collision with root package name */
    private final boolean f71627X0;

    /* renamed from: Y  reason: collision with root package name */
    public Lf.b f71628Y;

    /* renamed from: Y0  reason: collision with root package name */
    private final boolean f71629Y0;

    /* renamed from: Z  reason: collision with root package name */
    public C13560a f71630Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f71631Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final C16824o f71632a1;

    /* renamed from: b1  reason: collision with root package name */
    private final C16824o f71633b1;

    /* renamed from: c1  reason: collision with root package name */
    private final C16824o f71634c1;

    /* renamed from: d1  reason: collision with root package name */
    private final C5314c<Intent> f71635d1;

    /* renamed from: y0  reason: collision with root package name */
    public Zw.a f71636y0;

    /* renamed from: z0  reason: collision with root package name */
    public Ar.j f71637z0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/CartFragment$a;", "", "<init>", "()V", "", "REQUEST_KEY_LIST_PICKER_MOVE_ALL", "Ljava/lang/String;", "REQUEST_KEY_LIST_PICKER_ADD_OR_REMOVE", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<C9230z, C16807N> {
        b(Object obj) {
            super(1, obj, CartFragment.class, "handleCartScreenEvent", "handleCartScreenEvent(Lcom/ingka/ikea/app/cart/compose/CartScreenEvent;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C9230z) obj);
            return C16807N.f139792a;
        }

        public final void t(C9230z zVar) {
            C17542s.j(zVar, "p0");
            ((CartFragment) this.receiver).R1(zVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<q.f.b, C16807N> {
        c(Object obj) {
            super(1, obj, CartFragment.class, "handleNavigationAction", "handleNavigationAction(Lcom/ingka/ikea/app/cart/viewmodel/CartState$NavigationAction$FragmentNavigation;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((q.f.b) obj);
            return C16807N.f139792a;
        }

        public final void t(q.f.b bVar) {
            C17542s.j(bVar, "p0");
            ((CartFragment) this.receiver).T1(bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f71638a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f71639b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f71640c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f71641d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f71642e;

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int[] f71643f;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|(2:23|24)|25|27|28|29|30|(2:31|32)|33|35|36|37|38|(2:39|40)|41|43|44|45|46|(2:47|48)|49|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|35|36|37|38|39|40|41|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|35|36|37|38|39|40|41|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        static {
            /*
                Mn.d$a[] r0 = Mn.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Mn.d$a r2 = Mn.d.a.START_CHECKOUT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f71638a = r0
                com.ingka.ikea.app.cart.a$a[] r0 = com.ingka.ikea.app.cart.a.C1226a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.cart.a$a r2 = com.ingka.ikea.app.cart.a.C1226a.CHANGE_POSTAL_CODE     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r2 = 2
                com.ingka.ikea.app.cart.a$a r3 = com.ingka.ikea.app.cart.a.C1226a.CHANGE_STORE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 3
                com.ingka.ikea.app.cart.a$a r4 = com.ingka.ikea.app.cart.a.C1226a.SELECT_HOME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ingka.ikea.app.cart.a$a r4 = com.ingka.ikea.app.cart.a.C1226a.SELECT_CLICK_COLLECT     // Catch:{ NoSuchFieldError -> 0x003c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.ingka.ikea.app.cart.a$a r4 = com.ingka.ikea.app.cart.a.C1226a.EXPLAIN_DISCREPANCY     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                f71639b = r0
                tl.c[] r0 = tl.C11923c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                tl.c r4 = tl.C11923c.ONLINE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                tl.c r4 = tl.C11923c.STORE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                f71640c = r0
                hg.q$a$a[] r0 = hg.q.a.C1291a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hg.q$a$a r4 = hg.q.a.C1291a.SHOW_DETAILS     // Catch:{ NoSuchFieldError -> 0x006f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                hg.q$a$a r4 = hg.q.a.C1291a.ADD_POSTAL_CODE     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                hg.q$a$a r4 = hg.q.a.C1291a.SHOW_ASSEMBLY_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x007f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                f71641d = r0
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b[] r0 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r4 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.MANUAL     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r4 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.NATIVE_GOOGLE     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r4 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.ADDRESS_LOOKUP     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                f71642e = r0
                Of.a[] r0 = Of.C9155a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Of.a r4 = Of.C9155a.POSTAL_CODE     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                Of.a r1 = Of.C9155a.STORE     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                Of.a r1 = Of.C9155a.COMPARE     // Catch:{ NoSuchFieldError -> 0x00c1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c1 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c1 }
            L_0x00c1:
                f71643f = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.CartFragment.d.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeActions$2", f = "CartFragment.kt", l = {718}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CartFragment f71645d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeActions$2$1", f = "CartFragment.kt", l = {719}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f71646c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ CartFragment f71647d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.app.cart.CartFragment$e$a$a  reason: collision with other inner class name */
            static final class C1225a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CartFragment f71648a;

                C1225a(CartFragment cartFragment) {
                    this.f71648a = cartFragment;
                }

                /* renamed from: c */
                public final Object emit(hg.r rVar, C17164e<? super C16807N> eVar) {
                    Context context = this.f71648a.getContext();
                    if (context != null) {
                        CartFragment cartFragment = this.f71648a;
                        if (rVar instanceof r.a) {
                            C9133b q12 = cartFragment.q1();
                            r.a aVar = (r.a) rVar;
                            Throwable b10 = aVar.b();
                            String a10 = aVar.a();
                            View requireView = cartFragment.requireView();
                            C17542s.i(requireView, "requireView(...)");
                            q12.showAddToCartException(context, requireView, b10, a10);
                        } else if (rVar instanceof r.b) {
                            v.s0(cartFragment.s1(), ((r.b) rVar).a(), (J0) null, (K.b.a) null, 6, (Object) null);
                        } else if (rVar != null) {
                            throw new XH.t();
                        }
                    }
                    this.f71648a.s1().S0();
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(CartFragment cartFragment, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f71647d = cartFragment;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f71647d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f71646c;
                if (i10 == 0) {
                    y.b(obj);
                    C16519P<hg.r> y10 = this.f71647d.s1().y();
                    C1225a aVar = new C1225a(this.f71647d);
                    this.f71646c = 1;
                    if (y10.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y.b(obj);
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CartFragment cartFragment, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f71645d = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f71645d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f71644c;
            if (i10 == 0) {
                y.b(obj);
                CartFragment cartFragment = this.f71645d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(cartFragment, (C17164e<? super a>) null);
                this.f71644c = 1;
                if (androidx.lifecycle.Q.b(cartFragment, bVar, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeNavigationResult$$inlined$consumeResult$1", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<ListPickerNavigation.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71649c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71650d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71651e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71652f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CartFragment f71653g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C8948l lVar, String str, C17164e eVar, CartFragment cartFragment) {
            super(2, eVar);
            this.f71651e = lVar;
            this.f71652f = str;
            this.f71653g = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f71651e, this.f71652f, eVar, this.f71653g);
            fVar.f71650d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(ListPickerNavigation.b bVar, C17164e<? super C16807N> eVar) {
            return ((f) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71649c == 0) {
                y.b(obj);
                Object obj2 = this.f71650d;
                if (obj2 != null) {
                    ListPickerNavigation.b bVar = (ListPickerNavigation.b) obj2;
                    CartFragment cartFragment = this.f71653g;
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Move all list fragment result: " + bVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = cartFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar2.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    this.f71653g.O1(bVar);
                    this.f71651e.h().m(this.f71652f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeNavigationResult$$inlined$consumeResult$2", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71654c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71655d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71656e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71657f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CartFragment f71658g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C8948l lVar, String str, C17164e eVar, CartFragment cartFragment) {
            super(2, eVar);
            this.f71656e = lVar;
            this.f71657f = str;
            this.f71658g = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f71656e, this.f71657f, eVar, this.f71658g);
            gVar.f71655d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, C17164e<? super C16807N> eVar) {
            return ((g) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71654c == 0) {
                y.b(obj);
                Object obj2 = this.f71655d;
                if (obj2 != null) {
                    a aVar = (a) obj2;
                    CartFragment cartFragment = this.f71658g;
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Availability result: " + aVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = cartFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    this.f71658g.P1(aVar);
                    this.f71656e.h().m(this.f71657f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeNavigationResult$$inlined$consumeResult$3", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<com.ingka.ikea.app.cart.availability.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71659c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71660d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71661e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71662f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CartFragment f71663g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C8948l lVar, String str, C17164e eVar, CartFragment cartFragment) {
            super(2, eVar);
            this.f71661e = lVar;
            this.f71662f = str;
            this.f71663g = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f71661e, this.f71662f, eVar, this.f71663g);
            hVar.f71660d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(com.ingka.ikea.app.cart.availability.b bVar, C17164e<? super C16807N> eVar) {
            return ((h) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71659c == 0) {
                y.b(obj);
                Object obj2 = this.f71660d;
                if (obj2 != null) {
                    this.f71663g.X1((com.ingka.ikea.app.cart.availability.b) obj2);
                    this.f71661e.h().m(this.f71662f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeNavigationResult$$inlined$consumeResult$4", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<lm.d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71664c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71665d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71666e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71667f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CartFragment f71668g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C8948l lVar, String str, C17164e eVar, CartFragment cartFragment) {
            super(2, eVar);
            this.f71666e = lVar;
            this.f71667f = str;
            this.f71668g = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f71666e, this.f71667f, eVar, this.f71668g);
            iVar.f71665d = obj;
            return iVar;
        }

        /* renamed from: i */
        public final Object invoke(lm.d dVar, C17164e<? super C16807N> eVar) {
            return ((i) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71664c == 0) {
                y.b(obj);
                Object obj2 = this.f71665d;
                if (obj2 != null) {
                    this.f71668g.Q1((lm.d) obj2);
                    this.f71666e.h().m(this.f71667f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeNavigationResult$$inlined$consumeResult$5", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<C14515b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71669c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71670d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71671e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71672f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CartFragment f71673g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C8948l lVar, String str, C17164e eVar, CartFragment cartFragment) {
            super(2, eVar);
            this.f71671e = lVar;
            this.f71672f = str;
            this.f71673g = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f71671e, this.f71672f, eVar, this.f71673g);
            jVar.f71670d = obj;
            return jVar;
        }

        /* renamed from: i */
        public final Object invoke(C14515b bVar, C17164e<? super C16807N> eVar) {
            return ((j) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71669c == 0) {
                y.b(obj);
                Object obj2 = this.f71670d;
                if (obj2 != null) {
                    C14515b bVar = (C14515b) obj2;
                    if (!C17542s.e(bVar, C14515b.a.f127306a)) {
                        if (bVar instanceof C14515b.C3121b) {
                            this.f71673g.s2();
                        } else {
                            throw new XH.t();
                        }
                    }
                    this.f71671e.h().m(this.f71672f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.CartFragment$observeNavigationResult$$inlined$consumeResult$6", f = "CartFragment.kt", l = {}, m = "invokeSuspend")
    public static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Mn.d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f71674c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f71675d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f71676e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f71677f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ CartFragment f71678g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C8948l lVar, String str, C17164e eVar, CartFragment cartFragment) {
            super(2, eVar);
            this.f71676e = lVar;
            this.f71677f = str;
            this.f71678g = cartFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f71676e, this.f71677f, eVar, this.f71678g);
            kVar.f71675d = obj;
            return kVar;
        }

        /* renamed from: i */
        public final Object invoke(Mn.d dVar, C17164e<? super C16807N> eVar) {
            return ((k) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f71674c == 0) {
                y.b(obj);
                Object obj2 = this.f71675d;
                if (obj2 != null) {
                    Mn.d dVar = (Mn.d) obj2;
                    CartFragment cartFragment = this.f71678g;
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Checkout fragment result: " + dVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = cartFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    if (d.f71638a[dVar.a().ordinal()] == 1) {
                        this.f71678g.J2();
                        this.f71676e.h().m(this.f71677f, null);
                    } else {
                        throw new XH.t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class l implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71680b;

        public l(C5187o oVar, String str) {
            this.f71679a = oVar;
            this.f71680b = str;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            return androidx.navigation.fragment.a.a(this.f71679a).E(this.f71680b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class m implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f71681a;

        public m(C16824o oVar) {
            this.f71681a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return rw.a.c(this.f71681a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class n implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71682a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f71683b;

        public n(C5187o oVar, C16824o oVar2) {
            this.f71682a = oVar;
            this.f71683b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f71682a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.b(requireActivity, rw.a.c(this.f71683b));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class o implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71684a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71685b;

        public o(C5187o oVar, String str) {
            this.f71684a = oVar;
            this.f71685b = str;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            return androidx.navigation.fragment.a.a(this.f71684a).E(this.f71685b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class p implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f71686a;

        public p(C16824o oVar) {
            this.f71686a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return rw.a.c(this.f71686a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class q implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f71688b;

        public q(C5187o oVar, C16824o oVar2) {
            this.f71687a = oVar;
            this.f71688b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f71687a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.b(requireActivity, rw.a.c(this.f71688b));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class r implements C17631a<C8948l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71690b;

        public r(C5187o oVar, String str) {
            this.f71689a = oVar;
            this.f71690b = str;
        }

        /* renamed from: a */
        public final C8948l invoke() {
            return androidx.navigation.fragment.a.a(this.f71689a).E(this.f71690b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class s implements C17631a<j0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16824o f71691a;

        public s(C16824o oVar) {
            this.f71691a = oVar;
        }

        /* renamed from: a */
        public final j0 invoke() {
            return rw.a.c(this.f71691a).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class t implements C17631a<i0.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f71692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16824o f71693b;

        public t(C5187o oVar, C16824o oVar2) {
            this.f71692a = oVar;
            this.f71693b = oVar2;
        }

        /* renamed from: a */
        public final i0.c invoke() {
            C5191t requireActivity = this.f71692a.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            return e3.a.b(requireActivity, rw.a.c(this.f71693b));
        }
    }

    public CartFragment() {
        C16824o b10 = C16825p.b(new l(this, "cart"));
        this.f71632a1 = W.c(this, P.b(v.class), new m(b10), (C17631a) null, new n(this, b10), 4, (Object) null);
        C16824o b11 = C16825p.b(new o(this, "cart"));
        this.f71633b1 = W.c(this, P.b(F.class), new p(b11), (C17631a) null, new q(this, b11), 4, (Object) null);
        C16824o b12 = C16825p.b(new r(this, "cart"));
        this.f71634c1 = W.c(this, P.b(C9788A.class), new s(b12), (C17631a) null, new t(this, b12), 4, (Object) null);
        C5314c<Intent> registerForActivityResult = registerForActivityResult(new C5406d(), new Kf.m(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f71635d1 = registerForActivityResult;
    }

    private final void A2() {
        e.c.b(m1(), Interaction$Component.CART_MANAGE_UNAVAILABLE_ITEMS, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        if (s1().N0()) {
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                r1().i(f10);
                return;
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("No unavailable items when trying to open it");
        qv.e eVar = qv.e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
    }

    private final void B2() {
        C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C14516c.a.a(M1(), f10, false, (String) null, 4, (Object) null);
        }
    }

    private final void C2(String str, Interaction$Component interaction$Component) {
        C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            F1().a(f10, str, interaction$Component);
        }
    }

    private final void D2(boolean z10) {
        this.f71631Z0 = z10;
        PostalCodePickerConfig E10 = z1().E();
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("openPostalCodePicker, config: " + E10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        int i10 = d.f71642e[E10.i().ordinal()];
        if (i10 == 1) {
            B2();
        } else if (i10 == 2 || i10 == 3) {
            w2(E10);
        } else {
            throw new XH.t();
        }
    }

    private final void E2(String str) {
        C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C13194a.C2742a.a(L1(), f10, StorageType.LOCAL, str, false, (String) null, (C) null, 56, (Object) null);
        }
    }

    static /* synthetic */ void F2(CartFragment cartFragment, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        cartFragment.E2(str);
    }

    private final void G2() {
        Z1();
        b2();
        f2();
    }

    private final void H2(com.ingka.ikea.app.inappfeedback.e eVar) {
        Nf.b B12 = B1();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        B12.a(parentFragmentManager, "request_key_checkout_survey", eVar);
    }

    private final void I2() {
        C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            InformationMessageNavigation C12 = C1();
            String string = getString(Oo.b.f84655h0);
            C17542s.i(string, "getString(...)");
            String string2 = getString(Oo.b.f84644g0);
            C17542s.i(string2, "getString(...)");
            C12.a(f10, new InformationMessageNavigation.Data.b(string, string2, getString(Oo.b.f84616d5)));
        }
    }

    /* access modifiers changed from: private */
    public final void J2() {
        String str;
        String str2;
        Object obj;
        String str3;
        char c10;
        Context context = getContext();
        String str4 = DslKt.INDICATOR_BACKGROUND;
        String str5 = DslKt.INDICATOR_MAIN;
        char c11 = '$';
        Class<CartFragment> cls = CartFragment.class;
        if (context == null) {
            IllegalStateException illegalStateException = new IllegalStateException("No context when trying to start checkout");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar : arrayList) {
                if (str6 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str6 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str8 = str6;
                if (str7 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str5 : str4) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str9 = str7;
                bVar.a(eVar, str9, false, illegalStateException, str8);
                str7 = str9;
                str6 = str8;
                eVar = eVar;
                c11 = '$';
            }
            return;
        }
        s1().U0(true);
        UserPostalCodeAddress D10 = z1().D();
        if (D10 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Unable to start checkout, no postal code");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str10 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException2);
                    if (a11 != null) {
                        str10 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str11 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str5 : str4) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                String str12 = str11;
                bVar2.a(eVar2, str12, false, illegalStateException2, str10);
                str11 = str12;
            }
            return;
        }
        Mn.c F02 = s1().F0(D10);
        if (F02 == null) {
            IllegalStateException illegalStateException3 = new IllegalStateException("Unable to start checkout");
            qv.e eVar3 = qv.e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str13 = null;
            String str14 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str13 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException3);
                    if (a12 != null) {
                        str13 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str14 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str5 : str4) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                String str15 = str14;
                bVar3.a(eVar3, str15, false, illegalStateException3, str13);
                str14 = str15;
            }
            return;
        }
        t1().a(context, F02, this.f71635d1);
        C16807N n10 = C16807N.f139792a;
        qv.e eVar4 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList4 = new ArrayList<>();
        for (Object next4 : qv.d.f102012a.a()) {
            if (((C11819b) next4).b(eVar4, false)) {
                arrayList4.add(next4);
            }
        }
        String str16 = null;
        String str17 = null;
        for (C11819b bVar4 : arrayList4) {
            if (str16 == null) {
                String e10 = F02.e();
                boolean z10 = e10 == null || e10.length() == 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Start checkout, has checkout id: ");
                sb2.append(!z10);
                String a13 = C11818a.a(sb2.toString(), (Throwable) null);
                if (a13 != null) {
                    str16 = C11820c.a(a13);
                } else {
                    return;
                }
            }
            String str18 = str16;
            if (str17 == null) {
                String name4 = cls.getName();
                C17542s.g(name4);
                str2 = str4;
                obj = null;
                str = str5;
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name4;
                c10 = 2;
            } else {
                str2 = str4;
                str = str5;
                c10 = 2;
                obj = null;
                str3 = str17;
            }
            bVar4.a(eVar4, str3, false, (Throwable) null, str18);
            str17 = str3;
            str16 = str18;
            str5 = str;
            Object obj2 = obj;
            char c12 = c10;
            str4 = str2;
        }
    }

    private final void K2() {
        boolean F10 = z1().F();
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Go to checkout clicked, hasValidPostalCodeData: " + F10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (F10) {
            J2();
        } else {
            D2(true);
        }
    }

    private final void N1(me.b bVar) {
        if (C17542s.e(bVar, b.a.f75354a)) {
            return;
        }
        if (bVar instanceof b.C1380b) {
            z1().H(((b.C1380b) bVar).a());
            s2();
        } else if (bVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown result");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CartFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void O1(ListPickerNavigation.b bVar) {
        if (bVar instanceof ListPickerNavigation.b.a) {
            return;
        }
        if (bVar instanceof ListPickerNavigation.b.d) {
            s1().Q0(((ListPickerNavigation.b.d) bVar).c());
            return;
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public final void P1(a aVar) {
        int i10 = d.f71639b[aVar.a().ordinal()];
        if (i10 == 1) {
            D2(false);
        } else if (i10 == 2) {
            F2(this, (String) null, 1, (Object) null);
        } else if (i10 == 3) {
            s1().R0(C10243d.HOME);
        } else if (i10 == 4) {
            s1().R0(C10243d.CLICK_AND_COLLECT);
        } else if (i10 == 5) {
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                D1().a(f10);
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void Q1(lm.d dVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Back in stock notifications fragment result: " + dVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (dVar instanceof d.a) {
            E2(((d.a) dVar).a());
        } else if (dVar instanceof d.b) {
            v.s0(s1(), C13026h.a(((d.b) dVar).a()), (J0) null, (K.b.a) null, 6, (Object) null);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void R1(C9230z zVar) {
        C9230z zVar2 = zVar;
        if (zVar2 instanceof C9230z.c) {
            h2(((C9230z.c) zVar2).a());
        } else if (zVar2 instanceof C9230z.d) {
            x2(((C9230z.d) zVar2).a());
        } else if (C17542s.e(zVar2, C9230z.e.f62691a)) {
            D2(false);
        } else if (zVar2 instanceof C9230z.f) {
            i2((C9230z.f) zVar2);
        } else if (C17542s.e(zVar2, C9230z.g.f62695a)) {
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                r1().k(f10);
            }
        } else if (zVar2 instanceof C9230z.k) {
            l2((C9230z.k) zVar2);
        } else if (zVar2 instanceof C9230z.n) {
            t2(((C9230z.n) zVar2).a());
        } else if (zVar2 instanceof C9230z.o) {
            S1((C9230z.o) zVar2);
        } else if (zVar2 instanceof C9230z.r) {
            p2((C9230z.r) zVar2);
        } else if (C17542s.e(zVar2, C9230z.s.f62719a)) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Manage unavailable items clicked", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CartFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            A2();
        } else if (C17542s.e(zVar2, C9230z.i.f62697a)) {
            g2();
        } else if (zVar2 instanceof C9230z.h) {
            j2(((C9230z.h) zVar2).a());
        } else if (zVar2 instanceof C9230z.l) {
            m2((C9230z.l) zVar2);
        } else if (zVar2 instanceof C9230z.a) {
            s1().W0((C9230z.a) zVar2);
        } else if (zVar2 instanceof C9230z.j) {
            s1().P0(v.C9804a.c.b.f74016a);
        } else if (zVar2 instanceof C9230z.b) {
            C9230z.b bVar2 = (C9230z.b) zVar2;
            s1().f0(bVar2.c());
            e.c.b(m1(), Interaction$Component.FAMILY_REWARDS_USE_FAMILY_REWARD, (String) null, X.m(C16796C.a("id", Integer.valueOf(getId())), C16796C.a("app_location", "cart"), C16796C.a("component_value", bVar2.b()), C16796C.a("type", bVar2.a()), C16796C.a("enabled", "on")), (e.b) null, 10, (Object) null);
        } else if (zVar2 instanceof C9230z.p) {
            C9230z.p pVar = (C9230z.p) zVar2;
            s1().i0(pVar.c());
            e.c.b(m1(), Interaction$Component.FAMILY_REWARDS_USE_FAMILY_REWARD, (String) null, X.m(C16796C.a("id", Integer.valueOf(getId())), C16796C.a("app_location", "cart"), C16796C.a("component_value", pVar.b()), C16796C.a("type", pVar.a()), C16796C.a("enabled", "off")), (e.b) null, 10, (Object) null);
        } else if (C17542s.e(zVar2, C9230z.q.f62715a)) {
            s1().y0();
        } else if (zVar2 instanceof C9230z.m) {
            y2(((C9230z.m) zVar2).a());
        } else {
            throw new XH.t();
        }
    }

    private final void S1(C9230z.o oVar) {
        String str;
        char c10;
        String str2;
        Iterator it;
        c1 c11 = oVar.c();
        if (c11 instanceof c1.a) {
            c1.a aVar = (c1.a) c11;
            s1().e0(new Kf.y(aVar.b(), 1), aVar.c(), new v.C9805b(oVar.a(), oVar.b()));
        } else if (c11 instanceof c1.c) {
            z2(((c1.c) c11).a());
        } else if (c11 instanceof c1.d) {
            c1.d dVar = (c1.d) c11;
            q2(dVar.b(), dVar.a(), new ListPickerNavigation.Operation.Analytics(Interaction$Component.UPSELL, Ae.k.BUTTON));
            K1().d(dVar.a());
        } else if (c11 instanceof c1.e) {
            C2(((c1.e) c11).a(), Interaction$Component.UPSELL);
        } else if (c11 instanceof c1.b) {
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                G1().h(f10, ((c1.b) c11).a(), C15004a.LIST_CART_ACTIONS);
            }
        } else if (c11 instanceof c1.f) {
            Link a10 = ((c1.f) c11).a();
            if (a10 instanceof Link.External) {
                w1().a(requireActivity(), ((Link.External) a10).e());
                return;
            }
            Class<CartFragment> cls = CartFragment.class;
            if (a10 instanceof Link.Deeplink) {
                try {
                    C8951o f11 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
                    if (f11 != null) {
                        Uri parse = Uri.parse(((Link.Deeplink) a10).e());
                        C17542s.i(parse, "parse(...)");
                        f11.X(parse);
                        C16807N n10 = C16807N.f139792a;
                    }
                } catch (ActivityNotFoundException e10) {
                    qv.e eVar = qv.e.ERROR;
                    ArrayList arrayList = new ArrayList();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    String str3 = null;
                    String str4 = null;
                    while (it2.hasNext()) {
                        C11819b bVar = (C11819b) it2.next();
                        if (str3 == null) {
                            String a11 = C11818a.a("No Activity found to handle Intent with url: " + ((Link.Deeplink) a10).e(), e10);
                            if (a11 == null) {
                                break;
                            }
                            str3 = C11820c.a(a11);
                        }
                        if (str4 == null) {
                            String name = cls.getName();
                            C17542s.g(name);
                            it = it2;
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            it = it2;
                        }
                        qv.e eVar2 = eVar;
                        bVar.a(eVar, str4, false, e10, str3);
                        it2 = it;
                    }
                    C16807N n11 = C16807N.f139792a;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported product info url.");
                String str5 = "Unsupported url: " + a10.e();
                qv.e eVar3 = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar3, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str7 == null) {
                        String a12 = C11818a.a((String) null, illegalArgumentException);
                        if (a12 != null) {
                            str7 = C11820c.a(a12);
                        } else {
                            return;
                        }
                    }
                    if (str6 == null) {
                        if (str5 == null) {
                            str2 = cls.getName();
                            C17542s.g(str2);
                            str = str5;
                            c10 = 2;
                            String o13 = C15854t.o1(C15854t.s1(str2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                str2 = C15854t.P0(o13, "Kt");
                            }
                        } else {
                            str = str5;
                            c10 = 2;
                            str2 = str;
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str2;
                    } else {
                        str = str5;
                        c10 = 2;
                    }
                    char c12 = c10;
                    bVar2.a(eVar3, str6, false, illegalArgumentException, str7);
                    str5 = str;
                }
            }
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final void T1(q.f.b bVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar2 : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("onNavigationAction: " + bVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (bVar instanceof q.f.b.a) {
            D2(((q.f.b.a) bVar).a());
        } else if (bVar instanceof q.f.b.c) {
            rw.f.d(this, x1(), new u(this, bVar));
        } else if (C17542s.e(bVar, q.f.b.d.f73816a)) {
            K2();
        } else if (bVar instanceof q.f.b.C1305b) {
            rw.f.d(this, x1(), new Kf.i(this, bVar));
        } else {
            throw new XH.t();
        }
        s1().P0(v.C9804a.b.C1310a.f74014a);
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(CartFragment cartFragment, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        for (C11819b bVar2 : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Add or remove list fragment result: " + bVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "cart shopping list modified";
            }
            String str5 = str3;
            bVar2.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            if (cVar != null) {
                str = cVar.b();
            }
            if (str == null) {
                str = "";
            }
            cartFragment.s1().P0(new v.C9804a.c.C1312c(new C15035a(dVar.a(), dVar.b(), dVar.c(), str)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U1(CartFragment cartFragment, q.f.b bVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        cartFragment.u1().a(oVar, ((q.f.b.c) bVar).a(), rw.c.f28698a.d().a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V1(CartFragment cartFragment, q.f.b bVar, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C13352d.a.a(cartFragment.J1(), oVar, ((q.f.b.C1305b) bVar).a(), false, (C) null, 8, (Object) null);
        return C16807N.f139792a;
    }

    private final void W1(com.ingka.ikea.app.inappfeedback.i iVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Survey fragment result: " + iVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (iVar instanceof i.a) {
            return;
        }
        if (iVar instanceof i.b) {
            s1().o0(System.currentTimeMillis());
            return;
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public final void X1(com.ingka.ikea.app.cart.availability.b bVar) {
        if (C17542s.e(bVar, b.a.f71765a)) {
            K2();
            return;
        }
        throw new XH.t();
    }

    /* access modifiers changed from: private */
    public static final void Y1(CartFragment cartFragment, C5312a aVar) {
        C17542s.j(aVar, "result");
        int b10 = aVar.b();
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("checkout activity result, resultCode: " + b10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = cartFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (b10 == 8679) {
            cartFragment.s1().o0(System.currentTimeMillis());
        } else if (b10 == 9182) {
            cartFragment.s1().P0(v.C9804a.C1308a.b.f74013a);
        } else if (b10 != 9183) {
            cartFragment.s1().g0(System.currentTimeMillis());
        } else {
            cartFragment.s1().P0(v.C9804a.C1308a.C1309a.f74012a);
        }
    }

    private final void Z1() {
        C11410b<C9155a> H02 = s1().H0();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(H02, viewLifecycleOwner, new Kf.r(this));
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        F0 unused = C16314k.d(C5222z.a(viewLifecycleOwner2), (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N a2(CartFragment cartFragment, C9155a aVar) {
        C17542s.j(aVar, "it");
        cartFragment.x2(aVar);
        return C16807N.f139792a;
    }

    private final void b2() {
        C5197z.d(this, "AddressLookupPicker_RequestKey", new Kf.n(this));
        C5197z.d(this, "request_key_checkout_survey", new Kf.o(this));
        C5197z.d(this, "login_signup_promotion_signup", new Kf.p());
    }

    /* access modifiers changed from: private */
    public static final C16807N c2(CartFragment cartFragment, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Address lookup postal code callback", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cartFragment.getClass().getName();
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
        cartFragment.N1((me.b) bundle.getParcelable("AddressLookupPicker_BundleKey"));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(CartFragment cartFragment, String str, Bundle bundle) {
        C17542s.j(str, "requestKey");
        C17542s.j(bundle, "bundle");
        if (C17542s.e(str, "request_key_checkout_survey")) {
            Parcelable parcelable = bundle.getParcelable("FeedbackBottomSheetBundleKey");
            if (parcelable != null) {
                cartFragment.W1((com.ingka.ikea.app.inappfeedback.i) parcelable);
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e2(String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "<unused var>");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(CartFragment cartFragment) {
        cartFragment.G2();
        return C16807N.f139792a;
    }

    private final void f2() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(x1());
            C16519P i10 = E10.h().i("request_key_list_picker_move_all", null);
            androidx.lifecycle.r lifecycle = E10.getLifecycle();
            r.b bVar = r.b.RESUMED;
            C16532g R10 = C16534i.R(C5208k.a(i10, lifecycle, bVar), new f(E10, "request_key_list_picker_move_all", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
            C8948l E11 = androidx.navigation.fragment.a.a(this).E(x1());
            C16532g R11 = C16534i.R(C5208k.a(E11.h().i("CartAvailabilityBottomSheetSheetRequestKey", null), E11.getLifecycle(), bVar), new g(E11, "CartAvailabilityBottomSheetSheetRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
            C8948l E12 = androidx.navigation.fragment.a.a(this).E(x1());
            C16532g R12 = C16534i.R(C5208k.a(E12.h().i("UnavailableItemsDialogRequestKey", null), E12.getLifecycle(), bVar), new h(E12, "UnavailableItemsDialogRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            C16534i.M(R12, C5222z.a(viewLifecycleOwner3));
            C8948l E13 = androidx.navigation.fragment.a.a(this).E(x1());
            C16532g R13 = C16534i.R(C5208k.a(E13.h().i("BackInStockNotificationsRequestKey", null), E13.getLifecycle(), bVar), new i(E13, "BackInStockNotificationsRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner4 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            C16534i.M(R13, C5222z.a(viewLifecycleOwner4));
            C8948l E14 = androidx.navigation.fragment.a.a(this).E(x1());
            C16532g R14 = C16534i.R(C5208k.a(E14.h().i("ManualPostalCodeBottomSheetRequestKey", null), E14.getLifecycle(), bVar), new j(E14, "ManualPostalCodeBottomSheetRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner5 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
            C16534i.M(R14, C5222z.a(viewLifecycleOwner5));
            C8948l E15 = androidx.navigation.fragment.a.a(this).E(x1());
            C16532g R15 = C16534i.R(C5208k.a(E15.h().i("CheckoutFragmentV2RequestKey", null), E15.getLifecycle(), bVar), new k(E15, "CheckoutFragmentV2RequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner6 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
            C16534i.M(R15, C5222z.a(viewLifecycleOwner6));
        }
    }

    private final void g1() {
        if (o1()) {
            v1().F(new Kf.t(this));
        }
    }

    private final void g2() {
        e.c.c(m1(), Ae.j.ACTION_TAP.b(), X.f(C16796C.a("component_value", "cart")), Interaction$Component.CART_CONTINUE_TO_CHECKOUT, (e.b) null, 8, (Object) null);
        K2();
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(CartFragment cartFragment, Uri uri) {
        C17542s.j(uri, "uri");
        androidx.navigation.fragment.a.a(cartFragment).Y(uri, cartFragment.v1().H(uri) ? new C.a().m(true).i("cart/cart?view={view}&autoNavigate={autoNavigate}", true, false).a() : null);
        return C16807N.f139792a;
    }

    private final void h2(q.a.C1291a aVar) {
        int i10 = d.f71641d[aVar.ordinal()];
        if (i10 == 1) {
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                r1().j(f10);
                e.c.b(m1(), Interaction$Component.ASSEMBLY_SERVICE, (String) null, X.f(C16796C.a("app_location", "cart")), (e.b) null, 10, (Object) null);
            }
        } else if (i10 == 2) {
            D2(false);
        } else if (i10 == 3) {
            I2();
            e.c.b(m1(), Interaction$Component.ASSEMBLY_SERVICE, (String) null, X.f(C16796C.a("app_location", "cart")), (e.b) null, 10, (Object) null);
        } else {
            throw new XH.t();
        }
    }

    private final void i1() {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Fetch cart and rewards", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        s1().x0();
    }

    private final void i2(C9230z.f fVar) {
        if (fVar instanceof C9230z.f.a) {
            C9230z.f.a aVar = (C9230z.f.a) fVar;
            s1().d1(aVar.a());
            s1().X0(aVar.a());
        } else if (fVar instanceof C9230z.f.b) {
        } else {
            if (C17542s.e(fVar, C9230z.f.c.f62694a)) {
                MComConfig.e G02 = s1().G0();
                if (G02 != null) {
                    Zf.k r12 = r1();
                    C8951o a10 = androidx.navigation.fragment.a.a(this);
                    String c10 = G02.c().c();
                    String b10 = G02.c().b();
                    String a11 = G02.c().a();
                    String string = getString(Oo.b.f84800u2);
                    C17542s.i(string, "getString(...)");
                    String string2 = getString(Oo.b.f84788t1);
                    C17542s.i(string2, "getString(...)");
                    r12.b(a10, c10, b10, string, string2, a11, (String) null);
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("No config when clicking read more");
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a12 = C11818a.a((String) null, illegalStateException);
                        if (a12 != null) {
                            str = C11820c.a(a12);
                        } else {
                            return;
                        }
                    }
                    if (str2 == null) {
                        String name = CartFragment.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, illegalStateException, str);
                }
                return;
            }
            throw new XH.t();
        }
    }

    private final void j2(C11923c cVar) {
        s1().Z0();
        rw.f.d(this, x1(), new Kf.j(cVar, this));
    }

    /* access modifiers changed from: private */
    public static final C16807N k2(C11923c cVar, CartFragment cartFragment, C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        int i10 = d.f71640c[cVar.ordinal()];
        if (i10 == 1) {
            b.a.a(cartFragment.r1(), oVar, false, C.a.l(new C.a(), "cart/cart?view={view}&autoNavigate={autoNavigate}", false, false, 4, (Object) null).d(true).a(), 2, (Object) null);
        } else if (i10 == 2) {
            cartFragment.I1().b(oVar, C.a.l(new C.a(), "cart/cart?view={view}&autoNavigate={autoNavigate}", false, false, 4, (Object) null).d(true).a(), true);
        } else {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l2(Of.C9230z.k r23) {
        /*
            r22 = this;
            r0 = r23
            boolean r1 = r0 instanceof Of.C9230z.k.a
            java.lang.String r2 = "|"
            java.lang.String r3 = "b"
            java.lang.String r4 = "m"
            java.lang.String r6 = "main"
            java.lang.String r7 = "Kt"
            java.lang.Class<com.ingka.ikea.app.cart.CartFragment> r10 = com.ingka.ikea.app.cart.CartFragment.class
            r11 = 2
            r12 = 0
            if (r1 == 0) goto L_0x00df
            androidx.fragment.app.t r1 = r22.getActivity()
            if (r1 == 0) goto L_0x002c
            hg.v r2 = r22.s1()
            r2.Y0()
            Rd.a r2 = r22.k1()
            r2.d(r1)
        L_0x0028:
            r2 = r22
            goto L_0x01c4
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r13 = "Activity was null trying to launch login"
            r1.<init>(r13)
            qv.e r15 = qv.e.ERROR
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0046:
            boolean r16 = r13.hasNext()
            r5 = 0
            if (r16 == 0) goto L_0x005e
            java.lang.Object r8 = r13.next()
            r9 = r8
            qv.b r9 = (qv.C11819b) r9
            boolean r5 = r9.b(r15, r5)
            if (r5 == 0) goto L_0x0046
            r14.add(r8)
            goto L_0x0046
        L_0x005e:
            java.util.Iterator r8 = r14.iterator()
            r9 = r12
            r13 = r9
        L_0x0064:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0028
            java.lang.Object r14 = r8.next()
            qv.b r14 = (qv.C11819b) r14
            if (r9 != 0) goto L_0x007d
            java.lang.String r9 = qv.C11818a.a(r12, r1)
            if (r9 != 0) goto L_0x0079
            goto L_0x0028
        L_0x0079:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x007d:
            if (r13 != 0) goto L_0x00c6
            java.lang.String r13 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r21 = r3
            r5 = 36
            java.lang.String r3 = HJ.C15854t.s1(r13, r5, r12, r11, r12)
            r5 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r5, r12, r11, r12)
            int r5 = r3.length()
            if (r5 != 0) goto L_0x009b
            goto L_0x009f
        L_0x009b:
            java.lang.String r13 = HJ.C15854t.P0(r3, r7)
        L_0x009f:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r5 = 1
            boolean r3 = HJ.C15854t.b0(r3, r6, r5)
            if (r3 == 0) goto L_0x00b0
            r3 = r4
            goto L_0x00b2
        L_0x00b0:
            r3 = r21
        L_0x00b2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            r5.append(r13)
            java.lang.String r13 = r5.toString()
        L_0x00c4:
            r3 = r13
            goto L_0x00c9
        L_0x00c6:
            r21 = r3
            goto L_0x00c4
        L_0x00c9:
            r13 = r14
            r14 = r15
            r5 = r15
            r15 = r3
            r20 = 0
            r16 = r20
            r17 = r1
            r18 = r9
            r13.a(r14, r15, r16, r17, r18)
            r13 = r3
            r15 = r5
            r5 = r20
            r3 = r21
            goto L_0x0064
        L_0x00df:
            r21 = r3
            boolean r1 = r0 instanceof Of.C9230z.k.b
            if (r1 == 0) goto L_0x01ad
            androidx.fragment.app.t r1 = r22.getActivity()
            if (r1 == 0) goto L_0x00fb
            hg.v r2 = r22.s1()
            r2.a1()
            Rd.a r2 = r22.k1()
            r2.e(r1)
            goto L_0x0028
        L_0x00fb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r3 = "Activity was null trying to launch signup"
            r1.<init>(r3)
            qv.e r3 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0115:
            boolean r9 = r5.hasNext()
            r15 = 0
            if (r9 == 0) goto L_0x012d
            java.lang.Object r9 = r5.next()
            r13 = r9
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r3, r15)
            if (r13 == 0) goto L_0x0115
            r8.add(r9)
            goto L_0x0115
        L_0x012d:
            java.util.Iterator r5 = r8.iterator()
            r8 = r12
            r9 = r8
        L_0x0133:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0028
            java.lang.Object r13 = r5.next()
            qv.b r13 = (qv.C11819b) r13
            if (r8 != 0) goto L_0x014d
            java.lang.String r8 = qv.C11818a.a(r12, r1)
            if (r8 != 0) goto L_0x0149
            goto L_0x0028
        L_0x0149:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x014d:
            if (r9 != 0) goto L_0x0196
            java.lang.String r9 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r14 = 36
            java.lang.String r15 = HJ.C15854t.s1(r9, r14, r12, r11, r12)
            r19 = r4
            r4 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r4, r12, r11, r12)
            int r17 = r15.length()
            if (r17 != 0) goto L_0x016b
            goto L_0x016f
        L_0x016b:
            java.lang.String r9 = HJ.C15854t.P0(r15, r7)
        L_0x016f:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r4 = 1
            boolean r15 = HJ.C15854t.b0(r15, r6, r4)
            if (r15 == 0) goto L_0x0181
            r15 = r19
            goto L_0x0183
        L_0x0181:
            r15 = r21
        L_0x0183:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r2)
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            goto L_0x019a
        L_0x0196:
            r19 = r4
            r14 = 36
        L_0x019a:
            r4 = r14
            r14 = r3
            r20 = 0
            r15 = r9
            r16 = r20
            r17 = r1
            r18 = r8
            r13.a(r14, r15, r16, r17, r18)
            r4 = r19
            r15 = r20
            goto L_0x0133
        L_0x01ad:
            boolean r1 = r0 instanceof Of.C9230z.k.c
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = r22.x1()
            r2 = r22
            x4.o r1 = rw.f.f(r2, r1, r12, r11, r12)
            if (r1 == 0) goto L_0x01c4
            Rd.a r3 = r22.k1()
            r3.f(r1)
        L_0x01c4:
            boolean r0 = r23.a()
            if (r0 == 0) goto L_0x01d1
            Lf.b r0 = r22.p1()
            r0.d()
        L_0x01d1:
            return
        L_0x01d2:
            r2 = r22
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.CartFragment.l2(Of.z$k):void");
    }

    private final void m2(C9230z.l lVar) {
        if (C17542s.e(lVar, C9230z.l.a.f62702a)) {
            if (getContext() != null) {
                s1().p0(C13026h.a(Oo.b.f84436L8), C13026h.a(C11849b.f102355v), new K.a.C1285a(C13026h.a(Oo.b.f84427L), new Kf.k(this)), new K.a.C1285a(C13026h.a(Oo.b.f84518U0), new Kf.l(this)), new androidx.compose.ui.window.h(true, false, false, 4, (DefaultConstructorMarker) null));
            }
        } else if (lVar instanceof C9230z.l.b) {
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                Iterable<Kf.y> a10 = ((C9230z.l.b) lVar).a();
                ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
                for (Kf.y yVar : a10) {
                    arrayList.add(new ListPickerNavigation.Operation.AddAll.ProductData(yVar.a(), yVar.b()));
                }
                E1().a(f10, new ListPickerNavigation.Operation.AddAll(arrayList, new ListPickerNavigation.Operation.Analytics(Interaction$Component.CART_DETAILS, Ae.k.OVERFLOW)), "request_key_list_picker_move_all");
            }
        } else if (C17542s.e(lVar, C9230z.l.c.f62704a)) {
            C8951o f11 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f11 != null) {
                H1().b(f11);
            }
        } else if (C17542s.e(lVar, C9230z.l.e.f62706a)) {
            v s12 = s1();
            String string = getString(Oo.b.f84762q8);
            C17542s.i(string, "getString(...)");
            s12.V0(string);
        } else if (lVar instanceof C9230z.l.d) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList2) {
                if (str == null) {
                    String a11 = C11818a.a("Remote sales clicked", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CartFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            s1().P0(new v.C9804a.c.f(((C9230z.l.d) lVar).a()));
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n2(CartFragment cartFragment) {
        cartFragment.s1().j0();
        cartFragment.s1().h0();
        cartFragment.s1().o0(System.currentTimeMillis());
        return C16807N.f139792a;
    }

    private final boolean o1() {
        return requireArguments().getBoolean("autoNavigate");
    }

    /* access modifiers changed from: private */
    public static final C16807N o2(CartFragment cartFragment) {
        cartFragment.s1().j0();
        return C16807N.f139792a;
    }

    private final void p2(C9230z.r rVar) {
        if (rVar instanceof C9230z.r.a) {
            H2(((C9230z.r.a) rVar).a());
        } else if (C17542s.e(rVar, C9230z.r.b.f62718a)) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Feedback entry closed", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CartFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            s1().o0(System.currentTimeMillis());
        } else {
            throw new XH.t();
        }
    }

    private final void q2(String str, String str2, ListPickerNavigation.Operation.Analytics analytics) {
        C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            E1().a(f10, new ListPickerNavigation.Operation.AddOrRemove(str, str2, 0, analytics, 4, (DefaultConstructorMarker) null), "request_key_list_picker_add_or_remove");
        }
    }

    private final void r2(Z0.c cVar) {
        Z0.c.a c10 = cVar.c();
        char c11 = '$';
        Class<CartFragment> cls = CartFragment.class;
        if (C17542s.e(c10, Z0.c.a.C1718a.f85052b) || C17542s.e(c10, Z0.c.a.f.f85057b) || C17542s.e(c10, Z0.c.a.g.f85058b) || C17542s.e(c10, Z0.c.a.e.f85056b)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected action type: " + cVar.c());
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, illegalStateException, str);
            }
        } else if (C17542s.e(c10, Z0.c.a.d.f85055b)) {
            q2(cVar.b(), cVar.a(), new ListPickerNavigation.Operation.Analytics(Interaction$Component.CART_DETAILS, Ae.k.BUTTON));
        } else if (C17542s.e(c10, Z0.c.a.C1719c.f85054b)) {
            v s12 = s1();
            String a11 = cVar.a();
            String string = getString(Oo.b.f84602c2);
            C17542s.i(string, "getString(...)");
            s12.m0(a11, string, Ae.k.BUTTON, (String) null);
        } else if (!(c10 instanceof Z0.c.a.b)) {
            throw new XH.t();
        } else if (C17542s.e(((Z0.c.a.b) c10).a(), "YOU_MAY_ALSO_LIKE_ENTRY_ID")) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a12 = C11818a.a("You may also like clicked", (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str3 = C11820c.a(a12);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, (Throwable) null, str3);
                c11 = '$';
            }
            e.c.b(m1(), Interaction$Component.CART_YOU_MAY_ALSO_LIKE, (String) null, (Map) null, (e.b) null, 14, (Object) null);
            C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                r1().c(f10, cVar.a());
            }
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected action type: " + cVar.c());
            qv.e eVar3 = qv.e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str5 == null) {
                    String a13 = C11818a.a((String) null, illegalStateException2);
                    if (a13 != null) {
                        str5 = C11820c.a(a13);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str6, false, illegalStateException2, str5);
            }
        }
    }

    /* access modifiers changed from: private */
    public final v s1() {
        return (v) this.f71632a1.getValue();
    }

    /* access modifiers changed from: private */
    public final void s2() {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Postal code updated, checkout: " + this.f71631Z0, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (this.f71631Z0) {
            J2();
        }
    }

    private final void t2(Z0 z02) {
        String str;
        Class<CartFragment> cls;
        Z0 z03 = z02;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = CartFragment.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("Product item event: " + z03, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str4 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str3 = str5;
            str4 = str6;
        }
        if ((z03 instanceof Z0.f) || (z03 instanceof Z0.a)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected event: " + z03);
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a(str2, illegalStateException);
                    if (a11 != null) {
                        str7 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', str2, 2, str2), '.', str2, 2, str2);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str8, false, illegalStateException, str7);
                str2 = null;
            }
        } else if (z03 instanceof Z0.e) {
            s1().P0(new v.C9804a.c.e(((Z0.e) z03).a()));
        } else if (z03 instanceof Z0.d) {
            C2(((Z0.d) z03).a(), Interaction$Component.CART_DETAILS);
        } else if (z03 instanceof Z0.b) {
            z2(((Z0.b) z03).a());
        } else if (z03 instanceof Z0.g) {
            Z0.g gVar = (Z0.g) z03;
            u2(gVar.a(), gVar.b());
        } else if (z03 instanceof Z0.c) {
            r2((Z0.c) z03);
        } else {
            throw new XH.t();
        }
    }

    private final void u2(String str, int i10) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Quantity stepper change, item: " + str + " quantity: " + i10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = CartFragment.class.getName();
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
        v s12 = s1();
        Ae.k kVar = Ae.k.OVERFLOW;
        String string = getString(Oo.b.f84602c2);
        C17542s.i(string, "getString(...)");
        s12.f1(str, i10, kVar, string);
    }

    private final C9788A v1() {
        return (C9788A) this.f71634c1.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N v2(CartFragment cartFragment) {
        cartFragment.I1().a(androidx.navigation.fragment.a.a(cartFragment));
        return C16807N.f139792a;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [me.a$a] */
    /* JADX WARNING: type inference failed for: r1v9, types: [me.a$a$c] */
    /* JADX WARNING: type inference failed for: r10v3, types: [me.a$a$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void w2(com.ingka.ikea.appconfig.model.PostalCodePickerConfig r19) {
        /*
            r18 = this;
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r0 = r19.i()
            java.lang.String r3 = r19.d()
            com.ingka.ikea.appconfig.model.PostalCodePickerConfig$b r1 = com.ingka.ikea.appconfig.model.PostalCodePickerConfig.b.NATIVE_GOOGLE
            r2 = 1
            r4 = 2
            r9 = 0
            if (r0 != r1) goto L_0x00c3
            if (r3 == 0) goto L_0x0017
            boolean r1 = HJ.C15854t.v0(r3)
            if (r1 == 0) goto L_0x00c3
        L_0x0017:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing google lookup key"
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r6 = r3.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0049
            java.lang.Object r6 = r3.next()
            r8 = r6
            qv.b r8 = (qv.C11819b) r8
            boolean r7 = r8.b(r1, r7)
            if (r7 == 0) goto L_0x0031
            r5.add(r6)
            goto L_0x0031
        L_0x0049:
            java.util.Iterator r3 = r5.iterator()
            r5 = r9
            r6 = r5
        L_0x004f:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00bf
            java.lang.Object r8 = r3.next()
            r10 = r8
            qv.b r10 = (qv.C11819b) r10
            if (r5 != 0) goto L_0x0069
            java.lang.String r5 = qv.C11818a.a(r9, r0)
            if (r5 != 0) goto L_0x0065
            goto L_0x00bf
        L_0x0065:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x0069:
            if (r6 != 0) goto L_0x00b6
            java.lang.Class<com.ingka.ikea.app.cart.CartFragment> r6 = com.ingka.ikea.app.cart.CartFragment.class
            java.lang.String r6 = r6.getName()
            kotlin.jvm.internal.C17542s.g(r6)
            r8 = 36
            java.lang.String r8 = HJ.C15854t.s1(r6, r8, r9, r4, r9)
            r11 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r11, r9, r4, r9)
            int r11 = r8.length()
            if (r11 != 0) goto L_0x0087
            goto L_0x008d
        L_0x0087:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = HJ.C15854t.P0(r8, r6)
        L_0x008d:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r11 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r11, r2)
            if (r8 == 0) goto L_0x00a0
            java.lang.String r8 = "m"
            goto L_0x00a2
        L_0x00a0:
            java.lang.String r8 = "b"
        L_0x00a2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            java.lang.String r8 = "|"
            r11.append(r8)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
        L_0x00b6:
            r11 = r1
            r12 = r6
            r13 = r7
            r14 = r0
            r15 = r5
            r10.a(r11, r12, r13, r14, r15)
            goto L_0x004f
        L_0x00bf:
            r18.B2()
            return
        L_0x00c3:
            int[] r1 = com.ingka.ikea.app.cart.CartFragment.d.f71642e
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L_0x013f
            java.lang.String r1 = "getCountry(...)"
            if (r0 == r4) goto L_0x0105
            r2 = 3
            if (r0 != r2) goto L_0x00ff
            boolean r15 = r19.n()
            boolean r13 = r19.k()
            hg.F r0 = r18.z1()
            me.a$a$b r14 = r0.C()
            Il.a r0 = r18.n1()
            java.util.Locale r0 = r0.A()
            java.lang.String r11 = r0.getCountry()
            kotlin.jvm.internal.C17542s.i(r11, r1)
            me.a$a$a r0 = new me.a$a$a
            r16 = 2
            r17 = 0
            r12 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x012c
        L_0x00ff:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0105:
            boolean r6 = r19.n()
            kotlin.jvm.internal.C17542s.g(r3)
            hg.F r0 = r18.z1()
            me.a$a$b r5 = r0.C()
            Il.a r0 = r18.n1()
            java.util.Locale r0 = r0.A()
            java.lang.String r2 = r0.getCountry()
            kotlin.jvm.internal.C17542s.i(r2, r1)
            me.a$a$c r0 = new me.a$a$c
            r7 = 4
            r8 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x012c:
            me.a r1 = r18.l1()
            androidx.fragment.app.FragmentManager r2 = r18.getParentFragmentManager()
            java.lang.String r3 = "getParentFragmentManager(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            java.lang.String r3 = "cart_postal_code"
            r1.b(r2, r0, r9, r3)
            return
        L_0x013f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid type"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.CartFragment.w2(com.ingka.ikea.appconfig.model.PostalCodePickerConfig):void");
    }

    private final void x2(C9155a aVar) {
        C8951o f10;
        int i10 = d.f71643f[aVar.ordinal()];
        if (i10 == 1) {
            D2(false);
        } else if (i10 == 2) {
            F2(this, (String) null, 1, (Object) null);
        } else if (i10 != 3) {
            throw new XH.t();
        } else if (s1().B0() != null && (f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null)) != null) {
            r1().l(f10);
        }
    }

    private final String y1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("view");
        }
        return null;
    }

    private final void y2(String str) {
        p1().i();
        try {
            startActivity(Yo.a.f89546a.a(str));
        } catch (SecurityException e10) {
            SecurityException securityException = e10;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Unable to open dialer", securityException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = CartFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, securityException, str4);
                str2 = str4;
                str3 = str5;
            }
            v.s0(s1(), C13026h.a(Oo.b.f84812v3), (J0) null, (K.b.a) null, 6, (Object) null);
        }
    }

    private final F z1() {
        return (F) this.f71633b1.getValue();
    }

    private final void z2(String str) {
        C8951o f10 = rw.f.f(this, x1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C11411a.C2225a.a(A1(), f10, str, (C11412b) null, 4, (Object) null);
        }
    }

    public final C11411a A1() {
        C11411a aVar = this.f71611I0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("energyLabelNavigation");
        return null;
    }

    public final Nf.b B1() {
        Nf.b bVar = this.f71606D0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("feedbackInteractor");
        return null;
    }

    public final InformationMessageNavigation C1() {
        InformationMessageNavigation informationMessageNavigation = this.f71607E0;
        if (informationMessageNavigation != null) {
            return informationMessageNavigation;
        }
        C17542s.z("informationMessageNavigation");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(U0.C4889m r9, int r10) {
        /*
            r8 = this;
            r0 = 1581331047(0x5e413267, float:3.48032566E18)
            r9.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.cart.CartFragment.FragmentContent (CartFragment.kt:259)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0012:
            hg.v r10 = r8.s1()
            r0 = -1217944458(0xffffffffb767a476, float:-1.38069645E-5)
            r9.W(r0)
            boolean r0 = r9.F(r8)
            java.lang.Object r1 = r9.D()
            if (r0 != 0) goto L_0x002e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0036
        L_0x002e:
            com.ingka.ikea.app.cart.CartFragment$b r1 = new com.ingka.ikea.app.cart.CartFragment$b
            r1.<init>(r8)
            r9.u(r1)
        L_0x0036:
            uI.h r1 = (uI.C18059h) r1
            r9.P()
            nI.l r1 = (nI.C17642l) r1
            r0 = -1217942633(0xffffffffb767ab97, float:-1.3808624E-5)
            r9.W(r0)
            boolean r0 = r9.F(r8)
            java.lang.Object r2 = r9.D()
            if (r0 != 0) goto L_0x0055
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x005d
        L_0x0055:
            com.ingka.ikea.app.cart.CartFragment$c r2 = new com.ingka.ikea.app.cart.CartFragment$c
            r2.<init>(r8)
            r9.u(r2)
        L_0x005d:
            uI.h r2 = (uI.C18059h) r2
            r9.P()
            nI.l r2 = (nI.C17642l) r2
            r0 = 0
            Of.C9180i0.a0(r10, r1, r2, r9, r0)
            U0.I0 r10 = Vo.b.c()
            java.lang.Object r10 = r9.Q(r10)
            androidx.fragment.app.o r10 = (androidx.fragment.app.C5187o) r10
            r0 = -1217939096(0xffffffffb767b968, float:-1.3811841E-5)
            r9.W(r0)
            java.lang.Object r0 = r9.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x008b
            x4.o r0 = androidx.navigation.fragment.a.a(r10)
            r9.u(r0)
        L_0x008b:
            r2 = r0
            x4.o r2 = (x4.C8951o) r2
            r9.P()
            java.lang.String r3 = r8.x1()
            r10 = -1217930764(0xffffffffb767d9f4, float:-1.3819419E-5)
            r9.W(r10)
            boolean r10 = r9.F(r8)
            java.lang.Object r0 = r9.D()
            if (r10 != 0) goto L_0x00ab
            java.lang.Object r10 = r1.a()
            if (r0 != r10) goto L_0x00b3
        L_0x00ab:
            Kf.q r0 = new Kf.q
            r0.<init>(r8)
            r9.u(r0)
        L_0x00b3:
            r5 = r0
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 384(0x180, float:5.38E-43)
            java.lang.String r4 = "request_key_list_picker_add_or_remove"
            r6 = r9
            qw.l.d(r2, r3, r4, r5, r6, r7)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00ca
            U0.C4895p.R()
        L_0x00ca:
            r9.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.cart.CartFragment.D0(U0.m, int):void");
    }

    public final Tu.a D1() {
        Tu.a aVar = this.f71612J0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("itemAvailabilityNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        super.E0(bundle);
        this.f71631Z0 = bundle != null ? bundle.getBoolean("KEY_POSTAL_CODE_ACTION_GO_TO_CHECKOUT") : false;
        if (rw.a.b(this)) {
            G2();
        }
    }

    public final ListPickerNavigation E1() {
        ListPickerNavigation listPickerNavigation = this.f71620R0;
        if (listPickerNavigation != null) {
            return listPickerNavigation;
        }
        C17542s.z("listPickerNavigation");
        return null;
    }

    public final Zw.a F1() {
        Zw.a aVar = this.f71636y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C15005b G1() {
        C15005b bVar = this.f71621S0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("productConfiguratorNavigation");
        return null;
    }

    public final C13992a H1() {
        C13992a aVar = this.f71618P0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("reassuranceNavigation");
        return null;
    }

    public final Ay.c I1() {
        Ay.c cVar = this.f71619Q0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("scanAndGoCartNavigation");
        return null;
    }

    public final C13352d J1() {
        C13352d dVar = this.f71622T0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("shoppingListNavigation");
        return null;
    }

    public final C13560a K1() {
        C13560a aVar = this.f71630Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("shoppingListSharedAnalytics");
        return null;
    }

    public final C13194a L1() {
        C13194a aVar = this.f71615M0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    public final C14516c M1() {
        C14516c cVar = this.f71613K0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("zipSelectorNavigation");
        return null;
    }

    public final Nd.c j1() {
        Nd.c cVar = this.f71614L0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("abTesting");
        return null;
    }

    public final Rd.a k1() {
        Rd.a aVar = this.f71616N0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public final C10038a l1() {
        C10038a aVar = this.f71617O0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("addressPickerNavigation");
        return null;
    }

    public final Ae.e m1() {
        Ae.e eVar = this.f71626X;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Il.a n1() {
        Il.a aVar = this.f71610H0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("appConfigApi");
        return null;
    }

    public void onCreate(Bundle bundle) {
        String y12;
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle == null && (y12 = y1()) != null) {
            e.c.c(m1(), Ae.j.ACTION_VIEWED.b(), X.f(C16796C.a("component_value", y12)), Interaction$Component.DYNAMIC_LINK, (e.b) null, 8, (Object) null);
        }
    }

    public void onResume() {
        super.onResume();
        if (s1().I0()) {
            s1().U0(false);
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Lifecycle resumed, fetch cart", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = CartFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            i1();
        }
        c.a.a(j1(), "view_online_cart", (Map) null, (Map) null, 6, (Object) null);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("onSaveInstanceState", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = CartFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        bundle.putBoolean("KEY_POSTAL_CODE_ACTION_GO_TO_CHECKOUT", this.f71631Z0);
    }

    public void onStart() {
        super.onStart();
        g1();
        v1().G(new Kf.s(this));
    }

    public final Lf.b p1() {
        Lf.b bVar = this.f71628Y;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartAnalytics");
        return null;
    }

    public final C9133b q1() {
        C9133b bVar = this.f71608F0;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("cartApi");
        return null;
    }

    public final Zf.k r1() {
        Zf.k kVar = this.f71609G0;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("cartNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f71629Y0;
    }

    public final Nf.d t1() {
        Nf.d dVar = this.f71604B0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("checkoutInteractor");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f71627X0;
    }

    public final Mn.e u1() {
        Mn.e eVar = this.f71605C0;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("checkoutNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f71625W0;
    }

    public final Eo.a w1() {
        Eo.a aVar = this.f71603A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public String x1() {
        return this.f71624V0;
    }
}
