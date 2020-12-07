-- 6 December 2020 9:57:48 PM IST
CREATE TABLE `bunk`.`daily_sale` (`id` serial, PRIMARY KEY (id));
-- 6 December 2020 10:03:03 PM IST
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `type_of_oil` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `meter_reading` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `quantity` decimal NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `sale_amount` decimal NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `price` decimal NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `date` date NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `operator` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `manager` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `begining_reading` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `amount_collected` decimal NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `meter_reading_image` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `collection_proof_image` varchar(255) NULL COMMENT '';
ALTER TABLE `bunk`.`daily_sale` ADD COLUMN `month` varchar(255) NULL COMMENT '';