package com.contentsquare.android.internal.features.sessionreplay.processing;

import D8.c;
import F8.g;
import XH.C16807N;
import Y8.d;
import Y8.e;
import YH.C16877v;
import a9.C6783a1;
import a9.C6785a3;
import a9.C6792b2;
import a9.C6806d0;
import a9.C6819e5;
import a9.C6824f2;
import a9.C6825f3;
import a9.C6846i0;
import a9.C6850i4;
import a9.C6860j6;
import a9.C6863k1;
import a9.C6868k6;
import a9.C6871l1;
import a9.C6878m0;
import a9.C6888n2;
import a9.C6889n3;
import a9.C6900o6;
import a9.C6902p0;
import a9.C6911q1;
import a9.C6916q6;
import a9.C6921r4;
import a9.C6933t0;
import a9.C6941u0;
import a9.C6943u2;
import a9.C6947u6;
import a9.C6963w6;
import a9.C6968x3;
import a9.C6971x6;
import a9.C6974y1;
import a9.C6978y5;
import a9.C6985z4;
import a9.E;
import a9.F3;
import a9.F5;
import a9.F6;
import a9.G0;
import a9.H1;
import a9.H6;
import a9.I5;
import a9.I6;
import a9.K;
import a9.K6;
import a9.M1;
import a9.M4;
import a9.N2;
import a9.N3;
import a9.N5;
import a9.P5;
import a9.S1;
import a9.U3;
import a9.V;
import a9.Z2;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import com.contentsquare.android.api.bridge.flutter.FlutterInterface;
import com.contentsquare.android.api.bridge.flutter.f;
import com.contentsquare.android.sdk.Q0;
import com.contentsquare.android.sdk.m1;
import jI.C17423j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import k8.C8465a;
import k8.C8466b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import z8.C9036b;

@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ¼\u00012\u00020\u00012\u00020\u0002:\u0002½\u0001B\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\b\b\u0002\u00105\u001a\u000204\u0012\b\b\u0002\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010;\u001a\u00020:\u0012\b\b\u0002\u0010=\u001a\u00020<\u0012\b\b\u0002\u0010?\u001a\u00020>\u0012\b\b\u0002\u0010A\u001a\u00020@\u0012\b\b\u0002\u0010C\u001a\u00020B\u0012\b\b\u0002\u0010E\u001a\u00020D\u0012\b\b\u0002\u0010G\u001a\u00020F\u0012\b\b\u0002\u0010I\u001a\u00020H\u0012\b\b\u0002\u0010K\u001a\u00020J\u0012\b\b\u0002\u0010M\u001a\u00020L\u0012\b\b\u0002\u0010O\u001a\u00020N\u0012\b\b\u0002\u0010Q\u001a\u00020P\u0012\b\b\u0002\u0010S\u001a\u00020R\u0012\b\b\u0002\u0010U\u001a\u00020T\u0012\b\b\u0002\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u000f\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b[\u0010\\J=\u0010g\u001a\u00020Z2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020a2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00192\u0006\u0010f\u001a\u00020eH\u0003¢\u0006\u0004\bg\u0010hJE\u0010n\u001a\u00020Z2\u0006\u0010i\u001a\u00020_2\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010j2\u0006\u0010m\u001a\u00020a2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00192\u0006\u0010f\u001a\u00020eH\u0003¢\u0006\u0004\bn\u0010oJ%\u0010p\u001a\u00020Z2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00192\u0006\u0010i\u001a\u00020_H\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020r2\u0006\u0010m\u001a\u00020aH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020Z2\u0006\u0010m\u001a\u00020aH\u0003¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020ZH\u0002¢\u0006\u0004\bw\u0010\\J\u0013\u0010x\u001a\u00020Z*\u00020_H\u0002¢\u0006\u0004\bx\u0010yJ\u0015\u0010{\u001a\u00020Z2\u0006\u0010z\u001a\u00020e¢\u0006\u0004\b{\u0010|J\r\u0010}\u001a\u00020Z¢\u0006\u0004\b}\u0010\\J\u0017\u0010~\u001a\u00020Z2\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\b~\u0010vJ\u0018\u0010\u001a\u00020Z2\u0006\u0010^\u001a\u00020]H\u0017¢\u0006\u0005\b\u0010\u0001JR\u0010\u0001\u001a\u00020Z2\u0006\u0010i\u001a\u00020_2\b\u0010\u0001\u001a\u00030\u00012\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010j2\u0006\u0010m\u001a\u00020a2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00192\u0006\u0010f\u001a\u00020eH\u0007¢\u0006\u0006\b\u0001\u0010\u0001JM\u0010\u0001\u001a\u00020Z2\u0006\u0010i\u001a\u00020_2\b\u0010\u0001\u001a\u00030\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010k2\u0006\u0010m\u001a\u00020a2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u00192\u0006\u0010f\u001a\u00020eH\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020Z2\u0007\u0010\u0001\u001a\u00020rH\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020Z2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020ZH\u0007¢\u0006\u0005\b\u0001\u0010\\R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0001R\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0001R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0007\n\u0005\b#\u0010\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0007\n\u0005\b%\u0010\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0004¢\u0006\u0007\n\u0005\b)\u0010 \u0001R\u0017\u0010-\u001a\u0004\u0018\u00010,8\u0002X\u0004¢\u0006\u0007\n\u0005\b-\u0010¡\u0001R\u0017\u0010/\u001a\u0004\u0018\u00010.8\u0002X\u0004¢\u0006\u0007\n\u0005\b/\u0010¢\u0001R\u0015\u00101\u001a\u0002008\u0002X\u0004¢\u0006\u0007\n\u0005\b1\u0010£\u0001R\u0015\u00103\u001a\u0002028\u0002X\u0004¢\u0006\u0007\n\u0005\b3\u0010¤\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0004¢\u0006\u0007\n\u0005\b5\u0010¥\u0001R\u0015\u00107\u001a\u0002068\u0002X\u0004¢\u0006\u0007\n\u0005\b7\u0010¦\u0001R\u0015\u00109\u001a\u0002088\u0002X\u0004¢\u0006\u0007\n\u0005\b9\u0010§\u0001R\u0015\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0007\n\u0005\b;\u0010¨\u0001R\u0015\u0010=\u001a\u00020<8\u0002X\u0004¢\u0006\u0007\n\u0005\b=\u0010©\u0001R\u0015\u0010?\u001a\u00020>8\u0002X\u0004¢\u0006\u0007\n\u0005\b?\u0010ª\u0001R\u0015\u0010C\u001a\u00020B8\u0002X\u0004¢\u0006\u0007\n\u0005\bC\u0010«\u0001R\u0015\u0010G\u001a\u00020F8\u0002X\u0004¢\u0006\u0007\n\u0005\bG\u0010¬\u0001R\u0015\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0007\n\u0005\bK\u0010­\u0001R\u0015\u0010M\u001a\u00020L8\u0002X\u0004¢\u0006\u0007\n\u0005\bM\u0010®\u0001R\u0015\u0010O\u001a\u00020N8\u0002X\u0004¢\u0006\u0007\n\u0005\bO\u0010¯\u0001R\u0015\u0010Q\u001a\u00020P8\u0002X\u0004¢\u0006\u0007\n\u0005\bQ\u0010°\u0001R\u0015\u0010S\u001a\u00020R8\u0002X\u0004¢\u0006\u0007\n\u0005\bS\u0010±\u0001R\u0015\u0010U\u001a\u00020T8\u0002X\u0004¢\u0006\u0007\n\u0005\bU\u0010²\u0001R\u0015\u0010W\u001a\u00020V8\u0002X\u0004¢\u0006\u0007\n\u0005\bW\u0010³\u0001R\u0018\u0010µ\u0001\u001a\u00030´\u00018\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010¸\u0001\u001a\u00030·\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010º\u0001\u001a\u00020e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/contentsquare/android/internal/features/sessionreplay/processing/SessionReplayProcessor;", "La9/j6;", "La9/q1;", "Landroid/app/Application;", "application", "La9/E;", "sessionReplayConfiguration", "La9/k1;", "samplingMode", "La9/a3;", "maskingParameter", "LF8/g;", "deviceInfo", "La9/q6;", "onDrawObserver", "La9/a1;", "liveActivityProvider", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lcom/contentsquare/android/sdk/Q0;", "qualitySettings", "La9/u2;", "batchStorageProcessor", "La9/d0;", "eventsProvidersManager", "", "La9/S1;", "stoppableEventProviders", "La9/N5;", "viewMutationEventProvider", "La9/m0;", "startStopEventProvider", "La9/p0;", "appStateEventProvider", "La9/y1;", "sessionStateManager", "Landroid/os/Handler;", "mainThreadHandler", "La9/K;", "lifecycleCallbacks", "La9/I6;", "throttleOperator", "La9/z4;", "srQuickLink", "La9/K6;", "animationSupervisor", "La9/w6;", "animationCompletionHandler", "La9/n2;", "forceMaskingResolver", "Lcom/contentsquare/android/sdk/m1;", "androidViewToViewLightConverter", "La9/f2;", "screenCapturer", "La9/k6;", "recyclableViewAppearance", "Lk8/a;", "bridgeManager", "La9/t0;", "eventsToBatchProcessor", "La9/I5;", "recordingTypeProvider", "La9/y5;", "recordingStartTimeProvider", "La9/u0;", "lastEventTimeTracker", "La9/i0;", "lastEventTimeProvider", "La9/F5;", "etrScreenEventTracker", "La9/P5;", "etrScreenEventUrlProvider", "La9/o6;", "etrSessionEventTracker", "La9/x6;", "etrSessionEventUrlProvider", "La9/H6;", "urlGenerator", "La9/b2;", "batchDispatcher", "La9/N3;", "screenViewEventProvider", "La9/x3;", "gestureEventViewMapper", "LD8/c;", "logger", "La9/G0;", "sessionReplayTreeLogger", "<init>", "(Landroid/app/Application;La9/E;La9/k1;La9/a3;LF8/g;La9/q6;La9/a1;Landroidx/lifecycle/y;Lcom/contentsquare/android/sdk/Q0;La9/u2;La9/d0;Ljava/util/List;La9/N5;La9/m0;La9/p0;La9/y1;Landroid/os/Handler;La9/K;La9/I6;La9/z4;La9/K6;La9/w6;La9/n2;Lcom/contentsquare/android/sdk/m1;La9/f2;La9/k6;Lk8/a;La9/t0;La9/I5;La9/y5;La9/u0;La9/i0;La9/F5;La9/P5;La9/o6;La9/x6;La9/H6;La9/b2;La9/N3;La9/x3;LD8/c;La9/G0;)V", "LXH/N;", "triggerSingleFrameProcessingManually", "()V", "Landroid/view/Window;", "window", "Lz8/b;", "currentViewLight", "La9/l1;", "currentSessionState", "La9/r4;", "srEvents", "", "shouldForceMasking", "captureAndProcessScreen", "(Landroid/view/Window;Lz8/b;La9/l1;Ljava/util/List;Z)V", "viewLight", "La9/f3;", "La9/f2$c;", "screenCaptureDeferredResult", "sessionState", "completeUiThreadProcess", "(Lz8/b;La9/f3;La9/l1;Ljava/util/List;Z)V", "mapGestureEventsToViewLight", "(Ljava/util/List;Lz8/b;)V", "La9/M1;", "createNewBatch", "(La9/l1;)La9/M1;", "flushCurrentEventBatch", "(La9/l1;)V", "startSessionReplayInFlutterIfNeeded", "setForceMaskingRecursively", "(Lz8/b;)V", "isNewSession", "startProcess", "(Z)V", "stopProcess", "onPreScreenNumberChange", "onDraw", "(Landroid/view/Window;)V", "", "timestamp", "switchToWorkerThread", "(Lz8/b;JLa9/f3;La9/l1;Ljava/util/List;Z)V", "screenCaptureResult", "createSrEvents", "(Lz8/b;JLa9/f2$c;La9/l1;Ljava/util/List;Z)V", "batchToStore", "storeAndSendSrEvents", "(La9/M1;)V", "La9/V;", "crashEvent", "addCrashAndSaveToDisk", "(La9/V;)V", "flushCurrentEventBatchAsync", "Landroid/app/Application;", "La9/E;", "La9/k1;", "La9/q6;", "La9/a1;", "Landroidx/lifecycle/y;", "Lcom/contentsquare/android/sdk/Q0;", "La9/u2;", "La9/d0;", "Ljava/util/List;", "La9/N5;", "La9/m0;", "La9/p0;", "La9/y1;", "Landroid/os/Handler;", "La9/K;", "La9/I6;", "La9/K6;", "La9/w6;", "La9/n2;", "Lcom/contentsquare/android/sdk/m1;", "La9/f2;", "La9/k6;", "Lk8/a;", "La9/t0;", "La9/I5;", "La9/y5;", "La9/i0;", "La9/P5;", "La9/x6;", "La9/H6;", "La9/b2;", "La9/N3;", "La9/x3;", "LD8/c;", "La9/G0;", "", "batchModificationLock", "Ljava/lang/Object;", "Landroidx/lifecycle/x;", "lifecycleObserver", "Landroidx/lifecycle/x;", "isProcessStarted", "Z", "Companion", "a", "library_release"}, k = 1, mv = {1, 8, 0})
public final class SessionReplayProcessor extends C6860j6 implements C6911q1 {
    public static final a Companion = new a();
    private static final long SCREEN_CAPTURE_TIMEOUT_MILLIS = 1000;
    private final m1 androidViewToViewLightConverter;
    private final C6963w6 animationCompletionHandler;
    private final K6 animationSupervisor;
    /* access modifiers changed from: private */
    public final C6902p0 appStateEventProvider;
    private final Application application;
    private final C6792b2 batchDispatcher;
    private final Object batchModificationLock;
    private final C6943u2 batchStorageProcessor;
    private final C8465a bridgeManager;
    private final P5 etrScreenEventUrlProvider;
    private final C6971x6 etrSessionEventUrlProvider;
    private final C6806d0 eventsProvidersManager;
    private final C6933t0 eventsToBatchProcessor;
    private final C6888n2 forceMaskingResolver;
    private final C6968x3 gestureEventViewMapper;
    private boolean isProcessStarted;
    private final C6846i0 lastEventTimeProvider;
    private final K lifecycleCallbacks;
    private final C5220x lifecycleObserver;
    private final C5221y lifecycleOwner;
    private final C6783a1 liveActivityProvider;
    private final c logger;
    private final Handler mainThreadHandler;
    private final C6916q6 onDrawObserver;
    private final Q0 qualitySettings;
    private final C6978y5 recordingStartTimeProvider;
    private final I5 recordingTypeProvider;
    private final C6868k6 recyclableViewAppearance;
    private final C6863k1 samplingMode;
    private final C6824f2 screenCapturer;
    private final N3 screenViewEventProvider;
    private final E sessionReplayConfiguration;
    private final G0 sessionReplayTreeLogger;
    private final C6974y1 sessionStateManager;
    private final C6878m0 startStopEventProvider;
    private final List<S1> stoppableEventProviders;
    private final I6 throttleOperator;
    private final H6 urlGenerator;
    private final N5 viewMutationEventProvider;

    public static final class a {
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/contentsquare/android/internal/features/sessionreplay/processing/SessionReplayProcessor$b", "Landroidx/lifecycle/h;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SessionReplayProcessor f46836a;

        public b(SessionReplayProcessor sessionReplayProcessor) {
            this.f46836a = sessionReplayProcessor;
        }

        public final void onStart(C5221y yVar) {
            C17542s.j(yVar, "owner");
            C6902p0 access$getAppStateEventProvider$p = this.f46836a.appStateEventProvider;
            synchronized (access$getAppStateEventProvider$p) {
                long currentTimeMillis = System.currentTimeMillis();
                U3 u32 = U3.FOREGROUND;
                access$getAppStateEventProvider$p.f42789a.b(new C6850i4(currentTimeMillis, u32));
                c cVar = access$getAppStateEventProvider$p.f42790b;
                cVar.f("Session Replay state event added: " + u32);
            }
        }

        public final void onStop(C5221y yVar) {
            C17542s.j(yVar, "owner");
            C6902p0 access$getAppStateEventProvider$p = this.f46836a.appStateEventProvider;
            synchronized (access$getAppStateEventProvider$p) {
                long currentTimeMillis = System.currentTimeMillis();
                U3 u32 = U3.BACKGROUND;
                access$getAppStateEventProvider$p.f42789a.b(new C6850i4(currentTimeMillis, u32));
                c cVar = access$getAppStateEventProvider$p.f42790b;
                cVar.f("Session Replay state event added: " + u32);
            }
            this.f46836a.flushCurrentEventBatchAsync();
        }
    }

    public SessionReplayProcessor(Application application2, E e10, C6863k1 k1Var, C6785a3 a3Var, g gVar, C6916q6 q6Var, C6783a1 a1Var, C5221y yVar, Q0 q02, C6943u2 u2Var, C6806d0 d0Var, List<? extends S1> list, N5 n52, C6878m0 m0Var, C6902p0 p0Var, C6974y1 y1Var, Handler handler, K k10, I6 i62, C6985z4 z4Var, K6 k62, C6963w6 w6Var, C6888n2 n2Var, m1 m1Var, C6824f2 f2Var, C6868k6 k6Var, C8465a aVar, C6933t0 t0Var, I5 i52, C6978y5 y5Var, C6941u0 u0Var, C6846i0 i0Var, F5 f52, P5 p52, C6900o6 o6Var, C6971x6 x6Var, H6 h62, C6792b2 b2Var, N3 n32, C6968x3 x3Var, c cVar, G0 g02) {
        Application application3 = application2;
        E e11 = e10;
        C6916q6 q6Var2 = q6Var;
        C6783a1 a1Var2 = a1Var;
        C5221y yVar2 = yVar;
        Q0 q03 = q02;
        C6943u2 u2Var2 = u2Var;
        C6806d0 d0Var2 = d0Var;
        List<? extends S1> list2 = list;
        N5 n53 = n52;
        C6878m0 m0Var2 = m0Var;
        C6902p0 p0Var2 = p0Var;
        C6974y1 y1Var2 = y1Var;
        K k11 = k10;
        C17542s.j(application3, "application");
        C17542s.j(e11, "sessionReplayConfiguration");
        C17542s.j(k1Var, "samplingMode");
        C17542s.j(a3Var, "maskingParameter");
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(q6Var2, "onDrawObserver");
        C17542s.j(a1Var2, "liveActivityProvider");
        C17542s.j(yVar2, "lifecycleOwner");
        C17542s.j(q03, "qualitySettings");
        C17542s.j(u2Var2, "batchStorageProcessor");
        C17542s.j(d0Var2, "eventsProvidersManager");
        C17542s.j(list2, "stoppableEventProviders");
        C17542s.j(n53, "viewMutationEventProvider");
        C17542s.j(m0Var2, "startStopEventProvider");
        C17542s.j(p0Var2, "appStateEventProvider");
        C17542s.j(y1Var2, "sessionStateManager");
        C17542s.j(handler, "mainThreadHandler");
        C17542s.j(k10, "lifecycleCallbacks");
        C17542s.j(i62, "throttleOperator");
        C17542s.j(z4Var, "srQuickLink");
        C17542s.j(n2Var, "forceMaskingResolver");
        C17542s.j(m1Var, "androidViewToViewLightConverter");
        C17542s.j(f2Var, "screenCapturer");
        C17542s.j(k6Var, "recyclableViewAppearance");
        C17542s.j(aVar, "bridgeManager");
        C6933t0 t0Var2 = t0Var;
        C17542s.j(t0Var2, "eventsToBatchProcessor");
        C17542s.j(i52, "recordingTypeProvider");
        C17542s.j(y5Var, "recordingStartTimeProvider");
        C17542s.j(u0Var, "lastEventTimeTracker");
        C17542s.j(i0Var, "lastEventTimeProvider");
        C17542s.j(f52, "etrScreenEventTracker");
        C17542s.j(p52, "etrScreenEventUrlProvider");
        C17542s.j(o6Var, "etrSessionEventTracker");
        C17542s.j(x6Var, "etrSessionEventUrlProvider");
        C17542s.j(h62, "urlGenerator");
        C17542s.j(b2Var, "batchDispatcher");
        C17542s.j(n32, "screenViewEventProvider");
        C17542s.j(x3Var, "gestureEventViewMapper");
        C17542s.j(cVar, "logger");
        C17542s.j(g02, "sessionReplayTreeLogger");
        this.application = application3;
        this.sessionReplayConfiguration = e11;
        this.samplingMode = k1Var;
        this.onDrawObserver = q6Var2;
        this.liveActivityProvider = a1Var2;
        this.lifecycleOwner = yVar2;
        this.qualitySettings = q03;
        this.batchStorageProcessor = u2Var2;
        this.eventsProvidersManager = d0Var2;
        this.stoppableEventProviders = list2;
        this.viewMutationEventProvider = n53;
        this.startStopEventProvider = m0Var2;
        this.appStateEventProvider = p0Var2;
        this.sessionStateManager = y1Var2;
        this.mainThreadHandler = handler;
        this.lifecycleCallbacks = k10;
        I6 i63 = i62;
        this.throttleOperator = i63;
        this.animationSupervisor = k62;
        C6963w6 w6Var2 = w6Var;
        this.animationCompletionHandler = w6Var2;
        this.forceMaskingResolver = n2Var;
        this.androidViewToViewLightConverter = m1Var;
        this.screenCapturer = f2Var;
        this.recyclableViewAppearance = k6Var;
        C6933t0 t0Var3 = t0Var2;
        this.bridgeManager = aVar;
        this.eventsToBatchProcessor = t0Var3;
        this.recordingTypeProvider = i52;
        C6941u0 u0Var2 = u0Var;
        this.recordingStartTimeProvider = y5Var;
        F5 f53 = f52;
        this.lastEventTimeProvider = i0Var;
        C6900o6 o6Var2 = o6Var;
        this.etrScreenEventUrlProvider = p52;
        this.etrSessionEventUrlProvider = x6Var;
        this.urlGenerator = h62;
        this.batchDispatcher = b2Var;
        this.screenViewEventProvider = n32;
        this.gestureEventViewMapper = x3Var;
        this.logger = cVar;
        this.sessionReplayTreeLogger = g02;
        this.batchModificationLock = new Object();
        this.lifecycleObserver = new b(this);
        q6Var.getClass();
        C17542s.j(this, "<set-?>");
        q6Var2.f42820c = this;
        C17542s.j(i63, "<set-?>");
        q6Var2.f42819b = i63;
        synchronized (t0Var) {
            C17542s.j(u0Var2, "listener");
            t0Var3.f42862d.add(u0Var2);
        }
        t0Var3.c(f53);
        t0Var3.c(o6Var2);
        if (w6Var2 != null) {
            C17542s.j(this, "<set-?>");
            w6Var2.f42926c = this;
        }
    }

    private final void captureAndProcessScreen(Window window, C9036b bVar, C6871l1 l1Var, List<? extends C6921r4> list, boolean z10) {
        C6824f2 f2Var = this.screenCapturer;
        Q0 q02 = this.qualitySettings;
        q02.getClass();
        float j10 = com.contentsquare.android.core.features.config.model.a.values()[q02.f47131h].j();
        f2Var.getClass();
        C17542s.j(window, "window");
        completeUiThreadProcess(bVar, f2Var.f42549a.a(window, j10), l1Var, list, z10);
    }

    private final void completeUiThreadProcess(C9036b bVar, C6825f3<C6824f2.c> f3Var, C6871l1 l1Var, List<? extends C6921r4> list, boolean z10) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.qualitySettings.d();
            this.logger.f("Switching to worker thread");
            switchToWorkerThread(bVar, currentTimeMillis, f3Var, l1Var, list, z10);
        } catch (Exception e10) {
            H1.a(this.logger, "Something went wrong on completeUiThreadProcess.", e10);
        }
    }

    private final M1 createNewBatch(C6871l1 l1Var) {
        M1 a10;
        synchronized (this.batchModificationLock) {
            a10 = this.eventsToBatchProcessor.a(this.urlGenerator.a(l1Var));
            this.eventsToBatchProcessor.b();
        }
        return a10;
    }

    private final void flushCurrentEventBatch(C6871l1 l1Var) {
        storeAndSendSrEvents(createNewBatch(l1Var));
    }

    /* access modifiers changed from: private */
    public static final void flushCurrentEventBatchAsync$lambda$13(SessionReplayProcessor sessionReplayProcessor, List list, C6871l1 l1Var) {
        C17542s.j(sessionReplayProcessor, "this$0");
        C17542s.j(list, "$currentSrEvents");
        C17542s.j(l1Var, "$currentSessionState");
        synchronized (sessionReplayProcessor.batchModificationLock) {
            sessionReplayProcessor.eventsToBatchProcessor.d(list);
            sessionReplayProcessor.flushCurrentEventBatch(l1Var);
            C16807N n10 = C16807N.f139792a;
        }
    }

    private final void mapGestureEventsToViewLight(List<? extends C6921r4> list, C9036b bVar) {
        T t10;
        ArrayList<Z2> arrayList = new ArrayList<>();
        for (T next : list) {
            if (next instanceof Z2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            this.gestureEventViewMapper.getClass();
            C17542s.j(arrayList, "gestureEvents");
            C17542s.j(bVar, "viewLight");
            LinkedList<C9036b> f10 = bVar.f(C6889n3.f42736c);
            if (C16877v.g0(f10)) {
                for (Z2 z22 : arrayList) {
                    int i10 = z22.f42412d;
                    int i11 = z22.f42413e;
                    Iterator<T> it = f10.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t10 = null;
                            break;
                        }
                        t10 = it.next();
                        C9036b bVar2 = (C9036b) t10;
                        int p10 = bVar2.p();
                        int q10 = bVar2.q();
                        int w10 = bVar2.w();
                        int l10 = bVar2.l();
                        if (i10 >= p10 && i10 < p10 + w10 && i11 >= q10 && i11 < q10 + l10) {
                            break;
                        }
                    }
                    z22.f42411c = (C9036b) t10;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void onPreScreenNumberChange$lambda$6(SessionReplayProcessor sessionReplayProcessor, long j10, List list, C6871l1 l1Var) {
        C17542s.j(sessionReplayProcessor, "this$0");
        C17542s.j(list, "$currentSrEvents");
        C17542s.j(l1Var, "$currentSessionState");
        synchronized (sessionReplayProcessor.batchModificationLock) {
            sessionReplayProcessor.eventsToBatchProcessor.d(list);
            sessionReplayProcessor.screenViewEventProvider.f42163a.d(C16877v.e(new M4(j10)));
            sessionReplayProcessor.flushCurrentEventBatch(l1Var);
            sessionReplayProcessor.screenViewEventProvider.f42163a.d(C16877v.e(new F3(j10)));
            C16807N n10 = C16807N.f139792a;
        }
        sessionReplayProcessor.recordingStartTimeProvider.f42978a = j10;
    }

    private final void setForceMaskingRecursively(C9036b bVar) {
        bVar.X(true);
        bVar.S(true);
        for (C9036b forceMaskingRecursively : bVar.h()) {
            setForceMaskingRecursively(forceMaskingRecursively);
        }
    }

    private final void startSessionReplayInFlutterIfNeeded() {
        if (this.bridgeManager.l() && !this.bridgeManager.m()) {
            this.mainThreadHandler.post(new e(this));
        }
    }

    /* access modifiers changed from: private */
    public static final void startSessionReplayInFlutterIfNeeded$lambda$14(SessionReplayProcessor sessionReplayProcessor) {
        C17542s.j(sessionReplayProcessor, "this$0");
        if (sessionReplayProcessor.isProcessStarted && sessionReplayProcessor.bridgeManager.l() && !sessionReplayProcessor.bridgeManager.m()) {
            sessionReplayProcessor.bridgeManager.b(true);
        }
    }

    /* access modifiers changed from: private */
    public static final void storeAndSendSrEvents$lambda$10(SessionReplayProcessor sessionReplayProcessor, M1 m12) {
        C17542s.j(sessionReplayProcessor, "this$0");
        C17542s.j(m12, "$batchToStore");
        try {
            sessionReplayProcessor.batchStorageProcessor.b(m12);
            sessionReplayProcessor.batchDispatcher.a();
        } catch (Exception e10) {
            H1.a(sessionReplayProcessor.logger, "Something went wrong while trying to store or dispatch.", e10);
        }
    }

    /* access modifiers changed from: private */
    public static final void switchToWorkerThread$lambda$7(C6825f3 f3Var, SessionReplayProcessor sessionReplayProcessor, C9036b bVar, long j10, C6871l1 l1Var, List list, boolean z10) {
        C17542s.j(sessionReplayProcessor, "this$0");
        C17542s.j(bVar, "$viewLight");
        C17542s.j(l1Var, "$sessionState");
        C17542s.j(list, "$srEvents");
        if (f3Var != null) {
            try {
                C6824f2.c cVar = (C6824f2.c) f3Var.a();
                if (cVar != null) {
                    sessionReplayProcessor.createSrEvents(bVar, j10, cVar, l1Var, list, z10);
                }
            } catch (Exception e10) {
                H1.a(sessionReplayProcessor.logger, "Something went wrong while processing sr events.", e10);
            }
        } else {
            sessionReplayProcessor.createSrEvents(bVar, j10, (C6824f2.c) null, l1Var, list, z10);
        }
    }

    private final void triggerSingleFrameProcessingManually() {
        Handler handler = this.mainThreadHandler;
        C6860j6 j6Var = this.onDrawObserver.f42820c;
        if (j6Var == null) {
            C17542s.z("onDrawListener");
            j6Var = null;
        }
        handler.post(j6Var);
    }

    public final void addCrashAndSaveToDisk(V v10) {
        C17542s.j(v10, "crashEvent");
        synchronized (this.batchModificationLock) {
            this.eventsToBatchProcessor.d(this.eventsProvidersManager.a());
            this.eventsToBatchProcessor.d(C16877v.e(v10));
            this.screenViewEventProvider.f42163a.d(C16877v.e(new M4(System.currentTimeMillis())));
            this.batchStorageProcessor.b(createNewBatch(this.sessionStateManager.a()));
            C16807N n10 = C16807N.f139792a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r2 = (r2 = r10.f42551a).f42915c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void createSrEvents(z8.C9036b r7, long r8, a9.C6824f2.c r10, a9.C6871l1 r11, java.util.List<? extends a9.C6921r4> r12, boolean r13) {
        /*
            r6 = this;
            java.lang.String r0 = "viewLight"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "sessionState"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "srEvents"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            if (r13 == 0) goto L_0x001c
            k8.a r13 = r6.bridgeManager
            boolean r13 = r13.l()
            if (r13 != 0) goto L_0x001c
            r6.setForceMaskingRecursively(r7)
        L_0x001c:
            a9.G0 r13 = r6.sessionReplayTreeLogger
            E8.c r13 = r13.f42008a
            E8.b r0 = E8.b.DEVELOPER_SESSION_REPLAY_LOG_VIEWLIGHT_TREE
            r1 = 0
            boolean r13 = r13.b(r0, r1)
            r0 = 0
            if (r13 == 0) goto L_0x004c
            a9.G0 r13 = r6.sessionReplayTreeLogger
            if (r10 == 0) goto L_0x003d
            a9.w0 r2 = r10.f42551a
            if (r2 == 0) goto L_0x003d
            android.graphics.Bitmap r2 = r2.f42915c
            if (r2 == 0) goto L_0x003d
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r2 = r2.copy(r3, r1)
            goto L_0x003e
        L_0x003d:
            r2 = r0
        L_0x003e:
            r13.f42011d = r2
            a9.G0 r13 = r6.sessionReplayTreeLogger
            r13.getClass()
            java.lang.String r2 = "viewLight"
            kotlin.jvm.internal.C17542s.j(r7, r2)
            r13.f42010c = r7
        L_0x004c:
            if (r10 == 0) goto L_0x00ad
            a9.k6 r13 = r6.recyclableViewAppearance
            r13.getClass()
            java.lang.String r2 = "root"
            kotlin.jvm.internal.C17542s.j(r7, r2)
            java.lang.String r2 = "screenCaptureResult"
            kotlin.jvm.internal.C17542s.j(r10, r2)
            XH.v r2 = r7.k0()
            java.lang.Object r3 = r2.c()
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x006b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0080
            java.lang.Object r4 = r3.next()
            z8.b r4 = (z8.C9036b) r4
            java.lang.String r5 = "viewLight"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            r13.a(r4, r10)
            goto L_0x006b
        L_0x0080:
            java.lang.Object r2 = r2.d()
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x008a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009f
            java.lang.Object r3 = r2.next()
            z8.b r3 = (z8.C9036b) r3
            java.lang.String r4 = "viewLight"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            r13.a(r3, r10)
            goto L_0x008a
        L_0x009f:
            a9.N2 r10 = r13.f42665d
            j0.y<a9.e3> r13 = r10.f42161a
            j0.y<a9.e3> r2 = r10.f42162b
            r13.l(r2)
            j0.y<a9.e3> r10 = r10.f42162b
            r10.a()
        L_0x00ad:
            a9.G0 r10 = r6.sessionReplayTreeLogger
            E8.c r10 = r10.f42008a
            E8.b r13 = E8.b.DEVELOPER_SESSION_REPLAY_LOG_VIEWLIGHT_TREE
            boolean r10 = r10.b(r13, r1)
            if (r10 == 0) goto L_0x017e
            a9.G0 r10 = r6.sessionReplayTreeLogger
            D8.c r13 = r10.f42009b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Saving frame to: "
            r1.<init>(r2)
            java.io.File r2 = r10.f42013f
            java.io.File r2 = r2.getAbsoluteFile()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.f(r1)
            z8.b r13 = r10.f42010c
            if (r13 != 0) goto L_0x00d9
            goto L_0x0123
        L_0x00d9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "frame_"
            r1.<init>(r2)
            int r2 = r10.f42012e
            r1.append(r2)
            java.lang.String r2 = ".proto"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = r10.f42013f
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x00fb
            java.io.File r2 = r10.f42013f
            r2.mkdirs()
        L_0x00fb:
            java.io.File r2 = new java.io.File
            java.io.File r3 = r10.f42013f
            r2.<init>(r3, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0119 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0119 }
            d9.Y r13 = a9.G0.a(r13)     // Catch:{ IOException -> 0x0119 }
            byte[] r13 = r13.toByteArray()     // Catch:{ IOException -> 0x0119 }
            r1.write(r13)     // Catch:{ IOException -> 0x0119 }
            r1.flush()     // Catch:{ IOException -> 0x0119 }
            r1.close()     // Catch:{ IOException -> 0x0119 }
            goto L_0x0123
        L_0x0119:
            r13 = move-exception
            D8.c r1 = r10.f42009b
            java.lang.String r13 = r13.getMessage()
            r1.h(r13)
        L_0x0123:
            android.graphics.Bitmap r13 = r10.f42011d
            if (r13 != 0) goto L_0x0128
            goto L_0x0174
        L_0x0128:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "frame_"
            r13.<init>(r1)
            int r1 = r10.f42012e
            r13.append(r1)
            java.lang.String r1 = ".png"
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            java.io.File r1 = r10.f42013f
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x014a
            java.io.File r1 = r10.f42013f
            r1.mkdirs()
        L_0x014a:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r10.f42013f
            r1.<init>(r2, r13)
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0162 }
            r13.<init>(r1)     // Catch:{ IOException -> 0x0162 }
            android.graphics.Bitmap r1 = r10.f42011d     // Catch:{ IOException -> 0x0162 }
            if (r1 == 0) goto L_0x0164
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0162 }
            r3 = 100
            r1.compress(r2, r3, r13)     // Catch:{ IOException -> 0x0162 }
            goto L_0x0164
        L_0x0162:
            r13 = move-exception
            goto L_0x016b
        L_0x0164:
            r13.flush()     // Catch:{ IOException -> 0x0162 }
            r13.close()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0174
        L_0x016b:
            D8.c r1 = r10.f42009b
            java.lang.String r13 = r13.getMessage()
            r1.h(r13)
        L_0x0174:
            int r13 = r10.f42012e
            int r13 = r13 + 1
            r10.f42012e = r13
            r10.f42011d = r0
            r10.f42010c = r0
        L_0x017e:
            a9.N5 r10 = r6.viewMutationEventProvider
            java.util.ArrayList r8 = r10.c(r7, r8)
            java.lang.Object r9 = r6.batchModificationLock
            monitor-enter(r9)
            r6.mapGestureEventsToViewLight(r12, r7)     // Catch:{ all -> 0x0198 }
            a9.t0 r7 = r6.eventsToBatchProcessor     // Catch:{ all -> 0x0198 }
            a9.t r10 = r7.f42861c     // Catch:{ all -> 0x0198 }
            int r10 = r10.f42858c     // Catch:{ all -> 0x0198 }
            int r7 = r7.f42859a     // Catch:{ all -> 0x0198 }
            if (r10 <= r7) goto L_0x019a
            r6.flushCurrentEventBatch(r11)     // Catch:{ all -> 0x0198 }
            goto L_0x019a
        L_0x0198:
            r7 = move-exception
            goto L_0x01ab
        L_0x019a:
            a9.t0 r7 = r6.eventsToBatchProcessor     // Catch:{ all -> 0x0198 }
            r7.d(r12)     // Catch:{ all -> 0x0198 }
            a9.t0 r7 = r6.eventsToBatchProcessor     // Catch:{ all -> 0x0198 }
            r7.d(r8)     // Catch:{ all -> 0x0198 }
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x0198 }
            monitor-exit(r9)
            r6.startSessionReplayInFlutterIfNeeded()
            return
        L_0x01ab:
            monitor-exit(r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor.createSrEvents(z8.b, long, a9.f2$c, a9.l1, java.util.List, boolean):void");
    }

    public final void flushCurrentEventBatchAsync() {
        List t12;
        C6871l1 a10 = this.sessionStateManager.a();
        C6806d0 d0Var = this.eventsProvidersManager;
        synchronized (d0Var) {
            t12 = C16877v.t1(d0Var.f42497a);
            d0Var.f42497a.clear();
        }
        C6947u6 u6Var = C6819e5.f42528a;
        C6819e5.a(new d(this, t12, a10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        a9.H1.a(r7.logger, "Something went wrong in onDraw.", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "window"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            a9.I6 r0 = r7.throttleOperator     // Catch:{ Exception -> 0x0026 }
            com.contentsquare.android.sdk.Q0 r1 = r7.qualitySettings     // Catch:{ Exception -> 0x0026 }
            int r2 = r1.f47130g     // Catch:{ Exception -> 0x0026 }
            r3 = 1000(0x3e8, float:1.401E-42)
            int r3 = r3 / r2
            long r2 = (long) r3     // Catch:{ Exception -> 0x0026 }
            r0.f42074c = r2     // Catch:{ Exception -> 0x0026 }
            a9.P1 r0 = r1.f47128e     // Catch:{ Exception -> 0x0026 }
            a9.E2 r1 = r0.f42196a     // Catch:{ Exception -> 0x0026 }
            r1.getClass()     // Catch:{ Exception -> 0x0026 }
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0026 }
            r0.f42199d = r1     // Catch:{ Exception -> 0x0026 }
            a9.K6 r0 = r7.animationSupervisor     // Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x0028
            r0.a()     // Catch:{ Exception -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r8 = move-exception
            goto L_0x0089
        L_0x0028:
            a9.y1 r0 = r7.sessionStateManager     // Catch:{ Exception -> 0x0026 }
            a9.l1 r4 = r0.a()     // Catch:{ Exception -> 0x0026 }
            com.contentsquare.android.sdk.m1 r0 = r7.androidViewToViewLightConverter     // Catch:{ Exception -> 0x0026 }
            android.view.View r1 = r8.getDecorView()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r2 = "window.decorView"
            kotlin.jvm.internal.C17542s.i(r1, r2)     // Catch:{ Exception -> 0x0026 }
            z8.b r3 = r0.b(r1)     // Catch:{ Exception -> 0x0026 }
            a9.n2 r0 = r7.forceMaskingResolver     // Catch:{ Exception -> 0x0026 }
            android.view.View r1 = r8.getDecorView()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r2 = "window.decorView"
            kotlin.jvm.internal.C17542s.i(r1, r2)     // Catch:{ Exception -> 0x0026 }
            int r0 = r0.a(r1)     // Catch:{ Exception -> 0x0026 }
            r1 = 1
            if (r0 == r1) goto L_0x0051
            r6 = r1
            goto L_0x0053
        L_0x0051:
            r0 = 0
            r6 = r0
        L_0x0053:
            a9.d0 r0 = r7.eventsProvidersManager     // Catch:{ Exception -> 0x0026 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0026 }
            java.util.ArrayList r1 = r0.f42497a     // Catch:{ all -> 0x0086 }
            java.util.List r5 = YH.C16877v.t1(r1)     // Catch:{ all -> 0x0086 }
            java.util.ArrayList r1 = r0.f42497a     // Catch:{ all -> 0x0086 }
            r1.clear()     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x0026 }
            k8.a r0 = r7.bridgeManager     // Catch:{ Exception -> 0x0026 }
            boolean r0 = r0.l()     // Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x0080
            k8.a r0 = r7.bridgeManager     // Catch:{ Exception -> 0x0026 }
            boolean r0 = r0.m()     // Catch:{ Exception -> 0x0026 }
            if (r0 == 0) goto L_0x0080
            boolean r8 = com.contentsquare.android.api.bridge.flutter.FlutterInterface.isFirstFlutterEventAdded()     // Catch:{ Exception -> 0x0026 }
            if (r8 == 0) goto L_0x0090
            r8 = 0
            r1 = r7
            r2 = r3
            r3 = r8
            r1.completeUiThreadProcess(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0090
        L_0x0080:
            r1 = r7
            r2 = r8
            r1.captureAndProcessScreen(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0090
        L_0x0086:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x0026 }
            throw r8     // Catch:{ Exception -> 0x0026 }
        L_0x0089:
            D8.c r0 = r7.logger
            java.lang.String r1 = "Something went wrong in onDraw."
            a9.H1.a(r0, r1, r8)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor.onDraw(android.view.Window):void");
    }

    public void onPreScreenNumberChange(C6871l1 l1Var) {
        List t12;
        C17542s.j(l1Var, "currentSessionState");
        long currentTimeMillis = System.currentTimeMillis();
        C6806d0 d0Var = this.eventsProvidersManager;
        synchronized (d0Var) {
            t12 = C16877v.t1(d0Var.f42497a);
            d0Var.f42497a.clear();
        }
        C6947u6 u6Var = C6819e5.f42528a;
        C6819e5.a(new Y8.a(this, currentTimeMillis, t12, l1Var));
        triggerSingleFrameProcessingManually();
    }

    public final void startProcess(boolean z10) {
        this.startStopEventProvider.a(z10);
        long currentTimeMillis = System.currentTimeMillis();
        this.recordingStartTimeProvider.f42978a = currentTimeMillis;
        synchronized (this.batchModificationLock) {
            this.screenViewEventProvider.f42163a.d(C16877v.e(new F3(currentTimeMillis)));
            C16807N n10 = C16807N.f139792a;
        }
        this.bridgeManager.x(this.onDrawObserver);
        C6963w6 w6Var = this.animationCompletionHandler;
        if (w6Var != null) {
            C6916q6 q6Var = this.onDrawObserver;
            q6Var.getClass();
            C17542s.j(w6Var, "onPreDrawListener");
            q6Var.f42821d.add(w6Var);
        }
        Activity activity = this.liveActivityProvider.f42433a.get();
        if (activity != null) {
            C6916q6 q6Var2 = this.onDrawObserver;
            q6Var2.getClass();
            C17542s.j(activity, "activity");
            ViewTreeObserver b10 = q6Var2.b();
            if (b10 != null) {
                b10.removeOnPreDrawListener(q6Var2);
                q6Var2.f42818a.f("Listener to onDraw removed.");
            }
            FlutterInterface.setOnFlutterEventListener((f) null);
            q6Var2.f42822e = new WeakReference<>(activity.getWindow());
            ViewTreeObserver b11 = q6Var2.b();
            if (b11 != null) {
                b11.addOnPreDrawListener(q6Var2);
                q6Var2.f42818a.f("Listen to draws.");
            }
            FlutterInterface.setOnFlutterEventListener(q6Var2);
            this.onDrawObserver.onPreDraw();
        }
        this.lifecycleCallbacks.a();
        this.lifecycleOwner.getLifecycle().c(this.lifecycleObserver);
        this.sessionStateManager.f42970d = this;
        if (this.sessionReplayTreeLogger.f42008a.b(E8.b.DEVELOPER_SESSION_REPLAY_LOG_VIEWLIGHT_TREE, false) && z10) {
            G0 g02 = this.sessionReplayTreeLogger;
            g02.f42011d = null;
            g02.f42010c = null;
            g02.f42012e = 0;
            if (g02.f42013f.exists()) {
                C17423j.r(g02.f42013f);
            }
        }
        this.isProcessStarted = true;
    }

    public final void stopProcess() {
        for (S1 a10 : this.stoppableEventProviders) {
            a10.a();
        }
        C6806d0 d0Var = this.eventsProvidersManager;
        synchronized (d0Var) {
            d0Var.f42497a.clear();
        }
        this.lifecycleCallbacks.b();
        C6963w6 w6Var = this.animationCompletionHandler;
        if (w6Var != null) {
            C6916q6 q6Var = this.onDrawObserver;
            q6Var.getClass();
            C17542s.j(w6Var, "onPreDrawListener");
            q6Var.f42821d.remove(w6Var);
        }
        C6916q6 q6Var2 = this.onDrawObserver;
        ViewTreeObserver b10 = q6Var2.b();
        if (b10 != null) {
            b10.removeOnPreDrawListener(q6Var2);
            q6Var2.f42818a.f("Listener to onDraw removed.");
        }
        FlutterInterface.setOnFlutterEventListener((f) null);
        this.recyclableViewAppearance.f42664c.f42681a.c();
        N2 n22 = this.recyclableViewAppearance.f42665d;
        n22.f42161a.a();
        n22.f42162b.a();
        this.lifecycleOwner.getLifecycle().g(this.lifecycleObserver);
        this.bridgeManager.b(false);
        this.bridgeManager.x((C8466b) null);
        this.sessionStateManager.f42970d = null;
        this.isProcessStarted = false;
    }

    public final void storeAndSendSrEvents(M1 m12) {
        boolean z10;
        C17542s.j(m12, "batchToStore");
        C6947u6 u6Var = F6.f42004a;
        Y8.b bVar = new Y8.b(this, m12);
        C17542s.j(bVar, "task");
        C6947u6 u6Var2 = F6.f42004a;
        synchronized (u6Var2) {
            C17542s.j(bVar, "task");
            try {
                u6Var2.f42890a.execute(bVar);
                z10 = true;
            } catch (RejectedExecutionException e10) {
                u6Var2.f42891b.g(e10, "addTask failed");
                z10 = false;
            }
        }
        if (!z10) {
            F6.f42005b.h("the IOThreadPool is full, a task was skipped");
        }
    }

    public final void switchToWorkerThread(C9036b bVar, long j10, C6825f3<C6824f2.c> f3Var, C6871l1 l1Var, List<? extends C6921r4> list, boolean z10) {
        boolean z11;
        C17542s.j(bVar, "viewLight");
        C17542s.j(l1Var, "sessionState");
        List<? extends C6921r4> list2 = list;
        C17542s.j(list2, "srEvents");
        C6947u6 u6Var = C6819e5.f42528a;
        Y8.c cVar = new Y8.c(f3Var, this, bVar, j10, l1Var, list2, z10);
        C17542s.j(cVar, "task");
        C6947u6 u6Var2 = C6819e5.f42528a;
        synchronized (u6Var2) {
            C17542s.j(cVar, "task");
            try {
                u6Var2.f42890a.execute(cVar);
                z11 = true;
            } catch (RejectedExecutionException e10) {
                u6Var2.f42891b.g(e10, "addTask failed");
                z11 = false;
            }
        }
        if (!z11) {
            C6819e5.f42529b.h("the CPUThreadPool is full, a task was skipped");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SessionReplayProcessor(android.app.Application r44, a9.E r45, a9.C6863k1 r46, a9.C6785a3 r47, F8.g r48, a9.C6916q6 r49, a9.C6783a1 r50, androidx.lifecycle.C5221y r51, com.contentsquare.android.sdk.Q0 r52, a9.C6943u2 r53, a9.C6806d0 r54, java.util.List r55, a9.N5 r56, a9.C6878m0 r57, a9.C6902p0 r58, a9.C6974y1 r59, android.os.Handler r60, a9.K r61, a9.I6 r62, a9.C6985z4 r63, a9.K6 r64, a9.C6963w6 r65, a9.C6888n2 r66, com.contentsquare.android.sdk.m1 r67, a9.C6824f2 r68, a9.C6868k6 r69, k8.C8465a r70, a9.C6933t0 r71, a9.I5 r72, a9.C6978y5 r73, a9.C6941u0 r74, a9.C6846i0 r75, a9.F5 r76, a9.P5 r77, a9.C6900o6 r78, a9.C6971x6 r79, a9.H6 r80, a9.C6792b2 r81, a9.N3 r82, a9.C6968x3 r83, D8.c r84, a9.G0 r85, int r86, int r87, kotlin.jvm.internal.DefaultConstructorMarker r88) {
        /*
            r43 = this;
            r1 = r44
            r2 = r45
            r0 = r87
            r3 = 4
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 65536(0x10000, float:9.18355E-41)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x001b
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            r15 = r7
            goto L_0x001d
        L_0x001b:
            r15 = r60
        L_0x001d:
            r7 = 131072(0x20000, float:1.83671E-40)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x002d
            a9.K r7 = new a9.K
            r8 = r49
            r7.<init>(r1, r8)
            r18 = r7
            goto L_0x0031
        L_0x002d:
            r8 = r49
            r18 = r61
        L_0x0031:
            r7 = 262144(0x40000, float:3.67342E-40)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x0046
            a9.I6 r7 = new a9.I6
            G8.t r9 = new G8.t
            r9.<init>()
            r10 = 200(0xc8, double:9.9E-322)
            r7.<init>(r9, r15, r10)
            r19 = r7
            goto L_0x0048
        L_0x0046:
            r19 = r62
        L_0x0048:
            r7 = 1048576(0x100000, float:1.469368E-39)
            r7 = r86 & r7
            r9 = 0
            if (r7 == 0) goto L_0x008a
            u8.a$a r7 = u8.C8886a.f56874d
            u8.a r10 = r7.a()
            java.lang.String r11 = "sr_detect_animations"
            boolean r10 = a9.D6.a(r10, r11)
            if (r10 != 0) goto L_0x0072
            u8.a r7 = r7.b(r1)
            E8.c r7 = r7.f()
            E8.b r10 = E8.b.DEVELOPER_SESSION_REPLAY_FORCE_ANIMATION_DETECTION
            boolean r7 = r7.b(r10, r5)
            if (r7 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            r14 = r63
            r13 = r9
            goto L_0x008e
        L_0x0072:
            G8.t r7 = new G8.t
            r7.<init>()
            a9.K6 r10 = new a9.K6
            a9.C6 r11 = new a9.C6
            r11.<init>()
            a9.L6 r12 = new a9.L6
            r14 = r63
            r12.<init>(r14, r7)
            r10.<init>(r7, r11, r12)
            r13 = r10
            goto L_0x008e
        L_0x008a:
            r14 = r63
            r13 = r64
        L_0x008e:
            r7 = 2097152(0x200000, float:2.938736E-39)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x00a1
            if (r13 == 0) goto L_0x009e
            a9.w6 r7 = new a9.w6
            r7.<init>(r13, r15)
            r22 = r7
            goto L_0x00a3
        L_0x009e:
            r22 = r9
            goto L_0x00a3
        L_0x00a1:
            r22 = r65
        L_0x00a3:
            r7 = 4194304(0x400000, float:5.877472E-39)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x00b1
            a9.n2 r7 = new a9.n2
            r7.<init>(r2, r13)
            r23 = r7
            goto L_0x00b3
        L_0x00b1:
            r23 = r66
        L_0x00b3:
            r7 = 8388608(0x800000, float:1.17549435E-38)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x00e0
            com.contentsquare.android.sdk.m1 r7 = new com.contentsquare.android.sdk.m1
            G8.t r10 = new G8.t
            r10.<init>()
            u8.a$a r11 = u8.C8886a.f56874d
            u8.a r11 = r11.a()
            if (r11 == 0) goto L_0x00d8
            java.lang.String r12 = "sr_jetpack_compose"
            boolean r11 = a9.D6.a(r11, r12)
            if (r11 != r6) goto L_0x00d8
            XH.o r9 = a9.C6976y3.f42973c
            java.lang.Object r9 = r9.getValue()
            w8.a r9 = (w8.C8933a) r9
        L_0x00d8:
            r11 = r47
            r7.<init>(r10, r11, r9, r13)
            r24 = r7
            goto L_0x00e4
        L_0x00e0:
            r11 = r47
            r24 = r67
        L_0x00e4:
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x00f2
            a9.f2 r7 = new a9.f2
            r7.<init>()
            r25 = r7
            goto L_0x00f4
        L_0x00f2:
            r25 = r68
        L_0x00f4:
            r7 = 33554432(0x2000000, float:9.403955E-38)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x0102
            a9.k6 r7 = new a9.k6
            r7.<init>()
            r26 = r7
            goto L_0x0104
        L_0x0102:
            r26 = r69
        L_0x0104:
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x011c
            a9.t0 r7 = new a9.t0
            boolean r9 = r70.l()
            if (r9 == 0) goto L_0x0115
            d9.G$b r9 = d9.G.b.POSITION_RELATIVE
            goto L_0x0117
        L_0x0115:
            d9.G$b r9 = d9.G.b.POSITION_ABSOLUTE
        L_0x0117:
            r7.<init>(r9)
            r12 = r7
            goto L_0x011e
        L_0x011c:
            r12 = r71
        L_0x011e:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x012e
            a9.I5 r7 = new a9.I5
            r9 = r46
            r7.<init>(r9)
            r29 = r7
            goto L_0x0132
        L_0x012e:
            r9 = r46
            r29 = r72
        L_0x0132:
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x0140
            a9.y5 r7 = new a9.y5
            r7.<init>()
            r30 = r7
            goto L_0x0142
        L_0x0140:
            r30 = r73
        L_0x0142:
            r7 = 1073741824(0x40000000, float:2.0)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x014f
            a9.u0 r7 = new a9.u0
            r7.<init>()
            r10 = r7
            goto L_0x0151
        L_0x014f:
            r10 = r74
        L_0x0151:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r86 & r7
            if (r7 == 0) goto L_0x015f
            a9.i0 r7 = new a9.i0
            r7.<init>(r10)
            r32 = r7
            goto L_0x0161
        L_0x015f:
            r32 = r75
        L_0x0161:
            r7 = r0 & 1
            if (r7 == 0) goto L_0x016b
            a9.F5 r7 = new a9.F5
            r7.<init>()
            goto L_0x016d
        L_0x016b:
            r7 = r76
        L_0x016d:
            r16 = r0 & 2
            if (r16 == 0) goto L_0x0179
            a9.P5 r4 = new a9.P5
            r4.<init>(r7)
            r34 = r4
            goto L_0x017b
        L_0x0179:
            r34 = r77
        L_0x017b:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0185
            a9.o6 r4 = new a9.o6
            r4.<init>()
            goto L_0x0187
        L_0x0185:
            r4 = r78
        L_0x0187:
            r16 = r0 & 8
            if (r16 == 0) goto L_0x0193
            a9.x6 r3 = new a9.x6
            r3.<init>(r4)
            r36 = r3
            goto L_0x0195
        L_0x0193:
            r36 = r79
        L_0x0195:
            r3 = r0 & 16
            if (r3 == 0) goto L_0x01f9
            a9.H6 r3 = new a9.H6
            a9.V4 r6 = new a9.V4
            u8.a$a r5 = u8.C8886a.f56874d
            u8.a r21 = r5.b(r1)
            r27 = r4
            E8.c r4 = r21.f()
            u8.a r21 = r5.b(r1)
            r28 = r7
            A8.b r7 = r21.c()
            r6.<init>(r7, r4)
            a9.S0 r4 = new a9.S0
            u8.a r5 = r5.b(r1)
            E8.c r5 = r5.f()
            r4.<init>(r5)
            r5 = 5
            a9.z0[] r5 = new a9.C6981z0[r5]
            r7 = 0
            r5[r7] = r29
            r7 = 1
            r5[r7] = r30
            r7 = 2
            r5[r7] = r32
            r7 = 3
            r5[r7] = r34
            r7 = 4
            r5[r7] = r36
            java.util.List r5 = YH.C16877v.q(r5)
            XH.o r7 = a9.C6976y3.f42974d
            java.lang.Object r7 = r7.getValue()
            v8.a r7 = (v8.C8902a) r7
            G8.d r16 = r48.c()
            r71 = r3
            r72 = r45
            r73 = r6
            r74 = r4
            r75 = r5
            r76 = r7
            r77 = r16
            r71.<init>(r72, r73, r74, r75, r76, r77)
            r37 = r3
            goto L_0x01ff
        L_0x01f9:
            r27 = r4
            r28 = r7
            r37 = r80
        L_0x01ff:
            r3 = r0 & 32
            if (r3 == 0) goto L_0x020f
            a9.b2 r3 = new a9.b2
            r5 = r48
            r7 = r53
            r3.<init>(r5, r2, r7)
            r38 = r3
            goto L_0x0215
        L_0x020f:
            r5 = r48
            r7 = r53
            r38 = r81
        L_0x0215:
            r3 = r0 & 64
            if (r3 == 0) goto L_0x0221
            a9.N3 r3 = new a9.N3
            r3.<init>(r12)
            r39 = r3
            goto L_0x0223
        L_0x0221:
            r39 = r82
        L_0x0223:
            r3 = r0 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x022f
            a9.x3 r3 = new a9.x3
            r3.<init>()
            r40 = r3
            goto L_0x0231
        L_0x022f:
            r40 = r83
        L_0x0231:
            r3 = r0 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x023f
            D8.c r3 = new D8.c
            java.lang.String r4 = "SessionReplayProcessor"
            r3.<init>(r4)
            r41 = r3
            goto L_0x0241
        L_0x023f:
            r41 = r84
        L_0x0241:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0260
            a9.G0 r0 = new a9.G0
            android.content.Context r3 = r44.getApplicationContext()
            java.lang.String r4 = "application.applicationContext"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            u8.a$a r4 = u8.C8886a.f56874d
            u8.a r4 = r4.b(r1)
            E8.c r4 = r4.f()
            r0.<init>(r3, r4)
            r42 = r0
            goto L_0x0262
        L_0x0260:
            r42 = r85
        L_0x0262:
            r0 = r43
            r1 = r44
            r2 = r45
            r3 = r46
            r35 = r27
            r4 = r47
            r5 = r48
            r6 = r49
            r33 = r28
            r7 = r50
            r8 = r51
            r9 = r52
            r31 = r10
            r10 = r53
            r11 = r54
            r28 = r12
            r12 = r55
            r21 = r13
            r13 = r56
            r14 = r57
            r17 = r15
            r15 = r58
            r16 = r59
            r20 = r63
            r27 = r70
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.sessionreplay.processing.SessionReplayProcessor.<init>(android.app.Application, a9.E, a9.k1, a9.a3, F8.g, a9.q6, a9.a1, androidx.lifecycle.y, com.contentsquare.android.sdk.Q0, a9.u2, a9.d0, java.util.List, a9.N5, a9.m0, a9.p0, a9.y1, android.os.Handler, a9.K, a9.I6, a9.z4, a9.K6, a9.w6, a9.n2, com.contentsquare.android.sdk.m1, a9.f2, a9.k6, k8.a, a9.t0, a9.I5, a9.y5, a9.u0, a9.i0, a9.F5, a9.P5, a9.o6, a9.x6, a9.H6, a9.b2, a9.N3, a9.x3, D8.c, a9.G0, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
