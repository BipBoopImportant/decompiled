package androidx.activity;

import I2.B;
import I2.C4640w;
import I2.C4646z;
import XH.C16807N;
import XH.C16814e;
import XH.C16824o;
import XH.C16825p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.C5147b;
import androidx.core.app.k;
import androidx.core.app.t;
import androidx.core.app.u;
import androidx.core.app.x;
import androidx.lifecycle.A;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.r;
import f.C5296a;
import f.C5297b;
import g.C5313b;
import g.C5314c;
import g.C5316e;
import g.C5317f;
import g.C5318g;
import h.C5403a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l3.a;
import nI.C17631a;
import u2.C6014c;

@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ü\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u000e:\nÝ\u0001Þ\u0001ß\u0001à\u0001á\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u001dH\u0015¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b%\u0010$J\u0019\u0010'\u001a\u00020\u00142\b\b\u0001\u0010&\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010\u0013J\u0019\u0010'\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b'\u0010*J#\u0010'\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b'\u0010-J#\u0010.\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0014H\u0017¢\u0006\u0004\b/\u0010\u0010J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00142\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020\u00142\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106J)\u0010<\u001a\u00020;2\u0006\u00108\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020;2\u0006\u00108\u001a\u00020\u00112\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020;2\u0006\u00108\u001a\u00020\u00112\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00142\u0006\u00108\u001a\u00020\u00112\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010J\u001a\u00020\u0003H\u0016¢\u0006\u0004\bH\u0010KJ'\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020F2\u0006\u0010J\u001a\u00020\u00032\u0006\u0010M\u001a\u00020LH\u0017¢\u0006\u0004\bH\u0010NJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bO\u0010IJ\u000f\u0010P\u001a\u00020\u0014H\u0016¢\u0006\u0004\bP\u0010\u0010J\u000f\u0010Q\u001a\u00020\u0014H\u0017¢\u0006\u0004\bQ\u0010\u0010J\u001f\u0010U\u001a\u00020\u00142\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u0011H\u0017¢\u0006\u0004\bU\u0010VJ)\u0010U\u001a\u00020\u00142\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u00112\b\u0010W\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\bU\u0010XJA\u0010^\u001a\u00020\u00142\u0006\u0010S\u001a\u00020Y2\u0006\u0010T\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010R2\u0006\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u0011H\u0017¢\u0006\u0004\b^\u0010_JK\u0010^\u001a\u00020\u00142\u0006\u0010S\u001a\u00020Y2\u0006\u0010T\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010R2\u0006\u0010[\u001a\u00020\u00112\u0006\u0010\\\u001a\u00020\u00112\u0006\u0010]\u001a\u00020\u00112\b\u0010W\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b^\u0010`J)\u0010c\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u00112\b\u0010b\u001a\u0004\u0018\u00010RH\u0015¢\u0006\u0004\bc\u0010dJ-\u0010j\u001a\u00020\u00142\u0006\u0010T\u001a\u00020\u00112\f\u0010g\u001a\b\u0012\u0004\u0012\u00020f0e2\u0006\u0010i\u001a\u00020hH\u0017¢\u0006\u0004\bj\u0010kJI\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010l\"\u0004\b\u0001\u0010m2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010n2\u0006\u0010q\u001a\u00020p2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00010r¢\u0006\u0004\bu\u0010vJA\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010l\"\u0004\b\u0001\u0010m2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010n2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00010r¢\u0006\u0004\bu\u0010wJ\u0017\u0010z\u001a\u00020\u00142\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0004\bz\u0010{J\u001b\u0010}\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020x0|¢\u0006\u0004\b}\u0010~J\u001b\u0010\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020x0|¢\u0006\u0004\b\u0010~J\u001a\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u0011H\u0017¢\u0006\u0005\b\u0001\u0010\u0013J\u001d\u0010\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110|¢\u0006\u0005\b\u0001\u0010~J\u001d\u0010\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110|¢\u0006\u0005\b\u0001\u0010~J\u001a\u0010\u0001\u001a\u00020\u00142\u0006\u0010S\u001a\u00020RH\u0015¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020R0|¢\u0006\u0005\b\u0001\u0010~J\u001d\u0010\u0001\u001a\u00020\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020R0|¢\u0006\u0005\b\u0001\u0010~J\u001b\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020;H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020;2\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u00010|¢\u0006\u0005\b\u0001\u0010~J\u001e\u0010\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u00010|¢\u0006\u0005\b\u0001\u0010~J\u001b\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020;H\u0017¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020;2\u0006\u0010y\u001a\u00020xH\u0017¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u00010|¢\u0006\u0005\b\u0001\u0010~J\u001e\u0010\u0001\u001a\u00020\u00142\r\u00104\u001a\t\u0012\u0005\u0012\u00030\u00010|¢\u0006\u0005\b\u0001\u0010~J\u0011\u0010\u0001\u001a\u00020\u0014H\u0015¢\u0006\u0005\b\u0001\u0010\u0010J\u0019\u0010\u0001\u001a\u00020\u00142\u0007\u00104\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\u00142\u0007\u00104\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0001\u0010\u0010R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001f\u0010¡\u0001\u001a\u00030 \u00018\u0002X\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u0012\u0005\b£\u0001\u0010\u0010R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0017\u0010§\u0001\u001a\u00020\u001a8\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R!\u0010®\u0001\u001a\u00030©\u00018VX\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010­\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010lR\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001c\u0010²\u0001\u001a\u00020p8\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020x0|0¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R$\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110|0¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¸\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0|0¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010|0¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¸\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010|0¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u00010¶\u00018\u0002X\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¸\u0001R\u0019\u0010¾\u0001\u001a\u00020;8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010À\u0001\u001a\u00020;8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018VX\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010«\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R'\u0010Ê\u0001\u001a\u00020\u00168FX\u0002¢\u0006\u0017\n\u0006\bÆ\u0001\u0010«\u0001\u0012\u0005\bÉ\u0001\u0010\u0010\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0018\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00028WX\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010$R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018VX\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ó\u0001\u001a\u00030¤\u00018VX\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018WX\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0015\u0010Û\u0001\u001a\u00030Ø\u00018F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006â\u0001"}, d2 = {"Landroidx/activity/j;", "Landroidx/core/app/i;", "", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/o;", "LP4/f;", "Landroidx/activity/z;", "Lg/f;", "Lu2/c;", "Lu2/d;", "Landroidx/core/app/t;", "Landroidx/core/app/u;", "LI2/w;", "Landroidx/activity/u;", "<init>", "()V", "", "contentLayoutId", "(I)V", "LXH/N;", "ensureViewModelStore", "Landroidx/activity/w;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/w;)V", "Landroidx/activity/j$e;", "createFullyDrawnExecutor", "()Landroidx/activity/j$e;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lf/b;", "listener", "addOnContextAvailableListener", "(Lf/b;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "LI2/B;", "provider", "addMenuProvider", "(LI2/B;)V", "owner", "(LI2/B;Landroidx/lifecycle/y;)V", "Landroidx/lifecycle/r$b;", "state", "(LI2/B;Landroidx/lifecycle/y;Landroidx/lifecycle/r$b;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lh/a;", "contract", "Lg/e;", "registry", "Lg/b;", "callback", "Lg/c;", "registerForActivityResult", "(Lh/a;Lg/e;Lg/b;)Lg/c;", "(Lh/a;Lg/b;)Lg/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "LH2/a;", "addOnConfigurationChangedListener", "(LH2/a;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/k;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/x;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Lf/a;", "contextAwareHelper", "Lf/a;", "LI2/z;", "menuHostHelper", "LI2/z;", "LP4/e;", "savedStateRegistryController", "LP4/e;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/j0;", "_viewModelStore", "Landroidx/lifecycle/j0;", "reportFullyDrawnExecutor", "Landroidx/activity/j$e;", "Landroidx/activity/t;", "fullyDrawnReporter$delegate", "LXH/o;", "getFullyDrawnReporter", "()Landroidx/activity/t;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lg/e;", "getActivityResultRegistry", "()Lg/e;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/i0$c;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/i0$c;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/w;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/r;", "getLifecycle", "()Landroidx/lifecycle/r;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/j0;", "viewModelStore", "Ll3/a;", "getDefaultViewModelCreationExtras", "()Ll3/a;", "defaultViewModelCreationExtras", "LP4/d;", "getSavedStateRegistry", "()LP4/d;", "savedStateRegistry", "Companion", "b", "c", "d", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class j extends androidx.core.app.i implements C5221y, k0, C5212o, P4.f, z, C5317f, C6014c, u2.d, t, u, C4640w, u {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c((DefaultConstructorMarker) null);
    private j0 _viewModelStore;
    private final C5316e activityResultRegistry;
    private int contentLayoutId;
    private final C5296a contextAwareHelper;
    private final C16824o defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final C16824o fullyDrawnReporter$delegate;
    private final C4646z menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final C16824o onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<H2.a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<H2.a<k>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<H2.a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<H2.a<x>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<H2.a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    /* access modifiers changed from: private */
    public final e reportFullyDrawnExecutor;
    private final P4.e savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/activity/j$a", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f15270a;

        a(j jVar) {
            this.f15270a = jVar;
        }

        public void e(C5221y yVar, r.a aVar) {
            C17542s.j(yVar, "source");
            C17542s.j(aVar, "event");
            this.f15270a.ensureViewModelStore();
            this.f15270a.getLifecycle().g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/j$b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "a", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f15271a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            C17542s.j(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            C17542s.i(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/j$c;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/j$d;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/j0;", "b", "Landroidx/lifecycle/j0;", "()Landroidx/lifecycle/j0;", "d", "(Landroidx/lifecycle/j0;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private Object f15272a;

        /* renamed from: b  reason: collision with root package name */
        private j0 f15273b;

        public final Object a() {
            return this.f15272a;
        }

        public final j0 b() {
            return this.f15273b;
        }

        public final void c(Object obj) {
            this.f15272a = obj;
        }

        public final void d(j0 j0Var) {
            this.f15273b = j0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/j$e;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "LXH/N;", "v", "(Landroid/view/View;)V", "n", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface e extends Executor {
        void n();

        void v(View view);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/activity/j$f;", "Landroidx/activity/j$e;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/j;)V", "Landroid/view/View;", "view", "LXH/N;", "v", "(Landroid/view/View;)V", "n", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "a", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "c", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f15274a = (SystemClock.uptimeMillis() + ((long) 10000));

        /* renamed from: b  reason: collision with root package name */
        private Runnable f15275b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15276c;

        public f() {
        }

        /* access modifiers changed from: private */
        public static final void b(f fVar) {
            Runnable runnable = fVar.f15275b;
            if (runnable != null) {
                C17542s.g(runnable);
                runnable.run();
                fVar.f15275b = null;
            }
        }

        public void execute(Runnable runnable) {
            C17542s.j(runnable, "runnable");
            this.f15275b = runnable;
            View decorView = j.this.getWindow().getDecorView();
            C17542s.i(decorView, "window.decorView");
            if (!this.f15276c) {
                decorView.postOnAnimation(new k(this));
            } else if (C17542s.e(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void n() {
            j.this.getWindow().getDecorView().removeCallbacks(this);
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void onDraw() {
            Runnable runnable = this.f15275b;
            if (runnable != null) {
                runnable.run();
                this.f15275b = null;
                if (j.this.getFullyDrawnReporter().c()) {
                    this.f15276c = false;
                    j.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f15274a) {
                this.f15276c = false;
                j.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void v(View view) {
            C17542s.j(view, "view");
            if (!this.f15276c) {
                this.f15276c = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/j$g", "Lg/e;", "I", "O", "", "requestCode", "Lh/a;", "contract", "input", "Landroidx/core/app/d;", "options", "LXH/N;", "i", "(ILh/a;Ljava/lang/Object;Landroidx/core/app/d;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends C5316e {

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f15278i;

        g(j jVar) {
            this.f15278i = jVar;
        }

        /* access modifiers changed from: private */
        public static final void s(g gVar, int i10, C5403a.C0385a aVar) {
            gVar.f(i10, aVar.a());
        }

        /* access modifiers changed from: private */
        public static final void t(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        public <I, O> void i(int i10, C5403a<I, O> aVar, I i11, androidx.core.app.d dVar) {
            Bundle bundle;
            C17542s.j(aVar, "contract");
            j jVar = this.f15278i;
            C5403a.C0385a<O> synchronousResult = aVar.getSynchronousResult(jVar, i11);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new l(this, i10, synchronousResult));
                return;
            }
            Intent createIntent = aVar.createIntent(jVar, i11);
            if (createIntent.getExtras() != null) {
                Bundle extras = createIntent.getExtras();
                C17542s.g(extras);
                if (extras.getClassLoader() == null) {
                    createIntent.setExtrasClassLoader(jVar.getClassLoader());
                }
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = dVar != null ? dVar.b() : null;
            }
            if (C17542s.e("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C5147b.w(jVar, stringArrayExtra, i10);
            } else if (C17542s.e("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", createIntent.getAction())) {
                C5318g gVar = (C5318g) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C17542s.g(gVar);
                    C5147b.C(jVar, gVar.d(), i10, gVar.a(), gVar.b(), gVar.c(), 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new m(this, i10, e10));
                }
            } else {
                C5147b.B(jVar, createIntent, i10, bundle);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/a0;", "b", "()Landroidx/lifecycle/a0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends C17544u implements C17631a<a0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f15279c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(j jVar) {
            super(0);
            this.f15279c = jVar;
        }

        /* renamed from: b */
        public final a0 invoke() {
            Application application = this.f15279c.getApplication();
            j jVar = this.f15279c;
            return new a0(application, jVar, jVar.getIntent() != null ? this.f15279c.getIntent().getExtras() : null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/t;", "b", "()Landroidx/activity/t;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17631a<t> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f15280c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j f15281c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(j jVar) {
                super(0);
                this.f15281c = jVar;
            }

            public final void invoke() {
                this.f15281c.reportFullyDrawn();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(0);
            this.f15280c = jVar;
        }

        /* renamed from: b */
        public final t invoke() {
            return new t(this.f15280c.reportFullyDrawnExecutor, new a(this.f15280c));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/w;", "c", "()Landroidx/activity/w;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.j$j  reason: collision with other inner class name */
    static final class C0224j extends C17544u implements C17631a<w> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f15282c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0224j(j jVar) {
            super(0);
            this.f15282c = jVar;
        }

        /* access modifiers changed from: private */
        public static final void e(j jVar) {
            try {
                j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!C17542s.e(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!C17542s.e(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* access modifiers changed from: private */
        public static final void f(j jVar, w wVar) {
            jVar.addObserverForBackInvoker(wVar);
        }

        /* renamed from: c */
        public final w invoke() {
            w wVar = new w(new n(this.f15282c));
            j jVar = this.f15282c;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!C17542s.e(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new o(jVar, wVar));
                } else {
                    jVar.addObserverForBackInvoker(wVar);
                }
            }
            return wVar;
        }
    }

    public j() {
        this.contextAwareHelper = new C5296a();
        this.menuHostHelper = new C4646z(new d(this));
        P4.e a10 = P4.e.f39378d.a(this);
        this.savedStateRegistryController = a10;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = C16825p.b(new i(this));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() != null) {
            getLifecycle().c(new e(this));
            getLifecycle().c(new f(this));
            getLifecycle().c(new a(this));
            a10.c();
            X.c(this);
            getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new g(this));
            addOnContextAvailableListener(new h(this));
            this.defaultViewModelProviderFactory$delegate = C16825p.b(new h(this));
            this.onBackPressedDispatcher$delegate = C16825p.b(new C0224j(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$2(j jVar, C5221y yVar, r.a aVar) {
        Window window;
        View peekDecorView;
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_STOP && (window = jVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
            peekDecorView.cancelPendingInputEvents();
        }
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$3(j jVar, C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_DESTROY) {
            jVar.contextAwareHelper.b();
            if (!jVar.isChangingConfigurations()) {
                jVar.getViewModelStore().a();
            }
            jVar.reportFullyDrawnExecutor.n();
        }
    }

    /* access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(j jVar) {
        Bundle bundle = new Bundle();
        jVar.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(j jVar, Context context) {
        C17542s.j(context, "it");
        Bundle b10 = jVar.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b10 != null) {
            jVar.activityResultRegistry.j(b10);
        }
    }

    /* access modifiers changed from: private */
    public final void addObserverForBackInvoker(w wVar) {
        getLifecycle().c(new i(wVar, this));
    }

    /* access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(w wVar, j jVar, C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "<anonymous parameter 0>");
        C17542s.j(aVar, "event");
        if (aVar == r.a.ON_CREATE) {
            wVar.o(b.f15271a.a(jVar));
        }
    }

    private final e createFullyDrawnExecutor() {
        return new f();
    }

    /* access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new j0();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(j jVar) {
        jVar.invalidateMenu();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        eVar.v(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(B b10) {
        C17542s.j(b10, "provider");
        this.menuHostHelper.c(b10);
    }

    public final void addOnConfigurationChangedListener(H2.a<Configuration> aVar) {
        C17542s.j(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(C5297b bVar) {
        C17542s.j(bVar, "listener");
        this.contextAwareHelper.a(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(H2.a<k> aVar) {
        C17542s.j(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(H2.a<Intent> aVar) {
        C17542s.j(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(H2.a<x> aVar) {
        C17542s.j(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(H2.a<Integer> aVar) {
        C17542s.j(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        C17542s.j(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final C5316e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public l3.a getDefaultViewModelCreationExtras() {
        Bundle bundle = null;
        l3.d dVar = new l3.d((l3.a) null, 1, (DefaultConstructorMarker) null);
        if (getApplication() != null) {
            a.b<Application> bVar = i0.a.f22296h;
            Application application = getApplication();
            C17542s.i(application, "application");
            dVar.c(bVar, application);
        }
        dVar.c(X.f22221a, this);
        dVar.c(X.f22222b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            dVar.c(X.f22223c, bundle);
        }
        return dVar;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return (i0.c) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public t getFullyDrawnReporter() {
        return (t) this.fullyDrawnReporter$delegate.getValue();
    }

    @C16814e
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public r getLifecycle() {
        return super.getLifecycle();
    }

    public final w getOnBackPressedDispatcher() {
        return (w) this.onBackPressedDispatcher$delegate.getValue();
    }

    public final P4.d getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    public j0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            j0 j0Var = this._viewModelStore;
            C17542s.g(j0Var);
            return j0Var;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        l0.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        C17542s.i(decorView2, "window.decorView");
        m0.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        C17542s.i(decorView3, "window.decorView");
        P4.g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        C17542s.i(decorView4, "window.decorView");
        C.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        C17542s.i(decorView5, "window.decorView");
        B.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: protected */
    @C16814e
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.activityResultRegistry.e(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @C16814e
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C17542s.j(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<H2.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        ReportFragment.f22205b.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        C17542s.j(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.menuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.j(menuItem);
        }
        return false;
    }

    @C16814e
    public void onMultiWindowModeChanged(boolean z10) {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator<H2.a<k>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C17542s.j(intent, "intent");
        super.onNewIntent(intent);
        Iterator<H2.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        C17542s.j(menu, "menu");
        this.menuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    @C16814e
    public void onPictureInPictureModeChanged(boolean z10) {
        if (!this.dispatchingOnPictureInPictureModeChanged) {
            Iterator<H2.a<x>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new x(z10));
            }
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        C17542s.j(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.menuHostHelper.k(menu);
        return true;
    }

    @C16814e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        C17542s.j(strArr, "permissions");
        C17542s.j(iArr, "grantResults");
        if (!this.activityResultRegistry.e(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @C16814e
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        j0 j0Var = this._viewModelStore;
        if (j0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            j0Var = dVar.b();
        }
        if (j0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(onRetainCustomNonConfigurationInstance);
        dVar2.d(j0Var);
        return dVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        if (getLifecycle() instanceof A) {
            r lifecycle = getLifecycle();
            C17542s.h(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((A) lifecycle).q(r.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<H2.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> C5314c<I> registerForActivityResult(C5403a<I, O> aVar, C5316e eVar, C5313b<O> bVar) {
        C17542s.j(aVar, "contract");
        C17542s.j(eVar, "registry");
        C17542s.j(bVar, "callback");
        return eVar.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(B b10) {
        C17542s.j(b10, "provider");
        this.menuHostHelper.l(b10);
    }

    public final void removeOnConfigurationChangedListener(H2.a<Configuration> aVar) {
        C17542s.j(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(C5297b bVar) {
        C17542s.j(bVar, "listener");
        this.contextAwareHelper.e(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(H2.a<k> aVar) {
        C17542s.j(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(H2.a<Intent> aVar) {
        C17542s.j(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(H2.a<x> aVar) {
        C17542s.j(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(H2.a<Integer> aVar) {
        C17542s.j(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        C17542s.j(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    public void reportFullyDrawn() {
        try {
            if (V4.a.h()) {
                V4.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            V4.a.f();
        } catch (Throwable th2) {
            V4.a.f();
            throw th2;
        }
    }

    public void setContentView(int i10) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        eVar.v(decorView);
        super.setContentView(i10);
    }

    @C16814e
    public void startActivityForResult(Intent intent, int i10) {
        C17542s.j(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @C16814e
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        C17542s.j(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public void addMenuProvider(B b10, C5221y yVar) {
        C17542s.j(b10, "provider");
        C17542s.j(yVar, "owner");
        this.menuHostHelper.d(b10, yVar);
    }

    @C16814e
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        C17542s.j(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @C16814e
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        C17542s.j(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(B b10, C5221y yVar, r.b bVar) {
        C17542s.j(b10, "provider");
        C17542s.j(yVar, "owner");
        C17542s.j(bVar, "state");
        this.menuHostHelper.e(b10, yVar, bVar);
    }

    public final <I, O> C5314c<I> registerForActivityResult(C5403a<I, O> aVar, C5313b<O> bVar) {
        C17542s.j(aVar, "contract");
        C17542s.j(bVar, "callback");
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        C17542s.j(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<H2.a<k>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new k(z10, configuration));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        C17542s.j(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<H2.a<x>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new x(z10, configuration));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public void setContentView(View view) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        eVar.v(decorView);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C17542s.i(decorView, "window.decorView");
        eVar.v(decorView);
        super.setContentView(view, layoutParams);
    }

    public j(int i10) {
        this();
        this.contentLayoutId = i10;
    }
}
