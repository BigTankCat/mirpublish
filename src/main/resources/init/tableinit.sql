CREATE TABLE m2_user (
id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
gmt_create datetime NOT NULL COMMENT '创建时间',
gmt_modified datetime NOT NULL COMMENT '修改时间',
nick varchar(64) NOT NULL COMMENT 'nick',
pass_word varchar(64) NOT NULL COMMENT '密码',
qq_num varchar(16)  COMMENT 'QQ号',
phone varchar(16)  COMMENT '电话',
email varchar(128)  COMMENT '邮箱',

PRIMARY KEY (id),
KEY idx_nick (nick)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

CREATE TABLE m2_vote (
id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
gmt_create datetime NOT NULL COMMENT '创建时间',
gmt_modified datetime NOT NULL COMMENT '修改时间',
vote_user_id bigint(20) unsigned NOT NULL COMMENT 'nick',
vote_flag varchar(8)  COMMENT '投票结果',
service_publish_info_id bigint(20) unsigned NOT NULL COMMENT '服务器发布id',
service_comment varchar(512) COMMENT '评论',

PRIMARY KEY (id),
KEY idx_user (vote_user_id,gmt_create),
KEY sidx_ervice(service_publish_info_id)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8mb4 COMMENT='投票结果';


CREATE TABLE m2_service_publish_info (
id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
gmt_create datetime NOT NULL COMMENT '创建时间',
gmt_modified datetime NOT NULL COMMENT '修改时间',
name varchar(32)  NOT NULL COMMENT 'name',
open_time datetime  COMMENT '开服时间',
description varchar(128)   COMMENT '描述',
url varchar(128) COMMENT 'url',
qq_num varchar(16) COMMENT 'qq',
service_master_user_id bigint(20) COMMENT '开服的管理员id',
type varchar(16) DEFAULT NULL COMMENT '类型',
PRIMARY KEY (id),
KEY idx_openTime (open_time),
KEY sidx_ervice(service_master_user_id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='开服列表';




CREATE TABLE m2_user2 (
id bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
gmt_create datetime NOT NULL COMMENT '创建时间',
gmt_modified datetime NOT NULL COMMENT '修改时间',
nick varchar(64) NOT NULL COMMENT 'nick',
pass_word varchar(64) NOT NULL COMMENT '密码',
qq_num varchar(16)  COMMENT 'QQ号',
phone varchar(16)  COMMENT '电话',
email varchar(128)  COMMENT '邮箱',

PRIMARY KEY (id),
KEY idx_nick (nick)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COMMENT='用户表';