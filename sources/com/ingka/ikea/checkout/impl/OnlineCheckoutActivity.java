package com.ingka.ikea.checkout.impl;

import Ar.j;
import Do.a;
import Do.b;
import Do.f;
import Do.m;
import HJ.C15854t;
import I2.L;
import Nd.c;
import Nn.C10800c;
import Nn.C10802e;
import Nn.C10803f;
import Nn.C10808k;
import Nn.C10812o;
import Nn.C10813p;
import Nn.M;
import Nn.O;
import Nn.u;
import OC.C13302d;
import PC.C13335a;
import QC.C13417a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rg.a;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Uw.C13736a;
import XH.C16807N;
import XH.C16820k;
import XH.C16824o;
import XH.C16825p;
import XH.t;
import XH.y;
import YH.C16877v;
import Yn.C10991f;
import Yn.G;
import Yn.o0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.K;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ay.C13992a;
import co.C11150a;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.app.uicomponents.util.AccurateOffsetLinearLayoutManager;
import com.ingka.ikea.app.uicomponents.view.progress.FullScreenProgressView;
import com.ingka.ikea.app.uicomponents.view.progress.HorizontalProgressView;
import com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.AmbiguousDeliveryAreaBottomSheet;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.PostalCodeInfoBottomSheet;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.f;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.g;
import com.ingka.ikea.checkout.impl.delivery.fragments.ChangeDeliveryTimeSlotFragment;
import com.ingka.ikea.checkout.impl.h0;
import com.ingka.ikea.checkout.impl.payment.a;
import com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment;
import com.ingka.ikea.checkout.impl.ui.a;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import com.ingka.ikea.core.android.view.BackButton;
import com.ingka.ikea.informationmessage.InformationMessageNavigation;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dl.C11199d;
import dl.C11208m;
import dl.C11209n;
import dl.C11210o;
import dl.C11211p;
import dl.C11212q;
import dl.r;
import eI.C17187b;
import el.C11248a;
import eo.C11254a;
import g.C5312a;
import g.C5314c;
import h.C5406d;
import ho.C11374a;
import ho.b;
import il.C11403c;
import il.C11404d;
import il.C11405e;
import il.f;
import jC.C14617d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import jo.C11436b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import me.C10038a;
import nI.C17631a;
import nI.C17642l;
import pg.C;
import pg.C10148b;
import pg.C10150d;
import pg.C10151e;
import pg.H;
import qg.C10192b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;
import sg.C10244a;
import sg.f;
import sg.g;
import tI.C17974j;
import u2.C6012a;
import xo.C12322b;
import xo.C12324d;
import yo.C12496a;

@Metadata(d1 = {"\u0000\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002¢\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\u0007J\u000f\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010\u0007J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u0007J\u000f\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010\u0007J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\u0007J\u0019\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\u0007J\u0017\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020)H\u0002¢\u0006\u0004\b7\u0010,J\u000f\u00108\u001a\u00020)H\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\n2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ-\u0010J\u001a\u00020\n2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010H\u001a\u00020\u00162\b\b\u0002\u0010I\u001a\u00020\u0016H\u0002¢\u0006\u0004\bJ\u0010KJ5\u0010Q\u001a\u00020\n2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0002¢\u0006\u0004\bQ\u0010RJ\u0019\u0010T\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010SH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\nH\u0002¢\u0006\u0004\bV\u0010\u0007J\u0017\u0010X\u001a\u00020\n2\u0006\u0010W\u001a\u00020)H\u0002¢\u0006\u0004\bX\u0010,J\u0019\u0010[\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010YH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\nH\u0002¢\u0006\u0004\b]\u0010\u0007J\u000f\u0010^\u001a\u00020\nH\u0002¢\u0006\u0004\b^\u0010\u0007J\u000f\u0010_\u001a\u00020\nH\u0002¢\u0006\u0004\b_\u0010\u0007J\u000f\u0010`\u001a\u00020\nH\u0002¢\u0006\u0004\b`\u0010\u0007J\u000f\u0010a\u001a\u00020\nH\u0002¢\u0006\u0004\ba\u0010\u0007J\u000f\u0010b\u001a\u00020\nH\u0002¢\u0006\u0004\bb\u0010\u0007J\u001d\u0010e\u001a\u00020\n2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0 H\u0002¢\u0006\u0004\be\u0010fJ'\u0010j\u001a\b\u0012\u0004\u0012\u00020c0 2\u0006\u0010g\u001a\u00020)2\b\u0010i\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0004\bj\u0010kJ\u001f\u0010o\u001a\u00020\n2\u0006\u0010l\u001a\u00020\u00162\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ1\u0010t\u001a\u00020\n2\u0006\u0010q\u001a\u00020)2\u0006\u0010r\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0006\u0010s\u001a\u00020\u0012H\u0002¢\u0006\u0004\bt\u0010uJ=\u0010|\u001a\u00020\n2\u0006\u0010q\u001a\u00020)2\f\u0010w\u001a\b\u0012\u0004\u0012\u00020v0 2\u0006\u0010y\u001a\u00020x2\u0006\u0010{\u001a\u00020z2\u0006\u0010s\u001a\u00020\u0012H\u0002¢\u0006\u0004\b|\u0010}JD\u0010\u0001\u001a\u00020\n2\u0006\u0010~\u001a\u00020)2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u000200 2\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010y\u001a\u00020x2\u0007\u0010\u0001\u001a\u00020zH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0011\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J5\u0010\u0001\u001a\u00020\n*\u00030\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020NH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0001\u0010\u0015J\u001c\u0010\u0001\u001a\u00020\n*\t\u0012\u0004\u0012\u00020c0\u0001H\u0002¢\u0006\u0005\b\u0001\u0010fJ.\u0010\u0001\u001a\u00020\n*\t\u0012\u0004\u0012\u00020c0\u00012\u0007\u0010\u0001\u001a\u00020\b2\u0006\u0010g\u001a\u00020)H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u00020\n*\t\u0012\u0004\u0012\u00020c0\u00012\u0007\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u00020\n*\t\u0012\u0004\u0012\u00020c0\u00012\b\u0010i\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J%\u0010\u0001\u001a\u00020\n*\t\u0012\u0004\u0012\u00020c0\u00012\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0001\u0010\u0007J\u0019\u0010\u0001\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002¢\u0006\u0005\b\u0001\u0010\u0019J\u001c\u0010\u0001\u001a\u00020\n2\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010 \u0001J$\u0010¢\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u00122\u0007\u0010¡\u0001\u001a\u00020)H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001a\u0010¤\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0015J\u001b\u0010¥\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b§\u0001\u0010\u0007J\u001a\u0010©\u0001\u001a\u00020\n2\u0007\u0010¨\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b©\u0001\u0010\u0019J#\u0010«\u0001\u001a\u00020\n2\u0006\u0010H\u001a\u00020\u00162\u0007\u0010ª\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001e\u0010¯\u0001\u001a\u00020\n2\n\u0010®\u0001\u001a\u0005\u0018\u00010­\u0001H\u0014¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0011\u0010±\u0001\u001a\u00020\nH\u0014¢\u0006\u0005\b±\u0001\u0010\u0007J\u0011\u0010²\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b²\u0001\u0010\u0007J\u0011\u0010³\u0001\u001a\u00020\nH\u0016¢\u0006\u0005\b³\u0001\u0010\u0007J\u001c\u0010µ\u0001\u001a\u00020\n2\b\u0010´\u0001\u001a\u00030­\u0001H\u0014¢\u0006\u0006\bµ\u0001\u0010°\u0001JD\u0010º\u0001\u001a\u00020\n2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160 2\t\u0010·\u0001\u001a\u0004\u0018\u00010\u00162\u0016\u0010¹\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\n0¸\u0001H\u0016¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0010Ç\u0001\u001a\u00020\n2\t\u0010¼\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010½\u0001\u001a\u00020\u00162\u0014\u0010¿\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160¾\u00012\n\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00012\n\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00012\b\u0010Å\u0001\u001a\u00030Ä\u00012\u0007\u0010Æ\u0001\u001a\u00020\u00162\u0016\u0010¹\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\n0¸\u0001H\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010Ë\u0001\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R*\u0010Ó\u0001\u001a\u00030Ì\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Û\u0001\u001a\u00030Ô\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010ã\u0001\u001a\u00030Ü\u00018\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R*\u0010ó\u0001\u001a\u00030ì\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R*\u0010û\u0001\u001a\u00030ô\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R*\u0010\u0002\u001a\u00030ü\u00018\u0000@\u0000X.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010\u0002\u001a\u00030\u00028\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R*\u0010£\u0002\u001a\u00030\u00028\u0000@\u0000X.¢\u0006\u0018\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R*\u0010«\u0002\u001a\u00030¤\u00028\u0000@\u0000X.¢\u0006\u0018\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R*\u0010³\u0002\u001a\u00030¬\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b­\u0002\u0010®\u0002\u001a\u0006\b¯\u0002\u0010°\u0002\"\u0006\b±\u0002\u0010²\u0002R*\u0010»\u0002\u001a\u00030´\u00028\u0000@\u0000X.¢\u0006\u0018\n\u0006\bµ\u0002\u0010¶\u0002\u001a\u0006\b·\u0002\u0010¸\u0002\"\u0006\b¹\u0002\u0010º\u0002R*\u0010Ã\u0002\u001a\u00030¼\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\b½\u0002\u0010¾\u0002\u001a\u0006\b¿\u0002\u0010À\u0002\"\u0006\bÁ\u0002\u0010Â\u0002R*\u0010Ë\u0002\u001a\u00030Ä\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÅ\u0002\u0010Æ\u0002\u001a\u0006\bÇ\u0002\u0010È\u0002\"\u0006\bÉ\u0002\u0010Ê\u0002R*\u0010Ó\u0002\u001a\u00030Ì\u00028\u0006@\u0006X.¢\u0006\u0018\n\u0006\bÍ\u0002\u0010Î\u0002\u001a\u0006\bÏ\u0002\u0010Ð\u0002\"\u0006\bÑ\u0002\u0010Ò\u0002R!\u0010Ù\u0002\u001a\u00030Ô\u00028BX\u0002¢\u0006\u0010\n\u0006\bÕ\u0002\u0010Ö\u0002\u001a\u0006\b×\u0002\u0010Ø\u0002R!\u0010Þ\u0002\u001a\u00030Ú\u00028BX\u0002¢\u0006\u0010\n\u0006\bÛ\u0002\u0010Ö\u0002\u001a\u0006\bÜ\u0002\u0010Ý\u0002R!\u0010ã\u0002\u001a\u00030ß\u00028BX\u0002¢\u0006\u0010\n\u0006\bà\u0002\u0010Ö\u0002\u001a\u0006\bá\u0002\u0010â\u0002R%\u0010ç\u0002\u001a\u0010\u0012\u0005\u0012\u00030ä\u0002\u0012\u0004\u0012\u00020\n0¸\u00018\u0002X\u0004¢\u0006\b\n\u0006\bå\u0002\u0010æ\u0002R\u001b\u0010ê\u0002\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u001c\u0010î\u0002\u001a\u0005\u0018\u00010ë\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bì\u0002\u0010í\u0002R\u001a\u0010ñ\u0002\u001a\u00030\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\bï\u0002\u0010ð\u0002R!\u0010ö\u0002\u001a\u00030ò\u00028BX\u0002¢\u0006\u0010\n\u0006\bó\u0002\u0010Ö\u0002\u001a\u0006\bô\u0002\u0010õ\u0002R\u001a\u0010ú\u0002\u001a\u00030÷\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bø\u0002\u0010ù\u0002R\u001a\u0010ü\u0002\u001a\u00030÷\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bû\u0002\u0010ù\u0002R\u0018\u0010þ\u0002\u001a\u00030÷\u00028\u0002X\u0004¢\u0006\b\n\u0006\bý\u0002\u0010ù\u0002R!\u0010\u0003\u001a\u00030ÿ\u00028BX\u0002¢\u0006\u0010\n\u0006\b\u0003\u0010Ö\u0002\u001a\u0006\b\u0003\u0010\u0003R\u001f\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R%\u0010\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00030 0\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0003\u0010\u0003R\u001a\u0010\u0003\u001a\u00030\u00038\u0002@\u0002X.¢\u0006\b\n\u0006\b\u0003\u0010\u0003¨\u0006\u0003"}, d2 = {"Lcom/ingka/ikea/checkout/impl/OnlineCheckoutActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "Lsg/m;", "Lsg/g;", "Lsg/a;", "Lsg/b;", "<init>", "()V", "LYn/P;", "deliveryMethod", "LXH/N;", "N3", "(LYn/P;)V", "Ldl/r;", "checkoutStepHeaderData", "T3", "(Ldl/r;)V", "S3", "", "index", "U3", "(I)V", "", "key", "W3", "(Ljava/lang/String;)V", "LNn/c;", "capabilityHolder", "K3", "(LNn/c;)V", "deliveryId", "selectedTimeSlotId", "", "updatedCapabilities", "J3", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "T2", "C3", "w3", "y3", "V2", "", "allowSkipForward", "N2", "(Z)V", "h3", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/g;", "result", "M2", "(Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/g;)V", "Lcom/ingka/ikea/checkout/impl/payment/a;", "K2", "(Lcom/ingka/ikea/checkout/impl/payment/a;)V", "X3", "isExpressGooglePay", "R2", "Q2", "()Z", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f;", "pickupPointSelected", "O3", "(Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/f;)V", "", "throwable", "e4", "(Ljava/lang/Throwable;)V", "LNn/e$e$a;", "reason", "l4", "(LNn/e$e$a;)V", "Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "errorDialogType", "title", "description", "h4", "(Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Rect;", "origin", "", "radius", "strings", "f4", "(Landroid/graphics/Rect;Ljava/lang/Float;Ljava/util/List;)V", "Lcom/ingka/ikea/checkout/impl/ui/a;", "J2", "(Lcom/ingka/ikea/checkout/impl/ui/a;)V", "O2", "isExpressFlow", "n4", "Lcom/ingka/ikea/mcomsettings/MComConfig;", "configHolder", "q4", "(Lcom/ingka/ikea/mcomsettings/MComConfig;)V", "X2", "H3", "q3", "t3", "s3", "p4", "", "items", "Q3", "(Ljava/util/List;)V", "pickupDisabled", "Lxo/b;", "fields", "B2", "(ZLxo/b;)Ljava/util/List;", "deliveryArrangementId", "LNn/O;", "timeWindowData", "b4", "(Ljava/lang/String;LNn/O;)V", "showSelected", "deliveryServiceId", "deliveryPartIndex", "j4", "(ZLjava/lang/String;Ljava/lang/String;I)V", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;", "pickUpPointDeliveries", "LNn/p;", "deliveryServiceType", "LNn/u;", "fulfillmentServiceType", "a4", "(ZLjava/util/List;LNn/p;LNn/u;I)V", "isSelectable", "LNn/Q;", "unavailableItems", "LDo/m;", "selectDeliveryOption", "serviceType", "k4", "(ZLjava/util/List;LDo/m;LNn/p;LNn/u;)V", "P3", "o4", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "target", "offset", "m4", "(Landroidx/recyclerview/widget/LinearLayoutManager;Landroid/content/Context;IF)V", "position", "R3", "", "Q1", "selectedDeliveryMethod", "R1", "(Ljava/util/List;LYn/P;Z)V", "O1", "(Ljava/util/List;LYn/P;)V", "S1", "(Ljava/util/List;Lxo/b;)V", "P1", "d4", "c4", "LDo/k;", "showLoadingView", "L2", "(LDo/k;)V", "scrollTo", "a", "(IZ)V", "i0", "h0", "(I)I", "f0", "url", "j", "body", "n", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "finish", "outState", "onSaveInstanceState", "values", "default", "Lkotlin/Function1;", "callback", "l", "(Ljava/util/List;Ljava/lang/String;LnI/l;)V", "currentValue", "countryCode", "", "pickerData", "Lqg/b$a;", "pickerBounds", "Lqg/b$d;", "cursorFocusMode", "Lqg/b$b;", "pickerType", "componentValue", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lqg/b$a;Lqg/b$d;Lqg/b$b;Ljava/lang/String;LnI/l;)V", "H", "Lcom/ingka/ikea/mcomsettings/MComConfig;", "mComConfig", "LAe/e;", "I", "LAe/e;", "o2", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LAr/j;", "J", "LAr/j;", "y2", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LEo/a;", "K", "LEo/a;", "t2", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LWn/b;", "L", "LWn/b;", "q2", "()LWn/b;", "setCheckoutAnalytics$checkout_implementation_release", "(LWn/b;)V", "checkoutAnalytics", "LWn/o;", "M", "LWn/o;", "u2", "()LWn/o;", "setDeliveryDetailsAnalytics$checkout_implementation_release", "(LWn/o;)V", "deliveryDetailsAnalytics", "LXn/g;", "N", "LXn/g;", "z2", "()LXn/g;", "setFullscreenErrorInteractor$checkout_implementation_release", "(LXn/g;)V", "fullscreenErrorInteractor", "LXn/k;", "O", "LXn/k;", "F2", "()LXn/k;", "setUnavailableItemsSheetInteractor$checkout_implementation_release", "(LXn/k;)V", "unavailableItemsSheetInteractor", "LXn/c;", "P", "LXn/c;", "w2", "()LXn/c;", "setDeliveryPricesInteractor$checkout_implementation_release", "(LXn/c;)V", "deliveryPricesInteractor", "LXn/m;", "Q", "LXn/m;", "G2", "()LXn/m;", "setUpdateAddressBottomSheetInteractor$checkout_implementation_release", "(LXn/m;)V", "updateAddressBottomSheetInteractor", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "R", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "A2", "()Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;", "setInformationMessageNavigation$checkout_implementation_release", "(Lcom/ingka/ikea/informationmessage/InformationMessageNavigation;)V", "informationMessageNavigation", "LXn/e;", "S", "LXn/e;", "x2", "()LXn/e;", "setExpressPaymentBottomSheetInteractor$checkout_implementation_release", "(LXn/e;)V", "expressPaymentBottomSheetInteractor", "LNd/c;", "T", "LNd/c;", "m2", "()LNd/c;", "setAbTesting$checkout_implementation_release", "(LNd/c;)V", "abTesting", "LXn/i;", "U", "LXn/i;", "E2", "()LXn/i;", "setStartActivityInteractor", "(LXn/i;)V", "startActivityInteractor", "LXn/a;", "X", "LXn/a;", "v2", "()LXn/a;", "setDeliveryDetailsInteractor$checkout_implementation_release", "(LXn/a;)V", "deliveryDetailsInteractor", "Lme/a;", "Y", "Lme/a;", "n2", "()Lme/a;", "setAddressPickerNavigation", "(Lme/a;)V", "addressPickerNavigation", "Lay/a;", "Z", "Lay/a;", "D2", "()Lay/a;", "setReassuranceNavigation", "(Lay/a;)V", "reassuranceNavigation", "LUw/a;", "y0", "LUw/a;", "C2", "()LUw/a;", "setPaymentNavigation", "(LUw/a;)V", "paymentNavigation", "LDo/f;", "z0", "LXH/o;", "r2", "()LDo/f;", "checkoutViewModel", "Lxo/i;", "A0", "I2", "()Lxo/i;", "userDetailsViewModel", "LBo/b;", "B0", "H2", "()LBo/b;", "updateAddressViewModel", "Lho/b;", "C0", "LnI/l;", "onDeliveryOptionSelected", "D0", "Ljava/lang/Integer;", "lastPosition", "Lil/c;", "E0", "Lil/c;", "keyboardAwayListener", "F0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "listLayoutManager", "LLg/d;", "G0", "p2", "()LLg/d;", "checkoutAdapter", "Ldl/r$a;", "H0", "Ldl/r$a;", "checkoutStep2Header", "I0", "checkoutStep3Header", "J0", "checkoutStep4Header", "Ldl/d$a;", "K0", "s2", "()Ldl/d$a;", "choosePaymentButtonViewModel", "Lg/c;", "Landroid/content/Intent;", "L0", "Lg/c;", "launchPaymentActivity", "Landroidx/lifecycle/K;", "LOC/d$a;", "M0", "Landroidx/lifecycle/K;", "availablePaymentOptions", "Lco/a;", "N0", "Lco/a;", "activityCheckoutBinding", "O0", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnlineCheckoutActivity extends Hilt_OnlineCheckoutActivity implements sg.m, sg.g, C10244a, sg.b {

    /* renamed from: O0  reason: collision with root package name */
    public static final a f94301O0 = new a((DefaultConstructorMarker) null);

    /* renamed from: P0  reason: collision with root package name */
    public static final int f94302P0 = 8;

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f94303A0 = new h0(P.b(xo.i.class), new n(this), new m(this), new o((C17631a) null, this));

    /* renamed from: B0  reason: collision with root package name */
    private final C16824o f94304B0 = new h0(P.b(Bo.b.class), new q(this), new p(this), new r((C17631a) null, this));

    /* renamed from: C0  reason: collision with root package name */
    private final C17642l<ho.b, C16807N> f94305C0 = new C11163m(this);

    /* renamed from: D0  reason: collision with root package name */
    private Integer f94306D0;

    /* renamed from: E0  reason: collision with root package name */
    private C11403c f94307E0;

    /* renamed from: F0  reason: collision with root package name */
    private LinearLayoutManager f94308F0;

    /* renamed from: G0  reason: collision with root package name */
    private final C16824o f94309G0 = C16825p.b(new C11173x(this));

    /* renamed from: H  reason: collision with root package name */
    private MComConfig f94310H;

    /* renamed from: H0  reason: collision with root package name */
    private r.a f94311H0;

    /* renamed from: I  reason: collision with root package name */
    public Ae.e f94312I;

    /* renamed from: I0  reason: collision with root package name */
    private r.a f94313I0;

    /* renamed from: J  reason: collision with root package name */
    public Ar.j f94314J;

    /* renamed from: J0  reason: collision with root package name */
    private final r.a f94315J0;

    /* renamed from: K  reason: collision with root package name */
    public Eo.a f94316K;

    /* renamed from: K0  reason: collision with root package name */
    private final C16824o f94317K0;

    /* renamed from: L  reason: collision with root package name */
    public Wn.b f94318L;

    /* renamed from: L0  reason: collision with root package name */
    private final C5314c<Intent> f94319L0;

    /* renamed from: M  reason: collision with root package name */
    public Wn.o f94320M;

    /* renamed from: M0  reason: collision with root package name */
    private final K<List<C13302d.a>> f94321M0;

    /* renamed from: N  reason: collision with root package name */
    public Xn.g f94322N;
    /* access modifiers changed from: private */

    /* renamed from: N0  reason: collision with root package name */
    public C11150a f94323N0;

    /* renamed from: O  reason: collision with root package name */
    public Xn.k f94324O;

    /* renamed from: P  reason: collision with root package name */
    public Xn.c f94325P;

    /* renamed from: Q  reason: collision with root package name */
    public Xn.m f94326Q;

    /* renamed from: R  reason: collision with root package name */
    public InformationMessageNavigation f94327R;

    /* renamed from: S  reason: collision with root package name */
    public Xn.e f94328S;

    /* renamed from: T  reason: collision with root package name */
    public Nd.c f94329T;

    /* renamed from: U  reason: collision with root package name */
    public Xn.i f94330U;

    /* renamed from: X  reason: collision with root package name */
    public Xn.a f94331X;

    /* renamed from: Y  reason: collision with root package name */
    public C10038a f94332Y;

    /* renamed from: Z  reason: collision with root package name */
    public C13992a f94333Z;

    /* renamed from: y0  reason: collision with root package name */
    public C13736a f94334y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f94335z0 = new h0(P.b(Do.f.class), new k(this), new j(this), new l((C17631a) null, this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/checkout/impl/OnlineCheckoutActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LMn/c;", "checkoutData", "Landroid/content/Intent;", "a", "(Landroid/content/Context;LMn/c;)Landroid/content/Intent;", "", "INITIAL_CHECKOUT_DATA_KEY", "Ljava/lang/String;", "AVAILABILITY_DISCREPANCY_TAG", "CAPABILITY_INFORMATION_TAG", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, Mn.c cVar) {
            C17542s.j(context, "context");
            C17542s.j(cVar, "checkoutData");
            Intent intent = new Intent(context, OnlineCheckoutActivity.class);
            intent.putExtra("INITIAL_CHECKOUT_DATA_KEY", cVar);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f94336a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f94337b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f94338c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f94339d;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|9|10|11|12|13|(2:15|16)|17|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|39) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0087 */
        static {
            /*
                Yn.P[] r0 = Yn.P.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Yn.P r2 = Yn.P.HOME_DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Yn.P r3 = Yn.P.COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f94336a = r0
                Nn.e$e$a[] r0 = Nn.C10802e.C1702e.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.e$e$a r3 = Nn.C10802e.C1702e.a.UNABLE_TO_DELIVER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Nn.e$e$a r3 = Nn.C10802e.C1702e.a.INVALID_ZIP_CODE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                r3 = 3
                Nn.e$e$a r4 = Nn.C10802e.C1702e.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x003b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f94337b = r0
                com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment$b[] r0 = com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment$b r4 = com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment.b.POSTAL_CODE_ERROR     // Catch:{ NoSuchFieldError -> 0x004c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment$b r4 = com.ingka.ikea.checkout.impl.ui.FullscreenErrorDialogFragment.b.GENERIC_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f94338c = r0
                Do.k[] r0 = Do.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Do.k r4 = Do.k.ZIP_IN     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                Do.k r1 = Do.k.AUTO_SELECT_PICKUP_POINT     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                Do.k r1 = Do.k.UPDATE_DELIVERY_OPTION     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                Do.k r1 = Do.k.SUBMIT     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                Do.k r1 = Do.k.RESTORE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                Do.k r1 = Do.k.NONE     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                f94339d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig;", "it", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/mcomsettings/MComConfig;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeCheckoutData$1", f = "OnlineCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<MComConfig, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94340c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f94341d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94342e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f94342e = onlineCheckoutActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f94342e, eVar);
            cVar.f94341d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(MComConfig mComConfig, C17164e<? super C16807N> eVar) {
            return ((c) create(mComConfig, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94340c == 0) {
                y.b(obj);
                this.f94342e.q4((MComConfig) this.f94341d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeCheckoutData$2", f = "OnlineCheckoutActivity.kt", l = {737}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94343c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94344d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeCheckoutData$2$1", f = "OnlineCheckoutActivity.kt", l = {738}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f94345c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ OnlineCheckoutActivity f94346d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$d$a$a  reason: collision with other inner class name */
            static final class C2099a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ OnlineCheckoutActivity f94347a;

                C2099a(OnlineCheckoutActivity onlineCheckoutActivity) {
                    this.f94347a = onlineCheckoutActivity;
                }

                /* renamed from: c */
                public final Object emit(String str, C17164e<? super C16807N> eVar) {
                    if (!(str == null || str.length() == 0)) {
                        this.f94347a.I2().i0(str);
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f94346d = onlineCheckoutActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f94346d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f94345c;
                if (i10 == 0) {
                    y.b(obj);
                    C16519P<String> H02 = this.f94346d.r2().H0();
                    C2099a aVar = new C2099a(this.f94346d);
                    this.f94345c = 1;
                    if (H02.collect(aVar, this) == f10) {
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
        d(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f94344d = onlineCheckoutActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f94344d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f94343c;
            if (i10 == 0) {
                y.b(obj);
                OnlineCheckoutActivity onlineCheckoutActivity = this.f94344d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(onlineCheckoutActivity, (C17164e<? super a>) null);
                this.f94343c = 1;
                if (androidx.lifecycle.Q.b(onlineCheckoutActivity, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeCheckoutData$3", f = "OnlineCheckoutActivity.kt", l = {747}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94348c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94349d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeCheckoutData$3$1", f = "OnlineCheckoutActivity.kt", l = {748}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f94350c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f94351d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ OnlineCheckoutActivity f94352e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$e$a$a  reason: collision with other inner class name */
            static final class C2100a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Q f94353a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ OnlineCheckoutActivity f94354b;

                C2100a(Q q10, OnlineCheckoutActivity onlineCheckoutActivity) {
                    this.f94353a = q10;
                    this.f94354b = onlineCheckoutActivity;
                }

                public final Object c(boolean z10, C17164e<? super C16807N> eVar) {
                    if (!z10) {
                        return C16807N.f139792a;
                    }
                    Q q10 = this.f94353a;
                    qv.e eVar2 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar2, false)) {
                            arrayList.add(next);
                        }
                    }
                    C11150a aVar = null;
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Show coupon removed warning", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = q10.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar2, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    this.f94354b.r2().k1();
                    Ar.j y22 = this.f94354b.y2();
                    C11150a G12 = this.f94354b.f94323N0;
                    if (G12 == null) {
                        C17542s.z("activityCheckoutBinding");
                    } else {
                        aVar = G12;
                    }
                    j.a.r(y22, aVar.f90771b, C11849b.f102230R, Oo.b.f84330B2, -2, (View) null, (C17631a) null, 48, (Object) null);
                    return C16807N.f139792a;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj, C17164e eVar) {
                    return c(((Boolean) obj).booleanValue(), eVar);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f94352e = onlineCheckoutActivity;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f94352e, eVar);
                aVar.f94351d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f94350c;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f94351d;
                    C16532g<Boolean> a12 = this.f94352e.r2().a1();
                    C2100a aVar = new C2100a(q10, this.f94352e);
                    this.f94351d = q10;
                    this.f94350c = 1;
                    if (a12.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    Q q11 = (Q) this.f94351d;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f94349d = onlineCheckoutActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f94349d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f94348c;
            if (i10 == 0) {
                y.b(obj);
                OnlineCheckoutActivity onlineCheckoutActivity = this.f94349d;
                r.b bVar = r.b.STARTED;
                a aVar = new a(onlineCheckoutActivity, (C17164e<? super a>) null);
                this.f94348c = 1;
                if (androidx.lifecycle.Q.b(onlineCheckoutActivity, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeLoadingState$1", f = "OnlineCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94355c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f94356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94357e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f94357e = onlineCheckoutActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f94357e, eVar);
            fVar.f94356d = ((Boolean) obj).booleanValue();
            return fVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((f) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94355c == 0) {
                y.b(obj);
                boolean z10 = this.f94356d;
                C11150a G12 = this.f94357e.f94323N0;
                if (G12 == null) {
                    C17542s.z("activityCheckoutBinding");
                    G12 = null;
                }
                HorizontalProgressView horizontalProgressView = G12.f90774e;
                C17542s.i(horizontalProgressView, "horizontalProgressBar");
                horizontalProgressView.setVisibility(z10 ? 0 : 8);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDo/c;", "it", "LXH/N;", "<anonymous>", "(LDo/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$observeSections$2", f = "OnlineCheckoutActivity.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<Do.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(OnlineCheckoutActivity onlineCheckoutActivity, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f94359d = onlineCheckoutActivity;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f94359d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(Do.c cVar, C17164e<? super C16807N> eVar) {
            return ((g) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94358c == 0) {
                y.b(obj);
                this.f94359d.p4();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f94360a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f94361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94362c;

        public h(View view, List list, OnlineCheckoutActivity onlineCheckoutActivity) {
            this.f94360a = view;
            this.f94361b = list;
            this.f94362c = onlineCheckoutActivity;
        }

        public final void run() {
            for (C11404d notifyItemRangeChanged : this.f94361b) {
                int itemCount = this.f94362c.p2().getItemCount();
                this.f94362c.p2().notifyItemRangeChanged(0, itemCount, notifyItemRangeChanged);
            }
            this.f94362c.S3();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "run", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f94363a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94364b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ qg.i f94365c;

        public i(View view, OnlineCheckoutActivity onlineCheckoutActivity, qg.i iVar) {
            this.f94363a = view;
            this.f94364b = onlineCheckoutActivity;
            this.f94365c = iVar;
        }

        public final void run() {
            this.f94364b.p2().g(this.f94365c, C11404d.VALIDATION_FAILED);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94366c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(androidx.activity.j jVar) {
            super(0);
            this.f94366c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94366c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94367c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(androidx.activity.j jVar) {
            super(0);
            this.f94367c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94367c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94368c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f94368c = aVar;
            this.f94369d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94368c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f94369d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.l.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94370c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(androidx.activity.j jVar) {
            super(0);
            this.f94370c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94370c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class n extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94371c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(androidx.activity.j jVar) {
            super(0);
            this.f94371c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94371c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94372c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94373d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f94372c = aVar;
            this.f94373d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94372c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f94373d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.o.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94374c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(androidx.activity.j jVar) {
            super(0);
            this.f94374c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94374c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class q extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94375c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(androidx.activity.j jVar) {
            super(0);
            this.f94375c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94375c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class r extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94376c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f94376c = aVar;
            this.f94377d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94376c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f94377d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.r.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/ingka/ikea/checkout/impl/OnlineCheckoutActivity$s", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnlineCheckoutActivity f94378a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f94379b;

        public s(OnlineCheckoutActivity onlineCheckoutActivity, List list) {
            this.f94378a = onlineCheckoutActivity;
            this.f94379b = list;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f94378a.Q3(this.f94379b);
        }
    }

    public OnlineCheckoutActivity() {
        int i10 = C11849b.f102204K1;
        r.c cVar = r.c.H2;
        this.f94311H0 = new r.a(i10, (String) null, (Integer) null, (Integer) null, cVar, 0, (Integer) null, 40, (Integer) null, (Integer) null, (Integer) null, 1902, (DefaultConstructorMarker) null);
        r.c cVar2 = cVar;
        this.f94313I0 = new r.a(C11849b.f102216N1, (String) null, (Integer) null, (Integer) null, cVar2, 0, (Integer) null, 40, (Integer) null, (Integer) null, (Integer) null, 1902, (DefaultConstructorMarker) null);
        this.f94315J0 = new r.a(C11849b.f102224P1, (String) null, (Integer) null, (Integer) null, cVar2, 0, (Integer) null, 40, (Integer) null, (Integer) null, (Integer) null, 1902, (DefaultConstructorMarker) null);
        this.f94317K0 = C16825p.b(new I(this));
        this.f94319L0 = registerForActivityResult(new C5406d(), new U(this));
        this.f94321M0 = new K<>();
    }

    /* access modifiers changed from: private */
    public static final C16807N A3(OnlineCheckoutActivity onlineCheckoutActivity, Do.n nVar) {
        C17542s.j(nVar, "data");
        C10808k i10 = nVar.a().i();
        ArrayList arrayList = new ArrayList();
        for (C10812o n10 : i10.a()) {
            List n11 = Co.c.n(n10, (String) null, 1, (Object) null);
            if (n11 != null) {
                arrayList.add(n11);
            }
        }
        List A10 = C16877v.A(arrayList);
        C10812o oVar = (C10812o) C16877v.w0(i10.a());
        onlineCheckoutActivity.a4(nVar.b(), A10, oVar.i(), oVar.k(), 0);
        return C16807N.f139792a;
    }

    private final List<Object> B2(boolean z10, C12322b bVar) {
        boolean z11;
        String str;
        char c10;
        Iterator it;
        Iterator it2;
        boolean z12 = z10;
        ArrayList arrayList = new ArrayList();
        Do.a C02 = r2().C0();
        Yn.P V02 = r2().V0();
        if (!z12 && r2().C0().a() >= a.f.f79839a.a()) {
            Q1(arrayList);
        }
        int a10 = C02.a();
        a.g gVar = a.g.f79841a;
        String str2 = null;
        if (a10 >= gVar.a() && !r2().e1() && r2().L0()) {
            if (V02 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("selectedDeliveryMethod should not be null");
                qv.e eVar = qv.e.ERROR;
                ArrayList arrayList2 = new ArrayList();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                String str3 = null;
                String str4 = null;
                while (it3.hasNext()) {
                    C11819b bVar2 = (C11819b) it3.next();
                    if (str3 == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            break;
                        }
                        str3 = C11820c.a(a11);
                    }
                    if (str4 == null) {
                        String name = arrayList.getClass().getName();
                        C17542s.g(name);
                        it2 = it3;
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    } else {
                        it2 = it3;
                    }
                    bVar2.a(eVar, str4, false, illegalStateException, str3);
                    it3 = it2;
                }
                e4(new IllegalArgumentException("selectedDeliveryMethod is null"));
                return arrayList;
            }
            R1(arrayList, V02, z12);
        }
        if (C02.a() == gVar.a()) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            arrayList.add(new C11210o("SPACE_DELIVERY_OPTION", ip.h.a(Xo.e.b(ip.h.a(((float) displayMetrics.heightPixels) / displayMetrics.density)))));
        }
        if (C02.a() >= a.C1490a.f79829a.a() && r2().L0()) {
            if (V02 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("selectedDeliveryMethod should not be null");
                qv.e eVar2 = qv.e.ERROR;
                ArrayList arrayList3 = new ArrayList();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList3.add(next2);
                    }
                }
                Iterator it4 = arrayList3.iterator();
                String str5 = null;
                String str6 = null;
                while (it4.hasNext()) {
                    C11819b bVar3 = (C11819b) it4.next();
                    if (str5 == null) {
                        String a12 = C11818a.a((String) null, illegalStateException2);
                        if (a12 == null) {
                            break;
                        }
                        str5 = C11820c.a(a12);
                    }
                    if (str6 == null) {
                        String name2 = arrayList.getClass().getName();
                        C17542s.g(name2);
                        it = it4;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        it = it4;
                    }
                    bVar3.a(eVar2, str6, false, illegalStateException2, str5);
                    it4 = it;
                }
                e4(new IllegalArgumentException("selectedDeliveryMethod is null"));
                return arrayList;
            }
            O1(arrayList, V02);
        }
        if (C02 instanceof a.c) {
            qv.e eVar3 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            Iterator it5 = qv.d.f102012a.a().iterator();
            while (true) {
                z11 = false;
                if (!it5.hasNext()) {
                    break;
                }
                Object next3 = it5.next();
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList4.add(next3);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str7 == null) {
                    String a13 = C11818a.a("Add Google Pay express button", (Throwable) null);
                    if (a13 == null) {
                        break;
                    }
                    str7 = C11820c.a(a13);
                }
                String str9 = str7;
                if (str8 == null) {
                    String name3 = arrayList.getClass().getName();
                    C17542s.g(name3);
                    c10 = '.';
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', str2, 2, str2), '.', str2, 2, str2);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    c10 = '.';
                    str = str8;
                }
                char c11 = c10;
                bVar4.a(eVar3, str, z11, (Throwable) null, str9);
                str8 = str;
                str7 = str9;
                z11 = z11;
                str2 = null;
            }
            arrayList.add(((a.c) C02).b());
        }
        if (C02.a() >= 6) {
            S1(arrayList, bVar);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C16807N B3(OnlineCheckoutActivity onlineCheckoutActivity, boolean z10) {
        InformationMessageNavigation A22 = onlineCheckoutActivity.A2();
        FragmentManager supportFragmentManager = onlineCheckoutActivity.getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String string = onlineCheckoutActivity.getString(C11849b.f102162A);
        C17542s.i(string, "getString(...)");
        String string2 = onlineCheckoutActivity.getString(C11849b.f102371z);
        C17542s.i(string2, "getString(...)");
        String string3 = onlineCheckoutActivity.getString(C11849b.f102367y);
        C17542s.i(string3, "getString(...)");
        A22.b(supportFragmentManager, "availability_discrepancy_tag", new InformationMessageNavigation.Data.a((InformationMessageNavigation.Data.a.c) null, string, string2, new InformationMessageNavigation.Data.a.C2131a(string3, (Integer) null, 2, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
        onlineCheckoutActivity.o2().o((Map<String, ? extends Object>) null, Interaction$Component.CART_AVAILABILITY_DISCREPANCY);
        return C16807N.f139792a;
    }

    private final void C3() {
        ip.j.a(I2().b0(), this, new C11155e(this));
        I2().U().observe(this, new h0.a(new C11156f(this)));
        ip.j.a(I2().W(), this, new C11157g(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N D3(OnlineCheckoutActivity onlineCheckoutActivity, boolean z10) {
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
                String a10 = C11818a.a("isSubmittingForm changed: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        onlineCheckoutActivity.r2().G1(z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E3(OnlineCheckoutActivity onlineCheckoutActivity, Boolean bool) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        LinearLayoutManager linearLayoutManager = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Submit button enabled changed: " + bool, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        onlineCheckoutActivity.s2().f().setValue(bool);
        onlineCheckoutActivity.p4();
        int itemCount = onlineCheckoutActivity.p2().getItemCount();
        if (bool.booleanValue() && itemCount > 0 && onlineCheckoutActivity.Q2()) {
            LinearLayoutManager linearLayoutManager2 = onlineCheckoutActivity.f94308F0;
            if (linearLayoutManager2 == null) {
                C17542s.z("listLayoutManager");
            } else {
                linearLayoutManager = linearLayoutManager2;
            }
            onlineCheckoutActivity.m4(linearLayoutManager, onlineCheckoutActivity, itemCount - 1, Xo.e.a(0));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F3(OnlineCheckoutActivity onlineCheckoutActivity, ip.d dVar) {
        C17542s.j(dVar, "startPayment");
        dVar.a(new X(onlineCheckoutActivity));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G3(OnlineCheckoutActivity onlineCheckoutActivity, ip.d dVar, C12324d dVar2) {
        C17542s.j(dVar, "$this$handle");
        C17542s.j(dVar2, "result");
        if (!C17542s.e(dVar2, C12324d.a.f106109a)) {
            if (dVar2 instanceof C12324d.b) {
                onlineCheckoutActivity.r2().o1();
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
                        String a10 = C11818a.a("User details submitted, has address upsert data: " + (((C12324d.b) dVar2).a() != null), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = dVar.getClass().getName();
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
                C12324d.b bVar2 = (C12324d.b) dVar2;
                if (bVar2.a() != null) {
                    onlineCheckoutActivity.H2().G(bVar2.a());
                    Xn.m G22 = onlineCheckoutActivity.G2();
                    FragmentManager supportFragmentManager = onlineCheckoutActivity.getSupportFragmentManager();
                    C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
                    G22.a(supportFragmentManager);
                } else {
                    onlineCheckoutActivity.R2(false);
                }
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    private final Bo.b H2() {
        return (Bo.b) this.f94304B0.getValue();
    }

    private final void H3() {
        ip.j.a(I2().V(), this, new V(this));
    }

    /* access modifiers changed from: private */
    public final xo.i I2() {
        return (xo.i) this.f94303A0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I3(OnlineCheckoutActivity onlineCheckoutActivity, List list) {
        C17542s.j(list, "validations");
        C11150a aVar = onlineCheckoutActivity.f94323N0;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        RecyclerView recyclerView = aVar.f90772c;
        C17542s.i(recyclerView, "checkoutFieldsList");
        L.a(recyclerView, new h(recyclerView, list, onlineCheckoutActivity));
        return C16807N.f139792a;
    }

    private final void J2(com.ingka.ikea.checkout.impl.ui.a aVar) {
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
                String a10 = C11818a.a("handleErrorDialogResult: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        if (aVar instanceof a.C2108a) {
            int i10 = b.f94338c[((a.C2108a) aVar).a().ordinal()];
            if (i10 == 1) {
                setResult(9182);
            } else if (i10 != 2) {
                throw new t();
            }
            finish();
        } else if (C17542s.e(aVar, a.b.f94680a)) {
            finish();
        } else if (aVar != null) {
            throw new t();
        }
    }

    private final void J3(String str, String str2, List<C10800c> list) {
        r2().t1(str, str2, list);
    }

    private final void K2(com.ingka.ikea.checkout.impl.payment.a aVar) {
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
                String a10 = C11818a.a("Express payment bottom sheet result: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        if (C17542s.e(aVar, a.C2106a.f94645a)) {
            q2().q(a.C1085a.b.f63200a);
            R2(true);
        } else if (aVar != null) {
            throw new t();
        }
    }

    private final void K3(C10800c cVar) {
        InformationMessageNavigation A22 = A2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String string = getString(C10991f.q(cVar.b()));
        C17542s.i(string, "getString(...)");
        String string2 = getString(C10991f.o(cVar.b()));
        C17542s.i(string2, "getString(...)");
        String string3 = getString(Oo.b.f84616d5);
        C17542s.i(string3, "getString(...)");
        A22.b(supportFragmentManager, "capability_information_tag", new InformationMessageNavigation.Data.a((InformationMessageNavigation.Data.a.c) null, string, string2, new InformationMessageNavigation.Data.a.C2131a(string3, (Integer) null, 2, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
    }

    private final void L2(Do.k kVar) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        List list = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("handleLoadingState: " + kVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        switch (b.f94339d[kVar.ordinal()]) {
            case 1:
            case 2:
                list = C16877v.q(getString(C11849b.f102259Y0), getString(C11849b.f102263Z0), getString(C11849b.f102268a1), getString(C11849b.f102273b1), getString(C11849b.f102278c1), getString(C11849b.f102283d1), getString(C11849b.f102288e1));
                break;
            case 3:
                list = C16877v.q(getString(C11849b.f102259Y0), getString(C11849b.f102263Z0), getString(C11849b.f102268a1), getString(C11849b.f102273b1), getString(C11849b.f102278c1), getString(C11849b.f102283d1));
                break;
            case 4:
                list = C16877v.q(getString(C11849b.f102325n1), getString(C11849b.f102329o1), getString(C11849b.f102333p1), getString(C11849b.f102337q1), getString(C11849b.f102341r1), getString(C11849b.f102345s1));
                break;
            case 5:
                list = C16877v.e(getString(C11849b.f102259Y0));
                break;
            case 6:
                break;
            default:
                throw new t();
        }
        List list2 = list;
        Collection collection = list2;
        if (collection == null || collection.isEmpty()) {
            O2();
        } else {
            g4(this, (Rect) null, (Float) null, list2, 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N L3(OnlineCheckoutActivity onlineCheckoutActivity, jC.q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        C11150a aVar = onlineCheckoutActivity.f94323N0;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        LinearLayout linearLayout = aVar.f90771b;
        C17542s.i(linearLayout, "checkoutContainer");
        qVar.e(linearLayout, C14617d.Padding);
        return C16807N.f139792a;
    }

    private final void M2(com.ingka.ikea.checkout.impl.delivery.bottomsheets.g gVar) {
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
                String a10 = C11818a.a("Postal code info callback", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        if (C17542s.e(gVar, g.a.f94548a)) {
            setResult(9183);
            finish();
        } else if (gVar != null) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N M3(OnlineCheckoutActivity onlineCheckoutActivity, ho.b bVar) {
        C17542s.j(bVar, "deliveryOption");
        onlineCheckoutActivity.r2().u1(bVar);
        return C16807N.f139792a;
    }

    private final void N2(boolean z10) {
        if (r2().L0()) {
            T3(this.f94315J0);
        }
        boolean isEmpty = I2().P().isEmpty();
        boolean z11 = !isEmpty;
        if (z10 && !isEmpty) {
            r2().o1();
        }
        q2().I(z11);
    }

    private final void N3(Yn.P p10) {
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
                String a10 = C11818a.a("onDeliveryTypeSelected : " + p10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        r2().m1(p10);
    }

    private final void O1(List<Object> list, Yn.P p10) {
        int i10;
        List<Object> list2 = list;
        int i11 = b.f94336a[p10.ordinal()];
        if (i11 == 1) {
            i10 = C11849b.f102216N1;
        } else if (i11 == 2) {
            i10 = C11849b.f102220O1;
        } else {
            throw new t();
        }
        r.a aVar = new r.a(i10, (String) null, (Integer) null, (Integer) null, r.c.H2, 0, (Integer) null, 40, (Integer) null, (Integer) null, (Integer) null, 1902, (DefaultConstructorMarker) null);
        this.f94313I0 = aVar;
        list2.add(aVar);
        C11436b p02 = r2().p0(r2().C0());
        if (p02 != null) {
            list2.add(p02);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to create delivery data");
        qv.e eVar = qv.e.WARN;
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
                String name = list.getClass().getName();
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

    private final void O2() {
        C11150a aVar = this.f94323N0;
        C11150a aVar2 = null;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        aVar.f90771b.setVisibility(0);
        C11150a aVar3 = this.f94323N0;
        if (aVar3 == null) {
            C17542s.z("activityCheckoutBinding");
        } else {
            aVar2 = aVar3;
        }
        FullScreenProgressView fullScreenProgressView = aVar2.f90773d;
        fullScreenProgressView.animate().alpha(0.0f).withEndAction(new b0(fullScreenProgressView));
    }

    private final void O3(com.ingka.ikea.checkout.impl.delivery.bottomsheets.f fVar) {
        String str;
        Class<OnlineCheckoutActivity> cls;
        int i10;
        com.ingka.ikea.checkout.impl.delivery.bottomsheets.f fVar2 = fVar;
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
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = OnlineCheckoutActivity.class;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Pickup point selected", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (fVar2 != null) {
            if (fVar2 instanceof f.b) {
                r2().n1();
            } else if (fVar2 instanceof f.c) {
                f.c cVar = (f.c) fVar2;
                List<Nn.Q> d10 = cVar.d();
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a11 = C11818a.a("Unavailable items: " + d10.size(), (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str6 = C11820c.a(a11);
                    }
                    if (str7 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                    i10 = 2;
                }
                k4(cVar.e(), d10, cVar.b(), cVar.a(), cVar.c());
            } else if (fVar2 instanceof f.a) {
                f.a aVar = (f.a) fVar2;
                j4(false, aVar.a(), aVar.b(), aVar.c());
                return;
            } else {
                throw new t();
            }
        }
    }

    private final void P1(List<Object> list, C12322b bVar) {
        List<Object> P10 = r2().C0().a() > 6 ? I2().P() : C16877v.n();
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
                String a10 = C11818a.a("User details: collapsedModels: " + P10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = list.getClass().getName();
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
        Collection collection = P10;
        if (!collection.isEmpty()) {
            list.addAll(collection);
            return;
        }
        list.addAll(bVar.d());
        if (!bVar.e().isEmpty()) {
            list.add(new el.b("DIVIDER_SECONDARY_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
        }
        list.addAll(bVar.e());
        if (!bVar.c().isEmpty()) {
            list.add(new el.b("DIVIDER_CONTACT_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
            list.addAll(bVar.c());
        }
    }

    /* access modifiers changed from: private */
    public static final void P2(FullScreenProgressView fullScreenProgressView) {
        fullScreenProgressView.setVisibility(8);
    }

    private final void P3() {
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
                String a10 = C11818a.a("openPostalCodeInfo", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        PostalCodeInfoBottomSheet.f94506O.a().show(getSupportFragmentManager(), "postal_code_info_bottom_sheet");
    }

    private final void Q1(List<Object> list) {
        List<Object> list2 = list;
        C11436b D02 = r2().L0() ? null : r2().D0();
        list2.add(new r.a(r2().L0() ? C11849b.f102172C1 : C11849b.f102176D1, (String) null, (Integer) null, (Integer) null, r.c.H2, 0, (Integer) null, 40, (Integer) null, 0, (Integer) null, 1390, (DefaultConstructorMarker) null));
        list2.add(new ho.i(r2().S0().d()));
        if (r2().L0() || D02 == null) {
            o0 r02 = r2().r0();
            o0 o02 = r2().o0();
            list2.add(r02);
            list2.add(o02);
            return;
        }
        list2.add(D02);
    }

    private final boolean Q2() {
        LinearLayoutManager linearLayoutManager = this.f94308F0;
        if (linearLayoutManager == null) {
            C17542s.z("listLayoutManager");
            linearLayoutManager = null;
        }
        return linearLayoutManager.z2() == p2().getItemCount() - 1;
    }

    /* access modifiers changed from: private */
    public final void Q3(List<? extends Object> list) {
        C11150a aVar = this.f94323N0;
        C11150a aVar2 = null;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        RecyclerView.q layoutManager = aVar.f90772c.getLayoutManager();
        Parcelable C12 = layoutManager != null ? layoutManager.C1() : null;
        Lg.d.q(p2(), list, true, (C17642l) null, 4, (Object) null);
        C11150a aVar3 = this.f94323N0;
        if (aVar3 == null) {
            C17542s.z("activityCheckoutBinding");
        } else {
            aVar2 = aVar3;
        }
        RecyclerView.q layoutManager2 = aVar2.f90772c.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.B1(C12);
        }
    }

    private final void R1(List<Object> list, Yn.P p10, boolean z10) {
        int i10;
        List<Object> list2 = list;
        int i11 = b.f94336a[p10.ordinal()];
        if (i11 == 1) {
            i10 = z10 ? C11849b.f102212M1 : C11849b.f102204K1;
        } else if (i11 == 2) {
            i10 = C11849b.f102208L1;
        } else {
            throw new t();
        }
        r.a aVar = new r.a(i10, (String) null, (Integer) null, (Integer) null, r.c.H2, 0, (Integer) null, 40, (Integer) null, (Integer) null, (Integer) null, 1902, (DefaultConstructorMarker) null);
        this.f94311H0 = aVar;
        list2.add(aVar);
        if (z10) {
            list2.add(new ho.i(r2().S0().d()));
        }
        list2.add(r2().q0(p10, r2().C0()));
    }

    private final void R2(boolean z10) {
        C13736a C22 = C2();
        C5314c<Intent> cVar = this.f94319L0;
        String value = r2().H0().getValue();
        if (value != null) {
            C22.a(cVar, this, value, z10);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void R3(int i10) {
        R r10;
        Lg.d p22 = p2();
        List<R> a02 = C16877v.a0(p2().e(), qg.i.class);
        ListIterator<R> listIterator = a02.listIterator(a02.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                r10 = null;
                break;
            }
            r10 = listIterator.previous();
            if (((qg.i) r10).n()) {
                break;
            }
        }
        int f10 = p22.f(r10);
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
                String a10 = C11818a.a("Check lastMandatoryFieldPosition: " + f10 + ", position: " + i10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        if (f10 == i10) {
            I2().g0();
        }
    }

    private final void S1(List<Object> list, C12322b bVar) {
        List<Object> list2 = list;
        if (bVar != null) {
            List value = this.f94321M0.getValue();
            if (r2().L0()) {
                list2.add(this.f94315J0);
            } else {
                list2.add(new el.b("DIVIDER_DELIVERY_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
            }
            P1(list, bVar);
            h0.d(list2, value);
            if (r2().b1()) {
                list2.add(new el.b("DIVIDER_PAYMENT_INFORMATION_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
                h0.c(list);
            }
            list2.add(new el.b("DIVIDER_SUMMARY_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
            list2.add(r2().Q0());
            RC.m a10 = r2().m().getValue().a();
            if (a10 != null) {
                list2.add(new el.b("DIVIDER_PRICE_ID", (Integer) null, (Integer) null, (Integer) null, 14, (DefaultConstructorMarker) null));
                list2.add(a10);
            }
            if (!bVar.f().isEmpty()) {
                list2.addAll(bVar.f());
            }
            Boolean value2 = I2().U().getValue();
            list2.add(new yo.b(value2 != null ? value2.booleanValue() : false));
        } else if (r2().L0()) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to show user details fields");
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
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = list.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            e4(new IllegalStateException("user details are null"));
        }
    }

    /* access modifiers changed from: private */
    public static final void S2(OnlineCheckoutActivity onlineCheckoutActivity, C5312a aVar) {
        char c10;
        OnlineCheckoutActivity onlineCheckoutActivity2 = onlineCheckoutActivity;
        C17542s.j(aVar, "result");
        int b10 = aVar.b();
        char c11 = '$';
        if (b10 != 0) {
            switch (b10) {
                case 3333:
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
                            String a10 = C11818a.a("Payment completed. Start confirmation", (Throwable) null);
                            if (a10 == null) {
                                onlineCheckoutActivity2.n4(false);
                                C16807N n10 = C16807N.f139792a;
                                return;
                            }
                            str = C11820c.a(a10);
                        }
                        if (str2 == null) {
                            String name = onlineCheckoutActivity.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        bVar.a(eVar, str2, false, (Throwable) null, str);
                    }
                    onlineCheckoutActivity2.n4(false);
                    C16807N n102 = C16807N.f139792a;
                    return;
                case 3334:
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
                            String a11 = C11818a.a("Express payment completed. Start confirmation", (Throwable) null);
                            if (a11 == null) {
                                onlineCheckoutActivity2.n4(true);
                                C16807N n11 = C16807N.f139792a;
                                return;
                            }
                            str3 = C11820c.a(a11);
                        }
                        if (str4 == null) {
                            String name2 = onlineCheckoutActivity.getClass().getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar2.a(eVar2, str4, false, (Throwable) null, str3);
                    }
                    onlineCheckoutActivity2.n4(true);
                    C16807N n112 = C16807N.f139792a;
                    return;
                case 3335:
                    qv.e eVar3 = qv.e.DEBUG;
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
                            String a12 = C11818a.a("Error in payment. Return to cart", (Throwable) null);
                            if (a12 == null) {
                                onlineCheckoutActivity.r2().n0();
                                onlineCheckoutActivity.finish();
                                C16807N n12 = C16807N.f139792a;
                                return;
                            }
                            str5 = C11820c.a(a12);
                        }
                        if (str6 == null) {
                            String name3 = onlineCheckoutActivity.getClass().getName();
                            C17542s.g(name3);
                            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                        }
                        bVar3.a(eVar3, str6, false, (Throwable) null, str5);
                    }
                    onlineCheckoutActivity.r2().n0();
                    onlineCheckoutActivity.finish();
                    C16807N n122 = C16807N.f139792a;
                    return;
                case 3336:
                    qv.e eVar4 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList4 = new ArrayList<>();
                    for (Object next4 : qv.d.f102012a.a()) {
                        if (((C11819b) next4).b(eVar4, false)) {
                            arrayList4.add(next4);
                        }
                    }
                    String str7 = null;
                    String str8 = null;
                    for (C11819b bVar4 : arrayList4) {
                        if (str7 == null) {
                            String a13 = C11818a.a("Express payment error", (Throwable) null);
                            if (a13 == null) {
                                onlineCheckoutActivity.r2().n0();
                                C16807N n13 = C16807N.f139792a;
                                return;
                            }
                            str7 = C11820c.a(a13);
                        }
                        if (str8 == null) {
                            String name4 = onlineCheckoutActivity.getClass().getName();
                            C17542s.g(name4);
                            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o15.length() != 0) {
                                name4 = C15854t.P0(o15, "Kt");
                            }
                            str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                        }
                        bVar4.a(eVar4, str8, false, (Throwable) null, str7);
                    }
                    onlineCheckoutActivity.r2().n0();
                    C16807N n132 = C16807N.f139792a;
                    return;
                default:
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result code: " + aVar.b());
                    qv.e eVar5 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList5 = new ArrayList<>();
                    for (Object next5 : qv.d.f102012a.a()) {
                        if (((C11819b) next5).b(eVar5, false)) {
                            arrayList5.add(next5);
                        }
                    }
                    String str9 = null;
                    String str10 = null;
                    for (C11819b bVar5 : arrayList5) {
                        if (str9 == null) {
                            String a14 = C11818a.a((String) null, illegalArgumentException);
                            if (a14 == null) {
                                C16807N n14 = C16807N.f139792a;
                                return;
                            }
                            str9 = C11820c.a(a14);
                        }
                        String str11 = str9;
                        if (str10 == null) {
                            String name5 = onlineCheckoutActivity.getClass().getName();
                            C17542s.g(name5);
                            String o16 = C15854t.o1(C15854t.s1(name5, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o16.length() != 0) {
                                name5 = C15854t.P0(o16, "Kt");
                            }
                            str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name5;
                        }
                        String str12 = str10;
                        bVar5.a(eVar5, str12, false, illegalArgumentException, str11);
                        str10 = str12;
                        str9 = str11;
                        c11 = '$';
                    }
                    C16807N n142 = C16807N.f139792a;
                    return;
            }
        } else {
            qv.e eVar6 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList6 = new ArrayList<>();
            for (Object next6 : qv.d.f102012a.a()) {
                if (((C11819b) next6).b(eVar6, false)) {
                    arrayList6.add(next6);
                }
            }
            String str13 = null;
            String str14 = null;
            for (C11819b bVar6 : arrayList6) {
                if (str13 == null) {
                    String a15 = C11818a.a("User canceled the payment view", (Throwable) null);
                    if (a15 == null) {
                        break;
                    }
                    str13 = C11820c.a(a15);
                }
                if (str14 == null) {
                    String name6 = onlineCheckoutActivity.getClass().getName();
                    C17542s.g(name6);
                    c10 = '$';
                    String o17 = C15854t.o1(C15854t.s1(name6, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o17.length() != 0) {
                        name6 = C15854t.P0(o17, "Kt");
                    }
                    str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name6;
                } else {
                    c10 = '$';
                }
                char c12 = c10;
                bVar6.a(eVar6, str14, false, (Throwable) null, str13);
            }
            onlineCheckoutActivity.r2().n0();
            C16807N n15 = C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public final void S3() {
        Object obj;
        Iterator it = C16877v.a0(p2().e(), qg.i.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((qg.i) obj).o(), Boolean.FALSE)) {
                break;
            }
        }
        int f10 = p2().f((qg.i) obj);
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
                String a10 = C11818a.a("Scroll to error on index: " + f10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        U3(f10);
    }

    /* access modifiers changed from: private */
    public static final Lg.d T1(OnlineCheckoutActivity onlineCheckoutActivity) {
        OnlineCheckoutActivity onlineCheckoutActivity2 = onlineCheckoutActivity;
        pg.k kVar = new pg.k(onlineCheckoutActivity2);
        C10151e eVar = new C10151e(onlineCheckoutActivity2, onlineCheckoutActivity2);
        pg.p pVar = new pg.p(onlineCheckoutActivity2);
        C11254a aVar = new C11254a();
        C13417a aVar2 = new C13417a(new r(onlineCheckoutActivity2));
        ho.f fVar = new ho.f(onlineCheckoutActivity.v0(), onlineCheckoutActivity.q2(), onlineCheckoutActivity2.f94305C0);
        Wn.o u22 = onlineCheckoutActivity.u2();
        ho.f fVar2 = fVar;
        C13417a aVar3 = aVar2;
        C11254a aVar4 = aVar;
        C11374a aVar5 = new C11374a(C11374a.C2202a.CHECKOUT, u22, new G(new C11175z(onlineCheckoutActivity2), new A(onlineCheckoutActivity2), new B(onlineCheckoutActivity2), new C(onlineCheckoutActivity2), new D(onlineCheckoutActivity2), new E(onlineCheckoutActivity2), new F(onlineCheckoutActivity2), new G(onlineCheckoutActivity2), new H(onlineCheckoutActivity2)));
        C12496a aVar6 = new C12496a(new C11168s(onlineCheckoutActivity2));
        C10150d dVar = new C10150d();
        C10148b bVar = new C10148b(onlineCheckoutActivity2, onlineCheckoutActivity2, "checkout");
        C11248a aVar7 = new C11248a();
        pg.j jVar = new pg.j(onlineCheckoutActivity2, onlineCheckoutActivity2);
        C c10 = new C(onlineCheckoutActivity2);
        pg.m mVar = new pg.m();
        C13335a aVar8 = new C13335a();
        H h10 = new H(onlineCheckoutActivity2, onlineCheckoutActivity2);
        C11212q qVar = new C11212q();
        H h11 = h10;
        ho.l lVar = new ho.l(onlineCheckoutActivity.v0(), new C11169t(onlineCheckoutActivity2));
        C11211p pVar2 = new C11211p();
        ho.j jVar2 = new ho.j(new C11170u(onlineCheckoutActivity2));
        pg.l lVar2 = new pg.l();
        ho.j jVar3 = jVar2;
        yo.d dVar2 = new yo.d(new C11171v(onlineCheckoutActivity2));
        C11208m mVar2 = new C11208m();
        C11208m mVar3 = mVar2;
        yo.d dVar3 = dVar2;
        ho.l lVar3 = lVar;
        return new Lg.d((Lg.a<?>[]) new Lg.a[]{kVar, eVar, pVar, aVar4, aVar3, fVar2, aVar5, aVar6, dVar, bVar, aVar7, jVar, c10, mVar, aVar8, h11, qVar, lVar3, pVar2, jVar3, lVar2, dVar3, mVar3, new C11209n(), new vl.m(), new eo.b(new C11172w(onlineCheckoutActivity2), new C11174y(onlineCheckoutActivity2))});
    }

    private final void T2() {
        C16534i.M(C16534i.R(C5208k.a(r2().G0(), getLifecycle(), r.b.CREATED), new c(this, (C17164e<? super c>) null)), C5222z.a(this));
        F0 unused = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
        F0 unused2 = C16314k.d(C5222z.a(this), (C17168i) null, (T) null, new e(this, (C17164e<? super e>) null), 3, (Object) null);
        ip.j.a(r2().I0(), this, new C11153c(this));
    }

    private final void T3(dl.r rVar) {
        int indexOf = p2().e().indexOf(rVar);
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
                String a10 = C11818a.a("Scroll to index: " + indexOf, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        U3(indexOf);
    }

    /* access modifiers changed from: private */
    public static final C16807N U1(OnlineCheckoutActivity onlineCheckoutActivity, String str) {
        C17542s.j(str, "it");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected onDeleteTransaction");
        qv.e eVar = qv.e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalArgumentException, str4);
            str2 = str4;
            str3 = str5;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U2(OnlineCheckoutActivity onlineCheckoutActivity, C10803f fVar) {
        C17542s.j(fVar, "it");
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
                String a10 = C11818a.a("Checkout data updated", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        onlineCheckoutActivity.r2().j1(fVar);
        onlineCheckoutActivity.p4();
        return C16807N.f139792a;
    }

    private final void U3(int i10) {
        long j10 = Xo.c.b(this) ? 500 : 50;
        if (i10 != -1) {
            C11150a aVar = this.f94323N0;
            LinearLayoutManager linearLayoutManager = null;
            if (aVar == null) {
                C17542s.z("activityCheckoutBinding");
                aVar = null;
            }
            aVar.f90772c.postDelayed(new a0(this, i10), j10);
            LinearLayoutManager linearLayoutManager2 = this.f94308F0;
            if (linearLayoutManager2 == null) {
                C17542s.z("listLayoutManager");
            } else {
                linearLayoutManager = linearLayoutManager2;
            }
            View e02 = linearLayoutManager.e0(i10);
            if (e02 != null) {
                e02.requestFocus();
                e02.sendAccessibilityEvent(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N V1(OnlineCheckoutActivity onlineCheckoutActivity, lo.j jVar) {
        C17542s.j(jVar, "it");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected onAddToCalendarClicked");
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
        return C16807N.f139792a;
    }

    private final void V2() {
        ip.j.a(r2().B0(), this, new C11158h(this));
    }

    /* access modifiers changed from: private */
    public static final void V3(OnlineCheckoutActivity onlineCheckoutActivity, int i10) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        LinearLayoutManager linearLayoutManager = null;
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Start delayed scrolling", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        LinearLayoutManager linearLayoutManager2 = onlineCheckoutActivity.f94308F0;
        if (linearLayoutManager2 == null) {
            C17542s.z("listLayoutManager");
        } else {
            linearLayoutManager = linearLayoutManager2;
        }
        onlineCheckoutActivity.m4(linearLayoutManager, onlineCheckoutActivity, i10, Xo.e.a(24));
    }

    /* access modifiers changed from: private */
    public static final C16807N W1(OnlineCheckoutActivity onlineCheckoutActivity) {
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
                String a10 = C11818a.a("Delivery change fulfilment method clicked", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        c.a.a(onlineCheckoutActivity.m2(), "change_delivery_method", (Map) null, (Map) null, 6, (Object) null);
        onlineCheckoutActivity.r2().x0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W2(OnlineCheckoutActivity onlineCheckoutActivity, Do.b bVar) {
        C17542s.j(bVar, "it");
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
                String a10 = C11818a.a("checkoutStage changed: " + bVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        if (bVar instanceof b.C1501b) {
            onlineCheckoutActivity.p4();
            onlineCheckoutActivity.O2();
            b.C1501b bVar3 = (b.C1501b) bVar;
            Do.a a11 = bVar3.a();
            if (!C17542s.e(a11, a.i.f79845a)) {
                if (C17542s.e(a11, a.f.f79839a)) {
                    onlineCheckoutActivity.q2().K(onlineCheckoutActivity.v0().s().b(), onlineCheckoutActivity.r2().r0().f(), onlineCheckoutActivity.r2().o0().f());
                    onlineCheckoutActivity.r2().C1(bVar3.a());
                } else if (C17542s.e(a11, a.g.f79841a)) {
                    if (onlineCheckoutActivity.r2().L0()) {
                        onlineCheckoutActivity.T3(onlineCheckoutActivity.f94311H0);
                    }
                    onlineCheckoutActivity.r2().C1(bVar3.a());
                } else if (!C17542s.e(a11, a.e.f79837a)) {
                    if (C17542s.e(a11, a.C1490a.f79829a)) {
                        if (onlineCheckoutActivity.r2().L0()) {
                            onlineCheckoutActivity.T3(onlineCheckoutActivity.f94313I0);
                        }
                        onlineCheckoutActivity.o4();
                    } else if (a11 instanceof a.c) {
                        onlineCheckoutActivity.U3(onlineCheckoutActivity.p2().e().indexOf(((a.c) a11).b()));
                        onlineCheckoutActivity.q2().F();
                    } else if (a11 instanceof a.b) {
                        onlineCheckoutActivity.N2(((a.b) a11).b());
                    } else if (!C17542s.e(a11, a.h.f79843a) && !C17542s.e(a11, a.d.f79835a)) {
                        throw new t();
                    }
                }
            }
        } else if (bVar instanceof b.a) {
            onlineCheckoutActivity.L2(((b.a) bVar).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void W3(String str) {
        Iterator<Object> it = p2().e().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            Object next = it.next();
            if ((next instanceof qg.i) && C17542s.e(((qg.i) next).e(), str)) {
                break;
            }
            i10++;
        }
        if (i10 != -1) {
            LinearLayoutManager linearLayoutManager = this.f94308F0;
            if (linearLayoutManager == null) {
                C17542s.z("listLayoutManager");
                linearLayoutManager = null;
            }
            m4(linearLayoutManager, this, i10, Xo.e.a(24));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N X1(OnlineCheckoutActivity onlineCheckoutActivity) {
        xo.i I22 = onlineCheckoutActivity.I2();
        String value = onlineCheckoutActivity.r2().H0().getValue();
        if (value != null) {
            I22.h0(value, onlineCheckoutActivity.r2().S0().b());
            onlineCheckoutActivity.q2().D(!onlineCheckoutActivity.r2().L0());
            return C16807N.f139792a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void X2() {
        ip.j.a(r2().N0(), this, new C11159i(this));
        ip.j.a(I2().T(), this, new C11160j(this, this));
        ip.j.a(I2().R(), this, new C11161k(this));
        ip.j.a(I2().S(), this, new C11162l(this));
        ip.j.a(r2().y0(), this, new C11164n(this));
        ip.j.a(r2().U0(), this, new C11165o(this, this));
    }

    private final void X3() {
        C11150a aVar = this.f94323N0;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        Toolbar toolbar = (Toolbar) aVar.getRoot().findViewById(Uo.a.f88327h);
        toolbar.setNavigationOnClickListener(new J(this));
        toolbar.setNavigationIcon(C6012a.e(toolbar.getContext(), BackButton.CLOSE.getResId()));
        toolbar.setNavigationContentDescription((CharSequence) getString(Oo.b.f84665i));
        toolbar.setTitle((CharSequence) getString(C11849b.f102228Q1));
        toolbar.x(n0.f94626a);
        toolbar.getMenu().findItem(l0.f94619k).setOnMenuItemClickListener(new K(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N Y1(OnlineCheckoutActivity onlineCheckoutActivity, Yn.P p10, Double d10) {
        C17542s.j(p10, "deliveryType");
        onlineCheckoutActivity.N3(p10);
        onlineCheckoutActivity.q2().w(onlineCheckoutActivity.v0().s().b(), p10, d10);
        List<b.C2205b> P02 = onlineCheckoutActivity.r2().P0();
        List<b.a> E02 = onlineCheckoutActivity.r2().E0();
        Wn.b q22 = onlineCheckoutActivity.q2();
        String b10 = onlineCheckoutActivity.v0().s().b();
        if (P02 == null) {
            P02 = C16877v.n();
        }
        List<b.C2205b> list = P02;
        if (E02 == null) {
            E02 = C16877v.n();
        }
        List<b.a> list2 = E02;
        MComConfig mComConfig = onlineCheckoutActivity.f94310H;
        Wn.c.a(q22, b10, p10, list, list2, mComConfig != null ? mComConfig.r() : false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y2(OnlineCheckoutActivity onlineCheckoutActivity, ip.d dVar) {
        C17542s.j(dVar, "it");
        dVar.a(new Z(onlineCheckoutActivity));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Y3(OnlineCheckoutActivity onlineCheckoutActivity, View view) {
        onlineCheckoutActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final C16807N Z1(OnlineCheckoutActivity onlineCheckoutActivity) {
        onlineCheckoutActivity.P3();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z2(OnlineCheckoutActivity onlineCheckoutActivity, ip.d dVar, Boolean bool) {
        C17542s.j(dVar, "$this$handle");
        Ar.j y22 = onlineCheckoutActivity.y2();
        C11150a aVar = onlineCheckoutActivity.f94323N0;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        j.a.r(y22, aVar.f90771b, Oo.b.f84389H1, Oo.b.f84734o2, 0, (View) null, (C17631a) null, 56, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean Z3(OnlineCheckoutActivity onlineCheckoutActivity, MenuItem menuItem) {
        C17542s.j(menuItem, "it");
        C13992a D22 = onlineCheckoutActivity.D2();
        FragmentManager supportFragmentManager = onlineCheckoutActivity.getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        D22.c(supportFragmentManager);
        return true;
    }

    /* access modifiers changed from: private */
    public static final C16807N a2(OnlineCheckoutActivity onlineCheckoutActivity, String str) {
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
                String a10 = C11818a.a("Edit details clicked: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        onlineCheckoutActivity.I2().N();
        onlineCheckoutActivity.p4();
        if (str != null) {
            onlineCheckoutActivity.W3(str);
            onlineCheckoutActivity.q2().b(str);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N a3(OnlineCheckoutActivity onlineCheckoutActivity, C10802e.a aVar) {
        C17542s.j(aVar, "it");
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
                String a10 = C11818a.a("ambiguousDeliveryArea updated: " + aVar.a(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        AmbiguousDeliveryAreaBottomSheet.f94463Z.a(aVar).show(onlineCheckoutActivity.getSupportFragmentManager(), "ambiguous_delivery_area_bottom_sheet");
        return C16807N.f139792a;
    }

    private final void a4(boolean z10, List<ChangePickupPointBottomSheet.e> list, C10813p pVar, u uVar, int i10) {
        if (list.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("Trying to change pickup point with no options");
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
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = OnlineCheckoutActivity.class.getName();
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
            j.a.j(y2(), this, C11849b.f102203K0, Integer.valueOf(Oo.b.f84722n1), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
            return;
        }
        ChangePickupPointBottomSheet.d dVar = ChangePickupPointBottomSheet.f94470A0;
        String value = r2().H0().getValue();
        if (value != null) {
            String str5 = value;
            UserPostalCodeAddress S02 = r2().S0();
            MComConfig mComConfig = this.f94310H;
            dVar.a(str5, S02, mComConfig != null ? mComConfig.r() : false, z10, i10, list).show(getSupportFragmentManager(), "change_pickup_point_dialog");
            Iterable<ChangePickupPointBottomSheet.e> iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (ChangePickupPointBottomSheet.e g10 : iterable) {
                    if (!g10.g().isEmpty()) {
                        q2().E(Yn.P.COLLECT, pVar, uVar);
                        return;
                    } else {
                        C10813p pVar2 = pVar;
                        u uVar2 = uVar;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N b2(OnlineCheckoutActivity onlineCheckoutActivity, String str) {
        C17542s.j(str, "deliveryArrangementId");
        onlineCheckoutActivity.c4(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b3(OnlineCheckoutActivity onlineCheckoutActivity, OnlineCheckoutActivity onlineCheckoutActivity2, Throwable th2) {
        C17542s.j(th2, "it");
        j.a.j(onlineCheckoutActivity.y2(), onlineCheckoutActivity2, C11849b.f102203K0, Integer.valueOf(Oo.b.f84722n1), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
        return C16807N.f139792a;
    }

    private final void b4(String str, O o10) {
        ChangeDeliveryTimeSlotFragment.a aVar = null;
        if (r2().X0() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to handle change timeslot");
            qv.e eVar = qv.e.ERROR;
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
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = OnlineCheckoutActivity.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
            return;
        }
        ChangeDeliveryTimeSlotFragment.b bVar2 = ChangeDeliveryTimeSlotFragment.f94553S;
        String value = r2().H0().getValue();
        if (value != null) {
            String str6 = value;
            UserPostalCodeAddress S02 = r2().S0();
            List<M> b10 = o10.b();
            if (b10 != null) {
                aVar = new ChangeDeliveryTimeSlotFragment.a(b10, o10.c());
            }
            bVar2.a(str6, S02, str, aVar).show(getSupportFragmentManager(), "change_delivery_time_slot_dialog");
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N c2(OnlineCheckoutActivity onlineCheckoutActivity) {
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
                String a10 = C11818a.a("onGooglePayClick", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        Xn.e x22 = onlineCheckoutActivity.x2();
        FragmentManager supportFragmentManager = onlineCheckoutActivity.getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String value = onlineCheckoutActivity.r2().H0().getValue();
        if (value != null) {
            x22.a(supportFragmentManager, value);
            onlineCheckoutActivity.q2().i();
            return C16807N.f139792a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N c3(OnlineCheckoutActivity onlineCheckoutActivity, Throwable th2) {
        C17542s.j(th2, UiComponentContainer.RESULT_ERROR);
        onlineCheckoutActivity.e4(th2);
        return C16807N.f139792a;
    }

    private final void c4(String str) {
        Xn.a v22 = v2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String value = r2().H0().getValue();
        if (value != null) {
            v22.a(supportFragmentManager, value, str);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N d2(OnlineCheckoutActivity onlineCheckoutActivity) {
        onlineCheckoutActivity.r2().g1(f.b.a.f79927a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N d3(OnlineCheckoutActivity onlineCheckoutActivity, OnlineCheckoutActivity onlineCheckoutActivity2, ip.d dVar) {
        C17542s.j(dVar, "it");
        dVar.a(new W(onlineCheckoutActivity, onlineCheckoutActivity2));
        return C16807N.f139792a;
    }

    private final void d4() {
        Xn.c w22 = w2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String value = r2().H0().getValue();
        if (value != null) {
            w22.a(supportFragmentManager, value);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N e2(OnlineCheckoutActivity onlineCheckoutActivity, String str, int i10) {
        C17542s.j(str, "deliveryServiceId");
        onlineCheckoutActivity.j4(true, str, onlineCheckoutActivity.r2().w0(str, i10), i10 - 1);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e3(OnlineCheckoutActivity onlineCheckoutActivity, OnlineCheckoutActivity onlineCheckoutActivity2, ip.d dVar, Boolean bool) {
        C17542s.j(dVar, "$this$handle");
        if (C17542s.e(bool, Boolean.TRUE)) {
            j.a.j(onlineCheckoutActivity.y2(), onlineCheckoutActivity2, C11849b.f102203K0, Integer.valueOf(Oo.b.f84722n1), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
        }
        return C16807N.f139792a;
    }

    private final void e4(Throwable th2) {
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
                String a10 = C11818a.a("Show fatal error: " + th2.getMessage(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        if (th2 instanceof C10802e) {
            C10802e eVar2 = (C10802e) th2;
            if (eVar2 instanceof C10802e.c.a) {
                String string = getString(C11849b.f102207L0);
                C17542s.i(string, "getString(...)");
                i4(this, (FullscreenErrorDialogFragment.b) null, (String) null, string, 3, (Object) null);
            } else if (C17542s.e(eVar2, C10802e.d.f84046a)) {
                String string2 = getString(C11849b.f102191H0);
                C17542s.i(string2, "getString(...)");
                String string3 = getString(C11849b.f102187G0);
                C17542s.i(string3, "getString(...)");
                i4(this, (FullscreenErrorDialogFragment.b) null, string2, string3, 1, (Object) null);
            } else if (eVar2 instanceof C10802e.C1702e) {
                l4(((C10802e.C1702e) th2).a());
            } else if (eVar2 instanceof C10802e.b) {
                C10802e.b bVar2 = (C10802e.b) th2;
                if (C17542s.e(bVar2, C10802e.b.a.f84041a)) {
                    String string4 = getString(C11849b.f102207L0);
                    C17542s.i(string4, "getString(...)");
                    i4(this, (FullscreenErrorDialogFragment.b) null, (String) null, string4, 3, (Object) null);
                } else if (C17542s.e(bVar2, C10802e.b.C1701b.f84042a) || (bVar2 instanceof C10802e.b.c)) {
                    i4(this, (FullscreenErrorDialogFragment.b) null, (String) null, (String) null, 7, (Object) null);
                } else {
                    throw new t();
                }
            } else if ((eVar2 instanceof C10802e.c.b) || (eVar2 instanceof C10802e.a)) {
                i4(this, (FullscreenErrorDialogFragment.b) null, (String) null, (String) null, 7, (Object) null);
            } else {
                throw new t();
            }
        } else {
            i4(this, (FullscreenErrorDialogFragment.b) null, (String) null, (String) null, 7, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f2(OnlineCheckoutActivity onlineCheckoutActivity, String str, String str2, List list) {
        C17542s.j(str, "id");
        C17542s.j(str2, "selectedTimeSlotId");
        C17542s.j(list, "updatedCapabilities");
        onlineCheckoutActivity.J3(str, str2, list);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f3(OnlineCheckoutActivity onlineCheckoutActivity, ip.d dVar) {
        C17542s.j(dVar, "it");
        dVar.a(new Y(onlineCheckoutActivity));
        return C16807N.f139792a;
    }

    private final void f4(Rect rect, Float f10, List<String> list) {
        C11150a aVar = this.f94323N0;
        C11150a aVar2 = null;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        aVar.f90771b.setVisibility(8);
        if (rect == null || f10 == null) {
            C11150a aVar3 = this.f94323N0;
            if (aVar3 == null) {
                C17542s.z("activityCheckoutBinding");
            } else {
                aVar2 = aVar3;
            }
            FullScreenProgressView fullScreenProgressView = aVar2.f90773d;
            fullScreenProgressView.setVisibility(0);
            fullScreenProgressView.setAlpha(1.0f);
            fullScreenProgressView.A(list);
            return;
        }
        C11150a aVar4 = this.f94323N0;
        if (aVar4 == null) {
            C17542s.z("activityCheckoutBinding");
        } else {
            aVar2 = aVar4;
        }
        FullScreenProgressView fullScreenProgressView2 = aVar2.f90773d;
        fullScreenProgressView2.setVisibility(0);
        fullScreenProgressView2.setAlpha(1.0f);
        fullScreenProgressView2.x(rect, f10.floatValue(), list);
    }

    /* access modifiers changed from: private */
    public static final C16807N g2(OnlineCheckoutActivity onlineCheckoutActivity, C10800c cVar) {
        C17542s.j(cVar, "it");
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
                String a10 = C11818a.a("Delivery change fulfilment method clicked", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
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
        onlineCheckoutActivity.K3(cVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g3(OnlineCheckoutActivity onlineCheckoutActivity, ip.d dVar, Throwable th2) {
        C17542s.j(dVar, "$this$handle");
        if (th2 != null) {
            onlineCheckoutActivity.e4(th2);
        }
        return C16807N.f139792a;
    }

    static /* synthetic */ void g4(OnlineCheckoutActivity onlineCheckoutActivity, Rect rect, Float f10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rect = null;
        }
        if ((i10 & 2) != 0) {
            f10 = null;
        }
        onlineCheckoutActivity.f4(rect, f10, list);
    }

    /* access modifiers changed from: private */
    public static final C16807N h2(OnlineCheckoutActivity onlineCheckoutActivity, String str, O o10) {
        C17542s.j(str, "deliveryArrangementId");
        C17542s.j(o10, "timeWindowData");
        onlineCheckoutActivity.b4(str, o10);
        return C16807N.f139792a;
    }

    private final void h3() {
        getSupportFragmentManager().R1("AmbiguousDeliveryAreaBottomSheetRequestKey", this, new L(this));
        getSupportFragmentManager().R1("ChangePickupPointBottomSheetRequestKey", this, new M(this));
        getSupportFragmentManager().R1("ChangeDeliveryMethodRequestKey", this, new N(this));
        getSupportFragmentManager().R1("UnavailableItemsBottomSheetRequestKey", this, new O(this));
        getSupportFragmentManager().R1("PostalCodeInfoBottomSheetResultRequestKey", this, new P(this));
        getSupportFragmentManager().R1("FullscreenErrorDialogFragmentRequestKey", this, new Q(this));
        getSupportFragmentManager().R1("UpdateAddressBottomSheetRequestKey", this, new S(this));
        getSupportFragmentManager().R1("ExpressPaymentBottomSheet_REQUEST_KEY", this, new T(this));
    }

    private final void h4(FullscreenErrorDialogFragment.b bVar, String str, String str2) {
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (C11819b bVar2 : arrayList) {
            if (str4 == null) {
                String a10 = C11818a.a("Show generic fatal error", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = OnlineCheckoutActivity.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str7 = str5;
            bVar2.a(eVar, str7, false, (Throwable) null, str6);
            str4 = str6;
            str5 = str7;
        }
        Xn.g z22 = z2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        String string = getString(C11849b.f102170C);
        C17542s.i(string, "getString(...)");
        MComConfig mComConfig = this.f94310H;
        if (mComConfig != null) {
            str3 = mComConfig.e();
        }
        z22.a(supportFragmentManager, bVar, str, str2, string, str3);
    }

    /* access modifiers changed from: private */
    public static final C16807N i2(OnlineCheckoutActivity onlineCheckoutActivity) {
        onlineCheckoutActivity.r2().l1();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void i3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        fo.b bVar = (fo.b) bundle.getParcelable("AmbiguousDeliveryAreaBottomSheetBundleKey");
        String a10 = bVar != null ? bVar.a() : null;
        if (a10 != null) {
            Do.f.J1(onlineCheckoutActivity.r2(), a10, (Do.m) null, false, 6, (Object) null);
            return;
        }
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar2 : arrayList) {
            if (str2 == null) {
                String a11 = C11818a.a("No area code selected, close checkout silently", (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str2 = C11820c.a(a11);
            }
            if (str3 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar2.a(eVar, str3, false, (Throwable) null, str2);
        }
        onlineCheckoutActivity.finish();
    }

    static /* synthetic */ void i4(OnlineCheckoutActivity onlineCheckoutActivity, FullscreenErrorDialogFragment.b bVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = FullscreenErrorDialogFragment.b.GENERIC_ERROR;
        }
        if ((i10 & 2) != 0) {
            str = onlineCheckoutActivity.getString(C11849b.f102203K0);
        }
        if ((i10 & 4) != 0) {
            str2 = onlineCheckoutActivity.getString(C11849b.f102211M0);
        }
        onlineCheckoutActivity.h4(bVar, str, str2);
    }

    /* access modifiers changed from: private */
    public static final C16807N j2(OnlineCheckoutActivity onlineCheckoutActivity) {
        c.a.a(onlineCheckoutActivity.m2(), "compare_delivery_prices", (Map) null, (Map) null, 6, (Object) null);
        onlineCheckoutActivity.d4();
        onlineCheckoutActivity.q2().b(Wn.q.DELIVERY_COST.b());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void j3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        onlineCheckoutActivity.O3((com.ingka.ikea.checkout.impl.delivery.bottomsheets.f) bundle.getParcelable("ChangePickupPointBottomSheetBundleKey"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j4(boolean r29, java.lang.String r30, java.lang.String r31, int r32) {
        /*
            r28 = this;
            r0 = r30
            r1 = r31
            r2 = 0
            if (r1 != 0) goto L_0x0018
            Do.f r3 = r28.r2()
            Nn.k r0 = r3.F0(r0)
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = r0.a()
            goto L_0x0026
        L_0x0016:
            r0 = r2
            goto L_0x0026
        L_0x0018:
            Do.f r3 = r28.r2()
            Nn.o r0 = r3.u0(r0)
            if (r0 == 0) goto L_0x0016
            java.util.List r0 = YH.C16877v.e(r0)
        L_0x0026:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r8 = "main"
            java.lang.String r9 = "Kt"
            r11 = 36
            java.lang.Class<com.ingka.ikea.checkout.impl.OnlineCheckoutActivity> r12 = com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.class
            r13 = 2
            if (r3 == 0) goto L_0x0139
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0042
            goto L_0x0139
        L_0x0042:
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x004e:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x0064
            java.lang.Object r15 = r3.next()
            Nn.o r15 = (Nn.C10812o) r15
            java.util.List r15 = Co.c.m(r15, r1)
            if (r15 == 0) goto L_0x004e
            r14.add(r15)
            goto L_0x004e
        L_0x0064:
            java.util.List r18 = YH.C16877v.A(r14)
            r1 = r18
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0093
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            java.lang.Object r1 = YH.C16877v.w0(r0)
            Nn.o r1 = (Nn.C10812o) r1
            Nn.p r19 = r1.i()
            java.lang.Object r0 = YH.C16877v.w0(r0)
            Nn.o r0 = (Nn.C10812o) r0
            Nn.u r20 = r0.k()
            r16 = r28
            r17 = r29
            r21 = r32
            r16.a4(r17, r18, r19, r20, r21)
            return
        L_0x0093:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No pickup points found"
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00ad:
            boolean r15 = r3.hasNext()
            r7 = 0
            if (r15 == 0) goto L_0x00c5
            java.lang.Object r15 = r3.next()
            r10 = r15
            qv.b r10 = (qv.C11819b) r10
            boolean r7 = r10.b(r1, r7)
            if (r7 == 0) goto L_0x00ad
            r14.add(r15)
            goto L_0x00ad
        L_0x00c5:
            java.util.Iterator r3 = r14.iterator()
            r10 = r2
            r14 = r10
        L_0x00cb:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L_0x0138
            java.lang.Object r15 = r3.next()
            r21 = r15
            qv.b r21 = (qv.C11819b) r21
            if (r10 != 0) goto L_0x00e6
            java.lang.String r10 = qv.C11818a.a(r2, r0)
            if (r10 != 0) goto L_0x00e2
            goto L_0x0138
        L_0x00e2:
            java.lang.String r10 = qv.C11820c.a(r10)
        L_0x00e6:
            if (r14 != 0) goto L_0x0128
            java.lang.String r14 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r14)
            java.lang.String r15 = HJ.C15854t.s1(r14, r11, r2, r13, r2)
            r11 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r11, r2, r13, r2)
            int r11 = r15.length()
            if (r11 != 0) goto L_0x0100
            goto L_0x0104
        L_0x0100:
            java.lang.String r14 = HJ.C15854t.P0(r15, r9)
        L_0x0104:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r15 = 1
            boolean r11 = HJ.C15854t.b0(r11, r8, r15)
            if (r11 == 0) goto L_0x0115
            r11 = r6
            goto L_0x0116
        L_0x0115:
            r11 = r5
        L_0x0116:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            r15.append(r4)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
        L_0x0128:
            r22 = r1
            r23 = r14
            r24 = r7
            r25 = r0
            r26 = r10
            r21.a(r22, r23, r24, r25, r26)
            r11 = 36
            goto L_0x00cb
        L_0x0138:
            return
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No delivery services found"
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0153:
            boolean r10 = r3.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x016b
            java.lang.Object r10 = r3.next()
            r14 = r10
            qv.b r14 = (qv.C11819b) r14
            boolean r11 = r14.b(r1, r11)
            if (r11 == 0) goto L_0x0153
            r7.add(r10)
            goto L_0x0153
        L_0x016b:
            java.util.Iterator r3 = r7.iterator()
            r7 = r2
            r10 = r7
        L_0x0171:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x01e2
            java.lang.Object r14 = r3.next()
            r22 = r14
            qv.b r22 = (qv.C11819b) r22
            if (r7 != 0) goto L_0x018c
            java.lang.String r7 = qv.C11818a.a(r2, r0)
            if (r7 != 0) goto L_0x0188
            goto L_0x01e2
        L_0x0188:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x018c:
            if (r10 != 0) goto L_0x01d1
            java.lang.String r10 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r10)
            r14 = 36
            java.lang.String r15 = HJ.C15854t.s1(r10, r14, r2, r13, r2)
            r14 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r14, r2, r13, r2)
            int r16 = r15.length()
            if (r16 != 0) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            java.lang.String r10 = HJ.C15854t.P0(r15, r9)
        L_0x01ac:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r2 = 1
            boolean r15 = HJ.C15854t.b0(r15, r8, r2)
            if (r15 == 0) goto L_0x01bd
            r15 = r6
            goto L_0x01be
        L_0x01bd:
            r15 = r5
        L_0x01be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            goto L_0x01d3
        L_0x01d1:
            r14 = 46
        L_0x01d3:
            r23 = r1
            r24 = r10
            r25 = r11
            r26 = r0
            r27 = r7
            r22.a(r23, r24, r25, r26, r27)
            r2 = 0
            goto L_0x0171
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.j4(boolean, java.lang.String, java.lang.String, int):void");
    }

    /* access modifiers changed from: private */
    public static final C11199d.a k2(OnlineCheckoutActivity onlineCheckoutActivity) {
        String string = onlineCheckoutActivity.getString(C11849b.f102210M);
        C17542s.i(string, "getString(...)");
        return new C11199d.a((Integer) null, Integer.valueOf(ip.h.a(Xo.e.a(16))), string, new C11167q(onlineCheckoutActivity), 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final void k3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "<unused var>");
        onlineCheckoutActivity.r2().i0();
    }

    private final void k4(boolean z10, List<Nn.Q> list, Do.m mVar, C10813p pVar, u uVar) {
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
                String a10 = C11818a.a("showUnavailableItems", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        Xn.k F22 = F2();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        F22.a(supportFragmentManager, z10, list, r2().A0(), mVar, pVar, uVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N l2(OnlineCheckoutActivity onlineCheckoutActivity, int i10) {
        xo.i I22 = onlineCheckoutActivity.I2();
        String value = onlineCheckoutActivity.r2().H0().getValue();
        if (value != null) {
            I22.h0(value, onlineCheckoutActivity.r2().S0().b());
            onlineCheckoutActivity.q2().D(!onlineCheckoutActivity.r2().L0());
            return C16807N.f139792a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final void l3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        fo.o oVar = (fo.o) bundle.getParcelable("UnavailableItemsBottomSheetBundleKey");
        if (oVar != null) {
            onlineCheckoutActivity.r2().g0(oVar.a(), oVar.b(), oVar.c());
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No callback result from unavailable items");
        qv.e eVar = qv.e.ERROR;
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
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 != null) {
                    str2 = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str4 = str2;
            if (str3 == null) {
                String name = onlineCheckoutActivity.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, illegalArgumentException, str4);
            str2 = str4;
            str3 = str5;
        }
    }

    private final void l4(C10802e.C1702e.a aVar) {
        String str;
        String str2;
        FullscreenErrorDialogFragment.b bVar;
        int[] iArr = b.f94337b;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 1) {
            str = getString(C11849b.f102199J0);
            C17542s.i(str, "getString(...)");
        } else if (i10 == 2 || i10 == 3) {
            str = getString(Oo.b.f84845y5);
            C17542s.i(str, "getString(...)");
        } else {
            throw new t();
        }
        int i11 = iArr[aVar.ordinal()];
        if (i11 == 1) {
            str2 = getString(C11849b.f102195I0);
            C17542s.i(str2, "getString(...)");
        } else if (i11 == 2) {
            str2 = getString(Oo.b.f84835x5);
            C17542s.i(str2, "getString(...)");
        } else if (i11 == 3) {
            str2 = getString(C11849b.f102211M0);
            C17542s.i(str2, "getString(...)");
        } else {
            throw new t();
        }
        int i12 = iArr[aVar.ordinal()];
        if (i12 == 1) {
            bVar = FullscreenErrorDialogFragment.b.GENERIC_ERROR;
        } else if (i12 == 2 || i12 == 3) {
            bVar = FullscreenErrorDialogFragment.b.POSTAL_CODE_ERROR;
        } else {
            throw new t();
        }
        h4(bVar, str, str2);
    }

    /* access modifiers changed from: private */
    public static final void m3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        onlineCheckoutActivity.M2((com.ingka.ikea.checkout.impl.delivery.bottomsheets.g) bundle.getParcelable("PostalCodeInfoBottomSheetResultBundleKey"));
    }

    private final void m4(LinearLayoutManager linearLayoutManager, Context context, int i10, float f10) {
        if (context != null) {
            linearLayoutManager.j2(new C11405e(context, i10, (int) f10));
        }
    }

    /* access modifiers changed from: private */
    public static final void n3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        onlineCheckoutActivity.J2((com.ingka.ikea.checkout.impl.ui.a) bundle.getParcelable("FullscreenErrorDialogFragmentBundleKey"));
    }

    private final void n4(boolean z10) {
        String str;
        String str2;
        String value = r2().H0().getValue();
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<OnlineCheckoutActivity> cls = OnlineCheckoutActivity.class;
        if (value == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot start confirmation, checkout id is null");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str5 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str6 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    str2 = str3;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str4 : str2) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str2 = str3;
                }
                String str7 = str6;
                bVar.a(eVar, str7, false, illegalStateException, str5);
                str6 = str7;
                eVar = eVar;
                str3 = str2;
            }
            return;
        }
        String str8 = str3;
        Intent a11 = ConfirmationActivity.f94397Q.a(this, value);
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str9 = null;
        String str10 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str9 == null) {
                String a12 = C11818a.a("Start confirmation view", (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str9 = C11820c.a(a12);
            }
            if (str10 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                str = str4;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str8) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str = str4;
            }
            String str11 = str10;
            bVar2.a(eVar2, str11, false, (Throwable) null, str9);
            str10 = str11;
            str4 = str;
        }
        E2().a(this, a11);
        r2().B1(value, z10);
        setResult(8679);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void o3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        if (((zo.c) bundle.getParcelable("UpdateAddressBottomSheetBundleKey")) != null) {
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
                    String a10 = C11818a.a("Update address bottom sheet dismissed, continue to payment", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = onlineCheckoutActivity.getClass().getName();
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
            onlineCheckoutActivity.R2(false);
        }
    }

    private final void o4() {
        q2().l(v0().s().b(), r2().z0());
    }

    /* access modifiers changed from: private */
    public final Lg.d p2() {
        return (Lg.d) this.f94309G0.getValue();
    }

    /* access modifiers changed from: private */
    public static final void p3(OnlineCheckoutActivity onlineCheckoutActivity, String str, Bundle bundle) {
        C17542s.j(str, "<unused var>");
        C17542s.j(bundle, "bundle");
        onlineCheckoutActivity.K2((com.ingka.ikea.checkout.impl.payment.a) bundle.getParcelable("ExpressPaymentBottomSheet_BUNDLE_KEY"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: co.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: co.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: co.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: co.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: co.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: co.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p4() {
        /*
            r23 = this;
            r0 = r23
            Do.f r1 = r23.r2()
            boolean r1 = r1.f1()
            java.lang.String r2 = "|"
            java.lang.String r3 = "b"
            java.lang.String r4 = "m"
            java.lang.String r6 = "main"
            java.lang.String r7 = "Kt"
            r9 = 36
            java.lang.Class<com.ingka.ikea.checkout.impl.OnlineCheckoutActivity> r10 = com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.class
            r11 = 2
            r12 = 0
            if (r1 != 0) goto L_0x00c5
            qv.e r1 = qv.e.DEBUG
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x002f:
            boolean r15 = r13.hasNext()
            r5 = 0
            if (r15 == 0) goto L_0x0047
            java.lang.Object r15 = r13.next()
            r8 = r15
            qv.b r8 = (qv.C11819b) r8
            boolean r5 = r8.b(r1, r5)
            if (r5 == 0) goto L_0x002f
            r14.add(r15)
            goto L_0x002f
        L_0x0047:
            java.util.Iterator r8 = r14.iterator()
            r13 = r12
            r14 = r13
        L_0x004d:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x00c4
            java.lang.Object r15 = r8.next()
            qv.b r15 = (qv.C11819b) r15
            r5 = 0
            if (r13 != 0) goto L_0x0069
            java.lang.String r13 = "Checkout has no data yet. Don't populate adapter yet."
            java.lang.String r13 = qv.C11818a.a(r13, r5)
            if (r13 != 0) goto L_0x0065
            goto L_0x00c4
        L_0x0065:
            java.lang.String r13 = qv.C11820c.a(r13)
        L_0x0069:
            r21 = r13
            if (r14 != 0) goto L_0x00ad
            java.lang.String r13 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            java.lang.String r14 = HJ.C15854t.s1(r13, r9, r12, r11, r12)
            r9 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r9, r12, r11, r12)
            int r9 = r14.length()
            if (r9 != 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            java.lang.String r13 = HJ.C15854t.P0(r14, r7)
        L_0x0089:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r14 = 1
            boolean r9 = HJ.C15854t.b0(r9, r6, r14)
            if (r9 == 0) goto L_0x009a
            r9 = r4
            goto L_0x009b
        L_0x009a:
            r9 = r3
        L_0x009b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            r14.append(r2)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
        L_0x00ad:
            r9 = r14
            r13 = r15
            r14 = r1
            r15 = r9
            r20 = 0
            r16 = r20
            r17 = r5
            r18 = r21
            r13.a(r14, r15, r16, r17, r18)
            r14 = r9
            r5 = r20
            r13 = r21
            r9 = 36
            goto L_0x004d
        L_0x00c4:
            return
        L_0x00c5:
            xo.i r1 = r23.I2()
            androidx.lifecycle.F r1 = r1.Q()
            java.lang.Object r1 = r1.getValue()
            xo.b r1 = (xo.C12322b) r1
            Do.f r5 = r23.r2()
            boolean r5 = r5.R0()
            Do.f r8 = r23.r2()
            Do.a r8 = r8.C0()
            Do.a$f r9 = Do.a.f.f79839a
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 == 0) goto L_0x00f7
            if (r5 == 0) goto L_0x00f7
            Do.f r1 = r23.r2()
            Yn.P r2 = Yn.P.HOME_DELIVERY
            r1.m1(r2)
            return
        L_0x00f7:
            java.util.List r1 = r0.B2(r5, r1)
            qv.e r5 = qv.e.DEBUG
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x010e:
            boolean r13 = r8.hasNext()
            r15 = 0
            if (r13 == 0) goto L_0x0126
            java.lang.Object r13 = r8.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r5, r15)
            if (r14 == 0) goto L_0x010e
            r9.add(r13)
            goto L_0x010e
        L_0x0126:
            java.util.Iterator r8 = r9.iterator()
            r9 = r12
            r13 = r9
        L_0x012c:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x01d3
            java.lang.Object r14 = r8.next()
            qv.b r14 = (qv.C11819b) r14
            r11 = 0
            if (r9 != 0) goto L_0x0161
            Do.f r9 = r23.r2()
            Do.a r9 = r9.C0()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "Sections updated, step: "
            r15.append(r12)
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            java.lang.String r9 = qv.C11818a.a(r9, r11)
            if (r9 != 0) goto L_0x015d
            r11 = 0
            goto L_0x01d4
        L_0x015d:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0161:
            if (r13 != 0) goto L_0x01b0
            java.lang.String r12 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r20 = r3
            r11 = 0
            r13 = 2
            r15 = 36
            java.lang.String r3 = HJ.C15854t.s1(r12, r15, r11, r13, r11)
            r22 = r4
            r4 = 46
            java.lang.String r3 = HJ.C15854t.o1(r3, r4, r11, r13, r11)
            int r11 = r3.length()
            if (r11 != 0) goto L_0x0183
            goto L_0x0187
        L_0x0183:
            java.lang.String r12 = HJ.C15854t.P0(r3, r7)
        L_0x0187:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r11 = 1
            boolean r3 = HJ.C15854t.b0(r3, r6, r11)
            if (r3 == 0) goto L_0x0199
            r3 = r22
            goto L_0x019b
        L_0x0199:
            r3 = r20
        L_0x019b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            r4.append(r12)
            java.lang.String r3 = r4.toString()
            r4 = r3
            r3 = r13
            goto L_0x01b9
        L_0x01b0:
            r20 = r3
            r22 = r4
            r3 = 2
            r11 = 1
            r15 = 36
            r4 = r13
        L_0x01b9:
            r13 = r14
            r14 = r5
            r12 = r15
            r19 = 0
            r15 = r4
            r16 = r19
            r17 = 0
            r18 = r9
            r13.a(r14, r15, r16, r17, r18)
            r11 = r3
            r13 = r4
            r15 = r19
            r3 = r20
            r4 = r22
            r12 = 0
            goto L_0x012c
        L_0x01d3:
            r11 = r12
        L_0x01d4:
            r0.f94306D0 = r11
            co.a r2 = r0.f94323N0
            java.lang.String r3 = "activityCheckoutBinding"
            if (r2 != 0) goto L_0x01e0
            kotlin.jvm.internal.C17542s.z(r3)
            r2 = r11
        L_0x01e0:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f90772c
            boolean r2 = r2.F0()
            if (r2 == 0) goto L_0x0202
            co.a r2 = r0.f94323N0
            if (r2 != 0) goto L_0x01f1
            kotlin.jvm.internal.C17542s.z(r3)
            r12 = r11
            goto L_0x01f2
        L_0x01f1:
            r12 = r2
        L_0x01f2:
            androidx.recyclerview.widget.RecyclerView r2 = r12.f90772c
            java.lang.String r3 = "checkoutFieldsList"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$s r3 = new com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$s
            r3.<init>(r0, r1)
            r2.addOnLayoutChangeListener(r3)
            goto L_0x0205
        L_0x0202:
            r0.Q3(r1)
        L_0x0205:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.p4():void");
    }

    private final void q3() {
        ip.j.a(I2().a0(), this, new C11154d(this));
    }

    /* access modifiers changed from: private */
    public final void q4(MComConfig mComConfig) {
        List list;
        this.f94310H = mComConfig;
        if (mComConfig == null) {
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
                    String a10 = C11818a.a("Config is null", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = OnlineCheckoutActivity.class.getName();
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
            return;
        }
        r2().E1(mComConfig.r(), mComConfig.l(), mComConfig.p(), Boolean.valueOf(mComConfig.o()));
        K<List<C13302d.a>> k10 = this.f94321M0;
        Iterable b10 = mComConfig.b();
        if (b10 != null) {
            Iterable<MComConfig.a> iterable = b10;
            list = new ArrayList(C16877v.y(iterable, 10));
            for (MComConfig.a aVar : iterable) {
                list.add(new C13302d.a(aVar.b(), aVar.a()));
            }
        } else {
            list = C16877v.n();
        }
        k10.postValue(list);
    }

    /* access modifiers changed from: private */
    public final Do.f r2() {
        return (Do.f) this.f94335z0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N r3(OnlineCheckoutActivity onlineCheckoutActivity, boolean z10) {
        onlineCheckoutActivity.p2().notifyItemRangeChanged(0, onlineCheckoutActivity.p2().getItemCount(), C11404d.ENABLED_STATE_CHANGED);
        return C16807N.f139792a;
    }

    private final C11199d.a s2() {
        return (C11199d.a) this.f94317K0.getValue();
    }

    private final void s3() {
        C16534i.M(C16534i.R(C5208k.a(r2().c1(), getLifecycle(), r.b.STARTED), new f(this, (C17164e<? super f>) null)), C5222z.a(this));
    }

    private final void t3() {
        ip.j.a(I2().Q(), this, new c0(this));
        C16534i.M(C16534i.R(C5208k.a(r2().m(), getLifecycle(), r.b.STARTED), new g(this, (C17164e<? super g>) null)), C5222z.a(this));
        ip.j.a(this.f94321M0, this, new d0(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N u3(OnlineCheckoutActivity onlineCheckoutActivity, C12322b bVar) {
        C17542s.j(bVar, "it");
        onlineCheckoutActivity.p4();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v3(OnlineCheckoutActivity onlineCheckoutActivity, List list) {
        C17542s.j(list, "it");
        onlineCheckoutActivity.p4();
        return C16807N.f139792a;
    }

    private final void w3() {
        r2().W0().observe(this, new h0.a(new C11166p(this)));
    }

    /* access modifiers changed from: private */
    public static final C16807N x3(OnlineCheckoutActivity onlineCheckoutActivity, Yn.P p10) {
        if (onlineCheckoutActivity.r2().R0()) {
            return C16807N.f139792a;
        }
        int i10 = p10 == null ? -1 : b.f94336a[p10.ordinal()];
        int i11 = i10 != 1 ? i10 != 2 ? C11849b.f102228Q1 : C11849b.f102180E1 : C11849b.f102196I1;
        C11150a aVar = onlineCheckoutActivity.f94323N0;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        Toolbar toolbar = (Toolbar) aVar.getRoot().findViewById(Uo.a.f88327h);
        if (toolbar != null) {
            toolbar.setTitle((CharSequence) onlineCheckoutActivity.getString(i11));
        }
        return C16807N.f139792a;
    }

    private final void y3() {
        ip.j.a(r2().d1(), this, new e0(this));
        ip.j.a(r2().Z0(), this, new f0(this));
        ip.j.a(r2().Y0(), this, new g0(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N z3(OnlineCheckoutActivity onlineCheckoutActivity, C10812o.d dVar) {
        C17542s.j(dVar, "deliveryService");
        OnlineCheckoutActivity onlineCheckoutActivity2 = onlineCheckoutActivity;
        onlineCheckoutActivity2.k4(true, dVar.n(), new m.b(dVar.k()), dVar.i(), dVar.k());
        return C16807N.f139792a;
    }

    public final InformationMessageNavigation A2() {
        InformationMessageNavigation informationMessageNavigation = this.f94327R;
        if (informationMessageNavigation != null) {
            return informationMessageNavigation;
        }
        C17542s.z("informationMessageNavigation");
        return null;
    }

    public final C13736a C2() {
        C13736a aVar = this.f94334y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("paymentNavigation");
        return null;
    }

    public final C13992a D2() {
        C13992a aVar = this.f94333Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("reassuranceNavigation");
        return null;
    }

    public final Xn.i E2() {
        Xn.i iVar = this.f94330U;
        if (iVar != null) {
            return iVar;
        }
        C17542s.z("startActivityInteractor");
        return null;
    }

    public final Xn.k F2() {
        Xn.k kVar = this.f94324O;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("unavailableItemsSheetInteractor");
        return null;
    }

    public final Xn.m G2() {
        Xn.m mVar = this.f94326Q;
        if (mVar != null) {
            return mVar;
        }
        C17542s.z("updateAddressBottomSheetInteractor");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0112, code lost:
        if (r1.intValue() == r5) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r12, boolean r13) {
        /*
            r11 = this;
            Lg.d r0 = r11.p2()
            java.util.List r0 = r0.e()
            boolean r1 = r0.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00b4
            qv.e r12 = qv.e.WARN
            qv.d r13 = qv.d.f102012a
            java.util.List r13 = r13.a()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x0023:
            boolean r1 = r13.hasNext()
            r10 = 0
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r13.next()
            r4 = r1
            qv.b r4 = (qv.C11819b) r4
            boolean r4 = r4.b(r12, r10)
            if (r4 == 0) goto L_0x0023
            r0.add(r1)
            goto L_0x0023
        L_0x003b:
            java.util.Iterator r13 = r0.iterator()
            r0 = r3
            r1 = r0
        L_0x0041:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x00b3
            java.lang.Object r4 = r13.next()
            qv.b r4 = (qv.C11819b) r4
            r8 = 0
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "no items in adapter, cannot request focus"
            java.lang.String r0 = qv.C11818a.a(r0, r8)
            if (r0 != 0) goto L_0x0059
            goto L_0x00b3
        L_0x0059:
            java.lang.String r0 = qv.C11820c.a(r0)
        L_0x005d:
            if (r1 != 0) goto L_0x00ab
            java.lang.Class<com.ingka.ikea.checkout.impl.OnlineCheckoutActivity> r1 = com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.class
            java.lang.String r1 = r1.getName()
            kotlin.jvm.internal.C17542s.g(r1)
            r5 = 36
            r6 = 2
            java.lang.String r5 = HJ.C15854t.s1(r1, r5, r3, r6, r3)
            r7 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r7, r3, r6, r3)
            int r6 = r5.length()
            if (r6 != 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            java.lang.String r1 = "Kt"
            java.lang.String r1 = HJ.C15854t.P0(r5, r1)
        L_0x0082:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "main"
            boolean r5 = HJ.C15854t.b0(r5, r6, r2)
            if (r5 == 0) goto L_0x0095
            java.lang.String r5 = "m"
            goto L_0x0097
        L_0x0095:
            java.lang.String r5 = "b"
        L_0x0097:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "|"
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
        L_0x00ab:
            r5 = r12
            r6 = r1
            r7 = r10
            r9 = r0
            r4.a(r5, r6, r7, r8, r9)
            goto L_0x0041
        L_0x00b3:
            return
        L_0x00b4:
            java.lang.Integer r1 = r11.f94306D0
            r4 = 0
            if (r1 == 0) goto L_0x00d1
            int r1 = r1.intValue()
            int r5 = r0.size()
            int r5 = r5 - r2
            int r1 = tI.C17978n.m(r1, r4, r5)
            java.lang.Object r1 = r0.get(r1)
            boolean r5 = r1 instanceof qg.i
            if (r5 == 0) goto L_0x00d1
            qg.i r1 = (qg.i) r1
            goto L_0x00d2
        L_0x00d1:
            r1 = r3
        L_0x00d2:
            if (r1 != 0) goto L_0x00d5
            goto L_0x0115
        L_0x00d5:
            xo.i r5 = r11.I2()
            boolean r5 = r5.g(r1)
            if (r5 != 0) goto L_0x0115
            co.a r5 = r11.f94323N0
            if (r5 != 0) goto L_0x00e9
            java.lang.String r5 = "activityCheckoutBinding"
            kotlin.jvm.internal.C17542s.z(r5)
            r5 = r3
        L_0x00e9:
            androidx.recyclerview.widget.RecyclerView r5 = r5.f90772c
            java.lang.String r6 = "checkoutFieldsList"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$i r6 = new com.ingka.ikea.checkout.impl.OnlineCheckoutActivity$i
            r6.<init>(r5, r11, r1)
            I2.L.a(r5, r6)
            Wn.b r5 = r11.q2()
            java.lang.String r6 = r1.e()
            java.lang.Object r1 = r1.j()
            r5.z(r6, r1, r2)
            java.lang.Integer r1 = r11.f94306D0
            int r5 = r12 + -1
            if (r1 != 0) goto L_0x010e
            goto L_0x0115
        L_0x010e:
            int r1 = r1.intValue()
            if (r1 != r5) goto L_0x0115
            goto L_0x0116
        L_0x0115:
            r5 = r12
        L_0x0116:
            int r0 = r0.size()
            int r0 = r0 - r2
            int r0 = tI.C17978n.m(r5, r4, r0)
            if (r13 == 0) goto L_0x0135
            androidx.recyclerview.widget.LinearLayoutManager r13 = r11.f94308F0
            if (r13 != 0) goto L_0x012b
            java.lang.String r13 = "listLayoutManager"
            kotlin.jvm.internal.C17542s.z(r13)
            goto L_0x012c
        L_0x012b:
            r3 = r13
        L_0x012c:
            r13 = 24
            float r13 = Xo.e.a(r13)
            r11.m4(r3, r11, r0, r13)
        L_0x0135:
            r11.R3(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.f94306D0 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.OnlineCheckoutActivity.a(int, boolean):void");
    }

    public void f(String str, String str2, Map<String, String> map, C10192b.a aVar, C10192b.d dVar, C10192b.C1401b bVar, String str3, C17642l<? super String, C16807N> lVar) {
        C17542s.j(str2, "countryCode");
        C17542s.j(map, "pickerData");
        C17542s.j(bVar, "pickerType");
        C17542s.j(str3, "componentValue");
        C17542s.j(lVar, "callback");
        sg.e eVar = sg.e.f76537a;
        C10038a n22 = n2();
        Lg.d p22 = p2();
        C12322b O10 = I2().O();
        eVar.c(n22, this, p22, O10 != null ? O10.b() : null, str, map, str2, aVar, dVar, bVar, str3, lVar);
    }

    public void f0() {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            jp.g.b(currentFocus);
        }
    }

    public void finish() {
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
                String a10 = C11818a.a("Finish called", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = OnlineCheckoutActivity.class.getName();
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
        r2().m0();
        super.finish();
    }

    public int h0(int i10) {
        int size = p2().e().size() - 1;
        if (i10 >= size) {
            return 6;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : C16877v.e1(p2().e(), new C17974j(i10 + 1, size))) {
            if (next instanceof qg.l) {
                arrayList.add(next);
            }
        }
        return C16877v.g0(arrayList) ? 5 : 6;
    }

    public void i0(int i10) {
        f.a aVar = sg.f.f76544x0;
        xo.i I22 = I2();
        C11150a aVar2 = this.f94323N0;
        if (aVar2 == null) {
            C17542s.z("activityCheckoutBinding");
            aVar2 = null;
        }
        RecyclerView recyclerView = aVar2.f90772c;
        C17542s.i(recyclerView, "checkoutFieldsList");
        aVar.a(I22, recyclerView, p2(), i10);
    }

    public void j(String str) {
        C17542s.j(str, "url");
        t2().a(this, str);
    }

    public boolean k0() {
        return g.a.a(this);
    }

    public void l(List<String> list, String str, C17642l<? super String, C16807N> lVar) {
        C17542s.j(list, "values");
        C17542s.j(lVar, "callback");
        sg.j.f76552a.c(this, list, str, lVar);
    }

    public final Nd.c m2() {
        Nd.c cVar = this.f94329T;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("abTesting");
        return null;
    }

    public void n(String str, String str2) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        FullscreenDialogFragment.a.b(FullscreenDialogFragment.f94870N, str, (String) null, str2, 0, (FullscreenDialogFragment.b) null, 26, (Object) null).show(getSupportFragmentManager(), "fullscreen_dialog");
    }

    public final C10038a n2() {
        C10038a aVar = this.f94332Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("addressPickerNavigation");
        return null;
    }

    public final Ae.e o2() {
        Ae.e eVar = this.f94312I;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public void onBackPressed() {
        if (!r2().i1()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        Class<OnlineCheckoutActivity> cls;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        setTitle(C11849b.f102228Q1);
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
            cls = OnlineCheckoutActivity.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str3 == null) {
                String a10 = C11818a.a("onCreate, savedInstanceState: " + bundle2, (Throwable) null);
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
        C11150a c10 = C11150a.c(getLayoutInflater());
        C17542s.i(c10, "inflate(...)");
        setContentView((View) c10.getRoot());
        this.f94323N0 = c10;
        b(new C11152b(this));
        this.f94308F0 = new AccurateOffsetLinearLayoutManager(this);
        C11150a aVar = this.f94323N0;
        if (aVar == null) {
            C17542s.z("activityCheckoutBinding");
            aVar = null;
        }
        RecyclerView recyclerView = aVar.f90772c;
        LinearLayoutManager linearLayoutManager = this.f94308F0;
        if (linearLayoutManager == null) {
            C17542s.z("listLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(p2());
        recyclerView.j(new il.f((int) Xo.e.a(8), true, (f.a) null, 0, 12, (DefaultConstructorMarker) null));
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
        gVar.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(gVar);
        C11403c cVar = new C11403c();
        recyclerView.n(cVar);
        this.f94307E0 = cVar;
        X3();
        if (bundle2 != null) {
            qv.e eVar2 = qv.e.DEBUG;
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
                    String a11 = C11818a.a("Restore state", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
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
                bVar2.a(eVar2, str8, false, (Throwable) null, str7);
                str2 = null;
            }
            r2().r1(bundle2);
        }
        T2();
        C3();
        t3();
        s3();
        X2();
        H3();
        q3();
        w3();
        y3();
        V2();
        h3();
        if (bundle2 == null) {
            Do.f.J1(r2(), (String) null, (Do.m) null, true, 3, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        o2().e(this, "online_checkout");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        r2().s1(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void p0(String str) {
        g.a.b(this, str);
    }

    public final Wn.b q2() {
        Wn.b bVar = this.f94318L;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("checkoutAnalytics");
        return null;
    }

    public final Eo.a t2() {
        Eo.a aVar = this.f94316K;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final Wn.o u2() {
        Wn.o oVar = this.f94320M;
        if (oVar != null) {
            return oVar;
        }
        C17542s.z("deliveryDetailsAnalytics");
        return null;
    }

    public final Xn.a v2() {
        Xn.a aVar = this.f94331X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("deliveryDetailsInteractor");
        return null;
    }

    public final Xn.c w2() {
        Xn.c cVar = this.f94325P;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("deliveryPricesInteractor");
        return null;
    }

    public final Xn.e x2() {
        Xn.e eVar = this.f94328S;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("expressPaymentBottomSheetInteractor");
        return null;
    }

    public final Ar.j y2() {
        Ar.j jVar = this.f94314J;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Xn.g z2() {
        Xn.g gVar = this.f94322N;
        if (gVar != null) {
            return gVar;
        }
        C17542s.z("fullscreenErrorInteractor");
        return null;
    }
}
