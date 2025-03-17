package com.optimizely.ab.android.datafile_handler;

import android.content.Context;
import androidx.work.C7037f;
import androidx.work.C7054x;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import org.slf4j.LoggerFactory;
import vE.C15140a;
import vE.C15141b;
import vE.d;
import vE.e;
import yE.C15298a;
import yE.C15299b;
import yE.C15301d;
import yE.C15302e;

public class DatafileWorker extends Worker {

    /* renamed from: a  reason: collision with root package name */
    public e f122267a;

    public DatafileWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f122267a = new e(context, new C15141b(new C15299b(new C15302e(context), LoggerFactory.getLogger((Class<?>) C15302e.class)), LoggerFactory.getLogger((Class<?>) C15141b.class)), (C15140a) null, LoggerFactory.getLogger((Class<?>) e.class));
    }

    public static C7037f d(C15301d dVar) {
        return new C7037f.a().i("DatafileConfig", dVar.d()).a();
    }

    public static C15301d e(C7037f fVar) {
        return C15301d.a(fVar.g("DatafileConfig"));
    }

    public C7054x.a b() {
        C15301d e10 = e(getInputData());
        this.f122267a.j(e10.c(), new C15140a(e10.b(), new C15298a(getApplicationContext(), LoggerFactory.getLogger((Class<?>) C15298a.class)), LoggerFactory.getLogger((Class<?>) C15140a.class)), (d) null);
        return C7054x.a.c();
    }
}
