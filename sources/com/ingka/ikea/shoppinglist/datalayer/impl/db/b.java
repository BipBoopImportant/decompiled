package com.ingka.ikea.shoppinglist.datalayer.impl.db;

import N4.a;
import Q4.g;
import XA.C13799c;

final class b extends N4.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f120294a = new C13799c();

    public b() {
        super(7, 8);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_ArticleDetails` (`parent_item_no` TEXT NOT NULL, `number_of_packages` INTEGER NOT NULL, `quantity_per_item` INTEGER NOT NULL, `name` TEXT, `description` TEXT, `measurement` TEXT, `price_unit_text` TEXT, `unit_type` TEXT, `image_url` TEXT, `contextual_image_url` TEXT, `energy_label_url` TEXT, PRIMARY KEY(`parent_item_no`))");
        gVar.T("INSERT INTO `_new_ArticleDetails` (`parent_item_no`,`number_of_packages`,`quantity_per_item`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url`) SELECT `parent_item_no`,`number_of_packages`,`quantity_per_item`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url` FROM `ArticleDetails`");
        gVar.T("DROP TABLE `ArticleDetails`");
        gVar.T("ALTER TABLE `_new_ArticleDetails` RENAME TO `ArticleDetails`");
        gVar.T("CREATE INDEX IF NOT EXISTS `index_ArticleDetails_parent_item_no` ON `ArticleDetails` (`parent_item_no`)");
        this.f120294a.a(gVar);
    }
}
