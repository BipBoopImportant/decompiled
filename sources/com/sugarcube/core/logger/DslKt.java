package com.sugarcube.core.logger;

import HJ.C15854t;
import XH.C16807N;
import XH.C16816g;
import XH.t;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\u001aG\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0004\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0005*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\u0005*\u00020\rH\b¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0010\u001a\u00020\u00058\u0000XT¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0014\u001a\u00020\u00058\u0000XT¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u0012\u0004\b\u0015\u0010\u0013\"\u001a\u0010\u0016\u001a\u00020\u00058\u0000XT¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u0012\u0004\b\u0017\u0010\u0013\"\u001a\u0010\u0018\u001a\u00020\u00058\u0000XT¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u0012\u0004\b\u0019\u0010\u0013\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001a"}, d2 = {"Lcom/sugarcube/core/logger/Priority;", "priority", "", "cause", "Lkotlin/Function0;", "", "tag", "messageBlock", "LXH/N;", "logToChannels", "(Lcom/sugarcube/core/logger/Priority;Ljava/lang/Throwable;LnI/a;LnI/a;)V", "printTraces", "(Ljava/lang/Throwable;)Ljava/lang/String;", "", "createOuterClassTag", "(Ljava/lang/Object;)Ljava/lang/String;", "MAIN_THREAD_NAME", "Ljava/lang/String;", "getMAIN_THREAD_NAME$annotations", "()V", "INDICATOR_MAIN", "getINDICATOR_MAIN$annotations", "INDICATOR_BACKGROUND", "getINDICATOR_BACKGROUND$annotations", "INDICATOR_SEPARATOR", "getINDICATOR_SEPARATOR$annotations", "logger_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DslKt {
    public static final String INDICATOR_BACKGROUND = "b";
    public static final String INDICATOR_MAIN = "m";
    public static final String INDICATOR_SEPARATOR = "|";
    public static final String MAIN_THREAD_NAME = "main";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.sugarcube.core.logger.Priority[] r0 = com.sugarcube.core.logger.Priority.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.VERBOSE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.DEBUG     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.INFO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.WARN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.sugarcube.core.logger.Priority r1 = com.sugarcube.core.logger.Priority.ERROR     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.logger.DslKt.WhenMappings.<clinit>():void");
        }
    }

    public static final String createOuterClassTag(Object obj) {
        C17542s.j(obj, "<this>");
        String name = obj.getClass().getName();
        C17542s.g(name);
        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
        return o12.length() == 0 ? name : C15854t.P0(o12, "Kt");
    }

    public static /* synthetic */ void getINDICATOR_BACKGROUND$annotations() {
    }

    public static /* synthetic */ void getINDICATOR_MAIN$annotations() {
    }

    public static /* synthetic */ void getINDICATOR_SEPARATOR$annotations() {
    }

    public static /* synthetic */ void getMAIN_THREAD_NAME$annotations() {
    }

    public static final void logToChannels(Priority priority, Throwable th2, C17631a<String> aVar, C17631a<String> aVar2) {
        C17542s.j(priority, "priority");
        C17542s.j(aVar, "tag");
        C17542s.j(aVar2, "messageBlock");
        String invoke = aVar2.invoke();
        String str = "";
        String str2 = null;
        if (invoke == null) {
            invoke = th2 != null ? th2.getMessage() : null;
            if (invoke == null) {
                invoke = str;
            }
        }
        if (th2 != null) {
            str2 = C16816g.b(th2);
        }
        if (str2 != null) {
            str = str2;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(aVar.invoke(), invoke + " " + str);
        } else if (i10 == 2) {
            Log.d(aVar.invoke(), invoke + " " + str);
        } else if (i10 == 3) {
            Log.i(aVar.invoke(), invoke + " " + str);
        } else if (i10 == 4) {
            Log.w(aVar.invoke(), invoke + " " + str);
        } else if (i10 == 5) {
            Log.e(aVar.invoke(), invoke + " " + str);
        } else {
            throw new t();
        }
    }

    public static final String printTraces(Throwable th2) {
        String str;
        if (th2 != null) {
            th2.printStackTrace();
            str = C16807N.f139792a.toString();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }
}
