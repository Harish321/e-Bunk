-- 6 December 2020 10:06:26 PM IST
CREATE TABLE `bunk`.`verified_sale` (`id` serial,`type_of_oil` varchar(255),`date` datetime,`starting_reading` varchar(255),`ending_reading` varchar(255),`total_consumed` decimal,`price` decimal,`doubted_quantity` decimal,`proof_image` varchar(255),`verified_by` varchar(255),`dip_taken_by` varchar(255), PRIMARY KEY (id));