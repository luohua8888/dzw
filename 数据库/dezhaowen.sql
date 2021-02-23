/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.60 : Database - dezhaowen
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dezhaowen` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dezhaowen`;

/*Table structure for table `biyexuexiaobiao` */

DROP TABLE IF EXISTS `biyexuexiaobiao`;

CREATE TABLE `biyexuexiaobiao` (
  `schoolid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '毕业学校',
  `school1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `school2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `school3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`schoolid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `biyexuexiaobiao` */

/*Table structure for table `bumenbiao` */

DROP TABLE IF EXISTS `bumenbiao`;

CREATE TABLE `bumenbiao` (
  `bid` int(11) NOT NULL COMMENT '部门编号',
  `bname` varchar(100) DEFAULT NULL COMMENT '部门名称',
  `blei` int(11) DEFAULT NULL COMMENT '部门分类',
  `b1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `b2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `b3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`bid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `bumenbiao` */

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `carnum` int(11) NOT NULL COMMENT '车辆号码',
  `platename` varchar(50) DEFAULT NULL COMMENT '车牌号',
  `carbrandid` int(11) DEFAULT NULL COMMENT '车辆品牌id外键 朱灿品牌表的主键',
  `driver` varchar(50) DEFAULT NULL COMMENT '驾驶员',
  `driverphone` varchar(50) DEFAULT NULL COMMENT '驾驶员电话',
  `birthday` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `caraffiliationid` int(11) DEFAULT NULL COMMENT '车辆归属id外键 车辆归属表中的主键',
  `driveraddress` varchar(50) DEFAULT NULL COMMENT '驾驶员地址',
  `drivingouttime` varchar(50) DEFAULT NULL COMMENT '驾证到期',
  `framnum` varchar(50) DEFAULT NULL COMMENT '车驾号',
  `enginenum` varchar(50) DEFAULT NULL COMMENT '发动机号',
  `engineid` int(11) DEFAULT NULL COMMENT '发动机id外键 朱灿的发动机表的id',
  `carnyear` varchar(50) DEFAULT NULL COMMENT '车辆年款',
  `mileage` varchar(50) DEFAULT NULL COMMENT '里程',
  `load` varchar(50) DEFAULT NULL COMMENT '载重',
  `carseries` varchar(50) DEFAULT NULL COMMENT '车系',
  `buytime` varchar(50) DEFAULT NULL COMMENT '购买日期',
  `uptime` varchar(50) DEFAULT NULL COMMENT '上牌日期',
  `carouttime` varchar(50) DEFAULT NULL COMMENT '车险到期',
  `mlicompanyid` int(11) DEFAULT NULL COMMENT '交强险保险公司id',
  `mliouttime` varchar(50) DEFAULT NULL COMMENT '交强险到期',
  `cicompanyid` int(11) DEFAULT NULL COMMENT '商业险保险公司id',
  `ciouttime` varchar(50) DEFAULT NULL COMMENT '商业险到期',
  `mytoucar` varchar(50) DEFAULT NULL COMMENT '在我投保车',
  `twotime` varchar(50) DEFAULT NULL COMMENT '二维日期',
  `oiltypeid` int(11) DEFAULT NULL COMMENT '燃油类别id',
  `nextmileage` varchar(50) DEFAULT NULL COMMENT '下次保养里程',
  `nextupkeeptime` varchar(50) DEFAULT NULL COMMENT '下次保养日期',
  `membernum` varchar(50) DEFAULT NULL COMMENT '会员码',
  `customernum` varchar(50) DEFAULT NULL COMMENT '客户编码',
  `car1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `car2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `car3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`carnum`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `car` */

/*Table structure for table `caraffiliation` */

DROP TABLE IF EXISTS `caraffiliation`;

CREATE TABLE `caraffiliation` (
  `caraffiliationid` int(11) NOT NULL COMMENT '车辆归属id',
  `caraffiliation` varchar(50) DEFAULT NULL COMMENT '车辆归属',
  `cf1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cf2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cf3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`caraffiliationid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `caraffiliation` */

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `carcoding` varchar(50) NOT NULL COMMENT '车辆编码',
  `brandname` varchar(50) DEFAULT NULL COMMENT '品牌名称',
  `initial` varchar(50) DEFAULT NULL COMMENT '首字母',
  `brand1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `brand2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `brand3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`carcoding`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `carbrand` */

/*Table structure for table `cashier` */

DROP TABLE IF EXISTS `cashier`;

CREATE TABLE `cashier` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '收银id',
  `totalNum` float DEFAULT NULL COMMENT '总金额',
  `cashierstatic` varchar(10) DEFAULT NULL COMMENT '结算状态',
  `paymentType` varchar(10) DEFAULT NULL COMMENT '支付方式',
  `invoiceNo` varchar(10) DEFAULT NULL COMMENT '发票表id',
  `cashiertime` datetime DEFAULT NULL COMMENT '结算时间',
  `staffId` varchar(10) DEFAULT NULL COMMENT '员工表id检查该员工的角色是否有权限使用内部券',
  `onCredit` float DEFAULT NULL COMMENT '挂账金额',
  `interior` float DEFAULT NULL COMMENT '内部免单金额',
  `clientId` varchar(20) DEFAULT NULL COMMENT '客户编号',
  `change` float DEFAULT NULL COMMENT '找零',
  `Number` varchar(10) DEFAULT NULL COMMENT '销售单号',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `cashier` */

insert  into `cashier`(`id`,`totalNum`,`cashierstatic`,`paymentType`,`invoiceNo`,`cashiertime`,`staffId`,`onCredit`,`interior`,`clientId`,`change`,`Number`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values (1,1000,'已支付','现金',NULL,'2020-02-11 20:13:52','SWE001',NULL,NULL,'00000CU12349',NULL,'RNG202001','1',NULL,NULL,NULL,NULL),(2,2000,'已支付','微信',NULL,'2020-02-11 20:16:28','ZXC001',NULL,NULL,'00000CU12350',NULL,'RNG202002','1',NULL,NULL,NULL,NULL),(3,5000,'已支付','支付宝',NULL,'2020-02-11 20:17:41','SWE003',NULL,NULL,'00000CU12353',NULL,'IG202002','2',NULL,NULL,NULL,NULL);

/*Table structure for table `chengshibiao` */

DROP TABLE IF EXISTS `chengshibiao`;

CREATE TABLE `chengshibiao` (
  `qcityid` int(11) NOT NULL COMMENT '城市id',
  `qcityname` varchar(100) DEFAULT NULL COMMENT '城市姓名',
  `q1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `q2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `q3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`qcityid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `chengshibiao` */

/*Table structure for table `chexingdingyibiao` */

DROP TABLE IF EXISTS `chexingdingyibiao`;

CREATE TABLE `chexingdingyibiao` (
  `cid` int(11) NOT NULL COMMENT '车型品牌',
  `cname` varchar(100) DEFAULT NULL COMMENT '车型名称',
  `jingkoumingchang` varchar(100) DEFAULT NULL COMMENT '进口国产',
  `chankaojiage` double DEFAULT NULL COMMENT '产考价格',
  `cheliangniankuan` double DEFAULT NULL COMMENT '车辆年款',
  `gonglv` int(11) DEFAULT NULL COMMENT '功率',
  `ranyoubianhao` int(11) DEFAULT NULL COMMENT '燃油编号',
  `zaizhong` int(11) DEFAULT NULL COMMENT '载重',
  `fadingjipingpai` varchar(100) DEFAULT NULL COMMENT '发动机品牌',
  `c1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `c2` varchar(100) DEFAULT NULL COMMENT ' 备用字段',
  `c3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `zhaopian` varchar(100) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`cid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `chexingdingyibiao` */

/*Table structure for table `cicompany` */

DROP TABLE IF EXISTS `cicompany`;

CREATE TABLE `cicompany` (
  `cicompanyid` int(11) NOT NULL COMMENT '商业保险公司id',
  `cicompany` varchar(50) DEFAULT NULL COMMENT '商业保险公司',
  `cm1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cm2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cm3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`cicompanyid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `cicompany` */

/*Table structure for table `completed` */

DROP TABLE IF EXISTS `completed`;

CREATE TABLE `completed` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yesOrno` int(11) DEFAULT NULL COMMENT '合格否 1=合格，0=不合格',
  `predicttime` datetime DEFAULT NULL COMMENT '预计完工时间',
  `nowtime` datetime DEFAULT NULL COMMENT '实际完工时间',
  `reason` varchar(30) DEFAULT NULL COMMENT '误工原因',
  `workid` varchar(10) DEFAULT NULL COMMENT '质检员，与员工表关联',
  `dutyid` varchar(10) DEFAULT NULL COMMENT '责任人，与员工表关联',
  `price` float DEFAULT NULL COMMENT '处罚金额',
  `count` int(11) DEFAULT NULL COMMENT '返工数',
  `fgreason` varchar(20) DEFAULT NULL COMMENT '返工原因',
  `wjid` varchar(20) DEFAULT NULL COMMENT '维修或救援id',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `completed` */

insert  into `completed`(`id`,`yesOrno`,`predicttime`,`nowtime`,`reason`,`workid`,`dutyid`,`price`,`count`,`fgreason`,`wjid`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values (10,0,'2020-10-15 00:00:00','2021-02-15 00:00:00',NULL,NULL,NULL,1212,1,'','20200214134851',NULL,NULL,NULL,NULL,NULL),(11,1,'2020-12-15 00:00:00','2021-02-16 00:00:00',NULL,NULL,NULL,NULL,1,NULL,'20200213153913',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customernum` varchar(50) NOT NULL COMMENT '客户编码',
  `customername` varchar(50) NOT NULL COMMENT '客户名称',
  `customeraddress` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机',
  `birthday` varchar(50) DEFAULT NULL COMMENT '客户生日',
  `customertypeid` varchar(50) DEFAULT NULL COMMENT '客户类别',
  `customernumber` varchar(50) DEFAULT NULL COMMENT '会员卡号',
  `jointime` varchar(50) DEFAULT NULL COMMENT '入会日期',
  `outtime` varchar(50) DEFAULT NULL COMMENT '会员到期',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `filing` varchar(50) DEFAULT NULL COMMENT '建档日期',
  `counselorid` int(11) DEFAULT NULL COMMENT '服务顾问',
  `paytime` int(11) DEFAULT NULL COMMENT '账期',
  `payment` int(11) DEFAULT NULL COMMENT '挂账额度',
  `integral` int(11) DEFAULT NULL COMMENT '累计积分',
  `earnest` float DEFAULT NULL COMMENT '定金金额',
  `paytest` varchar(50) DEFAULT NULL COMMENT '纳税人识别',
  `registerphone` varchar(50) DEFAULT NULL COMMENT '注册电话',
  `desportbank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `bankaccount` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `registeraddress` varchar(50) DEFAULT NULL COMMENT '注册地址',
  `otherone` varchar(50) DEFAULT NULL COMMENT '其他一',
  `othertwo` varchar(50) DEFAULT NULL COMMENT '其他二',
  `otherthree` varchar(50) DEFAULT NULL COMMENT '其他三',
  `otherfour` varchar(50) DEFAULT NULL COMMENT '其他四',
  `photo` varchar(50) DEFAULT NULL COMMENT '相关证照',
  `qcityid` int(11) DEFAULT NULL COMMENT '外键连接易杨凯的城市表外键',
  `cs1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cs2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cs3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`customernum`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

/*Table structure for table `customertype` */

DROP TABLE IF EXISTS `customertype`;

CREATE TABLE `customertype` (
  `customerid` int(11) NOT NULL COMMENT '客户类别id',
  `customertype` varchar(50) DEFAULT NULL COMMENT '客户类别',
  `cus1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cus2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `cus3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`customerid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `customertype` */

/*Table structure for table `earning` */

DROP TABLE IF EXISTS `earning`;

CREATE TABLE `earning` (
  `earningid` int(11) NOT NULL COMMENT '收入id',
  `earningname` varchar(50) DEFAULT NULL COMMENT '收入分类',
  `ear1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `car2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `car3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`earningid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `earning` */

/*Table structure for table `ewitem` */

DROP TABLE IF EXISTS `ewitem`;

CREATE TABLE `ewitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '项目名称',
  `priceType` varchar(30) DEFAULT NULL COMMENT '价类',
  `price` float DEFAULT NULL COMMENT '价格',
  `remark` varchar(30) DEFAULT NULL COMMENT '备注',
  `rescueid` varchar(30) DEFAULT NULL COMMENT '与救援关联',
  `repairid` varchar(20) DEFAULT NULL COMMENT '与维修表关联',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `ewitem` */

/*Table structure for table `factory` */

DROP TABLE IF EXISTS `factory`;

CREATE TABLE `factory` (
  `factoryid` int(11) NOT NULL COMMENT '厂id',
  `factoryname` varchar(50) DEFAULT NULL COMMENT '厂名',
  `f1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `f2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `f3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`factoryid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `factory` */

/*Table structure for table `fadongjipinpaibiao` */

DROP TABLE IF EXISTS `fadongjipinpaibiao`;

CREATE TABLE `fadongjipinpaibiao` (
  `fid` int(11) NOT NULL COMMENT '发动机品牌编码',
  `fname` varchar(100) DEFAULT NULL COMMENT '发动机品牌名称',
  `f1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `f2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `f3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`fid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `fadongjipinpaibiao` */

/*Table structure for table `field_vehicles` */

DROP TABLE IF EXISTS `field_vehicles`;

CREATE TABLE `field_vehicles` (
  `carnumber` varchar(20) NOT NULL COMMENT '车牌号',
  `brand` varchar(20) DEFAULT NULL COMMENT '品牌',
  `model` varchar(20) DEFAULT NULL COMMENT '车型',
  `currentmileage` int(11) DEFAULT NULL COMMENT '当前里程',
  `teamid` varchar(20) DEFAULT NULL COMMENT '归属班组',
  `car1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `car2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `car3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`carnumber`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `field_vehicles` */

/*Table structure for table `firm` */

DROP TABLE IF EXISTS `firm`;

CREATE TABLE `firm` (
  `firmid` int(11) NOT NULL COMMENT '厂商id',
  `firmnum` varchar(50) DEFAULT NULL COMMENT '厂商代码',
  `firmname` varchar(50) DEFAULT NULL COMMENT '厂商名称',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `business` varchar(50) DEFAULT NULL COMMENT '经营情况',
  `url` varchar(50) DEFAULT NULL COMMENT '网址',
  `openbank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `bankaccount` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `paymentid` int(11) DEFAULT NULL COMMENT '付款方式id',
  `firmgradeid` int(11) DEFAULT NULL COMMENT '厂商等级id',
  `managebrand` varchar(50) DEFAULT NULL COMMENT '经营品牌',
  `firmtypeid` int(11) DEFAULT NULL COMMENT '厂商类别id',
  `linkmanid` int(11) DEFAULT NULL COMMENT '联系人id',
  `debttime` int(11) DEFAULT NULL COMMENT '账期(天)',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `photo` varchar(50) DEFAULT NULL COMMENT '照片',
  `fir1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `fir2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `fir3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`firmid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `firm` */

/*Table structure for table `firmgrade` */

DROP TABLE IF EXISTS `firmgrade`;

CREATE TABLE `firmgrade` (
  `firmgradeid` int(11) NOT NULL COMMENT '厂商等级id',
  `firmgrade` varchar(50) DEFAULT NULL COMMENT '厂商等级',
  `fir1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `fir2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `fir3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`firmgradeid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `firmgrade` */

/*Table structure for table `firmtype` */

DROP TABLE IF EXISTS `firmtype`;

CREATE TABLE `firmtype` (
  `firmtypeid` int(11) NOT NULL COMMENT '厂商类别id',
  `firmtype` varchar(50) DEFAULT NULL COMMENT '厂商类别',
  `dadid` int(11) DEFAULT NULL COMMENT '父id',
  `fir1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `fir2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `fir3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`firmtypeid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `firmtype` */

/*Table structure for table `gangweibiao` */

DROP TABLE IF EXISTS `gangweibiao`;

CREATE TABLE `gangweibiao` (
  `gid` int(11) NOT NULL COMMENT '岗位编码',
  `gname` varchar(100) DEFAULT NULL COMMENT '岗位名称',
  `g1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `g2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `g3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`gid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `gangweibiao` */

/*Table structure for table `getgood` */

DROP TABLE IF EXISTS `getgood`;

CREATE TABLE `getgood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goodid` int(11) DEFAULT NULL COMMENT '与物料表关联',
  `count` int(11) DEFAULT NULL COMMENT '需求数量',
  `item` varchar(20) DEFAULT NULL COMMENT '对应项目',
  `priceType` varchar(100) DEFAULT NULL COMMENT '价类',
  `discountsPrice` varchar(100) DEFAULT NULL COMMENT '优惠后单价',
  `wjid` varchar(100) DEFAULT NULL COMMENT '维修或救援id',
  `warehouse` varchar(100) DEFAULT NULL COMMENT '仓库',
  `isRepair` varchar(100) DEFAULT NULL COMMENT '是否领料0否1是',
  `cause` varchar(40) DEFAULT NULL COMMENT '免单原因',
  `type` varchar(40) DEFAULT NULL COMMENT '类别',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `getgood` */

/*Table structure for table `gongsidingyibiao` */

DROP TABLE IF EXISTS `gongsidingyibiao`;

CREATE TABLE `gongsidingyibiao` (
  `did` int(11) NOT NULL COMMENT '用户公司id',
  `dname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `daddress` varchar(50) DEFAULT NULL COMMENT '单位地址',
  `djian` varchar(50) DEFAULT NULL COMMENT '单位简称',
  `dphoney` varchar(50) DEFAULT NULL COMMENT '业务电话',
  `dphonej` varchar(50) DEFAULT NULL COMMENT '投诉电话',
  `dwaddress` varchar(50) DEFAULT NULL COMMENT '网址',
  `email` varchar(50) DEFAULT NULL COMMENT 'email',
  `dhang` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `dhangz` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `dhangd` varchar(50) DEFAULT NULL COMMENT '短信账号',
  `dmi` varchar(50) DEFAULT NULL COMMENT '短信密码',
  `dshangs` varchar(50) DEFAULT NULL COMMENT '商品编号位数',
  `dchu` varchar(50) DEFAULT NULL COMMENT '初始加价率',
  `dslv` varchar(50) DEFAULT NULL COMMENT '商品税率',
  `dxiao` varchar(50) DEFAULT NULL COMMENT '销售金额满',
  `dzhe` varchar(50) DEFAULT NULL COMMENT '折合税分',
  `djifen` varchar(50) DEFAULT NULL COMMENT '积分/元',
  `dwei` varchar(50) DEFAULT NULL COMMENT '维修看板行数',
  `dsan` varchar(50) DEFAULT NULL COMMENT '三包申报超期(天)',
  `dche` varchar(50) DEFAULT NULL COMMENT '车辆年审提醒(天)',
  `dzhang` varchar(50) DEFAULT NULL COMMENT '账号超期提醒(天)',
  `dban` varchar(50) DEFAULT NULL COMMENT '班组备件超期(天)',
  `dpei` varchar(50) DEFAULT NULL COMMENT '配件库超龄提醒(天)',
  `dneiw` varchar(50) DEFAULT NULL COMMENT '站内晚上系数',
  `dwaib` varchar(50) DEFAULT NULL COMMENT '站外白天系数',
  `dwaiw` varchar(50) DEFAULT NULL COMMENT '站外晚上系数',
  `d1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `d2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `d3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`did`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `gongsidingyibiao` */

/*Table structure for table `goodaddress` */

DROP TABLE IF EXISTS `goodaddress`;

CREATE TABLE `goodaddress` (
  `goodaddressid` int(11) NOT NULL COMMENT '商品产地id',
  `goodaddress` varchar(50) DEFAULT NULL COMMENT '商品产地',
  `good1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`goodaddressid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `goodaddress` */

/*Table structure for table `goodbigkind` */

DROP TABLE IF EXISTS `goodbigkind`;

CREATE TABLE `goodbigkind` (
  `goodbigkindid` int(11) NOT NULL COMMENT '商品大类id',
  `goodbigkindtype` varchar(50) DEFAULT NULL COMMENT '商品大类类型',
  `previd` int(11) DEFAULT NULL COMMENT '父id',
  `good1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`goodbigkindid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `goodbigkind` */

/*Table structure for table `goodbrand` */

DROP TABLE IF EXISTS `goodbrand`;

CREATE TABLE `goodbrand` (
  `goodbrandid` int(11) NOT NULL COMMENT '商品品牌id',
  `goodbrand` varchar(50) DEFAULT NULL COMMENT '商品品牌',
  `good1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`goodbrandid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `goodbrand` */

/*Table structure for table `gooddata` */

DROP TABLE IF EXISTS `gooddata`;

CREATE TABLE `gooddata` (
  `gooddataid` int(11) NOT NULL COMMENT '商品资料id',
  `registershop` int(11) DEFAULT NULL COMMENT '登记门店外键李艺星的门店表',
  `photoname` varchar(50) DEFAULT NULL COMMENT '照片名',
  `goodnum` varchar(50) DEFAULT NULL COMMENT '商品编码',
  `goodname` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `goodbrandid` int(11) DEFAULT NULL COMMENT '商品品牌id',
  `fitcartype` varchar(50) DEFAULT NULL COMMENT '适用车型',
  `numunitid` int(11) DEFAULT NULL COMMENT '数量单位id',
  `goodbigkindid` int(11) DEFAULT NULL COMMENT '商品大类id',
  `earningid` int(11) DEFAULT NULL COMMENT '收入分类id',
  `ycfcid` int(11) DEFAULT NULL COMMENT '原厂副厂id',
  `goodgradeid` int(11) DEFAULT NULL COMMENT '商品等级id',
  `goodaddressid` int(11) DEFAULT NULL COMMENT '商品产地id',
  `firmid` int(11) DEFAULT NULL COMMENT '厂商id',
  `ycnum` varchar(50) DEFAULT NULL COMMENT '原厂编码',
  `txnum` varchar(50) DEFAULT NULL COMMENT '条形码',
  `packing` varchar(50) DEFAULT NULL COMMENT '包装规格',
  `volume` varchar(50) DEFAULT NULL COMMENT '体积A',
  `roughweight` varchar(50) DEFAULT NULL COMMENT '毛重',
  `suttle` varchar(50) DEFAULT NULL COMMENT '净重',
  `raprate` varchar(50) DEFAULT NULL COMMENT '加价率',
  `exchange` varchar(50) DEFAULT NULL COMMENT '互换码',
  `paytoid` int(11) DEFAULT NULL COMMENT '售价按id',
  `standardprice` float DEFAULT NULL COMMENT '标准价',
  `memberprice` float DEFAULT NULL COMMENT '会员价',
  `vipprice` float DEFAULT NULL COMMENT 'VIP价',
  `protocol` float DEFAULT NULL COMMENT '协议价',
  `claimprice` float DEFAULT NULL COMMENT '索赔价',
  `insuranceprice` float DEFAULT NULL COMMENT '保险价',
  `good1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`gooddataid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `gooddata` */

/*Table structure for table `goodgrade` */

DROP TABLE IF EXISTS `goodgrade`;

CREATE TABLE `goodgrade` (
  `goodgradeid` int(11) NOT NULL COMMENT '商品等级id',
  `goodgrade` varchar(50) DEFAULT NULL COMMENT '商品等级优或良',
  `good1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `good3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`goodgradeid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `goodgrade` */

/*Table structure for table `hunyingzhuangtaibiao` */

DROP TABLE IF EXISTS `hunyingzhuangtaibiao`;

CREATE TABLE `hunyingzhuangtaibiao` (
  `marriageid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '婚姻状况',
  `mar1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `mar2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `mar3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`marriageid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `hunyingzhuangtaibiao` */

/*Table structure for table `item_repair` */

DROP TABLE IF EXISTS `item_repair`;

CREATE TABLE `item_repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isRepair` int(11) DEFAULT NULL COMMENT '是救援还是维修，救援=0',
  `wjid` int(11) DEFAULT NULL COMMENT '救援或者维修表id',
  `itemid` int(11) DEFAULT NULL COMMENT '项目id',
  `teamid` int(11) DEFAULT NULL COMMENT '班组id',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `priceType` varchar(100) DEFAULT NULL COMMENT '价类',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `item_repair` */

/*Table structure for table `jiguanbiao` */

DROP TABLE IF EXISTS `jiguanbiao`;

CREATE TABLE `jiguanbiao` (
  `jnativplaceid` int(11) NOT NULL COMMENT '序号',
  `jname` varchar(100) DEFAULT NULL COMMENT '籍贯',
  `j1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `j2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `j3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`jnativplaceid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `jiguanbiao` */

/*Table structure for table `jinkouguochang` */

DROP TABLE IF EXISTS `jinkouguochang`;

CREATE TABLE `jinkouguochang` (
  `jid` int(11) NOT NULL COMMENT '序号',
  `jname` varchar(100) DEFAULT NULL COMMENT '进口国产',
  `j1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `j2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `j3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`jid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `jinkouguochang` */

/*Table structure for table `kaihuyinhangbiao` */

DROP TABLE IF EXISTS `kaihuyinhangbiao`;

CREATE TABLE `kaihuyinhangbiao` (
  `bankid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '银行',
  `bank1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `bank2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `bank3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`bankid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `kaihuyinhangbiao` */

/*Table structure for table `linkman` */

DROP TABLE IF EXISTS `linkman`;

CREATE TABLE `linkman` (
  `linkmanid` int(11) NOT NULL COMMENT '联系人id',
  `linkman` varchar(50) DEFAULT NULL COMMENT '联系人',
  `position` varchar(50) DEFAULT NULL COMMENT '职位',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机',
  `telephone` varchar(50) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT 'email',
  `link1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `link2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `link3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`linkmanid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `linkman` */

/*Table structure for table `lizhiyuanyingbiao` */

DROP TABLE IF EXISTS `lizhiyuanyingbiao`;

CREATE TABLE `lizhiyuanyingbiao` (
  `ytime` varchar(20) DEFAULT NULL COMMENT '离职日期',
  `yreason` varchar(50) DEFAULT NULL COMMENT '离职原因',
  `yid` int(11) DEFAULT NULL COMMENT '员工编号',
  `y1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `y2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `y3` varchar(100) DEFAULT NULL COMMENT '备用字段'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `lizhiyuanyingbiao` */

/*Table structure for table `maintenance_team` */

DROP TABLE IF EXISTS `maintenance_team`;

CREATE TABLE `maintenance_team` (
  `teamid` varchar(20) NOT NULL COMMENT '班组编码',
  `teamname` varchar(50) DEFAULT NULL COMMENT '班组名称',
  `teamweight` varchar(50) DEFAULT NULL COMMENT '班组权重',
  `classificationid` varchar(20) DEFAULT NULL COMMENT '班组分类编码',
  `tem1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `tem2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `tem3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`teamid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `maintenance_team` */

/*Table structure for table `maintenance_team_classification` */

DROP TABLE IF EXISTS `maintenance_team_classification`;

CREATE TABLE `maintenance_team_classification` (
  `classificationid` varchar(20) NOT NULL COMMENT '班组分类编码',
  `classificationname` varchar(50) DEFAULT NULL COMMENT '班组分类名称',
  `class1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `class2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `class3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`classificationid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `maintenance_team_classification` */

/*Table structure for table `mendianbiao` */

DROP TABLE IF EXISTS `mendianbiao`;

CREATE TABLE `mendianbiao` (
  `mdid` int(11) NOT NULL COMMENT '门店id',
  `mddm` varchar(50) DEFAULT NULL COMMENT '门店代码',
  `mdname` varchar(50) DEFAULT NULL COMMENT '门店名称',
  `szcs` varchar(50) DEFAULT NULL COMMENT '所在城市',
  `md1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `md2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `md3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`mdid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `mendianbiao` */

/*Table structure for table `mendianfenleibiao` */

DROP TABLE IF EXISTS `mendianfenleibiao`;

CREATE TABLE `mendianfenleibiao` (
  `mlid` int(11) NOT NULL COMMENT '序号id',
  `mlname` varchar(100) DEFAULT NULL COMMENT '门店分类姓名',
  `m1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `m2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `m3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`mlid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `mendianfenleibiao` */

/*Table structure for table `mingzubiao` */

DROP TABLE IF EXISTS `mingzubiao`;

CREATE TABLE `mingzubiao` (
  `nationid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '民族',
  `nat1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `nat2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `nat3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`nationid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `mingzubiao` */

/*Table structure for table `mlicompany` */

DROP TABLE IF EXISTS `mlicompany`;

CREATE TABLE `mlicompany` (
  `mlicompanyid` int(11) NOT NULL COMMENT '交强险保险公司id',
  `mlicompany` varchar(50) DEFAULT NULL COMMENT '交强险保险公司',
  `mli1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `mli2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `mli3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`mlicompanyid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `mlicompany` */

/*Table structure for table `numunit` */

DROP TABLE IF EXISTS `numunit`;

CREATE TABLE `numunit` (
  `numunitid` int(11) NOT NULL COMMENT '单位id',
  `numunit` varchar(50) DEFAULT NULL COMMENT '单位',
  `num1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `num2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `num3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`numunitid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `numunit` */

/*Table structure for table `oiltype` */

DROP TABLE IF EXISTS `oiltype`;

CREATE TABLE `oiltype` (
  `oiltypeid` int(11) NOT NULL COMMENT '燃油类别id',
  `oiltype` varchar(50) DEFAULT NULL COMMENT '燃油类别',
  `o1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `o2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `o3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`oiltypeid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `oiltype` */

/*Table structure for table `payment` */

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
  `paymentid` int(11) NOT NULL COMMENT '付款方式id',
  `payment` varchar(50) DEFAULT NULL COMMENT '付款方式',
  `pay1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `pay2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `pay3` varchar(100) DEFAULT NULL COMMENT '备用子段',
  PRIMARY KEY (`paymentid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `payment` */

/*Table structure for table `payto` */

DROP TABLE IF EXISTS `payto`;

CREATE TABLE `payto` (
  `paytoid` int(11) NOT NULL COMMENT '售价按id',
  `payto` varchar(50) DEFAULT NULL COMMENT '售价按',
  `pay1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `pay2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `pay3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`paytoid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `payto` */

/*Table structure for table `pinpaichexing` */

DROP TABLE IF EXISTS `pinpaichexing`;

CREATE TABLE `pinpaichexing` (
  `pid` int(11) NOT NULL COMMENT '编码',
  `pname` varchar(100) DEFAULT NULL COMMENT '品牌名称',
  `shouzimu` varchar(100) DEFAULT NULL COMMENT '首字母',
  `p1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `p2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `p3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`pid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `pinpaichexing` */

/*Table structure for table `platenumber` */

DROP TABLE IF EXISTS `platenumber`;

CREATE TABLE `platenumber` (
  `plateid` int(11) NOT NULL COMMENT '车牌id',
  `platename` varchar(50) DEFAULT NULL COMMENT '车牌名',
  `pla1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `pla2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `pla3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`plateid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `platenumber` */

/*Table structure for table `repair` */

DROP TABLE IF EXISTS `repair`;

CREATE TABLE `repair` (
  `number` varchar(20) NOT NULL COMMENT '维修编号',
  `carinfoId` int(11) DEFAULT NULL COMMENT '与车辆信息表关联',
  `staffno` varchar(10) DEFAULT NULL COMMENT '与员工关联',
  `oil` varchar(30) DEFAULT NULL COMMENT '进厂油量',
  `type` varchar(20) DEFAULT NULL COMMENT '业务类别',
  `worktime` varchar(20) DEFAULT NULL COMMENT '施工班次',
  `getman` varchar(20) DEFAULT NULL COMMENT '接车人',
  `overworkdate` datetime DEFAULT NULL COMMENT '预计完工时间',
  `nowworkDate` datetime DEFAULT NULL COMMENT '实际完工时间',
  `setter` varchar(20) DEFAULT NULL COMMENT '结算方式',
  `company` varchar(20) DEFAULT NULL COMMENT '赔款公司',
  `befor` datetime DEFAULT NULL COMMENT '上次进场时间',
  `price` float DEFAULT NULL COMMENT '预估金额',
  `remark` varchar(40) DEFAULT NULL COMMENT '备注',
  `state` varchar(20) DEFAULT NULL COMMENT '报修陈述',
  `fault` varchar(30) DEFAULT NULL COMMENT '故障描述',
  `faultreasult` varchar(30) DEFAULT NULL COMMENT '故障原因',
  `status` varchar(20) DEFAULT NULL COMMENT '维修状态',
  `orderTime` datetime DEFAULT NULL COMMENT '开单时间',
  `stockDater` datetime DEFAULT NULL COMMENT '结算时间',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `repair` */

insert  into `repair`(`number`,`carinfoId`,`staffno`,`oil`,`type`,`worktime`,`getman`,`overworkdate`,`nowworkDate`,`setter`,`company`,`befor`,`price`,`remark`,`state`,`fault`,`faultreasult`,`status`,`orderTime`,`stockDater`,`otherone`,`othertwo`,`otherthree`,`otherfour`,`otherfive`) values ('RNG202101',4,'SWE003','满','中轻型车','白天','钟超','2021-02-03 16:39:53','2021-02-02 16:39:59','现结','中国平安保险',NULL,200,'第一次进厂','刹车有问题','刹车有问题','刹车片老化','完工','2021-02-02 16:13:49','2021-02-02 20:13:55',NULL,NULL,NULL,NULL,NULL),('RNG202102',5,'SWE003','满','中轻型车','白天','超级管理员','2021-02-05 16:50:21','2021-02-04 16:50:23','现结','中国平安保险',NULL,100,'','贴膜','贴膜','贴膜','完工','2021-02-04 16:50:45','2021-02-04 16:50:47',NULL,NULL,NULL,NULL,NULL),('RNG202103',5,'ZXC001','满','中轻型车','白天','钟超','2021-02-04 22:36:17','2021-02-04 22:36:24','现结','中国平安保险',NULL,100,NULL,'换胎','换胎','换胎','完工','2021-02-04 22:37:18','2021-02-04 22:37:20',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `rescue` */

DROP TABLE IF EXISTS `rescue`;

CREATE TABLE `rescue` (
  `number` varchar(30) NOT NULL COMMENT '救援编号',
  `carinfoid` int(11) DEFAULT NULL COMMENT '与车辆信息表关联',
  `staffno` varchar(10) DEFAULT NULL COMMENT '与员工关联',
  `rescueTeamid` int(11) DEFAULT NULL COMMENT '派工班组与班组表关联',
  `type` varchar(20) DEFAULT NULL COMMENT '业务类别',
  `worktimes` varchar(20) DEFAULT NULL COMMENT '施工班次',
  `getman` varchar(20) DEFAULT NULL COMMENT '接车人',
  `workdate` datetime DEFAULT NULL COMMENT '派工时间',
  `nowdate` datetime DEFAULT NULL COMMENT '出发时间',
  `address` varchar(20) DEFAULT NULL COMMENT '出发地址',
  `car` varchar(30) DEFAULT NULL COMMENT '驾驶车辆',
  `liche` float DEFAULT NULL COMMENT '行驶里程',
  `worktime` datetime DEFAULT NULL COMMENT '施工时间',
  `overtime` datetime DEFAULT NULL COMMENT '结束时间',
  `rescueaddress` varchar(40) DEFAULT NULL COMMENT '救援地址',
  `setter` varchar(30) DEFAULT NULL COMMENT '结算方式',
  `company` varchar(30) DEFAULT NULL COMMENT '赔款公司',
  `price` float DEFAULT NULL COMMENT '预估金额',
  `remark` varchar(30) DEFAULT NULL COMMENT '备注',
  `state` varchar(30) DEFAULT NULL COMMENT '报修陈述',
  `fault` varchar(30) DEFAULT NULL COMMENT '故障描述',
  `faultreasult` varchar(30) DEFAULT NULL COMMENT '故障原因',
  `status` varchar(30) DEFAULT NULL COMMENT '维修状态',
  `orderTime` datetime DEFAULT NULL COMMENT '开单时间',
  `stockDater` datetime DEFAULT NULL COMMENT '结算时间',
  `otherone` varchar(100) DEFAULT NULL COMMENT '其它字段1',
  `othertwo` varchar(100) DEFAULT NULL COMMENT '其它字段2',
  `otherthree` varchar(100) DEFAULT NULL COMMENT '其它字段3',
  `otherfour` varchar(100) DEFAULT NULL COMMENT '其它字段4',
  `otherfive` varchar(100) DEFAULT NULL COMMENT '其它字段5',
  PRIMARY KEY (`number`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `rescue` */

/*Table structure for table `sys_menu` */

DROP TABLE IF EXISTS `sys_menu`;

CREATE TABLE `sys_menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
  `menu_name` varchar(100) DEFAULT NULL COMMENT '菜单名称',
  `parent_id` int(11) DEFAULT NULL COMMENT '父菜单ID',
  `order_num` varchar(100) DEFAULT NULL COMMENT '显示顺序',
  `url` varchar(100) DEFAULT NULL COMMENT '请求地址',
  `menu_type` varchar(100) DEFAULT NULL COMMENT '菜单类型',
  `visible` varchar(100) DEFAULT NULL COMMENT '菜单状态',
  `perms` varchar(100) DEFAULT NULL COMMENT '权限标识',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `men1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `men2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `men3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`menu_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_menu` */

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(100) DEFAULT NULL COMMENT '角色名称',
  `status` varchar(100) DEFAULT NULL COMMENT '角色状态',
  `del_flag` varchar(100) DEFAULT NULL COMMENT '删除标志',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `role1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `role2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `role3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

/*Table structure for table `sys_role_menu` */

DROP TABLE IF EXISTS `sys_role_menu`;

CREATE TABLE `sys_role_menu` (
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `menu_id` int(11) DEFAULT NULL COMMENT '菜单id'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_menu` */

/*Table structure for table `team_weight` */

DROP TABLE IF EXISTS `team_weight`;

CREATE TABLE `team_weight` (
  `teamid` varchar(20) NOT NULL COMMENT '班组编码',
  `inam` double DEFAULT NULL COMMENT '工时费站内白天',
  `inevening` double DEFAULT NULL COMMENT '站内晚上',
  `outam` double DEFAULT NULL COMMENT '站外白天',
  `outevening` double DEFAULT NULL COMMENT '站外晚上',
  `intransitam` double DEFAULT NULL COMMENT '在途费白天',
  `intransitevening` double DEFAULT NULL COMMENT '在途费晚上',
  `fuelcost` double DEFAULT NULL COMMENT '燃油费',
  `tea1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `tea2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `tea3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`teamid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `team_weight` */

/*Table structure for table `technician_information` */

DROP TABLE IF EXISTS `technician_information`;

CREATE TABLE `technician_information` (
  `technicianid` varchar(20) NOT NULL COMMENT '技工编号',
  `technicianname` varchar(50) DEFAULT NULL COMMENT '技工名称',
  `sex` varchar(4) DEFAULT NULL COMMENT '性别',
  `isteamleader` tinyint(4) DEFAULT NULL COMMENT '是否组长',
  `teamid` varchar(20) DEFAULT NULL COMMENT '所在班组',
  `phone` varchar(50) DEFAULT NULL COMMENT '手机',
  `loginphone` varchar(50) DEFAULT NULL COMMENT '登录手机',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `borndate` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `wechatnumber` varchar(50) DEFAULT NULL COMMENT '微信号',
  `idcard` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `residenceaddress` varchar(50) DEFAULT NULL COMMENT '户口地址',
  `residencebank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `bankaccount` varchar(50) DEFAULT NULL COMMENT '银行账户',
  `levelid` varchar(20) DEFAULT NULL COMMENT '星级',
  `maintenancetype` varchar(20) DEFAULT NULL COMMENT '维修工种',
  `maintenancebrand` varchar(20) DEFAULT NULL COMMENT '维修品牌',
  `tec1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `tec2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `tec3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`technicianid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `technician_information` */

/*Table structure for table `technician_level` */

DROP TABLE IF EXISTS `technician_level`;

CREATE TABLE `technician_level` (
  `levelid` varchar(20) NOT NULL COMMENT '等级编号',
  `levelname` varchar(50) DEFAULT NULL COMMENT '等级名称',
  `commissionweight` varchar(20) DEFAULT NULL COMMENT '提成权重',
  `leve1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `leve2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `leve3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`levelid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `technician_level` */

/*Table structure for table `upkeep` */

DROP TABLE IF EXISTS `upkeep`;

CREATE TABLE `upkeep` (
  `upkeepid` int(11) NOT NULL COMMENT '保养id',
  `carnum` int(11) DEFAULT NULL COMMENT '车辆号码',
  `upkeepname` varchar(50) DEFAULT NULL COMMENT '保养名称',
  `plantime` varchar(50) DEFAULT NULL COMMENT '计划日期',
  `planmileage` varchar(50) DEFAULT NULL COMMENT '计划里程',
  `facttime` varchar(50) DEFAULT NULL COMMENT '实际日期',
  `factmileage` varchar(50) DEFAULT NULL COMMENT '实际里程',
  `up1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `up2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `up3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`upkeepid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `upkeep` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user` varchar(100) NOT NULL COMMENT '账户',
  `pwd` varchar(100) DEFAULT NULL COMMENT '密码',
  `miaoshu` varchar(100) DEFAULT NULL COMMENT '描述',
  `u1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `u2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `u3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`user`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `vehicle` */

DROP TABLE IF EXISTS `vehicle`;

CREATE TABLE `vehicle` (
  `vehicleid` int(11) NOT NULL COMMENT '车型id',
  `vehiclename` varchar(50) DEFAULT NULL COMMENT '车型名称',
  `referenceprice` varchar(50) DEFAULT NULL COMMENT '参考价格',
  `caryear` varchar(50) DEFAULT NULL COMMENT '车辆年款',
  `gasd` varchar(50) DEFAULT NULL COMMENT '排气量',
  `iod` varchar(50) DEFAULT NULL COMMENT '进口国产',
  `oilnum` varchar(50) DEFAULT NULL COMMENT '燃油标号',
  `fourtype` varchar(50) DEFAULT NULL COMMENT '四驱类型',
  `carcoding` varchar(50) DEFAULT NULL COMMENT '车辆编码',
  `ve1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `ve2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `ve3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`vehicleid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `vehicle` */

/*Table structure for table `weixiubiao` */

DROP TABLE IF EXISTS `weixiubiao`;

CREATE TABLE `weixiubiao` (
  `wid` int(11) NOT NULL COMMENT '项目编码',
  `wname` varchar(100) DEFAULT NULL COMMENT '项目名称',
  `shourujizhong` varchar(100) DEFAULT NULL COMMENT '收入种类',
  `xiangmuleibie` varchar(100) DEFAULT NULL COMMENT '项目类别',
  `beizhu` varchar(100) DEFAULT NULL COMMENT '备注',
  `bzj` double DEFAULT NULL COMMENT '标准价',
  `hyj` double DEFAULT NULL COMMENT '会员价',
  `vipj` double DEFAULT NULL COMMENT 'vip价',
  `xyj` double DEFAULT NULL COMMENT '协议价',
  `spj` double DEFAULT NULL COMMENT '索赔价',
  `pxj` double DEFAULT NULL COMMENT '保险价',
  `w1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `w2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `w3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`wid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `weixiubiao` */

/*Table structure for table `xiaoshoudanjubiao` */

DROP TABLE IF EXISTS `xiaoshoudanjubiao`;

CREATE TABLE `xiaoshoudanjubiao` (
  `xiaoshouno` varchar(50) NOT NULL COMMENT '销售单号',
  `xiaoshoudjlx` varchar(50) DEFAULT NULL COMMENT '单据类型',
  `xiaoshoujsfs` varchar(50) DEFAULT NULL COMMENT '结算方式',
  `xiaoshouzt` varchar(50) DEFAULT NULL COMMENT '单据状态',
  `xiaoshoujszt` varchar(50) DEFAULT NULL COMMENT '结算状态',
  `xiaoshoujssj` date DEFAULT NULL COMMENT '结算时间',
  `xiaoshoujsr` varchar(50) DEFAULT NULL COMMENT '结算人',
  `xiaoshoujsje` float DEFAULT NULL COMMENT '结算金额',
  `xiaoshouywlx` varchar(50) DEFAULT NULL COMMENT '业务类型',
  `xiaoshoukhname` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `xiaoshoucph` varchar(50) DEFAULT NULL COMMENT '车牌号',
  `xiaoshoucx` varchar(50) DEFAULT NULL COMMENT '车型',
  `xiaoshoucjh` varchar(50) DEFAULT NULL COMMENT '车架号',
  `xiaoshoulxdh` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `xiaoshoubxgs` varchar(50) DEFAULT NULL COMMENT '保险公司',
  `xiaoshoupkgs` varchar(50) DEFAULT NULL COMMENT '赔款公司',
  `xiaoshoudfcp` varchar(50) DEFAULT NULL COMMENT '对方车牌',
  `xiaoshoufwgw` varchar(50) DEFAULT NULL COMMENT '服务顾问',
  `xiaoshouwgsj` date DEFAULT NULL COMMENT '完工时间',
  `xiaoshoubz` varchar(50) DEFAULT NULL COMMENT '备注',
  `xiao1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `xiao2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `xiao3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`xiaoshouno`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `xiaoshoudanjubiao` */

/*Table structure for table `xuelibiao` */

DROP TABLE IF EXISTS `xuelibiao`;

CREATE TABLE `xuelibiao` (
  `educationid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '学历',
  `ed1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `ed2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `ed3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`educationid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `xuelibiao` */

/*Table structure for table `xueweibiao` */

DROP TABLE IF EXISTS `xueweibiao`;

CREATE TABLE `xueweibiao` (
  `collegeid` int(11) DEFAULT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '学位',
  `co1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `co2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `co3` varchar(100) DEFAULT NULL COMMENT '备用字段'
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `xueweibiao` */

/*Table structure for table `ycfc` */

DROP TABLE IF EXISTS `ycfc`;

CREATE TABLE `ycfc` (
  `ycfcid` int(11) NOT NULL COMMENT '原厂副厂id',
  `ycfc` varchar(50) DEFAULT NULL COMMENT '原厂副厂',
  `yc1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `yc2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `yc3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`ycfcid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `ycfc` */

/*Table structure for table `yuangongziliaobiao` */

DROP TABLE IF EXISTS `yuangongziliaobiao`;

CREATE TABLE `yuangongziliaobiao` (
  `yid` int(11) NOT NULL COMMENT '员工编号',
  `yname` varchar(50) DEFAULT NULL COMMENT '员工姓名',
  `ysex` varchar(50) DEFAULT NULL COMMENT '员工性别',
  `yposition` varchar(50) DEFAULT NULL COMMENT '员工职位',
  `yhealth` varchar(50) DEFAULT NULL COMMENT '身体状况',
  `yloginemp` varchar(50) DEFAULT NULL COMMENT '登录账号',
  `yheigth` varchar(50) DEFAULT NULL COMMENT '身高',
  `ynativplaceid` int(11) DEFAULT NULL COMMENT '籍贯id',
  `ynationid` int(11) DEFAULT NULL COMMENT '民族id',
  `yschoolid` int(11) DEFAULT NULL COMMENT '毕业学校id',
  `yspecialtyid` int(11) DEFAULT NULL COMMENT '专业id',
  `yspecialtynid` int(11) DEFAULT NULL COMMENT '专业资格id',
  `yattribute` varchar(50) DEFAULT NULL COMMENT '属性',
  `ycollegeid` int(11) DEFAULT NULL COMMENT '学位id',
  `yorganizationid` int(11) DEFAULT NULL COMMENT '编制id',
  `ynumber` varchar(50) DEFAULT NULL COMMENT '身份证号',
  `yaddressh` varchar(50) DEFAULT NULL COMMENT '户口地址',
  `yaddressx` varchar(50) DEFAULT NULL COMMENT '现住地址',
  `yphonenumber` varchar(50) DEFAULT NULL COMMENT '联系电话',
  `yphone` varchar(50) DEFAULT NULL COMMENT '手机',
  `email` varchar(50) DEFAULT NULL COMMENT 'email',
  `ybankid` int(11) DEFAULT NULL COMMENT '开户银行id',
  `ybankphone` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `yjname` varchar(50) DEFAULT NULL COMMENT '紧急联系人',
  `yjphone` varchar(50) DEFAULT NULL COMMENT '紧急联系电话',
  `ystarttime` varchar(50) DEFAULT NULL COMMENT '入职日期',
  `yendtime` varchar(50) DEFAULT NULL COMMENT '试用到期',
  `ydatetime` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `ystarttimeh` varchar(50) DEFAULT NULL COMMENT '合同开始',
  `yendtimeh` varchar(50) DEFAULT NULL COMMENT '合同结束',
  `ytname` varchar(50) DEFAULT NULL COMMENT '推荐人',
  `yratez` float DEFAULT NULL COMMENT '整单折扣权',
  `yrateg` float DEFAULT NULL COMMENT '工时折扣权',
  `yrates` float DEFAULT NULL COMMENT '商品折扣权',
  `yratej` float DEFAULT NULL COMMENT '减免权',
  `ygong` varchar(50) DEFAULT NULL COMMENT '工作简历',
  `yjiao` varchar(50) DEFAULT NULL COMMENT '教育经历',
  `yhome` varchar(50) DEFAULT NULL COMMENT '家庭成员',
  `yjiang` varchar(50) DEFAULT NULL COMMENT '奖惩记录',
  `yping` varchar(50) DEFAULT NULL COMMENT '聘用记录',
  `gid` int(11) DEFAULT NULL COMMENT '岗位编码',
  `bid` int(11) DEFAULT NULL COMMENT '部门',
  `zhaopian` varchar(100) DEFAULT NULL COMMENT '照片',
  `y1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `y2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `y3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`yid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `yuangongziliaobiao` */

/*Table structure for table `zhidubiao` */

DROP TABLE IF EXISTS `zhidubiao`;

CREATE TABLE `zhidubiao` (
  `organizationid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '编制',
  `org1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `org2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `org3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`organizationid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `zhidubiao` */

/*Table structure for table `zhuanyezigebiao` */

DROP TABLE IF EXISTS `zhuanyezigebiao`;

CREATE TABLE `zhuanyezigebiao` (
  `specialtynid` int(11) NOT NULL COMMENT '序号',
  `name` varchar(100) DEFAULT NULL COMMENT '专业',
  `spe1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `spe2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `spe3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`specialtynid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `zhuanyezigebiao` */

/*Table structure for table `zuzhijiegoubiao` */

DROP TABLE IF EXISTS `zuzhijiegoubiao`;

CREATE TABLE `zuzhijiegoubiao` (
  `zid` int(11) NOT NULL COMMENT '机构id',
  `zname` varchar(50) DEFAULT NULL COMMENT '机构姓名',
  `msname` varchar(50) DEFAULT NULL COMMENT '上级门店',
  `mshou` varchar(50) DEFAULT NULL COMMENT '售价权重',
  `mdianid` int(11) DEFAULT NULL COMMENT '门店分类id',
  `mzuishu` varchar(50) DEFAULT NULL COMMENT '最大许可数',
  `mtiao` varchar(50) DEFAULT NULL COMMENT '调拨价类',
  `mcityid` int(11) DEFAULT NULL COMMENT '城市id',
  `mkai` varchar(50) DEFAULT NULL COMMENT '开票单位',
  `maddress` varchar(50) DEFAULT NULL COMMENT '地址',
  `mshui` varchar(50) DEFAULT NULL COMMENT '纳税人识别号',
  `mphone` varchar(50) DEFAULT NULL COMMENT '电话',
  `mlname` varchar(50) DEFAULT NULL COMMENT '联系人',
  `mhang` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `mzhang` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `mgouid` int(11) DEFAULT NULL COMMENT '横装门店id',
  `mru` varchar(50) DEFAULT NULL COMMENT '入户开单/审核分开',
  `mting` varchar(50) DEFAULT NULL COMMENT '停用',
  `zids` int(11) DEFAULT NULL COMMENT '机构id外键',
  `zyid` int(11) DEFAULT NULL COMMENT '员工表id外键',
  `z1` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `z2` varchar(100) DEFAULT NULL COMMENT '备用字段',
  `z3` varchar(100) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`zid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

/*Data for the table `zuzhijiegoubiao` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
