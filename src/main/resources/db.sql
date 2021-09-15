CREATE TABLE `tb_head_line` (
	`line_id` INT ( 100 ) NOT NULL AUTO_INCREMENT COMMENT '头条id',
	`line_name` VARCHAR ( 100 ) DEFAULT NULL COMMENT '头条名称',
	`line_link` VARCHAR ( 200 ) NOT NULL COMMENT '头条链接',
	`line_img` VARCHAR ( 2000 ) NOT NULL COMMENT '头条图片地址',
	`priority` INT ( 2 ) DEFAULT NULL COMMENT '展示的优先级',
	`enable_status` INT ( 2 ) NOT NULL DEFAULT '0' COMMENT '可用状态',
	`create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
	`update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
	PRIMARY KEY ( `line_id` )
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = UTF8

--

CREATE TABLE `tb_shop_category` (
	`shop_category_id` INT ( 11 ) NOT NULL AUTO_INCREMENT COMMENT '店铺类别id',
	`shop_category_name` VARCHAR ( 100 ) NOT NULL DEFAULT '' COMMENT '店铺类别名称',
	`shop_category_desc` VARCHAR ( 1000 ) DEFAULT '' COMMENT '店铺类别描述',
	`shop_category_img` VARCHAR ( 2000 ) DEFAULT NULL COMMENT '店铺类别图片地址',
	`priority` INT ( 2 ) NOT NULL DEFAULT '0' COMMENT '店铺类别的优先级',
	`create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
	`update_time` DATETIME DEFAULT NULL COMMENT '修改时间',
	`parent_id` INT ( 11 ) DEFAULT NULL COMMENT '店铺类别的父类别',
	PRIMARY KEY ( `shop_category_id` ),
	KEY `fk_shop_category_self` ( `parent_id` ),
CONSTRAINT `fk_shop_category_self` FOREIGN KEY ( `parent_id` )
REFERENCES `tb_shop_category` ( `shop_category_id` )
) ENGINE = INNODB AUTO_INCREMENT = 1 DEFAULT CHARSET = UTF8