package com.sugarcube.decorate_engine;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import cI.C17063a;
import com.sugarcube.decorate_engine.PanZoomRegion;
import com.sugarcube.decorate_engine.SceneLayout;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0016\n\u0002\b-\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 À\u00022\u00020\u0001:\nÀ\u0002Á\u0002Â\u0002Ã\u0002Ä\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\"\u0010 J\u001f\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010%J\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\n2\u0006\u0010,\u001a\u0002002\u0006\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\n2\u0006\u00103\u001a\u00020+2\u0006\u00104\u001a\u0002002\u0006\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010?\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020=H ¢\u0006\u0004\b?\u0010@J\u0018\u0010B\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020(2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0004\bF\u0010GJ0\u0010M\u001a\u00020(2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH ¢\u0006\u0004\bM\u0010NJ0\u0010O\u001a\u00020(2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH ¢\u0006\u0004\bO\u0010NJ \u0010Q\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020(H ¢\u0006\u0004\bQ\u0010RJ\u0018\u0010S\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0004\bS\u0010GJ\u0018\u0010T\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0004\bT\u0010GJ \u0010V\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020\u000fH ¢\u0006\u0004\bV\u0010WJ(\u0010Z\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020JH ¢\u0006\u0004\bZ\u0010[J \u0010]\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010\\\u001a\u00020\u000fH ¢\u0006\u0004\b]\u0010WJ \u0010_\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020^H ¢\u0006\u0004\b_\u0010`J(\u0010b\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020J2\u0006\u0010a\u001a\u00020(H ¢\u0006\u0004\bb\u0010cJ \u0010e\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010d\u001a\u00020JH ¢\u0006\u0004\be\u0010fJ(\u0010i\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u0017H ¢\u0006\u0004\bi\u0010jJ \u0010k\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020JH ¢\u0006\u0004\bk\u0010fJ(\u0010m\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020J2\u0006\u0010l\u001a\u00020(H ¢\u0006\u0004\bm\u0010nJ(\u0010p\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020J2\u0006\u0010o\u001a\u00020\u001aH ¢\u0006\u0004\bp\u0010qJ \u0010r\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020JH ¢\u0006\u0004\br\u0010sJ \u0010u\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020(H ¢\u0006\u0004\bu\u0010RJ(\u0010v\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u0017H ¢\u0006\u0004\bv\u0010jJ(\u0010y\u001a\u00020(2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010w\u001a\u00020J2\u0006\u0010x\u001a\u00020JH ¢\u0006\u0004\by\u0010zJ\u0018\u0010{\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0004\b{\u0010CJC\u0010\u0001\u001a\u000202\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010|\u001a\u00020J2\u0006\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u00172\u0006\u0010}\u001a\u00020\u001a2\u0006\u0010~\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u000202\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J+\u0010\u0001\u001a\u000202\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010}\u001a\u00020\u001a2\u0006\u0010~\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J#\u0010\u0001\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020JH ¢\u0006\u0005\b\u0001\u0010sJ,\u0010\u0001\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020J2\u0007\u0010\u0001\u001a\u00020JH ¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0005\b\u0001\u0010CJ6\u0010\u0001\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u00172\u0007\u0010\u0001\u001a\u00020\u0017H ¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020(2\u0006\u0010A\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020\u000fH ¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020JH ¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u001a2\u0007\u0010\u0001\u001a\u00020J2\u0007\u0010\u0001\u001a\u00020JH ¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020J2\u0006\u0010A\u001a\u00020\u001aH ¢\u0006\u0006\b\u0001\u0010\u0001J6\u0010£\u0001\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u001a2\u0007\u0010 \u0001\u001a\u00020\u001a2\u0007\u0010¡\u0001\u001a\u00020\u001a2\u0007\u0010¢\u0001\u001a\u00020\u001aH ¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001c\u0010¦\u0001\u001a\u00020(2\u0007\u0010¥\u0001\u001a\u00020\u000fH ¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u00020(2\u0007\u0010¨\u0001\u001a\u00020=¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0019\u0010«\u0001\u001a\u00020(2\u0007\u0010¨\u0001\u001a\u00020=¢\u0006\u0006\b«\u0001\u0010ª\u0001J\u000f\u0010¬\u0001\u001a\u00020\n¢\u0006\u0005\b¬\u0001\u0010\u000eJ\u001b\u0010°\u0001\u001a\u00030¯\u00012\b\u0010®\u0001\u001a\u00030­\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010²\u0001\u001a\u00030¯\u00012\u0007\u0010®\u0001\u001a\u00020^¢\u0006\u0006\b²\u0001\u0010³\u0001J$\u0010¶\u0001\u001a\u00030¯\u00012\b\u0010µ\u0001\u001a\u00030´\u00012\u0007\u0010Y\u001a\u00030¯\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001b\u0010º\u0001\u001a\u00030¯\u00012\b\u0010¹\u0001\u001a\u00030¸\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001J,\u0010½\u0001\u001a\u00030¯\u00012\u0006\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u00172\t\b\u0002\u0010¼\u0001\u001a\u00020(¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010¿\u0001\u001a\u00030¯\u00012\u0007\u0010Y\u001a\u00030¯\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J\"\u0010Â\u0001\u001a\u00020\n2\b\u0010Á\u0001\u001a\u00030¯\u00012\u0006\u0010a\u001a\u00020(¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0018\u0010Ä\u0001\u001a\u00020J2\u0006\u0010d\u001a\u00020J¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001b\u0010Ç\u0001\u001a\u00030Æ\u00012\b\u0010Á\u0001\u001a\u00030¯\u0001¢\u0006\u0006\bÇ\u0001\u0010È\u0001J#\u0010Ç\u0001\u001a\u00030Æ\u00012\b\u0010Á\u0001\u001a\u00030¯\u00012\u0006\u0010l\u001a\u00020(¢\u0006\u0006\bÇ\u0001\u0010É\u0001J$\u0010Ë\u0001\u001a\u00020\n2\b\u0010Á\u0001\u001a\u00030¯\u00012\b\u0010Ê\u0001\u001a\u00030Æ\u0001¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001a\u0010Í\u0001\u001a\u00020\n2\b\u0010Á\u0001\u001a\u00030¯\u0001¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0018\u0010Ï\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020(¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J!\u0010Ò\u0001\u001a\u00030Ñ\u00012\u0006\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u0017¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J#\u0010Õ\u0001\u001a\u00020(2\u0007\u0010w\u001a\u00030Ô\u00012\b\u0010Á\u0001\u001a\u00030Ñ\u0001¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J-\u0010Ù\u0001\u001a\u00030×\u00012\u0006\u0010g\u001a\u00020\u00172\u0006\u0010h\u001a\u00020\u00172\n\b\u0002\u0010Ø\u0001\u001a\u00030×\u0001¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J'\u0010Ù\u0001\u001a\u00030×\u00012\b\u0010Á\u0001\u001a\u00030¯\u00012\n\b\u0002\u0010Ø\u0001\u001a\u00030×\u0001¢\u0006\u0006\bÙ\u0001\u0010Û\u0001J\u0011\u0010Ü\u0001\u001a\u00030×\u0001¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u001b\u0010Þ\u0001\u001a\u00030×\u00012\b\u0010Ø\u0001\u001a\u00030×\u0001¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J\u0010\u0010à\u0001\u001a\u00020J¢\u0006\u0006\bà\u0001\u0010á\u0001J\u0010\u0010â\u0001\u001a\u00020J¢\u0006\u0006\bâ\u0001\u0010á\u0001J\u0010\u0010ã\u0001\u001a\u00020J¢\u0006\u0006\bã\u0001\u0010á\u0001J\u0019\u0010å\u0001\u001a\u00020\n2\u0007\u0010ä\u0001\u001a\u00020J¢\u0006\u0006\bå\u0001\u0010æ\u0001J$\u0010ç\u0001\u001a\u00020\n2\u0007\u0010Y\u001a\u00030¯\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010J¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0010\u0010é\u0001\u001a\u00020\u0014¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0019\u0010ì\u0001\u001a\u00020\u00142\u0007\u0010ë\u0001\u001a\u00020\u0014¢\u0006\u0006\bì\u0001\u0010í\u0001J\u000f\u0010î\u0001\u001a\u00020\n¢\u0006\u0005\bî\u0001\u0010\u000eJ\u001a\u0010ð\u0001\u001a\u00020(2\b\u0010ï\u0001\u001a\u00030´\u0001¢\u0006\u0006\bð\u0001\u0010ñ\u0001J4\u0010õ\u0001\u001a\u001a\u0012\u0005\u0012\u00030¯\u0001\u0012\u0005\u0012\u00030ó\u0001\u0018\u00010ò\u0001j\u0005\u0018\u0001`ô\u00012\n\b\u0002\u0010\u0001\u001a\u00030¯\u0001¢\u0006\u0006\bõ\u0001\u0010ö\u0001J(\u0010ù\u0001\u001a\u001a\u0012\u0005\u0012\u00030¯\u0001\u0012\u0005\u0012\u00030÷\u0001\u0018\u00010ò\u0001j\u0005\u0018\u0001`ø\u0001¢\u0006\u0006\bù\u0001\u0010ú\u0001J!\u0010þ\u0001\u001a\u0013\u0012\u0005\u0012\u00030ü\u0001\u0018\u00010û\u0001j\u0005\u0018\u0001`ý\u0001¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u001a\u0010\u0002\u001a\f\u0012\u0005\u0012\u00030¯\u0001\u0018\u00010\u0002¢\u0006\u0006\b\u0002\u0010\u0002J'\u0010\u0002\u001a\u0005\u0018\u00010´\u00012\b\u0010\u0001\u001a\u00030\u00022\b\u0010\u0001\u001a\u00030\u0002¢\u0006\u0006\b\u0002\u0010\u0002J\u0018\u0010\u0002\u001a\u00020\n2\u0006\u0010I\u001a\u00020H¢\u0006\u0006\b\u0002\u0010\u0002J3\u0010\u0002\u001a\u00020\n2\u0006\u0010I\u001a\u00020H2\u0007\u0010\u0002\u001a\u00020J2\u0007\u0010\u0002\u001a\u00020J2\u0007\u0010\u0002\u001a\u00020J¢\u0006\u0006\b\u0002\u0010\u0002J\u0018\u0010\u0002\u001a\u00020\n2\u0006\u0010P\u001a\u00020(¢\u0006\u0006\b\u0002\u0010Ð\u0001J\u0018\u0010\u0002\u001a\u00020\n2\u0006\u0010I\u001a\u00020H¢\u0006\u0006\b\u0002\u0010\u0002J\u000f\u0010\u0002\u001a\u00020\n¢\u0006\u0005\b\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u0005\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bI\u0010\u0002R\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010 \u0002R\u001c\u0010¢\u0002\u001a\u0005\u0018\u00010¡\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u001a\u0010¥\u0002\u001a\u00030¤\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u001a\u0010¨\u0002\u001a\u00030§\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u001a\u0010ª\u0002\u001a\u00030§\u00028\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bª\u0002\u0010©\u0002R\u0017\u0010A\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bA\u0010«\u0002R\u001d\u0010®\u0002\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168BX\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010­\u0002R\u0014\u0010±\u0002\u001a\u00020+8F¢\u0006\b\u001a\u0006\b¯\u0002\u0010°\u0002R\u0014\u0010´\u0002\u001a\u0002008F¢\u0006\b\u001a\u0006\b²\u0002\u0010³\u0002R\u0014\u0010·\u0002\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u0015\u0010»\u0002\u001a\u00030¸\u00028F¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u0015\u0010¿\u0002\u001a\u00030¼\u00028G¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002¨\u0006Å\u0002"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngine;", "", "Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "stateListener", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "logger", "<init>", "(Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;)V", "Ljava/io/File;", "pipeFile", "LXH/N;", "startLogPipeLoop", "(Ljava/io/File;)V", "stopLogPipeLoop", "()V", "", "msg", "logError", "(Ljava/lang/String;)V", "logPipeLoop", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "rgn", "", "", "pixelCenterForPZR", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)[Ljava/lang/Float;", "", "rgnPacked", "unpackPZR", "(J)Lcom/sugarcube/decorate_engine/PanZoomRegion;", "prop", "propToPix", "([Ljava/lang/Float;)[Ljava/lang/Float;", "pix", "pixToProp", "p", "s", "(FF)F", "boundProp", "(F)F", "", "makeFifo", "(Ljava/io/File;)Z", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "value", "src", "setRunState", "(Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;Ljava/lang/String;)V", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "setDrawState", "(Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;Ljava/lang/String;)V", "rs", "ds", "setStates", "(Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;Ljava/lang/String;)V", "setupAndRunIfReady", "()Z", "Landroid/view/MotionEvent;", "touchEvent", "onDevTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;", "createInfo", "createRenderEngineNative", "(Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;)J", "bridgeHandle", "getBridgeUniqueIdNative", "(J)J", "runRenderEngineNative", "(J)Z", "destroyRenderEngineNative", "(J)V", "Landroid/view/Surface;", "surface", "", "w", "h", "surfaceCreatedNative", "(JLandroid/view/Surface;II)Z", "surfaceChangedNative", "hasFocus", "focusChangedNative", "(JZ)V", "forceRedrawNative", "surfaceDestroyedNative", "createInfoJson", "addModelInstanceNative", "(JLjava/lang/String;)I", "additiveLayoutJson", "instanceId", "addCompoundModelInstanceNative", "(JLjava/lang/String;I)I", "sarJson", "addSomeAssemblyRequiredModelInstanceNative", "Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;", "cloneModelInstanceNative", "(JLcom/sugarcube/decorate_engine/CloneModelInstanceInfo;)I", "isSelected", "setModelInstanceSelectedNative", "(JIZ)V", "outlineColor", "setSelectionOutlineColorNative", "(JI)I", "screenX", "screenY", "hitTestNative", "(JFF)I", "getInstanceParentNative", "usePanoSpace", "getModelInstanceScreenTransformNative", "(JIZ)J", "packedTransform", "moveModelInstanceNative", "(JIJ)V", "removeModelInstanceNative", "(JI)V", "isVisible", "setModelInstancesVisibleNative", "eraserPickNative", "op", "pickId", "execEraserOpNative", "(JII)Z", "getEraserCountsNative", "instId", "packedParams0", "packedParams1", "", "flyCamToPointOfInterestNative", "(JIFFJJ)[J", "getFlyCamOrbitParamsNative", "(J)[J", "setFlyCamOrbitParamsNative", "(JJJ)[J", "getFixedViewCountNative", "(J)I", "getCurrentFixedViewNative", "getLastFixedViewNative", "viewIdx", "flyCamToFixedViewNative", "wallColor", "setCustomWallColorNative", "(JII)V", "getPanZoomRegionNative", "centerX", "centerY", "zoom", "setPanZoomRegionNative", "(JFFF)J", "layoutJson", "loadSceneLayoutNative", "(JLjava/lang/String;)Z", "parentInstanceId", "getInstanceInfoJsonNative", "(JI)Ljava/lang/String;", "layoutFormat", "thumbnailSpec", "saveSceneLayoutNative", "(JII)Ljava/lang/String;", "getLoggedErrorCountNative", "actionPtrIds", "posXY01", "posXY23", "onDevTouchEventNative", "(JJJJ)V", "path", "mkfifo", "(Ljava/lang/String;)Z", "setupInfo", "setupAndRun", "(Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;)Z", "runTests", "teardown", "Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;", "instanceInfo", "Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "addModelInstance", "(Lcom/sugarcube/decorate_engine/AddModelInstanceInfo;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "cloneModelInstance", "(Lcom/sugarcube/decorate_engine/CloneModelInstanceInfo;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/SceneLayout;", "additiveLayout", "addCompoundModelInstance", "(Lcom/sugarcube/decorate_engine/SceneLayout;Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;", "sar", "addSomeAssemblyRequiredModelInstance", "(Lcom/sugarcube/decorate_engine/SomeAssemblyRequired;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "includeSurfaces", "hitTest", "(FFZ)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "getInstanceParent", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ObjectInstanceId;", "id", "setModelInstanceSelected", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Z)V", "setSelectionOutlineColor", "(I)I", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "getModelScreenTransform", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Z)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "xf", "moveModelInstance", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "removeModelInstance", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)V", "setModelInstancesVisible", "(Z)V", "Lcom/sugarcube/decorate_engine/EraserPickId;", "eraserPick", "(FF)Lcom/sugarcube/decorate_engine/EraserPickId;", "Lcom/sugarcube/decorate_engine/EraserPickOp;", "execEraserOp", "(Lcom/sugarcube/decorate_engine/EraserPickOp;Lcom/sugarcube/decorate_engine/EraserPickId;)Z", "Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "orbitParams", "flyCamToPointOfInterest", "(FFLcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "getFlyCamOrbitParams", "()Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "setFlyCamOrbitParams", "(Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;)Lcom/sugarcube/decorate_engine/FlyCamOrbitParams;", "getFixedViewCount", "()I", "getCurrentFixedView", "getLastFixedView", "viewIndex", "flyCamToFixedView", "(I)V", "setCustomWallColor", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;Ljava/lang/Integer;)V", "getPanZoomRegion", "()Lcom/sugarcube/decorate_engine/PanZoomRegion;", "pzRegion", "setPanZoomRegion", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)Lcom/sugarcube/decorate_engine/PanZoomRegion;", "restoreWindowFit", "layout", "loadSceneLayout", "(Lcom/sugarcube/decorate_engine/SceneLayout;)Z", "", "Lcom/sugarcube/decorate_engine/ModelInstanceDetails;", "Lcom/sugarcube/decorate_engine/ModelInstanceDetailsMap;", "getModelInstancesDetails", "(Lcom/sugarcube/decorate_engine/ObjectInstanceId;)Ljava/util/Map;", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetails;", "Lcom/sugarcube/decorate_engine/RoomSurfaceDetailsMap;", "getRoomSurfacesDetails", "()Ljava/util/Map;", "", "Lcom/sugarcube/decorate_engine/RoomPolygonType;", "Lcom/sugarcube/decorate_engine/RoomPolygonTypeSet;", "getRoomPolygonTypeSet", "()Ljava/util/Set;", "", "getRoomPolygonIdList", "()Ljava/util/List;", "Lcom/sugarcube/decorate_engine/SceneLayoutFormat;", "Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;", "saveSceneLayout", "(Lcom/sugarcube/decorate_engine/SceneLayoutFormat;Lcom/sugarcube/decorate_engine/LayoutThumbnailSpec;)Lcom/sugarcube/decorate_engine/SceneLayout;", "surfaceCreated", "(Landroid/view/Surface;)V", "format", "width", "height", "surfaceChanged", "(Landroid/view/Surface;III)V", "focusChanged", "surfaceRedrawNeeded", "surfaceDestroyed", "Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "getStateListener", "()Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "getLogger", "()Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "_runState", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "_drawState", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;", "sceneLayoutJson", "Ljava/lang/String;", "Landroid/view/Surface;", "windowSize", "[Ljava/lang/Float;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Ljava/util/concurrent/Semaphore;", "logPipeLoopSem", "Ljava/util/concurrent/Semaphore;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "logPipeLoopRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "logPipeLoopNeeded", "J", "getWindowCenter", "()[Ljava/lang/Float;", "windowCenter", "getRunState", "()Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "runState", "getDrawState", "()Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "drawState", "getUniqueInstanceId", "()J", "uniqueInstanceId", "Lcom/sugarcube/decorate_engine/EraserCounts;", "getEraserCounts", "()Lcom/sugarcube/decorate_engine/EraserCounts;", "eraserCounts", "Landroid/view/View$OnTouchListener;", "getOnDevTouchListener", "()Landroid/view/View$OnTouchListener;", "onDevTouchListener", "Companion", "DrawState", "Logger", "RunState", "StateListener", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DecorateEngine {
    public static final Companion Companion;
    /* access modifiers changed from: private */
    public static final C16824o<Boolean> isDeviceSupported$delegate = C16825p.b(DecorateEngine$Companion$isDeviceSupported$2.INSTANCE);
    /* access modifiers changed from: private */
    public static int isDeviceSupportedResult = -1;
    private DrawState _drawState = DrawState.NoWindow;
    private RunState _runState = RunState.New;
    private long bridgeHandle;
    private Context context;
    private AtomicBoolean logPipeLoopNeeded;
    private AtomicBoolean logPipeLoopRunning;
    private Semaphore logPipeLoopSem;
    private final Logger logger;
    private String sceneLayoutJson = "";
    private DecorateEngineSetupInfo setupInfo;
    private final StateListener stateListener;
    private Surface surface;
    private Float[] windowSize;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0006R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngine$Companion;", "", "<init>", "()V", "", "isDeviceSupportedNative", "()Z", "loadLib", "isDeviceSupported$delegate", "LXH/o;", "isDeviceSupported", "", "isDeviceSupportedResult", "I", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isDeviceSupportedNative() {
            return DecorateEngine.isDeviceSupportedNative();
        }

        /* access modifiers changed from: private */
        public final boolean loadLib() {
            if (DecorateEngine.isDeviceSupportedResult == -1) {
                DecorateEngine.isDeviceSupportedResult = 0;
                if (C17542s.e(Build.SUPPORTED_ABIS[0], "arm64-v8a")) {
                    try {
                        System.loadLibrary("decorate-engine");
                        DecorateEngine.isDeviceSupportedResult = isDeviceSupportedNative() ? 1 : 0;
                    } catch (Throwable unused) {
                    }
                }
            }
            return DecorateEngine.isDeviceSupportedResult == 1;
        }

        public final boolean isDeviceSupported() {
            return ((Boolean) DecorateEngine.isDeviceSupported$delegate.getValue()).booleanValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "", "(Ljava/lang/String;I)V", "NoWindow", "HasWindow", "Drawing", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum DrawState {
        NoWindow,
        HasWindow,
        Drawing
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngine$Logger;", "", "", "msg", "LXH/N;", "log", "(Ljava/lang/String;)V", "", "isFatal", "onError", "(Ljava/lang/String;Z)V", "Lcom/sugarcube/decorate_engine/Metric;", "metric", "onMetric", "(Lcom/sugarcube/decorate_engine/Metric;)V", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Logger {
        void log(String str);

        void onError(String str, boolean z10);

        void onMetric(Metric metric);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "", "(Ljava/lang/String;I)V", "New", "SettingUp", "SetUp", "Running", "TearingDown", "TornDown", "Error", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum RunState {
        New,
        SettingUp,
        SetUp,
        Running,
        TearingDown,
        TornDown,
        Error
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngine$StateListener;", "", "Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;", "runState", "Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;", "drawState", "LXH/N;", "onChange", "(Lcom/sugarcube/decorate_engine/DecorateEngine$RunState;Lcom/sugarcube/decorate_engine/DecorateEngine$DrawState;)V", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface StateListener {
        void onChange(RunState runState, DrawState drawState);
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        Companion = companion;
        boolean unused = companion.loadLib();
    }

    public DecorateEngine(StateListener stateListener2, Logger logger2) {
        C17542s.j(stateListener2, "stateListener");
        C17542s.j(logger2, "logger");
        this.stateListener = stateListener2;
        this.logger = logger2;
        Float valueOf = Float.valueOf(1.0f);
        this.windowSize = new Float[]{valueOf, valueOf};
        this.logPipeLoopSem = new Semaphore(0);
        this.logPipeLoopRunning = new AtomicBoolean(false);
        this.logPipeLoopNeeded = new AtomicBoolean(false);
    }

    /* access modifiers changed from: private */
    public static final boolean _get_onDevTouchListener_$lambda$41(DecorateEngine decorateEngine, View view, MotionEvent motionEvent) {
        C17542s.j(decorateEngine, "this$0");
        C17542s.j(view, "<anonymous parameter 0>");
        C17542s.j(motionEvent, "event");
        decorateEngine.onDevTouchEvent(motionEvent);
        return true;
    }

    private final native int addCompoundModelInstanceNative(long j10, String str, int i10);

    private final native int addModelInstanceNative(long j10, String str);

    private final native int addSomeAssemblyRequiredModelInstanceNative(long j10, String str);

    private final float boundProp(float f10) {
        float f11 = -1.0f;
        if (f10 >= -1.0f) {
            f11 = 1.0f;
            if (f10 <= 1.0f) {
                return f10;
            }
        }
        return f11;
    }

    private final native int cloneModelInstanceNative(long j10, CloneModelInstanceInfo cloneModelInstanceInfo);

    private final native long createRenderEngineNative(DecorateEngineSetupInfo decorateEngineSetupInfo);

    private final native void destroyRenderEngineNative(long j10);

    private final native int eraserPickNative(long j10, float f10, float f11);

    private final native boolean execEraserOpNative(long j10, int i10, int i11);

    private final native void flyCamToFixedViewNative(long j10, int i10);

    public static /* synthetic */ FlyCamOrbitParams flyCamToPointOfInterest$default(DecorateEngine decorateEngine, float f10, float f11, FlyCamOrbitParams flyCamOrbitParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            flyCamOrbitParams = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
        }
        return decorateEngine.flyCamToPointOfInterest(f10, f11, flyCamOrbitParams);
    }

    private final native long[] flyCamToPointOfInterestNative(long j10, int i10, float f10, float f11, long j11, long j12);

    private final native void focusChangedNative(long j10, boolean z10);

    private final native void forceRedrawNative(long j10);

    private final native long getBridgeUniqueIdNative(long j10);

    private final native int getCurrentFixedViewNative(long j10);

    private final native long getEraserCountsNative(long j10);

    private final native int getFixedViewCountNative(long j10);

    private final native long[] getFlyCamOrbitParamsNative(long j10);

    private final native String getInstanceInfoJsonNative(long j10, int i10);

    private final native int getInstanceParentNative(long j10, int i10);

    private final native int getLastFixedViewNative(long j10);

    private final native int getLoggedErrorCountNative(long j10);

    private final native long getModelInstanceScreenTransformNative(long j10, int i10, boolean z10);

    public static /* synthetic */ Map getModelInstancesDetails$default(DecorateEngine decorateEngine, ObjectInstanceId objectInstanceId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            objectInstanceId = ObjectInstanceId.Companion.getKNone();
        }
        return decorateEngine.getModelInstancesDetails(objectInstanceId);
    }

    private final native long getPanZoomRegionNative(long j10);

    private final Float[] getWindowCenter() {
        return new Float[]{Float.valueOf(this.windowSize[0].floatValue() / 2.0f), Float.valueOf(this.windowSize[1].floatValue() / 2.0f)};
    }

    public static /* synthetic */ ObjectInstanceId hitTest$default(DecorateEngine decorateEngine, float f10, float f11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return decorateEngine.hitTest(f10, f11, z10);
    }

    private final native int hitTestNative(long j10, float f10, float f11);

    /* access modifiers changed from: private */
    public static final native boolean isDeviceSupportedNative();

    private final native boolean loadSceneLayoutNative(long j10, String str);

    private final void logError(String str) {
        this.logger.log(str);
        this.logger.onError(str, false);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:19|18|47|48|(0)|51|(0)|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e4, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fd, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r9 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void logPipeLoop(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            boolean r2 = r8.makeFifo(r9)     // Catch:{ Exception -> 0x00db }
            if (r2 != 0) goto L_0x0016
            java.lang.String r2 = "FAILED MAKING NATIVE LOG FIFO"
            r8.logError(r2)     // Catch:{ Exception -> 0x00db }
            java.util.concurrent.Semaphore r2 = r8.logPipeLoopSem     // Catch:{ Exception -> 0x00db }
            r2.release()     // Catch:{ Exception -> 0x00db }
            return
        L_0x0013:
            r9 = move-exception
            goto L_0x00fb
        L_0x0016:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r2 = r8.logger     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = "native log pipe created"
            r2.log(r3)     // Catch:{ Exception -> 0x00db }
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.logPipeLoopRunning     // Catch:{ Exception -> 0x00db }
            r3 = 1
            r2.set(r3)     // Catch:{ Exception -> 0x00db }
            java.util.concurrent.Semaphore r2 = r8.logPipeLoopSem     // Catch:{ Exception -> 0x00db }
            r2.release()     // Catch:{ Exception -> 0x00db }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00db }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00db }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00db }
            r5.<init>(r9)     // Catch:{ Exception -> 0x00db }
            r6 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x00db }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00db }
            com.sugarcube.decorate_engine.DecorateEngine$Logger r1 = r8.logger     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            java.lang.String r4 = "native log relay loop connected to pipe"
            r1.log(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            byte[] r1 = new byte[r6]     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
        L_0x0042:
            java.util.concurrent.atomic.AtomicBoolean r4 = r8.logPipeLoopNeeded     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            boolean r4 = r4.get()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            if (r4 == 0) goto L_0x00d7
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            short r4 = java.lang.Short.reverseBytes(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            short r4 = XH.C16804K.b(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            int r5 = r1.length     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            if (r4 <= r5) goto L_0x0067
            byte[] r1 = new byte[r4]     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            goto L_0x0067
        L_0x0060:
            r9 = move-exception
            r1 = r2
            goto L_0x00fb
        L_0x0064:
            r1 = r2
            goto L_0x00db
        L_0x0067:
            int r4 = r2.read(r1, r0, r4)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            if (r4 >= 0) goto L_0x006e
            goto L_0x0042
        L_0x006e:
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            java.nio.charset.Charset r6 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r5.<init>(r1, r0, r4, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            com.sugarcube.decorate_engine.DecorateEngine$Logger r4 = r8.logger     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r4.log(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            int r4 = r5.length()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r6 = 3
            if (r4 <= r6) goto L_0x008b
            java.lang.String r4 = r5.substring(r0, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C17542s.i(r4, r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            goto L_0x008d
        L_0x008b:
            java.lang.String r4 = ""
        L_0x008d:
            int r6 = r4.hashCode()     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r7 = 33885(0x845d, float:4.7483E-41)
            if (r6 == r7) goto L_0x00c6
            r7 = 63955(0xf9d3, float:8.962E-41)
            if (r6 == r7) goto L_0x00b0
            r7 = 87601(0x15631, float:1.22755E-40)
            if (r6 == r7) goto L_0x00a1
            goto L_0x0042
        L_0x00a1:
            java.lang.String r6 = "X_X"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            if (r4 != 0) goto L_0x00aa
            goto L_0x0042
        L_0x00aa:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r4 = r8.logger     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r4.onError(r5, r3)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            goto L_0x0042
        L_0x00b0:
            java.lang.String r6 = "@M@"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            if (r4 != 0) goto L_0x00b9
            goto L_0x0042
        L_0x00b9:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r4 = r8.logger     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            com.sugarcube.decorate_engine.Metric$Companion r6 = com.sugarcube.decorate_engine.Metric.Companion     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            com.sugarcube.decorate_engine.Metric r5 = r6.fromLogLine$decorate_engine_release(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r4.onMetric(r5)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            goto L_0x0042
        L_0x00c6:
            java.lang.String r6 = "!E!"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            if (r4 != 0) goto L_0x00d0
            goto L_0x0042
        L_0x00d0:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r4 = r8.logger     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            r4.onError(r5, r0)     // Catch:{ Exception -> 0x0064, all -> 0x0060 }
            goto L_0x0042
        L_0x00d7:
            r2.close()
            goto L_0x00e7
        L_0x00db:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r2 = r8.logger     // Catch:{ all -> 0x0013 }
            java.lang.String r3 = "decorate engine log pipe closed."
            r2.log(r3)     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x00e7
            r1.close()
        L_0x00e7:
            boolean r1 = r9.exists()
            if (r1 == 0) goto L_0x00f0
            r9.delete()
        L_0x00f0:
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.logPipeLoopRunning
            r9.set(r0)
            java.util.concurrent.Semaphore r9 = r8.logPipeLoopSem
            r9.release()
            return
        L_0x00fb:
            if (r1 == 0) goto L_0x0100
            r1.close()
        L_0x0100:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngine.logPipeLoop(java.io.File):void");
    }

    private final boolean makeFifo(File file) {
        if (file.exists()) {
            file.delete();
        }
        String absolutePath = file.getAbsolutePath();
        C17542s.i(absolutePath, "getAbsolutePath(...)");
        return mkfifo(absolutePath);
    }

    private final native boolean mkfifo(String str);

    private final native void moveModelInstanceNative(long j10, int i10, long j11);

    private final void onDevTouchEvent(MotionEvent motionEvent) {
        synchronized (this) {
            if (getRunState() == RunState.Running || getDrawState() == DrawState.Drawing) {
                long[] packed = BridgeStructsKt.toPacked(motionEvent);
                onDevTouchEventNative(this.bridgeHandle, packed[0], packed[1], packed[2]);
                C16807N n10 = C16807N.f139792a;
                return;
            }
            Logger logger2 = this.logger;
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logger2.log("can't forward dev touch event. runState:" + runState + " drawState:" + drawState);
        }
    }

    private final native void onDevTouchEventNative(long j10, long j11, long j12, long j13);

    private final Float[] pixToProp(Float[] fArr) {
        return new Float[]{Float.valueOf(pixToProp(fArr[0].floatValue(), this.windowSize[0].floatValue())), Float.valueOf(pixToProp(fArr[1].floatValue(), this.windowSize[1].floatValue()))};
    }

    private final Float[] pixelCenterForPZR(PanZoomRegion panZoomRegion) {
        return panZoomRegion.isPixelCenterValid() ? panZoomRegion._pixelCenter : panZoomRegion.isProportionalCenterValid() ? propToPix(panZoomRegion._proportionalCenter) : getWindowCenter();
    }

    private final Float[] propToPix(Float[] fArr) {
        return new Float[]{Float.valueOf(propToPix(fArr[0].floatValue(), this.windowSize[0].floatValue())), Float.valueOf(propToPix(fArr[1].floatValue(), this.windowSize[1].floatValue()))};
    }

    private final native void removeModelInstanceNative(long j10, int i10);

    private final native boolean runRenderEngineNative(long j10);

    private final native String saveSceneLayoutNative(long j10, int i10, int i11);

    private final native void setCustomWallColorNative(long j10, int i10, int i11);

    private final void setDrawState(DrawState drawState, String str) {
        DrawState drawState2 = this._drawState;
        if (drawState2 != drawState) {
            Logger logger2 = this.logger;
            RunState runState = this._runState;
            logger2.log(str + " runState:" + runState + " drawState:" + drawState2 + "->" + drawState);
            this._drawState = drawState;
            this.stateListener.onChange(this._runState, drawState);
        }
    }

    private final native long[] setFlyCamOrbitParamsNative(long j10, long j11, long j12);

    private final native void setModelInstanceSelectedNative(long j10, int i10, boolean z10);

    private final native void setModelInstancesVisibleNative(long j10, boolean z10);

    private final native long setPanZoomRegionNative(long j10, float f10, float f11, float f12);

    private final void setRunState(RunState runState, String str) {
        RunState runState2 = this._runState;
        if (runState2 != runState) {
            Logger logger2 = this.logger;
            DrawState drawState = this._drawState;
            logger2.log(str + " runState:" + runState2 + "->" + runState + " drawState:" + drawState);
            this._runState = runState;
            this.stateListener.onChange(runState, this._drawState);
        }
    }

    private final native int setSelectionOutlineColorNative(long j10, int i10);

    private final void setStates(RunState runState, DrawState drawState, String str) {
        RunState runState2 = this._runState;
        if (runState2 != runState || this._drawState != drawState) {
            Logger logger2 = this.logger;
            DrawState drawState2 = this._drawState;
            logger2.log(str + " runState:" + runState2 + "->" + runState + " drawState:" + drawState2 + "->" + drawState);
            this._runState = runState;
            this._drawState = drawState;
            this.stateListener.onChange(runState, drawState);
        }
    }

    private final boolean setupAndRunIfReady() {
        RunState runState = getRunState();
        RunState runState2 = RunState.Error;
        if (runState == runState2) {
            logError("an error already occurred. ignoring further calls.");
            return false;
        }
        RunState runState3 = getRunState();
        RunState runState4 = RunState.Running;
        if (runState3.compareTo(runState4) >= 0) {
            logError("engine already running.");
            return false;
        }
        RunState runState5 = getRunState();
        RunState runState6 = RunState.SettingUp;
        if (runState5.compareTo(runState6) < 0) {
            setRunState(runState6, "setupAndRunIfReady");
        }
        RunState runState7 = getRunState();
        RunState runState8 = RunState.SetUp;
        if (runState7.compareTo(runState8) < 0) {
            if (this.surface == null) {
                this.logger.log("not ready to set up - sized window not received yet from surfaceChanged()");
                return true;
            }
            DecorateEngineSetupInfo decorateEngineSetupInfo = this.setupInfo;
            if (decorateEngineSetupInfo != null) {
                this.logger.log("creating engine & setting up");
                if (decorateEngineSetupInfo.logIsPipe) {
                    startLogPipeLoop(new File(decorateEngineSetupInfo.logFilePath));
                }
                decorateEngineSetupInfo.maxRenderWidth = (int) this.windowSize[0].floatValue();
                decorateEngineSetupInfo.maxRenderHeight = (int) this.windowSize[1].floatValue();
                long createRenderEngineNative = createRenderEngineNative(decorateEngineSetupInfo);
                this.bridgeHandle = createRenderEngineNative;
                if (createRenderEngineNative == 0) {
                    stopLogPipeLoop();
                    setRunState(runState2, "setupAndRunIfReady");
                    return false;
                }
                this.setupInfo = null;
                setRunState(runState8, "setupAndRunIfReady");
                if (!runRenderEngineNative(this.bridgeHandle)) {
                    logError("failed running engine after setup");
                    teardown();
                    setRunState(runState2, "surfaceCreated");
                    return false;
                }
                setRunState(runState4, "setupAndRunIfReady");
            }
            if (getRunState().compareTo(runState8) < 0) {
                this.logger.log("not ready to set up - setupAndRun() not called yet");
                return true;
            }
        }
        DrawState drawState = getDrawState();
        DrawState drawState2 = DrawState.NoWindow;
        if (drawState == drawState2) {
            Surface surface2 = this.surface;
            if (surface2 != null) {
                if (!surfaceCreatedNative(this.bridgeHandle, surface2, (int) this.windowSize[0].floatValue(), (int) this.windowSize[1].floatValue())) {
                    logError("failed initializing renderer with window surface");
                    setRunState(runState2, "setupAndRunIfReady");
                    teardown();
                    return false;
                }
                setDrawState(DrawState.HasWindow, "setupAndRunIfReady");
            }
            if (getDrawState() == drawState2) {
                this.logger.log("not ready to run - surfaceChanged() not called yet");
                return true;
            }
            if (this.sceneLayoutJson.length() != 0) {
                this.logger.log("running & drawing - ready to load initial scene layout");
                if (!loadSceneLayoutNative(this.bridgeHandle, this.sceneLayoutJson)) {
                    logError("failed loading initial scene layout - proceeding with empty scene");
                    this.sceneLayoutJson = "";
                }
            }
            setDrawState(DrawState.Drawing, "setupAndRunIfReady");
            if (this.sceneLayoutJson.length() == 0) {
                this.logger.log("no initial scene layout. we're 100% ready to edit");
            } else {
                this.logger.log("scene layout loaded. we're 100% ready to edit");
                this.sceneLayoutJson = "";
            }
        }
        return true;
    }

    private final void startLogPipeLoop(File file) {
        this.logPipeLoopRunning.set(false);
        this.logPipeLoopNeeded.set(true);
        C17063a.b(false, false, (ClassLoader) null, (String) null, 0, new DecorateEngine$startLogPipeLoop$1(this, file), 31, (Object) null);
        this.logPipeLoopSem.acquire();
    }

    private final void stopLogPipeLoop() {
        if (this.logPipeLoopRunning.get()) {
            this.logPipeLoopNeeded.set(false);
            this.logPipeLoopSem.acquire();
        }
    }

    private final native boolean surfaceChangedNative(long j10, Surface surface2, int i10, int i11);

    private final native boolean surfaceCreatedNative(long j10, Surface surface2, int i10, int i11);

    private final native void surfaceDestroyedNative(long j10);

    private final PanZoomRegion unpackPZR(long j10) {
        PanZoomRegion.Companion companion = PanZoomRegion.Companion;
        PanZoomRegion fromPacked$decorate_engine_release = companion.fromPacked$decorate_engine_release(j10);
        if (fromPacked$decorate_engine_release.zoom <= 1.0f) {
            fromPacked$decorate_engine_release.zoom = 1.0f;
            fromPacked$decorate_engine_release._proportionalCenter = companion.getKProportionalMiddle();
            fromPacked$decorate_engine_release._pixelCenter = getWindowCenter();
        } else {
            fromPacked$decorate_engine_release._proportionalCenter = pixToProp(fromPacked$decorate_engine_release.getPixelCenter());
        }
        return fromPacked$decorate_engine_release;
    }

    public final ObjectInstanceId addCompoundModelInstance(SceneLayout sceneLayout, ObjectInstanceId objectInstanceId) {
        C17542s.j(sceneLayout, "additiveLayout");
        C17542s.j(objectInstanceId, "instanceId");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't add compound model instance. runState:" + runState + " drawState:" + drawState);
                ObjectInstanceId kNone = ObjectInstanceId.Companion.getKNone();
                return kNone;
            } else if (sceneLayout.isEmpty()) {
                this.logger.log("can't load empty compound model");
                ObjectInstanceId kNone2 = ObjectInstanceId.Companion.getKNone();
                return kNone2;
            } else {
                ObjectInstanceId objectInstanceId2 = new ObjectInstanceId(addCompoundModelInstanceNative(this.bridgeHandle, sceneLayout.toJson$decorate_engine_release(), objectInstanceId.getIntValue()));
                return objectInstanceId2;
            }
        }
    }

    public final ObjectInstanceId addModelInstance(AddModelInstanceInfo addModelInstanceInfo) {
        C17542s.j(addModelInstanceInfo, "instanceInfo");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                this.logger.log("can't add model when engine is not running");
                ObjectInstanceId kNone = ObjectInstanceId.Companion.getKNone();
                return kNone;
            }
            ObjectInstanceId objectInstanceId = new ObjectInstanceId(addModelInstanceNative(this.bridgeHandle, addModelInstanceInfo.toJson$decorate_engine_release()));
            return objectInstanceId;
        }
    }

    public final ObjectInstanceId addSomeAssemblyRequiredModelInstance(SomeAssemblyRequired someAssemblyRequired) {
        C17542s.j(someAssemblyRequired, "sar");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't add compound model instance. runState:" + runState + " drawState:" + drawState);
                ObjectInstanceId kNone = ObjectInstanceId.Companion.getKNone();
                return kNone;
            } else if (someAssemblyRequired.isEmpty()) {
                this.logger.log("can't load empty assembly");
                ObjectInstanceId kNone2 = ObjectInstanceId.Companion.getKNone();
                return kNone2;
            } else {
                ObjectInstanceId objectInstanceId = new ObjectInstanceId(addSomeAssemblyRequiredModelInstanceNative(this.bridgeHandle, someAssemblyRequired.toJson$decorate_engine_release()));
                return objectInstanceId;
            }
        }
    }

    public final ObjectInstanceId cloneModelInstance(CloneModelInstanceInfo cloneModelInstanceInfo) {
        C17542s.j(cloneModelInstanceInfo, "instanceInfo");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                logError("can't clone instance when engine is not running");
                ObjectInstanceId kNone = ObjectInstanceId.Companion.getKNone();
                return kNone;
            }
            cloneModelInstanceInfo.updateRawFields$decorate_engine_release();
            ObjectInstanceId objectInstanceId = new ObjectInstanceId(cloneModelInstanceNative(this.bridgeHandle, cloneModelInstanceInfo));
            return objectInstanceId;
        }
    }

    public final EraserPickId eraserPick(float f10, float f11) {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    EraserPickId eraserPickId = new EraserPickId(eraserPickNative(this.bridgeHandle, f10, f11));
                    return eraserPickId;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't eraser pick. runState:" + runState + " drawState:" + drawState);
            EraserPickId kNone = EraserPickId.Companion.getKNone();
            return kNone;
        }
    }

    public final boolean execEraserOp(EraserPickOp eraserPickOp, EraserPickId eraserPickId) {
        C17542s.j(eraserPickOp, "op");
        C17542s.j(eraserPickId, "id");
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    if (eraserPickId.isNone()) {
                        this.logger.log("eraser operations require a valid pick id");
                        return false;
                    }
                    boolean execEraserOpNative = execEraserOpNative(this.bridgeHandle, eraserPickOp.ordinal(), eraserPickId.getRawId$decorate_engine_release());
                    return execEraserOpNative;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't exec eraser op. runState:" + runState + " drawState:" + drawState);
            return false;
        }
    }

    public final void flyCamToFixedView(int i10) {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    flyCamToFixedViewNative(this.bridgeHandle, i10);
                    return;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't fly cam to fixed view. runState:" + runState + " drawState:" + drawState);
        }
    }

    public final FlyCamOrbitParams flyCamToPointOfInterest(float f10, float f11, FlyCamOrbitParams flyCamOrbitParams) {
        C17542s.j(flyCamOrbitParams, "orbitParams");
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    long[] packed$decorate_engine_release = flyCamOrbitParams.toPacked$decorate_engine_release();
                    FlyCamOrbitParams fromPacked$decorate_engine_release = FlyCamOrbitParams.Companion.fromPacked$decorate_engine_release(flyCamToPointOfInterestNative(this.bridgeHandle, ObjectInstanceId.Companion.getKNone().getIntValue(), f10, f11, packed$decorate_engine_release[0], packed$decorate_engine_release[1]));
                    return fromPacked$decorate_engine_release;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't fly cam to point of interest. runState:" + runState + " drawState:" + drawState);
            FlyCamOrbitParams flyCamOrbitParams2 = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
            return flyCamOrbitParams2;
        }
    }

    public final void focusChanged(boolean z10) {
        synchronized (this) {
            focusChangedNative(this.bridgeHandle, z10);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final int getCurrentFixedView() {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    int currentFixedViewNative = getCurrentFixedViewNative(this.bridgeHandle);
                    return currentFixedViewNative;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't get current fixed view. runState:" + runState + " drawState:" + drawState);
            return 0;
        }
    }

    public final DrawState getDrawState() {
        return this._drawState;
    }

    public final EraserCounts getEraserCounts() {
        EraserCounts eraserCounts;
        synchronized (this) {
            long eraserCountsNative = getEraserCountsNative(this.bridgeHandle);
            eraserCounts = new EraserCounts((int) (eraserCountsNative & 4294967295L), (int) ((eraserCountsNative >> 32) & 4294967295L));
        }
        return eraserCounts;
    }

    public final int getFixedViewCount() {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    int fixedViewCountNative = getFixedViewCountNative(this.bridgeHandle);
                    return fixedViewCountNative;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't get fixed view count. runState:" + runState + " drawState:" + drawState);
            return 0;
        }
    }

    public final FlyCamOrbitParams getFlyCamOrbitParams() {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    FlyCamOrbitParams fromPacked$decorate_engine_release = FlyCamOrbitParams.Companion.fromPacked$decorate_engine_release(getFlyCamOrbitParamsNative(this.bridgeHandle));
                    return fromPacked$decorate_engine_release;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't get fly cam orbit params. runState:" + runState + " drawState:" + drawState);
            FlyCamOrbitParams flyCamOrbitParams = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
            return flyCamOrbitParams;
        }
    }

    public final ObjectInstanceId getInstanceParent(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "instanceId");
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    ObjectInstanceId objectInstanceId2 = new ObjectInstanceId(getInstanceParentNative(this.bridgeHandle, objectInstanceId.getIntValue()));
                    return objectInstanceId2;
                }
            }
            logError("can't get instance parent unless engine is running and has window for drawing");
            ObjectInstanceId kNone = ObjectInstanceId.Companion.getKNone();
            return kNone;
        }
    }

    public final int getLastFixedView() {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    int lastFixedViewNative = getLastFixedViewNative(this.bridgeHandle);
                    return lastFixedViewNative;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't get current fixed view. runState:" + runState + " drawState:" + drawState);
            return 0;
        }
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final Map<ObjectInstanceId, ModelInstanceDetails> getModelInstancesDetails(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "parentInstanceId");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't get instance info. runState:" + runState + " drawState:" + drawState);
                return null;
            }
            C16807N n10 = C16807N.f139792a;
            try {
                return InstancesDetailsInternal.Companion.fromJson$decorate_engine_release(getInstanceInfoJsonNative(this.bridgeHandle, objectInstanceId.getIntValue())).getModelInstanceDetailsMap$decorate_engine_release();
            } catch (Exception e10) {
                logError(String.valueOf(e10));
                return null;
            }
        }
    }

    public final ModelScreenTransform getModelScreenTransform(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "id");
        return getModelScreenTransform(objectInstanceId, false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final View.OnTouchListener getOnDevTouchListener() {
        return new a(this);
    }

    public final PanZoomRegion getPanZoomRegion() {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    PanZoomRegion unpackPZR = unpackPZR(getPanZoomRegionNative(this.bridgeHandle));
                    return unpackPZR;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't get pan/zoom region. runState:" + runState + " drawState:" + drawState);
            PanZoomRegion unzoomed = PanZoomRegion.Companion.getUnzoomed();
            return unzoomed;
        }
    }

    public final List<ObjectInstanceId> getRoomPolygonIdList() {
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't get instance info. runState:" + runState + " drawState:" + drawState);
                return null;
            }
            C16807N n10 = C16807N.f139792a;
            try {
                return InstancesDetailsInternal.Companion.fromJson$decorate_engine_release(getInstanceInfoJsonNative(this.bridgeHandle, ObjectInstanceId.Companion.getKNone().getIntValue())).getRoomSurfaceIdList$decorate_engine_release();
            } catch (Exception e10) {
                logError(String.valueOf(e10));
                return null;
            }
        }
    }

    public final Set<RoomPolygonType> getRoomPolygonTypeSet() {
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't get instance info. runState:" + runState + " drawState:" + drawState);
                return null;
            }
            C16807N n10 = C16807N.f139792a;
            try {
                return InstancesDetailsInternal.Companion.fromJson$decorate_engine_release(getInstanceInfoJsonNative(this.bridgeHandle, ObjectInstanceId.Companion.getKNone().getIntValue())).getRoomSurfaceTypeSet$decorate_engine_release();
            } catch (Exception e10) {
                logError(String.valueOf(e10));
                return null;
            }
        }
    }

    public final Map<ObjectInstanceId, RoomSurfaceDetails> getRoomSurfacesDetails() {
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't get instance info. runState:" + runState + " drawState:" + drawState);
                return null;
            }
            C16807N n10 = C16807N.f139792a;
            try {
                return InstancesDetailsInternal.Companion.fromJson$decorate_engine_release(getInstanceInfoJsonNative(this.bridgeHandle, ObjectInstanceId.Companion.getKNone().getIntValue())).getRoomSurfaceDetailsMap$decorate_engine_release();
            } catch (Exception e10) {
                logError(String.valueOf(e10));
                return null;
            }
        }
    }

    public final RunState getRunState() {
        return this._runState;
    }

    public final StateListener getStateListener() {
        return this.stateListener;
    }

    public final long getUniqueInstanceId() {
        return getBridgeUniqueIdNative(this.bridgeHandle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.decorate_engine.ObjectInstanceId hitTest(float r4, float r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.sugarcube.decorate_engine.DecorateEngine$RunState r0 = r3.getRunState()     // Catch:{ all -> 0x002d }
            com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Running     // Catch:{ all -> 0x002d }
            if (r0 != r1) goto L_0x0031
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r0 = r3.getDrawState()     // Catch:{ all -> 0x002d }
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r1 = com.sugarcube.decorate_engine.DecorateEngine.DrawState.Drawing     // Catch:{ all -> 0x002d }
            if (r0 == r1) goto L_0x0012
            goto L_0x0031
        L_0x0012:
            com.sugarcube.decorate_engine.ObjectInstanceId r0 = new com.sugarcube.decorate_engine.ObjectInstanceId     // Catch:{ all -> 0x002d }
            long r1 = r3.bridgeHandle     // Catch:{ all -> 0x002d }
            int r4 = r3.hitTestNative(r1, r4, r5)     // Catch:{ all -> 0x002d }
            r0.<init>(r4)     // Catch:{ all -> 0x002d }
            boolean r4 = r0.isModel()     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002f
            if (r6 != 0) goto L_0x002f
            com.sugarcube.decorate_engine.ObjectInstanceId$Companion r4 = com.sugarcube.decorate_engine.ObjectInstanceId.Companion     // Catch:{ all -> 0x002d }
            com.sugarcube.decorate_engine.ObjectInstanceId r4 = r4.getKNone()     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x002d:
            r4 = move-exception
            goto L_0x003e
        L_0x002f:
            monitor-exit(r3)
            return r0
        L_0x0031:
            java.lang.String r4 = "can't hit test unless engine is running and has window for drawing"
            r3.logError(r4)     // Catch:{ all -> 0x002d }
            com.sugarcube.decorate_engine.ObjectInstanceId$Companion r4 = com.sugarcube.decorate_engine.ObjectInstanceId.Companion     // Catch:{ all -> 0x002d }
            com.sugarcube.decorate_engine.ObjectInstanceId r4 = r4.getKNone()     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x003e:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngine.hitTest(float, float, boolean):com.sugarcube.decorate_engine.ObjectInstanceId");
    }

    public final boolean loadSceneLayout(SceneLayout sceneLayout) {
        C17542s.j(sceneLayout, "layout");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't load scene layout. runState:" + runState + " drawState:" + drawState);
                return false;
            } else if (sceneLayout.isEmpty()) {
                this.logger.log("can't load empty layout");
                return false;
            } else {
                boolean loadSceneLayoutNative = loadSceneLayoutNative(this.bridgeHandle, sceneLayout.toJson$decorate_engine_release());
                return loadSceneLayoutNative;
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0044=Splitter:B:21:0x0044, B:25:0x004d=Splitter:B:25:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void moveModelInstance(com.sugarcube.decorate_engine.ObjectInstanceId r8, com.sugarcube.decorate_engine.ModelScreenTransform r9) {
        /*
            r7 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "xf"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            monitor-enter(r7)
            com.sugarcube.decorate_engine.DecorateEngine$RunState r0 = r7.getRunState()     // Catch:{ all -> 0x003e }
            com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Running     // Catch:{ all -> 0x003e }
            if (r0 != r1) goto L_0x004d
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r0 = r7.getDrawState()     // Catch:{ all -> 0x003e }
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r1 = com.sugarcube.decorate_engine.DecorateEngine.DrawState.Drawing     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x001c
            goto L_0x004d
        L_0x001c:
            boolean r0 = r8.isNone()     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0044
            boolean r0 = r8.isAll()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0029
            goto L_0x0044
        L_0x0029:
            long r5 = r9.toPacked$decorate_engine_release()     // Catch:{ all -> 0x003e }
            r0 = 0
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0040
            long r2 = r7.bridgeHandle     // Catch:{ all -> 0x003e }
            int r4 = r8.getIntValue()     // Catch:{ all -> 0x003e }
            r1 = r7
            r1.moveModelInstanceNative(r2, r4, r5)     // Catch:{ all -> 0x003e }
            goto L_0x0040
        L_0x003e:
            r8 = move-exception
            goto L_0x0073
        L_0x0040:
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x003e }
            monitor-exit(r7)
            return
        L_0x0044:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r8 = r7.logger     // Catch:{ all -> 0x003e }
            java.lang.String r9 = "moveModelInstance requires valid singular id"
            r8.log(r9)     // Catch:{ all -> 0x003e }
            monitor-exit(r7)
            return
        L_0x004d:
            com.sugarcube.decorate_engine.DecorateEngine$RunState r8 = r7.getRunState()     // Catch:{ all -> 0x003e }
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r9 = r7.getDrawState()     // Catch:{ all -> 0x003e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x003e }
            r0.<init>()     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "can't move model instance. runState:"
            r0.append(r1)     // Catch:{ all -> 0x003e }
            r0.append(r8)     // Catch:{ all -> 0x003e }
            java.lang.String r8 = " drawState:"
            r0.append(r8)     // Catch:{ all -> 0x003e }
            r0.append(r9)     // Catch:{ all -> 0x003e }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x003e }
            r7.logError(r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r7)
            return
        L_0x0073:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngine.moveModelInstance(com.sugarcube.decorate_engine.ObjectInstanceId, com.sugarcube.decorate_engine.ModelScreenTransform):void");
    }

    public final void removeModelInstance(ObjectInstanceId objectInstanceId) {
        C17542s.j(objectInstanceId, "id");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't remove model instance. runState:" + runState + " drawState:" + drawState);
            } else if (objectInstanceId.isNone()) {
                this.logger.log("removeModelInstance requires valid id.");
            } else {
                removeModelInstanceNative(this.bridgeHandle, objectInstanceId.getIntValue());
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    public final void restoreWindowFit() {
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    setPanZoomRegionNative(this.bridgeHandle, 0.0f, 0.0f, 0.0f);
                    return;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't set pan/zoom region. runState:" + runState + " drawState:" + drawState);
        }
    }

    public final boolean runTests(DecorateEngineSetupInfo decorateEngineSetupInfo) {
        C17542s.j(decorateEngineSetupInfo, "setupInfo");
        synchronized (this) {
            try {
                if (!decorateEngineSetupInfo.runHeadlessUnitTests) {
                    boolean z10 = decorateEngineSetupInfo.runHeadlessSmokeTests;
                }
                long createRenderEngineNative = createRenderEngineNative(decorateEngineSetupInfo);
                this.bridgeHandle = createRenderEngineNative;
                if (createRenderEngineNative == 0) {
                    return false;
                }
                boolean runRenderEngineNative = runRenderEngineNative(createRenderEngineNative);
                destroyRenderEngineNative(this.bridgeHandle);
                this.bridgeHandle = 0;
                return runRenderEngineNative;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SceneLayout saveSceneLayout(SceneLayoutFormat sceneLayoutFormat, LayoutThumbnailSpec layoutThumbnailSpec) {
        C17542s.j(sceneLayoutFormat, "layoutFormat");
        C17542s.j(layoutThumbnailSpec, "thumbnailSpec");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't save scene layout. runState:" + runState + " drawState:" + drawState);
                return null;
            }
            this.logger.log("saveSceneLayout()");
            String saveSceneLayoutNative = saveSceneLayoutNative(this.bridgeHandle, sceneLayoutFormat.ordinal(), layoutThumbnailSpec.getValue());
            SceneLayout.Companion companion = SceneLayout.Companion;
            if (saveSceneLayoutNative == null || saveSceneLayoutNative.length() == 0) {
                saveSceneLayoutNative = "";
            }
            SceneLayout fromJson$decorate_engine_release = companion.fromJson$decorate_engine_release(saveSceneLayoutNative);
            return fromJson$decorate_engine_release;
        }
    }

    public final void setCustomWallColor(ObjectInstanceId objectInstanceId, Integer num) {
        C17542s.j(objectInstanceId, "instanceId");
        synchronized (this) {
            try {
                if (getRunState() == RunState.Running) {
                    if (getDrawState() == DrawState.Drawing) {
                        setCustomWallColorNative(this.bridgeHandle, objectInstanceId.getIntValue(), num != null ? num.intValue() : 0);
                        C16807N n10 = C16807N.f139792a;
                        return;
                    }
                }
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't set custom wall color. runState:" + runState + " drawState:" + drawState);
            } finally {
            }
        }
    }

    public final FlyCamOrbitParams setFlyCamOrbitParams(FlyCamOrbitParams flyCamOrbitParams) {
        C17542s.j(flyCamOrbitParams, "orbitParams");
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    long[] packed$decorate_engine_release = flyCamOrbitParams.toPacked$decorate_engine_release();
                    FlyCamOrbitParams fromPacked$decorate_engine_release = FlyCamOrbitParams.Companion.fromPacked$decorate_engine_release(setFlyCamOrbitParamsNative(this.bridgeHandle, packed$decorate_engine_release[0], packed$decorate_engine_release[1]));
                    return fromPacked$decorate_engine_release;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't set fly cam orbit params. runState:" + runState + " drawState:" + drawState);
            FlyCamOrbitParams flyCamOrbitParams2 = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
            return flyCamOrbitParams2;
        }
    }

    public final void setModelInstanceSelected(ObjectInstanceId objectInstanceId, boolean z10) {
        C17542s.j(objectInstanceId, "id");
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't set model instance selection state. runState:" + runState + " drawState:" + drawState);
            } else if (objectInstanceId.isNone()) {
                this.logger.log("setModelInstanceSelected requires valid id");
            } else {
                setModelInstanceSelectedNative(this.bridgeHandle, objectInstanceId.getIntValue(), z10);
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    public final void setModelInstancesVisible(boolean z10) {
        synchronized (this) {
            if (getRunState() != RunState.Running) {
                RunState runState = getRunState();
                DrawState drawState = getDrawState();
                logError("can't change model instance visibility. runState:" + runState + " drawState:" + drawState);
                return;
            }
            setModelInstancesVisibleNative(this.bridgeHandle, z10);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final PanZoomRegion setPanZoomRegion(PanZoomRegion panZoomRegion) {
        C17542s.j(panZoomRegion, "pzRegion");
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    Float[] pixelCenterForPZR = pixelCenterForPZR(panZoomRegion);
                    PanZoomRegion unpackPZR = unpackPZR(setPanZoomRegionNative(this.bridgeHandle, pixelCenterForPZR[0].floatValue(), pixelCenterForPZR[1].floatValue(), panZoomRegion.zoom));
                    return unpackPZR;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't set pan/zoom region. runState:" + runState + " drawState:" + drawState);
            PanZoomRegion unzoomed = PanZoomRegion.Companion.getUnzoomed();
            return unzoomed;
        }
    }

    public final int setSelectionOutlineColor(int i10) {
        int selectionOutlineColorNative;
        synchronized (this) {
            selectionOutlineColorNative = setSelectionOutlineColorNative(this.bridgeHandle, i10);
        }
        return selectionOutlineColorNative;
    }

    public final boolean setupAndRun(DecorateEngineSetupInfo decorateEngineSetupInfo) {
        boolean z10;
        C17542s.j(decorateEngineSetupInfo, "setupInfo");
        if (!Companion.isDeviceSupported()) {
            this.logger.log("device is not supported!");
            setRunState(RunState.Error, "setupAndRun");
            return false;
        }
        synchronized (this) {
            this.logger.log("setupAndRun()");
            this.setupInfo = decorateEngineSetupInfo;
            this.context = decorateEngineSetupInfo.getContext$decorate_engine_release();
            this.sceneLayoutJson = decorateEngineSetupInfo.layoutText;
            z10 = setupAndRunIfReady();
        }
        return z10;
    }

    public final void surfaceChanged(Surface surface2, int i10, int i11, int i12) {
        C17542s.j(surface2, "surface");
        synchronized (this) {
            try {
                this.windowSize = new Float[]{Float.valueOf((float) i11), Float.valueOf((float) i12)};
                this.surface = surface2;
                RunState runState = getRunState();
                RunState runState2 = RunState.Running;
                if (runState == runState2) {
                    this.logger.log("surfaceChanged() - resized or restoring");
                    DrawState drawState = getDrawState();
                    DrawState drawState2 = DrawState.NoWindow;
                    if (drawState == drawState2) {
                        if (!surfaceCreatedNative(this.bridgeHandle, surface2, i11, i12)) {
                            logError("renderer failed handling window restoration");
                            teardown();
                            setStates(RunState.Error, drawState2, "surfaceChanged");
                        }
                        setDrawState(DrawState.Drawing, "surfaceChanged");
                    } else {
                        if (!surfaceChangedNative(this.bridgeHandle, surface2, i11, i12)) {
                            logError("renderer failed handling window surface resize");
                            teardown();
                            setStates(RunState.Error, drawState2, "surfaceChanged");
                        }
                    }
                } else if (getRunState().compareTo(runState2) < 0) {
                    this.logger.log("surfaceChanged() - not running yet");
                    setupAndRunIfReady();
                } else {
                    this.logger.log("surfaceChange() - engine done running. ignoring.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void surfaceCreated(Surface surface2) {
        C17542s.j(surface2, "surface");
    }

    public final void surfaceDestroyed() {
        synchronized (this) {
            try {
                this.surface = null;
                this.windowSize = new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f)};
                if (getDrawState().compareTo(DrawState.HasWindow) >= 0) {
                    setDrawState(DrawState.NoWindow, "surfaceDestroyed");
                    surfaceDestroyedNative(this.bridgeHandle);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void surfaceRedrawNeeded(Surface surface2) {
        C17542s.j(surface2, "surface");
    }

    public final void teardown() {
        synchronized (this) {
            try {
                this.surface = null;
                this.windowSize = new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f)};
                if (Companion.isDeviceSupported()) {
                    if (getRunState().compareTo(RunState.New) > 0) {
                        RunState runState = getRunState();
                        RunState runState2 = RunState.TearingDown;
                        if (runState.compareTo(runState2) < 0) {
                            setRunState(runState2, "teardown");
                            long j10 = this.bridgeHandle;
                            this.bridgeHandle = 0;
                            int loggedErrorCountNative = getLoggedErrorCountNative(j10);
                            if (loggedErrorCountNative > 0) {
                                Logger logger2 = this.logger;
                                logger2.log(loggedErrorCountNative + " errors occurred in native code!");
                            }
                            destroyRenderEngineNative(j10);
                            setStates(RunState.TornDown, DrawState.NoWindow, "teardown");
                        }
                    }
                    stopLogPipeLoop();
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (Exception e10) {
                logError("teardown error\n" + e10);
                setStates(RunState.Error, DrawState.NoWindow, "teardown");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ FlyCamOrbitParams flyCamToPointOfInterest$default(DecorateEngine decorateEngine, ObjectInstanceId objectInstanceId, FlyCamOrbitParams flyCamOrbitParams, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            flyCamOrbitParams = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
        }
        return decorateEngine.flyCamToPointOfInterest(objectInstanceId, flyCamOrbitParams);
    }

    private final float pixToProp(float f10, float f11) {
        return boundProp(((f10 / (f11 - 1.0f)) * 2.0f) - 1.0f);
    }

    private final float propToPix(float f10, float f11) {
        return ((boundProp(f10) + 1.0f) / 2.0f) * (f11 - 1.0f);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0046=Splitter:B:21:0x0046, B:17:0x0038=Splitter:B:17:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.sugarcube.decorate_engine.ModelScreenTransform getModelScreenTransform(com.sugarcube.decorate_engine.ObjectInstanceId r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            monitor-enter(r2)
            com.sugarcube.decorate_engine.DecorateEngine$RunState r0 = r2.getRunState()     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.DecorateEngine$RunState r1 = com.sugarcube.decorate_engine.DecorateEngine.RunState.Running     // Catch:{ all -> 0x0036 }
            if (r0 != r1) goto L_0x0046
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r0 = r2.getDrawState()     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r1 = com.sugarcube.decorate_engine.DecorateEngine.DrawState.Drawing     // Catch:{ all -> 0x0036 }
            if (r0 == r1) goto L_0x0017
            goto L_0x0046
        L_0x0017:
            boolean r0 = r3.isNone()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0038
            boolean r0 = r3.isAll()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0024
            goto L_0x0038
        L_0x0024:
            long r0 = r2.bridgeHandle     // Catch:{ all -> 0x0036 }
            int r3 = r3.getIntValue()     // Catch:{ all -> 0x0036 }
            long r3 = r2.getModelInstanceScreenTransformNative(r0, r3, r4)     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.ModelScreenTransform$Companion r0 = com.sugarcube.decorate_engine.ModelScreenTransform.Companion     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.ModelScreenTransform r3 = r0.fromPacked$decorate_engine_release(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return r3
        L_0x0036:
            r3 = move-exception
            goto L_0x0071
        L_0x0038:
            com.sugarcube.decorate_engine.DecorateEngine$Logger r3 = r2.logger     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "getModelScreenTransform requires valid singular id"
            r3.log(r4)     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.ModelScreenTransform r3 = new com.sugarcube.decorate_engine.ModelScreenTransform     // Catch:{ all -> 0x0036 }
            r3.<init>()     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return r3
        L_0x0046:
            com.sugarcube.decorate_engine.DecorateEngine$RunState r3 = r2.getRunState()     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.DecorateEngine$DrawState r4 = r2.getDrawState()     // Catch:{ all -> 0x0036 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r0.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "can't get model screen transform. runState:"
            r0.append(r1)     // Catch:{ all -> 0x0036 }
            r0.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = " drawState:"
            r0.append(r3)     // Catch:{ all -> 0x0036 }
            r0.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0036 }
            r2.logError(r3)     // Catch:{ all -> 0x0036 }
            com.sugarcube.decorate_engine.ModelScreenTransform r3 = new com.sugarcube.decorate_engine.ModelScreenTransform     // Catch:{ all -> 0x0036 }
            r3.<init>()     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return r3
        L_0x0071:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngine.getModelScreenTransform(com.sugarcube.decorate_engine.ObjectInstanceId, boolean):com.sugarcube.decorate_engine.ModelScreenTransform");
    }

    public final FlyCamOrbitParams flyCamToPointOfInterest(ObjectInstanceId objectInstanceId, FlyCamOrbitParams flyCamOrbitParams) {
        C17542s.j(objectInstanceId, "id");
        C17542s.j(flyCamOrbitParams, "orbitParams");
        synchronized (this) {
            if (getRunState() == RunState.Running) {
                if (getDrawState() == DrawState.Drawing) {
                    long[] packed$decorate_engine_release = flyCamOrbitParams.toPacked$decorate_engine_release();
                    FlyCamOrbitParams fromPacked$decorate_engine_release = FlyCamOrbitParams.Companion.fromPacked$decorate_engine_release(flyCamToPointOfInterestNative(this.bridgeHandle, objectInstanceId.getIntValue(), 0.0f, 0.0f, packed$decorate_engine_release[0], packed$decorate_engine_release[1]));
                    return fromPacked$decorate_engine_release;
                }
            }
            RunState runState = getRunState();
            DrawState drawState = getDrawState();
            logError("can't fly cam to point of interest. runState:" + runState + " drawState:" + drawState);
            FlyCamOrbitParams flyCamOrbitParams2 = new FlyCamOrbitParams(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 63, (DefaultConstructorMarker) null);
            return flyCamOrbitParams2;
        }
    }
}
