package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.F;
import com.squareup.picasso.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class v extends ThreadPoolExecutor {

    private static final class a extends FutureTask<C14192c> implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        private final C14192c f122633a;

        a(C14192c cVar) {
            super(cVar, (Object) null);
            this.f122633a = cVar;
        }

        /* renamed from: b */
        public int compareTo(a aVar) {
            t.f r10 = this.f122633a.r();
            t.f r11 = aVar.f122633a.r();
            return r10 == r11 ? this.f122633a.f122525a - aVar.f122633a.f122525a : r11.ordinal() - r10.ordinal();
        }
    }

    v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new F.c());
    }

    private void b(int i10) {
        setCorePoolSize(i10);
        setMaximumPoolSize(i10);
    }

    /* access modifiers changed from: package-private */
    public void a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            b(3);
                            return;
                        default:
                            b(3);
                            return;
                    }
            }
            b(2);
        } else if (type == 1 || type == 6 || type == 9) {
            b(4);
        } else {
            b(3);
        }
    }

    public Future<?> submit(Runnable runnable) {
        a aVar = new a((C14192c) runnable);
        execute(aVar);
        return aVar;
    }
}
