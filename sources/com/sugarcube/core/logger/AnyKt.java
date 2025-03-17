package com.sugarcube.core.logger;

import HJ.C15854t;
import XH.C16816g;
import XH.t;
import android.util.Log;
import com.sugarcube.core.logger.DslKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001aI\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a2\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\b¢\u0006\u0004\b\n\u0010\f\u001aI\u0010\u0010\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001aI\u0010\u0013\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011\u001aI\u0010\u0014\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001aE\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0004\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a2\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\b¢\u0006\u0004\b\u0010\u0010\u0016\u001a2\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\b¢\u0006\u0004\b\u0012\u0010\u0016\u001a2\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\b¢\u0006\u0004\b\u0013\u0010\u0016\u001a2\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\b¢\u0006\u0004\b\u0014\u0010\u0016\u001a2\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\rH\b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0019"}, d2 = {"", "Lcom/sugarcube/core/logger/Priority;", "priority", "", "cause", "", "tag", "Lkotlin/Function0;", "messageBlock", "LXH/N;", "log", "(Ljava/lang/Object;Lcom/sugarcube/core/logger/Priority;Ljava/lang/Throwable;Ljava/lang/String;LnI/a;)V", "(Ljava/lang/Object;Lcom/sugarcube/core/logger/Priority;Ljava/lang/Throwable;Ljava/lang/String;)V", "", "sensitive", "message", "logVerbose", "(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;ZLnI/a;)V", "logDebug", "logInfo", "logWarn", "logError", "(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;Z)V", "SUGARCUBE_TAG", "Ljava/lang/String;", "logger_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnyKt {
    public static final String SUGARCUBE_TAG = "Sugarcube";

    public static final void log(Object obj, Priority priority, Throwable th2, String str, C17631a<String> aVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(priority, "priority");
        C17542s.j(aVar, "messageBlock");
        String invoke = aVar.invoke();
        String str2 = "";
        if (invoke == null) {
            invoke = th2 != null ? th2.getMessage() : null;
            if (invoke == null) {
                invoke = str2;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void log$default(Object obj, Priority priority, Throwable th2, String str, C17631a aVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            priority = Priority.DEBUG;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(priority, "priority");
        C17542s.j(aVar, "messageBlock");
        String str2 = (String) aVar.invoke();
        String str3 = "";
        if (str2 == null) {
            str2 = th2 != null ? th2.getMessage() : null;
            if (str2 == null) {
                str2 = str3;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str3 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void logDebug(Object obj, Throwable th2, String str, boolean z10, C17631a<String> aVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.DEBUG;
        String invoke = aVar.invoke();
        String str2 = "";
        if (invoke == null) {
            invoke = th2 != null ? th2.getMessage() : null;
            if (invoke == null) {
                invoke = str2;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logDebug$default(Object obj, Throwable th2, String str, boolean z10, C17631a aVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.DEBUG;
        String str2 = (String) aVar.invoke();
        String str3 = "";
        if (str2 == null) {
            str2 = th2 != null ? th2.getMessage() : null;
            if (str2 == null) {
                str2 = str3;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str3 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void logError(Object obj, Throwable th2, String str, boolean z10, C17631a<String> aVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        C17542s.j(aVar, "message");
        Priority priority = Priority.ERROR;
        String invoke = aVar.invoke();
        String str2 = "";
        if (invoke == null && (invoke = th2.getMessage()) == null) {
            invoke = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logError$default(Object obj, Throwable th2, String str, boolean z10, C17631a aVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        C17542s.j(aVar, "message");
        Priority priority = Priority.ERROR;
        String str2 = (String) aVar.invoke();
        String str3 = "";
        if (str2 == null && (str2 = th2.getMessage()) == null) {
            str2 = str3;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str3 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void logInfo(Object obj, Throwable th2, String str, boolean z10, C17631a<String> aVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.INFO;
        String invoke = aVar.invoke();
        String str2 = "";
        if (invoke == null) {
            invoke = th2 != null ? th2.getMessage() : null;
            if (invoke == null) {
                invoke = str2;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logInfo$default(Object obj, Throwable th2, String str, boolean z10, C17631a aVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.INFO;
        String str2 = (String) aVar.invoke();
        String str3 = "";
        if (str2 == null) {
            str2 = th2 != null ? th2.getMessage() : null;
            if (str2 == null) {
                str2 = str3;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str3 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void logVerbose(Object obj, Throwable th2, String str, boolean z10, C17631a<String> aVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.VERBOSE;
        String invoke = aVar.invoke();
        String str2 = "";
        if (invoke == null) {
            invoke = th2 != null ? th2.getMessage() : null;
            if (invoke == null) {
                invoke = str2;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logVerbose$default(Object obj, Throwable th2, String str, boolean z10, C17631a aVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.VERBOSE;
        String str2 = (String) aVar.invoke();
        String str3 = "";
        if (str2 == null) {
            str2 = th2 != null ? th2.getMessage() : null;
            if (str2 == null) {
                str2 = str3;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str3 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void logWarn(Object obj, Throwable th2, String str, boolean z10, C17631a<String> aVar) {
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.WARN;
        String invoke = aVar.invoke();
        String str2 = "";
        if (invoke == null) {
            invoke = th2 != null ? th2.getMessage() : null;
            if (invoke == null) {
                invoke = str2;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logWarn$default(Object obj, Throwable th2, String str, boolean z10, C17631a aVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(aVar, "message");
        Priority priority = Priority.WARN;
        String str2 = (String) aVar.invoke();
        String str3 = "";
        if (str2 == null) {
            str2 = th2 != null ? th2.getMessage() : null;
            if (str2 == null) {
                str2 = str3;
            }
        }
        String b10 = th2 != null ? C16816g.b(th2) : null;
        if (b10 != null) {
            str3 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            if (str == null) {
                String name = obj.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                String name2 = obj.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                String name3 = obj.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                String name4 = obj.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                String name5 = obj.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void log(Object obj, Priority priority, Throwable th2, String str) {
        C17542s.j(obj, "<this>");
        C17542s.j(priority, "priority");
        C17542s.j(th2, "cause");
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logDebug(Object obj, Throwable th2, String str, boolean z10) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.DEBUG;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logError(Object obj, Throwable th2, String str, boolean z10) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.ERROR;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logInfo(Object obj, Throwable th2, String str, boolean z10) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.INFO;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logVerbose(Object obj, Throwable th2, String str, boolean z10) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.VERBOSE;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logWarn(Object obj, Throwable th2, String str, boolean z10) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.WARN;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i10 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i10 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i10 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void log$default(Object obj, Priority priority, Throwable th2, String str, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            priority = Priority.DEBUG;
        }
        C17542s.j(obj, "<this>");
        C17542s.j(priority, "priority");
        C17542s.j(th2, "cause");
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logDebug$default(Object obj, Throwable th2, String str, boolean z10, int i10, Object obj2) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.DEBUG;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logError$default(Object obj, Throwable th2, String str, boolean z10, int i10, Object obj2) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.ERROR;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logInfo$default(Object obj, Throwable th2, String str, boolean z10, int i10, Object obj2) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.INFO;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logVerbose$default(Object obj, Throwable th2, String str, boolean z10, int i10, Object obj2) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.VERBOSE;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logWarn$default(Object obj, Throwable th2, String str, boolean z10, int i10, Object obj2) {
        C17542s.j(obj, "<this>");
        C17542s.j(th2, "cause");
        Priority priority = Priority.WARN;
        String message = th2.getMessage();
        String str2 = "";
        if (message == null) {
            message = str2;
        }
        String b10 = C16816g.b(th2);
        if (b10 != null) {
            str2 = b10;
        }
        int i11 = DslKt.WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
        if (i11 == 1) {
            Log.v(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 2) {
            Log.d(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 3) {
            Log.i(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 4) {
            Log.w(SUGARCUBE_TAG, message + " " + str2);
        } else if (i11 == 5) {
            Log.e(SUGARCUBE_TAG, message + " " + str2);
        } else {
            throw new t();
        }
    }
}
