package com.sugarcube.app.base.data.database;

import N4.b;
import XH.C16807N;
import android.content.Context;
import androidx.room.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\" \u0010\u0011\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000b\" \u0010\u0014\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0015\u0010\u000b\" \u0010\u0017\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u0012\u0004\b\u0019\u0010\r\u001a\u0004\b\u0018\u0010\u000b\" \u0010\u001a\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001d"}, d2 = {"Landroid/content/Context;", "context", "Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "getDatabase", "(Landroid/content/Context;)Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "INSTANCE", "Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "LN4/b;", "MIGRATION_1_2", "LN4/b;", "getMIGRATION_1_2", "()LN4/b;", "getMIGRATION_1_2$annotations", "()V", "MIGRATION_2_3", "getMIGRATION_2_3", "getMIGRATION_2_3$annotations", "MIGRATION_3_4", "getMIGRATION_3_4", "getMIGRATION_3_4$annotations", "MIGRATION_4_5", "getMIGRATION_4_5", "getMIGRATION_4_5$annotations", "MIGRATION_5_6", "getMIGRATION_5_6", "getMIGRATION_5_6$annotations", "MIGRATION_6_7", "getMIGRATION_6_7", "getMIGRATION_6_7$annotations", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DaoEntitiesKt {
    private static ScenesDatabase INSTANCE;
    private static final b MIGRATION_1_2 = new DaoEntitiesKt$MIGRATION_1_2$1();
    private static final b MIGRATION_2_3 = new DaoEntitiesKt$MIGRATION_2_3$1();
    private static final b MIGRATION_3_4 = new DaoEntitiesKt$MIGRATION_3_4$1();
    private static final b MIGRATION_4_5 = new DaoEntitiesKt$MIGRATION_4_5$1();
    private static final b MIGRATION_5_6 = new DaoEntitiesKt$MIGRATION_5_6$1();
    private static final b MIGRATION_6_7 = new DaoEntitiesKt$MIGRATION_6_7$1();

    public static final ScenesDatabase getDatabase(Context context) {
        C17542s.j(context, "context");
        synchronized (ScenesDatabase.class) {
            try {
                if (INSTANCE == null) {
                    INSTANCE = w.a(context, ScenesDatabase.class, "scenes.db").b(MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6, MIGRATION_6_7).f().e();
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ScenesDatabase scenesDatabase = INSTANCE;
        if (scenesDatabase != null) {
            return scenesDatabase;
        }
        C17542s.z("INSTANCE");
        return null;
    }

    public static final b getMIGRATION_1_2() {
        return MIGRATION_1_2;
    }

    public static /* synthetic */ void getMIGRATION_1_2$annotations() {
    }

    public static final b getMIGRATION_2_3() {
        return MIGRATION_2_3;
    }

    public static /* synthetic */ void getMIGRATION_2_3$annotations() {
    }

    public static final b getMIGRATION_3_4() {
        return MIGRATION_3_4;
    }

    public static /* synthetic */ void getMIGRATION_3_4$annotations() {
    }

    public static final b getMIGRATION_4_5() {
        return MIGRATION_4_5;
    }

    public static /* synthetic */ void getMIGRATION_4_5$annotations() {
    }

    public static final b getMIGRATION_5_6() {
        return MIGRATION_5_6;
    }

    public static /* synthetic */ void getMIGRATION_5_6$annotations() {
    }

    public static final b getMIGRATION_6_7() {
        return MIGRATION_6_7;
    }

    public static /* synthetic */ void getMIGRATION_6_7$annotations() {
    }
}
