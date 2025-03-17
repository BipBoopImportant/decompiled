package x4;

import GJ.C15765h;
import GJ.C15768k;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16869m;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.v;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17527c;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.W;
import nI.C17631a;
import nI.C17642l;
import x4.C8948l;
import x4.C8952p;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0006£\u0001¨\u0001¬\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u0016\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001b\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00192\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000e2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010,J1\u00100\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0019H\u0002¢\u0006\u0004\b7\u00105J\u0019\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u0004\u0018\u00010&2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u00020@*\b\u0012\u0004\u0012\u00020\u00060-H\u0002¢\u0006\u0004\bA\u0010BJ!\u0010C\u001a\u00020&\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0004\bC\u0010DJ5\u0010G\u001a\u00020\t2\u0006\u0010E\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\bG\u0010HJ!\u0010I\u001a\u00020\u00192\u0006\u0010E\u001a\u00020\r2\b\u0010F\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\bI\u0010JJ5\u0010L\u001a\u00020\u00192\u0006\u0010K\u001a\u00020\u001d2\b\u0010F\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bL\u0010MJ;\u0010N\u001a\u00020\u00192\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010F\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bN\u0010OJ%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002¢\u0006\u0004\b\"\u0010QJ9\u0010U\u001a\u00020\t2\u0006\u0010E\u001a\u00020\r2\b\u0010R\u001a\u0004\u0018\u0001082\u0006\u0010S\u001a\u00020\u00062\u000e\b\u0002\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\t2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\t2\u0006\u0010\\\u001a\u00020[H\u0016¢\u0006\u0004\b_\u0010^J\u000f\u0010`\u001a\u00020\u0019H\u0017¢\u0006\u0004\b`\u00105J!\u0010a\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0004\ba\u0010bJ)\u0010c\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\bc\u0010!J)\u0010d\u001a\u00020\u00192\u0006\u0010#\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bd\u0010(J%\u0010g\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\t0eH\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0019H\u0017¢\u0006\u0004\bi\u00105J\u000f\u0010j\u001a\u00020\tH\u0000¢\u0006\u0004\bj\u0010XJ\u0015\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bk\u0010lJ\u0019\u0010n\u001a\u00020\t2\b\b\u0001\u0010m\u001a\u00020\u001dH\u0017¢\u0006\u0004\bn\u0010oJ#\u0010p\u001a\u00020\t2\b\b\u0001\u0010m\u001a\u00020\u001d2\b\u00109\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\bp\u0010qJ!\u0010s\u001a\u00020\t2\u0006\u0010r\u001a\u00020@2\b\u00109\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0004\bs\u0010tJ\u0019\u0010w\u001a\u00020\u00192\b\u0010v\u001a\u0004\u0018\u00010uH\u0017¢\u0006\u0004\bw\u0010xJ'\u0010z\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bz\u0010{J3\u0010}\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010|\u001a\u00020\u00192\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0001\u001a\u00020\t2\u0006\u0010=\u001a\u00020H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\t2\u0006\u0010=\u001a\u000202\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u0001H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J0\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J2\u0010\u0001\u001a\u00020\t2\u0006\u0010#\u001a\u00020&2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J<\u0010\u0001\u001a\u00020\t\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u0013\u0010\u0001\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0014\u0010\u0001\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\t2\t\u0010\u0001\u001a\u0004\u0018\u000108H\u0017¢\u0006\u0005\b\u0001\u0010;J\u001c\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u0001H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u0001H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0006\b\u0001\u0010 \u0001J\u0018\u0010¡\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020&¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001c\u0010®\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010­\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001b\u0010´\u0001\u001a\u0004\u0018\u0001088\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R#\u0010¹\u0001\u001a\f\u0012\u0005\u0012\u00030¶\u0001\u0018\u00010µ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0019\u0010»\u0001\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0001\u0010\u0001R\u001d\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R$\u0010Â\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¿\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R,\u0010È\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0Ã\u00018GX\u0004¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R$\u0010Ê\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¿\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Á\u0001R)\u0010Í\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0Ã\u00018\u0006¢\u0006\u0010\n\u0006\bË\u0001\u0010Å\u0001\u001a\u0006\bÌ\u0001\u0010Ç\u0001R$\u0010Ñ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060Î\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R%\u0010Ô\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030Ò\u00010Î\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010Ð\u0001R&\u0010Ö\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010&0Î\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ð\u0001R)\u0010×\u0001\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0Î\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bU\u0010Ð\u0001R\u001c\u0010Ú\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001b\u0010Ý\u0001\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b]\u0010Ü\u0001R\u001d\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020[0Þ\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b2\u0010ß\u0001R*\u0010ç\u0001\u001a\u00030á\u00018@@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u0017\u0010ê\u0001\u001a\u00030è\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b7\u0010é\u0001R\u0017\u0010í\u0001\u001a\u00030ë\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b+\u0010ì\u0001R\u0018\u0010î\u0001\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bN\u0010\u0001R\u0019\u0010ñ\u0001\u001a\u00030ï\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bz\u0010ð\u0001R1\u0010ô\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070ò\u0001R\u00020\u00000Î\u00018\u0002X\u0004¢\u0006\b\n\u0006\bó\u0001\u0010Ð\u0001R&\u0010ö\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b}\u0010õ\u0001R'\u0010ø\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010õ\u0001R#\u0010ù\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190Î\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b>\u0010Ð\u0001R\u0018\u0010û\u0001\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bC\u0010ú\u0001R\u001e\u0010þ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ü\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010ý\u0001R!\u0010\u0002\u001a\u00030«\u00018VX\u0002¢\u0006\u0010\n\u0006\b¡\u0001\u0010ÿ\u0001\u001a\u0006\b\u0002\u0010\u0002R\u001e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u0002R#\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u0002\u001a\u0006\bú\u0001\u0010\u0002R\u0017\u0010\u0002\u001a\u00020\u001d8BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R(\u0010r\u001a\u00020@2\u0006\u0010r\u001a\u00020@8W@WX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R,\u0010\u0002\u001a\u00030ï\u00012\b\u0010\u0002\u001a\u00030ï\u00018V@WX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002¨\u0006\u0002"}, d2 = {"Lx4/o;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lx4/l;", "child", "parent", "LXH/N;", "W", "(Lx4/l;Lx4/l;)V", "Lx4/I;", "Lx4/v;", "", "entries", "Lx4/C;", "navOptions", "Lx4/I$a;", "navigatorExtras", "Lkotlin/Function1;", "handler", "h0", "(Lx4/I;Ljava/util/List;Lx4/C;Lx4/I$a;LnI/l;)V", "popUpTo", "", "saveState", "q0", "(Lx4/I;Lx4/l;ZLnI/l;)V", "", "destinationId", "inclusive", "r0", "(IZZ)Z", "T", "route", "s0", "(Ljava/lang/Object;ZZ)Z", "", "t0", "(Ljava/lang/String;ZZ)Z", "popOperations", "foundDestination", "v", "(Ljava/util/List;Lx4/v;ZZ)Z", "LYH/m;", "Lx4/m;", "savedState", "v0", "(Lx4/l;ZLYH/m;)V", "s", "(I)Z", "I0", "()Z", "J0", "u", "Landroid/os/Bundle;", "startDestinationArgs", "j0", "(Landroid/os/Bundle;)V", "", "deepLink", "B", "([I)Ljava/lang/String;", "Lx4/x;", "Q", "(LYH/m;)Lx4/x;", "C", "(Ljava/lang/Object;)Ljava/lang/String;", "node", "args", "e0", "(Lx4/v;Landroid/os/Bundle;Lx4/C;Lx4/I$a;)V", "U", "(Lx4/v;Landroid/os/Bundle;)Z", "id", "A0", "(ILandroid/os/Bundle;Lx4/C;Lx4/I$a;)Z", "w", "(Ljava/util/List;Landroid/os/Bundle;Lx4/C;Lx4/I$a;)Z", "backStackState", "(LYH/m;)Ljava/util/List;", "finalArgs", "backStackEntry", "restoredEntries", "p", "(Lx4/v;Landroid/os/Bundle;Lx4/l;Ljava/util/List;)V", "M0", "()V", "K0", "(Lx4/l;)Lx4/l;", "Lx4/o$c;", "listener", "r", "(Lx4/o$c;)V", "y0", "k0", "l0", "(IZ)Z", "m0", "n0", "Lkotlin/Function0;", "onComplete", "p0", "(Lx4/l;LnI/a;)V", "i0", "L0", "x0", "()Ljava/util/List;", "graphResId", "C0", "(I)V", "D0", "(ILandroid/os/Bundle;)V", "graph", "F0", "(Lx4/x;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "S", "(Landroid/content/Intent;)Z", "matchingDest", "x", "(ILx4/v;)Lx4/v;", "searchChildren", "z", "(Lx4/v;IZLx4/v;)Lx4/v;", "Landroid/net/Uri;", "X", "(Landroid/net/Uri;)V", "Y", "(Landroid/net/Uri;Lx4/C;)V", "Lx4/u;", "request", "b0", "(Lx4/u;)V", "c0", "(Lx4/u;Lx4/C;)V", "d0", "(Lx4/u;Lx4/C;Lx4/I$a;)V", "a0", "(Ljava/lang/String;Lx4/C;Lx4/I$a;)V", "Z", "(Ljava/lang/Object;Lx4/C;Lx4/I$a;)V", "Lx4/r;", "t", "()Lx4/r;", "B0", "()Landroid/os/Bundle;", "navState", "z0", "Landroidx/lifecycle/y;", "owner", "G0", "(Landroidx/lifecycle/y;)V", "Landroidx/lifecycle/j0;", "viewModelStore", "H0", "(Landroidx/lifecycle/j0;)V", "D", "(I)Lx4/l;", "E", "(Ljava/lang/String;)Lx4/l;", "a", "Landroid/content/Context;", "F", "()Landroid/content/Context;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Lx4/B;", "c", "Lx4/B;", "inflater", "d", "Lx4/x;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "LYH/m;", "backQueue", "LTJ/B;", "i", "LTJ/B;", "_currentBackStack", "LTJ/P;", "j", "LTJ/P;", "G", "()LTJ/P;", "currentBackStack", "k", "_visibleEntries", "l", "R", "visibleEntries", "", "m", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "n", "parentToChildCount", "o", "backStackMap", "backStackStates", "q", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lx4/p;", "Lx4/p;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/r$b;", "Landroidx/lifecycle/r$b;", "M", "()Landroidx/lifecycle/r$b;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/r$b;)V", "hostLifecycleState", "Landroidx/lifecycle/x;", "Landroidx/lifecycle/x;", "lifecycleObserver", "Landroidx/activity/v;", "Landroidx/activity/v;", "onBackPressedCallback", "enableOnBackPressedCallback", "Lx4/J;", "Lx4/J;", "_navigatorProvider", "Lx4/o$b;", "y", "navigatorState", "LnI/l;", "addToBackStackHandler", "A", "popFromBackStackHandler", "entrySavedState", "I", "dispatchReentrantCount", "", "Ljava/util/List;", "backStackEntriesToDispatch", "LXH/o;", "N", "()Lx4/B;", "navInflater", "LTJ/A;", "LTJ/A;", "_currentBackStackEntryFlow", "LTJ/g;", "LTJ/g;", "()LTJ/g;", "currentBackStackEntryFlow", "K", "()I", "destinationCountOnBackStack", "L", "()Lx4/x;", "E0", "(Lx4/x;)V", "navigatorProvider", "O", "()Lx4/J;", "setNavigatorProvider", "(Lx4/J;)V", "J", "()Lx4/v;", "currentDestination", "H", "()Lx4/l;", "currentBackStackEntry", "P", "previousBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x4.o  reason: case insensitive filesystem */
public class C8951o {

    /* renamed from: H  reason: collision with root package name */
    public static final a f57545H = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public static boolean f57546I = true;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public C17642l<? super C8948l, C16807N> f57547A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final Map<C8948l, Boolean> f57548B;

    /* renamed from: C  reason: collision with root package name */
    private int f57549C;

    /* renamed from: D  reason: collision with root package name */
    private final List<C8948l> f57550D;

    /* renamed from: E  reason: collision with root package name */
    private final C16824o f57551E;

    /* renamed from: F  reason: collision with root package name */
    private final C16504A<C8948l> f57552F;

    /* renamed from: G  reason: collision with root package name */
    private final C16532g<C8948l> f57553G;

    /* renamed from: a  reason: collision with root package name */
    private final Context f57554a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f57555b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C8936B f57556c;

    /* renamed from: d  reason: collision with root package name */
    private x f57557d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f57558e;

    /* renamed from: f  reason: collision with root package name */
    private Parcelable[] f57559f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f57560g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C16869m<C8948l> f57561h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C16505B<List<C8948l>> f57562i;

    /* renamed from: j  reason: collision with root package name */
    private final C16519P<List<C8948l>> f57563j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C16505B<List<C8948l>> f57564k;

    /* renamed from: l  reason: collision with root package name */
    private final C16519P<List<C8948l>> f57565l;

    /* renamed from: m  reason: collision with root package name */
    private final Map<C8948l, C8948l> f57566m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<C8948l, AtomicInteger> f57567n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Map<Integer, String> f57568o;

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, C16869m<C8949m>> f57569p;

    /* renamed from: q  reason: collision with root package name */
    private C5221y f57570q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C8952p f57571r;

    /* renamed from: s  reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f57572s;

    /* renamed from: t  reason: collision with root package name */
    private r.b f57573t;

    /* renamed from: u  reason: collision with root package name */
    private final C5220x f57574u;

    /* renamed from: v  reason: collision with root package name */
    private final v f57575v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f57576w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public J f57577x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final Map<I<? extends v>, b> f57578y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public C17642l<? super C8948l, C16807N> f57579z;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx4/o$a;", "", "<init>", "()V", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "", "deepLinkSaveState", "Z", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lx4/o$b;", "Lx4/K;", "Lx4/I;", "Lx4/v;", "navigator", "<init>", "(Lx4/o;Lx4/I;)V", "Lx4/l;", "backStackEntry", "LXH/N;", "k", "(Lx4/l;)V", "o", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Lx4/v;Landroid/os/Bundle;)Lx4/l;", "popUpTo", "", "saveState", "h", "(Lx4/l;Z)V", "i", "entry", "e", "j", "g", "Lx4/I;", "getNavigator", "()Lx4/I;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.o$b */
    private final class b extends K {

        /* renamed from: g  reason: collision with root package name */
        private final I<? extends v> f57580g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C8951o f57581h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x4.o$b$a */
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f57582c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C8948l f57583d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f57584e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, C8948l lVar, boolean z10) {
                super(0);
                this.f57582c = bVar;
                this.f57583d = lVar;
                this.f57584e = z10;
            }

            public final void invoke() {
                b.super.h(this.f57583d, this.f57584e);
            }
        }

        public b(C8951o oVar, I<? extends v> i10) {
            C17542s.j(i10, "navigator");
            this.f57581h = oVar;
            this.f57580g = i10;
        }

        public C8948l a(v vVar, Bundle bundle) {
            C17542s.j(vVar, "destination");
            return C8948l.a.b(C8948l.f57521o, this.f57581h.F(), vVar, bundle, this.f57581h.M(), this.f57581h.f57571r, (String) null, (Bundle) null, 96, (Object) null);
        }

        public void e(C8948l lVar) {
            C8952p k10;
            C17542s.j(lVar, "entry");
            boolean e10 = C17542s.e(this.f57581h.f57548B.get(lVar), Boolean.TRUE);
            super.e(lVar);
            this.f57581h.f57548B.remove(lVar);
            if (!this.f57581h.f57561h.contains(lVar)) {
                this.f57581h.K0(lVar);
                if (lVar.getLifecycle().d().b(r.b.CREATED)) {
                    lVar.l(r.b.DESTROYED);
                }
                C16869m d10 = this.f57581h.f57561h;
                if (d10 == null || !d10.isEmpty()) {
                    Iterator it = d10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C17542s.e(((C8948l) it.next()).f(), lVar.f())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (!e10 && (k10 = this.f57581h.f57571r) != null) {
                    k10.D(lVar.f());
                }
                this.f57581h.L0();
                this.f57581h.f57564k.a(this.f57581h.x0());
            } else if (!d()) {
                this.f57581h.L0();
                this.f57581h.f57562i.a(C16877v.w1(this.f57581h.f57561h));
                this.f57581h.f57564k.a(this.f57581h.x0());
            }
        }

        public void h(C8948l lVar, boolean z10) {
            C17542s.j(lVar, "popUpTo");
            I e10 = this.f57581h.f57577x.e(lVar.e().A());
            this.f57581h.f57548B.put(lVar, Boolean.valueOf(z10));
            if (C17542s.e(e10, this.f57580g)) {
                C17642l j10 = this.f57581h.f57547A;
                if (j10 != null) {
                    j10.invoke(lVar);
                    super.h(lVar, z10);
                    return;
                }
                this.f57581h.p0(lVar, new a(this, lVar, z10));
                return;
            }
            Object obj = this.f57581h.f57578y.get(e10);
            C17542s.g(obj);
            ((b) obj).h(lVar, z10);
        }

        public void i(C8948l lVar, boolean z10) {
            C17542s.j(lVar, "popUpTo");
            super.i(lVar, z10);
        }

        public void j(C8948l lVar) {
            C17542s.j(lVar, "entry");
            super.j(lVar);
            if (this.f57581h.f57561h.contains(lVar)) {
                lVar.l(r.b.STARTED);
                return;
            }
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }

        public void k(C8948l lVar) {
            C17542s.j(lVar, "backStackEntry");
            I e10 = this.f57581h.f57577x.e(lVar.e().A());
            if (C17542s.e(e10, this.f57580g)) {
                C17642l c10 = this.f57581h.f57579z;
                if (c10 != null) {
                    c10.invoke(lVar);
                    o(lVar);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + lVar.e() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f57581h.f57578y.get(e10);
            if (obj != null) {
                ((b) obj).k(lVar);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + lVar.e().A() + " should already be created").toString());
        }

        public final void o(C8948l lVar) {
            C17542s.j(lVar, "backStackEntry");
            super.k(lVar);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lx4/o$c;", "", "Lx4/o;", "controller", "Lx4/v;", "destination", "Landroid/os/Bundle;", "arguments", "LXH/N;", "a", "(Lx4/o;Lx4/v;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.o$c */
    public interface c {
        void a(C8951o oVar, v vVar, Bundle bundle);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$d */
    static final class d extends C17544u implements C17642l<Context, Context> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f57585c = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C17542s.j(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/D;", "LXH/N;", "a", "(Lx4/D;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$e */
    static final class e extends C17544u implements C17642l<D, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f57586c = new e();

        e() {
            super(1);
        }

        public final void a(D d10) {
            C17542s.j(d10, "$this$navOptions");
            d10.i(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/l;", "entry", "LXH/N;", "a", "(Lx4/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$f */
    static final class f extends C17544u implements C17642l<C8948l, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f57587c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f57588d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8951o f57589e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f57590f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16869m<C8949m> f57591g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(K k10, K k11, C8951o oVar, boolean z10, C16869m<C8949m> mVar) {
            super(1);
            this.f57587c = k10;
            this.f57588d = k11;
            this.f57589e = oVar;
            this.f57590f = z10;
            this.f57591g = mVar;
        }

        public final void a(C8948l lVar) {
            C17542s.j(lVar, "entry");
            this.f57587c.f144344a = true;
            this.f57588d.f144344a = true;
            this.f57589e.v0(lVar, this.f57590f, this.f57591g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8948l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/v;", "destination", "a", "(Lx4/v;)Lx4/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$g */
    static final class g extends C17544u implements C17642l<v, v> {

        /* renamed from: c  reason: collision with root package name */
        public static final g f57592c = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final v invoke(v vVar) {
            C17542s.j(vVar, "destination");
            x B10 = vVar.B();
            if (B10 == null || B10.a0() != vVar.x()) {
                return null;
            }
            return vVar.B();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/v;", "destination", "", "a", "(Lx4/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$h */
    static final class h extends C17544u implements C17642l<v, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8951o f57593c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C8951o oVar) {
            super(1);
            this.f57593c = oVar;
        }

        /* renamed from: a */
        public final Boolean invoke(v vVar) {
            C17542s.j(vVar, "destination");
            return Boolean.valueOf(!this.f57593c.f57568o.containsKey(Integer.valueOf(vVar.x())));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/v;", "destination", "a", "(Lx4/v;)Lx4/v;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$i */
    static final class i extends C17544u implements C17642l<v, v> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f57594c = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final v invoke(v vVar) {
            C17542s.j(vVar, "destination");
            x B10 = vVar.B();
            if (B10 == null || B10.a0() != vVar.x()) {
                return null;
            }
            return vVar.B();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/v;", "destination", "", "a", "(Lx4/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$j */
    static final class j extends C17544u implements C17642l<v, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8951o f57595c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C8951o oVar) {
            super(1);
            this.f57595c = oVar;
        }

        /* renamed from: a */
        public final Boolean invoke(v vVar) {
            C17542s.j(vVar, "destination");
            return Boolean.valueOf(!this.f57595c.f57568o.containsKey(Integer.valueOf(vVar.x())));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/l;", "entry", "LXH/N;", "a", "(Lx4/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$k */
    static final class k extends C17544u implements C17642l<C8948l, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f57596c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<C8948l> f57597d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ M f57598e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8951o f57599f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Bundle f57600g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(K k10, List<C8948l> list, M m10, C8951o oVar, Bundle bundle) {
            super(1);
            this.f57596c = k10;
            this.f57597d = list;
            this.f57598e = m10;
            this.f57599f = oVar;
            this.f57600g = bundle;
        }

        public final void a(C8948l lVar) {
            List<C8948l> list;
            C17542s.j(lVar, "entry");
            this.f57596c.f144344a = true;
            int indexOf = this.f57597d.indexOf(lVar);
            if (indexOf != -1) {
                int i10 = indexOf + 1;
                list = this.f57597d.subList(this.f57598e.f144346a, i10);
                this.f57598e.f144346a = i10;
            } else {
                list = C16877v.n();
            }
            this.f57599f.p(lVar.e(), this.f57600g, lVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8948l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/D;", "LXH/N;", "a", "(Lx4/D;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$l */
    static final class l extends C17544u implements C17642l<D, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ v f57601c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8951o f57602d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/c;", "LXH/N;", "a", "(Lx4/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x4.o$l$a */
        static final class a extends C17544u implements C17642l<C8939c, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f57603c = new a();

            a() {
                super(1);
            }

            public final void a(C8939c cVar) {
                C17542s.j(cVar, "$this$anim");
                cVar.e(0);
                cVar.f(0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C8939c) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx4/L;", "LXH/N;", "a", "(Lx4/L;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: x4.o$l$b */
        static final class b extends C17544u implements C17642l<L, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final b f57604c = new b();

            b() {
                super(1);
            }

            public final void a(L l10) {
                C17542s.j(l10, "$this$popUpTo");
                l10.d(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((L) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(v vVar, C8951o oVar) {
            super(1);
            this.f57601c = vVar;
            this.f57602d = oVar;
        }

        public final void a(D d10) {
            C17542s.j(d10, "$this$navOptions");
            d10.a(a.f57603c);
            v vVar = this.f57601c;
            if (vVar instanceof x) {
                C15765h<v> c10 = v.f57671k.c(vVar);
                C8951o oVar = this.f57602d;
                for (v next : c10) {
                    v J10 = oVar.J();
                    if (C17542s.e(next, J10 != null ? J10.B() : null)) {
                        return;
                    }
                }
                if (C8951o.f57546I) {
                    d10.c(x.f57702q.b(this.f57602d.L()).x(), b.f57604c);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((D) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/v;", "it", "", "a", "(Lx4/v;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$m */
    static final class m extends C17544u implements C17642l<v, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final m f57605c = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(v vVar) {
            C17542s.j(vVar, "it");
            return Integer.valueOf(vVar.x());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx4/B;", "b", "()Lx4/B;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$n */
    static final class n extends C17544u implements C17631a<C8936B> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8951o f57606c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C8951o oVar) {
            super(0);
            this.f57606c = oVar;
        }

        /* renamed from: b */
        public final C8936B invoke() {
            C8936B h10 = this.f57606c.f57556c;
            return h10 == null ? new C8936B(this.f57606c.F(), this.f57606c.f57577x) : h10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx4/l;", "it", "LXH/N;", "a", "(Lx4/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$o  reason: collision with other inner class name */
    static final class C0926o extends C17544u implements C17642l<C8948l, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f57607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C8951o f57608d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f57609e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Bundle f57610f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0926o(K k10, C8951o oVar, v vVar, Bundle bundle) {
            super(1);
            this.f57607c = k10;
            this.f57608d = oVar;
            this.f57609e = vVar;
            this.f57610f = bundle;
        }

        public final void a(C8948l lVar) {
            C17542s.j(lVar, "it");
            this.f57607c.f144344a = true;
            C8951o.q(this.f57608d, this.f57609e, this.f57610f, lVar, (List) null, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8948l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"x4/o$p", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x4.o$p */
    public static final class p extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C8951o f57611b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(C8951o oVar) {
            super(false);
            this.f57611b = oVar;
        }

        public void handleOnBackPressed() {
            this.f57611b.k0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x4.o$q */
    static final class q extends C17544u implements C17642l<String, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f57612c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f57612c = str;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(C17542s.e(str, this.f57612c));
        }
    }

    public C8951o(Context context) {
        Object obj;
        C17542s.j(context, "context");
        this.f57554a = context;
        Iterator it = C15768k.q(context, d.f57585c).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f57555b = (Activity) obj;
        this.f57561h = new C16869m<>();
        C16505B<List<C8948l>> a10 = C16521S.a(C16877v.n());
        this.f57562i = a10;
        this.f57563j = C16534i.c(a10);
        C16505B<List<C8948l>> a11 = C16521S.a(C16877v.n());
        this.f57564k = a11;
        this.f57565l = C16534i.c(a11);
        this.f57566m = new LinkedHashMap();
        this.f57567n = new LinkedHashMap();
        this.f57568o = new LinkedHashMap();
        this.f57569p = new LinkedHashMap();
        this.f57572s = new CopyOnWriteArrayList<>();
        this.f57573t = r.b.INITIALIZED;
        this.f57574u = new C8950n(this);
        this.f57575v = new p(this);
        this.f57576w = true;
        this.f57577x = new J();
        this.f57578y = new LinkedHashMap();
        this.f57548B = new LinkedHashMap();
        J j10 = this.f57577x;
        j10.c(new z(j10));
        this.f57577x.c(new C8937a(this.f57554a));
        this.f57550D = new ArrayList();
        this.f57551E = C16825p.b(new n(this));
        C16504A<C8948l> b10 = C16511H.b(1, 0, C16428d.DROP_OLDEST, 2, (Object) null);
        this.f57552F = b10;
        this.f57553G = C16534i.b(b10);
    }

    public static /* synthetic */ v A(C8951o oVar, v vVar, int i10, boolean z10, v vVar2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                vVar2 = null;
            }
            return oVar.z(vVar, i10, z10, vVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
    }

    private final boolean A0(int i10, Bundle bundle, C c10, I.a aVar) {
        if (!this.f57568o.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = this.f57568o.get(Integer.valueOf(i10));
        C16877v.J(this.f57568o.values(), new q(str));
        return w(T((C16869m) W.d(this.f57569p).remove(str)), bundle, c10, aVar);
    }

    private final String B(int[] iArr) {
        x xVar;
        x xVar2 = this.f57557d;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            v vVar = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                x xVar3 = this.f57557d;
                C17542s.g(xVar3);
                if (xVar3.x() == i11) {
                    vVar = this.f57557d;
                }
            } else {
                C17542s.g(xVar2);
                vVar = xVar2.T(i11);
            }
            if (vVar == null) {
                return v.f57671k.b(this.f57554a, i11);
            }
            if (i10 != iArr.length - 1 && (vVar instanceof x)) {
                while (true) {
                    xVar = (x) vVar;
                    C17542s.g(xVar);
                    if (!(xVar.T(xVar.a0()) instanceof x)) {
                        break;
                    }
                    vVar = xVar.T(xVar.a0());
                }
                xVar2 = xVar;
            }
            i10++;
        }
    }

    private final <T> String C(T t10) {
        v A10 = A(this, L(), C4.j.g(z.e(P.b(t10.getClass()))), true, (v) null, 4, (Object) null);
        if (A10 != null) {
            Map<String, C8945i> s10 = A10.s();
            LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
            for (Map.Entry entry : s10.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
            }
            return C4.j.k(t10, linkedHashMap);
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(t10.getClass()).f() + " cannot be found in navigation graph " + this.f57557d).toString());
    }

    private final boolean I0() {
        int i10 = 0;
        if (!this.f57560g) {
            return false;
        }
        Activity activity = this.f57555b;
        C17542s.g(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        C17542s.g(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        C17542s.g(intArray);
        List<Integer> j12 = C16870n.j1(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        if (j12.size() < 2) {
            return false;
        }
        int intValue = ((Number) C16877v.O(j12)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle = (Bundle) C16877v.O(parcelableArrayList);
        }
        v A10 = A(this, L(), intValue, false, (v) null, 4, (Object) null);
        if (A10 instanceof x) {
            intValue = x.f57702q.b((x) A10).x();
        }
        v J10 = J();
        if (J10 == null || intValue != J10.x()) {
            return false;
        }
        r t10 = t();
        Bundle b10 = D2.d.b(C16796C.a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle2 != null) {
            b10.putAll(bundle2);
        }
        t10.e(b10);
        for (Object next : j12) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            t10.a(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        t10.b().r();
        Activity activity2 = this.f57555b;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean J0() {
        v J10 = J();
        C17542s.g(J10);
        int x10 = J10.x();
        for (x B10 = J10.B(); B10 != null; B10 = B10.B()) {
            if (B10.a0() != x10) {
                Bundle bundle = new Bundle();
                Activity activity = this.f57555b;
                if (activity != null) {
                    C17542s.g(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f57555b;
                        C17542s.g(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f57555b;
                            C17542s.g(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            x Q10 = Q(this.f57561h);
                            Activity activity4 = this.f57555b;
                            C17542s.g(activity4);
                            Intent intent = activity4.getIntent();
                            C17542s.i(intent, "activity!!.intent");
                            v.b c02 = Q10.c0(new u(intent), true, true, Q10);
                            if ((c02 != null ? c02.j() : null) != null) {
                                bundle.putAll(c02.b().m(c02.j()));
                            }
                        }
                    }
                }
                r.g(new r(this), B10.x(), (Bundle) null, 2, (Object) null).e(bundle).b().r();
                Activity activity5 = this.f57555b;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            x10 = B10.x();
        }
        return false;
    }

    private final int K() {
        C16869m<C8948l> mVar = this.f57561h;
        int i10 = 0;
        if (mVar == null || !mVar.isEmpty()) {
            for (C8948l e10 : mVar) {
                if (!(e10.e() instanceof x) && (i10 = i10 + 1) < 0) {
                    C16877v.w();
                }
            }
        }
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (K() > 1) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M0() {
        /*
            r3 = this;
            androidx.activity.v r0 = r3.f57575v
            boolean r1 = r3.f57576w
            if (r1 == 0) goto L_0x000e
            int r1 = r3.K()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8951o.M0():void");
    }

    private final x Q(C16869m<C8948l> mVar) {
        v vVar;
        C8948l t10 = mVar.t();
        if (t10 == null || (vVar = t10.e()) == null) {
            vVar = this.f57557d;
            C17542s.g(vVar);
        }
        if (vVar instanceof x) {
            return (x) vVar;
        }
        x B10 = vVar.B();
        C17542s.g(B10);
        return B10;
    }

    private final List<C8948l> T(C16869m<C8949m> mVar) {
        v vVar;
        ArrayList arrayList = new ArrayList();
        C8948l t10 = this.f57561h.t();
        if (t10 == null || (vVar = t10.e()) == null) {
            vVar = L();
        }
        if (mVar != null) {
            for (C8949m mVar2 : mVar) {
                v A10 = A(this, vVar, mVar2.a(), true, (v) null, 4, (Object) null);
                if (A10 != null) {
                    arrayList.add(mVar2.c(this.f57554a, A10, M(), this.f57571r));
                    vVar = A10;
                } else {
                    String b10 = v.f57671k.b(this.f57554a, mVar2.a());
                    throw new IllegalStateException(("Restore State failed: destination " + b10 + " cannot be found from the current destination " + vVar).toString());
                }
            }
        }
        return arrayList;
    }

    private final boolean U(v vVar, Bundle bundle) {
        int i10;
        v e10;
        C8948l H10 = H();
        C16869m<C8948l> mVar = this.f57561h;
        ListIterator<C8948l> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().e() == vVar) {
                    i10 = listIterator.nextIndex();
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return false;
        }
        if (vVar instanceof x) {
            List<R> a02 = C15768k.a0(C15768k.S(x.f57702q.a((x) vVar), m.f57605c));
            if (this.f57561h.size() - i10 != a02.size()) {
                return false;
            }
            C16869m<C8948l> mVar2 = this.f57561h;
            Iterable<C8948l> subList = mVar2.subList(i10, mVar2.size());
            ArrayList arrayList = new ArrayList(C16877v.y(subList, 10));
            for (C8948l e11 : subList) {
                arrayList.add(Integer.valueOf(e11.e().x()));
            }
            if (!C17542s.e(arrayList, a02)) {
                return false;
            }
        } else if (H10 == null || (e10 = H10.e()) == null || vVar.x() != e10.x()) {
            return false;
        }
        C16869m<C8948l> mVar3 = new C16869m<>();
        while (C16877v.p(this.f57561h) >= i10) {
            C8948l lVar = (C8948l) C16877v.O(this.f57561h);
            K0(lVar);
            mVar3.addFirst(new C8948l(lVar, lVar.e().m(bundle)));
        }
        for (C8948l lVar2 : mVar3) {
            x B10 = lVar2.e().B();
            if (B10 != null) {
                W(lVar2, D(B10.x()));
            }
            this.f57561h.add(lVar2);
        }
        for (C8948l lVar3 : mVar3) {
            this.f57577x.e(lVar3.e().A()).g(lVar3);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void V(C8951o oVar, C5221y yVar, r.a aVar) {
        C17542s.j(oVar, "this$0");
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar, "event");
        oVar.f57573t = aVar.j();
        if (oVar.f57557d != null) {
            for (T i10 : C16877v.w1(oVar.f57561h)) {
                i10.i(aVar);
            }
        }
    }

    private final void W(C8948l lVar, C8948l lVar2) {
        this.f57566m.put(lVar, lVar2);
        if (this.f57567n.get(lVar2) == null) {
            this.f57567n.put(lVar2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f57567n.get(lVar2);
        C17542s.g(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a A[LOOP:1: B:38:0x0124->B:40:0x012a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e0(x4.v r22, android.os.Bundle r23, x4.C r24, x4.I.a r25) {
        /*
            r21 = this;
            r6 = r21
            r3 = r24
            java.util.Map<x4.I<? extends x4.v>, x4.o$b> r0 = r6.f57578y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            x4.o$b r1 = (x4.C8951o.b) r1
            r1.m(r2)
            goto L_0x0010
        L_0x0021:
            kotlin.jvm.internal.K r7 = new kotlin.jvm.internal.K
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0098
            java.lang.String r0 = r24.f()
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r24.f()
            kotlin.jvm.internal.C17542s.g(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.t0(r0, r1, r4)
        L_0x0042:
            r9 = r0
            goto L_0x0099
        L_0x0044:
            uI.d r0 = r24.g()
            if (r0 == 0) goto L_0x0066
            uI.d r0 = r24.g()
            kotlin.jvm.internal.C17542s.g(r0)
            kotlinx.serialization.KSerializer r0 = fK.z.e(r0)
            int r0 = C4.j.g(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.r0(r0, r1, r4)
            goto L_0x0042
        L_0x0066:
            java.lang.Object r0 = r24.h()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r0 = r24.h()
            kotlin.jvm.internal.C17542s.g(r0)
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.s0(r0, r1, r4)
            goto L_0x0042
        L_0x0080:
            int r0 = r24.e()
            r1 = -1
            if (r0 == r1) goto L_0x0098
            int r0 = r24.e()
            boolean r1 = r24.i()
            boolean r4 = r24.k()
            boolean r0 = r6.r0(r0, r1, r4)
            goto L_0x0042
        L_0x0098:
            r9 = r8
        L_0x0099:
            android.os.Bundle r0 = r22.m(r23)
            if (r3 == 0) goto L_0x00c4
            boolean r1 = r24.l()
            if (r1 != r2) goto L_0x00c4
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r6.f57568o
            int r4 = r22.x()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x00c4
            int r1 = r22.x()
            r4 = r25
            boolean r0 = r6.A0(r1, r0, r3, r4)
            r7.f144344a = r0
            r20 = r8
            goto L_0x0115
        L_0x00c4:
            r4 = r25
            if (r3 == 0) goto L_0x00d7
            boolean r1 = r24.j()
            if (r1 != r2) goto L_0x00d7
            boolean r1 = r21.U(r22, r23)
            if (r1 == 0) goto L_0x00d7
            r20 = r2
            goto L_0x00d9
        L_0x00d7:
            r20 = r8
        L_0x00d9:
            if (r20 != 0) goto L_0x0115
            x4.l$a r10 = x4.C8948l.f57521o
            android.content.Context r11 = r6.f57554a
            androidx.lifecycle.r$b r14 = r21.M()
            x4.p r15 = r6.f57571r
            r18 = 96
            r19 = 0
            r16 = 0
            r17 = 0
            r12 = r22
            r13 = r0
            x4.l r1 = x4.C8948l.a.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            x4.J r2 = r6.f57577x
            java.lang.String r5 = r22.A()
            x4.I r2 = r2.e(r5)
            java.util.List r5 = YH.C16877v.e(r1)
            x4.o$o r10 = new x4.o$o
            r1 = r22
            r10.<init>(r7, r6, r1, r0)
            r0 = r21
            r1 = r2
            r2 = r5
            r3 = r24
            r4 = r25
            r5 = r10
            r0.h0(r1, r2, r3, r4, r5)
        L_0x0115:
            r21.M0()
            java.util.Map<x4.I<? extends x4.v>, x4.o$b> r0 = r6.f57578y
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0134
            java.lang.Object r1 = r0.next()
            x4.o$b r1 = (x4.C8951o.b) r1
            r1.m(r8)
            goto L_0x0124
        L_0x0134:
            if (r9 != 0) goto L_0x0141
            boolean r0 = r7.f144344a
            if (r0 != 0) goto L_0x0141
            if (r20 == 0) goto L_0x013d
            goto L_0x0141
        L_0x013d:
            r21.L0()
            goto L_0x0144
        L_0x0141:
            r21.u()
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8951o.e0(x4.v, android.os.Bundle, x4.C, x4.I$a):void");
    }

    public static /* synthetic */ void f0(C8951o oVar, Object obj, C c10, I.a aVar, int i10, Object obj2) {
        if (obj2 == null) {
            if ((i10 & 2) != 0) {
                c10 = null;
            }
            if ((i10 & 4) != 0) {
                aVar = null;
            }
            oVar.Z(obj, c10, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    public static /* synthetic */ void g0(C8951o oVar, String str, C c10, I.a aVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                c10 = null;
            }
            if ((i10 & 4) != 0) {
                aVar = null;
            }
            oVar.a0(str, c10, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
    }

    private final void h0(I<? extends v> i10, List<C8948l> list, C c10, I.a aVar, C17642l<? super C8948l, C16807N> lVar) {
        this.f57579z = lVar;
        i10.e(list, c10, aVar);
        this.f57579z = null;
    }

    private final void j0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f57558e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                J j10 = this.f57577x;
                C17542s.i(next, "name");
                I e10 = j10.e(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    e10.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f57559f;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i10 = 0;
            while (i10 < length) {
                Parcelable parcelable = parcelableArr[i10];
                C17542s.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C8949m mVar = (C8949m) parcelable;
                v y10 = y(this, mVar.a(), (v) null, 2, (Object) null);
                if (y10 != null) {
                    C8948l c10 = mVar.c(this.f57554a, y10, M(), this.f57571r);
                    I e11 = this.f57577x.e(y10.A());
                    Map<I<? extends v>, b> map = this.f57578y;
                    b bVar = map.get(e11);
                    if (bVar == null) {
                        bVar = new b(this, e11);
                        map.put(e11, bVar);
                    }
                    this.f57561h.add(c10);
                    bVar.o(c10);
                    x B10 = c10.e().B();
                    if (B10 != null) {
                        W(c10, D(B10.x()));
                    }
                    i10++;
                } else {
                    String b10 = v.f57671k.b(this.f57554a, mVar.a());
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + b10 + " cannot be found from the current destination " + J());
                }
            }
            M0();
            this.f57559f = null;
        }
        ArrayList<I> arrayList = new ArrayList<>();
        for (Object next2 : this.f57577x.f().values()) {
            if (!((I) next2).c()) {
                arrayList.add(next2);
            }
        }
        for (I i11 : arrayList) {
            Map<I<? extends v>, b> map2 = this.f57578y;
            b bVar2 = map2.get(i11);
            if (bVar2 == null) {
                bVar2 = new b(this, i11);
                map2.put(i11, bVar2);
            }
            i11.f(bVar2);
        }
        if (this.f57557d == null || !this.f57561h.isEmpty()) {
            u();
            return;
        }
        if (!this.f57560g && (activity = this.f57555b) != null) {
            C17542s.g(activity);
            if (S(activity.getIntent())) {
                return;
            }
        }
        x xVar = this.f57557d;
        C17542s.g(xVar);
        e0(xVar, bundle, (C) null, (I.a) null);
    }

    public static /* synthetic */ boolean o0(C8951o oVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return oVar.n0(str, z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
    }

    /* access modifiers changed from: private */
    public final void p(v vVar, Bundle bundle, C8948l lVar, List<C8948l> list) {
        v vVar2;
        List<C8948l> list2;
        C8948l lVar2;
        Bundle bundle2;
        C16869m<C8948l> mVar;
        C8948l lVar3;
        x xVar;
        C8948l lVar4;
        v vVar3 = vVar;
        List<C8948l> list3 = list;
        v e10 = lVar.e();
        if (!(e10 instanceof C8941e)) {
            while (!this.f57561h.isEmpty() && (this.f57561h.last().e() instanceof C8941e)) {
                if (!u0(this, this.f57561h.last().e().x(), true, false, 4, (Object) null)) {
                    break;
                }
            }
        }
        C16869m mVar2 = new C16869m();
        C8948l lVar5 = null;
        if (vVar3 instanceof x) {
            x xVar2 = e10;
            while (true) {
                C17542s.g(xVar2);
                x B10 = xVar2.B();
                if (B10 != null) {
                    ListIterator<C8948l> listIterator = list3.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            lVar4 = null;
                            break;
                        }
                        lVar4 = listIterator.previous();
                        if (C17542s.e(lVar4.e(), B10)) {
                            break;
                        }
                    }
                    C8948l lVar6 = lVar4;
                    if (lVar6 == null) {
                        vVar2 = e10;
                        lVar6 = C8948l.a.b(C8948l.f57521o, this.f57554a, B10, bundle, M(), this.f57571r, (String) null, (Bundle) null, 96, (Object) null);
                    } else {
                        vVar2 = e10;
                    }
                    mVar2.addFirst(lVar6);
                    if (this.f57561h.isEmpty() || this.f57561h.last().e() != B10) {
                        bundle2 = bundle;
                        lVar2 = lVar;
                        list2 = list;
                        xVar = B10;
                        mVar = mVar2;
                    } else {
                        bundle2 = bundle;
                        lVar2 = lVar;
                        list2 = list;
                        xVar = B10;
                        mVar = mVar2;
                        w0(this, this.f57561h.last(), false, (C16869m) null, 6, (Object) null);
                    }
                } else {
                    bundle2 = bundle;
                    lVar2 = lVar;
                    xVar = B10;
                    mVar = mVar2;
                    vVar2 = e10;
                    list2 = list3;
                }
                if (xVar == null || xVar == vVar3) {
                    break;
                }
                mVar2 = mVar;
                list3 = list2;
                xVar2 = xVar;
                e10 = vVar2;
            }
        } else {
            bundle2 = bundle;
            lVar2 = lVar;
            mVar = mVar2;
            vVar2 = e10;
            list2 = list3;
        }
        v e11 = mVar.isEmpty() ? vVar2 : ((C8948l) mVar.first()).e();
        while (e11 != null && x(e11.x(), e11) != e11) {
            e11 = e11.B();
            if (e11 != null) {
                Bundle bundle3 = (bundle2 == null || !bundle.isEmpty()) ? bundle2 : null;
                ListIterator<C8948l> listIterator2 = list2.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        lVar3 = null;
                        break;
                    }
                    lVar3 = listIterator2.previous();
                    if (C17542s.e(lVar3.e(), e11)) {
                        break;
                    }
                }
                C8948l lVar7 = lVar3;
                if (lVar7 == null) {
                    lVar7 = C8948l.a.b(C8948l.f57521o, this.f57554a, e11, e11.m(bundle3), M(), this.f57571r, (String) null, (Bundle) null, 96, (Object) null);
                }
                mVar.addFirst(lVar7);
            }
        }
        v e12 = mVar.isEmpty() ? vVar2 : ((C8948l) mVar.first()).e();
        while (!this.f57561h.isEmpty() && (this.f57561h.last().e() instanceof x)) {
            v e13 = this.f57561h.last().e();
            C17542s.h(e13, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((x) e13).Y().e(e12.x()) != null) {
                break;
            }
            w0(this, this.f57561h.last(), false, (C16869m) null, 6, (Object) null);
        }
        C8948l q10 = this.f57561h.q();
        if (q10 == null) {
            q10 = (C8948l) mVar.q();
        }
        if (!C17542s.e(q10 != null ? q10.e() : null, this.f57557d)) {
            ListIterator<C8948l> listIterator3 = list2.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C8948l previous = listIterator3.previous();
                v e14 = previous.e();
                x xVar3 = this.f57557d;
                C17542s.g(xVar3);
                if (C17542s.e(e14, xVar3)) {
                    lVar5 = previous;
                    break;
                }
            }
            C8948l lVar8 = lVar5;
            if (lVar8 == null) {
                C8948l.a aVar = C8948l.f57521o;
                Context context = this.f57554a;
                x xVar4 = this.f57557d;
                C17542s.g(xVar4);
                x xVar5 = this.f57557d;
                C17542s.g(xVar5);
                lVar8 = C8948l.a.b(aVar, context, xVar4, xVar5.m(bundle2), M(), this.f57571r, (String) null, (Bundle) null, 96, (Object) null);
            }
            mVar.addFirst(lVar8);
        }
        for (C8948l lVar9 : mVar) {
            b bVar = this.f57578y.get(this.f57577x.e(lVar9.e().A()));
            if (bVar != null) {
                bVar.o(lVar9);
            } else {
                throw new IllegalStateException(("NavigatorBackStack for " + vVar.A() + " should already be created").toString());
            }
        }
        this.f57561h.addAll(mVar);
        this.f57561h.add(lVar2);
        for (C8948l lVar10 : C16877v.W0(mVar, lVar2)) {
            x B11 = lVar10.e().B();
            if (B11 != null) {
                W(lVar10, D(B11.x()));
            }
        }
    }

    static /* synthetic */ void q(C8951o oVar, v vVar, Bundle bundle, C8948l lVar, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                list = C16877v.n();
            }
            oVar.p(vVar, bundle, lVar, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    private final void q0(I<? extends v> i10, C8948l lVar, boolean z10, C17642l<? super C8948l, C16807N> lVar2) {
        this.f57547A = lVar2;
        i10.j(lVar, z10);
        this.f57547A = null;
    }

    private final boolean r0(int i10, boolean z10, boolean z11) {
        v vVar;
        if (this.f57561h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = C16877v.Z0(this.f57561h).iterator();
        while (true) {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            vVar = ((C8948l) it.next()).e();
            I e10 = this.f57577x.e(vVar.A());
            if (z10 || vVar.x() != i10) {
                arrayList.add(e10);
            }
            if (vVar.x() == i10) {
                break;
            }
        }
        if (vVar != null) {
            return v(arrayList, vVar, z10, z11);
        }
        String b10 = v.f57671k.b(this.f57554a, i10);
        Log.i("NavController", "Ignoring popBackStack to destination " + b10 + " as it was not found on the current back stack");
        return false;
    }

    private final boolean s(int i10) {
        for (b m10 : this.f57578y.values()) {
            m10.m(true);
        }
        boolean A02 = A0(i10, (Bundle) null, E.a(e.f57586c), (I.a) null);
        for (b m11 : this.f57578y.values()) {
            m11.m(false);
        }
        return A02 && r0(i10, true, false);
    }

    private final <T> boolean s0(T t10, boolean z10, boolean z11) {
        return t0(C(t10), z10, z11);
    }

    private final boolean t0(String str, boolean z10, boolean z11) {
        v vVar;
        C8948l lVar;
        if (this.f57561h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C16869m<C8948l> mVar = this.f57561h;
        ListIterator<C8948l> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            vVar = null;
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            C8948l lVar2 = lVar;
            boolean G10 = lVar2.e().G(str, lVar2.c());
            if (z10 || !G10) {
                arrayList.add(this.f57577x.e(lVar2.e().A()));
                continue;
            }
            if (G10) {
                break;
            }
        }
        C8948l lVar3 = lVar;
        if (lVar3 != null) {
            vVar = lVar3.e();
        }
        if (vVar != null) {
            return v(arrayList, vVar, z10, z11);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    private final boolean u() {
        while (!this.f57561h.isEmpty() && (this.f57561h.last().e() instanceof x)) {
            w0(this, this.f57561h.last(), false, (C16869m) null, 6, (Object) null);
        }
        C8948l t10 = this.f57561h.t();
        if (t10 != null) {
            this.f57550D.add(t10);
        }
        this.f57549C++;
        L0();
        int i10 = this.f57549C - 1;
        this.f57549C = i10;
        if (i10 == 0) {
            List<C8948l> w12 = C16877v.w1(this.f57550D);
            this.f57550D.clear();
            for (C8948l lVar : w12) {
                Iterator<c> it = this.f57572s.iterator();
                while (it.hasNext()) {
                    it.next().a(this, lVar.e(), lVar.c());
                }
                this.f57552F.a(lVar);
            }
            this.f57562i.a(C16877v.w1(this.f57561h));
            this.f57564k.a(x0());
        }
        return t10 != null;
    }

    static /* synthetic */ boolean u0(C8951o oVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return oVar.r0(i10, z10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    private final boolean v(List<? extends I<?>> list, v vVar, boolean z10, boolean z11) {
        boolean z12 = z11;
        K k10 = new K();
        C16869m mVar = new C16869m();
        for (I q02 : list) {
            K k11 = new K();
            q0(q02, this.f57561h.last(), z12, new f(k11, k10, this, z11, mVar));
            if (!k11.f144344a) {
                break;
            }
        }
        if (z12) {
            if (!z10) {
                for (v x10 : C15768k.Y(C15768k.q(vVar, g.f57592c), new h(this))) {
                    Map<Integer, String> map = this.f57568o;
                    Integer valueOf = Integer.valueOf(x10.x());
                    C8949m mVar2 = (C8949m) mVar.q();
                    map.put(valueOf, mVar2 != null ? mVar2.b() : null);
                }
            }
            if (!mVar.isEmpty()) {
                C8949m mVar3 = (C8949m) mVar.first();
                for (v x11 : C15768k.Y(C15768k.q(y(this, mVar3.a(), (v) null, 2, (Object) null), i.f57594c), new j(this))) {
                    this.f57568o.put(Integer.valueOf(x11.x()), mVar3.b());
                }
                if (this.f57568o.values().contains(mVar3.b())) {
                    this.f57569p.put(mVar3.b(), mVar);
                }
            }
        }
        M0();
        return k10.f144344a;
    }

    /* access modifiers changed from: private */
    public final void v0(C8948l lVar, boolean z10, C16869m<C8949m> mVar) {
        C8952p pVar;
        C16519P<Set<C8948l>> c10;
        Set value;
        C8948l last = this.f57561h.last();
        if (C17542s.e(last, lVar)) {
            C16877v.O(this.f57561h);
            b bVar = this.f57578y.get(O().e(last.e().A()));
            boolean z11 = true;
            if ((bVar == null || (c10 = bVar.c()) == null || (value = c10.getValue()) == null || !value.contains(last)) && !this.f57567n.containsKey(last)) {
                z11 = false;
            }
            r.b d10 = last.getLifecycle().d();
            r.b bVar2 = r.b.CREATED;
            if (d10.b(bVar2)) {
                if (z10) {
                    last.l(bVar2);
                    mVar.addFirst(new C8949m(last));
                }
                if (!z11) {
                    last.l(r.b.DESTROYED);
                    K0(last);
                } else {
                    last.l(bVar2);
                }
            }
            if (!z10 && !z11 && (pVar = this.f57571r) != null) {
                pVar.D(last.f());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + lVar.e() + ", which is not the top of the back stack (" + last.e() + ')').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r4 = (r4 = (x4.C8948l) YH.C16877v.I0(r3)).e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean w(java.util.List<x4.C8948l> r12, android.os.Bundle r13, x4.C r14, x4.I.a r15) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r12
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r1.next()
            r4 = r3
            x4.l r4 = (x4.C8948l) r4
            x4.v r4 = r4.e()
            boolean r4 = r4 instanceof x4.x
            if (r4 != 0) goto L_0x0011
            r2.add(r3)
            goto L_0x0011
        L_0x002a:
            java.util.Iterator r1 = r2.iterator()
        L_0x002e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0076
            java.lang.Object r2 = r1.next()
            x4.l r2 = (x4.C8948l) r2
            java.lang.Object r3 = YH.C16877v.K0(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0055
            java.lang.Object r4 = YH.C16877v.I0(r3)
            x4.l r4 = (x4.C8948l) r4
            if (r4 == 0) goto L_0x0055
            x4.v r4 = r4.e()
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = r4.A()
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            x4.v r5 = r2.e()
            java.lang.String r5 = r5.A()
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 == 0) goto L_0x006a
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r2)
            goto L_0x002e
        L_0x006a:
            x4.l[] r2 = new x4.C8948l[]{r2}
            java.util.List r2 = YH.C16877v.t(r2)
            r0.add(r2)
            goto L_0x002e
        L_0x0076:
            kotlin.jvm.internal.K r1 = new kotlin.jvm.internal.K
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            x4.J r3 = r11.f57577x
            java.lang.Object r4 = YH.C16877v.w0(r2)
            x4.l r4 = (x4.C8948l) r4
            x4.v r4 = r4.e()
            java.lang.String r4 = r4.A()
            x4.I r9 = r3.e(r4)
            kotlin.jvm.internal.M r6 = new kotlin.jvm.internal.M
            r6.<init>()
            x4.o$k r10 = new x4.o$k
            r3 = r10
            r4 = r1
            r5 = r12
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = r11
            r4 = r9
            r5 = r2
            r6 = r14
            r7 = r15
            r8 = r10
            r3.h0(r4, r5, r6, r7, r8)
            goto L_0x007f
        L_0x00b8:
            boolean r12 = r1.f144344a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8951o.w(java.util.List, android.os.Bundle, x4.C, x4.I$a):boolean");
    }

    static /* synthetic */ void w0(C8951o oVar, C8948l lVar, boolean z10, C16869m mVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                mVar = new C16869m();
            }
            oVar.v0(lVar, z10, mVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    public static /* synthetic */ v y(C8951o oVar, int i10, v vVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                vVar = null;
            }
            return oVar.x(i10, vVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
    }

    public Bundle B0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry next : this.f57577x.f().entrySet()) {
            String str = (String) next.getKey();
            Bundle i10 = ((I) next.getValue()).i();
            if (i10 != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i10);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f57561h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f57561h.size()];
            Iterator<C8948l> it = this.f57561h.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                parcelableArr[i11] = new C8949m(it.next());
                i11++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f57568o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f57568o.size()];
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            for (Map.Entry next2 : this.f57568o.entrySet()) {
                iArr[i12] = ((Number) next2.getKey()).intValue();
                arrayList2.add((String) next2.getValue());
                i12++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f57569p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry next3 : this.f57569p.entrySet()) {
                String str2 = (String) next3.getKey();
                C16869m mVar = (C16869m) next3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[mVar.size()];
                int i13 = 0;
                for (Object next4 : mVar) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C16877v.x();
                    }
                    parcelableArr2[i13] = (C8949m) next4;
                    i13 = i14;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f57560g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f57560g);
        }
        return bundle;
    }

    public void C0(int i10) {
        F0(N().b(i10), (Bundle) null);
    }

    public C8948l D(int i10) {
        C8948l lVar;
        C16869m<C8948l> mVar = this.f57561h;
        ListIterator<C8948l> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            if (lVar.e().x() == i10) {
                break;
            }
        }
        C8948l lVar2 = lVar;
        if (lVar2 != null) {
            return lVar2;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + J()).toString());
    }

    public void D0(int i10, Bundle bundle) {
        F0(N().b(i10), bundle);
    }

    public final C8948l E(String str) {
        C8948l lVar;
        C17542s.j(str, PlaceTypes.ROUTE);
        C16869m<C8948l> mVar = this.f57561h;
        ListIterator<C8948l> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            C8948l lVar2 = lVar;
            if (lVar2.e().G(str, lVar2.c())) {
                break;
            }
        }
        C8948l lVar3 = lVar;
        if (lVar3 != null) {
            return lVar3;
        }
        throw new IllegalArgumentException(("No destination with route " + str + " is on the NavController's back stack. The current destination is " + J()).toString());
    }

    public void E0(x xVar) {
        C17542s.j(xVar, "graph");
        F0(xVar, (Bundle) null);
    }

    public final Context F() {
        return this.f57554a;
    }

    public void F0(x xVar, Bundle bundle) {
        C17542s.j(xVar, "graph");
        if (!this.f57561h.isEmpty() && M() == r.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        } else if (!C17542s.e(this.f57557d, xVar)) {
            x xVar2 = this.f57557d;
            if (xVar2 != null) {
                for (Integer num : new ArrayList(this.f57568o.keySet())) {
                    C17542s.i(num, "id");
                    s(num.intValue());
                }
                u0(this, xVar2.x(), true, false, 4, (Object) null);
            }
            this.f57557d = xVar;
            j0(bundle);
        } else {
            int o10 = xVar.Y().o();
            for (int i10 = 0; i10 < o10; i10++) {
                x xVar3 = this.f57557d;
                C17542s.g(xVar3);
                int k10 = xVar3.Y().k(i10);
                x xVar4 = this.f57557d;
                C17542s.g(xVar4);
                xVar4.Y().n(k10, xVar.Y().p(i10));
            }
            for (C8948l lVar : this.f57561h) {
                v vVar = this.f57557d;
                C17542s.g(vVar);
                for (T t10 : C16877v.V(C15768k.a0(v.f57671k.c(lVar.e())))) {
                    if ((!C17542s.e(t10, this.f57557d) || !C17542s.e(vVar, xVar)) && (vVar instanceof x)) {
                        vVar = ((x) vVar).T(t10.x());
                        C17542s.g(vVar);
                    }
                }
                lVar.k(vVar);
            }
        }
    }

    public final C16519P<List<C8948l>> G() {
        return this.f57563j;
    }

    public void G0(C5221y yVar) {
        r lifecycle;
        C17542s.j(yVar, "owner");
        if (!C17542s.e(yVar, this.f57570q)) {
            C5221y yVar2 = this.f57570q;
            if (!(yVar2 == null || (lifecycle = yVar2.getLifecycle()) == null)) {
                lifecycle.g(this.f57574u);
            }
            this.f57570q = yVar;
            yVar.getLifecycle().c(this.f57574u);
        }
    }

    public C8948l H() {
        return this.f57561h.t();
    }

    public void H0(j0 j0Var) {
        C17542s.j(j0Var, "viewModelStore");
        C8952p pVar = this.f57571r;
        C8952p.b bVar = C8952p.f57613n;
        if (!C17542s.e(pVar, bVar.a(j0Var))) {
            if (this.f57561h.isEmpty()) {
                this.f57571r = bVar.a(j0Var);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
    }

    public final C16532g<C8948l> I() {
        return this.f57553G;
    }

    public v J() {
        C8948l H10 = H();
        if (H10 != null) {
            return H10.e();
        }
        return null;
    }

    public final C8948l K0(C8948l lVar) {
        C17542s.j(lVar, "child");
        C8948l remove = this.f57566m.remove(lVar);
        Integer num = null;
        if (remove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f57567n.get(remove);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            b bVar = this.f57578y.get(this.f57577x.e(remove.e().A()));
            if (bVar != null) {
                bVar.e(remove);
            }
            this.f57567n.remove(remove);
        }
        return remove;
    }

    public x L() {
        x xVar = this.f57557d;
        if (xVar != null) {
            C17542s.h(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return xVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        r6 = (r6 = r6.c()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L0() {
        /*
            r10 = this;
            YH.m<x4.l> r0 = r10.f57561h
            java.util.List r0 = YH.C16877v.w1(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r1 = YH.C16877v.I0(r0)
            x4.l r1 = (x4.C8948l) r1
            x4.v r1 = r1.e()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r1 instanceof x4.C8941e
            if (r3 == 0) goto L_0x0046
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = YH.C16877v.Z0(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r3.next()
            x4.l r4 = (x4.C8948l) r4
            x4.v r4 = r4.e()
            r2.add(r4)
            boolean r5 = r4 instanceof x4.C8941e
            if (r5 != 0) goto L_0x002b
            boolean r4 = r4 instanceof x4.x
            if (r4 != 0) goto L_0x002b
        L_0x0046:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = YH.C16877v.Z0(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x0056:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012e
            java.lang.Object r5 = r4.next()
            x4.l r5 = (x4.C8948l) r5
            androidx.lifecycle.r$b r6 = r5.g()
            x4.v r7 = r5.e()
            if (r1 == 0) goto L_0x00e9
            int r8 = r7.x()
            int r9 = r1.x()
            if (r8 != r9) goto L_0x00e9
            androidx.lifecycle.r$b r8 = androidx.lifecycle.r.b.RESUMED
            if (r6 == r8) goto L_0x00ce
            x4.J r6 = r10.O()
            x4.v r9 = r5.e()
            java.lang.String r9 = r9.A()
            x4.I r6 = r6.e(r9)
            java.util.Map<x4.I<? extends x4.v>, x4.o$b> r9 = r10.f57578y
            java.lang.Object r6 = r9.get(r6)
            x4.o$b r6 = (x4.C8951o.b) r6
            if (r6 == 0) goto L_0x00ab
            TJ.P r6 = r6.c()
            if (r6 == 0) goto L_0x00ab
            java.lang.Object r6 = r6.getValue()
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L_0x00ab
            boolean r6 = r6.contains(r5)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x00c9
            java.util.Map<x4.l, java.util.concurrent.atomic.AtomicInteger> r6 = r10.f57567n
            java.lang.Object r6 = r6.get(r5)
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            if (r6 == 0) goto L_0x00c5
            int r6 = r6.get()
            if (r6 != 0) goto L_0x00c5
            goto L_0x00c9
        L_0x00c5:
            r3.put(r5, r8)
            goto L_0x00ce
        L_0x00c9:
            androidx.lifecycle.r$b r6 = androidx.lifecycle.r.b.STARTED
            r3.put(r5, r6)
        L_0x00ce:
            java.lang.Object r5 = YH.C16877v.y0(r2)
            x4.v r5 = (x4.v) r5
            if (r5 == 0) goto L_0x00e3
            int r5 = r5.x()
            int r6 = r7.x()
            if (r5 != r6) goto L_0x00e3
            YH.C16877v.M(r2)
        L_0x00e3:
            x4.x r1 = r1.B()
            goto L_0x0056
        L_0x00e9:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L_0x0127
            int r7 = r7.x()
            java.lang.Object r8 = YH.C16877v.w0(r2)
            x4.v r8 = (x4.v) r8
            int r8 = r8.x()
            if (r7 != r8) goto L_0x0127
            java.lang.Object r7 = YH.C16877v.M(r2)
            x4.v r7 = (x4.v) r7
            androidx.lifecycle.r$b r8 = androidx.lifecycle.r.b.RESUMED
            if (r6 != r8) goto L_0x010f
            androidx.lifecycle.r$b r6 = androidx.lifecycle.r.b.STARTED
            r5.l(r6)
            goto L_0x0116
        L_0x010f:
            androidx.lifecycle.r$b r8 = androidx.lifecycle.r.b.STARTED
            if (r6 == r8) goto L_0x0116
            r3.put(r5, r8)
        L_0x0116:
            x4.x r5 = r7.B()
            if (r5 == 0) goto L_0x0056
            boolean r6 = r2.contains(r5)
            if (r6 != 0) goto L_0x0056
            r2.add(r5)
            goto L_0x0056
        L_0x0127:
            androidx.lifecycle.r$b r6 = androidx.lifecycle.r.b.CREATED
            r5.l(r6)
            goto L_0x0056
        L_0x012e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x014e
            java.lang.Object r1 = r0.next()
            x4.l r1 = (x4.C8948l) r1
            java.lang.Object r2 = r3.get(r1)
            androidx.lifecycle.r$b r2 = (androidx.lifecycle.r.b) r2
            if (r2 == 0) goto L_0x014a
            r1.l(r2)
            goto L_0x0132
        L_0x014a:
            r1.m()
            goto L_0x0132
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8951o.L0():void");
    }

    public final r.b M() {
        return this.f57570q == null ? r.b.CREATED : this.f57573t;
    }

    public C8936B N() {
        return (C8936B) this.f57551E.getValue();
    }

    public J O() {
        return this.f57577x;
    }

    public C8948l P() {
        T t10;
        Iterator<T> it = C16877v.Z0(this.f57561h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator<T> it2 = C15768k.h(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it2.next();
            if (!(((C8948l) t10).e() instanceof x)) {
                break;
            }
        }
        return (C8948l) t10;
    }

    public final C16519P<List<C8948l>> R() {
        return this.f57565l;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01f2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean S(android.content.Intent r20) {
        /*
            r19 = this;
            r7 = r19
            r1 = r20
            r8 = 0
            if (r1 != 0) goto L_0x0008
            return r8
        L_0x0008:
            android.os.Bundle r2 = r20.getExtras()
            java.lang.String r3 = "NavController"
            r9 = 0
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = "android-support-nav:controller:deepLinkIds"
            int[] r0 = r2.getIntArray(r0)     // Catch:{ Exception -> 0x0018 }
            goto L_0x002e
        L_0x0018:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "handleDeepLink() could not extract deepLink from "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r0)
        L_0x002d:
            r0 = r9
        L_0x002e:
            if (r2 == 0) goto L_0x0037
            java.lang.String r4 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r4 = r2.getParcelableArrayList(r4)
            goto L_0x0038
        L_0x0037:
            r4 = r9
        L_0x0038:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            if (r2 == 0) goto L_0x0046
            java.lang.String r6 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r2 = r2.getBundle(r6)
            goto L_0x0047
        L_0x0046:
            r2 = r9
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            r5.putAll(r2)
        L_0x004c:
            r10 = 1
            if (r0 == 0) goto L_0x0052
            int r2 = r0.length
            if (r2 != 0) goto L_0x007a
        L_0x0052:
            YH.m<x4.l> r2 = r7.f57561h
            x4.x r2 = r7.Q(r2)
            x4.u r6 = new x4.u
            r6.<init>(r1)
            x4.v$b r2 = r2.c0(r6, r10, r10, r2)
            if (r2 == 0) goto L_0x007a
            x4.v r0 = r2.b()
            int[] r4 = x4.v.q(r0, r9, r10, r9)
            android.os.Bundle r2 = r2.j()
            android.os.Bundle r0 = r0.m(r2)
            if (r0 == 0) goto L_0x0078
            r5.putAll(r0)
        L_0x0078:
            r0 = r4
            r4 = r9
        L_0x007a:
            if (r0 == 0) goto L_0x01f2
            int r2 = r0.length
            if (r2 != 0) goto L_0x0081
            goto L_0x01f2
        L_0x0081:
            java.lang.String r2 = r7.B(r0)
            if (r2 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Could not find destination "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r2 = " in the navigation graph, ignoring the deep link from "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            return r8
        L_0x00a4:
            java.lang.String r2 = "android-support-nav:controller:deepLinkIntent"
            r5.putParcelable(r2, r1)
            int r2 = r0.length
            android.os.Bundle[] r11 = new android.os.Bundle[r2]
            r3 = r8
        L_0x00ad:
            if (r3 >= r2) goto L_0x00c9
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r6.putAll(r5)
            if (r4 == 0) goto L_0x00c4
            java.lang.Object r12 = r4.get(r3)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00c4
            r6.putAll(r12)
        L_0x00c4:
            r11[r3] = r6
            int r3 = r3 + 1
            goto L_0x00ad
        L_0x00c9:
            int r2 = r20.getFlags()
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r2
            if (r3 == 0) goto L_0x00f8
            r4 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r4
            if (r2 != 0) goto L_0x00f8
            r1.addFlags(r4)
            android.content.Context r0 = r7.f57554a
            androidx.core.app.B r0 = androidx.core.app.B.m(r0)
            androidx.core.app.B r0 = r0.i(r1)
            java.lang.String r1 = "create(context).addNextI…ntWithParentStack(intent)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            r0.r()
            android.app.Activity r0 = r7.f57555b
            if (r0 == 0) goto L_0x00f7
            r0.finish()
            r0.overridePendingTransition(r8, r8)
        L_0x00f7:
            return r10
        L_0x00f8:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r3 == 0) goto L_0x0160
            YH.m<x4.l> r1 = r7.f57561h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0116
            x4.x r1 = r7.f57557d
            kotlin.jvm.internal.C17542s.g(r1)
            int r2 = r1.x()
            r5 = 4
            r6 = 0
            r3 = 1
            r4 = 0
            r1 = r19
            u0(r1, r2, r3, r4, r5, r6)
        L_0x0116:
            int r1 = r0.length
            if (r8 >= r1) goto L_0x015d
            r1 = r0[r8]
            int r2 = r8 + 1
            r3 = r11[r8]
            r4 = 2
            x4.v r4 = y(r7, r1, r9, r4, r9)
            if (r4 == 0) goto L_0x0134
            x4.o$l r1 = new x4.o$l
            r1.<init>(r4, r7)
            x4.C r1 = x4.E.a(r1)
            r7.e0(r4, r3, r1, r9)
            r8 = r2
            goto L_0x0116
        L_0x0134:
            x4.v$a r0 = x4.v.f57671k
            android.content.Context r2 = r7.f57554a
            java.lang.String r0 = r0.b(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            x4.v r0 = r19.J()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x015d:
            r7.f57560g = r10
            return r10
        L_0x0160:
            x4.x r1 = r7.f57557d
            int r2 = r0.length
            r3 = r8
        L_0x0164:
            if (r3 >= r2) goto L_0x01ef
            r4 = r0[r3]
            r5 = r11[r3]
            if (r3 != 0) goto L_0x016f
            x4.x r6 = r7.f57557d
            goto L_0x0176
        L_0x016f:
            kotlin.jvm.internal.C17542s.g(r1)
            x4.v r6 = r1.T(r4)
        L_0x0176:
            if (r6 == 0) goto L_0x01ca
            int r4 = r0.length
            int r4 = r4 - r10
            if (r3 == r4) goto L_0x019f
            boolean r4 = r6 instanceof x4.x
            if (r4 == 0) goto L_0x01c7
            x4.x r6 = (x4.x) r6
        L_0x0182:
            kotlin.jvm.internal.C17542s.g(r6)
            int r1 = r6.a0()
            x4.v r1 = r6.T(r1)
            boolean r1 = r1 instanceof x4.x
            if (r1 == 0) goto L_0x019d
            int r1 = r6.a0()
            x4.v r1 = r6.T(r1)
            r6 = r1
            x4.x r6 = (x4.x) r6
            goto L_0x0182
        L_0x019d:
            r1 = r6
            goto L_0x01c7
        L_0x019f:
            x4.C$a r13 = new x4.C$a
            r13.<init>()
            x4.x r4 = r7.f57557d
            kotlin.jvm.internal.C17542s.g(r4)
            int r14 = r4.x()
            r17 = 4
            r18 = 0
            r15 = 1
            r16 = 0
            x4.C$a r4 = x4.C.a.k(r13, r14, r15, r16, r17, r18)
            x4.C$a r4 = r4.b(r8)
            x4.C$a r4 = r4.c(r8)
            x4.C r4 = r4.a()
            r7.e0(r6, r5, r4, r9)
        L_0x01c7:
            int r3 = r3 + 1
            goto L_0x0164
        L_0x01ca:
            x4.v$a r0 = x4.v.f57671k
            android.content.Context r2 = r7.f57554a
            java.lang.String r0 = r0.b(r2, r4)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = " cannot be found in graph "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ef:
            r7.f57560g = r10
            return r10
        L_0x01f2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8951o.S(android.content.Intent):boolean");
    }

    public void X(Uri uri) {
        C17542s.j(uri, "deepLink");
        b0(new u(uri, (String) null, (String) null));
    }

    public void Y(Uri uri, C c10) {
        C17542s.j(uri, "deepLink");
        d0(new u(uri, (String) null, (String) null), c10, (I.a) null);
    }

    public final <T> void Z(T t10, C c10, I.a aVar) {
        C17542s.j(t10, PlaceTypes.ROUTE);
        a0(C(t10), c10, aVar);
    }

    public final void a0(String str, C c10, I.a aVar) {
        C17542s.j(str, PlaceTypes.ROUTE);
        if (this.f57557d != null) {
            x Q10 = Q(this.f57561h);
            v.b d02 = Q10.d0(str, true, true, Q10);
            if (d02 != null) {
                v b10 = d02.b();
                Bundle m10 = b10.m(d02.j());
                if (m10 == null) {
                    m10 = new Bundle();
                }
                v b11 = d02.b();
                Intent intent = new Intent();
                Uri parse = Uri.parse(v.f57671k.a(b10.C()));
                C17542s.f(parse, "Uri.parse(this)");
                intent.setDataAndType(parse, (String) null);
                intent.setAction((String) null);
                m10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                e0(b11, m10, c10, aVar);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.f57557d);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + str + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    public void b0(u uVar) {
        C17542s.j(uVar, "request");
        c0(uVar, (C) null);
    }

    public void c0(u uVar, C c10) {
        C17542s.j(uVar, "request");
        d0(uVar, c10, (I.a) null);
    }

    public void d0(u uVar, C c10, I.a aVar) {
        C17542s.j(uVar, "request");
        if (this.f57557d != null) {
            x Q10 = Q(this.f57561h);
            v.b c02 = Q10.c0(uVar, true, true, Q10);
            if (c02 != null) {
                Bundle m10 = c02.b().m(c02.j());
                if (m10 == null) {
                    m10 = new Bundle();
                }
                v b10 = c02.b();
                Intent intent = new Intent();
                intent.setDataAndType(uVar.c(), uVar.b());
                intent.setAction(uVar.a());
                m10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                e0(b10, m10, c10, aVar);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches request " + uVar + " cannot be found in the navigation graph " + this.f57557d);
        }
        throw new IllegalArgumentException(("Cannot navigate to " + uVar + ". Navigation graph has not been set for NavController " + this + '.').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r0.getIntent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i0() {
        /*
            r2 = this;
            int r0 = r2.K()
            r1 = 1
            if (r0 != r1) goto L_0x002c
            android.app.Activity r0 = r2.f57555b
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0017
            android.os.Bundle r0 = r0.getExtras()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 == 0) goto L_0x0020
            java.lang.String r1 = "android-support-nav:controller:deepLinkIds"
            int[] r1 = r0.getIntArray(r1)
        L_0x0020:
            if (r1 == 0) goto L_0x0027
            boolean r0 = r2.I0()
            return r0
        L_0x0027:
            boolean r0 = r2.J0()
            return r0
        L_0x002c:
            boolean r0 = r2.k0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.C8951o.i0():boolean");
    }

    public boolean k0() {
        if (this.f57561h.isEmpty()) {
            return false;
        }
        v J10 = J();
        C17542s.g(J10);
        return l0(J10.x(), true);
    }

    public boolean l0(int i10, boolean z10) {
        return m0(i10, z10, false);
    }

    public boolean m0(int i10, boolean z10, boolean z11) {
        return r0(i10, z10, z11) && u();
    }

    public final boolean n0(String str, boolean z10, boolean z11) {
        C17542s.j(str, PlaceTypes.ROUTE);
        return t0(str, z10, z11) && u();
    }

    public final void p0(C8948l lVar, C17631a<C16807N> aVar) {
        C17542s.j(lVar, "popUpTo");
        C17542s.j(aVar, "onComplete");
        int indexOf = this.f57561h.indexOf(lVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + lVar + " as it was not found on the current back stack");
            return;
        }
        int i10 = indexOf + 1;
        if (i10 != this.f57561h.size()) {
            r0(this.f57561h.get(i10).e().x(), true, false);
        }
        w0(this, lVar, false, (C16869m) null, 6, (Object) null);
        aVar.invoke();
        M0();
        u();
    }

    public void r(c cVar) {
        C17542s.j(cVar, "listener");
        this.f57572s.add(cVar);
        if (!this.f57561h.isEmpty()) {
            C8948l last = this.f57561h.last();
            cVar.a(this, last.e(), last.c());
        }
    }

    public r t() {
        return new r(this);
    }

    public final v x(int i10, v vVar) {
        v vVar2;
        x xVar = this.f57557d;
        if (xVar == null) {
            return null;
        }
        C17542s.g(xVar);
        if (xVar.x() == i10) {
            if (vVar == null) {
                return this.f57557d;
            }
            if (C17542s.e(this.f57557d, vVar) && vVar.B() == null) {
                return this.f57557d;
            }
        }
        C8948l t10 = this.f57561h.t();
        if (t10 == null || (vVar2 = t10.e()) == null) {
            vVar2 = this.f57557d;
            C17542s.g(vVar2);
        }
        return z(vVar2, i10, false, vVar);
    }

    public final List<C8948l> x0() {
        ArrayList arrayList = new ArrayList();
        for (b c10 : this.f57578y.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : c10.c().getValue()) {
                C8948l lVar = (C8948l) next;
                if (!arrayList.contains(lVar) && !lVar.g().b(r.b.STARTED)) {
                    arrayList2.add(next);
                }
            }
            C16877v.E(arrayList, arrayList2);
        }
        C16869m<C8948l> mVar = this.f57561h;
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : mVar) {
            C8948l lVar2 = (C8948l) next2;
            if (!arrayList.contains(lVar2) && lVar2.g().b(r.b.STARTED)) {
                arrayList3.add(next2);
            }
        }
        C16877v.E(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((C8948l) next3).e() instanceof x)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    public void y0(c cVar) {
        C17542s.j(cVar, "listener");
        this.f57572s.remove(cVar);
    }

    public final v z(v vVar, int i10, boolean z10, v vVar2) {
        x xVar;
        C17542s.j(vVar, "<this>");
        if (vVar.x() == i10 && (vVar2 == null || (C17542s.e(vVar, vVar2) && C17542s.e(vVar.B(), vVar2.B())))) {
            return vVar;
        }
        if (vVar instanceof x) {
            xVar = (x) vVar;
        } else {
            xVar = vVar.B();
            C17542s.g(xVar);
        }
        return xVar.W(i10, xVar, z10, vVar2);
    }

    public void z0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f57554a.getClassLoader());
            this.f57558e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f57559f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f57569p.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    this.f57568o.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                    i10++;
                    i11++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map<String, C16869m<C8949m>> map = this.f57569p;
                        C17542s.i(str, "id");
                        C16869m mVar = new C16869m(parcelableArray.length);
                        Iterator a10 = C17527c.a(parcelableArray);
                        while (a10.hasNext()) {
                            Parcelable parcelable = (Parcelable) a10.next();
                            C17542s.h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            mVar.add((C8949m) parcelable);
                        }
                        map.put(str, mVar);
                    }
                }
            }
            this.f57560g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }
}
