package com.sugarcube.app.base.data.model;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/sugarcube/app/base/data/model/VideoMetaJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/VideoMeta;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/VideoMeta;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/VideoMeta;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "", "doubleAdapter", "", "listOfIntAdapter", "Lcom/sugarcube/app/base/data/model/Dimension;", "dimensionAdapter", "Lcom/sugarcube/app/base/data/model/OwnVideoSpecs;", "nullableOwnVideoSpecsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoMetaJsonAdapter extends f<VideoMeta> {
    public static final int $stable = 8;
    private volatile Constructor<VideoMeta> constructorRef;
    private final f<Dimension> dimensionAdapter;
    private final f<Double> doubleAdapter;
    private final f<Integer> intAdapter;
    private final f<List<Integer>> listOfIntAdapter;
    private final f<OwnVideoSpecs> nullableOwnVideoSpecsAdapter;
    private final k.a options;

    public VideoMetaJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("startingVideoFrameIndex", "stoppingVideoFrameIndex", "videoTimeSecs", "droppedVideoFrames", "videoFramerateSkip", "sourceFrameSize", "capturedFrameSize", "ownVideoSpecs");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.TYPE, g0.d(), "startingVideoFrameIndex");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        f<Double> f11 = tVar.f(Double.TYPE, g0.d(), "videoTimeSecs");
        C17542s.i(f11, "adapter(...)");
        this.doubleAdapter = f11;
        f<List<Integer>> f12 = tVar.f(w.j(List.class, Integer.class), g0.d(), "droppedVideoFrames");
        C17542s.i(f12, "adapter(...)");
        this.listOfIntAdapter = f12;
        f<Dimension> f13 = tVar.f(Dimension.class, g0.d(), "sourceFrameSize");
        C17542s.i(f13, "adapter(...)");
        this.dimensionAdapter = f13;
        f<OwnVideoSpecs> f14 = tVar.f(OwnVideoSpecs.class, g0.d(), "ownVideoSpecs");
        C17542s.i(f14, "adapter(...)");
        this.nullableOwnVideoSpecsAdapter = f14;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("VideoMeta");
        sb2.append(')');
        return sb2.toString();
    }

    public VideoMeta fromJson(k kVar) {
        String str;
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        int i10 = -1;
        Integer num = null;
        Integer num2 = null;
        Double d10 = null;
        Integer num3 = null;
        List list = null;
        Dimension dimension = null;
        Dimension dimension2 = null;
        OwnVideoSpecs ownVideoSpecs = null;
        while (true) {
            Dimension dimension3 = dimension2;
            Dimension dimension4 = dimension;
            if (kVar.hasNext()) {
                switch (kVar2.s(this.options)) {
                    case -1:
                        kVar.w();
                        kVar.a0();
                        break;
                    case 0:
                        num = this.intAdapter.fromJson(kVar2);
                        if (num == null) {
                            throw c.w("startingVideoFrameIndex", "startingVideoFrameIndex", kVar2);
                        }
                        break;
                    case 1:
                        num2 = this.intAdapter.fromJson(kVar2);
                        if (num2 == null) {
                            throw c.w("stoppingVideoFrameIndex", "stoppingVideoFrameIndex", kVar2);
                        }
                        break;
                    case 2:
                        d10 = this.doubleAdapter.fromJson(kVar2);
                        if (d10 == null) {
                            throw c.w("videoTimeSecs", "videoTimeSecs", kVar2);
                        }
                        break;
                    case 3:
                        list = this.listOfIntAdapter.fromJson(kVar2);
                        if (list == null) {
                            throw c.w("droppedVideoFrames", "droppedVideoFrames", kVar2);
                        }
                        break;
                    case 4:
                        num3 = this.intAdapter.fromJson(kVar2);
                        if (num3 == null) {
                            throw c.w("videoFramerateSkip", "videoFramerateSkip", kVar2);
                        }
                        break;
                    case 5:
                        dimension = this.dimensionAdapter.fromJson(kVar2);
                        if (dimension != null) {
                            dimension2 = dimension3;
                            continue;
                        } else {
                            throw c.w("sourceFrameSize", "sourceFrameSize", kVar2);
                        }
                    case 6:
                        dimension2 = this.dimensionAdapter.fromJson(kVar2);
                        if (dimension2 == null) {
                            throw c.w("capturedFrameSize", "capturedFrameSize", kVar2);
                        }
                        break;
                    case 7:
                        ownVideoSpecs = this.nullableOwnVideoSpecsAdapter.fromJson(kVar2);
                        dimension2 = dimension3;
                        dimension = dimension4;
                        i10 = -129;
                        continue;
                }
                dimension2 = dimension3;
                dimension = dimension4;
            } else {
                kVar.f();
                if (i10 != -129) {
                    Constructor<VideoMeta> constructor = this.constructorRef;
                    if (constructor == null) {
                        Class cls = Integer.TYPE;
                        str = "startingVideoFrameIndex";
                        Class<VideoMeta> cls2 = VideoMeta.class;
                        constructor = cls2.getDeclaredConstructor(new Class[]{cls, cls, Double.TYPE, List.class, cls, Dimension.class, Dimension.class, OwnVideoSpecs.class, cls, c.f112014c});
                        this.constructorRef = constructor;
                        C17542s.i(constructor, "also(...)");
                    } else {
                        str = "startingVideoFrameIndex";
                    }
                    if (num == null) {
                        String str2 = str;
                        throw c.n(str2, str2, kVar2);
                    } else if (num2 == null) {
                        throw c.n("stoppingVideoFrameIndex", "stoppingVideoFrameIndex", kVar2);
                    } else if (d10 == null) {
                        throw c.n("videoTimeSecs", "videoTimeSecs", kVar2);
                    } else if (list == null) {
                        throw c.n("droppedVideoFrames", "droppedVideoFrames", kVar2);
                    } else if (num3 == null) {
                        throw c.n("videoFramerateSkip", "videoFramerateSkip", kVar2);
                    } else if (dimension4 == null) {
                        throw c.n("sourceFrameSize", "sourceFrameSize", kVar2);
                    } else if (dimension3 != null) {
                        VideoMeta newInstance = constructor.newInstance(new Object[]{num, num2, d10, list, num3, dimension4, dimension3, ownVideoSpecs, Integer.valueOf(i10), null});
                        C17542s.i(newInstance, "newInstance(...)");
                        return newInstance;
                    } else {
                        throw c.n("capturedFrameSize", "capturedFrameSize", kVar2);
                    }
                } else if (num != null) {
                    int intValue = num.intValue();
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        if (d10 != null) {
                            double doubleValue = d10.doubleValue();
                            if (list == null) {
                                throw c.n("droppedVideoFrames", "droppedVideoFrames", kVar2);
                            } else if (num3 != null) {
                                int intValue3 = num3.intValue();
                                if (dimension4 == null) {
                                    throw c.n("sourceFrameSize", "sourceFrameSize", kVar2);
                                } else if (dimension3 != null) {
                                    return new VideoMeta(intValue, intValue2, doubleValue, list, intValue3, dimension4, dimension3, ownVideoSpecs);
                                } else {
                                    throw c.n("capturedFrameSize", "capturedFrameSize", kVar2);
                                }
                            } else {
                                throw c.n("videoFramerateSkip", "videoFramerateSkip", kVar2);
                            }
                        } else {
                            throw c.n("videoTimeSecs", "videoTimeSecs", kVar2);
                        }
                    } else {
                        throw c.n("stoppingVideoFrameIndex", "stoppingVideoFrameIndex", kVar2);
                    }
                } else {
                    throw c.n("startingVideoFrameIndex", "startingVideoFrameIndex", kVar2);
                }
            }
        }
    }

    public void toJson(q qVar, VideoMeta videoMeta) {
        C17542s.j(qVar, "writer");
        if (videoMeta != null) {
            qVar.d();
            qVar.n("startingVideoFrameIndex");
            this.intAdapter.toJson(qVar, Integer.valueOf(videoMeta.getStartingVideoFrameIndex()));
            qVar.n("stoppingVideoFrameIndex");
            this.intAdapter.toJson(qVar, Integer.valueOf(videoMeta.getStoppingVideoFrameIndex()));
            qVar.n("videoTimeSecs");
            this.doubleAdapter.toJson(qVar, Double.valueOf(videoMeta.getVideoTimeSecs()));
            qVar.n("droppedVideoFrames");
            this.listOfIntAdapter.toJson(qVar, videoMeta.getDroppedVideoFrames());
            qVar.n("videoFramerateSkip");
            this.intAdapter.toJson(qVar, Integer.valueOf(videoMeta.getVideoFramerateSkip()));
            qVar.n("sourceFrameSize");
            this.dimensionAdapter.toJson(qVar, videoMeta.getSourceFrameSize());
            qVar.n("capturedFrameSize");
            this.dimensionAdapter.toJson(qVar, videoMeta.getCapturedFrameSize());
            qVar.n("ownVideoSpecs");
            this.nullableOwnVideoSpecsAdapter.toJson(qVar, videoMeta.getOwnVideoSpecs());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
