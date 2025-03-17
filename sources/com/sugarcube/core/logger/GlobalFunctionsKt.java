package com.sugarcube.core.logger;

import HJ.C15854t;
import XH.C16816g;
import XH.t;
import android.util.Log;
import com.sugarcube.core.logger.DslKt;
import java.lang.invoke.MethodHandles;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001aO\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u000b\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u0000H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a.\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u0012\u0010\u0011\u001a.\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u0013\u0010\u0011\u001a.\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u0014\u0010\u0011\u001a.\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\b¢\u0006\u0004\b\u0015\u0010\u0016\u001aE\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0018\u001aE\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0018\u001aE\u0010\u0013\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0018\u001aE\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018\u001aA\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0004\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\bH\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0019"}, d2 = {"", "tag", "Lcom/sugarcube/core/logger/Priority;", "priority", "", "cause", "", "sensitive", "Lkotlin/Function0;", "messageBlock", "LXH/N;", "log", "(Ljava/lang/String;Lcom/sugarcube/core/logger/Priority;Ljava/lang/Throwable;ZLnI/a;)V", "(Ljava/lang/String;Lcom/sugarcube/core/logger/Priority;Ljava/lang/Throwable;Z)V", "createTag", "()Ljava/lang/String;", "logVerbose", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "logDebug", "logInfo", "logWarn", "logError", "(Ljava/lang/Throwable;Ljava/lang/String;Z)V", "message", "(Ljava/lang/String;Ljava/lang/Throwable;ZLnI/a;)V", "logger_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GlobalFunctionsKt {
    public static final String createTag() {
        MethodHandles.lookup().lookupClass().getSimpleName();
        String name = MethodHandles.lookup().lookupClass().getName();
        C17542s.g(name);
        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
        return o12.length() == 0 ? name : C15854t.P0(o12, "Kt");
    }

    public static final void log(String str, Priority priority, Throwable th2, boolean z10, C17631a<String> aVar) {
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void log$default(String str, Priority priority, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            priority = Priority.DEBUG;
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static final void logDebug(String str, Throwable th2, boolean z10) {
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logDebug$default(String str, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logError(Throwable th2, String str, boolean z10) {
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, message + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name2 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, message + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name3 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, message + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name4 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, message + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name5 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logError$default(Throwable th2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str = name;
            }
            Log.v(str, message + " " + str2);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name2 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str = name2;
            }
            Log.d(str, message + " " + str2);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name3 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str = name3;
            }
            Log.i(str, message + " " + str2);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name4 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                str = name4;
            }
            Log.w(str, message + " " + str2);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                String name5 = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                str = name5;
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logInfo(String str, Throwable th2, boolean z10) {
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logInfo$default(String str, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logVerbose(String str, Throwable th2, boolean z10) {
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logVerbose$default(String str, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logWarn(String str, Throwable th2, boolean z10) {
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logWarn$default(String str, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void log(String str, Priority priority, Throwable th2, boolean z10) {
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logDebug(String str, Throwable th2, boolean z10, C17631a<String> aVar) {
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logError(String str, Throwable th2, boolean z10, C17631a<String> aVar) {
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logInfo(String str, Throwable th2, boolean z10, C17631a<String> aVar) {
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logVerbose(String str, Throwable th2, boolean z10, C17631a<String> aVar) {
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static final void logWarn(String str, Throwable th2, boolean z10, C17631a<String> aVar) {
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, invoke + " " + str2);
        } else if (i10 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, invoke + " " + str2);
        } else if (i10 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, invoke + " " + str2);
        } else if (i10 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, invoke + " " + str2);
        } else if (i10 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, invoke + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void log$default(String str, Priority priority, Throwable th2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            priority = Priority.DEBUG;
        }
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
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, message + " " + str2);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, message + " " + str2);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, message + " " + str2);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, message + " " + str2);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, message + " " + str2);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logDebug$default(String str, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logError$default(String str, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logInfo$default(String str, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logVerbose$default(String str, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }

    public static /* synthetic */ void logWarn$default(String str, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
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
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    str = C15854t.P0(o12, "Kt");
                }
            }
            Log.v(str, str2 + " " + str3);
        } else if (i11 == 2) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o13 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    str = C15854t.P0(o13, "Kt");
                }
            }
            Log.d(str, str2 + " " + str3);
        } else if (i11 == 3) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o14 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    str = C15854t.P0(o14, "Kt");
                }
            }
            Log.i(str, str2 + " " + str3);
        } else if (i11 == 4) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o15 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    str = C15854t.P0(o15, "Kt");
                }
            }
            Log.w(str, str2 + " " + str3);
        } else if (i11 == 5) {
            if (str == null) {
                MethodHandles.lookup().lookupClass().getSimpleName();
                str = MethodHandles.lookup().lookupClass().getName();
                C17542s.g(str);
                String o16 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    str = C15854t.P0(o16, "Kt");
                }
            }
            Log.e(str, str2 + " " + str3);
        } else {
            throw new t();
        }
    }
}
