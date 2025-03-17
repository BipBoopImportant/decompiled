package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.C7356m3;
import com.google.android.gms.internal.measurement.C7452y3;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sa.C8752e;

public final class K {

    /* renamed from: A  reason: collision with root package name */
    public static final Y1<Long> f49690A = F("measurement.sgtm.upload.min_delay_after_background", 600000L, new C7674r0());

    /* renamed from: A0  reason: collision with root package name */
    public static final Y1<Boolean> f49691A0;

    /* renamed from: B  reason: collision with root package name */
    public static final Y1<Long> f49692B = F("measurement.upload.backoff_period", 43200000L, new C7695u0());

    /* renamed from: B0  reason: collision with root package name */
    public static final Y1<Boolean> f49693B0;

    /* renamed from: C  reason: collision with root package name */
    public static final Y1<Long> f49694C = F("measurement.upload.window_interval", 3600000L, new C7709w0());

    /* renamed from: C0  reason: collision with root package name */
    public static final Y1<Boolean> f49695C0;

    /* renamed from: D  reason: collision with root package name */
    public static final Y1<Long> f49696D = F("measurement.upload.interval", 3600000L, new C7702v0());

    /* renamed from: D0  reason: collision with root package name */
    public static final Y1<Boolean> f49697D0;

    /* renamed from: E  reason: collision with root package name */
    public static final Y1<Long> f49698E = F("measurement.upload.realtime_upload_interval", 10000L, new C7723y0());

    /* renamed from: E0  reason: collision with root package name */
    public static final Y1<Integer> f49699E0 = F("measurement.service.storage_consent_support_version", 203600, new J1());

    /* renamed from: F  reason: collision with root package name */
    public static final Y1<Long> f49700F = F("measurement.upload.debug_upload_interval", 1000L, new B0());

    /* renamed from: F0  reason: collision with root package name */
    public static final Y1<Boolean> f49701F0;

    /* renamed from: G  reason: collision with root package name */
    public static final Y1<Long> f49702G = F("measurement.upload.minimum_delay", 500L, new A0());

    /* renamed from: G0  reason: collision with root package name */
    public static final Y1<Boolean> f49703G0;

    /* renamed from: H  reason: collision with root package name */
    public static final Y1<Long> f49704H = F("measurement.alarm_manager.minimum_interval", 60000L, new D0());

    /* renamed from: H0  reason: collision with root package name */
    public static final Y1<Boolean> f49705H0;

    /* renamed from: I  reason: collision with root package name */
    public static final Y1<Long> f49706I = F("measurement.upload.stale_data_deletion_interval", 86400000L, new C0());

    /* renamed from: I0  reason: collision with root package name */
    public static final Y1<Boolean> f49707I0;

    /* renamed from: J  reason: collision with root package name */
    public static final Y1<Long> f49708J = F("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new F0());

    /* renamed from: J0  reason: collision with root package name */
    public static final Y1<Boolean> f49709J0;

    /* renamed from: K  reason: collision with root package name */
    public static final Y1<Long> f49710K = F("measurement.upload.initial_upload_delay_time", 15000L, new E0());

    /* renamed from: K0  reason: collision with root package name */
    public static final Y1<Boolean> f49711K0;

    /* renamed from: L  reason: collision with root package name */
    public static final Y1<Long> f49712L = F("measurement.upload.retry_time", 1800000L, new G0());

    /* renamed from: L0  reason: collision with root package name */
    public static final Y1<Boolean> f49713L0;

    /* renamed from: M  reason: collision with root package name */
    public static final Y1<Integer> f49714M = F("measurement.upload.retry_count", 6, new J0());

    /* renamed from: M0  reason: collision with root package name */
    public static final Y1<Boolean> f49715M0;

    /* renamed from: N  reason: collision with root package name */
    public static final Y1<Long> f49716N = F("measurement.upload.max_queue_time", 518400000L, new I0());

    /* renamed from: N0  reason: collision with root package name */
    public static final Y1<Boolean> f49717N0;

    /* renamed from: O  reason: collision with root package name */
    public static final Y1<Long> f49718O = F("measurement.upload.google_signal_max_queue_time", 300000L, new L0());

    /* renamed from: O0  reason: collision with root package name */
    public static final Y1<Boolean> f49719O0;

    /* renamed from: P  reason: collision with root package name */
    public static final Y1<Integer> f49720P = F("measurement.lifetimevalue.max_currency_tracked", 4, new N0());

    /* renamed from: P0  reason: collision with root package name */
    public static final Y1<Boolean> f49721P0;

    /* renamed from: Q  reason: collision with root package name */
    public static final Y1<Integer> f49722Q = F("measurement.audience.filter_result_max_count", 200, new M0());

    /* renamed from: Q0  reason: collision with root package name */
    public static final Y1<Boolean> f49723Q0;

    /* renamed from: R  reason: collision with root package name */
    public static final Y1<Integer> f49724R = a("measurement.upload.max_public_user_properties", 100);

    /* renamed from: R0  reason: collision with root package name */
    public static final Y1<Boolean> f49725R0;

    /* renamed from: S  reason: collision with root package name */
    public static final Y1<Integer> f49726S = a("measurement.upload.max_event_name_cardinality", 2000);

    /* renamed from: S0  reason: collision with root package name */
    public static final Y1<Boolean> f49727S0;

    /* renamed from: T  reason: collision with root package name */
    public static final Y1<Integer> f49728T = a("measurement.upload.max_public_event_params", 100);

    /* renamed from: T0  reason: collision with root package name */
    public static final Y1<Boolean> f49729T0;

    /* renamed from: U  reason: collision with root package name */
    public static final Y1<Long> f49730U = F("measurement.service_client.idle_disconnect_millis", 5000L, new P0());

    /* renamed from: U0  reason: collision with root package name */
    public static final Y1<Boolean> f49731U0;

    /* renamed from: V  reason: collision with root package name */
    public static final Y1<Boolean> f49732V;

    /* renamed from: V0  reason: collision with root package name */
    public static final Y1<Boolean> f49733V0;

    /* renamed from: W  reason: collision with root package name */
    public static final Y1<String> f49734W = F("measurement.test.string_flag", "---", new R0());

    /* renamed from: W0  reason: collision with root package name */
    public static final Y1<Boolean> f49735W0;

    /* renamed from: X  reason: collision with root package name */
    public static final Y1<Long> f49736X = F("measurement.test.long_flag", -1L, new T0());

    /* renamed from: X0  reason: collision with root package name */
    public static final Y1<Boolean> f49737X0;

    /* renamed from: Y  reason: collision with root package name */
    public static final Y1<Integer> f49738Y = F("measurement.test.int_flag", -2, new V0());

    /* renamed from: Y0  reason: collision with root package name */
    public static final Y1<Boolean> f49739Y0;

    /* renamed from: Z  reason: collision with root package name */
    public static final Y1<Double> f49740Z = F("measurement.test.double_flag", Double.valueOf(-3.0d), new U0());

    /* renamed from: Z0  reason: collision with root package name */
    public static final Y1<Boolean> f49741Z0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List<Y1<?>> f49742a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a0  reason: collision with root package name */
    public static final Y1<Integer> f49743a0 = F("measurement.experiment.max_ids", 50, new X0());

    /* renamed from: a1  reason: collision with root package name */
    public static final Y1<Boolean> f49744a1;

    /* renamed from: b  reason: collision with root package name */
    public static final Y1<Long> f49745b = F("measurement.ad_id_cache_time", 10000L, new M());

    /* renamed from: b0  reason: collision with root package name */
    public static final Y1<Integer> f49746b0 = F("measurement.upload.max_item_scoped_custom_parameters", 27, new Z0());

    /* renamed from: b1  reason: collision with root package name */
    public static final Y1<Boolean> f49747b1;

    /* renamed from: c  reason: collision with root package name */
    public static final Y1<Long> f49748c = F("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new C7633l0());

    /* renamed from: c0  reason: collision with root package name */
    public static final Y1<Integer> f49749c0 = b("measurement.upload.max_event_parameter_value_length", 500, new Y0());

    /* renamed from: c1  reason: collision with root package name */
    public static final Y1<Boolean> f49750c1;

    /* renamed from: d  reason: collision with root package name */
    public static final Y1<Long> f49751d = F("measurement.monitoring.sample_period_millis", 86400000L, new C7716x0());

    /* renamed from: d0  reason: collision with root package name */
    public static final Y1<Integer> f49752d0 = F("measurement.max_bundles_per_iteration", 100, new C7571c1());

    /* renamed from: d1  reason: collision with root package name */
    public static final Y1<Boolean> f49753d1;

    /* renamed from: e  reason: collision with root package name */
    public static final Y1<Long> f49754e = c("measurement.config.cache_time", 86400000L, 3600000L, new K0(), false);

    /* renamed from: e0  reason: collision with root package name */
    public static final Y1<Long> f49755e0 = F("measurement.sdk.attribution.cache.ttl", 604800000L, new C7564b1());

    /* renamed from: e1  reason: collision with root package name */
    public static final Y1<Boolean> f49756e1;

    /* renamed from: f  reason: collision with root package name */
    public static final Y1<String> f49757f = F("measurement.config.url_scheme", Constants.SCHEME, new W0());

    /* renamed from: f0  reason: collision with root package name */
    public static final Y1<Long> f49758f0 = F("measurement.redaction.app_instance_id.ttl", 7200000L, new C7578d1());

    /* renamed from: f1  reason: collision with root package name */
    public static final Y1<Boolean> f49759f1;

    /* renamed from: g  reason: collision with root package name */
    public static final Y1<String> f49760g = F("measurement.config.url_authority", "app-measurement.com", new C7620j1());

    /* renamed from: g0  reason: collision with root package name */
    public static final Y1<Integer> f49761g0 = F("measurement.rb.attribution.client.min_ad_services_version", 7, new C7599g1());

    /* renamed from: h  reason: collision with root package name */
    public static final Y1<Integer> f49762h = F("measurement.upload.max_bundles", 100, new C7703v1());

    /* renamed from: h0  reason: collision with root package name */
    public static final Y1<Integer> f49763h0 = F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new C7592f1());

    /* renamed from: i  reason: collision with root package name */
    public static final Y1<Integer> f49764i;

    /* renamed from: i0  reason: collision with root package name */
    public static final Y1<String> f49765i0 = F("measurement.rb.attribution.uri_scheme", Constants.SCHEME, new C7613i1());

    /* renamed from: j  reason: collision with root package name */
    public static final Y1<Integer> f49766j;

    /* renamed from: j0  reason: collision with root package name */
    public static final Y1<String> f49767j0 = F("measurement.rb.attribution.uri_authority", "google-analytics.com", new C7606h1());

    /* renamed from: k  reason: collision with root package name */
    public static final Y1<Integer> f49768k = F("measurement.upload.max_events_per_bundle", 1000, new Z());

    /* renamed from: k0  reason: collision with root package name */
    public static final Y1<String> f49769k0 = F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new C7627k1());

    /* renamed from: l  reason: collision with root package name */
    public static final Y1<Integer> f49770l = F("measurement.upload.max_events_per_day", 100000, new C7570c0());

    /* renamed from: l0  reason: collision with root package name */
    public static final Y1<Long> f49771l0 = F("measurement.session.engagement_interval", 3600000L, new C7641m1());

    /* renamed from: m  reason: collision with root package name */
    public static final Y1<Integer> f49772m = F("measurement.upload.max_error_events_per_day", 1000, new C7563b0());

    /* renamed from: m0  reason: collision with root package name */
    public static final Y1<String> f49773m0 = F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new C7634l1());

    /* renamed from: n  reason: collision with root package name */
    public static final Y1<Integer> f49774n = F("measurement.upload.max_public_events_per_day", 50000, new C7584e0());

    /* renamed from: n0  reason: collision with root package name */
    public static final Y1<String> f49775n0 = F("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new C7655o1());

    /* renamed from: o  reason: collision with root package name */
    public static final Y1<Integer> f49776o = F("measurement.upload.max_conversions_per_day", 10000, new C7577d0());

    /* renamed from: o0  reason: collision with root package name */
    public static final Y1<String> f49777o0 = F("measurement.rb.attribution.event_params", "value|currency", new C7669q1());

    /* renamed from: p  reason: collision with root package name */
    public static final Y1<Integer> f49778p = F("measurement.upload.max_realtime_events_per_day", 10, new C7598g0());

    /* renamed from: p0  reason: collision with root package name */
    public static final Y1<String> f49779p0 = F("measurement.rb.attribution.query_parameters_to_remove", "", new C7662p1());

    /* renamed from: q  reason: collision with root package name */
    public static final Y1<Integer> f49780q = F("measurement.store.max_stored_events_per_app", 100000, new C7591f0());

    /* renamed from: q0  reason: collision with root package name */
    public static final Y1<Long> f49781q0 = F("measurement.rb.attribution.max_queue_time", 864000000L, new C7682s1());

    /* renamed from: r  reason: collision with root package name */
    public static final Y1<String> f49782r = F("measurement.upload.url", "https://app-measurement.com/a", new C7612i0());

    /* renamed from: r0  reason: collision with root package name */
    public static final Y1<Integer> f49783r0 = F("measurement.rb.attribution.max_retry_delay_seconds", 16, new C7675r1());

    /* renamed from: s  reason: collision with root package name */
    public static final Y1<String> f49784s = F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", new C7605h0());

    /* renamed from: s0  reason: collision with root package name */
    public static final Y1<Integer> f49785s0 = F("measurement.rb.attribution.client.min_time_after_boot_seconds", 0, new C7696u1());

    /* renamed from: t  reason: collision with root package name */
    public static final Y1<String> f49786t = F("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile", new C7619j0());

    /* renamed from: t0  reason: collision with root package name */
    public static final Y1<Integer> f49787t0 = F("measurement.rb.max_trigger_registrations_per_day", 1000, new C7710w1());

    /* renamed from: u  reason: collision with root package name */
    public static final Y1<Long> f49788u = F("measurement.sgtm.upload.retry_interval", 1800000L, new C7640m0());

    /* renamed from: u0  reason: collision with root package name */
    public static final Y1<Boolean> f49789u0;

    /* renamed from: v  reason: collision with root package name */
    public static final Y1<Long> f49790v = F("measurement.sgtm.upload.retry_max_wait", 21600000L, new C7654o0());

    /* renamed from: v0  reason: collision with root package name */
    public static final Y1<Boolean> f49791v0;

    /* renamed from: w  reason: collision with root package name */
    public static final Y1<Integer> f49792w = F("measurement.sgtm.upload.max_queued_batches", 5000, new C7647n0());

    /* renamed from: w0  reason: collision with root package name */
    public static final Y1<Integer> f49793w0 = F("measurement.rb.attribution.notify_app_delay_millis", 0, new C7731z1());

    /* renamed from: x  reason: collision with root package name */
    public static final Y1<Integer> f49794x = F("measurement.sgtm.upload.batches_retrieval_limit", 10, new C7668q0());

    /* renamed from: x0  reason: collision with root package name */
    public static final Y1<Boolean> f49795x0;

    /* renamed from: y  reason: collision with root package name */
    public static final Y1<Long> f49796y = F("measurement.sgtm.upload.min_delay_after_startup", 5000L, new C7661p0());

    /* renamed from: y0  reason: collision with root package name */
    public static final Y1<Boolean> f49797y0;

    /* renamed from: z  reason: collision with root package name */
    public static final Y1<Long> f49798z = F("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, new C7681s0());

    /* renamed from: z0  reason: collision with root package name */
    public static final Y1<Boolean> f49799z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
        f49764i = F("measurement.upload.max_batch_size", valueOf, new I1());
        f49766j = F("measurement.upload.max_bundle_size", valueOf, new U1());
        Boolean bool = Boolean.FALSE;
        f49732V = F("measurement.test.boolean_flag", bool, new O0());
        b("measurement.test.cached_long_flag", -1L, new S0());
        F("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new C7689t1());
        Boolean bool2 = Boolean.TRUE;
        f49789u0 = F("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new C7724y1());
        f49791v0 = F("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new C7717x1());
        f49795x0 = a("measurement.quality.checksum", bool);
        f49797y0 = F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new D1());
        f49799z0 = F("measurement.audience.refresh_event_count_filters_timestamp", bool, new C1());
        f49691A0 = b("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new F1());
        f49693B0 = F("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new E1());
        f49695C0 = F("measurement.integration.disable_firebase_instance_id", bool, new H1());
        f49697D0 = F("measurement.collection.service.update_with_analytics_fix", bool, new G1());
        f49701F0 = F("measurement.service.store_null_safelist", bool2, new L1());
        f49703G0 = F("measurement.service.store_safelist", bool2, new N1());
        f49705H0 = F("measurement.session_stitching_token_enabled", bool, new M1());
        f49707I0 = F("measurement.sgtm.upload_queue", bool, new P1());
        f49709J0 = F("measurement.sgtm.google_signal.enable", bool, new O1());
        f49711K0 = F("measurement.sgtm.no_proxy.service", bool, new R1());
        f49713L0 = F("measurement.sgtm.service.batching_on_backgrounded", bool, new Q1());
        f49715M0 = b("measurement.sgtm.no_proxy.client.dev", bool, new T1());
        f49717N0 = b("measurement.sgtm.client.upload_on_backgrounded.dev", bool, new S1());
        f49719O0 = b("measurement.sgtm.client.scion_upload_action.dev", bool, new V1());
        f49721P0 = F("measurement.gmscore_client_telemetry", bool, new O());
        f49723Q0 = b("measurement.rb.attribution.service", bool2, new N());
        f49725R0 = b("measurement.rb.attribution.client2", bool2, new Q());
        f49727S0 = F("measurement.rb.attribution.uuid_generation", bool2, new P());
        f49729T0 = F("measurement.rb.attribution.enable_trigger_redaction", bool2, new T());
        F("measurement.rb.attribution.followup1.service", bool, new S());
        f49731U0 = F("measurement.rb.attribution.retry_disposition", bool, new V());
        f49733V0 = F("measurement.rb.attribution.ad_campaign_info", bool2, new U());
        f49735W0 = F("measurement.client.sessions.enable_fix_background_engagement", bool, new X());
        f49737X0 = F("measurement.fix_engagement_on_reset_analytics_data", bool2, new W());
        f49739Y0 = F("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new C7626k0());
        f49741Z0 = F("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new C7688t0());
        f49744a1 = F("measurement.set_default_event_parameters.fix_deferred_analytics_collection", bool, new H0());
        f49747b1 = F("measurement.chimera.parameter.service", bool2, new Q0());
        f49750c1 = F("measurement.service.ad_impression.convert_value_to_double", bool2, new C7585e1());
        F("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new C7648n1());
        F("measurement.remove_conflicting_first_party_apis.dev", bool, new A1());
        f49753d1 = F("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, new K1());
        f49756e1 = F("measurement.rb.attribution.client.get_trigger_uris_async", bool, new L());
        f49759f1 = F("measurement.backfill_session_ids.service", bool, new C7556a0());
    }

    private static <V> Y1<V> F(String str, V v10, X1<V> x12) {
        return c(str, v10, v10, x12, false);
    }

    private static <V> Y1<V> a(String str, V v10) {
        return c(str, v10, v10, (X1) null, false);
    }

    private static <V> Y1<V> b(String str, V v10, X1<V> x12) {
        return c(str, v10, v10, x12, true);
    }

    private static <V> Y1<V> c(String str, V v10, V v11, X1<V> x12, boolean z10) {
        Y1 y12 = new Y1(str, v10, v11, x12);
        if (z10) {
            f49742a.add(y12);
        }
        return y12;
    }

    public static Map<String, String> e(Context context) {
        C7356m3 a10 = C7356m3.a(context.getContentResolver(), C7452y3.a("com.google.android.gms.measurement"), new C8752e());
        return a10 == null ? Collections.emptyMap() : a10.b();
    }
}
