package androidx.work;

import android.net.Network;
import android.net.Uri;
import dI.C17168i;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import u5.C8878b;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f45111a;

    /* renamed from: b  reason: collision with root package name */
    private C7037f f45112b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f45113c;

    /* renamed from: d  reason: collision with root package name */
    private a f45114d;

    /* renamed from: e  reason: collision with root package name */
    private int f45115e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f45116f;

    /* renamed from: g  reason: collision with root package name */
    private C17168i f45117g;

    /* renamed from: h  reason: collision with root package name */
    private C8878b f45118h;

    /* renamed from: i  reason: collision with root package name */
    private V f45119i;

    /* renamed from: j  reason: collision with root package name */
    private J f45120j;

    /* renamed from: k  reason: collision with root package name */
    private C7044m f45121k;

    /* renamed from: l  reason: collision with root package name */
    private int f45122l;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f45123a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f45124b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f45125c;
    }

    public WorkerParameters(UUID uuid, C7037f fVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, C17168i iVar, C8878b bVar, V v10, J j10, C7044m mVar) {
        this.f45111a = uuid;
        this.f45112b = fVar;
        this.f45113c = new HashSet(collection);
        this.f45114d = aVar;
        this.f45115e = i10;
        this.f45122l = i11;
        this.f45116f = executor;
        this.f45117g = iVar;
        this.f45118h = bVar;
        this.f45119i = v10;
        this.f45120j = j10;
        this.f45121k = mVar;
    }

    public Executor a() {
        return this.f45116f;
    }

    public C7044m b() {
        return this.f45121k;
    }

    public UUID c() {
        return this.f45111a;
    }

    public C7037f d() {
        return this.f45112b;
    }

    public Network e() {
        return this.f45114d.f45125c;
    }

    public J f() {
        return this.f45120j;
    }

    public int g() {
        return this.f45115e;
    }

    public Set<String> h() {
        return this.f45113c;
    }

    public C8878b i() {
        return this.f45118h;
    }

    public List<String> j() {
        return this.f45114d.f45123a;
    }

    public List<Uri> k() {
        return this.f45114d.f45124b;
    }

    public C17168i l() {
        return this.f45117g;
    }

    public V m() {
        return this.f45119i;
    }
}
