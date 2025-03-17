package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

public class d<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Executor f43951h = new c();

    /* renamed from: a  reason: collision with root package name */
    private final r f43952a;

    /* renamed from: b  reason: collision with root package name */
    final c<T> f43953b;

    /* renamed from: c  reason: collision with root package name */
    Executor f43954c;

    /* renamed from: d  reason: collision with root package name */
    private final List<b<T>> f43955d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List<T> f43956e;

    /* renamed from: f  reason: collision with root package name */
    private List<T> f43957f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    int f43958g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f43959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43961c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f43962d;

        /* renamed from: androidx.recyclerview.widget.d$a$a  reason: collision with other inner class name */
        class C0752a extends h.b {
            C0752a() {
            }

            public boolean a(int i10, int i11) {
                Object obj = a.this.f43959a.get(i10);
                Object obj2 = a.this.f43960b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f43953b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            public boolean b(int i10, int i11) {
                Object obj = a.this.f43959a.get(i10);
                Object obj2 = a.this.f43960b.get(i11);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f43953b.b().areItemsTheSame(obj, obj2);
            }

            public Object c(int i10, int i11) {
                Object obj = a.this.f43959a.get(i10);
                Object obj2 = a.this.f43960b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f43953b.b().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            public int d() {
                return a.this.f43960b.size();
            }

            public int e() {
                return a.this.f43959a.size();
            }
        }

        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.e f43965a;

            b(h.e eVar) {
                this.f43965a = eVar;
            }

            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f43958g == aVar.f43961c) {
                    dVar.c(aVar.f43960b, this.f43965a, aVar.f43962d);
                }
            }
        }

        a(List list, List list2, int i10, Runnable runnable) {
            this.f43959a = list;
            this.f43960b = list2;
            this.f43961c = i10;
            this.f43962d = runnable;
        }

        public void run() {
            d.this.f43954c.execute(new b(h.b(new C0752a())));
        }
    }

    public interface b<T> {
        void a(List<T> list, List<T> list2);
    }

    private static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final Handler f43967a = new Handler(Looper.getMainLooper());

        c() {
        }

        public void execute(Runnable runnable) {
            this.f43967a.post(runnable);
        }
    }

    public d(r rVar, c<T> cVar) {
        this.f43952a = rVar;
        this.f43953b = cVar;
        if (cVar.c() != null) {
            this.f43954c = cVar.c();
        } else {
            this.f43954c = f43951h;
        }
    }

    private void d(List<T> list, Runnable runnable) {
        for (b<T> a10 : this.f43955d) {
            a10.a(list, this.f43957f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b<T> bVar) {
        this.f43955d.add(bVar);
    }

    public List<T> b() {
        return this.f43957f;
    }

    /* access modifiers changed from: package-private */
    public void c(List<T> list, h.e eVar, Runnable runnable) {
        List<T> list2 = this.f43957f;
        this.f43956e = list;
        this.f43957f = Collections.unmodifiableList(list);
        eVar.b(this.f43952a);
        d(list2, runnable);
    }

    public void e(List<T> list) {
        f(list, (Runnable) null);
    }

    public void f(List<T> list, Runnable runnable) {
        int i10 = this.f43958g + 1;
        this.f43958g = i10;
        List<T> list2 = this.f43956e;
        if (list != list2) {
            List<T> list3 = this.f43957f;
            if (list == null) {
                int size = list2.size();
                this.f43956e = null;
                this.f43957f = Collections.emptyList();
                this.f43952a.b(0, size);
                d(list3, runnable);
            } else if (list2 == null) {
                this.f43956e = list;
                this.f43957f = Collections.unmodifiableList(list);
                this.f43952a.a(0, list.size());
                d(list3, runnable);
            } else {
                this.f43953b.a().execute(new a(list2, list, i10, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }
}
