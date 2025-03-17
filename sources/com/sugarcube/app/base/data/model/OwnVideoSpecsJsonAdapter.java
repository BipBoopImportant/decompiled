package com.sugarcube.app.base.data.model;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/sugarcube/app/base/data/model/OwnVideoSpecsJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "", "longAdapter", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OwnVideoSpecsJsonAdapter extends f<OwnVideoSpecs> {
    public static final int $stable = 8;
    private final f<Integer> intAdapter;
    private final f<Long> longAdapter;
    private final k.a options;

    public OwnVideoSpecsJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("frameRate", "bitRate", "presentationTimeUs", "frameProcessCount", "frameDrainedCount");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.TYPE, g0.d(), "frameRate");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        f<Long> f11 = tVar.f(Long.TYPE, g0.d(), "presentationTimeUs");
        C17542s.i(f11, "adapter(...)");
        this.longAdapter = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OwnVideoSpecs");
        sb2.append(')');
        return sb2.toString();
    }

    public OwnVideoSpecs fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                num = this.intAdapter.fromJson(kVar);
                if (num == null) {
                    throw c.w("frameRate", "frameRate", kVar);
                }
            } else if (s10 == 1) {
                num2 = this.intAdapter.fromJson(kVar);
                if (num2 == null) {
                    throw c.w("bitRate", "bitRate", kVar);
                }
            } else if (s10 == 2) {
                l10 = this.longAdapter.fromJson(kVar);
                if (l10 == null) {
                    throw c.w("presentationTimeUs", "presentationTimeUs", kVar);
                }
            } else if (s10 == 3) {
                num3 = this.intAdapter.fromJson(kVar);
                if (num3 == null) {
                    throw c.w("frameProcessCount", "frameProcessCount", kVar);
                }
            } else if (s10 == 4 && (num4 = this.intAdapter.fromJson(kVar)) == null) {
                throw c.w("frameDrainedCount", "frameDrainedCount", kVar);
            }
        }
        kVar.f();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (l10 != null) {
                    long longValue = l10.longValue();
                    if (num3 != null) {
                        int intValue3 = num3.intValue();
                        if (num4 != null) {
                            return new OwnVideoSpecs(intValue, intValue2, longValue, intValue3, num4.intValue());
                        }
                        throw c.n("frameDrainedCount", "frameDrainedCount", kVar);
                    }
                    throw c.n("frameProcessCount", "frameProcessCount", kVar);
                }
                throw c.n("presentationTimeUs", "presentationTimeUs", kVar);
            }
            throw c.n("bitRate", "bitRate", kVar);
        }
        throw c.n("frameRate", "frameRate", kVar);
    }

    public void toJson(q qVar, OwnVideoSpecs ownVideoSpecs) {
        C17542s.j(qVar, "writer");
        if (ownVideoSpecs != null) {
            qVar.d();
            qVar.n("frameRate");
            this.intAdapter.toJson(qVar, Integer.valueOf(ownVideoSpecs.getFrameRate()));
            qVar.n("bitRate");
            this.intAdapter.toJson(qVar, Integer.valueOf(ownVideoSpecs.getBitRate()));
            qVar.n("presentationTimeUs");
            this.longAdapter.toJson(qVar, Long.valueOf(ownVideoSpecs.getPresentationTimeUs()));
            qVar.n("frameProcessCount");
            this.intAdapter.toJson(qVar, Integer.valueOf(ownVideoSpecs.getFrameProcessCount()));
            qVar.n("frameDrainedCount");
            this.intAdapter.toJson(qVar, Integer.valueOf(ownVideoSpecs.getFrameDrainedCount()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
