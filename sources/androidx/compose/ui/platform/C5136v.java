package androidx.compose.ui.platform;

import G1.C4502e0;
import G1.C4508k;
import G1.C4517u;
import G1.G;
import G1.m0;
import I2.C4597a;
import J2.t;
import J2.u;
import L1.g;
import L1.i;
import L1.s;
import L1.w;
import N1.C4669d;
import N1.P;
import N1.W;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import V1.v;
import XH.C16807N;
import YH.C16877v;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import dI.C17164e;
import e2.C5294a;
import j0.C;
import j0.C5446b;
import j0.C5457m;
import j0.C5458n;
import j0.C5459o;
import j0.C5460p;
import j0.D;
import j0.E;
import j0.F;
import j0.K;
import j0.S;
import j0.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import p1.b1;
import tI.C17970f;
import tI.C17978n;

@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0010²\u0001Å\u0002¸\u0001¼\u0001Ä\u0001Í\u0001Ñ\u0001Ø\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0019\u001a\u00020\t2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0002¢\u0006\u0004\b'\u0010(J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020&H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u00108J\u001f\u0010:\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b:\u00105J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b;\u0010/J\u001f\u0010<\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u00105J\u0019\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u0004\u0018\u00010@*\u00020=H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u00105J\u0017\u0010D\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010EJ=\u0010K\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020M2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000bH\u0003¢\u0006\u0004\bQ\u0010RJ?\u0010X\u001a\u00020M2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bZ\u0010EJ)\u0010^\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J1\u0010a\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00122\u0006\u0010`\u001a\u0002062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\ba\u0010bJ#\u0010g\u001a\u0004\u0018\u00010f2\b\u0010c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bi\u0010jJ/\u0010l\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00109*\u00020V2\b\u0010W\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010k\u001a\u00020\u000bH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020&2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020&2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\br\u0010qJ\u001f\u0010u\u001a\u00020&2\u0006\u0010o\u001a\u00020n2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020&H\u0002¢\u0006\u0004\bw\u0010-J\u000f\u0010x\u001a\u00020&H\u0002¢\u0006\u0004\bx\u0010-J\u001d\u0010z\u001a\u00020&2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\bz\u0010{J&\u0010\u001a\u00020\t2\u0006\u0010|\u001a\u00020\u000b2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0IH\u0002¢\u0006\u0005\b\u0010\u0001J\u001b\u0010\u0001\u001a\u00020&2\u0007\u0010\u0001\u001a\u00020}H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J.\u0010\u0001\u001a\u00020&2\u0007\u0010\u0001\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b2\t\u0010\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J%\u0010\u0001\u001a\u00020&2\u0007\u0010\u0001\u001a\u00020\u001b2\b\u0010\u0001\u001a\u00030\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J5\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\t2\u0007\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020&2\u0007\u0010\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0001\u0010jJ5\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\u000b2\u0007\u0010\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u0001\u0010/J(\u0010\u0001\u001a\u0005\u0018\u00010\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0001\u0010 \u0001J\u001d\u0010¡\u0001\u001a\u0004\u0018\u0001062\b\u0010\u0015\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0005\b¡\u0001\u00108J\u0019\u0010£\u0001\u001a\u0004\u0018\u00010=*\u00030¢\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J-\u0010¥\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001b\u0010¨\u0001\u001a\u00020\t2\u0007\u0010N\u001a\u00030§\u0001H\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J&\u0010­\u0001\u001a\u00020\u000b2\b\u0010«\u0001\u001a\u00030ª\u00012\b\u0010¬\u0001\u001a\u00030ª\u0001H\u0001¢\u0006\u0006\b­\u0001\u0010®\u0001J\u001d\u0010²\u0001\u001a\u00030±\u00012\b\u0010°\u0001\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0011\u0010´\u0001\u001a\u00020&H\u0000¢\u0006\u0005\b´\u0001\u0010-J\u0013\u0010µ\u0001\u001a\u00020&H@¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0019\u0010·\u0001\u001a\u00020&2\u0006\u0010o\u001a\u00020nH\u0000¢\u0006\u0005\b·\u0001\u0010qR\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R/\u0010Â\u0001\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u001e\n\u0006\b¼\u0001\u0010½\u0001\u0012\u0005\bÁ\u0001\u0010-\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0005\bÀ\u0001\u0010jR=\u0010Ë\u0001\u001a\u000f\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\t0Ã\u00018\u0000@\u0000X\u000e¢\u0006\u001f\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÊ\u0001\u0010-\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R2\u0010Ö\u0001\u001a\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\t8\u0000@@X\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030ß\u00018\u0002X\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001RD\u0010ë\u0001\u001a-\u0012\u000f\u0012\r è\u0001*\u0005\u0018\u00010ç\u00010ç\u0001 è\u0001*\u0015\u0012\u000f\u0012\r è\u0001*\u0005\u0018\u00010ç\u00010ç\u0001\u0018\u00010I0\u001f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ï\u0001\u001a\u00030ì\u00018\u0002X\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u001e\u0010ó\u0001\u001a\u00070ð\u0001R\u00020\u00008\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0019\u0010õ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bô\u0001\u0010½\u0001R\u001b\u0010ø\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0019\u0010ú\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bù\u0001\u0010\u0001R\u001e\u0010þ\u0001\u001a\t\u0012\u0005\u0012\u00030û\u00010\u001e8\u0002X\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001e\u0010\u0002\u001a\t\u0012\u0005\u0012\u00030û\u00010\u001e8\u0002X\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010ý\u0001R'\u0010\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0\u00020\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R'\u0010\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0\u00020\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010½\u0001R\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020n0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u0002R\u001e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020&0\u00028\u0002X\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0001R\u001c\u0010\u0002\u001a\u0005\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068B@\u0002X\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020s8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R*\u0010§\u0002\u001a\u00030 \u00028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R*\u0010«\u0002\u001a\u00030 \u00028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¨\u0002\u0010¢\u0002\u001a\u0006\b©\u0002\u0010¤\u0002\"\u0006\bª\u0002\u0010¦\u0002R\u001f\u0010°\u0002\u001a\u0002068\u0000X\u0004¢\u0006\u0010\n\u0006\b¬\u0002\u0010­\u0002\u001a\u0006\b®\u0002\u0010¯\u0002R\u001f\u0010³\u0002\u001a\u0002068\u0000X\u0004¢\u0006\u0010\n\u0006\b±\u0002\u0010­\u0002\u001a\u0006\b²\u0002\u0010¯\u0002R\u0018\u0010·\u0002\u001a\u00030´\u00028\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R \u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b½\u0001\u0010ý\u0001R\u001a\u0010º\u0002\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010¹\u0002R\u0018\u0010»\u0002\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\ba\u0010\u0001R\u0017\u0010¾\u0002\u001a\u00030¼\u00028\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010½\u0002R\u001d\u0010¿\u0002\u001a\b\u0012\u0004\u0012\u00020}0\u001f8\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010ê\u0001R$\u0010À\u0002\u001a\u000f\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020&0Ã\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010Å\u0001R\u0017\u0010Â\u0002\u001a\u00020\t8BX\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010Ó\u0001R\u0017\u0010Ä\u0002\u001a\u00020\t8@X\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ó\u0001\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Æ\u0002"}, d2 = {"Landroidx/compose/ui/platform/v;", "LI2/a;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Lj0/o;", "Landroidx/compose/ui/platform/g1;", "currentSemanticsNodes", "", "vertical", "", "direction", "Lo1/g;", "position", "O", "(Lj0/o;ZIJ)Z", "virtualViewId", "LJ2/t;", "S", "(I)LJ2/t;", "node", "Landroid/graphics/Rect;", "L", "(Landroidx/compose/ui/platform/g1;)Landroid/graphics/Rect;", "layoutIsRtl", "Ljava/util/ArrayList;", "LL1/p;", "Lkotlin/collections/ArrayList;", "parentListToSort", "Lj0/E;", "", "containerChildrenMapping", "W0", "(ZLjava/util/ArrayList;Lj0/E;)Ljava/util/List;", "currNode", "geometryList", "containerMapToChildren", "LXH/N;", "X", "(LL1/p;Ljava/util/ArrayList;Lj0/E;)V", "listToSort", "Z0", "(ZLjava/util/List;)Ljava/util/List;", "V0", "()V", "q0", "(LL1/p;)Z", "info", "semanticsNode", "y0", "(ILJ2/t;LL1/p;)V", "Q0", "(LL1/p;LJ2/t;)V", "", "g0", "(LL1/p;)Ljava/lang/String;", "T", "T0", "f0", "R0", "LN1/d;", "h0", "(LL1/p;)LN1/d;", "Landroid/text/SpannableString;", "b1", "(LN1/d;)Landroid/text/SpannableString;", "U0", "n0", "(I)Z", "C0", "eventType", "contentChangeType", "", "contentDescription", "I0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "H0", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "R", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "U", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "Q", "action", "Landroid/os/Bundle;", "arguments", "v0", "(IILandroid/os/Bundle;)Z", "extraDataKey", "K", "(ILJ2/t;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Lo1/i;", "bounds", "Landroid/graphics/RectF;", "a1", "(LL1/p;Lo1/i;)Landroid/graphics/RectF;", "f1", "(I)V", "size", "e1", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "LG1/G;", "layoutNode", "s0", "(LG1/G;)V", "O0", "Lj0/F;", "subtreeChangedSemanticsNodesIds", "N0", "(LG1/G;Lj0/F;)V", "P", "g1", "newSemanticsNodes", "M0", "(Lj0/o;)V", "id", "Landroidx/compose/ui/platform/e1;", "oldScrollObservationScopes", "B0", "(ILjava/util/List;)Z", "scrollObservationScope", "D0", "(Landroidx/compose/ui/platform/e1;)V", "semanticsNodeId", "title", "K0", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/f1;", "oldNode", "G0", "(LL1/p;Landroidx/compose/ui/platform/f1;)V", "F0", "(I)I", "granularity", "forward", "extendSelection", "d1", "(LL1/p;IZZ)Z", "L0", "start", "end", "traversalMode", "P0", "(LL1/p;IIZ)Z", "Z", "(LL1/p;)I", "Y", "o0", "Landroidx/compose/ui/platform/f;", "j0", "(LL1/p;I)Landroidx/compose/ui/platform/f;", "i0", "LL1/l;", "k0", "(LL1/l;)LN1/d;", "N", "(ZIJ)Z", "Landroid/view/MotionEvent;", "V", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "m0", "(FF)I", "Landroid/view/View;", "host", "LJ2/u;", "b", "(Landroid/view/View;)LJ2/u;", "u0", "M", "(LdI/e;)Ljava/lang/Object;", "t0", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "l0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "e", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "f", "LnI/l;", "getOnSendAccessibilityEvent$ui_release", "()LnI/l;", "setOnSendAccessibilityEvent$ui_release", "(LnI/l;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "g", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "h", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "", "i", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "S0", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "j", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "k", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "l", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "m", "Landroid/os/Handler;", "handler", "Landroidx/compose/ui/platform/v$e;", "n", "Landroidx/compose/ui/platform/v$e;", "nodeProvider", "o", "focusedVirtualViewId", "p", "LJ2/t;", "currentlyFocusedANI", "q", "sendingFocusAffectingEvent", "LL1/j;", "r", "Lj0/E;", "pendingHorizontalScrollEvents", "s", "pendingVerticalScrollEvents", "Lj0/c0;", "t", "Lj0/c0;", "actionIdToLabel", "Lj0/K;", "u", "labelToActionId", "v", "accessibilityCursorPosition", "w", "Ljava/lang/Integer;", "previousTraversedNode", "Lj0/b;", "Lj0/b;", "subtreeChangedLayoutNodes", "LSJ/j;", "LSJ/j;", "boundsUpdateChannel", "z", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/v$g;", "A", "Landroidx/compose/ui/platform/v$g;", "pendingTextTraversedEvent", "B", "Lj0/o;", "a0", "()Lj0/o;", "C", "Lj0/F;", "paneDisplayed", "Lj0/C;", "D", "Lj0/C;", "e0", "()Lj0/C;", "setIdToBeforeMap$ui_release", "(Lj0/C;)V", "idToBeforeMap", "E", "d0", "setIdToAfterMap$ui_release", "idToAfterMap", "F", "Ljava/lang/String;", "c0", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "G", "b0", "ExtraDataTestTraversalAfterVal", "LV1/v;", "H", "LV1/v;", "urlSpanCache", "previousSemanticsNodes", "Landroidx/compose/ui/platform/f1;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "r0", "isTouchExplorationEnabled", "p0", "isEnabled", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.v  reason: case insensitive filesystem */
public final class C5136v extends C4597a {

    /* renamed from: O  reason: collision with root package name */
    public static final d f19596O = new d((DefaultConstructorMarker) null);

    /* renamed from: P  reason: collision with root package name */
    public static final int f19597P = 8;

    /* renamed from: Q  reason: collision with root package name */
    private static final C5457m f19598Q = C5458n.a(i1.i.f24341a, i1.i.f24342b, i1.i.f24353m, i1.i.f24364x, i1.i.f24329A, i1.i.f24330B, i1.i.f24331C, i1.i.f24332D, i1.i.f24333E, i1.i.f24334F, i1.i.f24343c, i1.i.f24344d, i1.i.f24345e, i1.i.f24346f, i1.i.f24347g, i1.i.f24348h, i1.i.f24349i, i1.i.f24350j, i1.i.f24351k, i1.i.f24352l, i1.i.f24354n, i1.i.f24355o, i1.i.f24356p, i1.i.f24357q, i1.i.f24358r, i1.i.f24359s, i1.i.f24360t, i1.i.f24361u, i1.i.f24362v, i1.i.f24363w, i1.i.f24365y, i1.i.f24366z);

    /* renamed from: A  reason: collision with root package name */
    private g f19599A;

    /* renamed from: B  reason: collision with root package name */
    private C5459o<C5104g1> f19600B;

    /* renamed from: C  reason: collision with root package name */
    private F f19601C;

    /* renamed from: D  reason: collision with root package name */
    private C f19602D;

    /* renamed from: E  reason: collision with root package name */
    private C f19603E;

    /* renamed from: F  reason: collision with root package name */
    private final String f19604F;

    /* renamed from: G  reason: collision with root package name */
    private final String f19605G;

    /* renamed from: H  reason: collision with root package name */
    private final v f19606H;

    /* renamed from: I  reason: collision with root package name */
    private E<C5101f1> f19607I;

    /* renamed from: J  reason: collision with root package name */
    private C5101f1 f19608J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f19609K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public final Runnable f19610L;

    /* renamed from: M  reason: collision with root package name */
    private final List<C5098e1> f19611M;

    /* renamed from: N  reason: collision with root package name */
    private final C17642l<C5098e1, C16807N> f19612N;

    /* renamed from: d  reason: collision with root package name */
    private final AndroidComposeView f19613d;

    /* renamed from: e  reason: collision with root package name */
    private int f19614e = Integer.MIN_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private C17642l<? super AccessibilityEvent, Boolean> f19615f = new m(this);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final AccessibilityManager f19616g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19617h;

    /* renamed from: i  reason: collision with root package name */
    private long f19618i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f19619j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f19620k;

    /* renamed from: l  reason: collision with root package name */
    private List<AccessibilityServiceInfo> f19621l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Handler f19622m;

    /* renamed from: n  reason: collision with root package name */
    private e f19623n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f19624o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public t f19625p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f19626q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final E<L1.j> f19627r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final E<L1.j> f19628s;

    /* renamed from: t  reason: collision with root package name */
    private c0<c0<CharSequence>> f19629t;

    /* renamed from: u  reason: collision with root package name */
    private c0<K<CharSequence>> f19630u;

    /* renamed from: v  reason: collision with root package name */
    private int f19631v;

    /* renamed from: w  reason: collision with root package name */
    private Integer f19632w;

    /* renamed from: x  reason: collision with root package name */
    private final C5446b<G> f19633x;

    /* renamed from: y  reason: collision with root package name */
    private final C16434j<C16807N> f19634y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f19635z;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/v$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "LXH/N;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$a */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5136v f19636a;

        a(C5136v vVar) {
            this.f19636a = vVar;
        }

        public void onViewAttachedToWindow(View view) {
            AccessibilityManager u10 = this.f19636a.f19616g;
            C5136v vVar = this.f19636a;
            u10.addAccessibilityStateChangeListener(vVar.f19619j);
            u10.addTouchExplorationStateChangeListener(vVar.f19620k);
        }

        public void onViewDetachedFromWindow(View view) {
            this.f19636a.f19622m.removeCallbacks(this.f19636a.f19610L);
            AccessibilityManager u10 = this.f19636a.f19616g;
            C5136v vVar = this.f19636a;
            u10.removeAccessibilityStateChangeListener(vVar.f19619j);
            u10.removeTouchExplorationStateChangeListener(vVar.f19620k);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/v$b;", "", "<init>", "()V", "LJ2/t;", "info", "LL1/p;", "semanticsNode", "LXH/N;", "a", "(LJ2/t;LL1/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19637a = new b();

        private b() {
        }

        public static final void a(t tVar, L1.p pVar) {
            L1.a aVar;
            if (C5142y.h(pVar) && (aVar = (L1.a) L1.m.a(pVar.w(), L1.k.f8953a.w())) != null) {
                tVar.b(new t.a(16908349, aVar.b()));
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/v$c;", "", "<init>", "()V", "LJ2/t;", "info", "LL1/p;", "semanticsNode", "LXH/N;", "a", "(LJ2/t;LL1/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19638a = new c();

        private c() {
        }

        public static final void a(t tVar, L1.p pVar) {
            if (C5142y.h(pVar)) {
                L1.l w10 = pVar.w();
                L1.k kVar = L1.k.f8953a;
                L1.a aVar = (L1.a) L1.m.a(w10, kVar.q());
                if (aVar != null) {
                    tVar.b(new t.a(16908358, aVar.b()));
                }
                L1.a aVar2 = (L1.a) L1.m.a(pVar.w(), kVar.n());
                if (aVar2 != null) {
                    tVar.b(new t.a(16908359, aVar2.b()));
                }
                L1.a aVar3 = (L1.a) L1.m.a(pVar.w(), kVar.o());
                if (aVar3 != null) {
                    tVar.b(new t.a(16908360, aVar3.b()));
                }
                L1.a aVar4 = (L1.a) L1.m.a(pVar.w(), kVar.p());
                if (aVar4 != null) {
                    tVar.b(new t.a(16908361, aVar4.b()));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00158\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/v$d;", "", "<init>", "()V", "Lj0/m;", "AccessibilityActionsResourceIds", "Lj0/m;", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "TextClassName", "TextFieldClassName", "", "TextTraversedEventTimeoutMillis", "J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/v$e;", "LJ2/u;", "<init>", "(Landroidx/compose/ui/platform/v;)V", "", "virtualViewId", "LJ2/t;", "b", "(I)LJ2/t;", "action", "Landroid/os/Bundle;", "arguments", "", "f", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "LXH/N;", "a", "(ILJ2/t;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$e */
    private final class e extends u {
        public e() {
        }

        public void a(int i10, t tVar, String str, Bundle bundle) {
            C5136v.this.K(i10, tVar, str, bundle);
        }

        public t b(int i10) {
            t t10 = C5136v.this.S(i10);
            C5136v vVar = C5136v.this;
            if (vVar.f19626q && i10 == vVar.f19624o) {
                vVar.f19625p = t10;
            }
            return t10;
        }

        public t d(int i10) {
            return b(C5136v.this.f19624o);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return C5136v.this.v0(i10, i11, bundle);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/v$f;", "Ljava/util/Comparator;", "LL1/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(LL1/p;LL1/p;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$f */
    private static final class f implements Comparator<L1.p> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f19640a = new f();

        private f() {
        }

        /* renamed from: a */
        public int compare(L1.p pVar, L1.p pVar2) {
            C5669i j10 = pVar.j();
            C5669i j11 = pVar2.j();
            int compare = Float.compare(j10.o(), j11.o());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(j10.r(), j11.r());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(j10.j(), j11.j());
            return compare3 != 0 ? compare3 : Float.compare(j10.p(), j11.p());
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/v$g;", "", "LL1/p;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(LL1/p;IIIIJ)V", "a", "LL1/p;", "d", "()LL1/p;", "b", "I", "()I", "c", "e", "f", "J", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$g */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final L1.p f19641a;

        /* renamed from: b  reason: collision with root package name */
        private final int f19642b;

        /* renamed from: c  reason: collision with root package name */
        private final int f19643c;

        /* renamed from: d  reason: collision with root package name */
        private final int f19644d;

        /* renamed from: e  reason: collision with root package name */
        private final int f19645e;

        /* renamed from: f  reason: collision with root package name */
        private final long f19646f;

        public g(L1.p pVar, int i10, int i11, int i12, int i13, long j10) {
            this.f19641a = pVar;
            this.f19642b = i10;
            this.f19643c = i11;
            this.f19644d = i12;
            this.f19645e = i13;
            this.f19646f = j10;
        }

        public final int a() {
            return this.f19642b;
        }

        public final int b() {
            return this.f19644d;
        }

        public final int c() {
            return this.f19643c;
        }

        public final L1.p d() {
            return this.f19641a;
        }

        public final int e() {
            return this.f19645e;
        }

        public final long f() {
            return this.f19646f;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/v$h;", "Ljava/util/Comparator;", "LL1/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(LL1/p;LL1/p;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$h */
    private static final class h implements Comparator<L1.p> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f19647a = new h();

        private h() {
        }

        /* renamed from: a */
        public int compare(L1.p pVar, L1.p pVar2) {
            C5669i j10 = pVar.j();
            C5669i j11 = pVar2.j();
            int compare = Float.compare(j11.p(), j10.p());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(j10.r(), j11.r());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(j10.j(), j11.j());
            return compare3 != 0 ? compare3 : Float.compare(j11.o(), j10.o());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\t\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/v$i;", "Ljava/util/Comparator;", "LXH/v;", "Lo1/i;", "", "LL1/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(LXH/v;LXH/v;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$i */
    private static final class i implements Comparator<XH.v<? extends C5669i, ? extends List<L1.p>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f19648a = new i();

        private i() {
        }

        /* renamed from: a */
        public int compare(XH.v<C5669i, ? extends List<L1.p>> vVar, XH.v<C5669i, ? extends List<L1.p>> vVar2) {
            int compare = Float.compare(vVar.c().r(), vVar2.c().r());
            return compare != 0 ? compare : Float.compare(vVar.c().j(), vVar2.c().j());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$j */
    public /* synthetic */ class j {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19649a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                M1.a[] r0 = M1.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                M1.a r1 = M1.a.On     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                M1.a r1 = M1.a.Off     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                M1.a r1 = M1.a.Indeterminate     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f19649a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5136v.j.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2247, 2280}, m = "boundsUpdatesEventLoop$ui_release")
    /* renamed from: androidx.compose.ui.platform.v$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f19650c;

        /* renamed from: d  reason: collision with root package name */
        Object f19651d;

        /* renamed from: e  reason: collision with root package name */
        Object f19652e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f19653f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5136v f19654g;

        /* renamed from: h  reason: collision with root package name */
        int f19655h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C5136v vVar, C17164e<? super k> eVar) {
            super(eVar);
            this.f19654g = vVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19653f = obj;
            this.f19655h |= Integer.MIN_VALUE;
            return this.f19654g.M(this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.v$l */
    static final class l extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final l f19656c = new l();

        l() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/accessibility/AccessibilityEvent;", "it", "", "a", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.v$m */
    static final class m extends C17544u implements C17642l<AccessibilityEvent, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5136v f19657c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C5136v vVar) {
            super(1);
            this.f19657c = vVar;
        }

        /* renamed from: a */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.f19657c.l0().getParent().requestSendAccessibilityEvent(this.f19657c.l0(), accessibilityEvent));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.v$n */
    static final class n extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5098e1 f19658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5136v f19659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C5098e1 e1Var, C5136v vVar) {
            super(0);
            this.f19658c = e1Var;
            this.f19659d = vVar;
        }

        public final void invoke() {
            L1.p b10;
            G q10;
            L1.j a10 = this.f19658c.a();
            L1.j e10 = this.f19658c.e();
            Float b11 = this.f19658c.b();
            Float c10 = this.f19658c.c();
            float floatValue = (a10 == null || b11 == null) ? 0.0f : a10.c().invoke().floatValue() - b11.floatValue();
            float floatValue2 = (e10 == null || c10 == null) ? 0.0f : e10.c().invoke().floatValue() - c10.floatValue();
            if (!(floatValue == 0.0f && floatValue2 == 0.0f)) {
                int I10 = this.f19659d.F0(this.f19658c.d());
                C5104g1 g1Var = (C5104g1) this.f19659d.a0().c(this.f19659d.f19624o);
                if (g1Var != null) {
                    C5136v vVar = this.f19659d;
                    try {
                        t w10 = vVar.f19625p;
                        if (w10 != null) {
                            w10.f0(vVar.L(g1Var));
                            C16807N n10 = C16807N.f139792a;
                        }
                    } catch (IllegalStateException unused) {
                        C16807N n11 = C16807N.f139792a;
                    }
                }
                this.f19659d.l0().invalidate();
                C5104g1 g1Var2 = (C5104g1) this.f19659d.a0().c(I10);
                if (!(g1Var2 == null || (b10 = g1Var2.b()) == null || (q10 = b10.q()) == null)) {
                    C5136v vVar2 = this.f19659d;
                    if (a10 != null) {
                        vVar2.f19627r.t(I10, a10);
                    }
                    if (e10 != null) {
                        vVar2.f19628s.t(I10, e10);
                    }
                    vVar2.s0(q10);
                }
            }
            if (a10 != null) {
                this.f19658c.g(a10.c().invoke());
            }
            if (e10 != null) {
                this.f19658c.h(e10.c().invoke());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/e1;", "it", "LXH/N;", "a", "(Landroidx/compose/ui/platform/e1;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.v$o */
    static final class o extends C17544u implements C17642l<C5098e1, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5136v f19660c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(C5136v vVar) {
            super(1);
            this.f19660c = vVar;
        }

        public final void a(C5098e1 e1Var) {
            this.f19660c.D0(e1Var);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5098e1) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.v$p */
    static final class p extends C17544u implements C17642l<G, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final p f19661c = new p();

        p() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            L1.l L10 = g10.L();
            boolean z10 = false;
            if (L10 != null && L10.A()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.v$q */
    static final class q extends C17544u implements C17642l<G, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final q f19662c = new q();

        q() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(G g10) {
            return Boolean.valueOf(g10.m0().r(C4502e0.a(8)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"LL1/p;", "kotlin.jvm.PlatformType", "a", "b", "", "(LL1/p;LL1/p;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.v$r */
    static final class r extends C17544u implements nI.p<L1.p, L1.p, Integer> {

        /* renamed from: c  reason: collision with root package name */
        public static final r f19663c = new r();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.v$r$a */
        static final class a extends C17544u implements C17631a<Float> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f19664c = new a();

            a() {
                super(0);
            }

            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.v$r$b */
        static final class b extends C17544u implements C17631a<Float> {

            /* renamed from: c  reason: collision with root package name */
            public static final b f19665c = new b();

            b() {
                super(0);
            }

            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        r() {
            super(2);
        }

        /* renamed from: a */
        public final Integer invoke(L1.p pVar, L1.p pVar2) {
            L1.l w10 = pVar.w();
            s sVar = s.f9010a;
            return Integer.valueOf(Float.compare(((Number) w10.s(sVar.H(), a.f19664c)).floatValue(), ((Number) pVar2.w().s(sVar.H(), b.f19665c)).floatValue()));
        }
    }

    public C5136v(AndroidComposeView androidComposeView) {
        this.f19613d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f19616g = accessibilityManager;
        this.f19618i = 100;
        this.f19619j = new C5130s(this);
        this.f19620k = new C5132t(this);
        this.f19621l = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f19622m = new Handler(Looper.getMainLooper());
        this.f19623n = new e();
        this.f19624o = Integer.MIN_VALUE;
        this.f19627r = new E<>(0, 1, (DefaultConstructorMarker) null);
        this.f19628s = new E<>(0, 1, (DefaultConstructorMarker) null);
        this.f19629t = new c0<>(0, 1, (DefaultConstructorMarker) null);
        this.f19630u = new c0<>(0, 1, (DefaultConstructorMarker) null);
        this.f19631v = -1;
        this.f19633x = new C5446b<>(0, 1, (DefaultConstructorMarker) null);
        this.f19634y = C16437m.b(1, (C16428d) null, (C17642l) null, 6, (Object) null);
        this.f19635z = true;
        this.f19600B = C5460p.a();
        this.f19601C = new F(0, 1, (DefaultConstructorMarker) null);
        this.f19602D = new C(0, 1, (DefaultConstructorMarker) null);
        this.f19603E = new C(0, 1, (DefaultConstructorMarker) null);
        this.f19604F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f19605G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f19606H = new v();
        this.f19607I = C5460p.b();
        this.f19608J = new C5101f1(androidComposeView.getSemanticsOwner().a(), C5460p.a());
        androidComposeView.addOnAttachStateChangeListener(new a(this));
        this.f19610L = new C5134u(this);
        this.f19611M = new ArrayList();
        this.f19612N = new o(this);
    }

    private static final boolean A0(L1.j jVar) {
        return (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && !jVar.b()) || (jVar.c().invoke().floatValue() > 0.0f && jVar.b());
    }

    private final boolean B0(int i10, List<C5098e1> list) {
        boolean z10;
        C5098e1 a10 = C5107h1.a(list, i10);
        if (a10 != null) {
            z10 = false;
        } else {
            a10 = new C5098e1(i10, this.f19611M, (Float) null, (Float) null, (L1.j) null, (L1.j) null);
            z10 = true;
        }
        this.f19611M.add(a10);
        return z10;
    }

    private final boolean C0(int i10) {
        if (!r0() || n0(i10)) {
            return false;
        }
        int i11 = this.f19624o;
        if (i11 != Integer.MIN_VALUE) {
            J0(this, i11, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, (Integer) null, (List) null, 12, (Object) null);
        }
        this.f19624o = i10;
        this.f19613d.invalidate();
        J0(this, i10, 32768, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    /* access modifiers changed from: private */
    public final void D0(C5098e1 e1Var) {
        if (e1Var.f1()) {
            this.f19613d.getSnapshotObserver().i(e1Var, this.f19612N, new n(e1Var, this));
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    public static final void E0(C5136v vVar) {
        Trace.beginSection("measureAndLayout");
        try {
            m0.k(vVar.f19613d, false, 1, (Object) null);
            C16807N n10 = C16807N.f139792a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                vVar.P();
                Trace.endSection();
                vVar.f19609K = false;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* access modifiers changed from: private */
    public final int F0(int i10) {
        if (i10 == this.f19613d.getSemanticsOwner().a().o()) {
            return -1;
        }
        return i10;
    }

    private final void G0(L1.p pVar, C5101f1 f1Var) {
        F b10 = j0.r.b();
        List<L1.p> t10 = pVar.t();
        int size = t10.size();
        for (int i10 = 0; i10 < size; i10++) {
            L1.p pVar2 = t10.get(i10);
            if (a0().a(pVar2.o())) {
                if (!f1Var.a().a(pVar2.o())) {
                    s0(pVar.q());
                    return;
                }
                b10.f(pVar2.o());
            }
        }
        F a10 = f1Var.a();
        int[] iArr = a10.f24640b;
        long[] jArr = a10.f24639a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) >= 128 || b10.a(iArr[(i11 << 3) + i13])) {
                            j10 >>= 8;
                            i13++;
                        } else {
                            s0(pVar.q());
                            return;
                        }
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        List<L1.p> t11 = pVar.t();
        int size2 = t11.size();
        for (int i14 = 0; i14 < size2; i14++) {
            L1.p pVar3 = t11.get(i14);
            if (a0().a(pVar3.o())) {
                C5101f1 c10 = this.f19607I.c(pVar3.o());
                C17542s.g(c10);
                G0(pVar3, c10);
            }
        }
    }

    private final boolean H0(AccessibilityEvent accessibilityEvent) {
        if (!p0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f19626q = true;
        }
        try {
            return this.f19615f.invoke(accessibilityEvent).booleanValue();
        } finally {
            this.f19626q = false;
        }
    }

    private final boolean I0(int i10, int i11, Integer num, List<String> list) {
        if (i10 == Integer.MIN_VALUE || !p0()) {
            return false;
        }
        AccessibilityEvent R10 = R(i10, i11);
        if (num != null) {
            R10.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            R10.setContentDescription(C5294a.e(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        }
        Trace.beginSection("sendEvent");
        try {
            return H0(R10);
        } finally {
            Trace.endSection();
        }
    }

    static /* synthetic */ boolean J0(C5136v vVar, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return vVar.I0(i10, i11, num, list);
    }

    /* access modifiers changed from: private */
    public final void K(int i10, t tVar, String str, Bundle bundle) {
        L1.p b10;
        C5104g1 c10 = a0().c(i10);
        if (c10 != null && (b10 = c10.b()) != null) {
            String i02 = i0(b10);
            if (C17542s.e(str, this.f19604F)) {
                int e10 = this.f19602D.e(i10, -1);
                if (e10 != -1) {
                    tVar.t().putInt(str, e10);
                }
            } else if (C17542s.e(str, this.f19605G)) {
                int e11 = this.f19603E.e(i10, -1);
                if (e11 != -1) {
                    tVar.t().putInt(str, e11);
                }
            } else if (!b10.w().k(L1.k.f8953a.i()) || bundle == null || !C17542s.e(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                L1.l w10 = b10.w();
                s sVar = s.f9010a;
                if (w10.k(sVar.C()) && bundle != null && C17542s.e(str, "androidx.compose.ui.semantics.testTag")) {
                    String str2 = (String) L1.m.a(b10.w(), sVar.C());
                    if (str2 != null) {
                        tVar.t().putCharSequence(str, str2);
                    }
                } else if (C17542s.e(str, "androidx.compose.ui.semantics.id")) {
                    tVar.t().putInt(str, b10.o());
                }
            } else {
                int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i12 > 0 && i11 >= 0) {
                    if (i11 < (i02 != null ? i02.length() : Integer.MAX_VALUE)) {
                        P e12 = C5107h1.e(b10.w());
                        if (e12 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i13 = 0; i13 < i12; i13++) {
                                int i14 = i11 + i13;
                                if (i14 >= e12.l().j().length()) {
                                    arrayList.add((Object) null);
                                } else {
                                    arrayList.add(a1(b10, e12.d(i14)));
                                }
                            }
                            tVar.t().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            }
        }
    }

    private final void K0(int i10, int i11, String str) {
        AccessibilityEvent R10 = R(F0(i10), 32);
        R10.setContentChangeTypes(i11);
        if (str != null) {
            R10.getText().add(str);
        }
        H0(R10);
    }

    /* access modifiers changed from: private */
    public final Rect L(C5104g1 g1Var) {
        Rect a10 = g1Var.a();
        long z10 = this.f19613d.z(C5668h.a((float) a10.left, (float) a10.top));
        long z11 = this.f19613d.z(C5668h.a((float) a10.right, (float) a10.bottom));
        return new Rect((int) ((float) Math.floor((double) C5667g.m(z10))), (int) ((float) Math.floor((double) C5667g.n(z10))), (int) ((float) Math.ceil((double) C5667g.m(z11))), (int) ((float) Math.ceil((double) C5667g.n(z11))));
    }

    private final void L0(int i10) {
        g gVar = this.f19599A;
        if (gVar != null) {
            if (i10 == gVar.d().o()) {
                if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                    AccessibilityEvent R10 = R(F0(gVar.d().o()), 131072);
                    R10.setFromIndex(gVar.b());
                    R10.setToIndex(gVar.e());
                    R10.setAction(gVar.a());
                    R10.setMovementGranularity(gVar.c());
                    R10.getText().add(i0(gVar.d()));
                    H0(R10);
                }
            } else {
                return;
            }
        }
        this.f19599A = null;
    }

    /* JADX WARNING: type inference failed for: r1v48, types: [N1.d] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0583, code lost:
        if (r0.containsAll(r2) != false) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05da, code lost:
        if (androidx.compose.ui.platform.C5142y.g((L1.a) r1, L1.m.a(r18.b(), (L1.w) r0.getKey())) == false) goto L_0x0589;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M0(j0.C5459o<androidx.compose.ui.platform.C5104g1> r37) {
        /*
            r36 = this;
            r7 = r36
            r8 = r37
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.List<androidx.compose.ui.platform.e1> r0 = r7.f19611M
            java.util.Collection r0 = (java.util.Collection) r0
            r10.<init>(r0)
            java.util.List<androidx.compose.ui.platform.e1> r0 = r7.f19611M
            r0.clear()
            int[] r11 = r8.f24634b
            long[] r12 = r8.f24633a
            int r0 = r12.length
            r13 = 2
            int r14 = r0 + -2
            if (r14 < 0) goto L_0x0664
            r6 = 0
        L_0x001d:
            r0 = r12[r6]
            long r2 = ~r0
            r4 = 7
            long r2 = r2 << r4
            long r2 = r2 & r0
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x064b
            int r2 = r6 - r14
            int r2 = ~r2
            int r2 = r2 >>> 31
            r5 = 8
            int r4 = 8 - r2
            r16 = r0
            r3 = 0
        L_0x0039:
            if (r3 >= r4) goto L_0x063c
            r0 = 255(0xff, double:1.26E-321)
            long r0 = r16 & r0
            r18 = 128(0x80, double:6.32E-322)
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x061c
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r11[r0]
            j0.E<androidx.compose.ui.platform.f1> r0 = r7.f19607I
            java.lang.Object r0 = r0.c(r2)
            r18 = r0
            androidx.compose.ui.platform.f1 r18 = (androidx.compose.ui.platform.C5101f1) r18
            if (r18 != 0) goto L_0x0058
            goto L_0x061c
        L_0x0058:
            java.lang.Object r0 = r8.c(r2)
            androidx.compose.ui.platform.g1 r0 = (androidx.compose.ui.platform.C5104g1) r0
            r19 = 0
            if (r0 == 0) goto L_0x0068
            L1.p r0 = r0.b()
            r1 = r0
            goto L_0x006a
        L_0x0068:
            r1 = r19
        L_0x006a:
            if (r1 == 0) goto L_0x0611
            L1.l r0 = r1.w()
            java.util.Iterator r20 = r0.iterator()
            r21 = 0
        L_0x0076:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x05dd
            java.lang.Object r0 = r20.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r13 = r0.getKey()
            L1.s r22 = L1.s.f9010a
            L1.w r9 = r22.k()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r13, r9)
            if (r9 != 0) goto L_0x00a3
            java.lang.Object r9 = r0.getKey()
            L1.w r13 = r22.I()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r9 = 0
            goto L_0x00a7
        L_0x00a3:
            boolean r9 = r7.B0(r2, r10)
        L_0x00a7:
            if (r9 != 0) goto L_0x00d4
            java.lang.Object r9 = r0.getValue()
            L1.l r13 = r18.b()
            java.lang.Object r23 = r0.getKey()
            r15 = r23
            L1.w r15 = (L1.w) r15
            java.lang.Object r13 = L1.m.a(r13, r15)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r9 == 0) goto L_0x00d4
        L_0x00c3:
            r25 = r1
            r8 = r2
            r23 = r3
            r13 = r4
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = 2
            r11 = r5
            goto L_0x058b
        L_0x00d4:
            java.lang.Object r9 = r0.getKey()
            L1.w r9 = (L1.w) r9
            L1.w r13 = r22.v()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r13 == 0) goto L_0x0101
            java.lang.Object r0 = r0.getValue()
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.C17542s.h(r0, r9)
            java.lang.String r0 = (java.lang.String) r0
            L1.l r9 = r18.b()
            L1.w r13 = r22.v()
            boolean r9 = r9.k(r13)
            if (r9 == 0) goto L_0x00c3
            r7.K0(r2, r5, r0)
            goto L_0x00c3
        L_0x0101:
            L1.w r13 = r22.B()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r13 == 0) goto L_0x010d
            r13 = 1
            goto L_0x0115
        L_0x010d:
            L1.w r13 = r22.G()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r9, r13)
        L_0x0115:
            r15 = 64
            if (r13 == 0) goto L_0x015e
            int r9 = r7.F0(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r15 = 8
            r22 = 0
            r23 = 2048(0x800, float:2.87E-42)
            r24 = 0
            r0 = r36
            r25 = r1
            r1 = r9
            r9 = r2
            r2 = r23
            r23 = r3
            r3 = r13
            r13 = r4
            r4 = r24
            r5 = r15
            r15 = r6
            r6 = r22
            J0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.F0(r9)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            J0(r0, r1, r2, r3, r4, r5, r6)
            r8 = r9
        L_0x0153:
            r24 = r10
            r26 = r11
            r27 = r12
        L_0x0159:
            r10 = 2
        L_0x015a:
            r11 = 8
            goto L_0x058b
        L_0x015e:
            r25 = r1
            r5 = r2
            r23 = r3
            r13 = r4
            L1.w r1 = r22.x()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            if (r1 == 0) goto L_0x01a6
            int r1 = r7.F0(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r9 = 8
            r15 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            r26 = r5
            r5 = r9
            r9 = r6
            r6 = r15
            J0(r0, r1, r2, r3, r4, r5, r6)
            r15 = r26
            int r1 = r7.F0(r15)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r0 = r36
            J0(r0, r1, r2, r3, r4, r5, r6)
            r24 = r10
            r26 = r11
            r27 = r12
            r8 = r15
            r10 = 2
            r11 = 8
            r15 = r9
            goto L_0x058b
        L_0x01a6:
            L1.w r1 = r22.A()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            r2 = 4
            if (r1 == 0) goto L_0x02a9
            L1.l r0 = r25.w()
            L1.w r1 = r22.y()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.i r0 = (L1.i) r0
            L1.i$a r1 = L1.i.f8936b
            int r1 = r1.g()
            if (r0 != 0) goto L_0x01c9
            r0 = 0
            goto L_0x01d1
        L_0x01c9:
            int r0 = r0.n()
            boolean r0 = L1.i.k(r0, r1)
        L_0x01d1:
            if (r0 == 0) goto L_0x0280
            L1.l r0 = r25.w()
            L1.w r1 = r22.A()
            java.lang.Object r0 = L1.m.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x025c
            int r0 = r7.F0(r5)
            android.view.accessibility.AccessibilityEvent r0 = r7.R(r0, r2)
            L1.p r1 = r25.a()
            L1.l r2 = r1.n()
            L1.w r3 = r22.d()
            java.lang.Object r2 = L1.m.a(r2, r3)
            r26 = r2
            java.util.List r26 = (java.util.List) r26
            if (r26 == 0) goto L_0x021a
            r33 = 62
            r34 = 0
            java.lang.String r27 = ","
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            java.lang.String r2 = e2.C5294a.e(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x021c
        L_0x021a:
            r2 = r19
        L_0x021c:
            L1.l r1 = r1.n()
            L1.w r3 = r22.D()
            java.lang.Object r1 = L1.m.a(r1, r3)
            r26 = r1
            java.util.List r26 = (java.util.List) r26
            if (r26 == 0) goto L_0x0243
            r33 = 62
            r34 = 0
            java.lang.String r27 = ","
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            java.lang.String r1 = e2.C5294a.e(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0245
        L_0x0243:
            r1 = r19
        L_0x0245:
            if (r2 == 0) goto L_0x024c
            r0.setContentDescription(r2)
            XH.N r2 = XH.C16807N.f139792a
        L_0x024c:
            if (r1 == 0) goto L_0x0255
            java.util.List r2 = r0.getText()
            r2.add(r1)
        L_0x0255:
            r7.H0(r0)
            r8 = r5
            r15 = r6
            goto L_0x0153
        L_0x025c:
            int r1 = r7.F0(r5)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r9 = 8
            r15 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            r35 = r5
            r5 = r9
            r9 = r6
            r6 = r15
            J0(r0, r1, r2, r3, r4, r5, r6)
            r15 = r9
            r24 = r10
            r26 = r11
            r27 = r12
            r8 = r35
            goto L_0x0159
        L_0x0280:
            r9 = r6
            r6 = r5
            int r1 = r7.F0(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            r5 = 8
            r15 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            r8 = r6
            r6 = r15
            J0(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r7.F0(r8)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r0 = r36
            J0(r0, r1, r2, r3, r4, r5, r6)
            r15 = r9
            goto L_0x0153
        L_0x02a9:
            r8 = r5
            r15 = r6
            L1.w r1 = r22.d()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            if (r1 == 0) goto L_0x02cf
            int r1 = r7.F0(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            kotlin.jvm.internal.C17542s.h(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r3 = 2048(0x800, float:2.87E-42)
            r7.I0(r1, r3, r2, r0)
            goto L_0x0153
        L_0x02cf:
            L1.w r1 = r22.g()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            r2 = 100000(0x186a0, float:1.4013E-40)
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0413
            L1.l r0 = r25.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.y()
            boolean r0 = r0.k(r1)
            if (r0 == 0) goto L_0x03f7
            L1.l r0 = r18.b()
            N1.d r0 = r7.k0(r0)
            if (r0 == 0) goto L_0x02f9
            goto L_0x02fa
        L_0x02f9:
            r0 = r3
        L_0x02fa:
            L1.l r1 = r25.w()
            N1.d r1 = r7.k0(r1)
            if (r1 == 0) goto L_0x0305
            r3 = r1
        L_0x0305:
            java.lang.CharSequence r5 = r7.e1(r3, r2)
            int r1 = r0.length()
            int r2 = r3.length()
            int r4 = tI.C17978n.i(r1, r2)
            r6 = 0
        L_0x0316:
            if (r6 >= r4) goto L_0x032b
            char r9 = r0.charAt(r6)
            r24 = r10
            char r10 = r3.charAt(r6)
            if (r9 == r10) goto L_0x0326
        L_0x0324:
            r9 = 1
            goto L_0x032e
        L_0x0326:
            r9 = 1
            int r6 = r6 + r9
            r10 = r24
            goto L_0x0316
        L_0x032b:
            r24 = r10
            goto L_0x0324
        L_0x032e:
            r26 = r11
            r10 = 0
        L_0x0331:
            int r11 = r4 - r6
            if (r10 >= r11) goto L_0x034a
            int r11 = r1 + -1
            int r11 = r11 - r10
            char r11 = r0.charAt(r11)
            int r22 = r2 + -1
            int r9 = r22 - r10
            char r9 = r3.charAt(r9)
            if (r11 == r9) goto L_0x0347
            goto L_0x034a
        L_0x0347:
            r9 = 1
            int r10 = r10 + r9
            goto L_0x0331
        L_0x034a:
            int r1 = r1 - r10
            int r1 = r1 - r6
            int r3 = r2 - r10
            int r3 = r3 - r6
            L1.l r4 = r18.b()
            L1.s r9 = L1.s.f9010a
            L1.w r10 = r9.w()
            boolean r4 = r4.k(r10)
            L1.l r10 = r25.w()
            L1.w r11 = r9.w()
            boolean r10 = r10.k(r11)
            L1.l r11 = r18.b()
            r27 = r12
            L1.w r12 = r9.g()
            boolean r11 = r11.k(r12)
            if (r11 == 0) goto L_0x037f
            if (r4 != 0) goto L_0x037f
            if (r10 == 0) goto L_0x037f
            r12 = 1
            goto L_0x0380
        L_0x037f:
            r12 = 0
        L_0x0380:
            if (r11 == 0) goto L_0x0388
            if (r4 == 0) goto L_0x0388
            if (r10 != 0) goto L_0x0388
            r10 = 1
            goto L_0x0389
        L_0x0388:
            r10 = 0
        L_0x0389:
            if (r12 != 0) goto L_0x03ac
            if (r10 == 0) goto L_0x038e
            goto L_0x03ac
        L_0x038e:
            int r2 = r7.F0(r8)
            r4 = 16
            android.view.accessibility.AccessibilityEvent r2 = r7.R(r2, r4)
            r2.setFromIndex(r6)
            r2.setRemovedCount(r1)
            r2.setAddedCount(r3)
            r2.setBeforeText(r0)
            java.util.List r0 = r2.getText()
            r0.add(r5)
            goto L_0x03c6
        L_0x03ac:
            int r1 = r7.F0(r8)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r0 = r36
            r2 = r3
            r3 = r4
            r4 = r6
            android.view.accessibility.AccessibilityEvent r2 = r0.U(r1, r2, r3, r4, r5)
        L_0x03c6:
            java.lang.String r0 = "android.widget.EditText"
            r2.setClassName(r0)
            r7.H0(r2)
            if (r12 != 0) goto L_0x03d2
            if (r10 == 0) goto L_0x0159
        L_0x03d2:
            L1.l r0 = r25.w()
            L1.w r1 = r9.E()
            java.lang.Object r0 = r0.q(r1)
            N1.W r0 = (N1.W) r0
            long r0 = r0.r()
            int r3 = N1.W.n(r0)
            r2.setFromIndex(r3)
            int r0 = N1.W.i(r0)
            r2.setToIndex(r0)
            r7.H0(r2)
            goto L_0x0159
        L_0x03f7:
            r24 = r10
            r26 = r11
            r27 = r12
            int r1 = r7.F0(r8)
            r10 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            J0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x015a
        L_0x0413:
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = 2
            L1.w r1 = r22.E()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            if (r1 == 0) goto L_0x047f
            L1.l r0 = r25.w()
            N1.d r0 = r7.k0(r0)
            if (r0 == 0) goto L_0x0436
            java.lang.String r0 = r0.j()
            if (r0 != 0) goto L_0x0435
            goto L_0x0436
        L_0x0435:
            r3 = r0
        L_0x0436:
            L1.l r0 = r25.w()
            L1.w r1 = r22.E()
            java.lang.Object r0 = r0.q(r1)
            N1.W r0 = (N1.W) r0
            long r0 = r0.r()
            int r4 = r7.F0(r8)
            int r5 = N1.W.n(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r0 = N1.W.i(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            int r0 = r3.length()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r11 = r7.e1(r3, r2)
            r0 = r36
            r1 = r4
            r2 = r5
            r3 = r6
            r4 = r9
            r5 = r11
            android.view.accessibility.AccessibilityEvent r0 = r0.U(r1, r2, r3, r4, r5)
            r7.H0(r0)
            int r0 = r25.o()
            r7.L0(r0)
            goto L_0x015a
        L_0x047f:
            L1.w r1 = r22.k()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            if (r1 == 0) goto L_0x048b
            r1 = 1
            goto L_0x0493
        L_0x048b:
            L1.w r1 = r22.I()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
        L_0x0493:
            if (r1 == 0) goto L_0x04cc
            G1.G r0 = r25.q()
            r7.s0(r0)
            java.util.List<androidx.compose.ui.platform.e1> r0 = r7.f19611M
            androidx.compose.ui.platform.e1 r0 = androidx.compose.ui.platform.C5107h1.a(r0, r8)
            kotlin.jvm.internal.C17542s.g(r0)
            L1.l r1 = r25.w()
            L1.w r2 = r22.k()
            java.lang.Object r1 = L1.m.a(r1, r2)
            L1.j r1 = (L1.j) r1
            r0.f(r1)
            L1.l r1 = r25.w()
            L1.w r2 = r22.I()
            java.lang.Object r1 = L1.m.a(r1, r2)
            L1.j r1 = (L1.j) r1
            r0.i(r1)
            r7.D0(r0)
            goto L_0x015a
        L_0x04cc:
            L1.w r1 = r22.i()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r1)
            if (r1 == 0) goto L_0x0515
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04f9
            int r0 = r25.o()
            int r0 = r7.F0(r0)
            r11 = 8
            android.view.accessibility.AccessibilityEvent r0 = r7.R(r0, r11)
            r7.H0(r0)
            goto L_0x04fb
        L_0x04f9:
            r11 = 8
        L_0x04fb:
            int r0 = r25.o()
            int r1 = r7.F0(r0)
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            J0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x058b
        L_0x0515:
            r11 = 8
            L1.k r1 = L1.k.f8953a
            L1.w r2 = r1.d()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r9, r2)
            if (r2 == 0) goto L_0x05b5
            L1.l r0 = r25.w()
            L1.w r2 = r1.d()
            java.lang.Object r0 = r0.q(r2)
            java.util.List r0 = (java.util.List) r0
            L1.l r2 = r18.b()
            L1.w r1 = r1.d()
            java.lang.Object r1 = L1.m.a(r2, r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x059e
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            int r3 = r0.size()
            r4 = 0
        L_0x054b:
            if (r4 >= r3) goto L_0x055d
            java.lang.Object r5 = r0.get(r4)
            L1.e r5 = (L1.e) r5
            java.lang.String r5 = r5.b()
            r2.add(r5)
            r5 = 1
            int r4 = r4 + r5
            goto L_0x054b
        L_0x055d:
            r5 = 1
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r3 = r1.size()
            r4 = 0
        L_0x0568:
            if (r4 >= r3) goto L_0x0579
            java.lang.Object r6 = r1.get(r4)
            L1.e r6 = (L1.e) r6
            java.lang.String r6 = r6.b()
            r0.add(r6)
            int r4 = r4 + r5
            goto L_0x0568
        L_0x0579:
            boolean r1 = r2.containsAll(r0)
            if (r1 == 0) goto L_0x0589
            boolean r0 = r0.containsAll(r2)
            if (r0 != 0) goto L_0x0586
            goto L_0x0589
        L_0x0586:
            r21 = 0
            goto L_0x058b
        L_0x0589:
            r21 = 1
        L_0x058b:
            r2 = r8
            r5 = r11
            r4 = r13
            r6 = r15
            r3 = r23
            r1 = r25
            r11 = r26
            r12 = r27
        L_0x0597:
            r8 = r37
            r13 = r10
            r10 = r24
            goto L_0x0076
        L_0x059e:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x058b
            r2 = r8
            r5 = r11
            r4 = r13
            r6 = r15
            r3 = r23
            r1 = r25
            r11 = r26
            r12 = r27
            r21 = 1
            goto L_0x0597
        L_0x05b5:
            java.lang.Object r1 = r0.getValue()
            boolean r1 = r1 instanceof L1.a
            if (r1 == 0) goto L_0x0589
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            kotlin.jvm.internal.C17542s.h(r1, r2)
            L1.a r1 = (L1.a) r1
            L1.l r2 = r18.b()
            java.lang.Object r0 = r0.getKey()
            L1.w r0 = (L1.w) r0
            java.lang.Object r0 = L1.m.a(r2, r0)
            boolean r0 = androidx.compose.ui.platform.C5142y.g(r1, r0)
            if (r0 != 0) goto L_0x0586
            goto L_0x0589
        L_0x05dd:
            r25 = r1
            r8 = r2
            r23 = r3
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r13 = r4
            r11 = r5
            if (r21 != 0) goto L_0x05f8
            L1.l r0 = r18.b()
            r1 = r25
            boolean r21 = androidx.compose.ui.platform.C5142y.l(r1, r0)
        L_0x05f8:
            if (r21 == 0) goto L_0x060f
            int r1 = r7.F0(r8)
            r8 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r36
            J0(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0629
        L_0x060f:
            r8 = 0
            goto L_0x0629
        L_0x0611:
            java.lang.String r0 = "no value for specified key"
            D1.a.c(r0)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x061c:
            r23 = r3
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r8 = 0
            r13 = r4
            r11 = r5
        L_0x0629:
            long r16 = r16 >> r11
            r0 = 1
            int r3 = r23 + 1
            r8 = r37
            r5 = r11
            r4 = r13
            r6 = r15
            r11 = r26
            r12 = r27
            r13 = r10
            r10 = r24
            goto L_0x0039
        L_0x063c:
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r0 = 1
            r8 = 0
            r13 = r4
            r11 = r5
            if (r13 != r11) goto L_0x0664
            goto L_0x0655
        L_0x064b:
            r15 = r6
            r24 = r10
            r26 = r11
            r27 = r12
            r10 = r13
            r0 = 1
            r8 = 0
        L_0x0655:
            if (r15 == r14) goto L_0x0664
            int r6 = r15 + 1
            r8 = r37
            r13 = r10
            r10 = r24
            r11 = r26
            r12 = r27
            goto L_0x001d
        L_0x0664:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5136v.M0(j0.o):void");
    }

    private final void N0(G g10, F f10) {
        L1.l L10;
        G d10;
        if (g10.c() && !this.f19613d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g10)) {
            if (!g10.m0().r(C4502e0.a(8))) {
                g10 = C5142y.j(g10, q.f19662c);
            }
            if (g10 != null && (L10 = g10.L()) != null) {
                if (!L10.A() && (d10 = C5142y.j(g10, p.f19661c)) != null) {
                    g10 = d10;
                }
                int q10 = g10.q();
                if (f10.f(q10)) {
                    J0(this, F0(q10), RecyclerView.n.FLAG_MOVED, 1, (List) null, 8, (Object) null);
                }
            }
        }
    }

    private final boolean O(C5459o<C5104g1> oVar, boolean z10, int i10, long j10) {
        w wVar;
        boolean z11;
        L1.j jVar;
        C5459o<C5104g1> oVar2 = oVar;
        boolean z12 = z10;
        int i11 = i10;
        long j11 = j10;
        if (C5667g.j(j11, C5667g.f26701b.b()) || !C5667g.p(j10)) {
            return false;
        }
        if (z12) {
            wVar = s.f9010a.I();
        } else if (!z12) {
            wVar = s.f9010a.k();
        } else {
            throw new XH.t();
        }
        Object[] objArr = oVar2.f24635c;
        long[] jArr = oVar2.f24633a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            boolean z13 = false;
            while (true) {
                long j12 = jArr[i12];
                if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j12 & 255) < 128) {
                            C5104g1 g1Var = (C5104g1) objArr[(i12 << 3) + i14];
                            if (b1.e(g1Var.a()).f(j11) && (jVar = (L1.j) L1.m.a(g1Var.b().w(), wVar)) != null) {
                                int i15 = jVar.b() ? -i11 : i11;
                                if (i11 == 0 && jVar.b()) {
                                    i15 = -1;
                                }
                                if (i15 < 0) {
                                    if (jVar.c().invoke().floatValue() <= 0.0f) {
                                    }
                                } else if (jVar.c().invoke().floatValue() >= jVar.a().invoke().floatValue()) {
                                }
                                z13 = true;
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i13 != 8) {
                        return z13;
                    }
                }
                if (i12 == length) {
                    z11 = z13;
                    break;
                }
                i12++;
            }
        } else {
            z11 = false;
        }
        return z11;
    }

    private final void O0(G g10) {
        if (g10.c() && !this.f19613d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g10)) {
            int q10 = g10.q();
            L1.j c10 = this.f19627r.c(q10);
            L1.j c11 = this.f19628s.c(q10);
            if (c10 != null || c11 != null) {
                AccessibilityEvent R10 = R(q10, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
                if (c10 != null) {
                    R10.setScrollX((int) c10.c().invoke().floatValue());
                    R10.setMaxScrollX((int) c10.a().invoke().floatValue());
                }
                if (c11 != null) {
                    R10.setScrollY((int) c11.c().invoke().floatValue());
                    R10.setMaxScrollY((int) c11.a().invoke().floatValue());
                }
                H0(R10);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void P() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p0()) {
                G0(this.f19613d.getSemanticsOwner().a(), this.f19608J);
            }
            C16807N n10 = C16807N.f139792a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                M0(a0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    g1();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    private final boolean P0(L1.p pVar, int i10, int i11, boolean z10) {
        String i02;
        L1.l w10 = pVar.w();
        L1.k kVar = L1.k.f8953a;
        boolean z11 = false;
        if (w10.k(kVar.x()) && C5142y.h(pVar)) {
            nI.q qVar = (nI.q) ((L1.a) pVar.w().q(kVar.x())).a();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        } else if ((i10 == i11 && i11 == this.f19631v) || (i02 = i0(pVar)) == null) {
            return false;
        } else {
            if (i10 < 0 || i10 != i11 || i11 > i02.length()) {
                i10 = -1;
            }
            this.f19631v = i10;
            if (i02.length() > 0) {
                z11 = true;
            }
            int F02 = F0(pVar.o());
            Integer num = null;
            Integer valueOf = z11 ? Integer.valueOf(this.f19631v) : null;
            Integer valueOf2 = z11 ? Integer.valueOf(this.f19631v) : null;
            if (z11) {
                num = Integer.valueOf(i02.length());
            }
            H0(U(F02, valueOf, valueOf2, num, i02));
            L0(pVar.o());
            return true;
        }
    }

    private final boolean Q(int i10) {
        if (!n0(i10)) {
            return false;
        }
        this.f19624o = Integer.MIN_VALUE;
        this.f19625p = null;
        this.f19613d.invalidate();
        J0(this, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, (Integer) null, (List) null, 12, (Object) null);
        return true;
    }

    private final void Q0(L1.p pVar, t tVar) {
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        if (w10.k(sVar.h())) {
            tVar.n0(true);
            tVar.r0((CharSequence) L1.m.a(pVar.w(), sVar.h()));
        }
    }

    private final AccessibilityEvent R(int i10, int i11) {
        C5104g1 c10;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f19613d.getContext().getPackageName());
        obtain.setSource(this.f19613d, i10);
        if (p0() && (c10 = a0().c(i10)) != null) {
            obtain.setPassword(c10.b().w().k(s.f9010a.w()));
        }
        return obtain;
    }

    private final void R0(L1.p pVar, t tVar) {
        tVar.g0(f0(pVar));
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r1v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (r0 = r0.a()).getLifecycle();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final J2.t S(int r7) {
        /*
            r6 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.f19613d
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r0.getViewTreeOwners()
            r1 = 0
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.y r0 = r0.a()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.r r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001a
            androidx.lifecycle.r$b r0 = r0.d()
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            androidx.lifecycle.r$b r2 = androidx.lifecycle.r.b.DESTROYED
            if (r0 != r2) goto L_0x0020
            return r1
        L_0x0020:
            J2.t r0 = J2.t.V()
            j0.o r2 = r6.a0()
            java.lang.Object r2 = r2.c(r7)
            androidx.compose.ui.platform.g1 r2 = (androidx.compose.ui.platform.C5104g1) r2
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x0031:
            L1.p r3 = r2.b()
            r4 = -1
            if (r7 != r4) goto L_0x0049
            androidx.compose.ui.platform.AndroidComposeView r4 = r6.f19613d
            android.view.ViewParent r4 = r4.getParentForAccessibility()
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L_0x0045
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L_0x0045:
            r0.F0(r1)
            goto L_0x0074
        L_0x0049:
            L1.p r5 = r3.r()
            if (r5 == 0) goto L_0x0057
            int r1 = r5.o()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0057:
            if (r1 == 0) goto L_0x0084
            int r1 = r1.intValue()
            androidx.compose.ui.platform.AndroidComposeView r5 = r6.f19613d
            L1.r r5 = r5.getSemanticsOwner()
            L1.p r5 = r5.a()
            int r5 = r5.o()
            if (r1 != r5) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = r1
        L_0x006f:
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f19613d
            r0.G0(r1, r4)
        L_0x0074:
            androidx.compose.ui.platform.AndroidComposeView r1 = r6.f19613d
            r0.P0(r1, r7)
            android.graphics.Rect r1 = r6.L(r2)
            r0.f0(r1)
            r6.y0(r7, r0, r3)
            return r0
        L_0x0084:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "semanticsNode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " has null parent"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            D1.a.c(r7)
            XH.k r7 = new XH.k
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5136v.S(int):J2.t");
    }

    private final String T(L1.p pVar) {
        Collection collection;
        CharSequence charSequence;
        L1.l n10 = pVar.a().n();
        s sVar = s.f9010a;
        Collection collection2 = (Collection) L1.m.a(n10, sVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) L1.m.a(n10, sVar.D())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) L1.m.a(n10, sVar.g())) == null || charSequence.length() == 0))) {
            return this.f19613d.getContext().getResources().getString(i1.j.f24379m);
        }
        return null;
    }

    private final void T0(L1.p pVar, t tVar) {
        tVar.Q0(g0(pVar));
    }

    private final AccessibilityEvent U(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent R10 = R(i10, 8192);
        if (num != null) {
            R10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            R10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            R10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            R10.getText().add(charSequence);
        }
        return R10;
    }

    private final void U0(L1.p pVar, t tVar) {
        C4669d h02 = h0(pVar);
        tVar.R0(h02 != null ? b1(h02) : null);
    }

    private final void V0() {
        this.f19602D.i();
        this.f19603E.i();
        C5104g1 c10 = a0().c(-1);
        L1.p b10 = c10 != null ? c10.b() : null;
        C17542s.g(b10);
        List<L1.p> Z02 = Z0(C5142y.k(b10), C16877v.t(b10));
        int p10 = C16877v.p(Z02);
        int i10 = 1;
        if (1 <= p10) {
            while (true) {
                int o10 = Z02.get(i10 - 1).o();
                int o11 = Z02.get(i10).o();
                this.f19602D.q(o10, o11);
                this.f19603E.q(o11, o10);
                if (i10 != p10) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void W(C5136v vVar, boolean z10) {
        vVar.f19621l = z10 ? vVar.f19616g.getEnabledAccessibilityServiceList(-1) : C16877v.n();
    }

    private final List<L1.p> W0(boolean z10, ArrayList<L1.p> arrayList, E<List<L1.p>> e10) {
        ArrayList arrayList2 = new ArrayList();
        int p10 = C16877v.p(arrayList);
        int i10 = 0;
        if (p10 >= 0) {
            int i11 = 0;
            while (true) {
                L1.p pVar = arrayList.get(i11);
                if (i11 == 0 || !Y0(arrayList2, pVar)) {
                    arrayList2.add(new XH.v(pVar.j(), C16877v.t(pVar)));
                }
                if (i11 == p10) {
                    break;
                }
                i11++;
            }
        }
        C16877v.C(arrayList2, i.f19648a);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            XH.v vVar = (XH.v) arrayList2.get(i12);
            C16877v.C((List) vVar.d(), new C5140x(new C5138w(z10 ? h.f19647a : f.f19640a, G.f6213L.b())));
            arrayList3.addAll((Collection) vVar.d());
        }
        C16877v.C(arrayList3, new r(r.f19663c));
        while (i10 <= C16877v.p(arrayList3)) {
            List c10 = e10.c(((L1.p) arrayList3.get(i10)).o());
            if (c10 != null) {
                if (!q0((L1.p) arrayList3.get(i10))) {
                    arrayList3.remove(i10);
                } else {
                    i10++;
                }
                arrayList3.addAll(i10, c10);
                i10 += c10.size();
            } else {
                i10++;
            }
        }
        return arrayList3;
    }

    private final void X(L1.p pVar, ArrayList<L1.p> arrayList, E<List<L1.p>> e10) {
        boolean e11 = C5142y.k(pVar);
        boolean booleanValue = ((Boolean) pVar.w().s(s.f9010a.s(), l.f19656c)).booleanValue();
        if ((booleanValue || q0(pVar)) && a0().b(pVar.o())) {
            arrayList.add(pVar);
        }
        if (booleanValue) {
            e10.t(pVar.o(), Z0(e11, C16877v.w1(pVar.k())));
            return;
        }
        List<L1.p> k10 = pVar.k();
        int size = k10.size();
        for (int i10 = 0; i10 < size; i10++) {
            X(k10.get(i10), arrayList, e10);
        }
    }

    /* access modifiers changed from: private */
    public static final int X0(nI.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final int Y(L1.p pVar) {
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        return (w10.k(sVar.d()) || !pVar.w().k(sVar.E())) ? this.f19631v : W.i(((W) pVar.w().q(sVar.E())).r());
    }

    private static final boolean Y0(ArrayList<XH.v<C5669i, List<L1.p>>> arrayList, L1.p pVar) {
        float r10 = pVar.j().r();
        float j10 = pVar.j().j();
        boolean z10 = r10 >= j10;
        int p10 = C16877v.p(arrayList);
        if (p10 >= 0) {
            int i10 = 0;
            while (true) {
                C5669i iVar = (C5669i) arrayList.get(i10).c();
                boolean z11 = iVar.r() >= iVar.j();
                if (z10 || z11 || Math.max(r10, iVar.r()) >= Math.min(j10, iVar.j())) {
                    if (i10 == p10) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList.set(i10, new XH.v(iVar.v(0.0f, r10, Float.POSITIVE_INFINITY, j10), arrayList.get(i10).d()));
                    ((List) arrayList.get(i10).d()).add(pVar);
                    return true;
                }
            }
        }
        return false;
    }

    private final int Z(L1.p pVar) {
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        return (w10.k(sVar.d()) || !pVar.w().k(sVar.E())) ? this.f19631v : W.n(((W) pVar.w().q(sVar.E())).r());
    }

    private final List<L1.p> Z0(boolean z10, List<L1.p> list) {
        E b10 = C5460p.b();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X(list.get(i10), arrayList, b10);
        }
        return W0(z10, arrayList, b10);
    }

    /* access modifiers changed from: private */
    public final C5459o<C5104g1> a0() {
        if (this.f19635z) {
            this.f19635z = false;
            this.f19600B = C5107h1.b(this.f19613d.getSemanticsOwner());
            if (p0()) {
                V0();
            }
        }
        return this.f19600B;
    }

    private final RectF a1(L1.p pVar, C5669i iVar) {
        if (pVar == null) {
            return null;
        }
        C5669i A10 = iVar.A(pVar.s());
        C5669i i10 = pVar.i();
        C5669i w10 = A10.y(i10) ? A10.w(i10) : null;
        if (w10 == null) {
            return null;
        }
        long z10 = this.f19613d.z(C5668h.a(w10.o(), w10.r()));
        long z11 = this.f19613d.z(C5668h.a(w10.p(), w10.j()));
        return new RectF(C5667g.m(z10), C5667g.n(z10), C5667g.m(z11), C5667g.n(z11));
    }

    private final SpannableString b1(C4669d dVar) {
        return (SpannableString) e1(V1.a.b(dVar, this.f19613d.getDensity(), this.f19613d.getFontFamilyResolver(), this.f19606H), 100000);
    }

    /* access modifiers changed from: private */
    public static final void c1(C5136v vVar, boolean z10) {
        vVar.f19621l = vVar.f19616g.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean d1(L1.p pVar, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int o10 = pVar.o();
        Integer num = this.f19632w;
        if (num == null || o10 != num.intValue()) {
            this.f19631v = -1;
            this.f19632w = Integer.valueOf(pVar.o());
        }
        String i02 = i0(pVar);
        boolean z12 = false;
        if (!(i02 == null || i02.length() == 0)) {
            C5099f j02 = j0(pVar, i10);
            if (j02 == null) {
                return false;
            }
            int Y10 = Y(pVar);
            if (Y10 == -1) {
                Y10 = z10 ? 0 : i02.length();
            }
            int[] a10 = z10 ? j02.a(Y10) : j02.b(Y10);
            if (a10 == null) {
                return false;
            }
            int i13 = a10[0];
            z12 = true;
            int i14 = a10[1];
            if (!z11 || !o0(pVar)) {
                i11 = z10 ? i14 : i13;
                i12 = i11;
            } else {
                i11 = Z(pVar);
                if (i11 == -1) {
                    i11 = z10 ? i13 : i14;
                }
                i12 = z10 ? i14 : i13;
            }
            this.f19599A = new g(pVar, z10 ? 256 : 512, i10, i13, i14, SystemClock.uptimeMillis());
            P0(pVar, i11, i12, true);
        }
        return z12;
    }

    private final <T extends CharSequence> T e1(T t10, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        } else if (t10 == null || t10.length() == 0 || t10.length() <= i10) {
            return t10;
        } else {
            int i11 = i10 - 1;
            if (Character.isHighSurrogate(t10.charAt(i11)) && Character.isLowSurrogate(t10.charAt(i10))) {
                i10 = i11;
            }
            T subSequence = t10.subSequence(0, i10);
            C17542s.h(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
            return subSequence;
        }
    }

    private final boolean f0(L1.p pVar) {
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        M1.a aVar = (M1.a) L1.m.a(w10, sVar.G());
        L1.i iVar = (L1.i) L1.m.a(pVar.w(), sVar.y());
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = aVar != null;
        if (((Boolean) L1.m.a(pVar.w(), sVar.A())) == null) {
            return z12;
        }
        int g10 = L1.i.f8936b.g();
        if (iVar != null) {
            z11 = L1.i.k(iVar.n(), g10);
        }
        if (z11) {
            z10 = z12;
        }
        return z10;
    }

    private final void f1(int i10) {
        int i11 = this.f19614e;
        if (i11 != i10) {
            this.f19614e = i10;
            J0(this, i10, 128, (Integer) null, (List) null, 12, (Object) null);
            J0(this, i11, 256, (Integer) null, (List) null, 12, (Object) null);
        }
    }

    private final String g0(L1.p pVar) {
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        Object a10 = L1.m.a(w10, sVar.B());
        M1.a aVar = (M1.a) L1.m.a(pVar.w(), sVar.G());
        L1.i iVar = (L1.i) L1.m.a(pVar.w(), sVar.y());
        int i10 = 0;
        if (aVar != null) {
            int i11 = j.f19649a[aVar.ordinal()];
            if (i11 == 1) {
                if ((iVar == null ? false : L1.i.k(iVar.n(), L1.i.f8936b.f())) && a10 == null) {
                    a10 = this.f19613d.getContext().getResources().getString(i1.j.f24381o);
                }
            } else if (i11 == 2) {
                if ((iVar == null ? false : L1.i.k(iVar.n(), L1.i.f8936b.f())) && a10 == null) {
                    a10 = this.f19613d.getContext().getResources().getString(i1.j.f24380n);
                }
            } else if (i11 == 3 && a10 == null) {
                a10 = this.f19613d.getContext().getResources().getString(i1.j.f24373g);
            }
        }
        Boolean bool = (Boolean) L1.m.a(pVar.w(), sVar.A());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(iVar == null ? false : L1.i.k(iVar.n(), L1.i.f8936b.g())) && a10 == null) {
                a10 = booleanValue ? this.f19613d.getContext().getResources().getString(i1.j.f24378l) : this.f19613d.getContext().getResources().getString(i1.j.f24375i);
            }
        }
        L1.h hVar = (L1.h) L1.m.a(pVar.w(), sVar.x());
        if (hVar != null) {
            if (hVar != L1.h.f8931d.a()) {
                if (a10 == null) {
                    C17970f<Float> c10 = hVar.c();
                    float b10 = ((c10.m().floatValue() - c10.i().floatValue()) > 0.0f ? 1 : ((c10.m().floatValue() - c10.i().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (hVar.b() - c10.i().floatValue()) / (c10.m().floatValue() - c10.i().floatValue());
                    if (b10 < 0.0f) {
                        b10 = 0.0f;
                    }
                    if (b10 > 1.0f) {
                        b10 = 1.0f;
                    }
                    if (!(b10 == 0.0f)) {
                        if (b10 == 1.0f) {
                            i10 = 1;
                        }
                        i10 = i10 != 0 ? 100 : C17978n.m(Math.round(b10 * ((float) 100)), 1, 99);
                    }
                    a10 = this.f19613d.getContext().getResources().getString(i1.j.f24384r, new Object[]{Integer.valueOf(i10)});
                }
            } else if (a10 == null) {
                a10 = this.f19613d.getContext().getResources().getString(i1.j.f24372f);
            }
        }
        if (pVar.w().k(sVar.g())) {
            a10 = T(pVar);
        }
        return (String) a10;
    }

    private final void g1() {
        L1.l b10;
        F f10 = new F(0, 1, (DefaultConstructorMarker) null);
        F f11 = this.f19601C;
        int[] iArr = f11.f24640b;
        long[] jArr = f11.f24639a;
        int length = jArr.length - 2;
        long j10 = 128;
        long j11 = 255;
        char c10 = 7;
        long j12 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            int[] iArr2 = iArr;
            while (true) {
                long j13 = jArr[i10];
                long[] jArr2 = jArr;
                if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & j11) < j10) {
                            int i13 = iArr2[(i10 << 3) + i12];
                            C5104g1 c11 = a0().c(i13);
                            L1.p b11 = c11 != null ? c11.b() : null;
                            if (b11 == null || !b11.w().k(s.f9010a.v())) {
                                f10.f(i13);
                                C5101f1 c12 = this.f19607I.c(i13);
                                K0(i13, 32, (c12 == null || (b10 = c12.b()) == null) ? null : (String) L1.m.a(b10, s.f9010a.v()));
                            }
                        }
                        j13 >>= 8;
                        i12++;
                        j10 = 128;
                        j11 = 255;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                jArr = jArr2;
                j10 = 128;
                j11 = 255;
            }
        }
        this.f19601C.r(f10);
        this.f19607I.i();
        C5459o<C5104g1> a02 = a0();
        int[] iArr3 = a02.f24634b;
        Object[] objArr = a02.f24635c;
        long[] jArr3 = a02.f24633a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i14 = 0;
            while (true) {
                long j14 = jArr3[i14];
                if ((((~j14) << c10) & j14 & j12) != j12) {
                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j14 & 255) < 128) {
                            int i17 = (i14 << 3) + i16;
                            int i18 = iArr3[i17];
                            C5104g1 g1Var = (C5104g1) objArr[i17];
                            L1.l w10 = g1Var.b().w();
                            s sVar = s.f9010a;
                            if (w10.k(sVar.v()) && this.f19601C.f(i18)) {
                                K0(i18, 16, (String) g1Var.b().w().q(sVar.v()));
                            }
                            this.f19607I.t(i18, new C5101f1(g1Var.b(), a0()));
                        }
                        j14 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                }
                if (i14 == length2) {
                    break;
                }
                i14++;
                c10 = 7;
                j12 = -9187201950435737472L;
            }
        }
        this.f19608J = new C5101f1(this.f19613d.getSemanticsOwner().a(), a0());
    }

    private final C4669d h0(L1.p pVar) {
        C4669d k02 = k0(pVar.w());
        List list = (List) L1.m.a(pVar.w(), s.f9010a.D());
        return k02 == null ? list != null ? (C4669d) C16877v.y0(list) : null : k02;
    }

    private final String i0(L1.p pVar) {
        C4669d dVar;
        if (pVar == null) {
            return null;
        }
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        if (w10.k(sVar.d())) {
            return C5294a.e((List) pVar.w().q(sVar.d()), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        }
        if (pVar.w().k(sVar.g())) {
            C4669d k02 = k0(pVar.w());
            if (k02 != null) {
                return k02.j();
            }
            return null;
        }
        List list = (List) L1.m.a(pVar.w(), sVar.D());
        if (list == null || (dVar = (C4669d) C16877v.y0(list)) == null) {
            return null;
        }
        return dVar.j();
    }

    private final C5099f j0(L1.p pVar, int i10) {
        String i02;
        P e10;
        if (pVar == null || (i02 = i0(pVar)) == null || i02.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            C5087b a10 = C5087b.f19370d.a(this.f19613d.getContext().getResources().getConfiguration().locale);
            a10.e(i02);
            return a10;
        } else if (i10 != 2) {
            if (i10 != 4) {
                if (i10 == 8) {
                    C5096e a11 = C5096e.f19440c.a();
                    a11.e(i02);
                    return a11;
                } else if (i10 != 16) {
                    return null;
                }
            }
            if (!pVar.w().k(L1.k.f8953a.i()) || (e10 = C5107h1.e(pVar.w())) == null) {
                return null;
            }
            if (i10 == 4) {
                C5090c a12 = C5090c.f19394d.a();
                a12.j(i02, e10);
                return a12;
            }
            C5093d a13 = C5093d.f19431f.a();
            a13.j(i02, e10, pVar);
            return a13;
        } else {
            C5102g a14 = C5102g.f19497d.a(this.f19613d.getContext().getResources().getConfiguration().locale);
            a14.e(i02);
            return a14;
        }
    }

    private final C4669d k0(L1.l lVar) {
        return (C4669d) L1.m.a(lVar, s.f9010a.g());
    }

    private final boolean n0(int i10) {
        return this.f19624o == i10;
    }

    private final boolean o0(L1.p pVar) {
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        return !w10.k(sVar.d()) && pVar.w().k(sVar.g());
    }

    private final boolean q0(L1.p pVar) {
        List list = (List) L1.m.a(pVar.w(), s.f9010a.d());
        boolean z10 = ((list != null ? (String) C16877v.y0(list) : null) == null && h0(pVar) == null && g0(pVar) == null && !f0(pVar)) ? false : true;
        if (C5107h1.g(pVar)) {
            if (pVar.w().A()) {
                return true;
            }
            if (pVar.A() && z10) {
                return true;
            }
        }
        return false;
    }

    private final boolean r0() {
        return this.f19617h || (this.f19616g.isEnabled() && this.f19616g.isTouchExplorationEnabled());
    }

    /* access modifiers changed from: private */
    public final void s0(G g10) {
        if (this.f19633x.add(g10)) {
            this.f19634y.k(C16807N.f139792a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r4v30, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v0(int r18, int r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r7 = r17
            r1 = r18
            r0 = r19
            r2 = r20
            j0.o r3 = r17.a0()
            java.lang.Object r3 = r3.c(r1)
            androidx.compose.ui.platform.g1 r3 = (androidx.compose.ui.platform.C5104g1) r3
            r8 = 0
            if (r3 == 0) goto L_0x001b
            L1.p r3 = r3.b()
            if (r3 != 0) goto L_0x001e
        L_0x001b:
            r0 = r8
            goto L_0x06f8
        L_0x001e:
            r4 = 64
            if (r0 == r4) goto L_0x06f4
            r4 = 128(0x80, float:1.794E-43)
            if (r0 == r4) goto L_0x06ef
            r4 = 256(0x100, float:3.59E-43)
            r5 = 1
            if (r0 == r4) goto L_0x06d5
            r6 = 512(0x200, float:7.175E-43)
            if (r0 == r6) goto L_0x06d5
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 == r4) goto L_0x06ae
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r0 == r4) goto L_0x0680
            boolean r4 = androidx.compose.ui.platform.C5142y.h(r3)
            if (r4 != 0) goto L_0x003e
            return r8
        L_0x003e:
            if (r0 == r5) goto L_0x0659
            r4 = 2
            if (r0 == r4) goto L_0x062f
            r4 = 0
            switch(r0) {
                case 16: goto L_0x05f7;
                case 32: goto L_0x05d0;
                case 4096: goto L_0x0377;
                case 8192: goto L_0x0377;
                case 32768: goto L_0x0352;
                case 65536: goto L_0x032d;
                case 262144: goto L_0x0308;
                case 524288: goto L_0x02e3;
                case 1048576: goto L_0x02be;
                case 2097152: goto L_0x0282;
                case 16908342: goto L_0x018e;
                case 16908349: goto L_0x0156;
                case 16908372: goto L_0x0131;
                default: goto L_0x0047;
            }
        L_0x0047:
            switch(r0) {
                case 16908344: goto L_0x0377;
                case 16908345: goto L_0x0377;
                case 16908346: goto L_0x0377;
                case 16908347: goto L_0x0377;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r0) {
                case 16908358: goto L_0x010c;
                case 16908359: goto L_0x00e7;
                case 16908360: goto L_0x00c2;
                case 16908361: goto L_0x009d;
                default: goto L_0x004d;
            }
        L_0x004d:
            j0.c0<j0.c0<java.lang.CharSequence>> r2 = r7.f19629t
            java.lang.Object r1 = r2.e(r1)
            j0.c0 r1 = (j0.c0) r1
            if (r1 == 0) goto L_0x009c
            java.lang.Object r0 = r1.e(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L_0x0060
            goto L_0x009c
        L_0x0060:
            L1.l r1 = r3.w()
            L1.k r2 = L1.k.f8953a
            L1.w r2 = r2.d()
            java.lang.Object r1 = L1.m.a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0073
            return r8
        L_0x0073:
            int r2 = r1.size()
            r3 = r8
        L_0x0078:
            if (r3 >= r2) goto L_0x009c
            java.lang.Object r4 = r1.get(r3)
            L1.e r4 = (L1.e) r4
            java.lang.String r5 = r4.b()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r0)
            if (r5 == 0) goto L_0x0099
            nI.a r0 = r4.a()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x0078
        L_0x009c:
            return r8
        L_0x009d:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.p()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x00c1
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00c1:
            return r8
        L_0x00c2:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.o()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x00e6
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x00e6:
            return r8
        L_0x00e7:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.n()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x010b
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x010b:
            return r8
        L_0x010c:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.q()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x0130
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0130:
            return r8
        L_0x0131:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.l()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x0155
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0155:
            return r8
        L_0x0156:
            if (r2 == 0) goto L_0x018d
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto L_0x0161
            goto L_0x018d
        L_0x0161:
            L1.l r1 = r3.w()
            L1.k r3 = L1.k.f8953a
            L1.w r3 = r3.w()
            java.lang.Object r1 = L1.m.a(r1, r3)
            L1.a r1 = (L1.a) r1
            if (r1 == 0) goto L_0x018d
            XH.i r1 = r1.a()
            nI.l r1 = (nI.C17642l) r1
            if (r1 == 0) goto L_0x018d
            float r0 = r2.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x018d:
            return r8
        L_0x018e:
            L1.p r0 = r3.r()
            if (r0 == 0) goto L_0x01a7
            L1.l r1 = r0.w()
            if (r1 == 0) goto L_0x01a7
            L1.k r2 = L1.k.f8953a
            L1.w r2 = r2.t()
            java.lang.Object r1 = L1.m.a(r1, r2)
            L1.a r1 = (L1.a) r1
            goto L_0x01a8
        L_0x01a7:
            r1 = r4
        L_0x01a8:
            if (r0 == 0) goto L_0x01c6
            if (r1 == 0) goto L_0x01ad
            goto L_0x01c6
        L_0x01ad:
            L1.p r0 = r0.r()
            if (r0 == 0) goto L_0x01a7
            L1.l r1 = r0.w()
            if (r1 == 0) goto L_0x01a7
            L1.k r2 = L1.k.f8953a
            L1.w r2 = r2.t()
            java.lang.Object r1 = L1.m.a(r1, r2)
            L1.a r1 = (L1.a) r1
            goto L_0x01a8
        L_0x01c6:
            if (r0 != 0) goto L_0x01c9
            return r8
        L_0x01c9:
            E1.z r2 = r0.p()
            E1.v r2 = r2.s()
            o1.i r2 = E1.C4489w.a(r2)
            E1.z r4 = r0.p()
            E1.v r4 = r4.s()
            E1.v r4 = r4.k0()
            if (r4 == 0) goto L_0x01e8
            long r9 = E1.C4489w.f(r4)
            goto L_0x01ee
        L_0x01e8:
            o1.g$a r4 = o1.C5667g.f26701b
            long r9 = r4.c()
        L_0x01ee:
            o1.i r2 = r2.A(r9)
            long r9 = r3.s()
            long r11 = r3.u()
            long r11 = c2.s.d(r11)
            o1.i r4 = o1.C5670j.c(r9, r11)
            L1.l r6 = r0.w()
            L1.s r9 = L1.s.f9010a
            L1.w r10 = r9.k()
            java.lang.Object r6 = L1.m.a(r6, r10)
            L1.j r6 = (L1.j) r6
            L1.l r0 = r0.w()
            L1.w r9 = r9.I()
            java.lang.Object r0 = L1.m.a(r0, r9)
            L1.j r0 = (L1.j) r0
            float r9 = r4.o()
            float r10 = r2.o()
            float r9 = r9 - r10
            float r10 = r4.p()
            float r11 = r2.p()
            float r10 = r10 - r11
            float r9 = x0(r9, r10)
            if (r6 == 0) goto L_0x023f
            boolean r6 = r6.b()
            if (r6 != r5) goto L_0x023f
            float r9 = -r9
        L_0x023f:
            boolean r3 = androidx.compose.ui.platform.C5142y.k(r3)
            if (r3 == 0) goto L_0x0246
            float r9 = -r9
        L_0x0246:
            float r3 = r4.r()
            float r6 = r2.r()
            float r3 = r3 - r6
            float r4 = r4.j()
            float r2 = r2.j()
            float r4 = r4 - r2
            float r2 = x0(r3, r4)
            if (r0 == 0) goto L_0x0265
            boolean r0 = r0.b()
            if (r0 != r5) goto L_0x0265
            float r2 = -r2
        L_0x0265:
            if (r1 == 0) goto L_0x0281
            XH.i r0 = r1.a()
            nI.p r0 = (nI.p) r0
            if (r0 == 0) goto L_0x0281
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0281:
            return r8
        L_0x0282:
            if (r2 == 0) goto L_0x028a
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r4 = r2.getString(r0)
        L_0x028a:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.y()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x02bd
            XH.i r0 = r0.a()
            nI.l r0 = (nI.C17642l) r0
            if (r0 == 0) goto L_0x02bd
            N1.d r1 = new N1.d
            if (r4 != 0) goto L_0x02aa
            java.lang.String r4 = ""
        L_0x02aa:
            r10 = r4
            r13 = 6
            r14 = 0
            r11 = 0
            r12 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02bd:
            return r8
        L_0x02be:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.f()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x02e2
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x02e2
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x02e2:
            return r8
        L_0x02e3:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.b()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x0307
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0307
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0307:
            return r8
        L_0x0308:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.g()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x032c
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x032c
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x032c:
            return r8
        L_0x032d:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.e()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x0351
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0351
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0351:
            return r8
        L_0x0352:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.r()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x0376
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0376
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0376:
            return r8
        L_0x0377:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L_0x037d
            r1 = r5
            goto L_0x037e
        L_0x037d:
            r1 = r8
        L_0x037e:
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r0 != r2) goto L_0x0384
            r2 = r5
            goto L_0x0385
        L_0x0384:
            r2 = r8
        L_0x0385:
            r4 = 16908345(0x1020039, float:2.387739E-38)
            if (r0 != r4) goto L_0x038c
            r4 = r5
            goto L_0x038d
        L_0x038c:
            r4 = r8
        L_0x038d:
            r6 = 16908347(0x102003b, float:2.3877394E-38)
            if (r0 != r6) goto L_0x0394
            r6 = r5
            goto L_0x0395
        L_0x0394:
            r6 = r8
        L_0x0395:
            r9 = 16908344(0x1020038, float:2.3877386E-38)
            if (r0 != r9) goto L_0x039c
            r9 = r5
            goto L_0x039d
        L_0x039c:
            r9 = r8
        L_0x039d:
            r10 = 16908346(0x102003a, float:2.3877392E-38)
            if (r0 != r10) goto L_0x03a4
            r0 = r5
            goto L_0x03a5
        L_0x03a4:
            r0 = r8
        L_0x03a5:
            if (r4 != 0) goto L_0x03b0
            if (r6 != 0) goto L_0x03b0
            if (r1 != 0) goto L_0x03b0
            if (r2 == 0) goto L_0x03ae
            goto L_0x03b0
        L_0x03ae:
            r10 = r8
            goto L_0x03b1
        L_0x03b0:
            r10 = r5
        L_0x03b1:
            if (r9 != 0) goto L_0x03bc
            if (r0 != 0) goto L_0x03bc
            if (r1 != 0) goto L_0x03bc
            if (r2 == 0) goto L_0x03ba
            goto L_0x03bc
        L_0x03ba:
            r0 = r8
            goto L_0x03bd
        L_0x03bc:
            r0 = r5
        L_0x03bd:
            if (r1 != 0) goto L_0x03c1
            if (r2 == 0) goto L_0x0457
        L_0x03c1:
            L1.l r1 = r3.w()
            L1.s r11 = L1.s.f9010a
            L1.w r11 = r11.x()
            java.lang.Object r1 = L1.m.a(r1, r11)
            L1.h r1 = (L1.h) r1
            L1.l r11 = r3.w()
            L1.k r12 = L1.k.f8953a
            L1.w r12 = r12.w()
            java.lang.Object r11 = L1.m.a(r11, r12)
            L1.a r11 = (L1.a) r11
            if (r1 == 0) goto L_0x0457
            if (r11 == 0) goto L_0x0457
            tI.f r0 = r1.c()
            java.lang.Comparable r0 = r0.m()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            tI.f r3 = r1.c()
            java.lang.Comparable r3 = r3.i()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r0 = tI.C17978n.d(r0, r3)
            tI.f r3 = r1.c()
            java.lang.Comparable r3 = r3.i()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            tI.f r4 = r1.c()
            java.lang.Comparable r4 = r4.m()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r3 = tI.C17978n.h(r3, r4)
            int r4 = r1.d()
            if (r4 <= 0) goto L_0x0434
            float r0 = r0 - r3
            int r3 = r1.d()
            int r3 = r3 + r5
        L_0x0431:
            float r3 = (float) r3
            float r0 = r0 / r3
            goto L_0x0438
        L_0x0434:
            float r0 = r0 - r3
            r3 = 20
            goto L_0x0431
        L_0x0438:
            if (r2 == 0) goto L_0x043b
            float r0 = -r0
        L_0x043b:
            XH.i r2 = r11.a()
            nI.l r2 = (nI.C17642l) r2
            if (r2 == 0) goto L_0x0456
            float r1 = r1.b()
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x0456:
            return r8
        L_0x0457:
            E1.z r1 = r3.p()
            E1.v r1 = r1.s()
            o1.i r1 = E1.C4489w.a(r1)
            long r11 = r1.q()
            L1.l r1 = r3.w()
            java.lang.Float r1 = androidx.compose.ui.platform.C5107h1.d(r1)
            L1.l r5 = r3.w()
            L1.k r13 = L1.k.f8953a
            L1.w r14 = r13.t()
            java.lang.Object r5 = L1.m.a(r5, r14)
            L1.a r5 = (L1.a) r5
            if (r5 != 0) goto L_0x0482
            return r8
        L_0x0482:
            L1.l r14 = r3.w()
            L1.s r15 = L1.s.f9010a
            L1.w r8 = r15.k()
            java.lang.Object r8 = L1.m.a(r14, r8)
            L1.j r8 = (L1.j) r8
            r14 = 0
            if (r8 == 0) goto L_0x052f
            if (r10 == 0) goto L_0x052f
            if (r1 == 0) goto L_0x049e
            float r10 = r1.floatValue()
            goto L_0x04a2
        L_0x049e:
            float r10 = o1.C5673m.l(r11)
        L_0x04a2:
            if (r4 != 0) goto L_0x04a6
            if (r2 == 0) goto L_0x04a7
        L_0x04a6:
            float r10 = -r10
        L_0x04a7:
            boolean r16 = r8.b()
            if (r16 == 0) goto L_0x04ae
            float r10 = -r10
        L_0x04ae:
            boolean r16 = androidx.compose.ui.platform.C5142y.k(r3)
            if (r16 == 0) goto L_0x04b9
            if (r4 != 0) goto L_0x04b8
            if (r6 == 0) goto L_0x04b9
        L_0x04b8:
            float r10 = -r10
        L_0x04b9:
            boolean r4 = w0(r8, r10)
            if (r4 == 0) goto L_0x052f
            L1.l r0 = r3.w()
            L1.w r1 = r13.o()
            boolean r0 = r0.k(r1)
            if (r0 != 0) goto L_0x04f9
            L1.l r0 = r3.w()
            L1.w r1 = r13.p()
            boolean r0 = r0.k(r1)
            if (r0 == 0) goto L_0x04dc
            goto L_0x04f9
        L_0x04dc:
            XH.i r0 = r5.a()
            nI.p r0 = (nI.p) r0
            if (r0 == 0) goto L_0x04f7
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x052e
        L_0x04f7:
            r8 = 0
            goto L_0x052e
        L_0x04f9:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x050c
            L1.l r0 = r3.w()
            L1.w r1 = r13.p()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            goto L_0x051a
        L_0x050c:
            L1.l r0 = r3.w()
            L1.w r1 = r13.o()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
        L_0x051a:
            if (r0 == 0) goto L_0x04f7
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x04f7
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x052e:
            return r8
        L_0x052f:
            L1.l r4 = r3.w()
            L1.w r6 = r15.I()
            java.lang.Object r4 = L1.m.a(r4, r6)
            L1.j r4 = (L1.j) r4
            if (r4 == 0) goto L_0x05ce
            if (r0 == 0) goto L_0x05ce
            if (r1 == 0) goto L_0x0548
            float r0 = r1.floatValue()
            goto L_0x054c
        L_0x0548:
            float r0 = o1.C5673m.i(r11)
        L_0x054c:
            if (r9 != 0) goto L_0x0550
            if (r2 == 0) goto L_0x0551
        L_0x0550:
            float r0 = -r0
        L_0x0551:
            boolean r1 = r4.b()
            if (r1 == 0) goto L_0x0558
            float r0 = -r0
        L_0x0558:
            boolean r1 = w0(r4, r0)
            if (r1 == 0) goto L_0x05ce
            L1.l r1 = r3.w()
            L1.w r2 = r13.q()
            boolean r1 = r1.k(r2)
            if (r1 != 0) goto L_0x0598
            L1.l r1 = r3.w()
            L1.w r2 = r13.n()
            boolean r1 = r1.k(r2)
            if (r1 == 0) goto L_0x057b
            goto L_0x0598
        L_0x057b:
            XH.i r1 = r5.a()
            nI.p r1 = (nI.p) r1
            if (r1 == 0) goto L_0x0596
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x05cd
        L_0x0596:
            r8 = 0
            goto L_0x05cd
        L_0x0598:
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x05ab
            L1.l r0 = r3.w()
            L1.w r1 = r13.n()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            goto L_0x05b9
        L_0x05ab:
            L1.l r0 = r3.w()
            L1.w r1 = r13.q()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
        L_0x05b9:
            if (r0 == 0) goto L_0x0596
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0596
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
        L_0x05cd:
            return r8
        L_0x05ce:
            r0 = 0
            return r0
        L_0x05d0:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.m()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x05f5
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x05f5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x05f6
        L_0x05f5:
            r8 = 0
        L_0x05f6:
            return r8
        L_0x05f7:
            L1.l r0 = r3.w()
            L1.k r2 = L1.k.f8953a
            L1.w r2 = r2.k()
            java.lang.Object r0 = L1.m.a(r0, r2)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x0618
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x0618
            java.lang.Object r0 = r0.invoke()
            r4 = r0
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L_0x0618:
            r8 = r4
            r5 = 12
            r6 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r0 = r17
            r1 = r18
            J0(r0, r1, r2, r3, r4, r5, r6)
            if (r8 == 0) goto L_0x062d
            boolean r8 = r8.booleanValue()
            goto L_0x062e
        L_0x062d:
            r8 = 0
        L_0x062e:
            return r8
        L_0x062f:
            L1.l r0 = r3.w()
            L1.s r1 = L1.s.f9010a
            L1.w r1 = r1.i()
            java.lang.Object r0 = L1.m.a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x0657
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f19613d
            n1.i r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.d$a r1 = androidx.compose.ui.focus.d.f18832b
            int r1 = r1.c()
            r2 = 0
            r0.j(r2, r5, r5, r1)
            r8 = r5
            goto L_0x0658
        L_0x0657:
            r8 = 0
        L_0x0658:
            return r8
        L_0x0659:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.s()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x067e
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x067e
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x067f
        L_0x067e:
            r8 = 0
        L_0x067f:
            return r8
        L_0x0680:
            r0 = -1
            if (r2 == 0) goto L_0x068a
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r1 = r2.getInt(r1, r0)
            goto L_0x068b
        L_0x068a:
            r1 = r0
        L_0x068b:
            if (r2 == 0) goto L_0x0693
            java.lang.String r4 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r0 = r2.getInt(r4, r0)
        L_0x0693:
            r2 = 0
            boolean r8 = r7.P0(r3, r1, r0, r2)
            if (r8 == 0) goto L_0x06ad
            int r0 = r3.o()
            int r1 = r7.F0(r0)
            r5 = 12
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r17
            J0(r0, r1, r2, r3, r4, r5, r6)
        L_0x06ad:
            return r8
        L_0x06ae:
            L1.l r0 = r3.w()
            L1.k r1 = L1.k.f8953a
            L1.w r1 = r1.c()
            java.lang.Object r0 = L1.m.a(r0, r1)
            L1.a r0 = (L1.a) r0
            if (r0 == 0) goto L_0x06d3
            XH.i r0 = r0.a()
            nI.a r0 = (nI.C17631a) r0
            if (r0 == 0) goto L_0x06d3
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            goto L_0x06d4
        L_0x06d3:
            r8 = 0
        L_0x06d4:
            return r8
        L_0x06d5:
            if (r2 == 0) goto L_0x06ed
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r1 = r2.getInt(r1)
            java.lang.String r6 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r2 = r2.getBoolean(r6)
            if (r0 != r4) goto L_0x06e7
            r8 = r5
            goto L_0x06e8
        L_0x06e7:
            r8 = 0
        L_0x06e8:
            boolean r0 = r7.d1(r3, r1, r8, r2)
            return r0
        L_0x06ed:
            r0 = 0
            return r0
        L_0x06ef:
            boolean r0 = r17.Q(r18)
            return r0
        L_0x06f4:
            boolean r0 = r17.C0(r18)
        L_0x06f8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5136v.v0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean w0(L1.j jVar, float f10) {
        return (f10 < 0.0f && jVar.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue());
    }

    private static final float x0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    private final void y0(int i10, t tVar, L1.p pVar) {
        View h10;
        boolean z10;
        boolean z11;
        int i11 = i10;
        t tVar2 = tVar;
        L1.p pVar2 = pVar;
        tVar2.i0("android.view.View");
        L1.l w10 = pVar.w();
        s sVar = s.f9010a;
        if (w10.k(sVar.g())) {
            tVar2.i0("android.widget.EditText");
        }
        if (pVar.w().k(sVar.D())) {
            tVar2.i0("android.widget.TextView");
        }
        L1.i iVar = (L1.i) L1.m.a(pVar.w(), sVar.y());
        if (iVar != null) {
            iVar.n();
            if (pVar.x() || pVar.t().isEmpty()) {
                i.a aVar = L1.i.f8936b;
                if (L1.i.k(iVar.n(), aVar.g())) {
                    tVar2.J0(this.f19613d.getContext().getResources().getString(i1.j.f24383q));
                } else {
                    if (L1.i.k(iVar.n(), aVar.f())) {
                        tVar2.J0(this.f19613d.getContext().getResources().getString(i1.j.f24382p));
                    } else {
                        String i12 = C5107h1.i(iVar.n());
                        if (!L1.i.k(iVar.n(), aVar.d()) || pVar.A() || pVar.w().A()) {
                            tVar2.i0(i12);
                        }
                    }
                }
            }
            C16807N n10 = C16807N.f139792a;
        }
        tVar2.D0(this.f19613d.getContext().getPackageName());
        tVar2.x0(C5107h1.f(pVar));
        List<L1.p> t10 = pVar.t();
        int size = t10.size();
        for (int i13 = 0; i13 < size; i13++) {
            L1.p pVar3 = t10.get(i13);
            if (a0().a(pVar3.o())) {
                AndroidViewHolder androidViewHolder = this.f19613d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pVar3.q());
                if (pVar3.o() != -1) {
                    if (androidViewHolder != null) {
                        tVar2.c(androidViewHolder);
                    } else {
                        tVar2.d(this.f19613d, pVar3.o());
                    }
                }
            }
        }
        if (i11 == this.f19624o) {
            tVar2.b0(true);
            tVar2.b(t.a.f8841l);
        } else {
            tVar2.b0(false);
            tVar2.b(t.a.f8840k);
        }
        U0(pVar2, tVar2);
        Q0(pVar2, tVar2);
        T0(pVar2, tVar2);
        R0(pVar2, tVar2);
        L1.l w11 = pVar.w();
        s sVar2 = s.f9010a;
        M1.a aVar2 = (M1.a) L1.m.a(w11, sVar2.G());
        if (aVar2 != null) {
            if (aVar2 == M1.a.On) {
                tVar2.h0(true);
            } else if (aVar2 == M1.a.Off) {
                tVar2.h0(false);
            }
            C16807N n11 = C16807N.f139792a;
        }
        Boolean bool = (Boolean) L1.m.a(pVar.w(), sVar2.A());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (iVar == null ? false : L1.i.k(iVar.n(), L1.i.f8936b.g())) {
                tVar2.M0(booleanValue);
            } else {
                tVar2.h0(booleanValue);
            }
            C16807N n12 = C16807N.f139792a;
        }
        if (!pVar.w().A() || pVar.t().isEmpty()) {
            List list = (List) L1.m.a(pVar.w(), sVar2.d());
            tVar2.m0(list != null ? (String) C16877v.y0(list) : null);
        }
        String str = (String) L1.m.a(pVar.w(), sVar2.C());
        if (str != null) {
            L1.p pVar4 = pVar2;
            while (true) {
                if (pVar4 == null) {
                    z11 = false;
                    break;
                }
                L1.l w12 = pVar4.w();
                L1.t tVar3 = L1.t.f9047a;
                if (w12.k(tVar3.a())) {
                    z11 = ((Boolean) pVar4.w().q(tVar3.a())).booleanValue();
                    break;
                }
                pVar4 = pVar4.r();
            }
            if (z11) {
                tVar2.X0(str);
            }
        }
        L1.l w13 = pVar.w();
        s sVar3 = s.f9010a;
        if (((C16807N) L1.m.a(w13, sVar3.j())) != null) {
            tVar2.v0(true);
            C16807N n13 = C16807N.f139792a;
        }
        tVar2.H0(pVar.w().k(sVar3.w()));
        tVar2.p0(pVar.w().k(sVar3.p()));
        Integer num = (Integer) L1.m.a(pVar.w(), sVar3.u());
        tVar2.B0(num != null ? num.intValue() : -1);
        tVar2.q0(C5142y.h(pVar));
        tVar2.s0(pVar.w().k(sVar3.i()));
        int i14 = 2;
        if (tVar.K()) {
            tVar2.t0(((Boolean) pVar.w().q(sVar3.i())).booleanValue());
            if (tVar.L()) {
                tVar2.a(2);
            } else {
                tVar2.a(1);
            }
        }
        tVar2.Y0(C5107h1.g(pVar));
        L1.g gVar = (L1.g) L1.m.a(pVar.w(), sVar3.t());
        if (gVar != null) {
            int i15 = gVar.i();
            g.a aVar3 = L1.g.f8927b;
            if (L1.g.f(i15, aVar3.b()) || !L1.g.f(i15, aVar3.a())) {
                i14 = 1;
            }
            tVar2.z0(i14);
            C16807N n14 = C16807N.f139792a;
        }
        tVar2.j0(false);
        L1.l w14 = pVar.w();
        L1.k kVar = L1.k.f8953a;
        L1.a aVar4 = (L1.a) L1.m.a(w14, kVar.k());
        if (aVar4 != null) {
            boolean e10 = C17542s.e(L1.m.a(pVar.w(), sVar3.A()), Boolean.TRUE);
            i.a aVar5 = L1.i.f8936b;
            if (!(iVar == null ? false : L1.i.k(iVar.n(), aVar5.g()))) {
                if (!(iVar == null ? false : L1.i.k(iVar.n(), aVar5.e()))) {
                    z10 = false;
                    tVar2.j0(z10 || (z10 && !e10));
                    if (C5142y.h(pVar) && tVar.H()) {
                        tVar2.b(new t.a(16, aVar4.b()));
                    }
                    C16807N n15 = C16807N.f139792a;
                }
            }
            z10 = true;
            tVar2.j0(z10 || (z10 && !e10));
            tVar2.b(new t.a(16, aVar4.b()));
            C16807N n152 = C16807N.f139792a;
        }
        tVar2.A0(false);
        L1.a aVar6 = (L1.a) L1.m.a(pVar.w(), kVar.m());
        if (aVar6 != null) {
            tVar2.A0(true);
            if (C5142y.h(pVar)) {
                tVar2.b(new t.a(32, aVar6.b()));
            }
            C16807N n16 = C16807N.f139792a;
        }
        L1.a aVar7 = (L1.a) L1.m.a(pVar.w(), kVar.c());
        if (aVar7 != null) {
            tVar2.b(new t.a(16384, aVar7.b()));
            C16807N n17 = C16807N.f139792a;
        }
        if (C5142y.h(pVar)) {
            L1.a aVar8 = (L1.a) L1.m.a(pVar.w(), kVar.y());
            if (aVar8 != null) {
                tVar2.b(new t.a(UploadKt.MAX_CHUNK_SIZE, aVar8.b()));
                C16807N n18 = C16807N.f139792a;
            }
            L1.a aVar9 = (L1.a) L1.m.a(pVar.w(), kVar.l());
            if (aVar9 != null) {
                tVar2.b(new t.a(16908372, aVar9.b()));
                C16807N n19 = C16807N.f139792a;
            }
            L1.a aVar10 = (L1.a) L1.m.a(pVar.w(), kVar.e());
            if (aVar10 != null) {
                tVar2.b(new t.a(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, aVar10.b()));
                C16807N n20 = C16807N.f139792a;
            }
            L1.a aVar11 = (L1.a) L1.m.a(pVar.w(), kVar.r());
            if (aVar11 != null) {
                if (tVar.L() && this.f19613d.getClipboardManager().c()) {
                    tVar2.b(new t.a(32768, aVar11.b()));
                }
                C16807N n21 = C16807N.f139792a;
            }
        }
        String i02 = i0(pVar2);
        if (!(i02 == null || i02.length() == 0)) {
            tVar2.S0(Z(pVar2), Y(pVar2));
            L1.a aVar12 = (L1.a) L1.m.a(pVar.w(), kVar.x());
            tVar2.b(new t.a(131072, aVar12 != null ? aVar12.b() : null));
            tVar2.a(256);
            tVar2.a(512);
            tVar2.C0(11);
            Collection collection = (List) L1.m.a(pVar.w(), sVar3.d());
            if ((collection == null || collection.isEmpty()) && pVar.w().k(kVar.i()) && !C5142y.i(pVar)) {
                tVar2.C0(tVar.v() | 20);
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence y10 = tVar.y();
        if (!(y10 == null || y10.length() == 0) && pVar.w().k(kVar.i())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (pVar.w().k(sVar3.C())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        tVar2.c0(arrayList);
        L1.h hVar = (L1.h) L1.m.a(pVar.w(), sVar3.x());
        if (hVar != null) {
            if (pVar.w().k(kVar.w())) {
                tVar2.i0("android.widget.SeekBar");
            } else {
                tVar2.i0("android.widget.ProgressBar");
            }
            if (hVar != L1.h.f8931d.a()) {
                tVar2.I0(t.g.a(1, hVar.c().i().floatValue(), hVar.c().m().floatValue(), hVar.b()));
            }
            if (pVar.w().k(kVar.w()) && C5142y.h(pVar)) {
                if (hVar.b() < C17978n.d(hVar.c().m().floatValue(), hVar.c().i().floatValue())) {
                    tVar2.b(t.a.f8846q);
                }
                if (hVar.b() > C17978n.h(hVar.c().i().floatValue(), hVar.c().m().floatValue())) {
                    tVar2.b(t.a.f8847r);
                }
            }
        }
        b.a(tVar, pVar);
        H1.a.d(pVar2, tVar2);
        H1.a.e(pVar2, tVar2);
        L1.j jVar = (L1.j) L1.m.a(pVar.w(), sVar3.k());
        L1.a aVar13 = (L1.a) L1.m.a(pVar.w(), kVar.t());
        if (!(jVar == null || aVar13 == null)) {
            if (!H1.a.b(pVar)) {
                tVar2.i0("android.widget.HorizontalScrollView");
            }
            if (jVar.a().invoke().floatValue() > 0.0f) {
                tVar2.L0(true);
            }
            if (C5142y.h(pVar)) {
                if (A0(jVar)) {
                    tVar2.b(t.a.f8846q);
                    tVar2.b(!C5142y.k(pVar) ? t.a.f8817F : t.a.f8815D);
                }
                if (z0(jVar)) {
                    tVar2.b(t.a.f8847r);
                    tVar2.b(!C5142y.k(pVar) ? t.a.f8815D : t.a.f8817F);
                }
            }
        }
        L1.j jVar2 = (L1.j) L1.m.a(pVar.w(), sVar3.I());
        if (!(jVar2 == null || aVar13 == null)) {
            if (!H1.a.b(pVar)) {
                tVar2.i0("android.widget.ScrollView");
            }
            if (jVar2.a().invoke().floatValue() > 0.0f) {
                tVar2.L0(true);
            }
            if (C5142y.h(pVar)) {
                if (A0(jVar2)) {
                    tVar2.b(t.a.f8846q);
                    tVar2.b(t.a.f8816E);
                }
                if (z0(jVar2)) {
                    tVar2.b(t.a.f8847r);
                    tVar2.b(t.a.f8814C);
                }
            }
        }
        if (i16 >= 29) {
            c.a(tVar, pVar);
        }
        tVar2.E0((CharSequence) L1.m.a(pVar.w(), sVar3.v()));
        if (C5142y.h(pVar)) {
            L1.a aVar14 = (L1.a) L1.m.a(pVar.w(), kVar.g());
            if (aVar14 != null) {
                tVar2.b(new t.a(262144, aVar14.b()));
                C16807N n22 = C16807N.f139792a;
            }
            L1.a aVar15 = (L1.a) L1.m.a(pVar.w(), kVar.b());
            if (aVar15 != null) {
                tVar2.b(new t.a(ImageMetadata.LENS_APERTURE, aVar15.b()));
                C16807N n23 = C16807N.f139792a;
            }
            L1.a aVar16 = (L1.a) L1.m.a(pVar.w(), kVar.f());
            if (aVar16 != null) {
                tVar2.b(new t.a(ImageMetadata.SHADING_MODE, aVar16.b()));
                C16807N n24 = C16807N.f139792a;
            }
            if (pVar.w().k(kVar.d())) {
                List list2 = (List) pVar.w().q(kVar.d());
                int size2 = list2.size();
                C5457m mVar = f19598Q;
                if (size2 < mVar.b()) {
                    c0 c0Var = new c0(0, 1, (DefaultConstructorMarker) null);
                    K b10 = S.b();
                    if (this.f19630u.d(i11)) {
                        K e11 = this.f19630u.e(i11);
                        D d10 = new D(0, 1, (DefaultConstructorMarker) null);
                        int[] iArr = mVar.f24630a;
                        int i17 = mVar.f24631b;
                        for (int i18 = 0; i18 < i17; i18++) {
                            d10.i(iArr[i18]);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list2.size();
                        for (int i19 = 0; i19 < size3; i19++) {
                            L1.e eVar = (L1.e) list2.get(i19);
                            C17542s.g(e11);
                            if (e11.a(eVar.b())) {
                                int c10 = e11.c(eVar.b());
                                c0Var.l(c10, eVar.b());
                                b10.s(eVar.b(), c10);
                                d10.m(c10);
                                tVar2.b(new t.a(c10, eVar.b()));
                            } else {
                                arrayList2.add(eVar);
                            }
                        }
                        int size4 = arrayList2.size();
                        for (int i20 = 0; i20 < size4; i20++) {
                            L1.e eVar2 = (L1.e) arrayList2.get(i20);
                            int a10 = d10.a(i20);
                            c0Var.l(a10, eVar2.b());
                            b10.s(eVar2.b(), a10);
                            tVar2.b(new t.a(a10, eVar2.b()));
                        }
                    } else {
                        int size5 = list2.size();
                        for (int i21 = 0; i21 < size5; i21++) {
                            L1.e eVar3 = (L1.e) list2.get(i21);
                            int a11 = f19598Q.a(i21);
                            c0Var.l(a11, eVar3.b());
                            b10.s(eVar3.b(), a11);
                            tVar2.b(new t.a(a11, eVar3.b()));
                        }
                    }
                    this.f19629t.l(i11, c0Var);
                    this.f19630u.l(i11, b10);
                } else {
                    throw new IllegalStateException("Can't have more than " + mVar.b() + " custom actions for one widget");
                }
            }
        }
        tVar2.K0(q0(pVar2));
        int e12 = this.f19602D.e(i11, -1);
        if (e12 != -1) {
            View h11 = C5107h1.h(this.f19613d.getAndroidViewsHandler$ui_release(), e12);
            if (h11 != null) {
                tVar2.V0(h11);
            } else {
                tVar2.W0(this.f19613d, e12);
            }
            K(i11, tVar2, this.f19604F, (Bundle) null);
        }
        int e13 = this.f19603E.e(i11, -1);
        if (e13 != -1 && (h10 = C5107h1.h(this.f19613d.getAndroidViewsHandler$ui_release(), e13)) != null) {
            tVar2.T0(h10);
            K(i11, tVar2, this.f19605G, (Bundle) null);
        }
    }

    private static final boolean z0(L1.j jVar) {
        return (jVar.c().invoke().floatValue() > 0.0f && !jVar.b()) || (jVar.c().invoke().floatValue() < jVar.a().invoke().floatValue() && jVar.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(dI.C17164e<? super XH.C16807N> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.platform.C5136v.k
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.ui.platform.v$k r0 = (androidx.compose.ui.platform.C5136v.k) r0
            int r1 = r0.f19655h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19655h = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.v$k r0 = new androidx.compose.ui.platform.v$k
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f19653f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f19655h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r2 = r0.f19652e
            SJ.l r2 = (SJ.C16436l) r2
            java.lang.Object r6 = r0.f19651d
            j0.F r6 = (j0.F) r6
            java.lang.Object r7 = r0.f19650c
            androidx.compose.ui.platform.v r7 = (androidx.compose.ui.platform.C5136v) r7
            XH.y.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x00d2
        L_0x003a:
            r12 = move-exception
            goto L_0x00de
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0045:
            java.lang.Object r2 = r0.f19652e
            SJ.l r2 = (SJ.C16436l) r2
            java.lang.Object r6 = r0.f19651d
            j0.F r6 = (j0.F) r6
            java.lang.Object r7 = r0.f19650c
            androidx.compose.ui.platform.v r7 = (androidx.compose.ui.platform.C5136v) r7
            XH.y.b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x0077
        L_0x0055:
            XH.y.b(r12)
            j0.F r12 = new j0.F     // Catch:{ all -> 0x00dc }
            r2 = 0
            r12.<init>(r3, r5, r2)     // Catch:{ all -> 0x00dc }
            SJ.j<XH.N> r2 = r11.f19634y     // Catch:{ all -> 0x00dc }
            SJ.l r2 = r2.iterator()     // Catch:{ all -> 0x00dc }
            r7 = r11
        L_0x0065:
            r0.f19650c = r7     // Catch:{ all -> 0x003a }
            r0.f19651d = r12     // Catch:{ all -> 0x003a }
            r0.f19652e = r2     // Catch:{ all -> 0x003a }
            r0.f19655h = r5     // Catch:{ all -> 0x003a }
            java.lang.Object r6 = r2.a(r0)     // Catch:{ all -> 0x003a }
            if (r6 != r1) goto L_0x0074
            return r1
        L_0x0074:
            r10 = r6
            r6 = r12
            r12 = r10
        L_0x0077:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x003a }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x00d4
            r2.next()     // Catch:{ all -> 0x003a }
            boolean r12 = r7.p0()     // Catch:{ all -> 0x003a }
            if (r12 == 0) goto L_0x00d2
            j0.b<G1.G> r12 = r7.f19633x     // Catch:{ all -> 0x003a }
            int r12 = r12.size()     // Catch:{ all -> 0x003a }
            r8 = r3
        L_0x008f:
            if (r8 >= r12) goto L_0x00a2
            j0.b<G1.G> r9 = r7.f19633x     // Catch:{ all -> 0x003a }
            java.lang.Object r9 = r9.x(r8)     // Catch:{ all -> 0x003a }
            G1.G r9 = (G1.G) r9     // Catch:{ all -> 0x003a }
            r7.N0(r9, r6)     // Catch:{ all -> 0x003a }
            r7.O0(r9)     // Catch:{ all -> 0x003a }
            int r8 = r8 + 1
            goto L_0x008f
        L_0x00a2:
            r6.h()     // Catch:{ all -> 0x003a }
            boolean r12 = r7.f19609K     // Catch:{ all -> 0x003a }
            if (r12 != 0) goto L_0x00b2
            r7.f19609K = r5     // Catch:{ all -> 0x003a }
            android.os.Handler r12 = r7.f19622m     // Catch:{ all -> 0x003a }
            java.lang.Runnable r8 = r7.f19610L     // Catch:{ all -> 0x003a }
            r12.post(r8)     // Catch:{ all -> 0x003a }
        L_0x00b2:
            j0.b<G1.G> r12 = r7.f19633x     // Catch:{ all -> 0x003a }
            r12.clear()     // Catch:{ all -> 0x003a }
            j0.E<L1.j> r12 = r7.f19627r     // Catch:{ all -> 0x003a }
            r12.i()     // Catch:{ all -> 0x003a }
            j0.E<L1.j> r12 = r7.f19628s     // Catch:{ all -> 0x003a }
            r12.i()     // Catch:{ all -> 0x003a }
            long r8 = r7.f19618i     // Catch:{ all -> 0x003a }
            r0.f19650c = r7     // Catch:{ all -> 0x003a }
            r0.f19651d = r6     // Catch:{ all -> 0x003a }
            r0.f19652e = r2     // Catch:{ all -> 0x003a }
            r0.f19655h = r4     // Catch:{ all -> 0x003a }
            java.lang.Object r12 = QJ.C16297b0.b(r8, r0)     // Catch:{ all -> 0x003a }
            if (r12 != r1) goto L_0x00d2
            return r1
        L_0x00d2:
            r12 = r6
            goto L_0x0065
        L_0x00d4:
            j0.b<G1.G> r12 = r7.f19633x
            r12.clear()
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x00dc:
            r12 = move-exception
            r7 = r11
        L_0x00de:
            j0.b<G1.G> r0 = r7.f19633x
            r0.clear()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5136v.M(dI.e):java.lang.Object");
    }

    public final boolean N(boolean z10, int i10, long j10) {
        if (!C17542s.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return O(a0(), z10, i10, j10);
    }

    public final void S0(long j10) {
        this.f19618i = j10;
    }

    public final boolean V(MotionEvent motionEvent) {
        if (!r0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int m02 = m0(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.f19613d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            f1(m02);
            if (m02 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        } else if (action != 10) {
            return false;
        } else {
            if (this.f19614e == Integer.MIN_VALUE) {
                return this.f19613d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            }
            f1(Integer.MIN_VALUE);
            return true;
        }
    }

    public u b(View view) {
        return this.f19623n;
    }

    public final String b0() {
        return this.f19605G;
    }

    public final String c0() {
        return this.f19604F;
    }

    public final C d0() {
        return this.f19603E;
    }

    public final C e0() {
        return this.f19602D;
    }

    public final AndroidComposeView l0() {
        return this.f19613d;
    }

    public final int m0(float f10, float f11) {
        int i10;
        m0.k(this.f19613d, false, 1, (Object) null);
        C4517u uVar = new C4517u();
        G.B0(this.f19613d.getRoot(), C5668h.a(f10, f11), uVar, false, false, 12, (Object) null);
        int p10 = C16877v.p(uVar);
        while (true) {
            i10 = Integer.MIN_VALUE;
            if (-1 >= p10) {
                break;
            }
            G m10 = C4508k.m(uVar.get(p10));
            if (this.f19613d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(m10) != null) {
                return Integer.MIN_VALUE;
            }
            if (m10.m0().r(C4502e0.a(8))) {
                i10 = F0(m10.q());
                if (C5107h1.f(L1.q.a(m10, false))) {
                    break;
                }
            }
            p10--;
        }
        return i10;
    }

    public final boolean p0() {
        return this.f19617h || (this.f19616g.isEnabled() && !this.f19621l.isEmpty());
    }

    public final void t0(G g10) {
        this.f19635z = true;
        if (p0()) {
            s0(g10);
        }
    }

    public final void u0() {
        this.f19635z = true;
        if (p0() && !this.f19609K) {
            this.f19609K = true;
            this.f19622m.post(this.f19610L);
        }
    }
}
