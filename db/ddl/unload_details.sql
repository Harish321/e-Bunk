-- 6 December 2020 9:51:51 PM IST
CREATE TABLE `bunk`.`unload_details` (
    `id` serial,`type_of_oil` varchar(255),
    `date_of_unload` datetime,
    `unload_quantity` int,
    `price` decimal,
    `amount_paid` decimal,
    `vehicle_no` varchar(255),
    `other_details` text,
    `unload_image` varchar(255), 
PRIMARY KEY (id));