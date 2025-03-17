package com.ingka.ikea.shoppinglist.datalayer.impl.db;

import N4.b;
import Q4.g;
import XA.C13798b;

final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final N4.a f120293a = new C13798b();

    public a() {
        super(6, 7);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_ShoppingListItems` (`list_id` TEXT NOT NULL, `item_no` TEXT NOT NULL, `item_type` TEXT NOT NULL, `quantity` INTEGER NOT NULL, `updated_at` TEXT NOT NULL, `total_packages` INTEGER NOT NULL, `online_sellable` INTEGER NOT NULL, `is_communicated_online` INTEGER NOT NULL, `is_breathtaking_item` INTEGER NOT NULL, `is_new_item` INTEGER NOT NULL, `environmental_fees` TEXT NOT NULL, `name` TEXT, `description` TEXT, `measurement` TEXT, `price_unit_text` TEXT, `unit_type` TEXT, `image_url` TEXT, `contextual_image_url` TEXT, `energy_label_url` TEXT, PRIMARY KEY(`item_no`, `list_id`), FOREIGN KEY(`list_id`) REFERENCES `ShoppingLists`(`list_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        gVar.T("INSERT INTO `_new_ShoppingListItems` (`list_id`,`item_no`,`item_type`,`quantity`,`updated_at`,`total_packages`,`online_sellable`,`is_communicated_online`,`is_breathtaking_item`,`is_new_item`,`environmental_fees`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url`) SELECT `list_id`,`item_no`,`item_type`,`quantity`,`updated_at`,`total_packages`,`online_sellable`,`is_communicated_online`,`is_breathtaking_item`,`is_new_item`,`environmental_fees`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url` FROM `ShoppingListItems`");
        gVar.T("DROP TABLE `ShoppingListItems`");
        gVar.T("ALTER TABLE `_new_ShoppingListItems` RENAME TO `ShoppingListItems`");
        gVar.T("CREATE UNIQUE INDEX IF NOT EXISTS `index_ShoppingListItems_list_id_item_no` ON `ShoppingListItems` (`list_id`, `item_no`)");
        O4.b.c(gVar, "ShoppingListItems");
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_ArticleItems` (`item_no` TEXT NOT NULL, `parent_item_no` TEXT NOT NULL, `list_id` TEXT NOT NULL, PRIMARY KEY(`item_no`, `list_id`))");
        gVar.T("INSERT INTO `_new_ArticleItems` (`item_no`,`parent_item_no`,`list_id`) SELECT `item_no`,`parent_item_no`,`list_id` FROM `ArticleItems`");
        gVar.T("DROP TABLE `ArticleItems`");
        gVar.T("ALTER TABLE `_new_ArticleItems` RENAME TO `ArticleItems`");
        gVar.T("CREATE UNIQUE INDEX IF NOT EXISTS `index_ArticleItems_item_no_list_id` ON `ArticleItems` (`item_no`, `list_id`)");
        this.f120293a.a(gVar);
    }
}
