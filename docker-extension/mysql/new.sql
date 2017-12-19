--此文件需最后执行
-- 用户表
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `real_name` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户真实姓名',
  `user_name` varchar(200) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户名',
  `phone_number` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '手机号',
  `wechat_id` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '微信公众号id（需要绑定手机号）',
  `wechat_id_2` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '微信ID（用于绑定账号）',
  `qq` varchar(45) COLLATE utf8mb4_bin DEFAULT NULL COMMENT 'qq号	',
  `weibo` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '微博',
  `passwd` varchar(80) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码（最多80位）',
  `sexy` tinyint(4) DEFAULT '3' COMMENT '性别（1男、1女、3未知）',
  `register_source` tinyint(4) DEFAULT NULL COMMENT '注册来源（0 app、1 微信公众号、2 被动）',
  `belong_type` tinyint(4) DEFAULT NULL COMMENT '运营商类型（1移动、2联通、3电信、4虚拟运营商）',
  `register_ip` varchar(30) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '注册ip',
  `device_type` tinyint(4) DEFAULT NULL COMMENT '设备类型（0未知  1 浏览器  2 android 3ios)',
  `score` decimal(24,2) DEFAULT NULL COMMENT '余额',
  `head_logo_md5` varchar(500) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户头像md5值',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `age_group_type` tinyint(4) DEFAULT NULL COMMENT '年龄段（60后1、70后2、80后3、90后4、00后5、其他6）',
  `user_status` tinyint(4) DEFAULT NULL COMMENT '用户状态（0正常、1禁用）',
  `province_id` int(11) DEFAULT NULL COMMENT '省ID',
  `city_id` int(11) DEFAULT NULL COMMENT '市ID',
  `user_idCard_number` varchar(45) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '身份证号',
  `authen_time` datetime DEFAULT NULL COMMENT '认证时间',
  `grade` int(11) DEFAULT NULL COMMENT '用户等级',
  `integral_score` decimal(24,2) DEFAULT '0.00' COMMENT '积分余额',
  PRIMARY KEY (`id`),
  KEY `idx_phone_number` (`phone_number`)
) ENGINE=InnoDB AUTO_INCREMENT=1207968 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户表';

CREATE TABLE `news_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tittle` varchar(128) DEFAULT NULL COMMENT '商品名称',
  `pic_url` varchar(500) DEFAULT NULL COMMENT '大图url（多个用逗号隔开）',
  `logoPicUrl` varchar(500) DEFAULT NULL COMMENT '图标url',
  `desc` longtext COMMENT '详情()',
  `read_number` int(11) DEFAULT NULL COMMENT '阅读数量',
  `source` varchar(100) DEFAULT NULL COMMENT '来源',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态（0启用、1停用）',
  `recommend_status` tinyint(4) DEFAULT NULL COMMENT '推荐状态(0不推荐,1推荐)',
  `type` varchar(100) DEFAULT NULL COMMENT '类型(村镇服务,政务头条)',
  `create_time` datetime DEFAULT NULL COMMENT '系统创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '系统修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC KEY_BLOCK_SIZE=4 COMMENT='新闻信息表';


CREATE TABLE `comments_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tittle` varchar(128) DEFAULT NULL COMMENT '标题名称',
  `desc` longtext COMMENT '详情()',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `pic_url` varchar(500) DEFAULT NULL COMMENT '大图url（多个用逗号隔开）',
  `approve_number` int(11) DEFAULT NULL COMMENT '点赞数量',
  `not_approve_number` int(11) DEFAULT NULL COMMENT '点踩数量',
  `comments_number` int(11) DEFAULT NULL COMMENT '评论数量',
  `redirect_number` int(11) DEFAULT NULL COMMENT '转发数量',
  `type` tinyint(4) DEFAULT NULL COMMENT '类型(新闻评论 朋友圈评论)',
  `father_id` bigint(20) NOT NULL COMMENT '父级评论（如果为0取type）',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态（0未删除、1删除）',
  `create_time` datetime DEFAULT NULL COMMENT '系统创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '系统修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC KEY_BLOCK_SIZE=4 COMMENT='评论表';

CREATE TABLE `second_hand_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tittle` varchar(128) DEFAULT NULL COMMENT '商品标题',
  `pic_url` varchar(500) DEFAULT NULL COMMENT '大图url（多个用逗号隔开）',
  `logoPicUrl` varchar(500) DEFAULT NULL COMMENT '图标url',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `desc` longtext COMMENT '详情()',
  `read_number` int(11) DEFAULT NULL COMMENT '阅读数量',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态（0未删除、1删除）',
  `recommend_status` tinyint(4) DEFAULT NULL COMMENT '展示状态(0展示,1不展示)',
  `type` bigint(20) DEFAULT NULL COMMENT '关联second_hand_type表',
  `create_time` datetime DEFAULT NULL COMMENT '系统创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '系统修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC KEY_BLOCK_SIZE=4 COMMENT='二手物品表';


CREATE TABLE `second_hand_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(128) DEFAULT NULL COMMENT '类目名称',
  `pid` bigint(20) DEFAULT NULL COMMENT '父级类目',
  `logoPicUrl` varchar(500) DEFAULT NULL COMMENT '图标url',
  `create_time` datetime DEFAULT NULL COMMENT '系统创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '系统修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC KEY_BLOCK_SIZE=4 COMMENT='二手类目表';

CREATE TABLE `ride_sharing_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `tittle` varchar(128) DEFAULT NULL COMMENT '标题',
  `phone_number` varchar(20) DEFAULT NULL COMMENT '手机号',
  `pic_url` varchar(500) DEFAULT NULL COMMENT '大图url（多个用逗号隔开）',
  `logoPicUrl` varchar(500) DEFAULT NULL COMMENT '图标url',
  `desc` longtext COMMENT '详情()',
  `read_number` int(11) DEFAULT NULL COMMENT '阅读数量',
  `source` varchar(100) DEFAULT NULL COMMENT '来源(抓取,录入)',
  `status` tinyint(4) DEFAULT NULL COMMENT '状态（0启用、1停用）',
  `recommend_status` tinyint(4) DEFAULT NULL COMMENT '推荐状态(0不推荐,1推荐)',
  `type` varchar(100) DEFAULT NULL COMMENT '类型(人找车,车找人)',
  `create_time` datetime DEFAULT NULL COMMENT '系统创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '系统修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC KEY_BLOCK_SIZE=4 COMMENT='顺风车信息表';

