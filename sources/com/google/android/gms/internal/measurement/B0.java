package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import jb.l;

@TargetApi(24)
public final class B0 {

    /* renamed from: b  reason: collision with root package name */
    private static final Method f48540b = e();

    /* renamed from: c  reason: collision with root package name */
    private static final Method f48541c = d();

    /* renamed from: a  reason: collision with root package name */
    private final JobScheduler f48542a;

    private B0(JobScheduler jobScheduler) {
        this.f48542a = jobScheduler;
    }

    private static int a() {
        Method method = f48541c;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, (Object[]) null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e10);
                }
            }
        }
        return 0;
    }

    private final int b(JobInfo jobInfo, String str, int i10, String str2) {
        Method method = f48540b;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.f48542a, new Object[]{jobInfo, str, Integer.valueOf(i10), str2});
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.e(str2, "error calling scheduleAsPackage", e10);
            }
        }
        return this.f48542a.schedule(jobInfo);
    }

    public static int c(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) l.j((JobScheduler) context.getSystemService("jobscheduler"));
        return (f48540b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new B0(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static Method d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    private static Method e() {
        Class<String> cls = String.class;
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }
}
