package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import fK.p;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@p
public final class StatisticRecord {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final double f46821a;

    /* renamed from: b  reason: collision with root package name */
    public final float f46822b;

    /* renamed from: c  reason: collision with root package name */
    public final float f46823c;

    /* renamed from: d  reason: collision with root package name */
    public final int f46824d;

    /* renamed from: e  reason: collision with root package name */
    public final double f46825e;

    /* renamed from: f  reason: collision with root package name */
    public final float f46826f;

    /* renamed from: g  reason: collision with root package name */
    public final float f46827g;

    public static final class a {
        public static StatisticRecord a(StatisticRecord statisticRecord, StatisticRecord statisticRecord2) {
            C17542s.j(statisticRecord, "<this>");
            if (statisticRecord2 == null || C17542s.e(statisticRecord2, statisticRecord)) {
                return statisticRecord;
            }
            double d10 = (double) 2;
            return new StatisticRecord((statisticRecord.f46821a + statisticRecord2.f46821a) / d10, Math.min(statisticRecord.f46822b, statisticRecord2.f46822b), Math.min(statisticRecord.f46823c, statisticRecord2.f46823c), statisticRecord.f46824d + statisticRecord2.f46824d, (statisticRecord.f46825e + statisticRecord2.f46825e) / d10, Math.max(statisticRecord.f46826f, statisticRecord2.f46826f), Math.max(statisticRecord.f46827g, statisticRecord2.f46827g));
        }

        public final KSerializer<StatisticRecord> serializer() {
            return StatisticRecord$$serializer.INSTANCE;
        }
    }

    public StatisticRecord() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatisticRecord)) {
            return false;
        }
        StatisticRecord statisticRecord = (StatisticRecord) obj;
        return Double.compare(this.f46821a, statisticRecord.f46821a) == 0 && Float.compare(this.f46822b, statisticRecord.f46822b) == 0 && Float.compare(this.f46823c, statisticRecord.f46823c) == 0 && this.f46824d == statisticRecord.f46824d && Double.compare(this.f46825e, statisticRecord.f46825e) == 0 && Float.compare(this.f46826f, statisticRecord.f46826f) == 0 && Float.compare(this.f46827g, statisticRecord.f46827g) == 0;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f46822b);
        int hashCode2 = Float.hashCode(this.f46823c);
        int hashCode3 = Integer.hashCode(this.f46824d);
        int hashCode4 = Double.hashCode(this.f46825e);
        int hashCode5 = Float.hashCode(this.f46826f);
        return Float.hashCode(this.f46827g) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (Double.hashCode(this.f46821a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatisticRecord(median=" + this.f46821a + ", min=" + this.f46822b + ", p10=" + this.f46823c + ", count=" + this.f46824d + ", avg=" + this.f46825e + ", p90=" + this.f46826f + ", max=" + this.f46827g + ')';
    }

    public StatisticRecord(double d10, float f10, float f11, int i10, double d11, float f12, float f13) {
        this.f46821a = d10;
        this.f46822b = f10;
        this.f46823c = f11;
        this.f46824d = i10;
        this.f46825e = d11;
        this.f46826f = f12;
        this.f46827g = f13;
    }

    public /* synthetic */ StatisticRecord(int i10) {
        this(0.0d, 0.0f, 0.0f, 0, 0.0d, 0.0f, 0.0f);
    }

    @C16814e
    public StatisticRecord(int i10, double d10, float f10, float f11, int i11, double d11, float f12, float f13) {
        if ((i10 & 1) == 0) {
            this.f46821a = 0.0d;
        } else {
            this.f46821a = d10;
        }
        if ((i10 & 2) == 0) {
            this.f46822b = 0.0f;
        } else {
            this.f46822b = f10;
        }
        if ((i10 & 4) == 0) {
            this.f46823c = 0.0f;
        } else {
            this.f46823c = f11;
        }
        if ((i10 & 8) == 0) {
            this.f46824d = 0;
        } else {
            this.f46824d = i11;
        }
        if ((i10 & 16) == 0) {
            this.f46825e = 0.0d;
        } else {
            this.f46825e = d11;
        }
        if ((i10 & 32) == 0) {
            this.f46826f = 0.0f;
        } else {
            this.f46826f = f12;
        }
        if ((i10 & 64) == 0) {
            this.f46827g = 0.0f;
        } else {
            this.f46827g = f13;
        }
    }
}
